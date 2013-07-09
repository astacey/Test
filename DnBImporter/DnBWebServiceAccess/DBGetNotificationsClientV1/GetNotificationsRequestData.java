
package DBGetNotificationsClientV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNotificationsRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNotificationsRequestData">
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
 *         &lt;element name="Detection_Date_From" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Detection_Date_To" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Received_Date_From" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Received_Date_To" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Active_Registrations_only" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pending_Notices_only" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Do_not_Mark_as_Read" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getNotificationsRequestData", propOrder = {
    "dnBDUNSNumber",
    "countryCode",
    "productName",
    "notificationLevel",
    "customerAccountID",
    "endorsement",
    "userLevel",
    "resultTicket",
    "detectionDateFrom",
    "detectionDateTo",
    "receivedDateFrom",
    "receivedDateTo",
    "activeRegistrationsOnly",
    "pendingNoticesOnly",
    "doNotMarkAsRead",
    "characterSetOverride"
})
public class GetNotificationsRequestData {

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
    @XmlElement(name = "Detection_Date_From", required = true, nillable = true)
    protected String detectionDateFrom;
    @XmlElement(name = "Detection_Date_To", required = true, nillable = true)
    protected String detectionDateTo;
    @XmlElementRef(name = "Received_Date_From", type = JAXBElement.class)
    protected JAXBElement<String> receivedDateFrom;
    @XmlElementRef(name = "Received_Date_To", type = JAXBElement.class)
    protected JAXBElement<String> receivedDateTo;
    @XmlElementRef(name = "Active_Registrations_only", type = JAXBElement.class)
    protected JAXBElement<String> activeRegistrationsOnly;
    @XmlElementRef(name = "Pending_Notices_only", type = JAXBElement.class)
    protected JAXBElement<String> pendingNoticesOnly;
    @XmlElementRef(name = "Do_not_Mark_as_Read", type = JAXBElement.class)
    protected JAXBElement<String> doNotMarkAsRead;
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
     * Gets the value of the detectionDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectionDateFrom() {
        return detectionDateFrom;
    }

    /**
     * Sets the value of the detectionDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectionDateFrom(String value) {
        this.detectionDateFrom = value;
    }

    /**
     * Gets the value of the detectionDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectionDateTo() {
        return detectionDateTo;
    }

    /**
     * Sets the value of the detectionDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectionDateTo(String value) {
        this.detectionDateTo = value;
    }

    /**
     * Gets the value of the receivedDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivedDateFrom() {
        return receivedDateFrom;
    }

    /**
     * Sets the value of the receivedDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivedDateFrom(JAXBElement<String> value) {
        this.receivedDateFrom = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the receivedDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceivedDateTo() {
        return receivedDateTo;
    }

    /**
     * Sets the value of the receivedDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceivedDateTo(JAXBElement<String> value) {
        this.receivedDateTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the activeRegistrationsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveRegistrationsOnly() {
        return activeRegistrationsOnly;
    }

    /**
     * Sets the value of the activeRegistrationsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveRegistrationsOnly(JAXBElement<String> value) {
        this.activeRegistrationsOnly = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pendingNoticesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPendingNoticesOnly() {
        return pendingNoticesOnly;
    }

    /**
     * Sets the value of the pendingNoticesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPendingNoticesOnly(JAXBElement<String> value) {
        this.pendingNoticesOnly = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the doNotMarkAsRead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotMarkAsRead() {
        return doNotMarkAsRead;
    }

    /**
     * Sets the value of the doNotMarkAsRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotMarkAsRead(JAXBElement<String> value) {
        this.doNotMarkAsRead = ((JAXBElement<String> ) value);
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
