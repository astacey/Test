
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldCurrentLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldCurrentLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppliersShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccrualsDeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankLoansShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsExchangePayableShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansFromPrincipals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentPortionOfLongTermDebt" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDueToGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProposedDividend" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="HirePurchaseUnderAYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansOtherFinancialBorrowingsShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLoansShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsReceivedOnAccountShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RemunerationSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditorsShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsVersusClients" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SavingsDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ImmediatelyDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DueTermorWithNoticeEndTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReDiscountBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsinFormBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PensionsSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedLoansConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedLoansNonConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesNonConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsFormLongLeaseLeasingSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebsCautionsReceivedinCash" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesRemunerationSocialSecDebtsProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntermediariesInsurees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReturnsPremiumPayableLabourAccidents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CreditInstutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuarantyDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountsInsurersReInsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentAccountForeignHeadquarters" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NationalPensionFund" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsPayableOnLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountOwedToParticipations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCurrentLiabilitiesInclAccrualsDeferedIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NCLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Creditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsDueToBanksMediumLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTradeCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RegularizationAccount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SpecialCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialAidCreditBalance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeStatedInAdvance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GeneralAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsOnFixedAsset" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankLoansOverdrafts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeAccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesFallingDueWithinOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsOnBanksPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesToCreditInstitutionsPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesToCustomersPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WithAgreedPeriodNotice3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLiabilitiesToCustomerPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsDerivingFromDirectInsuranceOperationsOwed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoInsuranceBrokers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoCurrentAccountCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoPartiesForGuaranteeDepositsPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoGuaranteeFundsInFavourOfInsuredParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsDerivingFromReinsuranceOperationsOwed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoInsuranceReinsuranceCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsowedtoReinsuranceBrokers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxationChargedToInsuredParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryTaxCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwedToWelfareSocialSecurityInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReinsuranceTransitAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CommissionsForPremiumsCurrentlyBeingCollected" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccruedExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterestPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Rent" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAccrualsDeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToBanksOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCustomersOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PayablesRepresentedBySecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAdvancesToFinancialInstitDebtsForFactoring" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwedToFinancialInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwedToFinancialInstitutionsOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwedToFinancialInstitutionsDebtsForFactoring" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PartAdvancePayments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OptionsSimilarSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToFinancialPromoters" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaturedbondsCashGuaranteesDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryCreditorsWithInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryCreditorsWithNoOrAbnormallyLowInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldCurrentLiabilitiesType", propOrder = {
    "suppliersShortTerm",
    "accrualsDeferredIncome",
    "bankLoansShortTerm",
    "billsExchangePayableShortTerm",
    "loansFromPrincipals",
    "currentPortionOfLongTermDebt",
    "taxesSocialSecurity",
    "amountDueToGroupCompanies",
    "proposedDividend",
    "hirePurchaseUnderAYear",
    "otherCurrentLiabilities",
    "totalCurrentLiabilities",
    "loansOtherFinancialBorrowingsShortTerm",
    "otherLoansShortTerm",
    "accountsPayable",
    "paymentsReceivedOnAccountShortTerm",
    "taxes",
    "remunerationSocialSecurity",
    "otherCreditorsShortTerm",
    "debtsVersusClients",
    "savingsDeposits",
    "immediatelyDue",
    "dueTermorWithNoticeEndTerm",
    "reDiscountBonds",
    "debtsinFormBonds",
    "pensionsSimilar",
    "subordinatedLoans",
    "subordinatedLoansConvertible",
    "subordinatedLoansNonConvertible",
    "unsubordinatedDebentures",
    "unsubordinatedDebenturesConvertible",
    "unsubordinatedDebenturesNonConvertible",
    "debtsFormLongLeaseLeasingSimilar",
    "otherDebsCautionsReceivedinCash",
    "taxesRemunerationSocialSecDebtsProvisions",
    "intermediariesInsurees",
    "returnsPremiumPayableLabourAccidents",
    "other",
    "creditInstutions",
    "otherDebts",
    "guarantyDeposits",
    "currentAccountsInsurersReInsurers",
    "currentAccountForeignHeadquarters",
    "nationalPensionFund",
    "amountsPayableOnLoans",
    "otherCreditors",
    "debentureLoans",
    "amountOwedToParticipations",
    "otherCurrentLiabilitiesInclAccrualsDeferedIncome",
    "ncLiabilities",
    "creditors",
    "amountsDueToBanksMediumLongTerm",
    "otherTradeCreditors",
    "regularizationAccount",
    "specialCreditors",
    "financialAidCreditBalance",
    "incomeStatedInAdvance",
    "generalAccounts",
    "debtsOnFixedAsset",
    "netIncome",
    "bankLoansOverdrafts",
    "tradeAccountsPayable",
    "liabilitiesFallingDueWithinOneYear",
    "claimsOnBanksPayableOnDemand",
    "liabilitiesToCreditInstitutionsPayableOnDemand",
    "liabilitiesToCustomersPayableOnDemand",
    "withAgreedPeriodNotice3Months",
    "otherLiabilitiesToCustomerPayableOnDemand",
    "amountsDerivingFromDirectInsuranceOperationsOwed",
    "amountsowedtoInsuranceBrokers",
    "amountsowedtoCurrentAccountCompanies",
    "amountsowedtoPartiesForGuaranteeDepositsPremiums",
    "amountsowedtoGuaranteeFundsInFavourOfInsuredParties",
    "amountsDerivingFromReinsuranceOperationsOwed",
    "amountsowedtoInsuranceReinsuranceCompanies",
    "amountsowedtoReinsuranceBrokers",
    "otherPayables",
    "taxationChargedToInsuredParties",
    "sundryTaxCharges",
    "owedToWelfareSocialSecurityInstitutions",
    "sundryPayables",
    "otherLiabilities",
    "reinsuranceTransitAccounts",
    "commissionsForPremiumsCurrentlyBeingCollected",
    "sundryLiabilities",
    "accruedExpenses",
    "interestPayable",
    "rent",
    "otherAccrualsDeferredIncome",
    "amountsOwedToBanks",
    "amountsOwedToBanksOnDemand",
    "amountsOwedToCustomers",
    "amountsOwedToCustomersOnDemand",
    "payablesRepresentedBySecurities",
    "deferredIncome",
    "loansAdvancesToFinancialInstitDebtsForFactoring",
    "owedToFinancialInstitutions",
    "owedToFinancialInstitutionsOnDemand",
    "owedToFinancialInstitutionsDebtsForFactoring",
    "partAdvancePayments",
    "optionsSimilarSecurities",
    "amountsOwedToFinancialPromoters",
    "sundryCreditors",
    "maturedbondsCashGuaranteesDebentures",
    "sundryCreditorsWithInterest",
    "sundryCreditorsWithNoOrAbnormallyLowInterest",
    "amountsOwedToCreditInstitutions",
    "tradeCreditors",
    "liabilitiesDueToAffiliatedCompanies",
    "liabilitiesDueToOtherGroupCompanies"
})
public class BalanceSheetDtldCurrentLiabilitiesType {

