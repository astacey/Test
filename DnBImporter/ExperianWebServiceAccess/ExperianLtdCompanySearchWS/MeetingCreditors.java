
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingCreditors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingCreditors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="MeetingDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="MeetingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MeetingVenue" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingCreditors", propOrder = {
    "publicationDate",
    "meetingDate",
    "meetingTime",
    "tradingName",
    "meetingVenue"
})
public class MeetingCreditors {

    @XmlElement(name = "PublicationDate")
    protected CCYYMMDD publicationDate;
    @XmlElement(name = "MeetingDate")
    protected CCYYMMDD meetingDate;
    @XmlElement(name = "MeetingTime")
    protected String meetingTime;
    @XmlElement(name = "TradingName")
    protected String tradingName;
    @XmlElement(name = "MeetingVenue")
    protected LtdBusinessLocation meetingVenue;

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setPublicationDate(CCYYMMDD value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the meetingDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getMeetingDate() {
        return meetingDate;
    }

    /**
     * Sets the value of the meetingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setMeetingDate(CCYYMMDD value) {
        this.meetingDate = value;
    }

    /**
     * Gets the value of the meetingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingTime() {
        return meetingTime;
    }

    /**
     * Sets the value of the meetingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingTime(String value) {
        this.meetingTime = value;
    }

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the meetingVenue property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getMeetingVenue() {
        return meetingVenue;
    }

    /**
     * Sets the value of the meetingVenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setMeetingVenue(LtdBusinessLocation value) {
        this.meetingVenue = value;
    }

}
