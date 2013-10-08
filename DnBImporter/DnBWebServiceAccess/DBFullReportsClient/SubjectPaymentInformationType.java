
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This complex type records the Dun and Bradstreet calculated scores and values on payment behaviour of the subject and summaries of the references or opinions given by Suppliers
 * 
 * <p>Java class for SubjectPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectPaymentInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentDNBPaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CurrentAveragePaymentTermDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CurrentDNBPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="DNBPaydexScoreHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DNBPaydexScoreHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DNBPaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="AveragePaymentTermDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="DNBPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
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
 *         &lt;element name="TotalExperiencesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalExperiencesAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageExperiencesAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentWithinTermsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment1to30DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment31to60DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment61to90DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment91PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Payment121PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MostCommonPaymentTermsEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MostCommonPaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ValueBandPaymentSummary" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValueBandMinRangeAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ValueBandMaxRangeAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ValueBandExperiencesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="ValueBandExperiencesAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PaymentWithinTermsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Payment1to30DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Payment31to60DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Payment61to90DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Payment91PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="Payment121PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountsPlacedforCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimsDetailEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClaimReceivedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="ClaimDurationDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="ClaimAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PaidAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ClaimClosedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="LegalActionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="LegalActionDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="ClaimDisputedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="ClaimForeignIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SubjectPaymentInformationType", propOrder = {
    "currentDNBPaydexScore",
    "currentAveragePaymentTermDays",
    "currentDNBPaydexScorePeriodDate",
    "dnbPaydexScoreHistory",
    "totalExperiencesQuantity",
    "totalExperiencesAmount",
    "averageExperiencesAmount",
    "paymentWithinTermsPercentage",
    "payment1To30DaysPercentage",
    "payment31To60DaysPercentage",
    "payment61To90DaysPercentage",
    "payment91PlusDaysPercentage",
    "payment121PlusDaysPercentage",
    "mostCommonPaymentTermsEntry",
    "valueBandPaymentSummary",
    "accountsPlacedforCollection"
})
public class SubjectPaymentInformationType {

    @XmlElement(name = "CurrentDNBPaydexScore")
    protected BigInteger currentDNBPaydexScore;
    @XmlElement(name = "CurrentAveragePaymentTermDays")
    protected BigInteger currentAveragePaymentTermDays;
    @XmlElement(name = "CurrentDNBPaydexScorePeriodDate")
    protected DNBDate currentDNBPaydexScorePeriodDate;
    @XmlElement(name = "DNBPaydexScoreHistory")
    protected SubjectPaymentInformationType.DNBPaydexScoreHistory dnbPaydexScoreHistory;
    @XmlElement(name = "TotalExperiencesQuantity")
    protected BigInteger totalExperiencesQuantity;
    @XmlElement(name = "TotalExperiencesAmount")
    protected AmountType totalExperiencesAmount;
    @XmlElement(name = "AverageExperiencesAmount")
    protected AmountType averageExperiencesAmount;
    @XmlElement(name = "PaymentWithinTermsPercentage")
    protected BigDecimal paymentWithinTermsPercentage;
    @XmlElement(name = "Payment1to30DaysPercentage")
    protected BigDecimal payment1To30DaysPercentage;
    @XmlElement(name = "Payment31to60DaysPercentage")
    protected BigDecimal payment31To60DaysPercentage;
    @XmlElement(name = "Payment61to90DaysPercentage")
    protected BigDecimal payment61To90DaysPercentage;
    @XmlElement(name = "Payment91PlusDaysPercentage")
    protected BigDecimal payment91PlusDaysPercentage;
    @XmlElement(name = "Payment121PlusDaysPercentage")
    protected BigDecimal payment121PlusDaysPercentage;
    @XmlElement(name = "MostCommonPaymentTermsEntry")
    protected List<SubjectPaymentInformationType.MostCommonPaymentTermsEntry> mostCommonPaymentTermsEntry;
    @XmlElement(name = "ValueBandPaymentSummary")
    protected List<SubjectPaymentInformationType.ValueBandPaymentSummary> valueBandPaymentSummary;
    @XmlElement(name = "AccountsPlacedforCollection")
    protected SubjectPaymentInformationType.AccountsPlacedforCollection accountsPlacedforCollection;

