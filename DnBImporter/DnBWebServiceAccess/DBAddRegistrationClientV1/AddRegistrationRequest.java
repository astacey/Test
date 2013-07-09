
package DBAddRegistrationClientV1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRegistrationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRegistrationRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addRegistrationData" type="{http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1}addRegistrationData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRegistrationRequest", propOrder = {
    "userId",
    "password",
    "addRegistrationData"
})
public class AddRegistrationRequest {

    @XmlElement(name = "UserId", required = true, nillable = true)
    protected String userId;
    @XmlElement(name = "Password", required = true, nillable = true)
    protected String password;
    @XmlElement(required = true, nillable = true)
    protected AddRegistrationData addRegistrationData;

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
     * Gets the value of the addRegistrationData property.
     * 
     * @return
     *     possible object is
     *     {@link AddRegistrationData }
     *     
     */
    public AddRegistrationData getAddRegistrationData() {
        return addRegistrationData;
    }

    /**
     * Sets the value of the addRegistrationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddRegistrationData }
     *     
     */
    public void setAddRegistrationData(AddRegistrationData value) {
        this.addRegistrationData = value;
    }

}
