
package DBAddRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_AddRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_AddRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRegistrationResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/AddRegistration}addRegistrationResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_AddRegistrationResponse", propOrder = {
    "addRegistrationResponse"
})
public class WsAddRegistrationResponse {

    @XmlElement(required = true, nillable = true)
    protected AddRegistrationResponse addRegistrationResponse;

    /**
     * Gets the value of the addRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AddRegistrationResponse }
     *     
     */
    public AddRegistrationResponse getAddRegistrationResponse() {
        return addRegistrationResponse;
    }

    /**
     * Sets the value of the addRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRegistrationResponse }
     *     
     */
    public void setAddRegistrationResponse(AddRegistrationResponse value) {
        this.addRegistrationResponse = value;
    }

}
