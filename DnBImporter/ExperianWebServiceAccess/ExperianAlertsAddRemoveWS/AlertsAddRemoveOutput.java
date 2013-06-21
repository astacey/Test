
package ExperianAlertsAddRemoveWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlertsAddRemoveOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertsAddRemoveOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Confirmation" type="{http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes}Confirmation" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}Error" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GeneratedOn" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertsAddRemoveOutput", propOrder = {
    "confirmation",
    "error"
})
public class AlertsAddRemoveOutput {

    @XmlElement(name = "Confirmation")
    protected Confirmation confirmation;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "GeneratedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedOn;

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Confirmation }
     *     
     */
    public Confirmation getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confirmation }
     *     
     */
    public void setConfirmation(Confirmation value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the generatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedOn() {
        return generatedOn;
    }

    /**
     * Sets the value of the generatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedOn(XMLGregorianCalendar value) {
        this.generatedOn = value;
    }

}
