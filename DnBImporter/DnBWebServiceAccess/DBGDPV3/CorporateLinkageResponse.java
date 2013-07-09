
package DBGDPV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateLinkageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateLinkageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGX" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}DGX3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateLinkageResponse", propOrder = {
    "dgx"
})
public class CorporateLinkageResponse {

    @XmlElement(name = "DGX", required = true, nillable = true)
    protected DGX3 dgx;

    /**
     * Gets the value of the dgx property.
     * 
     * @return
     *     possible object is
     *     {@link DGX3 }
     *     
     */
    public DGX3 getDGX() {
        return dgx;
    }

    /**
     * Sets the value of the dgx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGX3 }
     *     
     */
    public void setDGX(DGX3 value) {
        this.dgx = value;
    }

}
