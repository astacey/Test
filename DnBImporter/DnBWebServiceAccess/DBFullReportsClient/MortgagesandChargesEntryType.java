
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgagesandChargesEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgagesandChargesEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisteredDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="ChargeHoldersInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChargeHoldersInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CourtInformation" type="{http://gateway.dnb.com/getProduct}CourtInformationType" minOccurs="0"/>
 *         &lt;element name="ChargeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SatisfiedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SatisfiedDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
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
@XmlType(name = "MortgagesandChargesEntryType", propOrder = {
    "registeredDate",
    "chargeHoldersInformation",
    "courtInformation",
    "chargeNumber",
    "chargeType",
    "chargeAmount",
    "satisfiedIndicator",
    "satisfiedDate",
    "additionalDetails"
})
public class MortgagesandChargesEntryType {

    @XmlElement(name = "RegisteredDate")
    protected DNBDate registeredDate;
    @XmlElement(name = "ChargeHoldersInformation")
    protected MortgagesandChargesEntryType.ChargeHoldersInformation chargeHoldersInformation;
    @XmlElement(name = "CourtInformation")
    protected CourtInformationType courtInformation;
    @XmlElement(name = "ChargeNumber")
    protected String chargeNumber;
    @XmlElement(name = "ChargeType")
    protected String chargeType;
    @XmlElement(name = "ChargeAmount")
    protected AmountType chargeAmount;
    @XmlElement(name = "SatisfiedIndicator")
    protected Boolean satisfiedIndicator;
    @XmlElement(name = "SatisfiedDate")
    protected DNBDate satisfiedDate;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setRegisteredDate(DNBDate value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the chargeHoldersInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MortgagesandChargesEntryType.ChargeHoldersInformation }
     *     
     */
    public MortgagesandChargesEntryType.ChargeHoldersInformation getChargeHoldersInformation() {
        return chargeHoldersInformation;
    }

    /**
     * Sets the value of the chargeHoldersInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MortgagesandChargesEntryType.ChargeHoldersInformation }
     *     
     */
    public void setChargeHoldersInformation(MortgagesandChargesEntryType.ChargeHoldersInformation value) {
        this.chargeHoldersInformation = value;
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
     * Gets the value of the chargeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeNumber() {
        return chargeNumber;
    }

    /**
     * Sets the value of the chargeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeNumber(String value) {
        this.chargeNumber = value;
    }

    /**
     * Gets the value of the chargeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Sets the value of the chargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargeAmount(AmountType value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the satisfiedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSatisfiedIndicator() {
        return satisfiedIndicator;
    }

    /**
     * Sets the value of the satisfiedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSatisfiedIndicator(Boolean value) {
        this.satisfiedIndicator = value;
    }

    /**
     * Gets the value of the satisfiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getSatisfiedDate() {
        return satisfiedDate;
    }

    /**
     * Sets the value of the satisfiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setSatisfiedDate(DNBDate value) {
        this.satisfiedDate = value;
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
     *         &lt;element name="ChargeHoldersInformationEntry" type="{http://gateway.dnb.com/getProduct}RolePlayerInformationType" maxOccurs="unbounded"/>
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
        "chargeHoldersInformationEntry"
    })
    public static class ChargeHoldersInformation {

        @XmlElement(name = "ChargeHoldersInformationEntry", required = true)
        protected List<RolePlayerInformationType> chargeHoldersInformationEntry;

        /**
         * Gets the value of the chargeHoldersInformationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeHoldersInformationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeHoldersInformationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RolePlayerInformationType }
         * 
         * 
         */
        public List<RolePlayerInformationType> getChargeHoldersInformationEntry() {
            if (chargeHoldersInformationEntry == null) {
                chargeHoldersInformationEntry = new ArrayList<RolePlayerInformationType>();
            }
            return this.chargeHoldersInformationEntry;
        }

    }

}
