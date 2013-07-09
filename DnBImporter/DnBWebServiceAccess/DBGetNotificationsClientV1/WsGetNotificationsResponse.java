
package DBGetNotificationsClientV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetNotificationsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetNotificationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNotificationsResponse" type="{https://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V1/wsp_GetNotifications_V1}getNotificationsResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetNotificationsResponse", propOrder = {
    "getNotificationsResponse"
})
public class WsGetNotificationsResponse {

    @XmlElement(required = true, nillable = true)
    protected GetNotificationsResponse getNotificationsResponse;

    /**
     * Gets the value of the getNotificationsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationsResponse }
     *     
     */
    public GetNotificationsResponse getGetNotificationsResponse() {
        return getNotificationsResponse;
    }

    /**
     * Sets the value of the getNotificationsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationsResponse }
     *     
     */
    public void setGetNotificationsResponse(GetNotificationsResponse value) {
        this.getNotificationsResponse = value;
    }

}
