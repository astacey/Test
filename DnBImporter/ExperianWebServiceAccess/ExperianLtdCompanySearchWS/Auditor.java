
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Auditor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auditor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remuneration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NonAuditFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditQual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Auditors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auditor", propOrder = {
    "currency",
    "remuneration",
    "nonAuditFee",
    "auditType",
    "auditQual",
    "auditors"
})
public class Auditor {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Remuneration")
    protected String remuneration;
    @XmlElement(name = "NonAuditFee")
    protected String nonAuditFee;
    @XmlElement(name = "AuditType")
    protected String auditType;
    @XmlElement(name = "AuditQual")
    protected String auditQual;
    @XmlElement(name = "Auditors")
    protected String auditors;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the remuneration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemuneration() {
        return remuneration;
    }

    /**
     * Sets the value of the remuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemuneration(String value) {
        this.remuneration = value;
    }

    /**
     * Gets the value of the nonAuditFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonAuditFee() {
        return nonAuditFee;
    }

    /**
     * Sets the value of the nonAuditFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonAuditFee(String value) {
        this.nonAuditFee = value;
    }

    /**
     * Gets the value of the auditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditType() {
        return auditType;
    }

    /**
     * Sets the value of the auditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditType(String value) {
        this.auditType = value;
    }

    /**
     * Gets the value of the auditQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditQual() {
        return auditQual;
    }

    /**
     * Sets the value of the auditQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditQual(String value) {
        this.auditQual = value;
    }

    /**
     * Gets the value of the auditors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditors() {
        return auditors;
    }

    /**
     * Sets the value of the auditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditors(String value) {
        this.auditors = value;
    }

}
