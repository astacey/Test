
package DBAddRegistrationClientV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addRegistrationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addRegistrationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notification_Level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Customer_Account_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Endorsement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Do_not_Renew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trade_up_Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addRegistrationData", propOrder = {
    "dnBDUNSNumber",
    "countryCode",
    "productName",
    "notificationLevel",
    "customerAccountID",
    "endorsement",
    "expirationDate",
    "reasonCode",
    "doNotRenew",
    "tradeUpIndicator"
})
public class AddRegistrationData {

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
    @XmlElementRef(name = "Endorsement", type = JAXBElement.class)
    protected JAXBElement<String> endorsement;
    @XmlElementRef(name = "Expiration_Date", type = JAXBElement.class)
    protected JAXBElement<String> expirationDate;
    @XmlElementRef(name = "Reason_Code", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "Do_not_Renew", type = JAXBElement.class)
    protected JAXBElement<String> doNotRenew;
    @XmlElementRef(name = "Trade_up_Indicator", type = JAXBElement.class)
    protected JAXBElement<String> tradeUpIndicator;

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
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the doNotRenew property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotRenew() {
        return doNotRenew;
    }

    /**
     * Sets the value of the doNotRenew property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotRenew(JAXBElement<String> value) {
        this.doNotRenew = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradeUpIndicator(JAXBElement<String> value) {
        this.tradeUpIndicator = ((JAXBElement<String> ) value);
    }

}
