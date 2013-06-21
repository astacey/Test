
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrevSearchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrevSearchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="EnquiryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnEnquiryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICInformation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CPSNonLtdSICInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrevSearchDetail", propOrder = {
    "searchDate",
    "enquiryType",
    "creditRequired",
    "ownEnquiryFlag",
    "sicInformation"
})
public class PrevSearchDetail {

    @XmlElement(name = "SearchDate")
    protected CCYYMMDD searchDate;
    @XmlElement(name = "EnquiryType")
    protected String enquiryType;
    @XmlElement(name = "CreditRequired")
    protected String creditRequired;
    @XmlElement(name = "OwnEnquiryFlag")
    protected String ownEnquiryFlag;
    @XmlElement(name = "SICInformation")
    protected CPSNonLtdSICInfo sicInformation;

    /**
     * Gets the value of the searchDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getSearchDate() {
        return searchDate;
    }

    /**
     * Sets the value of the searchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setSearchDate(CCYYMMDD value) {
        this.searchDate = value;
    }

    /**
     * Gets the value of the enquiryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquiryType() {
        return enquiryType;
    }

    /**
     * Sets the value of the enquiryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquiryType(String value) {
        this.enquiryType = value;
    }

    /**
     * Gets the value of the creditRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRequired() {
        return creditRequired;
    }

    /**
     * Sets the value of the creditRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRequired(String value) {
        this.creditRequired = value;
    }

    /**
     * Gets the value of the ownEnquiryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnEnquiryFlag() {
        return ownEnquiryFlag;
    }

    /**
     * Sets the value of the ownEnquiryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnEnquiryFlag(String value) {
        this.ownEnquiryFlag = value;
    }

    /**
     * Gets the value of the sicInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CPSNonLtdSICInfo }
     *     
     */
    public CPSNonLtdSICInfo getSICInformation() {
        return sicInformation;
    }

    /**
     * Sets the value of the sicInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPSNonLtdSICInfo }
     *     
     */
    public void setSICInformation(CPSNonLtdSICInfo value) {
        this.sicInformation = value;
    }

}
