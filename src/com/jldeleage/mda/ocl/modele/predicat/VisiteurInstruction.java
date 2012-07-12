
package com.jldeleage.mda.ocl.modele.predicat;

import com.jldeleage.mda.ocl.modele.Predicat;

/**
 *
 * @author jldeleage
 */
public interface VisiteurInstruction {

    public void visitePredicat(Predicat aThis);
    
    public void visiteNavigationDansCode(NavigationDansCode aThis);

    public void visiteJointure(Jointure aThis);

    public void visiteNavigationDansPredicat(NavigationDansPredicat aThis);

    public void visiteCollectDansCode(CollectDansCode aThis);

    public void visiteRoot(Root aThis);

    public void visiteSelf(Self aThis);

    public void visiteOperation(Operation aThis);

}
