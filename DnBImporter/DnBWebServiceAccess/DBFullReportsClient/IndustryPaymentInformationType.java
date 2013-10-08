
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex type records the payment behaviour values and scores of the industry in which the subject operates. This information is mostly used to compare the subject payment behaviour against the payment behaviour of the entire industry.
 * 
 * <p>Java class for IndustryPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryPaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="IndustryBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="UpperQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MedianQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LowerQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="UpperQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MedianQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LowerQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NationalAveragePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="IndustryPaymentInformationHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentInformationHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IndustryPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="UpperQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MedianQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="LowerQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="UpperQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MedianQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="LowerQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "IndustryPaymentInformationType", propOrder = {
    "industryPaydexScorePeriodDate",
    "industryBusinessQuantity",
    "upperQuartilePaymentTerms",
    "medianQuartilePaymentTerms",
    "lowerQuartilePaymentTerms",
    "upperQuartilePaydexScore",
    "medianQuartilePaydexScore",
    "lowerQuartilePaydexScore",
    "nationalAveragePaymentTerms",
    "industryPaymentInformationHistory"
})
public class IndustryPaymentInformationType {

    @XmlElement(name = "IndustryPaydexScorePeriodDate")
    protected DNBDate industryPaydexScorePeriodDate;
    @XmlElement(name = "IndustryBusinessQuantity")
    protected BigInteger industryBusinessQuantity;
    @XmlElement(name = "UpperQuartilePaymentTerms")
    protected BigInteger upperQuartilePaymentTerms;
    @XmlElement(name = "MedianQuartilePaymentTerms")
    protected BigInteger medianQuartilePaymentTerms;
    @XmlElement(name = "LowerQuartilePaymentTerms")
    protected BigInteger lowerQuartilePaymentTerms;
    @XmlElement(name = "UpperQuartilePaydexScore")
    protected BigInteger upperQuartilePaydexScore;
    @XmlElement(name = "MedianQuartilePaydexScore")
    protected BigInteger medianQuartilePaydexScore;
    @XmlElement(name = "LowerQuartilePaydexScore")
    protected BigInteger lowerQuartilePaydexScore;
    @XmlElement(name = "NationalAveragePaymentTerms")
    protected BigInteger nationalAveragePaymentTerms;
    @XmlElement(name = "IndustryPaymentInformationHistory")
    protected IndustryPaymentInformationType.IndustryPaymentInformationHistory industryPaymentInformationHistory;

    /**
     * Gets the value of the industryPaydexScorePeriodDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getIndustryPaydexScorePeriodDate() {
        return industryPaydexScorePeriodDate;
    }

    /**
     * Sets the value of the industryPaydexScorePeriodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setIndustryPaydexScorePeriodDate(DNBDate value) {
        this.industryPaydexScorePeriodDate = value;
    }

    /**
     * Gets the value of the industryBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndustryBusinessQuantity() {
        return industryBusinessQuantity;
    }

    /**
     * Sets the value of the industryBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndustryBusinessQuantity(BigInteger value) {
        this.industryBusinessQuantity = value;
    }

    /**
     * Gets the value of the upperQuartilePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpperQuartilePaymentTerms() {
        return upperQuartilePaymentTerms;
    }

    /**
     * Sets the value of the upperQuartilePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpperQuartilePaymentTerms(BigInteger value) {
        this.upperQuartilePaymentTerms = value;
    }

    /**
     * Gets the value of the medianQuartilePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedianQuartilePaymentTerms() {
        return medianQuartilePaymentTerms;
    }

    /**
     * Sets the value of the medianQuartilePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedianQuartilePaymentTerms(BigInteger value) {
        this.medianQuartilePaymentTerms = value;
    }

    /**
     * Gets the value of the lowerQuartilePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowerQuartilePaymentTerms() {
        return lowerQuartilePaymentTerms;
    }

    /**
     * Sets the value of the lowerQuartilePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowerQuartilePaymentTerms(BigInteger value) {
        this.lowerQuartilePaymentTerms = value;
    }

    /**
     * Gets the value of the upperQuartilePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpperQuartilePaydexScore() {
        return upperQuartilePaydexScore;
    }

    /**
     * Sets the value of the upperQuartilePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpperQuartilePaydexScore(BigInteger value) {
        this.upperQuartilePaydexScore = value;
    }

    /**
     * Gets the value of the medianQuartilePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMedianQuartilePaydexScore() {
        return medianQuartilePaydexScore;
    }

    /**
     * Sets the value of the medianQuartilePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMedianQuartilePaydexScore(BigInteger value) {
        this.medianQuartilePaydexScore = value;
    }

    /**
     * Gets the value of the lowerQuartilePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowerQuartilePaydexScore() {
        return lowerQuartilePaydexScore;
    }

    /**
     * Sets the value of the lowerQuartilePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowerQuartilePaydexScore(BigInteger value) {
        this.lowerQuartilePaydexScore = value;
    }

    /**
     * Gets the value of the nationalAveragePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNationalAveragePaymentTerms() {
        return nationalAveragePaymentTerms;
    }

    /**
     * Sets the value of the nationalAveragePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNationalAveragePaymentTerms(BigInteger value) {
        this.nationalAveragePaymentTerms = value;
    }

    /**
     * Gets the value of the industryPaymentInformationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryPaymentInformationType.IndustryPaymentInformationHistory }
     *     
     */
    public IndustryPaymentInformationType.IndustryPaymentInformationHistory getIndustryPaymentInformationHistory() {
        return industryPaymentInformationHistory;
    }

