package com.jldeleage.mda.ocl.modele;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MClassInvariant;



/**
 * Un invariant encapsule une instance de MClassInvariant en ajoutant des
 * informations conformes au m&eacute;ta-mod&egrave;le Ete&nbsp;:<ul>
 * <li>liste des r&ocirc;les des associations au d&eacute;part du contexte
 * impliqu&eacute;s dans l'invariant</li>
 * <li>classe de contexte</li>
 * <li>expression de la contrainte initiale</li>
 * </ul>
 *
 * @author jldeleage
 */
public class Invariant {


    public Invariant(Classe inClasse, MClassInvariant unInvariant) {
        mInvariant = unInvariant;
        contextSelf = inClasse;
        mExpression = mInvariant.bodyExpression().toString();
        inClasse.addInvariant(this);
    }


    //========================================================================//


    public String getNomInvariant() {
        return mInvariant.name();
    }

    public String toString() {
        return mInvariant.toString();
    }


    /**
     * Pour faciliter le debugging uniquement
     */
    public String getStringExpression() {
        return mExpression;
    }


    //========================================================================//


    public Classe getClasse() {
        return contextSelf;
    }

    public Classe getContext() {
        return contextSelf;
    }

    public MClassInvariant getInvariantUse() {
        return mInvariant;
    }

    public Collection<Role> getSupport() {
        return support;
    }

    public Collection<Role> getSupportElargi() {
        return supportElargi;
    }


    public void addRole(Role role) {
        support.add(role);
    }


    public void addRoleElargi(Role role) {
        supportElargi.add(role);
    }


    //========================================================================//


    private MClassInvariant  mInvariant;
    /**
     * Roles au d&eacute;part de la classe de contexte utilis&eacute; dans
     * l'invariant
     */
    private Collection<Role> support = new LinkedList<Role>();
    /**
     * Autre r&ocirc;les que ceux au d&eacute;part de la classe de contexte.
     */
    private Collection<Role> supportElargi = new LinkedList<Role>();
    private Classe           contextSelf;

    /**
     * Pour faciliter le debugging uniquement
     */
    private final String     mExpression;



}
