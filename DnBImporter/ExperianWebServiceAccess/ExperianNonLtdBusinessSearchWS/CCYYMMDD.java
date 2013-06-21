
package ExperianNonLtdBusinessSearchWS;

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
 *         &lt;element name="CCYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

    @XmlElement(name = "CCYY")
    protected String ccyy;
    @XmlElement(name = "MM")
    protected String mm;
    @XmlElement(name = "DD")
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
