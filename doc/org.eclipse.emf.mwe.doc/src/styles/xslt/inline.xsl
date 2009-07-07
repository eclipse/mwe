<?xml version='1.0'?> 
<xsl:stylesheet 
    xmlns:fo="http://www.w3.org/1999/XSL/Format"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    version="1.0">

  <xsl:template match="comment|remark">
    <xsl:if test="$show.comments != 0">
      <fo:block font-style="italic">
        <fo:inline background-color="#FFEE30">
          <xsl:call-template name="inline.charseq"/>
        </fo:inline>
      </fo:block>
    </xsl:if>
  </xsl:template>

<xsl:template match="figure|table|example" mode="label.markup">
  <xsl:variable name="pchap"
                select="(ancestor::chapter
                        |ancestor::appendix
                        |ancestor::article[ancestor::book])[last()]"/>

  <xsl:variable name="prefix">
    <xsl:if test="count($pchap) &gt; 0">
      <xsl:apply-templates select="$pchap" mode="label.markup"/>
    </xsl:if>
  </xsl:variable>

  <xsl:choose>
    <xsl:when test="@label">
      <xsl:value-of select="@label"/>
    </xsl:when>
    <xsl:otherwise>
      <xsl:number format="1" from="section" level="any"/>
    </xsl:otherwise>
  </xsl:choose>
</xsl:template>

</xsl:stylesheet>