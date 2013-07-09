
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_LookUpResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_LookUpResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lookupResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}lookUpResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_LookUpResponse", propOrder = {
    "lookupResponse"
})
public class WsLookUpResponse {

    @XmlElementRef(name = "lookupResponse", type = JAXBElement.class)
    protected JAXBElement<LookUpResponse> lookupResponse;

    /**
     * Gets the value of the lookupResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LookUpResponse }{@code >}
     *     
     */
    public JAXBElement<LookUpResponse> getLookupResponse() {
        return lookupResponse;
    }

    /**
     * Sets the value of the lookupResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LookUpResponse }{@code >}
     *     
     */
    public void setLookupResponse(JAXBElement<LookUpResponse> value) {
        this.lookupResponse = ((JAXBElement<LookUpResponse> ) value);
    }

}
