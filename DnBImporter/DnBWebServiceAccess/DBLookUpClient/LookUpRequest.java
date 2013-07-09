
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookUpRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lookUpRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socCode" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}socCode" minOccurs="0"/>
 *         &lt;element name="lookUpInput" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}lookUpInput"/>
 *         &lt;element name="TRNUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lookUpRequest", propOrder = {
    "userId",
    "password",
    "socCode",
    "lookUpInput",
    "trnuid"
})
public class LookUpRequest {

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElementRef(name = "socCode", type = JAXBElement.class)
    protected JAXBElement<SocCode> socCode;
    @XmlElement(required = true)
    protected LookUpInput lookUpInput;
    @XmlElementRef(name = "TRNUID", type = JAXBElement.class)
    protected JAXBElement<String> trnuid;

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
     * Gets the value of the lookUpInput property.
     * 
     * @return
     *     possible object is
     *     {@link LookUpInput }
     *     
     */
    public LookUpInput getLookUpInput() {
        return lookUpInput;
    }

    /**
     * Sets the value of the lookUpInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookUpInput }
     *     
     */
    public void setLookUpInput(LookUpInput value) {
        this.lookUpInput = value;
    }

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRNUID(JAXBElement<String> value) {
        this.trnuid = ((JAXBElement<String> ) value);
    }

}
