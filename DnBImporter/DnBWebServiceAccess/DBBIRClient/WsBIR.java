
package DBBIRClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_BIR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_BIR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIRRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}prodOrderRequest_2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_BIR", propOrder = {
    "birRequest"
})
public class WsBIR {

    @XmlElement(name = "BIRRequest", required = true, nillable = true)
    protected ProdOrderRequest2 birRequest;

    /**
     * Gets the value of the birRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest2 }
     *     
     */
    public ProdOrderRequest2 getBIRRequest() {
        return birRequest;
    }

    /**
     * Sets the value of the birRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest2 }
     *     
     */
    public void setBIRRequest(ProdOrderRequest2 value) {
        this.birRequest = value;
    }

}
