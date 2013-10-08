
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyFinancialRatios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyFinancialRatios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcidTestRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AssetsToSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AssetsToTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AverageWagePerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="BaseEquity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CapitalPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ChangeinLabourCostsOnTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ClaimsRate" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CollectionPeriodDays" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CommissionsMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ConsumptionMaterials" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CreditorsToSalesDays" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentAssetsTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesToInventory" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CurrentRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CustomerFunds" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="CustomerFundsPosition" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="DaysCreditToCustomers" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="DegreeOfIndebtedness" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="DepreciationDevaluationOnCosts" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="DynamicDebtEquity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="EBITInterestCoverage" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="EquityCapital" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="EquityRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FinancialExpensesOverSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsCover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsToTotalAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="FixedAssetsToTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GearingRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GeneralExpensesOnCost" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GrossEarningsMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GrossIncomeToEquityRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="GrossSaleMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InterBankPosition" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InterestCharged" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InterestMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InterestOnDeposits" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InventoriesToTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="InvestedCapitalTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LabourCostPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LabourCostsOnCosts" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidCashResources1" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidityRatio1" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidityRatio2" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidityRatio3" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidityRatioAssetsA" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LiquidityRatioAssetsB" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="LossReserveinTechnicalReserves" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="MOLRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetAssetsCover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetPremium" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetProfitMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetSalesMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NetSalesToCurrentAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NonCurrentAssetsOverNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NonCurrentAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="NonOperatingToOperatingIncome" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="OperatingValueAddedOnSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="OperatingValueAddedPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="OperativeCashFlow" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="PayrollOverValueAdded" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="PersonnelCostsMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitMargin" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitMarginAfterTax" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReservesRefundPremiuminTechnicalReserves" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="RetentionRate" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapital" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnCashFlow" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnEquity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnEquityAfterTax" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnInvestment" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ReturnOnValueAdded" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="RevenuesVariations" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SalesPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SalesToNetWorkingCapital" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SavingsDeposits" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShareholdersReturn" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShortTermBanksOnCurrentAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="ShortTermIndebtednessIntensity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="SolvencyRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="StockTurnoverRatio" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TechnicalReservesEquityCapitalinNetPremium" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TechnicalReservesinBalanceSheetTotal" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesToSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesOverCostSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TotalSurplus" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TradeLiabilitiesToMaterial" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TradeReceivablesToTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmployee" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="VariationsinProductionCosts" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="VariationsinShareholdersEquity" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="VariationsinTotalAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="WarehouseTurnover" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="WorkingCapitalToNetSales" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="TurnoverToAssets" type="{http://gateway.dnb.com/getProduct}FinancialRatio" minOccurs="0"/>
 *         &lt;element name="AdditionalDetails" type="{http://gateway.dnb.com/getProduct}AdditionalDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyFinancialRatios", propOrder = {
    "acidTestRatio",
    "assetsToSales",
    "assetsToTurnover",
    "averageWagePerEmployee",
    "baseEquity",
    "capitalPerEmployee",
    "changeinLabourCostsOnTurnover",
    "claimsRate",
    "collectionPeriodDays",
    "commissionsMargin",
    "consumptionMaterials",
    "creditorsToSalesDays",
    "currentAssetsTurnover",
    "currentLiabilitiesToInventory",
    "currentLiabilitiesToNetWorth",
    "currentRatio",
    "customerFunds",
    "customerFundsPosition",
    "daysCreditToCustomers",
    "degreeOfIndebtedness",
    "depreciationDevaluationOnCosts",
    "dynamicDebtEquity",
    "ebitInterestCoverage",
    "equityCapital",
    "equityRatio",
    "financialExpensesOverSales",
    "fixedAssetsCover",
    "fixedAssetsToNetWorth",
    "fixedAssetsToTotalAssets",
    "fixedAssetsToTurnover",
    "gearingRatio",
    "generalExpensesOnCost",
    "grossEarningsMargin",
    "grossIncomeToEquityRatio",
    "grossSaleMargin",
    "interBankPosition",
    "interestCharged",
    "interestMargin",
    "interestOnDeposits",
    "inventoriesToTurnover",
    "investedCapitalTurnover",
    "labourCostPerEmployee",
    "labourCostsOnCosts",
    "liquidCashResources1",
    "liquidityRatio1",
    "liquidityRatio2",
    "liquidityRatio3",
    "liquidityRatioAssetsA",
    "liquidityRatioAssetsB",
    "lossReserveinTechnicalReserves",
    "molRatio",
    "netAssetsCover",
    "netPremium",
    "netProfitMargin",
    "netSalesMargin",
    "netSalesToCurrentAssets",
    "nonCurrentAssetsOverNetWorth",
    "nonCurrentAssetsToNetWorth",
    "nonOperatingToOperatingIncome",
    "operatingValueAddedOnSales",
    "operatingValueAddedPerEmployee",
    "operativeCashFlow",
    "payrollOverValueAdded",
    "personnelCostsMargin",
    "profitMargin",
    "profitMarginAfterTax",
    "profitPerEmployee",
    "reservesRefundPremiuminTechnicalReserves",
    "retentionRate",
    "returnOnAssets",
    "returnOnCapital",
    "returnOnCashFlow",
    "returnOnEquity",
    "returnOnEquityAfterTax",
    "returnOnInvestment",
    "returnOnSales",
    "returnOnValueAdded",
    "revenuesVariations",
    "salesPerEmployee",
    "salesToNetWorkingCapital",
    "savingsDeposits",
    "shareholdersReturn",
    "shortTermBanksOnCurrentAssets",
    "shortTermIndebtednessIntensity",
    "solvencyRatio",
    "stockTurnoverRatio",
    "technicalReservesEquityCapitalinNetPremium",
    "technicalReservesinBalanceSheetTotal",
    "totalLiabilitiesToSales",
    "totalLiabilitiesOverCostSales",
    "totalSurplus",
    "tradeLiabilitiesToMaterial",
    "tradeReceivablesToTurnover",
    "turnoverPerEmployee",
    "variationsinProductionCosts",
    "variationsinShareholdersEquity",
    "variationsinTotalAssets",
    "warehouseTurnover",
    "workingCapitalToNetSales",
    "turnoverToAssets",
    "additionalDetails"
})
public class KeyFinancialRatios {

