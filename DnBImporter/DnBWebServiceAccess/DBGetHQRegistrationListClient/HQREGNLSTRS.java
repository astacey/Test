
package DBGetHQRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HQREGNLSTRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HQREGNLSTRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USERRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}USERRS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HQREGNLSTRS", propOrder = {
    "userrs"
})
public class HQREGNLSTRS {

    @XmlElement(name = "USERRS", required = true, nillable = true)
    protected USERRS userrs;

    /**
     * Gets the value of the userrs property.
     * 
     * @return
     *     possible object is
     *     {@link USERRS }
     *     
     */
    public USERRS getUSERRS() {
        return userrs;
    }

    /**
     * Sets the value of the userrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link USERRS }
     *     
     */
    public void setUSERRS(USERRS value) {
        this.userrs = value;
    }

}
