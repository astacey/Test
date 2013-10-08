
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FiledDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="FiledPartiesInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FiledPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CourtInformation" type="{http://gateway.dnb.com/getProduct}CourtInformationType" minOccurs="0"/>
 *         &lt;element name="ClaimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnrecoverableDebtsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ClaimsEntryType", propOrder = {
    "filedDate",
    "filedPartiesInformation",
    "courtInformation",
    "claimType",
    "claimAmount",
    "claimStatus",
    "unrecoverableDebtsIndicator",
    "additionalDetails"
})
public class ClaimsEntryType {

    @XmlElement(name = "FiledDate")
    protected DNBDate filedDate;
    @XmlElement(name = "FiledPartiesInformation")
    protected ClaimsEntryType.FiledPartiesInformation filedPartiesInformation;
    @XmlElement(name = "CourtInformation")
    protected CourtInformationType courtInformation;
    @XmlElement(name = "ClaimType")
    protected String claimType;
    @XmlElement(name = "ClaimAmount")
    protected AmountType claimAmount;
    @XmlElement(name = "ClaimStatus")
    protected String claimStatus;
    @XmlElement(name = "UnrecoverableDebtsIndicator")
    protected Boolean unrecoverableDebtsIndicator;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

    /**
     * Gets the value of the filedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getFiledDate() {
        return filedDate;
    }

    /**
     * Sets the value of the filedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setFiledDate(DNBDate value) {
        this.filedDate = value;
    }

    /**
     * Gets the value of the filedPartiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimsEntryType.FiledPartiesInformation }
     *     
     */
    public ClaimsEntryType.FiledPartiesInformation getFiledPartiesInformation() {
        return filedPartiesInformation;
    }

    /**
     * Sets the value of the filedPartiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimsEntryType.FiledPartiesInformation }
     *     
     */
    public void setFiledPartiesInformation(ClaimsEntryType.FiledPartiesInformation value) {
        this.filedPartiesInformation = value;
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
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the claimAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimAmount() {
        return claimAmount;
    }

    /**
     * Sets the value of the claimAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimAmount(AmountType value) {
        this.claimAmount = value;
    }

    /**
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatus(String value) {
        this.claimStatus = value;
    }

    /**
     * Gets the value of the unrecoverableDebtsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnrecoverableDebtsIndicator() {
        return unrecoverableDebtsIndicator;
    }

    /**
     * Sets the value of the unrecoverableDebtsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnrecoverableDebtsIndicator(Boolean value) {
        this.unrecoverableDebtsIndicator = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FiledPartiesInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
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
        "filedPartiesInformationEntry"
    })
    public static class FiledPartiesInformation {

        @XmlElement(name = "FiledPartiesInformationEntry", required = true)
        protected List<RolePlayerInformationType> filedPartiesInformationEntry;

        /**
         * Gets the value of the filedPartiesInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filedPartiesInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFiledPartiesInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RolePlayerInformationType }
         * 
         * 
         */
        public List<RolePlayerInformationType> getFiledPartiesInformationEntry() {
            if (filedPartiesInformationEntry == null) {
                filedPartiesInformationEntry = new ArrayList<RolePlayerInformationType>();
            }
            return this.filedPartiesInformationEntry;
        }

    }

}
