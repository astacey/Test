
package DBGetRegistrationActivityClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetRegistrationActivityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetRegistrationActivityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRegistrationActivityResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity}getRegistrationActivityResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetRegistrationActivityResponse", propOrder = {
    "getRegistrationActivityResponse"
})
public class WsGetRegistrationActivityResponse {

    @XmlElement(required = true, nillable = true)
    protected GetRegistrationActivityResponse getRegistrationActivityResponse;

    /**
     * Gets the value of the getRegistrationActivityResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationActivityResponse }
     *     
     */
    public GetRegistrationActivityResponse getGetRegistrationActivityResponse() {
        return getRegistrationActivityResponse;
    }

    /**
     * Sets the value of the getRegistrationActivityResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationActivityResponse }
     *     
     */
    public void setGetRegistrationActivityResponse(GetRegistrationActivityResponse value) {
        this.getRegistrationActivityResponse = value;
    }

}
