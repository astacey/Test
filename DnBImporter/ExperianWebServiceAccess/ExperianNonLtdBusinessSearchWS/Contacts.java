
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contacts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contacts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactForename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contacts", propOrder = {
    "contactTitle",
    "contactForename",
    "contactSurname",
    "contactPosition"
})
public class Contacts {

    @XmlElement(name = "ContactTitle")
    protected String contactTitle;
    @XmlElement(name = "ContactForename")
    protected String contactForename;
    @XmlElement(name = "ContactSurname")
    protected String contactSurname;
    @XmlElement(name = "ContactPosition")
    protected String contactPosition;

    /**
     * Gets the value of the contactTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTitle() {
        return contactTitle;
    }

    /**
     * Sets the value of the contactTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTitle(String value) {
        this.contactTitle = value;
    }

    /**
     * Gets the value of the contactForename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactForename() {
        return contactForename;
    }

    /**
     * Sets the value of the contactForename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactForename(String value) {
        this.contactForename = value;
    }

    /**
     * Gets the value of the contactSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSurname() {
        return contactSurname;
    }

    /**
     * Sets the value of the contactSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSurname(String value) {
        this.contactSurname = value;
    }

    /**
     * Gets the value of the contactPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPosition() {
        return contactPosition;
    }

    /**
     * Sets the value of the contactPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPosition(String value) {
        this.contactPosition = value;
    }

}
