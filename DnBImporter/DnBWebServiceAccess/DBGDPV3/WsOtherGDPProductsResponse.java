
package DBGDPV3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_OtherGDPProductsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_OtherGDPProductsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDPResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}GDPResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_OtherGDPProductsResponse", propOrder = {
    "gdpResponse"
})
public class WsOtherGDPProductsResponse {

    @XmlElement(name = "GDPResponse", required = true, nillable = true)
    protected GDPResponse gdpResponse;

    /**
     * Gets the value of the gdpResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GDPResponse }
     *     
     */
    public GDPResponse getGDPResponse() {
        return gdpResponse;
    }

    /**
     * Sets the value of the gdpResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDPResponse }
     *     
     */
    public void setGDPResponse(GDPResponse value) {
        this.gdpResponse = value;
    }

}
