
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLineOne" type="{http://gateway.dnb.com/getProduct}AddressLineOneType" minOccurs="0"/>
 *         &lt;element name="AddressLineTwo" type="{http://gateway.dnb.com/getProduct}AddressLineTwoType" minOccurs="0"/>
 *         &lt;element name="CityOrTown" type="{http://gateway.dnb.com/getProduct}CityOrTownType" minOccurs="0"/>
 *         &lt;element name="County" type="{http://gateway.dnb.com/getProduct}CountyType" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://gateway.dnb.com/getProduct}RegionType" minOccurs="0"/>
 *         &lt;element name="State" type="{http://gateway.dnb.com/getProduct}StateType" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://gateway.dnb.com/getProduct}ProvinceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressBaseType", propOrder = {
    "addressLineOne",
    "addressLineTwo",
    "cityOrTown",
    "county",
    "region",
    "state",
    "province"
})
@XmlSeeAlso({
    AddressDetailedType.class
})
public class AddressBaseType {

    @XmlElement(name = "AddressLineOne")
    protected String addressLineOne;
    @XmlElement(name = "AddressLineTwo")
    protected String addressLineTwo;
    @XmlElement(name = "CityOrTown")
    protected String cityOrTown;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Province")
    protected String province;

    /**
     * Gets the value of the addressLineOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineOne() {
        return addressLineOne;
    }

    /**
     * Sets the value of the addressLineOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineOne(String value) {
        this.addressLineOne = value;
    }

    /**
     * Gets the value of the addressLineTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    /**
     * Sets the value of the addressLineTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLineTwo(String value) {
        this.addressLineTwo = value;
    }

    /**
     * Gets the value of the cityOrTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityOrTown() {
        return cityOrTown;
    }

    /**
     * Sets the value of the cityOrTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityOrTown(String value) {
        this.cityOrTown = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

}
