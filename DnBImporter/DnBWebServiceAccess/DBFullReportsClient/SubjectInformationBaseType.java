
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectInformationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectInformationBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSNumberType"/>
 *         &lt;element name="SubjectCountryCode" type="{http://gateway.dnb.com/getProduct}CountryCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectInformationBaseType", propOrder = {
    "dunsNumber",
    "subjectCountryCode"
})
@XmlSeeAlso({
    SubjectInformationDetailedType.class
})
public class SubjectInformationBaseType {

    @XmlElement(name = "DUNSNumber", required = true)
    protected String dunsNumber;
    @XmlElement(name = "SubjectCountryCode", required = true)
    protected String subjectCountryCode;

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

}
