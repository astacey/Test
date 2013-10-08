
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergersandAcquisitionsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergersandAcquisitionsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcquiringParty" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" minOccurs="0"/>
 *         &lt;element name="DisappearingParty" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" minOccurs="0"/>
 *         &lt;element name="OfficialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalDetails" type="{http://gateway.dnb.com/getProduct}AdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergersandAcquisitionsEntryType", propOrder = {
    "eventDate",
    "eventType",
    "acquiringParty",
    "disappearingParty",
    "officialReference",
    "additionalDetails"
})
public class MergersandAcquisitionsEntryType {

    @XmlElement(name = "EventDate")
    protected DNBDate eventDate;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "AcquiringParty")
    protected RolePlayerInformationType acquiringParty;
    @XmlElement(name = "DisappearingParty")
    protected RolePlayerInformationType disappearingParty;
    @XmlElement(name = "OfficialReference")
    protected String officialReference;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setEventDate(DNBDate value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the acquiringParty property.
     * 
     * @return
     *     possible object is
     *     {@link RolePlayerInformationType }
     *     
     */
    public RolePlayerInformationType getAcquiringParty() {
        return acquiringParty;
    }

    /**
     * Sets the value of the acquiringParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolePlayerInformationType }
     *     
     */
    public void setAcquiringParty(RolePlayerInformationType value) {
        this.acquiringParty = value;
    }

    /**
     * Gets the value of the disappearingParty property.
     * 
     * @return
     *     possible object is
     *     {@link RolePlayerInformationType }
     *     
     */
    public RolePlayerInformationType getDisappearingParty() {
        return disappearingParty;
    }

    /**
     * Sets the value of the disappearingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolePlayerInformationType }
     *     
     */
    public void setDisappearingParty(RolePlayerInformationType value) {
        this.disappearingParty = value;
    }

    /**
     * Gets the value of the officialReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialReference() {
        return officialReference;
    }

    /**
     * Sets the value of the officialReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialReference(String value) {
        this.officialReference = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public void setAdditionalDetails(AdditionalDetailsType value) {
        this.additionalDetails = value;
    }

}
