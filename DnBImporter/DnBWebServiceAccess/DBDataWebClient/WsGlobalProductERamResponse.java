
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GlobalProduct_eRamResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GlobalProduct_eRamResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalProd_eRamResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}globalProd_eramResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GlobalProduct_eRamResponse", propOrder = {
    "globalProdERamResponse"
})
public class WsGlobalProductERamResponse {

    @XmlElement(name = "globalProd_eRamResponse", required = true, nillable = true)
    protected GlobalProdEramResponse globalProdERamResponse;

    /**
     * Gets the value of the globalProdERamResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalProdEramResponse }
     *     
     */
    public GlobalProdEramResponse getGlobalProdERamResponse() {
        return globalProdERamResponse;
    }

    /**
     * Sets the value of the globalProdERamResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalProdEramResponse }
     *     
     */
    public void setGlobalProdERamResponse(GlobalProdEramResponse value) {
        this.globalProdERamResponse = value;
    }

}
