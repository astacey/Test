
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldNonCurrentLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldNonCurrentLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DebtsToGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Taxation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MortgagesLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="HirePurchaseOverAYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MinorityInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLongTermLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PensionsSimilarObligations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CreditorsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialDebtsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialLeasingAgreementsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LeasingOtherSimilarRightsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialInstitutionsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLoansLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeCreditorsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SuppliersLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsOfExchangePayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditorsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsVersusCreditBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ImmediatelyPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsForReDiscountBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebtsDueTermorWithNoticeEndTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebenturesSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForReorganisation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForDoubtfulDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertableDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsReceivedOnAccountLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DueToParticipants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterestBearingSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Allowances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntangibleAssetDepreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForStockDepreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsWrittenOffTradeDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForFuturePurchases" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccrualsDeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MiscellaneousLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebenturesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToBanksAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesToOtherCreditorsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeAccountsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesFromLeaseDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesFromSupervisionDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesToHospitalFoundationCarrierDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesAccordingToHospitalFinancingActDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesFromGovernmentalSubsidiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDonationsForFinancingInstallationsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonGovermentalPromotionInvestmentsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToAffiliatesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToJointVenturesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToShareholdersAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToOtherGroupCompaniesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResidualLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TherefromLiabilitiesFallingDueMoreThanFiveYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Tier2Capital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForRisksCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForPensionsSimilarObligations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForTaxation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositsReceivedFromReinsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SecuredDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SundryLoansOtherFinancialPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionforSeveranceIndemnity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PayablesRepresentedBySecuritiesBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAssetsUnderManagement" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForBadLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForGeneralFinancialRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaymentstoOwners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditorsNonProfitInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Institutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditorsWithNoOrAbnormallyLowInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedRevenueSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredTaxLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesNonConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsExchangePayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldNonCurrentLiabilitiesType", propOrder = {
    "debtsToGroupCompanies",
    "taxation",
    "mortgagesLoans",
    "hirePurchaseOverAYear",
    "minorityInterest",
    "otherLongTermLiabilities",
    "totalLongTermLiabilities",
    "pensionsSimilarObligations",
    "otherProvisions",
    "creditorsLongTerm",
    "financialDebtsLongTerm",
    "financialLeasingAgreementsLongTerm",
    "subordinatedLoans",
    "unsubordinatedDebentureLoans",
    "leasingOtherSimilarRightsLongTerm",
    "financialInstitutionsLongTerm",
    "otherLoansLongTerm",
    "tradeCreditorsLongTerm",
    "suppliersLongTerm",
    "billsOfExchangePayable",
    "otherCreditorsLongTerm",
    "debtsVersusCreditBanks",
    "immediatelyPayable",
    "debtsForReDiscountBonds",
    "otherDebtsDueTermorWithNoticeEndTerm",
    "debenturesSimilar",
    "otherBonds",
    "otherDebts",
    "provisionsForReorganisation",
    "provisionsForDoubtfulDebts",
    "totalProvisions",
    "convertableDebentures",
    "paymentsReceivedOnAccountLongTerm",
    "dueToParticipants",
    "taxesSocialSecurity",
    "debtsForPensions",
    "interestBearingSecurities",
    "longTermLiabilities",
    "allowances",
    "intangibleAssetDepreciation",
    "provisionForStockDepreciation",
    "amountsWrittenOffTradeDebtors",
    "provisionForFuturePurchases",
    "accrualsDeferredIncome",
    "miscellaneousLiabilities",
    "debenturesDueAfter5Years",
    "liabilitiesDueToBanksAfter5Years",
    "liabilitiesToOtherCreditorsDueAfter5Years",
    "tradeAccountsDueAfter5Years",
    "liabilitiesFromLeaseDueAfter5Years",
    "liabilitiesFromSupervisionDueAfter5Years",
    "liabilitiesToHospitalFoundationCarrierDueAfter5Years",
    "liabilitiesAccordingToHospitalFinancingActDue5Years",
    "liabilitiesFromGovernmentalSubsidiesDueAfter5Years",
    "otherDonationsForFinancingInstallationsDue5Years",
    "nonGovermentalPromotionInvestmentsDue5Years",
    "liabilitiesDueToAffiliatesAfter5Years",
    "liabilitiesDueToJointVenturesAfter5Years",
    "liabilitiesDueToShareholdersAfter5Years",
    "liabilitiesDueToOtherGroupCompaniesAfter5Years",
    "otherLiabilitiesDueAfter5Years",
    "residualLiabilitiesDueAfter5Years",
    "therefromLiabilitiesFallingDueMoreThanFiveYears",
    "tier2Capital",
    "subordinatedLiabilities",
    "provisionForRisksCharges",
    "provisionsForPensionsSimilarObligations",
    "provisionsForTaxation",
    "depositsReceivedFromReinsurers",
    "bondedLoans",
    "securedDebts",
    "sundryLoansOtherFinancialPayables",
    "provisionforSeveranceIndemnity",
    "payablesRepresentedBySecuritiesBonds",
    "thirdPartyAssetsUnderManagement",
    "provisionForBadLoans",
    "provisionForGeneralFinancialRisks",
    "prepaymentstoOwners",
    "otherLoans",
    "otherCreditorsNonProfitInstitutions",
    "institutions",
    "otherCreditorsWithNoOrAbnormallyLowInterest",
    "cashGuarantees",
    "investments",
    "amountsReceivable",
    "fixedRevenueSecurities",
    "deferredTaxLiabilities",
    "unsubordinatedDebenturesConvertible",
    "unsubordinatedDebenturesNonConvertible",
    "amountsOwedToCreditInstitutions",
    "billsExchangePayable",
    "liabilitiesDueToAffiliatedCompanies",
    "liabilitiesDueToOtherGroupCompanies",
    "unsubordinatedDebentures"
})
public class BalanceSheetDtldNonCurrentLiabilitiesType {

