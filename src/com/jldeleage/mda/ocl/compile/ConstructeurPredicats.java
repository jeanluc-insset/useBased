/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jldeleage.mda.ocl.compile;

import com.jldeleage.mda.ocl.modele.*;
import com.jldeleage.mda.ocl.modele.predicat.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MClass;
import org.tzi.use.uml.mm.MMultiplicity;
import org.tzi.use.uml.mm.MNavigableElement;
import org.tzi.use.uml.ocl.expr.*;
import org.tzi.use.uml.ocl.type.CollectionType;
import org.tzi.use.uml.ocl.type.Type;
import org.tzi.use.uml.ocl.type.TypeFactory;



/**
 * Pour chaque r&ocirc;le et invariant trouv&eacute;s p&eacute;c&eacute;demment,
 * construit la liste des pr&eacute;dicats.<br/>
 * Ces pr&eacute;dicats sont rang&eacute;s par r&ocirc;le.
 *
 * @author jldeleage
 */
public class ConstructeurPredicats {
    

    public void construisPredicats(Modele inModele) {
        modele = inModele;
        for (Classe uneClasse : inModele.getClasses()) {
            for (Invariant unInvariant : uneClasse.getInvariants()) {
                for (Role unRole : unInvariant.getSupport()) {
                    construisPredicat(unInvariant, unRole);
                }   // boucle sur les rôles
            }   // boucle sur les invariants
        }   // boucle sur les classes
    }

    
    /**
     * Construit le pr&eacute;dicat permettant de discriminer les instances
     * pouvant jouer le r&ocirc;le satisfaisant l'invariant par rapport
     * &agrave; l'&eacute;tat du contexte.<br/>
     * Ne renvoie pas de r&eacute;sultat car le pr&eacute;dicat est rang&eacute;
     * dans le r&ocirc;le.
     * 
     * @param inInvariant invariant pour lequel le pr&eacute;dicat est construit
     * @param inRole r&ocirc;le pour lequel le pr&eacute;dicat est construit
     */
    public void construisPredicat(Invariant inInvariant, Role inRole) {
        role = inRole;
        predicat = new Predicat(inRole, inInvariant);
        VisiteurGenerateurPredicats visiteur = new VisiteurGenerateurPredicats();
        inInvariant.getInvariantUse().bodyExpression().processWithVisitor(visiteur);
        inRole.addPredicat(predicat);
    }


    private class VisiteurGenerateurPredicats extends AbstractVisitor {


        /**
         * Exemple :<br/>
         * <pre><code>commandants.brevets.modele</code></pre><br/>
         * devient<br/>
         * <pre><code>commandants.brevets->collect(Brevet e | e.modele)</code></pre><br/>
         * L'instruction doit &ecirc;tre une navigation avec une
         * cardinalit&eacute; * au d&eacute;part. L'arriv&eacute;e est donc une
         * collection.<br/>
         * Le type de d&eacute;part est (Collection&lt;)Brevet(&gt;).<br/>
         * La variable est <code>brevets2</code>.<br/>
         * Le membre droit du collect est e.modele, une navigation de Brevet
         * vers Modele, de cardinalit&eacute; 1.<br/>
         *
         * 
         * @param exp 
         */
        @Override
        public void visitQuery(ExpQuery exp) {
            // Visiter le membre gauche (collection initiale)
            Expression rangeExpression = exp.getRangeExpression();
            rangeExpression.processWithVisitor(this);
            // Ajouter les variables qui sont utilisées dans le membre droit
            empileVariables(exp);
            // Parcourir le membre droit (requête)
            Expression queryExpression = exp.getQueryExpression();
            queryExpression.processWithVisitor(this);
            Navigation navigation;
            if (usingRole) {
                navigation = new Jointure();
            }
            else {
                navigation = new CollectDansCode();
            }
            // Passage des variables de parcours (en fait de LA variable,
            // en tout cas normalement)
            navigation.setVariables(exp.getVariableDeclarations());

            Navigation queryInstruction = (Navigation) instructions.get(queryExpression);

            navigation.setNomVariable(queryInstruction.getNomVariable());
            navigation.setTypeVariable(queryInstruction.getTypeVariable());
            Instruction rangeInstruction = instructions.get(rangeExpression);
            navigation.setTypeVariableDepart(rangeInstruction.getTypeVariable());
            navigation.setNomVariableDepart(rangeInstruction.getNomVariable()+ "_" + compteurVariables++);
            navigation.setCollection(true);
            // TODO : à revoir
            navigation.setNomRole(queryInstruction.getNomRole());

            // Enlever les variables localse
            depileVariables(exp);

            instructions.put(exp, navigation);
            predicat.addSousInstruction(navigation);
        }


