package org.tzi.use.uml.ocl.expr.operations;

import java.util.ArrayList;
import java.util.Collections;

import org.tzi.use.uml.ocl.expr.EvalContext;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.type.CollectionType;
import org.tzi.use.uml.ocl.type.SequenceType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;
import org.tzi.use.uml.ocl.value.IntegerValue;
import org.tzi.use.uml.ocl.value.SequenceValue;
import org.tzi.use.uml.ocl.value.UndefinedValue;
import org.tzi.use.uml.ocl.value.Value;
import org.tzi.use.util.StringUtil;
import org.tzi.use.util.collections.MultiMap;

public class StandardOperationsSequence {
	public static void registerTypeOperations(MultiMap<String, OpGeneric> opmap) {
		// operations on Sequence
        // count: inherited from Collection
		OpGeneric.registerOperation(new Op_sequence_union(), opmap);
		OpGeneric.registerOperation(new Op_sequence_append(), opmap);
		OpGeneric.registerOperation(new Op_sequence_prepend(), opmap);
		OpGeneric.registerOperation(new Op_sequence_insertAt(), opmap);
		OpGeneric.registerOperation(new Op_sequence_subSequence(), opmap);
		OpGeneric.registerOperation(new Op_sequence_at(), opmap);
		OpGeneric.registerOperation(new Op_sequence_indexOf(), opmap);
		OpGeneric.registerOperation(new Op_sequence_first(), opmap);
		OpGeneric.registerOperation(new Op_sequence_last(), opmap);
		OpGeneric.registerOperation(new Op_sequence_including(), opmap);
		OpGeneric.registerOperation(new Op_sequence_excluding(), opmap);
		OpGeneric.registerOperation(new Op_sequence_reverse(), opmap);
		
		// Constructors
		OpGeneric.registerOperation(new Op_mkSequenceRange(), opmap);
	}
}

// --------------------------------------------------------
//
// Sequence constructors.
//
// --------------------------------------------------------
/* mkSequenceRange : Integer x Integer, ... -> Sequence(Integer) */
final class Op_mkSequenceRange extends OpGeneric {
	public String name() {
		return "mkSequenceRange";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		return (params.length >= 2 && params.length % 2 == 0
				&& params[0].isInteger() && params[1].isInteger()) ? TypeFactory
				.mkSequence(TypeFactory.mkInteger())
				: null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		int[] ranges = new int[args.length];
		for (int i = 0; i < args.length; i++)
			ranges[i] = ((IntegerValue) args[i]).value();

		return new SequenceValue(TypeFactory.mkInteger(), ranges);
	}

	public String stringRep(Expression args[], String atPre) {
		if (args.length % 2 != 0)
			throw new IllegalArgumentException("length=" + args.length);
		String s = "Sequence{";
		for (int i = 0; i < args.length; i += 2) {
			if (i > 0)
				s += ",";
			s += args[i] + ".." + args[i + 1];
		}
		s += "}";
		return s;
	}
}

// --------------------------------------------------------
//
// Sequence operations.
//
// --------------------------------------------------------

/* union : Sequence(T1) x Sequence(T2) -> Sequence(T1), with T2 <= T1 */
final class Op_sequence_union extends OpGeneric {
	public String name() {
		return "union";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()
				&& params[1].isSequence()) {
			SequenceType sequence1 = (SequenceType) params[0];
			SequenceType sequence2 = (SequenceType) params[1];

			Type commonElementType = sequence1.elemType()
					.getLeastCommonSupertype(sequence2.elemType());

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);

		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue sequence1 = (SequenceValue) args[0];
		SequenceValue sequence2 = (SequenceValue) args[1];
		return sequence1.union(sequence2);
	}
}

// --------------------------------------------------------

/* append : Sequence(T) x T -> Sequence(T) */
final class Op_sequence_append extends OpGeneric {
	public String name() {
		return "append";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[1]);

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		return seq.append(args[1]);
	}
}

// --------------------------------------------------------

/* prepend : Sequence(T) x T -> Sequence(T) */
final class Op_sequence_prepend extends OpGeneric {
	public String name() {
		return "prepend";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[1]);

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		return seq.prepend(args[1]);
	}
}

// --------------------------------------------------------

/* insertAt : Sequence(T) x Integer x T -> Sequence(T) */
final class Op_sequence_insertAt extends OpGeneric {
	public String name() {
		return "insertAt";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 3 && params[0].isSequence()
				&& params[1].isInteger()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[2]);

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		SequenceValue res = seq.insertAt((IntegerValue) args[1],
				(Value) args[2]);

		if (res == null)
			return UndefinedValue.instance;
		else
			return res;
	}
}

// --------------------------------------------------------

/* subSequence : Sequence(T) x Integer x Integer -> Sequence(T) */
final class Op_sequence_subSequence extends OpGeneric {
	public String name() {
		return "subSequence";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return true;
	}

	public Type matches(Type params[]) {
		return (params.length == 3 && params[0].isSequence()
				&& params[1].isInteger() && params[2].isInteger()) ? params[0]
				: null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		int lower = ((IntegerValue) args[1]).value();
		int upper = ((IntegerValue) args[2]).value();
		if (lower > upper)
			return UndefinedValue.instance;

		Value res = null;
		try {
			res = seq.subSequence(lower - 1, upper);
		} catch (IndexOutOfBoundsException e) {
			res = UndefinedValue.instance;
		}
		return res;
	}
}

