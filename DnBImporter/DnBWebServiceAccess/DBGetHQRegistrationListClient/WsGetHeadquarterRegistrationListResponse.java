
package DBGetHQRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetHeadquarterRegistrationListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetHeadquarterRegistrationListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getHeadquarterRegistrationListResponse" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}getHeadquarterRegistrationListResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetHeadquarterRegistrationListResponse", propOrder = {
    "getHeadquarterRegistrationListResponse"
})
public class WsGetHeadquarterRegistrationListResponse {

    @XmlElement(required = true, nillable = true)
    protected GetHeadquarterRegistrationListResponse getHeadquarterRegistrationListResponse;

    /**
     * Gets the value of the getHeadquarterRegistrationListResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetHeadquarterRegistrationListResponse }
     *     
     */
    public GetHeadquarterRegistrationListResponse getGetHeadquarterRegistrationListResponse() {
        return getHeadquarterRegistrationListResponse;
    }

    /**
     * Sets the value of the getHeadquarterRegistrationListResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHeadquarterRegistrationListResponse }
     *     
     */
    public void setGetHeadquarterRegistrationListResponse(GetHeadquarterRegistrationListResponse value) {
        this.getHeadquarterRegistrationListResponse = value;
    }

}
