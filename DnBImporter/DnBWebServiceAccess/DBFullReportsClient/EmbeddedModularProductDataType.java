
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmbeddedModularProductDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbeddedModularProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://gateway.dnb.com/getProduct}CCDP"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmbeddedModularProductDataType", propOrder = {
    "ccdp"
})
public class EmbeddedModularProductDataType {

    @XmlElement(name = "CCDP", required = true)
    protected CCDP ccdp;

    /**
     * Gets the value of the ccdp property.
     * 
     * @return
     *     possible object is
     *     {@link CCDP }
     *     
     */
    public CCDP getCCDP() {
        return ccdp;
    }

    /**
     * Sets the value of the ccdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCDP }
     *     
     */
    public void setCCDP(CCDP value) {
        this.ccdp = value;
    }

}
