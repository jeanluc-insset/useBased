/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.modele.predicat;


import com.jldeleage.mda.ocl.modele.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.ocl.expr.ExpStdOp;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.expr.VarDecl;
import org.tzi.use.uml.ocl.expr.VarDeclList;
import org.tzi.use.uml.ocl.type.Type;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/*

    /
     *  En fonction des contraintes, renvoie les instances Pilote qui
     *  sont conformes &agrave; la contrainte.<br/>
     *  Ce template est dans le plug-in "jsf". Est-ce sa place ?
     /
    public List<Pilote> getPiloteAvailableAsSecond(Vol self) {
        // Préparation initiale
        EntityManager manager = getEntityManager();
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        CriteriaQuery<Pilote> cq = cb.createQuery(Pilote.class);
        Root<Pilote> second = cq.from(Pilote.class);
        CriteriaQuery<Pilote> select = cq.select(second);

        Pilote commandant = self.getCommandant();
        if (commandant != null) {
            cq.where(cb.notEqual(second, commandant));
        }

        RetourConstructionPredicat infos = null;
        infos = ajouteConditionsSecondEquipage(second, infos, self);

        if (infos != null) {
            cq.where(infos.predicat);
        }
        TypedQuery<Pilote> createQuery
                = manager.createQuery(cq);
        return createQuery.getResultList();
    }       // getPiloteAvailableAsSecond


    /
     * Construit le pr&eacute;dicat "where" pour n'extraire que les
     * instances de Pilote satisfaisant la condition :
     * (self.commandant <> self.second)
     /
     public RetourConstructionPredicat ajouteConditionsSecondEquipage(Root<Pilote> second_0, RetourConstructionPredicat inoutInfos, Vol self) {
        EntityManager manager = getEntityManager();
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        
        Pilote commandant_0 = self.getCommandant();
        // Traitement d'une navigation dans la requete
        // Traitement de l'opérateur <>
        if ( commandant_0 == null) {
            return inoutInfos;
        }
        Predicate aux = cb.notEqual(second_0, commandant_0);
        if (inoutInfos == null) {
            inoutInfos = new RetourConstructionPredicat();
            inoutInfos.predicat = aux;
        }
        else {
            inoutInfos.predicat = cb.and(inoutInfos.predicat, aux);
        }
        return inoutInfos;
     }



*/


/**
 * Traduit les mod&egrave;les Ete en XML.<br/>
 * TODO : sa place est-elle dans la biblioth&egrave;que OCL&nbsp;? Ou est-ce
 * plut&ocirc;t dans l'application qui exploite cette biblioth&egrave;que&nbsp;?
 *
 * @author jldeleage
 */
public class InjecteurXML {


