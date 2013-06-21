
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Financials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Financials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accounts" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Accounts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cashflow" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Cashflow" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ratios" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Ratios" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PercentageChange" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PercentageChange" minOccurs="0"/>
 *         &lt;element name="Quartiles" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Quartiles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Financials", propOrder = {
    "accounts",
    "cashflow",
    "ratios",
    "percentageChange",
    "quartiles"
})
public class Financials {

    @XmlElement(name = "Accounts")
    protected List<Accounts> accounts;
    @XmlElement(name = "Cashflow")
    protected List<Cashflow> cashflow;
    @XmlElement(name = "Ratios")
    protected List<Ratios> ratios;
    @XmlElement(name = "PercentageChange")
    protected PercentageChange percentageChange;
    @XmlElement(name = "Quartiles")
    protected Quartiles quartiles;

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accounts }
     * 
     * 
     */
    public List<Accounts> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<Accounts>();
        }
        return this.accounts;
    }

    /**
     * Gets the value of the cashflow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashflow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashflow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cashflow }
     * 
     * 
     */
    public List<Cashflow> getCashflow() {
        if (cashflow == null) {
            cashflow = new ArrayList<Cashflow>();
        }
        return this.cashflow;
    }

    /**
     * Gets the value of the ratios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ratios }
     * 
     * 
     */
    public List<Ratios> getRatios() {
        if (ratios == null) {
            ratios = new ArrayList<Ratios>();
        }
        return this.ratios;
    }

    /**
     * Gets the value of the percentageChange property.
     * 
     * @return
     *     possible object is
     *     {@link PercentageChange }
     *     
     */
    public PercentageChange getPercentageChange() {
        return percentageChange;
    }

    /**
     * Sets the value of the percentageChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentageChange }
     *     
     */
    public void setPercentageChange(PercentageChange value) {
        this.percentageChange = value;
    }

    /**
     * Gets the value of the quartiles property.
     * 
     * @return
     *     possible object is
     *     {@link Quartiles }
     *     
     */
    public Quartiles getQuartiles() {
        return quartiles;
    }

    /**
     * Sets the value of the quartiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quartiles }
     *     
     */
    public void setQuartiles(Quartiles value) {
        this.quartiles = value;
    }

}
