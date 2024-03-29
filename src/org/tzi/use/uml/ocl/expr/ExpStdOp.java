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

// $Id: ExpStdOp.java 2626 2011-10-19 09:19:51Z lhamann $

package org.tzi.use.uml.ocl.expr;

import java.util.List;

import org.tzi.use.config.Options;
import org.tzi.use.config.Options.WarningType;
import org.tzi.use.uml.ocl.expr.operations.BooleanOperation;
import org.tzi.use.uml.ocl.expr.operations.OpGeneric;
import org.tzi.use.uml.ocl.type.CollectionType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.value.UndefinedValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.util.Log;
import org.tzi.use.util.StringUtil;
import org.tzi.use.util.collections.HashMultiMap;
import org.tzi.use.util.collections.MultiMap;


/**
 * General operation expressions. Each operation is implemented by its own
 * class. New Operations are easily introduced by writing a new operation class
 * and adding a single instance of the new class to the list of operations (see
 * below). Also, this way the new operation symbol is already known to the
 * specification compiler.
 * 
 * @version $ProjectVersion: 0.393 $
 * @author Mark Richters
 */
public final class ExpStdOp extends Expression {

    // opname / possible (overloaded) operations
    public static MultiMap<String, OpGeneric> opmap;

    // initialize operation map
    static {
        opmap = new HashMultiMap<String, OpGeneric>(90);
        OpGeneric.registerOperations(opmap);
    }

    /***
     * Adds an operation to the standard operations
     * @param op
     */
    public static void addOperation(OpGeneric op) {
    	opmap.put(op.name(), op);
    }
    
    /***
     * Removes all given operations from list ops
     * @param ops
     */
    public static void removeAllOperations(List<OpGeneric> ops) {
    	for (OpGeneric op : ops) {
    		opmap.remove(op.name(), op);
    	}
    }
    
