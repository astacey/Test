
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LtdBusinessLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdBusinessLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LtdBusinessLocation", propOrder = {
    "locationLine1",
    "locationLine2",
    "locationLine3",
    "locationLine4",
    "locationLine5",
    "postcode"
})
public class LtdBusinessLocation {

    @XmlElement(name = "LocationLine1")
    protected String locationLine1;
    @XmlElement(name = "LocationLine2")
    protected String locationLine2;
    @XmlElement(name = "LocationLine3")
    protected String locationLine3;
    @XmlElement(name = "LocationLine4")
    protected String locationLine4;
    @XmlElement(name = "LocationLine5")
    protected String locationLine5;
    @XmlElement(name = "Postcode")
    protected String postcode;

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
     * Gets the value of the locationLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLine4() {
        return locationLine4;
    }

    /**
     * Sets the value of the locationLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLine4(String value) {
        this.locationLine4 = value;
    }

    /**
     * Gets the value of the locationLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationLine5() {
        return locationLine5;
    }

    /**
     * Sets the value of the locationLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationLine5(String value) {
        this.locationLine5 = value;
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

}
