
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_CorporateLinkageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_CorporateLinkageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateLinkageResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}CorporateLinkageResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_CorporateLinkageResponse", propOrder = {
    "corporateLinkageResponse"
})
public class WsCorporateLinkageResponse {

    @XmlElement(required = true, nillable = true)
    protected CorporateLinkageResponse corporateLinkageResponse;

    /**
     * Gets the value of the corporateLinkageResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateLinkageResponse }
     *     
     */
    public CorporateLinkageResponse getCorporateLinkageResponse() {
        return corporateLinkageResponse;
    }

    /**
     * Sets the value of the corporateLinkageResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateLinkageResponse }
     *     
     */
    public void setCorporateLinkageResponse(CorporateLinkageResponse value) {
        this.corporateLinkageResponse = value;
    }

}
