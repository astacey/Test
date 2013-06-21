
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCYYMMDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCYYMMDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCYY">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([0-9_-])*"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(0?[1-9]|1[0-2])*"/>
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DD">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="(0?[1-9]|[12][0-9]|3[01][\ ])*"/>
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "CCYYMMDD", namespace = "http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes", propOrder = {
    "ccyy",
    "mm",
    "dd"
})
public class CCYYMMDD {

    @XmlElement(name = "CCYY", required = true)
    protected String ccyy;
    @XmlElement(name = "MM", required = true)
    protected String mm;
    @XmlElement(name = "DD", required = true)
    protected String dd;

    /**
     * Gets the value of the ccyy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCYY() {
        return ccyy;
    }

    /**
     * Sets the value of the ccyy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCYY(String value) {
        this.ccyy = value;
    }

    /**
     * Gets the value of the mm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMM() {
        return mm;
    }

    /**
     * Sets the value of the mm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMM(String value) {
        this.mm = value;
    }

    /**
     * Gets the value of the dd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDD() {
        return dd;
    }

    /**
     * Sets the value of the dd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDD(String value) {
        this.dd = value;
    }

}
