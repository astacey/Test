
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetsNonCurrentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAssetsNonCurrentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinanceLeasesHirePurchase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DirectorsLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherFinancialAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAssetsNonCurrentDetails", propOrder = {
    "financialAssets",
    "financeLeasesHirePurchase",
    "groupLoans",
    "directorsLoans",
    "otherLoans",
    "otherFinancialAssets"
})
public class FinancialAssetsNonCurrentDetails {

    @XmlElement(name = "FinancialAssets")
    protected Long financialAssets;
    @XmlElement(name = "FinanceLeasesHirePurchase")
    protected Long financeLeasesHirePurchase;
    @XmlElement(name = "GroupLoans")
    protected Long groupLoans;
    @XmlElement(name = "DirectorsLoans")
    protected Long directorsLoans;
    @XmlElement(name = "OtherLoans")
    protected Long otherLoans;
    @XmlElement(name = "OtherFinancialAssets")
    protected Long otherFinancialAssets;

    /**
     * Gets the value of the financialAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancialAssets() {
        return financialAssets;
    }

    /**
     * Sets the value of the financialAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancialAssets(Long value) {
        this.financialAssets = value;
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
     * Gets the value of the directorsLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirectorsLoans() {
        return directorsLoans;
    }

    /**
     * Sets the value of the directorsLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirectorsLoans(Long value) {
        this.directorsLoans = value;
    }

    /**
     * Gets the value of the otherLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherLoans() {
        return otherLoans;
    }

    /**
     * Sets the value of the otherLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherLoans(Long value) {
        this.otherLoans = value;
    }

    /**
     * Gets the value of the otherFinancialAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherFinancialAssets() {
        return otherFinancialAssets;
    }

    /**
     * Sets the value of the otherFinancialAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherFinancialAssets(Long value) {
        this.otherFinancialAssets = value;
    }

}
