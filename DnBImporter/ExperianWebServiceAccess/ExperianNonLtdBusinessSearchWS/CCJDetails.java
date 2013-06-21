
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCJDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCJDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgementDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="SatisfactionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SatisfactionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="JudgementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JudgementAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CourtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberJudgmentNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberTradingNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JudgmentDetailsArea" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}JudgmentDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCJDetails", propOrder = {
    "recordType",
    "judgementDate",
    "satisfactionFlag",
    "satisfactionDate",
    "judgementType",
    "judgementAmount",
    "courtName",
    "caseNumber",
    "numberJudgmentNames",
    "numberTradingNames",
    "judgmentDetailsArea"
})
public class CCJDetails {

    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "JudgementDate")
    protected CCYYMM judgementDate;
    @XmlElement(name = "SatisfactionFlag")
    protected String satisfactionFlag;
    @XmlElement(name = "SatisfactionDate")
    protected CCYYMM satisfactionDate;
    @XmlElement(name = "JudgementType")
    protected String judgementType;
    @XmlElement(name = "JudgementAmount")
    protected Long judgementAmount;
    @XmlElement(name = "CourtName")
    protected String courtName;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "NumberJudgmentNames")
    protected Integer numberJudgmentNames;
    @XmlElement(name = "NumberTradingNames")
    protected Integer numberTradingNames;
    @XmlElement(name = "JudgmentDetailsArea")
    protected JudgmentDetails judgmentDetailsArea;

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
     * Gets the value of the judgementDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getJudgementDate() {
        return judgementDate;
    }

    /**
     * Sets the value of the judgementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setJudgementDate(CCYYMM value) {
        this.judgementDate = value;
    }

    /**
     * Gets the value of the satisfactionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSatisfactionFlag() {
        return satisfactionFlag;
    }

    /**
     * Sets the value of the satisfactionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSatisfactionFlag(String value) {
        this.satisfactionFlag = value;
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
     * Gets the value of the judgementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudgementType() {
        return judgementType;
    }

    /**
     * Sets the value of the judgementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudgementType(String value) {
        this.judgementType = value;
    }

    /**
     * Gets the value of the judgementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJudgementAmount() {
        return judgementAmount;
    }

    /**
     * Sets the value of the judgementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJudgementAmount(Long value) {
        this.judgementAmount = value;
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
     * Gets the value of the numberJudgmentNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberJudgmentNames() {
        return numberJudgmentNames;
    }

    /**
     * Sets the value of the numberJudgmentNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberJudgmentNames(Integer value) {
        this.numberJudgmentNames = value;
    }

    /**
     * Gets the value of the numberTradingNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberTradingNames() {
        return numberTradingNames;
    }

    /**
     * Sets the value of the numberTradingNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberTradingNames(Integer value) {
        this.numberTradingNames = value;
    }

    /**
     * Gets the value of the judgmentDetailsArea property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentDetails }
     *     
     */
    public JudgmentDetails getJudgmentDetailsArea() {
        return judgmentDetailsArea;
    }

    /**
     * Sets the value of the judgmentDetailsArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentDetails }
     *     
     */
    public void setJudgmentDetailsArea(JudgmentDetails value) {
        this.judgmentDetailsArea = value;
    }

}
