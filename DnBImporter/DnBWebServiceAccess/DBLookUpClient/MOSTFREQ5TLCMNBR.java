
package DBLookUpClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOST_FREQ_5_TLCM_NBR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOST_FREQ_5_TLCM_NBR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CNT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOST_FREQ_5_TLCM_NBR", propOrder = {
    "tlcmnbr",
    "cnt"
})
public class MOSTFREQ5TLCMNBR {

    @XmlElement(name = "TLCM_NBR", required = true, nillable = true)
    protected String tlcmnbr;
    @XmlElement(name = "CNT", required = true, nillable = true)
    protected String cnt;

    /**
     * Gets the value of the tlcmnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLCMNBR() {
        return tlcmnbr;
    }

    /**
     * Sets the value of the tlcmnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLCMNBR(String value) {
        this.tlcmnbr = value;
    }

    /**
     * Gets the value of the cnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNT() {
        return cnt;
    }

    /**
     * Sets the value of the cnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNT(String value) {
        this.cnt = value;
    }

}
