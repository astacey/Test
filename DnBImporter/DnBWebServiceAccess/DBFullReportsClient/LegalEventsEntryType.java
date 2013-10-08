
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
 * <p>Java class for LegalEventsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEventsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="EventType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventSubType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}ReferenceCode"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EventStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventClosingDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="EventRevocationDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="InvolvedPartiesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvolvedPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CourtInformation" type="{http://gateway.dnb.com/getProduct}CourtInformationType" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalHearingDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="EventAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OfficialReferences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "LegalEventsEntryType", propOrder = {
    "eventDate",
    "eventType",
    "eventSubType",
    "eventStatus",
    "eventClosingDate",
    "eventRevocationDate",
    "involvedPartiesInformation",
    "courtInformation",
    "caseNumber",
    "legalHearingDate",
    "eventAmount",
    "officialReferences",
    "additionalDetails"
})
public class LegalEventsEntryType {

    @XmlElement(name = "EventDate")
    protected DNBDate eventDate;
    @XmlElement(name = "EventType")
    protected LegalEventsEntryType.EventType eventType;
    @XmlElement(name = "EventSubType")
    protected LegalEventsEntryType.EventSubType eventSubType;
    @XmlElement(name = "EventStatus")
    protected String eventStatus;
    @XmlElement(name = "EventClosingDate")
    protected DNBDate eventClosingDate;
    @XmlElement(name = "EventRevocationDate")
    protected DNBDate eventRevocationDate;
    @XmlElement(name = "InvolvedPartiesInformation")
    protected LegalEventsEntryType.InvolvedPartiesInformation involvedPartiesInformation;
    @XmlElement(name = "CourtInformation")
    protected CourtInformationType courtInformation;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "LegalHearingDate")
    protected DNBDate legalHearingDate;
    @XmlElement(name = "EventAmount")
    protected AmountType eventAmount;
    @XmlElement(name = "OfficialReferences")
    protected String officialReferences;
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
     *     {@link LegalEventsEntryType.EventType }
     *     
     */
    public LegalEventsEntryType.EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventsEntryType.EventType }
     *     
     */
    public void setEventType(LegalEventsEntryType.EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventSubType property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventsEntryType.EventSubType }
     *     
     */
    public LegalEventsEntryType.EventSubType getEventSubType() {
        return eventSubType;
    }

    /**
     * Sets the value of the eventSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventsEntryType.EventSubType }
     *     
     */
    public void setEventSubType(LegalEventsEntryType.EventSubType value) {
        this.eventSubType = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatus(String value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the eventClosingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getEventClosingDate() {
        return eventClosingDate;
    }

    /**
     * Sets the value of the eventClosingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setEventClosingDate(DNBDate value) {
        this.eventClosingDate = value;
    }

    /**
     * Gets the value of the eventRevocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getEventRevocationDate() {
        return eventRevocationDate;
    }

    /**
     * Sets the value of the eventRevocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setEventRevocationDate(DNBDate value) {
        this.eventRevocationDate = value;
    }

    /**
     * Gets the value of the involvedPartiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventsEntryType.InvolvedPartiesInformation }
     *     
     */
    public LegalEventsEntryType.InvolvedPartiesInformation getInvolvedPartiesInformation() {
        return involvedPartiesInformation;
    }

    /**
     * Sets the value of the involvedPartiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventsEntryType.InvolvedPartiesInformation }
     *     
     */
    public void setInvolvedPartiesInformation(LegalEventsEntryType.InvolvedPartiesInformation value) {
        this.involvedPartiesInformation = value;
    }

    /**
     * Gets the value of the courtInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CourtInformationType }
     *     
     */
    public CourtInformationType getCourtInformation() {
        return courtInformation;
    }

    /**
     * Sets the value of the courtInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtInformationType }
     *     
     */
    public void setCourtInformation(CourtInformationType value) {
        this.courtInformation = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the legalHearingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getLegalHearingDate() {
        return legalHearingDate;
    }

    /**
     * Sets the value of the legalHearingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setLegalHearingDate(DNBDate value) {
        this.legalHearingDate = value;
    }

    /**
     * Gets the value of the eventAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEventAmount() {
        return eventAmount;
    }

    /**
     * Sets the value of the eventAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEventAmount(AmountType value) {
        this.eventAmount = value;
    }

    /**
     * Gets the value of the officialReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialReferences() {
        return officialReferences;
    }

    /**
     * Sets the value of the officialReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialReferences(String value) {
        this.officialReferences = value;
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
    public static class EventSubType {

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
     *         &lt;element name="InvolvedPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
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
        "involvedPartiesInformationEntry"
    })
    public static class InvolvedPartiesInformation {

        @XmlElement(name = "InvolvedPartiesInformationEntry", required = true)
        protected List<RolePlayerInformationType> involvedPartiesInformationEntry;

        /**
         * Gets the value of the involvedPartiesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the involvedPartiesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvolvedPartiesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RolePlayerInformationType }
         * 
         * 
         */
        public List<RolePlayerInformationType> getInvolvedPartiesInformationEntry() {
            if (involvedPartiesInformationEntry == null) {
                involvedPartiesInformationEntry = new ArrayList<RolePlayerInformationType>();
            }
            return this.involvedPartiesInformationEntry;
        }

    }

}
