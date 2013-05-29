
package DBGetHQRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ws_GetHeadquarterRegistrationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ws_GetHeadquarterRegistrationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getHeadquarterRegistrationListRequest" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}getHeadquarterRegistrationListRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ws_GetHeadquarterRegistrationList", propOrder = {
    "getHeadquarterRegistrationListRequest"
})
public class WsGetHeadquarterRegistrationList {

    @XmlElement(required = true, nillable = true)
    protected GetHeadquarterRegistrationListRequest getHeadquarterRegistrationListRequest;

    /**
     * Gets the value of the getHeadquarterRegistrationListRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetHeadquarterRegistrationListRequest }
     *     
     */
    public GetHeadquarterRegistrationListRequest getGetHeadquarterRegistrationListRequest() {
        return getHeadquarterRegistrationListRequest;
    }

    /**
     * Sets the value of the getHeadquarterRegistrationListRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHeadquarterRegistrationListRequest }
     *     
     */
    public void setGetHeadquarterRegistrationListRequest(GetHeadquarterRegistrationListRequest value) {
        this.getHeadquarterRegistrationListRequest = value;
    }

}
