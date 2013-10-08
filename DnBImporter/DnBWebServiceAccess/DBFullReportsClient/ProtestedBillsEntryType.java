
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtestedBillsEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtestedBillsEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillDueDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BillsFromDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BillsToDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="BillsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
 *         &lt;element name="BillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonPaymentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ProtestedBillsEntryType", propOrder = {
    "billDueDate",
    "billsFromDate",
    "billsToDate",
    "billsQuantity",
    "filedPartiesInformation",
    "billType",
    "billAmount",
    "nonPaymentReason",
    "officialReference",
    "additionalDetails"
})
public class ProtestedBillsEntryType {

    @XmlElement(name = "BillDueDate")
    protected DNBDate billDueDate;
    @XmlElement(name = "BillsFromDate")
    protected DNBDate billsFromDate;
    @XmlElement(name = "BillsToDate")
    protected DNBDate billsToDate;
    @XmlElement(name = "BillsQuantity")
    protected BigInteger billsQuantity;
    @XmlElement(name = "FiledPartiesInformation")
    protected ProtestedBillsEntryType.FiledPartiesInformation filedPartiesInformation;
    @XmlElement(name = "BillType")
    protected String billType;
    @XmlElement(name = "BillAmount")
    protected AmountType billAmount;
    @XmlElement(name = "NonPaymentReason")
    protected String nonPaymentReason;
    @XmlElement(name = "OfficialReference")
    protected String officialReference;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

    /**
     * Gets the value of the billDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBillDueDate() {
        return billDueDate;
    }

    /**
     * Sets the value of the billDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBillDueDate(DNBDate value) {
        this.billDueDate = value;
    }

    /**
     * Gets the value of the billsFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBillsFromDate() {
        return billsFromDate;
    }

    /**
     * Sets the value of the billsFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBillsFromDate(DNBDate value) {
        this.billsFromDate = value;
    }

    /**
     * Gets the value of the billsToDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getBillsToDate() {
        return billsToDate;
    }

    /**
     * Sets the value of the billsToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setBillsToDate(DNBDate value) {
        this.billsToDate = value;
    }

    /**
     * Gets the value of the billsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillsQuantity() {
        return billsQuantity;
    }

    /**
     * Sets the value of the billsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillsQuantity(BigInteger value) {
        this.billsQuantity = value;
    }

    /**
     * Gets the value of the filedPartiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProtestedBillsEntryType.FiledPartiesInformation }
     *     
     */
    public ProtestedBillsEntryType.FiledPartiesInformation getFiledPartiesInformation() {
        return filedPartiesInformation;
    }

    /**
     * Sets the value of the filedPartiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtestedBillsEntryType.FiledPartiesInformation }
     *     
     */
    public void setFiledPartiesInformation(ProtestedBillsEntryType.FiledPartiesInformation value) {
        this.filedPartiesInformation = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillAmount(AmountType value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the nonPaymentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonPaymentReason() {
        return nonPaymentReason;
    }

    /**
     * Sets the value of the nonPaymentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonPaymentReason(String value) {
        this.nonPaymentReason = value;
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
