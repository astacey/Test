
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type holds the summary of legal events information recorded by Dun and Bradstreet for the subject such as CCJ, Claims, Lawsuits etc.
 * 
 * <p>Java class for PublicFilingsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicFilingsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumberofCCJLast5Years" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ValueofCCJLast5Years" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NumberofMortgagesandCharges" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LetterofLiabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofLetterofLiabilities" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LetterofAgreementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberofClaimsLast3Years" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberofOtherFilings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CurrentNegativeLegalEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpecialEventsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuitsandJudgementsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsolvencyProcessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProtestedBillsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegalEventIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SocialSecuritySummonsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessFailureIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CeasedTradingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LiquidationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessDiscontinuedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="MergerAcquisitionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicFilingsSummaryType", propOrder = {
    "numberofCCJLast5Years",
    "valueofCCJLast5Years",
    "numberofMortgagesandCharges",
    "letterofLiabilityIndicator",
    "numberofLetterofLiabilities",
    "letterofAgreementIndicator",
    "numberofClaimsLast3Years",
    "numberofOtherFilings",
    "currentNegativeLegalEventsIndicator",
    "specialEventsIndicator",
    "suitsandJudgementsIndicator",
    "insolvencyProcessIndicator",
    "protestedBillsIndicator",
    "legalEventIndicator",
    "socialSecuritySummonsIndicator",
    "businessFailureIndicator",
    "ceasedTradingIndicator",
    "liquidationIndicator",
    "businessDiscontinuedDate",
    "mergerAcquisitionIndicator"
})
public class PublicFilingsSummaryType {

    @XmlElement(name = "NumberofCCJLast5Years")
    protected BigInteger numberofCCJLast5Years;
    @XmlElement(name = "ValueofCCJLast5Years")
    protected PublicFilingsSummaryType.ValueofCCJLast5Years valueofCCJLast5Years;
    @XmlElement(name = "NumberofMortgagesandCharges")
    protected BigInteger numberofMortgagesandCharges;
    @XmlElement(name = "LetterofLiabilityIndicator", defaultValue = "false")
    protected Boolean letterofLiabilityIndicator;
    @XmlElement(name = "NumberofLetterofLiabilities")
    protected BigInteger numberofLetterofLiabilities;
    @XmlElement(name = "LetterofAgreementIndicator", defaultValue = "false")
    protected Boolean letterofAgreementIndicator;
    @XmlElement(name = "NumberofClaimsLast3Years")
    protected BigInteger numberofClaimsLast3Years;
    @XmlElement(name = "NumberofOtherFilings")
    protected BigInteger numberofOtherFilings;
    @XmlElement(name = "CurrentNegativeLegalEventsIndicator", defaultValue = "false")
    protected Boolean currentNegativeLegalEventsIndicator;
    @XmlElement(name = "SpecialEventsIndicator", defaultValue = "false")
    protected Boolean specialEventsIndicator;
    @XmlElement(name = "SuitsandJudgementsIndicator", defaultValue = "false")
    protected Boolean suitsandJudgementsIndicator;
    @XmlElement(name = "InsolvencyProcessIndicator", defaultValue = "false")
    protected Boolean insolvencyProcessIndicator;
    @XmlElement(name = "ProtestedBillsIndicator", defaultValue = "false")
    protected Boolean protestedBillsIndicator;
    @XmlElement(name = "LegalEventIndicator", defaultValue = "false")
    protected Boolean legalEventIndicator;
    @XmlElement(name = "SocialSecuritySummonsIndicator", defaultValue = "false")
    protected Boolean socialSecuritySummonsIndicator;
    @XmlElement(name = "BusinessFailureIndicator", defaultValue = "false")
    protected Boolean businessFailureIndicator;
    @XmlElement(name = "CeasedTradingIndicator", defaultValue = "false")
    protected Boolean ceasedTradingIndicator;
    @XmlElement(name = "LiquidationIndicator", defaultValue = "false")
    protected Boolean liquidationIndicator;
    @XmlElement(name = "BusinessDiscontinuedDate")
    protected DNBDate businessDiscontinuedDate;
    @XmlElement(name = "MergerAcquisitionIndicator", defaultValue = "false")
    protected Boolean mergerAcquisitionIndicator;

    /**
     * Gets the value of the numberofCCJLast5Years property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofCCJLast5Years() {
        return numberofCCJLast5Years;
    }

    /**
     * Sets the value of the numberofCCJLast5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofCCJLast5Years(BigInteger value) {
        this.numberofCCJLast5Years = value;
    }

    /**
     * Gets the value of the valueofCCJLast5Years property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilingsSummaryType.ValueofCCJLast5Years }
     *     
     */
    public PublicFilingsSummaryType.ValueofCCJLast5Years getValueofCCJLast5Years() {
        return valueofCCJLast5Years;
    }

    /**
     * Sets the value of the valueofCCJLast5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilingsSummaryType.ValueofCCJLast5Years }
     *     
     */
    public void setValueofCCJLast5Years(PublicFilingsSummaryType.ValueofCCJLast5Years value) {
        this.valueofCCJLast5Years = value;
    }

