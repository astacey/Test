
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STATUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STATUS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEVERITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TECH_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUPPORT_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STATUS", propOrder = {
    "code",
    "severity",
    "message",
    "techmessage",
    "supportmessage"
})
public class STATUS {

    @XmlElement(name = "CODE", required = true, nillable = true)
    protected String code;
    @XmlElement(name = "SEVERITY", required = true, nillable = true)
    protected String severity;
    @XmlElement(name = "MESSAGE", required = true, nillable = true)
    protected String message;
    @XmlElementRef(name = "TECH_MESSAGE", type = JAXBElement.class)
    protected JAXBElement<String> techmessage;
    @XmlElementRef(name = "SUPPORT_MESSAGE", type = JAXBElement.class)
    protected JAXBElement<String> supportmessage;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEVERITY() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEVERITY(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGE() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGE(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the techmessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTECHMESSAGE() {
        return techmessage;
    }

    /**
     * Sets the value of the techmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTECHMESSAGE(JAXBElement<String> value) {
        this.techmessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the supportmessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUPPORTMESSAGE() {
        return supportmessage;
    }

    /**
     * Sets the value of the supportmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUPPORTMESSAGE(JAXBElement<String> value) {
        this.supportmessage = ((JAXBElement<String> ) value);
    }

}
