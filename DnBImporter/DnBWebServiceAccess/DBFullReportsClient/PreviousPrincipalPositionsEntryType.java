
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PreviousPrincipalPositionsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousPrincipalPositionsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrincipalPosition">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AppointmentStartDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AppointmentExpirationDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="AppointmentEndDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousPrincipalPositionsEntryType", propOrder = {
    "principalPosition",
    "appointmentStartDate",
    "appointmentExpirationDate",
    "appointmentEndDate"
})
public class PreviousPrincipalPositionsEntryType {

    @XmlElement(name = "PrincipalPosition", required = true)
    protected PreviousPrincipalPositionsEntryType.PrincipalPosition principalPosition;
    @XmlElement(name = "AppointmentStartDate")
    protected DNBDate appointmentStartDate;
    @XmlElement(name = "AppointmentExpirationDate")
    protected DNBDate appointmentExpirationDate;
    @XmlElement(name = "AppointmentEndDate")
    protected DNBDate appointmentEndDate;

    /**
     * Gets the value of the principalPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousPrincipalPositionsEntryType.PrincipalPosition }
     *     
     */
    public PreviousPrincipalPositionsEntryType.PrincipalPosition getPrincipalPosition() {
        return principalPosition;
    }

    /**
     * Sets the value of the principalPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousPrincipalPositionsEntryType.PrincipalPosition }
     *     
     */
    public void setPrincipalPosition(PreviousPrincipalPositionsEntryType.PrincipalPosition value) {
        this.principalPosition = value;
    }

    /**
     * Gets the value of the appointmentStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAppointmentStartDate() {
        return appointmentStartDate;
    }

    /**
     * Sets the value of the appointmentStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAppointmentStartDate(DNBDate value) {
        this.appointmentStartDate = value;
    }

    /**
     * Gets the value of the appointmentExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAppointmentExpirationDate() {
        return appointmentExpirationDate;
    }

    /**
     * Sets the value of the appointmentExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAppointmentExpirationDate(DNBDate value) {
        this.appointmentExpirationDate = value;
    }

    /**
     * Gets the value of the appointmentEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getAppointmentEndDate() {
        return appointmentEndDate;
    }

    /**
     * Sets the value of the appointmentEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setAppointmentEndDate(DNBDate value) {
        this.appointmentEndDate = value;
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
    public static class PrincipalPosition {

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
