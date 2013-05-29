
package DBGetRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetRegistrationListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetRegistrationListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRegistrationListResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList}getRegistrationListResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetRegistrationListResponse", propOrder = {
    "getRegistrationListResponse"
})
public class WsGetRegistrationListResponse {

    @XmlElement(required = true, nillable = true)
    protected GetRegistrationListResponse getRegistrationListResponse;

    /**
     * Gets the value of the getRegistrationListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationListResponse }
     *     
     */
    public GetRegistrationListResponse getGetRegistrationListResponse() {
        return getRegistrationListResponse;
    }

    /**
     * Sets the value of the getRegistrationListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationListResponse }
     *     
     */
    public void setGetRegistrationListResponse(GetRegistrationListResponse value) {
        this.getRegistrationListResponse = value;
    }

}
