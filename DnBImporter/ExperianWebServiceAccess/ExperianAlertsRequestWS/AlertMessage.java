
package ExperianAlertsRequestWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLoaded" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="EventGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertMessage", propOrder = {
    "businessRef",
    "clientReference",
    "legalStatus",
    "eventType",
    "dateLoaded",
    "eventGroup",
    "eventDate",
    "commercialName"
})
public class AlertMessage {

    @XmlElement(name = "BusinessRef")
    protected String businessRef;
    @XmlElement(name = "ClientReference")
    protected String clientReference;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "EventType")
    protected String eventType;
    @XmlElement(name = "DateLoaded")
    protected CCYYMMDD dateLoaded;
    @XmlElement(name = "EventGroup")
    protected String eventGroup;
    @XmlElement(name = "EventDate")
    protected CCYYMMDD eventDate;
    @XmlElement(name = "CommercialName")
    protected String commercialName;

    /**
     * Gets the value of the businessRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRef() {
        return businessRef;
    }

    /**
     * Sets the value of the businessRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRef(String value) {
        this.businessRef = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
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
     * Gets the value of the dateLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateLoaded() {
        return dateLoaded;
    }

    /**
     * Sets the value of the dateLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateLoaded(CCYYMMDD value) {
        this.dateLoaded = value;
    }

    /**
     * Gets the value of the eventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroup() {
        return eventGroup;
    }

    /**
     * Sets the value of the eventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroup(String value) {
        this.eventGroup = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setEventDate(CCYYMMDD value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

}
