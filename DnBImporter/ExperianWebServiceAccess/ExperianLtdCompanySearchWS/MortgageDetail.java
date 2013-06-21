
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LodgedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="PropertyAcquiredDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DeedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalDebenture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestIssueDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AmountLatestIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResolutionSeriesDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DateFullySatisfied" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="FullySatisfiedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberPartialSatisfactionDates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberPartialSatisfactionDataItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberTrustees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberLenders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberCommissionElements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberExecutors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberExecutionDates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberReceiverAppointmentDates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberReceiverCessationDates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountSecured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictingProvisions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulatingProvisions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlterationsToOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyReleasedFromCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountChargeIncreased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountSatisfied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialSatisfactionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NaturePartialSatisfaction" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}NaturePartialSatisfaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrusteeDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}TrusteeDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LenderDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LenderDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommissionDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CommissionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExecutorDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ExecutorDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExecutionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReceiverAppointment" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ReceiverAppointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReceiverCessation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ReceiverCessation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgageDetail", propOrder = {
    "chargeNumber",
    "formType",
    "publicationTown",
    "lodgedDate",
    "registrationDate",
    "creationDate",
    "propertyAcquiredDate",
    "deedDate",
    "currency",
    "totalDebenture",
    "latestIssueDate",
    "amountLatestIssue",
    "resolutionSeriesDate",
    "dateFullySatisfied",
    "fullySatisfiedIndicator",
    "numberPartialSatisfactionDates",
    "numberPartialSatisfactionDataItems",
    "numberTrustees",
    "numberLenders",
    "numberCommissionElements",
    "numberExecutors",
    "numberExecutionDates",
    "numberReceiverAppointmentDates",
    "numberReceiverCessationDates",
    "chargeType",
    "amountSecured",
    "propertyDetails",
    "chargeeText",
    "restrictingProvisions",
    "regulatingProvisions",
    "alterationsToOrder",
    "propertyReleasedFromCharge",
    "amountChargeIncreased",
    "amountSatisfied",
    "partialSatisfactionDate",
    "naturePartialSatisfaction",
    "trusteeDetails",
    "lenderDetails",
    "commissionDetails",
    "executorDetails",
    "executionDate",
    "receiverAppointment",
    "receiverCessation"
})
public class MortgageDetail {

