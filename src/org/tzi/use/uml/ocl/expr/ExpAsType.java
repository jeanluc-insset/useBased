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

// $Id: ExpAsType.java 2533 2011-09-27 08:14:54Z lhamann $

package org.tzi.use.uml.ocl.expr;

import org.tzi.use.uml.ocl.type.ObjectType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.value.ObjectValue;
import org.tzi.use.uml.ocl.value.UndefinedValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MObject;

/**
 * oclAsType
 *
 * @version     $ProjectVersion: 0.393 $
 * @author  Mark Richters
 */
public final class ExpAsType extends Expression {
    private Expression fSourceExpr;
    
    public ExpAsType(Expression sourceExpr, Type targetType)
        throws ExpInvalidException
    {
        // result type is the specified target type
        super(targetType, sourceExpr);
        fSourceExpr = sourceExpr;

        if (! targetType.isSubtypeOf(fSourceExpr.type()) )
            throw new ExpInvalidException(
                                          "Target type `" + targetType + 
                                          "' is not a subtype of the source expression's type `" + 
                                          fSourceExpr.type() + "'.");
    }

    /**
     * Evaluates expression and returns result value. 
     */
    public Value eval(EvalContext ctx) {
        ctx.enter(this);
        Type targetType = type();
        Value res = UndefinedValue.instance;
        Value v = fSourceExpr.eval(ctx);
        if (v.isObject() ) {
            ObjectValue ov = (ObjectValue) v;
            MObject obj = ov.value();
            // Note: an undefined value can still be casted to a
            // subtype!  See initialization of res above
            if (obj.exists(ctx.postState()) && obj.type().isSubtypeOf(targetType) )
                res = new ObjectValue((ObjectType) targetType, obj);
        } else {
            // value is fine if its type is equal or a subtype of the
            // expected type
            if (v.type().isSubtypeOf(targetType) ) {
                res = v;
            }
        }
        ctx.exit(this, res);
        return res;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        fSourceExpr.toString(sb);
        sb.append(".oclAsType(");
        type().toString(sb);
        return sb.append(")");
    }

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.ocl.expr.Expression#processWithVisitor(org.tzi.use.uml.ocl.expr.ExpressionVisitor)
	 */
	@Override
	public void processWithVisitor(ExpressionVisitor visitor) {
		visitor.visitAsType(this);
	}
}
