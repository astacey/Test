
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type holds the summary of rating information provided by Dun and Bradstreet for the subject such as Rating based on Failure score, Financial strength, Payment terms etc
 * 
 * <p>Java class for DNBSubjectRiskAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBSubjectRiskAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBFinancialStrength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRiskIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DNBFailureScoreHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DNBFailureScoreHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DNBFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="DNBRiskAssessmentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DNBDelinquencyScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DNBMaximumCreditRecommendationAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="ScoreOverrideReason" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IncidenceofBusinessFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidenceofBusinessDelinquency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRiskAssessmentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="DNBRatingReasons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DNBRatingReasonsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DNBRatingReasonComment">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBSubjectRiskAssessmentType", propOrder = {
    "dnbRating",
    "dnbFinancialStrength",
    "dnbRiskIndicator",
    "dnbFailureScore",
    "dnbFailureScoreHistory",
    "dnbDelinquencyScore",
    "dnbMaximumCreditRecommendationAmount",
    "dnbMaximumCreditNarration",
    "scoreOverrideIndicator",
    "scoreOverrideReason",
    "incidenceofBusinessFailure",
    "incidenceofBusinessDelinquency",
    "dnbRiskAssessmentDate",
    "dnbRatingReasons"
})
public class DNBSubjectRiskAssessmentType {

    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "DNBFinancialStrength")
    protected String dnbFinancialStrength;
    @XmlElement(name = "DNBRiskIndicator")
    protected String dnbRiskIndicator;
    @XmlElement(name = "DNBFailureScore")
    protected BigInteger dnbFailureScore;
    @XmlElement(name = "DNBFailureScoreHistory")
    protected DNBSubjectRiskAssessmentType.DNBFailureScoreHistory dnbFailureScoreHistory;
    @XmlElement(name = "DNBDelinquencyScore")
    protected BigInteger dnbDelinquencyScore;
    @XmlElement(name = "DNBMaximumCreditRecommendationAmount")
    protected AmountType dnbMaximumCreditRecommendationAmount;
    @XmlElement(name = "DNBMaximumCreditNarration")
    protected DNBSubjectRiskAssessmentType.DNBMaximumCreditNarration dnbMaximumCreditNarration;
    @XmlElement(name = "ScoreOverrideIndicator", defaultValue = "false")
    protected Boolean scoreOverrideIndicator;
    @XmlElement(name = "ScoreOverrideReason")
    protected DNBSubjectRiskAssessmentType.ScoreOverrideReason scoreOverrideReason;
    @XmlElement(name = "IncidenceofBusinessFailure")
    protected String incidenceofBusinessFailure;
    @XmlElement(name = "IncidenceofBusinessDelinquency")
    protected String incidenceofBusinessDelinquency;
    @XmlElement(name = "DNBRiskAssessmentDate")
    protected DNBDate dnbRiskAssessmentDate;
    @XmlElement(name = "DNBRatingReasons")
    protected DNBSubjectRiskAssessmentType.DNBRatingReasons dnbRatingReasons;

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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBFailureScore() {
        return dnbFailureScore;
    }

    /**
     * Sets the value of the dnbFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBFailureScore(BigInteger value) {
        this.dnbFailureScore = value;
    }

    /**
     * Gets the value of the dnbFailureScoreHistory property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSubjectRiskAssessmentType.DNBFailureScoreHistory }
     *     
     */
    public DNBSubjectRiskAssessmentType.DNBFailureScoreHistory getDNBFailureScoreHistory() {
        return dnbFailureScoreHistory;
    }

    /**
     * Sets the value of the dnbFailureScoreHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSubjectRiskAssessmentType.DNBFailureScoreHistory }
     *     
     */
    public void setDNBFailureScoreHistory(DNBSubjectRiskAssessmentType.DNBFailureScoreHistory value) {
        this.dnbFailureScoreHistory = value;
    }

    /**
     * Gets the value of the dnbDelinquencyScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBDelinquencyScore() {
        return dnbDelinquencyScore;
    }

    /**
     * Sets the value of the dnbDelinquencyScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBDelinquencyScore(BigInteger value) {
        this.dnbDelinquencyScore = value;
    }

    /**
     * Gets the value of the dnbMaximumCreditRecommendationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDNBMaximumCreditRecommendationAmount() {
        return dnbMaximumCreditRecommendationAmount;
    }

    /**
     * Sets the value of the dnbMaximumCreditRecommendationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDNBMaximumCreditRecommendationAmount(AmountType value) {
        this.dnbMaximumCreditRecommendationAmount = value;
    }

    /**
     * Gets the value of the dnbMaximumCreditNarration property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSubjectRiskAssessmentType.DNBMaximumCreditNarration }
     *     
     */
    public DNBSubjectRiskAssessmentType.DNBMaximumCreditNarration getDNBMaximumCreditNarration() {
        return dnbMaximumCreditNarration;
    }

    /**
     * Sets the value of the dnbMaximumCreditNarration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSubjectRiskAssessmentType.DNBMaximumCreditNarration }
     *     
     */
    public void setDNBMaximumCreditNarration(DNBSubjectRiskAssessmentType.DNBMaximumCreditNarration value) {
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
     *     {@link DNBSubjectRiskAssessmentType.ScoreOverrideReason }
     *     
     */
    public DNBSubjectRiskAssessmentType.ScoreOverrideReason getScoreOverrideReason() {
        return scoreOverrideReason;
    }

    /**
     * Sets the value of the scoreOverrideReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSubjectRiskAssessmentType.ScoreOverrideReason }
     *     
     */
    public void setScoreOverrideReason(DNBSubjectRiskAssessmentType.ScoreOverrideReason value) {
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
     * Gets the value of the dnbRatingReasons property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSubjectRiskAssessmentType.DNBRatingReasons }
     *     
     */
    public DNBSubjectRiskAssessmentType.DNBRatingReasons getDNBRatingReasons() {
        return dnbRatingReasons;
    }

    /**
     * Sets the value of the dnbRatingReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSubjectRiskAssessmentType.DNBRatingReasons }
     *     
     */
    public void setDNBRatingReasons(DNBSubjectRiskAssessmentType.DNBRatingReasons value) {
        this.dnbRatingReasons = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DNBFailureScoreHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DNBFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="DNBRiskAssessmentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dnbFailureScoreHistoryEntry"
    })
    public static class DNBFailureScoreHistory {

        @XmlElement(name = "DNBFailureScoreHistoryEntry", required = true)
        protected List<DNBSubjectRiskAssessmentType.DNBFailureScoreHistory.DNBFailureScoreHistoryEntry> dnbFailureScoreHistoryEntry;

        /**
         * Gets the value of the dnbFailureScoreHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dnbFailureScoreHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDNBFailureScoreHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DNBSubjectRiskAssessmentType.DNBFailureScoreHistory.DNBFailureScoreHistoryEntry }
         * 
         * 
         */
        public List<DNBSubjectRiskAssessmentType.DNBFailureScoreHistory.DNBFailureScoreHistoryEntry> getDNBFailureScoreHistoryEntry() {
            if (dnbFailureScoreHistoryEntry == null) {
                dnbFailureScoreHistoryEntry = new ArrayList<DNBSubjectRiskAssessmentType.DNBFailureScoreHistory.DNBFailureScoreHistoryEntry>();
            }
            return this.dnbFailureScoreHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DNBFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="DNBRiskAssessmentDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dnbFailureScore",
            "dnbRiskAssessmentDate"
        })
        public static class DNBFailureScoreHistoryEntry {

            @XmlElement(name = "DNBFailureScore")
            protected BigInteger dnbFailureScore;
            @XmlElement(name = "DNBRiskAssessmentDate")
            protected DNBDate dnbRiskAssessmentDate;

            /**
             * Gets the value of the dnbFailureScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDNBFailureScore() {
                return dnbFailureScore;
            }

            /**
             * Sets the value of the dnbFailureScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDNBFailureScore(BigInteger value) {
                this.dnbFailureScore = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DNBRatingReasonsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DNBRatingReasonComment">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dnbRatingReasonsEntry"
    })
    public static class DNBRatingReasons {

        @XmlElement(name = "DNBRatingReasonsEntry", required = true)
        protected List<DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry> dnbRatingReasonsEntry;

        /**
         * Gets the value of the dnbRatingReasonsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dnbRatingReasonsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDNBRatingReasonsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry }
         * 
         * 
         */
        public List<DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry> getDNBRatingReasonsEntry() {
            if (dnbRatingReasonsEntry == null) {
                dnbRatingReasonsEntry = new ArrayList<DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry>();
            }
            return this.dnbRatingReasonsEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DNBRatingReasonComment">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dnbRatingReasonComment"
        })
        public static class DNBRatingReasonsEntry {

            @XmlElement(name = "DNBRatingReasonComment", required = true)
            protected DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry.DNBRatingReasonComment dnbRatingReasonComment;

            /**
             * Gets the value of the dnbRatingReasonComment property.
             * 
             * @return
             *     possible object is
             *     {@link DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry.DNBRatingReasonComment }
             *     
             */
            public DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry.DNBRatingReasonComment getDNBRatingReasonComment() {
                return dnbRatingReasonComment;
            }

            /**
             * Sets the value of the dnbRatingReasonComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry.DNBRatingReasonComment }
             *     
             */
            public void setDNBRatingReasonComment(DNBSubjectRiskAssessmentType.DNBRatingReasons.DNBRatingReasonsEntry.DNBRatingReasonComment value) {
                this.dnbRatingReasonComment = value;
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
            public static class DNBRatingReasonComment {

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
    public static class ScoreOverrideReason {

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

}
