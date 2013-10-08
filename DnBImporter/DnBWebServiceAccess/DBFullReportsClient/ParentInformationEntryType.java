
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
 * <p>Java class for ParentInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentInformationEntryType">
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
 *         &lt;element name="JointParentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverallShareHoldingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverallShareHoldingAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IndirectShareHoldingPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationsStartYear" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LineofBusinessEntry" type="{http://gateway.dnb.com/getProduct}LineofBusinessEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssociationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentInformationEntryType", propOrder = {
    "name",
    "dunsNumber",
    "addressEntry",
    "jointParentIndicator",
    "overallShareHoldingPercentage",
    "overallShareHoldingAmount",
    "indirectShareHoldingPercentage",
    "dnbRating",
    "operationsStartYear",
    "lineofBusinessEntry",
    "associationStartDate"
})
@XmlSeeAlso({
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.ImmediateParentsInformation.ImmediateParentsInformationEntry.class,
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.DomesticUltimateParentsInformation.DomesticUltimateParentsInformationEntry.class,
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.GlobalUltimateParentsInformation.GlobalUltimateParentsInformationEntry.class
})
public class ParentInformationEntryType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "AddressEntry")
    protected List<ParentInformationEntryType.AddressEntry> addressEntry;
    @XmlElement(name = "JointParentIndicator")
    protected Boolean jointParentIndicator;
    @XmlElement(name = "OverallShareHoldingPercentage")
    protected BigDecimal overallShareHoldingPercentage;
    @XmlElement(name = "OverallShareHoldingAmount")
    protected AmountType overallShareHoldingAmount;
    @XmlElement(name = "IndirectShareHoldingPercentage")
    protected BigDecimal indirectShareHoldingPercentage;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "OperationsStartYear")
    protected DNBDate operationsStartYear;
    @XmlElement(name = "LineofBusinessEntry")
    protected List<LineofBusinessEntryType> lineofBusinessEntry;
    @XmlElement(name = "AssociationStartDate")
    protected DNBDate associationStartDate;

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
     * {@link ParentInformationEntryType.AddressEntry }
     * 
     * 
     */
    public List<ParentInformationEntryType.AddressEntry> getAddressEntry() {
        if (addressEntry == null) {
            addressEntry = new ArrayList<ParentInformationEntryType.AddressEntry>();
        }
        return this.addressEntry;
    }

    /**
     * Gets the value of the jointParentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJointParentIndicator() {
        return jointParentIndicator;
    }

    /**
     * Sets the value of the jointParentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJointParentIndicator(Boolean value) {
        this.jointParentIndicator = value;
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
     * Gets the value of the overallShareHoldingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOverallShareHoldingAmount() {
        return overallShareHoldingAmount;
    }

    /**
     * Sets the value of the overallShareHoldingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOverallShareHoldingAmount(AmountType value) {
        this.overallShareHoldingAmount = value;
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
