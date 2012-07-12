/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele;

import com.jldeleage.mda.ocl.modele.predicat.Instruction;
import com.jldeleage.mda.ocl.modele.predicat.VisiteurInstruction;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Un prédicat est un invariant exprimé du point de vue d'un rôle.<br/>
 * C'est une expression intervenant dans une clause WHERE.<br/>
 *
 * @author jldeleage
 */
public class Predicat extends Instruction {

    public Predicat(Role pour, Invariant dans) {
        this.pour = pour;
        this.dans = dans;
        this.setExpression(dans.getInvariantUse().bodyExpression());
    }


    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visitePredicat(this);
    }

    @Override
    public String toString() {
        return pour.getNomRole() + " dans " + dans.getInvariantUse().toString();
    }

    public Invariant getInvariant() {
        return dans;
    }

    public Role getRole() {
        return pour;
    }

    public void addRoleDependant(Role inRole) {
        avec.add(inRole);
    }

    public Collection<Role> getRolesDependants() {
        return avec;
    }

    private Role             pour;
    private Collection<Role> avec = new LinkedList<Role>();
    private Invariant        dans;


}
