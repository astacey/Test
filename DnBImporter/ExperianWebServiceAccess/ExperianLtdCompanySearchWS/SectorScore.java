
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SectorScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectorScore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecentSnapshotDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ScoreHistoryDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AllCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllAverageDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllAverageStabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllHistoricalScore" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="IndCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndAverageDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndAverageStabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndHistoricalScore" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ArrayOfString1" minOccurs="0"/>
 *         &lt;element name="SizeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeAverageDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeAverageStabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeHistoricalScore" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ArrayOfString2" minOccurs="0"/>
 *         &lt;element name="AgeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeAverageDelphiScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeAverageStabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeHistoricalScore" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ArrayOfString3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorScore", propOrder = {
    "recentSnapshotDate",
    "scoreHistoryDate",
    "allCompGroup",
    "allCompSector",
    "allAverageDelphiScore",
    "allAverageStabilityOdds",
    "allHistoricalScore",
    "indCompGroup",
    "indCompSector",
    "indAverageDelphiScore",
    "indAverageStabilityOdds",
    "indHistoricalScore",
    "sizeCompGroup",
    "sizeCompSector",
    "sizeAverageDelphiScore",
    "sizeAverageStabilityOdds",
    "sizeHistoricalScore",
    "ageCompGroup",
    "ageCompSector",
    "ageAverageDelphiScore",
    "ageAverageStabilityOdds",
    "ageHistoricalScore"
})
public class SectorScore {

    @XmlElement(name = "RecentSnapshotDate")
    protected CCYYMMDD recentSnapshotDate;
    @XmlElement(name = "ScoreHistoryDate")
    protected List<CCYYMMDD> scoreHistoryDate;
    @XmlElement(name = "AllCompGroup")
    protected String allCompGroup;
    @XmlElement(name = "AllCompSector")
    protected String allCompSector;
    @XmlElement(name = "AllAverageDelphiScore")
    protected String allAverageDelphiScore;
    @XmlElement(name = "AllAverageStabilityOdds")
    protected String allAverageStabilityOdds;
    @XmlElement(name = "AllHistoricalScore")
    protected ArrayOfString allHistoricalScore;
    @XmlElement(name = "IndCompGroup")
    protected String indCompGroup;
    @XmlElement(name = "IndCompSector")
    protected String indCompSector;
    @XmlElement(name = "IndAverageDelphiScore")
    protected String indAverageDelphiScore;
    @XmlElement(name = "IndAverageStabilityOdds")
    protected String indAverageStabilityOdds;
    @XmlElement(name = "IndHistoricalScore")
    protected ArrayOfString1 indHistoricalScore;
    @XmlElement(name = "SizeCompGroup")
    protected String sizeCompGroup;
    @XmlElement(name = "SizeCompSector")
    protected String sizeCompSector;
    @XmlElement(name = "SizeAverageDelphiScore")
    protected String sizeAverageDelphiScore;
    @XmlElement(name = "SizeAverageStabilityOdds")
    protected String sizeAverageStabilityOdds;
    @XmlElement(name = "SizeHistoricalScore")
    protected ArrayOfString2 sizeHistoricalScore;
    @XmlElement(name = "AgeCompGroup")
    protected String ageCompGroup;
    @XmlElement(name = "AgeCompSector")
    protected String ageCompSector;
    @XmlElement(name = "AgeAverageDelphiScore")
    protected String ageAverageDelphiScore;
    @XmlElement(name = "AgeAverageStabilityOdds")
    protected String ageAverageStabilityOdds;
    @XmlElement(name = "AgeHistoricalScore")
    protected ArrayOfString3 ageHistoricalScore;

    /**
     * Gets the value of the recentSnapshotDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getRecentSnapshotDate() {
        return recentSnapshotDate;
    }

    /**
     * Sets the value of the recentSnapshotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setRecentSnapshotDate(CCYYMMDD value) {
        this.recentSnapshotDate = value;
    }

    /**
     * Gets the value of the scoreHistoryDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreHistoryDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreHistoryDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCYYMMDD }
     * 
     * 
     */
    public List<CCYYMMDD> getScoreHistoryDate() {
        if (scoreHistoryDate == null) {
            scoreHistoryDate = new ArrayList<CCYYMMDD>();
        }
        return this.scoreHistoryDate;
    }

