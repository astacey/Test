
package DBLookUpClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LAST_4_SRCH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LAST_4_SRCH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INDS_CTGY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LAST_4_SRCH", propOrder = {
    "date",
    "time",
    "sic",
    "indsctgy"
})
public class LAST4SRCH {

    @XmlElement(name = "DATE", required = true, nillable = true)
    protected String date;
    @XmlElement(name = "TIME", required = true, nillable = true)
    protected String time;
    @XmlElement(name = "SIC", required = true, nillable = true)
    protected String sic;
    @XmlElement(name = "INDS_CTGY", required = true, nillable = true)
    protected String indsctgy;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATE() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATE(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIME() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIME(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the sic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the indsctgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDSCTGY() {
        return indsctgy;
    }

    /**
     * Sets the value of the indsctgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDSCTGY(String value) {
        this.indsctgy = value;
    }

}
