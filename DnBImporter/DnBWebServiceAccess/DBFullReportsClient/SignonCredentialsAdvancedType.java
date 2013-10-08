
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonCredentialsAdvancedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonCredentialsAdvancedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginIdentifier" type="{http://gateway.dnb.com/getProduct}EmailIDType"/>
 *         &lt;element name="LoginPassword" type="{http://gateway.dnb.com/getProduct}LoginPasswordType"/>
 *         &lt;element name="SubscriberNumber" type="{http://gateway.dnb.com/getProduct}SubscriberNumberType"/>
 *         &lt;element name="UserId" type="{http://gateway.dnb.com/getProduct}UserIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonCredentialsAdvancedType", propOrder = {
    "loginIdentifier",
    "loginPassword",
    "subscriberNumber",
    "userId"
})
public class SignonCredentialsAdvancedType {

    @XmlElement(name = "LoginIdentifier", required = true)
    protected String loginIdentifier;
    @XmlElement(name = "LoginPassword", required = true)
    protected String loginPassword;
    @XmlElement(name = "SubscriberNumber", required = true)
    protected String subscriberNumber;
    @XmlElement(name = "UserId", required = true)
    protected String userId;

    /**
     * Gets the value of the loginIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginIdentifier() {
        return loginIdentifier;
    }

    /**
     * Sets the value of the loginIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginIdentifier(String value) {
        this.loginIdentifier = value;
    }

    /**
     * Gets the value of the loginPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * Sets the value of the loginPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPassword(String value) {
        this.loginPassword = value;
    }

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

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

}
