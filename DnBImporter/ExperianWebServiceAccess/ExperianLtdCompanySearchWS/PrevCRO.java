
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrevCRO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrevCRO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateChanged" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="RegisteredOffice" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrevCRO", propOrder = {
    "dateChanged",
    "registeredOffice"
})
public class PrevCRO {

    @XmlElement(name = "DateChanged")
    protected CCYYMMDD dateChanged;
    @XmlElement(name = "RegisteredOffice")
    protected LtdBusinessLocation registeredOffice;

    /**
     * Gets the value of the dateChanged property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateChanged() {
        return dateChanged;
    }

    /**
     * Sets the value of the dateChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateChanged(CCYYMMDD value) {
        this.dateChanged = value;
    }

    /**
     * Gets the value of the registeredOffice property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getRegisteredOffice() {
        return registeredOffice;
    }

    /**
     * Sets the value of the registeredOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setRegisteredOffice(LtdBusinessLocation value) {
        this.registeredOffice = value;
    }

}
