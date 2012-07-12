package com.jldeleage.mda.ocl.modele;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.tzi.use.uml.mm.MClass;



/**
 * Encapsule une instance de MClass et fournit des informations
 * sp&eacute;cifiques correspondant au m&eacute;ta-mod&egrave;le Ete.
 *
 * @author jldeleage
 */
public class Classe extends TypeEte {


    public Classe(MClass mClass) {
        this.mClass = mClass;
    }


    public Collection<Invariant> getInvariants() {
        return invariants;
    }

    public MClass getMClass() {
        return mClass;
    }

    public Collection<Role> getRolesContraints() {
        return rolesContraints;
    }

    public void addRoleContraint(Role inRole) {
        if (! rolesContraints.contains(inRole)) {
            rolesContraints.add(inRole);
        }
    }

    public Collection<Role> getRolesContraintsReciproques() {
        return rolesContraintsReciproques;
    }

    public void addRoleContraintReciproque(Role inRole) {
        if (! rolesContraintsReciproques.contains(inRole)) {
            rolesContraintsReciproques.add(inRole);
        }
    }


    protected void addInvariant(Invariant inInvariant) {
        if (! invariants.contains(inInvariant)) {
            invariants.add(inInvariant);
        }
    }


    //========================================================================//


    private MClass          mClass;

    /**
     * Utile initialement dans le meta-mod&egrave;le, lors de la recherche
     * des r&ocirc;les contraints.<br/>
     * Attention, un invariant utilise des r&ocirc;les dans d'autres
     * classes. En d'autres termes si la classe A poss&egrave;de un invariant
     * utilisant unRole de type B, alors unRole est dans la collection des
     * r&ocirc;les contraints de B, non de A.
     */
    private Collection<Invariant> invariants = new LinkedList<Invariant>();

    /**
     * Si A -> unRole B alors la classe B poss&egrave;de unRole dans sa
     * collection de r&ocirc;les contraints.<br/>
     * Un DAO pour la classe B doit alors poss&eacute;der une m&eacute;thode<br/>
     * <code>getBAvailableAsUnRoleFor(A self)</code><br/>
     */
    private Collection<Role>      rolesContraints = new LinkedList<Role>();

    /**
     * Dans l'exemple pr&eacute;c&eacute;dent, unRole est dans la collection
     * rolesContraintsReciproques de A.
     */
    private Collection<Role>      rolesContraintsReciproques = new LinkedList<Role>();


}
