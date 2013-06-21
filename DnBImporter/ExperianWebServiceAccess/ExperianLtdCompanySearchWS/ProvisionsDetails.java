
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProvisionsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProvisionsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provisions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DeferredTaxation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pension" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherProvision" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvisionsDetails", propOrder = {
    "provisions",
    "deferredTaxation",
    "pension",
    "otherProvision"
})
public class ProvisionsDetails {

    @XmlElement(name = "Provisions")
    protected Long provisions;
    @XmlElement(name = "DeferredTaxation")
    protected Long deferredTaxation;
    @XmlElement(name = "Pension")
    protected Long pension;
    @XmlElement(name = "OtherProvision")
    protected Long otherProvision;

    /**
     * Gets the value of the provisions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProvisions() {
        return provisions;
    }

    /**
     * Sets the value of the provisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProvisions(Long value) {
        this.provisions = value;
    }

    /**
     * Gets the value of the deferredTaxation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeferredTaxation() {
        return deferredTaxation;
    }

    /**
     * Sets the value of the deferredTaxation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeferredTaxation(Long value) {
        this.deferredTaxation = value;
    }

    /**
     * Gets the value of the pension property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPension() {
        return pension;
    }

    /**
     * Sets the value of the pension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPension(Long value) {
        this.pension = value;
    }

    /**
     * Gets the value of the otherProvision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherProvision() {
        return otherProvision;
    }

    /**
     * Sets the value of the otherProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherProvision(Long value) {
        this.otherProvision = value;
    }

}