        /**
         * TODO : tester avec une navigation multiple au d&eacute;part
         * (dans le r&ocirc;le pour lequel on construit le pr&eacute;dicat).
         * 
         * @param exp 
         */
        @Override
        public void visitNavigation(ExpNavigation exp) {
            // Est-ce une navigation mettant en œuvre le rôle pour lequel on
            // construit le prédicat ?
            MNavigableElement destination = exp.getDestination();
            if (destination == role.getmNavigableEnd()) {
                usingRole = true;
            }
            else if (fromSelf) {
                String nomRole = destination.nameAsRolename();
                Role dependance = modele.getRole(nomRole);
                predicat.addRoleDependant(dependance);
            }
            fromSelf = false;

            // Visiter le membre gauche (collection initiale)
            Iterable<Expression> childExpressions = exp.getChildExpressions();
            Expression depart = childExpressions.iterator().next();
            depart.processWithVisitor(this);
            Navigation navigation;
            if (usingRole) {
                // NON : si l'association est de cardinalité *, il faut
                // créer une jointure
                if (destination instanceof MAssociationEnd) {
                    MAssociationEnd associationEnd = (MAssociationEnd)destination;
                    MMultiplicity multiplicity = associationEnd.multiplicity();
                    if (multiplicity.isCollection()) {
                        navigation = new Jointure();
                    }
                    else {
                        navigation = new NavigationDansPredicat();
                    }
                }
                else {
                    navigation = new NavigationDansPredicat();
                }
            }
            else {
                // TODO : vérifier que la source ne peut être de multiplicité
                // n (le compilateur devrait placer un "collect" dans ce cas)
                navigation = new NavigationDansCode();
                if (destination instanceof MAssociationEnd) {
                    MAssociationEnd associationEnd = (MAssociationEnd)destination;
                    MMultiplicity multiplicity = associationEnd.multiplicity();
                    if (multiplicity.isCollection()) {
                        navigation.setCollection(true);
                    }
                }
            }
            Instruction rangeInstruction = instructions.get(depart);
            if (usingRole) {
                navigation.setNomVariableDepart(role.getNomRole());
            }
            else {
                navigation.setNomVariableDepart(rangeInstruction.getNomVariable());
            }
            navigation.setTypeVariableDepart(rangeInstruction.getTypeVariable());

            Type type = exp.type();
            if (type instanceof CollectionType) {
                CollectionType coll = (CollectionType) type;
                type = coll.elemType();
            }
            navigation.setTypeVariable(type);
            String nameAsRolename = destination.nameAsRolename();
            if (usingRole) {
                navigation.setNomVariable(nameAsRolename);
            }
            else {
                navigation.setNomVariable(nameAsRolename + "_" + compteurVariables++);
            }
            navigation.setNomRole(nameAsRolename);

            instructions.put(exp, navigation);
            predicat.addSousInstruction(navigation);
        }



