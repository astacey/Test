
package DBGetRegistrationActivityClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GETREGNACTVRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GETREGNACTVRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REQ_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}USERRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GETREGNACTVRS", propOrder = {
    "reqid",
    "userrs"
})
public class GETREGNACTVRS {

    @XmlElementRef(name = "REQ_ID", type = JAXBElement.class)
    protected JAXBElement<String> reqid;
    @XmlElementRef(name = "USERRS", type = JAXBElement.class)
    protected JAXBElement<USERRS> userrs;

    /**
     * Gets the value of the reqid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getREQID() {
        return reqid;
    }

    /**
     * Sets the value of the reqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setREQID(JAXBElement<String> value) {
        this.reqid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the userrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link USERRS }{@code >}
     *     
     */
    public JAXBElement<USERRS> getUSERRS() {
        return userrs;
    }

    /**
     * Sets the value of the userrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link USERRS }{@code >}
     *     
     */
    public void setUSERRS(JAXBElement<USERRS> value) {
        this.userrs = ((JAXBElement<USERRS> ) value);
    }

}
