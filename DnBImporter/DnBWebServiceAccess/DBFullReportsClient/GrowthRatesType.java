
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrowthRatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrowthRatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComparedFinancialStatementDate" type="{http://gateway.dnb.com/getProduct}DNBDate" minOccurs="0"/>
 *         &lt;element name="Turnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GrossProfitLoss" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetOperatingProfitLoss" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitLossBeforeTax" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitLossAfterTax" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="EmployeesQuantity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitLossPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SalesPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalIntangibleAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalTangibleFixedAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetCurrentAssetsLiabilities" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalAssetslessCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShortTermLiabilities" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LongTermLiabilities" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetWorthToShareholdersFunds" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShareholdersReturn" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapital" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetSalesPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="RetainedProfitLossPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AcidTestRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SolvencyRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesToInventory" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NonCurrentAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsToTotalAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalAssetsToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesToCostOfMaterials" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetSalesToNetCurrentAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="RetainedProfitLossToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FinancialExpensesToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="WorkingCapitalToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="StockTurnoverRate" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CollectionPeriodDays" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AssetTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetInterestReceived" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShareholdersFunds" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GrossPremiumsWritten" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetPremiumsEarned" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetRevenueFromCapitalInvestments" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ClaimsPaid" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="UnderwritingExpenses" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InsuranceReserves" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrowthRatesType", propOrder = {
    "comparedFinancialStatementDate",
    "turnover",
    "grossProfitLoss",
    "netOperatingProfitLoss",
    "profitLossBeforeTax",
    "profitLossAfterTax",
    "netProfitLoss",
    "employeesQuantity",
    "profitLossPerEmployee",
    "salesPerEmployee",
    "totalIntangibleAssets",
    "totalTangibleFixedAssets",
    "fixedAssets",
    "currentAssets",
    "totalAssets",
    "currentLiabilities",
    "netCurrentAssetsLiabilities",
    "totalAssetslessCurrentLiabilities",
    "netWorth",
    "shortTermLiabilities",
    "longTermLiabilities",
    "netAssets",
    "netWorthToShareholdersFunds",
    "profitMargin",
    "shareholdersReturn",
    "returnOnCapital",
    "returnOnAssets",
    "netSalesPerEmployee",
    "retainedProfitLossPerEmployee",
    "acidTestRatio",
    "currentRatio",
    "solvencyRatio",
    "fixedAssetsToNetWorth",
    "currentLiabilitiesToNetWorth",
    "currentLiabilitiesToInventory",
    "nonCurrentAssetsToNetWorth",
    "fixedAssetsToTotalAssets",
    "totalAssetsToNetSales",
    "totalLiabilitiesToNetSales",
    "totalLiabilitiesToCostOfMaterials",
    "netSalesToNetCurrentAssets",
    "retainedProfitLossToNetSales",
    "financialExpensesToNetSales",
    "workingCapitalToNetSales",
    "stockTurnoverRate",
    "collectionPeriodDays",
    "assetTurnover",
    "netInterestReceived",
    "shareholdersFunds",
    "grossPremiumsWritten",
    "netPremiumsEarned",
    "netRevenueFromCapitalInvestments",
    "claimsPaid",
    "underwritingExpenses",
    "investments",
    "insuranceReserves"
})
public class GrowthRatesType {