    @XmlElement(name = "DebtsToGroupCompanies")
    protected AmountType debtsToGroupCompanies;
    @XmlElement(name = "Taxation")
    protected AmountType taxation;
    @XmlElement(name = "MortgagesLoans")
    protected AmountType mortgagesLoans;
    @XmlElement(name = "HirePurchaseOverAYear")
    protected AmountType hirePurchaseOverAYear;
    @XmlElement(name = "MinorityInterest")
    protected AmountType minorityInterest;
    @XmlElement(name = "OtherLongTermLiabilities")
    protected AmountType otherLongTermLiabilities;
    @XmlElement(name = "TotalLongTermLiabilities")
    protected AmountType totalLongTermLiabilities;
    @XmlElement(name = "PensionsSimilarObligations")
    protected AmountType pensionsSimilarObligations;
    @XmlElement(name = "OtherProvisions")
    protected AmountType otherProvisions;
    @XmlElement(name = "CreditorsLongTerm")
    protected AmountType creditorsLongTerm;
    @XmlElement(name = "FinancialDebtsLongTerm")
    protected AmountType financialDebtsLongTerm;
    @XmlElement(name = "FinancialLeasingAgreementsLongTerm")
    protected AmountType financialLeasingAgreementsLongTerm;
    @XmlElement(name = "SubordinatedLoans")
    protected AmountType subordinatedLoans;
    @XmlElement(name = "UnsubordinatedDebentureLoans")
    protected AmountType unsubordinatedDebentureLoans;
    @XmlElement(name = "LeasingOtherSimilarRightsLongTerm")
    protected AmountType leasingOtherSimilarRightsLongTerm;
    @XmlElement(name = "FinancialInstitutionsLongTerm")
    protected AmountType financialInstitutionsLongTerm;
    @XmlElement(name = "OtherLoansLongTerm")
    protected AmountType otherLoansLongTerm;
    @XmlElement(name = "TradeCreditorsLongTerm")
    protected AmountType tradeCreditorsLongTerm;
    @XmlElement(name = "SuppliersLongTerm")
    protected AmountType suppliersLongTerm;
    @XmlElement(name = "BillsOfExchangePayable")
    protected AmountType billsOfExchangePayable;
    @XmlElement(name = "OtherCreditorsLongTerm")
    protected AmountType otherCreditorsLongTerm;
    @XmlElement(name = "DebtsVersusCreditBanks")
    protected AmountType debtsVersusCreditBanks;
    @XmlElement(name = "ImmediatelyPayable")
    protected AmountType immediatelyPayable;
    @XmlElement(name = "DebtsForReDiscountBonds")
    protected AmountType debtsForReDiscountBonds;
    @XmlElement(name = "OtherDebtsDueTermorWithNoticeEndTerm")
    protected AmountType otherDebtsDueTermorWithNoticeEndTerm;
    @XmlElement(name = "DebenturesSimilar")
    protected AmountType debenturesSimilar;
    @XmlElement(name = "OtherBonds")
    protected AmountType otherBonds;
    @XmlElement(name = "OtherDebts")
    protected AmountType otherDebts;
    @XmlElement(name = "ProvisionsForReorganisation")
    protected AmountType provisionsForReorganisation;
    @XmlElement(name = "ProvisionsForDoubtfulDebts")
    protected AmountType provisionsForDoubtfulDebts;
    @XmlElement(name = "TotalProvisions")
    protected AmountType totalProvisions;
    @XmlElement(name = "ConvertableDebentures")
    protected AmountType convertableDebentures;
    @XmlElement(name = "PaymentsReceivedOnAccountLongTerm")
    protected AmountType paymentsReceivedOnAccountLongTerm;
    @XmlElement(name = "DueToParticipants")
    protected AmountType dueToParticipants;
    @XmlElement(name = "TaxesSocialSecurity")
    protected AmountType taxesSocialSecurity;
    @XmlElement(name = "DebtsForPensions")
    protected AmountType debtsForPensions;
    @XmlElement(name = "InterestBearingSecurities")
    protected AmountType interestBearingSecurities;
    @XmlElement(name = "LongTermLiabilities")
    protected AmountType longTermLiabilities;
    @XmlElement(name = "Allowances")
    protected AmountType allowances;
    @XmlElement(name = "IntangibleAssetDepreciation")
    protected AmountType intangibleAssetDepreciation;
    @XmlElement(name = "ProvisionForStockDepreciation")
    protected AmountType provisionForStockDepreciation;
    @XmlElement(name = "AmountsWrittenOffTradeDebtors")
    protected AmountType amountsWrittenOffTradeDebtors;
    @XmlElement(name = "ProvisionForFuturePurchases")
    protected AmountType provisionForFuturePurchases;
    @XmlElement(name = "AccrualsDeferredIncome")
    protected AmountType accrualsDeferredIncome;
    @XmlElement(name = "MiscellaneousLiabilities")
    protected AmountType miscellaneousLiabilities;
    @XmlElement(name = "DebenturesDueAfter5Years")
    protected AmountType debenturesDueAfter5Years;
    @XmlElement(name = "LiabilitiesDueToBanksAfter5Years")
    protected AmountType liabilitiesDueToBanksAfter5Years;
    @XmlElement(name = "LiabilitiesToOtherCreditorsDueAfter5Years")
    protected AmountType liabilitiesToOtherCreditorsDueAfter5Years;
    @XmlElement(name = "TradeAccountsDueAfter5Years")
    protected AmountType tradeAccountsDueAfter5Years;
    @XmlElement(name = "LiabilitiesFromLeaseDueAfter5Years")
    protected AmountType liabilitiesFromLeaseDueAfter5Years;
    @XmlElement(name = "LiabilitiesFromSupervisionDueAfter5Years")
    protected AmountType liabilitiesFromSupervisionDueAfter5Years;
    @XmlElement(name = "LiabilitiesToHospitalFoundationCarrierDueAfter5Years")
    protected AmountType liabilitiesToHospitalFoundationCarrierDueAfter5Years;
    @XmlElement(name = "LiabilitiesAccordingToHospitalFinancingActDue5Years")
    protected AmountType liabilitiesAccordingToHospitalFinancingActDue5Years;
    @XmlElement(name = "LiabilitiesFromGovernmentalSubsidiesDueAfter5Years")
    protected AmountType liabilitiesFromGovernmentalSubsidiesDueAfter5Years;
    @XmlElement(name = "OtherDonationsForFinancingInstallationsDue5Years")
    protected AmountType otherDonationsForFinancingInstallationsDue5Years;
    @XmlElement(name = "NonGovermentalPromotionInvestmentsDue5Years")
    protected AmountType nonGovermentalPromotionInvestmentsDue5Years;
    @XmlElement(name = "LiabilitiesDueToAffiliatesAfter5Years")
    protected AmountType liabilitiesDueToAffiliatesAfter5Years;
    @XmlElement(name = "LiabilitiesDueToJointVenturesAfter5Years")
    protected AmountType liabilitiesDueToJointVenturesAfter5Years;
    @XmlElement(name = "LiabilitiesDueToShareholdersAfter5Years")
    protected AmountType liabilitiesDueToShareholdersAfter5Years;
    @XmlElement(name = "LiabilitiesDueToOtherGroupCompaniesAfter5Years")
    protected AmountType liabilitiesDueToOtherGroupCompaniesAfter5Years;
    @XmlElement(name = "OtherLiabilitiesDueAfter5Years")
    protected AmountType otherLiabilitiesDueAfter5Years;
    @XmlElement(name = "ResidualLiabilitiesDueAfter5Years")
    protected AmountType residualLiabilitiesDueAfter5Years;
    @XmlElement(name = "TherefromLiabilitiesFallingDueMoreThanFiveYears")
    protected AmountType therefromLiabilitiesFallingDueMoreThanFiveYears;
    @XmlElement(name = "Tier2Capital")
    protected AmountType tier2Capital;
    @XmlElement(name = "SubordinatedLiabilities")
    protected AmountType subordinatedLiabilities;
    @XmlElement(name = "ProvisionForRisksCharges")
    protected AmountType provisionForRisksCharges;
    @XmlElement(name = "ProvisionsForPensionsSimilarObligations")
    protected AmountType provisionsForPensionsSimilarObligations;
    @XmlElement(name = "ProvisionsForTaxation")
    protected AmountType provisionsForTaxation;
    @XmlElement(name = "DepositsReceivedFromReinsurers")
    protected AmountType depositsReceivedFromReinsurers;
    @XmlElement(name = "BondedLoans")
    protected AmountType bondedLoans;
    @XmlElement(name = "SecuredDebts")
    protected AmountType securedDebts;
    @XmlElement(name = "SundryLoansOtherFinancialPayables")
    protected AmountType sundryLoansOtherFinancialPayables;
    @XmlElement(name = "ProvisionforSeveranceIndemnity")
    protected AmountType provisionforSeveranceIndemnity;
    @XmlElement(name = "PayablesRepresentedBySecuritiesBonds")
    protected AmountType payablesRepresentedBySecuritiesBonds;
    @XmlElement(name = "ThirdPartyAssetsUnderManagement")
    protected AmountType thirdPartyAssetsUnderManagement;
    @XmlElement(name = "ProvisionForBadLoans")
    protected AmountType provisionForBadLoans;
    @XmlElement(name = "ProvisionForGeneralFinancialRisks")
    protected AmountType provisionForGeneralFinancialRisks;
    @XmlElement(name = "PrepaymentstoOwners")
    protected AmountType prepaymentstoOwners;
    @XmlElement(name = "OtherLoans")
    protected AmountType otherLoans;
    @XmlElement(name = "OtherCreditorsNonProfitInstitutions")
    protected AmountType otherCreditorsNonProfitInstitutions;
    @XmlElement(name = "Institutions")
    protected AmountType institutions;
    @XmlElement(name = "OtherCreditorsWithNoOrAbnormallyLowInterest")
    protected AmountType otherCreditorsWithNoOrAbnormallyLowInterest;
    @XmlElement(name = "CashGuarantees")
    protected AmountType cashGuarantees;
    @XmlElement(name = "Investments")
    protected AmountType investments;
    @XmlElement(name = "AmountsReceivable")
    protected AmountType amountsReceivable;
    @XmlElement(name = "FixedRevenueSecurities")
    protected AmountType fixedRevenueSecurities;
    @XmlElement(name = "DeferredTaxLiabilities")
    protected AmountType deferredTaxLiabilities;
    @XmlElement(name = "UnsubordinatedDebenturesConvertible")
    protected AmountType unsubordinatedDebenturesConvertible;
    @XmlElement(name = "UnsubordinatedDebenturesNonConvertible")
    protected AmountType unsubordinatedDebenturesNonConvertible;
    @XmlElement(name = "AmountsOwedToCreditInstitutions")
    protected AmountType amountsOwedToCreditInstitutions;
    @XmlElement(name = "BillsExchangePayable")
    protected AmountType billsExchangePayable;
    @XmlElement(name = "LiabilitiesDueToAffiliatedCompanies")
    protected AmountType liabilitiesDueToAffiliatedCompanies;
    @XmlElement(name = "LiabilitiesDueToOtherGroupCompanies")
    protected AmountType liabilitiesDueToOtherGroupCompanies;
    @XmlElement(name = "UnsubordinatedDebentures")
    protected AmountType unsubordinatedDebentures;