    /**
     * Gets the value of the currentDNBPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentDNBPaydexScore() {
        return currentDNBPaydexScore;
    }

    /**
     * Sets the value of the currentDNBPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentDNBPaydexScore(BigInteger value) {
        this.currentDNBPaydexScore = value;
    }

    /**
     * Gets the value of the currentAveragePaymentTermDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentAveragePaymentTermDays() {
        return currentAveragePaymentTermDays;
    }

    /**
     * Sets the value of the currentAveragePaymentTermDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentAveragePaymentTermDays(BigInteger value) {
        this.currentAveragePaymentTermDays = value;
    }

    /**
     * Gets the value of the currentDNBPaydexScorePeriodDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getCurrentDNBPaydexScorePeriodDate() {
        return currentDNBPaydexScorePeriodDate;
    }

    /**
     * Sets the value of the currentDNBPaydexScorePeriodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setCurrentDNBPaydexScorePeriodDate(DNBDate value) {
        this.currentDNBPaydexScorePeriodDate = value;
    }

    /**
     * Gets the value of the dnbPaydexScoreHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPaymentInformationType.DNBPaydexScoreHistory }
     *     
     */
    public SubjectPaymentInformationType.DNBPaydexScoreHistory getDNBPaydexScoreHistory() {
        return dnbPaydexScoreHistory;
    }

    /**
     * Sets the value of the dnbPaydexScoreHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPaymentInformationType.DNBPaydexScoreHistory }
     *     
     */
    public void setDNBPaydexScoreHistory(SubjectPaymentInformationType.DNBPaydexScoreHistory value) {
        this.dnbPaydexScoreHistory = value;
    }

    /**
     * Gets the value of the totalExperiencesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalExperiencesQuantity() {
        return totalExperiencesQuantity;
    }

    /**
     * Sets the value of the totalExperiencesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalExperiencesQuantity(BigInteger value) {
        this.totalExperiencesQuantity = value;
    }

    /**
     * Gets the value of the totalExperiencesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalExperiencesAmount() {
        return totalExperiencesAmount;
    }

    /**
     * Sets the value of the totalExperiencesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalExperiencesAmount(AmountType value) {
        this.totalExperiencesAmount = value;
    }

    /**
     * Gets the value of the averageExperiencesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAverageExperiencesAmount() {
        return averageExperiencesAmount;
    }

    /**
     * Sets the value of the averageExperiencesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAverageExperiencesAmount(AmountType value) {
        this.averageExperiencesAmount = value;
    }

    /**
     * Gets the value of the paymentWithinTermsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentWithinTermsPercentage() {
        return paymentWithinTermsPercentage;
    }

    /**
     * Sets the value of the paymentWithinTermsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentWithinTermsPercentage(BigDecimal value) {
        this.paymentWithinTermsPercentage = value;
    }

    /**
     * Gets the value of the payment1To30DaysPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment1To30DaysPercentage() {
        return payment1To30DaysPercentage;
    }

    /**
     * Sets the value of the payment1To30DaysPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment1To30DaysPercentage(BigDecimal value) {
        this.payment1To30DaysPercentage = value;
    }

    /**
     * Gets the value of the payment31To60DaysPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment31To60DaysPercentage() {
        return payment31To60DaysPercentage;
    }

    /**
     * Sets the value of the payment31To60DaysPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment31To60DaysPercentage(BigDecimal value) {
        this.payment31To60DaysPercentage = value;
    }

    /**
     * Gets the value of the payment61To90DaysPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment61To90DaysPercentage() {
        return payment61To90DaysPercentage;
    }

    /**
     * Sets the value of the payment61To90DaysPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment61To90DaysPercentage(BigDecimal value) {
        this.payment61To90DaysPercentage = value;
    }

    /**
     * Gets the value of the payment91PlusDaysPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment91PlusDaysPercentage() {
        return payment91PlusDaysPercentage;
    }

    /**
     * Sets the value of the payment91PlusDaysPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment91PlusDaysPercentage(BigDecimal value) {
        this.payment91PlusDaysPercentage = value;
    }

    /**
     * Gets the value of the payment121PlusDaysPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment121PlusDaysPercentage() {
        return payment121PlusDaysPercentage;
    }

    /**
     * Sets the value of the payment121PlusDaysPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayment121PlusDaysPercentage(BigDecimal value) {
        this.payment121PlusDaysPercentage = value;
    }

    /**
     * Gets the value of the mostCommonPaymentTermsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mostCommonPaymentTermsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMostCommonPaymentTermsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectPaymentInformationType.MostCommonPaymentTermsEntry }
     * 
     * 
     */
    public List<SubjectPaymentInformationType.MostCommonPaymentTermsEntry> getMostCommonPaymentTermsEntry() {
        if (mostCommonPaymentTermsEntry == null) {
            mostCommonPaymentTermsEntry = new ArrayList<SubjectPaymentInformationType.MostCommonPaymentTermsEntry>();
        }
        return this.mostCommonPaymentTermsEntry;
    }

