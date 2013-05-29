
package DBDataWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rpt_Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email_Copy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Business_Num_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address_Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_or_Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postal_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationDelivery", propOrder = {
    "mode",
    "format",
    "rptLanguage",
    "email",
    "emailCopy",
    "name",
    "businessNum",
    "businessNumType",
    "phone",
    "addressLine1",
    "addressLine2",
    "town",
    "stateOrProvince",
    "postalCode"
})
public class NotificationDelivery {

    @XmlElementRef(name = "Mode", type = JAXBElement.class)
    protected JAXBElement<String> mode;
    @XmlElementRef(name = "Format", type = JAXBElement.class)
    protected JAXBElement<String> format;
    @XmlElementRef(name = "Rpt_Language", type = JAXBElement.class)
    protected JAXBElement<String> rptLanguage;
    @XmlElementRef(name = "Email", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "Email_Copy", type = JAXBElement.class)
    protected JAXBElement<String> emailCopy;
    @XmlElementRef(name = "Name", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Business_Num", type = JAXBElement.class)
    protected JAXBElement<String> businessNum;
    @XmlElementRef(name = "Business_Num_Type", type = JAXBElement.class)
    protected JAXBElement<String> businessNumType;
    @XmlElementRef(name = "Phone", type = JAXBElement.class)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "Address_Line1", type = JAXBElement.class)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "Address_Line2", type = JAXBElement.class)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "Town", type = JAXBElement.class)
    protected JAXBElement<String> town;
    @XmlElementRef(name = "State_or_Province", type = JAXBElement.class)
    protected JAXBElement<String> stateOrProvince;
    @XmlElementRef(name = "Postal_Code", type = JAXBElement.class)
    protected JAXBElement<String> postalCode;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMode(JAXBElement<String> value) {
        this.mode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rptLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRptLanguage() {
        return rptLanguage;
    }

    /**
     * Sets the value of the rptLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRptLanguage(JAXBElement<String> value) {
        this.rptLanguage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the emailCopy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailCopy() {
        return emailCopy;
    }

    /**
     * Sets the value of the emailCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailCopy(JAXBElement<String> value) {
        this.emailCopy = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessNum() {
        return businessNum;
    }

    /**
     * Sets the value of the businessNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessNum(JAXBElement<String> value) {
        this.businessNum = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the businessNumType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessNumType() {
        return businessNumType;
    }

    /**
     * Sets the value of the businessNumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessNumType(JAXBElement<String> value) {
        this.businessNumType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTown(JAXBElement<String> value) {
        this.town = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOrProvince(JAXBElement<String> value) {
        this.stateOrProvince = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = ((JAXBElement<String> ) value);
    }

}
