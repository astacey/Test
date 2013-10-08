
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectInformationComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectInformationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectCountryCode" type="{http://gateway.dnb.com/getProduct}CountryCodeType"/>
 *         &lt;element name="CEOName" type="{http://gateway.dnb.com/getProduct}CEONameType" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://gateway.dnb.com/getProduct}BusinessNameType" minOccurs="0"/>
 *         &lt;element name="TradeStyleName" type="{http://gateway.dnb.com/getProduct}TradeStyleNameType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://gateway.dnb.com/getProduct}RegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberTypeCode" type="{http://gateway.dnb.com/getProduct}RegistrationNumberTypeCodeType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberSuffixText" type="{http://gateway.dnb.com/getProduct}RegistrationNumberSuffixTextType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberPrefixText" type="{http://gateway.dnb.com/getProduct}RegistrationNumberPrefixTextType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://gateway.dnb.com/getProduct}AddressAdvancedType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://gateway.dnb.com/getProduct}CommunicationDetailedType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectInformationComplexType", propOrder = {
    "dunsNumber",
    "subjectCountryCode",
    "ceoName",
    "businessName",
    "tradeStyleName",
    "registrationNumber",
    "registrationNumberTypeCode",
    "registrationNumberSuffixText",
    "registrationNumberPrefixText",
    "address",
    "communication"
})
public class SubjectInformationComplexType {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectCountryCode", required = true)
    protected String subjectCountryCode;
    @XmlElement(name = "CEOName")
    protected String ceoName;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "TradeStyleName")
    protected String tradeStyleName;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationNumberTypeCode")
    protected String registrationNumberTypeCode;
    @XmlElement(name = "RegistrationNumberSuffixText")
    protected String registrationNumberSuffixText;
    @XmlElement(name = "RegistrationNumberPrefixText")
    protected String registrationNumberPrefixText;
    @XmlElement(name = "Address")
    protected AddressAdvancedType address;
    @XmlElement(name = "Communication")
    protected CommunicationDetailedType communication;

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
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEOName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEOName(String value) {
        this.ceoName = value;
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
     * Gets the value of the tradeStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeStyleName() {
        return tradeStyleName;
    }

    /**
     * Sets the value of the tradeStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeStyleName(String value) {
        this.tradeStyleName = value;
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
     * Gets the value of the registrationNumberSuffixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumberSuffixText() {
        return registrationNumberSuffixText;
    }

    /**
     * Sets the value of the registrationNumberSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumberSuffixText(String value) {
        this.registrationNumberSuffixText = value;
    }

    /**
     * Gets the value of the registrationNumberPrefixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumberPrefixText() {
        return registrationNumberPrefixText;
    }

    /**
     * Sets the value of the registrationNumberPrefixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumberPrefixText(String value) {
        this.registrationNumberPrefixText = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAdvancedType }
     *     
     */
    public AddressAdvancedType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAdvancedType }
     *     
     */
    public void setAddress(AddressAdvancedType value) {
        this.address = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationDetailedType }
     *     
     */
    public CommunicationDetailedType getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationDetailedType }
     *     
     */
    public void setCommunication(CommunicationDetailedType value) {
        this.communication = value;
    }

}
