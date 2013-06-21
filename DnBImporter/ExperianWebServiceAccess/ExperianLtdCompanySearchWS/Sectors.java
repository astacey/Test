
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sectors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sectors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllCompGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompGroupSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndCompGroupSectorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroupSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroupSectorLowerBound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SizeCompGroupSectorUpperBound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroupSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroupSectorStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgeCompGroupSectorEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sectors", propOrder = {
    "allCompGroup",
    "allCompGroupName",
    "indCompGroup",
    "indCompGroupName",
    "indCompGroupSector",
    "indCompGroupSectorName",
    "sizeCompGroup",
    "sizeCompGroupName",
    "sizeCompGroupSector",
    "sizeCompGroupSectorLowerBound",
    "sizeCompGroupSectorUpperBound",
    "ageCompGroup",
    "ageCompGroupName",
    "ageCompGroupSector",
    "ageCompGroupSectorStartDate",
    "ageCompGroupSectorEndDate"
})
public class Sectors {

    @XmlElement(name = "AllCompGroup")
    protected String allCompGroup;
    @XmlElement(name = "AllCompGroupName")
    protected String allCompGroupName;
    @XmlElement(name = "IndCompGroup")
    protected String indCompGroup;
    @XmlElement(name = "IndCompGroupName")
    protected String indCompGroupName;
    @XmlElement(name = "IndCompGroupSector")
    protected String indCompGroupSector;
    @XmlElement(name = "IndCompGroupSectorName")
    protected String indCompGroupSectorName;
    @XmlElement(name = "SizeCompGroup")
    protected String sizeCompGroup;
    @XmlElement(name = "SizeCompGroupName")
    protected String sizeCompGroupName;
    @XmlElement(name = "SizeCompGroupSector")
    protected String sizeCompGroupSector;
    @XmlElement(name = "SizeCompGroupSectorLowerBound")
    protected String sizeCompGroupSectorLowerBound;
    @XmlElement(name = "SizeCompGroupSectorUpperBound")
    protected String sizeCompGroupSectorUpperBound;
    @XmlElement(name = "AgeCompGroup")
    protected String ageCompGroup;
    @XmlElement(name = "AgeCompGroupName")
    protected String ageCompGroupName;
    @XmlElement(name = "AgeCompGroupSector")
    protected String ageCompGroupSector;
    @XmlElement(name = "AgeCompGroupSectorStartDate")
    protected String ageCompGroupSectorStartDate;
    @XmlElement(name = "AgeCompGroupSectorEndDate")
    protected String ageCompGroupSectorEndDate;

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
     * Gets the value of the allCompGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllCompGroupName() {
        return allCompGroupName;
    }

    /**
     * Sets the value of the allCompGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllCompGroupName(String value) {
        this.allCompGroupName = value;
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
     * Gets the value of the indCompGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCompGroupName() {
        return indCompGroupName;
    }

    /**
     * Sets the value of the indCompGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCompGroupName(String value) {
        this.indCompGroupName = value;
    }

    /**
     * Gets the value of the indCompGroupSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCompGroupSector() {
        return indCompGroupSector;
    }

    /**
     * Sets the value of the indCompGroupSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCompGroupSector(String value) {
        this.indCompGroupSector = value;
    }

    /**
     * Gets the value of the indCompGroupSectorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCompGroupSectorName() {
        return indCompGroupSectorName;
    }

    /**
     * Sets the value of the indCompGroupSectorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCompGroupSectorName(String value) {
        this.indCompGroupSectorName = value;
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
     * Gets the value of the sizeCompGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompGroupName() {
        return sizeCompGroupName;
    }

    /**
     * Sets the value of the sizeCompGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompGroupName(String value) {
        this.sizeCompGroupName = value;
    }

    /**
     * Gets the value of the sizeCompGroupSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompGroupSector() {
        return sizeCompGroupSector;
    }

    /**
     * Sets the value of the sizeCompGroupSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompGroupSector(String value) {
        this.sizeCompGroupSector = value;
    }

    /**
     * Gets the value of the sizeCompGroupSectorLowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompGroupSectorLowerBound() {
        return sizeCompGroupSectorLowerBound;
    }

    /**
     * Sets the value of the sizeCompGroupSectorLowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompGroupSectorLowerBound(String value) {
        this.sizeCompGroupSectorLowerBound = value;
    }

    /**
     * Gets the value of the sizeCompGroupSectorUpperBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCompGroupSectorUpperBound() {
        return sizeCompGroupSectorUpperBound;
    }

    /**
     * Sets the value of the sizeCompGroupSectorUpperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCompGroupSectorUpperBound(String value) {
        this.sizeCompGroupSectorUpperBound = value;
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
     * Gets the value of the ageCompGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompGroupName() {
        return ageCompGroupName;
    }

    /**
     * Sets the value of the ageCompGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompGroupName(String value) {
        this.ageCompGroupName = value;
    }

    /**
     * Gets the value of the ageCompGroupSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompGroupSector() {
        return ageCompGroupSector;
    }

    /**
     * Sets the value of the ageCompGroupSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompGroupSector(String value) {
        this.ageCompGroupSector = value;
    }

    /**
     * Gets the value of the ageCompGroupSectorStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompGroupSectorStartDate() {
        return ageCompGroupSectorStartDate;
    }

    /**
     * Sets the value of the ageCompGroupSectorStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompGroupSectorStartDate(String value) {
        this.ageCompGroupSectorStartDate = value;
    }

    /**
     * Gets the value of the ageCompGroupSectorEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeCompGroupSectorEndDate() {
        return ageCompGroupSectorEndDate;
    }

    /**
     * Sets the value of the ageCompGroupSectorEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeCompGroupSectorEndDate(String value) {
        this.ageCompGroupSectorEndDate = value;
    }

}
