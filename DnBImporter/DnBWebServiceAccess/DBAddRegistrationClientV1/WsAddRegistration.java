
package DBAddRegistrationClientV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_AddRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_AddRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRegistrationRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1}addRegistrationRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_AddRegistration", propOrder = {
    "addRegistrationRequest"
})
public class WsAddRegistration {

    @XmlElement(required = true, nillable = true)
    protected AddRegistrationRequest addRegistrationRequest;

    /**
     * Gets the value of the addRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AddRegistrationRequest }
     *     
     */
    public AddRegistrationRequest getAddRegistrationRequest() {
        return addRegistrationRequest;
    }

    /**
     * Sets the value of the addRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRegistrationRequest }
     *     
     */
    public void setAddRegistrationRequest(AddRegistrationRequest value) {
        this.addRegistrationRequest = value;
    }

}
