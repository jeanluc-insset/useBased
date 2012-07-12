/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

/**
 *
 * @author jldeleage
 */
public class NavigationDansPredicat extends Navigation {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteNavigationDansPredicat(this);
    }
    
}
