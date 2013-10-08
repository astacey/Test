
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type holds the summary of rating information provided by Dun and Bradstreet for the subject industry such as Rating based on Failure score, Financial strength, Payment terms etc
 * 
 * <p>Java class for DNBIndustryRiskAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DNBIndustryRiskAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBIndustryAverageFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DNBIndustryAverageRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FinancialStrengthKnownBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="HigherFinancialStrengthBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EqualFinancialStrengthBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LowerFinancialStrengthBusinessQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NationalAverageFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DNBIndustryAverageFailureScoreHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DNBIndustryAverageFailureScoreHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DNBIndustryAverageFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DNBIndustryRiskAssessmentType", propOrder = {
    "dnbIndustryAverageFailureScore",
    "dnbIndustryAverageRating",
    "totalBusinessQuantity",
    "financialStrengthKnownBusinessQuantity",
    "higherFinancialStrengthBusinessQuantity",
    "equalFinancialStrengthBusinessQuantity",
    "lowerFinancialStrengthBusinessQuantity",
    "nationalAverageFailureScore",
    "dnbIndustryAverageFailureScoreHistory"
})
public class DNBIndustryRiskAssessmentType {

    @XmlElement(name = "DNBIndustryAverageFailureScore")
    protected BigInteger dnbIndustryAverageFailureScore;
    @XmlElement(name = "DNBIndustryAverageRating")
    protected String dnbIndustryAverageRating;
    @XmlElement(name = "TotalBusinessQuantity")
    protected BigInteger totalBusinessQuantity;
    @XmlElement(name = "FinancialStrengthKnownBusinessQuantity")
    protected BigInteger financialStrengthKnownBusinessQuantity;
    @XmlElement(name = "HigherFinancialStrengthBusinessQuantity")
    protected BigInteger higherFinancialStrengthBusinessQuantity;
    @XmlElement(name = "EqualFinancialStrengthBusinessQuantity")
    protected BigInteger equalFinancialStrengthBusinessQuantity;
    @XmlElement(name = "LowerFinancialStrengthBusinessQuantity")
    protected BigInteger lowerFinancialStrengthBusinessQuantity;
    @XmlElement(name = "NationalAverageFailureScore")
    protected BigInteger nationalAverageFailureScore;
    @XmlElement(name = "DNBIndustryAverageFailureScoreHistory")
    protected DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory dnbIndustryAverageFailureScoreHistory;

    /**
     * Gets the value of the dnbIndustryAverageFailureScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBIndustryAverageFailureScore() {
        return dnbIndustryAverageFailureScore;
    }

    /**
     * Sets the value of the dnbIndustryAverageFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBIndustryAverageFailureScore(BigInteger value) {
        this.dnbIndustryAverageFailureScore = value;
    }

    /**
     * Gets the value of the dnbIndustryAverageRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBIndustryAverageRating() {
        return dnbIndustryAverageRating;
    }

    /**
     * Sets the value of the dnbIndustryAverageRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBIndustryAverageRating(String value) {
        this.dnbIndustryAverageRating = value;
    }

    /**
     * Gets the value of the totalBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalBusinessQuantity() {
        return totalBusinessQuantity;
    }

    /**
     * Sets the value of the totalBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalBusinessQuantity(BigInteger value) {
        this.totalBusinessQuantity = value;
    }

    /**
     * Gets the value of the financialStrengthKnownBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinancialStrengthKnownBusinessQuantity() {
        return financialStrengthKnownBusinessQuantity;
    }

    /**
     * Sets the value of the financialStrengthKnownBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinancialStrengthKnownBusinessQuantity(BigInteger value) {
        this.financialStrengthKnownBusinessQuantity = value;
    }

    /**
     * Gets the value of the higherFinancialStrengthBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHigherFinancialStrengthBusinessQuantity() {
        return higherFinancialStrengthBusinessQuantity;
    }

    /**
     * Sets the value of the higherFinancialStrengthBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHigherFinancialStrengthBusinessQuantity(BigInteger value) {
        this.higherFinancialStrengthBusinessQuantity = value;
    }

    /**
     * Gets the value of the equalFinancialStrengthBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEqualFinancialStrengthBusinessQuantity() {
        return equalFinancialStrengthBusinessQuantity;
    }

    /**
     * Sets the value of the equalFinancialStrengthBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEqualFinancialStrengthBusinessQuantity(BigInteger value) {
        this.equalFinancialStrengthBusinessQuantity = value;
    }

    /**
     * Gets the value of the lowerFinancialStrengthBusinessQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowerFinancialStrengthBusinessQuantity() {
        return lowerFinancialStrengthBusinessQuantity;
    }

    /**
     * Sets the value of the lowerFinancialStrengthBusinessQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowerFinancialStrengthBusinessQuantity(BigInteger value) {
        this.lowerFinancialStrengthBusinessQuantity = value;
    }

    /**
     * Gets the value of the nationalAverageFailureScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNationalAverageFailureScore() {
        return nationalAverageFailureScore;
    }

    /**
     * Sets the value of the nationalAverageFailureScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNationalAverageFailureScore(BigInteger value) {
        this.nationalAverageFailureScore = value;
    }

    /**
     * Gets the value of the dnbIndustryAverageFailureScoreHistory property.
     * 
     * @return
     *     possible object is
     *     {@link DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory }
     *     
     */
    public DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory getDNBIndustryAverageFailureScoreHistory() {
        return dnbIndustryAverageFailureScoreHistory;
    }

