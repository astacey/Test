
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignonCredentialsDocOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignonCredentialsDocOrderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gateway.dnb.com/getProduct}SignonCredentialsType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceId" type="{http://gateway.dnb.com/getProduct}ReferenceIdType"/>
 *         &lt;element name="emailId" type="{http://gateway.dnb.com/getProduct}EmailIDType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignonCredentialsDocOrderType", propOrder = {
    "referenceId",
    "emailId"
})
public class SignonCredentialsDocOrderType
    extends SignonCredentialsType
{

    @XmlElement(name = "ReferenceId", required = true)
    protected String referenceId;
    @XmlElement(required = true)
    protected String emailId;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

}
