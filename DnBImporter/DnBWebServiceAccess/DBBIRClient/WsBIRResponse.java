
package DBBIRClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_BIRResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_BIRResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BIRResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1}BIRResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_BIRResponse", propOrder = {
    "birResponse"
})
public class WsBIRResponse {

    @XmlElement(name = "BIRResponse", required = true, nillable = true)
    protected BIRResponse birResponse;

    /**
     * Gets the value of the birResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BIRResponse }
     *     
     */
    public BIRResponse getBIRResponse() {
        return birResponse;
    }

    /**
     * Sets the value of the birResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BIRResponse }
     *     
     */
    public void setBIRResponse(BIRResponse value) {
        this.birResponse = value;
    }

}
