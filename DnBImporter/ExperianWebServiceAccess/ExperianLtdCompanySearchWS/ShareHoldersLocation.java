
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareHoldersLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareHoldersLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PunaPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareHoldersLocation", propOrder = {
    "locationLine1",
    "locationLine2",
    "locationLine3",
    "postTown",
    "county",
    "rmc",
    "postcode",
    "country",
    "punaPostcode"
})
public class ShareHoldersLocation {

    @XmlElement(name = "LocationLine1")
    protected String locationLine1;
    @XmlElement(name = "LocationLine2")
    protected String locationLine2;
    @XmlElement(name = "LocationLine3")
    protected String locationLine3;
    @XmlElement(name = "PostTown")
    protected String postTown;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "RMC")
    protected String rmc;
    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PunaPostcode")
    protected String punaPostcode;

    /**
     * Gets the value of the locationLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLine1() {
        return locationLine1;
    }

    /**
     * Sets the value of the locationLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLine1(String value) {
        this.locationLine1 = value;
    }

    /**
     * Gets the value of the locationLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLine2() {
        return locationLine2;
    }

    /**
     * Sets the value of the locationLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLine2(String value) {
        this.locationLine2 = value;
    }

    /**
     * Gets the value of the locationLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLine3() {
        return locationLine3;
    }

    /**
     * Sets the value of the locationLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLine3(String value) {
        this.locationLine3 = value;
    }

    /**
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTown(String value) {
        this.postTown = value;
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
     * Gets the value of the rmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMC() {
        return rmc;
    }

    /**
     * Sets the value of the rmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMC(String value) {
        this.rmc = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the punaPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunaPostcode() {
        return punaPostcode;
    }

    /**
     * Sets the value of the punaPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunaPostcode(String value) {
        this.punaPostcode = value;
    }

}
