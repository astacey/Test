
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchCandidateResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchCandidateResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateRank" type="{http://gateway.dnb.com/getProduct}CandidateRankType" minOccurs="0"/>
 *         &lt;element name="ConfidenceLevelValue" type="{http://gateway.dnb.com/getProduct}ConfidenceLevelValueType" minOccurs="0"/>
 *         &lt;element name="MatchGradeText" type="{http://gateway.dnb.com/getProduct}MatchGradeTextType" minOccurs="0"/>
 *         &lt;element name="MatchGradeComponentType" type="{http://gateway.dnb.com/getProduct}MatchGradeComponentTypeDef" minOccurs="0"/>
 *         &lt;element name="MatchGradeComponentRating" type="{http://gateway.dnb.com/getProduct}MatchGradeComponentRatingType" minOccurs="0"/>
 *         &lt;element name="MatchGradeComponentScore" type="{http://gateway.dnb.com/getProduct}MatchGradeComponentScoreType" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://gateway.dnb.com/getProduct}SequenceType" minOccurs="0"/>
 *         &lt;element name="OutOfBusinessIndicator" type="{http://gateway.dnb.com/getProduct}OutOfBusinessIndicatorType" minOccurs="0"/>
 *         &lt;element name="StopDistributionIndicator" type="{http://gateway.dnb.com/getProduct}StopDistributionIndicatorType" minOccurs="0"/>
 *         &lt;element name="MatchBasisEntry" type="{http://gateway.dnb.com/getProduct}MatchBasisEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationComplexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchCandidateResultType", propOrder = {
    "candidateRank",
    "confidenceLevelValue",
    "matchGradeText",
    "matchGradeComponentType",
    "matchGradeComponentRating",
    "matchGradeComponentScore",
    "sequence",
    "outOfBusinessIndicator",
    "stopDistributionIndicator",
    "matchBasisEntry",
    "subjectInformation"
})
public class MatchCandidateResultType {

    @XmlElement(name = "CandidateRank")
    protected BigInteger candidateRank;
    @XmlElement(name = "ConfidenceLevelValue")
    protected String confidenceLevelValue;
    @XmlElement(name = "MatchGradeText")
    protected String matchGradeText;
    @XmlElement(name = "MatchGradeComponentType")
    protected String matchGradeComponentType;
    @XmlElement(name = "MatchGradeComponentRating")
    protected String matchGradeComponentRating;
    @XmlElement(name = "MatchGradeComponentScore")
    protected BigInteger matchGradeComponentScore;
    @XmlElement(name = "Sequence")
    protected BigInteger sequence;
    @XmlElement(name = "OutOfBusinessIndicator")
    protected Boolean outOfBusinessIndicator;
    @XmlElement(name = "StopDistributionIndicator")
    protected Boolean stopDistributionIndicator;
    @XmlElement(name = "MatchBasisEntry")
    protected List<MatchBasisEntryType> matchBasisEntry;
    @XmlElement(name = "SubjectInformation")
    protected SubjectInformationComplexType subjectInformation;

    /**
     * Gets the value of the candidateRank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCandidateRank() {
        return candidateRank;
    }

    /**
     * Sets the value of the candidateRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCandidateRank(BigInteger value) {
        this.candidateRank = value;
    }

    /**
     * Gets the value of the confidenceLevelValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceLevelValue() {
        return confidenceLevelValue;
    }

    /**
     * Sets the value of the confidenceLevelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceLevelValue(String value) {
        this.confidenceLevelValue = value;
    }

    /**
     * Gets the value of the matchGradeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchGradeText() {
        return matchGradeText;
    }

    /**
     * Sets the value of the matchGradeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchGradeText(String value) {
        this.matchGradeText = value;
    }

    /**
     * Gets the value of the matchGradeComponentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchGradeComponentType() {
        return matchGradeComponentType;
    }

    /**
     * Sets the value of the matchGradeComponentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchGradeComponentType(String value) {
        this.matchGradeComponentType = value;
    }

    /**
     * Gets the value of the matchGradeComponentRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchGradeComponentRating() {
        return matchGradeComponentRating;
    }

    /**
     * Sets the value of the matchGradeComponentRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchGradeComponentRating(String value) {
        this.matchGradeComponentRating = value;
    }

    /**
     * Gets the value of the matchGradeComponentScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMatchGradeComponentScore() {
        return matchGradeComponentScore;
    }

    /**
     * Sets the value of the matchGradeComponentScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMatchGradeComponentScore(BigInteger value) {
        this.matchGradeComponentScore = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the outOfBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfBusinessIndicator() {
        return outOfBusinessIndicator;
    }

    /**
     * Sets the value of the outOfBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfBusinessIndicator(Boolean value) {
        this.outOfBusinessIndicator = value;
    }

    /**
     * Gets the value of the stopDistributionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopDistributionIndicator() {
        return stopDistributionIndicator;
    }

    /**
     * Sets the value of the stopDistributionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopDistributionIndicator(Boolean value) {
        this.stopDistributionIndicator = value;
    }

    /**
     * Gets the value of the matchBasisEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBasisEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBasisEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchBasisEntryType }
     * 
     * 
     */
    public List<MatchBasisEntryType> getMatchBasisEntry() {
        if (matchBasisEntry == null) {
            matchBasisEntry = new ArrayList<MatchBasisEntryType>();
        }
        return this.matchBasisEntry;
    }

    /**
     * Gets the value of the subjectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectInformationComplexType }
     *     
     */
    public SubjectInformationComplexType getSubjectInformation() {
        return subjectInformation;
    }

    /**
     * Sets the value of the subjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectInformationComplexType }
     *     
     */
    public void setSubjectInformation(SubjectInformationComplexType value) {
        this.subjectInformation = value;
    }

}
