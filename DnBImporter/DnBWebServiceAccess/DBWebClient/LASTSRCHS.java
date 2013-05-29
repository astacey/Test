
package DBWebClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LAST_SRCHS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LAST_SRCHS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LAST_1_SRCH" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_1_SRCH"/>
 *         &lt;element name="LAST_2_SRCH" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_2_SRCH"/>
 *         &lt;element name="LAST_3_SRCH" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_3_SRCH"/>
 *         &lt;element name="LAST_4_SRCH" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_4_SRCH"/>
 *         &lt;element name="LAST_5_SRCH" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_5_SRCH"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LAST_SRCHS", propOrder = {
    "last1SRCH",
    "last2SRCH",
    "last3SRCH",
    "last4SRCH",
    "last5SRCH"
})
public class LASTSRCHS {

    @XmlElement(name = "LAST_1_SRCH", required = true, nillable = true)
    protected LAST1SRCH last1SRCH;
    @XmlElement(name = "LAST_2_SRCH", required = true, nillable = true)
    protected LAST2SRCH last2SRCH;
    @XmlElement(name = "LAST_3_SRCH", required = true, nillable = true)
    protected LAST3SRCH last3SRCH;
    @XmlElement(name = "LAST_4_SRCH", required = true, nillable = true)
    protected LAST4SRCH last4SRCH;
    @XmlElement(name = "LAST_5_SRCH", required = true, nillable = true)
    protected LAST5SRCH last5SRCH;

    /**
     * Gets the value of the last1SRCH property.
     * 
     * @return
     *     possible object is
     *     {@link LAST1SRCH }
     *     
     */
    public LAST1SRCH getLAST1SRCH() {
        return last1SRCH;
    }

    /**
     * Sets the value of the last1SRCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAST1SRCH }
     *     
     */
    public void setLAST1SRCH(LAST1SRCH value) {
        this.last1SRCH = value;
    }

    /**
     * Gets the value of the last2SRCH property.
     * 
     * @return
     *     possible object is
     *     {@link LAST2SRCH }
     *     
     */
    public LAST2SRCH getLAST2SRCH() {
        return last2SRCH;
    }

    /**
     * Sets the value of the last2SRCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAST2SRCH }
     *     
     */
    public void setLAST2SRCH(LAST2SRCH value) {
        this.last2SRCH = value;
    }

    /**
     * Gets the value of the last3SRCH property.
     * 
     * @return
     *     possible object is
     *     {@link LAST3SRCH }
     *     
     */
    public LAST3SRCH getLAST3SRCH() {
        return last3SRCH;
    }

    /**
     * Sets the value of the last3SRCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAST3SRCH }
     *     
     */
    public void setLAST3SRCH(LAST3SRCH value) {
        this.last3SRCH = value;
    }

    /**
     * Gets the value of the last4SRCH property.
     * 
     * @return
     *     possible object is
     *     {@link LAST4SRCH }
     *     
     */
    public LAST4SRCH getLAST4SRCH() {
        return last4SRCH;
    }

    /**
     * Sets the value of the last4SRCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAST4SRCH }
     *     
     */
    public void setLAST4SRCH(LAST4SRCH value) {
        this.last4SRCH = value;
    }

    /**
     * Gets the value of the last5SRCH property.
     * 
     * @return
     *     possible object is
     *     {@link LAST5SRCH }
     *     
     */
    public LAST5SRCH getLAST5SRCH() {
        return last5SRCH;
    }

    /**
     * Sets the value of the last5SRCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link LAST5SRCH }
     *     
     */
    public void setLAST5SRCH(LAST5SRCH value) {
        this.last5SRCH = value;
    }

}
