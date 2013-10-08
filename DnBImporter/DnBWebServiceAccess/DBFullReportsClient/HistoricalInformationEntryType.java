
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HistoricalInformationEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalInformationEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateofChange" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="OfficialReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalInformationEntryType", propOrder = {
    "dateofChange",
    "officialReference",
    "additionalDetails"
})
@XmlSeeAlso({
    DBFullReportsClient.SubjectHistoryInformationType.BusinessNameHistory.BusinessNameHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.BusinessAddressHistory.BusinessAddressHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.BusinessRegistrationHistory.BusinessRegistrationHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.LegalFormHistory.LegalFormHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.CapitalHistory.CapitalHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.EmployeesInformationHistory.EmployeesInformationHistoryEntry.class,
    DBFullReportsClient.SubjectHistoryInformationType.MiscellaneousHistory.MiscellaneousHistoryEntry.class
})
public class HistoricalInformationEntryType {

    @XmlElement(name = "DateofChange")
    protected DNBDate dateofChange;
    @XmlElement(name = "OfficialReference")
    protected String officialReference;
    @XmlElement(name = "AdditionalDetails")
    protected HistoricalInformationEntryType.AdditionalDetails additionalDetails;
    @XmlAttribute
    protected String type;

    /**
     * Gets the value of the dateofChange property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getDateofChange() {
        return dateofChange;
    }

    /**
     * Sets the value of the dateofChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setDateofChange(DNBDate value) {
        this.dateofChange = value;
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
     *     {@link HistoricalInformationEntryType.AdditionalDetails }
     *     
     */
    public HistoricalInformationEntryType.AdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalInformationEntryType.AdditionalDetails }
     *     
     */
    public void setAdditionalDetails(HistoricalInformationEntryType.AdditionalDetails value) {
        this.additionalDetails = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element name="AdditionalDetailsEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "additionalDetailsEntry"
    })
    public static class AdditionalDetails {

        @XmlElement(name = "AdditionalDetailsEntry", required = true)
        protected List<HistoricalInformationEntryType.AdditionalDetails.AdditionalDetailsEntry> additionalDetailsEntry;

        /**
         * Gets the value of the additionalDetailsEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDetailsEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdditionalDetailsEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HistoricalInformationEntryType.AdditionalDetails.AdditionalDetailsEntry }
         * 
         * 
         */
        public List<HistoricalInformationEntryType.AdditionalDetails.AdditionalDetailsEntry> getAdditionalDetailsEntry() {
            if (additionalDetailsEntry == null) {
                additionalDetailsEntry = new ArrayList<HistoricalInformationEntryType.AdditionalDetails.AdditionalDetailsEntry>();
            }
            return this.additionalDetailsEntry;
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
         *         &lt;element name="DetailsText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "detailsText"
        })
        public static class AdditionalDetailsEntry {

            @XmlElement(name = "DetailsText", required = true)
            protected String detailsText;

            /**
             * Gets the value of the detailsText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsText() {
                return detailsText;
            }

            /**
             * Sets the value of the detailsText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsText(String value) {
                this.detailsText = value;
            }

        }

    }

}