        /**
         * Se traduit typiquement par&nbsp;:<br/>
         * <pre><code>Xxx xxx = yyy.getZzz();</code></pre><br/>
         * si cette navigation s'effectue dans le code et par&nbsp;:<br/>
         * <pre><code></code></pre><br/>
         * si cette navigation s'effectue dans la requ&ecirc;te.<br/>
         * Une navigation est dans la requ&ecirc;te si elle contient le
         * r&ocirc;le pour lequel on construit le pr&eacute;dicat.
         * 
         * @param exp 
         */
//        public void visitNavigationOld(ExpNavigation exp) {
//            //            usingRole = false;
//            // Visiter les enfants. Cela entraîne la création
//            // de variables locales pour les diff&eacute;rentes instructions
//            // que l'on cr&eacute;era plus tard.
//            genericVisit(exp);
//            MAssociationEnd source = (MAssociationEnd) exp.getSource();
//            MClass classeUseSource = source.cls();
//            Classe classeSource = modele.getClasse(classeUseSource);
//            MAssociationEnd destination = (MAssociationEnd) exp.getDestination();
//            MClass classeUseDestination = destination.cls();
//            Classe classeDestination = modele.getClasse(classeUseDestination);
//            String nomRole = destination.nameAsRolename();
//            // Cette étape utilise-t-elle le rôle pour lequel on construit
//            // un prédicat ?
//            if (destination == role.getmNavigableEnd()) {
//                usingRole = true;
//            }
//            List<Expression> fChildExpressions = exp.getfChildExpressions();
//            Expression depart = fChildExpressions.get(0);
//            Instruction instructionPrecedente = instructions.get(depart);
//            Navigation instruction = null;
//
//            if (usingRole) {
//                // Cette navigation (dernière étape ou une étape précédente) utilise
//                // le rôle pour lequel on est en train de construire un prédicat.
//                // Les navigations sont donc dans la requête.
//                // Selon la cardinalité de l'arrivée on est dans
//                // une jointure ou une simple navigation.
//                // TODO : est-on oblig&eacute; d'avoir deux classes
//                // de navigation diff&eacute;rentes&nbsp;? On n'exploite
//                // aucun polymorphisme sur ces deux classes. Un simple
//                // attribut suffirait donc.
//                // En revanche, l'XML doit utiliser des &eacute;l&eacute;ments
//                // diff&eacute;rents pour profiter du polymorphisme dans les
//                // templates.
//                MMultiplicity multiplicity = destination.multiplicity();
//                if (multiplicity.isCollection()) {
//                    instruction = new Jointure();
//                }
//                else {
//                    instruction = new NavigationDansPredicat();
//                }
//            }
//            else {
//                // Cette navigation n'utilise pas le rôle pour lequel on est
//                // en train de construire un prédicat. Il s'agit donc d'une
//                // navigation dans le code. Si la cardinalit&eacute; du
//                // d&eacute;part est *, il faut faire un "collect".
//                MMultiplicity multiplicity = source.multiplicity();
//                if (multiplicity.isCollection()) {
//                    instruction = new CollectDansCode();
//                }
//                else {
//                    instruction = new NavigationDansCode();
//                }
//            }
//            instruction.setExpression(exp);
//
//            if (instructionPrecedente.isCollection()) {
//                instruction.setCollection(true);
//            }
//            else {
//                instruction.computeIsCollection();
//            }
//
//            instruction.setNomRole(nomRole);
//            if (instructionPrecedente != null) {
//                instruction.setTypeVariableDepart(instructionPrecedente.getTypeVariable());
//                instruction.setNomVariableDepart(instructionPrecedente.getNomVariable());
//            }
//            Type typeArrivee = exp.type();
//            if (instruction.isCollection()) {
//                CollectionType coll = (CollectionType) typeArrivee;
//                typeArrivee = coll.elemType();
//            }
//            instruction.setTypeVariable(typeArrivee);
//            instruction.setNomVariable(nomRole + compteurVariables++);
//
//            predicat.addSousInstruction(instruction);
//            instructions.put(exp, instruction);
//        }

        @Override
        public void genericVisit(Expression exp) {
            super.genericVisit(exp);
        }

        @Override
        public void visitVariable(ExpVariable exp) {
            if ("self".equals(exp.getVarname())) {
                Self self = new Self();
                self.setNomVariable("self");
                // Le type est celui de la classe de contexte de l'invariant
                // pour lequel on travaille.
                // C'est aussi la classe de départ du rôle.
                Type typeContexte = TypeFactory.mkObjectType(
                                        role.getClasseDepart().getMClass());
                self.setTypeVariable(typeContexte);
                predicat.addSousInstruction(self);
                instructions.put(exp, self);
                fromSelf = true;
            }
            else {
                // TODO : faut-il vérifier que la variable ne vaut pas
                // "self" ?
                // TODO : le parcours des variables est-il en partant du
                // sommet de pile ?
                String nomVariable = exp.getVarname();
                for (VarDecl declaration : variables) {
                    if (nomVariable.equals(declaration.name())) {
                        Variable variable = new Variable();
                        variable.setNomVariable(nomVariable);
                        variable.setTypeVariable(exp.type());
                        predicat.addSousInstruction(variable);
                        instructions.put(exp, variable);
                        return;
                    }
                }
                System.out.println("Attention : variable non traitee : " + exp);
            }
        }

