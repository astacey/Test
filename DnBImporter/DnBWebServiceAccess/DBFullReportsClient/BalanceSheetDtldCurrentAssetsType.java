
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldCurrentAssetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldCurrentAssetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RawMaterialsSupplies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinishedGoods" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnclassifiedStockItems" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Inventory" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Cash" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxRecoverable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MarketableSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwingFromAffiliates" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtorsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebtorsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Stocks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GoodsForResale" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ImmovablePropertyForResale" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Prepayments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherShortTermInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaidDeferredItems" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherUnclassifiedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashReceivablesFromCentralBankBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PublicBondsRefinanciable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivableFromCreditBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ImmediatelyReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherReceivablesDueTermorWithNoticeEndTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromClients" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondsFixedRevenueBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesNonFixedRevenueBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealEstateSecuritiesForInvestment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealEstate" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ForRental" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InConstructionAdvances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Securities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedRevenueSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReinsurersShareTechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MathematicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumReserveRevervesForSuspendeRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReserveForAmountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionalMathematicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositsWithCedingCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Credits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MortgageCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancesOnContracts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivableFromLongLeaseLeasingSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntermediariesInsurees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CalledUnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountsInsurersReInsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountForeignHeadquarters" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivableAnnuitiesInterestsRentsRevenue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="QuotedFixedRevenueBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherInvestmentsDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashBankinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EqualizationAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AcquiredNonDueFinancialIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherEqualizationAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwingFromParticipations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Accruals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherReceivablesInclAccruals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesinGroupCompaniesShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashFreeDisposal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashNotFreeDisposal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToGovernment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BusinessLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToIndividuals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAdvancesToPrivateSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiquidAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalOtherAssetsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredPolicyAcquisitionCosts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPrepaymentsAccruedIncomeInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaymentsAccruedIncomeInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsBankingActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaymentsAccruedIncomeBankingActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Eliminations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShortTermDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaymentsAccruedIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashBalancesAtCentralBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Debtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtorsDerivingFromDirectInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuredParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumsForThePeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumsForPreviousPeriods" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceBrokers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyFundsToBeRecovered" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsDerivingFromReinsuranceOperations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtorsInsuranceReinsuranceCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReinsuranceBrokers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleAssetsStocks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StocksSundryGoods" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankDepositsPostOfficeCurrentAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ChecksCashInHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsIT" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredChargesPrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsDiscountedNotDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SpecialDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GeneralAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankPostalCheques" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinishedGoodsMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherStocksContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Trade" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BalancesWithCentralBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BalancesWithDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BalancesWithPostbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsOnCustomersThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReinsuranceTransitAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterestReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Rent" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPrepaymentsAccruedIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SecuritiesForRefinancing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAdvancesToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAdvancesToBanksOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAdvancesToCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ManagedFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PublicSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesQuotas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubscribedCapitalUnpaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondsShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RawMaterialsConsumables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WorkAndContractsInprogress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinishedGoodsAndGoodsForResale" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToNonGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansDueFromAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldCurrentAssetsType", propOrder = {
    "workinProgress",
    "rawMaterialsSupplies",
    "finishedGoods",
    "unclassifiedStockItems",
    "inventory",
    "cash",
    "tradeDebtors",
    "otherReceivables",
    "prepaidExpenses",
    "taxRecoverable",
    "marketableSecurities",
    "owingFromAffiliates",
    "ownShares",
    "totalCurrentAssets",
    "longTermDebtors",
    "tradeDebtorsLongTerm",
    "otherDebtorsLongTerm",
    "stocks",
    "goodsForResale",
    "immovablePropertyForResale",
    "prepayments",
    "contractsinProgress",
    "totalReceivables",
    "accountsReceivable",
    "otherShortTermInvestments",
    "investmentsInOwnShares",
    "otherInvestments",
    "prepaidDeferredItems",
    "otherUnclassifiedAssets",
    "cashReceivablesFromCentralBankBanks",
    "publicBondsRefinanciable",
    "receivableFromCreditBanks",
    "immediatelyReceivables",
    "otherReceivablesDueTermorWithNoticeEndTerm",
    "receivablesFromClients",
    "bondsFixedRevenueBonds",
    "publicIssuers",
    "otherIssuers",
    "sharesNonFixedRevenueBonds",
    "realEstateSecuritiesForInvestment",
    "realEstate",
    "forRental",
    "inConstructionAdvances",
    "other",
    "securities",
    "fixedRevenueSecurities",
    "reinsurersShareTechnicalReserves",
    "mathematicalReserves",
    "premiumReserveRevervesForSuspendeRisks",
    "reserveForAmountsPayable",
    "provisionalMathematicalReserves",
    "otherTechnicalReserves",
    "depositsWithCedingCompanies",
    "credits",
    "mortgageLoans",
    "mortgageCredits",
    "advancesOnContracts",
    "receivableFromLongLeaseLeasingSimilar",
    "otherLoans",
    "intermediariesInsurees",
    "otherAmountsReceivable",
    "calledUnpaidCapital",
    "currentAccountsInsurersReInsurers",
    "currentAccountForeignHeadquarters",
    "receivableAnnuitiesInterestsRentsRevenue",
    "sundryReceivables",
    "investments",
    "quotedFixedRevenueBonds",
    "otherInvestmentsDeposits",
    "cashBankinHand",
    "equalizationAccounts",
    "acquiredNonDueFinancialIncome",
    "otherEqualizationAccounts",
    "owingFromParticipations",
    "unpaidCapital",
    "accruals",
    "otherReceivablesInclAccruals",
    "sharesinGroupCompaniesShortTerm",
    "otherCurrentAssets",
    "cashFreeDisposal",
    "cashNotFreeDisposal",
    "loansToGovernment",
    "businessLoans",
    "loansToIndividuals",
    "loansAdvancesToPrivateSector",
    "liquidAssets",
    "otherAssetsInsuranceActivities",
    "totalOtherAssetsInsuranceActivities",
    "deferredPolicyAcquisitionCosts",
    "otherPrepaymentsAccruedIncomeInsuranceActivities",
    "prepaymentsAccruedIncomeInsuranceActivities",
    "otherAssetsBankingActivities",
    "prepaymentsAccruedIncomeBankingActivities",
    "eliminations",
    "receivablesFromDebtors",
    "shortTermDebtors",
    "prepaymentsAccruedIncome",
    "cashBalancesAtCentralBanks",
    "debtors",
    "debtorsDerivingFromDirectInsurance",
    "insuredParties",
    "premiumsForThePeriod",
    "premiumsForPreviousPeriods",
    "insuranceBrokers",
    "currentAccountCompanies",
    "thirdPartyFundsToBeRecovered",
    "amountsDerivingFromReinsuranceOperations",
    "debtorsInsuranceReinsuranceCompanies",
    "reinsuranceBrokers",
    "otherDebtors",
    "otherAssets",
    "tangibleAssetsStocks",
    "stocksSundryGoods",
    "bankDepositsPostOfficeCurrentAccounts",
    "checksCashInHand",
    "otherAssetsIT",
    "deferredChargesPrepaidExpenses",
    "billsDiscountedNotDue",
    "specialDebtors",
    "generalAccounts",
    "bankPostalCheques",
    "finishedGoodsMerchandise",
    "otherStocksContractsinProgress",
    "trade",
    "cashReserve",
    "cashinHand",
    "balancesWithCentralBanks",
    "balancesWithDeutscheBundesbank",
    "balancesWithPostbank",
    "payableOnDemand",
    "thereofPayableOnDemand",
    "claimsOnCustomersThereofPayableOnDemand",
    "reinsuranceTransitAccounts",
    "sundryAssets",
    "interestReceivable",
    "rent",
    "otherPrepaymentsAccruedIncome",
    "securitiesForRefinancing",
    "loansAdvancesToBanks",
    "loansAdvancesToBanksOnDemand",
    "loansAdvancesToCustomers",
    "managedFunds",
    "publicSecurities",
    "ownSecurities",
    "sharesQuotas",
    "financialAssets",
    "subscribedCapitalUnpaid",
    "bondsShares",
    "amountsReceivable",
    "rawMaterialsConsumables",
    "workAndContractsInprogress",
    "finishedGoodsAndGoodsForResale",
    "loansToNonGroupCompanies",
    "loansDueFromAffiliatedCompanies",
    "sharesinAffiliatedCompanies"
})
public class BalanceSheetDtldCurrentAssetsType {