    /**
     * Gets the value of the numberofMortgagesandCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofMortgagesandCharges() {
        return numberofMortgagesandCharges;
    }

    /**
     * Sets the value of the numberofMortgagesandCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofMortgagesandCharges(BigInteger value) {
        this.numberofMortgagesandCharges = value;
    }

    /**
     * Gets the value of the letterofLiabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterofLiabilityIndicator() {
        return letterofLiabilityIndicator;
    }

    /**
     * Sets the value of the letterofLiabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterofLiabilityIndicator(Boolean value) {
        this.letterofLiabilityIndicator = value;
    }

    /**
     * Gets the value of the numberofLetterofLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofLetterofLiabilities() {
        return numberofLetterofLiabilities;
    }

    /**
     * Sets the value of the numberofLetterofLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofLetterofLiabilities(BigInteger value) {
        this.numberofLetterofLiabilities = value;
    }

    /**
     * Gets the value of the letterofAgreementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetterofAgreementIndicator() {
        return letterofAgreementIndicator;
    }

    /**
     * Sets the value of the letterofAgreementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetterofAgreementIndicator(Boolean value) {
        this.letterofAgreementIndicator = value;
    }

    /**
     * Gets the value of the numberofClaimsLast3Years property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofClaimsLast3Years() {
        return numberofClaimsLast3Years;
    }

    /**
     * Sets the value of the numberofClaimsLast3Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofClaimsLast3Years(BigInteger value) {
        this.numberofClaimsLast3Years = value;
    }

    /**
     * Gets the value of the numberofOtherFilings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberofOtherFilings() {
        return numberofOtherFilings;
    }

    /**
     * Sets the value of the numberofOtherFilings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberofOtherFilings(BigInteger value) {
        this.numberofOtherFilings = value;
    }

    /**
     * Gets the value of the currentNegativeLegalEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentNegativeLegalEventsIndicator() {
        return currentNegativeLegalEventsIndicator;
    }

    /**
     * Sets the value of the currentNegativeLegalEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrentNegativeLegalEventsIndicator(Boolean value) {
        this.currentNegativeLegalEventsIndicator = value;
    }

    /**
     * Gets the value of the specialEventsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialEventsIndicator() {
        return specialEventsIndicator;
    }

    /**
     * Sets the value of the specialEventsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialEventsIndicator(Boolean value) {
        this.specialEventsIndicator = value;
    }

    /**
     * Gets the value of the suitsandJudgementsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitsandJudgementsIndicator() {
        return suitsandJudgementsIndicator;
    }

    /**
     * Sets the value of the suitsandJudgementsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitsandJudgementsIndicator(Boolean value) {
        this.suitsandJudgementsIndicator = value;
    }

    /**
     * Gets the value of the insolvencyProcessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsolvencyProcessIndicator() {
        return insolvencyProcessIndicator;
    }

    /**
     * Sets the value of the insolvencyProcessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsolvencyProcessIndicator(Boolean value) {
        this.insolvencyProcessIndicator = value;
    }

    /**
     * Gets the value of the protestedBillsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProtestedBillsIndicator() {
        return protestedBillsIndicator;
    }

    /**
     * Sets the value of the protestedBillsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtestedBillsIndicator(Boolean value) {
        this.protestedBillsIndicator = value;
    }

    /**
     * Gets the value of the legalEventIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalEventIndicator() {
        return legalEventIndicator;
    }

    /**
     * Sets the value of the legalEventIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalEventIndicator(Boolean value) {
        this.legalEventIndicator = value;
    }

    /**
     * Gets the value of the socialSecuritySummonsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSocialSecuritySummonsIndicator() {
        return socialSecuritySummonsIndicator;
    }

    /**
     * Sets the value of the socialSecuritySummonsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSocialSecuritySummonsIndicator(Boolean value) {
        this.socialSecuritySummonsIndicator = value;
    }

    /**
     * Gets the value of the businessFailureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessFailureIndicator() {
        return businessFailureIndicator;
    }

    /**
     * Sets the value of the businessFailureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessFailureIndicator(Boolean value) {
        this.businessFailureIndicator = value;
    }

    /**
     * Gets the value of the ceasedTradingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCeasedTradingIndicator() {
        return ceasedTradingIndicator;
    }

    /**
     * Sets the value of the ceasedTradingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCeasedTradingIndicator(Boolean value) {
        this.ceasedTradingIndicator = value;
    }

    /**
     * Gets the value of the liquidationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiquidationIndicator() {
        return liquidationIndicator;
    }

    /**
     * Sets the value of the liquidationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiquidationIndicator(Boolean value) {
        this.liquidationIndicator = value;
    }

    /**
     * Gets the value of the businessDiscontinuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessDiscontinuedDate() {
        return businessDiscontinuedDate;
    }

    /**
     * Sets the value of the businessDiscontinuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessDiscontinuedDate(DNBDate value) {
        this.businessDiscontinuedDate = value;
    }

    /**
     * Gets the value of the mergerAcquisitionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergerAcquisitionIndicator() {
        return mergerAcquisitionIndicator;
    }

    /**
     * Sets the value of the mergerAcquisitionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergerAcquisitionIndicator(Boolean value) {
        this.mergerAcquisitionIndicator = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ValueofCCJLast5Years {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }

}
