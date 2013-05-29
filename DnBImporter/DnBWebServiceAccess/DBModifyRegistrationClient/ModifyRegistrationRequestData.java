
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for modifyRegistrationRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modifyRegistrationRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notification_Level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Customer_Account_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_Account_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="New_Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cancel_Registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Un-cancel_Registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Renew_Registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Do_not_Renew_Registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "modifyRegistrationRequestData", propOrder = {
    "dnBDUNSNumber",
    "countryCode",
    "productName",
    "notificationLevel",
    "customerAccountID",
    "newAccountID",
    "customerEndorsement",
    "newEndorsement",
    "cancelRegistration",
    "unCancelRegistration",
    "renewRegistration",
    "doNotRenewRegistration",
    "expirationDate",
    "characterSetOverride"
})
public class ModifyRegistrationRequestData {

    @XmlElement(name = "DnB_DUNS_Number", required = true, nillable = true)
    protected String dnBDUNSNumber;
    @XmlElementRef(name = "CountryCode", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlElement(name = "Product_Name", required = true, nillable = true)
    protected String productName;
    @XmlElement(name = "Notification_Level", required = true, nillable = true)
    protected String notificationLevel;
    @XmlElementRef(name = "Customer_Account_ID", type = JAXBElement.class)
    protected JAXBElement<String> customerAccountID;
    @XmlElementRef(name = "New_Account_ID", type = JAXBElement.class)
    protected JAXBElement<String> newAccountID;
    @XmlElementRef(name = "Customer_Endorsement", type = JAXBElement.class)
    protected JAXBElement<String> customerEndorsement;
    @XmlElementRef(name = "New_Endorsement", type = JAXBElement.class)
    protected JAXBElement<String> newEndorsement;
    @XmlElementRef(name = "Cancel_Registration", type = JAXBElement.class)
    protected JAXBElement<String> cancelRegistration;
    @XmlElementRef(name = "Un-cancel_Registration", type = JAXBElement.class)
    protected JAXBElement<String> unCancelRegistration;
    @XmlElementRef(name = "Renew_Registration", type = JAXBElement.class)
    protected JAXBElement<String> renewRegistration;
    @XmlElementRef(name = "Do_not_Renew_Registration", type = JAXBElement.class)
    protected JAXBElement<String> doNotRenewRegistration;
    @XmlElementRef(name = "Expiration_Date", type = JAXBElement.class)
    protected JAXBElement<String> expirationDate;
    @XmlElementRef(name = "Character_Set_Override", type = JAXBElement.class)
    protected JAXBElement<String> characterSetOverride;

    /**
     * Gets the value of the dnBDUNSNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnBDUNSNumber() {
        return dnBDUNSNumber;
    }

    /**
     * Sets the value of the dnBDUNSNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnBDUNSNumber(String value) {
        this.dnBDUNSNumber = value;
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
     *     {@link String }
     *     
     */
    public String getNotificationLevel() {
        return notificationLevel;
    }

    /**
     * Sets the value of the notificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationLevel(String value) {
        this.notificationLevel = value;
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
     * Gets the value of the newAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewAccountID() {
        return newAccountID;
    }

    /**
     * Sets the value of the newAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewAccountID(JAXBElement<String> value) {
        this.newAccountID = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the customerEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerEndorsement() {
        return customerEndorsement;
    }

    /**
     * Sets the value of the customerEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerEndorsement(JAXBElement<String> value) {
        this.customerEndorsement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the newEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewEndorsement() {
        return newEndorsement;
    }

    /**
     * Sets the value of the newEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewEndorsement(JAXBElement<String> value) {
        this.newEndorsement = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the cancelRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCancelRegistration() {
        return cancelRegistration;
    }

    /**
     * Sets the value of the cancelRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCancelRegistration(JAXBElement<String> value) {
        this.cancelRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unCancelRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnCancelRegistration() {
        return unCancelRegistration;
    }

    /**
     * Sets the value of the unCancelRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnCancelRegistration(JAXBElement<String> value) {
        this.unCancelRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the renewRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRenewRegistration() {
        return renewRegistration;
    }

    /**
     * Sets the value of the renewRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRenewRegistration(JAXBElement<String> value) {
        this.renewRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the doNotRenewRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotRenewRegistration() {
        return doNotRenewRegistration;
    }

    /**
     * Sets the value of the doNotRenewRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotRenewRegistration(JAXBElement<String> value) {
        this.doNotRenewRegistration = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExpirationDate(JAXBElement<String> value) {
        this.expirationDate = ((JAXBElement<String> ) value);
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
