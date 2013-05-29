
package DBGetRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetRegistrationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetRegistrationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getRegistrationListRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList}getRegistrationListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetRegistrationList", propOrder = {
    "getRegistrationListRequest"
})
public class WsGetRegistrationList {

    @XmlElement(required = true, nillable = true)
    protected GetRegistrationListRequest getRegistrationListRequest;

    /**
     * Gets the value of the getRegistrationListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetRegistrationListRequest }
     *     
     */
    public GetRegistrationListRequest getGetRegistrationListRequest() {
        return getRegistrationListRequest;
    }

    /**
     * Sets the value of the getRegistrationListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRegistrationListRequest }
     *     
     */
    public void setGetRegistrationListRequest(GetRegistrationListRequest value) {
        this.getRegistrationListRequest = value;
    }

}