    @XmlElement(name = "AcidTestRatio")
    protected FinancialRatio acidTestRatio;
    @XmlElement(name = "AssetsToSales")
    protected FinancialRatio assetsToSales;
    @XmlElement(name = "AssetsToTurnover")
    protected FinancialRatio assetsToTurnover;
    @XmlElement(name = "AverageWagePerEmployee")
    protected FinancialRatio averageWagePerEmployee;
    @XmlElement(name = "BaseEquity")
    protected FinancialRatio baseEquity;
    @XmlElement(name = "CapitalPerEmployee")
    protected FinancialRatio capitalPerEmployee;
    @XmlElement(name = "ChangeinLabourCostsOnTurnover")
    protected FinancialRatio changeinLabourCostsOnTurnover;
    @XmlElement(name = "ClaimsRate")
    protected FinancialRatio claimsRate;
    @XmlElement(name = "CollectionPeriodDays")
    protected FinancialRatio collectionPeriodDays;
    @XmlElement(name = "CommissionsMargin")
    protected FinancialRatio commissionsMargin;
    @XmlElement(name = "ConsumptionMaterials")
    protected FinancialRatio consumptionMaterials;
    @XmlElement(name = "CreditorsToSalesDays")
    protected FinancialRatio creditorsToSalesDays;
    @XmlElement(name = "CurrentAssetsTurnover")
    protected FinancialRatio currentAssetsTurnover;
    @XmlElement(name = "CurrentLiabilitiesToInventory")
    protected FinancialRatio currentLiabilitiesToInventory;
    @XmlElement(name = "CurrentLiabilitiesToNetWorth")
    protected FinancialRatio currentLiabilitiesToNetWorth;
    @XmlElement(name = "CurrentRatio")
    protected FinancialRatio currentRatio;
    @XmlElement(name = "CustomerFunds")
    protected FinancialRatio customerFunds;
    @XmlElement(name = "CustomerFundsPosition")
    protected FinancialRatio customerFundsPosition;
    @XmlElement(name = "DaysCreditToCustomers")
    protected FinancialRatio daysCreditToCustomers;
    @XmlElement(name = "DegreeOfIndebtedness")
    protected FinancialRatio degreeOfIndebtedness;
    @XmlElement(name = "DepreciationDevaluationOnCosts")
    protected FinancialRatio depreciationDevaluationOnCosts;
    @XmlElement(name = "DynamicDebtEquity")
    protected FinancialRatio dynamicDebtEquity;
    @XmlElement(name = "EBITInterestCoverage")
    protected FinancialRatio ebitInterestCoverage;
    @XmlElement(name = "EquityCapital")
    protected FinancialRatio equityCapital;
    @XmlElement(name = "EquityRatio")
    protected FinancialRatio equityRatio;
    @XmlElement(name = "FinancialExpensesOverSales")
    protected FinancialRatio financialExpensesOverSales;
    @XmlElement(name = "FixedAssetsCover")
    protected FinancialRatio fixedAssetsCover;
    @XmlElement(name = "FixedAssetsToNetWorth")
    protected FinancialRatio fixedAssetsToNetWorth;
    @XmlElement(name = "FixedAssetsToTotalAssets")
    protected FinancialRatio fixedAssetsToTotalAssets;
    @XmlElement(name = "FixedAssetsToTurnover")
    protected FinancialRatio fixedAssetsToTurnover;
    @XmlElement(name = "GearingRatio")
    protected FinancialRatio gearingRatio;
    @XmlElement(name = "GeneralExpensesOnCost")
    protected FinancialRatio generalExpensesOnCost;
    @XmlElement(name = "GrossEarningsMargin")
    protected FinancialRatio grossEarningsMargin;
    @XmlElement(name = "GrossIncomeToEquityRatio")
    protected FinancialRatio grossIncomeToEquityRatio;
    @XmlElement(name = "GrossSaleMargin")
    protected FinancialRatio grossSaleMargin;
    @XmlElement(name = "InterBankPosition")
    protected FinancialRatio interBankPosition;
    @XmlElement(name = "InterestCharged")
    protected FinancialRatio interestCharged;
    @XmlElement(name = "InterestMargin")
    protected FinancialRatio interestMargin;
    @XmlElement(name = "InterestOnDeposits")
    protected FinancialRatio interestOnDeposits;
    @XmlElement(name = "InventoriesToTurnover")
    protected FinancialRatio inventoriesToTurnover;
    @XmlElement(name = "InvestedCapitalTurnover")
    protected FinancialRatio investedCapitalTurnover;
    @XmlElement(name = "LabourCostPerEmployee")
    protected FinancialRatio labourCostPerEmployee;
    @XmlElement(name = "LabourCostsOnCosts")
    protected FinancialRatio labourCostsOnCosts;
    @XmlElement(name = "LiquidCashResources1")
    protected FinancialRatio liquidCashResources1;
    @XmlElement(name = "LiquidityRatio1")
    protected FinancialRatio liquidityRatio1;
    @XmlElement(name = "LiquidityRatio2")
    protected FinancialRatio liquidityRatio2;
    @XmlElement(name = "LiquidityRatio3")
    protected FinancialRatio liquidityRatio3;
    @XmlElement(name = "LiquidityRatioAssetsA")
    protected FinancialRatio liquidityRatioAssetsA;
    @XmlElement(name = "LiquidityRatioAssetsB")
    protected FinancialRatio liquidityRatioAssetsB;
    @XmlElement(name = "LossReserveinTechnicalReserves")
    protected FinancialRatio lossReserveinTechnicalReserves;
    @XmlElement(name = "MOLRatio")
    protected FinancialRatio molRatio;
    @XmlElement(name = "NetAssetsCover")
    protected FinancialRatio netAssetsCover;
    @XmlElement(name = "NetPremium")
    protected FinancialRatio netPremium;
    @XmlElement(name = "NetProfitMargin")
    protected FinancialRatio netProfitMargin;
    @XmlElement(name = "NetSalesMargin")
    protected FinancialRatio netSalesMargin;
    @XmlElement(name = "NetSalesToCurrentAssets")
    protected FinancialRatio netSalesToCurrentAssets;
    @XmlElement(name = "NonCurrentAssetsOverNetWorth")
    protected FinancialRatio nonCurrentAssetsOverNetWorth;
    @XmlElement(name = "NonCurrentAssetsToNetWorth")
    protected FinancialRatio nonCurrentAssetsToNetWorth;
    @XmlElement(name = "NonOperatingToOperatingIncome")
    protected FinancialRatio nonOperatingToOperatingIncome;
    @XmlElement(name = "OperatingValueAddedOnSales")
    protected FinancialRatio operatingValueAddedOnSales;
    @XmlElement(name = "OperatingValueAddedPerEmployee")
    protected FinancialRatio operatingValueAddedPerEmployee;
    @XmlElement(name = "OperativeCashFlow")
    protected FinancialRatio operativeCashFlow;
    @XmlElement(name = "PayrollOverValueAdded")
    protected FinancialRatio payrollOverValueAdded;
    @XmlElement(name = "PersonnelCostsMargin")
    protected FinancialRatio personnelCostsMargin;
    @XmlElement(name = "ProfitMargin")
    protected FinancialRatio profitMargin;
    @XmlElement(name = "ProfitMarginAfterTax")
    protected FinancialRatio profitMarginAfterTax;
    @XmlElement(name = "ProfitPerEmployee")
    protected FinancialRatio profitPerEmployee;
    @XmlElement(name = "ReservesRefundPremiuminTechnicalReserves")
    protected FinancialRatio reservesRefundPremiuminTechnicalReserves;
    @XmlElement(name = "RetentionRate")
    protected FinancialRatio retentionRate;
    @XmlElement(name = "ReturnOnAssets")
    protected FinancialRatio returnOnAssets;
    @XmlElement(name = "ReturnOnCapital")
    protected FinancialRatio returnOnCapital;
    @XmlElement(name = "ReturnOnCashFlow")
    protected FinancialRatio returnOnCashFlow;
    @XmlElement(name = "ReturnOnEquity")
    protected FinancialRatio returnOnEquity;
    @XmlElement(name = "ReturnOnEquityAfterTax")
    protected FinancialRatio returnOnEquityAfterTax;
    @XmlElement(name = "ReturnOnInvestment")
    protected FinancialRatio returnOnInvestment;
    @XmlElement(name = "ReturnOnSales")
    protected FinancialRatio returnOnSales;
    @XmlElement(name = "ReturnOnValueAdded")
    protected FinancialRatio returnOnValueAdded;
    @XmlElement(name = "RevenuesVariations")
    protected FinancialRatio revenuesVariations;
    @XmlElement(name = "SalesPerEmployee")
    protected FinancialRatio salesPerEmployee;
    @XmlElement(name = "SalesToNetWorkingCapital")
    protected FinancialRatio salesToNetWorkingCapital;
    @XmlElement(name = "SavingsDeposits")
    protected FinancialRatio savingsDeposits;
    @XmlElement(name = "ShareholdersReturn")
    protected FinancialRatio shareholdersReturn;
    @XmlElement(name = "ShortTermBanksOnCurrentAssets")
    protected FinancialRatio shortTermBanksOnCurrentAssets;
    @XmlElement(name = "ShortTermIndebtednessIntensity")
    protected FinancialRatio shortTermIndebtednessIntensity;
    @XmlElement(name = "SolvencyRatio")
    protected FinancialRatio solvencyRatio;
    @XmlElement(name = "StockTurnoverRatio")
    protected FinancialRatio stockTurnoverRatio;
    @XmlElement(name = "TechnicalReservesEquityCapitalinNetPremium")
    protected FinancialRatio technicalReservesEquityCapitalinNetPremium;
    @XmlElement(name = "TechnicalReservesinBalanceSheetTotal")
    protected FinancialRatio technicalReservesinBalanceSheetTotal;
    @XmlElement(name = "TotalLiabilitiesToSales")
    protected FinancialRatio totalLiabilitiesToSales;
    @XmlElement(name = "TotalLiabilitiesOverCostSales")
    protected FinancialRatio totalLiabilitiesOverCostSales;
    @XmlElement(name = "TotalSurplus")
    protected FinancialRatio totalSurplus;
    @XmlElement(name = "TradeLiabilitiesToMaterial")
    protected FinancialRatio tradeLiabilitiesToMaterial;
    @XmlElement(name = "TradeReceivablesToTurnover")
    protected FinancialRatio tradeReceivablesToTurnover;
    @XmlElement(name = "TurnoverPerEmployee")
    protected FinancialRatio turnoverPerEmployee;
    @XmlElement(name = "VariationsinProductionCosts")
    protected FinancialRatio variationsinProductionCosts;
    @XmlElement(name = "VariationsinShareholdersEquity")
    protected FinancialRatio variationsinShareholdersEquity;
    @XmlElement(name = "VariationsinTotalAssets")
    protected FinancialRatio variationsinTotalAssets;
    @XmlElement(name = "WarehouseTurnover")
    protected FinancialRatio warehouseTurnover;
    @XmlElement(name = "WorkingCapitalToNetSales")
    protected FinancialRatio workingCapitalToNetSales;
    @XmlElement(name = "TurnoverToAssets")
    protected FinancialRatio turnoverToAssets;
    @XmlElement(name = "AdditionalDetails")
    protected AdditionalDetailsType additionalDetails;

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
     * Gets the value of the assetsToSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getAssetsToSales() {
        return assetsToSales;
    }

