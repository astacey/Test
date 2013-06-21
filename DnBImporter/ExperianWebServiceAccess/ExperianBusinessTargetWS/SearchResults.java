
package ExperianBusinessTargetWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}BusinessLocation" minOccurs="0"/>
 *         &lt;element name="SICInformation" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo" minOccurs="0"/>
 *         &lt;element name="BusinessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatchedPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatchedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResults", propOrder = {
    "legalStatus",
    "businessRef",
    "commercialName",
    "businessLocation",
    "sicInformation",
    "businessStatus",
    "businessActivities",
    "name",
    "nameType",
    "matchedPostcode",
    "matchedPhoneNumber"
})
public class SearchResults {

    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "BusinessRef")
    protected String businessRef;
    @XmlElement(name = "CommercialName")
    protected String commercialName;
    @XmlElement(name = "BusinessLocation")
    protected BusinessLocation businessLocation;
    @XmlElement(name = "SICInformation")
    protected SICInfo sicInformation;
    @XmlElement(name = "BusinessStatus")
    protected String businessStatus;
    @XmlElement(name = "BusinessActivities")
    protected String businessActivities;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "NameType")
    protected String nameType;
    @XmlElement(name = "MatchedPostcode")
    protected String matchedPostcode;
    @XmlElement(name = "MatchedPhoneNumber")
    protected String matchedPhoneNumber;

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the businessRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessRef() {
        return businessRef;
    }

    /**
     * Sets the value of the businessRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessRef(String value) {
        this.businessRef = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

    /**
     * Gets the value of the businessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLocation }
     *     
     */
    public BusinessLocation getBusinessLocation() {
        return businessLocation;
    }

    /**
     * Sets the value of the businessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLocation }
     *     
     */
    public void setBusinessLocation(BusinessLocation value) {
        this.businessLocation = value;
    }

    /**
     * Gets the value of the sicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo }
     *     
     */
    public SICInfo getSICInformation() {
        return sicInformation;
    }

    /**
     * Sets the value of the sicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo }
     *     
     */
    public void setSICInformation(SICInfo value) {
        this.sicInformation = value;
    }

    /**
     * Gets the value of the businessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessStatus() {
        return businessStatus;
    }

    /**
     * Sets the value of the businessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessStatus(String value) {
        this.businessStatus = value;
    }

    /**
     * Gets the value of the businessActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessActivities() {
        return businessActivities;
    }

    /**
     * Sets the value of the businessActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessActivities(String value) {
        this.businessActivities = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the matchedPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedPostcode() {
        return matchedPostcode;
    }

    /**
     * Sets the value of the matchedPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedPostcode(String value) {
        this.matchedPostcode = value;
    }

    /**
     * Gets the value of the matchedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchedPhoneNumber() {
        return matchedPhoneNumber;
    }

    /**
     * Sets the value of the matchedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchedPhoneNumber(String value) {
        this.matchedPhoneNumber = value;
    }

}
