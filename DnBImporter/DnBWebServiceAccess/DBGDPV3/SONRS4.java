
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SONRS4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SONRS4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STATUS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}STATUS7"/>
 *         &lt;element name="APPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DTSERVER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LANGUAGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SONRS4", propOrder = {
    "status",
    "appid",
    "dtserver",
    "language"
})
public class SONRS4 {

    @XmlElement(name = "STATUS", required = true, nillable = true)
    protected STATUS7 status;
    @XmlElementRef(name = "APPID", type = JAXBElement.class)
    protected JAXBElement<String> appid;
    @XmlElementRef(name = "DTSERVER", type = JAXBElement.class)
    protected JAXBElement<String> dtserver;
    @XmlElementRef(name = "LANGUAGE", type = JAXBElement.class)
    protected JAXBElement<String> language;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link STATUS7 }
     *     
     */
    public STATUS7 getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link STATUS7 }
     *     
     */
    public void setSTATUS(STATUS7 value) {
        this.status = value;
    }

    /**
     * Gets the value of the appid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAPPID() {
        return appid;
    }

    /**
     * Sets the value of the appid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAPPID(JAXBElement<String> value) {
        this.appid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dtserver property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDTSERVER() {
        return dtserver;
    }

    /**
     * Sets the value of the dtserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDTSERVER(JAXBElement<String> value) {
        this.dtserver = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLANGUAGE() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLANGUAGE(JAXBElement<String> value) {
        this.language = ((JAXBElement<String> ) value);
    }

}
