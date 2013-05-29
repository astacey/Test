
package DBDataWebClient;

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
 *         &lt;element name="globalProd_eRamRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}prodOrderRequest"/>
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
    protected ProdOrderRequest globalProdERamRequest;

    /**
     * Gets the value of the globalProdERamRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest }
     *     
     */
    public ProdOrderRequest getGlobalProdERamRequest() {
        return globalProdERamRequest;
    }

    /**
     * Sets the value of the globalProdERamRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest }
     *     
     */
    public void setGlobalProdERamRequest(ProdOrderRequest value) {
        this.globalProdERamRequest = value;
    }

}