    /**
     * Sets the value of the assetsToSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setAssetsToSales(FinancialRatio value) {
        this.assetsToSales = value;
    }

    /**
     * Gets the value of the assetsToTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getAssetsToTurnover() {
        return assetsToTurnover;
    }

    /**
     * Sets the value of the assetsToTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setAssetsToTurnover(FinancialRatio value) {
        this.assetsToTurnover = value;
    }

    /**
     * Gets the value of the averageWagePerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getAverageWagePerEmployee() {
        return averageWagePerEmployee;
    }

    /**
     * Sets the value of the averageWagePerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setAverageWagePerEmployee(FinancialRatio value) {
        this.averageWagePerEmployee = value;
    }

    /**
     * Gets the value of the baseEquity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getBaseEquity() {
        return baseEquity;
    }

    /**
     * Sets the value of the baseEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setBaseEquity(FinancialRatio value) {
        this.baseEquity = value;
    }

    /**
     * Gets the value of the capitalPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCapitalPerEmployee() {
        return capitalPerEmployee;
    }

    /**
     * Sets the value of the capitalPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCapitalPerEmployee(FinancialRatio value) {
        this.capitalPerEmployee = value;
    }

    /**
     * Gets the value of the changeinLabourCostsOnTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getChangeinLabourCostsOnTurnover() {
        return changeinLabourCostsOnTurnover;
    }

    /**
     * Sets the value of the changeinLabourCostsOnTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setChangeinLabourCostsOnTurnover(FinancialRatio value) {
        this.changeinLabourCostsOnTurnover = value;
    }

    /**
     * Gets the value of the claimsRate property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getClaimsRate() {
        return claimsRate;
    }

    /**
     * Sets the value of the claimsRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setClaimsRate(FinancialRatio value) {
        this.claimsRate = value;
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
     * Gets the value of the commissionsMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCommissionsMargin() {
        return commissionsMargin;
    }

    /**
     * Sets the value of the commissionsMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCommissionsMargin(FinancialRatio value) {
        this.commissionsMargin = value;
    }

    /**
     * Gets the value of the consumptionMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getConsumptionMaterials() {
        return consumptionMaterials;
    }

    /**
     * Sets the value of the consumptionMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setConsumptionMaterials(FinancialRatio value) {
        this.consumptionMaterials = value;
    }

    /**
     * Gets the value of the creditorsToSalesDays property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCreditorsToSalesDays() {
        return creditorsToSalesDays;
    }

    /**
     * Sets the value of the creditorsToSalesDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCreditorsToSalesDays(FinancialRatio value) {
        this.creditorsToSalesDays = value;
    }

    /**
     * Gets the value of the currentAssetsTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCurrentAssetsTurnover() {
        return currentAssetsTurnover;
    }

    /**
     * Sets the value of the currentAssetsTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCurrentAssetsTurnover(FinancialRatio value) {
        this.currentAssetsTurnover = value;
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
     * Gets the value of the customerFunds property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCustomerFunds() {
        return customerFunds;
    }

    /**
     * Sets the value of the customerFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCustomerFunds(FinancialRatio value) {
        this.customerFunds = value;
    }

    /**
     * Gets the value of the customerFundsPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getCustomerFundsPosition() {
        return customerFundsPosition;
    }

    /**
     * Sets the value of the customerFundsPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setCustomerFundsPosition(FinancialRatio value) {
        this.customerFundsPosition = value;
    }

    /**
     * Gets the value of the daysCreditToCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getDaysCreditToCustomers() {
        return daysCreditToCustomers;
    }

    /**
     * Sets the value of the daysCreditToCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setDaysCreditToCustomers(FinancialRatio value) {
        this.daysCreditToCustomers = value;
    }

    /**
     * Gets the value of the degreeOfIndebtedness property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getDegreeOfIndebtedness() {
        return degreeOfIndebtedness;
    }

    /**
     * Sets the value of the degreeOfIndebtedness property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setDegreeOfIndebtedness(FinancialRatio value) {
        this.degreeOfIndebtedness = value;
    }

    /**
     * Gets the value of the depreciationDevaluationOnCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getDepreciationDevaluationOnCosts() {
        return depreciationDevaluationOnCosts;
    }

    /**
     * Sets the value of the depreciationDevaluationOnCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setDepreciationDevaluationOnCosts(FinancialRatio value) {
        this.depreciationDevaluationOnCosts = value;
    }

    /**
     * Gets the value of the dynamicDebtEquity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getDynamicDebtEquity() {
        return dynamicDebtEquity;
    }

    /**
     * Sets the value of the dynamicDebtEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setDynamicDebtEquity(FinancialRatio value) {
        this.dynamicDebtEquity = value;
    }

    /**
     * Gets the value of the ebitInterestCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getEBITInterestCoverage() {
        return ebitInterestCoverage;
    }

    /**
     * Sets the value of the ebitInterestCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setEBITInterestCoverage(FinancialRatio value) {
        this.ebitInterestCoverage = value;
    }

    /**
     * Gets the value of the equityCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getEquityCapital() {
        return equityCapital;
    }

    /**
     * Sets the value of the equityCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setEquityCapital(FinancialRatio value) {
        this.equityCapital = value;
    }

    /**
     * Gets the value of the equityRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getEquityRatio() {
        return equityRatio;
    }

    /**
     * Sets the value of the equityRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setEquityRatio(FinancialRatio value) {
        this.equityRatio = value;
    }

    /**
     * Gets the value of the financialExpensesOverSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFinancialExpensesOverSales() {
        return financialExpensesOverSales;
    }

    /**
     * Sets the value of the financialExpensesOverSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFinancialExpensesOverSales(FinancialRatio value) {
        this.financialExpensesOverSales = value;
    }

    /**
     * Gets the value of the fixedAssetsCover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFixedAssetsCover() {
        return fixedAssetsCover;
    }

    /**
     * Sets the value of the fixedAssetsCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFixedAssetsCover(FinancialRatio value) {
        this.fixedAssetsCover = value;
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
     * Gets the value of the fixedAssetsToTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getFixedAssetsToTurnover() {
        return fixedAssetsToTurnover;
    }

    /**
     * Sets the value of the fixedAssetsToTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setFixedAssetsToTurnover(FinancialRatio value) {
        this.fixedAssetsToTurnover = value;
    }

    /**
     * Gets the value of the gearingRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGearingRatio() {
        return gearingRatio;
    }

    /**
     * Sets the value of the gearingRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGearingRatio(FinancialRatio value) {
        this.gearingRatio = value;
    }

    /**
     * Gets the value of the generalExpensesOnCost property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGeneralExpensesOnCost() {
        return generalExpensesOnCost;
    }

    /**
     * Sets the value of the generalExpensesOnCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGeneralExpensesOnCost(FinancialRatio value) {
        this.generalExpensesOnCost = value;
    }

    /**
     * Gets the value of the grossEarningsMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGrossEarningsMargin() {
        return grossEarningsMargin;
    }

    /**
     * Sets the value of the grossEarningsMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGrossEarningsMargin(FinancialRatio value) {
        this.grossEarningsMargin = value;
    }

    /**
     * Gets the value of the grossIncomeToEquityRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGrossIncomeToEquityRatio() {
        return grossIncomeToEquityRatio;
    }

    /**
     * Sets the value of the grossIncomeToEquityRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGrossIncomeToEquityRatio(FinancialRatio value) {
        this.grossIncomeToEquityRatio = value;
    }

    /**
     * Gets the value of the grossSaleMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getGrossSaleMargin() {
        return grossSaleMargin;
    }

    /**
     * Sets the value of the grossSaleMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setGrossSaleMargin(FinancialRatio value) {
        this.grossSaleMargin = value;
    }

    /**
     * Gets the value of the interBankPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInterBankPosition() {
        return interBankPosition;
    }

    /**
     * Sets the value of the interBankPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInterBankPosition(FinancialRatio value) {
        this.interBankPosition = value;
    }

    /**
     * Gets the value of the interestCharged property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInterestCharged() {
        return interestCharged;
    }

    /**
     * Sets the value of the interestCharged property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInterestCharged(FinancialRatio value) {
        this.interestCharged = value;
    }

    /**
     * Gets the value of the interestMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInterestMargin() {
        return interestMargin;
    }

    /**
     * Sets the value of the interestMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInterestMargin(FinancialRatio value) {
        this.interestMargin = value;
    }

    /**
     * Gets the value of the interestOnDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInterestOnDeposits() {
        return interestOnDeposits;
    }

    /**
     * Sets the value of the interestOnDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInterestOnDeposits(FinancialRatio value) {
        this.interestOnDeposits = value;
    }

    /**
     * Gets the value of the inventoriesToTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInventoriesToTurnover() {
        return inventoriesToTurnover;
    }

    /**
     * Sets the value of the inventoriesToTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInventoriesToTurnover(FinancialRatio value) {
        this.inventoriesToTurnover = value;
    }

    /**
     * Gets the value of the investedCapitalTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getInvestedCapitalTurnover() {
        return investedCapitalTurnover;
    }

    /**
     * Sets the value of the investedCapitalTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setInvestedCapitalTurnover(FinancialRatio value) {
        this.investedCapitalTurnover = value;
    }

    /**
     * Gets the value of the labourCostPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLabourCostPerEmployee() {
        return labourCostPerEmployee;
    }

    /**
     * Sets the value of the labourCostPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLabourCostPerEmployee(FinancialRatio value) {
        this.labourCostPerEmployee = value;
    }

    /**
     * Gets the value of the labourCostsOnCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLabourCostsOnCosts() {
        return labourCostsOnCosts;
    }

    /**
     * Sets the value of the labourCostsOnCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLabourCostsOnCosts(FinancialRatio value) {
        this.labourCostsOnCosts = value;
    }

    /**
     * Gets the value of the liquidCashResources1 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidCashResources1() {
        return liquidCashResources1;
    }

    /**
     * Sets the value of the liquidCashResources1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidCashResources1(FinancialRatio value) {
        this.liquidCashResources1 = value;
    }

    /**
     * Gets the value of the liquidityRatio1 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidityRatio1() {
        return liquidityRatio1;
    }

    /**
     * Sets the value of the liquidityRatio1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidityRatio1(FinancialRatio value) {
        this.liquidityRatio1 = value;
    }

    /**
     * Gets the value of the liquidityRatio2 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidityRatio2() {
        return liquidityRatio2;
    }

    /**
     * Sets the value of the liquidityRatio2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidityRatio2(FinancialRatio value) {
        this.liquidityRatio2 = value;
    }

    /**
     * Gets the value of the liquidityRatio3 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidityRatio3() {
        return liquidityRatio3;
    }

    /**
     * Sets the value of the liquidityRatio3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidityRatio3(FinancialRatio value) {
        this.liquidityRatio3 = value;
    }

    /**
     * Gets the value of the liquidityRatioAssetsA property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidityRatioAssetsA() {
        return liquidityRatioAssetsA;
    }

    /**
     * Sets the value of the liquidityRatioAssetsA property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidityRatioAssetsA(FinancialRatio value) {
        this.liquidityRatioAssetsA = value;
    }

    /**
     * Gets the value of the liquidityRatioAssetsB property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLiquidityRatioAssetsB() {
        return liquidityRatioAssetsB;
    }

    /**
     * Sets the value of the liquidityRatioAssetsB property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLiquidityRatioAssetsB(FinancialRatio value) {
        this.liquidityRatioAssetsB = value;
    }

    /**
     * Gets the value of the lossReserveinTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getLossReserveinTechnicalReserves() {
        return lossReserveinTechnicalReserves;
    }

    /**
     * Sets the value of the lossReserveinTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setLossReserveinTechnicalReserves(FinancialRatio value) {
        this.lossReserveinTechnicalReserves = value;
    }

    /**
     * Gets the value of the molRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getMOLRatio() {
        return molRatio;
    }

    /**
     * Sets the value of the molRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setMOLRatio(FinancialRatio value) {
        this.molRatio = value;
    }

    /**
     * Gets the value of the netAssetsCover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetAssetsCover() {
        return netAssetsCover;
    }

    /**
     * Sets the value of the netAssetsCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetAssetsCover(FinancialRatio value) {
        this.netAssetsCover = value;
    }

    /**
     * Gets the value of the netPremium property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetPremium() {
        return netPremium;
    }

    /**
     * Sets the value of the netPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetPremium(FinancialRatio value) {
        this.netPremium = value;
    }

    /**
     * Gets the value of the netProfitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetProfitMargin() {
        return netProfitMargin;
    }

    /**
     * Sets the value of the netProfitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetProfitMargin(FinancialRatio value) {
        this.netProfitMargin = value;
    }

    /**
     * Gets the value of the netSalesMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetSalesMargin() {
        return netSalesMargin;
    }

    /**
     * Sets the value of the netSalesMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetSalesMargin(FinancialRatio value) {
        this.netSalesMargin = value;
    }

    /**
     * Gets the value of the netSalesToCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNetSalesToCurrentAssets() {
        return netSalesToCurrentAssets;
    }

    /**
     * Sets the value of the netSalesToCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNetSalesToCurrentAssets(FinancialRatio value) {
        this.netSalesToCurrentAssets = value;
    }

    /**
     * Gets the value of the nonCurrentAssetsOverNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNonCurrentAssetsOverNetWorth() {
        return nonCurrentAssetsOverNetWorth;
    }

    /**
     * Sets the value of the nonCurrentAssetsOverNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNonCurrentAssetsOverNetWorth(FinancialRatio value) {
        this.nonCurrentAssetsOverNetWorth = value;
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
     * Gets the value of the nonOperatingToOperatingIncome property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getNonOperatingToOperatingIncome() {
        return nonOperatingToOperatingIncome;
    }

    /**
     * Sets the value of the nonOperatingToOperatingIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setNonOperatingToOperatingIncome(FinancialRatio value) {
        this.nonOperatingToOperatingIncome = value;
    }

    /**
     * Gets the value of the operatingValueAddedOnSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getOperatingValueAddedOnSales() {
        return operatingValueAddedOnSales;
    }

    /**
     * Sets the value of the operatingValueAddedOnSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setOperatingValueAddedOnSales(FinancialRatio value) {
        this.operatingValueAddedOnSales = value;
    }

    /**
     * Gets the value of the operatingValueAddedPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getOperatingValueAddedPerEmployee() {
        return operatingValueAddedPerEmployee;
    }

    /**
     * Sets the value of the operatingValueAddedPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setOperatingValueAddedPerEmployee(FinancialRatio value) {
        this.operatingValueAddedPerEmployee = value;
    }

    /**
     * Gets the value of the operativeCashFlow property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getOperativeCashFlow() {
        return operativeCashFlow;
    }

    /**
     * Sets the value of the operativeCashFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setOperativeCashFlow(FinancialRatio value) {
        this.operativeCashFlow = value;
    }

    /**
     * Gets the value of the payrollOverValueAdded property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getPayrollOverValueAdded() {
        return payrollOverValueAdded;
    }

    /**
     * Sets the value of the payrollOverValueAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setPayrollOverValueAdded(FinancialRatio value) {
        this.payrollOverValueAdded = value;
    }

    /**
     * Gets the value of the personnelCostsMargin property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getPersonnelCostsMargin() {
        return personnelCostsMargin;
    }

    /**
     * Sets the value of the personnelCostsMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setPersonnelCostsMargin(FinancialRatio value) {
        this.personnelCostsMargin = value;
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
     * Gets the value of the profitMarginAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitMarginAfterTax() {
        return profitMarginAfterTax;
    }

    /**
     * Sets the value of the profitMarginAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitMarginAfterTax(FinancialRatio value) {
        this.profitMarginAfterTax = value;
    }

    /**
     * Gets the value of the profitPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getProfitPerEmployee() {
        return profitPerEmployee;
    }

    /**
     * Sets the value of the profitPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setProfitPerEmployee(FinancialRatio value) {
        this.profitPerEmployee = value;
    }

    /**
     * Gets the value of the reservesRefundPremiuminTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReservesRefundPremiuminTechnicalReserves() {
        return reservesRefundPremiuminTechnicalReserves;
    }

    /**
     * Sets the value of the reservesRefundPremiuminTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReservesRefundPremiuminTechnicalReserves(FinancialRatio value) {
        this.reservesRefundPremiuminTechnicalReserves = value;
    }

    /**
     * Gets the value of the retentionRate property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getRetentionRate() {
        return retentionRate;
    }

    /**
     * Sets the value of the retentionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setRetentionRate(FinancialRatio value) {
        this.retentionRate = value;
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
     * Gets the value of the returnOnCashFlow property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnCashFlow() {
        return returnOnCashFlow;
    }

    /**
     * Sets the value of the returnOnCashFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnCashFlow(FinancialRatio value) {
        this.returnOnCashFlow = value;
    }

    /**
     * Gets the value of the returnOnEquity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnEquity() {
        return returnOnEquity;
    }

    /**
     * Sets the value of the returnOnEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnEquity(FinancialRatio value) {
        this.returnOnEquity = value;
    }

    /**
     * Gets the value of the returnOnEquityAfterTax property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnEquityAfterTax() {
        return returnOnEquityAfterTax;
    }

    /**
     * Sets the value of the returnOnEquityAfterTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnEquityAfterTax(FinancialRatio value) {
        this.returnOnEquityAfterTax = value;
    }

    /**
     * Gets the value of the returnOnInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnInvestment() {
        return returnOnInvestment;
    }

    /**
     * Sets the value of the returnOnInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnInvestment(FinancialRatio value) {
        this.returnOnInvestment = value;
    }

    /**
     * Gets the value of the returnOnSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnSales() {
        return returnOnSales;
    }

    /**
     * Sets the value of the returnOnSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnSales(FinancialRatio value) {
        this.returnOnSales = value;
    }

    /**
     * Gets the value of the returnOnValueAdded property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getReturnOnValueAdded() {
        return returnOnValueAdded;
    }

    /**
     * Sets the value of the returnOnValueAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setReturnOnValueAdded(FinancialRatio value) {
        this.returnOnValueAdded = value;
    }

    /**
     * Gets the value of the revenuesVariations property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getRevenuesVariations() {
        return revenuesVariations;
    }

    /**
     * Sets the value of the revenuesVariations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setRevenuesVariations(FinancialRatio value) {
        this.revenuesVariations = value;
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
     * Gets the value of the salesToNetWorkingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getSalesToNetWorkingCapital() {
        return salesToNetWorkingCapital;
    }

    /**
     * Sets the value of the salesToNetWorkingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setSalesToNetWorkingCapital(FinancialRatio value) {
        this.salesToNetWorkingCapital = value;
    }

    /**
     * Gets the value of the savingsDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getSavingsDeposits() {
        return savingsDeposits;
    }

    /**
     * Sets the value of the savingsDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setSavingsDeposits(FinancialRatio value) {
        this.savingsDeposits = value;
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
     * Gets the value of the shortTermBanksOnCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getShortTermBanksOnCurrentAssets() {
        return shortTermBanksOnCurrentAssets;
    }

    /**
     * Sets the value of the shortTermBanksOnCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setShortTermBanksOnCurrentAssets(FinancialRatio value) {
        this.shortTermBanksOnCurrentAssets = value;
    }

    /**
     * Gets the value of the shortTermIndebtednessIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getShortTermIndebtednessIntensity() {
        return shortTermIndebtednessIntensity;
    }

    /**
     * Sets the value of the shortTermIndebtednessIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setShortTermIndebtednessIntensity(FinancialRatio value) {
        this.shortTermIndebtednessIntensity = value;
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
     * Gets the value of the stockTurnoverRatio property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getStockTurnoverRatio() {
        return stockTurnoverRatio;
    }

    /**
     * Sets the value of the stockTurnoverRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setStockTurnoverRatio(FinancialRatio value) {
        this.stockTurnoverRatio = value;
    }

    /**
     * Gets the value of the technicalReservesEquityCapitalinNetPremium property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTechnicalReservesEquityCapitalinNetPremium() {
        return technicalReservesEquityCapitalinNetPremium;
    }

    /**
     * Sets the value of the technicalReservesEquityCapitalinNetPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTechnicalReservesEquityCapitalinNetPremium(FinancialRatio value) {
        this.technicalReservesEquityCapitalinNetPremium = value;
    }

    /**
     * Gets the value of the technicalReservesinBalanceSheetTotal property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTechnicalReservesinBalanceSheetTotal() {
        return technicalReservesinBalanceSheetTotal;
    }

    /**
     * Sets the value of the technicalReservesinBalanceSheetTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTechnicalReservesinBalanceSheetTotal(FinancialRatio value) {
        this.technicalReservesinBalanceSheetTotal = value;
    }

    /**
     * Gets the value of the totalLiabilitiesToSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalLiabilitiesToSales() {
        return totalLiabilitiesToSales;
    }

    /**
     * Sets the value of the totalLiabilitiesToSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalLiabilitiesToSales(FinancialRatio value) {
        this.totalLiabilitiesToSales = value;
    }

    /**
     * Gets the value of the totalLiabilitiesOverCostSales property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalLiabilitiesOverCostSales() {
        return totalLiabilitiesOverCostSales;
    }

    /**
     * Sets the value of the totalLiabilitiesOverCostSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalLiabilitiesOverCostSales(FinancialRatio value) {
        this.totalLiabilitiesOverCostSales = value;
    }

    /**
     * Gets the value of the totalSurplus property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTotalSurplus() {
        return totalSurplus;
    }

    /**
     * Sets the value of the totalSurplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTotalSurplus(FinancialRatio value) {
        this.totalSurplus = value;
    }

    /**
     * Gets the value of the tradeLiabilitiesToMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTradeLiabilitiesToMaterial() {
        return tradeLiabilitiesToMaterial;
    }

    /**
     * Sets the value of the tradeLiabilitiesToMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTradeLiabilitiesToMaterial(FinancialRatio value) {
        this.tradeLiabilitiesToMaterial = value;
    }

    /**
     * Gets the value of the tradeReceivablesToTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTradeReceivablesToTurnover() {
        return tradeReceivablesToTurnover;
    }

    /**
     * Sets the value of the tradeReceivablesToTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTradeReceivablesToTurnover(FinancialRatio value) {
        this.tradeReceivablesToTurnover = value;
    }

    /**
     * Gets the value of the turnoverPerEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTurnoverPerEmployee() {
        return turnoverPerEmployee;
    }

    /**
     * Sets the value of the turnoverPerEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTurnoverPerEmployee(FinancialRatio value) {
        this.turnoverPerEmployee = value;
    }

    /**
     * Gets the value of the variationsinProductionCosts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getVariationsinProductionCosts() {
        return variationsinProductionCosts;
    }

    /**
     * Sets the value of the variationsinProductionCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setVariationsinProductionCosts(FinancialRatio value) {
        this.variationsinProductionCosts = value;
    }

    /**
     * Gets the value of the variationsinShareholdersEquity property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getVariationsinShareholdersEquity() {
        return variationsinShareholdersEquity;
    }

    /**
     * Sets the value of the variationsinShareholdersEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setVariationsinShareholdersEquity(FinancialRatio value) {
        this.variationsinShareholdersEquity = value;
    }

    /**
     * Gets the value of the variationsinTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getVariationsinTotalAssets() {
        return variationsinTotalAssets;
    }

    /**
     * Sets the value of the variationsinTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setVariationsinTotalAssets(FinancialRatio value) {
        this.variationsinTotalAssets = value;
    }

    /**
     * Gets the value of the warehouseTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getWarehouseTurnover() {
        return warehouseTurnover;
    }

    /**
     * Sets the value of the warehouseTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setWarehouseTurnover(FinancialRatio value) {
        this.warehouseTurnover = value;
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
     * Gets the value of the turnoverToAssets property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialRatio }
     *     
     */
    public FinancialRatio getTurnoverToAssets() {
        return turnoverToAssets;
    }

    /**
     * Sets the value of the turnoverToAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialRatio }
     *     
     */
    public void setTurnoverToAssets(FinancialRatio value) {
        this.turnoverToAssets = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public AdditionalDetailsType getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDetailsType }
     *     
     */
    public void setAdditionalDetails(AdditionalDetailsType value) {
        this.additionalDetails = value;
    }

}
