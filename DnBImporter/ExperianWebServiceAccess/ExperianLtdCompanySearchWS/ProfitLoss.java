
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfitLoss complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfitLoss">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TurnoverSalesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}TurnOverSalesDetails" minOccurs="0"/>
 *         &lt;element name="CostOfSales" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExceptionalItemsPreGP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherDirectItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalExpenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GrossProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperatingExpenses" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperatingIncome" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExceptionalItemsPreOP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfitLossOnDisposal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OperatingProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShareOfProfits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OtherIncome" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InterestReceivable" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InterestPayableDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}InterestPayableDetails" minOccurs="0"/>
 *         &lt;element name="OtherTransactions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExceptionalItemsPreEBT" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreTaxProfitLoss" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Taxation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExtraordinaryItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinorityInterestsUKGAAP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NetProfitLoss" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitLoss", propOrder = {
    "turnoverSalesDetails",
    "costOfSales",
    "exceptionalItemsPreGP",
    "otherDirectItems",
    "totalExpenses",
    "grossProfit",
    "operatingExpenses",
    "operatingIncome",
    "exceptionalItemsPreOP",
    "profitLossOnDisposal",
    "operatingProfit",
    "shareOfProfits",
    "otherIncome",
    "interestReceivable",
    "interestPayableDetails",
    "otherTransactions",
    "exceptionalItemsPreEBT",
    "preTaxProfitLoss",
    "taxation",
    "extraordinaryItems",
    "minorityInterestsUKGAAP",
    "dividends",
    "netProfitLoss"
})
public class ProfitLoss {

    @XmlElement(name = "TurnoverSalesDetails")
    protected TurnOverSalesDetails turnoverSalesDetails;
    @XmlElement(name = "CostOfSales")
    protected Long costOfSales;
    @XmlElement(name = "ExceptionalItemsPreGP")
    protected Long exceptionalItemsPreGP;
    @XmlElement(name = "OtherDirectItems")
    protected Long otherDirectItems;
    @XmlElement(name = "TotalExpenses")
    protected Long totalExpenses;
    @XmlElement(name = "GrossProfit")
    protected Long grossProfit;
    @XmlElement(name = "OperatingExpenses")
    protected Long operatingExpenses;
    @XmlElement(name = "OperatingIncome")
    protected Long operatingIncome;
    @XmlElement(name = "ExceptionalItemsPreOP")
    protected Long exceptionalItemsPreOP;
    @XmlElement(name = "ProfitLossOnDisposal")
    protected Long profitLossOnDisposal;
    @XmlElement(name = "OperatingProfit")
    protected Long operatingProfit;
    @XmlElement(name = "ShareOfProfits")
    protected Long shareOfProfits;
    @XmlElement(name = "OtherIncome")
    protected Long otherIncome;
    @XmlElement(name = "InterestReceivable")
    protected Long interestReceivable;
    @XmlElement(name = "InterestPayableDetails")
    protected InterestPayableDetails interestPayableDetails;
    @XmlElement(name = "OtherTransactions")
    protected Long otherTransactions;
    @XmlElement(name = "ExceptionalItemsPreEBT")
    protected Long exceptionalItemsPreEBT;
    @XmlElement(name = "PreTaxProfitLoss")
    protected Long preTaxProfitLoss;
    @XmlElement(name = "Taxation")
    protected Long taxation;
    @XmlElement(name = "ExtraordinaryItems")
    protected Long extraordinaryItems;
    @XmlElement(name = "MinorityInterestsUKGAAP")
    protected Long minorityInterestsUKGAAP;
    @XmlElement(name = "Dividends")
    protected Long dividends;
    @XmlElement(name = "NetProfitLoss")
    protected Long netProfitLoss;

    /**
     * Gets the value of the turnoverSalesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TurnOverSalesDetails }
     *     
     */
    public TurnOverSalesDetails getTurnoverSalesDetails() {
        return turnoverSalesDetails;
    }

    /**
     * Sets the value of the turnoverSalesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnOverSalesDetails }
     *     
     */
    public void setTurnoverSalesDetails(TurnOverSalesDetails value) {
        this.turnoverSalesDetails = value;
    }

