
package DBTransferRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_TransferRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_TransferRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferRegistrationResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}transferRegistrationResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_TransferRegistrationResponse", propOrder = {
    "transferRegistrationResponse"
})
public class WsTransferRegistrationResponse {

    @XmlElement(required = true, nillable = true)
    protected TransferRegistrationResponse transferRegistrationResponse;

    /**
     * Gets the value of the transferRegistrationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TransferRegistrationResponse }
     *     
     */
    public TransferRegistrationResponse getTransferRegistrationResponse() {
        return transferRegistrationResponse;
    }

    /**
     * Sets the value of the transferRegistrationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferRegistrationResponse }
     *     
     */
    public void setTransferRegistrationResponse(TransferRegistrationResponse value) {
        this.transferRegistrationResponse = value;
    }

}
