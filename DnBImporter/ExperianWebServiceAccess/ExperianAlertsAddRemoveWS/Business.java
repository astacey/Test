
package ExperianAlertsAddRemoveWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Business complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Business">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([a-zA-Z0-9_-])*"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NonLimitedKey" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([a-zA-Z0-9_-])*"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Business", namespace = "http://schema.uk.experian.com/experian/bi/generic/alerts/bsns/v100/basetypes", propOrder = {
    "regNumber",
    "nonLimitedKey"
})
public class Business {

    @XmlElement(name = "RegNumber")
    protected String regNumber;
    @XmlElement(name = "NonLimitedKey")
    protected String nonLimitedKey;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the nonLimitedKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonLimitedKey() {
        return nonLimitedKey;
    }

    /**
     * Sets the value of the nonLimitedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonLimitedKey(String value) {
        this.nonLimitedKey = value;
    }

}
