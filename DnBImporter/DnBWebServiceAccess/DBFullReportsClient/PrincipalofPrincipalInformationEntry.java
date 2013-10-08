
package DBFullReportsClient;

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
 * <p>Java class for PrincipalofPrincipalInformationEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalofPrincipalInformationEntry">
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
 *         &lt;element name="LegalRepresentativeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalofPrincipalInformationEntry", propOrder = {
    "name",
    "dunsNumber",
    "address",
    "corporateIndicator",
    "ceoIndicator",
    "legalRepresentativeIndicator",
    "principalPositions",
    "registrationNumbers",
    "signingAuthorities"
})
public class PrincipalofPrincipalInformationEntry {

    @XmlElement(name = "Name")
    protected NameType name;
    @XmlElement(name = "DUNSNumber")
    protected BigInteger dunsNumber;
    @XmlElement(name = "Address")
    protected List<PrincipalofPrincipalInformationEntry.Address> address;
    @XmlElement(name = "CorporateIndicator")
    protected Boolean corporateIndicator;
    @XmlElement(name = "CEOIndicator")
    protected Boolean ceoIndicator;
    @XmlElement(name = "LegalRepresentativeIndicator")
    protected Boolean legalRepresentativeIndicator;
    @XmlElement(name = "PrincipalPositions")
    protected PrincipalofPrincipalInformationEntry.PrincipalPositions principalPositions;
    @XmlElement(name = "RegistrationNumbers")
    protected List<PrincipalofPrincipalInformationEntry.RegistrationNumbers> registrationNumbers;
    @XmlElement(name = "SigningAuthorities")
    protected List<PrincipalofPrincipalInformationEntry.SigningAuthorities> signingAuthorities;

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
     * {@link PrincipalofPrincipalInformationEntry.Address }
     * 
     * 
     */
    public List<PrincipalofPrincipalInformationEntry.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<PrincipalofPrincipalInformationEntry.Address>();
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
     * Gets the value of the principalPositions property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalofPrincipalInformationEntry.PrincipalPositions }
     *     
     */
    public PrincipalofPrincipalInformationEntry.PrincipalPositions getPrincipalPositions() {
        return principalPositions;
    }

    /**
     * Sets the value of the principalPositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalofPrincipalInformationEntry.PrincipalPositions }
     *     
     */
    public void setPrincipalPositions(PrincipalofPrincipalInformationEntry.PrincipalPositions value) {
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
     * {@link PrincipalofPrincipalInformationEntry.RegistrationNumbers }
     * 
     * 
     */
    public List<PrincipalofPrincipalInformationEntry.RegistrationNumbers> getRegistrationNumbers() {
        if (registrationNumbers == null) {
            registrationNumbers = new ArrayList<PrincipalofPrincipalInformationEntry.RegistrationNumbers>();
        }
        return this.registrationNumbers;
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
     * {@link PrincipalofPrincipalInformationEntry.SigningAuthorities }
     * 
     * 
     */
    public List<PrincipalofPrincipalInformationEntry.SigningAuthorities> getSigningAuthorities() {
        if (signingAuthorities == null) {
            signingAuthorities = new ArrayList<PrincipalofPrincipalInformationEntry.SigningAuthorities>();
        }
        return this.signingAuthorities;
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
        protected PrincipalofPrincipalInformationEntry.RegistrationNumbers.RegistrationNumber registrationNumber;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PrincipalofPrincipalInformationEntry.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public PrincipalofPrincipalInformationEntry.RegistrationNumbers.RegistrationNumber getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrincipalofPrincipalInformationEntry.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public void setRegistrationNumber(PrincipalofPrincipalInformationEntry.RegistrationNumbers.RegistrationNumber value) {
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
