
package DBDataWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIGNONMSGSRSV12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGNONMSGSRSV12">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SONRS" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP}SONRS2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGNONMSGSRSV12", propOrder = {
    "sonrs"
})
public class SIGNONMSGSRSV12 {

    @XmlElement(name = "SONRS", required = true, nillable = true)
    protected SONRS2 sonrs;

    /**
     * Gets the value of the sonrs property.
     * 
     * @return
     *     possible object is
     *     {@link SONRS2 }
     *     
     */
    public SONRS2 getSONRS() {
        return sonrs;
    }

    /**
     * Sets the value of the sonrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SONRS2 }
     *     
     */
    public void setSONRS(SONRS2 value) {
        this.sonrs = value;
    }

}
