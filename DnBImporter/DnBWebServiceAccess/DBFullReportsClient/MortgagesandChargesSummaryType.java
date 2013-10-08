
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgagesandChargesSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgagesandChargesSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalChargesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RegisteredChargesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SatisfiedChargesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgagesandChargesSummaryType", propOrder = {
    "totalChargesQuantity",
    "registeredChargesQuantity",
    "satisfiedChargesQuantity"
})
public class MortgagesandChargesSummaryType {

    @XmlElement(name = "TotalChargesQuantity")
    protected BigInteger totalChargesQuantity;
    @XmlElement(name = "RegisteredChargesQuantity")
    protected BigInteger registeredChargesQuantity;
    @XmlElement(name = "SatisfiedChargesQuantity")
    protected BigInteger satisfiedChargesQuantity;

    /**
     * Gets the value of the totalChargesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalChargesQuantity() {
        return totalChargesQuantity;
    }

    /**
     * Sets the value of the totalChargesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalChargesQuantity(BigInteger value) {
        this.totalChargesQuantity = value;
    }

    /**
     * Gets the value of the registeredChargesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegisteredChargesQuantity() {
        return registeredChargesQuantity;
    }

    /**
     * Sets the value of the registeredChargesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegisteredChargesQuantity(BigInteger value) {
        this.registeredChargesQuantity = value;
    }

    /**
     * Gets the value of the satisfiedChargesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSatisfiedChargesQuantity() {
        return satisfiedChargesQuantity;
    }

    /**
     * Sets the value of the satisfiedChargesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSatisfiedChargesQuantity(BigInteger value) {
        this.satisfiedChargesQuantity = value;
    }

}