    @XmlElement(name = "ChargeNumber")
    protected String chargeNumber;
    @XmlElement(name = "FormType")
    protected String formType;
    @XmlElement(name = "PublicationTown")
    protected String publicationTown;
    @XmlElement(name = "LodgedDate")
    protected CCYYMMDD lodgedDate;
    @XmlElement(name = "RegistrationDate")
    protected CCYYMMDD registrationDate;
    @XmlElement(name = "CreationDate")
    protected CCYYMMDD creationDate;
    @XmlElement(name = "PropertyAcquiredDate")
    protected CCYYMMDD propertyAcquiredDate;
    @XmlElement(name = "DeedDate")
    protected CCYYMMDD deedDate;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "TotalDebenture")
    protected String totalDebenture;
    @XmlElement(name = "LatestIssueDate")
    protected CCYYMMDD latestIssueDate;
    @XmlElement(name = "AmountLatestIssue")
    protected String amountLatestIssue;
    @XmlElement(name = "ResolutionSeriesDate")
    protected CCYYMMDD resolutionSeriesDate;
    @XmlElement(name = "DateFullySatisfied")
    protected CCYYMMDD dateFullySatisfied;
    @XmlElement(name = "FullySatisfiedIndicator")
    protected String fullySatisfiedIndicator;
    @XmlElement(name = "NumberPartialSatisfactionDates")
    protected Integer numberPartialSatisfactionDates;
    @XmlElement(name = "NumberPartialSatisfactionDataItems")
    protected Integer numberPartialSatisfactionDataItems;
    @XmlElement(name = "NumberTrustees")
    protected Integer numberTrustees;
    @XmlElement(name = "NumberLenders")
    protected Integer numberLenders;
    @XmlElement(name = "NumberCommissionElements")
    protected Integer numberCommissionElements;
    @XmlElement(name = "NumberExecutors")
    protected Integer numberExecutors;
    @XmlElement(name = "NumberExecutionDates")
    protected Integer numberExecutionDates;
    @XmlElement(name = "NumberReceiverAppointmentDates")
    protected Integer numberReceiverAppointmentDates;
    @XmlElement(name = "NumberReceiverCessationDates")
    protected Integer numberReceiverCessationDates;
    @XmlElement(name = "ChargeType")
    protected String chargeType;
    @XmlElement(name = "AmountSecured")
    protected String amountSecured;
    @XmlElement(name = "PropertyDetails")
    protected String propertyDetails;
    @XmlElement(name = "ChargeeText")
    protected String chargeeText;
    @XmlElement(name = "RestrictingProvisions")
    protected String restrictingProvisions;
    @XmlElement(name = "RegulatingProvisions")
    protected String regulatingProvisions;
    @XmlElement(name = "AlterationsToOrder")
    protected String alterationsToOrder;
    @XmlElement(name = "PropertyReleasedFromCharge")
    protected String propertyReleasedFromCharge;
    @XmlElement(name = "AmountChargeIncreased")
    protected String amountChargeIncreased;
    @XmlElement(name = "AmountSatisfied")
    protected String amountSatisfied;
    @XmlElement(name = "PartialSatisfactionDate")
    protected List<CCYYMMDD> partialSatisfactionDate;
    @XmlElement(name = "NaturePartialSatisfaction")
    protected List<NaturePartialSatisfaction> naturePartialSatisfaction;
    @XmlElement(name = "TrusteeDetails")
    protected List<TrusteeDetails> trusteeDetails;
    @XmlElement(name = "LenderDetails")
    protected List<LenderDetails> lenderDetails;
    @XmlElement(name = "CommissionDetails")
    protected List<CommissionDetails> commissionDetails;
    @XmlElement(name = "ExecutorDetails")
    protected List<ExecutorDetails> executorDetails;
    @XmlElement(name = "ExecutionDate")
    protected List<CCYYMMDD> executionDate;
    @XmlElement(name = "ReceiverAppointment")
    protected List<ReceiverAppointment> receiverAppointment;
    @XmlElement(name = "ReceiverCessation")
    protected List<ReceiverCessation> receiverCessation;

    /**
     * Gets the value of the chargeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeNumber() {
        return chargeNumber;
    }

    /**
     * Sets the value of the chargeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeNumber(String value) {
        this.chargeNumber = value;
    }

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the publicationTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationTown() {
        return publicationTown;
    }

    /**
     * Sets the value of the publicationTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationTown(String value) {
        this.publicationTown = value;
    }

    /**
     * Gets the value of the lodgedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLodgedDate() {
        return lodgedDate;
    }

    /**
     * Sets the value of the lodgedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLodgedDate(CCYYMMDD value) {
        this.lodgedDate = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setRegistrationDate(CCYYMMDD value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setCreationDate(CCYYMMDD value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the propertyAcquiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getPropertyAcquiredDate() {
        return propertyAcquiredDate;
    }

    /**
     * Sets the value of the propertyAcquiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setPropertyAcquiredDate(CCYYMMDD value) {
        this.propertyAcquiredDate = value;
    }

    /**
     * Gets the value of the deedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDeedDate() {
        return deedDate;
    }

    /**
     * Sets the value of the deedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDeedDate(CCYYMMDD value) {
        this.deedDate = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the totalDebenture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDebenture() {
        return totalDebenture;
    }

    /**
     * Sets the value of the totalDebenture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDebenture(String value) {
        this.totalDebenture = value;
    }

    /**
     * Gets the value of the latestIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestIssueDate() {
        return latestIssueDate;
    }

    /**
     * Sets the value of the latestIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestIssueDate(CCYYMMDD value) {
        this.latestIssueDate = value;
    }

    /**
     * Gets the value of the amountLatestIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountLatestIssue() {
        return amountLatestIssue;
    }

    /**
     * Sets the value of the amountLatestIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountLatestIssue(String value) {
        this.amountLatestIssue = value;
    }

    /**
     * Gets the value of the resolutionSeriesDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getResolutionSeriesDate() {
        return resolutionSeriesDate;
    }

    /**
     * Sets the value of the resolutionSeriesDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setResolutionSeriesDate(CCYYMMDD value) {
        this.resolutionSeriesDate = value;
    }

    /**
     * Gets the value of the dateFullySatisfied property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateFullySatisfied() {
        return dateFullySatisfied;
    }

    /**
     * Sets the value of the dateFullySatisfied property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateFullySatisfied(CCYYMMDD value) {
        this.dateFullySatisfied = value;
    }

    /**
     * Gets the value of the fullySatisfiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullySatisfiedIndicator() {
        return fullySatisfiedIndicator;
    }

    /**
     * Sets the value of the fullySatisfiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullySatisfiedIndicator(String value) {
        this.fullySatisfiedIndicator = value;
    }

    /**
     * Gets the value of the numberPartialSatisfactionDates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberPartialSatisfactionDates() {
        return numberPartialSatisfactionDates;
    }

    /**
     * Sets the value of the numberPartialSatisfactionDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberPartialSatisfactionDates(Integer value) {
        this.numberPartialSatisfactionDates = value;
    }

    /**
     * Gets the value of the numberPartialSatisfactionDataItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberPartialSatisfactionDataItems() {
        return numberPartialSatisfactionDataItems;
    }

    /**
     * Sets the value of the numberPartialSatisfactionDataItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberPartialSatisfactionDataItems(Integer value) {
        this.numberPartialSatisfactionDataItems = value;
    }

    /**
     * Gets the value of the numberTrustees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberTrustees() {
        return numberTrustees;
    }

    /**
     * Sets the value of the numberTrustees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberTrustees(Integer value) {
        this.numberTrustees = value;
    }

    /**
     * Gets the value of the numberLenders property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberLenders() {
        return numberLenders;
    }

    /**
     * Sets the value of the numberLenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberLenders(Integer value) {
        this.numberLenders = value;
    }

    /**
     * Gets the value of the numberCommissionElements property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCommissionElements() {
        return numberCommissionElements;
    }

    /**
     * Sets the value of the numberCommissionElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCommissionElements(Integer value) {
        this.numberCommissionElements = value;
    }

    /**
     * Gets the value of the numberExecutors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberExecutors() {
        return numberExecutors;
    }

    /**
     * Sets the value of the numberExecutors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberExecutors(Integer value) {
        this.numberExecutors = value;
    }

    /**
     * Gets the value of the numberExecutionDates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberExecutionDates() {
        return numberExecutionDates;
    }

    /**
     * Sets the value of the numberExecutionDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberExecutionDates(Integer value) {
        this.numberExecutionDates = value;
    }

    /**
     * Gets the value of the numberReceiverAppointmentDates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberReceiverAppointmentDates() {
        return numberReceiverAppointmentDates;
    }

    /**
     * Sets the value of the numberReceiverAppointmentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberReceiverAppointmentDates(Integer value) {
        this.numberReceiverAppointmentDates = value;
    }

    /**
     * Gets the value of the numberReceiverCessationDates property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberReceiverCessationDates() {
        return numberReceiverCessationDates;
    }

    /**
     * Sets the value of the numberReceiverCessationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberReceiverCessationDates(Integer value) {
        this.numberReceiverCessationDates = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the amountSecured property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSecured() {
        return amountSecured;
    }

    /**
     * Sets the value of the amountSecured property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSecured(String value) {
        this.amountSecured = value;
    }

    /**
     * Gets the value of the propertyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyDetails() {
        return propertyDetails;
    }

    /**
     * Sets the value of the propertyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyDetails(String value) {
        this.propertyDetails = value;
    }

    /**
     * Gets the value of the chargeeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeeText() {
        return chargeeText;
    }

    /**
     * Sets the value of the chargeeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeeText(String value) {
        this.chargeeText = value;
    }

    /**
     * Gets the value of the restrictingProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrictingProvisions() {
        return restrictingProvisions;
    }

    /**
     * Sets the value of the restrictingProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrictingProvisions(String value) {
        this.restrictingProvisions = value;
    }

    /**
     * Gets the value of the regulatingProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulatingProvisions() {
        return regulatingProvisions;
    }

    /**
     * Sets the value of the regulatingProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulatingProvisions(String value) {
        this.regulatingProvisions = value;
    }

    /**
     * Gets the value of the alterationsToOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlterationsToOrder() {
        return alterationsToOrder;
    }

    /**
     * Sets the value of the alterationsToOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlterationsToOrder(String value) {
        this.alterationsToOrder = value;
    }

    /**
     * Gets the value of the propertyReleasedFromCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyReleasedFromCharge() {
        return propertyReleasedFromCharge;
    }

    /**
     * Sets the value of the propertyReleasedFromCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyReleasedFromCharge(String value) {
        this.propertyReleasedFromCharge = value;
    }

    /**
     * Gets the value of the amountChargeIncreased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountChargeIncreased() {
        return amountChargeIncreased;
    }

    /**
     * Sets the value of the amountChargeIncreased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountChargeIncreased(String value) {
        this.amountChargeIncreased = value;
    }

    /**
     * Gets the value of the amountSatisfied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSatisfied() {
        return amountSatisfied;
    }

    /**
     * Sets the value of the amountSatisfied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSatisfied(String value) {
        this.amountSatisfied = value;
    }

    /**
     * Gets the value of the partialSatisfactionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialSatisfactionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialSatisfactionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCYYMMDD }
     * 
     * 
     */
    public List<CCYYMMDD> getPartialSatisfactionDate() {
        if (partialSatisfactionDate == null) {
            partialSatisfactionDate = new ArrayList<CCYYMMDD>();
        }
        return this.partialSatisfactionDate;
    }

    /**
     * Gets the value of the naturePartialSatisfaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the naturePartialSatisfaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNaturePartialSatisfaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturePartialSatisfaction }
     * 
     * 
     */
    public List<NaturePartialSatisfaction> getNaturePartialSatisfaction() {
        if (naturePartialSatisfaction == null) {
            naturePartialSatisfaction = new ArrayList<NaturePartialSatisfaction>();
        }
        return this.naturePartialSatisfaction;
    }

    /**
     * Gets the value of the trusteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trusteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrusteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrusteeDetails }
     * 
     * 
     */
    public List<TrusteeDetails> getTrusteeDetails() {
        if (trusteeDetails == null) {
            trusteeDetails = new ArrayList<TrusteeDetails>();
        }
        return this.trusteeDetails;
    }

    /**
     * Gets the value of the lenderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lenderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLenderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LenderDetails }
     * 
     * 
     */
    public List<LenderDetails> getLenderDetails() {
        if (lenderDetails == null) {
            lenderDetails = new ArrayList<LenderDetails>();
        }
        return this.lenderDetails;
    }

    /**
     * Gets the value of the commissionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionDetails }
     * 
     * 
     */
    public List<CommissionDetails> getCommissionDetails() {
        if (commissionDetails == null) {
            commissionDetails = new ArrayList<CommissionDetails>();
        }
        return this.commissionDetails;
    }

    /**
     * Gets the value of the executorDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executorDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutorDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExecutorDetails }
     * 
     * 
     */
    public List<ExecutorDetails> getExecutorDetails() {
        if (executorDetails == null) {
            executorDetails = new ArrayList<ExecutorDetails>();
        }
        return this.executorDetails;
    }

    /**
     * Gets the value of the executionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCYYMMDD }
     * 
     * 
     */
    public List<CCYYMMDD> getExecutionDate() {
        if (executionDate == null) {
            executionDate = new ArrayList<CCYYMMDD>();
        }
        return this.executionDate;
    }

    /**
     * Gets the value of the receiverAppointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverAppointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverAppointment }
     * 
     * 
     */
    public List<ReceiverAppointment> getReceiverAppointment() {
        if (receiverAppointment == null) {
            receiverAppointment = new ArrayList<ReceiverAppointment>();
        }
        return this.receiverAppointment;
    }

    /**
     * Gets the value of the receiverCessation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiverCessation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiverCessation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiverCessation }
     * 
     * 
     */
    public List<ReceiverCessation> getReceiverCessation() {
        if (receiverCessation == null) {
            receiverCessation = new ArrayList<ReceiverCessation>();
        }
        return this.receiverCessation;
    }

}
