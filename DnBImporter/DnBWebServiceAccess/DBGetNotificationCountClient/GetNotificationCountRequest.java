
package DBGetNotificationCountClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationCountRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationCountRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getNotificationCountRequestData" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount}getNotificationCountRequestData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationCountRequest", propOrder = {
    "userId",
    "password",
    "getNotificationCountRequestData"
})
public class GetNotificationCountRequest {

    @XmlElement(name = "UserId", required = true, nillable = true)
    protected String userId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected GetNotificationCountRequestData getNotificationCountRequestData;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the getNotificationCountRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationCountRequestData }
     *     
     */
    public GetNotificationCountRequestData getGetNotificationCountRequestData() {
        return getNotificationCountRequestData;
    }

    /**
     * Sets the value of the getNotificationCountRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationCountRequestData }
     *     
     */
    public void setGetNotificationCountRequestData(GetNotificationCountRequestData value) {
        this.getNotificationCountRequestData = value;
    }

}
