/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.compile;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.tzi.use.uml.ocl.expr.ExpAllInstances;
import org.tzi.use.uml.ocl.expr.ExpAny;
import org.tzi.use.uml.ocl.expr.ExpAsType;
import org.tzi.use.uml.ocl.expr.ExpAttrOp;
import org.tzi.use.uml.ocl.expr.ExpBagLiteral;
import org.tzi.use.uml.ocl.expr.ExpClosure;
import org.tzi.use.uml.ocl.expr.ExpCollect;
import org.tzi.use.uml.ocl.expr.ExpCollectNested;
import org.tzi.use.uml.ocl.expr.ExpConstBoolean;
import org.tzi.use.uml.ocl.expr.ExpConstDate;
import org.tzi.use.uml.ocl.expr.ExpConstEnum;
import org.tzi.use.uml.ocl.expr.ExpConstInteger;
import org.tzi.use.uml.ocl.expr.ExpConstReal;
import org.tzi.use.uml.ocl.expr.ExpConstString;
import org.tzi.use.uml.ocl.expr.ExpEmptyCollection;
import org.tzi.use.uml.ocl.expr.ExpExists;
import org.tzi.use.uml.ocl.expr.ExpForAll;
import org.tzi.use.uml.ocl.expr.ExpIf;
import org.tzi.use.uml.ocl.expr.ExpIsKindOf;
import org.tzi.use.uml.ocl.expr.ExpIsTypeOf;
import org.tzi.use.uml.ocl.expr.ExpIsUnique;
import org.tzi.use.uml.ocl.expr.ExpIterate;
import org.tzi.use.uml.ocl.expr.ExpLet;
import org.tzi.use.uml.ocl.expr.ExpNavigation;
import org.tzi.use.uml.ocl.expr.ExpObjAsSet;
import org.tzi.use.uml.ocl.expr.ExpObjOp;
import org.tzi.use.uml.ocl.expr.ExpObjRef;
import org.tzi.use.uml.ocl.expr.ExpOne;
import org.tzi.use.uml.ocl.expr.ExpOrderedSetLiteral;
import org.tzi.use.uml.ocl.expr.ExpQuery;
import org.tzi.use.uml.ocl.expr.ExpReject;
import org.tzi.use.uml.ocl.expr.ExpSelect;
import org.tzi.use.uml.ocl.expr.ExpSequenceLiteral;
import org.tzi.use.uml.ocl.expr.ExpSetLiteral;
import org.tzi.use.uml.ocl.expr.ExpSortedBy;
import org.tzi.use.uml.ocl.expr.ExpStdOp;
import org.tzi.use.uml.ocl.expr.ExpTupleLiteral;
import org.tzi.use.uml.ocl.expr.ExpTupleSelectOp;
import org.tzi.use.uml.ocl.expr.ExpUndefined;
import org.tzi.use.uml.ocl.expr.ExpVariable;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.expr.ExpressionVisitor;
import org.tzi.use.uml.ocl.expr.ExpressionWithValue;

/**
 *
 * @author jldeleage
 */
public abstract class AbstractVisitor implements ExpressionVisitor {


    public void genericVisit(Expression exp) {
//        Logger logger = Logger.getLogger(this.getClass().getName());
//        logger.log(Level.FINEST, "visite  de {0}", exp);
        System.out.println("Visite de " + exp);
//        exp.processWithVisitor(this);
        for (Expression e : exp.getChildExpressions()) {
            e.processWithVisitor(this);
        }
    }


    @Override
    public void visitAllInstances(ExpAllInstances exp) {
        genericVisit(exp);
    }

    @Override
    public void visitAny(ExpAny exp) {
        genericVisit(exp);
    }

    @Override
    public void visitAsType(ExpAsType exp) {
        genericVisit(exp);
    }

    @Override
    public void visitAttrOp(ExpAttrOp exp) {
        genericVisit(exp);
    }