    /**
     * Returns true if a standard operation exists matching <code>name</code> and <code>params</code>.
     */
    public static boolean exists(String name, Type params[]) {
        if (params.length == 0)
            throw new IllegalArgumentException(
                    "ExpStdOp.exists called with empty params array");

        // search by operation symbol
        List<OpGeneric> ops = opmap.get(name);
        if (ops.isEmpty()) // unknown operation symbol
            return false;

        // search overloaded operations for a match
        for (OpGeneric op : ops) {
            Type t = op.matches(params);
            if (t != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Try to create a new instance of ExpOperation.
     * 
     * @exception ExpInvalidException
     *                cannot find a match for operation
     * @throws SemanticException 
     */
    public static ExpStdOp create(String name, Expression args[])
            throws ExpInvalidException {
        if (args.length == 0)
            throw new IllegalArgumentException(
                    "ExpOperation.create called with " + "empty args array");

        // search by operation symbol
        List<OpGeneric> ops = opmap.get(name);
        if (ops.isEmpty()) // unknown operation symbol
            throw new ExpInvalidException("Undefined operation named `" + name
                    + "' in expression `" + opCallSignature(name, args) + "'.");

        Type[] params = new Type[args.length];
        for (int i = 0; i < args.length; i++)
            params[i] = args[i].type();

        // search overloaded operations for a match
        for (OpGeneric op : ops) {
            Type t = op.matches(params);
            if (t != null) {
            	checkTypeSystemWarnings(op, args, params, t);
                return new ExpStdOp(op, args, t);
            }
        }

        // operation name matches but arguments don't
        throw new ExpInvalidException("Undefined operation `"
                + opCallSignature(name, args) + "'.");
    }

    private static void checkTypeSystemWarnings(OpGeneric op, Expression[] params, Type[] paramTypes, Type resultType) throws ExpInvalidException {
    	if (!Options.checkWarningsOclAnyInCollections().equals(WarningType.IGNORE))
    		checkOclAnyCollectionsWarning(op, paramTypes, resultType, Options.checkWarningsOclAnyInCollections());
    	
    	if (!Options.checkWarningsUnrelatedTypes().equals(WarningType.IGNORE)) {
    		String warn = op.checkWarningUnrelatedTypes(params);
    		if (warn != null) {
    			warn += StringUtil.NEWLINE + "You can change this check using the -extendedTypeSystemChecks switch.";
    			if (Options.checkWarningsUnrelatedTypes().equals(WarningType.WARN)) {
    				Log.warn("Warning: " + warn);
    			} else {
    				throw new ExpInvalidException(warn);
    			}
    		}
    	}
    }
    
    /**
     * Validates if an operation call on a collection type with leaf element type different from OCLAny
     * results in OCLAny or a collection with the leaf element type OCLAny. 
     * If <code>true</code> a warning is reported.
     * <p><b>Note</b>: Leaf element type means the last element type which is not a collection.</p> 
	 * @param op The operation which is called
	 * @param sourceType The <code>Type</code> of the object the operation is called on.
	 * @param resultType The <code>Type</code> of the result.
     * @throws ExpInvalidException 
	 */
	private static void checkOclAnyCollectionsWarning(OpGeneric op, Type[] params, Type resultType, WarningType warningType) throws ExpInvalidException {
		Type sourceType = params[0];
		
		if (sourceType.isCollection(true)) {
			CollectionType sourceCollectionType = (CollectionType)sourceType;
			Type sourceElementType = sourceCollectionType.elemType();
			
			while (sourceElementType.isCollection(true)) {
				sourceElementType = ((CollectionType)sourceElementType).elemType();
			}
			
			if (sourceElementType.isTrueOclAny()) return;
			
			Type resultElementType = resultType;
			while (resultElementType.isCollection(true)) {
				resultElementType = ((CollectionType)resultElementType).elemType();
			}
			
			if (resultElementType.isTrueOclAny()) {
				StringBuilder paramTypes = new StringBuilder();
				for (int index = 1; index < params.length; ++index) {
					if (index > 1) {
						paramTypes.append(",");
					}
					paramTypes.append(params[index].toString());
				}

				String message = "Operation call "
						+ StringUtil.inQuotes(sourceType.toString() + "->"
								+ op.name() + "(" + paramTypes.toString() + ")")
						+ " results in type "
						+ StringUtil.inQuotes(resultType.toString()) + "." + StringUtil.NEWLINE
						+ "This may lead to unexpected behavior." + StringUtil.NEWLINE
						+ "You can change this check using the -oclAnyCollectionsChecks switch.";
				
				if (warningType.equals(WarningType.ERROR)) {
					throw new ExpInvalidException(message);
				} else {
					Log.warn("Warning: " + message);
				}
			}
		}
	}

	private static String opCallSignature(String name, Expression args[]) {
        // build error message with type names of arguments
        Type srcType = args[0].type();
        StringBuffer s = new StringBuffer(srcType
                + (srcType.isCollection(true) ? "->" : ".") + name + "(");
        for (int i = 1; i < args.length; i++) {
            if (i > 1)
                s.append(", ");
            s.append(args[i].type());
        }
        s.append(")");
        return s.toString();
    }

    // instance variables
    private OpGeneric fOp;

    private Expression fArgs[];

    private ExpStdOp(OpGeneric op, Expression args[], Type t) {
        super(t, args);
        fOp = op;
        fArgs = args;
    }

    @Override
    public StringBuilder toString(StringBuilder sb) {
        return sb.append(fOp.stringRep(fArgs, atPre()));
    }

    public String opname() {
        return fOp.name();
    }

    public String name() {
        return fOp.name();
    }

    public Expression[] args() {
        return fArgs;
    }

    /**
     * Evaluates the expression and returns a result value.
     */
    public Value eval(EvalContext ctx) {
        ctx.enter(this);
        Value res = null;

        // Boolean operations need special treatment of undefined
        // arguments. Also, short-circuit evaluation may be used to
        // speed up the evaluation process.
        if (fOp instanceof BooleanOperation) {
            res = ((BooleanOperation) fOp).evalWithArgs(ctx, fArgs);
        } else {
            Value argValues[] = new Value[fArgs.length];
            int opKind = fOp.kind();
            for (int i = 0; i < fArgs.length && res == null; i++) {
                argValues[i] = fArgs[i].eval(ctx);
                // if any of the arguments is undefined, the result
                // depends on the kind of operation we are about to
                // call.
                if (argValues[i].isUndefined()) {
                    switch (opKind) {
                    case OpGeneric.OPERATION:
                        // strict evaluation, result is undefined, no
                        // need to call the operation's eval() method.
                        res = UndefinedValue.instance;
                        break;
                    case OpGeneric.SPECIAL:
                        // these operations handle undefined arguments
                        // themselves
                        break;
                    default:
                        throw new RuntimeException(
                                "Unexpected operation kind: " + opKind);
                    }
                }
            }
            if (res == null) {
                try {
                    res = fOp.eval(ctx, argValues, type());
                } catch (ArithmeticException ex) {
                    // catch e.g. division by zero
                    res = UndefinedValue.instance;
                }
            }
        }
        ctx.exit(this, res);
        return res;
    }

	/* (non-Javadoc)
	 * @see org.tzi.use.uml.ocl.expr.Expression#processWithVisitor(org.tzi.use.uml.ocl.expr.ExpressionVisitor)
	 */
	@Override
	public void processWithVisitor(ExpressionVisitor visitor) {
		visitor.visitStdOp(this);
	}
}