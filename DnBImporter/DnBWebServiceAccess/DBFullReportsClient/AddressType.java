
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This type holds the address elements used to represent the address of an entity.
 * 
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLines" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PostalTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType" minOccurs="0"/>
 *         &lt;element name="PostBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressLines",
    "postalTown",
    "minorTown",
    "county",
    "postCode",
    "countryCode",
    "postBox"
})
@XmlSeeAlso({
    DBFullReportsClient.Financials.FinancialInformationEntry.ParentInformation.AddressEntry.class,
    DBFullReportsClient.PrincipalsInformationEntryType.Address.class,
    DBFullReportsClient.PrincipalsInformationEntryType.PersonalDetails.BirthAddress.class,
    DBFullReportsClient.BranchesInformationEntryType.AddressEntry.class,
    DBFullReportsClient.ChildLinkageInformationEntryType.AddressEntry.class,
    DBFullReportsClient.ParentInformationEntryType.AddressEntry.class,
    DBFullReportsClient.ShareholdersInformationEntryType.AddressEntry.class,
    DBFullReportsClient.PrincipalofPrincipalInformationEntry.Address.class
})
public class AddressType {

    @XmlElement(name = "AddressLines")
    protected List<AddressType.AddressLines> addressLines;
    @XmlElement(name = "PostalTown")
    protected String postalTown;
    @XmlElement(name = "MinorTown")
    protected String minorTown;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "PostBox")
    protected String postBox;
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
     * Gets the value of the addressLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType.AddressLines }
     * 
     * 
     */
    public List<AddressType.AddressLines> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<AddressType.AddressLines>();
        }
        return this.addressLines;
    }

    /**
     * Gets the value of the postalTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalTown() {
        return postalTown;
    }

    /**
     * Sets the value of the postalTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalTown(String value) {
        this.postalTown = value;
    }

    /**
     * Gets the value of the minorTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorTown() {
        return minorTown;
    }

    /**
     * Sets the value of the minorTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorTown(String value) {
        this.minorTown = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the postBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBox() {
        return postBox;
    }

    /**
     * Sets the value of the postBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBox(String value) {
        this.postBox = value;
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
     *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "addressLine"
    })
    public static class AddressLines {

        @XmlElement(name = "AddressLine", required = true)
        protected String addressLine;

        /**
         * Gets the value of the addressLine property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressLine() {
            return addressLine;
        }

        /**
         * Sets the value of the addressLine property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressLine(String value) {
            this.addressLine = value;
        }

    }

}
