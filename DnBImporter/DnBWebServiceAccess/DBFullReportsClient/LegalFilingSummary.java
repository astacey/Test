
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
 * <p>Java class for LegalFilingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalFilingSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="AccountsReferenceDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LatestAccountsFiledDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LatestAnnualReturnDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalFilingSummary", propOrder = {
    "registrationNumbers",
    "accountsReferenceDate",
    "latestAccountsFiledDate",
    "latestAnnualReturnDate"
})
public class LegalFilingSummary {

    @XmlElement(name = "RegistrationNumbers")
    protected List<LegalFilingSummary.RegistrationNumbers> registrationNumbers;
    @XmlElement(name = "AccountsReferenceDate")
    protected DNBDate accountsReferenceDate;
    @XmlElement(name = "LatestAccountsFiledDate")
    protected DNBDate latestAccountsFiledDate;
    @XmlElement(name = "LatestAnnualReturnDate")
    protected DNBDate latestAnnualReturnDate;

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
     * {@link LegalFilingSummary.RegistrationNumbers }
     * 
     * 
     */
    public List<LegalFilingSummary.RegistrationNumbers> getRegistrationNumbers() {
        if (registrationNumbers == null) {
            registrationNumbers = new ArrayList<LegalFilingSummary.RegistrationNumbers>();
        }
        return this.registrationNumbers;
    }

    /**
     * Gets the value of the accountsReferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAccountsReferenceDate() {
        return accountsReferenceDate;
    }

    /**
     * Sets the value of the accountsReferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAccountsReferenceDate(DNBDate value) {
        this.accountsReferenceDate = value;
    }

    /**
     * Gets the value of the latestAccountsFiledDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLatestAccountsFiledDate() {
        return latestAccountsFiledDate;
    }

    /**
     * Sets the value of the latestAccountsFiledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLatestAccountsFiledDate(DNBDate value) {
        this.latestAccountsFiledDate = value;
    }

    /**
     * Gets the value of the latestAnnualReturnDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLatestAnnualReturnDate() {
        return latestAnnualReturnDate;
    }

    /**
     * Sets the value of the latestAnnualReturnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLatestAnnualReturnDate(DNBDate value) {
        this.latestAnnualReturnDate = value;
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
        protected LegalFilingSummary.RegistrationNumbers.RegistrationNumber registrationNumber;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link LegalFilingSummary.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public LegalFilingSummary.RegistrationNumbers.RegistrationNumber getRegistrationNumber() {
            return registrationNumber;
        }

        /**
         * Sets the value of the registrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link LegalFilingSummary.RegistrationNumbers.RegistrationNumber }
         *     
         */
        public void setRegistrationNumber(LegalFilingSummary.RegistrationNumbers.RegistrationNumber value) {
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

}
