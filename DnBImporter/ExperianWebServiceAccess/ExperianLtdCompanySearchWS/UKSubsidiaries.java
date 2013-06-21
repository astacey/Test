
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UKSubsidiaries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UKSubsidiaries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubLegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UKSubsidiaries", propOrder = {
    "subRegNumber",
    "subStatus",
    "subLegalStatus",
    "subName"
})
public class UKSubsidiaries {

    @XmlElement(name = "SubRegNumber")
    protected String subRegNumber;
    @XmlElement(name = "SubStatus")
    protected String subStatus;
    @XmlElement(name = "SubLegalStatus")
    protected String subLegalStatus;
    @XmlElement(name = "SubName")
    protected String subName;

    /**
     * Gets the value of the subRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubRegNumber() {
        return subRegNumber;
    }

    /**
     * Sets the value of the subRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubRegNumber(String value) {
        this.subRegNumber = value;
    }

    /**
     * Gets the value of the subStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStatus() {
        return subStatus;
    }

    /**
     * Sets the value of the subStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStatus(String value) {
        this.subStatus = value;
    }

    /**
     * Gets the value of the subLegalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLegalStatus() {
        return subLegalStatus;
    }

    /**
     * Sets the value of the subLegalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLegalStatus(String value) {
        this.subLegalStatus = value;
    }

    /**
     * Gets the value of the subName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Sets the value of the subName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubName(String value) {
        this.subName = value;
    }

}
