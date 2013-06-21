
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Liquidator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Liquidator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LiquidatorLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Liquidator", propOrder = {
    "name",
    "firmName",
    "liquidatorLocation"
})
public class Liquidator {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirmName")
    protected String firmName;
    @XmlElement(name = "LiquidatorLocation")
    protected LtdBusinessLocation liquidatorLocation;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Sets the value of the firmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmName(String value) {
        this.firmName = value;
    }

    /**
     * Gets the value of the liquidatorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getLiquidatorLocation() {
        return liquidatorLocation;
    }

    /**
     * Sets the value of the liquidatorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setLiquidatorLocation(LtdBusinessLocation value) {
        this.liquidatorLocation = value;
    }

}
