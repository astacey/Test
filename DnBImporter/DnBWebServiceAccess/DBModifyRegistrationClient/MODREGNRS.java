
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MODREGNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MODREGNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USERRS" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}ArrayOfUSERRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MODREGNRS", propOrder = {
    "userrs"
})
public class MODREGNRS {

    @XmlElementRef(name = "USERRS", type = JAXBElement.class)
    protected JAXBElement<ArrayOfUSERRS> userrs;

    /**
     * Gets the value of the userrs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUSERRS }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUSERRS> getUSERRS() {
        return userrs;
    }

    /**
     * Sets the value of the userrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUSERRS }{@code >}
     *     
     */
    public void setUSERRS(JAXBElement<ArrayOfUSERRS> value) {
        this.userrs = ((JAXBElement<ArrayOfUSERRS> ) value);
    }

}
