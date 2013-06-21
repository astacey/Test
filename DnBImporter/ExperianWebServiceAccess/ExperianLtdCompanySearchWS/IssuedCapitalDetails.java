
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssuedCapitalDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedCapitalDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuedCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrdinaryShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferenceShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedCapitalDetails", propOrder = {
    "issuedCapital",
    "ordinaryShares",
    "preferenceShares",
    "other"
})
public class IssuedCapitalDetails {

    @XmlElement(name = "IssuedCapital")
    protected Long issuedCapital;
    @XmlElement(name = "OrdinaryShares")
    protected Long ordinaryShares;
    @XmlElement(name = "PreferenceShares")
    protected Long preferenceShares;
    @XmlElement(name = "Other")
    protected Long other;

    /**
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuedCapital(Long value) {
        this.issuedCapital = value;
    }

    /**
     * Gets the value of the ordinaryShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdinaryShares() {
        return ordinaryShares;
    }

    /**
     * Sets the value of the ordinaryShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdinaryShares(Long value) {
        this.ordinaryShares = value;
    }

    /**
     * Gets the value of the preferenceShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreferenceShares() {
        return preferenceShares;
    }

    /**
     * Sets the value of the preferenceShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreferenceShares(Long value) {
        this.preferenceShares = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOther(Long value) {
        this.other = value;
    }

}