    /**
     * Ajoute chaque pr&eacute;dicat du mod&egrave;le dans le document.<br/>
     */
    public void injecteXML(Modele inModele, Document inoutDocument)
                        throws XPathExpressionException {

        doc = inoutDocument;

        VisiteurGenerateur visiteur = new VisiteurGenerateur();

        // Attention, il ne faut pas parcourir Invariant.Role.Predicat car
        // on aurait plusieurs fois le même prédicat.
        // Le parcours Classe.RoleContraint.Predicat ne donne qu'une seule
        // fois chaque prédicat.
        for (Classe uneClasse : inModele.getClasses()) {
            Element elementClasse = null;
            // Il faut retrouver l'élément XML du document correspondant
            // &agrave; la classe dans le modèle.
            String nomClasse = uneClasse.getMClass().name();

            try {
                elementClasse = retrouveElementClasse(nomClasse);

                // Visiter chacun des pr&eacute;dicats et g&eacute;n&eacute;rer
                // les &eacute;l&eacute;ments XML correspondants.
                for (Role unRole : uneClasse.getRolesContraints()) {
                    Element elementRole = ajouteElement(elementClasse, "roleContraint");
                    String nomDuRole = unRole.getNomRole();
                    ajouteElement(elementRole, "roleName", nomDuRole);
                    ajouteElement(elementRole, "roleType", unRole.getClasseArrivee().getMClass().name());
                    String nomTypeSelf = unRole.getClasseDepart().getMClass().name();
                    ajouteElement(elementRole, "typeSelf", nomTypeSelf);
                    for (Predicat unPredicat : unRole.getPredicats()) {
                        racine = elementRole;
                        // Peut effectuer un effet de bord sur la racine.
                        // Cet effet de bord est compensé avant chaque
                        // nouvelle itération par l'instruction précédente
                        unPredicat.accepte(visiteur);
                        // Ajouter dans la classe de départ de l'attribut ou de
                        // l'association, dans la description de celle-ci/celui-ci
                        // que ce rôle a des dépendances
                        Element elementMembre = retrouveElementAttributOuAssociation(
                                nomTypeSelf, nomDuRole);
                        // Il faut ajouter tous les autres rôles impliqués dans
                        // le prédicat
                        Collection<Role> rolesDependants = unPredicat.getRolesDependants();
                        for (Role autreRoleContraint : uneClasse.getRolesContraints()) {
                            if (autreRoleContraint == unRole) {
                                continue;
                            }
                            String nomRoleDependant = autreRoleContraint.getNomRole();
                            String cheminDependanceExistante = "dependance/role";
                            String evaluate = xpath.evaluate(cheminDependanceExistante, elementMembre);
                            if (null != evaluate && ! "".equals(evaluate)) {
                                continue;
                            }
                            Element dependance = ajouteElement(elementMembre, "dependance");
                            ajouteElement(dependance, "role", nomRoleDependant);
                            ajouteElement(dependance, "type", autreRoleContraint.getClasseArrivee().getMClass().name());
                        }   // boucle sur les rôles dépendants
                    }   // boucle sur les prédicats
                }   // boucle sur les rôles contraints
            }

            catch (Exception e) {
                Logger.getLogger("").log(Level.WARNING,
                        "Impossible de retrouver la classe " + nomClasse);
            } 
        }         // boucle sur les classes
    }       // injecteXML



    //========================================================================//
    // V I S I T E U R
    //========================================================================//


    private class VisiteurGenerateur implements VisiteurInstruction {


        /**
        * Effet de bord sur la racine qui se trouve positionn&eacute;e sur
        * l'&eacute;l&eacute;ment repr&eacute;sentant les instructions du
        * pr&eacute;dicat.
        * 
        * @param aThis 
        */
        @Override
        public void visitePredicat(Predicat aThis) {
            racine = ajouteElement(racine, "predicat");
            String nomPredicat = aThis.getInvariant().getNomInvariant();
            if (nomPredicat == null) {
                nomPredicat = "predicat" + numPredicat++;
            }
            ajouteElement(racine, "name", nomPredicat);
            // Invariant sous forme de chaîne de caractères
            ajouteElement(racine, "expression", aThis.getExpression().toString());

            // root
            Element root = ajouteElement(racine, "root");
            Role roleRoot = aThis.getRole();
            ajouteElement(root, "name",  roleRoot.getNomRole());
            MAssociationEnd mNavigableEnd = roleRoot.getmNavigableEnd();
            Type typeRoot = mNavigableEnd.getType();
            ajouteElement(root, "type", typeRoot.shortName());

            // Dépendances
            Collection<Role> rolesDependants = aThis.getRolesDependants();
            if (rolesDependants != null && rolesDependants.size() > 0) {
                Element dependances = ajouteElement(racine, "dependances");
                for (Role unRole : rolesDependants) {
                    ajouteElement(dependances, "uneDependance", unRole.getNomRole());
                }
            }

            // Contenu (op&eacute;rationnel)
            racine = ajouteElement(racine, "instructions");
            for(Instruction uneInstruction : aThis.getSousInstructions()) {
                uneInstruction.accepte(this);
            }
        }   // visitePredicat

 
        /**
         * TODO : &agrave; revoir car non utilis&eacute;e.
         * 
         * @param aThis 
         */
        @Override
        public void visiteRoot(Root aThis) {
            Element root = ajouteElement(racine, "root");
            ajouteElement(root, "name", aThis.getNomVariable());
            ajouteElement(root, "type", aThis.getTypeVariable().shortName());
        }


