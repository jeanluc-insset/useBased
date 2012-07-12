<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : lectureMD.xsl
    Created on : 1 novembre 2010, 22:32
    Author     : jldeleage
    Description:
        Lit un document MagicDraw (ou plus généralement UML 2.2 / XMI 2.1)
        et produit un modèle "ete".
    TODO: ajouter d'autres formats UML/XMI
-->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
 version="1.0"
 xmlns:uml="http://www.eclipse.org/uml2/2.0.0/UML"
 xmlns:xmi='http://schema.omg.org/spec/XMI/2.1'
 xmlns:UML_Standard_Profile='http://www.magicdraw.com/schemas/UML_Standard_Profile.xmi'
 >

    <xsl:output method="text" indent="yes"/>

    <xsl:key name="reverse" match="ownedAttribute[@association]"
             use="@association"/>

    <xsl:key name="scenarios" match="ownedBehavior[@xmi:type='uml:Interaction']" use="1"/>


    <!-- Ces deux clefs servent lors du traitement d'associations.
         Une association contient des "ownedMembers" qui réfèrent l'attribut
         de la classe au départ de la navigabilité
      -->

    <!-- Pour retrouver facilement une classe par son identifiant -->
    <xsl:key name="classes" match="packagedElement[@xmi:type='uml:Class']" use="@xmi:id"/>
    <!-- Pour retrouver facilement un attribut par son identifiant -->
    <xsl:key name="members" match="ownedAttribute" use="@xmi:id"/>




    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                     P O I N T   D ' E N T R E E                     -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="/" priority="-1000">
        <xsl:apply-templates select="." mode="use"/>
    </xsl:template>


    <xsl:template match="/" mode="use">
        <xsl:message>CREATION DU MODELE USE...</xsl:message>
        <xsl:text>model </xsl:text>
        <xsl:value-of select="xmi:XMI/uml:Model/@name"/>

        <xsl:apply-templates
            select="//packagedElement[@xmi:type='uml:Class']" mode="use"/>

        <xsl:apply-templates
            select="//packagedElement[@xmi:type='uml:Association']" mode="use"/>

constraints

        <xsl:apply-templates
                select="//ownedRule" mode="contrainte"/>

        <xsl:apply-templates
                select="//ownedOperation" mode="contrainte"/>

        <xsl:message>CREATION DU MODELE USE OK</xsl:message>
    </xsl:template>     <!-- match / -->




    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                            C L A S S E S                            -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="packagedElement[@xmi:type='uml:Class']" mode="use">

<xsl:if test="@name != 'Date'">
class <xsl:value-of select="@name"/>
attributes <xsl:apply-templates select="ownedAttribute[not(@association)]" mode="use"/>
operations <xsl:apply-templates select="ownedOperation" mode="use"/>
<!--  constraints <xsl:apply-templates select="ownedRule" mode="use"/>-->end  -- <xsl:value-of select="@name"/>
<xsl:text>    

</xsl:text>
</xsl:if>
    </xsl:template>




<!--    <xsl:template match="packagedElement[@xmi:type='uml:Class']" mode="constraints">
        <xsl:if test="ownedRule">
context <xsl:value-of select="//packageElement[@xmi:id=current()/@constrainedElement]/@name"/>
    <xsl:apply-templates select="ownedRule" mode="use"/>
    </xsl:if>
    </xsl:template>-->


    <xsl:template match="ownedAttribute[not(@association)]" mode="use">
                <!-- Ce n'est pas une association, c'est donc une propriété
                     de type scalaire (ou chaîne)
                  -->
        <xsl:if test="type | @type">
        <xsl:text>
    </xsl:text>
        <name><xsl:value-of select="@name"/></name>
        <xsl:text> : </xsl:text>
        <type>
            <xsl:choose>
                <!-- Les attributs de type standard ont une référence href
                    vers ce type -->
                <xsl:when test="type/@href">
                    <xsl:call-template name="derniereSousChaine">
                        <xsl:with-param name="chaine"
                            select="type/xmi:Extension/referenceExtension/@referentPath"/>
                    </xsl:call-template>
                </xsl:when>
                <!-- Les attributs de type POJO ont un attribut -->
                <xsl:when test="@type">
                    <xsl:variable name="type" select="//packagedElement[@xmi:id=current()/@type]/@name"/>
                    <xsl:message>ATTENTION : le type <xsl:value-of select="$type"/> est converti en chaîne</xsl:message>
                    <xsl:text>String</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text> Object -- type non précisé </xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </type>
        </xsl:if>
    </xsl:template>

    <xsl:template match="ownedOperation" mode="use">
    </xsl:template>


    <xsl:template match="ownedRule" mode="contrainte">
        <!-- Un invariant référence la classe de contexte. Une condition
             sur une opération ne le fait pas...
          -->
        <xsl:apply-templates select="//*[@xmi:id=current()/@constrainedElement]" mode="contexte">
            <xsl:with-param name="rule_id" select="@xmi:id"/>
        </xsl:apply-templates>
