
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncorporationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DissolutionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="RegisteredOffice" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AsRegisteredOffice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingTelephoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="PrincipalActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICInformation1980" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo80" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SICInformation1992" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo92" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PreviousNames" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PreviousNames" minOccurs="0"/>
 *         &lt;element name="PreviousAddresses" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PreviousAddresses" minOccurs="0"/>
 *         &lt;element name="ThomsonData" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ThomsonData" minOccurs="0"/>
 *         &lt;element name="FilingDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}FilingDetails" minOccurs="0"/>
 *         &lt;element name="Auditor" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Auditor" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Bank" minOccurs="0"/>
 *         &lt;element name="CROChanges" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CROChanges" minOccurs="0"/>
 *         &lt;element name="PrevSearches" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PrevSearches" minOccurs="0"/>
 *         &lt;element name="CCLs" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CCLs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", propOrder = {
    "legalStatus",
    "incorporationDate",
    "dissolutionDate",
    "registeredOffice",
    "currency",
    "issuedCapital",
    "asRegisteredOffice",
    "tradingTelephoneNum",
    "tradingLocation",
    "principalActivities",
    "sicInformation1980",
    "sicInformation1992",
    "previousNames",
    "previousAddresses",
    "thomsonData",
    "filingDetails",
    "auditor",
    "bank",
    "croChanges",
    "prevSearches",
    "ccLs"
})
public class Identification {

    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "IncorporationDate")
    protected CCYYMMDD incorporationDate;
    @XmlElement(name = "DissolutionDate")
    protected CCYYMMDD dissolutionDate;
    @XmlElement(name = "RegisteredOffice")
    protected LtdBusinessLocation registeredOffice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "IssuedCapital")
    protected Long issuedCapital;
    @XmlElement(name = "AsRegisteredOffice")
    protected String asRegisteredOffice;
    @XmlElement(name = "TradingTelephoneNum")
    protected String tradingTelephoneNum;
    @XmlElement(name = "TradingLocation")
    protected LtdBusinessLocation tradingLocation;
    @XmlElement(name = "PrincipalActivities")
    protected String principalActivities;
    @XmlElement(name = "SICInformation1980")
    protected List<SICInfo80> sicInformation1980;
    @XmlElement(name = "SICInformation1992")
    protected List<SICInfo92> sicInformation1992;
    @XmlElement(name = "PreviousNames")
    protected PreviousNames previousNames;
    @XmlElement(name = "PreviousAddresses")
    protected PreviousAddresses previousAddresses;
    @XmlElement(name = "ThomsonData")
    protected ThomsonData thomsonData;
    @XmlElement(name = "FilingDetails")
    protected FilingDetails filingDetails;
    @XmlElement(name = "Auditor")
    protected Auditor auditor;
    @XmlElement(name = "Bank")
    protected Bank bank;
    @XmlElement(name = "CROChanges")
    protected CROChanges croChanges;
    @XmlElement(name = "PrevSearches")
    protected PrevSearches prevSearches;
    @XmlElement(name = "CCLs")
    protected CCLs ccLs;

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the incorporationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getIncorporationDate() {
        return incorporationDate;
    }

    /**
     * Sets the value of the incorporationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setIncorporationDate(CCYYMMDD value) {
        this.incorporationDate = value;
    }

    /**
     * Gets the value of the dissolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDissolutionDate() {
        return dissolutionDate;
    }

    /**
     * Sets the value of the dissolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDissolutionDate(CCYYMMDD value) {
        this.dissolutionDate = value;
    }

    /**
     * Gets the value of the registeredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getRegisteredOffice() {
        return registeredOffice;
    }

    /**
     * Sets the value of the registeredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setRegisteredOffice(LtdBusinessLocation value) {
        this.registeredOffice = value;
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
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuedCapital(Long value) {
        this.issuedCapital = value;
    }

    /**
     * Gets the value of the asRegisteredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsRegisteredOffice() {
        return asRegisteredOffice;
    }

    /**
     * Sets the value of the asRegisteredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsRegisteredOffice(String value) {
        this.asRegisteredOffice = value;
    }

    /**
     * Gets the value of the tradingTelephoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingTelephoneNum() {
        return tradingTelephoneNum;
    }

    /**
     * Sets the value of the tradingTelephoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingTelephoneNum(String value) {
        this.tradingTelephoneNum = value;
    }

    /**
     * Gets the value of the tradingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getTradingLocation() {
        return tradingLocation;
    }

    /**
     * Sets the value of the tradingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setTradingLocation(LtdBusinessLocation value) {
        this.tradingLocation = value;
    }

    /**
     * Gets the value of the principalActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalActivities() {
        return principalActivities;
    }

    /**
     * Sets the value of the principalActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalActivities(String value) {
        this.principalActivities = value;
    }

    /**
     * Gets the value of the sicInformation1980 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicInformation1980 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICInformation1980().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICInfo80 }
     * 
     * 
     */
    public List<SICInfo80> getSICInformation1980() {
        if (sicInformation1980 == null) {
            sicInformation1980 = new ArrayList<SICInfo80>();
        }
        return this.sicInformation1980;
    }

    /**
     * Gets the value of the sicInformation1992 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicInformation1992 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICInformation1992().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICInfo92 }
     * 
     * 
     */
    public List<SICInfo92> getSICInformation1992() {
        if (sicInformation1992 == null) {
            sicInformation1992 = new ArrayList<SICInfo92>();
        }
        return this.sicInformation1992;
    }

    /**
     * Gets the value of the previousNames property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousNames }
     *     
     */
    public PreviousNames getPreviousNames() {
        return previousNames;
    }

    /**
     * Sets the value of the previousNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousNames }
     *     
     */
    public void setPreviousNames(PreviousNames value) {
        this.previousNames = value;
    }

    /**
     * Gets the value of the previousAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousAddresses }
     *     
     */
    public PreviousAddresses getPreviousAddresses() {
        return previousAddresses;
    }

    /**
     * Sets the value of the previousAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousAddresses }
     *     
     */
    public void setPreviousAddresses(PreviousAddresses value) {
        this.previousAddresses = value;
    }

    /**
     * Gets the value of the thomsonData property.
     * 
     * @return
     *     possible object is
     *     {@link ThomsonData }
     *     
     */
    public ThomsonData getThomsonData() {
        return thomsonData;
    }

    /**
     * Sets the value of the thomsonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThomsonData }
     *     
     */
    public void setThomsonData(ThomsonData value) {
        this.thomsonData = value;
    }

    /**
     * Gets the value of the filingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FilingDetails }
     *     
     */
    public FilingDetails getFilingDetails() {
        return filingDetails;
    }

    /**
     * Sets the value of the filingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingDetails }
     *     
     */
    public void setFilingDetails(FilingDetails value) {
        this.filingDetails = value;
    }

    /**
     * Gets the value of the auditor property.
     * 
     * @return
     *     possible object is
     *     {@link Auditor }
     *     
     */
    public Auditor getAuditor() {
        return auditor;
    }

    /**
     * Sets the value of the auditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auditor }
     *     
     */
    public void setAuditor(Auditor value) {
        this.auditor = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link Bank }
     *     
     */
    public Bank getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bank }
     *     
     */
    public void setBank(Bank value) {
        this.bank = value;
    }

    /**
     * Gets the value of the croChanges property.
     * 
     * @return
     *     possible object is
     *     {@link CROChanges }
     *     
     */
    public CROChanges getCROChanges() {
        return croChanges;
    }

    /**
     * Sets the value of the croChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CROChanges }
     *     
     */
    public void setCROChanges(CROChanges value) {
        this.croChanges = value;
    }

    /**
     * Gets the value of the prevSearches property.
     * 
     * @return
     *     possible object is
     *     {@link PrevSearches }
     *     
     */
    public PrevSearches getPrevSearches() {
        return prevSearches;
    }

    /**
     * Sets the value of the prevSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevSearches }
     *     
     */
    public void setPrevSearches(PrevSearches value) {
        this.prevSearches = value;
    }

    /**
     * Gets the value of the ccLs property.
     * 
     * @return
     *     possible object is
     *     {@link CCLs }
     *     
     */
    public CCLs getCCLs() {
        return ccLs;
    }

    /**
     * Sets the value of the ccLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCLs }
     *     
     */
    public void setCCLs(CCLs value) {
        this.ccLs = value;
    }

}
