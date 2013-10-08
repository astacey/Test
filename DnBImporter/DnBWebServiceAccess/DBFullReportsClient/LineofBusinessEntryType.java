
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineofBusinessEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineofBusinessEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineofBusinessSIC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LineofBusinessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineofBusinessEntryType", propOrder = {
    "lineofBusinessSIC",
    "lineofBusinessDescription"
})
public class LineofBusinessEntryType {

    @XmlElement(name = "LineofBusinessSIC")
    protected BigInteger lineofBusinessSIC;
    @XmlElement(name = "LineofBusinessDescription")
    protected String lineofBusinessDescription;

    /**
     * Gets the value of the lineofBusinessSIC property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineofBusinessSIC() {
        return lineofBusinessSIC;
    }

    /**
     * Sets the value of the lineofBusinessSIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineofBusinessSIC(BigInteger value) {
        this.lineofBusinessSIC = value;
    }

    /**
     * Gets the value of the lineofBusinessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineofBusinessDescription() {
        return lineofBusinessDescription;
    }

    /**
     * Sets the value of the lineofBusinessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineofBusinessDescription(String value) {
        this.lineofBusinessDescription = value;
    }

}
