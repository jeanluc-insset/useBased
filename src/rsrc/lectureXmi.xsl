<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : lectureXmi.xsl
    Created on : 29 juin 2012, 00:29
    Author     : jldeleage
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:import href="lectureMD2use.xsl"/>
    <xsl:import href="lectureVP2use.xsl"/>

    <xsl:template match="/">
        <xsl:apply-templates/>
    </xsl:template>

</xsl:stylesheet>
