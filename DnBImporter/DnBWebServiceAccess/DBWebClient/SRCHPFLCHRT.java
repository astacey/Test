
package DBWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SRCH_PFL_CHRT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SRCH_PFL_CHRT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FINANCIAL_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}FINANCIAL_SVCS"/>
 *         &lt;element name="SERVICES" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}SERVICES"/>
 *         &lt;element name="MFG_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MFG_SVCS"/>
 *         &lt;element name="WHOLESALE_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}WHOLESALE_SVCS"/>
 *         &lt;element name="COMM_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}COMM_SVCS"/>
 *         &lt;element name="TRANSPORT_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}TRANSPORT_SVCS"/>
 *         &lt;element name="RETAIL_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}RETAIL_SVCS"/>
 *         &lt;element name="UTILITY_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}UTILITY_SVCS"/>
 *         &lt;element name="CONT_CNST_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}CONT_CNST_SVCS"/>
 *         &lt;element name="PUB_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}PUB_SVCS"/>
 *         &lt;element name="METAL_MINING_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}METAL_MINING_SVCS"/>
 *         &lt;element name="AGRICULTURAL_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}AGRICULTURAL_SVCS"/>
 *         &lt;element name="UCLS_SVCS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}UCLS_SVCS"/>
 *         &lt;element name="TOT_PAST_24HRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_1_TO_2_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_3_TO_7_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_8_TO_14_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_15_TO_30_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_31_TO_60_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_61_TO_90_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TOT_PAST_91_TO_180_DAYS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNT_TOT_SRCH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SRCH_PFL_CHRT", propOrder = {
    "financialsvcs",
    "services",
    "mfgsvcs",
    "wholesalesvcs",
    "commsvcs",
    "transportsvcs",
    "retailsvcs",
    "utilitysvcs",
    "contcnstsvcs",
    "pubsvcs",
    "metalminingsvcs",
    "agriculturalsvcs",
    "uclssvcs",
    "totpast24HRS",
    "totpast1TO2DAYS",
    "totpast3TO7DAYS",
    "totpast8TO14DAYS",
    "totpast15TO30DAYS",
    "totpast31TO60DAYS",
    "totpast61TO90DAYS",
    "totpast91TO180DAYS",
    "cnttotsrch"
})
public class SRCHPFLCHRT {

    @XmlElement(name = "FINANCIAL_SVCS", required = true, nillable = true)
    protected FINANCIALSVCS financialsvcs;
    @XmlElement(name = "SERVICES", required = true, nillable = true)
    protected SERVICES services;
    @XmlElement(name = "MFG_SVCS", required = true, nillable = true)
    protected MFGSVCS mfgsvcs;
    @XmlElement(name = "WHOLESALE_SVCS", required = true, nillable = true)
    protected WHOLESALESVCS wholesalesvcs;
    @XmlElement(name = "COMM_SVCS", required = true, nillable = true)
    protected COMMSVCS commsvcs;
    @XmlElement(name = "TRANSPORT_SVCS", required = true, nillable = true)
    protected TRANSPORTSVCS transportsvcs;
    @XmlElement(name = "RETAIL_SVCS", required = true, nillable = true)
    protected RETAILSVCS retailsvcs;
    @XmlElement(name = "UTILITY_SVCS", required = true, nillable = true)
    protected UTILITYSVCS utilitysvcs;
    @XmlElement(name = "CONT_CNST_SVCS", required = true, nillable = true)
    protected CONTCNSTSVCS contcnstsvcs;
    @XmlElement(name = "PUB_SVCS", required = true, nillable = true)
    protected PUBSVCS pubsvcs;
    @XmlElement(name = "METAL_MINING_SVCS", required = true, nillable = true)
    protected METALMININGSVCS metalminingsvcs;
    @XmlElement(name = "AGRICULTURAL_SVCS", required = true, nillable = true)
    protected AGRICULTURALSVCS agriculturalsvcs;
    @XmlElement(name = "UCLS_SVCS", required = true, nillable = true)
    protected UCLSSVCS uclssvcs;
    @XmlElement(name = "TOT_PAST_24HRS", required = true, nillable = true)
    protected String totpast24HRS;
    @XmlElement(name = "TOT_PAST_1_TO_2_DAYS", required = true, nillable = true)
    protected String totpast1TO2DAYS;
    @XmlElement(name = "TOT_PAST_3_TO_7_DAYS", required = true, nillable = true)
    protected String totpast3TO7DAYS;
    @XmlElement(name = "TOT_PAST_8_TO_14_DAYS", required = true, nillable = true)
    protected String totpast8TO14DAYS;
    @XmlElement(name = "TOT_PAST_15_TO_30_DAYS", required = true, nillable = true)
    protected String totpast15TO30DAYS;
    @XmlElement(name = "TOT_PAST_31_TO_60_DAYS", required = true, nillable = true)
    protected String totpast31TO60DAYS;
    @XmlElement(name = "TOT_PAST_61_TO_90_DAYS", required = true, nillable = true)
    protected String totpast61TO90DAYS;
    @XmlElement(name = "TOT_PAST_91_TO_180_DAYS", required = true, nillable = true)
    protected String totpast91TO180DAYS;
    @XmlElement(name = "CNT_TOT_SRCH", required = true, nillable = true)
    protected String cnttotsrch;

