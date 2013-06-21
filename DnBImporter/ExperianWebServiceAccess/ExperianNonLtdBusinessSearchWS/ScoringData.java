
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoringData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoringData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumEmployeesSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PossiblyRelatedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICInformation1992" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo1992" minOccurs="0"/>
 *         &lt;element name="CIFASIndicator" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CIFASIndicator" minOccurs="0"/>
 *         &lt;element name="MaxNumDirectorshipsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxNumDirectorships" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDisqualifiedDirectorsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumDisqualifiedDirectors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDirectorConvictionsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumDirectorConvictions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumDirectorFailuresSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumDirectorFailures" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCollectionLast2YearsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberCollectionLast2Years" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumCCJsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumCCJs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValueCCJs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastCCJSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastCCJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BankruptcyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch3MthSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch3Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch6MthSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch6Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch12MthSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch12Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCCLsSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumCCLs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCoFailuresSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumCoFailures" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoringData", propOrder = {
    "numEmployeesSign",
    "numEmployees",
    "possiblyRelatedData",
    "sicInformation1992",
    "cifasIndicator",
    "maxNumDirectorshipsSign",
    "maxNumDirectorships",
    "numDisqualifiedDirectorsSign",
    "numDisqualifiedDirectors",
    "numDirectorConvictionsSign",
    "numDirectorConvictions",
    "nocFlag",
    "numDirectorFailuresSign",
    "numDirectorFailures",
    "numberCollectionLast2YearsSign",
    "numberCollectionLast2Years",
    "numCCJsSign",
    "numCCJs",
    "valueCCJsSign",
    "valueCCJs",
    "timeSinceLastCCJSign",
    "timeSinceLastCCJ",
    "bankruptcyFlag",
    "numPrevSearch3MthSign",
    "numPrevSearch3Mth",
    "numPrevSearch6MthSign",
    "numPrevSearch6Mth",
    "numPrevSearch12MthSign",
    "numPrevSearch12Mth",
    "numCCLsSign",
    "numCCLs",
    "numCoFailuresSign",
    "numCoFailures"
})
public class ScoringData {

