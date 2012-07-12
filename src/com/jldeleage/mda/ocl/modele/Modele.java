/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele;

import java.util.*;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MClassInvariant;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.MNavigableElement;

/**
 * Encapsule un mod&egrave;le au sens de USE.
 *
 * @author jldeleage
 */
public class Modele {


    /**
     * Construit les "wrappers" des objets USE (classes et invariants).
     * 
     * @param inModeleInitial 
     */
    public Modele(MModel inModeleInitial) {
        modeleInitial = inModeleInitial;
        Collection<MClass> classes = inModeleInitial.classes();
        for (MClass uneClasseUse : classes) {
            Classe uneClasseEte = new Classe(uneClasseUse);
            lesClasses.add(uneClasseEte);
        }
        for (MClassInvariant unInvariantUse : inModeleInitial.classInvariants()) {
            MClass classeUse = unInvariantUse.cls();
            Classe classeEte = getClasse(classeUse);
            // Le constructeur d'invariant range celui-ci dans la collection
            // des invariants de la classe
            Invariant unInvariantEte = new Invariant(classeEte, unInvariantUse);
        }
    }   // constructeur


    //========================================================================//


    public MModel getMModel() {
        return modeleInitial;
    }


    public Classe getClasse(MClass inClasseUse) {
        for (Classe uneClasse : lesClasses) {
            if (uneClasse.getMClass().equals(inClasseUse)) {
                return uneClasse;
            }
        }
        return null;
    }

    public Invariant getInvariant(MClassInvariant inInvariantUse) {
        Classe laClasse = getClasse(inInvariantUse.cls());
        for (Invariant inv : laClasse.getInvariants()) {
            if (inv.getInvariantUse().equals(inInvariantUse)) {
                return inv;
            }
        }
        return null;
    }


    /**
     * Renvoie une nouvelle collection contenant tous les invariants du
     * mod&egrave;le.<br/>
     * Comme c'est une nouvelle collection, on peut la modifier sans
     * alt&eacute;rer le mod&egrave;le.
     * 
     * @return 
     */
    public Collection<Invariant> getAllInvariants() {
        Collection<Invariant> resultat = new LinkedList<Invariant>();
        for (Classe uneClasse : lesClasses) {
            resultat.addAll(uneClasse.getInvariants());
        }
        return resultat;
    }


    /**
     * Renvoie une copie "immutable".
     * 
     * @return 
     */
    public Collection<Classe> getClasses() {
        return Collections.unmodifiableCollection(lesClasses);
    }


    public void addRole(MNavigableElement elt, Role inRole) {
        roles.put(elt, inRole);
    }

    public void setRoles(Map<MNavigableElement, Role> inRoles) {
        roles = inRoles;
    }

    public Map<MNavigableElement, Role> getMapRoles() {
        return roles;
    }

    public Collection<Role> getRoles() {
        return roles.values();
    }


    public Role getRole(String nomDeRole) {
        for (Role unRole : getRoles()) {
            if (unRole.getNomRole().equals(nomDeRole)) {
                return unRole;
            }
        }
        return null;
    }


    //========================================================================//


    private MModel                       modeleInitial;
    private Collection<Classe>           lesClasses = new LinkedList<Classe>();
    private Map<MNavigableElement, Role> roles = new HashMap<MNavigableElement, Role>();



}
