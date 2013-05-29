
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GDMResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDMResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGX" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}DGX4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDMResponse", propOrder = {
    "dgx"
})
public class GDMResponse {

    @XmlElement(name = "DGX", required = true, nillable = true)
    protected DGX4 dgx;

    /**
     * Gets the value of the dgx property.
     * 
     * @return
     *     possible object is
     *     {@link DGX4 }
     *     
     */
    public DGX4 getDGX() {
        return dgx;
    }

    /**
     * Sets the value of the dgx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGX4 }
     *     
     */
    public void setDGX(DGX4 value) {
        this.dgx = value;
    }

}
