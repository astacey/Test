
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GDMResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GDMResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdmResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}GDMResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GDMResponse", propOrder = {
    "gdmResponse"
})
public class WsGDMResponse {

    @XmlElement(required = true, nillable = true)
    protected GDMResponse gdmResponse;

    /**
     * Gets the value of the gdmResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GDMResponse }
     *     
     */
    public GDMResponse getGdmResponse() {
        return gdmResponse;
    }

    /**
     * Sets the value of the gdmResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDMResponse }
     *     
     */
    public void setGdmResponse(GDMResponse value) {
        this.gdmResponse = value;
    }

}
