
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subsidiaries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subsidiaries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TreePosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalElements" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumImmediateSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumLiveImmediateSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumDormantImmediateSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumDissolvedLiquidatedImmediateSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumNestedSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumUKSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalNumOverseasSubs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UKSubsidiaries" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}UKSubsidiaries" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ForeignSubsidiaries" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ForgnSubsidiaries" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subsidiaries", propOrder = {
    "treePosition",
    "totalElements",
    "totalSubs",
    "totalNumImmediateSubs",
    "totalNumLiveImmediateSubs",
    "totalNumDormantImmediateSubs",
    "totalNumDissolvedLiquidatedImmediateSubs",
    "totalNumNestedSubs",
    "totalNumSubs",
    "totalNumUKSubs",
    "totalNumOverseasSubs",
    "ukSubsidiaries",
    "foreignSubsidiaries"
})
public class Subsidiaries {

    @XmlElement(name = "TreePosition")
    protected String treePosition;
    @XmlElement(name = "TotalElements")
    protected Long totalElements;
    @XmlElement(name = "TotalSubs")
    protected Long totalSubs;
    @XmlElement(name = "TotalNumImmediateSubs")
    protected Long totalNumImmediateSubs;
    @XmlElement(name = "TotalNumLiveImmediateSubs")
    protected Long totalNumLiveImmediateSubs;
    @XmlElement(name = "TotalNumDormantImmediateSubs")
    protected Long totalNumDormantImmediateSubs;
    @XmlElement(name = "TotalNumDissolvedLiquidatedImmediateSubs")
    protected Long totalNumDissolvedLiquidatedImmediateSubs;
    @XmlElement(name = "TotalNumNestedSubs")
    protected Long totalNumNestedSubs;
    @XmlElement(name = "TotalNumSubs")
    protected Long totalNumSubs;
    @XmlElement(name = "TotalNumUKSubs")
    protected Long totalNumUKSubs;
    @XmlElement(name = "TotalNumOverseasSubs")
    protected Long totalNumOverseasSubs;
    @XmlElement(name = "UKSubsidiaries")
    protected List<UKSubsidiaries> ukSubsidiaries;
    @XmlElement(name = "ForeignSubsidiaries")
    protected List<ForgnSubsidiaries> foreignSubsidiaries;

    /**
     * Gets the value of the treePosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreePosition() {
        return treePosition;
    }

    /**
     * Sets the value of the treePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreePosition(String value) {
        this.treePosition = value;
    }

    /**
     * Gets the value of the totalElements property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalElements() {
        return totalElements;
    }

    /**
     * Sets the value of the totalElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalElements(Long value) {
        this.totalElements = value;
    }

    /**
     * Gets the value of the totalSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalSubs() {
        return totalSubs;
    }

    /**
     * Sets the value of the totalSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalSubs(Long value) {
        this.totalSubs = value;
    }

    /**
     * Gets the value of the totalNumImmediateSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumImmediateSubs() {
        return totalNumImmediateSubs;
    }

    /**
     * Sets the value of the totalNumImmediateSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumImmediateSubs(Long value) {
        this.totalNumImmediateSubs = value;
    }

    /**
     * Gets the value of the totalNumLiveImmediateSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumLiveImmediateSubs() {
        return totalNumLiveImmediateSubs;
    }

    /**
     * Sets the value of the totalNumLiveImmediateSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumLiveImmediateSubs(Long value) {
        this.totalNumLiveImmediateSubs = value;
    }

    /**
     * Gets the value of the totalNumDormantImmediateSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumDormantImmediateSubs() {
        return totalNumDormantImmediateSubs;
    }

    /**
     * Sets the value of the totalNumDormantImmediateSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumDormantImmediateSubs(Long value) {
        this.totalNumDormantImmediateSubs = value;
    }

    /**
     * Gets the value of the totalNumDissolvedLiquidatedImmediateSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumDissolvedLiquidatedImmediateSubs() {
        return totalNumDissolvedLiquidatedImmediateSubs;
    }

    /**
     * Sets the value of the totalNumDissolvedLiquidatedImmediateSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumDissolvedLiquidatedImmediateSubs(Long value) {
        this.totalNumDissolvedLiquidatedImmediateSubs = value;
    }

    /**
     * Gets the value of the totalNumNestedSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumNestedSubs() {
        return totalNumNestedSubs;
    }

    /**
     * Sets the value of the totalNumNestedSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumNestedSubs(Long value) {
        this.totalNumNestedSubs = value;
    }

    /**
     * Gets the value of the totalNumSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumSubs() {
        return totalNumSubs;
    }

    /**
     * Sets the value of the totalNumSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumSubs(Long value) {
        this.totalNumSubs = value;
    }

    /**
     * Gets the value of the totalNumUKSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumUKSubs() {
        return totalNumUKSubs;
    }

    /**
     * Sets the value of the totalNumUKSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumUKSubs(Long value) {
        this.totalNumUKSubs = value;
    }

    /**
     * Gets the value of the totalNumOverseasSubs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNumOverseasSubs() {
        return totalNumOverseasSubs;
    }

    /**
     * Sets the value of the totalNumOverseasSubs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNumOverseasSubs(Long value) {
        this.totalNumOverseasSubs = value;
    }

    /**
     * Gets the value of the ukSubsidiaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukSubsidiaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUKSubsidiaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UKSubsidiaries }
     * 
     * 
     */
    public List<UKSubsidiaries> getUKSubsidiaries() {
        if (ukSubsidiaries == null) {
            ukSubsidiaries = new ArrayList<UKSubsidiaries>();
        }
        return this.ukSubsidiaries;
    }

    /**
     * Gets the value of the foreignSubsidiaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignSubsidiaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignSubsidiaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForgnSubsidiaries }
     * 
     * 
     */
    public List<ForgnSubsidiaries> getForeignSubsidiaries() {
        if (foreignSubsidiaries == null) {
            foreignSubsidiaries = new ArrayList<ForgnSubsidiaries>();
        }
        return this.foreignSubsidiaries;
    }

}
