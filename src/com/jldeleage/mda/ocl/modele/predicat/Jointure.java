package com.jldeleage.mda.ocl.modele.predicat;



/**
 * Une Jointure est une instruction, c'est-&agrave;-dire un terme intervenant
 * dans la construction d'un pr&eacute;dicat.<br/>
 * Un pr&eacute;dicat porte sur un r&ocirc;le et sert &agrave; construire
 * une requ&ecirc;te JPA pour extraire les entit&eacute;s v&eacute;rifiant
 * une contrainte pour remplir un r&ocirc;le.<br/>
 * Une Jointure traduit une navigation d'un terme de cardinalit&eacute; 1 vers
 * une collection, cette navigation se faisant au d&eacute;part (pas
 * n&eacute;cessairement directement) du r&ocirc;le sur lequel porte le
 * pr&eacute;dicat.
 *
 * @author jldeleage
 */
public class Jointure extends Navigation {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteJointure(this);
    }
    
}
