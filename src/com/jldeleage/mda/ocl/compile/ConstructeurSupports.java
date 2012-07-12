package com.jldeleage.mda.ocl.compile;



import com.jldeleage.mda.ocl.modele.*;
import java.util.*;
import org.tzi.use.uml.mm.*;
import org.tzi.use.uml.ocl.expr.ExpNavigation;
import org.tzi.use.uml.ocl.expr.ExpVariable;
import org.tzi.use.uml.ocl.expr.Expression;



/**
 * Parcourt les invariants de toutes les classes et pour chacun, construit
 * la liste des r&ocirc;les impliqu&eacute;s dans cet invariant.<br/>
 * TODO : revoir la notion de r&ocirc;le contraint. Pour le moment, on ne
 * consid&egrave;re qu'un r&ocirc;le est contraint que s'il intervient
 * dans une navigation au d&eacute;part de la classe de contexte d'un
 * invariant. Il faut &eacute;tendre cette notion &agrave; toutes les
 * navigations, de fa&ccedil;on &agrave; rep&eacute;rer toute modification
 * qui peut compromettre un invariant.
 *
 * @author jldeleage
 */
public class ConstructeurSupports {
    

    public void construisSupport(Modele inModele) {
        modele = inModele;
        constructeurPredicats = new ConstructeurPredicats();
        for (Classe uneClasse : modele.getClasses()) {
            construisSupports(uneClasse);
        }
        modele.setRoles(roles);
    }


    /**
     * Parcourt les invariants (au sens Ete) de classe de la classe
     * inClasse.<br/>
     * Pour chacun, renseigne la liste des supports (effet de bord).<br/>
     * Range toutes les instances ainsi construites dans la liste
     * r&eacute;sultat.
     * 
     * @param inClasse : classe pour les invariants de laquelle construire les
     * supports
     */
    public void construisSupports(Classe inClasse) {
        // On n'utilise pas la boucle for simplifiée car la variable
        // d'itération est une variable d'instance
        for (Iterator<Invariant> it = inClasse.getInvariants().iterator(); it.hasNext();) {
            invariantEte = it.next();
            MClassInvariant invariantUse = invariantEte.getInvariantUse();
            Expression bodyExpression = invariantUse.bodyExpression();
            bodyExpression.processWithVisitor(new VisiteurUnInvariant());
        }
    }   // construisSupports


    //========================================================================//


    private class VisiteurUnInvariant extends AbstractVisitor {
        @Override
        public void visitNavigation(ExpNavigation exp) {
            for (Expression e : exp.getChildExpressions()) {
                // Visite des enfants
                // si la navigation est au départ de self, la
                // variable d'instance fromSelf du visiteur est à "true"
                e.processWithVisitor(this);

            }
            MAssociationEnd source = (MAssociationEnd) exp.getSource();
            MClass classeUseSource = source.cls();
            Classe classeSource = modele.getClasse(classeUseSource);
            MAssociationEnd destination = (MAssociationEnd) exp.getDestination();
            String nomRole = destination.nameAsRolename();
            MClass classeUseDestination = destination.cls();
            Classe classeDestination = modele.getClasse(classeUseDestination);
            Role role = roles.get(source);
            if (role == null) {
                role = new Role(nomRole, classeSource, classeDestination, destination);
                roles.put(source, role);
            }
            if (fromSelf) {
                // La classe de départ est la classe de contexte de
                // l'invariant. Le rôle doit être mis dans les rôles
                // contraints de la classe de destination.
                invariantEte.addRole(role);
                role.addInvariant(invariantEte);
                classeSource.addRoleContraintReciproque(role);
                classeDestination.addRoleContraint(role);
                // Un peu violent, on fait tout en un seul passage !!!
                // TODO : remettre en code (enlever les commentaires)
//                Predicat predicat = constructeurPredicats.construisPredicat(invariantEte, role);
//                role.addPredicat(predicat);
                // La visite appelante ne doit pas croire que la source
                // directe est self
                fromSelf = false;
            }
            else {
                // autre navigation, rien à faire en fait
                // On note les autres navigations impliqu&eacute;es dans
                // l'invariant pour rep&eacute;rer des incoh&eacute;rences
                // suite &agrave; une modification lointaine.
                invariantEte.addRoleElargi(role);
                role.addAutreInvariant(invariantEte);
            }
        }       // visitNavigation
        @Override
        public void visitVariable(ExpVariable exp) {
            if ("self".equals(exp.getVarname())) {
                fromSelf = true;
            }
            else {
                // TODO : faut-il vérifier que la variable ne vaut pas
                // "self" ?
                System.out.println("Attention : variable non traitee : " + exp);
            }
        }
        /**
         * Une navigation self.xxx positionne cette variable &agrave; true
         * Toute autre navigation positionne &agrave; false.<br/>
         * TODO : regarder des invariants du genre
         * self &lt;&gt; Pilote.allInstances->select(p | ... )
         */
        private boolean   fromSelf;
    }       // classe VisiteurUnInvariant


    //========================================================================//
    // V A R I A B L E S   D ' I N S T A N C E   D E                          //
    // C O M M U N I C A T I O N   P E N D A N T   L E S   V I S I T E S      //
    //========================================================================//

    /**
     * Invariant en cours de visite
     */
    private Invariant             invariantEte;
    private Modele                modele;

    /**
     * TODO : le mettre en injection de d&eacute;pendance ?
     */
    private ConstructeurPredicats constructeurPredicats;


    //========================================================================//
    // V A R I A B L E S   D ' I N S T A N C E                                //
    //========================================================================//

    /**
     * Utilis&eacute; par les visiteurs suivants pour g&eacute;n&eacute;rer
     * le code
     */
    private Map<MNavigableElement, Role> roles = new HashMap<MNavigableElement, Role>();

}
