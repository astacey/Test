
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPreviousFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ShareClassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareholdingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareholderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareholderDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}SharehldrsDetails" minOccurs="0"/>
 *         &lt;element name="NOCRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestUpdate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Shareholder", propOrder = {
    "recordType",
    "issuingCompany",
    "currentPreviousFlag",
    "effectiveDate",
    "shareClassNo",
    "shareholdingNo",
    "shareholderNo",
    "shareholderDetails",
    "nocRef",
    "latestUpdate"
})
public class Shareholder {

    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "IssuingCompany")
    protected String issuingCompany;
    @XmlElement(name = "CurrentPreviousFlag")
    protected String currentPreviousFlag;
    @XmlElement(name = "EffectiveDate")
    protected CCYYMMDD effectiveDate;
    @XmlElement(name = "ShareClassNo")
    protected String shareClassNo;
    @XmlElement(name = "ShareholdingNo")
    protected String shareholdingNo;
    @XmlElement(name = "ShareholderNo")
    protected String shareholderNo;
    @XmlElement(name = "ShareholderDetails")
    protected SharehldrsDetails shareholderDetails;
    @XmlElement(name = "NOCRef")
    protected String nocRef;
    @XmlElement(name = "LatestUpdate")
    protected CCYYMMDD latestUpdate;

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the issuingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCompany() {
        return issuingCompany;
    }

    /**
     * Sets the value of the issuingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCompany(String value) {
        this.issuingCompany = value;
    }

    /**
     * Gets the value of the currentPreviousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPreviousFlag() {
        return currentPreviousFlag;
    }

    /**
     * Sets the value of the currentPreviousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPreviousFlag(String value) {
        this.currentPreviousFlag = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setEffectiveDate(CCYYMMDD value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the shareClassNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareClassNo() {
        return shareClassNo;
    }

    /**
     * Sets the value of the shareClassNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareClassNo(String value) {
        this.shareClassNo = value;
    }

    /**
     * Gets the value of the shareholdingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareholdingNo() {
        return shareholdingNo;
    }

    /**
     * Sets the value of the shareholdingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareholdingNo(String value) {
        this.shareholdingNo = value;
    }

    /**
     * Gets the value of the shareholderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareholderNo() {
        return shareholderNo;
    }

    /**
     * Sets the value of the shareholderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareholderNo(String value) {
        this.shareholderNo = value;
    }

    /**
     * Gets the value of the shareholderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SharehldrsDetails }
     *     
     */
    public SharehldrsDetails getShareholderDetails() {
        return shareholderDetails;
    }

    /**
     * Sets the value of the shareholderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharehldrsDetails }
     *     
     */
    public void setShareholderDetails(SharehldrsDetails value) {
        this.shareholderDetails = value;
    }

    /**
     * Gets the value of the nocRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCRef() {
        return nocRef;
    }

    /**
     * Sets the value of the nocRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCRef(String value) {
        this.nocRef = value;
    }

    /**
     * Gets the value of the latestUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestUpdate() {
        return latestUpdate;
    }

    /**
     * Sets the value of the latestUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestUpdate(CCYYMMDD value) {
        this.latestUpdate = value;
    }

}
