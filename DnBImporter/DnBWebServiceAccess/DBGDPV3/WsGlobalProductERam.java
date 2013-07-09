
package DBGDPV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GlobalProduct_eRam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GlobalProduct_eRam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalProd_eRamRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}prodOrderRequest_3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GlobalProduct_eRam", propOrder = {
    "globalProdERamRequest"
})
public class WsGlobalProductERam {

    @XmlElement(name = "globalProd_eRamRequest", required = true, nillable = true)
    protected ProdOrderRequest3 globalProdERamRequest;

    /**
     * Gets the value of the globalProdERamRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest3 }
     *     
     */
    public ProdOrderRequest3 getGlobalProdERamRequest() {
        return globalProdERamRequest;
    }

    /**
     * Sets the value of the globalProdERamRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest3 }
     *     
     */
    public void setGlobalProdERamRequest(ProdOrderRequest3 value) {
        this.globalProdERamRequest = value;
    }

}
