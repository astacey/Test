
package DBGDPV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GDM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GDM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdmRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}prodOrderRequest_3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GDM", propOrder = {
    "gdmRequest"
})
public class WsGDM {

    @XmlElement(required = true, nillable = true)
    protected ProdOrderRequest3 gdmRequest;

    /**
     * Gets the value of the gdmRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest3 }
     *     
     */
    public ProdOrderRequest3 getGdmRequest() {
        return gdmRequest;
    }

    /**
     * Sets the value of the gdmRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest3 }
     *     
     */
    public void setGdmRequest(ProdOrderRequest3 value) {
        this.gdmRequest = value;
    }

}
