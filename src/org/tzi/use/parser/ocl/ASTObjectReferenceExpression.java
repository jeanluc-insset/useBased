/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
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

// $Id: ASTObjectReferenceExpression.java 1734 2010-09-07 14:56:17Z lhamann $

package org.tzi.use.parser.ocl;

import static org.tzi.use.util.StringUtil.inQuotes;

import java.util.HashSet;

import org.antlr.runtime.Token;
import org.tzi.use.parser.Context;
import org.tzi.use.parser.SemanticException;
import org.tzi.use.uml.ocl.expr.ExpObjRef;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.sys.MObject;


/**
 * TODO
 * @author Daniel Gent
 *
 */
public class ASTObjectReferenceExpression extends ASTExpression {
	/** TODO */
	private Token fObjectName;
	
	/**
	 * TODO
	 * @param objectName
	 */
	public ASTObjectReferenceExpression(Token objectName) {
		fObjectName = objectName;
	}

	
	@Override
	public Expression gen(Context ctx) throws SemanticException {
		String objectName = fObjectName.getText();
			
		MObject object = ctx.systemState().objectByName(objectName);

		if (object == null) {
			throw new SemanticException(
					fObjectName, 
					"There is no object " + 
					inQuotes(objectName) +
					".");
		}
		
		return new ExpObjRef(object);
	}

	
	@Override
	public void getFreeVariables(HashSet<String> freeVars) {

	}
}
