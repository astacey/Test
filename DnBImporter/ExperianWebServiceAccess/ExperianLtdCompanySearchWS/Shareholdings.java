
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholdings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholdings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentPreviousFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ShareClassNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareholdingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNominalCapital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageTotalCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Approximation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Shareholdings", propOrder = {
    "recordType",
    "issuingCompany",
    "currentPreviousFlag",
    "effectiveDate",
    "shareClassNo",
    "shareholdingNo",
    "numShares",
    "totalNominalCapital",
    "percentage",
    "percentageTotalCapital",
    "approximation",
    "latestUpdate"
})
public class Shareholdings {

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
    @XmlElement(name = "NumShares")
    protected Long numShares;
    @XmlElement(name = "TotalNominalCapital")
    protected String totalNominalCapital;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "PercentageTotalCapital")
    protected BigDecimal percentageTotalCapital;
    @XmlElement(name = "Approximation")
    protected String approximation;
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
     * Gets the value of the percentageTotalCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageTotalCapital() {
        return percentageTotalCapital;
    }

    /**
     * Sets the value of the percentageTotalCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageTotalCapital(BigDecimal value) {
        this.percentageTotalCapital = value;
    }

    /**
     * Gets the value of the approximation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximation() {
        return approximation;
    }

    /**
     * Sets the value of the approximation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximation(String value) {
        this.approximation = value;
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