    @XmlElement(name = "ComparedFinancialStatementDate")
    protected DNBDate comparedFinancialStatementDate;
    @XmlElement(name = "Turnover")
    protected FinancialRatio turnover;
    @XmlElement(name = "GrossProfitLoss")
    protected FinancialRatio grossProfitLoss;
    @XmlElement(name = "NetOperatingProfitLoss")
    protected FinancialRatio netOperatingProfitLoss;
    @XmlElement(name = "ProfitLossBeforeTax")
    protected FinancialRatio profitLossBeforeTax;
    @XmlElement(name = "ProfitLossAfterTax")
    protected FinancialRatio profitLossAfterTax;
    @XmlElement(name = "NetProfitLoss")
    protected FinancialRatio netProfitLoss;
    @XmlElement(name = "EmployeesQuantity")
    protected FinancialRatio employeesQuantity;
    @XmlElement(name = "ProfitLossPerEmployee")
    protected FinancialRatio profitLossPerEmployee;
    @XmlElement(name = "SalesPerEmployee")
    protected FinancialRatio salesPerEmployee;
    @XmlElement(name = "TotalIntangibleAssets")
    protected FinancialRatio totalIntangibleAssets;
    @XmlElement(name = "TotalTangibleFixedAssets")
    protected FinancialRatio totalTangibleFixedAssets;
    @XmlElement(name = "FixedAssets")
    protected FinancialRatio fixedAssets;
    @XmlElement(name = "CurrentAssets")
    protected FinancialRatio currentAssets;
    @XmlElement(name = "TotalAssets")
    protected FinancialRatio totalAssets;
    @XmlElement(name = "CurrentLiabilities")
    protected FinancialRatio currentLiabilities;
    @XmlElement(name = "NetCurrentAssetsLiabilities")
    protected FinancialRatio netCurrentAssetsLiabilities;
    @XmlElement(name = "TotalAssetslessCurrentLiabilities")
    protected FinancialRatio totalAssetslessCurrentLiabilities;
    @XmlElement(name = "NetWorth")
    protected FinancialRatio netWorth;
    @XmlElement(name = "ShortTermLiabilities")
    protected FinancialRatio shortTermLiabilities;
    @XmlElement(name = "LongTermLiabilities")
    protected FinancialRatio longTermLiabilities;
    @XmlElement(name = "NetAssets")
    protected FinancialRatio netAssets;
    @XmlElement(name = "NetWorthToShareholdersFunds")
    protected FinancialRatio netWorthToShareholdersFunds;
    @XmlElement(name = "ProfitMargin")
    protected FinancialRatio profitMargin;
    @XmlElement(name = "ShareholdersReturn")
    protected FinancialRatio shareholdersReturn;
    @XmlElement(name = "ReturnOnCapital")
    protected FinancialRatio returnOnCapital;
    @XmlElement(name = "ReturnOnAssets")
    protected FinancialRatio returnOnAssets;
    @XmlElement(name = "NetSalesPerEmployee")
    protected FinancialRatio netSalesPerEmployee;
    @XmlElement(name = "RetainedProfitLossPerEmployee")
    protected FinancialRatio retainedProfitLossPerEmployee;
    @XmlElement(name = "AcidTestRatio")
    protected FinancialRatio acidTestRatio;
    @XmlElement(name = "CurrentRatio")
    protected FinancialRatio currentRatio;
    @XmlElement(name = "SolvencyRatio")
    protected FinancialRatio solvencyRatio;
    @XmlElement(name = "FixedAssetsToNetWorth")
    protected FinancialRatio fixedAssetsToNetWorth;
    @XmlElement(name = "CurrentLiabilitiesToNetWorth")
    protected FinancialRatio currentLiabilitiesToNetWorth;
    @XmlElement(name = "CurrentLiabilitiesToInventory")
    protected FinancialRatio currentLiabilitiesToInventory;
    @XmlElement(name = "NonCurrentAssetsToNetWorth")
    protected FinancialRatio nonCurrentAssetsToNetWorth;
    @XmlElement(name = "FixedAssetsToTotalAssets")
    protected FinancialRatio fixedAssetsToTotalAssets;
    @XmlElement(name = "TotalAssetsToNetSales")
    protected FinancialRatio totalAssetsToNetSales;
    @XmlElement(name = "TotalLiabilitiesToNetSales")
    protected FinancialRatio totalLiabilitiesToNetSales;
    @XmlElement(name = "TotalLiabilitiesToCostOfMaterials")
    protected FinancialRatio totalLiabilitiesToCostOfMaterials;
    @XmlElement(name = "NetSalesToNetCurrentAssets")
    protected FinancialRatio netSalesToNetCurrentAssets;
    @XmlElement(name = "RetainedProfitLossToNetSales")
    protected FinancialRatio retainedProfitLossToNetSales;
    @XmlElement(name = "FinancialExpensesToNetSales")
    protected FinancialRatio financialExpensesToNetSales;
    @XmlElement(name = "WorkingCapitalToNetSales")
    protected FinancialRatio workingCapitalToNetSales;
    @XmlElement(name = "StockTurnoverRate")
    protected FinancialRatio stockTurnoverRate;
    @XmlElement(name = "CollectionPeriodDays")
    protected FinancialRatio collectionPeriodDays;
    @XmlElement(name = "AssetTurnover")
    protected FinancialRatio assetTurnover;
    @XmlElement(name = "NetInterestReceived")
    protected FinancialRatio netInterestReceived;
    @XmlElement(name = "ShareholdersFunds")
    protected FinancialRatio shareholdersFunds;
    @XmlElement(name = "GrossPremiumsWritten")
    protected FinancialRatio grossPremiumsWritten;
    @XmlElement(name = "NetPremiumsEarned")
    protected FinancialRatio netPremiumsEarned;
    @XmlElement(name = "NetRevenueFromCapitalInvestments")
    protected FinancialRatio netRevenueFromCapitalInvestments;
    @XmlElement(name = "ClaimsPaid")
    protected FinancialRatio claimsPaid;
    @XmlElement(name = "UnderwritingExpenses")
    protected FinancialRatio underwritingExpenses;
    @XmlElement(name = "Investments")
    protected FinancialRatio investments;
    @XmlElement(name = "InsuranceReserves")
    protected FinancialRatio insuranceReserves;

