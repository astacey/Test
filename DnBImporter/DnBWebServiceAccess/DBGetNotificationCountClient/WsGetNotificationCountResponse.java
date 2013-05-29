
package DBGetNotificationCountClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetNotificationCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetNotificationCountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNotificationCountResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}getNotificationCountResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetNotificationCountResponse", propOrder = {
    "getNotificationCountResponse"
})
public class WsGetNotificationCountResponse {

    @XmlElement(required = true, nillable = true)
    protected GetNotificationCountResponse getNotificationCountResponse;

    /**
     * Gets the value of the getNotificationCountResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationCountResponse }
     *     
     */
    public GetNotificationCountResponse getGetNotificationCountResponse() {
        return getNotificationCountResponse;
    }

    /**
     * Sets the value of the getNotificationCountResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationCountResponse }
     *     
     */
    public void setGetNotificationCountResponse(GetNotificationCountResponse value) {
        this.getNotificationCountResponse = value;
    }

}
