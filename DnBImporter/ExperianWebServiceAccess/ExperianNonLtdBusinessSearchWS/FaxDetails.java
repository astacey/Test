
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaxDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaxDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiallingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaxDetails", propOrder = {
    "diallingCode",
    "mainNumber",
    "fpsFlag"
})
public class FaxDetails {

    @XmlElement(name = "DiallingCode")
    protected String diallingCode;
    @XmlElement(name = "MainNumber")
    protected String mainNumber;
    @XmlElement(name = "FPSFlag")
    protected String fpsFlag;

    /**
     * Gets the value of the diallingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiallingCode() {
        return diallingCode;
    }

    /**
     * Sets the value of the diallingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiallingCode(String value) {
        this.diallingCode = value;
    }

    /**
     * Gets the value of the mainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainNumber() {
        return mainNumber;
    }

    /**
     * Sets the value of the mainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainNumber(String value) {
        this.mainNumber = value;
    }

    /**
     * Gets the value of the fpsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPSFlag() {
        return fpsFlag;
    }

    /**
     * Sets the value of the fpsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPSFlag(String value) {
        this.fpsFlag = value;
    }

}
