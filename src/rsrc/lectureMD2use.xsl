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
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
 xmlns:uml='http://schema.omg.org/spec/UML/2.2'
 xmlns:xmi='http://schema.omg.org/spec/XMI/2.1'
 xmlns:MagicDraw_Profile='http://www.magicdraw.com/schemas/MagicDraw_Profile.xmi'
 xmlns:Validation_Profile='http://www.magicdraw.com/schemas/Validation_Profile.xmi'
 xmlns:DSL_Customization='http://www.magicdraw.com/schemas/DSL_Customization.xmi'
 xmlns:UML_Standard_Profile='http://www.magicdraw.com/schemas/UML_Standard_Profile.xmi'
 xmlns:stéréotypes='http://www.magicdraw.com/schemas/stéréotypes.xmi'>

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
                select="//packagedElement[@xmi:type='uml:Class']/ownedRule" mode="use"/>

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

    <xsl:template match="packagedElement[@xmi:type='uml:Class']" mode="constraints">
        <xsl:if test="ownedRule">
context <xsl:value-of select="@name"/>
    <xsl:apply-templates select="ownedRule" mode="use"/>
    </xsl:if>
    </xsl:template>


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

    <xsl:template match="ownedRule" mode="use">
        <xsl:text>
context </xsl:text>
        <xsl:value-of select="../@name"/>
        <xsl:text> inv </xsl:text>
        <xsl:choose>
            <xsl:when test="@name">
                <xsl:value-of select="@name"/>
            </xsl:when>
            <xsl:otherwise>inv_<xsl:value-of select="count(preceding::ownedRule) + 1"/></xsl:otherwise>
        </xsl:choose>
        <xsl:text>:
        </xsl:text>
        <xsl:value-of select="specification/@body"/>
    </xsl:template>

    <xsl:template match="text()" mode="use"/>



    <xsl:template match="packagedElement[@xmi:type='uml:Association']" mode="use">
        <xsl:if test="count(memberEnd[key('members', @xmi:idref)]) &gt; 0">
        <xsl:text>

association </xsl:text>
    <xsl:choose>
        <xsl:when test="@name">
            <xsl:value-of select="@name"/>
        </xsl:when>
        <xsl:otherwise>
            <xsl:text>assoc_</xsl:text>
            <xsl:value-of select="count(preceding::packagedElement[@xmi:type='uml:Association'])+1"/>
        </xsl:otherwise>
    </xsl:choose>
    <xsl:text> between
    </xsl:text>
    <xsl:apply-templates select="memberEnd" mode="use"/>
end
</xsl:if>
    </xsl:template>


    <xsl:template match="memberEnd" mode="use">
        <xsl:if test="true()">
        <xsl:choose>
            <xsl:when test="key('members', @xmi:idref)">
                <xsl:apply-templates select="key('members', @xmi:idref)" mode="use_association"/>
            </xsl:when>
            <xsl:otherwise>
                <!-- Retrouver la classe qui n'a pas de rôle. Dans ce cas, on a un élément "ownedEnd" -->
                <xsl:text>
    </xsl:text>
                <xsl:value-of select="//packagedElement[@xmi:id=current()/../ownedEnd[@xmi:id=current()/@xmi:idref]/@type]/@name"/>
                <xsl:text>[*] role role_</xsl:text>
                <xsl:value-of select="count(preceding::memberEnd)"/>
                <xsl:text> -- TODO : revoir la cardinalité, au ca où...
                -- TODO : revoir la mise en page</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        </xsl:if>
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
    <!--                            A C T E U R S                            -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="packagedElement[@xmi:type='uml:Actor']">
        <xsl:if test="string-length(@name)">
        <actor>
            <name><xsl:value-of select="translate(@name, ' ', '')"/></name>
            <real-name><xsl:value-of select="@name"/></real-name>
        </actor>
        </xsl:if>
    </xsl:template>

    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--                            E N T I T E S                            -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->


    <xsl:template match="UML_Standard_Profile:entity">
        <xsl:message>Entité....</xsl:message>
        <entity>
            <xsl:apply-templates select="//packagedElement[@xmi:id = current()/@base_Class]"/>
        </entity>
    </xsl:template>



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
    <!--                    S C E N A R I O S   E T   U I                    -->
    <!-- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -->
    <!--
        Un diagramme de communication contient des "lifelines".
        Une lifeline est une instance d'une classe.
        Certaines de ces classes portent le stéréotype "boundary". Cette
        classe donne un composant graphique.
        Les différentes lifelines d'une même classe doivent être traduites
        par un seul composant graphique par rôle. En effet, l'utilisation
        d'un composant graphique peut être soumise à contrôle d'accès.
      -->
    <xsl:template match="UML_Standard_Profile:boundary">
        <boundary>
            <xsl:apply-templates select="//packagedElement[@xmi:id = current()/@base_Class]" mode="ui"/>
        </boundary>
    </xsl:template>


    <!-- Y a-t-il des éléments particuliers pour les composants "bpoundary" ? -->
    <xsl:template match="packagedElement[@xmi:type='uml:Class']" mode="ui">
        <xsl:apply-templates select="."/>
    </xsl:template>


    <!--
        Il faut remettre dans l'ordre les messages envoyés et repérer les
        messages "forward" entre composants. Ces messages indiquent un
        hangement de composant, donc une navigation.
      -->
    <xsl:template match="ownedBehavior[@xmi:type='uml:Interaction']">
        <!-- Un scénario contient des "lifelines"
             Une "lifeline" est en fait une instance.
             Il faut repérer les instance d'acteurs et les instances de classes
             avec le stéréotype "boundary".
          -->
          <!-- Chercher l'origine du premier message.
          Il faudrait que ce soit un acteur -->
        <scenario>
            <xsl:apply-templates select="message"/>
        </scenario>
    </xsl:template>


    <xsl:template match="message">
        <message>
            <from>
        <xsl:apply-templates select="../lifeline[coveredBy/@xmi:idref = current()/@sendEvent]"/>
            </from>
            <subject>
        <xsl:value-of select="@name"/>
            </subject>
            <to>
        <xsl:apply-templates select="../lifeline[coveredBy/@xmi:idref = current()/@receiveEvent]"/>
        </to>
        </message>
    </xsl:template>


    <xsl:template match="lifeline">
        <xsl:value-of select="@name"/>
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


    <xsl:template match="packagedElement[@xmi:type='uml:Package']" mode="calcPackage">
        <xsl:if test="parent::packagedElement[@xmi:type='uml:Package']">
                <xsl:apply-templates select=".." mode="calcPackage"/>
                <xsl:text>.</xsl:text>
        </xsl:if>
        <xsl:value-of select="@name"/>
    </xsl:template>

    <xsl:template match="*" mode="calcPackage"/>


<!--    <xsl:function name="ete:reverse">
        <xsl:param name="nomParam"/>
    </xsl:function>-->


</xsl:stylesheet>