        @Override
        public void visitAllInstances(ExpAllInstances exp) {
            super.visitAllInstances(exp);
        }

        @Override
        public void visitAny(ExpAny exp) {
            super.visitAny(exp);
        }

        @Override
        public void visitAsType(ExpAsType exp) {
            super.visitAsType(exp);
        }

        @Override
        public void visitAttrOp(ExpAttrOp exp) {
            super.visitAttrOp(exp);
        }

        @Override
        public void visitBagLiteral(ExpBagLiteral exp) {
            super.visitBagLiteral(exp);
        }

        /**
         * La cl&ocirc;ture est le parcours r&eacute;cursif d'une relartion
         * r&eacute;flexive.
         * 
         * @param expClosure 
         */
        @Override
        public void visitClosure(ExpClosure expClosure) {
            super.visitClosure(expClosure);
        }

        
        private void empileVariables(ExpQuery exp) {
            VarDeclList variableDeclarations = exp.getVariableDeclarations();
            int nbDeclarations = variableDeclarations.size();
            for (int i=0 ; i<nbDeclarations; i++) {
                VarDecl varDecl = variableDeclarations.varDecl(i);
                variables.push(varDecl);
            }
        }


        private void depileVariables(ExpQuery exp) {
            VarDeclList variableDeclarations = exp.getVariableDeclarations();
            int nbDeclarations = variableDeclarations.size();
            for (int i = 0 ; i<nbDeclarations ; i++) {
                variables.pop();
            }
        }

        @Override
        public void visitCollect(ExpCollect exp) {
            visitQuery(exp);
        }


        @Override
        public void visitCollectNested(ExpCollectNested exp) {
            visitQuery(exp);
            Instruction instruction = instructions.get(exp);
            VarDeclList variableDeclarations = exp.getVariableDeclarations();
            Navigation navigation = (Navigation) instruction;
            navigation.setVariablesLocales(variableDeclarations);
            Expression rangeExpression = exp.getRangeExpression();
            Instruction source = instructions.get(rangeExpression);
            navigation.setNomVariableDepart(source.getNomVariable());
        }


        @Override
        public void visitConstBoolean(ExpConstBoolean exp) {
            super.visitConstBoolean(exp);
        }


        @Override
        public void visitConstDate(ExpConstDate exp) {
            super.visitConstDate(exp);
        }

        @Override
        public void visitConstEnum(ExpConstEnum exp) {
            super.visitConstEnum(exp);
        }

        @Override
        public void visitConstInteger(ExpConstInteger exp) {
            super.visitConstInteger(exp);
        }

        @Override
        public void visitConstReal(ExpConstReal exp) {
            super.visitConstReal(exp);
        }

        @Override
        public void visitConstString(ExpConstString exp) {
            super.visitConstString(exp);
        }

        @Override
        public void visitEmptyCollection(ExpEmptyCollection exp) {
            super.visitEmptyCollection(exp);
        }

        @Override
        public void visitExists(ExpExists exp) {
            super.visitExists(exp);
        }

        @Override
        public void visitForAll(ExpForAll exp) {
            super.visitForAll(exp);
        }

        @Override
        public void visitIf(ExpIf exp) {
            super.visitIf(exp);
        }

        @Override
        public void visitIsKindOf(ExpIsKindOf exp) {
            super.visitIsKindOf(exp);
        }

        @Override
        public void visitIsTypeOf(ExpIsTypeOf exp) {
            super.visitIsTypeOf(exp);
        }

        @Override
        public void visitIsUnique(ExpIsUnique exp) {
            super.visitIsUnique(exp);
        }

