
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discharge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DischargeDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Administrator" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Administrator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Discharge", propOrder = {
    "dischargeDate",
    "administrator"
})
public class Discharge {

    @XmlElement(name = "DischargeDate")
    protected CCYYMMDD dischargeDate;
    @XmlElement(name = "Administrator")
    protected Administrator administrator;

    /**
     * Gets the value of the dischargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDischargeDate() {
        return dischargeDate;
    }

    /**
     * Sets the value of the dischargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDischargeDate(CCYYMMDD value) {
        this.dischargeDate = value;
    }

    /**
     * Gets the value of the administrator property.
     * 
     * @return
     *     possible object is
     *     {@link Administrator }
     *     
     */
    public Administrator getAdministrator() {
        return administrator;
    }

    /**
     * Sets the value of the administrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Administrator }
     *     
     */
    public void setAdministrator(Administrator value) {
        this.administrator = value;
    }

}
