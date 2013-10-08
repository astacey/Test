
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectInformationAdvancedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectInformationAdvancedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectCountryCode" type="{http://gateway.dnb.com/getProduct}CountryCodeType"/>
 *         &lt;element name="BusinessName" type="{http://gateway.dnb.com/getProduct}BusinessNameType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://gateway.dnb.com/getProduct}RegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberTypeCode" type="{http://gateway.dnb.com/getProduct}RegistrationNumberTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://gateway.dnb.com/getProduct}AddressDetailedType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://gateway.dnb.com/getProduct}CommunicationBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectInformationAdvancedType", propOrder = {
    "dunsNumber",
    "subjectCountryCode",
    "businessName",
    "registrationNumber",
    "registrationNumberTypeCode",
    "address",
    "communication"
})
public class SubjectInformationAdvancedType {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectCountryCode", required = true)
    protected String subjectCountryCode;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationNumberTypeCode")
    protected String registrationNumberTypeCode;
    @XmlElement(name = "Address")
    protected AddressDetailedType address;
    @XmlElement(name = "Communication")
    protected CommunicationBaseType communication;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the subjectCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCountryCode() {
        return subjectCountryCode;
    }

    /**
     * Sets the value of the subjectCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCountryCode(String value) {
        this.subjectCountryCode = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registrationNumberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumberTypeCode() {
        return registrationNumberTypeCode;
    }

    /**
     * Sets the value of the registrationNumberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumberTypeCode(String value) {
        this.registrationNumberTypeCode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailedType }
     *     
     */
    public AddressDetailedType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailedType }
     *     
     */
    public void setAddress(AddressDetailedType value) {
        this.address = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationBaseType }
     *     
     */
    public CommunicationBaseType getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationBaseType }
     *     
     */
    public void setCommunication(CommunicationBaseType value) {
        this.communication = value;
    }

}
