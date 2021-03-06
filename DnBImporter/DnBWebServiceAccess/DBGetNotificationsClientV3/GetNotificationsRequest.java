
package DBGetNotificationsClientV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socCode" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}socCode" minOccurs="0"/>
 *         &lt;element name="getNotificationsRequestData" type="{http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3}getNotificationsRequestData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNotificationsRequest", propOrder = {
    "userId",
    "password",
    "socCode",
    "getNotificationsRequestData"
})
public class GetNotificationsRequest {

    @XmlElement(name = "UserId", required = true, nillable = true)
    protected String userId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElementRef(name = "socCode", type = JAXBElement.class)
    protected JAXBElement<SocCode> socCode;
    @XmlElement(required = true, nillable = true)
    protected GetNotificationsRequestData getNotificationsRequestData;

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
     * Gets the value of the socCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SocCode }{@code >}
     *     
     */
    public JAXBElement<SocCode> getSocCode() {
        return socCode;
    }

    /**
     * Sets the value of the socCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocCode }{@code >}
     *     
     */
    public void setSocCode(JAXBElement<SocCode> value) {
        this.socCode = ((JAXBElement<SocCode> ) value);
    }

    /**
     * Gets the value of the getNotificationsRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link GetNotificationsRequestData }
     *     
     */
    public GetNotificationsRequestData getGetNotificationsRequestData() {
        return getNotificationsRequestData;
    }

    /**
     * Sets the value of the getNotificationsRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetNotificationsRequestData }
     *     
     */
    public void setGetNotificationsRequestData(GetNotificationsRequestData value) {
        this.getNotificationsRequestData = value;
    }

}
