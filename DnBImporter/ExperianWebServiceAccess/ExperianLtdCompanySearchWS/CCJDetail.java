
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCJDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCJDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JudgmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgmentSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgmentDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="SatisfactionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="JudgmentAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegisteredOfficeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgmentAgainst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingNameDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}TradingNameDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradingLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="CourtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCJDetail", propOrder = {
    "judgmentType",
    "judgmentSource",
    "judgmentDate",
    "satisfactionDate",
    "judgmentAmount",
    "caseNumber",
    "registeredOfficeIndicator",
    "judgmentAgainst",
    "tradingNameDetails",
    "tradingLocation",
    "courtName"
})
public class CCJDetail {

    @XmlElement(name = "JudgmentType")
    protected String judgmentType;
    @XmlElement(name = "JudgmentSource")
    protected String judgmentSource;
    @XmlElement(name = "JudgmentDate")
    protected CCYYMM judgmentDate;
    @XmlElement(name = "SatisfactionDate")
    protected CCYYMM satisfactionDate;
    @XmlElement(name = "JudgmentAmount")
    protected Long judgmentAmount;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "RegisteredOfficeIndicator")
    protected String registeredOfficeIndicator;
    @XmlElement(name = "JudgmentAgainst")
    protected String judgmentAgainst;
    @XmlElement(name = "TradingNameDetails")
    protected List<TradingNameDetails> tradingNameDetails;
    @XmlElement(name = "TradingLocation")
    protected LtdBusinessLocation tradingLocation;
    @XmlElement(name = "CourtName")
    protected String courtName;

    /**
     * Gets the value of the judgmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgmentType() {
        return judgmentType;
    }

    /**
     * Sets the value of the judgmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgmentType(String value) {
        this.judgmentType = value;
    }

    /**
     * Gets the value of the judgmentSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgmentSource() {
        return judgmentSource;
    }

    /**
     * Sets the value of the judgmentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgmentSource(String value) {
        this.judgmentSource = value;
    }

    /**
     * Gets the value of the judgmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getJudgmentDate() {
        return judgmentDate;
    }

    /**
     * Sets the value of the judgmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setJudgmentDate(CCYYMM value) {
        this.judgmentDate = value;
    }

    /**
     * Gets the value of the satisfactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getSatisfactionDate() {
        return satisfactionDate;
    }

    /**
     * Sets the value of the satisfactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setSatisfactionDate(CCYYMM value) {
        this.satisfactionDate = value;
    }

    /**
     * Gets the value of the judgmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJudgmentAmount() {
        return judgmentAmount;
    }

    /**
     * Sets the value of the judgmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJudgmentAmount(Long value) {
        this.judgmentAmount = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the registeredOfficeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredOfficeIndicator() {
        return registeredOfficeIndicator;
    }

    /**
     * Sets the value of the registeredOfficeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredOfficeIndicator(String value) {
        this.registeredOfficeIndicator = value;
    }

    /**
     * Gets the value of the judgmentAgainst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgmentAgainst() {
        return judgmentAgainst;
    }

    /**
     * Sets the value of the judgmentAgainst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgmentAgainst(String value) {
        this.judgmentAgainst = value;
    }

    /**
     * Gets the value of the tradingNameDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingNameDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingNameDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingNameDetails }
     * 
     * 
     */
    public List<TradingNameDetails> getTradingNameDetails() {
        if (tradingNameDetails == null) {
            tradingNameDetails = new ArrayList<TradingNameDetails>();
        }
        return this.tradingNameDetails;
    }

    /**
     * Gets the value of the tradingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getTradingLocation() {
        return tradingLocation;
    }

    /**
     * Sets the value of the tradingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setTradingLocation(LtdBusinessLocation value) {
        this.tradingLocation = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

}
