
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalAssociationsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalAssociationsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
 *         &lt;element name="DNBRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationEndDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AssociationEndReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="AdditionalDetails" type="{http://gateway.dnb.com/getProduct}AdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAssociationsEntryType", propOrder = {
    "name",
    "dunsNumber",
    "address",
    "dnbRating",
    "businessOperatingStatus",
    "associationStartDate",
    "associationEndDate",
    "associationEndReason",
    "principalPositions",
    "signingAuthorities",
    "additionalDetails"
})
public class PrincipalAssociationsEntryType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "DNBRating")
    protected String dnbRating;
    @XmlElement(name = "BusinessOperatingStatus")
    protected String businessOperatingStatus;
    @XmlElement(name = "AssociationStartDate")
    protected DNBDate associationStartDate;
    @XmlElement(name = "AssociationEndDate")
    protected DNBDate associationEndDate;
    @XmlElement(name = "AssociationEndReason")
    protected String associationEndReason;
    @XmlElement(name = "PrincipalPositions")
    protected PrincipalAssociationsEntryType.PrincipalPositions principalPositions;
    @XmlElement(name = "SigningAuthorities")
    protected List<PrincipalAssociationsEntryType.SigningAuthorities> signingAuthorities;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
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
     * Gets the value of the principalPositions property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalAssociationsEntryType.PrincipalPositions }
     *     
     */
    public PrincipalAssociationsEntryType.PrincipalPositions getPrincipalPositions() {
        return principalPositions;
    }

    /**
     * Sets the value of the principalPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalAssociationsEntryType.PrincipalPositions }
     *     
     */
    public void setPrincipalPositions(PrincipalAssociationsEntryType.PrincipalPositions value) {
        this.principalPositions = value;
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
     * {@link PrincipalAssociationsEntryType.SigningAuthorities }
     * 
     * 
     */
    public List<PrincipalAssociationsEntryType.SigningAuthorities> getSigningAuthorities() {
        if (signingAuthorities == null) {
            signingAuthorities = new ArrayList<PrincipalAssociationsEntryType.SigningAuthorities>();
        }
        return this.signingAuthorities;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public void setAdditionalDetails(AdditionalDetailsType value) {
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