<!--        <xsl:choose>
            <xsl:when test="@name">
                <xsl:value-of select="@name"/>
            </xsl:when>
            <xsl:otherwise>cotnrainte_<xsl:value-of select="count(preceding::ownedRule) + 1"/></xsl:otherwise>
        </xsl:choose>-->
        <xsl:text>:
        </xsl:text>
        <xsl:value-of select="specification/@body"/>
    </xsl:template>


    <xsl:template match="ownedOperation" mode="contrainte">
        <xsl:if test="@precondition | @postcondition">
context <xsl:value-of select="../@name"/>::<xsl:value-of select="@name"/>
        </xsl:if>
        <xsl:apply-templates select="@precondition" mode="precondition"/>
        <xsl:apply-templates select="@postcondition" mode="postcondition"/>
    </xsl:template>

    <xsl:template match="@*" mode="precondition">
    pre
        <xsl:apply-templates select="//ownedRule[@xmi:id=current()]" mode="body"/>
    </xsl:template>

    <xsl:template match="@*" mode="postcondition">
    post
        <xsl:apply-templates select="//ownedRule[@xmi:id=current()]" mode="body"/>
    </xsl:template>

    <xsl:template match="ownedRule" mode="body">
        <xsl:value-of select="specification/@body"/>
    </xsl:template>


    <xsl:template match="text()" mode="use"/>


    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!-- Règles de construction du contexte d'une contrainte (polymophisme)  -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="packagedElement[@xmi:type='uml:Class']" mode="contexte">
        <xsl:param name="rule_id" select="''"/>
        <xsl:text>
context </xsl:text>
        <xsl:value-of select="@name"/>
        <xsl:text>
    inv </xsl:text>
    </xsl:template>


    <xsl:template match="ownedOperation" mode="contexte">
        <xsl:param name="rule_id" select="''"/>
        <xsl:value-of select="../@name"/>::<xsl:value-of select="@name"/><xsl:text>
</xsl:text>
        <xsl:choose>
            <xsl:when test="@postCondition=$rule_id">
                <xsl:text> post </xsl:text>
            </xsl:when>
            <xsl:when test="@preCondition=$rule_id">
                <xsl:text> post </xsl:text>
            </xsl:when>
        </xsl:choose>
    </xsl:template>



    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                       A S S O C I A T I O N S                       -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->



    <xsl:template match="packagedElement[@xmi:type='uml:Association']" mode="use">
        <xsl:text>

association </xsl:text>
<!-- Si l'association a un nom, le produire sinon en synthétiser un -->
    <xsl:choose>
        <xsl:when test="@name">
            <xsl:value-of select="@name"/>
        </xsl:when>
        <xsl:otherwise>
            <xsl:text>assoc_</xsl:text>
            <xsl:value-of select="count(preceding::packagedElement[@xmi:type='uml:Association'])+1"/>
        </xsl:otherwise>
    </xsl:choose>
    <xsl:text> between </xsl:text>
    <!-- nom des classes en association. Attention, une association qui n'est
         navigable que dans un sens n'a qu'un seul sous-elément ownedEnd
         Il faut donc utiliser l'attribut memberEnd -->
    <xsl:apply-templates select="@memberEnd" mode="use"/>
end    <!-- de l'association -->
    </xsl:template>


    <!-- Une association possède un sous-éléments "ownedEnd" pour chaque
         extrêmité navigable. Elle possède l'attribut memberEnd qui indique
         toutes les extrêmités, même non navigables. C'est donc cet attribut
         qu'il faut analyser pour USE.
         Cette règle parcourt de façon récursive cet attribut
      -->
    <xsl:template match="@memberEnd" mode="use">
        <xsl:param name="chaine" select="."/>
        <xsl:param name="sousChaine" select="''"/>
        <xsl:if test="$sousChaine != ''">
            <!-- $sousChaine est l'identifiant d'une extrêmité. Il faut produire
                 son type, éventuellement sa cardinalité, enfin son rôle
              -->
            <xsl:apply-templates select="//*[@xmi:id = $sousChaine]" mode="end"/>
            -- ext [<xsl:value-of select="$sousChaine"/>]
        </xsl:if>
        <xsl:if test="contains($chaine, ' ')">
            <xsl:apply-templates select="." mode="use">
                <xsl:with-param name="chaine" select="substring-after($chaine, ' ')"/>
                <xsl:with-param name="sousChaine" select="substring-before($chaine, ' ')"/>
            </xsl:apply-templates>
        </xsl:if>
    </xsl:template>


    <xsl:template match="ownedEnd" mode="end">
        -- owned end
        <xsl:apply-templates select="//packagedElement[@xmi:id = current()/@type]" mode="end"/>
    </xsl:template>


    <xsl:template match="packagedElement" mode="end">
        <xsl:value-of select="@name"/> -- ext 
    </xsl:template>
    

    <xsl:template match="ownedEnd" mode="use">
        <xsl:choose>
            <xsl:when test="key('members', @type)">
                <xsl:apply-templates select="key('members', type)" mode="use_association"/>
            </xsl:when>
            <xsl:otherwise>
                <!-- Retrouver la classe qui n'a pas de rôle. Dans ce cas, on a un élément "ownedEnd" -->
                <xsl:text>
    </xsl:text>
                <xsl:value-of select="//packagedElement[@xmi:id=current()/../ownedEnd[@xmi:id=current()/@xmi:idref]/@type]/@name"/>
                <xsl:text>[*] role role_</xsl:text>
                <xsl:value-of select="count(preceding::ownedEnd)"/>
                <xsl:text> -- TODO : revoir la cardinalité, au cas où...
                -- TODO : revoir la mise en page</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
