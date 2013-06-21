
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscontinuedOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscontinuedOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Turnover" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GrossProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperatingProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreTaxProfits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscontinuedOperations", propOrder = {
    "turnover",
    "grossProfit",
    "operatingProfit",
    "preTaxProfits"
})
public class DiscontinuedOperations {

    @XmlElement(name = "Turnover")
    protected Long turnover;
    @XmlElement(name = "GrossProfit")
    protected Long grossProfit;
    @XmlElement(name = "OperatingProfit")
    protected Long operatingProfit;
    @XmlElement(name = "PreTaxProfits")
    protected Long preTaxProfits;

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnover(Long value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the grossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossProfit(Long value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the operatingProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingProfit() {
        return operatingProfit;
    }

    /**
     * Sets the value of the operatingProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingProfit(Long value) {
        this.operatingProfit = value;
    }

    /**
     * Gets the value of the preTaxProfits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreTaxProfits() {
        return preTaxProfits;
    }

    /**
     * Sets the value of the preTaxProfits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreTaxProfits(Long value) {
        this.preTaxProfits = value;
    }

}
