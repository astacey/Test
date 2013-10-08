
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareholdersInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareholdersInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *         &lt;element name="AddressEntry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShareholderisBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssociationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverallShareHoldingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverallShareholdingAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IndirectShareHoldingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="VotingSharePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinorShareHolderIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperationsStartYear" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LineofBusinessEntry" type="{http://gateway.dnb.com/getProduct}LineofBusinessEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationCommentsEntry" type="{http://gateway.dnb.com/getProduct}AssociationCommentsEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareholdersInformationEntryType", propOrder = {
    "name",
    "dunsNumber",
    "addressEntry",
    "shareholderisBusinessIndicator",
    "associationType",
    "overallShareHoldingPercentage",
    "overallShareholdingAmount",
    "indirectShareHoldingPercentage",
    "votingSharePercentage",
    "minorShareHolderIndicator",
    "operationsStartYear",
    "birthDate",
    "lineofBusinessEntry",
    "associationStartDate",
    "associationCommentsEntry"
})
@XmlSeeAlso({
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.ShareholdersInformation.ShareholdersInformationEntry.class
})
public class ShareholdersInformationEntryType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "AddressEntry")
    protected List<ShareholdersInformationEntryType.AddressEntry> addressEntry;
    @XmlElement(name = "ShareholderisBusinessIndicator")
    protected Boolean shareholderisBusinessIndicator;
    @XmlElement(name = "AssociationType")
    protected String associationType;
    @XmlElement(name = "OverallShareHoldingPercentage")
    protected BigDecimal overallShareHoldingPercentage;
    @XmlElement(name = "OverallShareholdingAmount")
    protected AmountType overallShareholdingAmount;
    @XmlElement(name = "IndirectShareHoldingPercentage")
    protected BigDecimal indirectShareHoldingPercentage;
    @XmlElement(name = "VotingSharePercentage")
    protected BigDecimal votingSharePercentage;
    @XmlElement(name = "MinorShareHolderIndicator")
    protected Boolean minorShareHolderIndicator;
    @XmlElement(name = "OperationsStartYear")
    protected DNBDate operationsStartYear;
    @XmlElement(name = "BirthDate")
    protected DNBDate birthDate;
    @XmlElement(name = "LineofBusinessEntry")
    protected List<LineofBusinessEntryType> lineofBusinessEntry;
    @XmlElement(name = "AssociationStartDate")
    protected DNBDate associationStartDate;
    @XmlElement(name = "AssociationCommentsEntry")
    protected List<AssociationCommentsEntryType> associationCommentsEntry;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
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
     * Gets the value of the addressEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholdersInformationEntryType.AddressEntry }
     * 
     * 
     */
    public List<ShareholdersInformationEntryType.AddressEntry> getAddressEntry() {
        if (addressEntry == null) {
            addressEntry = new ArrayList<ShareholdersInformationEntryType.AddressEntry>();
        }
        return this.addressEntry;
    }

    /**
     * Gets the value of the shareholderisBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShareholderisBusinessIndicator() {
        return shareholderisBusinessIndicator;
    }

    /**
     * Sets the value of the shareholderisBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShareholderisBusinessIndicator(Boolean value) {
        this.shareholderisBusinessIndicator = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationType(String value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the overallShareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallShareHoldingPercentage() {
        return overallShareHoldingPercentage;
    }

    /**
     * Sets the value of the overallShareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallShareHoldingPercentage(BigDecimal value) {
        this.overallShareHoldingPercentage = value;
    }

    /**
     * Gets the value of the overallShareholdingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOverallShareholdingAmount() {
        return overallShareholdingAmount;
    }

    /**
     * Sets the value of the overallShareholdingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOverallShareholdingAmount(AmountType value) {
        this.overallShareholdingAmount = value;
    }

    /**
     * Gets the value of the indirectShareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndirectShareHoldingPercentage() {
        return indirectShareHoldingPercentage;
    }

    /**
     * Sets the value of the indirectShareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndirectShareHoldingPercentage(BigDecimal value) {
        this.indirectShareHoldingPercentage = value;
    }

    /**
     * Gets the value of the votingSharePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVotingSharePercentage() {
        return votingSharePercentage;
    }

    /**
     * Sets the value of the votingSharePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVotingSharePercentage(BigDecimal value) {
        this.votingSharePercentage = value;
    }

    /**
     * Gets the value of the minorShareHolderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorShareHolderIndicator() {
        return minorShareHolderIndicator;
    }

    /**
     * Sets the value of the minorShareHolderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorShareHolderIndicator(Boolean value) {
        this.minorShareHolderIndicator = value;
    }

    /**
     * Gets the value of the operationsStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getOperationsStartYear() {
        return operationsStartYear;
    }

    /**
     * Sets the value of the operationsStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setOperationsStartYear(DNBDate value) {
        this.operationsStartYear = value;
    }

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
     * Gets the value of the lineofBusinessEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineofBusinessEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineofBusinessEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineofBusinessEntryType }
     * 
     * 
     */
    public List<LineofBusinessEntryType> getLineofBusinessEntry() {
        if (lineofBusinessEntry == null) {
            lineofBusinessEntry = new ArrayList<LineofBusinessEntryType>();
        }
        return this.lineofBusinessEntry;
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
     * Gets the value of the associationCommentsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associationCommentsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociationCommentsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationCommentsEntryType }
     * 
     * 
     */
    public List<AssociationCommentsEntryType> getAssociationCommentsEntry() {
        if (associationCommentsEntry == null) {
            associationCommentsEntry = new ArrayList<AssociationCommentsEntryType>();
        }
        return this.associationCommentsEntry;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    public static class AddressEntry
        extends AddressType
    {

        @XmlElement(name = "CountryText")
        protected Object countryText;

        /**
         * Gets the value of the countryText property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCountryText() {
            return countryText;
        }

        /**
         * Sets the value of the countryText property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCountryText(Object value) {
            this.countryText = value;
        }

    }

}
