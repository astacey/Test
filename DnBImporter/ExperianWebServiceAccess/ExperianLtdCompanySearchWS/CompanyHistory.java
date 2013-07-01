
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommDelphiBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OverrideIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreHistoryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommDelphiBandText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScoreHistory" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ScoreHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyHistory", propOrder = {
    "commDelphiScore",
    "commDelphiBand",
    "stabilityOdds",
    "overrideIndicator",
    "textCount",
    "scoreHistoryCount",
    "commDelphiBandText",
    "scoreHistory"
})
public class CompanyHistory {

    @XmlElement(name = "CommDelphiScore")
    protected String commDelphiScore;
    @XmlElement(name = "CommDelphiBand")
    protected String commDelphiBand;
    @XmlElement(name = "StabilityOdds")
    protected String stabilityOdds;
    @XmlElement(name = "OverrideIndicator")
    protected String overrideIndicator;
    @XmlElement(name = "TextCount")
    protected Integer textCount;
    @XmlElement(name = "ScoreHistoryCount")
    protected Integer scoreHistoryCount;
    @XmlElement(name = "CommDelphiBandText")
    protected String commDelphiBandText;
    @XmlElement(name = "ScoreHistory")
    protected List<ScoreHistory> scoreHistory;

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
     * Gets the value of the textCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTextCount() {
        return textCount;
    }

    /**
     * Sets the value of the textCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTextCount(Integer value) {
        this.textCount = value;
    }

    /**
     * Gets the value of the scoreHistoryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreHistoryCount() {
        return scoreHistoryCount;
    }

    /**
     * Sets the value of the scoreHistoryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreHistoryCount(Integer value) {
        this.scoreHistoryCount = value;
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
     * Gets the value of the scoreHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreHistory }
     * 
     * 
     */
    public List<ScoreHistory> getScoreHistory() {
        if (scoreHistory == null) {
            scoreHistory = new ArrayList<ScoreHistory>();
        }
        return this.scoreHistory;
    }

}