
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Immediate_Delivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immediate_Delivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rpt_Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ignore_Missing_Fields" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_Copy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Not_From_Cache" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immediate_Delivery", propOrder = {
    "mode",
    "format",
    "rptLanguage",
    "ignoreMissingFields",
    "email",
    "emailCopy",
    "notFromCache"
})
public class ImmediateDelivery {

    @XmlElement(name = "Mode", required = true, nillable = true)
    protected String mode;
    @XmlElement(name = "Format", required = true, nillable = true)
    protected String format;
    @XmlElementRef(name = "Rpt_Language", type = JAXBElement.class)
    protected JAXBElement<String> rptLanguage;
    @XmlElementRef(name = "Ignore_Missing_Fields", type = JAXBElement.class)
    protected JAXBElement<String> ignoreMissingFields;
    @XmlElementRef(name = "Email", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Email_Copy", type = JAXBElement.class)
    protected JAXBElement<String> emailCopy;
    @XmlElementRef(name = "Not_From_Cache", type = JAXBElement.class)
    protected JAXBElement<String> notFromCache;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the rptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRptLanguage() {
        return rptLanguage;
    }

    /**
     * Sets the value of the rptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRptLanguage(JAXBElement<String> value) {
        this.rptLanguage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ignoreMissingFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIgnoreMissingFields() {
        return ignoreMissingFields;
    }

    /**
     * Sets the value of the ignoreMissingFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIgnoreMissingFields(JAXBElement<String> value) {
        this.ignoreMissingFields = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailCopy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailCopy() {
        return emailCopy;
    }

    /**
     * Sets the value of the emailCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailCopy(JAXBElement<String> value) {
        this.emailCopy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the notFromCache property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotFromCache() {
        return notFromCache;
    }

    /**
     * Sets the value of the notFromCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotFromCache(JAXBElement<String> value) {
        this.notFromCache = ((JAXBElement<String> ) value);
    }

}