    @XmlElement(name = "NumEmployeesSign")
    protected String numEmployeesSign;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "PossiblyRelatedData")
    protected String possiblyRelatedData;
    @XmlElement(name = "SICInformation1992")
    protected SICInfo1992 sicInformation1992;
    @XmlElement(name = "CIFASIndicator")
    protected CIFASIndicator cifasIndicator;
    @XmlElement(name = "MaxNumDirectorshipsSign")
    protected String maxNumDirectorshipsSign;
    @XmlElement(name = "MaxNumDirectorships")
    protected Integer maxNumDirectorships;
    @XmlElement(name = "NumDisqualifiedDirectorsSign")
    protected String numDisqualifiedDirectorsSign;
    @XmlElement(name = "NumDisqualifiedDirectors")
    protected Integer numDisqualifiedDirectors;
    @XmlElement(name = "NumDirectorConvictionsSign")
    protected String numDirectorConvictionsSign;
    @XmlElement(name = "NumDirectorConvictions")
    protected Integer numDirectorConvictions;
    @XmlElement(name = "NOCFlag")
    protected String nocFlag;
    @XmlElement(name = "NumDirectorFailuresSign")
    protected String numDirectorFailuresSign;
    @XmlElement(name = "NumDirectorFailures")
    protected Long numDirectorFailures;
    @XmlElement(name = "NumberCollectionLast2YearsSign")
    protected String numberCollectionLast2YearsSign;
    @XmlElement(name = "NumberCollectionLast2Years")
    protected Long numberCollectionLast2Years;
    @XmlElement(name = "NumCCJsSign")
    protected String numCCJsSign;
    @XmlElement(name = "NumCCJs")
    protected Integer numCCJs;
    @XmlElement(name = "ValueCCJsSign")
    protected String valueCCJsSign;
    @XmlElement(name = "ValueCCJs")
    protected Long valueCCJs;
    @XmlElement(name = "TimeSinceLastCCJSign")
    protected String timeSinceLastCCJSign;
    @XmlElement(name = "TimeSinceLastCCJ")
    protected Integer timeSinceLastCCJ;
    @XmlElement(name = "BankruptcyFlag")
    protected String bankruptcyFlag;
    @XmlElement(name = "NumPrevSearch3MthSign")
    protected String numPrevSearch3MthSign;
    @XmlElement(name = "NumPrevSearch3Mth")
    protected Integer numPrevSearch3Mth;
    @XmlElement(name = "NumPrevSearch6MthSign")
    protected String numPrevSearch6MthSign;
    @XmlElement(name = "NumPrevSearch6Mth")
    protected Integer numPrevSearch6Mth;
    @XmlElement(name = "NumPrevSearch12MthSign")
    protected String numPrevSearch12MthSign;
    @XmlElement(name = "NumPrevSearch12Mth")
    protected Integer numPrevSearch12Mth;
    @XmlElement(name = "NumCCLsSign")
    protected String numCCLsSign;
    @XmlElement(name = "NumCCLs")
    protected Integer numCCLs;
    @XmlElement(name = "NumCoFailuresSign")
    protected String numCoFailuresSign;
    @XmlElement(name = "NumCoFailures")
    protected Long numCoFailures;

    /**
     * Gets the value of the numEmployeesSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEmployeesSign() {
        return numEmployeesSign;
    }

    /**
     * Sets the value of the numEmployeesSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEmployeesSign(String value) {
        this.numEmployeesSign = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the possiblyRelatedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPossiblyRelatedData() {
        return possiblyRelatedData;
    }

    /**
     * Sets the value of the possiblyRelatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPossiblyRelatedData(String value) {
        this.possiblyRelatedData = value;
    }

    /**
     * Gets the value of the sicInformation1992 property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo1992 }
     *     
     */
    public SICInfo1992 getSICInformation1992() {
        return sicInformation1992;
    }

    /**
     * Sets the value of the sicInformation1992 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo1992 }
     *     
     */
    public void setSICInformation1992(SICInfo1992 value) {
        this.sicInformation1992 = value;
    }

    /**
     * Gets the value of the cifasIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CIFASIndicator }
     *     
     */
    public CIFASIndicator getCIFASIndicator() {
        return cifasIndicator;
    }

    /**
     * Sets the value of the cifasIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIFASIndicator }
     *     
     */
    public void setCIFASIndicator(CIFASIndicator value) {
        this.cifasIndicator = value;
    }

    /**
     * Gets the value of the maxNumDirectorshipsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumDirectorshipsSign() {
        return maxNumDirectorshipsSign;
    }

    /**
     * Sets the value of the maxNumDirectorshipsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumDirectorshipsSign(String value) {
        this.maxNumDirectorshipsSign = value;
    }

    /**
     * Gets the value of the maxNumDirectorships property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumDirectorships() {
        return maxNumDirectorships;
    }

    /**
     * Sets the value of the maxNumDirectorships property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumDirectorships(Integer value) {
        this.maxNumDirectorships = value;
    }

    /**
     * Gets the value of the numDisqualifiedDirectorsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDisqualifiedDirectorsSign() {
        return numDisqualifiedDirectorsSign;
    }

    /**
     * Sets the value of the numDisqualifiedDirectorsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDisqualifiedDirectorsSign(String value) {
        this.numDisqualifiedDirectorsSign = value;
    }

    /**
     * Gets the value of the numDisqualifiedDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDisqualifiedDirectors() {
        return numDisqualifiedDirectors;
    }

    /**
     * Sets the value of the numDisqualifiedDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDisqualifiedDirectors(Integer value) {
        this.numDisqualifiedDirectors = value;
    }

    /**
     * Gets the value of the numDirectorConvictionsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDirectorConvictionsSign() {
        return numDirectorConvictionsSign;
    }

    /**
     * Sets the value of the numDirectorConvictionsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDirectorConvictionsSign(String value) {
        this.numDirectorConvictionsSign = value;
    }

    /**
     * Gets the value of the numDirectorConvictions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDirectorConvictions() {
        return numDirectorConvictions;
    }

    /**
     * Sets the value of the numDirectorConvictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDirectorConvictions(Integer value) {
        this.numDirectorConvictions = value;
    }

    /**
     * Gets the value of the nocFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOCFlag() {
        return nocFlag;
    }

    /**
     * Sets the value of the nocFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOCFlag(String value) {
        this.nocFlag = value;
    }

    /**
     * Gets the value of the numDirectorFailuresSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDirectorFailuresSign() {
        return numDirectorFailuresSign;
    }

    /**
     * Sets the value of the numDirectorFailuresSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDirectorFailuresSign(String value) {
        this.numDirectorFailuresSign = value;
    }

    /**
     * Gets the value of the numDirectorFailures property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumDirectorFailures() {
        return numDirectorFailures;
    }

    /**
     * Sets the value of the numDirectorFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumDirectorFailures(Long value) {
        this.numDirectorFailures = value;
    }

    /**
     * Gets the value of the numberCollectionLast2YearsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberCollectionLast2YearsSign() {
        return numberCollectionLast2YearsSign;
    }

    /**
     * Sets the value of the numberCollectionLast2YearsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberCollectionLast2YearsSign(String value) {
        this.numberCollectionLast2YearsSign = value;
    }

    /**
     * Gets the value of the numberCollectionLast2Years property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberCollectionLast2Years() {
        return numberCollectionLast2Years;
    }

    /**
     * Sets the value of the numberCollectionLast2Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberCollectionLast2Years(Long value) {
        this.numberCollectionLast2Years = value;
    }

    /**
     * Gets the value of the numCCJsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCCJsSign() {
        return numCCJsSign;
    }

    /**
     * Sets the value of the numCCJsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCCJsSign(String value) {
        this.numCCJsSign = value;
    }

    /**
     * Gets the value of the numCCJs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCCJs() {
        return numCCJs;
    }

    /**
     * Sets the value of the numCCJs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCCJs(Integer value) {
        this.numCCJs = value;
    }

    /**
     * Gets the value of the valueCCJsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueCCJsSign() {
        return valueCCJsSign;
    }

    /**
     * Sets the value of the valueCCJsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueCCJsSign(String value) {
        this.valueCCJsSign = value;
    }

    /**
     * Gets the value of the valueCCJs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs() {
        return valueCCJs;
    }

    /**
     * Sets the value of the valueCCJs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs(Long value) {
        this.valueCCJs = value;
    }

    /**
     * Gets the value of the timeSinceLastCCJSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeSinceLastCCJSign() {
        return timeSinceLastCCJSign;
    }

    /**
     * Sets the value of the timeSinceLastCCJSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeSinceLastCCJSign(String value) {
        this.timeSinceLastCCJSign = value;
    }

    /**
     * Gets the value of the timeSinceLastCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastCCJ() {
        return timeSinceLastCCJ;
    }

    /**
     * Sets the value of the timeSinceLastCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastCCJ(Integer value) {
        this.timeSinceLastCCJ = value;
    }

    /**
     * Gets the value of the bankruptcyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankruptcyFlag() {
        return bankruptcyFlag;
    }

    /**
     * Sets the value of the bankruptcyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankruptcyFlag(String value) {
        this.bankruptcyFlag = value;
    }

    /**
     * Gets the value of the numPrevSearch3MthSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrevSearch3MthSign() {
        return numPrevSearch3MthSign;
    }

    /**
     * Sets the value of the numPrevSearch3MthSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrevSearch3MthSign(String value) {
        this.numPrevSearch3MthSign = value;
    }

    /**
     * Gets the value of the numPrevSearch3Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch3Mth() {
        return numPrevSearch3Mth;
    }

    /**
     * Sets the value of the numPrevSearch3Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch3Mth(Integer value) {
        this.numPrevSearch3Mth = value;
    }

    /**
     * Gets the value of the numPrevSearch6MthSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrevSearch6MthSign() {
        return numPrevSearch6MthSign;
    }

    /**
     * Sets the value of the numPrevSearch6MthSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrevSearch6MthSign(String value) {
        this.numPrevSearch6MthSign = value;
    }

    /**
     * Gets the value of the numPrevSearch6Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch6Mth() {
        return numPrevSearch6Mth;
    }

    /**
     * Sets the value of the numPrevSearch6Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch6Mth(Integer value) {
        this.numPrevSearch6Mth = value;
    }

    /**
     * Gets the value of the numPrevSearch12MthSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrevSearch12MthSign() {
        return numPrevSearch12MthSign;
    }

    /**
     * Sets the value of the numPrevSearch12MthSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrevSearch12MthSign(String value) {
        this.numPrevSearch12MthSign = value;
    }

    /**
     * Gets the value of the numPrevSearch12Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch12Mth() {
        return numPrevSearch12Mth;
    }

    /**
     * Sets the value of the numPrevSearch12Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch12Mth(Integer value) {
        this.numPrevSearch12Mth = value;
    }

    /**
     * Gets the value of the numCCLsSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCCLsSign() {
        return numCCLsSign;
    }

    /**
     * Sets the value of the numCCLsSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCCLsSign(String value) {
        this.numCCLsSign = value;
    }

    /**
     * Gets the value of the numCCLs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCCLs() {
        return numCCLs;
    }

    /**
     * Sets the value of the numCCLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCCLs(Integer value) {
        this.numCCLs = value;
    }

    /**
     * Gets the value of the numCoFailuresSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCoFailuresSign() {
        return numCoFailuresSign;
    }

    /**
     * Sets the value of the numCoFailuresSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCoFailuresSign(String value) {
        this.numCoFailuresSign = value;
    }

    /**
     * Gets the value of the numCoFailures property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumCoFailures() {
        return numCoFailures;
    }

    /**
     * Sets the value of the numCoFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumCoFailures(Long value) {
        this.numCoFailures = value;
    }

}
