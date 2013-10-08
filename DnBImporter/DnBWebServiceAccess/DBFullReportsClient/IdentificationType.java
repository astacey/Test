
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
 * This type holds the information that is used to identify the subject.
 * 
 * <p>Java class for IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType"/>
 *         &lt;element name="CountryCode" type="{http://gateway.dnb.com/getProduct}ISOCountryCodeType"/>
 *         &lt;element name="DefaultCurrencyCode" type="{http://gateway.dnb.com/getProduct}ISOCurrencyCodeType" minOccurs="0"/>
 *         &lt;element name="RegisteredAcronym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingStyles" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TradeStyleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherBusinessNames" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessOperatingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessEndDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="RegistrationNumbers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RegistrationNumber" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessAddress" type="{http://gateway.dnb.com/getProduct}AddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TelephoneNumbers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FaxNumbers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="WebAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryLineofBusinessSIC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PrimaryLineofBusinessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "businessName",
    "dunsNumber",
    "countryCode",
    "defaultCurrencyCode",
    "registeredAcronym",
    "tradingStyles",
    "otherBusinessNames",
    "businessOperatingStatus",
    "businessEndDate",
    "registrationNumbers",
    "businessAddress",
    "telephoneNumbers",
    "faxNumbers",
    "webAddress",
    "emailAddress",
    "primaryLineofBusinessSIC",
    "primaryLineofBusinessDescription"
})
public class IdentificationType {

    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "DUNSNumber", required = true)
    protected BigInteger dunsNumber;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;
    @XmlElement(name = "DefaultCurrencyCode")
    protected String defaultCurrencyCode;
    @XmlElement(name = "RegisteredAcronym")
    protected String registeredAcronym;
    @XmlElement(name = "TradingStyles")
    protected List<IdentificationType.TradingStyles> tradingStyles;
    @XmlElement(name = "OtherBusinessNames")
    protected List<IdentificationType.OtherBusinessNames> otherBusinessNames;
    @XmlElement(name = "BusinessOperatingStatus")
    protected String businessOperatingStatus;
    @XmlElement(name = "BusinessEndDate")
    protected DNBDate businessEndDate;
    @XmlElement(name = "RegistrationNumbers")
    protected List<IdentificationType.RegistrationNumbers> registrationNumbers;
    @XmlElement(name = "BusinessAddress")
    protected List<AddressType> businessAddress;
    @XmlElement(name = "TelephoneNumbers")
    protected List<IdentificationType.TelephoneNumbers> telephoneNumbers;
    @XmlElement(name = "FaxNumbers")
    protected List<IdentificationType.FaxNumbers> faxNumbers;
    @XmlElement(name = "WebAddress")
    protected String webAddress;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "PrimaryLineofBusinessSIC")
    protected BigInteger primaryLineofBusinessSIC;
    @XmlElement(name = "PrimaryLineofBusinessDescription")
    protected String primaryLineofBusinessDescription;

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
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
     * Gets the value of the defaultCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultCurrencyCode() {
        return defaultCurrencyCode;
    }

    /**
     * Sets the value of the defaultCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultCurrencyCode(String value) {
        this.defaultCurrencyCode = value;
    }

    /**
     * Gets the value of the registeredAcronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredAcronym() {
        return registeredAcronym;
    }

    /**
     * Sets the value of the registeredAcronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredAcronym(String value) {
        this.registeredAcronym = value;
    }

    /**
     * Gets the value of the tradingStyles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingStyles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType.TradingStyles }
     * 
     * 
     */
    public List<IdentificationType.TradingStyles> getTradingStyles() {
        if (tradingStyles == null) {
            tradingStyles = new ArrayList<IdentificationType.TradingStyles>();
        }
        return this.tradingStyles;
    }

    /**
     * Gets the value of the otherBusinessNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherBusinessNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherBusinessNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType.OtherBusinessNames }
     * 
     * 
     */
    public List<IdentificationType.OtherBusinessNames> getOtherBusinessNames() {
        if (otherBusinessNames == null) {
            otherBusinessNames = new ArrayList<IdentificationType.OtherBusinessNames>();
        }
        return this.otherBusinessNames;
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
     * Gets the value of the businessEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessEndDate() {
        return businessEndDate;
    }

    /**
     * Sets the value of the businessEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessEndDate(DNBDate value) {
        this.businessEndDate = value;
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
     * {@link IdentificationType.RegistrationNumbers }
     * 
     * 
     */
    public List<IdentificationType.RegistrationNumbers> getRegistrationNumbers() {
        if (registrationNumbers == null) {
            registrationNumbers = new ArrayList<IdentificationType.RegistrationNumbers>();
        }
        return this.registrationNumbers;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     * 
     * 
     */
    public List<AddressType> getBusinessAddress() {
        if (businessAddress == null) {
            businessAddress = new ArrayList<AddressType>();
        }
        return this.businessAddress;
    }

    /**
     * Gets the value of the telephoneNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType.TelephoneNumbers }
     * 
     * 
     */
    public List<IdentificationType.TelephoneNumbers> getTelephoneNumbers() {
        if (telephoneNumbers == null) {
            telephoneNumbers = new ArrayList<IdentificationType.TelephoneNumbers>();
        }
        return this.telephoneNumbers;
    }

    /**
     * Gets the value of the faxNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationType.FaxNumbers }
     * 
     * 
     */
    public List<IdentificationType.FaxNumbers> getFaxNumbers() {
        if (faxNumbers == null) {
            faxNumbers = new ArrayList<IdentificationType.FaxNumbers>();
        }
        return this.faxNumbers;
    }

    /**
     * Gets the value of the webAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Sets the value of the webAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the primaryLineofBusinessSIC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryLineofBusinessSIC() {
        return primaryLineofBusinessSIC;
    }

    /**
     * Sets the value of the primaryLineofBusinessSIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryLineofBusinessSIC(BigInteger value) {
        this.primaryLineofBusinessSIC = value;
    }

    /**
     * Gets the value of the primaryLineofBusinessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryLineofBusinessDescription() {
        return primaryLineofBusinessDescription;
    }

    /**
     * Sets the value of the primaryLineofBusinessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryLineofBusinessDescription(String value) {
        this.primaryLineofBusinessDescription = value;
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
     *         &lt;element name="FaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "faxNumber"
    })
    public static class FaxNumbers {

        @XmlElement(name = "FaxNumber", required = true)
        protected String faxNumber;

        /**
         * Gets the value of the faxNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaxNumber() {
            return faxNumber;
        }

        /**
         * Sets the value of the faxNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaxNumber(String value) {
            this.faxNumber = value;
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
     *         &lt;element name="OtherBusinessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "otherBusinessName"
    })
    public static class OtherBusinessNames {

        @XmlElement(name = "OtherBusinessName", required = true)
        protected String otherBusinessName;

        /**
         * Gets the value of the otherBusinessName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherBusinessName() {
            return otherBusinessName;
        }

        /**
         * Sets the value of the otherBusinessName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherBusinessName(String value) {
            this.otherBusinessName = value;
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
     *         &lt;element name="RegistrationNumber" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "registrationNumber",
        "registrationLocation"
    })
    public static class RegistrationNumbers {

        @XmlElement(name = "RegistrationNumber")
        protected IdentificationType.RegistrationNumbers.RegistrationNumber registrationNumber;
        @XmlElement(name = "RegistrationLocation")
        protected String registrationLocation;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link IdentificationType.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public IdentificationType.RegistrationNumbers.RegistrationNumber getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentificationType.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public void setRegistrationNumber(IdentificationType.RegistrationNumbers.RegistrationNumber value) {
            this.registrationNumber = value;
        }

        /**
         * Gets the value of the registrationLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistrationLocation() {
            return registrationLocation;
        }

        /**
         * Sets the value of the registrationLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistrationLocation(String value) {
            this.registrationLocation = value;
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
     *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "telephoneNumber"
    })
    public static class TelephoneNumbers {

        @XmlElement(name = "TelephoneNumber", required = true)
        protected String telephoneNumber;

        /**
         * Gets the value of the telephoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelephoneNumber() {
            return telephoneNumber;
        }

        /**
         * Sets the value of the telephoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelephoneNumber(String value) {
            this.telephoneNumber = value;
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
     *         &lt;element name="TradeStyleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "tradeStyleName"
    })
    public static class TradingStyles {

        @XmlElement(name = "TradeStyleName", required = true)
        protected String tradeStyleName;

        /**
         * Gets the value of the tradeStyleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTradeStyleName() {
            return tradeStyleName;
        }

        /**
         * Sets the value of the tradeStyleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTradeStyleName(String value) {
            this.tradeStyleName = value;
        }

    }

}
