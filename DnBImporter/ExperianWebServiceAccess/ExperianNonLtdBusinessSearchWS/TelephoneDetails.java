
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DiallingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TPSFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneDetails", propOrder = {
    "diallingCode",
    "mainNumber",
    "tpsFlag"
})
public class TelephoneDetails {

    @XmlElement(name = "DiallingCode")
    protected String diallingCode;
    @XmlElement(name = "MainNumber")
    protected String mainNumber;
    @XmlElement(name = "TPSFlag")
    protected String tpsFlag;

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
     * Gets the value of the tpsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPSFlag() {
        return tpsFlag;
    }

    /**
     * Sets the value of the tpsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPSFlag(String value) {
        this.tpsFlag = value;
    }

}