    /**
     * Gets the value of the comparedFinancialStatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDate }
     *     
     */
    public DNBDate getComparedFinancialStatementDate() {
        return comparedFinancialStatementDate;
    }

    /**
     * Sets the value of the comparedFinancialStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDate }
     *     
     */
    public void setComparedFinancialStatementDate(DNBDate value) {
        this.comparedFinancialStatementDate = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTurnover(FinancialRatio value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the grossProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGrossProfitLoss() {
        return grossProfitLoss;
    }

    /**
     * Sets the value of the grossProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGrossProfitLoss(FinancialRatio value) {
        this.grossProfitLoss = value;
    }

    /**
     * Gets the value of the netOperatingProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetOperatingProfitLoss() {
        return netOperatingProfitLoss;
    }

    /**
     * Sets the value of the netOperatingProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetOperatingProfitLoss(FinancialRatio value) {
        this.netOperatingProfitLoss = value;
    }

    /**
     * Gets the value of the profitLossBeforeTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitLossBeforeTax() {
        return profitLossBeforeTax;
    }

    /**
     * Sets the value of the profitLossBeforeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitLossBeforeTax(FinancialRatio value) {
        this.profitLossBeforeTax = value;
    }

    /**
     * Gets the value of the profitLossAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitLossAfterTax() {
        return profitLossAfterTax;
    }

    /**
     * Sets the value of the profitLossAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitLossAfterTax(FinancialRatio value) {
        this.profitLossAfterTax = value;
    }

    /**
     * Gets the value of the netProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetProfitLoss() {
        return netProfitLoss;
    }

    /**
     * Sets the value of the netProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetProfitLoss(FinancialRatio value) {
        this.netProfitLoss = value;
    }

    /**
     * Gets the value of the employeesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getEmployeesQuantity() {
        return employeesQuantity;
    }

    /**
     * Sets the value of the employeesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setEmployeesQuantity(FinancialRatio value) {
        this.employeesQuantity = value;
    }

    /**
     * Gets the value of the profitLossPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitLossPerEmployee() {
        return profitLossPerEmployee;
    }

    /**
     * Sets the value of the profitLossPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitLossPerEmployee(FinancialRatio value) {
        this.profitLossPerEmployee = value;
    }

    /**
     * Gets the value of the salesPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getSalesPerEmployee() {
        return salesPerEmployee;
    }

    /**
     * Sets the value of the salesPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setSalesPerEmployee(FinancialRatio value) {
        this.salesPerEmployee = value;
    }

    /**
     * Gets the value of the totalIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalIntangibleAssets() {
        return totalIntangibleAssets;
    }

    /**
     * Sets the value of the totalIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalIntangibleAssets(FinancialRatio value) {
        this.totalIntangibleAssets = value;
    }

    /**
     * Gets the value of the totalTangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalTangibleFixedAssets() {
        return totalTangibleFixedAssets;
    }

    /**
     * Sets the value of the totalTangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalTangibleFixedAssets(FinancialRatio value) {
        this.totalTangibleFixedAssets = value;
    }

    /**
     * Gets the value of the fixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFixedAssets(FinancialRatio value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the currentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentAssets(FinancialRatio value) {
        this.currentAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalAssets(FinancialRatio value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the currentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentLiabilities() {
        return currentLiabilities;
    }

    /**
     * Sets the value of the currentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentLiabilities(FinancialRatio value) {
        this.currentLiabilities = value;
    }

    /**
     * Gets the value of the netCurrentAssetsLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetCurrentAssetsLiabilities() {
        return netCurrentAssetsLiabilities;
    }

    /**
     * Sets the value of the netCurrentAssetsLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetCurrentAssetsLiabilities(FinancialRatio value) {
        this.netCurrentAssetsLiabilities = value;
    }

    /**
     * Gets the value of the totalAssetslessCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalAssetslessCurrentLiabilities() {
        return totalAssetslessCurrentLiabilities;
    }

    /**
     * Sets the value of the totalAssetslessCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalAssetslessCurrentLiabilities(FinancialRatio value) {
        this.totalAssetslessCurrentLiabilities = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetWorth(FinancialRatio value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the shortTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getShortTermLiabilities() {
        return shortTermLiabilities;
    }

    /**
     * Sets the value of the shortTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setShortTermLiabilities(FinancialRatio value) {
        this.shortTermLiabilities = value;
    }

    /**
     * Gets the value of the longTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLongTermLiabilities() {
        return longTermLiabilities;
    }

    /**
     * Sets the value of the longTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLongTermLiabilities(FinancialRatio value) {
        this.longTermLiabilities = value;
    }

    /**
     * Gets the value of the netAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetAssets() {
        return netAssets;
    }

    /**
     * Sets the value of the netAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetAssets(FinancialRatio value) {
        this.netAssets = value;
    }

    /**
     * Gets the value of the netWorthToShareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetWorthToShareholdersFunds() {
        return netWorthToShareholdersFunds;
    }

    /**
     * Sets the value of the netWorthToShareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetWorthToShareholdersFunds(FinancialRatio value) {
        this.netWorthToShareholdersFunds = value;
    }

    /**
     * Gets the value of the profitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitMargin() {
        return profitMargin;
    }

    /**
     * Sets the value of the profitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitMargin(FinancialRatio value) {
        this.profitMargin = value;
    }

    /**
     * Gets the value of the shareholdersReturn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getShareholdersReturn() {
        return shareholdersReturn;
    }

    /**
     * Sets the value of the shareholdersReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setShareholdersReturn(FinancialRatio value) {
        this.shareholdersReturn = value;
    }

    /**
     * Gets the value of the returnOnCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnCapital() {
        return returnOnCapital;
    }

    /**
     * Sets the value of the returnOnCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnCapital(FinancialRatio value) {
        this.returnOnCapital = value;
    }

    /**
     * Gets the value of the returnOnAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnAssets() {
        return returnOnAssets;
    }

    /**
     * Sets the value of the returnOnAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnAssets(FinancialRatio value) {
        this.returnOnAssets = value;
    }

    /**
     * Gets the value of the netSalesPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetSalesPerEmployee() {
        return netSalesPerEmployee;
    }

    /**
     * Sets the value of the netSalesPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetSalesPerEmployee(FinancialRatio value) {
        this.netSalesPerEmployee = value;
    }

    /**
     * Gets the value of the retainedProfitLossPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getRetainedProfitLossPerEmployee() {
        return retainedProfitLossPerEmployee;
    }

    /**
     * Sets the value of the retainedProfitLossPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setRetainedProfitLossPerEmployee(FinancialRatio value) {
        this.retainedProfitLossPerEmployee = value;
    }

    /**
     * Gets the value of the acidTestRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getAcidTestRatio() {
        return acidTestRatio;
    }

    /**
     * Sets the value of the acidTestRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setAcidTestRatio(FinancialRatio value) {
        this.acidTestRatio = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentRatio(FinancialRatio value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the solvencyRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getSolvencyRatio() {
        return solvencyRatio;
    }

    /**
     * Sets the value of the solvencyRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setSolvencyRatio(FinancialRatio value) {
        this.solvencyRatio = value;
    }

    /**
     * Gets the value of the fixedAssetsToNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFixedAssetsToNetWorth() {
        return fixedAssetsToNetWorth;
    }

    /**
     * Sets the value of the fixedAssetsToNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFixedAssetsToNetWorth(FinancialRatio value) {
        this.fixedAssetsToNetWorth = value;
    }

    /**
     * Gets the value of the currentLiabilitiesToNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentLiabilitiesToNetWorth() {
        return currentLiabilitiesToNetWorth;
    }

    /**
     * Sets the value of the currentLiabilitiesToNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentLiabilitiesToNetWorth(FinancialRatio value) {
        this.currentLiabilitiesToNetWorth = value;
    }

    /**
     * Gets the value of the currentLiabilitiesToInventory property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentLiabilitiesToInventory() {
        return currentLiabilitiesToInventory;
    }

    /**
     * Sets the value of the currentLiabilitiesToInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentLiabilitiesToInventory(FinancialRatio value) {
        this.currentLiabilitiesToInventory = value;
    }

    /**
     * Gets the value of the nonCurrentAssetsToNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNonCurrentAssetsToNetWorth() {
        return nonCurrentAssetsToNetWorth;
    }

    /**
     * Sets the value of the nonCurrentAssetsToNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNonCurrentAssetsToNetWorth(FinancialRatio value) {
        this.nonCurrentAssetsToNetWorth = value;
    }

    /**
     * Gets the value of the fixedAssetsToTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFixedAssetsToTotalAssets() {
        return fixedAssetsToTotalAssets;
    }

    /**
     * Sets the value of the fixedAssetsToTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFixedAssetsToTotalAssets(FinancialRatio value) {
        this.fixedAssetsToTotalAssets = value;
    }

    /**
     * Gets the value of the totalAssetsToNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalAssetsToNetSales() {
        return totalAssetsToNetSales;
    }

    /**
     * Sets the value of the totalAssetsToNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalAssetsToNetSales(FinancialRatio value) {
        this.totalAssetsToNetSales = value;
    }

    /**
     * Gets the value of the totalLiabilitiesToNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalLiabilitiesToNetSales() {
        return totalLiabilitiesToNetSales;
    }

    /**
     * Sets the value of the totalLiabilitiesToNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalLiabilitiesToNetSales(FinancialRatio value) {
        this.totalLiabilitiesToNetSales = value;
    }

    /**
     * Gets the value of the totalLiabilitiesToCostOfMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalLiabilitiesToCostOfMaterials() {
        return totalLiabilitiesToCostOfMaterials;
    }

    /**
     * Sets the value of the totalLiabilitiesToCostOfMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalLiabilitiesToCostOfMaterials(FinancialRatio value) {
        this.totalLiabilitiesToCostOfMaterials = value;
    }

    /**
     * Gets the value of the netSalesToNetCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetSalesToNetCurrentAssets() {
        return netSalesToNetCurrentAssets;
    }

    /**
     * Sets the value of the netSalesToNetCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetSalesToNetCurrentAssets(FinancialRatio value) {
        this.netSalesToNetCurrentAssets = value;
    }

    /**
     * Gets the value of the retainedProfitLossToNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getRetainedProfitLossToNetSales() {
        return retainedProfitLossToNetSales;
    }

    /**
     * Sets the value of the retainedProfitLossToNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setRetainedProfitLossToNetSales(FinancialRatio value) {
        this.retainedProfitLossToNetSales = value;
    }

    /**
     * Gets the value of the financialExpensesToNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFinancialExpensesToNetSales() {
        return financialExpensesToNetSales;
    }

    /**
     * Sets the value of the financialExpensesToNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFinancialExpensesToNetSales(FinancialRatio value) {
        this.financialExpensesToNetSales = value;
    }

    /**
     * Gets the value of the workingCapitalToNetSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getWorkingCapitalToNetSales() {
        return workingCapitalToNetSales;
    }

    /**
     * Sets the value of the workingCapitalToNetSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setWorkingCapitalToNetSales(FinancialRatio value) {
        this.workingCapitalToNetSales = value;
    }

    /**
     * Gets the value of the stockTurnoverRate property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getStockTurnoverRate() {
        return stockTurnoverRate;
    }

    /**
     * Sets the value of the stockTurnoverRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setStockTurnoverRate(FinancialRatio value) {
        this.stockTurnoverRate = value;
    }

    /**
     * Gets the value of the collectionPeriodDays property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCollectionPeriodDays() {
        return collectionPeriodDays;
    }

    /**
     * Sets the value of the collectionPeriodDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCollectionPeriodDays(FinancialRatio value) {
        this.collectionPeriodDays = value;
    }

    /**
     * Gets the value of the assetTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getAssetTurnover() {
        return assetTurnover;
    }

    /**
     * Sets the value of the assetTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setAssetTurnover(FinancialRatio value) {
        this.assetTurnover = value;
    }

    /**
     * Gets the value of the netInterestReceived property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetInterestReceived() {
        return netInterestReceived;
    }

    /**
     * Sets the value of the netInterestReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetInterestReceived(FinancialRatio value) {
        this.netInterestReceived = value;
    }

    /**
     * Gets the value of the shareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getShareholdersFunds() {
        return shareholdersFunds;
    }

    /**
     * Sets the value of the shareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setShareholdersFunds(FinancialRatio value) {
        this.shareholdersFunds = value;
    }

    /**
     * Gets the value of the grossPremiumsWritten property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGrossPremiumsWritten() {
        return grossPremiumsWritten;
    }

    /**
     * Sets the value of the grossPremiumsWritten property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGrossPremiumsWritten(FinancialRatio value) {
        this.grossPremiumsWritten = value;
    }

    /**
     * Gets the value of the netPremiumsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetPremiumsEarned() {
        return netPremiumsEarned;
    }

    /**
     * Sets the value of the netPremiumsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetPremiumsEarned(FinancialRatio value) {
        this.netPremiumsEarned = value;
    }

    /**
     * Gets the value of the netRevenueFromCapitalInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetRevenueFromCapitalInvestments() {
        return netRevenueFromCapitalInvestments;
    }

    /**
     * Sets the value of the netRevenueFromCapitalInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetRevenueFromCapitalInvestments(FinancialRatio value) {
        this.netRevenueFromCapitalInvestments = value;
    }

    /**
     * Gets the value of the claimsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getClaimsPaid() {
        return claimsPaid;
    }

    /**
     * Sets the value of the claimsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setClaimsPaid(FinancialRatio value) {
        this.claimsPaid = value;
    }

    /**
     * Gets the value of the underwritingExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getUnderwritingExpenses() {
        return underwritingExpenses;
    }

    /**
     * Sets the value of the underwritingExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setUnderwritingExpenses(FinancialRatio value) {
        this.underwritingExpenses = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInvestments(FinancialRatio value) {
        this.investments = value;
    }

    /**
     * Gets the value of the insuranceReserves property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInsuranceReserves() {
        return insuranceReserves;
    }

    /**
     * Sets the value of the insuranceReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInsuranceReserves(FinancialRatio value) {
        this.insuranceReserves = value;
    }

}
