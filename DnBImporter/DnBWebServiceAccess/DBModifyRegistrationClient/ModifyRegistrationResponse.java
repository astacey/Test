
package DBModifyRegistrationClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyRegistrationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyRegistrationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DGX" type="{http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration}DGX"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modifyRegistrationResponse", propOrder = {
    "dgx"
})
public class ModifyRegistrationResponse {

    @XmlElement(name = "DGX", required = true, nillable = true)
    protected DGX dgx;

    /**
     * Gets the value of the dgx property.
     * 
     * @return
     *     possible object is
     *     {@link DGX }
     *     
     */
    public DGX getDGX() {
        return dgx;
    }

    /**
     * Sets the value of the dgx property.
     * 
     * @param value
     *     allowed object is
     *     {@link DGX }
     *     
     */
    public void setDGX(DGX value) {
        this.dgx = value;
    }

}
