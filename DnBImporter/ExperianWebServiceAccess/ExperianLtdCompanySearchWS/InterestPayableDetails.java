
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestPayableDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestPayableDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterestPayable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ToBank" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OnHirePurchase" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OnLeasing" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPayableDetails", propOrder = {
    "interestPayable",
    "toBank",
    "onHirePurchase",
    "onLeasing",
    "other"
})
public class InterestPayableDetails {

    @XmlElement(name = "InterestPayable")
    protected Long interestPayable;
    @XmlElement(name = "ToBank")
    protected Long toBank;
    @XmlElement(name = "OnHirePurchase")
    protected Long onHirePurchase;
    @XmlElement(name = "OnLeasing")
    protected Long onLeasing;
    @XmlElement(name = "Other")
    protected Long other;

    /**
     * Gets the value of the interestPayable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestPayable() {
        return interestPayable;
    }

    /**
     * Sets the value of the interestPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestPayable(Long value) {
        this.interestPayable = value;
    }

    /**
     * Gets the value of the toBank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToBank() {
        return toBank;
    }

    /**
     * Sets the value of the toBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToBank(Long value) {
        this.toBank = value;
    }

    /**
     * Gets the value of the onHirePurchase property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnHirePurchase() {
        return onHirePurchase;
    }

    /**
     * Sets the value of the onHirePurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnHirePurchase(Long value) {
        this.onHirePurchase = value;
    }

    /**
     * Gets the value of the onLeasing property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOnLeasing() {
        return onLeasing;
    }

    /**
     * Sets the value of the onLeasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOnLeasing(Long value) {
        this.onLeasing = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOther(Long value) {
        this.other = value;
    }

}