    /**
     * Gets the value of the debtsToGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsToGroupCompanies() {
        return debtsToGroupCompanies;
    }

    /**
     * Sets the value of the debtsToGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsToGroupCompanies(AmountType value) {
        this.debtsToGroupCompanies = value;
    }

    /**
     * Gets the value of the taxation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxation() {
        return taxation;
    }

    /**
     * Sets the value of the taxation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxation(AmountType value) {
        this.taxation = value;
    }

    /**
     * Gets the value of the mortgagesLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMortgagesLoans() {
        return mortgagesLoans;
    }

    /**
     * Sets the value of the mortgagesLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMortgagesLoans(AmountType value) {
        this.mortgagesLoans = value;
    }

    /**
     * Gets the value of the hirePurchaseOverAYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHirePurchaseOverAYear() {
        return hirePurchaseOverAYear;
    }

    /**
     * Sets the value of the hirePurchaseOverAYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHirePurchaseOverAYear(AmountType value) {
        this.hirePurchaseOverAYear = value;
    }

    /**
     * Gets the value of the minorityInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinorityInterest() {
        return minorityInterest;
    }

    /**
     * Sets the value of the minorityInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinorityInterest(AmountType value) {
        this.minorityInterest = value;
    }

    /**
     * Gets the value of the otherLongTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLongTermLiabilities() {
        return otherLongTermLiabilities;
    }

    /**
     * Sets the value of the otherLongTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLongTermLiabilities(AmountType value) {
        this.otherLongTermLiabilities = value;
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
     * Gets the value of the pensionsSimilarObligations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPensionsSimilarObligations() {
        return pensionsSimilarObligations;
    }

    /**
     * Sets the value of the pensionsSimilarObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPensionsSimilarObligations(AmountType value) {
        this.pensionsSimilarObligations = value;
    }

    /**
     * Gets the value of the otherProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherProvisions() {
        return otherProvisions;
    }

    /**
     * Sets the value of the otherProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherProvisions(AmountType value) {
        this.otherProvisions = value;
    }

    /**
     * Gets the value of the creditorsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditorsLongTerm() {
        return creditorsLongTerm;
    }

    /**
     * Sets the value of the creditorsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditorsLongTerm(AmountType value) {
        this.creditorsLongTerm = value;
    }

    /**
     * Gets the value of the financialDebtsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialDebtsLongTerm() {
        return financialDebtsLongTerm;
    }

    /**
     * Sets the value of the financialDebtsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialDebtsLongTerm(AmountType value) {
        this.financialDebtsLongTerm = value;
    }

    /**
     * Gets the value of the financialLeasingAgreementsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialLeasingAgreementsLongTerm() {
        return financialLeasingAgreementsLongTerm;
    }

    /**
     * Sets the value of the financialLeasingAgreementsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialLeasingAgreementsLongTerm(AmountType value) {
        this.financialLeasingAgreementsLongTerm = value;
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
     * Gets the value of the unsubordinatedDebentureLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnsubordinatedDebentureLoans() {
        return unsubordinatedDebentureLoans;
    }

    /**
     * Sets the value of the unsubordinatedDebentureLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnsubordinatedDebentureLoans(AmountType value) {
        this.unsubordinatedDebentureLoans = value;
    }

    /**
     * Gets the value of the leasingOtherSimilarRightsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLeasingOtherSimilarRightsLongTerm() {
        return leasingOtherSimilarRightsLongTerm;
    }

    /**
     * Sets the value of the leasingOtherSimilarRightsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLeasingOtherSimilarRightsLongTerm(AmountType value) {
        this.leasingOtherSimilarRightsLongTerm = value;
    }

    /**
     * Gets the value of the financialInstitutionsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialInstitutionsLongTerm() {
        return financialInstitutionsLongTerm;
    }

    /**
     * Sets the value of the financialInstitutionsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialInstitutionsLongTerm(AmountType value) {
        this.financialInstitutionsLongTerm = value;
    }

    /**
     * Gets the value of the otherLoansLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLoansLongTerm() {
        return otherLoansLongTerm;
    }

    /**
     * Sets the value of the otherLoansLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLoansLongTerm(AmountType value) {
        this.otherLoansLongTerm = value;
    }

    /**
     * Gets the value of the tradeCreditorsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeCreditorsLongTerm() {
        return tradeCreditorsLongTerm;
    }

    /**
     * Sets the value of the tradeCreditorsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeCreditorsLongTerm(AmountType value) {
        this.tradeCreditorsLongTerm = value;
    }

    /**
     * Gets the value of the suppliersLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSuppliersLongTerm() {
        return suppliersLongTerm;
    }

    /**
     * Sets the value of the suppliersLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSuppliersLongTerm(AmountType value) {
        this.suppliersLongTerm = value;
    }

    /**
     * Gets the value of the billsOfExchangePayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillsOfExchangePayable() {
        return billsOfExchangePayable;
    }

    /**
     * Sets the value of the billsOfExchangePayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillsOfExchangePayable(AmountType value) {
        this.billsOfExchangePayable = value;
    }

    /**
     * Gets the value of the otherCreditorsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditorsLongTerm() {
        return otherCreditorsLongTerm;
    }

    /**
     * Sets the value of the otherCreditorsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditorsLongTerm(AmountType value) {
        this.otherCreditorsLongTerm = value;
    }

    /**
     * Gets the value of the debtsVersusCreditBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsVersusCreditBanks() {
        return debtsVersusCreditBanks;
    }

    /**
     * Sets the value of the debtsVersusCreditBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsVersusCreditBanks(AmountType value) {
        this.debtsVersusCreditBanks = value;
    }

    /**
     * Gets the value of the immediatelyPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImmediatelyPayable() {
        return immediatelyPayable;
    }

    /**
     * Sets the value of the immediatelyPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImmediatelyPayable(AmountType value) {
        this.immediatelyPayable = value;
    }

    /**
     * Gets the value of the debtsForReDiscountBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsForReDiscountBonds() {
        return debtsForReDiscountBonds;
    }

    /**
     * Sets the value of the debtsForReDiscountBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsForReDiscountBonds(AmountType value) {
        this.debtsForReDiscountBonds = value;
    }

    /**
     * Gets the value of the otherDebtsDueTermorWithNoticeEndTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDebtsDueTermorWithNoticeEndTerm() {
        return otherDebtsDueTermorWithNoticeEndTerm;
    }

    /**
     * Sets the value of the otherDebtsDueTermorWithNoticeEndTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDebtsDueTermorWithNoticeEndTerm(AmountType value) {
        this.otherDebtsDueTermorWithNoticeEndTerm = value;
    }

    /**
     * Gets the value of the debenturesSimilar property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebenturesSimilar() {
        return debenturesSimilar;
    }

    /**
     * Sets the value of the debenturesSimilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebenturesSimilar(AmountType value) {
        this.debenturesSimilar = value;
    }

    /**
     * Gets the value of the otherBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherBonds() {
        return otherBonds;
    }

    /**
     * Sets the value of the otherBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherBonds(AmountType value) {
        this.otherBonds = value;
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
     * Gets the value of the provisionsForReorganisation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForReorganisation() {
        return provisionsForReorganisation;
    }

    /**
     * Sets the value of the provisionsForReorganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForReorganisation(AmountType value) {
        this.provisionsForReorganisation = value;
    }

    /**
     * Gets the value of the provisionsForDoubtfulDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForDoubtfulDebts() {
        return provisionsForDoubtfulDebts;
    }

    /**
     * Sets the value of the provisionsForDoubtfulDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForDoubtfulDebts(AmountType value) {
        this.provisionsForDoubtfulDebts = value;
    }

    /**
     * Gets the value of the totalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalProvisions() {
        return totalProvisions;
    }

    /**
     * Sets the value of the totalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalProvisions(AmountType value) {
        this.totalProvisions = value;
    }

    /**
     * Gets the value of the convertableDebentures property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertableDebentures() {
        return convertableDebentures;
    }

    /**
     * Sets the value of the convertableDebentures property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertableDebentures(AmountType value) {
        this.convertableDebentures = value;
    }

    /**
     * Gets the value of the paymentsReceivedOnAccountLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentsReceivedOnAccountLongTerm() {
        return paymentsReceivedOnAccountLongTerm;
    }

    /**
     * Sets the value of the paymentsReceivedOnAccountLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentsReceivedOnAccountLongTerm(AmountType value) {
        this.paymentsReceivedOnAccountLongTerm = value;
    }

    /**
     * Gets the value of the dueToParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDueToParticipants() {
        return dueToParticipants;
    }

    /**
     * Sets the value of the dueToParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDueToParticipants(AmountType value) {
        this.dueToParticipants = value;
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
     * Gets the value of the debtsForPensions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsForPensions() {
        return debtsForPensions;
    }

    /**
     * Sets the value of the debtsForPensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsForPensions(AmountType value) {
        this.debtsForPensions = value;
    }

    /**
     * Gets the value of the interestBearingSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterestBearingSecurities() {
        return interestBearingSecurities;
    }

    /**
     * Sets the value of the interestBearingSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterestBearingSecurities(AmountType value) {
        this.interestBearingSecurities = value;
    }

    /**
     * Gets the value of the longTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermLiabilities() {
        return longTermLiabilities;
    }

    /**
     * Sets the value of the longTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermLiabilities(AmountType value) {
        this.longTermLiabilities = value;
    }

    /**
     * Gets the value of the allowances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAllowances() {
        return allowances;
    }

    /**
     * Sets the value of the allowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAllowances(AmountType value) {
        this.allowances = value;
    }

    /**
     * Gets the value of the intangibleAssetDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntangibleAssetDepreciation() {
        return intangibleAssetDepreciation;
    }

    /**
     * Sets the value of the intangibleAssetDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntangibleAssetDepreciation(AmountType value) {
        this.intangibleAssetDepreciation = value;
    }

    /**
     * Gets the value of the provisionForStockDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForStockDepreciation() {
        return provisionForStockDepreciation;
    }

    /**
     * Sets the value of the provisionForStockDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForStockDepreciation(AmountType value) {
        this.provisionForStockDepreciation = value;
    }

    /**
     * Gets the value of the amountsWrittenOffTradeDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsWrittenOffTradeDebtors() {
        return amountsWrittenOffTradeDebtors;
    }

    /**
     * Sets the value of the amountsWrittenOffTradeDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsWrittenOffTradeDebtors(AmountType value) {
        this.amountsWrittenOffTradeDebtors = value;
    }

    /**
     * Gets the value of the provisionForFuturePurchases property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForFuturePurchases() {
        return provisionForFuturePurchases;
    }

    /**
     * Sets the value of the provisionForFuturePurchases property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForFuturePurchases(AmountType value) {
        this.provisionForFuturePurchases = value;
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
     * Gets the value of the miscellaneousLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMiscellaneousLiabilities() {
        return miscellaneousLiabilities;
    }

    /**
     * Sets the value of the miscellaneousLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMiscellaneousLiabilities(AmountType value) {
        this.miscellaneousLiabilities = value;
    }

    /**
     * Gets the value of the debenturesDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebenturesDueAfter5Years() {
        return debenturesDueAfter5Years;
    }

    /**
     * Sets the value of the debenturesDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebenturesDueAfter5Years(AmountType value) {
        this.debenturesDueAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesDueToBanksAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToBanksAfter5Years() {
        return liabilitiesDueToBanksAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesDueToBanksAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToBanksAfter5Years(AmountType value) {
        this.liabilitiesDueToBanksAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesToOtherCreditorsDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesToOtherCreditorsDueAfter5Years() {
        return liabilitiesToOtherCreditorsDueAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesToOtherCreditorsDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesToOtherCreditorsDueAfter5Years(AmountType value) {
        this.liabilitiesToOtherCreditorsDueAfter5Years = value;
    }

    /**
     * Gets the value of the tradeAccountsDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeAccountsDueAfter5Years() {
        return tradeAccountsDueAfter5Years;
    }

    /**
     * Sets the value of the tradeAccountsDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeAccountsDueAfter5Years(AmountType value) {
        this.tradeAccountsDueAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesFromLeaseDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFromLeaseDueAfter5Years() {
        return liabilitiesFromLeaseDueAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesFromLeaseDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFromLeaseDueAfter5Years(AmountType value) {
        this.liabilitiesFromLeaseDueAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesFromSupervisionDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFromSupervisionDueAfter5Years() {
        return liabilitiesFromSupervisionDueAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesFromSupervisionDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFromSupervisionDueAfter5Years(AmountType value) {
        this.liabilitiesFromSupervisionDueAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesToHospitalFoundationCarrierDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesToHospitalFoundationCarrierDueAfter5Years() {
        return liabilitiesToHospitalFoundationCarrierDueAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesToHospitalFoundationCarrierDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesToHospitalFoundationCarrierDueAfter5Years(AmountType value) {
        this.liabilitiesToHospitalFoundationCarrierDueAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesAccordingToHospitalFinancingActDue5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesAccordingToHospitalFinancingActDue5Years() {
        return liabilitiesAccordingToHospitalFinancingActDue5Years;
    }

    /**
     * Sets the value of the liabilitiesAccordingToHospitalFinancingActDue5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesAccordingToHospitalFinancingActDue5Years(AmountType value) {
        this.liabilitiesAccordingToHospitalFinancingActDue5Years = value;
    }

    /**
     * Gets the value of the liabilitiesFromGovernmentalSubsidiesDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFromGovernmentalSubsidiesDueAfter5Years() {
        return liabilitiesFromGovernmentalSubsidiesDueAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesFromGovernmentalSubsidiesDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFromGovernmentalSubsidiesDueAfter5Years(AmountType value) {
        this.liabilitiesFromGovernmentalSubsidiesDueAfter5Years = value;
    }

    /**
     * Gets the value of the otherDonationsForFinancingInstallationsDue5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDonationsForFinancingInstallationsDue5Years() {
        return otherDonationsForFinancingInstallationsDue5Years;
    }

    /**
     * Sets the value of the otherDonationsForFinancingInstallationsDue5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDonationsForFinancingInstallationsDue5Years(AmountType value) {
        this.otherDonationsForFinancingInstallationsDue5Years = value;
    }

    /**
     * Gets the value of the nonGovermentalPromotionInvestmentsDue5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonGovermentalPromotionInvestmentsDue5Years() {
        return nonGovermentalPromotionInvestmentsDue5Years;
    }

    /**
     * Sets the value of the nonGovermentalPromotionInvestmentsDue5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonGovermentalPromotionInvestmentsDue5Years(AmountType value) {
        this.nonGovermentalPromotionInvestmentsDue5Years = value;
    }

    /**
     * Gets the value of the liabilitiesDueToAffiliatesAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToAffiliatesAfter5Years() {
        return liabilitiesDueToAffiliatesAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesDueToAffiliatesAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToAffiliatesAfter5Years(AmountType value) {
        this.liabilitiesDueToAffiliatesAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesDueToJointVenturesAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToJointVenturesAfter5Years() {
        return liabilitiesDueToJointVenturesAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesDueToJointVenturesAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToJointVenturesAfter5Years(AmountType value) {
        this.liabilitiesDueToJointVenturesAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesDueToShareholdersAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToShareholdersAfter5Years() {
        return liabilitiesDueToShareholdersAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesDueToShareholdersAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToShareholdersAfter5Years(AmountType value) {
        this.liabilitiesDueToShareholdersAfter5Years = value;
    }

    /**
     * Gets the value of the liabilitiesDueToOtherGroupCompaniesAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesDueToOtherGroupCompaniesAfter5Years() {
        return liabilitiesDueToOtherGroupCompaniesAfter5Years;
    }

    /**
     * Sets the value of the liabilitiesDueToOtherGroupCompaniesAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesDueToOtherGroupCompaniesAfter5Years(AmountType value) {
        this.liabilitiesDueToOtherGroupCompaniesAfter5Years = value;
    }

    /**
     * Gets the value of the otherLiabilitiesDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLiabilitiesDueAfter5Years() {
        return otherLiabilitiesDueAfter5Years;
    }

    /**
     * Sets the value of the otherLiabilitiesDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLiabilitiesDueAfter5Years(AmountType value) {
        this.otherLiabilitiesDueAfter5Years = value;
    }

    /**
     * Gets the value of the residualLiabilitiesDueAfter5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualLiabilitiesDueAfter5Years() {
        return residualLiabilitiesDueAfter5Years;
    }

    /**
     * Sets the value of the residualLiabilitiesDueAfter5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualLiabilitiesDueAfter5Years(AmountType value) {
        this.residualLiabilitiesDueAfter5Years = value;
    }

    /**
     * Gets the value of the therefromLiabilitiesFallingDueMoreThanFiveYears property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTherefromLiabilitiesFallingDueMoreThanFiveYears() {
        return therefromLiabilitiesFallingDueMoreThanFiveYears;
    }

    /**
     * Sets the value of the therefromLiabilitiesFallingDueMoreThanFiveYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTherefromLiabilitiesFallingDueMoreThanFiveYears(AmountType value) {
        this.therefromLiabilitiesFallingDueMoreThanFiveYears = value;
    }

    /**
     * Gets the value of the tier2Capital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTier2Capital() {
        return tier2Capital;
    }

    /**
     * Sets the value of the tier2Capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTier2Capital(AmountType value) {
        this.tier2Capital = value;
    }

    /**
     * Gets the value of the subordinatedLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedLiabilities() {
        return subordinatedLiabilities;
    }

    /**
     * Sets the value of the subordinatedLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedLiabilities(AmountType value) {
        this.subordinatedLiabilities = value;
    }

    /**
     * Gets the value of the provisionForRisksCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForRisksCharges() {
        return provisionForRisksCharges;
    }

    /**
     * Sets the value of the provisionForRisksCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForRisksCharges(AmountType value) {
        this.provisionForRisksCharges = value;
    }

    /**
     * Gets the value of the provisionsForPensionsSimilarObligations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForPensionsSimilarObligations() {
        return provisionsForPensionsSimilarObligations;
    }

    /**
     * Sets the value of the provisionsForPensionsSimilarObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForPensionsSimilarObligations(AmountType value) {
        this.provisionsForPensionsSimilarObligations = value;
    }

    /**
     * Gets the value of the provisionsForTaxation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForTaxation() {
        return provisionsForTaxation;
    }

    /**
     * Sets the value of the provisionsForTaxation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForTaxation(AmountType value) {
        this.provisionsForTaxation = value;
    }

    /**
     * Gets the value of the depositsReceivedFromReinsurers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositsReceivedFromReinsurers() {
        return depositsReceivedFromReinsurers;
    }

    /**
     * Sets the value of the depositsReceivedFromReinsurers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositsReceivedFromReinsurers(AmountType value) {
        this.depositsReceivedFromReinsurers = value;
    }

    /**
     * Gets the value of the bondedLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBondedLoans() {
        return bondedLoans;
    }

    /**
     * Sets the value of the bondedLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBondedLoans(AmountType value) {
        this.bondedLoans = value;
    }

    /**
     * Gets the value of the securedDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSecuredDebts() {
        return securedDebts;
    }

    /**
     * Sets the value of the securedDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSecuredDebts(AmountType value) {
        this.securedDebts = value;
    }

    /**
     * Gets the value of the sundryLoansOtherFinancialPayables property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSundryLoansOtherFinancialPayables() {
        return sundryLoansOtherFinancialPayables;
    }

    /**
     * Sets the value of the sundryLoansOtherFinancialPayables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSundryLoansOtherFinancialPayables(AmountType value) {
        this.sundryLoansOtherFinancialPayables = value;
    }

    /**
     * Gets the value of the provisionforSeveranceIndemnity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionforSeveranceIndemnity() {
        return provisionforSeveranceIndemnity;
    }

    /**
     * Sets the value of the provisionforSeveranceIndemnity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionforSeveranceIndemnity(AmountType value) {
        this.provisionforSeveranceIndemnity = value;
    }

    /**
     * Gets the value of the payablesRepresentedBySecuritiesBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPayablesRepresentedBySecuritiesBonds() {
        return payablesRepresentedBySecuritiesBonds;
    }

    /**
     * Sets the value of the payablesRepresentedBySecuritiesBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPayablesRepresentedBySecuritiesBonds(AmountType value) {
        this.payablesRepresentedBySecuritiesBonds = value;
    }

    /**
     * Gets the value of the thirdPartyAssetsUnderManagement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getThirdPartyAssetsUnderManagement() {
        return thirdPartyAssetsUnderManagement;
    }

    /**
     * Sets the value of the thirdPartyAssetsUnderManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setThirdPartyAssetsUnderManagement(AmountType value) {
        this.thirdPartyAssetsUnderManagement = value;
    }

    /**
     * Gets the value of the provisionForBadLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForBadLoans() {
        return provisionForBadLoans;
    }

    /**
     * Sets the value of the provisionForBadLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForBadLoans(AmountType value) {
        this.provisionForBadLoans = value;
    }

    /**
     * Gets the value of the provisionForGeneralFinancialRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForGeneralFinancialRisks() {
        return provisionForGeneralFinancialRisks;
    }

    /**
     * Sets the value of the provisionForGeneralFinancialRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForGeneralFinancialRisks(AmountType value) {
        this.provisionForGeneralFinancialRisks = value;
    }

    /**
     * Gets the value of the prepaymentstoOwners property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaymentstoOwners() {
        return prepaymentstoOwners;
    }

    /**
     * Sets the value of the prepaymentstoOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaymentstoOwners(AmountType value) {
        this.prepaymentstoOwners = value;
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
     * Gets the value of the otherCreditorsNonProfitInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditorsNonProfitInstitutions() {
        return otherCreditorsNonProfitInstitutions;
    }

    /**
     * Sets the value of the otherCreditorsNonProfitInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditorsNonProfitInstitutions(AmountType value) {
        this.otherCreditorsNonProfitInstitutions = value;
    }

    /**
     * Gets the value of the institutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInstitutions() {
        return institutions;
    }

    /**
     * Sets the value of the institutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInstitutions(AmountType value) {
        this.institutions = value;
    }

    /**
     * Gets the value of the otherCreditorsWithNoOrAbnormallyLowInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditorsWithNoOrAbnormallyLowInterest() {
        return otherCreditorsWithNoOrAbnormallyLowInterest;
    }

    /**
     * Sets the value of the otherCreditorsWithNoOrAbnormallyLowInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditorsWithNoOrAbnormallyLowInterest(AmountType value) {
        this.otherCreditorsWithNoOrAbnormallyLowInterest = value;
    }

    /**
     * Gets the value of the cashGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashGuarantees() {
        return cashGuarantees;
    }

    /**
     * Sets the value of the cashGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashGuarantees(AmountType value) {
        this.cashGuarantees = value;
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
     * Gets the value of the deferredTaxLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredTaxLiabilities() {
        return deferredTaxLiabilities;
    }

    /**
     * Sets the value of the deferredTaxLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredTaxLiabilities(AmountType value) {
        this.deferredTaxLiabilities = value;
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
     * Gets the value of the billsExchangePayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillsExchangePayable() {
        return billsExchangePayable;
    }

    /**
     * Sets the value of the billsExchangePayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillsExchangePayable(AmountType value) {
        this.billsExchangePayable = value;
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

}