// --------------------------------------------------------

/* at : Sequence(T) x Integer -> T */
final class Op_sequence_at extends OpGeneric {
	public String name() {
		return "at";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()
				&& params[1].isInteger()) {
			SequenceType seq = (SequenceType) params[0];
			return seq.elemType();
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		IntegerValue n = (IntegerValue) args[1];
		Value res = null;
		try {
			res = seq.get(n.value() - 1);
		} catch (IndexOutOfBoundsException e) {
			res = UndefinedValue.instance;
		}
		return res;
	}
}

// --------------------------------------------------------

/* first : Sequence(T) -> T */
final class Op_sequence_first extends OpGeneric {
	public String name() {
		return "first";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 1 && params[0].isSequence()) {
			SequenceType seq = (SequenceType) params[0];
			return seq.elemType();
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		if (seq.isEmpty())
			return UndefinedValue.instance;
		return seq.get(0);
	}
}

// --------------------------------------------------------

/* last : Sequence(T) -> T */
final class Op_sequence_last extends OpGeneric {
	public String name() {
		return "last";
	}

	public int kind() {
		return OPERATION;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 1 && params[0].isSequence()) {
			SequenceType seq = (SequenceType) params[0];
			return seq.elemType();
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		SequenceValue seq = (SequenceValue) args[0];
		if (seq.isEmpty())
			return UndefinedValue.instance;
		return seq.get(seq.size() - 1);
	}
}

// --------------------------------------------------------

/* including : Sequence(T) x T -> Sequence(T) */
final class Op_sequence_including extends OpGeneric {
	public String name() {
		return "including";
	}

	public int kind() {
		return SPECIAL;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[1]);

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);

		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		if (args[0].isUndefined())
			return UndefinedValue.instance;
		SequenceValue seq = (SequenceValue) args[0];
		return seq.append(args[1]);
	}
}

// --------------------------------------------------------

/* excluding : Sequence(T) x T -> Sequence(T) */
final class Op_sequence_excluding extends OpGeneric {
	public String name() {
		return "excluding";
	}

	public int kind() {
		return SPECIAL;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[1]);

			if (commonElementType != null)
				return TypeFactory.mkSequence(commonElementType);
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		if (args[0].isUndefined())
			return UndefinedValue.instance;
		SequenceValue seq = (SequenceValue) args[0];
		return seq.excluding(args[1]);
	}
	
	@Override
	public String checkWarningUnrelatedTypes(Expression args[]) {
		CollectionType col = (CollectionType) args[0].type();
		
		Type commonElementType = col.elemType().getLeastCommonSupertype(args[1].type());
		
		if (!(col.elemType().isTrueOclAny() || args[1].type().isTrueOclAny()) && commonElementType.isTrueOclAny()) {
			return "Expression " + StringUtil.inQuotes(this.stringRep(args, "")) + 
				   " will always evaluate to the same sequence, " + StringUtil.NEWLINE +
				   "because the element type " + StringUtil.inQuotes(col.elemType()) + 
				   " and the parameter type " + StringUtil.inQuotes(args[1].type()) + " are unrelated.";
		}
		
		return null;
	}
}

/* indexOf : Sequence(T) x T -> Integer */
final class Op_sequence_indexOf extends OpGeneric {
	public String name() {
		return "indexOf";
	}

	public int kind() {
		return SPECIAL;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 2 && params[0].isSequence()) {
			SequenceType seqType = (SequenceType) params[0];

			Type commonElementType = seqType.elemType()
					.getLeastCommonSupertype(params[1]);

			if (commonElementType != null)
				return TypeFactory.mkInteger();

		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		if (args[0].isUndefined())
			return UndefinedValue.instance;

		SequenceValue seq = (SequenceValue) args[0];

		int index = seq.indexOf(args[1]);
		if (index == -1)
			return UndefinedValue.instance;
		else
			return IntegerValue.valueOf(index + 1);
	}
	
	@Override
	public String checkWarningUnrelatedTypes(Expression args[]) {
		CollectionType col = (CollectionType) args[0].type();
		
		Type commonElementType = col.elemType().getLeastCommonSupertype(args[1].type());
		
		if (!(col.elemType().isTrueOclAny() || args[1].type().isTrueOclAny()) && commonElementType.isTrueOclAny()) {
			return "Expression " + StringUtil.inQuotes(this.stringRep(args, "")) + 
				   " will always evaluate to undefined, " + StringUtil.NEWLINE +
				   "because the element type " + StringUtil.inQuotes(col.elemType()) + 
				   " and the parameter type " + StringUtil.inQuotes(args[1].type()) + " are unrelated.";
		}
		
		return null;
	}
}

/* reverse : Sequence(T) -> Sequence(T) */
final class Op_sequence_reverse extends OpGeneric {
	public String name() {
		return "reverse";
	}

	public int kind() {
		return SPECIAL;
	}

	public boolean isInfixOrPrefix() {
		return false;
	}

	public Type matches(Type params[]) {
		if (params.length == 1 && params[0].isSequence()) {
			return params[0];
		}
		return null;
	}

	public Value eval(EvalContext ctx, Value[] args, Type resultType) {
		if (args[0].isUndefined()) return UndefinedValue.instance;
		
		SequenceValue col = (SequenceValue)args[0];
		ArrayList<Value> elements = new ArrayList<Value>(col.collection());
		Collections.reverse(elements);
		
		return new SequenceValue(col.elemType(), elements);
	}
}