    /**
     * Sets the value of the industryPaymentInformationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryPaymentInformationType.IndustryPaymentInformationHistory }
     *     
     */
    public void setIndustryPaymentInformationHistory(IndustryPaymentInformationType.IndustryPaymentInformationHistory value) {
        this.industryPaymentInformationHistory = value;
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
     *         &lt;element name="PaymentInformationHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IndustryPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="UpperQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MedianQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="LowerQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="UpperQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MedianQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="LowerQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "paymentInformationHistoryEntry"
    })
    public static class IndustryPaymentInformationHistory {

        @XmlElement(name = "PaymentInformationHistoryEntry", required = true)
        protected List<IndustryPaymentInformationType.IndustryPaymentInformationHistory.PaymentInformationHistoryEntry> paymentInformationHistoryEntry;

        /**
         * Gets the value of the paymentInformationHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentInformationHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentInformationHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndustryPaymentInformationType.IndustryPaymentInformationHistory.PaymentInformationHistoryEntry }
         * 
         * 
         */
        public List<IndustryPaymentInformationType.IndustryPaymentInformationHistory.PaymentInformationHistoryEntry> getPaymentInformationHistoryEntry() {
            if (paymentInformationHistoryEntry == null) {
                paymentInformationHistoryEntry = new ArrayList<IndustryPaymentInformationType.IndustryPaymentInformationHistory.PaymentInformationHistoryEntry>();
            }
            return this.paymentInformationHistoryEntry;
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
         *         &lt;element name="IndustryPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="UpperQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MedianQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="LowerQuartilePaymentTerms" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="UpperQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MedianQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="LowerQuartilePaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "industryPaydexScorePeriodDate",
            "upperQuartilePaymentTerms",
            "medianQuartilePaymentTerms",
            "lowerQuartilePaymentTerms",
            "upperQuartilePaydexScore",
            "medianQuartilePaydexScore",
            "lowerQuartilePaydexScore"
        })
        public static class PaymentInformationHistoryEntry {

            @XmlElement(name = "IndustryPaydexScorePeriodDate")
            protected DNBDate industryPaydexScorePeriodDate;
            @XmlElement(name = "UpperQuartilePaymentTerms")
            protected BigInteger upperQuartilePaymentTerms;
            @XmlElement(name = "MedianQuartilePaymentTerms")
            protected BigInteger medianQuartilePaymentTerms;
            @XmlElement(name = "LowerQuartilePaymentTerms")
            protected BigInteger lowerQuartilePaymentTerms;
            @XmlElement(name = "UpperQuartilePaydexScore")
            protected BigInteger upperQuartilePaydexScore;
            @XmlElement(name = "MedianQuartilePaydexScore")
            protected BigInteger medianQuartilePaydexScore;
            @XmlElement(name = "LowerQuartilePaydexScore")
            protected BigInteger lowerQuartilePaydexScore;

            /**
             * Gets the value of the industryPaydexScorePeriodDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getIndustryPaydexScorePeriodDate() {
                return industryPaydexScorePeriodDate;
            }

            /**
             * Sets the value of the industryPaydexScorePeriodDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setIndustryPaydexScorePeriodDate(DNBDate value) {
                this.industryPaydexScorePeriodDate = value;
            }

            /**
             * Gets the value of the upperQuartilePaymentTerms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUpperQuartilePaymentTerms() {
                return upperQuartilePaymentTerms;
            }

            /**
             * Sets the value of the upperQuartilePaymentTerms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUpperQuartilePaymentTerms(BigInteger value) {
                this.upperQuartilePaymentTerms = value;
            }

            /**
             * Gets the value of the medianQuartilePaymentTerms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMedianQuartilePaymentTerms() {
                return medianQuartilePaymentTerms;
            }

            /**
             * Sets the value of the medianQuartilePaymentTerms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMedianQuartilePaymentTerms(BigInteger value) {
                this.medianQuartilePaymentTerms = value;
            }

            /**
             * Gets the value of the lowerQuartilePaymentTerms property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLowerQuartilePaymentTerms() {
                return lowerQuartilePaymentTerms;
            }

            /**
             * Sets the value of the lowerQuartilePaymentTerms property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLowerQuartilePaymentTerms(BigInteger value) {
                this.lowerQuartilePaymentTerms = value;
            }

            /**
             * Gets the value of the upperQuartilePaydexScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUpperQuartilePaydexScore() {
                return upperQuartilePaydexScore;
            }

            /**
             * Sets the value of the upperQuartilePaydexScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUpperQuartilePaydexScore(BigInteger value) {
                this.upperQuartilePaydexScore = value;
            }

            /**
             * Gets the value of the medianQuartilePaydexScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMedianQuartilePaydexScore() {
                return medianQuartilePaydexScore;
            }

            /**
             * Sets the value of the medianQuartilePaydexScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMedianQuartilePaydexScore(BigInteger value) {
                this.medianQuartilePaydexScore = value;
            }

            /**
             * Gets the value of the lowerQuartilePaydexScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLowerQuartilePaydexScore() {
                return lowerQuartilePaydexScore;
            }

            /**
             * Sets the value of the lowerQuartilePaydexScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLowerQuartilePaydexScore(BigInteger value) {
                this.lowerQuartilePaydexScore = value;
            }

        }

    }

}