    @XmlElement(name = "SuppliersShortTerm")
    protected AmountType suppliersShortTerm;
    @XmlElement(name = "AccrualsDeferredIncome")
    protected AmountType accrualsDeferredIncome;
    @XmlElement(name = "BankLoansShortTerm")
    protected AmountType bankLoansShortTerm;
    @XmlElement(name = "BillsExchangePayableShortTerm")
    protected AmountType billsExchangePayableShortTerm;
    @XmlElement(name = "LoansFromPrincipals")
    protected AmountType loansFromPrincipals;
    @XmlElement(name = "CurrentPortionOfLongTermDebt")
    protected AmountType currentPortionOfLongTermDebt;
    @XmlElement(name = "TaxesSocialSecurity")
    protected AmountType taxesSocialSecurity;
    @XmlElement(name = "AmountDueToGroupCompanies")
    protected AmountType amountDueToGroupCompanies;
    @XmlElement(name = "ProposedDividend")
    protected AmountType proposedDividend;
    @XmlElement(name = "HirePurchaseUnderAYear")
    protected AmountType hirePurchaseUnderAYear;
    @XmlElement(name = "OtherCurrentLiabilities")
    protected AmountType otherCurrentLiabilities;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected AmountType totalCurrentLiabilities;
    @XmlElement(name = "LoansOtherFinancialBorrowingsShortTerm")
    protected AmountType loansOtherFinancialBorrowingsShortTerm;
    @XmlElement(name = "OtherLoansShortTerm")
    protected AmountType otherLoansShortTerm;
    @XmlElement(name = "AccountsPayable")
    protected AmountType accountsPayable;
    @XmlElement(name = "PaymentsReceivedOnAccountShortTerm")
    protected AmountType paymentsReceivedOnAccountShortTerm;
    @XmlElement(name = "Taxes")
    protected AmountType taxes;
    @XmlElement(name = "RemunerationSocialSecurity")
    protected AmountType remunerationSocialSecurity;
    @XmlElement(name = "OtherCreditorsShortTerm")
    protected AmountType otherCreditorsShortTerm;
    @XmlElement(name = "DebtsVersusClients")
    protected AmountType debtsVersusClients;
    @XmlElement(name = "SavingsDeposits")
    protected AmountType savingsDeposits;
    @XmlElement(name = "ImmediatelyDue")
    protected AmountType immediatelyDue;
    @XmlElement(name = "DueTermorWithNoticeEndTerm")
    protected AmountType dueTermorWithNoticeEndTerm;
    @XmlElement(name = "ReDiscountBonds")
    protected AmountType reDiscountBonds;
    @XmlElement(name = "DebtsinFormBonds")
    protected AmountType debtsinFormBonds;
    @XmlElement(name = "PensionsSimilar")
    protected AmountType pensionsSimilar;
    @XmlElement(name = "SubordinatedLoans")
    protected AmountType subordinatedLoans;
    @XmlElement(name = "SubordinatedLoansConvertible")
    protected AmountType subordinatedLoansConvertible;
    @XmlElement(name = "SubordinatedLoansNonConvertible")
    protected AmountType subordinatedLoansNonConvertible;
    @XmlElement(name = "UnsubordinatedDebentures")
    protected AmountType unsubordinatedDebentures;
    @XmlElement(name = "UnsubordinatedDebenturesConvertible")
    protected AmountType unsubordinatedDebenturesConvertible;
    @XmlElement(name = "UnsubordinatedDebenturesNonConvertible")
    protected AmountType unsubordinatedDebenturesNonConvertible;
    @XmlElement(name = "DebtsFormLongLeaseLeasingSimilar")
    protected AmountType debtsFormLongLeaseLeasingSimilar;
    @XmlElement(name = "OtherDebsCautionsReceivedinCash")
    protected AmountType otherDebsCautionsReceivedinCash;
    @XmlElement(name = "TaxesRemunerationSocialSecDebtsProvisions")
    protected AmountType taxesRemunerationSocialSecDebtsProvisions;
    @XmlElement(name = "IntermediariesInsurees")
    protected AmountType intermediariesInsurees;
    @XmlElement(name = "ReturnsPremiumPayableLabourAccidents")
    protected AmountType returnsPremiumPayableLabourAccidents;
    @XmlElement(name = "Other")
    protected AmountType other;
    @XmlElement(name = "CreditInstutions")
    protected AmountType creditInstutions;
    @XmlElement(name = "OtherDebts")
    protected AmountType otherDebts;
    @XmlElement(name = "GuarantyDeposits")
    protected AmountType guarantyDeposits;
    @XmlElement(name = "CurrentAccountsInsurersReInsurers")
    protected AmountType currentAccountsInsurersReInsurers;
    @XmlElement(name = "CurrentAccountForeignHeadquarters")
    protected AmountType currentAccountForeignHeadquarters;
    @XmlElement(name = "NationalPensionFund")
    protected AmountType nationalPensionFund;
    @XmlElement(name = "AmountsPayableOnLoans")
    protected AmountType amountsPayableOnLoans;
    @XmlElement(name = "OtherCreditors")
    protected AmountType otherCreditors;
    @XmlElement(name = "DebentureLoans")
    protected AmountType debentureLoans;
    @XmlElement(name = "AmountOwedToParticipations")
    protected AmountType amountOwedToParticipations;
    @XmlElement(name = "OtherCurrentLiabilitiesInclAccrualsDeferedIncome")
    protected AmountType otherCurrentLiabilitiesInclAccrualsDeferedIncome;
    @XmlElement(name = "NCLiabilities")
    protected AmountType ncLiabilities;
    @XmlElement(name = "Creditors")
    protected AmountType creditors;
    @XmlElement(name = "AmountsDueToBanksMediumLongTerm")
    protected AmountType amountsDueToBanksMediumLongTerm;
    @XmlElement(name = "OtherTradeCreditors")
    protected AmountType otherTradeCreditors;
    @XmlElement(name = "RegularizationAccount")
    protected AmountType regularizationAccount;
    @XmlElement(name = "SpecialCreditors")
    protected AmountType specialCreditors;
    @XmlElement(name = "FinancialAidCreditBalance")
    protected AmountType financialAidCreditBalance;
    @XmlElement(name = "IncomeStatedInAdvance")
    protected AmountType incomeStatedInAdvance;
    @XmlElement(name = "GeneralAccounts")
    protected AmountType generalAccounts;
    @XmlElement(name = "DebtsOnFixedAsset")
    protected AmountType debtsOnFixedAsset;
    @XmlElement(name = "NetIncome")
    protected AmountType netIncome;
    @XmlElement(name = "BankLoansOverdrafts")
    protected AmountType bankLoansOverdrafts;
    @XmlElement(name = "TradeAccountsPayable")
    protected AmountType tradeAccountsPayable;
    @XmlElement(name = "LiabilitiesFallingDueWithinOneYear")
    protected AmountType liabilitiesFallingDueWithinOneYear;
    @XmlElement(name = "ClaimsOnBanksPayableOnDemand")
    protected AmountType claimsOnBanksPayableOnDemand;
    @XmlElement(name = "LiabilitiesToCreditInstitutionsPayableOnDemand")
    protected AmountType liabilitiesToCreditInstitutionsPayableOnDemand;
    @XmlElement(name = "LiabilitiesToCustomersPayableOnDemand")
    protected AmountType liabilitiesToCustomersPayableOnDemand;
    @XmlElement(name = "WithAgreedPeriodNotice3Months")
    protected AmountType withAgreedPeriodNotice3Months;
    @XmlElement(name = "OtherLiabilitiesToCustomerPayableOnDemand")
    protected AmountType otherLiabilitiesToCustomerPayableOnDemand;
    @XmlElement(name = "AmountsDerivingFromDirectInsuranceOperationsOwed")
    protected AmountType amountsDerivingFromDirectInsuranceOperationsOwed;
    @XmlElement(name = "AmountsowedtoInsuranceBrokers")
    protected AmountType amountsowedtoInsuranceBrokers;
    @XmlElement(name = "AmountsowedtoCurrentAccountCompanies")
    protected AmountType amountsowedtoCurrentAccountCompanies;
    @XmlElement(name = "AmountsowedtoPartiesForGuaranteeDepositsPremiums")
    protected AmountType amountsowedtoPartiesForGuaranteeDepositsPremiums;
    @XmlElement(name = "AmountsowedtoGuaranteeFundsInFavourOfInsuredParties")
    protected AmountType amountsowedtoGuaranteeFundsInFavourOfInsuredParties;
    @XmlElement(name = "AmountsDerivingFromReinsuranceOperationsOwed")
    protected AmountType amountsDerivingFromReinsuranceOperationsOwed;
    @XmlElement(name = "AmountsowedtoInsuranceReinsuranceCompanies")
    protected AmountType amountsowedtoInsuranceReinsuranceCompanies;
    @XmlElement(name = "AmountsowedtoReinsuranceBrokers")
    protected AmountType amountsowedtoReinsuranceBrokers;
    @XmlElement(name = "OtherPayables")
    protected AmountType otherPayables;
    @XmlElement(name = "TaxationChargedToInsuredParties")
    protected AmountType taxationChargedToInsuredParties;
    @XmlElement(name = "SundryTaxCharges")
    protected AmountType sundryTaxCharges;
    @XmlElement(name = "OwedToWelfareSocialSecurityInstitutions")
    protected AmountType owedToWelfareSocialSecurityInstitutions;
    @XmlElement(name = "SundryPayables")
    protected AmountType sundryPayables;
    @XmlElement(name = "OtherLiabilities")
    protected AmountType otherLiabilities;
    @XmlElement(name = "ReinsuranceTransitAccounts")
    protected AmountType reinsuranceTransitAccounts;
    @XmlElement(name = "CommissionsForPremiumsCurrentlyBeingCollected")
    protected AmountType commissionsForPremiumsCurrentlyBeingCollected;
    @XmlElement(name = "SundryLiabilities")
    protected AmountType sundryLiabilities;
    @XmlElement(name = "AccruedExpenses")
    protected AmountType accruedExpenses;
    @XmlElement(name = "InterestPayable")
    protected AmountType interestPayable;
    @XmlElement(name = "Rent")
    protected AmountType rent;
    @XmlElement(name = "OtherAccrualsDeferredIncome")
    protected AmountType otherAccrualsDeferredIncome;
    @XmlElement(name = "AmountsOwedToBanks")
    protected AmountType amountsOwedToBanks;
    @XmlElement(name = "AmountsOwedToBanksOnDemand")
    protected AmountType amountsOwedToBanksOnDemand;
    @XmlElement(name = "AmountsOwedToCustomers")
    protected AmountType amountsOwedToCustomers;
    @XmlElement(name = "AmountsOwedToCustomersOnDemand")
    protected AmountType amountsOwedToCustomersOnDemand;
    @XmlElement(name = "PayablesRepresentedBySecurities")
    protected AmountType payablesRepresentedBySecurities;
    @XmlElement(name = "DeferredIncome")
    protected AmountType deferredIncome;
    @XmlElement(name = "LoansAdvancesToFinancialInstitDebtsForFactoring")
    protected AmountType loansAdvancesToFinancialInstitDebtsForFactoring;
    @XmlElement(name = "OwedToFinancialInstitutions")
    protected AmountType owedToFinancialInstitutions;
    @XmlElement(name = "OwedToFinancialInstitutionsOnDemand")
    protected AmountType owedToFinancialInstitutionsOnDemand;
    @XmlElement(name = "OwedToFinancialInstitutionsDebtsForFactoring")
    protected AmountType owedToFinancialInstitutionsDebtsForFactoring;
    @XmlElement(name = "PartAdvancePayments")
    protected AmountType partAdvancePayments;
    @XmlElement(name = "OptionsSimilarSecurities")
    protected AmountType optionsSimilarSecurities;
    @XmlElement(name = "AmountsOwedToFinancialPromoters")
    protected AmountType amountsOwedToFinancialPromoters;
    @XmlElement(name = "SundryCreditors")
    protected AmountType sundryCreditors;
    @XmlElement(name = "MaturedbondsCashGuaranteesDebentures")
    protected AmountType maturedbondsCashGuaranteesDebentures;
    @XmlElement(name = "SundryCreditorsWithInterest")
    protected AmountType sundryCreditorsWithInterest;
    @XmlElement(name = "SundryCreditorsWithNoOrAbnormallyLowInterest")
    protected AmountType sundryCreditorsWithNoOrAbnormallyLowInterest;
    @XmlElement(name = "AmountsOwedToCreditInstitutions")
    protected AmountType amountsOwedToCreditInstitutions;
    @XmlElement(name = "TradeCreditors")
    protected AmountType tradeCreditors;
    @XmlElement(name = "LiabilitiesDueToAffiliatedCompanies")
    protected AmountType liabilitiesDueToAffiliatedCompanies;
    @XmlElement(name = "LiabilitiesDueToOtherGroupCompanies")
    protected AmountType liabilitiesDueToOtherGroupCompanies;

