
package ExperianAlertsRequestWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlertsMessageOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertsMessageOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertMessage" type="{http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes}AlertMessage" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AlertsMessageOutput", namespace = "http://schema.uk.experian.com/experian/bi/alertsrequest/intr/v100/alertsrequest", propOrder = {
    "alertMessage",
    "error"
})
public class AlertsMessageOutput {

    @XmlElement(name = "AlertMessage")
    protected List<AlertMessage> alertMessage;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "GeneratedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedOn;

    /**
     * Gets the value of the alertMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertMessage }
     * 
     * 
     */
    public List<AlertMessage> getAlertMessage() {
        if (alertMessage == null) {
            alertMessage = new ArrayList<AlertMessage>();
        }
        return this.alertMessage;
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
