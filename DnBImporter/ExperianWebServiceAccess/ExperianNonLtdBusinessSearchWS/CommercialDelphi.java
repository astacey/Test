
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialDelphi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialDelphi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeySegmentData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Consent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SearchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProbabilityDefaultScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiBandText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PossRelatedDataFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessNOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietor1NOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietor2NOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Proprietor3NOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRatingOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPropsSearched" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPropsFound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPropsNoData" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPropsNotTraced" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NameAddressFlag1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameAddressFlag2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameAddressFlag3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConcludingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NOCText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PossRelatedDataText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialDelphi", propOrder = {
    "keySegmentData",
    "consent",
    "searchType",
    "commDelphiScore",
    "creditRating",
    "creditLimit",
    "probabilityDefaultScore",
    "stabilityOdds",
    "commDelphiBandText",
    "possRelatedDataFlag",
    "businessNOCFlag",
    "proprietor1NOCFlag",
    "proprietor2NOCFlag",
    "proprietor3NOCFlag",
    "overrideIndicator",
    "creditRatingOverrideIndicator",
    "creditLimitOverrideIndicator",
    "creditTextOverrideIndicator",
    "numPropsSearched",
    "numPropsFound",
    "numPropsNoData",
    "numPropsNotTraced",
    "nameAddressFlag1",
    "nameAddressFlag2",
    "nameAddressFlag3",
    "riskText",
    "creditText",
    "concludingText",
    "nocText",
    "possRelatedDataText"
})
public class CommercialDelphi {

    @XmlElement(name = "KeySegmentData")
    protected String keySegmentData;
    @XmlElement(name = "Consent")
    protected String consent;
    @XmlElement(name = "SearchType")
    protected String searchType;
    @XmlElement(name = "CommDelphiScore")
    protected String commDelphiScore;
    @XmlElement(name = "CreditRating")
    protected String creditRating;
    @XmlElement(name = "CreditLimit")
    protected String creditLimit;
    @XmlElement(name = "ProbabilityDefaultScore")
    protected String probabilityDefaultScore;
    @XmlElement(name = "StabilityOdds")
    protected String stabilityOdds;
    @XmlElement(name = "CommDelphiBandText")
    protected String commDelphiBandText;
    @XmlElement(name = "PossRelatedDataFlag")
    protected String possRelatedDataFlag;
    @XmlElement(name = "BusinessNOCFlag")
    protected String businessNOCFlag;
    @XmlElement(name = "Proprietor1NOCFlag")
    protected String proprietor1NOCFlag;
    @XmlElement(name = "Proprietor2NOCFlag")
    protected String proprietor2NOCFlag;
    @XmlElement(name = "Proprietor3NOCFlag")
    protected String proprietor3NOCFlag;
    @XmlElement(name = "OverrideIndicator")
    protected String overrideIndicator;
    @XmlElement(name = "CreditRatingOverrideIndicator")
    protected String creditRatingOverrideIndicator;
    @XmlElement(name = "CreditLimitOverrideIndicator")
    protected String creditLimitOverrideIndicator;
    @XmlElement(name = "CreditTextOverrideIndicator")
    protected String creditTextOverrideIndicator;
    @XmlElement(name = "NumPropsSearched")
    protected Integer numPropsSearched;
    @XmlElement(name = "NumPropsFound")
    protected Integer numPropsFound;
    @XmlElement(name = "NumPropsNoData")
    protected Integer numPropsNoData;
    @XmlElement(name = "NumPropsNotTraced")
    protected Integer numPropsNotTraced;
    @XmlElement(name = "NameAddressFlag1")
    protected String nameAddressFlag1;
    @XmlElement(name = "NameAddressFlag2")
    protected String nameAddressFlag2;
    @XmlElement(name = "NameAddressFlag3")
    protected String nameAddressFlag3;
    @XmlElement(name = "RiskText")
    protected String riskText;
    @XmlElement(name = "CreditText")
    protected String creditText;
    @XmlElement(name = "ConcludingText")
    protected String concludingText;
    @XmlElement(name = "NOCText")
    protected String nocText;
    @XmlElement(name = "PossRelatedDataText")
    protected String possRelatedDataText;

