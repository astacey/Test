
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialLiabilitiesDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialLiabilitiesDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BankOverdraft" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinanceLeasesHirePurchase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinanceLease" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HirePurchase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DirectorLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherShortTermLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Grants" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherFinancialLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialLiabilitiesDetails", propOrder = {
    "financialLiabilities",
    "bankOverdraft",
    "financeLeasesHirePurchase",
    "financeLease",
    "hirePurchase",
    "groupLoans",
    "directorLoans",
    "otherShortTermLoans",
    "grants",
    "otherFinancialLiabilities"
})
public class FinancialLiabilitiesDetails {

    @XmlElement(name = "FinancialLiabilities")
    protected Long financialLiabilities;
    @XmlElement(name = "BankOverdraft")
    protected Long bankOverdraft;
    @XmlElement(name = "FinanceLeasesHirePurchase")
    protected Long financeLeasesHirePurchase;
    @XmlElement(name = "FinanceLease")
    protected Long financeLease;
    @XmlElement(name = "HirePurchase")
    protected Long hirePurchase;
    @XmlElement(name = "GroupLoans")
    protected Long groupLoans;
    @XmlElement(name = "DirectorLoans")
    protected Long directorLoans;
    @XmlElement(name = "OtherShortTermLoans")
    protected Long otherShortTermLoans;
    @XmlElement(name = "Grants")
    protected Long grants;
    @XmlElement(name = "OtherFinancialLiabilities")
    protected Long otherFinancialLiabilities;

    /**
     * Gets the value of the financialLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancialLiabilities() {
        return financialLiabilities;
    }

    /**
     * Sets the value of the financialLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancialLiabilities(Long value) {
        this.financialLiabilities = value;
    }

    /**
     * Gets the value of the bankOverdraft property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankOverdraft() {
        return bankOverdraft;
    }

    /**
     * Sets the value of the bankOverdraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankOverdraft(Long value) {
        this.bankOverdraft = value;
    }

    /**
     * Gets the value of the financeLeasesHirePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanceLeasesHirePurchase() {
        return financeLeasesHirePurchase;
    }

    /**
     * Sets the value of the financeLeasesHirePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanceLeasesHirePurchase(Long value) {
        this.financeLeasesHirePurchase = value;
    }

    /**
     * Gets the value of the financeLease property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinanceLease() {
        return financeLease;
    }

    /**
     * Sets the value of the financeLease property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinanceLease(Long value) {
        this.financeLease = value;
    }

    /**
     * Gets the value of the hirePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHirePurchase() {
        return hirePurchase;
    }

    /**
     * Sets the value of the hirePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHirePurchase(Long value) {
        this.hirePurchase = value;
    }

    /**
     * Gets the value of the groupLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupLoans() {
        return groupLoans;
    }

    /**
     * Sets the value of the groupLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupLoans(Long value) {
        this.groupLoans = value;
    }

    /**
     * Gets the value of the directorLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectorLoans() {
        return directorLoans;
    }

    /**
     * Sets the value of the directorLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectorLoans(Long value) {
        this.directorLoans = value;
    }

    /**
     * Gets the value of the otherShortTermLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherShortTermLoans() {
        return otherShortTermLoans;
    }

    /**
     * Sets the value of the otherShortTermLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherShortTermLoans(Long value) {
        this.otherShortTermLoans = value;
    }

    /**
     * Gets the value of the grants property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrants() {
        return grants;
    }

    /**
     * Sets the value of the grants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrants(Long value) {
        this.grants = value;
    }

    /**
     * Gets the value of the otherFinancialLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherFinancialLiabilities() {
        return otherFinancialLiabilities;
    }

    /**
     * Sets the value of the otherFinancialLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherFinancialLiabilities(Long value) {
        this.otherFinancialLiabilities = value;
    }

}