    @XmlElement(name = "WorkinProgress")
    protected AmountType workinProgress;
    @XmlElement(name = "RawMaterialsSupplies")
    protected AmountType rawMaterialsSupplies;
    @XmlElement(name = "FinishedGoods")
    protected AmountType finishedGoods;
    @XmlElement(name = "UnclassifiedStockItems")
    protected AmountType unclassifiedStockItems;
    @XmlElement(name = "Inventory")
    protected AmountType inventory;
    @XmlElement(name = "Cash")
    protected AmountType cash;
    @XmlElement(name = "TradeDebtors")
    protected AmountType tradeDebtors;
    @XmlElement(name = "OtherReceivables")
    protected AmountType otherReceivables;
    @XmlElement(name = "PrepaidExpenses")
    protected AmountType prepaidExpenses;
    @XmlElement(name = "TaxRecoverable")
    protected AmountType taxRecoverable;
    @XmlElement(name = "MarketableSecurities")
    protected AmountType marketableSecurities;
    @XmlElement(name = "OwingFromAffiliates")
    protected AmountType owingFromAffiliates;
    @XmlElement(name = "OwnShares")
    protected AmountType ownShares;
    @XmlElement(name = "TotalCurrentAssets")
    protected AmountType totalCurrentAssets;
    @XmlElement(name = "LongTermDebtors")
    protected AmountType longTermDebtors;
    @XmlElement(name = "TradeDebtorsLongTerm")
    protected AmountType tradeDebtorsLongTerm;
    @XmlElement(name = "OtherDebtorsLongTerm")
    protected AmountType otherDebtorsLongTerm;
    @XmlElement(name = "Stocks")
    protected AmountType stocks;
    @XmlElement(name = "GoodsForResale")
    protected AmountType goodsForResale;
    @XmlElement(name = "ImmovablePropertyForResale")
    protected AmountType immovablePropertyForResale;
    @XmlElement(name = "Prepayments")
    protected AmountType prepayments;
    @XmlElement(name = "ContractsinProgress")
    protected AmountType contractsinProgress;
    @XmlElement(name = "TotalReceivables")
    protected AmountType totalReceivables;
    @XmlElement(name = "AccountsReceivable")
    protected AmountType accountsReceivable;
    @XmlElement(name = "OtherShortTermInvestments")
    protected AmountType otherShortTermInvestments;
    @XmlElement(name = "InvestmentsInOwnShares")
    protected AmountType investmentsInOwnShares;
    @XmlElement(name = "OtherInvestments")
    protected AmountType otherInvestments;
    @XmlElement(name = "PrepaidDeferredItems")
    protected AmountType prepaidDeferredItems;
    @XmlElement(name = "OtherUnclassifiedAssets")
    protected AmountType otherUnclassifiedAssets;
    @XmlElement(name = "CashReceivablesFromCentralBankBanks")
    protected AmountType cashReceivablesFromCentralBankBanks;
    @XmlElement(name = "PublicBondsRefinanciable")
    protected AmountType publicBondsRefinanciable;
    @XmlElement(name = "ReceivableFromCreditBanks")
    protected AmountType receivableFromCreditBanks;
    @XmlElement(name = "ImmediatelyReceivables")
    protected AmountType immediatelyReceivables;
    @XmlElement(name = "OtherReceivablesDueTermorWithNoticeEndTerm")
    protected AmountType otherReceivablesDueTermorWithNoticeEndTerm;
    @XmlElement(name = "ReceivablesFromClients")
    protected AmountType receivablesFromClients;
    @XmlElement(name = "BondsFixedRevenueBonds")
    protected AmountType bondsFixedRevenueBonds;
    @XmlElement(name = "PublicIssuers")
    protected AmountType publicIssuers;
    @XmlElement(name = "OtherIssuers")
    protected AmountType otherIssuers;
    @XmlElement(name = "SharesNonFixedRevenueBonds")
    protected AmountType sharesNonFixedRevenueBonds;
    @XmlElement(name = "RealEstateSecuritiesForInvestment")
    protected AmountType realEstateSecuritiesForInvestment;
    @XmlElement(name = "RealEstate")
    protected AmountType realEstate;
    @XmlElement(name = "ForRental")
    protected AmountType forRental;
    @XmlElement(name = "InConstructionAdvances")
    protected AmountType inConstructionAdvances;
    @XmlElement(name = "Other")
    protected AmountType other;
    @XmlElement(name = "Securities")
    protected AmountType securities;
    @XmlElement(name = "FixedRevenueSecurities")
    protected AmountType fixedRevenueSecurities;
    @XmlElement(name = "ReinsurersShareTechnicalReserves")
    protected AmountType reinsurersShareTechnicalReserves;
    @XmlElement(name = "MathematicalReserves")
    protected AmountType mathematicalReserves;
    @XmlElement(name = "PremiumReserveRevervesForSuspendeRisks")
    protected AmountType premiumReserveRevervesForSuspendeRisks;
    @XmlElement(name = "ReserveForAmountsPayable")
    protected AmountType reserveForAmountsPayable;
    @XmlElement(name = "ProvisionalMathematicalReserves")
    protected AmountType provisionalMathematicalReserves;
    @XmlElement(name = "OtherTechnicalReserves")
    protected AmountType otherTechnicalReserves;
    @XmlElement(name = "DepositsWithCedingCompanies")
    protected AmountType depositsWithCedingCompanies;
    @XmlElement(name = "Credits")
    protected AmountType credits;
    @XmlElement(name = "MortgageLoans")
    protected AmountType mortgageLoans;
    @XmlElement(name = "MortgageCredits")
    protected AmountType mortgageCredits;
    @XmlElement(name = "AdvancesOnContracts")
    protected AmountType advancesOnContracts;
    @XmlElement(name = "ReceivableFromLongLeaseLeasingSimilar")
    protected AmountType receivableFromLongLeaseLeasingSimilar;
    @XmlElement(name = "OtherLoans")
    protected AmountType otherLoans;
    @XmlElement(name = "IntermediariesInsurees")
    protected AmountType intermediariesInsurees;
    @XmlElement(name = "OtherAmountsReceivable")
    protected AmountType otherAmountsReceivable;
    @XmlElement(name = "CalledUnpaidCapital")
    protected AmountType calledUnpaidCapital;
    @XmlElement(name = "CurrentAccountsInsurersReInsurers")
    protected AmountType currentAccountsInsurersReInsurers;
    @XmlElement(name = "CurrentAccountForeignHeadquarters")
    protected AmountType currentAccountForeignHeadquarters;
    @XmlElement(name = "ReceivableAnnuitiesInterestsRentsRevenue")
    protected AmountType receivableAnnuitiesInterestsRentsRevenue;
    @XmlElement(name = "SundryReceivables")
    protected AmountType sundryReceivables;
    @XmlElement(name = "Investments")
    protected AmountType investments;
    @XmlElement(name = "QuotedFixedRevenueBonds")
    protected AmountType quotedFixedRevenueBonds;
    @XmlElement(name = "OtherInvestmentsDeposits")
    protected AmountType otherInvestmentsDeposits;
    @XmlElement(name = "CashBankinHand")
    protected AmountType cashBankinHand;
    @XmlElement(name = "EqualizationAccounts")
    protected AmountType equalizationAccounts;
    @XmlElement(name = "AcquiredNonDueFinancialIncome")
    protected AmountType acquiredNonDueFinancialIncome;
    @XmlElement(name = "OtherEqualizationAccounts")
    protected AmountType otherEqualizationAccounts;
    @XmlElement(name = "OwingFromParticipations")
    protected AmountType owingFromParticipations;
    @XmlElement(name = "UnpaidCapital")
    protected AmountType unpaidCapital;
    @XmlElement(name = "Accruals")
    protected AmountType accruals;
    @XmlElement(name = "OtherReceivablesInclAccruals")
    protected AmountType otherReceivablesInclAccruals;
    @XmlElement(name = "SharesinGroupCompaniesShortTerm")
    protected AmountType sharesinGroupCompaniesShortTerm;
    @XmlElement(name = "OtherCurrentAssets")
    protected AmountType otherCurrentAssets;
    @XmlElement(name = "CashFreeDisposal")
    protected AmountType cashFreeDisposal;
    @XmlElement(name = "CashNotFreeDisposal")
    protected AmountType cashNotFreeDisposal;
    @XmlElement(name = "LoansToGovernment")
    protected AmountType loansToGovernment;
    @XmlElement(name = "BusinessLoans")
    protected AmountType businessLoans;
    @XmlElement(name = "LoansToIndividuals")
    protected AmountType loansToIndividuals;
    @XmlElement(name = "LoansAdvancesToPrivateSector")
    protected AmountType loansAdvancesToPrivateSector;
    @XmlElement(name = "LiquidAssets")
    protected AmountType liquidAssets;
    @XmlElement(name = "OtherAssetsInsuranceActivities")
    protected AmountType otherAssetsInsuranceActivities;
    @XmlElement(name = "TotalOtherAssetsInsuranceActivities")
    protected AmountType totalOtherAssetsInsuranceActivities;
    @XmlElement(name = "DeferredPolicyAcquisitionCosts")
    protected AmountType deferredPolicyAcquisitionCosts;
    @XmlElement(name = "OtherPrepaymentsAccruedIncomeInsuranceActivities")
    protected AmountType otherPrepaymentsAccruedIncomeInsuranceActivities;
    @XmlElement(name = "PrepaymentsAccruedIncomeInsuranceActivities")
    protected AmountType prepaymentsAccruedIncomeInsuranceActivities;
    @XmlElement(name = "OtherAssetsBankingActivities")
    protected AmountType otherAssetsBankingActivities;
    @XmlElement(name = "PrepaymentsAccruedIncomeBankingActivities")
    protected AmountType prepaymentsAccruedIncomeBankingActivities;
    @XmlElement(name = "Eliminations")
    protected AmountType eliminations;
    @XmlElement(name = "ReceivablesFromDebtors")
    protected AmountType receivablesFromDebtors;
    @XmlElement(name = "ShortTermDebtors")
    protected AmountType shortTermDebtors;
    @XmlElement(name = "PrepaymentsAccruedIncome")
    protected AmountType prepaymentsAccruedIncome;
    @XmlElement(name = "CashBalancesAtCentralBanks")
    protected AmountType cashBalancesAtCentralBanks;
    @XmlElement(name = "Debtors")
    protected AmountType debtors;
    @XmlElement(name = "DebtorsDerivingFromDirectInsurance")
    protected AmountType debtorsDerivingFromDirectInsurance;
    @XmlElement(name = "InsuredParties")
    protected AmountType insuredParties;
    @XmlElement(name = "PremiumsForThePeriod")
    protected AmountType premiumsForThePeriod;
    @XmlElement(name = "PremiumsForPreviousPeriods")
    protected AmountType premiumsForPreviousPeriods;
    @XmlElement(name = "InsuranceBrokers")
    protected AmountType insuranceBrokers;
    @XmlElement(name = "CurrentAccountCompanies")
    protected AmountType currentAccountCompanies;
    @XmlElement(name = "ThirdPartyFundsToBeRecovered")
    protected AmountType thirdPartyFundsToBeRecovered;
    @XmlElement(name = "AmountsDerivingFromReinsuranceOperations")
    protected AmountType amountsDerivingFromReinsuranceOperations;
    @XmlElement(name = "DebtorsInsuranceReinsuranceCompanies")
    protected AmountType debtorsInsuranceReinsuranceCompanies;
    @XmlElement(name = "ReinsuranceBrokers")
    protected AmountType reinsuranceBrokers;
    @XmlElement(name = "OtherDebtors")
    protected AmountType otherDebtors;
    @XmlElement(name = "OtherAssets")
    protected AmountType otherAssets;
    @XmlElement(name = "TangibleAssetsStocks")
    protected AmountType tangibleAssetsStocks;
    @XmlElement(name = "StocksSundryGoods")
    protected AmountType stocksSundryGoods;
    @XmlElement(name = "BankDepositsPostOfficeCurrentAccounts")
    protected AmountType bankDepositsPostOfficeCurrentAccounts;
    @XmlElement(name = "ChecksCashInHand")
    protected AmountType checksCashInHand;
    @XmlElement(name = "OtherAssetsIT")
    protected AmountType otherAssetsIT;
    @XmlElement(name = "DeferredChargesPrepaidExpenses")
    protected AmountType deferredChargesPrepaidExpenses;
    @XmlElement(name = "BillsDiscountedNotDue")
    protected AmountType billsDiscountedNotDue;
    @XmlElement(name = "SpecialDebtors")
    protected AmountType specialDebtors;
    @XmlElement(name = "GeneralAccounts")
    protected AmountType generalAccounts;
    @XmlElement(name = "BankPostalCheques")
    protected AmountType bankPostalCheques;
    @XmlElement(name = "FinishedGoodsMerchandise")
    protected AmountType finishedGoodsMerchandise;
    @XmlElement(name = "OtherStocksContractsinProgress")
    protected AmountType otherStocksContractsinProgress;
    @XmlElement(name = "Trade")
    protected AmountType trade;
    @XmlElement(name = "CashReserve")
    protected AmountType cashReserve;
    @XmlElement(name = "CashinHand")
    protected AmountType cashinHand;
    @XmlElement(name = "BalancesWithCentralBanks")
    protected AmountType balancesWithCentralBanks;
    @XmlElement(name = "BalancesWithDeutscheBundesbank")
    protected AmountType balancesWithDeutscheBundesbank;
    @XmlElement(name = "BalancesWithPostbank")
    protected AmountType balancesWithPostbank;
    @XmlElement(name = "PayableOnDemand")
    protected AmountType payableOnDemand;
    @XmlElement(name = "ThereofPayableOnDemand")
    protected AmountType thereofPayableOnDemand;
    @XmlElement(name = "ClaimsOnCustomersThereofPayableOnDemand")
    protected AmountType claimsOnCustomersThereofPayableOnDemand;
    @XmlElement(name = "ReinsuranceTransitAccounts")
    protected AmountType reinsuranceTransitAccounts;
    @XmlElement(name = "SundryAssets")
    protected AmountType sundryAssets;
    @XmlElement(name = "InterestReceivable")
    protected AmountType interestReceivable;
    @XmlElement(name = "Rent")
    protected AmountType rent;
    @XmlElement(name = "OtherPrepaymentsAccruedIncome")
    protected AmountType otherPrepaymentsAccruedIncome;
    @XmlElement(name = "SecuritiesForRefinancing")
    protected AmountType securitiesForRefinancing;
    @XmlElement(name = "LoansAdvancesToBanks")
    protected AmountType loansAdvancesToBanks;
    @XmlElement(name = "LoansAdvancesToBanksOnDemand")
    protected AmountType loansAdvancesToBanksOnDemand;
    @XmlElement(name = "LoansAdvancesToCustomers")
    protected AmountType loansAdvancesToCustomers;
    @XmlElement(name = "ManagedFunds")
    protected AmountType managedFunds;
    @XmlElement(name = "PublicSecurities")
    protected AmountType publicSecurities;
    @XmlElement(name = "OwnSecurities")
    protected AmountType ownSecurities;
    @XmlElement(name = "SharesQuotas")
    protected AmountType sharesQuotas;
    @XmlElement(name = "FinancialAssets")
    protected AmountType financialAssets;
    @XmlElement(name = "SubscribedCapitalUnpaid")
    protected AmountType subscribedCapitalUnpaid;
    @XmlElement(name = "BondsShares")
    protected AmountType bondsShares;
    @XmlElement(name = "AmountsReceivable")
    protected AmountType amountsReceivable;
    @XmlElement(name = "RawMaterialsConsumables")
    protected AmountType rawMaterialsConsumables;
    @XmlElement(name = "WorkAndContractsInprogress")
    protected AmountType workAndContractsInprogress;
    @XmlElement(name = "FinishedGoodsAndGoodsForResale")
    protected AmountType finishedGoodsAndGoodsForResale;
    @XmlElement(name = "LoansToNonGroupCompanies")
    protected AmountType loansToNonGroupCompanies;
    @XmlElement(name = "LoansDueFromAffiliatedCompanies")
    protected AmountType loansDueFromAffiliatedCompanies;
    @XmlElement(name = "SharesinAffiliatedCompanies")
    protected AmountType sharesinAffiliatedCompanies;

