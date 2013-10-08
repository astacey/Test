
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressAdvancedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressAdvancedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gateway.dnb.com/getProduct}AddressDetailedType">
 *       &lt;sequence>
 *         &lt;element name="BuildingNumber" type="{http://gateway.dnb.com/getProduct}BuildingNumberType" minOccurs="0"/>
 *         &lt;element name="StreetName" type="{http://gateway.dnb.com/getProduct}StreetNameType" minOccurs="0"/>
 *         &lt;element name="StreetToNumber" type="{http://gateway.dnb.com/getProduct}StreetToNumberType" minOccurs="0"/>
 *         &lt;element name="AddressDescription" type="{http://gateway.dnb.com/getProduct}AddressDescriptionType" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://gateway.dnb.com/getProduct}CountryNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressAdvancedType", propOrder = {
    "buildingNumber",
    "streetName",
    "streetToNumber",
    "addressDescription",
    "countryName"
})
public class AddressAdvancedType
    extends AddressDetailedType
{

    @XmlElement(name = "BuildingNumber")
    protected String buildingNumber;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetToNumber")
    protected String streetToNumber;
    @XmlElement(name = "AddressDescription")
    protected String addressDescription;
    @XmlElement(name = "CountryName")
    protected String countryName;

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetToNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetToNumber() {
        return streetToNumber;
    }

    /**
     * Sets the value of the streetToNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetToNumber(String value) {
        this.streetToNumber = value;
    }

    /**
     * Gets the value of the addressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * Sets the value of the addressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDescription(String value) {
        this.addressDescription = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

}
