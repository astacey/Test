
package ExperianAlertsAddRemoveWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertsAddRemoveInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertsAddRemoveInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Business" type="{http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes}Business"/>
 *         &lt;element name="Action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([a-zA-Z0-9]*)"/>
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClientReference" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([0-9a-zA-Z/\\&amp;()\-+,.'\ ])*"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubjectScheme">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z0-9]*"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "AlertsAddRemoveInput", propOrder = {
    "business",
    "action",
    "clientReference",
    "subjectScheme"
})
public class AlertsAddRemoveInput {

    @XmlElement(name = "Business", required = true)
    protected Business business;
    @XmlElement(name = "Action", required = true)
    protected String action;
    @XmlElement(name = "ClientReference")
    protected String clientReference;
    @XmlElement(name = "SubjectScheme", required = true)
    protected String subjectScheme;

    /**
     * Gets the value of the business property.
     * 
     * @return
     *     possible object is
     *     {@link Business }
     *     
     */
    public Business getBusiness() {
        return business;
    }

    /**
     * Sets the value of the business property.
     * 
     * @param value
     *     allowed object is
     *     {@link Business }
     *     
     */
    public void setBusiness(Business value) {
        this.business = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the subjectScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectScheme() {
        return subjectScheme;
    }

    /**
     * Sets the value of the subjectScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectScheme(String value) {
        this.subjectScheme = value;
    }

}
