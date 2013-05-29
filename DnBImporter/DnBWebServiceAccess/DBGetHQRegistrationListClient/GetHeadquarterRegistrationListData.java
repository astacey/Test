
package DBGetHQRegistrationListClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getHeadquarterRegistrationListData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getHeadquarterRegistrationListData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notification_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Customer_Account_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result_Ticket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Update_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Last_Update_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Renewal_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Renewal_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getHeadquarterRegistrationListData", propOrder = {
    "dnBDUNSNumber",
    "countryCode",
    "productName",
    "notificationLevel",
    "customerAccountID",
    "endorsement",
    "userLevel",
    "resultTicket",
    "lastUpdateDateFrom",
    "lastUpdateDateTo",
    "renewalDateFrom",
    "renewalDateTo",
    "expirationDateFrom",
    "expirationDateTo",
    "characterSetOverride"
})
public class GetHeadquarterRegistrationListData {

    @XmlElementRef(name = "DnB_DUNS_Number", type = JAXBElement.class)
    protected JAXBElement<String> dnBDUNSNumber;
    @XmlElementRef(name = "CountryCode", type = JAXBElement.class)
    protected JAXBElement<String> countryCode;
    @XmlElementRef(name = "Product_Name", type = JAXBElement.class)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "Notification_Level", type = JAXBElement.class)
    protected JAXBElement<String> notificationLevel;
    @XmlElementRef(name = "Customer_Account_ID", type = JAXBElement.class)
    protected JAXBElement<String> customerAccountID;
    @XmlElementRef(name = "Endorsement", type = JAXBElement.class)
    protected JAXBElement<String> endorsement;
    @XmlElementRef(name = "User_Level", type = JAXBElement.class)
    protected JAXBElement<String> userLevel;
    @XmlElementRef(name = "Result_Ticket", type = JAXBElement.class)
    protected JAXBElement<String> resultTicket;
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
    @XmlElementRef(name = "Character_Set_Override", type = JAXBElement.class)
    protected JAXBElement<String> characterSetOverride;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = ((JAXBElement<String> ) value);
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
     * Gets the value of the userLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLevel() {
        return userLevel;
    }

    /**
     * Sets the value of the userLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLevel(JAXBElement<String> value) {
        this.userLevel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the resultTicket property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultTicket() {
        return resultTicket;
    }

    /**
     * Sets the value of the resultTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultTicket(JAXBElement<String> value) {
        this.resultTicket = ((JAXBElement<String> ) value);
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
