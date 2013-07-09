
package DBLookUpClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOST_FREQ_2_DUNS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOST_FREQ_2_DUNS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "MOST_FREQ_2_DUNS", propOrder = {
    "dunsnbr",
    "cnt"
})
public class MOSTFREQ2DUNS {

    @XmlElement(name = "DUNS_NBR", required = true, nillable = true)
    protected String dunsnbr;
    @XmlElement(name = "CNT", required = true, nillable = true)
    protected String cnt;

    /**
     * Gets the value of the dunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNBR() {
        return dunsnbr;
    }

    /**
     * Sets the value of the dunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNBR(String value) {
        this.dunsnbr = value;
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
