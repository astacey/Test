
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonLtdBusinessRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonLtdBusinessRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NonLimitedKey">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([a-zA-Z0-9_-])*"/>
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LengthOwnership" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}TimeAt" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonLtdBusinessRequest", namespace = "http://schema.uk.experian.com/experian/bi/nonlimited/intr/v100/nonltdbusinesssearch", propOrder = {
    "nonLimitedKey",
    "lengthOwnership",
    "startDate",
    "endDate"
})
public class NonLtdBusinessRequest {

    @XmlElement(name = "NonLimitedKey", required = true)
    protected String nonLimitedKey;
    @XmlElement(name = "LengthOwnership")
    protected TimeAt lengthOwnership;
    @XmlElement(name = "StartDate")
    protected CCYYMM startDate;
    @XmlElement(name = "EndDate")
    protected CCYYMM endDate;

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

    /**
     * Gets the value of the lengthOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAt }
     *     
     */
    public TimeAt getLengthOwnership() {
        return lengthOwnership;
    }

    /**
     * Sets the value of the lengthOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAt }
     *     
     */
    public void setLengthOwnership(TimeAt value) {
        this.lengthOwnership = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setStartDate(CCYYMM value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setEndDate(CCYYMM value) {
        this.endDate = value;
    }

}