    /**
     * Gets the value of the financialsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link FINANCIALSVCS }
     *     
     */
    public FINANCIALSVCS getFINANCIALSVCS() {
        return financialsvcs;
    }

    /**
     * Sets the value of the financialsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FINANCIALSVCS }
     *     
     */
    public void setFINANCIALSVCS(FINANCIALSVCS value) {
        this.financialsvcs = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link SERVICES }
     *     
     */
    public SERVICES getSERVICES() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link SERVICES }
     *     
     */
    public void setSERVICES(SERVICES value) {
        this.services = value;
    }

    /**
     * Gets the value of the mfgsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link MFGSVCS }
     *     
     */
    public MFGSVCS getMFGSVCS() {
        return mfgsvcs;
    }

    /**
     * Sets the value of the mfgsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MFGSVCS }
     *     
     */
    public void setMFGSVCS(MFGSVCS value) {
        this.mfgsvcs = value;
    }

    /**
     * Gets the value of the wholesalesvcs property.
     * 
     * @return
     *     possible object is
     *     {@link WHOLESALESVCS }
     *     
     */
    public WHOLESALESVCS getWHOLESALESVCS() {
        return wholesalesvcs;
    }

    /**
     * Sets the value of the wholesalesvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link WHOLESALESVCS }
     *     
     */
    public void setWHOLESALESVCS(WHOLESALESVCS value) {
        this.wholesalesvcs = value;
    }

    /**
     * Gets the value of the commsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link COMMSVCS }
     *     
     */
    public COMMSVCS getCOMMSVCS() {
        return commsvcs;
    }

    /**
     * Sets the value of the commsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMMSVCS }
     *     
     */
    public void setCOMMSVCS(COMMSVCS value) {
        this.commsvcs = value;
    }

    /**
     * Gets the value of the transportsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSPORTSVCS }
     *     
     */
    public TRANSPORTSVCS getTRANSPORTSVCS() {
        return transportsvcs;
    }

    /**
     * Sets the value of the transportsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSPORTSVCS }
     *     
     */
    public void setTRANSPORTSVCS(TRANSPORTSVCS value) {
        this.transportsvcs = value;
    }

    /**
     * Gets the value of the retailsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link RETAILSVCS }
     *     
     */
    public RETAILSVCS getRETAILSVCS() {
        return retailsvcs;
    }

    /**
     * Sets the value of the retailsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RETAILSVCS }
     *     
     */
    public void setRETAILSVCS(RETAILSVCS value) {
        this.retailsvcs = value;
    }

    /**
     * Gets the value of the utilitysvcs property.
     * 
     * @return
     *     possible object is
     *     {@link UTILITYSVCS }
     *     
     */
    public UTILITYSVCS getUTILITYSVCS() {
        return utilitysvcs;
    }

    /**
     * Sets the value of the utilitysvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UTILITYSVCS }
     *     
     */
    public void setUTILITYSVCS(UTILITYSVCS value) {
        this.utilitysvcs = value;
    }

    /**
     * Gets the value of the contcnstsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link CONTCNSTSVCS }
     *     
     */
    public CONTCNSTSVCS getCONTCNSTSVCS() {
        return contcnstsvcs;
    }

    /**
     * Sets the value of the contcnstsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTCNSTSVCS }
     *     
     */
    public void setCONTCNSTSVCS(CONTCNSTSVCS value) {
        this.contcnstsvcs = value;
    }

    /**
     * Gets the value of the pubsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link PUBSVCS }
     *     
     */
    public PUBSVCS getPUBSVCS() {
        return pubsvcs;
    }

    /**
     * Sets the value of the pubsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUBSVCS }
     *     
     */
    public void setPUBSVCS(PUBSVCS value) {
        this.pubsvcs = value;
    }

    /**
     * Gets the value of the metalminingsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link METALMININGSVCS }
     *     
     */
    public METALMININGSVCS getMETALMININGSVCS() {
        return metalminingsvcs;
    }

    /**
     * Sets the value of the metalminingsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link METALMININGSVCS }
     *     
     */
    public void setMETALMININGSVCS(METALMININGSVCS value) {
        this.metalminingsvcs = value;
    }

    /**
     * Gets the value of the agriculturalsvcs property.
     * 
     * @return
     *     possible object is
     *     {@link AGRICULTURALSVCS }
     *     
     */
    public AGRICULTURALSVCS getAGRICULTURALSVCS() {
        return agriculturalsvcs;
    }

    /**
     * Sets the value of the agriculturalsvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGRICULTURALSVCS }
     *     
     */
    public void setAGRICULTURALSVCS(AGRICULTURALSVCS value) {
        this.agriculturalsvcs = value;
    }

    /**
     * Gets the value of the uclssvcs property.
     * 
     * @return
     *     possible object is
     *     {@link UCLSSVCS }
     *     
     */
    public UCLSSVCS getUCLSSVCS() {
        return uclssvcs;
    }

    /**
     * Sets the value of the uclssvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCLSSVCS }
     *     
     */
    public void setUCLSSVCS(UCLSSVCS value) {
        this.uclssvcs = value;
    }

    /**
     * Gets the value of the totpast24HRS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST24HRS() {
        return totpast24HRS;
    }

    /**
     * Sets the value of the totpast24HRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST24HRS(String value) {
        this.totpast24HRS = value;
    }

    /**
     * Gets the value of the totpast1TO2DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST1TO2DAYS() {
        return totpast1TO2DAYS;
    }

    /**
     * Sets the value of the totpast1TO2DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST1TO2DAYS(String value) {
        this.totpast1TO2DAYS = value;
    }

    /**
     * Gets the value of the totpast3TO7DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST3TO7DAYS() {
        return totpast3TO7DAYS;
    }

    /**
     * Sets the value of the totpast3TO7DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST3TO7DAYS(String value) {
        this.totpast3TO7DAYS = value;
    }

    /**
     * Gets the value of the totpast8TO14DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST8TO14DAYS() {
        return totpast8TO14DAYS;
    }

    /**
     * Sets the value of the totpast8TO14DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST8TO14DAYS(String value) {
        this.totpast8TO14DAYS = value;
    }

    /**
     * Gets the value of the totpast15TO30DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST15TO30DAYS() {
        return totpast15TO30DAYS;
    }

    /**
     * Sets the value of the totpast15TO30DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST15TO30DAYS(String value) {
        this.totpast15TO30DAYS = value;
    }

    /**
     * Gets the value of the totpast31TO60DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST31TO60DAYS() {
        return totpast31TO60DAYS;
    }

    /**
     * Sets the value of the totpast31TO60DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST31TO60DAYS(String value) {
        this.totpast31TO60DAYS = value;
    }

    /**
     * Gets the value of the totpast61TO90DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST61TO90DAYS() {
        return totpast61TO90DAYS;
    }

    /**
     * Sets the value of the totpast61TO90DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST61TO90DAYS(String value) {
        this.totpast61TO90DAYS = value;
    }

    /**
     * Gets the value of the totpast91TO180DAYS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTPAST91TO180DAYS() {
        return totpast91TO180DAYS;
    }

    /**
     * Sets the value of the totpast91TO180DAYS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTPAST91TO180DAYS(String value) {
        this.totpast91TO180DAYS = value;
    }

    /**
     * Gets the value of the cnttotsrch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNTTOTSRCH() {
        return cnttotsrch;
    }

    /**
     * Sets the value of the cnttotsrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNTTOTSRCH(String value) {
        this.cnttotsrch = value;
    }

}
