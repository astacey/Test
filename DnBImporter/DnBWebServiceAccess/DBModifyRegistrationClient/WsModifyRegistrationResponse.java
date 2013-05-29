
package DBModifyRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_ModifyRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_ModifyRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyRegistrationResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}modifyRegistrationResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_ModifyRegistrationResponse", propOrder = {
    "modifyRegistrationResponse"
})
public class WsModifyRegistrationResponse {

    @XmlElement(required = true, nillable = true)
    protected ModifyRegistrationResponse modifyRegistrationResponse;

    /**
     * Gets the value of the modifyRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyRegistrationResponse }
     *     
     */
    public ModifyRegistrationResponse getModifyRegistrationResponse() {
        return modifyRegistrationResponse;
    }

    /**
     * Sets the value of the modifyRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyRegistrationResponse }
     *     
     */
    public void setModifyRegistrationResponse(ModifyRegistrationResponse value) {
        this.modifyRegistrationResponse = value;
    }

}