    /**
     * Gets the value of the costOfSales property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCostOfSales() {
        return costOfSales;
    }

    /**
     * Sets the value of the costOfSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCostOfSales(Long value) {
        this.costOfSales = value;
    }

    /**
     * Gets the value of the exceptionalItemsPreGP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExceptionalItemsPreGP() {
        return exceptionalItemsPreGP;
    }

    /**
     * Sets the value of the exceptionalItemsPreGP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExceptionalItemsPreGP(Long value) {
        this.exceptionalItemsPreGP = value;
    }

    /**
     * Gets the value of the otherDirectItems property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherDirectItems() {
        return otherDirectItems;
    }

    /**
     * Sets the value of the otherDirectItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherDirectItems(Long value) {
        this.otherDirectItems = value;
    }

    /**
     * Gets the value of the totalExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalExpenses() {
        return totalExpenses;
    }

    /**
     * Sets the value of the totalExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalExpenses(Long value) {
        this.totalExpenses = value;
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
     * Gets the value of the operatingExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingExpenses() {
        return operatingExpenses;
    }

    /**
     * Sets the value of the operatingExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingExpenses(Long value) {
        this.operatingExpenses = value;
    }

    /**
     * Gets the value of the operatingIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingIncome() {
        return operatingIncome;
    }

    /**
     * Sets the value of the operatingIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingIncome(Long value) {
        this.operatingIncome = value;
    }

    /**
     * Gets the value of the exceptionalItemsPreOP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExceptionalItemsPreOP() {
        return exceptionalItemsPreOP;
    }

    /**
     * Sets the value of the exceptionalItemsPreOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExceptionalItemsPreOP(Long value) {
        this.exceptionalItemsPreOP = value;
    }

    /**
     * Gets the value of the profitLossOnDisposal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfitLossOnDisposal() {
        return profitLossOnDisposal;
    }

    /**
     * Sets the value of the profitLossOnDisposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfitLossOnDisposal(Long value) {
        this.profitLossOnDisposal = value;
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
     * Gets the value of the shareOfProfits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShareOfProfits() {
        return shareOfProfits;
    }

    /**
     * Sets the value of the shareOfProfits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShareOfProfits(Long value) {
        this.shareOfProfits = value;
    }

    /**
     * Gets the value of the otherIncome property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherIncome() {
        return otherIncome;
    }

    /**
     * Sets the value of the otherIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherIncome(Long value) {
        this.otherIncome = value;
    }

    /**
     * Gets the value of the interestReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestReceivable() {
        return interestReceivable;
    }

    /**
     * Sets the value of the interestReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestReceivable(Long value) {
        this.interestReceivable = value;
    }

    /**
     * Gets the value of the interestPayableDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InterestPayableDetails }
     *     
     */
    public InterestPayableDetails getInterestPayableDetails() {
        return interestPayableDetails;
    }

    /**
     * Sets the value of the interestPayableDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestPayableDetails }
     *     
     */
    public void setInterestPayableDetails(InterestPayableDetails value) {
        this.interestPayableDetails = value;
    }

    /**
     * Gets the value of the otherTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOtherTransactions() {
        return otherTransactions;
    }

    /**
     * Sets the value of the otherTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOtherTransactions(Long value) {
        this.otherTransactions = value;
    }

    /**
     * Gets the value of the exceptionalItemsPreEBT property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExceptionalItemsPreEBT() {
        return exceptionalItemsPreEBT;
    }

    /**
     * Sets the value of the exceptionalItemsPreEBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExceptionalItemsPreEBT(Long value) {
        this.exceptionalItemsPreEBT = value;
    }

    /**
     * Gets the value of the preTaxProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreTaxProfitLoss() {
        return preTaxProfitLoss;
    }

    /**
     * Sets the value of the preTaxProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreTaxProfitLoss(Long value) {
        this.preTaxProfitLoss = value;
    }

    /**
     * Gets the value of the taxation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTaxation() {
        return taxation;
    }

    /**
     * Sets the value of the taxation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTaxation(Long value) {
        this.taxation = value;
    }

    /**
     * Gets the value of the extraordinaryItems property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExtraordinaryItems() {
        return extraordinaryItems;
    }

    /**
     * Sets the value of the extraordinaryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExtraordinaryItems(Long value) {
        this.extraordinaryItems = value;
    }

    /**
     * Gets the value of the minorityInterestsUKGAAP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinorityInterestsUKGAAP() {
        return minorityInterestsUKGAAP;
    }

    /**
     * Sets the value of the minorityInterestsUKGAAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinorityInterestsUKGAAP(Long value) {
        this.minorityInterestsUKGAAP = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDividends(Long value) {
        this.dividends = value;
    }

    /**
     * Gets the value of the netProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetProfitLoss() {
        return netProfitLoss;
    }

    /**
     * Sets the value of the netProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetProfitLoss(Long value) {
        this.netProfitLoss = value;
    }

}
