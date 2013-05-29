
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookUpInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lookUpInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_or_Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DnB_DUNS_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Business_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Match_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Max_Responses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="File_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Search_Rule_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lookUpInput", propOrder = {
    "name",
    "streetAddress",
    "town",
    "postTown",
    "stateOrRegion",
    "postCode",
    "dnBDUNSNumber",
    "countryCode",
    "businessNumber",
    "telephoneNumber",
    "reasonCode",
    "matchType",
    "maxResponses",
    "fileId",
    "searchRuleCode"
})
public class LookUpInput {

    @XmlElementRef(name = "Name", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Street_Address", type = JAXBElement.class)
    protected JAXBElement<String> streetAddress;
    @XmlElementRef(name = "Town", type = JAXBElement.class)
    protected JAXBElement<String> town;
    @XmlElementRef(name = "PostTown", type = JAXBElement.class)
    protected JAXBElement<String> postTown;
    @XmlElementRef(name = "State_or_Region", type = JAXBElement.class)
    protected JAXBElement<String> stateOrRegion;
    @XmlElementRef(name = "Post_Code", type = JAXBElement.class)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "DnB_DUNS_Number", type = JAXBElement.class)
    protected JAXBElement<String> dnBDUNSNumber;
    @XmlElement(name = "Country_Code", required = true, nillable = true)
    protected String countryCode;
    @XmlElementRef(name = "Business_Number", type = JAXBElement.class)
    protected JAXBElement<String> businessNumber;
    @XmlElementRef(name = "Telephone_Number", type = JAXBElement.class)
    protected JAXBElement<String> telephoneNumber;
    @XmlElementRef(name = "Reason_Code", type = JAXBElement.class)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "Match_Type", type = JAXBElement.class)
    protected JAXBElement<String> matchType;
    @XmlElementRef(name = "Max_Responses", type = JAXBElement.class)
    protected JAXBElement<String> maxResponses;
    @XmlElementRef(name = "File_Id", type = JAXBElement.class)
    protected JAXBElement<String> fileId;
    @XmlElementRef(name = "Search_Rule_Code", type = JAXBElement.class)
    protected JAXBElement<String> searchRuleCode;

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
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetAddress(JAXBElement<String> value) {
        this.streetAddress = ((JAXBElement<String> ) value);
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
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostTown(JAXBElement<String> value) {
        this.postTown = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stateOrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateOrRegion() {
        return stateOrRegion;
    }

    /**
     * Sets the value of the stateOrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateOrRegion(JAXBElement<String> value) {
        this.stateOrRegion = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = ((JAXBElement<String> ) value);
    }

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
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the businessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessNumber() {
        return businessNumber;
    }

    /**
     * Sets the value of the businessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessNumber(JAXBElement<String> value) {
        this.businessNumber = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelephoneNumber(JAXBElement<String> value) {
        this.telephoneNumber = ((JAXBElement<String> ) value);
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
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatchType(JAXBElement<String> value) {
        this.matchType = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maxResponses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaxResponses() {
        return maxResponses;
    }

    /**
     * Sets the value of the maxResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaxResponses(JAXBElement<String> value) {
        this.maxResponses = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileId() {
        return fileId;
    }

    /**
     * Sets the value of the fileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileId(JAXBElement<String> value) {
        this.fileId = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the searchRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchRuleCode() {
        return searchRuleCode;
    }

    /**
     * Sets the value of the searchRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchRuleCode(JAXBElement<String> value) {
        this.searchRuleCode = ((JAXBElement<String> ) value);
    }

}
