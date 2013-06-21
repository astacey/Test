
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HeaderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPreviousFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="BulkList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastList" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppressedInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestCurrent" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestPrevious" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestUpdate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DateLoaded" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderInfo", propOrder = {
    "recordType",
    "issuingCompany",
    "currentPreviousFlag",
    "effectiveDate",
    "bulkList",
    "issuedCapital",
    "legalStatus",
    "lastList",
    "documentType",
    "suppressedInfo",
    "latestCurrent",
    "latestPrevious",
    "latestUpdate",
    "dateLoaded"
})
public class HeaderInfo {

    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "IssuingCompany")
    protected String issuingCompany;
    @XmlElement(name = "CurrentPreviousFlag")
    protected String currentPreviousFlag;
    @XmlElement(name = "EffectiveDate")
    protected CCYYMMDD effectiveDate;
    @XmlElement(name = "BulkList")
    protected String bulkList;
    @XmlElement(name = "IssuedCapital")
    protected String issuedCapital;
    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "LastList")
    protected CCYYMMDD lastList;
    @XmlElement(name = "DocumentType")
    protected String documentType;
    @XmlElement(name = "SuppressedInfo")
    protected String suppressedInfo;
    @XmlElement(name = "LatestCurrent")
    protected CCYYMMDD latestCurrent;
    @XmlElement(name = "LatestPrevious")
    protected CCYYMMDD latestPrevious;
    @XmlElement(name = "LatestUpdate")
    protected CCYYMMDD latestUpdate;
    @XmlElement(name = "DateLoaded")
    protected CCYYMMDD dateLoaded;

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
     * Gets the value of the bulkList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkList() {
        return bulkList;
    }

    /**
     * Sets the value of the bulkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkList(String value) {
        this.bulkList = value;
    }

    /**
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedCapital(String value) {
        this.issuedCapital = value;
    }

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
     * Gets the value of the lastList property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLastList() {
        return lastList;
    }

    /**
     * Sets the value of the lastList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLastList(CCYYMMDD value) {
        this.lastList = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the suppressedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressedInfo() {
        return suppressedInfo;
    }

    /**
     * Sets the value of the suppressedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressedInfo(String value) {
        this.suppressedInfo = value;
    }

    /**
     * Gets the value of the latestCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestCurrent() {
        return latestCurrent;
    }

    /**
     * Sets the value of the latestCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestCurrent(CCYYMMDD value) {
        this.latestCurrent = value;
    }

    /**
     * Gets the value of the latestPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestPrevious() {
        return latestPrevious;
    }

    /**
     * Sets the value of the latestPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestPrevious(CCYYMMDD value) {
        this.latestPrevious = value;
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

    /**
     * Gets the value of the dateLoaded property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateLoaded() {
        return dateLoaded;
    }

    /**
     * Sets the value of the dateLoaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateLoaded(CCYYMMDD value) {
        this.dateLoaded = value;
    }

}
