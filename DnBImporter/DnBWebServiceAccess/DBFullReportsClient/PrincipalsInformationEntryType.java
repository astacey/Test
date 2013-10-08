
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PrincipalsInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalsInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://gateway.dnb.com/getProduct}NameType" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CorporateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CEOIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OfficiallyRegisteredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationExpirationDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationEndDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationEndReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalPositions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrentPrincipalPositionsEntry" type="{http://gateway.dnb.com/getProduct}CurrentPrincipalPositionsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PreviousPrincipalPositionsEntry" type="{http://gateway.dnb.com/getProduct}PreviousPrincipalPositionsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegistrationNumbers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegistrationNumber">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareCapitalAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShareCapitalPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PersonalDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BirthDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                   &lt;element name="DeceasedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                   &lt;element name="BirthAddress" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
 *                           &lt;sequence>
 *                             &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="MaritalContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EducationalQualifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Representations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SigningAuthorities" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LegalEventsInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalEventsInformationEntry" type="{http://gateway.dnb.com/getProduct}EventsInformationEntryType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrincipalofPrincipalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrincipalofPrincipalInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalofPrincipalInformationEntry" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherCurrentAssociationsEntry" type="{http://gateway.dnb.com/getProduct}PrincipalAssociationsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherPreviousAssociationsEntry" type="{http://gateway.dnb.com/getProduct}PrincipalAssociationsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PrincipalsInformationEntryType", propOrder = {
    "name",
    "dunsNumber",
    "address",
    "corporateIndicator",
    "ceoIndicator",
    "officiallyRegisteredIndicator",
    "legalRepresentativeIndicator",
    "gender",
    "associationStartDate",
    "associationExpirationDate",
    "associationEndDate",
    "associationEndReason",
    "officialReference",
    "principalPositions",
    "registrationNumbers",
    "businessOperatingStatus",
    "dnbRating",
    "shareCapitalAmount",
    "shareCapitalPercentage",
    "personalDetails",
    "signingAuthorities",
    "legalEventsInformation",
    "principalofPrincipalInformation",
    "otherCurrentAssociationsEntry",
    "otherPreviousAssociationsEntry",
    "additionalDetails"
})
public class PrincipalsInformationEntryType {

    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "Address")
    protected List<PrincipalsInformationEntryType.Address> address;
    @XmlElement(name = "CorporateIndicator")
    protected Boolean corporateIndicator;
    @XmlElement(name = "CEOIndicator")
    protected Boolean ceoIndicator;
    @XmlElement(name = "OfficiallyRegisteredIndicator")
    protected Boolean officiallyRegisteredIndicator;
    @XmlElement(name = "LegalRepresentativeIndicator")
    protected Boolean legalRepresentativeIndicator;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "AssociationStartDate")
    protected DNBDate associationStartDate;
    @XmlElement(name = "AssociationExpirationDate")
    protected DNBDate associationExpirationDate;
    @XmlElement(name = "AssociationEndDate")
    protected DNBDate associationEndDate;
    @XmlElement(name = "AssociationEndReason")
    protected String associationEndReason;
    @XmlElement(name = "OfficialReference")
    protected String officialReference;
    @XmlElement(name = "PrincipalPositions")
    protected PrincipalsInformationEntryType.PrincipalPositions principalPositions;
    @XmlElement(name = "RegistrationNumbers")
    protected List<PrincipalsInformationEntryType.RegistrationNumbers> registrationNumbers;
    @XmlElement(name = "BusinessOperatingStatus")
    protected String businessOperatingStatus;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "ShareCapitalAmount")
    protected AmountType shareCapitalAmount;
    @XmlElement(name = "ShareCapitalPercentage")
    protected BigDecimal shareCapitalPercentage;
    @XmlElement(name = "PersonalDetails")
    protected PrincipalsInformationEntryType.PersonalDetails personalDetails;
    @XmlElement(name = "SigningAuthorities")
    protected List<PrincipalsInformationEntryType.SigningAuthorities> signingAuthorities;
    @XmlElement(name = "LegalEventsInformation")
    protected PrincipalsInformationEntryType.LegalEventsInformation legalEventsInformation;
    @XmlElement(name = "PrincipalofPrincipalInformation")
    protected PrincipalsInformationEntryType.PrincipalofPrincipalInformation principalofPrincipalInformation;
    @XmlElement(name = "OtherCurrentAssociationsEntry")
    protected List<PrincipalAssociationsEntryType> otherCurrentAssociationsEntry;
    @XmlElement(name = "OtherPreviousAssociationsEntry")
    protected List<PrincipalAssociationsEntryType> otherPreviousAssociationsEntry;
    @XmlElement(name = "AdditionalDetails")
    protected PrincipalsInformationEntryType.AdditionalDetails additionalDetails;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUNSNumber(BigInteger value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalsInformationEntryType.Address }
     * 
     * 
     */
    public List<PrincipalsInformationEntryType.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<PrincipalsInformationEntryType.Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the corporateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorporateIndicator() {
        return corporateIndicator;
    }

    /**
     * Sets the value of the corporateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorporateIndicator(Boolean value) {
        this.corporateIndicator = value;
    }

    /**
     * Gets the value of the ceoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCEOIndicator() {
        return ceoIndicator;
    }

    /**
     * Sets the value of the ceoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCEOIndicator(Boolean value) {
        this.ceoIndicator = value;
    }

    /**
     * Gets the value of the officiallyRegisteredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficiallyRegisteredIndicator() {
        return officiallyRegisteredIndicator;
    }

    /**
     * Sets the value of the officiallyRegisteredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficiallyRegisteredIndicator(Boolean value) {
        this.officiallyRegisteredIndicator = value;
    }

    /**
     * Gets the value of the legalRepresentativeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalRepresentativeIndicator() {
        return legalRepresentativeIndicator;
    }

    /**
     * Sets the value of the legalRepresentativeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalRepresentativeIndicator(Boolean value) {
        this.legalRepresentativeIndicator = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the associationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAssociationStartDate() {
        return associationStartDate;
    }

    /**
     * Sets the value of the associationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAssociationStartDate(DNBDate value) {
        this.associationStartDate = value;
    }

    /**
     * Gets the value of the associationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAssociationExpirationDate() {
        return associationExpirationDate;
    }

    /**
     * Sets the value of the associationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAssociationExpirationDate(DNBDate value) {
        this.associationExpirationDate = value;
    }

    /**
     * Gets the value of the associationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAssociationEndDate() {
        return associationEndDate;
    }

    /**
     * Sets the value of the associationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAssociationEndDate(DNBDate value) {
        this.associationEndDate = value;
    }

    /**
     * Gets the value of the associationEndReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationEndReason() {
        return associationEndReason;
    }

    /**
     * Sets the value of the associationEndReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationEndReason(String value) {
        this.associationEndReason = value;
    }

    /**
     * Gets the value of the officialReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialReference() {
        return officialReference;
    }

    /**
     * Sets the value of the officialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialReference(String value) {
        this.officialReference = value;
    }

    /**
     * Gets the value of the principalPositions property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationEntryType.PrincipalPositions }
     *     
     */
    public PrincipalsInformationEntryType.PrincipalPositions getPrincipalPositions() {
        return principalPositions;
    }

    /**
     * Sets the value of the principalPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationEntryType.PrincipalPositions }
     *     
     */
    public void setPrincipalPositions(PrincipalsInformationEntryType.PrincipalPositions value) {
        this.principalPositions = value;
    }

    /**
     * Gets the value of the registrationNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalsInformationEntryType.RegistrationNumbers }
     * 
     * 
     */
    public List<PrincipalsInformationEntryType.RegistrationNumbers> getRegistrationNumbers() {
        if (registrationNumbers == null) {
            registrationNumbers = new ArrayList<PrincipalsInformationEntryType.RegistrationNumbers>();
        }
        return this.registrationNumbers;
    }

    /**
     * Gets the value of the businessOperatingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessOperatingStatus() {
        return businessOperatingStatus;
    }

    /**
     * Sets the value of the businessOperatingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessOperatingStatus(String value) {
        this.businessOperatingStatus = value;
    }

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
     * Gets the value of the shareCapitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareCapitalAmount() {
        return shareCapitalAmount;
    }

    /**
     * Sets the value of the shareCapitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareCapitalAmount(AmountType value) {
        this.shareCapitalAmount = value;
    }

    /**
     * Gets the value of the shareCapitalPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareCapitalPercentage() {
        return shareCapitalPercentage;
    }

    /**
     * Sets the value of the shareCapitalPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareCapitalPercentage(BigDecimal value) {
        this.shareCapitalPercentage = value;
    }

    /**
     * Gets the value of the personalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationEntryType.PersonalDetails }
     *     
     */
    public PrincipalsInformationEntryType.PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    /**
     * Sets the value of the personalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationEntryType.PersonalDetails }
     *     
     */
    public void setPersonalDetails(PrincipalsInformationEntryType.PersonalDetails value) {
        this.personalDetails = value;
    }

    /**
     * Gets the value of the signingAuthorities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signingAuthorities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSigningAuthorities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalsInformationEntryType.SigningAuthorities }
     * 
     * 
     */
    public List<PrincipalsInformationEntryType.SigningAuthorities> getSigningAuthorities() {
        if (signingAuthorities == null) {
            signingAuthorities = new ArrayList<PrincipalsInformationEntryType.SigningAuthorities>();
        }
        return this.signingAuthorities;
    }

    /**
     * Gets the value of the legalEventsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationEntryType.LegalEventsInformation }
     *     
     */
    public PrincipalsInformationEntryType.LegalEventsInformation getLegalEventsInformation() {
        return legalEventsInformation;
    }

    /**
     * Sets the value of the legalEventsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationEntryType.LegalEventsInformation }
     *     
     */
    public void setLegalEventsInformation(PrincipalsInformationEntryType.LegalEventsInformation value) {
        this.legalEventsInformation = value;
    }

    /**
     * Gets the value of the principalofPrincipalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationEntryType.PrincipalofPrincipalInformation }
     *     
     */
    public PrincipalsInformationEntryType.PrincipalofPrincipalInformation getPrincipalofPrincipalInformation() {
        return principalofPrincipalInformation;
    }

    /**
     * Sets the value of the principalofPrincipalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationEntryType.PrincipalofPrincipalInformation }
     *     
     */
    public void setPrincipalofPrincipalInformation(PrincipalsInformationEntryType.PrincipalofPrincipalInformation value) {
        this.principalofPrincipalInformation = value;
    }

    /**
     * Gets the value of the otherCurrentAssociationsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherCurrentAssociationsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherCurrentAssociationsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalAssociationsEntryType }
     * 
     * 
     */
    public List<PrincipalAssociationsEntryType> getOtherCurrentAssociationsEntry() {
        if (otherCurrentAssociationsEntry == null) {
            otherCurrentAssociationsEntry = new ArrayList<PrincipalAssociationsEntryType>();
        }
        return this.otherCurrentAssociationsEntry;
    }

    /**
     * Gets the value of the otherPreviousAssociationsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPreviousAssociationsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPreviousAssociationsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalAssociationsEntryType }
     * 
     * 
     */
    public List<PrincipalAssociationsEntryType> getOtherPreviousAssociationsEntry() {
        if (otherPreviousAssociationsEntry == null) {
            otherPreviousAssociationsEntry = new ArrayList<PrincipalAssociationsEntryType>();
        }
        return this.otherPreviousAssociationsEntry;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalsInformationEntryType.AdditionalDetails }
     *     
     */
    public PrincipalsInformationEntryType.AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalsInformationEntryType.AdditionalDetails }
     *     
     */
    public void setAdditionalDetails(PrincipalsInformationEntryType.AdditionalDetails value) {
        this.additionalDetails = value;
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
     *         &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "additionalDetailsEntry"
    })
    public static class AdditionalDetails {

        @XmlElement(name = "AdditionalDetailsEntry", required = true)
        protected List<PrincipalsInformationEntryType.AdditionalDetails.AdditionalDetailsEntry> additionalDetailsEntry;

        /**
         * Gets the value of the additionalDetailsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDetailsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDetailsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrincipalsInformationEntryType.AdditionalDetails.AdditionalDetailsEntry }
         * 
         * 
         */
        public List<PrincipalsInformationEntryType.AdditionalDetails.AdditionalDetailsEntry> getAdditionalDetailsEntry() {
            if (additionalDetailsEntry == null) {
                additionalDetailsEntry = new ArrayList<PrincipalsInformationEntryType.AdditionalDetails.AdditionalDetailsEntry>();
            }
            return this.additionalDetailsEntry;
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
         *         &lt;element name="DetailText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "detailText"
        })
        public static class AdditionalDetailsEntry {

            @XmlElement(name = "DetailText", required = true)
            protected String detailText;

            /**
             * Gets the value of the detailText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailText() {
                return detailText;
            }

            /**
             * Sets the value of the detailText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailText(String value) {
                this.detailText = value;
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
     *     &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address
        extends AddressType
    {


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
     *         &lt;element name="LegalEventsInformationEntry" type="{http://gateway.dnb.com/getProduct}EventsInformationEntryType" maxOccurs="unbounded"/>
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
        "legalEventsInformationEntry"
    })
    public static class LegalEventsInformation {

        @XmlElement(name = "LegalEventsInformationEntry", required = true)
        protected List<EventsInformationEntryType> legalEventsInformationEntry;

        /**
         * Gets the value of the legalEventsInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legalEventsInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegalEventsInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventsInformationEntryType }
         * 
         * 
         */
        public List<EventsInformationEntryType> getLegalEventsInformationEntry() {
            if (legalEventsInformationEntry == null) {
                legalEventsInformationEntry = new ArrayList<EventsInformationEntryType>();
            }
            return this.legalEventsInformationEntry;
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
     *         &lt;element name="BirthDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *         &lt;element name="DeceasedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *         &lt;element name="BirthAddress" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
     *                 &lt;sequence>
     *                   &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="MaritalContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EducationalQualifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Representations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "birthDate",
        "deceasedDate",
        "birthAddress",
        "maritalStatus",
        "maritalContract",
        "educationalQualifications",
        "nationality",
        "occupation",
        "representations"
    })
    public static class PersonalDetails {

        @XmlElement(name = "BirthDate")
        protected DNBDate birthDate;
        @XmlElement(name = "DeceasedDate")
        protected DNBDate deceasedDate;
        @XmlElement(name = "BirthAddress")
        protected PrincipalsInformationEntryType.PersonalDetails.BirthAddress birthAddress;
        @XmlElement(name = "MaritalStatus")
        protected String maritalStatus;
        @XmlElement(name = "MaritalContract")
        protected String maritalContract;
        @XmlElement(name = "EducationalQualifications")
        protected String educationalQualifications;
        @XmlElement(name = "Nationality")
        protected String nationality;
        @XmlElement(name = "Occupation")
        protected String occupation;
        @XmlElement(name = "Representations")
        protected String representations;

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link DNBDate }
         *     
         */
        public DNBDate getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DNBDate }
         *     
         */
        public void setBirthDate(DNBDate value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the deceasedDate property.
         * 
         * @return
         *     possible object is
         *     {@link DNBDate }
         *     
         */
        public DNBDate getDeceasedDate() {
            return deceasedDate;
        }

        /**
         * Sets the value of the deceasedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DNBDate }
         *     
         */
        public void setDeceasedDate(DNBDate value) {
            this.deceasedDate = value;
        }

        /**
         * Gets the value of the birthAddress property.
         * 
         * @return
         *     possible object is
         *     {@link PrincipalsInformationEntryType.PersonalDetails.BirthAddress }
         *     
         */
        public PrincipalsInformationEntryType.PersonalDetails.BirthAddress getBirthAddress() {
            return birthAddress;
        }

        /**
         * Sets the value of the birthAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrincipalsInformationEntryType.PersonalDetails.BirthAddress }
         *     
         */
        public void setBirthAddress(PrincipalsInformationEntryType.PersonalDetails.BirthAddress value) {
            this.birthAddress = value;
        }

        /**
         * Gets the value of the maritalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaritalStatus() {
            return maritalStatus;
        }

        /**
         * Sets the value of the maritalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaritalStatus(String value) {
            this.maritalStatus = value;
        }

        /**
         * Gets the value of the maritalContract property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaritalContract() {
            return maritalContract;
        }

        /**
         * Sets the value of the maritalContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaritalContract(String value) {
            this.maritalContract = value;
        }

        /**
         * Gets the value of the educationalQualifications property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationalQualifications() {
            return educationalQualifications;
        }

        /**
         * Sets the value of the educationalQualifications property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationalQualifications(String value) {
            this.educationalQualifications = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the occupation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOccupation() {
            return occupation;
        }

        /**
         * Sets the value of the occupation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOccupation(String value) {
            this.occupation = value;
        }

        /**
         * Gets the value of the representations property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepresentations() {
            return representations;
        }

        /**
         * Sets the value of the representations property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepresentations(String value) {
            this.representations = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
         *       &lt;sequence>
         *         &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "countryText"
        })
        public static class BirthAddress
            extends AddressType
        {

            @XmlElement(name = "CountryText")
            protected String countryText;

            /**
             * Gets the value of the countryText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryText() {
                return countryText;
            }

            /**
             * Sets the value of the countryText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryText(String value) {
                this.countryText = value;
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
     *         &lt;element name="PrincipalofPrincipalInformationEntry" type="{http://gateway.dnb.com/getProduct}PrincipalofPrincipalInformationEntry" maxOccurs="unbounded"/>
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
        "principalofPrincipalInformationEntry"
    })
    public static class PrincipalofPrincipalInformation {

        @XmlElement(name = "PrincipalofPrincipalInformationEntry", required = true)
        protected List<PrincipalofPrincipalInformationEntry> principalofPrincipalInformationEntry;

        /**
         * Gets the value of the principalofPrincipalInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the principalofPrincipalInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrincipalofPrincipalInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrincipalofPrincipalInformationEntry }
         * 
         * 
         */
        public List<PrincipalofPrincipalInformationEntry> getPrincipalofPrincipalInformationEntry() {
            if (principalofPrincipalInformationEntry == null) {
                principalofPrincipalInformationEntry = new ArrayList<PrincipalofPrincipalInformationEntry>();
            }
            return this.principalofPrincipalInformationEntry;
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
     *         &lt;element name="CurrentPrincipalPositionsEntry" type="{http://gateway.dnb.com/getProduct}CurrentPrincipalPositionsEntryType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PreviousPrincipalPositionsEntry" type="{http://gateway.dnb.com/getProduct}PreviousPrincipalPositionsEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
        "currentPrincipalPositionsEntry",
        "previousPrincipalPositionsEntry"
    })
    public static class PrincipalPositions {

        @XmlElement(name = "CurrentPrincipalPositionsEntry")
        protected List<CurrentPrincipalPositionsEntryType> currentPrincipalPositionsEntry;
        @XmlElement(name = "PreviousPrincipalPositionsEntry")
        protected List<PreviousPrincipalPositionsEntryType> previousPrincipalPositionsEntry;

        /**
         * Gets the value of the currentPrincipalPositionsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the currentPrincipalPositionsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCurrentPrincipalPositionsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CurrentPrincipalPositionsEntryType }
         * 
         * 
         */
        public List<CurrentPrincipalPositionsEntryType> getCurrentPrincipalPositionsEntry() {
            if (currentPrincipalPositionsEntry == null) {
                currentPrincipalPositionsEntry = new ArrayList<CurrentPrincipalPositionsEntryType>();
            }
            return this.currentPrincipalPositionsEntry;
        }

        /**
         * Gets the value of the previousPrincipalPositionsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the previousPrincipalPositionsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreviousPrincipalPositionsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PreviousPrincipalPositionsEntryType }
         * 
         * 
         */
        public List<PreviousPrincipalPositionsEntryType> getPreviousPrincipalPositionsEntry() {
            if (previousPrincipalPositionsEntry == null) {
                previousPrincipalPositionsEntry = new ArrayList<PreviousPrincipalPositionsEntryType>();
            }
            return this.previousPrincipalPositionsEntry;
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
     *         &lt;element name="RegistrationNumber">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
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
        "registrationNumber"
    })
    public static class RegistrationNumbers {

        @XmlElement(name = "RegistrationNumber", required = true)
        protected PrincipalsInformationEntryType.RegistrationNumbers.RegistrationNumber registrationNumber;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PrincipalsInformationEntryType.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public PrincipalsInformationEntryType.RegistrationNumbers.RegistrationNumber getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrincipalsInformationEntryType.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public void setRegistrationNumber(PrincipalsInformationEntryType.RegistrationNumbers.RegistrationNumber value) {
            this.registrationNumber = value;
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
         *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
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
        public static class RegistrationNumber {

            @XmlValue
            protected String value;
            @XmlAttribute
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute
            protected BigInteger priority;
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
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the priority property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPriority() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPriority(BigInteger value) {
                this.priority = value;
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
     *         &lt;element name="SigningAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "signingAuthority"
    })
    public static class SigningAuthorities {

        @XmlElement(name = "SigningAuthority")
        protected String signingAuthority;

        /**
         * Gets the value of the signingAuthority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSigningAuthority() {
            return signingAuthority;
        }

        /**
         * Sets the value of the signingAuthority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSigningAuthority(String value) {
            this.signingAuthority = value;
        }

    }

}
