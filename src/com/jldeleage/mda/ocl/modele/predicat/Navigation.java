package com.jldeleage.mda.ocl.modele.predicat;


import org.tzi.use.uml.mm.MAssociationEnd;
import org.tzi.use.uml.mm.MMultiplicity;
import org.tzi.use.uml.mm.MNavigableElement;
import org.tzi.use.uml.ocl.expr.ExpNavigation;
import org.tzi.use.uml.ocl.expr.Expression;
import org.tzi.use.uml.ocl.expr.VarDeclList;
import org.tzi.use.uml.ocl.type.Type;


/**
 * Encapsule une instance de MNavigableElement et apporte des informations
 * sp&eacute;cifiques &agrave; Ete.<br/>
 * Il a plusieurs sous-classes concr&egrave;tes&nbsp;:<ul>
 * <li>NavigationDansCode correspond &agrave; un accesseur</li>
 * <li>NavigationDansPredicat correspond &agrave; une simple
 * propri&eacute;&eacute; dans le pr&eacute;dicat JPA</li>
 * <li>Collect correspond &agrave; une propri&eacute;t&eacute; dont le
 * d&eacute;part est une collection</li>
 * <li>Jointure correspond &agrave; une propri&eacute;t&eacute; de
 * cardinalit&eacute; multiple dans le pr&eacute;dicat</li>
 * </ul>
 * Exemple&nbsp;:<br/>
 * <pre><code>commandant.brevets.modele-&gt;includes(avion.modele)</code></pre><br/>
 * Si on prend comme r&ocirc;le "commandant" on a&nbsp;:<br/>
 * <ul>
 * <li>commandant.brevets est une jointure</li>
 * <li>brevets.modele est une navigation dans le pr&eacute;dicat</li>
 * <li>avion.modele est une navigation dans le code</li>
 * </ul>
 * Si on prend comme r&ocirc;le "avion" on a&nbsp;:<br/>
 * <ul>
 * <li>commandant.brevets est une navigation dans le code</li>
 * <li>brevets.modele est un collect</li>
 * <li>avion.modele est une navigation dans le pr&eacute;dicat</li>
 * </ul>
 * On le voit, les cardinalit&eacute;s ne sont pas g&eacute;r&eacute;es de
 * la m&ecirc;me fa&ccedil;on selon que l'on est dans le code ou le
 * pr&eacute;dicat&nbsp;:<br/>
 * le pr&eacute;dicat ne suit pas directement une association dont
 * l'arriv&eacute;e est de cardinalit&eacute; n, c'est une jointure, alors
 * que le code utilise un accesseur si le d&eacute;part n'est pas une
 * collection.<br/>
 * Le pr&eacute;dicat consid&egrave;re qu'une association dont l'arriv&eacute;e
 * est de cardinalit&eacute; 1 est un parcours de propri&eacute;t&eacute; alors
 * que le code effectue un "collect".<br/>
 * Il reste &agrave; trancher le probl&egrave;me de la navigation n,m.
 *
 * @author jldeleage
 */
public abstract class Navigation extends Instruction {

    /**
     * Attention, ceci indique la cardinalit&eacute; de la navigation dans
     * le diagramme de classes mais ne tient pas compte du contexte de
     * l'expression.<br/>
     * Dans l'expression&nbsp;:<br/>
     * <pre><code>commandant.brevets.modele.nom</code></pre><br/>
     * la navigation modele.nom est vue comme &eacute;tant de cardinalit&eacute;
     * 1 alors que dans l'expression elle est de cardinalit&eacute; * (collect)
     * 
     * @return 
     */
    public void computeIsCollection() {
        ExpNavigation exp = (ExpNavigation) getExpression();
        MNavigableElement destination = exp.getDestination();
        if (destination instanceof MAssociationEnd) {
            // La navigation suit une association
            MAssociationEnd end = (MAssociationEnd)destination;
            MMultiplicity multiplicity = end.multiplicity();
            setCollection(multiplicity.isCollection());
        }
        else {
            // La navigation suit un attribut
            // TODO : récupérer la cardinalité de l'association
        }
    }



    public String getNomRole() {
        return nomRole;
    }

    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }

    public String getNomVariableDepart() {
        return nomVariableDepart;
    }

    public void setNomVariableDepart(String nomVariableDepart) {
        this.nomVariableDepart = nomVariableDepart;
    }

    public Type getTypeVariableDepart() {
        return typeVariableDepart;
    }

    public void setTypeVariableDepart(Type typeVariableDepart) {
        this.typeVariableDepart = typeVariableDepart;
    }

    public VarDeclList getVariablesLocales() {
        return variables;
    }

    public void setVariablesLocales(VarDeclList variableDeclarations) {
        variables = variableDeclarations;
    }
    public void setVariables(VarDeclList variables) {
        this.variables = variables;
    }


    private String  nomRole;
    private String  nomVariableDepart;
    private Type    typeVariableDepart;

    // Les navigations de type "Query" peuvent utiliser des variables locales
    private VarDeclList variables;


}   // Navigation


