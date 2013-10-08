
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CountyCourtJudgments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountyCourtJudgmentsSummary" type="{http://gateway.dnb.com/getProduct}CountyCourtJudgmentSummaryType" minOccurs="0"/>
 *                   &lt;element name="CountyCourtJudgmentsEntry" type="{http://gateway.dnb.com/getProduct}JudgementsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BankruptcyProceedings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BankruptcyProceedingsSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BankruptcyProceedingsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BankruptcyProceedingsEntry" type="{http://gateway.dnb.com/getProduct}BankruptcyProceedingsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MortgagesandCharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MortgagesandChargesSummary" type="{http://gateway.dnb.com/getProduct}MortgagesandChargesSummaryType" minOccurs="0"/>
 *                   &lt;element name="MortgagesandChargesEntry" type="{http://gateway.dnb.com/getProduct}MortgagesandChargesEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProtestedBills" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProtestedBillsSummary" type="{http://gateway.dnb.com/getProduct}ProtestedBillsSummaryType" minOccurs="0"/>
 *                   &lt;element name="ProtestedBillsEntry" type="{http://gateway.dnb.com/getProduct}ProtestedBillsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Lawsuits" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LawsuitsSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LawsuitsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="LawsuitsAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LawsuitsEntry" type="{http://gateway.dnb.com/getProduct}LawsuitsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SocialSecuritySummons" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SocialSecuritySummonsSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SummonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SocialSecuritySummonsEntry" type="{http://gateway.dnb.com/getProduct}ClaimsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Claims" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimsSummary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClaimsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimsEntry" type="{http://gateway.dnb.com/getProduct}ClaimsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MergersandAcquisitions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MergersandAcquisitionsEntry" type="{http://gateway.dnb.com/getProduct}MergersandAcquisitionsEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialLegalContracts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialLegalContractsEntry" type="{http://gateway.dnb.com/getProduct}SpecialLegalContractsEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherLegalEvents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherLegalEventsEntry" type="{http://gateway.dnb.com/getProduct}LegalEventsEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LegalFilingsSummary" type="{http://gateway.dnb.com/getProduct}LegalFilingSummary" minOccurs="0"/>
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
    "countyCourtJudgments",
    "bankruptcyProceedings",
    "mortgagesandCharges",
    "protestedBills",
    "lawsuits",
    "socialSecuritySummons",
    "claims",
    "mergersandAcquisitions",
    "specialLegalContracts",
    "otherLegalEvents",
    "legalFilingsSummary"
})
@XmlRootElement(name = "PublicFilings")
public class PublicFilings {

    @XmlElement(name = "CountyCourtJudgments")
    protected PublicFilings.CountyCourtJudgments countyCourtJudgments;
    @XmlElement(name = "BankruptcyProceedings")
    protected PublicFilings.BankruptcyProceedings bankruptcyProceedings;
    @XmlElement(name = "MortgagesandCharges")
    protected PublicFilings.MortgagesandCharges mortgagesandCharges;
    @XmlElement(name = "ProtestedBills")
    protected PublicFilings.ProtestedBills protestedBills;
    @XmlElement(name = "Lawsuits")
    protected PublicFilings.Lawsuits lawsuits;
    @XmlElement(name = "SocialSecuritySummons")
    protected PublicFilings.SocialSecuritySummons socialSecuritySummons;
    @XmlElement(name = "Claims")
    protected PublicFilings.Claims claims;
    @XmlElement(name = "MergersandAcquisitions")
    protected PublicFilings.MergersandAcquisitions mergersandAcquisitions;
    @XmlElement(name = "SpecialLegalContracts")
    protected PublicFilings.SpecialLegalContracts specialLegalContracts;
    @XmlElement(name = "OtherLegalEvents")
    protected PublicFilings.OtherLegalEvents otherLegalEvents;
    @XmlElement(name = "LegalFilingsSummary")
    protected LegalFilingSummary legalFilingsSummary;

    /**
     * Gets the value of the countyCourtJudgments property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.CountyCourtJudgments }
     *     
     */
    public PublicFilings.CountyCourtJudgments getCountyCourtJudgments() {
        return countyCourtJudgments;
    }

    /**
     * Sets the value of the countyCourtJudgments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.CountyCourtJudgments }
     *     
     */
    public void setCountyCourtJudgments(PublicFilings.CountyCourtJudgments value) {
        this.countyCourtJudgments = value;
    }

    /**
     * Gets the value of the bankruptcyProceedings property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.BankruptcyProceedings }
     *     
     */
    public PublicFilings.BankruptcyProceedings getBankruptcyProceedings() {
        return bankruptcyProceedings;
    }

    /**
     * Sets the value of the bankruptcyProceedings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.BankruptcyProceedings }
     *     
     */
    public void setBankruptcyProceedings(PublicFilings.BankruptcyProceedings value) {
        this.bankruptcyProceedings = value;
    }

    /**
     * Gets the value of the mortgagesandCharges property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.MortgagesandCharges }
     *     
     */
    public PublicFilings.MortgagesandCharges getMortgagesandCharges() {
        return mortgagesandCharges;
    }

    /**
     * Sets the value of the mortgagesandCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.MortgagesandCharges }
     *     
     */
    public void setMortgagesandCharges(PublicFilings.MortgagesandCharges value) {
        this.mortgagesandCharges = value;
    }

    /**
     * Gets the value of the protestedBills property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.ProtestedBills }
     *     
     */
    public PublicFilings.ProtestedBills getProtestedBills() {
        return protestedBills;
    }

    /**
     * Sets the value of the protestedBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.ProtestedBills }
     *     
     */
    public void setProtestedBills(PublicFilings.ProtestedBills value) {
        this.protestedBills = value;
    }

    /**
     * Gets the value of the lawsuits property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.Lawsuits }
     *     
     */
    public PublicFilings.Lawsuits getLawsuits() {
        return lawsuits;
    }

    /**
     * Sets the value of the lawsuits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.Lawsuits }
     *     
     */
    public void setLawsuits(PublicFilings.Lawsuits value) {
        this.lawsuits = value;
    }

    /**
     * Gets the value of the socialSecuritySummons property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.SocialSecuritySummons }
     *     
     */
    public PublicFilings.SocialSecuritySummons getSocialSecuritySummons() {
        return socialSecuritySummons;
    }

    /**
     * Sets the value of the socialSecuritySummons property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.SocialSecuritySummons }
     *     
     */
    public void setSocialSecuritySummons(PublicFilings.SocialSecuritySummons value) {
        this.socialSecuritySummons = value;
    }

    /**
     * Gets the value of the claims property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.Claims }
     *     
     */
    public PublicFilings.Claims getClaims() {
        return claims;
    }

    /**
     * Sets the value of the claims property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.Claims }
     *     
     */
    public void setClaims(PublicFilings.Claims value) {
        this.claims = value;
    }

    /**
     * Gets the value of the mergersandAcquisitions property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.MergersandAcquisitions }
     *     
     */
    public PublicFilings.MergersandAcquisitions getMergersandAcquisitions() {
        return mergersandAcquisitions;
    }

    /**
     * Sets the value of the mergersandAcquisitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.MergersandAcquisitions }
     *     
     */
    public void setMergersandAcquisitions(PublicFilings.MergersandAcquisitions value) {
        this.mergersandAcquisitions = value;
    }

    /**
     * Gets the value of the specialLegalContracts property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.SpecialLegalContracts }
     *     
     */
    public PublicFilings.SpecialLegalContracts getSpecialLegalContracts() {
        return specialLegalContracts;
    }

    /**
     * Sets the value of the specialLegalContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.SpecialLegalContracts }
     *     
     */
    public void setSpecialLegalContracts(PublicFilings.SpecialLegalContracts value) {
        this.specialLegalContracts = value;
    }

    /**
     * Gets the value of the otherLegalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilings.OtherLegalEvents }
     *     
     */
    public PublicFilings.OtherLegalEvents getOtherLegalEvents() {
        return otherLegalEvents;
    }

    /**
     * Sets the value of the otherLegalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilings.OtherLegalEvents }
     *     
     */
    public void setOtherLegalEvents(PublicFilings.OtherLegalEvents value) {
        this.otherLegalEvents = value;
    }

    /**
     * Gets the value of the legalFilingsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFilingSummary }
     *     
     */
    public LegalFilingSummary getLegalFilingsSummary() {
        return legalFilingsSummary;
    }

    /**
     * Sets the value of the legalFilingsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFilingSummary }
     *     
     */
    public void setLegalFilingsSummary(LegalFilingSummary value) {
        this.legalFilingsSummary = value;
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
     *         &lt;element name="BankruptcyProceedingsSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BankruptcyProceedingsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BankruptcyProceedingsEntry" type="{http://gateway.dnb.com/getProduct}BankruptcyProceedingsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "bankruptcyProceedingsSummary",
        "bankruptcyProceedingsEntry"
    })
    public static class BankruptcyProceedings {

        @XmlElement(name = "BankruptcyProceedingsSummary")
        protected PublicFilings.BankruptcyProceedings.BankruptcyProceedingsSummary bankruptcyProceedingsSummary;
        @XmlElement(name = "BankruptcyProceedingsEntry")
        protected List<BankruptcyProceedingsEntryType> bankruptcyProceedingsEntry;

        /**
         * Gets the value of the bankruptcyProceedingsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFilings.BankruptcyProceedings.BankruptcyProceedingsSummary }
         *     
         */
        public PublicFilings.BankruptcyProceedings.BankruptcyProceedingsSummary getBankruptcyProceedingsSummary() {
            return bankruptcyProceedingsSummary;
        }

        /**
         * Sets the value of the bankruptcyProceedingsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFilings.BankruptcyProceedings.BankruptcyProceedingsSummary }
         *     
         */
        public void setBankruptcyProceedingsSummary(PublicFilings.BankruptcyProceedings.BankruptcyProceedingsSummary value) {
            this.bankruptcyProceedingsSummary = value;
        }

        /**
         * Gets the value of the bankruptcyProceedingsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bankruptcyProceedingsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankruptcyProceedingsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BankruptcyProceedingsEntryType }
         * 
         * 
         */
        public List<BankruptcyProceedingsEntryType> getBankruptcyProceedingsEntry() {
            if (bankruptcyProceedingsEntry == null) {
                bankruptcyProceedingsEntry = new ArrayList<BankruptcyProceedingsEntryType>();
            }
            return this.bankruptcyProceedingsEntry;
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
         *         &lt;element name="BankruptcyProceedingsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "bankruptcyProceedingsQuantity"
        })
        public static class BankruptcyProceedingsSummary {

            @XmlElement(name = "BankruptcyProceedingsQuantity")
            protected BigInteger bankruptcyProceedingsQuantity;

            /**
             * Gets the value of the bankruptcyProceedingsQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getBankruptcyProceedingsQuantity() {
                return bankruptcyProceedingsQuantity;
            }

            /**
             * Sets the value of the bankruptcyProceedingsQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setBankruptcyProceedingsQuantity(BigInteger value) {
                this.bankruptcyProceedingsQuantity = value;
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
     *         &lt;element name="ClaimsSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClaimsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClaimsEntry" type="{http://gateway.dnb.com/getProduct}ClaimsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "claimsSummary",
        "claimsEntry"
    })
    public static class Claims {

        @XmlElement(name = "ClaimsSummary")
        protected PublicFilings.Claims.ClaimsSummary claimsSummary;
        @XmlElement(name = "ClaimsEntry")
        protected List<ClaimsEntryType> claimsEntry;

        /**
         * Gets the value of the claimsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFilings.Claims.ClaimsSummary }
         *     
         */
        public PublicFilings.Claims.ClaimsSummary getClaimsSummary() {
            return claimsSummary;
        }

        /**
         * Sets the value of the claimsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFilings.Claims.ClaimsSummary }
         *     
         */
        public void setClaimsSummary(PublicFilings.Claims.ClaimsSummary value) {
            this.claimsSummary = value;
        }

        /**
         * Gets the value of the claimsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claimsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaimsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClaimsEntryType }
         * 
         * 
         */
        public List<ClaimsEntryType> getClaimsEntry() {
            if (claimsEntry == null) {
                claimsEntry = new ArrayList<ClaimsEntryType>();
            }
            return this.claimsEntry;
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
         *         &lt;element name="ClaimsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "claimsQuantity"
        })
        public static class ClaimsSummary {

            @XmlElement(name = "ClaimsQuantity")
            protected BigInteger claimsQuantity;

            /**
             * Gets the value of the claimsQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getClaimsQuantity() {
                return claimsQuantity;
            }

            /**
             * Sets the value of the claimsQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setClaimsQuantity(BigInteger value) {
                this.claimsQuantity = value;
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
     *         &lt;element name="CountyCourtJudgmentsSummary" type="{http://gateway.dnb.com/getProduct}CountyCourtJudgmentSummaryType" minOccurs="0"/>
     *         &lt;element name="CountyCourtJudgmentsEntry" type="{http://gateway.dnb.com/getProduct}JudgementsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "countyCourtJudgmentsSummary",
        "countyCourtJudgmentsEntry"
    })
    public static class CountyCourtJudgments {

        @XmlElement(name = "CountyCourtJudgmentsSummary")
        protected CountyCourtJudgmentSummaryType countyCourtJudgmentsSummary;
        @XmlElement(name = "CountyCourtJudgmentsEntry")
        protected List<JudgementsEntryType> countyCourtJudgmentsEntry;

        /**
         * Gets the value of the countyCourtJudgmentsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link CountyCourtJudgmentSummaryType }
         *     
         */
        public CountyCourtJudgmentSummaryType getCountyCourtJudgmentsSummary() {
            return countyCourtJudgmentsSummary;
        }

        /**
         * Sets the value of the countyCourtJudgmentsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountyCourtJudgmentSummaryType }
         *     
         */
        public void setCountyCourtJudgmentsSummary(CountyCourtJudgmentSummaryType value) {
            this.countyCourtJudgmentsSummary = value;
        }

        /**
         * Gets the value of the countyCourtJudgmentsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countyCourtJudgmentsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountyCourtJudgmentsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JudgementsEntryType }
         * 
         * 
         */
        public List<JudgementsEntryType> getCountyCourtJudgmentsEntry() {
            if (countyCourtJudgmentsEntry == null) {
                countyCourtJudgmentsEntry = new ArrayList<JudgementsEntryType>();
            }
            return this.countyCourtJudgmentsEntry;
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
     *         &lt;element name="LawsuitsSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LawsuitsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="LawsuitsAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LawsuitsEntry" type="{http://gateway.dnb.com/getProduct}LawsuitsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "lawsuitsSummary",
        "lawsuitsEntry"
    })
    public static class Lawsuits {

        @XmlElement(name = "LawsuitsSummary")
        protected PublicFilings.Lawsuits.LawsuitsSummary lawsuitsSummary;
        @XmlElement(name = "LawsuitsEntry")
        protected List<LawsuitsEntryType> lawsuitsEntry;

        /**
         * Gets the value of the lawsuitsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFilings.Lawsuits.LawsuitsSummary }
         *     
         */
        public PublicFilings.Lawsuits.LawsuitsSummary getLawsuitsSummary() {
            return lawsuitsSummary;
        }

        /**
         * Sets the value of the lawsuitsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFilings.Lawsuits.LawsuitsSummary }
         *     
         */
        public void setLawsuitsSummary(PublicFilings.Lawsuits.LawsuitsSummary value) {
            this.lawsuitsSummary = value;
        }

        /**
         * Gets the value of the lawsuitsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lawsuitsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLawsuitsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LawsuitsEntryType }
         * 
         * 
         */
        public List<LawsuitsEntryType> getLawsuitsEntry() {
            if (lawsuitsEntry == null) {
                lawsuitsEntry = new ArrayList<LawsuitsEntryType>();
            }
            return this.lawsuitsEntry;
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
         *         &lt;element name="LawsuitsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="LawsuitsAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "lawsuitsQuantity",
            "lawsuitsAmount"
        })
        public static class LawsuitsSummary {

            @XmlElement(name = "LawsuitsQuantity")
            protected BigInteger lawsuitsQuantity;
            @XmlElement(name = "LawsuitsAmount")
            protected AmountType lawsuitsAmount;

            /**
             * Gets the value of the lawsuitsQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getLawsuitsQuantity() {
                return lawsuitsQuantity;
            }

            /**
             * Sets the value of the lawsuitsQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setLawsuitsQuantity(BigInteger value) {
                this.lawsuitsQuantity = value;
            }

            /**
             * Gets the value of the lawsuitsAmount property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLawsuitsAmount() {
                return lawsuitsAmount;
            }

            /**
             * Sets the value of the lawsuitsAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLawsuitsAmount(AmountType value) {
                this.lawsuitsAmount = value;
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
     *         &lt;element name="MergersandAcquisitionsEntry" type="{http://gateway.dnb.com/getProduct}MergersandAcquisitionsEntryType" maxOccurs="unbounded"/>
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
        "mergersandAcquisitionsEntry"
    })
    public static class MergersandAcquisitions {

        @XmlElement(name = "MergersandAcquisitionsEntry", required = true)
        protected List<MergersandAcquisitionsEntryType> mergersandAcquisitionsEntry;

        /**
         * Gets the value of the mergersandAcquisitionsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mergersandAcquisitionsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMergersandAcquisitionsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MergersandAcquisitionsEntryType }
         * 
         * 
         */
        public List<MergersandAcquisitionsEntryType> getMergersandAcquisitionsEntry() {
            if (mergersandAcquisitionsEntry == null) {
                mergersandAcquisitionsEntry = new ArrayList<MergersandAcquisitionsEntryType>();
            }
            return this.mergersandAcquisitionsEntry;
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
     *         &lt;element name="MortgagesandChargesSummary" type="{http://gateway.dnb.com/getProduct}MortgagesandChargesSummaryType" minOccurs="0"/>
     *         &lt;element name="MortgagesandChargesEntry" type="{http://gateway.dnb.com/getProduct}MortgagesandChargesEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "mortgagesandChargesSummary",
        "mortgagesandChargesEntry"
    })
    public static class MortgagesandCharges {

        @XmlElement(name = "MortgagesandChargesSummary")
        protected MortgagesandChargesSummaryType mortgagesandChargesSummary;
        @XmlElement(name = "MortgagesandChargesEntry")
        protected List<MortgagesandChargesEntryType> mortgagesandChargesEntry;

        /**
         * Gets the value of the mortgagesandChargesSummary property.
         * 
         * @return
         *     possible object is
         *     {@link MortgagesandChargesSummaryType }
         *     
         */
        public MortgagesandChargesSummaryType getMortgagesandChargesSummary() {
            return mortgagesandChargesSummary;
        }

        /**
         * Sets the value of the mortgagesandChargesSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link MortgagesandChargesSummaryType }
         *     
         */
        public void setMortgagesandChargesSummary(MortgagesandChargesSummaryType value) {
            this.mortgagesandChargesSummary = value;
        }

        /**
         * Gets the value of the mortgagesandChargesEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mortgagesandChargesEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMortgagesandChargesEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MortgagesandChargesEntryType }
         * 
         * 
         */
        public List<MortgagesandChargesEntryType> getMortgagesandChargesEntry() {
            if (mortgagesandChargesEntry == null) {
                mortgagesandChargesEntry = new ArrayList<MortgagesandChargesEntryType>();
            }
            return this.mortgagesandChargesEntry;
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
     *         &lt;element name="OtherLegalEventsEntry" type="{http://gateway.dnb.com/getProduct}LegalEventsEntryType" maxOccurs="unbounded"/>
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
        "otherLegalEventsEntry"
    })
    public static class OtherLegalEvents {

        @XmlElement(name = "OtherLegalEventsEntry", required = true)
        protected List<LegalEventsEntryType> otherLegalEventsEntry;

        /**
         * Gets the value of the otherLegalEventsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherLegalEventsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherLegalEventsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LegalEventsEntryType }
         * 
         * 
         */
        public List<LegalEventsEntryType> getOtherLegalEventsEntry() {
            if (otherLegalEventsEntry == null) {
                otherLegalEventsEntry = new ArrayList<LegalEventsEntryType>();
            }
            return this.otherLegalEventsEntry;
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
     *         &lt;element name="ProtestedBillsSummary" type="{http://gateway.dnb.com/getProduct}ProtestedBillsSummaryType" minOccurs="0"/>
     *         &lt;element name="ProtestedBillsEntry" type="{http://gateway.dnb.com/getProduct}ProtestedBillsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "protestedBillsSummary",
        "protestedBillsEntry"
    })
    public static class ProtestedBills {

        @XmlElement(name = "ProtestedBillsSummary")
        protected ProtestedBillsSummaryType protestedBillsSummary;
        @XmlElement(name = "ProtestedBillsEntry")
        protected List<ProtestedBillsEntryType> protestedBillsEntry;

        /**
         * Gets the value of the protestedBillsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link ProtestedBillsSummaryType }
         *     
         */
        public ProtestedBillsSummaryType getProtestedBillsSummary() {
            return protestedBillsSummary;
        }

        /**
         * Sets the value of the protestedBillsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtestedBillsSummaryType }
         *     
         */
        public void setProtestedBillsSummary(ProtestedBillsSummaryType value) {
            this.protestedBillsSummary = value;
        }

        /**
         * Gets the value of the protestedBillsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protestedBillsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtestedBillsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProtestedBillsEntryType }
         * 
         * 
         */
        public List<ProtestedBillsEntryType> getProtestedBillsEntry() {
            if (protestedBillsEntry == null) {
                protestedBillsEntry = new ArrayList<ProtestedBillsEntryType>();
            }
            return this.protestedBillsEntry;
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
     *         &lt;element name="SocialSecuritySummonsSummary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SummonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SocialSecuritySummonsEntry" type="{http://gateway.dnb.com/getProduct}ClaimsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "socialSecuritySummonsSummary",
        "socialSecuritySummonsEntry"
    })
    public static class SocialSecuritySummons {

        @XmlElement(name = "SocialSecuritySummonsSummary")
        protected PublicFilings.SocialSecuritySummons.SocialSecuritySummonsSummary socialSecuritySummonsSummary;
        @XmlElement(name = "SocialSecuritySummonsEntry")
        protected List<ClaimsEntryType> socialSecuritySummonsEntry;

        /**
         * Gets the value of the socialSecuritySummonsSummary property.
         * 
         * @return
         *     possible object is
         *     {@link PublicFilings.SocialSecuritySummons.SocialSecuritySummonsSummary }
         *     
         */
        public PublicFilings.SocialSecuritySummons.SocialSecuritySummonsSummary getSocialSecuritySummonsSummary() {
            return socialSecuritySummonsSummary;
        }

        /**
         * Sets the value of the socialSecuritySummonsSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link PublicFilings.SocialSecuritySummons.SocialSecuritySummonsSummary }
         *     
         */
        public void setSocialSecuritySummonsSummary(PublicFilings.SocialSecuritySummons.SocialSecuritySummonsSummary value) {
            this.socialSecuritySummonsSummary = value;
        }

        /**
         * Gets the value of the socialSecuritySummonsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the socialSecuritySummonsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSocialSecuritySummonsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ClaimsEntryType }
         * 
         * 
         */
        public List<ClaimsEntryType> getSocialSecuritySummonsEntry() {
            if (socialSecuritySummonsEntry == null) {
                socialSecuritySummonsEntry = new ArrayList<ClaimsEntryType>();
            }
            return this.socialSecuritySummonsEntry;
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
         *         &lt;element name="SummonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
            "summonsQuantity"
        })
        public static class SocialSecuritySummonsSummary {

            @XmlElement(name = "SummonsQuantity")
            protected BigInteger summonsQuantity;

            /**
             * Gets the value of the summonsQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSummonsQuantity() {
                return summonsQuantity;
            }

            /**
             * Sets the value of the summonsQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSummonsQuantity(BigInteger value) {
                this.summonsQuantity = value;
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
     *         &lt;element name="SpecialLegalContractsEntry" type="{http://gateway.dnb.com/getProduct}SpecialLegalContractsEntryType" maxOccurs="unbounded"/>
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
        "specialLegalContractsEntry"
    })
    public static class SpecialLegalContracts {

        @XmlElement(name = "SpecialLegalContractsEntry", required = true)
        protected List<SpecialLegalContractsEntryType> specialLegalContractsEntry;

        /**
         * Gets the value of the specialLegalContractsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialLegalContractsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialLegalContractsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialLegalContractsEntryType }
         * 
         * 
         */
        public List<SpecialLegalContractsEntryType> getSpecialLegalContractsEntry() {
            if (specialLegalContractsEntry == null) {
                specialLegalContractsEntry = new ArrayList<SpecialLegalContractsEntryType>();
            }
            return this.specialLegalContractsEntry;
        }

    }

}
