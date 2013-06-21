
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareCapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareCapital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPreviousFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ShareClassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareClassDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VotingRights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalNominalCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "ShareCapital", propOrder = {
    "recordType",
    "issuingCompany",
    "currentPreviousFlag",
    "effectiveDate",
    "shareClassNo",
    "currency",
    "shareClassCode",
    "shareClassDesc",
    "votingRights",
    "totalNominalCapital",
    "numShares",
    "nominalValue",
    "percentage",
    "latestUpdate"
})
public class ShareCapital {

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
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ShareClassCode")
    protected String shareClassCode;
    @XmlElement(name = "ShareClassDesc")
    protected String shareClassDesc;
    @XmlElement(name = "VotingRights")
    protected String votingRights;
    @XmlElement(name = "TotalNominalCapital")
    protected String totalNominalCapital;
    @XmlElement(name = "NumShares")
    protected Long numShares;
    @XmlElement(name = "NominalValue")
    protected String nominalValue;
    @XmlElement(name = "Percentage", required = true)
    protected BigDecimal percentage;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the shareClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareClassCode() {
        return shareClassCode;
    }

    /**
     * Sets the value of the shareClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareClassCode(String value) {
        this.shareClassCode = value;
    }

    /**
     * Gets the value of the shareClassDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareClassDesc() {
        return shareClassDesc;
    }

    /**
     * Sets the value of the shareClassDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareClassDesc(String value) {
        this.shareClassDesc = value;
    }

    /**
     * Gets the value of the votingRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingRights() {
        return votingRights;
    }

    /**
     * Sets the value of the votingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotingRights(String value) {
        this.votingRights = value;
    }

    /**
     * Gets the value of the totalNominalCapital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNominalCapital() {
        return totalNominalCapital;
    }

    /**
     * Sets the value of the totalNominalCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNominalCapital(String value) {
        this.totalNominalCapital = value;
    }

    /**
     * Gets the value of the numShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumShares() {
        return numShares;
    }

    /**
     * Sets the value of the numShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumShares(Long value) {
        this.numShares = value;
    }

    /**
     * Gets the value of the nominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalValue() {
        return nominalValue;
    }

    /**
     * Sets the value of the nominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalValue(String value) {
        this.nominalValue = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
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
