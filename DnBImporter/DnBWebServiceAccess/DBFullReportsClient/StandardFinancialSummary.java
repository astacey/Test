
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardFinancialSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardFinancialSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesRevenue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ExportSales" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitorLossBeforeTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetWorthorTotalEquity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EarningsMargin" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalTangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Inventory" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiquidAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WorkingCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Creditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StaffCosts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GrossProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OperatingCashFlow" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDueToTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDueToSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountReceivablesFromDirectors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardFinancialSummary", propOrder = {
    "salesRevenue",
    "exportSales",
    "profitorLossBeforeTaxes",
    "netWorthorTotalEquity",
    "tangibleNetWorth",
    "totalLongTermAssets",
    "totalAssets",
    "totalCurrentAssets",
    "totalCurrentLiabilities",
    "employeeQuantity",
    "earningsMargin",
    "netProfitLoss",
    "totalTangibleAssets",
    "inventory",
    "liquidAssets",
    "tradeDebtors",
    "workingCapital",
    "creditors",
    "staffCosts",
    "totalLongTermLiabilities",
    "grossProfitLoss",
    "operatingCashFlow",
    "amountDueToTaxes",
    "amountDueToSocialSecurity",
    "amountReceivablesFromDirectors"
})
public class StandardFinancialSummary {

    @XmlElement(name = "SalesRevenue")
    protected AmountType salesRevenue;
    @XmlElement(name = "ExportSales")
    protected AmountType exportSales;
    @XmlElement(name = "ProfitorLossBeforeTaxes")
    protected AmountType profitorLossBeforeTaxes;
    @XmlElement(name = "NetWorthorTotalEquity")
    protected AmountType netWorthorTotalEquity;
    @XmlElement(name = "TangibleNetWorth")
    protected AmountType tangibleNetWorth;
    @XmlElement(name = "TotalLongTermAssets")
    protected AmountType totalLongTermAssets;
    @XmlElement(name = "TotalAssets")
    protected AmountType totalAssets;
    @XmlElement(name = "TotalCurrentAssets")
    protected AmountType totalCurrentAssets;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected AmountType totalCurrentLiabilities;
    @XmlElement(name = "EmployeeQuantity")
    protected BigInteger employeeQuantity;
    @XmlElement(name = "EarningsMargin")
    protected AmountType earningsMargin;
    @XmlElement(name = "NetProfitLoss")
    protected AmountType netProfitLoss;
    @XmlElement(name = "TotalTangibleAssets")
    protected AmountType totalTangibleAssets;
    @XmlElement(name = "Inventory")
    protected AmountType inventory;
    @XmlElement(name = "LiquidAssets")
    protected AmountType liquidAssets;
    @XmlElement(name = "TradeDebtors")
    protected AmountType tradeDebtors;
    @XmlElement(name = "WorkingCapital")
    protected AmountType workingCapital;
    @XmlElement(name = "Creditors")
    protected AmountType creditors;
    @XmlElement(name = "StaffCosts")
    protected AmountType staffCosts;
    @XmlElement(name = "TotalLongTermLiabilities")
    protected AmountType totalLongTermLiabilities;
    @XmlElement(name = "GrossProfitLoss")
    protected AmountType grossProfitLoss;
    @XmlElement(name = "OperatingCashFlow")
    protected AmountType operatingCashFlow;
    @XmlElement(name = "AmountDueToTaxes")
    protected AmountType amountDueToTaxes;
    @XmlElement(name = "AmountDueToSocialSecurity")
    protected AmountType amountDueToSocialSecurity;
    @XmlElement(name = "AmountReceivablesFromDirectors")
    protected AmountType amountReceivablesFromDirectors;

