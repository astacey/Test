
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalCashDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalCashDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCash" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BankInHand" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CashEquivalents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCashDetails", propOrder = {
    "totalCash",
    "bankInHand",
    "cashEquivalents"
})
public class TotalCashDetails {

    @XmlElement(name = "TotalCash")
    protected Long totalCash;
    @XmlElement(name = "BankInHand")
    protected Long bankInHand;
    @XmlElement(name = "CashEquivalents")
    protected Long cashEquivalents;

    /**
     * Gets the value of the totalCash property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCash() {
        return totalCash;
    }

    /**
     * Sets the value of the totalCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCash(Long value) {
        this.totalCash = value;
    }

    /**
     * Gets the value of the bankInHand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBankInHand() {
        return bankInHand;
    }

    /**
     * Sets the value of the bankInHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBankInHand(Long value) {
        this.bankInHand = value;
    }

    /**
     * Gets the value of the cashEquivalents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCashEquivalents() {
        return cashEquivalents;
    }

    /**
     * Sets the value of the cashEquivalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCashEquivalents(Long value) {
        this.cashEquivalents = value;
    }

}
