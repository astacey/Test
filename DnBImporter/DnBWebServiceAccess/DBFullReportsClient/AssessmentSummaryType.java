
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type holds the summary of rating information provided by Dun and Bradstreet for the subject such as Rating based on Failure score, Financial strength, Payment terms etc
 * 
 * <p>Java class for AssessmentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBFinancialStrength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRiskIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBFailureScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBDelinquencyScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBMaximumCreditRecommendationAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DNBMaximumCreditNarration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ScoreOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ScoreOverrideReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidenceofBusinessFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidenceofBusinessDelinquency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRiskAssessmentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="DNBPaydexScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTermDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DNBPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentSummaryType", propOrder = {
    "dnbRating",
    "dnbFinancialStrength",
    "dnbRiskIndicator",
    "dnbFailureScore",
    "dnbDelinquencyScore",
    "dnbMaximumCreditRecommendationAmount",
    "dnbMaximumCreditNarration",
    "scoreOverrideIndicator",
    "scoreOverrideReason",
    "incidenceofBusinessFailure",
    "incidenceofBusinessDelinquency",
    "dnbRiskAssessmentDate",
    "dnbPaydexScore",
    "paymentTermDays",
    "dnbPaydexScorePeriodDate"
})
public class AssessmentSummaryType {

    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "DNBFinancialStrength")
    protected String dnbFinancialStrength;
    @XmlElement(name = "DNBRiskIndicator")
    protected String dnbRiskIndicator;
    @XmlElement(name = "DNBFailureScore")
    protected String dnbFailureScore;
    @XmlElement(name = "DNBDelinquencyScore")
    protected String dnbDelinquencyScore;
    @XmlElement(name = "DNBMaximumCreditRecommendationAmount")
    protected AssessmentSummaryType.DNBMaximumCreditRecommendationAmount dnbMaximumCreditRecommendationAmount;
    @XmlElement(name = "DNBMaximumCreditNarration")
    protected AssessmentSummaryType.DNBMaximumCreditNarration dnbMaximumCreditNarration;
    @XmlElement(name = "ScoreOverrideIndicator", defaultValue = "false")
    protected Boolean scoreOverrideIndicator;
    @XmlElement(name = "ScoreOverrideReason")
    protected String scoreOverrideReason;
    @XmlElement(name = "IncidenceofBusinessFailure")
    protected String incidenceofBusinessFailure;
    @XmlElement(name = "IncidenceofBusinessDelinquency")
    protected String incidenceofBusinessDelinquency;
    @XmlElement(name = "DNBRiskAssessmentDate")
    protected DNBDate dnbRiskAssessmentDate;
    @XmlElement(name = "DNBPaydexScore")
    protected String dnbPaydexScore;
    @XmlElement(name = "PaymentTermDays")
    protected BigInteger paymentTermDays;
    @XmlElement(name = "DNBPaydexScorePeriodDate")
    protected DNBDate dnbPaydexScorePeriodDate;

    /**
     * Gets the value of the dnbRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBRating() {
        return dnbRating;
    }

    /**
     * Sets the value of the dnbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBRating(String value) {
        this.dnbRating = value;
    }

    /**
     * Gets the value of the dnbFinancialStrength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBFinancialStrength() {
        return dnbFinancialStrength;
    }

    /**
     * Sets the value of the dnbFinancialStrength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBFinancialStrength(String value) {
        this.dnbFinancialStrength = value;
    }

    /**
     * Gets the value of the dnbRiskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBRiskIndicator() {
        return dnbRiskIndicator;
    }

    /**
     * Sets the value of the dnbRiskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBRiskIndicator(String value) {
        this.dnbRiskIndicator = value;
    }

    /**
     * Gets the value of the dnbFailureScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBFailureScore() {
        return dnbFailureScore;
    }

    /**
     * Sets the value of the dnbFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBFailureScore(String value) {
        this.dnbFailureScore = value;
    }

    /**
     * Gets the value of the dnbDelinquencyScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBDelinquencyScore() {
        return dnbDelinquencyScore;
    }

    /**
     * Sets the value of the dnbDelinquencyScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBDelinquencyScore(String value) {
        this.dnbDelinquencyScore = value;
    }

    /**
     * Gets the value of the dnbMaximumCreditRecommendationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType.DNBMaximumCreditRecommendationAmount }
     *     
     */
    public AssessmentSummaryType.DNBMaximumCreditRecommendationAmount getDNBMaximumCreditRecommendationAmount() {
        return dnbMaximumCreditRecommendationAmount;
    }

    /**
     * Sets the value of the dnbMaximumCreditRecommendationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType.DNBMaximumCreditRecommendationAmount }
     *     
     */
    public void setDNBMaximumCreditRecommendationAmount(AssessmentSummaryType.DNBMaximumCreditRecommendationAmount value) {
        this.dnbMaximumCreditRecommendationAmount = value;
    }

    /**
     * Gets the value of the dnbMaximumCreditNarration property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType.DNBMaximumCreditNarration }
     *     
     */
    public AssessmentSummaryType.DNBMaximumCreditNarration getDNBMaximumCreditNarration() {
        return dnbMaximumCreditNarration;
    }

    /**
     * Sets the value of the dnbMaximumCreditNarration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType.DNBMaximumCreditNarration }
     *     
     */
    public void setDNBMaximumCreditNarration(AssessmentSummaryType.DNBMaximumCreditNarration value) {
        this.dnbMaximumCreditNarration = value;
    }

    /**
     * Gets the value of the scoreOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScoreOverrideIndicator() {
        return scoreOverrideIndicator;
    }

    /**
     * Sets the value of the scoreOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScoreOverrideIndicator(Boolean value) {
        this.scoreOverrideIndicator = value;
    }

    /**
     * Gets the value of the scoreOverrideReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreOverrideReason() {
        return scoreOverrideReason;
    }

    /**
     * Sets the value of the scoreOverrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreOverrideReason(String value) {
        this.scoreOverrideReason = value;
    }

    /**
     * Gets the value of the incidenceofBusinessFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidenceofBusinessFailure() {
        return incidenceofBusinessFailure;
    }

    /**
     * Sets the value of the incidenceofBusinessFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidenceofBusinessFailure(String value) {
        this.incidenceofBusinessFailure = value;
    }

    /**
     * Gets the value of the incidenceofBusinessDelinquency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidenceofBusinessDelinquency() {
        return incidenceofBusinessDelinquency;
    }

    /**
     * Sets the value of the incidenceofBusinessDelinquency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidenceofBusinessDelinquency(String value) {
        this.incidenceofBusinessDelinquency = value;
    }

    /**
     * Gets the value of the dnbRiskAssessmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getDNBRiskAssessmentDate() {
        return dnbRiskAssessmentDate;
    }

    /**
     * Sets the value of the dnbRiskAssessmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setDNBRiskAssessmentDate(DNBDate value) {
        this.dnbRiskAssessmentDate = value;
    }

    /**
     * Gets the value of the dnbPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBPaydexScore() {
        return dnbPaydexScore;
    }

    /**
     * Sets the value of the dnbPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBPaydexScore(String value) {
        this.dnbPaydexScore = value;
    }

    /**
     * Gets the value of the paymentTermDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentTermDays() {
        return paymentTermDays;
    }

    /**
     * Sets the value of the paymentTermDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentTermDays(BigInteger value) {
        this.paymentTermDays = value;
    }

    /**
     * Gets the value of the dnbPaydexScorePeriodDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getDNBPaydexScorePeriodDate() {
        return dnbPaydexScorePeriodDate;
    }

    /**
     * Sets the value of the dnbPaydexScorePeriodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setDNBPaydexScorePeriodDate(DNBDate value) {
        this.dnbPaydexScorePeriodDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
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
    public static class DNBMaximumCreditNarration {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected BigInteger referenceCode;
        @XmlAttribute
        protected String referenceCodeTable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the referenceCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReferenceCode() {
            return referenceCode;
        }

        /**
         * Sets the value of the referenceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReferenceCode(BigInteger value) {
            this.referenceCode = value;
        }

        /**
         * Gets the value of the referenceCodeTable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceCodeTable() {
            return referenceCodeTable;
        }

        /**
         * Sets the value of the referenceCodeTable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceCodeTable(String value) {
            this.referenceCodeTable = value;
        }

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
    public static class DNBMaximumCreditRecommendationAmount {

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
