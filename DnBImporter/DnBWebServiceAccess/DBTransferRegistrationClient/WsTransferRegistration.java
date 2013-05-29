
package DBTransferRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_TransferRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_TransferRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferRegistrationRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration}transferRegistrationRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_TransferRegistration", propOrder = {
    "transferRegistrationRequest"
})
public class WsTransferRegistration {

    @XmlElement(required = true, nillable = true)
    protected TransferRegistrationRequest transferRegistrationRequest;

    /**
     * Gets the value of the transferRegistrationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransferRegistrationRequest }
     *     
     */
    public TransferRegistrationRequest getTransferRegistrationRequest() {
        return transferRegistrationRequest;
    }

    /**
     * Sets the value of the transferRegistrationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferRegistrationRequest }
     *     
     */
    public void setTransferRegistrationRequest(TransferRegistrationRequest value) {
        this.transferRegistrationRequest = value;
    }

}
