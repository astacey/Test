
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_CorporateLinkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_CorporateLinkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateLinkageRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}prodOrderRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_CorporateLinkage", propOrder = {
    "corporateLinkageRequest"
})
public class WsCorporateLinkage {

    @XmlElement(required = true, nillable = true)
    protected ProdOrderRequest corporateLinkageRequest;

    /**
     * Gets the value of the corporateLinkageRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ProdOrderRequest }
     *     
     */
    public ProdOrderRequest getCorporateLinkageRequest() {
        return corporateLinkageRequest;
    }

    /**
     * Sets the value of the corporateLinkageRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdOrderRequest }
     *     
     */
    public void setCorporateLinkageRequest(ProdOrderRequest value) {
        this.corporateLinkageRequest = value;
    }

}
