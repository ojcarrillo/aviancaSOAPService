<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:p="http://soap.latinamerican.com/"
	xmlns:ser="http://aerolineas-latinoamericanas/externalSystems" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	exclude-result-prefixes="#default p ser">
	<xsl:template match="/">


		<security-incident>
			<level>
				<xsl:value-of select="/p:sendFlightAlert/security-incident/ser:level" />
			</level>			
			<description>
				<xsl:value-of select="/p:sendFlightAlert/security-incident/ser:description" />
			</description>
			<flight-external-key>
				<xsl:value-of select="/p:sendFlightAlert/security-incident/ser:flight-external-key" />
			</flight-external-key>
			<aircraft-tail-number>
				<xsl:value-of select="/p:sendFlightAlert/security-incident/ser:aircraft-tail-number" />
			</aircraft-tail-number>
			<incident-date>
				<xsl:value-of select="/p:sendFlightAlert/security-incident/ser:incident-date" />
			</incident-date>			
		</security-incident>


	</xsl:template>
</xsl:stylesheet>