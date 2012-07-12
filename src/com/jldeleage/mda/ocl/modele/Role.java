package com.jldeleage.mda.ocl.modele;


import java.util.Collection;
import java.util.LinkedList;
import org.tzi.use.uml.mm.MAssociationEnd;



/**
 * Encapsule un MNavigableElement en incorporant des informations selon le
 * m&eacute;ta-mod&egrave;le Ete.
 *
 * @author jldeleage
 */
public class Role extends Navigable {


    public Role(String nomRole, Classe classeDepart, Classe classeArrivee, MAssociationEnd mNavigableEnd) {
        this.nomRole = nomRole;
        this.classeDepart = classeDepart;
        this.classeArrivee = classeArrivee;
        this.mNavigableEnd = mNavigableEnd;
    }


    public void addInvariant(Invariant invariantEte) {
        invariants.add(invariantEte);
    }

    public Collection<Invariant> getInvariants() {
        return invariants;
    }

    public Classe getClasseArrivee() {
        return classeArrivee;
    }


    public Classe getClasseDepart() {
        return classeDepart;
    }


    public MAssociationEnd getmNavigableEnd() {
        return mNavigableEnd;
    }


    public String getNomRole() {
        return nomRole;
    }

    public void addPredicat(Predicat inPredicat) {
        predicats.add(inPredicat);
    }


    public Collection<Predicat> getPredicats() {
        return predicats;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        if (this.mNavigableEnd != other.mNavigableEnd && (this.mNavigableEnd == null || !this.mNavigableEnd.equals(other.mNavigableEnd))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.mNavigableEnd != null ? this.mNavigableEnd.hashCode() : 0);
        return hash;
    }

    
    public void addAutreInvariant(Invariant inInvariant) {
        autresInvariants.add(inInvariant);
    }

    /**
     * TODO : ne pas exporter l'original de la liste mais une copie.
     * 
     * @param inInvariant
     * @return 
     */
    public Collection<Invariant> getAutresInvariants(Invariant inInvariant) {
        return autresInvariants;
    }


    private String                nomRole;
    private Classe                classeDepart;
    private Classe                classeArrivee;
    /**
     * Un r&ocirc;le peut participer &agrave; plusieurs invariants de
     * classe.<br/>
     * Chaque invariant am&egrave;ne &agrave; la cr&eacute;ation d'un
     * pr&eacute;dicat pour ce r&ocirc;le.
     */
    private Collection<Invariant> invariants = new LinkedList<Invariant>();
    private Collection<Predicat>  predicats  = new LinkedList<Predicat>();

    private Collection<Invariant> autresInvariants = new LinkedList<Invariant>();
    /**
     * Extr&ecirc;mit&eacute; d'association encapsul&eacute;e.
     */
    private MAssociationEnd      mNavigableEnd;

}
