
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankruptcyProceedingsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyProceedingsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotifiedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
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
 *         &lt;element name="InsolvencyAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsolvencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsolvencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "BankruptcyProceedingsEntryType", propOrder = {
    "notifiedDate",
    "involvedPartiesInformation",
    "courtInformation",
    "caseNumber",
    "insolvencyAmount",
    "insolvencyType",
    "insolvencyStatus",
    "additionalDetails"
})
public class BankruptcyProceedingsEntryType {

    @XmlElement(name = "NotifiedDate")
    protected DNBDate notifiedDate;
    @XmlElement(name = "InvolvedPartiesInformation")
    protected BankruptcyProceedingsEntryType.InvolvedPartiesInformation involvedPartiesInformation;
    @XmlElement(name = "CourtInformation")
    protected CourtInformationType courtInformation;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "InsolvencyAmount")
    protected AmountType insolvencyAmount;
    @XmlElement(name = "InsolvencyType")
    protected String insolvencyType;
    @XmlElement(name = "InsolvencyStatus")
    protected String insolvencyStatus;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

    /**
     * Gets the value of the notifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getNotifiedDate() {
        return notifiedDate;
    }

    /**
     * Sets the value of the notifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setNotifiedDate(DNBDate value) {
        this.notifiedDate = value;
    }

    /**
     * Gets the value of the involvedPartiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BankruptcyProceedingsEntryType.InvolvedPartiesInformation }
     *     
     */
    public BankruptcyProceedingsEntryType.InvolvedPartiesInformation getInvolvedPartiesInformation() {
        return involvedPartiesInformation;
    }

    /**
     * Sets the value of the involvedPartiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankruptcyProceedingsEntryType.InvolvedPartiesInformation }
     *     
     */
    public void setInvolvedPartiesInformation(BankruptcyProceedingsEntryType.InvolvedPartiesInformation value) {
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
     * Gets the value of the insolvencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsolvencyAmount() {
        return insolvencyAmount;
    }

    /**
     * Sets the value of the insolvencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsolvencyAmount(AmountType value) {
        this.insolvencyAmount = value;
    }

    /**
     * Gets the value of the insolvencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsolvencyType() {
        return insolvencyType;
    }

    /**
     * Sets the value of the insolvencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsolvencyType(String value) {
        this.insolvencyType = value;
    }

    /**
     * Gets the value of the insolvencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsolvencyStatus() {
        return insolvencyStatus;
    }

    /**
     * Sets the value of the insolvencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsolvencyStatus(String value) {
        this.insolvencyStatus = value;
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
