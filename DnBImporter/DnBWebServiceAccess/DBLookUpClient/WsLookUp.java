
package DBLookUpClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_LookUp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_LookUp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lookUpRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}lookUpRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_LookUp", propOrder = {
    "lookUpRequest"
})
public class WsLookUp {

    @XmlElement(required = true, nillable = true)
    protected LookUpRequest lookUpRequest;

    /**
     * Gets the value of the lookUpRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LookUpRequest }
     *     
     */
    public LookUpRequest getLookUpRequest() {
        return lookUpRequest;
    }

    /**
     * Sets the value of the lookUpRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookUpRequest }
     *     
     */
    public void setLookUpRequest(LookUpRequest value) {
        this.lookUpRequest = value;
    }

}