    /**
     * Gets the value of the keySegmentData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySegmentData() {
        return keySegmentData;
    }

    /**
     * Sets the value of the keySegmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySegmentData(String value) {
        this.keySegmentData = value;
    }

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsent(String value) {
        this.consent = value;
    }

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the commDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDelphiScore() {
        return commDelphiScore;
    }

    /**
     * Sets the value of the commDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDelphiScore(String value) {
        this.commDelphiScore = value;
    }

    /**
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRating(String value) {
        this.creditRating = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimit(String value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the probabilityDefaultScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbabilityDefaultScore() {
        return probabilityDefaultScore;
    }

    /**
     * Sets the value of the probabilityDefaultScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbabilityDefaultScore(String value) {
        this.probabilityDefaultScore = value;
    }

    /**
     * Gets the value of the stabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStabilityOdds() {
        return stabilityOdds;
    }

    /**
     * Sets the value of the stabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStabilityOdds(String value) {
        this.stabilityOdds = value;
    }

    /**
     * Gets the value of the commDelphiBandText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDelphiBandText() {
        return commDelphiBandText;
    }

    /**
     * Sets the value of the commDelphiBandText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDelphiBandText(String value) {
        this.commDelphiBandText = value;
    }

    /**
     * Gets the value of the possRelatedDataFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossRelatedDataFlag() {
        return possRelatedDataFlag;
    }

    /**
     * Sets the value of the possRelatedDataFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossRelatedDataFlag(String value) {
        this.possRelatedDataFlag = value;
    }

    /**
     * Gets the value of the businessNOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNOCFlag() {
        return businessNOCFlag;
    }

    /**
     * Sets the value of the businessNOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNOCFlag(String value) {
        this.businessNOCFlag = value;
    }

    /**
     * Gets the value of the proprietor1NOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietor1NOCFlag() {
        return proprietor1NOCFlag;
    }

    /**
     * Sets the value of the proprietor1NOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietor1NOCFlag(String value) {
        this.proprietor1NOCFlag = value;
    }

    /**
     * Gets the value of the proprietor2NOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietor2NOCFlag() {
        return proprietor2NOCFlag;
    }

    /**
     * Sets the value of the proprietor2NOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietor2NOCFlag(String value) {
        this.proprietor2NOCFlag = value;
    }

    /**
     * Gets the value of the proprietor3NOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietor3NOCFlag() {
        return proprietor3NOCFlag;
    }

    /**
     * Sets the value of the proprietor3NOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietor3NOCFlag(String value) {
        this.proprietor3NOCFlag = value;
    }

    /**
     * Gets the value of the overrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideIndicator() {
        return overrideIndicator;
    }

    /**
     * Sets the value of the overrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideIndicator(String value) {
        this.overrideIndicator = value;
    }

    /**
     * Gets the value of the creditRatingOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRatingOverrideIndicator() {
        return creditRatingOverrideIndicator;
    }

    /**
     * Sets the value of the creditRatingOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRatingOverrideIndicator(String value) {
        this.creditRatingOverrideIndicator = value;
    }

    /**
     * Gets the value of the creditLimitOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLimitOverrideIndicator() {
        return creditLimitOverrideIndicator;
    }

    /**
     * Sets the value of the creditLimitOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLimitOverrideIndicator(String value) {
        this.creditLimitOverrideIndicator = value;
    }

    /**
     * Gets the value of the creditTextOverrideIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextOverrideIndicator() {
        return creditTextOverrideIndicator;
    }

    /**
     * Sets the value of the creditTextOverrideIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextOverrideIndicator(String value) {
        this.creditTextOverrideIndicator = value;
    }

    /**
     * Gets the value of the numPropsSearched property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPropsSearched() {
        return numPropsSearched;
    }

    /**
     * Sets the value of the numPropsSearched property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPropsSearched(Integer value) {
        this.numPropsSearched = value;
    }

    /**
     * Gets the value of the numPropsFound property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPropsFound() {
        return numPropsFound;
    }

    /**
     * Sets the value of the numPropsFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPropsFound(Integer value) {
        this.numPropsFound = value;
    }

    /**
     * Gets the value of the numPropsNoData property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPropsNoData() {
        return numPropsNoData;
    }

    /**
     * Sets the value of the numPropsNoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPropsNoData(Integer value) {
        this.numPropsNoData = value;
    }

    /**
     * Gets the value of the numPropsNotTraced property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPropsNotTraced() {
        return numPropsNotTraced;
    }

    /**
     * Sets the value of the numPropsNotTraced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPropsNotTraced(Integer value) {
        this.numPropsNotTraced = value;
    }

    /**
     * Gets the value of the nameAddressFlag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddressFlag1() {
        return nameAddressFlag1;
    }

    /**
     * Sets the value of the nameAddressFlag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddressFlag1(String value) {
        this.nameAddressFlag1 = value;
    }

    /**
     * Gets the value of the nameAddressFlag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddressFlag2() {
        return nameAddressFlag2;
    }

    /**
     * Sets the value of the nameAddressFlag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddressFlag2(String value) {
        this.nameAddressFlag2 = value;
    }

    /**
     * Gets the value of the nameAddressFlag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAddressFlag3() {
        return nameAddressFlag3;
    }

    /**
     * Sets the value of the nameAddressFlag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAddressFlag3(String value) {
        this.nameAddressFlag3 = value;
    }

    /**
     * Gets the value of the riskText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskText() {
        return riskText;
    }

    /**
     * Sets the value of the riskText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskText(String value) {
        this.riskText = value;
    }

    /**
     * Gets the value of the creditText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditText() {
        return creditText;
    }

    /**
     * Sets the value of the creditText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditText(String value) {
        this.creditText = value;
    }

    /**
     * Gets the value of the concludingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcludingText() {
        return concludingText;
    }

    /**
     * Sets the value of the concludingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcludingText(String value) {
        this.concludingText = value;
    }

    /**
     * Gets the value of the nocText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCText() {
        return nocText;
    }

    /**
     * Sets the value of the nocText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCText(String value) {
        this.nocText = value;
    }

    /**
     * Gets the value of the possRelatedDataText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossRelatedDataText() {
        return possRelatedDataText;
    }

    /**
     * Sets the value of the possRelatedDataText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossRelatedDataText(String value) {
        this.possRelatedDataText = value;
    }

}
