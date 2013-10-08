
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for EventsInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventsInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EventDetailsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EventDetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventsInformationEntryType", propOrder = {
    "eventType",
    "eventDate",
    "source",
    "officialReference",
    "eventDetails"
})
public class EventsInformationEntryType {

    @XmlElement(name = "EventType")
    protected EventsInformationEntryType.EventType eventType;
    @XmlElement(name = "EventDate")
    protected DNBDate eventDate;
    @XmlElement(name = "Source")
    protected String source;
    @XmlElement(name = "OfficialReference")
    protected String officialReference;
    @XmlElement(name = "EventDetails")
    protected EventsInformationEntryType.EventDetails eventDetails;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventsInformationEntryType.EventType }
     *     
     */
    public EventsInformationEntryType.EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsInformationEntryType.EventType }
     *     
     */
    public void setEventType(EventsInformationEntryType.EventType value) {
        this.eventType = value;
    }

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EventsInformationEntryType.EventDetails }
     *     
     */
    public EventsInformationEntryType.EventDetails getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsInformationEntryType.EventDetails }
     *     
     */
    public void setEventDetails(EventsInformationEntryType.EventDetails value) {
        this.eventDetails = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EventDetailsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EventDetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eventDetailsEntry"
    })
    public static class EventDetails {

        @XmlElement(name = "EventDetailsEntry", required = true)
        protected List<EventsInformationEntryType.EventDetails.EventDetailsEntry> eventDetailsEntry;

        /**
         * Gets the value of the eventDetailsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventDetailsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventDetailsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventsInformationEntryType.EventDetails.EventDetailsEntry }
         * 
         * 
         */
        public List<EventsInformationEntryType.EventDetails.EventDetailsEntry> getEventDetailsEntry() {
            if (eventDetailsEntry == null) {
                eventDetailsEntry = new ArrayList<EventsInformationEntryType.EventDetails.EventDetailsEntry>();
            }
            return this.eventDetailsEntry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="EventDetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "eventDetailsText"
        })
        public static class EventDetailsEntry {

            @XmlElement(name = "EventDetailsText", required = true)
            protected String eventDetailsText;

            /**
             * Gets the value of the eventDetailsText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventDetailsText() {
                return eventDetailsText;
            }

            /**
             * Sets the value of the eventDetailsText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventDetailsText(String value) {
                this.eventDetailsText = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EventType {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected BigInteger referenceCode;
        @XmlAttribute
        protected String referenceCodeTable;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the referenceCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReferenceCode() {
            return referenceCode;
        }

        /**
         * Sets the value of the referenceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReferenceCode(BigInteger value) {
            this.referenceCode = value;
        }

        /**
         * Gets the value of the referenceCodeTable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceCodeTable() {
            return referenceCodeTable;
        }

        /**
         * Sets the value of the referenceCodeTable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceCodeTable(String value) {
            this.referenceCodeTable = value;
        }

    }

}
