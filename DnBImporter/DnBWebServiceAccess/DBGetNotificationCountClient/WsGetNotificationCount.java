
package DBGetNotificationCountClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetNotificationCount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetNotificationCount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getNotificationCountRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}getNotificationCountRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetNotificationCount", propOrder = {
    "getNotificationCountRequest"
})
public class WsGetNotificationCount {

    @XmlElement(required = true, nillable = true)
    protected GetNotificationCountRequest getNotificationCountRequest;

    /**
     * Gets the value of the getNotificationCountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationCountRequest }
     *     
     */
    public GetNotificationCountRequest getGetNotificationCountRequest() {
        return getNotificationCountRequest;
    }

    /**
     * Sets the value of the getNotificationCountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationCountRequest }
     *     
     */
    public void setGetNotificationCountRequest(GetNotificationCountRequest value) {
        this.getNotificationCountRequest = value;
    }

}
