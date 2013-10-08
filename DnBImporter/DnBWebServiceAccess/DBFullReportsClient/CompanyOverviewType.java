
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
 * This type holds the overview business information about the subject.
 * 
 * <p>Java class for CompanyOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyOverviewType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="LegalForm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CEOName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCodes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LocalActivityCode">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyOverviewType", propOrder = {
    "businessStartDate",
    "legalForm",
    "ceoName",
    "localActivityCodes"
})
public class CompanyOverviewType {

    @XmlElement(name = "BusinessStartDate")
    protected DNBDate businessStartDate;
    @XmlElement(name = "LegalForm")
    protected CompanyOverviewType.LegalForm legalForm;
    @XmlElement(name = "CEOName")
    protected String ceoName;
    @XmlElement(name = "LocalActivityCodes")
    protected List<CompanyOverviewType.LocalActivityCodes> localActivityCodes;

    /**
     * Gets the value of the businessStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBusinessStartDate() {
        return businessStartDate;
    }

    /**
     * Sets the value of the businessStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBusinessStartDate(DNBDate value) {
        this.businessStartDate = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyOverviewType.LegalForm }
     *     
     */
    public CompanyOverviewType.LegalForm getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyOverviewType.LegalForm }
     *     
     */
    public void setLegalForm(CompanyOverviewType.LegalForm value) {
        this.legalForm = value;
    }

    /**
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOName(String value) {
        this.ceoName = value;
    }

    /**
     * Gets the value of the localActivityCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localActivityCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalActivityCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyOverviewType.LocalActivityCodes }
     * 
     * 
     */
    public List<CompanyOverviewType.LocalActivityCodes> getLocalActivityCodes() {
        if (localActivityCodes == null) {
            localActivityCodes = new ArrayList<CompanyOverviewType.LocalActivityCodes>();
        }
        return this.localActivityCodes;
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
    public static class LegalForm {

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
     *         &lt;element name="LocalActivityCode">
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
        "localActivityCode"
    })
    public static class LocalActivityCodes {

        @XmlElement(name = "LocalActivityCode", required = true)
        protected CompanyOverviewType.LocalActivityCodes.LocalActivityCode localActivityCode;

        /**
         * Gets the value of the localActivityCode property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyOverviewType.LocalActivityCodes.LocalActivityCode }
         *     
         */
        public CompanyOverviewType.LocalActivityCodes.LocalActivityCode getLocalActivityCode() {
            return localActivityCode;
        }

        /**
         * Sets the value of the localActivityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyOverviewType.LocalActivityCodes.LocalActivityCode }
         *     
         */
        public void setLocalActivityCode(CompanyOverviewType.LocalActivityCodes.LocalActivityCode value) {
            this.localActivityCode = value;
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
        public static class LocalActivityCode {

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
