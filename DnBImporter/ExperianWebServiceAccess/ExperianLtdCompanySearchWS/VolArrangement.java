
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VolArrangement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolArrangement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LodgedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="PublicationTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CessationLodgeDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="CessationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="CessationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberSupervisors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Supervisor" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Supervisors" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolArrangement", propOrder = {
    "lodgedDate",
    "approvalDate",
    "publicationTown",
    "cessationLodgeDate",
    "cessationDate",
    "cessationType",
    "numberSupervisors",
    "supervisor"
})
public class VolArrangement {

    @XmlElement(name = "LodgedDate")
    protected CCYYMMDD lodgedDate;
    @XmlElement(name = "ApprovalDate")
    protected CCYYMMDD approvalDate;
    @XmlElement(name = "PublicationTown")
    protected String publicationTown;
    @XmlElement(name = "CessationLodgeDate")
    protected CCYYMMDD cessationLodgeDate;
    @XmlElement(name = "CessationDate")
    protected CCYYMMDD cessationDate;
    @XmlElement(name = "CessationType")
    protected String cessationType;
    @XmlElement(name = "NumberSupervisors")
    protected Integer numberSupervisors;
    @XmlElement(name = "Supervisor")
    protected List<Supervisors> supervisor;

    /**
     * Gets the value of the lodgedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLodgedDate() {
        return lodgedDate;
    }

    /**
     * Sets the value of the lodgedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLodgedDate(CCYYMMDD value) {
        this.lodgedDate = value;
    }

    /**
     * Gets the value of the approvalDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getApprovalDate() {
        return approvalDate;
    }

    /**
     * Sets the value of the approvalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setApprovalDate(CCYYMMDD value) {
        this.approvalDate = value;
    }

    /**
     * Gets the value of the publicationTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationTown() {
        return publicationTown;
    }

    /**
     * Sets the value of the publicationTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationTown(String value) {
        this.publicationTown = value;
    }

    /**
     * Gets the value of the cessationLodgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getCessationLodgeDate() {
        return cessationLodgeDate;
    }

    /**
     * Sets the value of the cessationLodgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setCessationLodgeDate(CCYYMMDD value) {
        this.cessationLodgeDate = value;
    }

    /**
     * Gets the value of the cessationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getCessationDate() {
        return cessationDate;
    }

    /**
     * Sets the value of the cessationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setCessationDate(CCYYMMDD value) {
        this.cessationDate = value;
    }

    /**
     * Gets the value of the cessationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCessationType() {
        return cessationType;
    }

    /**
     * Sets the value of the cessationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCessationType(String value) {
        this.cessationType = value;
    }

    /**
     * Gets the value of the numberSupervisors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberSupervisors() {
        return numberSupervisors;
    }

    /**
     * Sets the value of the numberSupervisors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberSupervisors(Integer value) {
        this.numberSupervisors = value;
    }

    /**
     * Gets the value of the supervisor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supervisor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupervisor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supervisors }
     * 
     * 
     */
    public List<Supervisors> getSupervisor() {
        if (supervisor == null) {
            supervisor = new ArrayList<Supervisors>();
        }
        return this.supervisor;
    }

}
