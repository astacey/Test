
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarliestDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LinkedLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NonLtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLink", propOrder = {
    "earliestDate",
    "latestDate",
    "number",
    "name",
    "linkedLocation"
})
public class BusinessLink {

    @XmlElement(name = "EarliestDate")
    protected CCYYMMDD earliestDate;
    @XmlElement(name = "LatestDate")
    protected CCYYMMDD latestDate;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "LinkedLocation")
    protected NonLtdBusinessLocation linkedLocation;

    /**
     * Gets the value of the earliestDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getEarliestDate() {
        return earliestDate;
    }

    /**
     * Sets the value of the earliestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setEarliestDate(CCYYMMDD value) {
        this.earliestDate = value;
    }

    /**
     * Gets the value of the latestDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestDate() {
        return latestDate;
    }

    /**
     * Sets the value of the latestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestDate(CCYYMMDD value) {
        this.latestDate = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the linkedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public NonLtdBusinessLocation getLinkedLocation() {
        return linkedLocation;
    }

    /**
     * Sets the value of the linkedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public void setLinkedLocation(NonLtdBusinessLocation value) {
        this.linkedLocation = value;
    }

}
