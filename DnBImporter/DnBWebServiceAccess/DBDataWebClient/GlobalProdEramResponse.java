
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalProd_eramResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalProd_eramResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGX" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}DGX2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalProd_eramResponse", propOrder = {
    "dgx"
})
public class GlobalProdEramResponse {

    @XmlElement(name = "DGX", required = true, nillable = true)
    protected DGX2 dgx;

    /**
     * Gets the value of the dgx property.
     * 
     * @return
     *     possible object is
     *     {@link DGX2 }
     *     
     */
    public DGX2 getDGX() {
        return dgx;
    }

    /**
     * Sets the value of the dgx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGX2 }
     *     
     */
    public void setDGX(DGX2 value) {
        this.dgx = value;
    }

}
