
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectInformationMinimalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectInformationMinimalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="SubjectCountryCode" type="{http://gateway.dnb.com/getProduct}CountryCodeType"/>
 *         &lt;element name="RegistrationNumber" type="{http://gateway.dnb.com/getProduct}RegistrationNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationNumberTypeCode" type="{http://gateway.dnb.com/getProduct}RegistrationNumberTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectInformationMinimalType", propOrder = {
    "dunsNumber",
    "subjectCountryCode",
    "registrationNumber",
    "registrationNumberTypeCode"
})
public class SubjectInformationMinimalType {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "SubjectCountryCode", required = true)
    protected String subjectCountryCode;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;
    @XmlElement(name = "RegistrationNumberTypeCode")
    protected String registrationNumberTypeCode;

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

}