    /**
     * Gets the value of the salesRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRevenue() {
        return salesRevenue;
    }

    /**
     * Sets the value of the salesRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRevenue(AmountType value) {
        this.salesRevenue = value;
    }

    /**
     * Gets the value of the exportSales property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExportSales() {
        return exportSales;
    }

    /**
     * Sets the value of the exportSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExportSales(AmountType value) {
        this.exportSales = value;
    }

    /**
     * Gets the value of the profitorLossBeforeTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitorLossBeforeTaxes() {
        return profitorLossBeforeTaxes;
    }

    /**
     * Sets the value of the profitorLossBeforeTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitorLossBeforeTaxes(AmountType value) {
        this.profitorLossBeforeTaxes = value;
    }

    /**
     * Gets the value of the netWorthorTotalEquity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetWorthorTotalEquity() {
        return netWorthorTotalEquity;
    }

    /**
     * Sets the value of the netWorthorTotalEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetWorthorTotalEquity(AmountType value) {
        this.netWorthorTotalEquity = value;
    }

    /**
     * Gets the value of the tangibleNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTangibleNetWorth() {
        return tangibleNetWorth;
    }

    /**
     * Sets the value of the tangibleNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTangibleNetWorth(AmountType value) {
        this.tangibleNetWorth = value;
    }

    /**
     * Gets the value of the totalLongTermAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLongTermAssets() {
        return totalLongTermAssets;
    }

    /**
     * Sets the value of the totalLongTermAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLongTermAssets(AmountType value) {
        this.totalLongTermAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssets(AmountType value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCurrentAssets(AmountType value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalCurrentLiabilities(AmountType value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeQuantity(BigInteger value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the earningsMargin property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEarningsMargin() {
        return earningsMargin;
    }

    /**
     * Sets the value of the earningsMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEarningsMargin(AmountType value) {
        this.earningsMargin = value;
    }

    /**
     * Gets the value of the netProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetProfitLoss() {
        return netProfitLoss;
    }

    /**
     * Sets the value of the netProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetProfitLoss(AmountType value) {
        this.netProfitLoss = value;
    }

    /**
     * Gets the value of the totalTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTangibleAssets() {
        return totalTangibleAssets;
    }

    /**
     * Sets the value of the totalTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTangibleAssets(AmountType value) {
        this.totalTangibleAssets = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInventory(AmountType value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the liquidAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiquidAssets() {
        return liquidAssets;
    }

    /**
     * Sets the value of the liquidAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiquidAssets(AmountType value) {
        this.liquidAssets = value;
    }

    /**
     * Gets the value of the tradeDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtors() {
        return tradeDebtors;
    }

    /**
     * Sets the value of the tradeDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtors(AmountType value) {
        this.tradeDebtors = value;
    }

    /**
     * Gets the value of the workingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWorkingCapital() {
        return workingCapital;
    }

    /**
     * Sets the value of the workingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWorkingCapital(AmountType value) {
        this.workingCapital = value;
    }

    /**
     * Gets the value of the creditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditors() {
        return creditors;
    }

    /**
     * Sets the value of the creditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditors(AmountType value) {
        this.creditors = value;
    }

    /**
     * Gets the value of the staffCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStaffCosts() {
        return staffCosts;
    }

    /**
     * Sets the value of the staffCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStaffCosts(AmountType value) {
        this.staffCosts = value;
    }

    /**
     * Gets the value of the totalLongTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLongTermLiabilities() {
        return totalLongTermLiabilities;
    }

    /**
     * Sets the value of the totalLongTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLongTermLiabilities(AmountType value) {
        this.totalLongTermLiabilities = value;
    }

    /**
     * Gets the value of the grossProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrossProfitLoss() {
        return grossProfitLoss;
    }

    /**
     * Sets the value of the grossProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrossProfitLoss(AmountType value) {
        this.grossProfitLoss = value;
    }

    /**
     * Gets the value of the operatingCashFlow property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOperatingCashFlow() {
        return operatingCashFlow;
    }

    /**
     * Sets the value of the operatingCashFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOperatingCashFlow(AmountType value) {
        this.operatingCashFlow = value;
    }

    /**
     * Gets the value of the amountDueToTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountDueToTaxes() {
        return amountDueToTaxes;
    }

    /**
     * Sets the value of the amountDueToTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountDueToTaxes(AmountType value) {
        this.amountDueToTaxes = value;
    }

    /**
     * Gets the value of the amountDueToSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountDueToSocialSecurity() {
        return amountDueToSocialSecurity;
    }

    /**
     * Sets the value of the amountDueToSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountDueToSocialSecurity(AmountType value) {
        this.amountDueToSocialSecurity = value;
    }

    /**
     * Gets the value of the amountReceivablesFromDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountReceivablesFromDirectors() {
        return amountReceivablesFromDirectors;
    }

    /**
     * Sets the value of the amountReceivablesFromDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountReceivablesFromDirectors(AmountType value) {
        this.amountReceivablesFromDirectors = value;
    }

}