    @Override
    public void visitBagLiteral(ExpBagLiteral exp) {
        genericVisit(exp);
    }

    @Override
    public void visitCollect(ExpCollect exp) {
        visitQuery(exp);
    }

    @Override
    public void visitCollectNested(ExpCollectNested exp) {
        visitQuery(exp);
    }

    @Override
    public void visitConstBoolean(ExpConstBoolean exp) {
        genericVisit(exp);
    }

    @Override
    public void visitConstDate(ExpConstDate exp) {
        genericVisit(exp);
    }

    @Override
    public void visitConstEnum(ExpConstEnum exp) {
        genericVisit(exp);
    }

    @Override
    public void visitConstInteger(ExpConstInteger exp) {
        genericVisit(exp);
    }

    @Override
    public void visitConstReal(ExpConstReal exp) {
        genericVisit(exp);
    }

    @Override
    public void visitConstString(ExpConstString exp) {
        genericVisit(exp);
    }

    @Override
    public void visitEmptyCollection(ExpEmptyCollection exp) {
        genericVisit(exp);
    }

    @Override
    public void visitExists(ExpExists exp) {
        genericVisit(exp);
    }

    @Override
    public void visitForAll(ExpForAll exp) {
        genericVisit(exp);
    }

    @Override
    public void visitIf(ExpIf exp) {
        genericVisit(exp);
    }

    @Override
    public void visitIsKindOf(ExpIsKindOf exp) {
        genericVisit(exp);
    }

    @Override
    public void visitIsTypeOf(ExpIsTypeOf exp) {
        genericVisit(exp);
    }

    @Override
    public void visitIsUnique(ExpIsUnique exp) {
        genericVisit(exp);
    }

    @Override
    public void visitIterate(ExpIterate exp) {
        genericVisit(exp);
    }

    @Override
    public void visitLet(ExpLet exp) {
        genericVisit(exp);
    }

    @Override
    public void visitNavigation(ExpNavigation exp) {
        genericVisit(exp);
    }

    @Override
    public void visitObjAsSet(ExpObjAsSet exp) {
        genericVisit(exp);
    }

    @Override
    public void visitObjOp(ExpObjOp exp) {
        genericVisit(exp);
    }

    @Override
    public void visitObjRef(ExpObjRef exp) {
        genericVisit(exp);
    }

    @Override
    public void visitOne(ExpOne exp) {
        genericVisit(exp);
    }

    @Override
    public void visitOrderedSetLiteral(ExpOrderedSetLiteral exp) {
        genericVisit(exp);
    }

    @Override
    public void visitQuery(ExpQuery exp) {
        genericVisit(exp);
    }

    @Override
    public void visitReject(ExpReject exp) {
        genericVisit(exp);
    }

    @Override
    public void visitWithValue(ExpressionWithValue exp) {
        genericVisit(exp);
    }

    @Override
    public void visitSelect(ExpSelect exp) {
        genericVisit(exp);
    }

    @Override
    public void visitSequenceLiteral(ExpSequenceLiteral exp) {
        genericVisit(exp);
    }

    @Override
    public void visitSetLiteral(ExpSetLiteral exp) {
        genericVisit(exp);
    }

    @Override
    public void visitSortedBy(ExpSortedBy exp) {
        genericVisit(exp);
    }

    @Override
    public void visitStdOp(ExpStdOp exp) {
        genericVisit(exp);
    }

    @Override
    public void visitTupleLiteral(ExpTupleLiteral exp) {
        genericVisit(exp);
    }

    @Override
    public void visitTupleSelectOp(ExpTupleSelectOp exp) {
        genericVisit(exp);
    }

    @Override
    public void visitUndefined(ExpUndefined exp) {
        genericVisit(exp);
    }

    @Override
    public void visitVariable(ExpVariable exp) {
        genericVisit(exp);
    }

    @Override
    public void visitClosure(ExpClosure expClosure) {
        genericVisit(expClosure);
    }
    


}