<!--        <xsl:text> role </xsl:text>
        <xsl:value-of select="key('members', @xmi:idref)/@name"/>-->
    </xsl:template>


    <xsl:template match="ownedAttribute[@association]" mode="use_association">
        <xsl:text>
    </xsl:text>
        <!-- L'attribut @type contient la référence à la classe extrêmité
             d'arrivée de la navigation.
          -->
        <xsl:value-of select="key('classes', @type)/@name"/>
        <xsl:text>[</xsl:text>
        <xsl:choose>
            <xsl:when test="upperValue[@value='*']">
                <!--xsl:message>ASSOCIATION DE CARDINALITE *</xsl:message -->
                <xsl:text>*</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <!-- TODO : on peut avoir une vision plus précise de la
                     cardinalité -->
                <xsl:text>0..1</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:text>]</xsl:text>
        <xsl:if test="@name"><xsl:text> role </xsl:text>
        <xsl:value-of select="@name"/>
        </xsl:if>
    </xsl:template>




    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                            E N T I T E S                            -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="packagedElement[@xmi:type='uml:Class']">
            <name><xsl:value-of select="@name"/></name>
            <package><xsl:apply-templates select=".." mode="calcPackage"/></package>
            <xsl:apply-templates select="ownedAttribute"/>
    </xsl:template>


    <xsl:template match="ownedAttribute">
        <xsl:choose>
            <xsl:when test="@association">
                <association>
                <xsl:attribute name="idUML">
                    <xsl:value-of select="@association"/>
                </xsl:attribute>
                <name><xsl:value-of select="@name"/></name>
                <type>
                <xsl:value-of select="//*[@xmi:id=current()/@type]/@name"/>
                </type>
                <xsl:if test="count(key('reverse',@association)) = 2">
                  <xsl:variable name="monId" select="generate-id()"/>
                  <reverse>
                      <xsl:for-each select="key('reverse',@association)">
                          <xsl:if test="generate-id() != $monId">
                          <xsl:value-of select="@name"/>
                          </xsl:if>
                      </xsl:for-each>
                  </reverse>
                </xsl:if>
                <xsl:if test=".//*[@value='*']">
                    <!-- S'il y a la navigabilité réciproque, il faut l'indiquer
                         pour permettre l'attribut "mappedBy" de l'annotation
                         "@OneToMany"
                      -->
                    <cardinalite>*</cardinalite>
                </xsl:if>
                </association>
            </xsl:when>
        <xsl:otherwise>
                <!-- Ce n'est pas une association, c'est donc une propriété
                     de type scalaire
                  -->
                <attribute>
                <name><xsl:value-of select="@name"/></name>
                <type>
<!--                    <xsl:value-of select="substring-after(@type, '#')"/>-->
                    <xsl:call-template name="derniereSousChaine">
                        <xsl:with-param name="chaine"
                            select="type/xmi:Extension/referenceExtension/@referentPath"/>
                    </xsl:call-template>
                </type>
                </attribute>
        </xsl:otherwise>
        </xsl:choose>
    </xsl:template>


    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                        U T I L I T A I R E S                        -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->

    <!-- Filtre les éléments non traités (essentiellement  pour les champs de
    texte non significatifs qu'ils contiennent) -->
    <xsl:template match="*"/>


    <!-- Permet de récupérer le nom du type effectif -->
    <xsl:template name="derniereSousChaine">
        <xsl:param name="chaine"/>
        <xsl:param name="delim" select="'::'"/>
        <xsl:choose>
            <xsl:when test="contains($chaine, $delim)">
                <xsl:call-template name="derniereSousChaine">
                    <xsl:with-param name="chaine" select="substring-after($chaine, $delim)"/>
                    <xsl:with-param name="delim" select="$delim"/>
                </xsl:call-template>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="$chaine='date' or $chaine='Date'">
                        <xsl:text>String</xsl:text>
<!--                        <xsl:text>java.util.Date</xsl:text>-->
                    </xsl:when>
                    <xsl:when test="$chaine='int'">
                        <xsl:text>Integer</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:value-of select="$chaine"/>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>



</xsl:stylesheet>
