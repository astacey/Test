
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatestReturns" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumDirs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumSecs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCurrDirs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevDirs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DirectorAvgAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DirectorAvgLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCurrDirectorLast12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumAppointmentsLast12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumResignationsLast12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDisqualifications" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Directors" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Directors" minOccurs="0"/>
 *         &lt;element name="Secretaries" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Secretaries" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementInfo", propOrder = {
    "latestReturns",
    "numDirs",
    "numSecs",
    "numCurrDirs",
    "numPrevDirs",
    "directorAvgAge",
    "directorAvgLength",
    "numCurrDirectorLast12",
    "numAppointmentsLast12",
    "numResignationsLast12",
    "numDisqualifications",
    "directors",
    "secretaries"
})
public class ManagementInfo {

    @XmlElement(name = "LatestReturns")
    protected CCYYMMDD latestReturns;
    @XmlElement(name = "NumDirs")
    protected Integer numDirs;
    @XmlElement(name = "NumSecs")
    protected Integer numSecs;
    @XmlElement(name = "NumCurrDirs")
    protected Integer numCurrDirs;
    @XmlElement(name = "NumPrevDirs")
    protected Integer numPrevDirs;
    @XmlElement(name = "DirectorAvgAge")
    protected Integer directorAvgAge;
    @XmlElement(name = "DirectorAvgLength")
    protected Integer directorAvgLength;
    @XmlElement(name = "NumCurrDirectorLast12")
    protected Integer numCurrDirectorLast12;
    @XmlElement(name = "NumAppointmentsLast12")
    protected Integer numAppointmentsLast12;
    @XmlElement(name = "NumResignationsLast12")
    protected Integer numResignationsLast12;
    @XmlElement(name = "NumDisqualifications")
    protected Integer numDisqualifications;
    @XmlElement(name = "Directors")
    protected Directors directors;
    @XmlElement(name = "Secretaries")
    protected Secretaries secretaries;

    /**
     * Gets the value of the latestReturns property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestReturns() {
        return latestReturns;
    }

    /**
     * Sets the value of the latestReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestReturns(CCYYMMDD value) {
        this.latestReturns = value;
    }

    /**
     * Gets the value of the numDirs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDirs() {
        return numDirs;
    }

    /**
     * Sets the value of the numDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDirs(Integer value) {
        this.numDirs = value;
    }

    /**
     * Gets the value of the numSecs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSecs() {
        return numSecs;
    }

    /**
     * Sets the value of the numSecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSecs(Integer value) {
        this.numSecs = value;
    }

    /**
     * Gets the value of the numCurrDirs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCurrDirs() {
        return numCurrDirs;
    }

    /**
     * Sets the value of the numCurrDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCurrDirs(Integer value) {
        this.numCurrDirs = value;
    }

    /**
     * Gets the value of the numPrevDirs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevDirs() {
        return numPrevDirs;
    }

    /**
     * Sets the value of the numPrevDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevDirs(Integer value) {
        this.numPrevDirs = value;
    }

    /**
     * Gets the value of the directorAvgAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectorAvgAge() {
        return directorAvgAge;
    }

    /**
     * Sets the value of the directorAvgAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectorAvgAge(Integer value) {
        this.directorAvgAge = value;
    }

    /**
     * Gets the value of the directorAvgLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirectorAvgLength() {
        return directorAvgLength;
    }

    /**
     * Sets the value of the directorAvgLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirectorAvgLength(Integer value) {
        this.directorAvgLength = value;
    }

    /**
     * Gets the value of the numCurrDirectorLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCurrDirectorLast12() {
        return numCurrDirectorLast12;
    }

    /**
     * Sets the value of the numCurrDirectorLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCurrDirectorLast12(Integer value) {
        this.numCurrDirectorLast12 = value;
    }

    /**
     * Gets the value of the numAppointmentsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAppointmentsLast12() {
        return numAppointmentsLast12;
    }

    /**
     * Sets the value of the numAppointmentsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAppointmentsLast12(Integer value) {
        this.numAppointmentsLast12 = value;
    }

    /**
     * Gets the value of the numResignationsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumResignationsLast12() {
        return numResignationsLast12;
    }

    /**
     * Sets the value of the numResignationsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumResignationsLast12(Integer value) {
        this.numResignationsLast12 = value;
    }

    /**
     * Gets the value of the numDisqualifications property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDisqualifications() {
        return numDisqualifications;
    }

    /**
     * Sets the value of the numDisqualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDisqualifications(Integer value) {
        this.numDisqualifications = value;
    }

    /**
     * Gets the value of the directors property.
     * 
     * @return
     *     possible object is
     *     {@link Directors }
     *     
     */
    public Directors getDirectors() {
        return directors;
    }

    /**
     * Sets the value of the directors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directors }
     *     
     */
    public void setDirectors(Directors value) {
        this.directors = value;
    }

    /**
     * Gets the value of the secretaries property.
     * 
     * @return
     *     possible object is
     *     {@link Secretaries }
     *     
     */
    public Secretaries getSecretaries() {
        return secretaries;
    }

    /**
     * Sets the value of the secretaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Secretaries }
     *     
     */
    public void setSecretaries(Secretaries value) {
        this.secretaries = value;
    }

}
