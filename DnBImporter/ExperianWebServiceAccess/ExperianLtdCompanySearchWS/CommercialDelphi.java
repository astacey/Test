
package ExperianLtdCompanySearchWS;

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
 *         &lt;element name="CommDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiBandText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRatingOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditLimitOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConclusionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditTextOverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "commDelphiScore",
    "commDelphiBand",
    "stabilityOdds",
    "overrideIndicator",
    "commDelphiBandText",
    "creditRating",
    "creditRatingOverrideIndicator",
    "creditLimit",
    "creditLimitOverrideIndicator",
    "parentIndicator",
    "creditTextLine1",
    "creditTextLine2",
    "creditTextLine3",
    "creditTextLine4",
    "creditTextLine5",
    "conclusionText",
    "creditTextOverrideIndicator"
})
public class CommercialDelphi {

    @XmlElement(name = "CommDelphiScore")
    protected String commDelphiScore;
    @XmlElement(name = "CommDelphiBand")
    protected String commDelphiBand;
    @XmlElement(name = "StabilityOdds")
    protected String stabilityOdds;
    @XmlElement(name = "OverrideIndicator")
    protected String overrideIndicator;
    @XmlElement(name = "CommDelphiBandText")
    protected String commDelphiBandText;
    @XmlElement(name = "CreditRating")
    protected String creditRating;
    @XmlElement(name = "CreditRatingOverrideIndicator")
    protected String creditRatingOverrideIndicator;
    @XmlElement(name = "CreditLimit")
    protected String creditLimit;
    @XmlElement(name = "CreditLimitOverrideIndicator")
    protected String creditLimitOverrideIndicator;
    @XmlElement(name = "ParentIndicator")
    protected String parentIndicator;
    @XmlElement(name = "CreditTextLine1")
    protected String creditTextLine1;
    @XmlElement(name = "CreditTextLine2")
    protected String creditTextLine2;
    @XmlElement(name = "CreditTextLine3")
    protected String creditTextLine3;
    @XmlElement(name = "CreditTextLine4")
    protected String creditTextLine4;
    @XmlElement(name = "CreditTextLine5")
    protected String creditTextLine5;
    @XmlElement(name = "ConclusionText")
    protected String conclusionText;
    @XmlElement(name = "CreditTextOverrideIndicator")
    protected String creditTextOverrideIndicator;

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
     * Gets the value of the commDelphiBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDelphiBand() {
        return commDelphiBand;
    }

    /**
     * Sets the value of the commDelphiBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDelphiBand(String value) {
        this.commDelphiBand = value;
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
     * Gets the value of the parentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIndicator() {
        return parentIndicator;
    }

    /**
     * Sets the value of the parentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIndicator(String value) {
        this.parentIndicator = value;
    }

    /**
     * Gets the value of the creditTextLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextLine1() {
        return creditTextLine1;
    }

    /**
     * Sets the value of the creditTextLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextLine1(String value) {
        this.creditTextLine1 = value;
    }

    /**
     * Gets the value of the creditTextLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextLine2() {
        return creditTextLine2;
    }

    /**
     * Sets the value of the creditTextLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextLine2(String value) {
        this.creditTextLine2 = value;
    }

    /**
     * Gets the value of the creditTextLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextLine3() {
        return creditTextLine3;
    }

    /**
     * Sets the value of the creditTextLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextLine3(String value) {
        this.creditTextLine3 = value;
    }

    /**
     * Gets the value of the creditTextLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextLine4() {
        return creditTextLine4;
    }

    /**
     * Sets the value of the creditTextLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextLine4(String value) {
        this.creditTextLine4 = value;
    }

    /**
     * Gets the value of the creditTextLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTextLine5() {
        return creditTextLine5;
    }

    /**
     * Sets the value of the creditTextLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTextLine5(String value) {
        this.creditTextLine5 = value;
    }

    /**
     * Gets the value of the conclusionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusionText() {
        return conclusionText;
    }

    /**
     * Sets the value of the conclusionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusionText(String value) {
        this.conclusionText = value;
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

}
