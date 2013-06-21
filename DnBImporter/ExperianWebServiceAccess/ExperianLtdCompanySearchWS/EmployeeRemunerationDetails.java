
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeRemunerationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeRemunerationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeRemuneration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Wages" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SocialSecurityCosts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PensionCosts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherCosts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeRemunerationDetails", propOrder = {
    "employeeRemuneration",
    "wages",
    "socialSecurityCosts",
    "pensionCosts",
    "otherCosts"
})
public class EmployeeRemunerationDetails {

    @XmlElement(name = "EmployeeRemuneration")
    protected Long employeeRemuneration;
    @XmlElement(name = "Wages")
    protected Long wages;
    @XmlElement(name = "SocialSecurityCosts")
    protected Long socialSecurityCosts;
    @XmlElement(name = "PensionCosts")
    protected Long pensionCosts;
    @XmlElement(name = "OtherCosts")
    protected Long otherCosts;

    /**
     * Gets the value of the employeeRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmployeeRemuneration() {
        return employeeRemuneration;
    }

    /**
     * Sets the value of the employeeRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmployeeRemuneration(Long value) {
        this.employeeRemuneration = value;
    }

    /**
     * Gets the value of the wages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWages() {
        return wages;
    }

    /**
     * Sets the value of the wages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWages(Long value) {
        this.wages = value;
    }

    /**
     * Gets the value of the socialSecurityCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSocialSecurityCosts() {
        return socialSecurityCosts;
    }

    /**
     * Sets the value of the socialSecurityCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSocialSecurityCosts(Long value) {
        this.socialSecurityCosts = value;
    }

    /**
     * Gets the value of the pensionCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPensionCosts() {
        return pensionCosts;
    }

    /**
     * Sets the value of the pensionCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPensionCosts(Long value) {
        this.pensionCosts = value;
    }

    /**
     * Gets the value of the otherCosts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherCosts() {
        return otherCosts;
    }

    /**
     * Sets the value of the otherCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherCosts(Long value) {
        this.otherCosts = value;
    }

}
