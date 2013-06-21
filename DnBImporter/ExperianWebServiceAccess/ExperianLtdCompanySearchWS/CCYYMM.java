
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCYYMM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCYYMM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCYYMM", namespace = "http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes", propOrder = {
    "ccyy",
    "mm"
})
public class CCYYMM {

    @XmlElement(name = "CCYY")
    protected String ccyy;
    @XmlElement(name = "MM")
    protected String mm;

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

}
