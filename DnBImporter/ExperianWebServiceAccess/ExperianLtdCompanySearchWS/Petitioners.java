
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Petitioners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Petitioners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PetitionerLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Petitioners", propOrder = {
    "name",
    "tradingName",
    "petitionerLocation"
})
public class Petitioners {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TradingName")
    protected String tradingName;
    @XmlElement(name = "PetitionerLocation")
    protected LtdBusinessLocation petitionerLocation;

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
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the petitionerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getPetitionerLocation() {
        return petitionerLocation;
    }

    /**
     * Sets the value of the petitionerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setPetitionerLocation(LtdBusinessLocation value) {
        this.petitionerLocation = value;
    }

}
