
package DBGetNotificationsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetNotifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetNotifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNotificationsRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications}getNotificationsRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetNotifications", propOrder = {
    "getNotificationsRequest"
})
public class WsGetNotifications {

    @XmlElement(required = true, nillable = true)
    protected GetNotificationsRequest getNotificationsRequest;

    /**
     * Gets the value of the getNotificationsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationsRequest }
     *     
     */
    public GetNotificationsRequest getGetNotificationsRequest() {
        return getNotificationsRequest;
    }

    /**
     * Sets the value of the getNotificationsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationsRequest }
     *     
     */
    public void setGetNotificationsRequest(GetNotificationsRequest value) {
        this.getNotificationsRequest = value;
    }

}
