
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SectorRanking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectorRanking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllNumberSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllPercentSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllNumberLowerScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllNumberSameScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllNumberHigherScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllPercentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndNumberSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndPercentSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndNumberLowerScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndNumberSameScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndNumberHigherScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndPercentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeNumberSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizePercentSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeNumberLowerScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeNumberSameScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeNumberHigherScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizePercentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeNumberSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgePercentSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeNumberLowerScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeNumberSameScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeNumberHigherScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgePercentile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorRanking", propOrder = {
    "allCompGroup",
    "allCompSector",
    "allNumberSector",
    "allPercentSector",
    "allNumberLowerScore",
    "allNumberSameScore",
    "allNumberHigherScore",
    "allPercentile",
    "indCompGroup",
    "indCompSector",
    "indNumberSector",
    "indPercentSector",
    "indNumberLowerScore",
    "indNumberSameScore",
    "indNumberHigherScore",
    "indPercentile",
    "sizeCompGroup",
    "sizeCompSector",
    "sizeNumberSector",
    "sizePercentSector",
    "sizeNumberLowerScore",
    "sizeNumberSameScore",
    "sizeNumberHigherScore",
    "sizePercentile",
    "ageCompGroup",
    "ageCompSector",
    "ageNumberSector",
    "agePercentSector",
    "ageNumberLowerScore",
    "ageNumberSameScore",
    "ageNumberHigherScore",
    "agePercentile"
})
public class SectorRanking {

    @XmlElement(name = "AllCompGroup")
    protected String allCompGroup;
    @XmlElement(name = "AllCompSector")
    protected String allCompSector;
    @XmlElement(name = "AllNumberSector")
    protected String allNumberSector;
    @XmlElement(name = "AllPercentSector")
    protected String allPercentSector;
    @XmlElement(name = "AllNumberLowerScore")
    protected String allNumberLowerScore;
    @XmlElement(name = "AllNumberSameScore")
    protected String allNumberSameScore;
    @XmlElement(name = "AllNumberHigherScore")
    protected String allNumberHigherScore;
    @XmlElement(name = "AllPercentile")
    protected String allPercentile;
    @XmlElement(name = "IndCompGroup")
    protected String indCompGroup;
    @XmlElement(name = "IndCompSector")
    protected String indCompSector;
    @XmlElement(name = "IndNumberSector")
    protected String indNumberSector;
    @XmlElement(name = "IndPercentSector")
    protected String indPercentSector;
    @XmlElement(name = "IndNumberLowerScore")
    protected String indNumberLowerScore;
    @XmlElement(name = "IndNumberSameScore")
    protected String indNumberSameScore;
    @XmlElement(name = "IndNumberHigherScore")
    protected String indNumberHigherScore;
    @XmlElement(name = "IndPercentile")
    protected String indPercentile;
    @XmlElement(name = "SizeCompGroup")
    protected String sizeCompGroup;
    @XmlElement(name = "SizeCompSector")
    protected String sizeCompSector;
    @XmlElement(name = "SizeNumberSector")
    protected String sizeNumberSector;
    @XmlElement(name = "SizePercentSector")
    protected String sizePercentSector;
    @XmlElement(name = "SizeNumberLowerScore")
    protected String sizeNumberLowerScore;
    @XmlElement(name = "SizeNumberSameScore")
    protected String sizeNumberSameScore;
    @XmlElement(name = "SizeNumberHigherScore")
    protected String sizeNumberHigherScore;
    @XmlElement(name = "SizePercentile")
    protected String sizePercentile;
    @XmlElement(name = "AgeCompGroup")
    protected String ageCompGroup;
    @XmlElement(name = "AgeCompSector")
    protected String ageCompSector;
    @XmlElement(name = "AgeNumberSector")
    protected String ageNumberSector;
    @XmlElement(name = "AgePercentSector")
    protected String agePercentSector;
    @XmlElement(name = "AgeNumberLowerScore")
    protected String ageNumberLowerScore;
    @XmlElement(name = "AgeNumberSameScore")
    protected String ageNumberSameScore;
    @XmlElement(name = "AgeNumberHigherScore")
    protected String ageNumberHigherScore;
    @XmlElement(name = "AgePercentile")
    protected String agePercentile;

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
     * Gets the value of the allNumberSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNumberSector() {
        return allNumberSector;
    }

