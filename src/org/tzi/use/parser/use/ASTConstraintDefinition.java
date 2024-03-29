/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id: ASTConstraintDefinition.java 1338 2010-03-04 15:15:21Z lhamann $

package org.tzi.use.parser.use;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;
import org.tzi.use.parser.AST;
import org.tzi.use.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.parser.ocl.ASTType;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.ocl.type.ObjectType;
import org.tzi.use.uml.ocl.type.Type;

/**
 * Node of the abstract syntax tree constructed by the parser.
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public class ASTConstraintDefinition extends AST {
    private List<Token> fVarNames;   // optional
    private ASTType fType;
    private ArrayList<ASTInvariantClause> fInvariantClauses;

    public ASTConstraintDefinition() {
    	fVarNames = new ArrayList<Token>();
    	fInvariantClauses = new ArrayList<ASTInvariantClause>();
    }

    public void addInvariantClause(ASTInvariantClause inv) {
        fInvariantClauses.add(inv);
    }

    public void addVarName(Token tok) {
        fVarNames.add(tok);
    }

    public void setType(ASTType t) {
        fType = t;
    }

    public void gen(Context ctx) {
        try {
            Type t = fType.gen(ctx);
            if (! t.isTrueObjectType() )
                throw new SemanticException(fType.getStartToken(), 
                                            "Expected an object type, found `" +
                                            t + "'");
            MClass cls = ((ObjectType) t).cls();
            ctx.setCurrentClass(cls);
            
            for (ASTInvariantClause astInv : fInvariantClauses) {
                astInv.gen(ctx, fVarNames, cls);
            }
            
        } catch (SemanticException ex) {
            ctx.reportError(ex);
        } finally {
            ctx.setCurrentClass(null);
        }
    }
}