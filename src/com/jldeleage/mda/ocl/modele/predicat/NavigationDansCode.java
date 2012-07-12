/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;

import org.tzi.use.uml.ocl.type.Type;

/**
 *
 * @author jldeleage
 */
public class NavigationDansCode extends Navigation {

    @Override
    public void accepte(VisiteurInstruction visiteur) {
        visiteur.visiteNavigationDansCode(this);
    }

}

