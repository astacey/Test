
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_OtherGDPProducts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_OtherGDPProducts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GDPRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}prodOrderRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_OtherGDPProducts", propOrder = {
    "gdpRequest"
})
public class WsOtherGDPProducts {

    @XmlElement(name = "GDPRequest", required = true, nillable = true)
    protected ProdOrderRequest gdpRequest;

    /**
     * Gets the value of the gdpRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest }
     *     
     */
    public ProdOrderRequest getGDPRequest() {
        return gdpRequest;
    }

    /**
     * Sets the value of the gdpRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest }
     *     
     */
    public void setGDPRequest(ProdOrderRequest value) {
        this.gdpRequest = value;
    }

}
