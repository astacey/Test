
package DBGetHQRegistrationListClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for USERRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USERRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PFLRS" type="{http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList}ArrayOfPFLRS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USERRS", propOrder = {
    "userid",
    "pflrs"
})
public class USERRS {

    @XmlElement(name = "USERID", required = true, nillable = true)
    protected String userid;
    @XmlElement(name = "PFLRS", required = true, nillable = true)
    protected ArrayOfPFLRS pflrs;

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERID() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERID(String value) {
        this.userid = value;
    }

    /**
     * Gets the value of the pflrs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPFLRS }
     *     
     */
    public ArrayOfPFLRS getPFLRS() {
        return pflrs;
    }

    /**
     * Sets the value of the pflrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPFLRS }
     *     
     */
    public void setPFLRS(ArrayOfPFLRS value) {
        this.pflrs = value;
    }

}
