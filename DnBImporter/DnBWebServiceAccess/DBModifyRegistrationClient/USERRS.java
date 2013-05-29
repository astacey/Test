
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USERRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USERRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PFLRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ArrayOfPFLRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USERRS", propOrder = {
    "userid",
    "pflrs"
})
public class USERRS {

    @XmlElementRef(name = "USERID", type = JAXBElement.class)
    protected JAXBElement<String> userid;
    @XmlElementRef(name = "PFLRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfPFLRS> pflrs;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUSERID(JAXBElement<String> value) {
        this.userid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pflrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPFLRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPFLRS> getPFLRS() {
        return pflrs;
    }

    /**
     * Sets the value of the pflrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPFLRS }{@code >}
     *     
     */
    public void setPFLRS(JAXBElement<ArrayOfPFLRS> value) {
        this.pflrs = ((JAXBElement<ArrayOfPFLRS> ) value);
    }

}
