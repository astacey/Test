
package DBGetRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRegistrationListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegistrationListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getRegistrationListData" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList}getRegistrationListData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegistrationListRequest", propOrder = {
    "userId",
    "password",
    "getRegistrationListData"
})
public class GetRegistrationListRequest {

    @XmlElement(name = "UserId", required = true, nillable = true)
    protected String userId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected GetRegistrationListData getRegistrationListData;

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
     * Gets the value of the getRegistrationListData property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationListData }
     *     
     */
    public GetRegistrationListData getGetRegistrationListData() {
        return getRegistrationListData;
    }

    /**
     * Sets the value of the getRegistrationListData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationListData }
     *     
     */
    public void setGetRegistrationListData(GetRegistrationListData value) {
        this.getRegistrationListData = value;
    }

}