    /**
     * Gets the value of the valueBandPaymentSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueBandPaymentSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueBandPaymentSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectPaymentInformationType.ValueBandPaymentSummary }
     * 
     * 
     */
    public List<SubjectPaymentInformationType.ValueBandPaymentSummary> getValueBandPaymentSummary() {
        if (valueBandPaymentSummary == null) {
            valueBandPaymentSummary = new ArrayList<SubjectPaymentInformationType.ValueBandPaymentSummary>();
        }
        return this.valueBandPaymentSummary;
    }

    /**
     * Gets the value of the accountsPlacedforCollection property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPaymentInformationType.AccountsPlacedforCollection }
     *     
     */
    public SubjectPaymentInformationType.AccountsPlacedforCollection getAccountsPlacedforCollection() {
        return accountsPlacedforCollection;
    }

    /**
     * Sets the value of the accountsPlacedforCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPaymentInformationType.AccountsPlacedforCollection }
     *     
     */
    public void setAccountsPlacedforCollection(SubjectPaymentInformationType.AccountsPlacedforCollection value) {
        this.accountsPlacedforCollection = value;
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
     *         &lt;element name="ClaimsDetailEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClaimReceivedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="ClaimDurationDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="ClaimAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PaidAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ClaimClosedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="LegalActionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="LegalActionDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="ClaimDisputedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="ClaimForeignIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "claimsDetailEntry"
    })
    public static class AccountsPlacedforCollection {

        @XmlElement(name = "ClaimsDetailEntry", required = true)
        protected List<SubjectPaymentInformationType.AccountsPlacedforCollection.ClaimsDetailEntry> claimsDetailEntry;

        /**
         * Gets the value of the claimsDetailEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claimsDetailEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaimsDetailEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectPaymentInformationType.AccountsPlacedforCollection.ClaimsDetailEntry }
         * 
         * 
         */
        public List<SubjectPaymentInformationType.AccountsPlacedforCollection.ClaimsDetailEntry> getClaimsDetailEntry() {
            if (claimsDetailEntry == null) {
                claimsDetailEntry = new ArrayList<SubjectPaymentInformationType.AccountsPlacedforCollection.ClaimsDetailEntry>();
            }
            return this.claimsDetailEntry;
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
         *         &lt;element name="ClaimReceivedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="ClaimDurationDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="ClaimAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PaidAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ClaimClosedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="LegalActionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="LegalActionDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="ClaimDisputedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="ClaimForeignIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "claimReceivedDate",
            "claimDurationDays",
            "claimAmount",
            "paidAmount",
            "claimClosedIndicator",
            "legalActionIndicator",
            "legalActionDate",
            "claimDisputedIndicator",
            "claimForeignIndicator"
        })
        public static class ClaimsDetailEntry {

            @XmlElement(name = "ClaimReceivedDate")
            protected DNBDate claimReceivedDate;
            @XmlElement(name = "ClaimDurationDays")
            protected BigInteger claimDurationDays;
            @XmlElement(name = "ClaimAmount")
            protected AmountType claimAmount;
            @XmlElement(name = "PaidAmount")
            protected AmountType paidAmount;
            @XmlElement(name = "ClaimClosedIndicator")
            protected Boolean claimClosedIndicator;
            @XmlElement(name = "LegalActionIndicator")
            protected Boolean legalActionIndicator;
            @XmlElement(name = "LegalActionDate")
            protected DNBDate legalActionDate;
            @XmlElement(name = "ClaimDisputedIndicator")
            protected Boolean claimDisputedIndicator;
            @XmlElement(name = "ClaimForeignIndicator")
            protected Boolean claimForeignIndicator;

            /**
             * Gets the value of the claimReceivedDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getClaimReceivedDate() {
                return claimReceivedDate;
            }

            /**
             * Sets the value of the claimReceivedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setClaimReceivedDate(DNBDate value) {
                this.claimReceivedDate = value;
            }

            /**
             * Gets the value of the claimDurationDays property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getClaimDurationDays() {
                return claimDurationDays;
            }

            /**
             * Sets the value of the claimDurationDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setClaimDurationDays(BigInteger value) {
                this.claimDurationDays = value;
            }

            /**
             * Gets the value of the claimAmount property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getClaimAmount() {
                return claimAmount;
            }

            /**
             * Sets the value of the claimAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setClaimAmount(AmountType value) {
                this.claimAmount = value;
            }

            /**
             * Gets the value of the paidAmount property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getPaidAmount() {
                return paidAmount;
            }

            /**
             * Sets the value of the paidAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setPaidAmount(AmountType value) {
                this.paidAmount = value;
            }

            /**
             * Gets the value of the claimClosedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isClaimClosedIndicator() {
                return claimClosedIndicator;
            }

            /**
             * Sets the value of the claimClosedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setClaimClosedIndicator(Boolean value) {
                this.claimClosedIndicator = value;
            }

            /**
             * Gets the value of the legalActionIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLegalActionIndicator() {
                return legalActionIndicator;
            }

            /**
             * Sets the value of the legalActionIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLegalActionIndicator(Boolean value) {
                this.legalActionIndicator = value;
            }

            /**
             * Gets the value of the legalActionDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getLegalActionDate() {
                return legalActionDate;
            }

            /**
             * Sets the value of the legalActionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setLegalActionDate(DNBDate value) {
                this.legalActionDate = value;
            }

            /**
             * Gets the value of the claimDisputedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isClaimDisputedIndicator() {
                return claimDisputedIndicator;
            }

            /**
             * Sets the value of the claimDisputedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setClaimDisputedIndicator(Boolean value) {
                this.claimDisputedIndicator = value;
            }

            /**
             * Gets the value of the claimForeignIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isClaimForeignIndicator() {
                return claimForeignIndicator;
            }

            /**
             * Sets the value of the claimForeignIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setClaimForeignIndicator(Boolean value) {
                this.claimForeignIndicator = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DNBPaydexScoreHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DNBPaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="AveragePaymentTermDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="DNBPaydexScorePeriodDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
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
        "dnbPaydexScoreHistoryEntry"
    })
    public static class DNBPaydexScoreHistory {

        @XmlElement(name = "DNBPaydexScoreHistoryEntry", required = true)
        protected List<SubjectPaymentInformationType.DNBPaydexScoreHistory.DNBPaydexScoreHistoryEntry> dnbPaydexScoreHistoryEntry;

        /**
         * Gets the value of the dnbPaydexScoreHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dnbPaydexScoreHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDNBPaydexScoreHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectPaymentInformationType.DNBPaydexScoreHistory.DNBPaydexScoreHistoryEntry }
         * 
         * 
         */
        public List<SubjectPaymentInformationType.DNBPaydexScoreHistory.DNBPaydexScoreHistoryEntry> getDNBPaydexScoreHistoryEntry() {
            if (dnbPaydexScoreHistoryEntry == null) {
                dnbPaydexScoreHistoryEntry = new ArrayList<SubjectPaymentInformationType.DNBPaydexScoreHistory.DNBPaydexScoreHistoryEntry>();
            }
            return this.dnbPaydexScoreHistoryEntry;
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
         *         &lt;element name="DNBPaydexScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="AveragePaymentTermDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "dnbPaydexScore",
            "averagePaymentTermDays",
            "dnbPaydexScorePeriodDate"
        })
        public static class DNBPaydexScoreHistoryEntry {

            @XmlElement(name = "DNBPaydexScore")
            protected BigInteger dnbPaydexScore;
            @XmlElement(name = "AveragePaymentTermDays")
            protected BigInteger averagePaymentTermDays;
            @XmlElement(name = "DNBPaydexScorePeriodDate")
            protected DNBDate dnbPaydexScorePeriodDate;

            /**
             * Gets the value of the dnbPaydexScore property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDNBPaydexScore() {
                return dnbPaydexScore;
            }

            /**
             * Sets the value of the dnbPaydexScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDNBPaydexScore(BigInteger value) {
                this.dnbPaydexScore = value;
            }

            /**
             * Gets the value of the averagePaymentTermDays property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAveragePaymentTermDays() {
                return averagePaymentTermDays;
            }

            /**
             * Sets the value of the averagePaymentTermDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAveragePaymentTermDays(BigInteger value) {
                this.averagePaymentTermDays = value;
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
     *         &lt;element name="MostCommonPaymentTerm" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "mostCommonPaymentTerm"
    })
    public static class MostCommonPaymentTermsEntry {

        @XmlElement(name = "MostCommonPaymentTerm", required = true)
        protected String mostCommonPaymentTerm;

        /**
         * Gets the value of the mostCommonPaymentTerm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMostCommonPaymentTerm() {
            return mostCommonPaymentTerm;
        }

        /**
         * Sets the value of the mostCommonPaymentTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMostCommonPaymentTerm(String value) {
            this.mostCommonPaymentTerm = value;
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
     *         &lt;element name="ValueBandMinRangeAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ValueBandMaxRangeAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ValueBandExperiencesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="ValueBandExperiencesAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PaymentWithinTermsPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Payment1to30DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Payment31to60DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Payment61to90DaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Payment91PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="Payment121PlusDaysPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "valueBandMinRangeAmount",
        "valueBandMaxRangeAmount",
        "valueBandExperiencesQuantity",
        "valueBandExperiencesAmount",
        "paymentWithinTermsPercentage",
        "payment1To30DaysPercentage",
        "payment31To60DaysPercentage",
        "payment61To90DaysPercentage",
        "payment91PlusDaysPercentage",
        "payment121PlusDaysPercentage"
    })
    public static class ValueBandPaymentSummary {

        @XmlElement(name = "ValueBandMinRangeAmount")
        protected AmountType valueBandMinRangeAmount;
        @XmlElement(name = "ValueBandMaxRangeAmount")
        protected AmountType valueBandMaxRangeAmount;
        @XmlElement(name = "ValueBandExperiencesQuantity")
        protected BigInteger valueBandExperiencesQuantity;
        @XmlElement(name = "ValueBandExperiencesAmount")
        protected AmountType valueBandExperiencesAmount;
        @XmlElement(name = "PaymentWithinTermsPercentage")
        protected BigDecimal paymentWithinTermsPercentage;
        @XmlElement(name = "Payment1to30DaysPercentage")
        protected BigDecimal payment1To30DaysPercentage;
        @XmlElement(name = "Payment31to60DaysPercentage")
        protected BigDecimal payment31To60DaysPercentage;
        @XmlElement(name = "Payment61to90DaysPercentage")
        protected BigDecimal payment61To90DaysPercentage;
        @XmlElement(name = "Payment91PlusDaysPercentage")
        protected BigDecimal payment91PlusDaysPercentage;
        @XmlElement(name = "Payment121PlusDaysPercentage")
        protected BigDecimal payment121PlusDaysPercentage;

        /**
         * Gets the value of the valueBandMinRangeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getValueBandMinRangeAmount() {
            return valueBandMinRangeAmount;
        }

        /**
         * Sets the value of the valueBandMinRangeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setValueBandMinRangeAmount(AmountType value) {
            this.valueBandMinRangeAmount = value;
        }

        /**
         * Gets the value of the valueBandMaxRangeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getValueBandMaxRangeAmount() {
            return valueBandMaxRangeAmount;
        }

        /**
         * Sets the value of the valueBandMaxRangeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setValueBandMaxRangeAmount(AmountType value) {
            this.valueBandMaxRangeAmount = value;
        }

        /**
         * Gets the value of the valueBandExperiencesQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValueBandExperiencesQuantity() {
            return valueBandExperiencesQuantity;
        }

        /**
         * Sets the value of the valueBandExperiencesQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValueBandExperiencesQuantity(BigInteger value) {
            this.valueBandExperiencesQuantity = value;
        }

        /**
         * Gets the value of the valueBandExperiencesAmount property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getValueBandExperiencesAmount() {
            return valueBandExperiencesAmount;
        }

        /**
         * Sets the value of the valueBandExperiencesAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setValueBandExperiencesAmount(AmountType value) {
            this.valueBandExperiencesAmount = value;
        }

        /**
         * Gets the value of the paymentWithinTermsPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPaymentWithinTermsPercentage() {
            return paymentWithinTermsPercentage;
        }

        /**
         * Sets the value of the paymentWithinTermsPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPaymentWithinTermsPercentage(BigDecimal value) {
            this.paymentWithinTermsPercentage = value;
        }

        /**
         * Gets the value of the payment1To30DaysPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayment1To30DaysPercentage() {
            return payment1To30DaysPercentage;
        }

        /**
         * Sets the value of the payment1To30DaysPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayment1To30DaysPercentage(BigDecimal value) {
            this.payment1To30DaysPercentage = value;
        }

        /**
         * Gets the value of the payment31To60DaysPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayment31To60DaysPercentage() {
            return payment31To60DaysPercentage;
        }

        /**
         * Sets the value of the payment31To60DaysPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayment31To60DaysPercentage(BigDecimal value) {
            this.payment31To60DaysPercentage = value;
        }

        /**
         * Gets the value of the payment61To90DaysPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayment61To90DaysPercentage() {
            return payment61To90DaysPercentage;
        }

        /**
         * Sets the value of the payment61To90DaysPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayment61To90DaysPercentage(BigDecimal value) {
            this.payment61To90DaysPercentage = value;
        }

        /**
         * Gets the value of the payment91PlusDaysPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayment91PlusDaysPercentage() {
            return payment91PlusDaysPercentage;
        }

        /**
         * Sets the value of the payment91PlusDaysPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayment91PlusDaysPercentage(BigDecimal value) {
            this.payment91PlusDaysPercentage = value;
        }

        /**
         * Gets the value of the payment121PlusDaysPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPayment121PlusDaysPercentage() {
            return payment121PlusDaysPercentage;
        }

        /**
         * Sets the value of the payment121PlusDaysPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPayment121PlusDaysPercentage(BigDecimal value) {
            this.payment121PlusDaysPercentage = value;
        }

    }

}
