/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

/**
 *
 * @author jldeleage
 */
public class Root extends Instruction {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteRoot(this);
    }
    
}
