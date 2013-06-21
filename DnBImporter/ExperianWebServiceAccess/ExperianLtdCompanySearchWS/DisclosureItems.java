
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisclosureItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisclosureItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DividendsPayable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployeeRemunerationDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}EmployeeRemunerationDetails" minOccurs="0"/>
 *         &lt;element name="DirectorRemunerationDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}DirectorRemunerationDetails" minOccurs="0"/>
 *         &lt;element name="HighestPaidDirector" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberEmployees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AuditorRemuneration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NonAuditFees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountancyFees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DepreciationCharges" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AmortisationCharges" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ImpairmentCharges" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureItems", propOrder = {
    "dividendsPayable",
    "employeeRemunerationDetails",
    "directorRemunerationDetails",
    "highestPaidDirector",
    "numberEmployees",
    "auditorRemuneration",
    "nonAuditFees",
    "accountancyFees",
    "depreciationCharges",
    "amortisationCharges",
    "impairmentCharges"
})
public class DisclosureItems {

    @XmlElement(name = "DividendsPayable")
    protected Long dividendsPayable;
    @XmlElement(name = "EmployeeRemunerationDetails")
    protected EmployeeRemunerationDetails employeeRemunerationDetails;
    @XmlElement(name = "DirectorRemunerationDetails")
    protected DirectorRemunerationDetails directorRemunerationDetails;
    @XmlElement(name = "HighestPaidDirector")
    protected Long highestPaidDirector;
    @XmlElement(name = "NumberEmployees")
    protected Long numberEmployees;
    @XmlElement(name = "AuditorRemuneration")
    protected Long auditorRemuneration;
    @XmlElement(name = "NonAuditFees")
    protected Long nonAuditFees;
    @XmlElement(name = "AccountancyFees")
    protected Long accountancyFees;
    @XmlElement(name = "DepreciationCharges")
    protected Long depreciationCharges;
    @XmlElement(name = "AmortisationCharges")
    protected Long amortisationCharges;
    @XmlElement(name = "ImpairmentCharges")
    protected Long impairmentCharges;

    /**
     * Gets the value of the dividendsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDividendsPayable() {
        return dividendsPayable;
    }

    /**
     * Sets the value of the dividendsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDividendsPayable(Long value) {
        this.dividendsPayable = value;
    }

    /**
     * Gets the value of the employeeRemunerationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeRemunerationDetails }
     *     
     */
    public EmployeeRemunerationDetails getEmployeeRemunerationDetails() {
        return employeeRemunerationDetails;
    }

    /**
     * Sets the value of the employeeRemunerationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeRemunerationDetails }
     *     
     */
    public void setEmployeeRemunerationDetails(EmployeeRemunerationDetails value) {
        this.employeeRemunerationDetails = value;
    }

    /**
     * Gets the value of the directorRemunerationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DirectorRemunerationDetails }
     *     
     */
    public DirectorRemunerationDetails getDirectorRemunerationDetails() {
        return directorRemunerationDetails;
    }

    /**
     * Sets the value of the directorRemunerationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectorRemunerationDetails }
     *     
     */
    public void setDirectorRemunerationDetails(DirectorRemunerationDetails value) {
        this.directorRemunerationDetails = value;
    }

    /**
     * Gets the value of the highestPaidDirector property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHighestPaidDirector() {
        return highestPaidDirector;
    }

    /**
     * Sets the value of the highestPaidDirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighestPaidDirector(Long value) {
        this.highestPaidDirector = value;
    }

    /**
     * Gets the value of the numberEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberEmployees() {
        return numberEmployees;
    }

    /**
     * Sets the value of the numberEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberEmployees(Long value) {
        this.numberEmployees = value;
    }

    /**
     * Gets the value of the auditorRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuditorRemuneration() {
        return auditorRemuneration;
    }

    /**
     * Sets the value of the auditorRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuditorRemuneration(Long value) {
        this.auditorRemuneration = value;
    }

    /**
     * Gets the value of the nonAuditFees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNonAuditFees() {
        return nonAuditFees;
    }

    /**
     * Sets the value of the nonAuditFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNonAuditFees(Long value) {
        this.nonAuditFees = value;
    }

    /**
     * Gets the value of the accountancyFees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountancyFees() {
        return accountancyFees;
    }

    /**
     * Sets the value of the accountancyFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountancyFees(Long value) {
        this.accountancyFees = value;
    }

    /**
     * Gets the value of the depreciationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepreciationCharges() {
        return depreciationCharges;
    }

    /**
     * Sets the value of the depreciationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepreciationCharges(Long value) {
        this.depreciationCharges = value;
    }

    /**
     * Gets the value of the amortisationCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmortisationCharges() {
        return amortisationCharges;
    }

    /**
     * Sets the value of the amortisationCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmortisationCharges(Long value) {
        this.amortisationCharges = value;
    }

    /**
     * Gets the value of the impairmentCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpairmentCharges() {
        return impairmentCharges;
    }

    /**
     * Sets the value of the impairmentCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpairmentCharges(Long value) {
        this.impairmentCharges = value;
    }

}