    /**
     * Sets the value of the dnbIndustryAverageFailureScoreHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory }
     *     
     */
    public void setDNBIndustryAverageFailureScoreHistory(DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory value) {
        this.dnbIndustryAverageFailureScoreHistory = value;
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
     *         &lt;element name="DNBIndustryAverageFailureScoreHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DNBIndustryAverageFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "dnbIndustryAverageFailureScoreHistoryEntry"
    })
    public static class DNBIndustryAverageFailureScoreHistory {

        @XmlElement(name = "DNBIndustryAverageFailureScoreHistoryEntry", required = true)
        protected List<DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory.DNBIndustryAverageFailureScoreHistoryEntry> dnbIndustryAverageFailureScoreHistoryEntry;

        /**
         * Gets the value of the dnbIndustryAverageFailureScoreHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dnbIndustryAverageFailureScoreHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDNBIndustryAverageFailureScoreHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory.DNBIndustryAverageFailureScoreHistoryEntry }
         * 
         * 
         */
        public List<DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory.DNBIndustryAverageFailureScoreHistoryEntry> getDNBIndustryAverageFailureScoreHistoryEntry() {
            if (dnbIndustryAverageFailureScoreHistoryEntry == null) {
                dnbIndustryAverageFailureScoreHistoryEntry = new ArrayList<DNBIndustryRiskAssessmentType.DNBIndustryAverageFailureScoreHistory.DNBIndustryAverageFailureScoreHistoryEntry>();
            }
            return this.dnbIndustryAverageFailureScoreHistoryEntry;
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
         *         &lt;element name="DNBIndustryAverageFailureScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "dnbIndustryAverageFailureScore",
            "dnbRiskAssessmentDate"
        })
        public static class DNBIndustryAverageFailureScoreHistoryEntry {

            @XmlElement(name = "DNBIndustryAverageFailureScore")
            protected BigInteger dnbIndustryAverageFailureScore;
            @XmlElement(name = "DNBRiskAssessmentDate")
            protected DNBDate dnbRiskAssessmentDate;

            /**
             * Gets the value of the dnbIndustryAverageFailureScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDNBIndustryAverageFailureScore() {
                return dnbIndustryAverageFailureScore;
            }

            /**
             * Sets the value of the dnbIndustryAverageFailureScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDNBIndustryAverageFailureScore(BigInteger value) {
                this.dnbIndustryAverageFailureScore = value;
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

}
