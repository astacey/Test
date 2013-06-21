
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThomsonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThomsonData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThomsonCustNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ThomsonPremiseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThomsonData", propOrder = {
    "thomsonCustNumber",
    "lastUpdatedDate",
    "createdDate",
    "thomsonPremiseCode",
    "url",
    "email"
})
public class ThomsonData {

    @XmlElement(name = "ThomsonCustNumber")
    protected String thomsonCustNumber;
    @XmlElement(name = "LastUpdatedDate")
    protected CCYYMMDD lastUpdatedDate;
    @XmlElement(name = "CreatedDate")
    protected CCYYMMDD createdDate;
    @XmlElement(name = "ThomsonPremiseCode")
    protected String thomsonPremiseCode;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "Email")
    protected String email;

    /**
     * Gets the value of the thomsonCustNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThomsonCustNumber() {
        return thomsonCustNumber;
    }

    /**
     * Sets the value of the thomsonCustNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThomsonCustNumber(String value) {
        this.thomsonCustNumber = value;
    }

    /**
     * Gets the value of the lastUpdatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * Sets the value of the lastUpdatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLastUpdatedDate(CCYYMMDD value) {
        this.lastUpdatedDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setCreatedDate(CCYYMMDD value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the thomsonPremiseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThomsonPremiseCode() {
        return thomsonPremiseCode;
    }

    /**
     * Sets the value of the thomsonPremiseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThomsonPremiseCode(String value) {
        this.thomsonPremiseCode = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
