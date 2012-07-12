/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

/**
 * Indique une navigation simple (acc&egrave;s &agrave; une
 * propri&eacute;t&eacute; de cardinalit&eacute; &lt;= 1) &agrave; partir
 * d'une collection.<br/>
 * Se traduit typiquement par une boucle.
 *
 * @author jldeleage
 */
public class CollectDansCode extends Navigation {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteCollectDansCode(this);
    }
    
}
