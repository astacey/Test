
package DBModifyRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_ModifyRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_ModifyRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifyRegistrationRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}modifyRegistrationRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_ModifyRegistration", propOrder = {
    "modifyRegistrationRequest"
})
public class WsModifyRegistration {

    @XmlElement(required = true, nillable = true)
    protected ModifyRegistrationRequest modifyRegistrationRequest;

    /**
     * Gets the value of the modifyRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyRegistrationRequest }
     *     
     */
    public ModifyRegistrationRequest getModifyRegistrationRequest() {
        return modifyRegistrationRequest;
    }

    /**
     * Sets the value of the modifyRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyRegistrationRequest }
     *     
     */
    public void setModifyRegistrationRequest(ModifyRegistrationRequest value) {
        this.modifyRegistrationRequest = value;
    }

}
