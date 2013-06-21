
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CIFASIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIFASIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIFASIndicator", propOrder = {
    "busAddress",
    "propAddress"
})
public class CIFASIndicator {

    @XmlElement(name = "BusAddress")
    protected String busAddress;
    @XmlElement(name = "PropAddress")
    protected String propAddress;

    /**
     * Gets the value of the busAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusAddress() {
        return busAddress;
    }

    /**
     * Sets the value of the busAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusAddress(String value) {
        this.busAddress = value;
    }

    /**
     * Gets the value of the propAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropAddress() {
        return propAddress;
    }

    /**
     * Sets the value of the propAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropAddress(String value) {
        this.propAddress = value;
    }

}