    /**
     * Gets the value of the workinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWorkinProgress() {
        return workinProgress;
    }

    /**
     * Sets the value of the workinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWorkinProgress(AmountType value) {
        this.workinProgress = value;
    }

    /**
     * Gets the value of the rawMaterialsSupplies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRawMaterialsSupplies() {
        return rawMaterialsSupplies;
    }

    /**
     * Sets the value of the rawMaterialsSupplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRawMaterialsSupplies(AmountType value) {
        this.rawMaterialsSupplies = value;
    }

    /**
     * Gets the value of the finishedGoods property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinishedGoods() {
        return finishedGoods;
    }

    /**
     * Sets the value of the finishedGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinishedGoods(AmountType value) {
        this.finishedGoods = value;
    }

    /**
     * Gets the value of the unclassifiedStockItems property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnclassifiedStockItems() {
        return unclassifiedStockItems;
    }

    /**
     * Sets the value of the unclassifiedStockItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnclassifiedStockItems(AmountType value) {
        this.unclassifiedStockItems = value;
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
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCash(AmountType value) {
        this.cash = value;
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
     * Gets the value of the otherReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherReceivables() {
        return otherReceivables;
    }

    /**
     * Sets the value of the otherReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherReceivables(AmountType value) {
        this.otherReceivables = value;
    }

    /**
     * Gets the value of the prepaidExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaidExpenses() {
        return prepaidExpenses;
    }

    /**
     * Sets the value of the prepaidExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaidExpenses(AmountType value) {
        this.prepaidExpenses = value;
    }

    /**
     * Gets the value of the taxRecoverable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxRecoverable() {
        return taxRecoverable;
    }

    /**
     * Sets the value of the taxRecoverable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxRecoverable(AmountType value) {
        this.taxRecoverable = value;
    }

    /**
     * Gets the value of the marketableSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMarketableSecurities() {
        return marketableSecurities;
    }

    /**
     * Sets the value of the marketableSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMarketableSecurities(AmountType value) {
        this.marketableSecurities = value;
    }

    /**
     * Gets the value of the owingFromAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwingFromAffiliates() {
        return owingFromAffiliates;
    }

    /**
     * Sets the value of the owingFromAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwingFromAffiliates(AmountType value) {
        this.owingFromAffiliates = value;
    }

    /**
     * Gets the value of the ownShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwnShares() {
        return ownShares;
    }

    /**
     * Sets the value of the ownShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwnShares(AmountType value) {
        this.ownShares = value;
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
     * Gets the value of the longTermDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermDebtors() {
        return longTermDebtors;
    }

    /**
     * Sets the value of the longTermDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermDebtors(AmountType value) {
        this.longTermDebtors = value;
    }

    /**
     * Gets the value of the tradeDebtorsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtorsLongTerm() {
        return tradeDebtorsLongTerm;
    }

    /**
     * Sets the value of the tradeDebtorsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtorsLongTerm(AmountType value) {
        this.tradeDebtorsLongTerm = value;
    }

    /**
     * Gets the value of the otherDebtorsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDebtorsLongTerm() {
        return otherDebtorsLongTerm;
    }

    /**
     * Sets the value of the otherDebtorsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDebtorsLongTerm(AmountType value) {
        this.otherDebtorsLongTerm = value;
    }

    /**
     * Gets the value of the stocks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStocks() {
        return stocks;
    }

    /**
     * Sets the value of the stocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStocks(AmountType value) {
        this.stocks = value;
    }

    /**
     * Gets the value of the goodsForResale property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGoodsForResale() {
        return goodsForResale;
    }

    /**
     * Sets the value of the goodsForResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGoodsForResale(AmountType value) {
        this.goodsForResale = value;
    }

    /**
     * Gets the value of the immovablePropertyForResale property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImmovablePropertyForResale() {
        return immovablePropertyForResale;
    }

    /**
     * Sets the value of the immovablePropertyForResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImmovablePropertyForResale(AmountType value) {
        this.immovablePropertyForResale = value;
    }

    /**
     * Gets the value of the prepayments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepayments() {
        return prepayments;
    }

    /**
     * Sets the value of the prepayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepayments(AmountType value) {
        this.prepayments = value;
    }

    /**
     * Gets the value of the contractsinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getContractsinProgress() {
        return contractsinProgress;
    }

    /**
     * Sets the value of the contractsinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setContractsinProgress(AmountType value) {
        this.contractsinProgress = value;
    }

    /**
     * Gets the value of the totalReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalReceivables() {
        return totalReceivables;
    }

    /**
     * Sets the value of the totalReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalReceivables(AmountType value) {
        this.totalReceivables = value;
    }

    /**
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsReceivable(AmountType value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the otherShortTermInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherShortTermInvestments() {
        return otherShortTermInvestments;
    }

    /**
     * Sets the value of the otherShortTermInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherShortTermInvestments(AmountType value) {
        this.otherShortTermInvestments = value;
    }

    /**
     * Gets the value of the investmentsInOwnShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInOwnShares() {
        return investmentsInOwnShares;
    }

    /**
     * Sets the value of the investmentsInOwnShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInOwnShares(AmountType value) {
        this.investmentsInOwnShares = value;
    }

    /**
     * Gets the value of the otherInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherInvestments() {
        return otherInvestments;
    }

    /**
     * Sets the value of the otherInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherInvestments(AmountType value) {
        this.otherInvestments = value;
    }

    /**
     * Gets the value of the prepaidDeferredItems property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaidDeferredItems() {
        return prepaidDeferredItems;
    }

    /**
     * Sets the value of the prepaidDeferredItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaidDeferredItems(AmountType value) {
        this.prepaidDeferredItems = value;
    }

    /**
     * Gets the value of the otherUnclassifiedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherUnclassifiedAssets() {
        return otherUnclassifiedAssets;
    }

    /**
     * Sets the value of the otherUnclassifiedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherUnclassifiedAssets(AmountType value) {
        this.otherUnclassifiedAssets = value;
    }

    /**
     * Gets the value of the cashReceivablesFromCentralBankBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashReceivablesFromCentralBankBanks() {
        return cashReceivablesFromCentralBankBanks;
    }

    /**
     * Sets the value of the cashReceivablesFromCentralBankBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashReceivablesFromCentralBankBanks(AmountType value) {
        this.cashReceivablesFromCentralBankBanks = value;
    }

    /**
     * Gets the value of the publicBondsRefinanciable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPublicBondsRefinanciable() {
        return publicBondsRefinanciable;
    }

    /**
     * Sets the value of the publicBondsRefinanciable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPublicBondsRefinanciable(AmountType value) {
        this.publicBondsRefinanciable = value;
    }

    /**
     * Gets the value of the receivableFromCreditBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivableFromCreditBanks() {
        return receivableFromCreditBanks;
    }

    /**
     * Sets the value of the receivableFromCreditBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivableFromCreditBanks(AmountType value) {
        this.receivableFromCreditBanks = value;
    }

    /**
     * Gets the value of the immediatelyReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImmediatelyReceivables() {
        return immediatelyReceivables;
    }

    /**
     * Sets the value of the immediatelyReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImmediatelyReceivables(AmountType value) {
        this.immediatelyReceivables = value;
    }

    /**
     * Gets the value of the otherReceivablesDueTermorWithNoticeEndTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherReceivablesDueTermorWithNoticeEndTerm() {
        return otherReceivablesDueTermorWithNoticeEndTerm;
    }

    /**
     * Sets the value of the otherReceivablesDueTermorWithNoticeEndTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherReceivablesDueTermorWithNoticeEndTerm(AmountType value) {
        this.otherReceivablesDueTermorWithNoticeEndTerm = value;
    }

    /**
     * Gets the value of the receivablesFromClients property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromClients() {
        return receivablesFromClients;
    }

    /**
     * Sets the value of the receivablesFromClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromClients(AmountType value) {
        this.receivablesFromClients = value;
    }

    /**
     * Gets the value of the bondsFixedRevenueBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBondsFixedRevenueBonds() {
        return bondsFixedRevenueBonds;
    }

    /**
     * Sets the value of the bondsFixedRevenueBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBondsFixedRevenueBonds(AmountType value) {
        this.bondsFixedRevenueBonds = value;
    }

    /**
     * Gets the value of the publicIssuers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPublicIssuers() {
        return publicIssuers;
    }

    /**
     * Sets the value of the publicIssuers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPublicIssuers(AmountType value) {
        this.publicIssuers = value;
    }

    /**
     * Gets the value of the otherIssuers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherIssuers() {
        return otherIssuers;
    }

    /**
     * Sets the value of the otherIssuers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherIssuers(AmountType value) {
        this.otherIssuers = value;
    }

    /**
     * Gets the value of the sharesNonFixedRevenueBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesNonFixedRevenueBonds() {
        return sharesNonFixedRevenueBonds;
    }

    /**
     * Sets the value of the sharesNonFixedRevenueBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesNonFixedRevenueBonds(AmountType value) {
        this.sharesNonFixedRevenueBonds = value;
    }

    /**
     * Gets the value of the realEstateSecuritiesForInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealEstateSecuritiesForInvestment() {
        return realEstateSecuritiesForInvestment;
    }

    /**
     * Sets the value of the realEstateSecuritiesForInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealEstateSecuritiesForInvestment(AmountType value) {
        this.realEstateSecuritiesForInvestment = value;
    }

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealEstate(AmountType value) {
        this.realEstate = value;
    }

    /**
     * Gets the value of the forRental property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getForRental() {
        return forRental;
    }

    /**
     * Sets the value of the forRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setForRental(AmountType value) {
        this.forRental = value;
    }

    /**
     * Gets the value of the inConstructionAdvances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInConstructionAdvances() {
        return inConstructionAdvances;
    }

    /**
     * Sets the value of the inConstructionAdvances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInConstructionAdvances(AmountType value) {
        this.inConstructionAdvances = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOther(AmountType value) {
        this.other = value;
    }

    /**
     * Gets the value of the securities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSecurities() {
        return securities;
    }

    /**
     * Sets the value of the securities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSecurities(AmountType value) {
        this.securities = value;
    }

    /**
     * Gets the value of the fixedRevenueSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedRevenueSecurities() {
        return fixedRevenueSecurities;
    }

    /**
     * Sets the value of the fixedRevenueSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedRevenueSecurities(AmountType value) {
        this.fixedRevenueSecurities = value;
    }

    /**
     * Gets the value of the reinsurersShareTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReinsurersShareTechnicalReserves() {
        return reinsurersShareTechnicalReserves;
    }

    /**
     * Sets the value of the reinsurersShareTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReinsurersShareTechnicalReserves(AmountType value) {
        this.reinsurersShareTechnicalReserves = value;
    }

    /**
     * Gets the value of the mathematicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMathematicalReserves() {
        return mathematicalReserves;
    }

    /**
     * Sets the value of the mathematicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMathematicalReserves(AmountType value) {
        this.mathematicalReserves = value;
    }

    /**
     * Gets the value of the premiumReserveRevervesForSuspendeRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumReserveRevervesForSuspendeRisks() {
        return premiumReserveRevervesForSuspendeRisks;
    }

    /**
     * Sets the value of the premiumReserveRevervesForSuspendeRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumReserveRevervesForSuspendeRisks(AmountType value) {
        this.premiumReserveRevervesForSuspendeRisks = value;
    }

    /**
     * Gets the value of the reserveForAmountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReserveForAmountsPayable() {
        return reserveForAmountsPayable;
    }

    /**
     * Sets the value of the reserveForAmountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReserveForAmountsPayable(AmountType value) {
        this.reserveForAmountsPayable = value;
    }

    /**
     * Gets the value of the provisionalMathematicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionalMathematicalReserves() {
        return provisionalMathematicalReserves;
    }

    /**
     * Sets the value of the provisionalMathematicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionalMathematicalReserves(AmountType value) {
        this.provisionalMathematicalReserves = value;
    }

    /**
     * Gets the value of the otherTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTechnicalReserves() {
        return otherTechnicalReserves;
    }

    /**
     * Sets the value of the otherTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTechnicalReserves(AmountType value) {
        this.otherTechnicalReserves = value;
    }

    /**
     * Gets the value of the depositsWithCedingCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositsWithCedingCompanies() {
        return depositsWithCedingCompanies;
    }

    /**
     * Sets the value of the depositsWithCedingCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositsWithCedingCompanies(AmountType value) {
        this.depositsWithCedingCompanies = value;
    }

    /**
     * Gets the value of the credits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCredits() {
        return credits;
    }

    /**
     * Sets the value of the credits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCredits(AmountType value) {
        this.credits = value;
    }

    /**
     * Gets the value of the mortgageLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMortgageLoans() {
        return mortgageLoans;
    }

    /**
     * Sets the value of the mortgageLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMortgageLoans(AmountType value) {
        this.mortgageLoans = value;
    }

    /**
     * Gets the value of the mortgageCredits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMortgageCredits() {
        return mortgageCredits;
    }

    /**
     * Sets the value of the mortgageCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMortgageCredits(AmountType value) {
        this.mortgageCredits = value;
    }

    /**
     * Gets the value of the advancesOnContracts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancesOnContracts() {
        return advancesOnContracts;
    }

    /**
     * Sets the value of the advancesOnContracts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancesOnContracts(AmountType value) {
        this.advancesOnContracts = value;
    }

    /**
     * Gets the value of the receivableFromLongLeaseLeasingSimilar property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivableFromLongLeaseLeasingSimilar() {
        return receivableFromLongLeaseLeasingSimilar;
    }

    /**
     * Sets the value of the receivableFromLongLeaseLeasingSimilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivableFromLongLeaseLeasingSimilar(AmountType value) {
        this.receivableFromLongLeaseLeasingSimilar = value;
    }

    /**
     * Gets the value of the otherLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLoans() {
        return otherLoans;
    }

    /**
     * Sets the value of the otherLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLoans(AmountType value) {
        this.otherLoans = value;
    }

    /**
     * Gets the value of the intermediariesInsurees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntermediariesInsurees() {
        return intermediariesInsurees;
    }

    /**
     * Sets the value of the intermediariesInsurees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntermediariesInsurees(AmountType value) {
        this.intermediariesInsurees = value;
    }

    /**
     * Gets the value of the otherAmountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAmountsReceivable() {
        return otherAmountsReceivable;
    }

    /**
     * Sets the value of the otherAmountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAmountsReceivable(AmountType value) {
        this.otherAmountsReceivable = value;
    }

    /**
     * Gets the value of the calledUnpaidCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCalledUnpaidCapital() {
        return calledUnpaidCapital;
    }

    /**
     * Sets the value of the calledUnpaidCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCalledUnpaidCapital(AmountType value) {
        this.calledUnpaidCapital = value;
    }

    /**
     * Gets the value of the currentAccountsInsurersReInsurers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentAccountsInsurersReInsurers() {
        return currentAccountsInsurersReInsurers;
    }

    /**
     * Sets the value of the currentAccountsInsurersReInsurers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentAccountsInsurersReInsurers(AmountType value) {
        this.currentAccountsInsurersReInsurers = value;
    }

    /**
     * Gets the value of the currentAccountForeignHeadquarters property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentAccountForeignHeadquarters() {
        return currentAccountForeignHeadquarters;
    }

    /**
     * Sets the value of the currentAccountForeignHeadquarters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentAccountForeignHeadquarters(AmountType value) {
        this.currentAccountForeignHeadquarters = value;
    }

    /**
     * Gets the value of the receivableAnnuitiesInterestsRentsRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivableAnnuitiesInterestsRentsRevenue() {
        return receivableAnnuitiesInterestsRentsRevenue;
    }

    /**
     * Sets the value of the receivableAnnuitiesInterestsRentsRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivableAnnuitiesInterestsRentsRevenue(AmountType value) {
        this.receivableAnnuitiesInterestsRentsRevenue = value;
    }

    /**
     * Gets the value of the sundryReceivables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryReceivables() {
        return sundryReceivables;
    }

    /**
     * Sets the value of the sundryReceivables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryReceivables(AmountType value) {
        this.sundryReceivables = value;
    }

    /**
     * Gets the value of the investments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestments() {
        return investments;
    }

    /**
     * Sets the value of the investments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestments(AmountType value) {
        this.investments = value;
    }

    /**
     * Gets the value of the quotedFixedRevenueBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getQuotedFixedRevenueBonds() {
        return quotedFixedRevenueBonds;
    }

    /**
     * Sets the value of the quotedFixedRevenueBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setQuotedFixedRevenueBonds(AmountType value) {
        this.quotedFixedRevenueBonds = value;
    }

    /**
     * Gets the value of the otherInvestmentsDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherInvestmentsDeposits() {
        return otherInvestmentsDeposits;
    }

    /**
     * Sets the value of the otherInvestmentsDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherInvestmentsDeposits(AmountType value) {
        this.otherInvestmentsDeposits = value;
    }

    /**
     * Gets the value of the cashBankinHand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashBankinHand() {
        return cashBankinHand;
    }

    /**
     * Sets the value of the cashBankinHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashBankinHand(AmountType value) {
        this.cashBankinHand = value;
    }

    /**
     * Gets the value of the equalizationAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEqualizationAccounts() {
        return equalizationAccounts;
    }

    /**
     * Sets the value of the equalizationAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEqualizationAccounts(AmountType value) {
        this.equalizationAccounts = value;
    }

    /**
     * Gets the value of the acquiredNonDueFinancialIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcquiredNonDueFinancialIncome() {
        return acquiredNonDueFinancialIncome;
    }

    /**
     * Sets the value of the acquiredNonDueFinancialIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcquiredNonDueFinancialIncome(AmountType value) {
        this.acquiredNonDueFinancialIncome = value;
    }

    /**
     * Gets the value of the otherEqualizationAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherEqualizationAccounts() {
        return otherEqualizationAccounts;
    }

    /**
     * Sets the value of the otherEqualizationAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherEqualizationAccounts(AmountType value) {
        this.otherEqualizationAccounts = value;
    }

    /**
     * Gets the value of the owingFromParticipations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwingFromParticipations() {
        return owingFromParticipations;
    }

    /**
     * Sets the value of the owingFromParticipations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwingFromParticipations(AmountType value) {
        this.owingFromParticipations = value;
    }

    /**
     * Gets the value of the unpaidCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnpaidCapital() {
        return unpaidCapital;
    }

    /**
     * Sets the value of the unpaidCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnpaidCapital(AmountType value) {
        this.unpaidCapital = value;
    }

    /**
     * Gets the value of the accruals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccruals() {
        return accruals;
    }

    /**
     * Sets the value of the accruals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccruals(AmountType value) {
        this.accruals = value;
    }

    /**
     * Gets the value of the otherReceivablesInclAccruals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherReceivablesInclAccruals() {
        return otherReceivablesInclAccruals;
    }

    /**
     * Sets the value of the otherReceivablesInclAccruals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherReceivablesInclAccruals(AmountType value) {
        this.otherReceivablesInclAccruals = value;
    }

    /**
     * Gets the value of the sharesinGroupCompaniesShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesinGroupCompaniesShortTerm() {
        return sharesinGroupCompaniesShortTerm;
    }

    /**
     * Sets the value of the sharesinGroupCompaniesShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesinGroupCompaniesShortTerm(AmountType value) {
        this.sharesinGroupCompaniesShortTerm = value;
    }

    /**
     * Gets the value of the otherCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    /**
     * Sets the value of the otherCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCurrentAssets(AmountType value) {
        this.otherCurrentAssets = value;
    }

    /**
     * Gets the value of the cashFreeDisposal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashFreeDisposal() {
        return cashFreeDisposal;
    }

    /**
     * Sets the value of the cashFreeDisposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashFreeDisposal(AmountType value) {
        this.cashFreeDisposal = value;
    }

    /**
     * Gets the value of the cashNotFreeDisposal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashNotFreeDisposal() {
        return cashNotFreeDisposal;
    }

    /**
     * Sets the value of the cashNotFreeDisposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashNotFreeDisposal(AmountType value) {
        this.cashNotFreeDisposal = value;
    }

    /**
     * Gets the value of the loansToGovernment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToGovernment() {
        return loansToGovernment;
    }

    /**
     * Sets the value of the loansToGovernment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToGovernment(AmountType value) {
        this.loansToGovernment = value;
    }

    /**
     * Gets the value of the businessLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBusinessLoans() {
        return businessLoans;
    }

    /**
     * Sets the value of the businessLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBusinessLoans(AmountType value) {
        this.businessLoans = value;
    }

    /**
     * Gets the value of the loansToIndividuals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToIndividuals() {
        return loansToIndividuals;
    }

    /**
     * Sets the value of the loansToIndividuals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToIndividuals(AmountType value) {
        this.loansToIndividuals = value;
    }

    /**
     * Gets the value of the loansAdvancesToPrivateSector property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAdvancesToPrivateSector() {
        return loansAdvancesToPrivateSector;
    }

    /**
     * Sets the value of the loansAdvancesToPrivateSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAdvancesToPrivateSector(AmountType value) {
        this.loansAdvancesToPrivateSector = value;
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
     * Gets the value of the otherAssetsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssetsInsuranceActivities() {
        return otherAssetsInsuranceActivities;
    }

    /**
     * Sets the value of the otherAssetsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssetsInsuranceActivities(AmountType value) {
        this.otherAssetsInsuranceActivities = value;
    }

    /**
     * Gets the value of the totalOtherAssetsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOtherAssetsInsuranceActivities() {
        return totalOtherAssetsInsuranceActivities;
    }

    /**
     * Sets the value of the totalOtherAssetsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOtherAssetsInsuranceActivities(AmountType value) {
        this.totalOtherAssetsInsuranceActivities = value;
    }

    /**
     * Gets the value of the deferredPolicyAcquisitionCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredPolicyAcquisitionCosts() {
        return deferredPolicyAcquisitionCosts;
    }

    /**
     * Sets the value of the deferredPolicyAcquisitionCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredPolicyAcquisitionCosts(AmountType value) {
        this.deferredPolicyAcquisitionCosts = value;
    }

    /**
     * Gets the value of the otherPrepaymentsAccruedIncomeInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPrepaymentsAccruedIncomeInsuranceActivities() {
        return otherPrepaymentsAccruedIncomeInsuranceActivities;
    }

    /**
     * Sets the value of the otherPrepaymentsAccruedIncomeInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPrepaymentsAccruedIncomeInsuranceActivities(AmountType value) {
        this.otherPrepaymentsAccruedIncomeInsuranceActivities = value;
    }

    /**
     * Gets the value of the prepaymentsAccruedIncomeInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaymentsAccruedIncomeInsuranceActivities() {
        return prepaymentsAccruedIncomeInsuranceActivities;
    }

    /**
     * Sets the value of the prepaymentsAccruedIncomeInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaymentsAccruedIncomeInsuranceActivities(AmountType value) {
        this.prepaymentsAccruedIncomeInsuranceActivities = value;
    }

    /**
     * Gets the value of the otherAssetsBankingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssetsBankingActivities() {
        return otherAssetsBankingActivities;
    }

    /**
     * Sets the value of the otherAssetsBankingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssetsBankingActivities(AmountType value) {
        this.otherAssetsBankingActivities = value;
    }

    /**
     * Gets the value of the prepaymentsAccruedIncomeBankingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaymentsAccruedIncomeBankingActivities() {
        return prepaymentsAccruedIncomeBankingActivities;
    }

    /**
     * Sets the value of the prepaymentsAccruedIncomeBankingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaymentsAccruedIncomeBankingActivities(AmountType value) {
        this.prepaymentsAccruedIncomeBankingActivities = value;
    }

    /**
     * Gets the value of the eliminations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEliminations() {
        return eliminations;
    }

    /**
     * Sets the value of the eliminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEliminations(AmountType value) {
        this.eliminations = value;
    }

    /**
     * Gets the value of the receivablesFromDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromDebtors() {
        return receivablesFromDebtors;
    }

    /**
     * Sets the value of the receivablesFromDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromDebtors(AmountType value) {
        this.receivablesFromDebtors = value;
    }

    /**
     * Gets the value of the shortTermDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShortTermDebtors() {
        return shortTermDebtors;
    }

    /**
     * Sets the value of the shortTermDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShortTermDebtors(AmountType value) {
        this.shortTermDebtors = value;
    }

    /**
     * Gets the value of the prepaymentsAccruedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaymentsAccruedIncome() {
        return prepaymentsAccruedIncome;
    }

    /**
     * Sets the value of the prepaymentsAccruedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaymentsAccruedIncome(AmountType value) {
        this.prepaymentsAccruedIncome = value;
    }

    /**
     * Gets the value of the cashBalancesAtCentralBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashBalancesAtCentralBanks() {
        return cashBalancesAtCentralBanks;
    }

    /**
     * Sets the value of the cashBalancesAtCentralBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashBalancesAtCentralBanks(AmountType value) {
        this.cashBalancesAtCentralBanks = value;
    }

    /**
     * Gets the value of the debtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtors() {
        return debtors;
    }

    /**
     * Sets the value of the debtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtors(AmountType value) {
        this.debtors = value;
    }

    /**
     * Gets the value of the debtorsDerivingFromDirectInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtorsDerivingFromDirectInsurance() {
        return debtorsDerivingFromDirectInsurance;
    }

    /**
     * Sets the value of the debtorsDerivingFromDirectInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtorsDerivingFromDirectInsurance(AmountType value) {
        this.debtorsDerivingFromDirectInsurance = value;
    }

    /**
     * Gets the value of the insuredParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuredParties() {
        return insuredParties;
    }

    /**
     * Sets the value of the insuredParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuredParties(AmountType value) {
        this.insuredParties = value;
    }

    /**
     * Gets the value of the premiumsForThePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumsForThePeriod() {
        return premiumsForThePeriod;
    }

    /**
     * Sets the value of the premiumsForThePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumsForThePeriod(AmountType value) {
        this.premiumsForThePeriod = value;
    }

    /**
     * Gets the value of the premiumsForPreviousPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumsForPreviousPeriods() {
        return premiumsForPreviousPeriods;
    }

    /**
     * Sets the value of the premiumsForPreviousPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumsForPreviousPeriods(AmountType value) {
        this.premiumsForPreviousPeriods = value;
    }

    /**
     * Gets the value of the insuranceBrokers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceBrokers() {
        return insuranceBrokers;
    }

    /**
     * Sets the value of the insuranceBrokers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceBrokers(AmountType value) {
        this.insuranceBrokers = value;
    }

    /**
     * Gets the value of the currentAccountCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentAccountCompanies() {
        return currentAccountCompanies;
    }

    /**
     * Sets the value of the currentAccountCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentAccountCompanies(AmountType value) {
        this.currentAccountCompanies = value;
    }

    /**
     * Gets the value of the thirdPartyFundsToBeRecovered property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getThirdPartyFundsToBeRecovered() {
        return thirdPartyFundsToBeRecovered;
    }

    /**
     * Sets the value of the thirdPartyFundsToBeRecovered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setThirdPartyFundsToBeRecovered(AmountType value) {
        this.thirdPartyFundsToBeRecovered = value;
    }

    /**
     * Gets the value of the amountsDerivingFromReinsuranceOperations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsDerivingFromReinsuranceOperations() {
        return amountsDerivingFromReinsuranceOperations;
    }

    /**
     * Sets the value of the amountsDerivingFromReinsuranceOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsDerivingFromReinsuranceOperations(AmountType value) {
        this.amountsDerivingFromReinsuranceOperations = value;
    }

    /**
     * Gets the value of the debtorsInsuranceReinsuranceCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtorsInsuranceReinsuranceCompanies() {
        return debtorsInsuranceReinsuranceCompanies;
    }

    /**
     * Sets the value of the debtorsInsuranceReinsuranceCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtorsInsuranceReinsuranceCompanies(AmountType value) {
        this.debtorsInsuranceReinsuranceCompanies = value;
    }

    /**
     * Gets the value of the reinsuranceBrokers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReinsuranceBrokers() {
        return reinsuranceBrokers;
    }

    /**
     * Sets the value of the reinsuranceBrokers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReinsuranceBrokers(AmountType value) {
        this.reinsuranceBrokers = value;
    }

    /**
     * Gets the value of the otherDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDebtors() {
        return otherDebtors;
    }

    /**
     * Sets the value of the otherDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDebtors(AmountType value) {
        this.otherDebtors = value;
    }

    /**
     * Gets the value of the otherAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssets() {
        return otherAssets;
    }

    /**
     * Sets the value of the otherAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssets(AmountType value) {
        this.otherAssets = value;
    }

    /**
     * Gets the value of the tangibleAssetsStocks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTangibleAssetsStocks() {
        return tangibleAssetsStocks;
    }

    /**
     * Sets the value of the tangibleAssetsStocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTangibleAssetsStocks(AmountType value) {
        this.tangibleAssetsStocks = value;
    }

    /**
     * Gets the value of the stocksSundryGoods property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStocksSundryGoods() {
        return stocksSundryGoods;
    }

    /**
     * Sets the value of the stocksSundryGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStocksSundryGoods(AmountType value) {
        this.stocksSundryGoods = value;
    }

    /**
     * Gets the value of the bankDepositsPostOfficeCurrentAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankDepositsPostOfficeCurrentAccounts() {
        return bankDepositsPostOfficeCurrentAccounts;
    }

    /**
     * Sets the value of the bankDepositsPostOfficeCurrentAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankDepositsPostOfficeCurrentAccounts(AmountType value) {
        this.bankDepositsPostOfficeCurrentAccounts = value;
    }

    /**
     * Gets the value of the checksCashInHand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChecksCashInHand() {
        return checksCashInHand;
    }

    /**
     * Sets the value of the checksCashInHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChecksCashInHand(AmountType value) {
        this.checksCashInHand = value;
    }

    /**
     * Gets the value of the otherAssetsIT property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssetsIT() {
        return otherAssetsIT;
    }

    /**
     * Sets the value of the otherAssetsIT property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssetsIT(AmountType value) {
        this.otherAssetsIT = value;
    }

    /**
     * Gets the value of the deferredChargesPrepaidExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredChargesPrepaidExpenses() {
        return deferredChargesPrepaidExpenses;
    }

    /**
     * Sets the value of the deferredChargesPrepaidExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredChargesPrepaidExpenses(AmountType value) {
        this.deferredChargesPrepaidExpenses = value;
    }

    /**
     * Gets the value of the billsDiscountedNotDue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillsDiscountedNotDue() {
        return billsDiscountedNotDue;
    }

    /**
     * Sets the value of the billsDiscountedNotDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillsDiscountedNotDue(AmountType value) {
        this.billsDiscountedNotDue = value;
    }

    /**
     * Gets the value of the specialDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialDebtors() {
        return specialDebtors;
    }

    /**
     * Sets the value of the specialDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialDebtors(AmountType value) {
        this.specialDebtors = value;
    }

    /**
     * Gets the value of the generalAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGeneralAccounts() {
        return generalAccounts;
    }

    /**
     * Sets the value of the generalAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGeneralAccounts(AmountType value) {
        this.generalAccounts = value;
    }

    /**
     * Gets the value of the bankPostalCheques property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankPostalCheques() {
        return bankPostalCheques;
    }

    /**
     * Sets the value of the bankPostalCheques property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankPostalCheques(AmountType value) {
        this.bankPostalCheques = value;
    }

    /**
     * Gets the value of the finishedGoodsMerchandise property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinishedGoodsMerchandise() {
        return finishedGoodsMerchandise;
    }

    /**
     * Sets the value of the finishedGoodsMerchandise property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinishedGoodsMerchandise(AmountType value) {
        this.finishedGoodsMerchandise = value;
    }

    /**
     * Gets the value of the otherStocksContractsinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherStocksContractsinProgress() {
        return otherStocksContractsinProgress;
    }

    /**
     * Sets the value of the otherStocksContractsinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherStocksContractsinProgress(AmountType value) {
        this.otherStocksContractsinProgress = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTrade(AmountType value) {
        this.trade = value;
    }

    /**
     * Gets the value of the cashReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashReserve() {
        return cashReserve;
    }

    /**
     * Sets the value of the cashReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashReserve(AmountType value) {
        this.cashReserve = value;
    }

    /**
     * Gets the value of the cashinHand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashinHand() {
        return cashinHand;
    }

    /**
     * Sets the value of the cashinHand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashinHand(AmountType value) {
        this.cashinHand = value;
    }

    /**
     * Gets the value of the balancesWithCentralBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalancesWithCentralBanks() {
        return balancesWithCentralBanks;
    }

    /**
     * Sets the value of the balancesWithCentralBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalancesWithCentralBanks(AmountType value) {
        this.balancesWithCentralBanks = value;
    }

    /**
     * Gets the value of the balancesWithDeutscheBundesbank property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalancesWithDeutscheBundesbank() {
        return balancesWithDeutscheBundesbank;
    }

    /**
     * Sets the value of the balancesWithDeutscheBundesbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalancesWithDeutscheBundesbank(AmountType value) {
        this.balancesWithDeutscheBundesbank = value;
    }

    /**
     * Gets the value of the balancesWithPostbank property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalancesWithPostbank() {
        return balancesWithPostbank;
    }

    /**
     * Sets the value of the balancesWithPostbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalancesWithPostbank(AmountType value) {
        this.balancesWithPostbank = value;
    }

    /**
     * Gets the value of the payableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPayableOnDemand() {
        return payableOnDemand;
    }

    /**
     * Sets the value of the payableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPayableOnDemand(AmountType value) {
        this.payableOnDemand = value;
    }

    /**
     * Gets the value of the thereofPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getThereofPayableOnDemand() {
        return thereofPayableOnDemand;
    }

    /**
     * Sets the value of the thereofPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setThereofPayableOnDemand(AmountType value) {
        this.thereofPayableOnDemand = value;
    }

    /**
     * Gets the value of the claimsOnCustomersThereofPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsOnCustomersThereofPayableOnDemand() {
        return claimsOnCustomersThereofPayableOnDemand;
    }

    /**
     * Sets the value of the claimsOnCustomersThereofPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsOnCustomersThereofPayableOnDemand(AmountType value) {
        this.claimsOnCustomersThereofPayableOnDemand = value;
    }

    /**
     * Gets the value of the reinsuranceTransitAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReinsuranceTransitAccounts() {
        return reinsuranceTransitAccounts;
    }

    /**
     * Sets the value of the reinsuranceTransitAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReinsuranceTransitAccounts(AmountType value) {
        this.reinsuranceTransitAccounts = value;
    }

    /**
     * Gets the value of the sundryAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryAssets() {
        return sundryAssets;
    }

    /**
     * Sets the value of the sundryAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryAssets(AmountType value) {
        this.sundryAssets = value;
    }

    /**
     * Gets the value of the interestReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterestReceivable() {
        return interestReceivable;
    }

    /**
     * Sets the value of the interestReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterestReceivable(AmountType value) {
        this.interestReceivable = value;
    }

    /**
     * Gets the value of the rent property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRent() {
        return rent;
    }

    /**
     * Sets the value of the rent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRent(AmountType value) {
        this.rent = value;
    }

    /**
     * Gets the value of the otherPrepaymentsAccruedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPrepaymentsAccruedIncome() {
        return otherPrepaymentsAccruedIncome;
    }

    /**
     * Sets the value of the otherPrepaymentsAccruedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPrepaymentsAccruedIncome(AmountType value) {
        this.otherPrepaymentsAccruedIncome = value;
    }

    /**
     * Gets the value of the securitiesForRefinancing property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSecuritiesForRefinancing() {
        return securitiesForRefinancing;
    }

    /**
     * Sets the value of the securitiesForRefinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSecuritiesForRefinancing(AmountType value) {
        this.securitiesForRefinancing = value;
    }

    /**
     * Gets the value of the loansAdvancesToBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAdvancesToBanks() {
        return loansAdvancesToBanks;
    }

    /**
     * Sets the value of the loansAdvancesToBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAdvancesToBanks(AmountType value) {
        this.loansAdvancesToBanks = value;
    }

    /**
     * Gets the value of the loansAdvancesToBanksOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAdvancesToBanksOnDemand() {
        return loansAdvancesToBanksOnDemand;
    }

    /**
     * Sets the value of the loansAdvancesToBanksOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAdvancesToBanksOnDemand(AmountType value) {
        this.loansAdvancesToBanksOnDemand = value;
    }

    /**
     * Gets the value of the loansAdvancesToCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAdvancesToCustomers() {
        return loansAdvancesToCustomers;
    }

    /**
     * Sets the value of the loansAdvancesToCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAdvancesToCustomers(AmountType value) {
        this.loansAdvancesToCustomers = value;
    }

    /**
     * Gets the value of the managedFunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getManagedFunds() {
        return managedFunds;
    }

    /**
     * Sets the value of the managedFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setManagedFunds(AmountType value) {
        this.managedFunds = value;
    }

    /**
     * Gets the value of the publicSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPublicSecurities() {
        return publicSecurities;
    }

    /**
     * Sets the value of the publicSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPublicSecurities(AmountType value) {
        this.publicSecurities = value;
    }

    /**
     * Gets the value of the ownSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwnSecurities() {
        return ownSecurities;
    }

    /**
     * Sets the value of the ownSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwnSecurities(AmountType value) {
        this.ownSecurities = value;
    }

    /**
     * Gets the value of the sharesQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesQuotas() {
        return sharesQuotas;
    }

    /**
     * Sets the value of the sharesQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesQuotas(AmountType value) {
        this.sharesQuotas = value;
    }

    /**
     * Gets the value of the financialAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialAssets() {
        return financialAssets;
    }

    /**
     * Sets the value of the financialAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialAssets(AmountType value) {
        this.financialAssets = value;
    }

    /**
     * Gets the value of the subscribedCapitalUnpaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubscribedCapitalUnpaid() {
        return subscribedCapitalUnpaid;
    }

    /**
     * Sets the value of the subscribedCapitalUnpaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubscribedCapitalUnpaid(AmountType value) {
        this.subscribedCapitalUnpaid = value;
    }

    /**
     * Gets the value of the bondsShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBondsShares() {
        return bondsShares;
    }

    /**
     * Sets the value of the bondsShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBondsShares(AmountType value) {
        this.bondsShares = value;
    }

    /**
     * Gets the value of the amountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsReceivable() {
        return amountsReceivable;
    }

    /**
     * Sets the value of the amountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsReceivable(AmountType value) {
        this.amountsReceivable = value;
    }

    /**
     * Gets the value of the rawMaterialsConsumables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRawMaterialsConsumables() {
        return rawMaterialsConsumables;
    }

    /**
     * Sets the value of the rawMaterialsConsumables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRawMaterialsConsumables(AmountType value) {
        this.rawMaterialsConsumables = value;
    }

    /**
     * Gets the value of the workAndContractsInprogress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWorkAndContractsInprogress() {
        return workAndContractsInprogress;
    }

    /**
     * Sets the value of the workAndContractsInprogress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWorkAndContractsInprogress(AmountType value) {
        this.workAndContractsInprogress = value;
    }

    /**
     * Gets the value of the finishedGoodsAndGoodsForResale property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinishedGoodsAndGoodsForResale() {
        return finishedGoodsAndGoodsForResale;
    }

    /**
     * Sets the value of the finishedGoodsAndGoodsForResale property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinishedGoodsAndGoodsForResale(AmountType value) {
        this.finishedGoodsAndGoodsForResale = value;
    }

    /**
     * Gets the value of the loansToNonGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToNonGroupCompanies() {
        return loansToNonGroupCompanies;
    }

    /**
     * Sets the value of the loansToNonGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToNonGroupCompanies(AmountType value) {
        this.loansToNonGroupCompanies = value;
    }

    /**
     * Gets the value of the loansDueFromAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansDueFromAffiliatedCompanies() {
        return loansDueFromAffiliatedCompanies;
    }

    /**
     * Sets the value of the loansDueFromAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansDueFromAffiliatedCompanies(AmountType value) {
        this.loansDueFromAffiliatedCompanies = value;
    }

    /**
     * Gets the value of the sharesinAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesinAffiliatedCompanies() {
        return sharesinAffiliatedCompanies;
    }

    /**
     * Sets the value of the sharesinAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesinAffiliatedCompanies(AmountType value) {
        this.sharesinAffiliatedCompanies = value;
    }

}
