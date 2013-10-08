
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
 * <p>Java class for SubjectHistoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectHistoryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessNameHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessNameHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousBusinessName" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessAddressHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessAddressHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousBusinessAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BusinessRegistrationHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BusinessRegistrationHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousRegistrationNumber" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *                             &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LegalFormHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalFormHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousLegalForm" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CapitalHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapitalHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousCapitalAmount" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://gateway.dnb.com/getProduct>AmountType">
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeesInformationHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EmployeesInformationHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="PreviousEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MiscellaneousHistory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MiscellaneousHistoryEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="PreviousInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
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
@XmlType(name = "SubjectHistoryInformationType", propOrder = {
    "businessNameHistory",
    "businessAddressHistory",
    "businessRegistrationHistory",
    "legalFormHistory",
    "capitalHistory",
    "employeesInformationHistory",
    "miscellaneousHistory"
})
public class SubjectHistoryInformationType {

    @XmlElement(name = "BusinessNameHistory")
    protected SubjectHistoryInformationType.BusinessNameHistory businessNameHistory;
    @XmlElement(name = "BusinessAddressHistory")
    protected SubjectHistoryInformationType.BusinessAddressHistory businessAddressHistory;
    @XmlElement(name = "BusinessRegistrationHistory")
    protected SubjectHistoryInformationType.BusinessRegistrationHistory businessRegistrationHistory;
    @XmlElement(name = "LegalFormHistory")
    protected SubjectHistoryInformationType.LegalFormHistory legalFormHistory;
    @XmlElement(name = "CapitalHistory")
    protected SubjectHistoryInformationType.CapitalHistory capitalHistory;
    @XmlElement(name = "EmployeesInformationHistory")
    protected SubjectHistoryInformationType.EmployeesInformationHistory employeesInformationHistory;
    @XmlElement(name = "MiscellaneousHistory")
    protected SubjectHistoryInformationType.MiscellaneousHistory miscellaneousHistory;

    /**
     * Gets the value of the businessNameHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.BusinessNameHistory }
     *     
     */
    public SubjectHistoryInformationType.BusinessNameHistory getBusinessNameHistory() {
        return businessNameHistory;
    }

    /**
     * Sets the value of the businessNameHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.BusinessNameHistory }
     *     
     */
    public void setBusinessNameHistory(SubjectHistoryInformationType.BusinessNameHistory value) {
        this.businessNameHistory = value;
    }

    /**
     * Gets the value of the businessAddressHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.BusinessAddressHistory }
     *     
     */
    public SubjectHistoryInformationType.BusinessAddressHistory getBusinessAddressHistory() {
        return businessAddressHistory;
    }

    /**
     * Sets the value of the businessAddressHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.BusinessAddressHistory }
     *     
     */
    public void setBusinessAddressHistory(SubjectHistoryInformationType.BusinessAddressHistory value) {
        this.businessAddressHistory = value;
    }

    /**
     * Gets the value of the businessRegistrationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.BusinessRegistrationHistory }
     *     
     */
    public SubjectHistoryInformationType.BusinessRegistrationHistory getBusinessRegistrationHistory() {
        return businessRegistrationHistory;
    }

    /**
     * Sets the value of the businessRegistrationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.BusinessRegistrationHistory }
     *     
     */
    public void setBusinessRegistrationHistory(SubjectHistoryInformationType.BusinessRegistrationHistory value) {
        this.businessRegistrationHistory = value;
    }

    /**
     * Gets the value of the legalFormHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.LegalFormHistory }
     *     
     */
    public SubjectHistoryInformationType.LegalFormHistory getLegalFormHistory() {
        return legalFormHistory;
    }

    /**
     * Sets the value of the legalFormHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.LegalFormHistory }
     *     
     */
    public void setLegalFormHistory(SubjectHistoryInformationType.LegalFormHistory value) {
        this.legalFormHistory = value;
    }

    /**
     * Gets the value of the capitalHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.CapitalHistory }
     *     
     */
    public SubjectHistoryInformationType.CapitalHistory getCapitalHistory() {
        return capitalHistory;
    }

    /**
     * Sets the value of the capitalHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.CapitalHistory }
     *     
     */
    public void setCapitalHistory(SubjectHistoryInformationType.CapitalHistory value) {
        this.capitalHistory = value;
    }

    /**
     * Gets the value of the employeesInformationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.EmployeesInformationHistory }
     *     
     */
    public SubjectHistoryInformationType.EmployeesInformationHistory getEmployeesInformationHistory() {
        return employeesInformationHistory;
    }

