
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoreHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoreHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ScoreHistoryDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRatingOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoreHistory", propOrder = {
    "scoreHistoryDate",
    "overrideIndicator",
    "commDelphiScore",
    "creditRatingOverrideIndicator",
    "creditRating",
    "creditLimitOverrideIndicator",
    "creditLimit"
})
public class ScoreHistory {

    @XmlElement(name = "ScoreHistoryDate")
    protected CCYYMMDD scoreHistoryDate;
    @XmlElement(name = "OverrideIndicator")
    protected String overrideIndicator;
    @XmlElement(name = "CommDelphiScore")
    protected String commDelphiScore;
    @XmlElement(name = "CreditRatingOverrideIndicator")
    protected String creditRatingOverrideIndicator;
    @XmlElement(name = "CreditRating")
    protected String creditRating;
    @XmlElement(name = "CreditLimitOverrideIndicator")
    protected String creditLimitOverrideIndicator;
    @XmlElement(name = "CreditLimit")
    protected String creditLimit;

    /**
     * Gets the value of the scoreHistoryDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getScoreHistoryDate() {
        return scoreHistoryDate;
    }

    /**
     * Sets the value of the scoreHistoryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setScoreHistoryDate(CCYYMMDD value) {
        this.scoreHistoryDate = value;
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

}
