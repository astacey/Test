
package ExperianTokenService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginWithUsernamePasswordResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loginWithUsernamePasswordResult"
})
@XmlRootElement(name = "LoginWithUsernamePasswordResponse")
public class LoginWithUsernamePasswordResponse {

    @XmlElement(name = "LoginWithUsernamePasswordResult")
    protected String loginWithUsernamePasswordResult;

    /**
     * Gets the value of the loginWithUsernamePasswordResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginWithUsernamePasswordResult() {
        return loginWithUsernamePasswordResult;
    }

    /**
     * Sets the value of the loginWithUsernamePasswordResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginWithUsernamePasswordResult(String value) {
        this.loginWithUsernamePasswordResult = value;
    }

}