    /**
     * Gets the value of the suppliersShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSuppliersShortTerm() {
        return suppliersShortTerm;
    }

    /**
     * Sets the value of the suppliersShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSuppliersShortTerm(AmountType value) {
        this.suppliersShortTerm = value;
    }

    /**
     * Gets the value of the accrualsDeferredIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccrualsDeferredIncome() {
        return accrualsDeferredIncome;
    }

    /**
     * Sets the value of the accrualsDeferredIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccrualsDeferredIncome(AmountType value) {
        this.accrualsDeferredIncome = value;
    }

    /**
     * Gets the value of the bankLoansShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankLoansShortTerm() {
        return bankLoansShortTerm;
    }

    /**
     * Sets the value of the bankLoansShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankLoansShortTerm(AmountType value) {
        this.bankLoansShortTerm = value;
    }

    /**
     * Gets the value of the billsExchangePayableShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillsExchangePayableShortTerm() {
        return billsExchangePayableShortTerm;
    }

    /**
     * Sets the value of the billsExchangePayableShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillsExchangePayableShortTerm(AmountType value) {
        this.billsExchangePayableShortTerm = value;
    }

    /**
     * Gets the value of the loansFromPrincipals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansFromPrincipals() {
        return loansFromPrincipals;
    }

    /**
     * Sets the value of the loansFromPrincipals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansFromPrincipals(AmountType value) {
        this.loansFromPrincipals = value;
    }

    /**
     * Gets the value of the currentPortionOfLongTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentPortionOfLongTermDebt() {
        return currentPortionOfLongTermDebt;
    }

    /**
     * Sets the value of the currentPortionOfLongTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentPortionOfLongTermDebt(AmountType value) {
        this.currentPortionOfLongTermDebt = value;
    }

    /**
     * Gets the value of the taxesSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxesSocialSecurity() {
        return taxesSocialSecurity;
    }

    /**
     * Sets the value of the taxesSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxesSocialSecurity(AmountType value) {
        this.taxesSocialSecurity = value;
    }

    /**
     * Gets the value of the amountDueToGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountDueToGroupCompanies() {
        return amountDueToGroupCompanies;
    }

    /**
     * Sets the value of the amountDueToGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountDueToGroupCompanies(AmountType value) {
        this.amountDueToGroupCompanies = value;
    }

    /**
     * Gets the value of the proposedDividend property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProposedDividend() {
        return proposedDividend;
    }

    /**
     * Sets the value of the proposedDividend property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProposedDividend(AmountType value) {
        this.proposedDividend = value;
    }

    /**
     * Gets the value of the hirePurchaseUnderAYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHirePurchaseUnderAYear() {
        return hirePurchaseUnderAYear;
    }

    /**
     * Sets the value of the hirePurchaseUnderAYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHirePurchaseUnderAYear(AmountType value) {
        this.hirePurchaseUnderAYear = value;
    }

    /**
     * Gets the value of the otherCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCurrentLiabilities() {
        return otherCurrentLiabilities;
    }

    /**
     * Sets the value of the otherCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCurrentLiabilities(AmountType value) {
        this.otherCurrentLiabilities = value;
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
     * Gets the value of the loansOtherFinancialBorrowingsShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansOtherFinancialBorrowingsShortTerm() {
        return loansOtherFinancialBorrowingsShortTerm;
    }

    /**
     * Sets the value of the loansOtherFinancialBorrowingsShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansOtherFinancialBorrowingsShortTerm(AmountType value) {
        this.loansOtherFinancialBorrowingsShortTerm = value;
    }

    /**
     * Gets the value of the otherLoansShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLoansShortTerm() {
        return otherLoansShortTerm;
    }

    /**
     * Sets the value of the otherLoansShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLoansShortTerm(AmountType value) {
        this.otherLoansShortTerm = value;
    }

    /**
     * Gets the value of the accountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsPayable() {
        return accountsPayable;
    }

    /**
     * Sets the value of the accountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsPayable(AmountType value) {
        this.accountsPayable = value;
    }

    /**
     * Gets the value of the paymentsReceivedOnAccountShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentsReceivedOnAccountShortTerm() {
        return paymentsReceivedOnAccountShortTerm;
    }

    /**
     * Sets the value of the paymentsReceivedOnAccountShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentsReceivedOnAccountShortTerm(AmountType value) {
        this.paymentsReceivedOnAccountShortTerm = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxes(AmountType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the remunerationSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationSocialSecurity() {
        return remunerationSocialSecurity;
    }

    /**
     * Sets the value of the remunerationSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationSocialSecurity(AmountType value) {
        this.remunerationSocialSecurity = value;
    }

    /**
     * Gets the value of the otherCreditorsShortTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditorsShortTerm() {
        return otherCreditorsShortTerm;
    }

    /**
     * Sets the value of the otherCreditorsShortTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditorsShortTerm(AmountType value) {
        this.otherCreditorsShortTerm = value;
    }

    /**
     * Gets the value of the debtsVersusClients property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsVersusClients() {
        return debtsVersusClients;
    }

    /**
     * Sets the value of the debtsVersusClients property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsVersusClients(AmountType value) {
        this.debtsVersusClients = value;
    }

    /**
     * Gets the value of the savingsDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSavingsDeposits() {
        return savingsDeposits;
    }

    /**
     * Sets the value of the savingsDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSavingsDeposits(AmountType value) {
        this.savingsDeposits = value;
    }

    /**
     * Gets the value of the immediatelyDue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImmediatelyDue() {
        return immediatelyDue;
    }

    /**
     * Sets the value of the immediatelyDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImmediatelyDue(AmountType value) {
        this.immediatelyDue = value;
    }

    /**
     * Gets the value of the dueTermorWithNoticeEndTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDueTermorWithNoticeEndTerm() {
        return dueTermorWithNoticeEndTerm;
    }

    /**
     * Sets the value of the dueTermorWithNoticeEndTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDueTermorWithNoticeEndTerm(AmountType value) {
        this.dueTermorWithNoticeEndTerm = value;
    }

    /**
     * Gets the value of the reDiscountBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReDiscountBonds() {
        return reDiscountBonds;
    }

    /**
     * Sets the value of the reDiscountBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReDiscountBonds(AmountType value) {
        this.reDiscountBonds = value;
    }

    /**
     * Gets the value of the debtsinFormBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsinFormBonds() {
        return debtsinFormBonds;
    }

    /**
     * Sets the value of the debtsinFormBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsinFormBonds(AmountType value) {
        this.debtsinFormBonds = value;
    }

    /**
     * Gets the value of the pensionsSimilar property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPensionsSimilar() {
        return pensionsSimilar;
    }

    /**
     * Sets the value of the pensionsSimilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPensionsSimilar(AmountType value) {
        this.pensionsSimilar = value;
    }

    /**
     * Gets the value of the subordinatedLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedLoans() {
        return subordinatedLoans;
    }

    /**
     * Sets the value of the subordinatedLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedLoans(AmountType value) {
        this.subordinatedLoans = value;
    }

    /**
     * Gets the value of the subordinatedLoansConvertible property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedLoansConvertible() {
        return subordinatedLoansConvertible;
    }

    /**
     * Sets the value of the subordinatedLoansConvertible property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedLoansConvertible(AmountType value) {
        this.subordinatedLoansConvertible = value;
    }

    /**
     * Gets the value of the subordinatedLoansNonConvertible property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedLoansNonConvertible() {
        return subordinatedLoansNonConvertible;
    }

    /**
     * Sets the value of the subordinatedLoansNonConvertible property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedLoansNonConvertible(AmountType value) {
        this.subordinatedLoansNonConvertible = value;
    }

    /**
     * Gets the value of the unsubordinatedDebentures property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnsubordinatedDebentures() {
        return unsubordinatedDebentures;
    }

    /**
     * Sets the value of the unsubordinatedDebentures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnsubordinatedDebentures(AmountType value) {
        this.unsubordinatedDebentures = value;
    }

    /**
     * Gets the value of the unsubordinatedDebenturesConvertible property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnsubordinatedDebenturesConvertible() {
        return unsubordinatedDebenturesConvertible;
    }

    /**
     * Sets the value of the unsubordinatedDebenturesConvertible property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnsubordinatedDebenturesConvertible(AmountType value) {
        this.unsubordinatedDebenturesConvertible = value;
    }

    /**
     * Gets the value of the unsubordinatedDebenturesNonConvertible property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnsubordinatedDebenturesNonConvertible() {
        return unsubordinatedDebenturesNonConvertible;
    }

    /**
     * Sets the value of the unsubordinatedDebenturesNonConvertible property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnsubordinatedDebenturesNonConvertible(AmountType value) {
        this.unsubordinatedDebenturesNonConvertible = value;
    }

    /**
     * Gets the value of the debtsFormLongLeaseLeasingSimilar property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsFormLongLeaseLeasingSimilar() {
        return debtsFormLongLeaseLeasingSimilar;
    }

    /**
     * Sets the value of the debtsFormLongLeaseLeasingSimilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsFormLongLeaseLeasingSimilar(AmountType value) {
        this.debtsFormLongLeaseLeasingSimilar = value;
    }

    /**
     * Gets the value of the otherDebsCautionsReceivedinCash property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDebsCautionsReceivedinCash() {
        return otherDebsCautionsReceivedinCash;
    }

    /**
     * Sets the value of the otherDebsCautionsReceivedinCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDebsCautionsReceivedinCash(AmountType value) {
        this.otherDebsCautionsReceivedinCash = value;
    }

    /**
     * Gets the value of the taxesRemunerationSocialSecDebtsProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxesRemunerationSocialSecDebtsProvisions() {
        return taxesRemunerationSocialSecDebtsProvisions;
    }

    /**
     * Sets the value of the taxesRemunerationSocialSecDebtsProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxesRemunerationSocialSecDebtsProvisions(AmountType value) {
        this.taxesRemunerationSocialSecDebtsProvisions = value;
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
     * Gets the value of the returnsPremiumPayableLabourAccidents property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReturnsPremiumPayableLabourAccidents() {
        return returnsPremiumPayableLabourAccidents;
    }

    /**
     * Sets the value of the returnsPremiumPayableLabourAccidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReturnsPremiumPayableLabourAccidents(AmountType value) {
        this.returnsPremiumPayableLabourAccidents = value;
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
     * Gets the value of the creditInstutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditInstutions() {
        return creditInstutions;
    }

    /**
     * Sets the value of the creditInstutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditInstutions(AmountType value) {
        this.creditInstutions = value;
    }

    /**
     * Gets the value of the otherDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDebts() {
        return otherDebts;
    }

    /**
     * Sets the value of the otherDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDebts(AmountType value) {
        this.otherDebts = value;
    }

    /**
     * Gets the value of the guarantyDeposits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuarantyDeposits() {
        return guarantyDeposits;
    }

    /**
     * Sets the value of the guarantyDeposits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuarantyDeposits(AmountType value) {
        this.guarantyDeposits = value;
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
     * Gets the value of the nationalPensionFund property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNationalPensionFund() {
        return nationalPensionFund;
    }

    /**
     * Sets the value of the nationalPensionFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNationalPensionFund(AmountType value) {
        this.nationalPensionFund = value;
    }

    /**
     * Gets the value of the amountsPayableOnLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsPayableOnLoans() {
        return amountsPayableOnLoans;
    }

    /**
     * Sets the value of the amountsPayableOnLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsPayableOnLoans(AmountType value) {
        this.amountsPayableOnLoans = value;
    }

    /**
     * Gets the value of the otherCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditors() {
        return otherCreditors;
    }

    /**
     * Sets the value of the otherCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditors(AmountType value) {
        this.otherCreditors = value;
    }

    /**
     * Gets the value of the debentureLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebentureLoans() {
        return debentureLoans;
    }

    /**
     * Sets the value of the debentureLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebentureLoans(AmountType value) {
        this.debentureLoans = value;
    }

    /**
     * Gets the value of the amountOwedToParticipations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountOwedToParticipations() {
        return amountOwedToParticipations;
    }

    /**
     * Sets the value of the amountOwedToParticipations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountOwedToParticipations(AmountType value) {
        this.amountOwedToParticipations = value;
    }

    /**
     * Gets the value of the otherCurrentLiabilitiesInclAccrualsDeferedIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCurrentLiabilitiesInclAccrualsDeferedIncome() {
        return otherCurrentLiabilitiesInclAccrualsDeferedIncome;
    }

    /**
     * Sets the value of the otherCurrentLiabilitiesInclAccrualsDeferedIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCurrentLiabilitiesInclAccrualsDeferedIncome(AmountType value) {
        this.otherCurrentLiabilitiesInclAccrualsDeferedIncome = value;
    }

    /**
     * Gets the value of the ncLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNCLiabilities() {
        return ncLiabilities;
    }

    /**
     * Sets the value of the ncLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNCLiabilities(AmountType value) {
        this.ncLiabilities = value;
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
     * Gets the value of the amountsDueToBanksMediumLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsDueToBanksMediumLongTerm() {
        return amountsDueToBanksMediumLongTerm;
    }

    /**
     * Sets the value of the amountsDueToBanksMediumLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsDueToBanksMediumLongTerm(AmountType value) {
        this.amountsDueToBanksMediumLongTerm = value;
    }

    /**
     * Gets the value of the otherTradeCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTradeCreditors() {
        return otherTradeCreditors;
    }

    /**
     * Sets the value of the otherTradeCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTradeCreditors(AmountType value) {
        this.otherTradeCreditors = value;
    }

    /**
     * Gets the value of the regularizationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRegularizationAccount() {
        return regularizationAccount;
    }

    /**
     * Sets the value of the regularizationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRegularizationAccount(AmountType value) {
        this.regularizationAccount = value;
    }

    /**
     * Gets the value of the specialCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialCreditors() {
        return specialCreditors;
    }

    /**
     * Sets the value of the specialCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialCreditors(AmountType value) {
        this.specialCreditors = value;
    }

    /**
     * Gets the value of the financialAidCreditBalance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialAidCreditBalance() {
        return financialAidCreditBalance;
    }

    /**
     * Sets the value of the financialAidCreditBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialAidCreditBalance(AmountType value) {
        this.financialAidCreditBalance = value;
    }

    /**
     * Gets the value of the incomeStatedInAdvance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeStatedInAdvance() {
        return incomeStatedInAdvance;
    }

    /**
     * Sets the value of the incomeStatedInAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeStatedInAdvance(AmountType value) {
        this.incomeStatedInAdvance = value;
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
     * Gets the value of the debtsOnFixedAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsOnFixedAsset() {
        return debtsOnFixedAsset;
    }

    /**
     * Sets the value of the debtsOnFixedAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsOnFixedAsset(AmountType value) {
        this.debtsOnFixedAsset = value;
    }

    /**
     * Gets the value of the netIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetIncome() {
        return netIncome;
    }

    /**
     * Sets the value of the netIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetIncome(AmountType value) {
        this.netIncome = value;
    }

    /**
     * Gets the value of the bankLoansOverdrafts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankLoansOverdrafts() {
        return bankLoansOverdrafts;
    }

    /**
     * Sets the value of the bankLoansOverdrafts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankLoansOverdrafts(AmountType value) {
        this.bankLoansOverdrafts = value;
    }

    /**
     * Gets the value of the tradeAccountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeAccountsPayable() {
        return tradeAccountsPayable;
    }

    /**
     * Sets the value of the tradeAccountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeAccountsPayable(AmountType value) {
        this.tradeAccountsPayable = value;
    }

    /**
     * Gets the value of the liabilitiesFallingDueWithinOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFallingDueWithinOneYear() {
        return liabilitiesFallingDueWithinOneYear;
    }

    /**
     * Sets the value of the liabilitiesFallingDueWithinOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFallingDueWithinOneYear(AmountType value) {
        this.liabilitiesFallingDueWithinOneYear = value;
    }

    /**
     * Gets the value of the claimsOnBanksPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsOnBanksPayableOnDemand() {
        return claimsOnBanksPayableOnDemand;
    }

    /**
     * Sets the value of the claimsOnBanksPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsOnBanksPayableOnDemand(AmountType value) {
        this.claimsOnBanksPayableOnDemand = value;
    }

    /**
     * Gets the value of the liabilitiesToCreditInstitutionsPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesToCreditInstitutionsPayableOnDemand() {
        return liabilitiesToCreditInstitutionsPayableOnDemand;
    }

    /**
     * Sets the value of the liabilitiesToCreditInstitutionsPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesToCreditInstitutionsPayableOnDemand(AmountType value) {
        this.liabilitiesToCreditInstitutionsPayableOnDemand = value;
    }

    /**
     * Gets the value of the liabilitiesToCustomersPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesToCustomersPayableOnDemand() {
        return liabilitiesToCustomersPayableOnDemand;
    }

    /**
     * Sets the value of the liabilitiesToCustomersPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesToCustomersPayableOnDemand(AmountType value) {
        this.liabilitiesToCustomersPayableOnDemand = value;
    }

    /**
     * Gets the value of the withAgreedPeriodNotice3Months property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWithAgreedPeriodNotice3Months() {
        return withAgreedPeriodNotice3Months;
    }

    /**
     * Sets the value of the withAgreedPeriodNotice3Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWithAgreedPeriodNotice3Months(AmountType value) {
        this.withAgreedPeriodNotice3Months = value;
    }

    /**
     * Gets the value of the otherLiabilitiesToCustomerPayableOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLiabilitiesToCustomerPayableOnDemand() {
        return otherLiabilitiesToCustomerPayableOnDemand;
    }

    /**
     * Sets the value of the otherLiabilitiesToCustomerPayableOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLiabilitiesToCustomerPayableOnDemand(AmountType value) {
        this.otherLiabilitiesToCustomerPayableOnDemand = value;
    }

    /**
     * Gets the value of the amountsDerivingFromDirectInsuranceOperationsOwed property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsDerivingFromDirectInsuranceOperationsOwed() {
        return amountsDerivingFromDirectInsuranceOperationsOwed;
    }

    /**
     * Sets the value of the amountsDerivingFromDirectInsuranceOperationsOwed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsDerivingFromDirectInsuranceOperationsOwed(AmountType value) {
        this.amountsDerivingFromDirectInsuranceOperationsOwed = value;
    }

    /**
     * Gets the value of the amountsowedtoInsuranceBrokers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoInsuranceBrokers() {
        return amountsowedtoInsuranceBrokers;
    }

    /**
     * Sets the value of the amountsowedtoInsuranceBrokers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoInsuranceBrokers(AmountType value) {
        this.amountsowedtoInsuranceBrokers = value;
    }

    /**
     * Gets the value of the amountsowedtoCurrentAccountCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoCurrentAccountCompanies() {
        return amountsowedtoCurrentAccountCompanies;
    }

    /**
     * Sets the value of the amountsowedtoCurrentAccountCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoCurrentAccountCompanies(AmountType value) {
        this.amountsowedtoCurrentAccountCompanies = value;
    }

    /**
     * Gets the value of the amountsowedtoPartiesForGuaranteeDepositsPremiums property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoPartiesForGuaranteeDepositsPremiums() {
        return amountsowedtoPartiesForGuaranteeDepositsPremiums;
    }

    /**
     * Sets the value of the amountsowedtoPartiesForGuaranteeDepositsPremiums property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoPartiesForGuaranteeDepositsPremiums(AmountType value) {
        this.amountsowedtoPartiesForGuaranteeDepositsPremiums = value;
    }

    /**
     * Gets the value of the amountsowedtoGuaranteeFundsInFavourOfInsuredParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoGuaranteeFundsInFavourOfInsuredParties() {
        return amountsowedtoGuaranteeFundsInFavourOfInsuredParties;
    }

    /**
     * Sets the value of the amountsowedtoGuaranteeFundsInFavourOfInsuredParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoGuaranteeFundsInFavourOfInsuredParties(AmountType value) {
        this.amountsowedtoGuaranteeFundsInFavourOfInsuredParties = value;
    }

    /**
     * Gets the value of the amountsDerivingFromReinsuranceOperationsOwed property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsDerivingFromReinsuranceOperationsOwed() {
        return amountsDerivingFromReinsuranceOperationsOwed;
    }

    /**
     * Sets the value of the amountsDerivingFromReinsuranceOperationsOwed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsDerivingFromReinsuranceOperationsOwed(AmountType value) {
        this.amountsDerivingFromReinsuranceOperationsOwed = value;
    }

    /**
     * Gets the value of the amountsowedtoInsuranceReinsuranceCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoInsuranceReinsuranceCompanies() {
        return amountsowedtoInsuranceReinsuranceCompanies;
    }

    /**
     * Sets the value of the amountsowedtoInsuranceReinsuranceCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoInsuranceReinsuranceCompanies(AmountType value) {
        this.amountsowedtoInsuranceReinsuranceCompanies = value;
    }

    /**
     * Gets the value of the amountsowedtoReinsuranceBrokers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsowedtoReinsuranceBrokers() {
        return amountsowedtoReinsuranceBrokers;
    }

    /**
     * Sets the value of the amountsowedtoReinsuranceBrokers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsowedtoReinsuranceBrokers(AmountType value) {
        this.amountsowedtoReinsuranceBrokers = value;
    }

    /**
     * Gets the value of the otherPayables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPayables() {
        return otherPayables;
    }

    /**
     * Sets the value of the otherPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPayables(AmountType value) {
        this.otherPayables = value;
    }

    /**
     * Gets the value of the taxationChargedToInsuredParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxationChargedToInsuredParties() {
        return taxationChargedToInsuredParties;
    }

    /**
     * Sets the value of the taxationChargedToInsuredParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxationChargedToInsuredParties(AmountType value) {
        this.taxationChargedToInsuredParties = value;
    }

    /**
     * Gets the value of the sundryTaxCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryTaxCharges() {
        return sundryTaxCharges;
    }

    /**
     * Sets the value of the sundryTaxCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryTaxCharges(AmountType value) {
        this.sundryTaxCharges = value;
    }

    /**
     * Gets the value of the owedToWelfareSocialSecurityInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedToWelfareSocialSecurityInstitutions() {
        return owedToWelfareSocialSecurityInstitutions;
    }

    /**
     * Sets the value of the owedToWelfareSocialSecurityInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedToWelfareSocialSecurityInstitutions(AmountType value) {
        this.owedToWelfareSocialSecurityInstitutions = value;
    }

    /**
     * Gets the value of the sundryPayables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryPayables() {
        return sundryPayables;
    }

    /**
     * Sets the value of the sundryPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryPayables(AmountType value) {
        this.sundryPayables = value;
    }

    /**
     * Gets the value of the otherLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLiabilities() {
        return otherLiabilities;
    }

    /**
     * Sets the value of the otherLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLiabilities(AmountType value) {
        this.otherLiabilities = value;
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
     * Gets the value of the commissionsForPremiumsCurrentlyBeingCollected property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCommissionsForPremiumsCurrentlyBeingCollected() {
        return commissionsForPremiumsCurrentlyBeingCollected;
    }

    /**
     * Sets the value of the commissionsForPremiumsCurrentlyBeingCollected property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCommissionsForPremiumsCurrentlyBeingCollected(AmountType value) {
        this.commissionsForPremiumsCurrentlyBeingCollected = value;
    }

    /**
     * Gets the value of the sundryLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryLiabilities() {
        return sundryLiabilities;
    }

    /**
     * Sets the value of the sundryLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryLiabilities(AmountType value) {
        this.sundryLiabilities = value;
    }

    /**
     * Gets the value of the accruedExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccruedExpenses() {
        return accruedExpenses;
    }

    /**
     * Sets the value of the accruedExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccruedExpenses(AmountType value) {
        this.accruedExpenses = value;
    }

    /**
     * Gets the value of the interestPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterestPayable() {
        return interestPayable;
    }

    /**
     * Sets the value of the interestPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterestPayable(AmountType value) {
        this.interestPayable = value;
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
     * Gets the value of the otherAccrualsDeferredIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAccrualsDeferredIncome() {
        return otherAccrualsDeferredIncome;
    }

    /**
     * Sets the value of the otherAccrualsDeferredIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAccrualsDeferredIncome(AmountType value) {
        this.otherAccrualsDeferredIncome = value;
    }

    /**
     * Gets the value of the amountsOwedToBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToBanks() {
        return amountsOwedToBanks;
    }

    /**
     * Sets the value of the amountsOwedToBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToBanks(AmountType value) {
        this.amountsOwedToBanks = value;
    }

    /**
     * Gets the value of the amountsOwedToBanksOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToBanksOnDemand() {
        return amountsOwedToBanksOnDemand;
    }

    /**
     * Sets the value of the amountsOwedToBanksOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToBanksOnDemand(AmountType value) {
        this.amountsOwedToBanksOnDemand = value;
    }

    /**
     * Gets the value of the amountsOwedToCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToCustomers() {
        return amountsOwedToCustomers;
    }

    /**
     * Sets the value of the amountsOwedToCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToCustomers(AmountType value) {
        this.amountsOwedToCustomers = value;
    }

    /**
     * Gets the value of the amountsOwedToCustomersOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToCustomersOnDemand() {
        return amountsOwedToCustomersOnDemand;
    }

    /**
     * Sets the value of the amountsOwedToCustomersOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToCustomersOnDemand(AmountType value) {
        this.amountsOwedToCustomersOnDemand = value;
    }

    /**
     * Gets the value of the payablesRepresentedBySecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPayablesRepresentedBySecurities() {
        return payablesRepresentedBySecurities;
    }

    /**
     * Sets the value of the payablesRepresentedBySecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPayablesRepresentedBySecurities(AmountType value) {
        this.payablesRepresentedBySecurities = value;
    }

    /**
     * Gets the value of the deferredIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredIncome() {
        return deferredIncome;
    }

    /**
     * Sets the value of the deferredIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredIncome(AmountType value) {
        this.deferredIncome = value;
    }

    /**
     * Gets the value of the loansAdvancesToFinancialInstitDebtsForFactoring property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAdvancesToFinancialInstitDebtsForFactoring() {
        return loansAdvancesToFinancialInstitDebtsForFactoring;
    }

    /**
     * Sets the value of the loansAdvancesToFinancialInstitDebtsForFactoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAdvancesToFinancialInstitDebtsForFactoring(AmountType value) {
        this.loansAdvancesToFinancialInstitDebtsForFactoring = value;
    }

    /**
     * Gets the value of the owedToFinancialInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedToFinancialInstitutions() {
        return owedToFinancialInstitutions;
    }

    /**
     * Sets the value of the owedToFinancialInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedToFinancialInstitutions(AmountType value) {
        this.owedToFinancialInstitutions = value;
    }

    /**
     * Gets the value of the owedToFinancialInstitutionsOnDemand property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedToFinancialInstitutionsOnDemand() {
        return owedToFinancialInstitutionsOnDemand;
    }

    /**
     * Sets the value of the owedToFinancialInstitutionsOnDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedToFinancialInstitutionsOnDemand(AmountType value) {
        this.owedToFinancialInstitutionsOnDemand = value;
    }

    /**
     * Gets the value of the owedToFinancialInstitutionsDebtsForFactoring property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwedToFinancialInstitutionsDebtsForFactoring() {
        return owedToFinancialInstitutionsDebtsForFactoring;
    }

    /**
     * Sets the value of the owedToFinancialInstitutionsDebtsForFactoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwedToFinancialInstitutionsDebtsForFactoring(AmountType value) {
        this.owedToFinancialInstitutionsDebtsForFactoring = value;
    }

    /**
     * Gets the value of the partAdvancePayments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPartAdvancePayments() {
        return partAdvancePayments;
    }

    /**
     * Sets the value of the partAdvancePayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPartAdvancePayments(AmountType value) {
        this.partAdvancePayments = value;
    }

    /**
     * Gets the value of the optionsSimilarSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOptionsSimilarSecurities() {
        return optionsSimilarSecurities;
    }

    /**
     * Sets the value of the optionsSimilarSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOptionsSimilarSecurities(AmountType value) {
        this.optionsSimilarSecurities = value;
    }

    /**
     * Gets the value of the amountsOwedToFinancialPromoters property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToFinancialPromoters() {
        return amountsOwedToFinancialPromoters;
    }

    /**
     * Sets the value of the amountsOwedToFinancialPromoters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToFinancialPromoters(AmountType value) {
        this.amountsOwedToFinancialPromoters = value;
    }

    /**
     * Gets the value of the sundryCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryCreditors() {
        return sundryCreditors;
    }

    /**
     * Sets the value of the sundryCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryCreditors(AmountType value) {
        this.sundryCreditors = value;
    }

    /**
     * Gets the value of the maturedbondsCashGuaranteesDebentures property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaturedbondsCashGuaranteesDebentures() {
        return maturedbondsCashGuaranteesDebentures;
    }

    /**
     * Sets the value of the maturedbondsCashGuaranteesDebentures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaturedbondsCashGuaranteesDebentures(AmountType value) {
        this.maturedbondsCashGuaranteesDebentures = value;
    }

    /**
     * Gets the value of the sundryCreditorsWithInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryCreditorsWithInterest() {
        return sundryCreditorsWithInterest;
    }

    /**
     * Sets the value of the sundryCreditorsWithInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryCreditorsWithInterest(AmountType value) {
        this.sundryCreditorsWithInterest = value;
    }

    /**
     * Gets the value of the sundryCreditorsWithNoOrAbnormallyLowInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryCreditorsWithNoOrAbnormallyLowInterest() {
        return sundryCreditorsWithNoOrAbnormallyLowInterest;
    }

    /**
     * Sets the value of the sundryCreditorsWithNoOrAbnormallyLowInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryCreditorsWithNoOrAbnormallyLowInterest(AmountType value) {
        this.sundryCreditorsWithNoOrAbnormallyLowInterest = value;
    }

    /**
     * Gets the value of the amountsOwedToCreditInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToCreditInstitutions() {
        return amountsOwedToCreditInstitutions;
    }

    /**
     * Sets the value of the amountsOwedToCreditInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToCreditInstitutions(AmountType value) {
        this.amountsOwedToCreditInstitutions = value;
    }

    /**
     * Gets the value of the tradeCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeCreditors() {
        return tradeCreditors;
    }

    /**
     * Sets the value of the tradeCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeCreditors(AmountType value) {
        this.tradeCreditors = value;
    }

    /**
     * Gets the value of the liabilitiesDueToAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToAffiliatedCompanies() {
        return liabilitiesDueToAffiliatedCompanies;
    }

    /**
     * Sets the value of the liabilitiesDueToAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToAffiliatedCompanies(AmountType value) {
        this.liabilitiesDueToAffiliatedCompanies = value;
    }

    /**
     * Gets the value of the liabilitiesDueToOtherGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToOtherGroupCompanies() {
        return liabilitiesDueToOtherGroupCompanies;
    }

    /**
     * Sets the value of the liabilitiesDueToOtherGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToOtherGroupCompanies(AmountType value) {
        this.liabilitiesDueToOtherGroupCompanies = value;
    }

}
