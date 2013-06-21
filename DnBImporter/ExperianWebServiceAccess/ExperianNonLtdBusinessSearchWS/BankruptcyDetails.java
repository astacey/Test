
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankruptcyDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GazetteDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="BankruptcyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankruptcyLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NonLtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="BankruptcyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyDetails", propOrder = {
    "recordType",
    "gazetteDate",
    "bankruptcyType",
    "name",
    "bankruptcyLocation",
    "bankruptcyText"
})
public class BankruptcyDetails {

    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "GazetteDate")
    protected CCYYMMDD gazetteDate;
    @XmlElement(name = "BankruptcyType")
    protected String bankruptcyType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BankruptcyLocation")
    protected NonLtdBusinessLocation bankruptcyLocation;
    @XmlElement(name = "BankruptcyText")
    protected String bankruptcyText;

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the gazetteDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getGazetteDate() {
        return gazetteDate;
    }

    /**
     * Sets the value of the gazetteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setGazetteDate(CCYYMMDD value) {
        this.gazetteDate = value;
    }

    /**
     * Gets the value of the bankruptcyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankruptcyType() {
        return bankruptcyType;
    }

    /**
     * Sets the value of the bankruptcyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankruptcyType(String value) {
        this.bankruptcyType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bankruptcyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public NonLtdBusinessLocation getBankruptcyLocation() {
        return bankruptcyLocation;
    }

    /**
     * Sets the value of the bankruptcyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public void setBankruptcyLocation(NonLtdBusinessLocation value) {
        this.bankruptcyLocation = value;
    }

    /**
     * Gets the value of the bankruptcyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankruptcyText() {
        return bankruptcyText;
    }

    /**
     * Sets the value of the bankruptcyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankruptcyText(String value) {
        this.bankruptcyText = value;
    }

}
