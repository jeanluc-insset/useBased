package org.tzi.use.uml.ocl.expr.operations;

import org.tzi.use.uml.ocl.expr.EvalContext;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.BooleanValue;
import org.tzi.use.uml.ocl.value.ObjectValue;
import org.tzi.use.uml.ocl.value.UndefinedValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.uml.sys.MObject;
import org.tzi.use.uml.sys.MObjectState;
import org.tzi.use.util.collections.MultiMap;

public class StandardOperationsObject {
	public static void registerTypeOperations(MultiMap<String, OpGeneric> opmap) {
		OpGeneric.registerOperation(new Op_oclIsNew(), opmap);
	}
}

// --------------------------------------------------------
//
// Generic operations on all object types.
//
// --------------------------------------------------------

/* oclIsNew : T -> Boolean */
final class Op_oclIsNew extends OpGeneric {
	public String name() {
		return "oclIsNew";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 1 && params[0].isTrueObjectType())
			return TypeFactory.mkBoolean();
		else
			return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		Value res;
		if (args[0].isUndefined())
			res = UndefinedValue.instance;
		else {
			// get object
			ObjectValue objVal = (ObjectValue) args[0];
			MObject obj = objVal.value();
			MObjectState objPreState = obj.state(ctx.preState());
			res = BooleanValue.get(objPreState == null);
		}
		return res;
	}
}