        @Override
        public void visitIterate(ExpIterate exp) {
            super.visitIterate(exp);
        }

        @Override
        public void visitLet(ExpLet exp) {
            super.visitLet(exp);
        }

        @Override
        public void visitObjAsSet(ExpObjAsSet exp) {
            super.visitObjAsSet(exp);
        }

        @Override
        public void visitObjOp(ExpObjOp exp) {
            super.visitObjOp(exp);
        }

        @Override
        public void visitObjRef(ExpObjRef exp) {
            super.visitObjRef(exp);
        }

        @Override
        public void visitOne(ExpOne exp) {
            super.visitOne(exp);
        }

        @Override
        public void visitOrderedSetLiteral(ExpOrderedSetLiteral exp) {
            super.visitOrderedSetLiteral(exp);
        }


        @Override
        public void visitReject(ExpReject exp) {
            super.visitReject(exp);
        }

        @Override
        public void visitSelect(ExpSelect exp) {
            super.visitSelect(exp);
        }

        @Override
        public void visitSequenceLiteral(ExpSequenceLiteral exp) {
            super.visitSequenceLiteral(exp);
        }

        @Override
        public void visitSetLiteral(ExpSetLiteral exp) {
            super.visitSetLiteral(exp);
        }

        @Override
        public void visitSortedBy(ExpSortedBy exp) {
            super.visitSortedBy(exp);
        }

        @Override
        public void visitStdOp(ExpStdOp exp) {
            // Crée les deux noms de variables et range les expressions dans
            // la table de hachage
            for (Expression enfant : exp.getChildExpressions()) {
                usingRole = false;
                enfant.processWithVisitor(this);
            }
            Operation operation = new Operation();
            operation.setExpression(exp);
            Type type = exp.type();
            operation.setTypeVariable(type);
            String shortName = type.shortName();
            shortName = shortName.replaceAll("\\(", "_");
            shortName = shortName.replaceAll("\\)", "_");
            operation.setNomVariable(shortName + compteurVariables++);
            for (Expression enfant : exp.getChildExpressions()) {
                Instruction instructionEnfant = instructions.get(enfant);
                String nomVariableEnfant = instructionEnfant.getNomVariable();
                operation.addNomOperande(nomVariableEnfant);
                operation.addOperande(instructionEnfant);
            }
            instructions.put(exp, operation);
            predicat.addSousInstruction(operation);
        }

        @Override
        public void visitTupleLiteral(ExpTupleLiteral exp) {
            super.visitTupleLiteral(exp);
        }

        @Override
        public void visitTupleSelectOp(ExpTupleSelectOp exp) {
            super.visitTupleSelectOp(exp);
        }

        @Override
        public void visitUndefined(ExpUndefined exp) {
            super.visitUndefined(exp);
        }

        @Override
        public void visitWithValue(ExpressionWithValue exp) {
            super.visitWithValue(exp);
        }

        /**
         * Attention, &agrave; la diff&eacute;rence du visiteur de
         * g&eacute;n&eacute;ration de supports, cette variable reste à
         * <code>true</code> tant qu'on est dans la m&ecirc;me navigation
         */
        private boolean usingRole;
        private int     compteurVariables;

    }       // VisiteurGenerateurPredicats

    private Modele    modele;
    /**
     * Variable d'instance destin&eacute;e &agrave; passer un contexte de
     * visite.
     */
    private Role      role;

    /**
     * Predicat en cours de construciton.<br/>
     * 
     * Variable d'instance destin&eacute;e &agrave; passer un contexte de
     * visite.
     */
    private Predicat  predicat;

    /**
     * Variable d'instance destin&eacute;e &agrave; passer un contexte de
     * visite.
     */
    private Invariant invariant;

    private Map<Expression, Instruction> instructions = new HashMap<Expression, Instruction>();

    private Stack<VarDecl>  variables = new Stack<VarDecl>();

    /**
     * Si cette variable est "true" et si le r&ocirc;le n'est pas celui pour
     * lequel on construit le pr&ecaute;dicat, il s'agit d'une
     * d&eacute;pendance
     */
    private boolean fromSelf;
}
