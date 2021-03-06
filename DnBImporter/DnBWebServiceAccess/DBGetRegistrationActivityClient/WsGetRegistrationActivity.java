
package DBGetRegistrationActivityClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetRegistrationActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetRegistrationActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRegistrationActivityRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}getRegistrationActivityRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetRegistrationActivity", propOrder = {
    "getRegistrationActivityRequest"
})
public class WsGetRegistrationActivity {

    @XmlElement(required = true, nillable = true)
    protected GetRegistrationActivityRequest getRegistrationActivityRequest;

    /**
     * Gets the value of the getRegistrationActivityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationActivityRequest }
     *     
     */
    public GetRegistrationActivityRequest getGetRegistrationActivityRequest() {
        return getRegistrationActivityRequest;
    }

    /**
     * Sets the value of the getRegistrationActivityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationActivityRequest }
     *     
     */
    public void setGetRegistrationActivityRequest(GetRegistrationActivityRequest value) {
        this.getRegistrationActivityRequest = value;
    }

}
