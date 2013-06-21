
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectorRemunerationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectorRemunerationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectorRemuneration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmolumentFees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
@XmlType(name = "DirectorRemunerationDetails", propOrder = {
    "directorRemuneration",
    "emolumentFees",
    "pensionCosts",
    "otherCosts"
})
public class DirectorRemunerationDetails {

    @XmlElement(name = "DirectorRemuneration")
    protected Long directorRemuneration;
    @XmlElement(name = "EmolumentFees")
    protected Long emolumentFees;
    @XmlElement(name = "PensionCosts")
    protected Long pensionCosts;
    @XmlElement(name = "OtherCosts")
    protected Long otherCosts;

    /**
     * Gets the value of the directorRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectorRemuneration() {
        return directorRemuneration;
    }

    /**
     * Sets the value of the directorRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectorRemuneration(Long value) {
        this.directorRemuneration = value;
    }

    /**
     * Gets the value of the emolumentFees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmolumentFees() {
        return emolumentFees;
    }

    /**
     * Sets the value of the emolumentFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmolumentFees(Long value) {
        this.emolumentFees = value;
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
