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

// $Id: ExpIsTypeOf.java 2533 2011-09-27 08:14:54Z lhamann $

package org.tzi.use.uml.ocl.expr;

import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.BooleanValue;
import org.tzi.use.uml.ocl.value.Value;

/**
 * oclIsTypeOf
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class ExpIsTypeOf extends Expression {
    private Expression fSourceExpr;
    private Type fTargetType;
    
    public ExpIsTypeOf(Expression sourceExpr, Type targetType)
        throws ExpInvalidException
    {
        super(TypeFactory.mkBoolean(), sourceExpr);
        fSourceExpr = sourceExpr;
        fTargetType = targetType;
    }

    /**
     * Returns the source expression.
     * @return The source <code>Expression</code> 
     */
    public Expression getSourceExpr() {
    	return fSourceExpr;
    }
    
    /**
     * Returns the target type.
     * @return The target <code>Type</code> 
     */
    public Type getTargetType() {
    	return fTargetType;
    }
    
    /**
     * Evaluates expression and returns result value. 
     */
    public Value eval(EvalContext ctx) {
        ctx.enter(this);
        Value res = BooleanValue.FALSE;
        Value v = fSourceExpr.eval(ctx);
    
        // Note: the value may be undefined, still the type test is valid!
        if (v.type().equals(fTargetType) )
            res = BooleanValue.TRUE;
        ctx.exit(this, res);
        return res;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        fSourceExpr.toString(sb);
        
        if (fSourceExpr.type().isCollection(true))
        	sb.append("->");
        else
        	sb.append(".");
        
        sb.append("oclIsTypeOf(");
        fTargetType.toString(sb);
        return sb.append(")");
    }

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.ocl.expr.Expression#processWithVisitor(org.tzi.use.uml.ocl.expr.ExpressionVisitor)
	 */
	@Override
	public void processWithVisitor(ExpressionVisitor visitor) {
		visitor.visitIsTypeOf(this);
	}
}