        protected void visiteNavigation(Navigation aThis, String nom) {
            Element ancienneRacine = racine;
            racine = ajouteElement(racine, nom);
            ajouteElement(racine, "variableDepart", aThis.getNomVariableDepart());
            ajouteElement(racine, "typeDepart", aThis.getTypeVariableDepart().shortName());
//            if (aThis.getNomRole().equals(roleRoot.getNomRole())) {
//                ajouteElement(racine, "variable", aThis.getNomRole());
//            }
//            else {
                ajouteElement(racine, "variable", aThis.getNomVariable());
//            }
            ajouteElement(racine, "typeArrivee", aThis.getTypeVariable().shortName());
            ajouteElement(racine, "propriete", aThis.getNomRole());
            if (aThis.isCollection()) {
                ajouteElement(racine, "isCollection", "" + aThis.isCollection());
            }
            VarDeclList variablesLocales = aThis.getVariablesLocales();
            if (variablesLocales != null) {
                int nbVariables = variablesLocales.size();
                if (nbVariables > 0) {
                    Element variables = ajouteElement(racine, "variables");
                    for (int i=0 ; i<variablesLocales.size() ; i++) {
                        VarDecl varDecl = variablesLocales.varDecl(i);
                        Element uneVariable = ajouteElement(variables, "variable");
                        ajouteElement(uneVariable, "nom", varDecl.name());
                        ajouteElement(uneVariable, "type", varDecl.type().shortName());
                    }
                }
            }
            racine = ancienneRacine;
        }


        @Override
        public void visiteNavigationDansCode(NavigationDansCode aThis) {
            visiteNavigation(aThis, "navigationDansCode");
        }


        @Override
        public void visiteJointure(Jointure aThis) {
            visiteNavigation(aThis, "jointure");
        }

        @Override
        public void visiteNavigationDansPredicat(NavigationDansPredicat aThis) {
            visiteNavigation(aThis, "navigationDansPredicat");
        }

        @Override
        public void visiteCollectDansCode(CollectDansCode aThis) {
            visiteNavigation(aThis, "collect");
        }

        @Override
        public void visiteSelf(Self aThis) {
//            ajouteElement(racine, "self");
        }

        @Override
        public void visiteOperation(Operation aThis) {
            ExpStdOp op = (ExpStdOp) aThis.getExpression();
            // Attention, le nom de l'opérateur peut être constitué de
            // symboles. Si on injecte le symbole directement, certains
            // générateurs de code à base de templates risquent de ne pas
            // fonctionner. Il faut donc "résoudre" le symbole et le
            // remplacer par une châine de caractères ad hoc
            String nomOperation = OperationNameMap.getName(op.opname());
            // Attention, JPA ne possède pas de méthodes avec toutes les
            // signatures possibles. Pour que le générateur n'ait pas à se
            // poser de questions, on remet les opérandes "dans le bon ordre".
            List<Instruction> operandes = aThis.getOperandes();
            Instruction gauche = operandes.get(0);
            String nomGauche = null;
            String nomDroite = null;
            if (gauche instanceof NavigationDansCode) {
                nomGauche = aThis.getNomOperandeDroit();
                nomDroite = aThis.getNomOperandeGauche();
                if (!OperationNameMap.isCommutatif(nomOperation)) {
                    nomOperation = OperationNameMap.getOperationReciproque(nomOperation);
                }
            }
            else {
                nomGauche = aThis.getNomOperandeGauche();
                nomDroite = aThis.getNomOperandeDroit();
            }
            Element eltOperation = ajouteElement(racine, nomOperation);
            ajouteElement(eltOperation, "gauche", nomGauche);
            ajouteElement(eltOperation, "droite", nomDroite);
        }
 
        private int  numPredicat;

    }   // classe VisiteurGenerateur



    //========================================================================//
    // U T I L I T A I R E S   D E   C R E A T I O N   D U   D O M
    //========================================================================//


    protected Element ajouteElement(Element pere, String nomEnfant) {
        return ajouteElement(pere, nomEnfant, null);
    }


    protected Element ajouteElement(Element pere, String nomEnfant, String valeur) {
        if (pere == null) {
            return null;
        }
        Element enfant = doc.createElement(nomEnfant);
        pere.appendChild(enfant);
        if (valeur != null) {
            Text createTextNode = doc.createTextNode(valeur);
            enfant.appendChild(createTextNode);
        }
        return enfant;
    }


