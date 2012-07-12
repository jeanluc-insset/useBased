/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class Operation extends Instruction {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteOperation(this);
    }

    public void addNomOperande(String inNomOperande) {
        nomsOperandes.add(inNomOperande);
    }

    public List<String> getNomsOperandes() {
        return nomsOperandes;
    }

    public String getNomOperandeGauche() {
        return nomsOperandes.get(0);
    }

    public String getNomOperandeDroit() {
        return nomsOperandes.get(1);
    }

    public void addOperande(Instruction instructionEnfant) {
        operandes.add(instructionEnfant);
    }

    public List<Instruction> getOperandes() {
        return operandes;
    }

    private List<String> nomsOperandes = new LinkedList<String>();
    private List<Instruction> operandes = new LinkedList<Instruction>();


}