    /**
     * Sets the value of the allNumberSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNumberSector(String value) {
        this.allNumberSector = value;
    }

    /**
     * Gets the value of the allPercentSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPercentSector() {
        return allPercentSector;
    }

    /**
     * Sets the value of the allPercentSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPercentSector(String value) {
        this.allPercentSector = value;
    }

    /**
     * Gets the value of the allNumberLowerScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNumberLowerScore() {
        return allNumberLowerScore;
    }

    /**
     * Sets the value of the allNumberLowerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNumberLowerScore(String value) {
        this.allNumberLowerScore = value;
    }

    /**
     * Gets the value of the allNumberSameScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNumberSameScore() {
        return allNumberSameScore;
    }

    /**
     * Sets the value of the allNumberSameScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNumberSameScore(String value) {
        this.allNumberSameScore = value;
    }

    /**
     * Gets the value of the allNumberHigherScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllNumberHigherScore() {
        return allNumberHigherScore;
    }

    /**
     * Sets the value of the allNumberHigherScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllNumberHigherScore(String value) {
        this.allNumberHigherScore = value;
    }

    /**
     * Gets the value of the allPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPercentile() {
        return allPercentile;
    }

    /**
     * Sets the value of the allPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPercentile(String value) {
        this.allPercentile = value;
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
     * Gets the value of the indNumberSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNumberSector() {
        return indNumberSector;
    }

    /**
     * Sets the value of the indNumberSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNumberSector(String value) {
        this.indNumberSector = value;
    }

    /**
     * Gets the value of the indPercentSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPercentSector() {
        return indPercentSector;
    }

    /**
     * Sets the value of the indPercentSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPercentSector(String value) {
        this.indPercentSector = value;
    }

    /**
     * Gets the value of the indNumberLowerScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNumberLowerScore() {
        return indNumberLowerScore;
    }

    /**
     * Sets the value of the indNumberLowerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNumberLowerScore(String value) {
        this.indNumberLowerScore = value;
    }

    /**
     * Gets the value of the indNumberSameScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNumberSameScore() {
        return indNumberSameScore;
    }

    /**
     * Sets the value of the indNumberSameScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNumberSameScore(String value) {
        this.indNumberSameScore = value;
    }

    /**
     * Gets the value of the indNumberHigherScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndNumberHigherScore() {
        return indNumberHigherScore;
    }

    /**
     * Sets the value of the indNumberHigherScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndNumberHigherScore(String value) {
        this.indNumberHigherScore = value;
    }

    /**
     * Gets the value of the indPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPercentile() {
        return indPercentile;
    }

    /**
     * Sets the value of the indPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPercentile(String value) {
        this.indPercentile = value;
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
     * Gets the value of the sizeNumberSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeNumberSector() {
        return sizeNumberSector;
    }

    /**
     * Sets the value of the sizeNumberSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeNumberSector(String value) {
        this.sizeNumberSector = value;
    }

    /**
     * Gets the value of the sizePercentSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePercentSector() {
        return sizePercentSector;
    }

    /**
     * Sets the value of the sizePercentSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePercentSector(String value) {
        this.sizePercentSector = value;
    }

    /**
     * Gets the value of the sizeNumberLowerScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeNumberLowerScore() {
        return sizeNumberLowerScore;
    }

    /**
     * Sets the value of the sizeNumberLowerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeNumberLowerScore(String value) {
        this.sizeNumberLowerScore = value;
    }

    /**
     * Gets the value of the sizeNumberSameScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeNumberSameScore() {
        return sizeNumberSameScore;
    }

    /**
     * Sets the value of the sizeNumberSameScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeNumberSameScore(String value) {
        this.sizeNumberSameScore = value;
    }

    /**
     * Gets the value of the sizeNumberHigherScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeNumberHigherScore() {
        return sizeNumberHigherScore;
    }

    /**
     * Sets the value of the sizeNumberHigherScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeNumberHigherScore(String value) {
        this.sizeNumberHigherScore = value;
    }

    /**
     * Gets the value of the sizePercentile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizePercentile() {
        return sizePercentile;
    }

    /**
     * Sets the value of the sizePercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizePercentile(String value) {
        this.sizePercentile = value;
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
     * Gets the value of the ageNumberSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeNumberSector() {
        return ageNumberSector;
    }

    /**
     * Sets the value of the ageNumberSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeNumberSector(String value) {
        this.ageNumberSector = value;
    }

    /**
     * Gets the value of the agePercentSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgePercentSector() {
        return agePercentSector;
    }

    /**
     * Sets the value of the agePercentSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgePercentSector(String value) {
        this.agePercentSector = value;
    }

    /**
     * Gets the value of the ageNumberLowerScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeNumberLowerScore() {
        return ageNumberLowerScore;
    }

    /**
     * Sets the value of the ageNumberLowerScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeNumberLowerScore(String value) {
        this.ageNumberLowerScore = value;
    }

    /**
     * Gets the value of the ageNumberSameScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeNumberSameScore() {
        return ageNumberSameScore;
    }

    /**
     * Sets the value of the ageNumberSameScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeNumberSameScore(String value) {
        this.ageNumberSameScore = value;
    }

    /**
     * Gets the value of the ageNumberHigherScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeNumberHigherScore() {
        return ageNumberHigherScore;
    }

    /**
     * Sets the value of the ageNumberHigherScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeNumberHigherScore(String value) {
        this.ageNumberHigherScore = value;
    }

    /**
     * Gets the value of the agePercentile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgePercentile() {
        return agePercentile;
    }

    /**
     * Sets the value of the agePercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgePercentile(String value) {
        this.agePercentile = value;
    }

}