    /**
     * Pour associer des cha&icirc;nes de caract&egrave;res aux
     * op&eacute;rateurs, afin de les ins&eacute;rer dans un document XML.<br/>
     * Un op&eacute;rateur d&eacute;j&agrave; d&eacute;sign&eacute; par une
     * cha&icirc;ne est laiss&eacute; tel quel.<br/>
     * Cette classe permet aussi de savoir si l'op&eacute;rateur est commutatif,
     * quel est l'&eacute;ventuel op&eacute;rateur r&eacute;ciproque...
     */
    private static class OperationNameMap {
        public static Map<String, InfoOperation> correspondances = new HashMap<String, InfoOperation>();
        static {
            correspondances.put("<>", new InfoOperation("different", true));
            correspondances.put("<", new InfoOperation("lessThan", "greaterThan"));
            correspondances.put(">", new InfoOperation("greaterThan", "lessThan"));
            correspondances.put("<=", new InfoOperation("lessOrEqual", "greaterOrEqual"));
            correspondances.put(">=", new InfoOperation("greaterOrEqual", "lessOrEqual"));
            correspondances.put("+", new InfoOperation("plus", true));
            correspondances.put("-", new InfoOperation("minus", false));
            correspondances.put("*", new InfoOperation("mult", true));
            correspondances.put("/", new InfoOperation("div", false));
            correspondances.put("=", new InfoOperation("equal", true));
            // Ne sert à rien :
            correspondances.put("includes", new InfoOperation("includes", false));
        }
        public static String getName(String symbol) {
            InfoOperation resultat = correspondances.get(symbol);
            if (resultat != null) {
                return resultat.nom;
            }
            else {
                return symbol;
            }
        }       // getName
        public static boolean isCommutatif(String inSymbol) {
            InfoOperation resultat = correspondances.get(inSymbol);
            if (resultat == null) {
                return false;
            }
            return resultat.commutatif;
        }
        // TODO : ne convient pas pour navigation - predicat qui devient
        // predicat - navigation. Il y a plus de travail à faire...
        public static String getOperationReciproque(String inSymbol) {
            InfoOperation resultat = correspondances.get(inSymbol);
            if (resultat != null) {
                return resultat.nomReciproque;
            }
            else {
                return inSymbol;
            }
        }
    }   // class OperationNameMap



    /**
     * JPA n'admet pas de fonctions factory avec un objet POJO en premier membre
     * et un r&eacute;sultat JPA en second membre.
     * Une instance de cette classe d&eacute;finit une correspondance entre
     * deux op&eacute;rateurs. On peut remplacer le premier par le second en
     * permutant les op&eacute;randes (par exemple, on peut remplacer a&gt;b
     * par b&lt;a)
     */
    private static class InfoOperation {
        public String  nom;
        public boolean commutatif;
        public String  nomReciproque;
        public InfoOperation(String inNom, boolean inCommutatif) {
            nom = inNom;
            commutatif = inCommutatif;
        }
        public InfoOperation(String inNom, String inNomReciproque) {
            nom = inNom;
            nomReciproque = inNomReciproque;
        }
    }



    //========================================================================//
    // U T I L I T A I R E S   D E   R E C H E R C H E                        //
    //========================================================================//


    public Element retrouveElementClasse(String inNomClasse) throws XPathExpressionException {
        String requete = "/*/model/entity[name='"
                + inNomClasse + "']";
        Logger.getLogger("").log(Level.FINER,
                    "Recherche de l'élément de la classe " + inNomClasse
                + " par la requête " + requete);
        return (Element)xpath.evaluate(requete,
                        doc, XPathConstants.NODE);        
    }

    public Element retrouveElementAttributOuAssociation(String inNomClasse, String inNomMembre) throws XPathExpressionException {
        String requete = "/*/model/entity[name='"
                + inNomClasse + "']/*[name='" + inNomMembre + "']";
        Logger.getLogger("").log(Level.FINER,
                "Recherche de l'élément de la classe " + inNomClasse
                + " par la requête " + requete);
        return (Element)xpath.evaluate(requete,
                        doc, XPathConstants.NODE);        
    }


    //========================================================================//


    /**
     * Element sous lequel les instructions doivent &ecirc;tre rang&eacute;es.
     */
    private Element  racine;

    /**
     * Utilis&eacute; comme factory pour les &eacute;l&eacute;ments
     * cr&eacute;&eacute;s.
     */
    private Document doc;

    /**
     * Variables utilitaires
     */
    private XPathFactory factory = XPathFactory.newInstance();
    private XPath xpath = factory.newXPath();


}
