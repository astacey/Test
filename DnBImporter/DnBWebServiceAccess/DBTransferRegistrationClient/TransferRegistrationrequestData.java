
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferRegistrationrequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferRegistrationrequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source_User_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Source_User_Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Target_User_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Target_User_Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notification_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Account_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Update_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Update_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Renewal_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Renewal_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cancel_Duplicate_Registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Character_Set_Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferRegistrationrequestData", propOrder = {
    "sourceUserID",
    "sourceUserPassword",
    "targetUserID",
    "targetUserPassword",
    "dnBDUNSNumber",
    "countryCode",
    "productName",
    "notificationLevel",
    "customerAccountID",
    "endorsement",
    "lastUpdateDateFrom",
    "lastUpdateDateTo",
    "renewalDateFrom",
    "renewalDateTo",
    "expirationDateFrom",
    "expirationDateTo",
    "cancelDuplicateRegistration",
    "characterSetOverride"
})
public class TransferRegistrationrequestData {

    @XmlElement(name = "Source_User_ID", required = true, nillable = true)
    protected String sourceUserID;
    @XmlElement(name = "Source_User_Password", required = true, nillable = true)
    protected String sourceUserPassword;
    @XmlElement(name = "Target_User_ID", required = true, nillable = true)
    protected String targetUserID;
    @XmlElement(name = "Target_User_Password", required = true, nillable = true)
    protected String targetUserPassword;
    @XmlElementRef(name = "DnB_DUNS_Number", type = JAXBElement.class)
    protected JAXBElement<String> dnBDUNSNumber;
    @XmlElementRef(name = "CountryCode", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlElement(name = "Product_Name", required = true, nillable = true)
    protected String productName;
    @XmlElementRef(name = "Notification_Level", type = JAXBElement.class)
    protected JAXBElement<String> notificationLevel;
    @XmlElementRef(name = "Customer_Account_ID", type = JAXBElement.class)
    protected JAXBElement<String> customerAccountID;
    @XmlElementRef(name = "Endorsement", type = JAXBElement.class)
    protected JAXBElement<String> endorsement;
    @XmlElementRef(name = "Last_Update_Date_From", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateDateFrom;
    @XmlElementRef(name = "Last_Update_Date_To", type = JAXBElement.class)
    protected JAXBElement<String> lastUpdateDateTo;
    @XmlElementRef(name = "Renewal_Date_From", type = JAXBElement.class)
    protected JAXBElement<String> renewalDateFrom;
    @XmlElementRef(name = "Renewal_Date_To", type = JAXBElement.class)
    protected JAXBElement<String> renewalDateTo;
    @XmlElementRef(name = "Expiration_Date_From", type = JAXBElement.class)
    protected JAXBElement<String> expirationDateFrom;
    @XmlElementRef(name = "Expiration_Date_To", type = JAXBElement.class)
    protected JAXBElement<String> expirationDateTo;
    @XmlElementRef(name = "Cancel_Duplicate_Registration", type = JAXBElement.class)
    protected JAXBElement<String> cancelDuplicateRegistration;
    @XmlElementRef(name = "Character_Set_Override", type = JAXBElement.class)
    protected JAXBElement<String> characterSetOverride;

    /**
     * Gets the value of the sourceUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUserID() {
        return sourceUserID;
    }

    /**
     * Sets the value of the sourceUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUserID(String value) {
        this.sourceUserID = value;
    }

    /**
     * Gets the value of the sourceUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUserPassword() {
        return sourceUserPassword;
    }

    /**
     * Sets the value of the sourceUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUserPassword(String value) {
        this.sourceUserPassword = value;
    }

    /**
     * Gets the value of the targetUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUserID() {
        return targetUserID;
    }

    /**
     * Sets the value of the targetUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUserID(String value) {
        this.targetUserID = value;
    }

    /**
     * Gets the value of the targetUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetUserPassword() {
        return targetUserPassword;
    }

    /**
     * Sets the value of the targetUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetUserPassword(String value) {
        this.targetUserPassword = value;
    }

    /**
     * Gets the value of the dnBDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDnBDUNSNumber() {
        return dnBDUNSNumber;
    }

    /**
     * Sets the value of the dnBDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDnBDUNSNumber(JAXBElement<String> value) {
        this.dnBDUNSNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCode(JAXBElement<String> value) {
        this.countryCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the notificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * Sets the value of the notificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotificationLevel(JAXBElement<String> value) {
        this.notificationLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerAccountID() {
        return customerAccountID;
    }

    /**
     * Sets the value of the customerAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerAccountID(JAXBElement<String> value) {
        this.customerAccountID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the endorsement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsement() {
        return endorsement;
    }

    /**
     * Sets the value of the endorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsement(JAXBElement<String> value) {
        this.endorsement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateDateFrom() {
        return lastUpdateDateFrom;
    }

    /**
     * Sets the value of the lastUpdateDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateDateFrom(JAXBElement<String> value) {
        this.lastUpdateDateFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lastUpdateDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateDateTo() {
        return lastUpdateDateTo;
    }

    /**
     * Sets the value of the lastUpdateDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateDateTo(JAXBElement<String> value) {
        this.lastUpdateDateTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the renewalDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenewalDateFrom() {
        return renewalDateFrom;
    }

    /**
     * Sets the value of the renewalDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenewalDateFrom(JAXBElement<String> value) {
        this.renewalDateFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the renewalDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenewalDateTo() {
        return renewalDateTo;
    }

    /**
     * Sets the value of the renewalDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenewalDateTo(JAXBElement<String> value) {
        this.renewalDateTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpirationDateFrom() {
        return expirationDateFrom;
    }

    /**
     * Sets the value of the expirationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpirationDateFrom(JAXBElement<String> value) {
        this.expirationDateFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpirationDateTo() {
        return expirationDateTo;
    }

    /**
     * Sets the value of the expirationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpirationDateTo(JAXBElement<String> value) {
        this.expirationDateTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancelDuplicateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelDuplicateRegistration() {
        return cancelDuplicateRegistration;
    }

    /**
     * Sets the value of the cancelDuplicateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelDuplicateRegistration(JAXBElement<String> value) {
        this.cancelDuplicateRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the characterSetOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCharacterSetOverride() {
        return characterSetOverride;
    }

    /**
     * Sets the value of the characterSetOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCharacterSetOverride(JAXBElement<String> value) {
        this.characterSetOverride = ((JAXBElement<String> ) value);
    }

}
