
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectInformationDetailedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectInformationDetailedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gateway.dnb.com/getProduct}SubjectInformationBaseType">
 *       &lt;sequence>
 *         &lt;element name="BusinessName" type="{http://gateway.dnb.com/getProduct}BusinessNameType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://gateway.dnb.com/getProduct}RegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberTypeCode" type="{http://gateway.dnb.com/getProduct}RegistrationNumberTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://gateway.dnb.com/getProduct}AddressBaseType" minOccurs="0"/>
 *         &lt;element name="Communication" type="{http://gateway.dnb.com/getProduct}CommunicationBaseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectInformationDetailedType", propOrder = {
    "businessName",
    "registrationNumber",
    "registrationNumberTypeCode",
    "address",
    "communication"
})
public class SubjectInformationDetailedType
    extends SubjectInformationBaseType
{

    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationNumberTypeCode")
    protected String registrationNumberTypeCode;
    @XmlElement(name = "Address")
    protected AddressBaseType address;
    @XmlElement(name = "Communication")
    protected CommunicationBaseType communication;

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
     *     {@link AddressBaseType }
     *     
     */
    public AddressBaseType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBaseType }
     *     
     */
    public void setAddress(AddressBaseType value) {
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
