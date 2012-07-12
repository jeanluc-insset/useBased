/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.type.Type;

/**
 * Un pr&eacute;dicat est constitu&eacute; d'instructions.<br/>
 * Ces instructions sont ensuite transcrites en XML pour &ecirc;tre
 * inject&eacute;es dans le mod&egrave;le.
 *
 * @author jldeleage
 */
public abstract class Instruction {


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    public void addSousInstruction(Instruction inInstruction) {
        if (sousInstructions == null) {
            sousInstructions = new LinkedList<Instruction>();
        }
        sousInstructions.add(inInstruction);
    }


    /**
     * DP "null"&nbsp;: renvoie la liste vide s'il n'y a pas de
     * sous-instructions.
     * 
     * @return 
     */
    public Collection<Instruction> getSousInstructions() {
        if (sousInstructions == null) {
            return Collections.EMPTY_LIST;
        }
        return sousInstructions;
    }

    public String getNomVariable() {
        return nomVariable;
    }

    public void setNomVariable(String nomVariable) {
        this.nomVariable = nomVariable;
    }

    public Type getTypeVariable() {
        return typeVariable;
    }

    public void setTypeVariable(Type typeVariable) {
        this.typeVariable = typeVariable;
    }

    public boolean isCollection() {
        return collection;
    }

    public void setCollection(boolean collection) {
        this.collection = collection;
    }



    public abstract void accepte(VisiteurInstruction visiteur);


    private String            nomVariable;
    private Type              typeVariable;
    private Expression        expression;

    private List<Instruction> sousInstructions;

    /**
     * Indique si le r&eacute;sultat de l'instruction est une collection.
     * Attention, dans le cas d'une navigation, indique si
     * l'association est de cardinalit&eacute; &gt; 1 ou si le d&eacute;part
     * est d&eacute;j&agrave; une collection, comme dans&nbsp;:<br/>
     * <pre><code>commandant.brevets.modele.nom</code></pre><br/>
     * Dans ce cas, la navigation modele.nom est de cardinalit&eacute; 1 dans
     * le diagramme de classe mais de cardinalit&eacute; * dans
     * l'expression.<br/>
     * Cette propri&eacute;t&eacute; est d&eacute;termin&eacute;e &agrave; la
     * cr&eacute;ation de l'instance de Navigation
     */
    private boolean           collection;


}

