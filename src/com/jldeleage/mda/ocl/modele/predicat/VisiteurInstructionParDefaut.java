package com.jldeleage.mda.ocl.modele.predicat;

import com.jldeleage.mda.ocl.modele.Predicat;


/**
 *
 * @author jldeleage
 */
public class VisiteurInstructionParDefaut implements VisiteurInstruction {

    protected void visiteInstruction(Instruction aThis) {
        preVisite(aThis);
        for (Instruction uneSousInstruction : aThis.getSousInstructions()) {
            uneSousInstruction.accepte(this);
        }
        postVisite(aThis);
    }

    protected void preVisite(Instruction aThis) {
    }

    protected void postVisite(Instruction aThis) {
    }


    @Override
    public void visiteNavigationDansCode(NavigationDansCode aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteJointure(Jointure aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteNavigationDansPredicat(NavigationDansPredicat aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteCollectDansCode(CollectDansCode aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteRoot(Root aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visitePredicat(Predicat aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteSelf(Self aThis) {
        visiteInstruction(aThis);
    }

    @Override
    public void visiteOperation(Operation aThis) {
        visiteInstruction(aThis);
    }
    
}