    /**
     * Gets the value of the allCompGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCompGroup() {
        return allCompGroup;
    }

    /**
     * Sets the value of the allCompGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCompGroup(String value) {
        this.allCompGroup = value;
    }

    /**
     * Gets the value of the allCompSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCompSector() {
        return allCompSector;
    }

    /**
     * Sets the value of the allCompSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCompSector(String value) {
        this.allCompSector = value;
    }

    /**
     * Gets the value of the allAverageDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllAverageDelphiScore() {
        return allAverageDelphiScore;
    }

    /**
     * Sets the value of the allAverageDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllAverageDelphiScore(String value) {
        this.allAverageDelphiScore = value;
    }

    /**
     * Gets the value of the allAverageStabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllAverageStabilityOdds() {
        return allAverageStabilityOdds;
    }

    /**
     * Sets the value of the allAverageStabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllAverageStabilityOdds(String value) {
        this.allAverageStabilityOdds = value;
    }

    /**
     * Gets the value of the allHistoricalScore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllHistoricalScore() {
        return allHistoricalScore;
    }

    /**
     * Sets the value of the allHistoricalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllHistoricalScore(ArrayOfString value) {
        this.allHistoricalScore = value;
    }

    /**
     * Gets the value of the indCompGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCompGroup() {
        return indCompGroup;
    }

    /**
     * Sets the value of the indCompGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCompGroup(String value) {
        this.indCompGroup = value;
    }

    /**
     * Gets the value of the indCompSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCompSector() {
        return indCompSector;
    }

    /**
     * Sets the value of the indCompSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCompSector(String value) {
        this.indCompSector = value;
    }

    /**
     * Gets the value of the indAverageDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAverageDelphiScore() {
        return indAverageDelphiScore;
    }

    /**
     * Sets the value of the indAverageDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAverageDelphiScore(String value) {
        this.indAverageDelphiScore = value;
    }

    /**
     * Gets the value of the indAverageStabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAverageStabilityOdds() {
        return indAverageStabilityOdds;
    }

    /**
     * Sets the value of the indAverageStabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAverageStabilityOdds(String value) {
        this.indAverageStabilityOdds = value;
    }

    /**
     * Gets the value of the indHistoricalScore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getIndHistoricalScore() {
        return indHistoricalScore;
    }

    /**
     * Sets the value of the indHistoricalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setIndHistoricalScore(ArrayOfString1 value) {
        this.indHistoricalScore = value;
    }

    /**
     * Gets the value of the sizeCompGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompGroup() {
        return sizeCompGroup;
    }

    /**
     * Sets the value of the sizeCompGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompGroup(String value) {
        this.sizeCompGroup = value;
    }

    /**
     * Gets the value of the sizeCompSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompSector() {
        return sizeCompSector;
    }

    /**
     * Sets the value of the sizeCompSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompSector(String value) {
        this.sizeCompSector = value;
    }

    /**
     * Gets the value of the sizeAverageDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeAverageDelphiScore() {
        return sizeAverageDelphiScore;
    }

    /**
     * Sets the value of the sizeAverageDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeAverageDelphiScore(String value) {
        this.sizeAverageDelphiScore = value;
    }

    /**
     * Gets the value of the sizeAverageStabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeAverageStabilityOdds() {
        return sizeAverageStabilityOdds;
    }

    /**
     * Sets the value of the sizeAverageStabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeAverageStabilityOdds(String value) {
        this.sizeAverageStabilityOdds = value;
    }

    /**
     * Gets the value of the sizeHistoricalScore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString2 }
     *     
     */
    public ArrayOfString2 getSizeHistoricalScore() {
        return sizeHistoricalScore;
    }

    /**
     * Sets the value of the sizeHistoricalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString2 }
     *     
     */
    public void setSizeHistoricalScore(ArrayOfString2 value) {
        this.sizeHistoricalScore = value;
    }

    /**
     * Gets the value of the ageCompGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompGroup() {
        return ageCompGroup;
    }

    /**
     * Sets the value of the ageCompGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompGroup(String value) {
        this.ageCompGroup = value;
    }

    /**
     * Gets the value of the ageCompSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompSector() {
        return ageCompSector;
    }

    /**
     * Sets the value of the ageCompSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompSector(String value) {
        this.ageCompSector = value;
    }

    /**
     * Gets the value of the ageAverageDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeAverageDelphiScore() {
        return ageAverageDelphiScore;
    }

    /**
     * Sets the value of the ageAverageDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeAverageDelphiScore(String value) {
        this.ageAverageDelphiScore = value;
    }

    /**
     * Gets the value of the ageAverageStabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeAverageStabilityOdds() {
        return ageAverageStabilityOdds;
    }

    /**
     * Sets the value of the ageAverageStabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeAverageStabilityOdds(String value) {
        this.ageAverageStabilityOdds = value;
    }

    /**
     * Gets the value of the ageHistoricalScore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString3 }
     *     
     */
    public ArrayOfString3 getAgeHistoricalScore() {
        return ageHistoricalScore;
    }

    /**
     * Sets the value of the ageHistoricalScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString3 }
     *     
     */
    public void setAgeHistoricalScore(ArrayOfString3 value) {
        this.ageHistoricalScore = value;
    }

}
