
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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for BranchesInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchesInformationEntryType">
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
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssociationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineofBusinessEntry" type="{http://gateway.dnb.com/getProduct}LineofBusinessEntryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BranchesInformationEntryType", propOrder = {
    "name",
    "dunsNumber",
    "addressEntry",
    "dnbRating",
    "registrationNumber",
    "associationStartDate",
    "associationType",
    "lineofBusinessEntry",
    "associationCommentsEntry"
})
@XmlSeeAlso({
    DBFullReportsClient.CorporateLinkages.PreviousLinkagesInformation.BranchesInformation.BranchesInformationEntry.class
})
public class BranchesInformationEntryType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "AddressEntry")
    protected List<BranchesInformationEntryType.AddressEntry> addressEntry;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "RegistrationNumber")
    protected BranchesInformationEntryType.RegistrationNumber registrationNumber;
    @XmlElement(name = "AssociationStartDate")
    protected DNBDate associationStartDate;
    @XmlElement(name = "AssociationType")
    protected String associationType;
    @XmlElement(name = "LineofBusinessEntry")
    protected List<LineofBusinessEntryType> lineofBusinessEntry;
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
     * {@link BranchesInformationEntryType.AddressEntry }
     * 
     * 
     */
    public List<BranchesInformationEntryType.AddressEntry> getAddressEntry() {
        if (addressEntry == null) {
            addressEntry = new ArrayList<BranchesInformationEntryType.AddressEntry>();
        }
        return this.addressEntry;
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
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BranchesInformationEntryType.RegistrationNumber }
     *     
     */
    public BranchesInformationEntryType.RegistrationNumber getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchesInformationEntryType.RegistrationNumber }
     *     
     */
    public void setRegistrationNumber(BranchesInformationEntryType.RegistrationNumber value) {
        this.registrationNumber = value;
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