    /**
     * Sets the value of the employeesInformationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.EmployeesInformationHistory }
     *     
     */
    public void setEmployeesInformationHistory(SubjectHistoryInformationType.EmployeesInformationHistory value) {
        this.employeesInformationHistory = value;
    }

    /**
     * Gets the value of the miscellaneousHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHistoryInformationType.MiscellaneousHistory }
     *     
     */
    public SubjectHistoryInformationType.MiscellaneousHistory getMiscellaneousHistory() {
        return miscellaneousHistory;
    }

    /**
     * Sets the value of the miscellaneousHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHistoryInformationType.MiscellaneousHistory }
     *     
     */
    public void setMiscellaneousHistory(SubjectHistoryInformationType.MiscellaneousHistory value) {
        this.miscellaneousHistory = value;
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
     *         &lt;element name="BusinessAddressHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousBusinessAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "businessAddressHistoryEntry"
    })
    public static class BusinessAddressHistory {

        @XmlElement(name = "BusinessAddressHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.BusinessAddressHistory.BusinessAddressHistoryEntry> businessAddressHistoryEntry;

        /**
         * Gets the value of the businessAddressHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessAddressHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessAddressHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.BusinessAddressHistory.BusinessAddressHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.BusinessAddressHistory.BusinessAddressHistoryEntry> getBusinessAddressHistoryEntry() {
            if (businessAddressHistoryEntry == null) {
                businessAddressHistoryEntry = new ArrayList<SubjectHistoryInformationType.BusinessAddressHistory.BusinessAddressHistoryEntry>();
            }
            return this.businessAddressHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousBusinessAddress" type="{http://gateway.dnb.com/getProduct}AddressType" minOccurs="0"/>
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
            "previousBusinessAddress"
        })
        public static class BusinessAddressHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousBusinessAddress")
            protected AddressType previousBusinessAddress;

            /**
             * Gets the value of the previousBusinessAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressType }
             *     
             */
            public AddressType getPreviousBusinessAddress() {
                return previousBusinessAddress;
            }

            /**
             * Sets the value of the previousBusinessAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressType }
             *     
             */
            public void setPreviousBusinessAddress(AddressType value) {
                this.previousBusinessAddress = value;
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
     *         &lt;element name="BusinessNameHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousBusinessName" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "businessNameHistoryEntry"
    })
    public static class BusinessNameHistory {

        @XmlElement(name = "BusinessNameHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry> businessNameHistoryEntry;

        /**
         * Gets the value of the businessNameHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessNameHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessNameHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry> getBusinessNameHistoryEntry() {
            if (businessNameHistoryEntry == null) {
                businessNameHistoryEntry = new ArrayList<SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry>();
            }
            return this.businessNameHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousBusinessName" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "previousBusinessName"
        })
        public static class BusinessNameHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousBusinessName")
            protected SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.PreviousBusinessName previousBusinessName;

            /**
             * Gets the value of the previousBusinessName property.
             * 
             * @return
             *     possible object is
             *     {@link SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.PreviousBusinessName }
             *     
             */
            public SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.PreviousBusinessName getPreviousBusinessName() {
                return previousBusinessName;
            }

            /**
             * Sets the value of the previousBusinessName property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.PreviousBusinessName }
             *     
             */
            public void setPreviousBusinessName(SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.PreviousBusinessName value) {
                this.previousBusinessName = value;
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
            public static class PreviousBusinessName {

                @XmlValue
                protected String value;

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
     *         &lt;element name="BusinessRegistrationHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousRegistrationNumber" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
     *                   &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "businessRegistrationHistoryEntry"
    })
    public static class BusinessRegistrationHistory {

        @XmlElement(name = "BusinessRegistrationHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry> businessRegistrationHistoryEntry;

        /**
         * Gets the value of the businessRegistrationHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessRegistrationHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessRegistrationHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry> getBusinessRegistrationHistoryEntry() {
            if (businessRegistrationHistoryEntry == null) {
                businessRegistrationHistoryEntry = new ArrayList<SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry>();
            }
            return this.businessRegistrationHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousRegistrationNumber" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}EntityTypeandPriority"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistrationStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
         *         &lt;element name="RegistrationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistrationIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "previousRegistrationNumber",
            "registrationStatus",
            "registrationStartDate",
            "registrationLocation",
            "registrationIssuer"
        })
        public static class BusinessRegistrationHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousRegistrationNumber")
            protected SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.PreviousRegistrationNumber previousRegistrationNumber;
            @XmlElement(name = "RegistrationStatus")
            protected String registrationStatus;
            @XmlElement(name = "RegistrationStartDate")
            protected DNBDate registrationStartDate;
            @XmlElement(name = "RegistrationLocation")
            protected String registrationLocation;
            @XmlElement(name = "RegistrationIssuer")
            protected String registrationIssuer;

            /**
             * Gets the value of the previousRegistrationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.PreviousRegistrationNumber }
             *     
             */
            public SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.PreviousRegistrationNumber getPreviousRegistrationNumber() {
                return previousRegistrationNumber;
            }

            /**
             * Sets the value of the previousRegistrationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.PreviousRegistrationNumber }
             *     
             */
            public void setPreviousRegistrationNumber(SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.PreviousRegistrationNumber value) {
                this.previousRegistrationNumber = value;
            }

            /**
             * Gets the value of the registrationStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationStatus() {
                return registrationStatus;
            }

            /**
             * Sets the value of the registrationStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationStatus(String value) {
                this.registrationStatus = value;
            }

            /**
             * Gets the value of the registrationStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link DNBDate }
             *     
             */
            public DNBDate getRegistrationStartDate() {
                return registrationStartDate;
            }

            /**
             * Sets the value of the registrationStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link DNBDate }
             *     
             */
            public void setRegistrationStartDate(DNBDate value) {
                this.registrationStartDate = value;
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
             * Gets the value of the registrationIssuer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationIssuer() {
                return registrationIssuer;
            }

            /**
             * Sets the value of the registrationIssuer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationIssuer(String value) {
                this.registrationIssuer = value;
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
            public static class PreviousRegistrationNumber {

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
     *         &lt;element name="CapitalHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousCapitalAmount" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://gateway.dnb.com/getProduct>AmountType">
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "capitalHistoryEntry"
    })
    public static class CapitalHistory {

        @XmlElement(name = "CapitalHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry> capitalHistoryEntry;

        /**
         * Gets the value of the capitalHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the capitalHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCapitalHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry> getCapitalHistoryEntry() {
            if (capitalHistoryEntry == null) {
                capitalHistoryEntry = new ArrayList<SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry>();
            }
            return this.capitalHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousCapitalAmount" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://gateway.dnb.com/getProduct>AmountType">
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "previousCapitalAmount"
        })
        public static class CapitalHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousCapitalAmount")
            protected SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount previousCapitalAmount;

            /**
             * Gets the value of the previousCapitalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount }
             *     
             */
            public SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount getPreviousCapitalAmount() {
                return previousCapitalAmount;
            }

            /**
             * Sets the value of the previousCapitalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount }
             *     
             */
            public void setPreviousCapitalAmount(SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.PreviousCapitalAmount value) {
                this.previousCapitalAmount = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://gateway.dnb.com/getProduct>AmountType">
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PreviousCapitalAmount
                extends AmountType
            {


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
     *         &lt;element name="EmployeesInformationHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "employeesInformationHistoryEntry"
    })
    public static class EmployeesInformationHistory {

        @XmlElement(name = "EmployeesInformationHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.EmployeesInformationHistory.EmployeesInformationHistoryEntry> employeesInformationHistoryEntry;

        /**
         * Gets the value of the employeesInformationHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employeesInformationHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmployeesInformationHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.EmployeesInformationHistory.EmployeesInformationHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.EmployeesInformationHistory.EmployeesInformationHistoryEntry> getEmployeesInformationHistoryEntry() {
            if (employeesInformationHistoryEntry == null) {
                employeesInformationHistoryEntry = new ArrayList<SubjectHistoryInformationType.EmployeesInformationHistory.EmployeesInformationHistoryEntry>();
            }
            return this.employeesInformationHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MinimumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="MaximumEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="DataProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ConsolidatedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "previousEmployeesQuantity",
            "minimumEmployeesQuantity",
            "maximumEmployeesQuantity",
            "dataProvider",
            "consolidatedIndicator"
        })
        public static class EmployeesInformationHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousEmployeesQuantity")
            protected BigInteger previousEmployeesQuantity;
            @XmlElement(name = "MinimumEmployeesQuantity")
            protected BigInteger minimumEmployeesQuantity;
            @XmlElement(name = "MaximumEmployeesQuantity")
            protected BigInteger maximumEmployeesQuantity;
            @XmlElement(name = "DataProvider")
            protected String dataProvider;
            @XmlElement(name = "ConsolidatedIndicator")
            protected Boolean consolidatedIndicator;

            /**
             * Gets the value of the previousEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPreviousEmployeesQuantity() {
                return previousEmployeesQuantity;
            }

            /**
             * Sets the value of the previousEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPreviousEmployeesQuantity(BigInteger value) {
                this.previousEmployeesQuantity = value;
            }

            /**
             * Gets the value of the minimumEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMinimumEmployeesQuantity() {
                return minimumEmployeesQuantity;
            }

            /**
             * Sets the value of the minimumEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMinimumEmployeesQuantity(BigInteger value) {
                this.minimumEmployeesQuantity = value;
            }

            /**
             * Gets the value of the maximumEmployeesQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaximumEmployeesQuantity() {
                return maximumEmployeesQuantity;
            }

            /**
             * Sets the value of the maximumEmployeesQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaximumEmployeesQuantity(BigInteger value) {
                this.maximumEmployeesQuantity = value;
            }

            /**
             * Gets the value of the dataProvider property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataProvider() {
                return dataProvider;
            }

            /**
             * Sets the value of the dataProvider property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataProvider(String value) {
                this.dataProvider = value;
            }

            /**
             * Gets the value of the consolidatedIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isConsolidatedIndicator() {
                return consolidatedIndicator;
            }

            /**
             * Sets the value of the consolidatedIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setConsolidatedIndicator(Boolean value) {
                this.consolidatedIndicator = value;
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
     *         &lt;element name="LegalFormHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="PreviousLegalForm" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "legalFormHistoryEntry"
    })
    public static class LegalFormHistory {

        @XmlElement(name = "LegalFormHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry> legalFormHistoryEntry;

        /**
         * Gets the value of the legalFormHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legalFormHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegalFormHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry> getLegalFormHistoryEntry() {
            if (legalFormHistoryEntry == null) {
                legalFormHistoryEntry = new ArrayList<SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry>();
            }
            return this.legalFormHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence>
         *         &lt;element name="PreviousLegalForm" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "previousLegalForm"
        })
        public static class LegalFormHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousLegalForm")
            protected SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.PreviousLegalForm previousLegalForm;

            /**
             * Gets the value of the previousLegalForm property.
             * 
             * @return
             *     possible object is
             *     {@link SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.PreviousLegalForm }
             *     
             */
            public SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.PreviousLegalForm getPreviousLegalForm() {
                return previousLegalForm;
            }

            /**
             * Sets the value of the previousLegalForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.PreviousLegalForm }
             *     
             */
            public void setPreviousLegalForm(SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.PreviousLegalForm value) {
                this.previousLegalForm = value;
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
             *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
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
            public static class PreviousLegalForm {

                @XmlValue
                protected String value;
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
     *         &lt;element name="MiscellaneousHistoryEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="PreviousInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "miscellaneousHistoryEntry"
    })
    public static class MiscellaneousHistory {

        @XmlElement(name = "MiscellaneousHistoryEntry", required = true)
        protected List<SubjectHistoryInformationType.MiscellaneousHistory.MiscellaneousHistoryEntry> miscellaneousHistoryEntry;

        /**
         * Gets the value of the miscellaneousHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miscellaneousHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiscellaneousHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SubjectHistoryInformationType.MiscellaneousHistory.MiscellaneousHistoryEntry }
         * 
         * 
         */
        public List<SubjectHistoryInformationType.MiscellaneousHistory.MiscellaneousHistoryEntry> getMiscellaneousHistoryEntry() {
            if (miscellaneousHistoryEntry == null) {
                miscellaneousHistoryEntry = new ArrayList<SubjectHistoryInformationType.MiscellaneousHistory.MiscellaneousHistoryEntry>();
            }
            return this.miscellaneousHistoryEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://gateway.dnb.com/getProduct}HistoricalInformationEntryType">
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="PreviousInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "previousInformation"
        })
        public static class MiscellaneousHistoryEntry
            extends HistoricalInformationEntryType
        {

            @XmlElement(name = "PreviousInformation")
            protected String previousInformation;

            /**
             * Gets the value of the previousInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreviousInformation() {
                return previousInformation;
            }

            /**
             * Sets the value of the previousInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreviousInformation(String value) {
                this.previousInformation = value;
            }

        }

    }

}
