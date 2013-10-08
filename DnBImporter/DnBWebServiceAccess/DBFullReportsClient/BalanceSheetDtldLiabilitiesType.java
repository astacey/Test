
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldLiabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldLiabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
 *         &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
 *         &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
 *         &lt;element name="Taxation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsDeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForLiabilitiesCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PensionsSimilarObligations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MajorRepairsMaintenance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EqualizationAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForRisksChargesDeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForRisksCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PensionsSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherRisksCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FundForGeneralBankRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositsbyReinsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Liabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherGroupNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GroupNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiableNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForReorganisation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForDoubtfulDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertableDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsReceivedOnAccountLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DueToParticipants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountOwedToParticipations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Savings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFundsEntrusted" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FundsEntrusted" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GeneralReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PriceDiffReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceCompanyLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnearnedPremiumsUnexpiredRisksGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnearnedPremiumsUnexpiredRisksReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnearnedPremiumsUnexpiredRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsOutstandingGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsOutstandingReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsOutstanding" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitSharingRebatesGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitSharingRebatesReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitSharingRebates" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTechnicalProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalProvisionsAccPolicyholdersGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechProvisionsAccPolicyholdersReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalProvisionsWithInvestmentsForAccPolicyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositsWitheldFromInsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CreditorsOutDirectInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CreditorsOutReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditorsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CreditorsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccrualsDeferredIncomeInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesInsuranceCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankCompanyLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToCreditInstitutionsBankActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToClientsBankActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLiabilitiesBankActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccrualsDeferredIncomeBankActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsBankActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesBankCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EliminationsLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PayablesOtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedToBanksFinancialInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CommitmentsRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CommercialBalances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OfRemainingMembers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OfWithdrawingMembers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OfRescindedShareholdings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesOfCapital" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SharesOfCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="UnlimitedPartner" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnlimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="CapitalBroughtIn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LimitedPartner" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BondageCapitalLimitedLiabilityCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DistributionsOfLiquidity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShareholdersLoan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShareholdersLoan" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfUnlimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnrealizedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentItemForSharesOfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossCompensationAccount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalSurplus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapitalSurplus" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LegalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MiscellaneousReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OperationsSecurityReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesFromSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesFromReleasedAmounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesFromInterestIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BuildingRenewalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesSubsidiaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherEarningReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MinorityInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DifferenceinConsolidation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DifferenceinCurrencyTranslation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherEquityFunds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherEquityFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AccumulatedProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Dividends" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TransferFromProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AppropriationToLegalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherAppropriationsNetIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NetWorthorTotalEquity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShareholderLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeSubsidiesReceived" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IncomeSubsidiesReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsForInvestmentAidsInvestmentSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Governmental" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="EcclesiasticalOthers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsFromSubsidiesAccordingToKHGLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsFromGovernmentalSubsidiesForInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsFromGovernmentalAllocationsSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfHospital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfCharity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsFromDonationsThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsFromNonGovernmentalPromotion" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SpecialItemsForSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ToFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ToCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherSpecialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Provisions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForDeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForBuildingMaintenance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Provisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiabilitiesDueMoreThanAYear" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DebenturesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToBanksAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToOtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToOtherCreditorsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AdvancePaymentsReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TradeAccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TradeAccountsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BillsExchangePayableLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BillsExchangeDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromLease" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromLeaseDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromSupervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromSupervisionDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToHospitalFoundationCarrier" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichFromSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToHospitalFoundationCarrierDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesAccordingToHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichAllocatedbyVirtueLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesAccordingToHospitalFinancingActDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromGovernmentalSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichGrantedbutNotyetPaidOut" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromGovernmentalSubsidiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherDonationsForFinancingInstallations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherDonationsForFinancingInstallationsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromNonGovernmentalPromotionInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NonGovermentalPromotionInvestmentsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToAffiliatesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToJointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToJointVenturesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToShareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToShareholdersAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToOtherGroupCompaniesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ResidualLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ResidualLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFallingDueMoreThanOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TherefromLiabilitiesFallingDueMoreThanFiveYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiabilitiesDueWithinAYear" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToOtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AdvancePaymentsReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TradeAccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BillsExchangePayableShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromLease" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromSupervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesToHospitalFoundationCarrier" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichFromSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesAccordingToHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichAfterFederalHealthCareInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichAllocatedbyVirtueLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromGovernmentalSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichGrantedbutNotyetPaidOut" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromOtherDonationsForFinancingInstallations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFromNonGovernmentalPromotionInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToJointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToShareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ResidualLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LiabilitiesFallingDueWithinOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdjustmentItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CityRenovationItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandAcquisition" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MethodToOrder" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IndemnificationSupportingBody" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesFromBuildingCostsLeaseSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCityRenovationItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherUnclassifiedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesToCreditInstitutions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LiabilitiesToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="IssuedMortgageDebentureOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="IssuedTreasuryDebentureOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BuildingSocietySavingDeposits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherLiabilities" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiabilitiesToCustomers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LiabilitiesToCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="RegisteredIssuedMortgageBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="RegisteredIssuedPublicSectorBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DepositsFromBuildingSocietySavingsSavingDeposits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepositsFromBuildingSocietySavingsSavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SavingsDeposit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="WithAgreedPeriodNotice3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="WithAgreedPeriodNoticeMoreThan3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherLiabilitiesToCustomer" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherLiabilitiesToCustomer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiabilitiesFromMerchandising" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CertificatedLiabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CertificatedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="IssuedBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MortgageBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PublicSectorBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="IssuedMoneyMarketPaper" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherCertificatedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MoneyMarketSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OwnAcceptancesPromissoryNotesinCirculation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LiabilitiesHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FromIssuingLendingBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DifferentialUnderArt340EPar2SubPar2CommercialCode" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ActuarialProvisions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActuarialProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ContributionsCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForCoverage" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForInsuranceCasesNotyetFinalised" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReturnContributions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FundsForBuildingSocietySavingsHedging" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Foundations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubordinatedDebtsDueWithinTwoYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertibleDebenture" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConvertibleDebenturePayableinLessThan2Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ContributionSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FundsForGeneralBankingRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OutsideShareholdings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SpecialItems" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsForImplementationDecidedCapitalIncrease" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IssuedCapital" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IssuedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichCapitalChange" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BasicCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SilentCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherIssuedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContributionUnlimitedlyLiablePartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContributionUnlimitedlyLiablePartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContributionsLimitedPartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContributionsLimitedPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContributionsSilentPartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContributionsSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RetainedIncomeReserves" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RetainedIncomeReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LegalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ContingencyReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MiscellaneousReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PurposeReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LossReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherEarningReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EarnedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DifferentialAmountFromCapitalConsolidation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CompensatingItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCapitalElements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RetainedProfitLoss" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RetainedProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AccumulatedIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NetBookValueStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TransferFromProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepositsOfAtypicalSilentPartners" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepositsOfAtypicalSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="FixedDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SurplusReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="CompensatingItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherPositionsOfTotalEquity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceReserves" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="UnearnedPremiums" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="GrossUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCededOnUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ActuarialReserves" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="GrossActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCededOnActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProvisionsForOutstandingClaims" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="GrossProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCededOnProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProvisionsForPremiumRefunds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PerformanceRelated" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NonPerformanceRelated" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NonPerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GrossProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCededOnProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimsEqualizationProvisionSimilarReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherInsuranceReserves" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="GrossOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCededOnOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ActuarialReservesInTheRangeOfLifeInsurance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActuarialReservesInTheRangeOfLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AggregateReserve" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AggregateReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherActuarialReserves" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAccruedDebts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherAccruedDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ProvisionsForTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReservesForProspectiveTaxBurden" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepositLiabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepositLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherInsuranceLiabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherInsuranceLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AccountsPayableOnDirectInsuranceBusiness" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountsPayableOnDirectInsuranceBusinessWith" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Agent" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Agent" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountsPayableOnReinsuranceBusiness" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountsPayableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DebentureBonds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LiabilitiesToBanks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LiabilitiesToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BuildingSocietySavingDeposits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MiscellaneousLiabilities" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MiscellaneousLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DifferenceAccordingToArt341Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAccrualsAndDeferredIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Settlement" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResultToBeCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitOrLossForPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterimDividends" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ImmunizedIncreaseInValueOrAppreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebenturesNonConvertible" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsReceivedOnAccountShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsExchangePayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Taxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SocialSecurityExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldLiabilitiesType", propOrder = {
    "currentLiabilities",
    "nonCurrentLiabilities",
    "equity",
    "taxation",
    "provisionsDeferredTaxes",
    "provisionsForLiabilitiesCharges",
    "pensionsSimilarObligations",
    "majorRepairsMaintenance",
    "otherProvisions",
    "deferredTaxes",
    "otherLiabilities",
    "equalizationAccounts",
    "provisionsForRisksChargesDeferredTaxes",
    "provisionsForRisksCharges",
    "pensionsSimilar",
    "taxProvisions",
    "otherRisksCharges",
    "fundForGeneralBankRisks",
    "subordinatedDebts",
    "totalLiabilities",
    "depositsbyReinsurers",
    "liabilities",
    "otherGroupNetWorth",
    "groupNetWorth",
    "liableNetWorth",
    "provisionsForReorganisation",
    "provisionsForDoubtfulDebts",
    "totalProvisions",
    "convertableDebentures",
    "paymentsReceivedOnAccountLongTerm",
    "dueToParticipants",
    "taxesSocialSecurity",
    "debtsForPensions",
    "debentureLoans",
    "amountOwedToParticipations",
    "savings",
    "otherFundsEntrusted",
    "fundsEntrusted",
    "generalReserve",
    "priceDiffReserve",
    "insuranceCompanyLiabilities",
    "unearnedPremiumsUnexpiredRisksGross",
    "unearnedPremiumsUnexpiredRisksReinsurance",
    "unearnedPremiumsUnexpiredRisks",
    "lifeInsuranceGross",
    "lifeInsuranceReinsurance",
    "lifeInsurance",
    "claimsOutstandingGross",
    "claimsOutstandingReinsurance",
    "claimsOutstanding",
    "profitSharingRebatesGross",
    "profitSharingRebatesReinsurance",
    "profitSharingRebates",
    "otherTechnicalProvisions",
    "technicalProvisionsAccPolicyholdersGross",
    "techProvisionsAccPolicyholdersReinsurance",
    "technicalProvisionsWithInvestmentsForAccPolicyholders",
    "provisionsInsuranceActivities",
    "depositsWitheldFromInsurers",
    "creditorsOutDirectInsurance",
    "creditorsOutReinsurance",
    "amountsOwedToCreditInstitutions",
    "otherCreditorsInsuranceActivities",
    "creditorsInsuranceActivities",
    "accrualsDeferredIncomeInsuranceActivities",
    "totalLiabilitiesInsuranceCompany",
    "bankCompanyLiabilities",
    "amountsOwedToCreditInstitutionsBankActivities",
    "amountsOwedToClientsBankActivities",
    "otherLiabilitiesBankActivities",
    "accrualsDeferredIncomeBankActivities",
    "provisionsBankActivities",
    "totalLiabilitiesBankCompany",
    "eliminationsLiabilities",
    "payablesOtherLiabilities",
    "amountsOwedToBanksFinancialInstitutions",
    "commitmentsRisks",
    "commercialBalances",
    "ofRemainingMembers",
    "ofWithdrawingMembers",
    "ofRescindedShareholdings",
    "sharesOfCapital",
    "specialCapital",
    "shareholdersLoan",
    "unrealizedCapital",
    "adjustmentItemForSharesOfLimitedPartner",
    "lossCompensationAccount",
    "capitalSurplus",
    "minorityInterest",
    "differenceinConsolidation",
    "differenceinCurrencyTranslation",
    "otherEquityFunds",
    "netWorthorTotalEquity",
    "capitalSilentPartners",
    "shareholderLoans",
    "incomeSubsidiesReceived",
    "specialReserves",
    "provisions",
    "liabilitiesDueMoreThanAYear",
    "liabilitiesDueWithinAYear",
    "adjustmentItem",
    "deferredIncome",
    "cityRenovationItem",
    "landAcquisition",
    "methodToOrder",
    "indemnificationSupportingBody",
    "liabilitiesFromBuildingCostsLeaseSubsidies",
    "otherCityRenovationItem",
    "otherUnclassifiedLiabilities",
    "totalLiabilitiesNetWorth",
    "liabilitiesToCreditInstitutions",
    "liabilitiesToCustomers",
    "liabilitiesFromMerchandising",
    "certificatedLiabilities",
    "liabilitiesHeldOnTrust",
    "loansHeldOnTrust",
    "fromIssuingLendingBusiness",
    "differentialUnderArt340EPar2SubPar2CommercialCode",
    "otherDeferredIncome",
    "actuarialProvisions",
    "fundsForBuildingSocietySavingsHedging",
    "foundations",
    "subordinatedDebtsDueWithinTwoYears",
    "convertibleDebenture",
    "convertibleDebenturePayableinLessThan2Years",
    "contributionSilentPartners",
    "fundsForGeneralBankingRisks",
    "outsideShareholdings",
    "specialItems",
    "paymentsForImplementationDecidedCapitalIncrease",
    "issuedCapital",
    "contributionUnlimitedlyLiablePartners",
    "contributionsLimitedPartners",
    "contributionsSilentPartners",
    "retainedIncomeReserves",
    "earnedCapital",
    "differentialAmountFromCapitalConsolidation",
    "compensatingItem",
    "otherCapitalElements",
    "retainedProfitLoss",
    "depositsOfAtypicalSilentPartners",
    "otherPositionsOfTotalEquity",
    "insuranceReserves",
    "actuarialReservesInTheRangeOfLifeInsurance",
    "otherAccruedDebts",
    "depositLiabilities",
    "otherInsuranceLiabilities",
    "differenceAccordingToArt341Hgb",
    "otherAccrualsAndDeferredIncome",
    "settlement",
    "resultToBeCarriedForward",
    "profitOrLossForPeriod",
    "interimDividends",
    "immunizedIncreaseInValueOrAppreciation",
    "unsubordinatedDebentures",
    "unsubordinatedDebenturesConvertible",
    "unsubordinatedDebenturesNonConvertible",
    "paymentsReceivedOnAccountShortTerm",
    "tradeCreditors",
    "billsExchangePayable",
    "liabilitiesDueToAffiliatedCompanies",
    "liabilitiesDueToOtherGroupCompanies",
    "otherCreditors",
    "netProfitLoss",
    "taxes",
    "socialSecurityExpenses"
})
public class BalanceSheetDtldLiabilitiesType {

    @XmlElement(name = "CurrentLiabilities")
    protected BalanceSheetDtldCurrentLiabilitiesType currentLiabilities;
    @XmlElement(name = "NonCurrentLiabilities")
    protected BalanceSheetDtldNonCurrentLiabilitiesType nonCurrentLiabilities;
    @XmlElement(name = "Equity")
    protected BalanceSheetDtldEquityType equity;
    @XmlElement(name = "Taxation")
    protected AmountType taxation;
    @XmlElement(name = "ProvisionsDeferredTaxes")
    protected AmountType provisionsDeferredTaxes;
    @XmlElement(name = "ProvisionsForLiabilitiesCharges")
    protected AmountType provisionsForLiabilitiesCharges;
    @XmlElement(name = "PensionsSimilarObligations")
    protected AmountType pensionsSimilarObligations;
    @XmlElement(name = "MajorRepairsMaintenance")
    protected AmountType majorRepairsMaintenance;
    @XmlElement(name = "OtherProvisions")
    protected AmountType otherProvisions;
    @XmlElement(name = "DeferredTaxes")
    protected AmountType deferredTaxes;
    @XmlElement(name = "OtherLiabilities")
    protected AmountType otherLiabilities;
    @XmlElement(name = "EqualizationAccounts")
    protected AmountType equalizationAccounts;
    @XmlElement(name = "ProvisionsForRisksChargesDeferredTaxes")
    protected AmountType provisionsForRisksChargesDeferredTaxes;
    @XmlElement(name = "ProvisionsForRisksCharges")
    protected AmountType provisionsForRisksCharges;
    @XmlElement(name = "PensionsSimilar")
    protected AmountType pensionsSimilar;
    @XmlElement(name = "TaxProvisions")
    protected AmountType taxProvisions;
    @XmlElement(name = "OtherRisksCharges")
    protected AmountType otherRisksCharges;
    @XmlElement(name = "FundForGeneralBankRisks")
    protected AmountType fundForGeneralBankRisks;
    @XmlElement(name = "SubordinatedDebts")
    protected AmountType subordinatedDebts;
    @XmlElement(name = "TotalLiabilities")
    protected AmountType totalLiabilities;
    @XmlElement(name = "DepositsbyReinsurers")
    protected AmountType depositsbyReinsurers;
    @XmlElement(name = "Liabilities")
    protected AmountType liabilities;
    @XmlElement(name = "OtherGroupNetWorth")
    protected AmountType otherGroupNetWorth;
    @XmlElement(name = "GroupNetWorth")
    protected AmountType groupNetWorth;
    @XmlElement(name = "LiableNetWorth")
    protected AmountType liableNetWorth;
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
    @XmlElement(name = "DebentureLoans")
    protected AmountType debentureLoans;
    @XmlElement(name = "AmountOwedToParticipations")
    protected AmountType amountOwedToParticipations;
    @XmlElement(name = "Savings")
    protected AmountType savings;
    @XmlElement(name = "OtherFundsEntrusted")
    protected AmountType otherFundsEntrusted;
    @XmlElement(name = "FundsEntrusted")
    protected AmountType fundsEntrusted;
    @XmlElement(name = "GeneralReserve")
    protected AmountType generalReserve;
    @XmlElement(name = "PriceDiffReserve")
    protected AmountType priceDiffReserve;
    @XmlElement(name = "InsuranceCompanyLiabilities")
    protected AmountType insuranceCompanyLiabilities;
    @XmlElement(name = "UnearnedPremiumsUnexpiredRisksGross")
    protected AmountType unearnedPremiumsUnexpiredRisksGross;
    @XmlElement(name = "UnearnedPremiumsUnexpiredRisksReinsurance")
    protected AmountType unearnedPremiumsUnexpiredRisksReinsurance;
    @XmlElement(name = "UnearnedPremiumsUnexpiredRisks")
    protected AmountType unearnedPremiumsUnexpiredRisks;
    @XmlElement(name = "LifeInsuranceGross")
    protected AmountType lifeInsuranceGross;
    @XmlElement(name = "LifeInsuranceReinsurance")
    protected AmountType lifeInsuranceReinsurance;
    @XmlElement(name = "LifeInsurance")
    protected AmountType lifeInsurance;
    @XmlElement(name = "ClaimsOutstandingGross")
    protected AmountType claimsOutstandingGross;
    @XmlElement(name = "ClaimsOutstandingReinsurance")
    protected AmountType claimsOutstandingReinsurance;
    @XmlElement(name = "ClaimsOutstanding")
    protected AmountType claimsOutstanding;
    @XmlElement(name = "ProfitSharingRebatesGross")
    protected AmountType profitSharingRebatesGross;
    @XmlElement(name = "ProfitSharingRebatesReinsurance")
    protected AmountType profitSharingRebatesReinsurance;
    @XmlElement(name = "ProfitSharingRebates")
    protected AmountType profitSharingRebates;
    @XmlElement(name = "OtherTechnicalProvisions")
    protected AmountType otherTechnicalProvisions;
    @XmlElement(name = "TechnicalProvisionsAccPolicyholdersGross")
    protected AmountType technicalProvisionsAccPolicyholdersGross;
    @XmlElement(name = "TechProvisionsAccPolicyholdersReinsurance")
    protected AmountType techProvisionsAccPolicyholdersReinsurance;
    @XmlElement(name = "TechnicalProvisionsWithInvestmentsForAccPolicyholders")
    protected AmountType technicalProvisionsWithInvestmentsForAccPolicyholders;
    @XmlElement(name = "ProvisionsInsuranceActivities")
    protected AmountType provisionsInsuranceActivities;
    @XmlElement(name = "DepositsWitheldFromInsurers")
    protected AmountType depositsWitheldFromInsurers;
    @XmlElement(name = "CreditorsOutDirectInsurance")
    protected AmountType creditorsOutDirectInsurance;
    @XmlElement(name = "CreditorsOutReinsurance")
    protected AmountType creditorsOutReinsurance;
    @XmlElement(name = "AmountsOwedToCreditInstitutions")
    protected AmountType amountsOwedToCreditInstitutions;
    @XmlElement(name = "OtherCreditorsInsuranceActivities")
    protected AmountType otherCreditorsInsuranceActivities;
    @XmlElement(name = "CreditorsInsuranceActivities")
    protected AmountType creditorsInsuranceActivities;
    @XmlElement(name = "AccrualsDeferredIncomeInsuranceActivities")
    protected AmountType accrualsDeferredIncomeInsuranceActivities;
    @XmlElement(name = "TotalLiabilitiesInsuranceCompany")
    protected AmountType totalLiabilitiesInsuranceCompany;
    @XmlElement(name = "BankCompanyLiabilities")
    protected AmountType bankCompanyLiabilities;
    @XmlElement(name = "AmountsOwedToCreditInstitutionsBankActivities")
    protected AmountType amountsOwedToCreditInstitutionsBankActivities;
    @XmlElement(name = "AmountsOwedToClientsBankActivities")
    protected AmountType amountsOwedToClientsBankActivities;
    @XmlElement(name = "OtherLiabilitiesBankActivities")
    protected AmountType otherLiabilitiesBankActivities;
    @XmlElement(name = "AccrualsDeferredIncomeBankActivities")
    protected AmountType accrualsDeferredIncomeBankActivities;
    @XmlElement(name = "ProvisionsBankActivities")
    protected AmountType provisionsBankActivities;
    @XmlElement(name = "TotalLiabilitiesBankCompany")
    protected AmountType totalLiabilitiesBankCompany;
    @XmlElement(name = "EliminationsLiabilities")
    protected AmountType eliminationsLiabilities;
    @XmlElement(name = "PayablesOtherLiabilities")
    protected AmountType payablesOtherLiabilities;
    @XmlElement(name = "AmountsOwedToBanksFinancialInstitutions")
    protected AmountType amountsOwedToBanksFinancialInstitutions;
    @XmlElement(name = "CommitmentsRisks")
    protected AmountType commitmentsRisks;
    @XmlElement(name = "CommercialBalances")
    protected AmountType commercialBalances;
    @XmlElement(name = "OfRemainingMembers")
    protected AmountType ofRemainingMembers;
    @XmlElement(name = "OfWithdrawingMembers")
    protected AmountType ofWithdrawingMembers;
    @XmlElement(name = "OfRescindedShareholdings")
    protected AmountType ofRescindedShareholdings;
    @XmlElement(name = "SharesOfCapital")
    protected BalanceSheetDtldLiabilitiesType.SharesOfCapital sharesOfCapital;
    @XmlElement(name = "SpecialCapital")
    protected AmountType specialCapital;
    @XmlElement(name = "ShareholdersLoan")
    protected BalanceSheetDtldLiabilitiesType.ShareholdersLoan shareholdersLoan;
    @XmlElement(name = "UnrealizedCapital")
    protected AmountType unrealizedCapital;
    @XmlElement(name = "AdjustmentItemForSharesOfLimitedPartner")
    protected AmountType adjustmentItemForSharesOfLimitedPartner;
    @XmlElement(name = "LossCompensationAccount")
    protected AmountType lossCompensationAccount;
    @XmlElement(name = "CapitalSurplus")
    protected BalanceSheetDtldLiabilitiesType.CapitalSurplus capitalSurplus;
    @XmlElement(name = "MinorityInterest")
    protected AmountType minorityInterest;
    @XmlElement(name = "DifferenceinConsolidation")
    protected AmountType differenceinConsolidation;
    @XmlElement(name = "DifferenceinCurrencyTranslation")
    protected AmountType differenceinCurrencyTranslation;
    @XmlElement(name = "OtherEquityFunds")
    protected BalanceSheetDtldLiabilitiesType.OtherEquityFunds otherEquityFunds;
    @XmlElement(name = "NetWorthorTotalEquity")
    protected AmountType netWorthorTotalEquity;
    @XmlElement(name = "CapitalSilentPartners")
    protected AmountType capitalSilentPartners;
    @XmlElement(name = "ShareholderLoans")
    protected AmountType shareholderLoans;
    @XmlElement(name = "IncomeSubsidiesReceived")
    protected BalanceSheetDtldLiabilitiesType.IncomeSubsidiesReceived incomeSubsidiesReceived;
    @XmlElement(name = "SpecialReserves")
    protected AmountType specialReserves;
    @XmlElement(name = "Provisions")
    protected BalanceSheetDtldLiabilitiesType.Provisions provisions;
    @XmlElement(name = "LiabilitiesDueMoreThanAYear")
    protected BalanceSheetDtldLiabilitiesType.LiabilitiesDueMoreThanAYear liabilitiesDueMoreThanAYear;
    @XmlElement(name = "LiabilitiesDueWithinAYear")
    protected BalanceSheetDtldLiabilitiesType.LiabilitiesDueWithinAYear liabilitiesDueWithinAYear;
    @XmlElement(name = "AdjustmentItem")
    protected AmountType adjustmentItem;
    @XmlElement(name = "DeferredIncome")
    protected AmountType deferredIncome;
    @XmlElement(name = "CityRenovationItem")
    protected AmountType cityRenovationItem;
    @XmlElement(name = "LandAcquisition")
    protected AmountType landAcquisition;
    @XmlElement(name = "MethodToOrder")
    protected AmountType methodToOrder;
    @XmlElement(name = "IndemnificationSupportingBody")
    protected AmountType indemnificationSupportingBody;
    @XmlElement(name = "LiabilitiesFromBuildingCostsLeaseSubsidies")
    protected AmountType liabilitiesFromBuildingCostsLeaseSubsidies;
    @XmlElement(name = "OtherCityRenovationItem")
    protected AmountType otherCityRenovationItem;
    @XmlElement(name = "OtherUnclassifiedLiabilities")
    protected AmountType otherUnclassifiedLiabilities;
    @XmlElement(name = "TotalLiabilitiesNetWorth")
    protected AmountType totalLiabilitiesNetWorth;
    @XmlElement(name = "LiabilitiesToCreditInstitutions")
    protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions liabilitiesToCreditInstitutions;
    @XmlElement(name = "LiabilitiesToCustomers")
    protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers liabilitiesToCustomers;
    @XmlElement(name = "LiabilitiesFromMerchandising")
    protected AmountType liabilitiesFromMerchandising;
    @XmlElement(name = "CertificatedLiabilities")
    protected BalanceSheetDtldLiabilitiesType.CertificatedLiabilities certificatedLiabilities;
    @XmlElement(name = "LiabilitiesHeldOnTrust")
    protected AmountType liabilitiesHeldOnTrust;
    @XmlElement(name = "LoansHeldOnTrust")
    protected AmountType loansHeldOnTrust;
    @XmlElement(name = "FromIssuingLendingBusiness")
    protected AmountType fromIssuingLendingBusiness;
    @XmlElement(name = "DifferentialUnderArt340EPar2SubPar2CommercialCode")
    protected AmountType differentialUnderArt340EPar2SubPar2CommercialCode;
    @XmlElement(name = "OtherDeferredIncome")
    protected AmountType otherDeferredIncome;
    @XmlElement(name = "ActuarialProvisions")
    protected BalanceSheetDtldLiabilitiesType.ActuarialProvisions actuarialProvisions;
    @XmlElement(name = "FundsForBuildingSocietySavingsHedging")
    protected AmountType fundsForBuildingSocietySavingsHedging;
    @XmlElement(name = "Foundations")
    protected AmountType foundations;
    @XmlElement(name = "SubordinatedDebtsDueWithinTwoYears")
    protected AmountType subordinatedDebtsDueWithinTwoYears;
    @XmlElement(name = "ConvertibleDebenture")
    protected AmountType convertibleDebenture;
    @XmlElement(name = "ConvertibleDebenturePayableinLessThan2Years")
    protected AmountType convertibleDebenturePayableinLessThan2Years;
    @XmlElement(name = "ContributionSilentPartners")
    protected AmountType contributionSilentPartners;
    @XmlElement(name = "FundsForGeneralBankingRisks")
    protected AmountType fundsForGeneralBankingRisks;
    @XmlElement(name = "OutsideShareholdings")
    protected AmountType outsideShareholdings;
    @XmlElement(name = "SpecialItems")
    protected AmountType specialItems;
    @XmlElement(name = "PaymentsForImplementationDecidedCapitalIncrease")
    protected AmountType paymentsForImplementationDecidedCapitalIncrease;
    @XmlElement(name = "IssuedCapital")
    protected BalanceSheetDtldLiabilitiesType.IssuedCapital issuedCapital;
    @XmlElement(name = "ContributionUnlimitedlyLiablePartners")
    protected BalanceSheetDtldLiabilitiesType.ContributionUnlimitedlyLiablePartners contributionUnlimitedlyLiablePartners;
    @XmlElement(name = "ContributionsLimitedPartners")
    protected BalanceSheetDtldLiabilitiesType.ContributionsLimitedPartners contributionsLimitedPartners;
    @XmlElement(name = "ContributionsSilentPartners")
    protected BalanceSheetDtldLiabilitiesType.ContributionsSilentPartners contributionsSilentPartners;
    @XmlElement(name = "RetainedIncomeReserves")
    protected BalanceSheetDtldLiabilitiesType.RetainedIncomeReserves retainedIncomeReserves;
    @XmlElement(name = "EarnedCapital")
    protected AmountType earnedCapital;
    @XmlElement(name = "DifferentialAmountFromCapitalConsolidation")
    protected AmountType differentialAmountFromCapitalConsolidation;
    @XmlElement(name = "CompensatingItem")
    protected AmountType compensatingItem;
    @XmlElement(name = "OtherCapitalElements")
    protected AmountType otherCapitalElements;
    @XmlElement(name = "RetainedProfitLoss")
    protected BalanceSheetDtldLiabilitiesType.RetainedProfitLoss retainedProfitLoss;
    @XmlElement(name = "DepositsOfAtypicalSilentPartners")
    protected BalanceSheetDtldLiabilitiesType.DepositsOfAtypicalSilentPartners depositsOfAtypicalSilentPartners;
    @XmlElement(name = "OtherPositionsOfTotalEquity")
    protected AmountType otherPositionsOfTotalEquity;
    @XmlElement(name = "InsuranceReserves")
    protected BalanceSheetDtldLiabilitiesType.InsuranceReserves insuranceReserves;
    @XmlElement(name = "ActuarialReservesInTheRangeOfLifeInsurance")
    protected BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance actuarialReservesInTheRangeOfLifeInsurance;
    @XmlElement(name = "OtherAccruedDebts")
    protected BalanceSheetDtldLiabilitiesType.OtherAccruedDebts otherAccruedDebts;
    @XmlElement(name = "DepositLiabilities")
    protected BalanceSheetDtldLiabilitiesType.DepositLiabilities depositLiabilities;
    @XmlElement(name = "OtherInsuranceLiabilities")
    protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities otherInsuranceLiabilities;
    @XmlElement(name = "DifferenceAccordingToArt341Hgb")
    protected AmountType differenceAccordingToArt341Hgb;
    @XmlElement(name = "OtherAccrualsAndDeferredIncome")
    protected AmountType otherAccrualsAndDeferredIncome;
    @XmlElement(name = "Settlement")
    protected AmountType settlement;
    @XmlElement(name = "ResultToBeCarriedForward")
    protected AmountType resultToBeCarriedForward;
    @XmlElement(name = "ProfitOrLossForPeriod")
    protected AmountType profitOrLossForPeriod;
    @XmlElement(name = "InterimDividends")
    protected AmountType interimDividends;
    @XmlElement(name = "ImmunizedIncreaseInValueOrAppreciation")
    protected AmountType immunizedIncreaseInValueOrAppreciation;
    @XmlElement(name = "UnsubordinatedDebentures")
    protected AmountType unsubordinatedDebentures;
    @XmlElement(name = "UnsubordinatedDebenturesConvertible")
    protected AmountType unsubordinatedDebenturesConvertible;
    @XmlElement(name = "UnsubordinatedDebenturesNonConvertible")
    protected AmountType unsubordinatedDebenturesNonConvertible;
    @XmlElement(name = "PaymentsReceivedOnAccountShortTerm")
    protected AmountType paymentsReceivedOnAccountShortTerm;
    @XmlElement(name = "TradeCreditors")
    protected AmountType tradeCreditors;
    @XmlElement(name = "BillsExchangePayable")
    protected AmountType billsExchangePayable;
    @XmlElement(name = "LiabilitiesDueToAffiliatedCompanies")
    protected AmountType liabilitiesDueToAffiliatedCompanies;
    @XmlElement(name = "LiabilitiesDueToOtherGroupCompanies")
    protected AmountType liabilitiesDueToOtherGroupCompanies;
    @XmlElement(name = "OtherCreditors")
    protected AmountType otherCreditors;
    @XmlElement(name = "NetProfitLoss")
    protected AmountType netProfitLoss;
    @XmlElement(name = "Taxes")
    protected AmountType taxes;
    @XmlElement(name = "SocialSecurityExpenses")
    protected AmountType socialSecurityExpenses;

    /**
     * Gets the value of the currentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldCurrentLiabilitiesType }
     *     
     */
    public BalanceSheetDtldCurrentLiabilitiesType getCurrentLiabilities() {
        return currentLiabilities;
    }

    /**
     * Sets the value of the currentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldCurrentLiabilitiesType }
     *     
     */
    public void setCurrentLiabilities(BalanceSheetDtldCurrentLiabilitiesType value) {
        this.currentLiabilities = value;
    }

    /**
     * Gets the value of the nonCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldNonCurrentLiabilitiesType }
     *     
     */
    public BalanceSheetDtldNonCurrentLiabilitiesType getNonCurrentLiabilities() {
        return nonCurrentLiabilities;
    }

    /**
     * Sets the value of the nonCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldNonCurrentLiabilitiesType }
     *     
     */
    public void setNonCurrentLiabilities(BalanceSheetDtldNonCurrentLiabilitiesType value) {
        this.nonCurrentLiabilities = value;
    }

    /**
     * Gets the value of the equity property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldEquityType }
     *     
     */
    public BalanceSheetDtldEquityType getEquity() {
        return equity;
    }

    /**
     * Sets the value of the equity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldEquityType }
     *     
     */
    public void setEquity(BalanceSheetDtldEquityType value) {
        this.equity = value;
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
     * Gets the value of the provisionsDeferredTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsDeferredTaxes() {
        return provisionsDeferredTaxes;
    }

    /**
     * Sets the value of the provisionsDeferredTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsDeferredTaxes(AmountType value) {
        this.provisionsDeferredTaxes = value;
    }

    /**
     * Gets the value of the provisionsForLiabilitiesCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForLiabilitiesCharges() {
        return provisionsForLiabilitiesCharges;
    }

    /**
     * Sets the value of the provisionsForLiabilitiesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForLiabilitiesCharges(AmountType value) {
        this.provisionsForLiabilitiesCharges = value;
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
     * Gets the value of the majorRepairsMaintenance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMajorRepairsMaintenance() {
        return majorRepairsMaintenance;
    }

    /**
     * Sets the value of the majorRepairsMaintenance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMajorRepairsMaintenance(AmountType value) {
        this.majorRepairsMaintenance = value;
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
     * Gets the value of the deferredTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredTaxes() {
        return deferredTaxes;
    }

    /**
     * Sets the value of the deferredTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredTaxes(AmountType value) {
        this.deferredTaxes = value;
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
     * Gets the value of the provisionsForRisksChargesDeferredTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForRisksChargesDeferredTaxes() {
        return provisionsForRisksChargesDeferredTaxes;
    }

    /**
     * Sets the value of the provisionsForRisksChargesDeferredTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForRisksChargesDeferredTaxes(AmountType value) {
        this.provisionsForRisksChargesDeferredTaxes = value;
    }

    /**
     * Gets the value of the provisionsForRisksCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsForRisksCharges() {
        return provisionsForRisksCharges;
    }

    /**
     * Sets the value of the provisionsForRisksCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsForRisksCharges(AmountType value) {
        this.provisionsForRisksCharges = value;
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
     * Gets the value of the taxProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxProvisions() {
        return taxProvisions;
    }

    /**
     * Sets the value of the taxProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxProvisions(AmountType value) {
        this.taxProvisions = value;
    }

    /**
     * Gets the value of the otherRisksCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherRisksCharges() {
        return otherRisksCharges;
    }

    /**
     * Sets the value of the otherRisksCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherRisksCharges(AmountType value) {
        this.otherRisksCharges = value;
    }

    /**
     * Gets the value of the fundForGeneralBankRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFundForGeneralBankRisks() {
        return fundForGeneralBankRisks;
    }

    /**
     * Sets the value of the fundForGeneralBankRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFundForGeneralBankRisks(AmountType value) {
        this.fundForGeneralBankRisks = value;
    }

    /**
     * Gets the value of the subordinatedDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedDebts() {
        return subordinatedDebts;
    }

    /**
     * Sets the value of the subordinatedDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedDebts(AmountType value) {
        this.subordinatedDebts = value;
    }

    /**
     * Gets the value of the totalLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilities() {
        return totalLiabilities;
    }

    /**
     * Sets the value of the totalLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilities(AmountType value) {
        this.totalLiabilities = value;
    }

    /**
     * Gets the value of the depositsbyReinsurers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositsbyReinsurers() {
        return depositsbyReinsurers;
    }

    /**
     * Sets the value of the depositsbyReinsurers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositsbyReinsurers(AmountType value) {
        this.depositsbyReinsurers = value;
    }

    /**
     * Gets the value of the liabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilities() {
        return liabilities;
    }

    /**
     * Sets the value of the liabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilities(AmountType value) {
        this.liabilities = value;
    }

    /**
     * Gets the value of the otherGroupNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherGroupNetWorth() {
        return otherGroupNetWorth;
    }

    /**
     * Sets the value of the otherGroupNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherGroupNetWorth(AmountType value) {
        this.otherGroupNetWorth = value;
    }

    /**
     * Gets the value of the groupNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroupNetWorth() {
        return groupNetWorth;
    }

    /**
     * Sets the value of the groupNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroupNetWorth(AmountType value) {
        this.groupNetWorth = value;
    }

    /**
     * Gets the value of the liableNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiableNetWorth() {
        return liableNetWorth;
    }

    /**
     * Sets the value of the liableNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiableNetWorth(AmountType value) {
        this.liableNetWorth = value;
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
     * Gets the value of the savings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSavings() {
        return savings;
    }

    /**
     * Sets the value of the savings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSavings(AmountType value) {
        this.savings = value;
    }

    /**
     * Gets the value of the otherFundsEntrusted property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFundsEntrusted() {
        return otherFundsEntrusted;
    }

    /**
     * Sets the value of the otherFundsEntrusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFundsEntrusted(AmountType value) {
        this.otherFundsEntrusted = value;
    }

    /**
     * Gets the value of the fundsEntrusted property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFundsEntrusted() {
        return fundsEntrusted;
    }

    /**
     * Sets the value of the fundsEntrusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFundsEntrusted(AmountType value) {
        this.fundsEntrusted = value;
    }

    /**
     * Gets the value of the generalReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGeneralReserve() {
        return generalReserve;
    }

    /**
     * Sets the value of the generalReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGeneralReserve(AmountType value) {
        this.generalReserve = value;
    }

    /**
     * Gets the value of the priceDiffReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceDiffReserve() {
        return priceDiffReserve;
    }

    /**
     * Sets the value of the priceDiffReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceDiffReserve(AmountType value) {
        this.priceDiffReserve = value;
    }

    /**
     * Gets the value of the insuranceCompanyLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCompanyLiabilities() {
        return insuranceCompanyLiabilities;
    }

    /**
     * Sets the value of the insuranceCompanyLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCompanyLiabilities(AmountType value) {
        this.insuranceCompanyLiabilities = value;
    }

    /**
     * Gets the value of the unearnedPremiumsUnexpiredRisksGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnearnedPremiumsUnexpiredRisksGross() {
        return unearnedPremiumsUnexpiredRisksGross;
    }

    /**
     * Sets the value of the unearnedPremiumsUnexpiredRisksGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnearnedPremiumsUnexpiredRisksGross(AmountType value) {
        this.unearnedPremiumsUnexpiredRisksGross = value;
    }

    /**
     * Gets the value of the unearnedPremiumsUnexpiredRisksReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnearnedPremiumsUnexpiredRisksReinsurance() {
        return unearnedPremiumsUnexpiredRisksReinsurance;
    }

    /**
     * Sets the value of the unearnedPremiumsUnexpiredRisksReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnearnedPremiumsUnexpiredRisksReinsurance(AmountType value) {
        this.unearnedPremiumsUnexpiredRisksReinsurance = value;
    }

    /**
     * Gets the value of the unearnedPremiumsUnexpiredRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnearnedPremiumsUnexpiredRisks() {
        return unearnedPremiumsUnexpiredRisks;
    }

    /**
     * Sets the value of the unearnedPremiumsUnexpiredRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnearnedPremiumsUnexpiredRisks(AmountType value) {
        this.unearnedPremiumsUnexpiredRisks = value;
    }

    /**
     * Gets the value of the lifeInsuranceGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceGross() {
        return lifeInsuranceGross;
    }

    /**
     * Sets the value of the lifeInsuranceGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceGross(AmountType value) {
        this.lifeInsuranceGross = value;
    }

    /**
     * Gets the value of the lifeInsuranceReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceReinsurance() {
        return lifeInsuranceReinsurance;
    }

    /**
     * Sets the value of the lifeInsuranceReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceReinsurance(AmountType value) {
        this.lifeInsuranceReinsurance = value;
    }

    /**
     * Gets the value of the lifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsurance() {
        return lifeInsurance;
    }

    /**
     * Sets the value of the lifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsurance(AmountType value) {
        this.lifeInsurance = value;
    }

    /**
     * Gets the value of the claimsOutstandingGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsOutstandingGross() {
        return claimsOutstandingGross;
    }

    /**
     * Sets the value of the claimsOutstandingGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsOutstandingGross(AmountType value) {
        this.claimsOutstandingGross = value;
    }

    /**
     * Gets the value of the claimsOutstandingReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsOutstandingReinsurance() {
        return claimsOutstandingReinsurance;
    }

    /**
     * Sets the value of the claimsOutstandingReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsOutstandingReinsurance(AmountType value) {
        this.claimsOutstandingReinsurance = value;
    }

    /**
     * Gets the value of the claimsOutstanding property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsOutstanding() {
        return claimsOutstanding;
    }

    /**
     * Sets the value of the claimsOutstanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsOutstanding(AmountType value) {
        this.claimsOutstanding = value;
    }

    /**
     * Gets the value of the profitSharingRebatesGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitSharingRebatesGross() {
        return profitSharingRebatesGross;
    }

    /**
     * Sets the value of the profitSharingRebatesGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitSharingRebatesGross(AmountType value) {
        this.profitSharingRebatesGross = value;
    }

    /**
     * Gets the value of the profitSharingRebatesReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitSharingRebatesReinsurance() {
        return profitSharingRebatesReinsurance;
    }

    /**
     * Sets the value of the profitSharingRebatesReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitSharingRebatesReinsurance(AmountType value) {
        this.profitSharingRebatesReinsurance = value;
    }

    /**
     * Gets the value of the profitSharingRebates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitSharingRebates() {
        return profitSharingRebates;
    }

    /**
     * Sets the value of the profitSharingRebates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitSharingRebates(AmountType value) {
        this.profitSharingRebates = value;
    }

    /**
     * Gets the value of the otherTechnicalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTechnicalProvisions() {
        return otherTechnicalProvisions;
    }

    /**
     * Sets the value of the otherTechnicalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTechnicalProvisions(AmountType value) {
        this.otherTechnicalProvisions = value;
    }

    /**
     * Gets the value of the technicalProvisionsAccPolicyholdersGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalProvisionsAccPolicyholdersGross() {
        return technicalProvisionsAccPolicyholdersGross;
    }

    /**
     * Sets the value of the technicalProvisionsAccPolicyholdersGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalProvisionsAccPolicyholdersGross(AmountType value) {
        this.technicalProvisionsAccPolicyholdersGross = value;
    }

    /**
     * Gets the value of the techProvisionsAccPolicyholdersReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechProvisionsAccPolicyholdersReinsurance() {
        return techProvisionsAccPolicyholdersReinsurance;
    }

    /**
     * Sets the value of the techProvisionsAccPolicyholdersReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechProvisionsAccPolicyholdersReinsurance(AmountType value) {
        this.techProvisionsAccPolicyholdersReinsurance = value;
    }

    /**
     * Gets the value of the technicalProvisionsWithInvestmentsForAccPolicyholders property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalProvisionsWithInvestmentsForAccPolicyholders() {
        return technicalProvisionsWithInvestmentsForAccPolicyholders;
    }

    /**
     * Sets the value of the technicalProvisionsWithInvestmentsForAccPolicyholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalProvisionsWithInvestmentsForAccPolicyholders(AmountType value) {
        this.technicalProvisionsWithInvestmentsForAccPolicyholders = value;
    }

    /**
     * Gets the value of the provisionsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsInsuranceActivities() {
        return provisionsInsuranceActivities;
    }

    /**
     * Sets the value of the provisionsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsInsuranceActivities(AmountType value) {
        this.provisionsInsuranceActivities = value;
    }

    /**
     * Gets the value of the depositsWitheldFromInsurers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepositsWitheldFromInsurers() {
        return depositsWitheldFromInsurers;
    }

    /**
     * Sets the value of the depositsWitheldFromInsurers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepositsWitheldFromInsurers(AmountType value) {
        this.depositsWitheldFromInsurers = value;
    }

    /**
     * Gets the value of the creditorsOutDirectInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditorsOutDirectInsurance() {
        return creditorsOutDirectInsurance;
    }

    /**
     * Sets the value of the creditorsOutDirectInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditorsOutDirectInsurance(AmountType value) {
        this.creditorsOutDirectInsurance = value;
    }

    /**
     * Gets the value of the creditorsOutReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditorsOutReinsurance() {
        return creditorsOutReinsurance;
    }

    /**
     * Sets the value of the creditorsOutReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditorsOutReinsurance(AmountType value) {
        this.creditorsOutReinsurance = value;
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
     * Gets the value of the otherCreditorsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCreditorsInsuranceActivities() {
        return otherCreditorsInsuranceActivities;
    }

    /**
     * Sets the value of the otherCreditorsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCreditorsInsuranceActivities(AmountType value) {
        this.otherCreditorsInsuranceActivities = value;
    }

    /**
     * Gets the value of the creditorsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCreditorsInsuranceActivities() {
        return creditorsInsuranceActivities;
    }

    /**
     * Sets the value of the creditorsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCreditorsInsuranceActivities(AmountType value) {
        this.creditorsInsuranceActivities = value;
    }

    /**
     * Gets the value of the accrualsDeferredIncomeInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccrualsDeferredIncomeInsuranceActivities() {
        return accrualsDeferredIncomeInsuranceActivities;
    }

    /**
     * Sets the value of the accrualsDeferredIncomeInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccrualsDeferredIncomeInsuranceActivities(AmountType value) {
        this.accrualsDeferredIncomeInsuranceActivities = value;
    }

    /**
     * Gets the value of the totalLiabilitiesInsuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesInsuranceCompany() {
        return totalLiabilitiesInsuranceCompany;
    }

    /**
     * Sets the value of the totalLiabilitiesInsuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesInsuranceCompany(AmountType value) {
        this.totalLiabilitiesInsuranceCompany = value;
    }

    /**
     * Gets the value of the bankCompanyLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankCompanyLiabilities() {
        return bankCompanyLiabilities;
    }

    /**
     * Sets the value of the bankCompanyLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankCompanyLiabilities(AmountType value) {
        this.bankCompanyLiabilities = value;
    }

    /**
     * Gets the value of the amountsOwedToCreditInstitutionsBankActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToCreditInstitutionsBankActivities() {
        return amountsOwedToCreditInstitutionsBankActivities;
    }

    /**
     * Sets the value of the amountsOwedToCreditInstitutionsBankActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToCreditInstitutionsBankActivities(AmountType value) {
        this.amountsOwedToCreditInstitutionsBankActivities = value;
    }

    /**
     * Gets the value of the amountsOwedToClientsBankActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToClientsBankActivities() {
        return amountsOwedToClientsBankActivities;
    }

    /**
     * Sets the value of the amountsOwedToClientsBankActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToClientsBankActivities(AmountType value) {
        this.amountsOwedToClientsBankActivities = value;
    }

    /**
     * Gets the value of the otherLiabilitiesBankActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLiabilitiesBankActivities() {
        return otherLiabilitiesBankActivities;
    }

    /**
     * Sets the value of the otherLiabilitiesBankActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLiabilitiesBankActivities(AmountType value) {
        this.otherLiabilitiesBankActivities = value;
    }

    /**
     * Gets the value of the accrualsDeferredIncomeBankActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccrualsDeferredIncomeBankActivities() {
        return accrualsDeferredIncomeBankActivities;
    }

    /**
     * Sets the value of the accrualsDeferredIncomeBankActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccrualsDeferredIncomeBankActivities(AmountType value) {
        this.accrualsDeferredIncomeBankActivities = value;
    }

    /**
     * Gets the value of the provisionsBankActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionsBankActivities() {
        return provisionsBankActivities;
    }

    /**
     * Sets the value of the provisionsBankActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionsBankActivities(AmountType value) {
        this.provisionsBankActivities = value;
    }

    /**
     * Gets the value of the totalLiabilitiesBankCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesBankCompany() {
        return totalLiabilitiesBankCompany;
    }

    /**
     * Sets the value of the totalLiabilitiesBankCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesBankCompany(AmountType value) {
        this.totalLiabilitiesBankCompany = value;
    }

    /**
     * Gets the value of the eliminationsLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEliminationsLiabilities() {
        return eliminationsLiabilities;
    }

    /**
     * Sets the value of the eliminationsLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEliminationsLiabilities(AmountType value) {
        this.eliminationsLiabilities = value;
    }

    /**
     * Gets the value of the payablesOtherLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPayablesOtherLiabilities() {
        return payablesOtherLiabilities;
    }

    /**
     * Sets the value of the payablesOtherLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPayablesOtherLiabilities(AmountType value) {
        this.payablesOtherLiabilities = value;
    }

    /**
     * Gets the value of the amountsOwedToBanksFinancialInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedToBanksFinancialInstitutions() {
        return amountsOwedToBanksFinancialInstitutions;
    }

    /**
     * Sets the value of the amountsOwedToBanksFinancialInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedToBanksFinancialInstitutions(AmountType value) {
        this.amountsOwedToBanksFinancialInstitutions = value;
    }

    /**
     * Gets the value of the commitmentsRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCommitmentsRisks() {
        return commitmentsRisks;
    }

    /**
     * Sets the value of the commitmentsRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCommitmentsRisks(AmountType value) {
        this.commitmentsRisks = value;
    }

    /**
     * Gets the value of the commercialBalances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCommercialBalances() {
        return commercialBalances;
    }

    /**
     * Sets the value of the commercialBalances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCommercialBalances(AmountType value) {
        this.commercialBalances = value;
    }

    /**
     * Gets the value of the ofRemainingMembers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOfRemainingMembers() {
        return ofRemainingMembers;
    }

    /**
     * Sets the value of the ofRemainingMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOfRemainingMembers(AmountType value) {
        this.ofRemainingMembers = value;
    }

    /**
     * Gets the value of the ofWithdrawingMembers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOfWithdrawingMembers() {
        return ofWithdrawingMembers;
    }

    /**
     * Sets the value of the ofWithdrawingMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOfWithdrawingMembers(AmountType value) {
        this.ofWithdrawingMembers = value;
    }

    /**
     * Gets the value of the ofRescindedShareholdings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOfRescindedShareholdings() {
        return ofRescindedShareholdings;
    }

    /**
     * Sets the value of the ofRescindedShareholdings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOfRescindedShareholdings(AmountType value) {
        this.ofRescindedShareholdings = value;
    }

    /**
     * Gets the value of the sharesOfCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.SharesOfCapital getSharesOfCapital() {
        return sharesOfCapital;
    }

    /**
     * Sets the value of the sharesOfCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital }
     *     
     */
    public void setSharesOfCapital(BalanceSheetDtldLiabilitiesType.SharesOfCapital value) {
        this.sharesOfCapital = value;
    }

    /**
     * Gets the value of the specialCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialCapital() {
        return specialCapital;
    }

    /**
     * Sets the value of the specialCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialCapital(AmountType value) {
        this.specialCapital = value;
    }

    /**
     * Gets the value of the shareholdersLoan property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ShareholdersLoan }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ShareholdersLoan getShareholdersLoan() {
        return shareholdersLoan;
    }

    /**
     * Sets the value of the shareholdersLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ShareholdersLoan }
     *     
     */
    public void setShareholdersLoan(BalanceSheetDtldLiabilitiesType.ShareholdersLoan value) {
        this.shareholdersLoan = value;
    }

    /**
     * Gets the value of the unrealizedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnrealizedCapital() {
        return unrealizedCapital;
    }

    /**
     * Sets the value of the unrealizedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnrealizedCapital(AmountType value) {
        this.unrealizedCapital = value;
    }

    /**
     * Gets the value of the adjustmentItemForSharesOfLimitedPartner property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentItemForSharesOfLimitedPartner() {
        return adjustmentItemForSharesOfLimitedPartner;
    }

    /**
     * Sets the value of the adjustmentItemForSharesOfLimitedPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentItemForSharesOfLimitedPartner(AmountType value) {
        this.adjustmentItemForSharesOfLimitedPartner = value;
    }

    /**
     * Gets the value of the lossCompensationAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossCompensationAccount() {
        return lossCompensationAccount;
    }

    /**
     * Sets the value of the lossCompensationAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossCompensationAccount(AmountType value) {
        this.lossCompensationAccount = value;
    }

    /**
     * Gets the value of the capitalSurplus property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.CapitalSurplus }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.CapitalSurplus getCapitalSurplus() {
        return capitalSurplus;
    }

    /**
     * Sets the value of the capitalSurplus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.CapitalSurplus }
     *     
     */
    public void setCapitalSurplus(BalanceSheetDtldLiabilitiesType.CapitalSurplus value) {
        this.capitalSurplus = value;
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
     * Gets the value of the differenceinConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDifferenceinConsolidation() {
        return differenceinConsolidation;
    }

    /**
     * Sets the value of the differenceinConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDifferenceinConsolidation(AmountType value) {
        this.differenceinConsolidation = value;
    }

    /**
     * Gets the value of the differenceinCurrencyTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDifferenceinCurrencyTranslation() {
        return differenceinCurrencyTranslation;
    }

    /**
     * Sets the value of the differenceinCurrencyTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDifferenceinCurrencyTranslation(AmountType value) {
        this.differenceinCurrencyTranslation = value;
    }

    /**
     * Gets the value of the otherEquityFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherEquityFunds }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.OtherEquityFunds getOtherEquityFunds() {
        return otherEquityFunds;
    }

    /**
     * Sets the value of the otherEquityFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherEquityFunds }
     *     
     */
    public void setOtherEquityFunds(BalanceSheetDtldLiabilitiesType.OtherEquityFunds value) {
        this.otherEquityFunds = value;
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
     * Gets the value of the capitalSilentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalSilentPartners() {
        return capitalSilentPartners;
    }

    /**
     * Sets the value of the capitalSilentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalSilentPartners(AmountType value) {
        this.capitalSilentPartners = value;
    }

    /**
     * Gets the value of the shareholderLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareholderLoans() {
        return shareholderLoans;
    }

    /**
     * Sets the value of the shareholderLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareholderLoans(AmountType value) {
        this.shareholderLoans = value;
    }

    /**
     * Gets the value of the incomeSubsidiesReceived property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.IncomeSubsidiesReceived }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.IncomeSubsidiesReceived getIncomeSubsidiesReceived() {
        return incomeSubsidiesReceived;
    }

    /**
     * Sets the value of the incomeSubsidiesReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.IncomeSubsidiesReceived }
     *     
     */
    public void setIncomeSubsidiesReceived(BalanceSheetDtldLiabilitiesType.IncomeSubsidiesReceived value) {
        this.incomeSubsidiesReceived = value;
    }

    /**
     * Gets the value of the specialReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialReserves() {
        return specialReserves;
    }

    /**
     * Sets the value of the specialReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialReserves(AmountType value) {
        this.specialReserves = value;
    }

    /**
     * Gets the value of the provisions property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.Provisions }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.Provisions getProvisions() {
        return provisions;
    }

    /**
     * Sets the value of the provisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.Provisions }
     *     
     */
    public void setProvisions(BalanceSheetDtldLiabilitiesType.Provisions value) {
        this.provisions = value;
    }

    /**
     * Gets the value of the liabilitiesDueMoreThanAYear property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesDueMoreThanAYear }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.LiabilitiesDueMoreThanAYear getLiabilitiesDueMoreThanAYear() {
        return liabilitiesDueMoreThanAYear;
    }

    /**
     * Sets the value of the liabilitiesDueMoreThanAYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesDueMoreThanAYear }
     *     
     */
    public void setLiabilitiesDueMoreThanAYear(BalanceSheetDtldLiabilitiesType.LiabilitiesDueMoreThanAYear value) {
        this.liabilitiesDueMoreThanAYear = value;
    }

    /**
     * Gets the value of the liabilitiesDueWithinAYear property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesDueWithinAYear }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.LiabilitiesDueWithinAYear getLiabilitiesDueWithinAYear() {
        return liabilitiesDueWithinAYear;
    }

    /**
     * Sets the value of the liabilitiesDueWithinAYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesDueWithinAYear }
     *     
     */
    public void setLiabilitiesDueWithinAYear(BalanceSheetDtldLiabilitiesType.LiabilitiesDueWithinAYear value) {
        this.liabilitiesDueWithinAYear = value;
    }

    /**
     * Gets the value of the adjustmentItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentItem() {
        return adjustmentItem;
    }

    /**
     * Sets the value of the adjustmentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentItem(AmountType value) {
        this.adjustmentItem = value;
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
     * Gets the value of the cityRenovationItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCityRenovationItem() {
        return cityRenovationItem;
    }

    /**
     * Sets the value of the cityRenovationItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCityRenovationItem(AmountType value) {
        this.cityRenovationItem = value;
    }

    /**
     * Gets the value of the landAcquisition property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandAcquisition() {
        return landAcquisition;
    }

    /**
     * Sets the value of the landAcquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandAcquisition(AmountType value) {
        this.landAcquisition = value;
    }

    /**
     * Gets the value of the methodToOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMethodToOrder() {
        return methodToOrder;
    }

    /**
     * Sets the value of the methodToOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMethodToOrder(AmountType value) {
        this.methodToOrder = value;
    }

    /**
     * Gets the value of the indemnificationSupportingBody property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIndemnificationSupportingBody() {
        return indemnificationSupportingBody;
    }

    /**
     * Sets the value of the indemnificationSupportingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIndemnificationSupportingBody(AmountType value) {
        this.indemnificationSupportingBody = value;
    }

    /**
     * Gets the value of the liabilitiesFromBuildingCostsLeaseSubsidies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFromBuildingCostsLeaseSubsidies() {
        return liabilitiesFromBuildingCostsLeaseSubsidies;
    }

    /**
     * Sets the value of the liabilitiesFromBuildingCostsLeaseSubsidies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFromBuildingCostsLeaseSubsidies(AmountType value) {
        this.liabilitiesFromBuildingCostsLeaseSubsidies = value;
    }

    /**
     * Gets the value of the otherCityRenovationItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCityRenovationItem() {
        return otherCityRenovationItem;
    }

    /**
     * Sets the value of the otherCityRenovationItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCityRenovationItem(AmountType value) {
        this.otherCityRenovationItem = value;
    }

    /**
     * Gets the value of the otherUnclassifiedLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherUnclassifiedLiabilities() {
        return otherUnclassifiedLiabilities;
    }

    /**
     * Sets the value of the otherUnclassifiedLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherUnclassifiedLiabilities(AmountType value) {
        this.otherUnclassifiedLiabilities = value;
    }

    /**
     * Gets the value of the totalLiabilitiesNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesNetWorth() {
        return totalLiabilitiesNetWorth;
    }

    /**
     * Sets the value of the totalLiabilitiesNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesNetWorth(AmountType value) {
        this.totalLiabilitiesNetWorth = value;
    }

    /**
     * Gets the value of the liabilitiesToCreditInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions getLiabilitiesToCreditInstitutions() {
        return liabilitiesToCreditInstitutions;
    }

    /**
     * Sets the value of the liabilitiesToCreditInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions }
     *     
     */
    public void setLiabilitiesToCreditInstitutions(BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions value) {
        this.liabilitiesToCreditInstitutions = value;
    }

    /**
     * Gets the value of the liabilitiesToCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers getLiabilitiesToCustomers() {
        return liabilitiesToCustomers;
    }

    /**
     * Sets the value of the liabilitiesToCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers }
     *     
     */
    public void setLiabilitiesToCustomers(BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers value) {
        this.liabilitiesToCustomers = value;
    }

    /**
     * Gets the value of the liabilitiesFromMerchandising property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesFromMerchandising() {
        return liabilitiesFromMerchandising;
    }

    /**
     * Sets the value of the liabilitiesFromMerchandising property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesFromMerchandising(AmountType value) {
        this.liabilitiesFromMerchandising = value;
    }

    /**
     * Gets the value of the certificatedLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.CertificatedLiabilities }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.CertificatedLiabilities getCertificatedLiabilities() {
        return certificatedLiabilities;
    }

    /**
     * Sets the value of the certificatedLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.CertificatedLiabilities }
     *     
     */
    public void setCertificatedLiabilities(BalanceSheetDtldLiabilitiesType.CertificatedLiabilities value) {
        this.certificatedLiabilities = value;
    }

    /**
     * Gets the value of the liabilitiesHeldOnTrust property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLiabilitiesHeldOnTrust() {
        return liabilitiesHeldOnTrust;
    }

    /**
     * Sets the value of the liabilitiesHeldOnTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLiabilitiesHeldOnTrust(AmountType value) {
        this.liabilitiesHeldOnTrust = value;
    }

    /**
     * Gets the value of the loansHeldOnTrust property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansHeldOnTrust() {
        return loansHeldOnTrust;
    }

    /**
     * Sets the value of the loansHeldOnTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansHeldOnTrust(AmountType value) {
        this.loansHeldOnTrust = value;
    }

    /**
     * Gets the value of the fromIssuingLendingBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFromIssuingLendingBusiness() {
        return fromIssuingLendingBusiness;
    }

    /**
     * Sets the value of the fromIssuingLendingBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFromIssuingLendingBusiness(AmountType value) {
        this.fromIssuingLendingBusiness = value;
    }

    /**
     * Gets the value of the differentialUnderArt340EPar2SubPar2CommercialCode property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDifferentialUnderArt340EPar2SubPar2CommercialCode() {
        return differentialUnderArt340EPar2SubPar2CommercialCode;
    }

    /**
     * Sets the value of the differentialUnderArt340EPar2SubPar2CommercialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDifferentialUnderArt340EPar2SubPar2CommercialCode(AmountType value) {
        this.differentialUnderArt340EPar2SubPar2CommercialCode = value;
    }

    /**
     * Gets the value of the otherDeferredIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDeferredIncome() {
        return otherDeferredIncome;
    }

    /**
     * Sets the value of the otherDeferredIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDeferredIncome(AmountType value) {
        this.otherDeferredIncome = value;
    }

    /**
     * Gets the value of the actuarialProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ActuarialProvisions }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ActuarialProvisions getActuarialProvisions() {
        return actuarialProvisions;
    }

    /**
     * Sets the value of the actuarialProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ActuarialProvisions }
     *     
     */
    public void setActuarialProvisions(BalanceSheetDtldLiabilitiesType.ActuarialProvisions value) {
        this.actuarialProvisions = value;
    }

    /**
     * Gets the value of the fundsForBuildingSocietySavingsHedging property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFundsForBuildingSocietySavingsHedging() {
        return fundsForBuildingSocietySavingsHedging;
    }

    /**
     * Sets the value of the fundsForBuildingSocietySavingsHedging property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFundsForBuildingSocietySavingsHedging(AmountType value) {
        this.fundsForBuildingSocietySavingsHedging = value;
    }

    /**
     * Gets the value of the foundations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFoundations() {
        return foundations;
    }

    /**
     * Sets the value of the foundations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFoundations(AmountType value) {
        this.foundations = value;
    }

    /**
     * Gets the value of the subordinatedDebtsDueWithinTwoYears property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubordinatedDebtsDueWithinTwoYears() {
        return subordinatedDebtsDueWithinTwoYears;
    }

    /**
     * Sets the value of the subordinatedDebtsDueWithinTwoYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubordinatedDebtsDueWithinTwoYears(AmountType value) {
        this.subordinatedDebtsDueWithinTwoYears = value;
    }

    /**
     * Gets the value of the convertibleDebenture property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertibleDebenture() {
        return convertibleDebenture;
    }

    /**
     * Sets the value of the convertibleDebenture property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertibleDebenture(AmountType value) {
        this.convertibleDebenture = value;
    }

    /**
     * Gets the value of the convertibleDebenturePayableinLessThan2Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertibleDebenturePayableinLessThan2Years() {
        return convertibleDebenturePayableinLessThan2Years;
    }

    /**
     * Sets the value of the convertibleDebenturePayableinLessThan2Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertibleDebenturePayableinLessThan2Years(AmountType value) {
        this.convertibleDebenturePayableinLessThan2Years = value;
    }

    /**
     * Gets the value of the contributionSilentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getContributionSilentPartners() {
        return contributionSilentPartners;
    }

    /**
     * Sets the value of the contributionSilentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setContributionSilentPartners(AmountType value) {
        this.contributionSilentPartners = value;
    }

    /**
     * Gets the value of the fundsForGeneralBankingRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFundsForGeneralBankingRisks() {
        return fundsForGeneralBankingRisks;
    }

    /**
     * Sets the value of the fundsForGeneralBankingRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFundsForGeneralBankingRisks(AmountType value) {
        this.fundsForGeneralBankingRisks = value;
    }

    /**
     * Gets the value of the outsideShareholdings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOutsideShareholdings() {
        return outsideShareholdings;
    }

    /**
     * Sets the value of the outsideShareholdings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOutsideShareholdings(AmountType value) {
        this.outsideShareholdings = value;
    }

    /**
     * Gets the value of the specialItems property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialItems() {
        return specialItems;
    }

    /**
     * Sets the value of the specialItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialItems(AmountType value) {
        this.specialItems = value;
    }

    /**
     * Gets the value of the paymentsForImplementationDecidedCapitalIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentsForImplementationDecidedCapitalIncrease() {
        return paymentsForImplementationDecidedCapitalIncrease;
    }

    /**
     * Sets the value of the paymentsForImplementationDecidedCapitalIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentsForImplementationDecidedCapitalIncrease(AmountType value) {
        this.paymentsForImplementationDecidedCapitalIncrease = value;
    }

    /**
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.IssuedCapital }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.IssuedCapital getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.IssuedCapital }
     *     
     */
    public void setIssuedCapital(BalanceSheetDtldLiabilitiesType.IssuedCapital value) {
        this.issuedCapital = value;
    }

    /**
     * Gets the value of the contributionUnlimitedlyLiablePartners property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionUnlimitedlyLiablePartners }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ContributionUnlimitedlyLiablePartners getContributionUnlimitedlyLiablePartners() {
        return contributionUnlimitedlyLiablePartners;
    }

    /**
     * Sets the value of the contributionUnlimitedlyLiablePartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionUnlimitedlyLiablePartners }
     *     
     */
    public void setContributionUnlimitedlyLiablePartners(BalanceSheetDtldLiabilitiesType.ContributionUnlimitedlyLiablePartners value) {
        this.contributionUnlimitedlyLiablePartners = value;
    }

    /**
     * Gets the value of the contributionsLimitedPartners property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionsLimitedPartners }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ContributionsLimitedPartners getContributionsLimitedPartners() {
        return contributionsLimitedPartners;
    }

    /**
     * Sets the value of the contributionsLimitedPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionsLimitedPartners }
     *     
     */
    public void setContributionsLimitedPartners(BalanceSheetDtldLiabilitiesType.ContributionsLimitedPartners value) {
        this.contributionsLimitedPartners = value;
    }

    /**
     * Gets the value of the contributionsSilentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionsSilentPartners }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ContributionsSilentPartners getContributionsSilentPartners() {
        return contributionsSilentPartners;
    }

    /**
     * Sets the value of the contributionsSilentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ContributionsSilentPartners }
     *     
     */
    public void setContributionsSilentPartners(BalanceSheetDtldLiabilitiesType.ContributionsSilentPartners value) {
        this.contributionsSilentPartners = value;
    }

    /**
     * Gets the value of the retainedIncomeReserves property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.RetainedIncomeReserves }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.RetainedIncomeReserves getRetainedIncomeReserves() {
        return retainedIncomeReserves;
    }

    /**
     * Sets the value of the retainedIncomeReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.RetainedIncomeReserves }
     *     
     */
    public void setRetainedIncomeReserves(BalanceSheetDtldLiabilitiesType.RetainedIncomeReserves value) {
        this.retainedIncomeReserves = value;
    }

    /**
     * Gets the value of the earnedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEarnedCapital() {
        return earnedCapital;
    }

    /**
     * Sets the value of the earnedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEarnedCapital(AmountType value) {
        this.earnedCapital = value;
    }

    /**
     * Gets the value of the differentialAmountFromCapitalConsolidation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDifferentialAmountFromCapitalConsolidation() {
        return differentialAmountFromCapitalConsolidation;
    }

    /**
     * Sets the value of the differentialAmountFromCapitalConsolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDifferentialAmountFromCapitalConsolidation(AmountType value) {
        this.differentialAmountFromCapitalConsolidation = value;
    }

    /**
     * Gets the value of the compensatingItem property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCompensatingItem() {
        return compensatingItem;
    }

    /**
     * Sets the value of the compensatingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCompensatingItem(AmountType value) {
        this.compensatingItem = value;
    }

    /**
     * Gets the value of the otherCapitalElements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCapitalElements() {
        return otherCapitalElements;
    }

    /**
     * Sets the value of the otherCapitalElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCapitalElements(AmountType value) {
        this.otherCapitalElements = value;
    }

    /**
     * Gets the value of the retainedProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.RetainedProfitLoss }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.RetainedProfitLoss getRetainedProfitLoss() {
        return retainedProfitLoss;
    }

    /**
     * Sets the value of the retainedProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.RetainedProfitLoss }
     *     
     */
    public void setRetainedProfitLoss(BalanceSheetDtldLiabilitiesType.RetainedProfitLoss value) {
        this.retainedProfitLoss = value;
    }

    /**
     * Gets the value of the depositsOfAtypicalSilentPartners property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.DepositsOfAtypicalSilentPartners }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.DepositsOfAtypicalSilentPartners getDepositsOfAtypicalSilentPartners() {
        return depositsOfAtypicalSilentPartners;
    }

    /**
     * Sets the value of the depositsOfAtypicalSilentPartners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.DepositsOfAtypicalSilentPartners }
     *     
     */
    public void setDepositsOfAtypicalSilentPartners(BalanceSheetDtldLiabilitiesType.DepositsOfAtypicalSilentPartners value) {
        this.depositsOfAtypicalSilentPartners = value;
    }

    /**
     * Gets the value of the otherPositionsOfTotalEquity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPositionsOfTotalEquity() {
        return otherPositionsOfTotalEquity;
    }

    /**
     * Sets the value of the otherPositionsOfTotalEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPositionsOfTotalEquity(AmountType value) {
        this.otherPositionsOfTotalEquity = value;
    }

    /**
     * Gets the value of the insuranceReserves property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.InsuranceReserves getInsuranceReserves() {
        return insuranceReserves;
    }

    /**
     * Sets the value of the insuranceReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves }
     *     
     */
    public void setInsuranceReserves(BalanceSheetDtldLiabilitiesType.InsuranceReserves value) {
        this.insuranceReserves = value;
    }

    /**
     * Gets the value of the actuarialReservesInTheRangeOfLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance getActuarialReservesInTheRangeOfLifeInsurance() {
        return actuarialReservesInTheRangeOfLifeInsurance;
    }

    /**
     * Sets the value of the actuarialReservesInTheRangeOfLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance }
     *     
     */
    public void setActuarialReservesInTheRangeOfLifeInsurance(BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance value) {
        this.actuarialReservesInTheRangeOfLifeInsurance = value;
    }

    /**
     * Gets the value of the otherAccruedDebts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherAccruedDebts }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.OtherAccruedDebts getOtherAccruedDebts() {
        return otherAccruedDebts;
    }

    /**
     * Sets the value of the otherAccruedDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherAccruedDebts }
     *     
     */
    public void setOtherAccruedDebts(BalanceSheetDtldLiabilitiesType.OtherAccruedDebts value) {
        this.otherAccruedDebts = value;
    }

    /**
     * Gets the value of the depositLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.DepositLiabilities }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.DepositLiabilities getDepositLiabilities() {
        return depositLiabilities;
    }

    /**
     * Sets the value of the depositLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.DepositLiabilities }
     *     
     */
    public void setDepositLiabilities(BalanceSheetDtldLiabilitiesType.DepositLiabilities value) {
        this.depositLiabilities = value;
    }

    /**
     * Gets the value of the otherInsuranceLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities }
     *     
     */
    public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities getOtherInsuranceLiabilities() {
        return otherInsuranceLiabilities;
    }

    /**
     * Sets the value of the otherInsuranceLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities }
     *     
     */
    public void setOtherInsuranceLiabilities(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities value) {
        this.otherInsuranceLiabilities = value;
    }

    /**
     * Gets the value of the differenceAccordingToArt341Hgb property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDifferenceAccordingToArt341Hgb() {
        return differenceAccordingToArt341Hgb;
    }

    /**
     * Sets the value of the differenceAccordingToArt341Hgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDifferenceAccordingToArt341Hgb(AmountType value) {
        this.differenceAccordingToArt341Hgb = value;
    }

    /**
     * Gets the value of the otherAccrualsAndDeferredIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAccrualsAndDeferredIncome() {
        return otherAccrualsAndDeferredIncome;
    }

    /**
     * Sets the value of the otherAccrualsAndDeferredIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAccrualsAndDeferredIncome(AmountType value) {
        this.otherAccrualsAndDeferredIncome = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSettlement(AmountType value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the resultToBeCarriedForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResultToBeCarriedForward() {
        return resultToBeCarriedForward;
    }

    /**
     * Sets the value of the resultToBeCarriedForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResultToBeCarriedForward(AmountType value) {
        this.resultToBeCarriedForward = value;
    }

    /**
     * Gets the value of the profitOrLossForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitOrLossForPeriod() {
        return profitOrLossForPeriod;
    }

    /**
     * Sets the value of the profitOrLossForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitOrLossForPeriod(AmountType value) {
        this.profitOrLossForPeriod = value;
    }

    /**
     * Gets the value of the interimDividends property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterimDividends() {
        return interimDividends;
    }

    /**
     * Sets the value of the interimDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterimDividends(AmountType value) {
        this.interimDividends = value;
    }

    /**
     * Gets the value of the immunizedIncreaseInValueOrAppreciation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImmunizedIncreaseInValueOrAppreciation() {
        return immunizedIncreaseInValueOrAppreciation;
    }

    /**
     * Sets the value of the immunizedIncreaseInValueOrAppreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImmunizedIncreaseInValueOrAppreciation(AmountType value) {
        this.immunizedIncreaseInValueOrAppreciation = value;
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
     * Gets the value of the socialSecurityExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSocialSecurityExpenses() {
        return socialSecurityExpenses;
    }

    /**
     * Sets the value of the socialSecurityExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSocialSecurityExpenses(AmountType value) {
        this.socialSecurityExpenses = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ActuarialProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ContributionsCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForCoverage" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForInsuranceCasesNotyetFinalised" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReturnContributions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actuarialProvisions",
        "contributionsCarriedForward",
        "provisionsForCoverage",
        "provisionsForInsuranceCasesNotyetFinalised",
        "returnContributions"
    })
    public static class ActuarialProvisions {

        @XmlElement(name = "ActuarialProvisions")
        protected AmountType actuarialProvisions;
        @XmlElement(name = "ContributionsCarriedForward")
        protected AmountType contributionsCarriedForward;
        @XmlElement(name = "ProvisionsForCoverage")
        protected AmountType provisionsForCoverage;
        @XmlElement(name = "ProvisionsForInsuranceCasesNotyetFinalised")
        protected AmountType provisionsForInsuranceCasesNotyetFinalised;
        @XmlElement(name = "ReturnContributions")
        protected AmountType returnContributions;

        /**
         * Gets the value of the actuarialProvisions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getActuarialProvisions() {
            return actuarialProvisions;
        }

        /**
         * Sets the value of the actuarialProvisions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setActuarialProvisions(AmountType value) {
            this.actuarialProvisions = value;
        }

        /**
         * Gets the value of the contributionsCarriedForward property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getContributionsCarriedForward() {
            return contributionsCarriedForward;
        }

        /**
         * Sets the value of the contributionsCarriedForward property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setContributionsCarriedForward(AmountType value) {
            this.contributionsCarriedForward = value;
        }

        /**
         * Gets the value of the provisionsForCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForCoverage() {
            return provisionsForCoverage;
        }

        /**
         * Sets the value of the provisionsForCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForCoverage(AmountType value) {
            this.provisionsForCoverage = value;
        }

        /**
         * Gets the value of the provisionsForInsuranceCasesNotyetFinalised property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForInsuranceCasesNotyetFinalised() {
            return provisionsForInsuranceCasesNotyetFinalised;
        }

        /**
         * Sets the value of the provisionsForInsuranceCasesNotyetFinalised property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForInsuranceCasesNotyetFinalised(AmountType value) {
            this.provisionsForInsuranceCasesNotyetFinalised = value;
        }

        /**
         * Gets the value of the returnContributions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReturnContributions() {
            return returnContributions;
        }

        /**
         * Sets the value of the returnContributions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReturnContributions(AmountType value) {
            this.returnContributions = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ActuarialReservesInTheRangeOfLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AggregateReserve" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AggregateReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherActuarialReserves" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actuarialReservesInTheRangeOfLifeInsurance",
        "aggregateReserve",
        "otherActuarialReserves"
    })
    public static class ActuarialReservesInTheRangeOfLifeInsurance {

        @XmlElement(name = "ActuarialReservesInTheRangeOfLifeInsurance")
        protected AmountType actuarialReservesInTheRangeOfLifeInsurance;
        @XmlElement(name = "AggregateReserve")
        protected BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.AggregateReserve aggregateReserve;
        @XmlElement(name = "OtherActuarialReserves")
        protected BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.OtherActuarialReserves otherActuarialReserves;

        /**
         * Gets the value of the actuarialReservesInTheRangeOfLifeInsurance property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getActuarialReservesInTheRangeOfLifeInsurance() {
            return actuarialReservesInTheRangeOfLifeInsurance;
        }

        /**
         * Sets the value of the actuarialReservesInTheRangeOfLifeInsurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setActuarialReservesInTheRangeOfLifeInsurance(AmountType value) {
            this.actuarialReservesInTheRangeOfLifeInsurance = value;
        }

        /**
         * Gets the value of the aggregateReserve property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.AggregateReserve }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.AggregateReserve getAggregateReserve() {
            return aggregateReserve;
        }

        /**
         * Sets the value of the aggregateReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.AggregateReserve }
         *     
         */
        public void setAggregateReserve(BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.AggregateReserve value) {
            this.aggregateReserve = value;
        }

        /**
         * Gets the value of the otherActuarialReserves property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.OtherActuarialReserves }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.OtherActuarialReserves getOtherActuarialReserves() {
            return otherActuarialReserves;
        }

        /**
         * Sets the value of the otherActuarialReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.OtherActuarialReserves }
         *     
         */
        public void setOtherActuarialReserves(BalanceSheetDtldLiabilitiesType.ActuarialReservesInTheRangeOfLifeInsurance.OtherActuarialReserves value) {
            this.otherActuarialReserves = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AggregateReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "aggregateReserve",
            "gross",
            "lessAmountsCeded"
        })
        public static class AggregateReserve {

            @XmlElement(name = "AggregateReserve")
            protected AmountType aggregateReserve;
            @XmlElement(name = "Gross")
            protected AmountType gross;
            @XmlElement(name = "LessAmountsCeded")
            protected AmountType lessAmountsCeded;

            /**
             * Gets the value of the aggregateReserve property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAggregateReserve() {
                return aggregateReserve;
            }

            /**
             * Sets the value of the aggregateReserve property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAggregateReserve(AmountType value) {
                this.aggregateReserve = value;
            }

            /**
             * Gets the value of the gross property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGross() {
                return gross;
            }

            /**
             * Sets the value of the gross property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGross(AmountType value) {
                this.gross = value;
            }

            /**
             * Gets the value of the lessAmountsCeded property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCeded() {
                return lessAmountsCeded;
            }

            /**
             * Sets the value of the lessAmountsCeded property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCeded(AmountType value) {
                this.lessAmountsCeded = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherActuarialReserves",
            "gross",
            "lessAmountsCeded"
        })
        public static class OtherActuarialReserves {

            @XmlElement(name = "OtherActuarialReserves")
            protected AmountType otherActuarialReserves;
            @XmlElement(name = "Gross")
            protected AmountType gross;
            @XmlElement(name = "LessAmountsCeded")
            protected AmountType lessAmountsCeded;

            /**
             * Gets the value of the otherActuarialReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherActuarialReserves() {
                return otherActuarialReserves;
            }

            /**
             * Sets the value of the otherActuarialReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherActuarialReserves(AmountType value) {
                this.otherActuarialReserves = value;
            }

            /**
             * Gets the value of the gross property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGross() {
                return gross;
            }

            /**
             * Sets the value of the gross property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGross(AmountType value) {
                this.gross = value;
            }

            /**
             * Gets the value of the lessAmountsCeded property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCeded() {
                return lessAmountsCeded;
            }

            /**
             * Sets the value of the lessAmountsCeded property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCeded(AmountType value) {
                this.lessAmountsCeded = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CapitalSurplus" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LegalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MiscellaneousReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OperationsSecurityReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesFromSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesFromReleasedAmounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesFromInterestIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BuildingRenewalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesSubsidiaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherEarningReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capitalSurplus",
        "legalReserve",
        "reservesForOwnShares",
        "miscellaneousReserves",
        "operationsSecurityReserve",
        "reservesFromSubsidies",
        "reservesFromReleasedAmounts",
        "reservesFromInterestIncome",
        "buildingRenewalReserves",
        "reservesSubsidiaries",
        "specialReserves",
        "otherEarningReserves"
    })
    public static class CapitalSurplus {

        @XmlElement(name = "CapitalSurplus")
        protected AmountType capitalSurplus;
        @XmlElement(name = "LegalReserve")
        protected AmountType legalReserve;
        @XmlElement(name = "ReservesForOwnShares")
        protected AmountType reservesForOwnShares;
        @XmlElement(name = "MiscellaneousReserves")
        protected AmountType miscellaneousReserves;
        @XmlElement(name = "OperationsSecurityReserve")
        protected AmountType operationsSecurityReserve;
        @XmlElement(name = "ReservesFromSubsidies")
        protected AmountType reservesFromSubsidies;
        @XmlElement(name = "ReservesFromReleasedAmounts")
        protected AmountType reservesFromReleasedAmounts;
        @XmlElement(name = "ReservesFromInterestIncome")
        protected AmountType reservesFromInterestIncome;
        @XmlElement(name = "BuildingRenewalReserves")
        protected AmountType buildingRenewalReserves;
        @XmlElement(name = "ReservesSubsidiaries")
        protected AmountType reservesSubsidiaries;
        @XmlElement(name = "SpecialReserves")
        protected AmountType specialReserves;
        @XmlElement(name = "OtherEarningReserves")
        protected AmountType otherEarningReserves;

        /**
         * Gets the value of the capitalSurplus property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getCapitalSurplus() {
            return capitalSurplus;
        }

        /**
         * Sets the value of the capitalSurplus property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setCapitalSurplus(AmountType value) {
            this.capitalSurplus = value;
        }

        /**
         * Gets the value of the legalReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLegalReserve() {
            return legalReserve;
        }

        /**
         * Sets the value of the legalReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLegalReserve(AmountType value) {
            this.legalReserve = value;
        }

        /**
         * Gets the value of the reservesForOwnShares property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesForOwnShares() {
            return reservesForOwnShares;
        }

        /**
         * Sets the value of the reservesForOwnShares property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesForOwnShares(AmountType value) {
            this.reservesForOwnShares = value;
        }

        /**
         * Gets the value of the miscellaneousReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMiscellaneousReserves() {
            return miscellaneousReserves;
        }

        /**
         * Sets the value of the miscellaneousReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMiscellaneousReserves(AmountType value) {
            this.miscellaneousReserves = value;
        }

        /**
         * Gets the value of the operationsSecurityReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOperationsSecurityReserve() {
            return operationsSecurityReserve;
        }

        /**
         * Sets the value of the operationsSecurityReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOperationsSecurityReserve(AmountType value) {
            this.operationsSecurityReserve = value;
        }

        /**
         * Gets the value of the reservesFromSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesFromSubsidies() {
            return reservesFromSubsidies;
        }

        /**
         * Sets the value of the reservesFromSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesFromSubsidies(AmountType value) {
            this.reservesFromSubsidies = value;
        }

        /**
         * Gets the value of the reservesFromReleasedAmounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesFromReleasedAmounts() {
            return reservesFromReleasedAmounts;
        }

        /**
         * Sets the value of the reservesFromReleasedAmounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesFromReleasedAmounts(AmountType value) {
            this.reservesFromReleasedAmounts = value;
        }

        /**
         * Gets the value of the reservesFromInterestIncome property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesFromInterestIncome() {
            return reservesFromInterestIncome;
        }

        /**
         * Sets the value of the reservesFromInterestIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesFromInterestIncome(AmountType value) {
            this.reservesFromInterestIncome = value;
        }

        /**
         * Gets the value of the buildingRenewalReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBuildingRenewalReserves() {
            return buildingRenewalReserves;
        }

        /**
         * Sets the value of the buildingRenewalReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBuildingRenewalReserves(AmountType value) {
            this.buildingRenewalReserves = value;
        }

        /**
         * Gets the value of the reservesSubsidiaries property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesSubsidiaries() {
            return reservesSubsidiaries;
        }

        /**
         * Sets the value of the reservesSubsidiaries property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesSubsidiaries(AmountType value) {
            this.reservesSubsidiaries = value;
        }

        /**
         * Gets the value of the specialReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialReserves() {
            return specialReserves;
        }

        /**
         * Sets the value of the specialReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialReserves(AmountType value) {
            this.specialReserves = value;
        }

        /**
         * Gets the value of the otherEarningReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherEarningReserves() {
            return otherEarningReserves;
        }

        /**
         * Sets the value of the otherEarningReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherEarningReserves(AmountType value) {
            this.otherEarningReserves = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CertificatedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="IssuedBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MortgageBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PublicSectorBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="IssuedMoneyMarketPaper" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherCertificatedLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MoneyMarketSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OwnAcceptancesPromissoryNotesinCirculation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "certificatedLiabilities",
        "issuedBonds",
        "mortgageBonds",
        "publicSectorBonds",
        "otherBonds",
        "issuedMoneyMarketPaper",
        "otherCertificatedLiabilities",
        "moneyMarketSecurities",
        "ownAcceptancesPromissoryNotesinCirculation",
        "ofWhichFromMerchandise"
    })
    public static class CertificatedLiabilities {

        @XmlElement(name = "CertificatedLiabilities")
        protected AmountType certificatedLiabilities;
        @XmlElement(name = "IssuedBonds")
        protected AmountType issuedBonds;
        @XmlElement(name = "MortgageBonds")
        protected AmountType mortgageBonds;
        @XmlElement(name = "PublicSectorBonds")
        protected AmountType publicSectorBonds;
        @XmlElement(name = "OtherBonds")
        protected AmountType otherBonds;
        @XmlElement(name = "IssuedMoneyMarketPaper")
        protected AmountType issuedMoneyMarketPaper;
        @XmlElement(name = "OtherCertificatedLiabilities")
        protected AmountType otherCertificatedLiabilities;
        @XmlElement(name = "MoneyMarketSecurities")
        protected AmountType moneyMarketSecurities;
        @XmlElement(name = "OwnAcceptancesPromissoryNotesinCirculation")
        protected AmountType ownAcceptancesPromissoryNotesinCirculation;
        @XmlElement(name = "OfWhichFromMerchandise")
        protected AmountType ofWhichFromMerchandise;

        /**
         * Gets the value of the certificatedLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getCertificatedLiabilities() {
            return certificatedLiabilities;
        }

        /**
         * Sets the value of the certificatedLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setCertificatedLiabilities(AmountType value) {
            this.certificatedLiabilities = value;
        }

        /**
         * Gets the value of the issuedBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIssuedBonds() {
            return issuedBonds;
        }

        /**
         * Sets the value of the issuedBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIssuedBonds(AmountType value) {
            this.issuedBonds = value;
        }

        /**
         * Gets the value of the mortgageBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMortgageBonds() {
            return mortgageBonds;
        }

        /**
         * Sets the value of the mortgageBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMortgageBonds(AmountType value) {
            this.mortgageBonds = value;
        }

        /**
         * Gets the value of the publicSectorBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPublicSectorBonds() {
            return publicSectorBonds;
        }

        /**
         * Sets the value of the publicSectorBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPublicSectorBonds(AmountType value) {
            this.publicSectorBonds = value;
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
         * Gets the value of the issuedMoneyMarketPaper property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIssuedMoneyMarketPaper() {
            return issuedMoneyMarketPaper;
        }

        /**
         * Sets the value of the issuedMoneyMarketPaper property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIssuedMoneyMarketPaper(AmountType value) {
            this.issuedMoneyMarketPaper = value;
        }

        /**
         * Gets the value of the otherCertificatedLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherCertificatedLiabilities() {
            return otherCertificatedLiabilities;
        }

        /**
         * Sets the value of the otherCertificatedLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherCertificatedLiabilities(AmountType value) {
            this.otherCertificatedLiabilities = value;
        }

        /**
         * Gets the value of the moneyMarketSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMoneyMarketSecurities() {
            return moneyMarketSecurities;
        }

        /**
         * Sets the value of the moneyMarketSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMoneyMarketSecurities(AmountType value) {
            this.moneyMarketSecurities = value;
        }

        /**
         * Gets the value of the ownAcceptancesPromissoryNotesinCirculation property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOwnAcceptancesPromissoryNotesinCirculation() {
            return ownAcceptancesPromissoryNotesinCirculation;
        }

        /**
         * Sets the value of the ownAcceptancesPromissoryNotesinCirculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOwnAcceptancesPromissoryNotesinCirculation(AmountType value) {
            this.ownAcceptancesPromissoryNotesinCirculation = value;
        }

        /**
         * Gets the value of the ofWhichFromMerchandise property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichFromMerchandise() {
            return ofWhichFromMerchandise;
        }

        /**
         * Sets the value of the ofWhichFromMerchandise property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichFromMerchandise(AmountType value) {
            this.ofWhichFromMerchandise = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ContributionsLimitedPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributionsLimitedPartners",
        "fixedCapitalAccounts",
        "variableCapitalAccounts"
    })
    public static class ContributionsLimitedPartners {

        @XmlElement(name = "ContributionsLimitedPartners")
        protected AmountType contributionsLimitedPartners;
        @XmlElement(name = "FixedCapitalAccounts")
        protected AmountType fixedCapitalAccounts;
        @XmlElement(name = "VariableCapitalAccounts")
        protected AmountType variableCapitalAccounts;

        /**
         * Gets the value of the contributionsLimitedPartners property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getContributionsLimitedPartners() {
            return contributionsLimitedPartners;
        }

        /**
         * Sets the value of the contributionsLimitedPartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setContributionsLimitedPartners(AmountType value) {
            this.contributionsLimitedPartners = value;
        }

        /**
         * Gets the value of the fixedCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getFixedCapitalAccounts() {
            return fixedCapitalAccounts;
        }

        /**
         * Sets the value of the fixedCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setFixedCapitalAccounts(AmountType value) {
            this.fixedCapitalAccounts = value;
        }

        /**
         * Gets the value of the variableCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getVariableCapitalAccounts() {
            return variableCapitalAccounts;
        }

        /**
         * Sets the value of the variableCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setVariableCapitalAccounts(AmountType value) {
            this.variableCapitalAccounts = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ContributionsSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributionsSilentPartners",
        "fixedCapitalAccounts",
        "variableCapitalAccounts"
    })
    public static class ContributionsSilentPartners {

        @XmlElement(name = "ContributionsSilentPartners")
        protected AmountType contributionsSilentPartners;
        @XmlElement(name = "FixedCapitalAccounts")
        protected AmountType fixedCapitalAccounts;
        @XmlElement(name = "VariableCapitalAccounts")
        protected AmountType variableCapitalAccounts;

        /**
         * Gets the value of the contributionsSilentPartners property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getContributionsSilentPartners() {
            return contributionsSilentPartners;
        }

        /**
         * Sets the value of the contributionsSilentPartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setContributionsSilentPartners(AmountType value) {
            this.contributionsSilentPartners = value;
        }

        /**
         * Gets the value of the fixedCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getFixedCapitalAccounts() {
            return fixedCapitalAccounts;
        }

        /**
         * Sets the value of the fixedCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setFixedCapitalAccounts(AmountType value) {
            this.fixedCapitalAccounts = value;
        }

        /**
         * Gets the value of the variableCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getVariableCapitalAccounts() {
            return variableCapitalAccounts;
        }

        /**
         * Sets the value of the variableCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setVariableCapitalAccounts(AmountType value) {
            this.variableCapitalAccounts = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ContributionUnlimitedlyLiablePartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="FixedCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="VariableCapitalAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contributionUnlimitedlyLiablePartners",
        "fixedCapitalAccounts",
        "variableCapitalAccounts"
    })
    public static class ContributionUnlimitedlyLiablePartners {

        @XmlElement(name = "ContributionUnlimitedlyLiablePartners")
        protected AmountType contributionUnlimitedlyLiablePartners;
        @XmlElement(name = "FixedCapitalAccounts")
        protected AmountType fixedCapitalAccounts;
        @XmlElement(name = "VariableCapitalAccounts")
        protected AmountType variableCapitalAccounts;

        /**
         * Gets the value of the contributionUnlimitedlyLiablePartners property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getContributionUnlimitedlyLiablePartners() {
            return contributionUnlimitedlyLiablePartners;
        }

        /**
         * Sets the value of the contributionUnlimitedlyLiablePartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setContributionUnlimitedlyLiablePartners(AmountType value) {
            this.contributionUnlimitedlyLiablePartners = value;
        }

        /**
         * Gets the value of the fixedCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getFixedCapitalAccounts() {
            return fixedCapitalAccounts;
        }

        /**
         * Sets the value of the fixedCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setFixedCapitalAccounts(AmountType value) {
            this.fixedCapitalAccounts = value;
        }

        /**
         * Gets the value of the variableCapitalAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getVariableCapitalAccounts() {
            return variableCapitalAccounts;
        }

        /**
         * Sets the value of the variableCapitalAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setVariableCapitalAccounts(AmountType value) {
            this.variableCapitalAccounts = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DepositLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "depositLiabilities",
        "ofWhichInAffiliatedCompanies"
    })
    public static class DepositLiabilities {

        @XmlElement(name = "DepositLiabilities")
        protected AmountType depositLiabilities;
        @XmlElement(name = "OfWhichInAffiliatedCompanies")
        protected AmountType ofWhichInAffiliatedCompanies;

        /**
         * Gets the value of the depositLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDepositLiabilities() {
            return depositLiabilities;
        }

        /**
         * Sets the value of the depositLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDepositLiabilities(AmountType value) {
            this.depositLiabilities = value;
        }

        /**
         * Gets the value of the ofWhichInAffiliatedCompanies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichInAffiliatedCompanies() {
            return ofWhichInAffiliatedCompanies;
        }

        /**
         * Sets the value of the ofWhichInAffiliatedCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichInAffiliatedCompanies(AmountType value) {
            this.ofWhichInAffiliatedCompanies = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DepositsOfAtypicalSilentPartners" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="FixedDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SurplusReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="CompensatingItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "depositsOfAtypicalSilentPartners",
        "fixedDeposits",
        "surplusReserves",
        "compensatingItem"
    })
    public static class DepositsOfAtypicalSilentPartners {

        @XmlElement(name = "DepositsOfAtypicalSilentPartners")
        protected AmountType depositsOfAtypicalSilentPartners;
        @XmlElement(name = "FixedDeposits")
        protected AmountType fixedDeposits;
        @XmlElement(name = "SurplusReserves")
        protected AmountType surplusReserves;
        @XmlElement(name = "CompensatingItem")
        protected AmountType compensatingItem;

        /**
         * Gets the value of the depositsOfAtypicalSilentPartners property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDepositsOfAtypicalSilentPartners() {
            return depositsOfAtypicalSilentPartners;
        }

        /**
         * Sets the value of the depositsOfAtypicalSilentPartners property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDepositsOfAtypicalSilentPartners(AmountType value) {
            this.depositsOfAtypicalSilentPartners = value;
        }

        /**
         * Gets the value of the fixedDeposits property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getFixedDeposits() {
            return fixedDeposits;
        }

        /**
         * Sets the value of the fixedDeposits property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setFixedDeposits(AmountType value) {
            this.fixedDeposits = value;
        }

        /**
         * Gets the value of the surplusReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSurplusReserves() {
            return surplusReserves;
        }

        /**
         * Sets the value of the surplusReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSurplusReserves(AmountType value) {
            this.surplusReserves = value;
        }

        /**
         * Gets the value of the compensatingItem property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getCompensatingItem() {
            return compensatingItem;
        }

        /**
         * Sets the value of the compensatingItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setCompensatingItem(AmountType value) {
            this.compensatingItem = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IncomeSubsidiesReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsForInvestmentAidsInvestmentSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Governmental" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="EcclesiasticalOthers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsFromSubsidiesAccordingToKHGLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsFromGovernmentalSubsidiesForInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsFromGovernmentalAllocationsSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfHospital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfCharity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsFromDonationsThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsFromNonGovernmentalPromotion" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SpecialItemsForSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ToFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ToCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherSpecialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "incomeSubsidiesReceived",
        "specialItemsForInvestmentAidsInvestmentSubsidies",
        "governmental",
        "ecclesiasticalOthers",
        "specialItemsFromSubsidiesAccordingToKHGLKG",
        "specialItemsFromGovernmentalSubsidiesForInvestments",
        "specialItemsFromGovernmentalAllocationsSubsidies",
        "ofHospital",
        "ofCharity",
        "specialItemsFromDonationsThirdParties",
        "specialItemsFromNonGovernmentalPromotion",
        "specialItemsForSubsidies",
        "toFixedAssets",
        "toCurrentAssets",
        "otherSpecialReserves"
    })
    public static class IncomeSubsidiesReceived {

        @XmlElement(name = "IncomeSubsidiesReceived")
        protected AmountType incomeSubsidiesReceived;
        @XmlElement(name = "SpecialItemsForInvestmentAidsInvestmentSubsidies")
        protected AmountType specialItemsForInvestmentAidsInvestmentSubsidies;
        @XmlElement(name = "Governmental")
        protected AmountType governmental;
        @XmlElement(name = "EcclesiasticalOthers")
        protected AmountType ecclesiasticalOthers;
        @XmlElement(name = "SpecialItemsFromSubsidiesAccordingToKHGLKG")
        protected AmountType specialItemsFromSubsidiesAccordingToKHGLKG;
        @XmlElement(name = "SpecialItemsFromGovernmentalSubsidiesForInvestments")
        protected AmountType specialItemsFromGovernmentalSubsidiesForInvestments;
        @XmlElement(name = "SpecialItemsFromGovernmentalAllocationsSubsidies")
        protected AmountType specialItemsFromGovernmentalAllocationsSubsidies;
        @XmlElement(name = "OfHospital")
        protected AmountType ofHospital;
        @XmlElement(name = "OfCharity")
        protected AmountType ofCharity;
        @XmlElement(name = "SpecialItemsFromDonationsThirdParties")
        protected AmountType specialItemsFromDonationsThirdParties;
        @XmlElement(name = "SpecialItemsFromNonGovernmentalPromotion")
        protected AmountType specialItemsFromNonGovernmentalPromotion;
        @XmlElement(name = "SpecialItemsForSubsidies")
        protected AmountType specialItemsForSubsidies;
        @XmlElement(name = "ToFixedAssets")
        protected AmountType toFixedAssets;
        @XmlElement(name = "ToCurrentAssets")
        protected AmountType toCurrentAssets;
        @XmlElement(name = "OtherSpecialReserves")
        protected AmountType otherSpecialReserves;

        /**
         * Gets the value of the incomeSubsidiesReceived property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIncomeSubsidiesReceived() {
            return incomeSubsidiesReceived;
        }

        /**
         * Sets the value of the incomeSubsidiesReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIncomeSubsidiesReceived(AmountType value) {
            this.incomeSubsidiesReceived = value;
        }

        /**
         * Gets the value of the specialItemsForInvestmentAidsInvestmentSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsForInvestmentAidsInvestmentSubsidies() {
            return specialItemsForInvestmentAidsInvestmentSubsidies;
        }

        /**
         * Sets the value of the specialItemsForInvestmentAidsInvestmentSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsForInvestmentAidsInvestmentSubsidies(AmountType value) {
            this.specialItemsForInvestmentAidsInvestmentSubsidies = value;
        }

        /**
         * Gets the value of the governmental property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getGovernmental() {
            return governmental;
        }

        /**
         * Sets the value of the governmental property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setGovernmental(AmountType value) {
            this.governmental = value;
        }

        /**
         * Gets the value of the ecclesiasticalOthers property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getEcclesiasticalOthers() {
            return ecclesiasticalOthers;
        }

        /**
         * Sets the value of the ecclesiasticalOthers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setEcclesiasticalOthers(AmountType value) {
            this.ecclesiasticalOthers = value;
        }

        /**
         * Gets the value of the specialItemsFromSubsidiesAccordingToKHGLKG property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsFromSubsidiesAccordingToKHGLKG() {
            return specialItemsFromSubsidiesAccordingToKHGLKG;
        }

        /**
         * Sets the value of the specialItemsFromSubsidiesAccordingToKHGLKG property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsFromSubsidiesAccordingToKHGLKG(AmountType value) {
            this.specialItemsFromSubsidiesAccordingToKHGLKG = value;
        }

        /**
         * Gets the value of the specialItemsFromGovernmentalSubsidiesForInvestments property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsFromGovernmentalSubsidiesForInvestments() {
            return specialItemsFromGovernmentalSubsidiesForInvestments;
        }

        /**
         * Sets the value of the specialItemsFromGovernmentalSubsidiesForInvestments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsFromGovernmentalSubsidiesForInvestments(AmountType value) {
            this.specialItemsFromGovernmentalSubsidiesForInvestments = value;
        }

        /**
         * Gets the value of the specialItemsFromGovernmentalAllocationsSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsFromGovernmentalAllocationsSubsidies() {
            return specialItemsFromGovernmentalAllocationsSubsidies;
        }

        /**
         * Sets the value of the specialItemsFromGovernmentalAllocationsSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsFromGovernmentalAllocationsSubsidies(AmountType value) {
            this.specialItemsFromGovernmentalAllocationsSubsidies = value;
        }

        /**
         * Gets the value of the ofHospital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfHospital() {
            return ofHospital;
        }

        /**
         * Sets the value of the ofHospital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfHospital(AmountType value) {
            this.ofHospital = value;
        }

        /**
         * Gets the value of the ofCharity property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfCharity() {
            return ofCharity;
        }

        /**
         * Sets the value of the ofCharity property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfCharity(AmountType value) {
            this.ofCharity = value;
        }

        /**
         * Gets the value of the specialItemsFromDonationsThirdParties property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsFromDonationsThirdParties() {
            return specialItemsFromDonationsThirdParties;
        }

        /**
         * Sets the value of the specialItemsFromDonationsThirdParties property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsFromDonationsThirdParties(AmountType value) {
            this.specialItemsFromDonationsThirdParties = value;
        }

        /**
         * Gets the value of the specialItemsFromNonGovernmentalPromotion property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsFromNonGovernmentalPromotion() {
            return specialItemsFromNonGovernmentalPromotion;
        }

        /**
         * Sets the value of the specialItemsFromNonGovernmentalPromotion property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsFromNonGovernmentalPromotion(AmountType value) {
            this.specialItemsFromNonGovernmentalPromotion = value;
        }

        /**
         * Gets the value of the specialItemsForSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSpecialItemsForSubsidies() {
            return specialItemsForSubsidies;
        }

        /**
         * Sets the value of the specialItemsForSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSpecialItemsForSubsidies(AmountType value) {
            this.specialItemsForSubsidies = value;
        }

        /**
         * Gets the value of the toFixedAssets property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getToFixedAssets() {
            return toFixedAssets;
        }

        /**
         * Sets the value of the toFixedAssets property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setToFixedAssets(AmountType value) {
            this.toFixedAssets = value;
        }

        /**
         * Gets the value of the toCurrentAssets property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getToCurrentAssets() {
            return toCurrentAssets;
        }

        /**
         * Sets the value of the toCurrentAssets property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setToCurrentAssets(AmountType value) {
            this.toCurrentAssets = value;
        }

        /**
         * Gets the value of the otherSpecialReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherSpecialReserves() {
            return otherSpecialReserves;
        }

        /**
         * Sets the value of the otherSpecialReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherSpecialReserves(AmountType value) {
            this.otherSpecialReserves = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="UnearnedPremiums" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="GrossUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCededOnUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ActuarialReserves" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="GrossActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCededOnActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProvisionsForOutstandingClaims" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="GrossProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCededOnProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProvisionsForPremiumRefunds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PerformanceRelated" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NonPerformanceRelated" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NonPerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GrossProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCededOnProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClaimsEqualizationProvisionSimilarReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherInsuranceReserves" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="GrossOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LessAmountsCededOnOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "insuranceReserves",
        "unearnedPremiums",
        "actuarialReserves",
        "provisionsForOutstandingClaims",
        "provisionsForPremiumRefunds",
        "claimsEqualizationProvisionSimilarReserves",
        "otherInsuranceReserves"
    })
    public static class InsuranceReserves {

        @XmlElement(name = "InsuranceReserves")
        protected AmountType insuranceReserves;
        @XmlElement(name = "UnearnedPremiums")
        protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.UnearnedPremiums unearnedPremiums;
        @XmlElement(name = "ActuarialReserves")
        protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.ActuarialReserves actuarialReserves;
        @XmlElement(name = "ProvisionsForOutstandingClaims")
        protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForOutstandingClaims provisionsForOutstandingClaims;
        @XmlElement(name = "ProvisionsForPremiumRefunds")
        protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds provisionsForPremiumRefunds;
        @XmlElement(name = "ClaimsEqualizationProvisionSimilarReserves")
        protected AmountType claimsEqualizationProvisionSimilarReserves;
        @XmlElement(name = "OtherInsuranceReserves")
        protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.OtherInsuranceReserves otherInsuranceReserves;

        /**
         * Gets the value of the insuranceReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getInsuranceReserves() {
            return insuranceReserves;
        }

        /**
         * Sets the value of the insuranceReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setInsuranceReserves(AmountType value) {
            this.insuranceReserves = value;
        }

        /**
         * Gets the value of the unearnedPremiums property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.UnearnedPremiums }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.InsuranceReserves.UnearnedPremiums getUnearnedPremiums() {
            return unearnedPremiums;
        }

        /**
         * Sets the value of the unearnedPremiums property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.UnearnedPremiums }
         *     
         */
        public void setUnearnedPremiums(BalanceSheetDtldLiabilitiesType.InsuranceReserves.UnearnedPremiums value) {
            this.unearnedPremiums = value;
        }

        /**
         * Gets the value of the actuarialReserves property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ActuarialReserves }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.InsuranceReserves.ActuarialReserves getActuarialReserves() {
            return actuarialReserves;
        }

        /**
         * Sets the value of the actuarialReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ActuarialReserves }
         *     
         */
        public void setActuarialReserves(BalanceSheetDtldLiabilitiesType.InsuranceReserves.ActuarialReserves value) {
            this.actuarialReserves = value;
        }

        /**
         * Gets the value of the provisionsForOutstandingClaims property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForOutstandingClaims }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForOutstandingClaims getProvisionsForOutstandingClaims() {
            return provisionsForOutstandingClaims;
        }

        /**
         * Sets the value of the provisionsForOutstandingClaims property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForOutstandingClaims }
         *     
         */
        public void setProvisionsForOutstandingClaims(BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForOutstandingClaims value) {
            this.provisionsForOutstandingClaims = value;
        }

        /**
         * Gets the value of the provisionsForPremiumRefunds property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds getProvisionsForPremiumRefunds() {
            return provisionsForPremiumRefunds;
        }

        /**
         * Sets the value of the provisionsForPremiumRefunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds }
         *     
         */
        public void setProvisionsForPremiumRefunds(BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds value) {
            this.provisionsForPremiumRefunds = value;
        }

        /**
         * Gets the value of the claimsEqualizationProvisionSimilarReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getClaimsEqualizationProvisionSimilarReserves() {
            return claimsEqualizationProvisionSimilarReserves;
        }

        /**
         * Sets the value of the claimsEqualizationProvisionSimilarReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setClaimsEqualizationProvisionSimilarReserves(AmountType value) {
            this.claimsEqualizationProvisionSimilarReserves = value;
        }

        /**
         * Gets the value of the otherInsuranceReserves property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.OtherInsuranceReserves }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.InsuranceReserves.OtherInsuranceReserves getOtherInsuranceReserves() {
            return otherInsuranceReserves;
        }

        /**
         * Sets the value of the otherInsuranceReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.OtherInsuranceReserves }
         *     
         */
        public void setOtherInsuranceReserves(BalanceSheetDtldLiabilitiesType.InsuranceReserves.OtherInsuranceReserves value) {
            this.otherInsuranceReserves = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="GrossActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCededOnActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "actuarialReserves",
            "grossActuarialReserves",
            "lessAmountsCededOnActuarialReserves"
        })
        public static class ActuarialReserves {

            @XmlElement(name = "ActuarialReserves")
            protected AmountType actuarialReserves;
            @XmlElement(name = "GrossActuarialReserves")
            protected AmountType grossActuarialReserves;
            @XmlElement(name = "LessAmountsCededOnActuarialReserves")
            protected AmountType lessAmountsCededOnActuarialReserves;

            /**
             * Gets the value of the actuarialReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getActuarialReserves() {
                return actuarialReserves;
            }

            /**
             * Sets the value of the actuarialReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setActuarialReserves(AmountType value) {
                this.actuarialReserves = value;
            }

            /**
             * Gets the value of the grossActuarialReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGrossActuarialReserves() {
                return grossActuarialReserves;
            }

            /**
             * Sets the value of the grossActuarialReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGrossActuarialReserves(AmountType value) {
                this.grossActuarialReserves = value;
            }

            /**
             * Gets the value of the lessAmountsCededOnActuarialReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCededOnActuarialReserves() {
                return lessAmountsCededOnActuarialReserves;
            }

            /**
             * Sets the value of the lessAmountsCededOnActuarialReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCededOnActuarialReserves(AmountType value) {
                this.lessAmountsCededOnActuarialReserves = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="GrossOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCededOnOtherInsuranceReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherInsuranceReserves",
            "grossOtherInsuranceReserves",
            "lessAmountsCededOnOtherInsuranceReserves"
        })
        public static class OtherInsuranceReserves {

            @XmlElement(name = "OtherInsuranceReserves")
            protected AmountType otherInsuranceReserves;
            @XmlElement(name = "GrossOtherInsuranceReserves")
            protected AmountType grossOtherInsuranceReserves;
            @XmlElement(name = "LessAmountsCededOnOtherInsuranceReserves")
            protected AmountType lessAmountsCededOnOtherInsuranceReserves;

            /**
             * Gets the value of the otherInsuranceReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherInsuranceReserves() {
                return otherInsuranceReserves;
            }

            /**
             * Sets the value of the otherInsuranceReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherInsuranceReserves(AmountType value) {
                this.otherInsuranceReserves = value;
            }

            /**
             * Gets the value of the grossOtherInsuranceReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGrossOtherInsuranceReserves() {
                return grossOtherInsuranceReserves;
            }

            /**
             * Sets the value of the grossOtherInsuranceReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGrossOtherInsuranceReserves(AmountType value) {
                this.grossOtherInsuranceReserves = value;
            }

            /**
             * Gets the value of the lessAmountsCededOnOtherInsuranceReserves property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCededOnOtherInsuranceReserves() {
                return lessAmountsCededOnOtherInsuranceReserves;
            }

            /**
             * Sets the value of the lessAmountsCededOnOtherInsuranceReserves property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCededOnOtherInsuranceReserves(AmountType value) {
                this.lessAmountsCededOnOtherInsuranceReserves = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="GrossProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCededOnProvisionsForOutstandingClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "provisionsForOutstandingClaims",
            "grossProvisionsForOutstandingClaims",
            "lessAmountsCededOnProvisionsForOutstandingClaims"
        })
        public static class ProvisionsForOutstandingClaims {

            @XmlElement(name = "ProvisionsForOutstandingClaims")
            protected AmountType provisionsForOutstandingClaims;
            @XmlElement(name = "GrossProvisionsForOutstandingClaims")
            protected AmountType grossProvisionsForOutstandingClaims;
            @XmlElement(name = "LessAmountsCededOnProvisionsForOutstandingClaims")
            protected AmountType lessAmountsCededOnProvisionsForOutstandingClaims;

            /**
             * Gets the value of the provisionsForOutstandingClaims property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getProvisionsForOutstandingClaims() {
                return provisionsForOutstandingClaims;
            }

            /**
             * Sets the value of the provisionsForOutstandingClaims property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setProvisionsForOutstandingClaims(AmountType value) {
                this.provisionsForOutstandingClaims = value;
            }

            /**
             * Gets the value of the grossProvisionsForOutstandingClaims property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGrossProvisionsForOutstandingClaims() {
                return grossProvisionsForOutstandingClaims;
            }

            /**
             * Sets the value of the grossProvisionsForOutstandingClaims property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGrossProvisionsForOutstandingClaims(AmountType value) {
                this.grossProvisionsForOutstandingClaims = value;
            }

            /**
             * Gets the value of the lessAmountsCededOnProvisionsForOutstandingClaims property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCededOnProvisionsForOutstandingClaims() {
                return lessAmountsCededOnProvisionsForOutstandingClaims;
            }

            /**
             * Sets the value of the lessAmountsCededOnProvisionsForOutstandingClaims property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCededOnProvisionsForOutstandingClaims(AmountType value) {
                this.lessAmountsCededOnProvisionsForOutstandingClaims = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PerformanceRelated" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NonPerformanceRelated" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NonPerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GrossProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCededOnProvisionsForPremiumRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "provisionsForPremiumRefunds",
            "performanceRelated",
            "nonPerformanceRelated",
            "grossProvisionsForPremiumRefunds",
            "lessAmountsCededOnProvisionsForPremiumRefunds"
        })
        public static class ProvisionsForPremiumRefunds {

            @XmlElement(name = "ProvisionsForPremiumRefunds")
            protected AmountType provisionsForPremiumRefunds;
            @XmlElement(name = "PerformanceRelated")
            protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.PerformanceRelated performanceRelated;
            @XmlElement(name = "NonPerformanceRelated")
            protected BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.NonPerformanceRelated nonPerformanceRelated;
            @XmlElement(name = "GrossProvisionsForPremiumRefunds")
            protected AmountType grossProvisionsForPremiumRefunds;
            @XmlElement(name = "LessAmountsCededOnProvisionsForPremiumRefunds")
            protected AmountType lessAmountsCededOnProvisionsForPremiumRefunds;

            /**
             * Gets the value of the provisionsForPremiumRefunds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getProvisionsForPremiumRefunds() {
                return provisionsForPremiumRefunds;
            }

            /**
             * Sets the value of the provisionsForPremiumRefunds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setProvisionsForPremiumRefunds(AmountType value) {
                this.provisionsForPremiumRefunds = value;
            }

            /**
             * Gets the value of the performanceRelated property.
             * 
             * @return
             *     possible object is
             *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.PerformanceRelated }
             *     
             */
            public BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.PerformanceRelated getPerformanceRelated() {
                return performanceRelated;
            }

            /**
             * Sets the value of the performanceRelated property.
             * 
             * @param value
             *     allowed object is
             *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.PerformanceRelated }
             *     
             */
            public void setPerformanceRelated(BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.PerformanceRelated value) {
                this.performanceRelated = value;
            }

            /**
             * Gets the value of the nonPerformanceRelated property.
             * 
             * @return
             *     possible object is
             *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.NonPerformanceRelated }
             *     
             */
            public BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.NonPerformanceRelated getNonPerformanceRelated() {
                return nonPerformanceRelated;
            }

            /**
             * Sets the value of the nonPerformanceRelated property.
             * 
             * @param value
             *     allowed object is
             *     {@link BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.NonPerformanceRelated }
             *     
             */
            public void setNonPerformanceRelated(BalanceSheetDtldLiabilitiesType.InsuranceReserves.ProvisionsForPremiumRefunds.NonPerformanceRelated value) {
                this.nonPerformanceRelated = value;
            }

            /**
             * Gets the value of the grossProvisionsForPremiumRefunds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGrossProvisionsForPremiumRefunds() {
                return grossProvisionsForPremiumRefunds;
            }

            /**
             * Sets the value of the grossProvisionsForPremiumRefunds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGrossProvisionsForPremiumRefunds(AmountType value) {
                this.grossProvisionsForPremiumRefunds = value;
            }

            /**
             * Gets the value of the lessAmountsCededOnProvisionsForPremiumRefunds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCededOnProvisionsForPremiumRefunds() {
                return lessAmountsCededOnProvisionsForPremiumRefunds;
            }

            /**
             * Sets the value of the lessAmountsCededOnProvisionsForPremiumRefunds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCededOnProvisionsForPremiumRefunds(AmountType value) {
                this.lessAmountsCededOnProvisionsForPremiumRefunds = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NonPerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nonPerformanceRelated",
                "gross",
                "lessAmountsCeded"
            })
            public static class NonPerformanceRelated {

                @XmlElement(name = "NonPerformanceRelated")
                protected AmountType nonPerformanceRelated;
                @XmlElement(name = "Gross")
                protected AmountType gross;
                @XmlElement(name = "LessAmountsCeded")
                protected AmountType lessAmountsCeded;

                /**
                 * Gets the value of the nonPerformanceRelated property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getNonPerformanceRelated() {
                    return nonPerformanceRelated;
                }

                /**
                 * Sets the value of the nonPerformanceRelated property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setNonPerformanceRelated(AmountType value) {
                    this.nonPerformanceRelated = value;
                }

                /**
                 * Gets the value of the gross property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getGross() {
                    return gross;
                }

                /**
                 * Sets the value of the gross property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setGross(AmountType value) {
                    this.gross = value;
                }

                /**
                 * Gets the value of the lessAmountsCeded property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getLessAmountsCeded() {
                    return lessAmountsCeded;
                }

                /**
                 * Sets the value of the lessAmountsCeded property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setLessAmountsCeded(AmountType value) {
                    this.lessAmountsCeded = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="PerformanceRelated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="Gross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="LessAmountsCeded" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "performanceRelated",
                "gross",
                "lessAmountsCeded"
            })
            public static class PerformanceRelated {

                @XmlElement(name = "PerformanceRelated")
                protected AmountType performanceRelated;
                @XmlElement(name = "Gross")
                protected AmountType gross;
                @XmlElement(name = "LessAmountsCeded")
                protected AmountType lessAmountsCeded;

                /**
                 * Gets the value of the performanceRelated property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getPerformanceRelated() {
                    return performanceRelated;
                }

                /**
                 * Sets the value of the performanceRelated property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setPerformanceRelated(AmountType value) {
                    this.performanceRelated = value;
                }

                /**
                 * Gets the value of the gross property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getGross() {
                    return gross;
                }

                /**
                 * Sets the value of the gross property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setGross(AmountType value) {
                    this.gross = value;
                }

                /**
                 * Gets the value of the lessAmountsCeded property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getLessAmountsCeded() {
                    return lessAmountsCeded;
                }

                /**
                 * Sets the value of the lessAmountsCeded property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setLessAmountsCeded(AmountType value) {
                    this.lessAmountsCeded = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="UnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="GrossUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LessAmountsCededOnUnearnedPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "unearnedPremiums",
            "grossUnearnedPremiums",
            "lessAmountsCededOnUnearnedPremiums"
        })
        public static class UnearnedPremiums {

            @XmlElement(name = "UnearnedPremiums")
            protected AmountType unearnedPremiums;
            @XmlElement(name = "GrossUnearnedPremiums")
            protected AmountType grossUnearnedPremiums;
            @XmlElement(name = "LessAmountsCededOnUnearnedPremiums")
            protected AmountType lessAmountsCededOnUnearnedPremiums;

            /**
             * Gets the value of the unearnedPremiums property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getUnearnedPremiums() {
                return unearnedPremiums;
            }

            /**
             * Sets the value of the unearnedPremiums property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setUnearnedPremiums(AmountType value) {
                this.unearnedPremiums = value;
            }

            /**
             * Gets the value of the grossUnearnedPremiums property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getGrossUnearnedPremiums() {
                return grossUnearnedPremiums;
            }

            /**
             * Sets the value of the grossUnearnedPremiums property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setGrossUnearnedPremiums(AmountType value) {
                this.grossUnearnedPremiums = value;
            }

            /**
             * Gets the value of the lessAmountsCededOnUnearnedPremiums property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLessAmountsCededOnUnearnedPremiums() {
                return lessAmountsCededOnUnearnedPremiums;
            }

            /**
             * Sets the value of the lessAmountsCededOnUnearnedPremiums property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLessAmountsCededOnUnearnedPremiums(AmountType value) {
                this.lessAmountsCededOnUnearnedPremiums = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IssuedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichCapitalChange" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BasicCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SilentCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherIssuedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "issuedCapital",
        "ofWhichCapitalChange",
        "basicCapital",
        "silentCapital",
        "otherIssuedCapital"
    })
    public static class IssuedCapital {

        @XmlElement(name = "IssuedCapital")
        protected AmountType issuedCapital;
        @XmlElement(name = "OfWhichCapitalChange")
        protected AmountType ofWhichCapitalChange;
        @XmlElement(name = "BasicCapital")
        protected AmountType basicCapital;
        @XmlElement(name = "SilentCapital")
        protected AmountType silentCapital;
        @XmlElement(name = "OtherIssuedCapital")
        protected AmountType otherIssuedCapital;

        /**
         * Gets the value of the issuedCapital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIssuedCapital() {
            return issuedCapital;
        }

        /**
         * Sets the value of the issuedCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIssuedCapital(AmountType value) {
            this.issuedCapital = value;
        }

        /**
         * Gets the value of the ofWhichCapitalChange property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichCapitalChange() {
            return ofWhichCapitalChange;
        }

        /**
         * Sets the value of the ofWhichCapitalChange property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichCapitalChange(AmountType value) {
            this.ofWhichCapitalChange = value;
        }

        /**
         * Gets the value of the basicCapital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBasicCapital() {
            return basicCapital;
        }

        /**
         * Sets the value of the basicCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBasicCapital(AmountType value) {
            this.basicCapital = value;
        }

        /**
         * Gets the value of the silentCapital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSilentCapital() {
            return silentCapital;
        }

        /**
         * Sets the value of the silentCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSilentCapital(AmountType value) {
            this.silentCapital = value;
        }

        /**
         * Gets the value of the otherIssuedCapital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherIssuedCapital() {
            return otherIssuedCapital;
        }

        /**
         * Sets the value of the otherIssuedCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherIssuedCapital(AmountType value) {
            this.otherIssuedCapital = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DebenturesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToBanksAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToOtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToOtherCreditorsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AdvancePaymentsReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TradeAccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TradeAccountsDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BillsExchangePayableLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BillsExchangeDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromLease" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromLeaseDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromSupervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromSupervisionDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToHospitalFoundationCarrier" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichFromSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToHospitalFoundationCarrierDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesAccordingToHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichAllocatedbyVirtueLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesAccordingToHospitalFinancingActDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromGovernmentalSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichGrantedbutNotyetPaidOut" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromGovernmentalSubsidiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherDonationsForFinancingInstallations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherDonationsForFinancingInstallationsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromNonGovernmentalPromotionInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NonGovermentalPromotionInvestmentsDue5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToAffiliatesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToJointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToJointVenturesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToShareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToShareholdersAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToOtherGroupCompaniesAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ResidualLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ResidualLiabilitiesDueAfter5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFallingDueMoreThanOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TherefromLiabilitiesFallingDueMoreThanFiveYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "debentureLoans",
        "debenturesDueAfter5Years",
        "liabilitiesDueToBanks",
        "liabilitiesDueToBanksAfter5Years",
        "liabilitiesToOtherCreditors",
        "liabilitiesToOtherCreditorsDueAfter5Years",
        "advancePaymentsReceived",
        "tradeAccountsPayable",
        "tradeAccountsDueAfter5Years",
        "billsExchangePayableLongTerm",
        "billsExchangeDueAfter5Years",
        "liabilitiesFromLease",
        "liabilitiesFromLeaseDueAfter5Years",
        "liabilitiesFromSupervision",
        "liabilitiesFromSupervisionDueAfter5Years",
        "liabilitiesToHospitalFoundationCarrier",
        "ofWhichFromSuppliesServices",
        "liabilitiesToHospitalFoundationCarrierDueAfter5Years",
        "liabilitiesAccordingToHospitalFinancingLaw",
        "ofWhichAllocatedbyVirtueLKG",
        "liabilitiesAccordingToHospitalFinancingActDue5Years",
        "liabilitiesFromGovernmentalSubsidies",
        "ofWhichGrantedbutNotyetPaidOut",
        "liabilitiesFromGovernmentalSubsidiesDueAfter5Years",
        "otherDonationsForFinancingInstallations",
        "otherDonationsForFinancingInstallationsDue5Years",
        "liabilitiesFromNonGovernmentalPromotionInvestments",
        "nonGovermentalPromotionInvestmentsDue5Years",
        "liabilitiesDueToAffiliatedCompanies",
        "liabilitiesDueToAffiliatesAfter5Years",
        "liabilitiesDueToJointVentures",
        "liabilitiesDueToJointVenturesAfter5Years",
        "liabilitiesDueToShareholders",
        "liabilitiesDueToShareholdersAfter5Years",
        "liabilitiesDueToOtherGroupCompanies",
        "liabilitiesDueToOtherGroupCompaniesAfter5Years",
        "otherLiabilities",
        "otherLiabilitiesDueAfter5Years",
        "residualLiabilities",
        "residualLiabilitiesDueAfter5Years",
        "liabilitiesFallingDueMoreThanOneYear",
        "therefromLiabilitiesFallingDueMoreThanFiveYears"
    })
    public static class LiabilitiesDueMoreThanAYear {

        @XmlElement(name = "DebentureLoans")
        protected AmountType debentureLoans;
        @XmlElement(name = "DebenturesDueAfter5Years")
        protected AmountType debenturesDueAfter5Years;
        @XmlElement(name = "LiabilitiesDueToBanks")
        protected AmountType liabilitiesDueToBanks;
        @XmlElement(name = "LiabilitiesDueToBanksAfter5Years")
        protected AmountType liabilitiesDueToBanksAfter5Years;
        @XmlElement(name = "LiabilitiesToOtherCreditors")
        protected AmountType liabilitiesToOtherCreditors;
        @XmlElement(name = "LiabilitiesToOtherCreditorsDueAfter5Years")
        protected AmountType liabilitiesToOtherCreditorsDueAfter5Years;
        @XmlElement(name = "AdvancePaymentsReceived")
        protected AmountType advancePaymentsReceived;
        @XmlElement(name = "TradeAccountsPayable")
        protected AmountType tradeAccountsPayable;
        @XmlElement(name = "TradeAccountsDueAfter5Years")
        protected AmountType tradeAccountsDueAfter5Years;
        @XmlElement(name = "BillsExchangePayableLongTerm")
        protected AmountType billsExchangePayableLongTerm;
        @XmlElement(name = "BillsExchangeDueAfter5Years")
        protected AmountType billsExchangeDueAfter5Years;
        @XmlElement(name = "LiabilitiesFromLease")
        protected AmountType liabilitiesFromLease;
        @XmlElement(name = "LiabilitiesFromLeaseDueAfter5Years")
        protected AmountType liabilitiesFromLeaseDueAfter5Years;
        @XmlElement(name = "LiabilitiesFromSupervision")
        protected AmountType liabilitiesFromSupervision;
        @XmlElement(name = "LiabilitiesFromSupervisionDueAfter5Years")
        protected AmountType liabilitiesFromSupervisionDueAfter5Years;
        @XmlElement(name = "LiabilitiesToHospitalFoundationCarrier")
        protected AmountType liabilitiesToHospitalFoundationCarrier;
        @XmlElement(name = "OfWhichFromSuppliesServices")
        protected AmountType ofWhichFromSuppliesServices;
        @XmlElement(name = "LiabilitiesToHospitalFoundationCarrierDueAfter5Years")
        protected AmountType liabilitiesToHospitalFoundationCarrierDueAfter5Years;
        @XmlElement(name = "LiabilitiesAccordingToHospitalFinancingLaw")
        protected AmountType liabilitiesAccordingToHospitalFinancingLaw;
        @XmlElement(name = "OfWhichAllocatedbyVirtueLKG")
        protected AmountType ofWhichAllocatedbyVirtueLKG;
        @XmlElement(name = "LiabilitiesAccordingToHospitalFinancingActDue5Years")
        protected AmountType liabilitiesAccordingToHospitalFinancingActDue5Years;
        @XmlElement(name = "LiabilitiesFromGovernmentalSubsidies")
        protected AmountType liabilitiesFromGovernmentalSubsidies;
        @XmlElement(name = "OfWhichGrantedbutNotyetPaidOut")
        protected AmountType ofWhichGrantedbutNotyetPaidOut;
        @XmlElement(name = "LiabilitiesFromGovernmentalSubsidiesDueAfter5Years")
        protected AmountType liabilitiesFromGovernmentalSubsidiesDueAfter5Years;
        @XmlElement(name = "OtherDonationsForFinancingInstallations")
        protected AmountType otherDonationsForFinancingInstallations;
        @XmlElement(name = "OtherDonationsForFinancingInstallationsDue5Years")
        protected AmountType otherDonationsForFinancingInstallationsDue5Years;
        @XmlElement(name = "LiabilitiesFromNonGovernmentalPromotionInvestments")
        protected AmountType liabilitiesFromNonGovernmentalPromotionInvestments;
        @XmlElement(name = "NonGovermentalPromotionInvestmentsDue5Years")
        protected AmountType nonGovermentalPromotionInvestmentsDue5Years;
        @XmlElement(name = "LiabilitiesDueToAffiliatedCompanies")
        protected AmountType liabilitiesDueToAffiliatedCompanies;
        @XmlElement(name = "LiabilitiesDueToAffiliatesAfter5Years")
        protected AmountType liabilitiesDueToAffiliatesAfter5Years;
        @XmlElement(name = "LiabilitiesDueToJointVentures")
        protected AmountType liabilitiesDueToJointVentures;
        @XmlElement(name = "LiabilitiesDueToJointVenturesAfter5Years")
        protected AmountType liabilitiesDueToJointVenturesAfter5Years;
        @XmlElement(name = "LiabilitiesDueToShareholders")
        protected AmountType liabilitiesDueToShareholders;
        @XmlElement(name = "LiabilitiesDueToShareholdersAfter5Years")
        protected AmountType liabilitiesDueToShareholdersAfter5Years;
        @XmlElement(name = "LiabilitiesDueToOtherGroupCompanies")
        protected AmountType liabilitiesDueToOtherGroupCompanies;
        @XmlElement(name = "LiabilitiesDueToOtherGroupCompaniesAfter5Years")
        protected AmountType liabilitiesDueToOtherGroupCompaniesAfter5Years;
        @XmlElement(name = "OtherLiabilities")
        protected AmountType otherLiabilities;
        @XmlElement(name = "OtherLiabilitiesDueAfter5Years")
        protected AmountType otherLiabilitiesDueAfter5Years;
        @XmlElement(name = "ResidualLiabilities")
        protected AmountType residualLiabilities;
        @XmlElement(name = "ResidualLiabilitiesDueAfter5Years")
        protected AmountType residualLiabilitiesDueAfter5Years;
        @XmlElement(name = "LiabilitiesFallingDueMoreThanOneYear")
        protected AmountType liabilitiesFallingDueMoreThanOneYear;
        @XmlElement(name = "TherefromLiabilitiesFallingDueMoreThanFiveYears")
        protected AmountType therefromLiabilitiesFallingDueMoreThanFiveYears;

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
         * Gets the value of the liabilitiesDueToBanks property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToBanks() {
            return liabilitiesDueToBanks;
        }

        /**
         * Sets the value of the liabilitiesDueToBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToBanks(AmountType value) {
            this.liabilitiesDueToBanks = value;
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
         * Gets the value of the liabilitiesToOtherCreditors property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToOtherCreditors() {
            return liabilitiesToOtherCreditors;
        }

        /**
         * Sets the value of the liabilitiesToOtherCreditors property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToOtherCreditors(AmountType value) {
            this.liabilitiesToOtherCreditors = value;
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
         * Gets the value of the advancePaymentsReceived property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAdvancePaymentsReceived() {
            return advancePaymentsReceived;
        }

        /**
         * Sets the value of the advancePaymentsReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAdvancePaymentsReceived(AmountType value) {
            this.advancePaymentsReceived = value;
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
         * Gets the value of the billsExchangePayableLongTerm property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBillsExchangePayableLongTerm() {
            return billsExchangePayableLongTerm;
        }

        /**
         * Sets the value of the billsExchangePayableLongTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBillsExchangePayableLongTerm(AmountType value) {
            this.billsExchangePayableLongTerm = value;
        }

        /**
         * Gets the value of the billsExchangeDueAfter5Years property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBillsExchangeDueAfter5Years() {
            return billsExchangeDueAfter5Years;
        }

        /**
         * Sets the value of the billsExchangeDueAfter5Years property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBillsExchangeDueAfter5Years(AmountType value) {
            this.billsExchangeDueAfter5Years = value;
        }

        /**
         * Gets the value of the liabilitiesFromLease property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromLease() {
            return liabilitiesFromLease;
        }

        /**
         * Sets the value of the liabilitiesFromLease property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromLease(AmountType value) {
            this.liabilitiesFromLease = value;
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
         * Gets the value of the liabilitiesFromSupervision property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromSupervision() {
            return liabilitiesFromSupervision;
        }

        /**
         * Sets the value of the liabilitiesFromSupervision property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromSupervision(AmountType value) {
            this.liabilitiesFromSupervision = value;
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
         * Gets the value of the liabilitiesToHospitalFoundationCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToHospitalFoundationCarrier() {
            return liabilitiesToHospitalFoundationCarrier;
        }

        /**
         * Sets the value of the liabilitiesToHospitalFoundationCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToHospitalFoundationCarrier(AmountType value) {
            this.liabilitiesToHospitalFoundationCarrier = value;
        }

        /**
         * Gets the value of the ofWhichFromSuppliesServices property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichFromSuppliesServices() {
            return ofWhichFromSuppliesServices;
        }

        /**
         * Sets the value of the ofWhichFromSuppliesServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichFromSuppliesServices(AmountType value) {
            this.ofWhichFromSuppliesServices = value;
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
         * Gets the value of the liabilitiesAccordingToHospitalFinancingLaw property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesAccordingToHospitalFinancingLaw() {
            return liabilitiesAccordingToHospitalFinancingLaw;
        }

        /**
         * Sets the value of the liabilitiesAccordingToHospitalFinancingLaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesAccordingToHospitalFinancingLaw(AmountType value) {
            this.liabilitiesAccordingToHospitalFinancingLaw = value;
        }

        /**
         * Gets the value of the ofWhichAllocatedbyVirtueLKG property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichAllocatedbyVirtueLKG() {
            return ofWhichAllocatedbyVirtueLKG;
        }

        /**
         * Sets the value of the ofWhichAllocatedbyVirtueLKG property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichAllocatedbyVirtueLKG(AmountType value) {
            this.ofWhichAllocatedbyVirtueLKG = value;
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
         * Gets the value of the liabilitiesFromGovernmentalSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromGovernmentalSubsidies() {
            return liabilitiesFromGovernmentalSubsidies;
        }

        /**
         * Sets the value of the liabilitiesFromGovernmentalSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromGovernmentalSubsidies(AmountType value) {
            this.liabilitiesFromGovernmentalSubsidies = value;
        }

        /**
         * Gets the value of the ofWhichGrantedbutNotyetPaidOut property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichGrantedbutNotyetPaidOut() {
            return ofWhichGrantedbutNotyetPaidOut;
        }

        /**
         * Sets the value of the ofWhichGrantedbutNotyetPaidOut property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichGrantedbutNotyetPaidOut(AmountType value) {
            this.ofWhichGrantedbutNotyetPaidOut = value;
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
         * Gets the value of the otherDonationsForFinancingInstallations property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherDonationsForFinancingInstallations() {
            return otherDonationsForFinancingInstallations;
        }

        /**
         * Sets the value of the otherDonationsForFinancingInstallations property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherDonationsForFinancingInstallations(AmountType value) {
            this.otherDonationsForFinancingInstallations = value;
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
         * Gets the value of the liabilitiesFromNonGovernmentalPromotionInvestments property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromNonGovernmentalPromotionInvestments() {
            return liabilitiesFromNonGovernmentalPromotionInvestments;
        }

        /**
         * Sets the value of the liabilitiesFromNonGovernmentalPromotionInvestments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromNonGovernmentalPromotionInvestments(AmountType value) {
            this.liabilitiesFromNonGovernmentalPromotionInvestments = value;
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
         * Gets the value of the liabilitiesDueToJointVentures property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToJointVentures() {
            return liabilitiesDueToJointVentures;
        }

        /**
         * Sets the value of the liabilitiesDueToJointVentures property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToJointVentures(AmountType value) {
            this.liabilitiesDueToJointVentures = value;
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
         * Gets the value of the liabilitiesDueToShareholders property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToShareholders() {
            return liabilitiesDueToShareholders;
        }

        /**
         * Sets the value of the liabilitiesDueToShareholders property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToShareholders(AmountType value) {
            this.liabilitiesDueToShareholders = value;
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
         * Gets the value of the residualLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getResidualLiabilities() {
            return residualLiabilities;
        }

        /**
         * Sets the value of the residualLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setResidualLiabilities(AmountType value) {
            this.residualLiabilities = value;
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
         * Gets the value of the liabilitiesFallingDueMoreThanOneYear property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFallingDueMoreThanOneYear() {
            return liabilitiesFallingDueMoreThanOneYear;
        }

        /**
         * Sets the value of the liabilitiesFallingDueMoreThanOneYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFallingDueMoreThanOneYear(AmountType value) {
            this.liabilitiesFallingDueMoreThanOneYear = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DebentureLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToOtherCreditors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AdvancePaymentsReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TradeAccountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BillsExchangePayableShortTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromLease" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromSupervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesToHospitalFoundationCarrier" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichFromSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesAccordingToHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichAfterFederalHealthCareInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichAllocatedbyVirtueLKG" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromGovernmentalSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichGrantedbutNotyetPaidOut" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromOtherDonationsForFinancingInstallations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFromNonGovernmentalPromotionInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToJointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToShareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesDueToOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ResidualLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LiabilitiesFallingDueWithinOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "debentureLoans",
        "liabilitiesDueToBanks",
        "liabilitiesToOtherCreditors",
        "advancePaymentsReceived",
        "tradeAccountsPayable",
        "billsExchangePayableShortTerm",
        "liabilitiesFromLease",
        "liabilitiesFromSupervision",
        "liabilitiesToHospitalFoundationCarrier",
        "ofWhichFromSuppliesServices",
        "liabilitiesAccordingToHospitalFinancingLaw",
        "ofWhichAfterFederalHealthCareInsurance",
        "ofWhichAllocatedbyVirtueLKG",
        "liabilitiesFromGovernmentalSubsidies",
        "ofWhichGrantedbutNotyetPaidOut",
        "liabilitiesFromOtherDonationsForFinancingInstallations",
        "liabilitiesFromNonGovernmentalPromotionInvestments",
        "liabilitiesDueToAffiliatedCompanies",
        "liabilitiesDueToJointVentures",
        "liabilitiesDueToShareholders",
        "liabilitiesDueToOtherGroupCompanies",
        "otherLiabilities",
        "residualLiabilities",
        "liabilitiesFallingDueWithinOneYear"
    })
    public static class LiabilitiesDueWithinAYear {

        @XmlElement(name = "DebentureLoans")
        protected AmountType debentureLoans;
        @XmlElement(name = "LiabilitiesDueToBanks")
        protected AmountType liabilitiesDueToBanks;
        @XmlElement(name = "LiabilitiesToOtherCreditors")
        protected AmountType liabilitiesToOtherCreditors;
        @XmlElement(name = "AdvancePaymentsReceived")
        protected AmountType advancePaymentsReceived;
        @XmlElement(name = "TradeAccountsPayable")
        protected AmountType tradeAccountsPayable;
        @XmlElement(name = "BillsExchangePayableShortTerm")
        protected AmountType billsExchangePayableShortTerm;
        @XmlElement(name = "LiabilitiesFromLease")
        protected AmountType liabilitiesFromLease;
        @XmlElement(name = "LiabilitiesFromSupervision")
        protected AmountType liabilitiesFromSupervision;
        @XmlElement(name = "LiabilitiesToHospitalFoundationCarrier")
        protected AmountType liabilitiesToHospitalFoundationCarrier;
        @XmlElement(name = "OfWhichFromSuppliesServices")
        protected AmountType ofWhichFromSuppliesServices;
        @XmlElement(name = "LiabilitiesAccordingToHospitalFinancingLaw")
        protected AmountType liabilitiesAccordingToHospitalFinancingLaw;
        @XmlElement(name = "OfWhichAfterFederalHealthCareInsurance")
        protected AmountType ofWhichAfterFederalHealthCareInsurance;
        @XmlElement(name = "OfWhichAllocatedbyVirtueLKG")
        protected AmountType ofWhichAllocatedbyVirtueLKG;
        @XmlElement(name = "LiabilitiesFromGovernmentalSubsidies")
        protected AmountType liabilitiesFromGovernmentalSubsidies;
        @XmlElement(name = "OfWhichGrantedbutNotyetPaidOut")
        protected AmountType ofWhichGrantedbutNotyetPaidOut;
        @XmlElement(name = "LiabilitiesFromOtherDonationsForFinancingInstallations")
        protected AmountType liabilitiesFromOtherDonationsForFinancingInstallations;
        @XmlElement(name = "LiabilitiesFromNonGovernmentalPromotionInvestments")
        protected AmountType liabilitiesFromNonGovernmentalPromotionInvestments;
        @XmlElement(name = "LiabilitiesDueToAffiliatedCompanies")
        protected AmountType liabilitiesDueToAffiliatedCompanies;
        @XmlElement(name = "LiabilitiesDueToJointVentures")
        protected AmountType liabilitiesDueToJointVentures;
        @XmlElement(name = "LiabilitiesDueToShareholders")
        protected AmountType liabilitiesDueToShareholders;
        @XmlElement(name = "LiabilitiesDueToOtherGroupCompanies")
        protected AmountType liabilitiesDueToOtherGroupCompanies;
        @XmlElement(name = "OtherLiabilities")
        protected AmountType otherLiabilities;
        @XmlElement(name = "ResidualLiabilities")
        protected AmountType residualLiabilities;
        @XmlElement(name = "LiabilitiesFallingDueWithinOneYear")
        protected AmountType liabilitiesFallingDueWithinOneYear;

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
         * Gets the value of the liabilitiesDueToBanks property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToBanks() {
            return liabilitiesDueToBanks;
        }

        /**
         * Sets the value of the liabilitiesDueToBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToBanks(AmountType value) {
            this.liabilitiesDueToBanks = value;
        }

        /**
         * Gets the value of the liabilitiesToOtherCreditors property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToOtherCreditors() {
            return liabilitiesToOtherCreditors;
        }

        /**
         * Sets the value of the liabilitiesToOtherCreditors property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToOtherCreditors(AmountType value) {
            this.liabilitiesToOtherCreditors = value;
        }

        /**
         * Gets the value of the advancePaymentsReceived property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAdvancePaymentsReceived() {
            return advancePaymentsReceived;
        }

        /**
         * Sets the value of the advancePaymentsReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAdvancePaymentsReceived(AmountType value) {
            this.advancePaymentsReceived = value;
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
         * Gets the value of the liabilitiesFromLease property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromLease() {
            return liabilitiesFromLease;
        }

        /**
         * Sets the value of the liabilitiesFromLease property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromLease(AmountType value) {
            this.liabilitiesFromLease = value;
        }

        /**
         * Gets the value of the liabilitiesFromSupervision property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromSupervision() {
            return liabilitiesFromSupervision;
        }

        /**
         * Sets the value of the liabilitiesFromSupervision property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromSupervision(AmountType value) {
            this.liabilitiesFromSupervision = value;
        }

        /**
         * Gets the value of the liabilitiesToHospitalFoundationCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToHospitalFoundationCarrier() {
            return liabilitiesToHospitalFoundationCarrier;
        }

        /**
         * Sets the value of the liabilitiesToHospitalFoundationCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToHospitalFoundationCarrier(AmountType value) {
            this.liabilitiesToHospitalFoundationCarrier = value;
        }

        /**
         * Gets the value of the ofWhichFromSuppliesServices property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichFromSuppliesServices() {
            return ofWhichFromSuppliesServices;
        }

        /**
         * Sets the value of the ofWhichFromSuppliesServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichFromSuppliesServices(AmountType value) {
            this.ofWhichFromSuppliesServices = value;
        }

        /**
         * Gets the value of the liabilitiesAccordingToHospitalFinancingLaw property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesAccordingToHospitalFinancingLaw() {
            return liabilitiesAccordingToHospitalFinancingLaw;
        }

        /**
         * Sets the value of the liabilitiesAccordingToHospitalFinancingLaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesAccordingToHospitalFinancingLaw(AmountType value) {
            this.liabilitiesAccordingToHospitalFinancingLaw = value;
        }

        /**
         * Gets the value of the ofWhichAfterFederalHealthCareInsurance property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichAfterFederalHealthCareInsurance() {
            return ofWhichAfterFederalHealthCareInsurance;
        }

        /**
         * Sets the value of the ofWhichAfterFederalHealthCareInsurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichAfterFederalHealthCareInsurance(AmountType value) {
            this.ofWhichAfterFederalHealthCareInsurance = value;
        }

        /**
         * Gets the value of the ofWhichAllocatedbyVirtueLKG property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichAllocatedbyVirtueLKG() {
            return ofWhichAllocatedbyVirtueLKG;
        }

        /**
         * Sets the value of the ofWhichAllocatedbyVirtueLKG property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichAllocatedbyVirtueLKG(AmountType value) {
            this.ofWhichAllocatedbyVirtueLKG = value;
        }

        /**
         * Gets the value of the liabilitiesFromGovernmentalSubsidies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromGovernmentalSubsidies() {
            return liabilitiesFromGovernmentalSubsidies;
        }

        /**
         * Sets the value of the liabilitiesFromGovernmentalSubsidies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromGovernmentalSubsidies(AmountType value) {
            this.liabilitiesFromGovernmentalSubsidies = value;
        }

        /**
         * Gets the value of the ofWhichGrantedbutNotyetPaidOut property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichGrantedbutNotyetPaidOut() {
            return ofWhichGrantedbutNotyetPaidOut;
        }

        /**
         * Sets the value of the ofWhichGrantedbutNotyetPaidOut property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichGrantedbutNotyetPaidOut(AmountType value) {
            this.ofWhichGrantedbutNotyetPaidOut = value;
        }

        /**
         * Gets the value of the liabilitiesFromOtherDonationsForFinancingInstallations property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromOtherDonationsForFinancingInstallations() {
            return liabilitiesFromOtherDonationsForFinancingInstallations;
        }

        /**
         * Sets the value of the liabilitiesFromOtherDonationsForFinancingInstallations property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromOtherDonationsForFinancingInstallations(AmountType value) {
            this.liabilitiesFromOtherDonationsForFinancingInstallations = value;
        }

        /**
         * Gets the value of the liabilitiesFromNonGovernmentalPromotionInvestments property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesFromNonGovernmentalPromotionInvestments() {
            return liabilitiesFromNonGovernmentalPromotionInvestments;
        }

        /**
         * Sets the value of the liabilitiesFromNonGovernmentalPromotionInvestments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesFromNonGovernmentalPromotionInvestments(AmountType value) {
            this.liabilitiesFromNonGovernmentalPromotionInvestments = value;
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
         * Gets the value of the liabilitiesDueToJointVentures property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToJointVentures() {
            return liabilitiesDueToJointVentures;
        }

        /**
         * Sets the value of the liabilitiesDueToJointVentures property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToJointVentures(AmountType value) {
            this.liabilitiesDueToJointVentures = value;
        }

        /**
         * Gets the value of the liabilitiesDueToShareholders property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesDueToShareholders() {
            return liabilitiesDueToShareholders;
        }

        /**
         * Sets the value of the liabilitiesDueToShareholders property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesDueToShareholders(AmountType value) {
            this.liabilitiesDueToShareholders = value;
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
         * Gets the value of the residualLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getResidualLiabilities() {
            return residualLiabilities;
        }

        /**
         * Sets the value of the residualLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setResidualLiabilities(AmountType value) {
            this.residualLiabilities = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LiabilitiesToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="IssuedMortgageDebentureOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="IssuedTreasuryDebentureOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BuildingSocietySavingDeposits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherLiabilities" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "liabilitiesToCreditInstitutions",
        "payableOnDemand",
        "withAgreedTermorPeriodNotice",
        "issuedMortgageDebentureOnBearer",
        "issuedTreasuryDebentureOnBearer",
        "deposits",
        "buildingSocietySavingDeposits",
        "otherLiabilities"
    })
    public static class LiabilitiesToCreditInstitutions {

        @XmlElement(name = "LiabilitiesToCreditInstitutions")
        protected AmountType liabilitiesToCreditInstitutions;
        @XmlElement(name = "PayableOnDemand")
        protected AmountType payableOnDemand;
        @XmlElement(name = "WithAgreedTermorPeriodNotice")
        protected AmountType withAgreedTermorPeriodNotice;
        @XmlElement(name = "IssuedMortgageDebentureOnBearer")
        protected AmountType issuedMortgageDebentureOnBearer;
        @XmlElement(name = "IssuedTreasuryDebentureOnBearer")
        protected AmountType issuedTreasuryDebentureOnBearer;
        @XmlElement(name = "Deposits")
        protected AmountType deposits;
        @XmlElement(name = "BuildingSocietySavingDeposits")
        protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.BuildingSocietySavingDeposits buildingSocietySavingDeposits;
        @XmlElement(name = "OtherLiabilities")
        protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.OtherLiabilities otherLiabilities;

        /**
         * Gets the value of the liabilitiesToCreditInstitutions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToCreditInstitutions() {
            return liabilitiesToCreditInstitutions;
        }

        /**
         * Sets the value of the liabilitiesToCreditInstitutions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToCreditInstitutions(AmountType value) {
            this.liabilitiesToCreditInstitutions = value;
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
         * Gets the value of the withAgreedTermorPeriodNotice property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getWithAgreedTermorPeriodNotice() {
            return withAgreedTermorPeriodNotice;
        }

        /**
         * Sets the value of the withAgreedTermorPeriodNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setWithAgreedTermorPeriodNotice(AmountType value) {
            this.withAgreedTermorPeriodNotice = value;
        }

        /**
         * Gets the value of the issuedMortgageDebentureOnBearer property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIssuedMortgageDebentureOnBearer() {
            return issuedMortgageDebentureOnBearer;
        }

        /**
         * Sets the value of the issuedMortgageDebentureOnBearer property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIssuedMortgageDebentureOnBearer(AmountType value) {
            this.issuedMortgageDebentureOnBearer = value;
        }

        /**
         * Gets the value of the issuedTreasuryDebentureOnBearer property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getIssuedTreasuryDebentureOnBearer() {
            return issuedTreasuryDebentureOnBearer;
        }

        /**
         * Sets the value of the issuedTreasuryDebentureOnBearer property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setIssuedTreasuryDebentureOnBearer(AmountType value) {
            this.issuedTreasuryDebentureOnBearer = value;
        }

        /**
         * Gets the value of the deposits property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDeposits() {
            return deposits;
        }

        /**
         * Sets the value of the deposits property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDeposits(AmountType value) {
            this.deposits = value;
        }

        /**
         * Gets the value of the buildingSocietySavingDeposits property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.BuildingSocietySavingDeposits }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.BuildingSocietySavingDeposits getBuildingSocietySavingDeposits() {
            return buildingSocietySavingDeposits;
        }

        /**
         * Sets the value of the buildingSocietySavingDeposits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.BuildingSocietySavingDeposits }
         *     
         */
        public void setBuildingSocietySavingDeposits(BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.BuildingSocietySavingDeposits value) {
            this.buildingSocietySavingDeposits = value;
        }

        /**
         * Gets the value of the otherLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.OtherLiabilities }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.OtherLiabilities getOtherLiabilities() {
            return otherLiabilities;
        }

        /**
         * Sets the value of the otherLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.OtherLiabilities }
         *     
         */
        public void setOtherLiabilities(BalanceSheetDtldLiabilitiesType.LiabilitiesToCreditInstitutions.OtherLiabilities value) {
            this.otherLiabilities = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "buildingSocietySavingDeposits",
            "ofWhichOnCancelledAgreements",
            "ofWhichOnAllocatedAgreements",
            "ofWhichInterestBonuses"
        })
        public static class BuildingSocietySavingDeposits {

            @XmlElement(name = "BuildingSocietySavingDeposits")
            protected AmountType buildingSocietySavingDeposits;
            @XmlElement(name = "OfWhichOnCancelledAgreements")
            protected AmountType ofWhichOnCancelledAgreements;
            @XmlElement(name = "OfWhichOnAllocatedAgreements")
            protected AmountType ofWhichOnAllocatedAgreements;
            @XmlElement(name = "OfWhichInterestBonuses")
            protected AmountType ofWhichInterestBonuses;

            /**
             * Gets the value of the buildingSocietySavingDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingSocietySavingDeposits() {
                return buildingSocietySavingDeposits;
            }

            /**
             * Sets the value of the buildingSocietySavingDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingSocietySavingDeposits(AmountType value) {
                this.buildingSocietySavingDeposits = value;
            }

            /**
             * Gets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnCancelledAgreements() {
                return ofWhichOnCancelledAgreements;
            }

            /**
             * Sets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnCancelledAgreements(AmountType value) {
                this.ofWhichOnCancelledAgreements = value;
            }

            /**
             * Gets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnAllocatedAgreements() {
                return ofWhichOnAllocatedAgreements;
            }

            /**
             * Sets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnAllocatedAgreements(AmountType value) {
                this.ofWhichOnAllocatedAgreements = value;
            }

            /**
             * Gets the value of the ofWhichInterestBonuses property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInterestBonuses() {
                return ofWhichInterestBonuses;
            }

            /**
             * Sets the value of the ofWhichInterestBonuses property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInterestBonuses(AmountType value) {
                this.ofWhichInterestBonuses = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherLiabilities",
            "payableOnDemand",
            "deliveredTreasuryDebenturesOnBearer",
            "deliveredMortgageDebenturesOnBearer"
        })
        public static class OtherLiabilities {

            @XmlElement(name = "OtherLiabilities")
            protected AmountType otherLiabilities;
            @XmlElement(name = "PayableOnDemand")
            protected AmountType payableOnDemand;
            @XmlElement(name = "DeliveredTreasuryDebenturesOnBearer")
            protected AmountType deliveredTreasuryDebenturesOnBearer;
            @XmlElement(name = "DeliveredMortgageDebenturesOnBearer")
            protected AmountType deliveredMortgageDebenturesOnBearer;

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
             * Gets the value of the deliveredTreasuryDebenturesOnBearer property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDeliveredTreasuryDebenturesOnBearer() {
                return deliveredTreasuryDebenturesOnBearer;
            }

            /**
             * Sets the value of the deliveredTreasuryDebenturesOnBearer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDeliveredTreasuryDebenturesOnBearer(AmountType value) {
                this.deliveredTreasuryDebenturesOnBearer = value;
            }

            /**
             * Gets the value of the deliveredMortgageDebenturesOnBearer property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDeliveredMortgageDebenturesOnBearer() {
                return deliveredMortgageDebenturesOnBearer;
            }

            /**
             * Sets the value of the deliveredMortgageDebenturesOnBearer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDeliveredMortgageDebenturesOnBearer(AmountType value) {
                this.deliveredMortgageDebenturesOnBearer = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LiabilitiesToCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="RegisteredIssuedMortgageBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="RegisteredIssuedPublicSectorBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DepositsFromBuildingSocietySavingsSavingDeposits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepositsFromBuildingSocietySavingsSavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SavingsDeposit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="WithAgreedPeriodNotice3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="WithAgreedPeriodNoticeMoreThan3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherLiabilitiesToCustomer" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherLiabilitiesToCustomer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "liabilitiesToCustomers",
        "payableOnDemand",
        "withAgreedTermorPeriodNotice",
        "registeredIssuedMortgageBonds",
        "registeredIssuedPublicSectorBonds",
        "depositsFromBuildingSocietySavingsSavingDeposits",
        "otherLiabilitiesToCustomer"
    })
    public static class LiabilitiesToCustomers {

        @XmlElement(name = "LiabilitiesToCustomers")
        protected AmountType liabilitiesToCustomers;
        @XmlElement(name = "PayableOnDemand")
        protected AmountType payableOnDemand;
        @XmlElement(name = "WithAgreedTermorPeriodNotice")
        protected AmountType withAgreedTermorPeriodNotice;
        @XmlElement(name = "RegisteredIssuedMortgageBonds")
        protected AmountType registeredIssuedMortgageBonds;
        @XmlElement(name = "RegisteredIssuedPublicSectorBonds")
        protected AmountType registeredIssuedPublicSectorBonds;
        @XmlElement(name = "DepositsFromBuildingSocietySavingsSavingDeposits")
        protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.DepositsFromBuildingSocietySavingsSavingDeposits depositsFromBuildingSocietySavingsSavingDeposits;
        @XmlElement(name = "OtherLiabilitiesToCustomer")
        protected BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.OtherLiabilitiesToCustomer otherLiabilitiesToCustomer;

        /**
         * Gets the value of the liabilitiesToCustomers property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLiabilitiesToCustomers() {
            return liabilitiesToCustomers;
        }

        /**
         * Sets the value of the liabilitiesToCustomers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLiabilitiesToCustomers(AmountType value) {
            this.liabilitiesToCustomers = value;
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
         * Gets the value of the withAgreedTermorPeriodNotice property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getWithAgreedTermorPeriodNotice() {
            return withAgreedTermorPeriodNotice;
        }

        /**
         * Sets the value of the withAgreedTermorPeriodNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setWithAgreedTermorPeriodNotice(AmountType value) {
            this.withAgreedTermorPeriodNotice = value;
        }

        /**
         * Gets the value of the registeredIssuedMortgageBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getRegisteredIssuedMortgageBonds() {
            return registeredIssuedMortgageBonds;
        }

        /**
         * Sets the value of the registeredIssuedMortgageBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setRegisteredIssuedMortgageBonds(AmountType value) {
            this.registeredIssuedMortgageBonds = value;
        }

        /**
         * Gets the value of the registeredIssuedPublicSectorBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getRegisteredIssuedPublicSectorBonds() {
            return registeredIssuedPublicSectorBonds;
        }

        /**
         * Sets the value of the registeredIssuedPublicSectorBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setRegisteredIssuedPublicSectorBonds(AmountType value) {
            this.registeredIssuedPublicSectorBonds = value;
        }

        /**
         * Gets the value of the depositsFromBuildingSocietySavingsSavingDeposits property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.DepositsFromBuildingSocietySavingsSavingDeposits }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.DepositsFromBuildingSocietySavingsSavingDeposits getDepositsFromBuildingSocietySavingsSavingDeposits() {
            return depositsFromBuildingSocietySavingsSavingDeposits;
        }

        /**
         * Sets the value of the depositsFromBuildingSocietySavingsSavingDeposits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.DepositsFromBuildingSocietySavingsSavingDeposits }
         *     
         */
        public void setDepositsFromBuildingSocietySavingsSavingDeposits(BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.DepositsFromBuildingSocietySavingsSavingDeposits value) {
            this.depositsFromBuildingSocietySavingsSavingDeposits = value;
        }

        /**
         * Gets the value of the otherLiabilitiesToCustomer property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.OtherLiabilitiesToCustomer }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.OtherLiabilitiesToCustomer getOtherLiabilitiesToCustomer() {
            return otherLiabilitiesToCustomer;
        }

        /**
         * Sets the value of the otherLiabilitiesToCustomer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.OtherLiabilitiesToCustomer }
         *     
         */
        public void setOtherLiabilitiesToCustomer(BalanceSheetDtldLiabilitiesType.LiabilitiesToCustomers.OtherLiabilitiesToCustomer value) {
            this.otherLiabilitiesToCustomer = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DepositsFromBuildingSocietySavingsSavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SavingsDeposit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="WithAgreedPeriodNotice3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="WithAgreedPeriodNoticeMoreThan3Months" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInterestBonuses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "depositsFromBuildingSocietySavingsSavingDeposits",
            "deposits",
            "savingsDeposit",
            "withAgreedPeriodNotice3Months",
            "withAgreedPeriodNoticeMoreThan3Months",
            "buildingSocietySavingDeposits",
            "ofWhichOnCancelledAgreements",
            "ofWhichOnAllocatedAgreements",
            "ofWhichInterestBonuses",
            "otherDeposits"
        })
        public static class DepositsFromBuildingSocietySavingsSavingDeposits {

            @XmlElement(name = "DepositsFromBuildingSocietySavingsSavingDeposits")
            protected AmountType depositsFromBuildingSocietySavingsSavingDeposits;
            @XmlElement(name = "Deposits")
            protected AmountType deposits;
            @XmlElement(name = "SavingsDeposit")
            protected AmountType savingsDeposit;
            @XmlElement(name = "WithAgreedPeriodNotice3Months")
            protected AmountType withAgreedPeriodNotice3Months;
            @XmlElement(name = "WithAgreedPeriodNoticeMoreThan3Months")
            protected AmountType withAgreedPeriodNoticeMoreThan3Months;
            @XmlElement(name = "BuildingSocietySavingDeposits")
            protected AmountType buildingSocietySavingDeposits;
            @XmlElement(name = "OfWhichOnCancelledAgreements")
            protected AmountType ofWhichOnCancelledAgreements;
            @XmlElement(name = "OfWhichOnAllocatedAgreements")
            protected AmountType ofWhichOnAllocatedAgreements;
            @XmlElement(name = "OfWhichInterestBonuses")
            protected AmountType ofWhichInterestBonuses;
            @XmlElement(name = "OtherDeposits")
            protected AmountType otherDeposits;

            /**
             * Gets the value of the depositsFromBuildingSocietySavingsSavingDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDepositsFromBuildingSocietySavingsSavingDeposits() {
                return depositsFromBuildingSocietySavingsSavingDeposits;
            }

            /**
             * Sets the value of the depositsFromBuildingSocietySavingsSavingDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDepositsFromBuildingSocietySavingsSavingDeposits(AmountType value) {
                this.depositsFromBuildingSocietySavingsSavingDeposits = value;
            }

            /**
             * Gets the value of the deposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDeposits() {
                return deposits;
            }

            /**
             * Sets the value of the deposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDeposits(AmountType value) {
                this.deposits = value;
            }

            /**
             * Gets the value of the savingsDeposit property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSavingsDeposit() {
                return savingsDeposit;
            }

            /**
             * Sets the value of the savingsDeposit property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSavingsDeposit(AmountType value) {
                this.savingsDeposit = value;
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
             * Gets the value of the withAgreedPeriodNoticeMoreThan3Months property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getWithAgreedPeriodNoticeMoreThan3Months() {
                return withAgreedPeriodNoticeMoreThan3Months;
            }

            /**
             * Sets the value of the withAgreedPeriodNoticeMoreThan3Months property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setWithAgreedPeriodNoticeMoreThan3Months(AmountType value) {
                this.withAgreedPeriodNoticeMoreThan3Months = value;
            }

            /**
             * Gets the value of the buildingSocietySavingDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingSocietySavingDeposits() {
                return buildingSocietySavingDeposits;
            }

            /**
             * Sets the value of the buildingSocietySavingDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingSocietySavingDeposits(AmountType value) {
                this.buildingSocietySavingDeposits = value;
            }

            /**
             * Gets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnCancelledAgreements() {
                return ofWhichOnCancelledAgreements;
            }

            /**
             * Sets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnCancelledAgreements(AmountType value) {
                this.ofWhichOnCancelledAgreements = value;
            }

            /**
             * Gets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnAllocatedAgreements() {
                return ofWhichOnAllocatedAgreements;
            }

            /**
             * Sets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnAllocatedAgreements(AmountType value) {
                this.ofWhichOnAllocatedAgreements = value;
            }

            /**
             * Gets the value of the ofWhichInterestBonuses property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInterestBonuses() {
                return ofWhichInterestBonuses;
            }

            /**
             * Sets the value of the ofWhichInterestBonuses property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInterestBonuses(AmountType value) {
                this.ofWhichInterestBonuses = value;
            }

            /**
             * Gets the value of the otherDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherDeposits() {
                return otherDeposits;
            }

            /**
             * Sets the value of the otherDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherDeposits(AmountType value) {
                this.otherDeposits = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OtherLiabilitiesToCustomer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="WithAgreedTermorPeriodNotice" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DeliveredMortgageDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DeliveredTreasuryDebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherLiabilitiesToCustomer",
            "payableOnDemand",
            "withAgreedTermorPeriodNotice",
            "deliveredMortgageDebenturesOnBearer",
            "deliveredTreasuryDebenturesOnBearer"
        })
        public static class OtherLiabilitiesToCustomer {

            @XmlElement(name = "OtherLiabilitiesToCustomer")
            protected AmountType otherLiabilitiesToCustomer;
            @XmlElement(name = "PayableOnDemand")
            protected AmountType payableOnDemand;
            @XmlElement(name = "WithAgreedTermorPeriodNotice")
            protected AmountType withAgreedTermorPeriodNotice;
            @XmlElement(name = "DeliveredMortgageDebenturesOnBearer")
            protected AmountType deliveredMortgageDebenturesOnBearer;
            @XmlElement(name = "DeliveredTreasuryDebenturesOnBearer")
            protected AmountType deliveredTreasuryDebenturesOnBearer;

            /**
             * Gets the value of the otherLiabilitiesToCustomer property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherLiabilitiesToCustomer() {
                return otherLiabilitiesToCustomer;
            }

            /**
             * Sets the value of the otherLiabilitiesToCustomer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherLiabilitiesToCustomer(AmountType value) {
                this.otherLiabilitiesToCustomer = value;
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
             * Gets the value of the withAgreedTermorPeriodNotice property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getWithAgreedTermorPeriodNotice() {
                return withAgreedTermorPeriodNotice;
            }

            /**
             * Sets the value of the withAgreedTermorPeriodNotice property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setWithAgreedTermorPeriodNotice(AmountType value) {
                this.withAgreedTermorPeriodNotice = value;
            }

            /**
             * Gets the value of the deliveredMortgageDebenturesOnBearer property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDeliveredMortgageDebenturesOnBearer() {
                return deliveredMortgageDebenturesOnBearer;
            }

            /**
             * Sets the value of the deliveredMortgageDebenturesOnBearer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDeliveredMortgageDebenturesOnBearer(AmountType value) {
                this.deliveredMortgageDebenturesOnBearer = value;
            }

            /**
             * Gets the value of the deliveredTreasuryDebenturesOnBearer property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDeliveredTreasuryDebenturesOnBearer() {
                return deliveredTreasuryDebenturesOnBearer;
            }

            /**
             * Sets the value of the deliveredTreasuryDebenturesOnBearer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDeliveredTreasuryDebenturesOnBearer(AmountType value) {
                this.deliveredTreasuryDebenturesOnBearer = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherAccruedDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesForProspectiveTaxBurden" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherAccruedDebts",
        "provisionsForPensions",
        "provisionsForTaxes",
        "reservesForProspectiveTaxBurden",
        "otherProvisions"
    })
    public static class OtherAccruedDebts {

        @XmlElement(name = "OtherAccruedDebts")
        protected AmountType otherAccruedDebts;
        @XmlElement(name = "ProvisionsForPensions")
        protected AmountType provisionsForPensions;
        @XmlElement(name = "ProvisionsForTaxes")
        protected AmountType provisionsForTaxes;
        @XmlElement(name = "ReservesForProspectiveTaxBurden")
        protected AmountType reservesForProspectiveTaxBurden;
        @XmlElement(name = "OtherProvisions")
        protected AmountType otherProvisions;

        /**
         * Gets the value of the otherAccruedDebts property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherAccruedDebts() {
            return otherAccruedDebts;
        }

        /**
         * Sets the value of the otherAccruedDebts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherAccruedDebts(AmountType value) {
            this.otherAccruedDebts = value;
        }

        /**
         * Gets the value of the provisionsForPensions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForPensions() {
            return provisionsForPensions;
        }

        /**
         * Sets the value of the provisionsForPensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForPensions(AmountType value) {
            this.provisionsForPensions = value;
        }

        /**
         * Gets the value of the provisionsForTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForTaxes() {
            return provisionsForTaxes;
        }

        /**
         * Sets the value of the provisionsForTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForTaxes(AmountType value) {
            this.provisionsForTaxes = value;
        }

        /**
         * Gets the value of the reservesForProspectiveTaxBurden property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesForProspectiveTaxBurden() {
            return reservesForProspectiveTaxBurden;
        }

        /**
         * Sets the value of the reservesForProspectiveTaxBurden property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesForProspectiveTaxBurden(AmountType value) {
            this.reservesForProspectiveTaxBurden = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherEquityFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AccumulatedProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Dividends" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TransferFromProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AppropriationToLegalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherAppropriationsNetIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherEquityFunds",
        "accumulatedProfitLoss",
        "netProfitLoss",
        "dividends",
        "transferFromProvisions",
        "appropriationToLegalReserves",
        "otherAppropriationsNetIncome"
    })
    public static class OtherEquityFunds {

        @XmlElement(name = "OtherEquityFunds")
        protected AmountType otherEquityFunds;
        @XmlElement(name = "AccumulatedProfitLoss")
        protected AmountType accumulatedProfitLoss;
        @XmlElement(name = "NetProfitLoss")
        protected AmountType netProfitLoss;
        @XmlElement(name = "Dividends")
        protected AmountType dividends;
        @XmlElement(name = "TransferFromProvisions")
        protected AmountType transferFromProvisions;
        @XmlElement(name = "AppropriationToLegalReserves")
        protected AmountType appropriationToLegalReserves;
        @XmlElement(name = "OtherAppropriationsNetIncome")
        protected AmountType otherAppropriationsNetIncome;

        /**
         * Gets the value of the otherEquityFunds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherEquityFunds() {
            return otherEquityFunds;
        }

        /**
         * Sets the value of the otherEquityFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherEquityFunds(AmountType value) {
            this.otherEquityFunds = value;
        }

        /**
         * Gets the value of the accumulatedProfitLoss property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAccumulatedProfitLoss() {
            return accumulatedProfitLoss;
        }

        /**
         * Sets the value of the accumulatedProfitLoss property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAccumulatedProfitLoss(AmountType value) {
            this.accumulatedProfitLoss = value;
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
         * Gets the value of the dividends property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDividends() {
            return dividends;
        }

        /**
         * Sets the value of the dividends property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDividends(AmountType value) {
            this.dividends = value;
        }

        /**
         * Gets the value of the transferFromProvisions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getTransferFromProvisions() {
            return transferFromProvisions;
        }

        /**
         * Sets the value of the transferFromProvisions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setTransferFromProvisions(AmountType value) {
            this.transferFromProvisions = value;
        }

        /**
         * Gets the value of the appropriationToLegalReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAppropriationToLegalReserves() {
            return appropriationToLegalReserves;
        }

        /**
         * Sets the value of the appropriationToLegalReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAppropriationToLegalReserves(AmountType value) {
            this.appropriationToLegalReserves = value;
        }

        /**
         * Gets the value of the otherAppropriationsNetIncome property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherAppropriationsNetIncome() {
            return otherAppropriationsNetIncome;
        }

        /**
         * Sets the value of the otherAppropriationsNetIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherAppropriationsNetIncome(AmountType value) {
            this.otherAppropriationsNetIncome = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherInsuranceLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AccountsPayableOnDirectInsuranceBusiness" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountsPayableOnDirectInsuranceBusinessWith" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Agent" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Agent" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountsPayableOnReinsuranceBusiness" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountsPayableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DebentureBonds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LiabilitiesToBanks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LiabilitiesToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BuildingSocietySavingDeposits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MiscellaneousLiabilities" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MiscellaneousLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherInsuranceLiabilities",
        "accountsPayableOnDirectInsuranceBusiness",
        "policyholders",
        "agent",
        "accountsPayableOnReinsuranceBusiness",
        "debentureBonds",
        "liabilitiesToBanks",
        "buildingSocietySavingDeposits",
        "miscellaneousLiabilities"
    })
    public static class OtherInsuranceLiabilities {

        @XmlElement(name = "OtherInsuranceLiabilities")
        protected AmountType otherInsuranceLiabilities;
        @XmlElement(name = "AccountsPayableOnDirectInsuranceBusiness")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnDirectInsuranceBusiness accountsPayableOnDirectInsuranceBusiness;
        @XmlElement(name = "Policyholders")
        protected AmountType policyholders;
        @XmlElement(name = "Agent")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.Agent agent;
        @XmlElement(name = "AccountsPayableOnReinsuranceBusiness")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnReinsuranceBusiness accountsPayableOnReinsuranceBusiness;
        @XmlElement(name = "DebentureBonds")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.DebentureBonds debentureBonds;
        @XmlElement(name = "LiabilitiesToBanks")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.LiabilitiesToBanks liabilitiesToBanks;
        @XmlElement(name = "BuildingSocietySavingDeposits")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.BuildingSocietySavingDeposits buildingSocietySavingDeposits;
        @XmlElement(name = "MiscellaneousLiabilities")
        protected BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.MiscellaneousLiabilities miscellaneousLiabilities;

        /**
         * Gets the value of the otherInsuranceLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherInsuranceLiabilities() {
            return otherInsuranceLiabilities;
        }

        /**
         * Sets the value of the otherInsuranceLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherInsuranceLiabilities(AmountType value) {
            this.otherInsuranceLiabilities = value;
        }

        /**
         * Gets the value of the accountsPayableOnDirectInsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnDirectInsuranceBusiness }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnDirectInsuranceBusiness getAccountsPayableOnDirectInsuranceBusiness() {
            return accountsPayableOnDirectInsuranceBusiness;
        }

        /**
         * Sets the value of the accountsPayableOnDirectInsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnDirectInsuranceBusiness }
         *     
         */
        public void setAccountsPayableOnDirectInsuranceBusiness(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnDirectInsuranceBusiness value) {
            this.accountsPayableOnDirectInsuranceBusiness = value;
        }

        /**
         * Gets the value of the policyholders property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPolicyholders() {
            return policyholders;
        }

        /**
         * Sets the value of the policyholders property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPolicyholders(AmountType value) {
            this.policyholders = value;
        }

        /**
         * Gets the value of the agent property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.Agent }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.Agent getAgent() {
            return agent;
        }

        /**
         * Sets the value of the agent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.Agent }
         *     
         */
        public void setAgent(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.Agent value) {
            this.agent = value;
        }

        /**
         * Gets the value of the accountsPayableOnReinsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnReinsuranceBusiness }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnReinsuranceBusiness getAccountsPayableOnReinsuranceBusiness() {
            return accountsPayableOnReinsuranceBusiness;
        }

        /**
         * Sets the value of the accountsPayableOnReinsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnReinsuranceBusiness }
         *     
         */
        public void setAccountsPayableOnReinsuranceBusiness(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.AccountsPayableOnReinsuranceBusiness value) {
            this.accountsPayableOnReinsuranceBusiness = value;
        }

        /**
         * Gets the value of the debentureBonds property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.DebentureBonds }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.DebentureBonds getDebentureBonds() {
            return debentureBonds;
        }

        /**
         * Sets the value of the debentureBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.DebentureBonds }
         *     
         */
        public void setDebentureBonds(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.DebentureBonds value) {
            this.debentureBonds = value;
        }

        /**
         * Gets the value of the liabilitiesToBanks property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.LiabilitiesToBanks }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.LiabilitiesToBanks getLiabilitiesToBanks() {
            return liabilitiesToBanks;
        }

        /**
         * Sets the value of the liabilitiesToBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.LiabilitiesToBanks }
         *     
         */
        public void setLiabilitiesToBanks(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.LiabilitiesToBanks value) {
            this.liabilitiesToBanks = value;
        }

        /**
         * Gets the value of the buildingSocietySavingDeposits property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.BuildingSocietySavingDeposits }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.BuildingSocietySavingDeposits getBuildingSocietySavingDeposits() {
            return buildingSocietySavingDeposits;
        }

        /**
         * Sets the value of the buildingSocietySavingDeposits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.BuildingSocietySavingDeposits }
         *     
         */
        public void setBuildingSocietySavingDeposits(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.BuildingSocietySavingDeposits value) {
            this.buildingSocietySavingDeposits = value;
        }

        /**
         * Gets the value of the miscellaneousLiabilities property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.MiscellaneousLiabilities }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.MiscellaneousLiabilities getMiscellaneousLiabilities() {
            return miscellaneousLiabilities;
        }

        /**
         * Sets the value of the miscellaneousLiabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.MiscellaneousLiabilities }
         *     
         */
        public void setMiscellaneousLiabilities(BalanceSheetDtldLiabilitiesType.OtherInsuranceLiabilities.MiscellaneousLiabilities value) {
            this.miscellaneousLiabilities = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AccountsPayableOnDirectInsuranceBusinessWith" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accountsPayableOnDirectInsuranceBusinessWith",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class AccountsPayableOnDirectInsuranceBusiness {

            @XmlElement(name = "AccountsPayableOnDirectInsuranceBusinessWith")
            protected AmountType accountsPayableOnDirectInsuranceBusinessWith;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the accountsPayableOnDirectInsuranceBusinessWith property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAccountsPayableOnDirectInsuranceBusinessWith() {
                return accountsPayableOnDirectInsuranceBusinessWith;
            }

            /**
             * Sets the value of the accountsPayableOnDirectInsuranceBusinessWith property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAccountsPayableOnDirectInsuranceBusinessWith(AmountType value) {
                this.accountsPayableOnDirectInsuranceBusinessWith = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInCompaniesWithExistingDistributionOfOwnership() {
                return ofWhichInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.ofWhichInCompaniesWithExistingDistributionOfOwnership = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AccountsPayableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accountsPayableOnReinsuranceBusiness",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class AccountsPayableOnReinsuranceBusiness {

            @XmlElement(name = "AccountsPayableOnReinsuranceBusiness")
            protected AmountType accountsPayableOnReinsuranceBusiness;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the accountsPayableOnReinsuranceBusiness property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAccountsPayableOnReinsuranceBusiness() {
                return accountsPayableOnReinsuranceBusiness;
            }

            /**
             * Sets the value of the accountsPayableOnReinsuranceBusiness property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAccountsPayableOnReinsuranceBusiness(AmountType value) {
                this.accountsPayableOnReinsuranceBusiness = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInCompaniesWithExistingDistributionOfOwnership() {
                return ofWhichInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.ofWhichInCompaniesWithExistingDistributionOfOwnership = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Agent" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "agent",
            "ofWhichInAffiliatedCompanies",
            "memberAndBearerOfTheCompanies"
        })
        public static class Agent {

            @XmlElement(name = "Agent")
            protected AmountType agent;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "MemberAndBearerOfTheCompanies")
            protected AmountType memberAndBearerOfTheCompanies;

            /**
             * Gets the value of the agent property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAgent() {
                return agent;
            }

            /**
             * Sets the value of the agent property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAgent(AmountType value) {
                this.agent = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the memberAndBearerOfTheCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getMemberAndBearerOfTheCompanies() {
                return memberAndBearerOfTheCompanies;
            }

            /**
             * Sets the value of the memberAndBearerOfTheCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setMemberAndBearerOfTheCompanies(AmountType value) {
                this.memberAndBearerOfTheCompanies = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BuildingSocietySavingDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnCancelledAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichOnAllocatedAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "buildingSocietySavingDeposits",
            "ofWhichOnCancelledAgreements",
            "ofWhichOnAllocatedAgreements"
        })
        public static class BuildingSocietySavingDeposits {

            @XmlElement(name = "BuildingSocietySavingDeposits")
            protected AmountType buildingSocietySavingDeposits;
            @XmlElement(name = "OfWhichOnCancelledAgreements")
            protected AmountType ofWhichOnCancelledAgreements;
            @XmlElement(name = "OfWhichOnAllocatedAgreements")
            protected AmountType ofWhichOnAllocatedAgreements;

            /**
             * Gets the value of the buildingSocietySavingDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingSocietySavingDeposits() {
                return buildingSocietySavingDeposits;
            }

            /**
             * Sets the value of the buildingSocietySavingDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingSocietySavingDeposits(AmountType value) {
                this.buildingSocietySavingDeposits = value;
            }

            /**
             * Gets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnCancelledAgreements() {
                return ofWhichOnCancelledAgreements;
            }

            /**
             * Sets the value of the ofWhichOnCancelledAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnCancelledAgreements(AmountType value) {
                this.ofWhichOnCancelledAgreements = value;
            }

            /**
             * Gets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichOnAllocatedAgreements() {
                return ofWhichOnAllocatedAgreements;
            }

            /**
             * Sets the value of the ofWhichOnAllocatedAgreements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichOnAllocatedAgreements(AmountType value) {
                this.ofWhichOnAllocatedAgreements = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "debentureBonds",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class DebentureBonds {

            @XmlElement(name = "DebentureBonds")
            protected AmountType debentureBonds;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the debentureBonds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDebentureBonds() {
                return debentureBonds;
            }

            /**
             * Sets the value of the debentureBonds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDebentureBonds(AmountType value) {
                this.debentureBonds = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInCompaniesWithExistingDistributionOfOwnership() {
                return ofWhichInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.ofWhichInCompaniesWithExistingDistributionOfOwnership = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="LiabilitiesToBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "liabilitiesToBanks",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class LiabilitiesToBanks {

            @XmlElement(name = "LiabilitiesToBanks")
            protected AmountType liabilitiesToBanks;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the liabilitiesToBanks property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLiabilitiesToBanks() {
                return liabilitiesToBanks;
            }

            /**
             * Sets the value of the liabilitiesToBanks property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLiabilitiesToBanks(AmountType value) {
                this.liabilitiesToBanks = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInCompaniesWithExistingDistributionOfOwnership() {
                return ofWhichInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.ofWhichInCompaniesWithExistingDistributionOfOwnership = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="MiscellaneousLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "miscellaneousLiabilities",
            "ofWhichTaxes",
            "ofWhichSocialSecurity",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class MiscellaneousLiabilities {

            @XmlElement(name = "MiscellaneousLiabilities")
            protected AmountType miscellaneousLiabilities;
            @XmlElement(name = "OfWhichTaxes")
            protected AmountType ofWhichTaxes;
            @XmlElement(name = "OfWhichSocialSecurity")
            protected AmountType ofWhichSocialSecurity;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

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
             * Gets the value of the ofWhichTaxes property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichTaxes() {
                return ofWhichTaxes;
            }

            /**
             * Sets the value of the ofWhichTaxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichTaxes(AmountType value) {
                this.ofWhichTaxes = value;
            }

            /**
             * Gets the value of the ofWhichSocialSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichSocialSecurity() {
                return ofWhichSocialSecurity;
            }

            /**
             * Sets the value of the ofWhichSocialSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichSocialSecurity(AmountType value) {
                this.ofWhichSocialSecurity = value;
            }

            /**
             * Gets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInAffiliatedCompanies() {
                return ofWhichInAffiliatedCompanies;
            }

            /**
             * Sets the value of the ofWhichInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInAffiliatedCompanies(AmountType value) {
                this.ofWhichInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichInCompaniesWithExistingDistributionOfOwnership() {
                return ofWhichInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the ofWhichInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.ofWhichInCompaniesWithExistingDistributionOfOwnership = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForDeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ProvisionsForBuildingMaintenance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Provisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "provisionsForPensions",
        "provisionsForTaxes",
        "provisionsForDeferredTaxes",
        "provisionsForBuildingMaintenance",
        "otherProvisions",
        "provisions"
    })
    public static class Provisions {

        @XmlElement(name = "ProvisionsForPensions")
        protected AmountType provisionsForPensions;
        @XmlElement(name = "ProvisionsForTaxes")
        protected AmountType provisionsForTaxes;
        @XmlElement(name = "ProvisionsForDeferredTaxes")
        protected AmountType provisionsForDeferredTaxes;
        @XmlElement(name = "ProvisionsForBuildingMaintenance")
        protected AmountType provisionsForBuildingMaintenance;
        @XmlElement(name = "OtherProvisions")
        protected AmountType otherProvisions;
        @XmlElement(name = "Provisions")
        protected AmountType provisions;

        /**
         * Gets the value of the provisionsForPensions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForPensions() {
            return provisionsForPensions;
        }

        /**
         * Sets the value of the provisionsForPensions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForPensions(AmountType value) {
            this.provisionsForPensions = value;
        }

        /**
         * Gets the value of the provisionsForTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForTaxes() {
            return provisionsForTaxes;
        }

        /**
         * Sets the value of the provisionsForTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForTaxes(AmountType value) {
            this.provisionsForTaxes = value;
        }

        /**
         * Gets the value of the provisionsForDeferredTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForDeferredTaxes() {
            return provisionsForDeferredTaxes;
        }

        /**
         * Sets the value of the provisionsForDeferredTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForDeferredTaxes(AmountType value) {
            this.provisionsForDeferredTaxes = value;
        }

        /**
         * Gets the value of the provisionsForBuildingMaintenance property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisionsForBuildingMaintenance() {
            return provisionsForBuildingMaintenance;
        }

        /**
         * Sets the value of the provisionsForBuildingMaintenance property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisionsForBuildingMaintenance(AmountType value) {
            this.provisionsForBuildingMaintenance = value;
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
         * Gets the value of the provisions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getProvisions() {
            return provisions;
        }

        /**
         * Sets the value of the provisions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setProvisions(AmountType value) {
            this.provisions = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RetainedIncomeReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LegalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ContingencyReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReservesForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MiscellaneousReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PurposeReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LossReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherEarningReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "retainedIncomeReserves",
        "legalReserve",
        "contingencyReserve",
        "reservesForOwnShares",
        "miscellaneousReserves",
        "purposeReserve",
        "lossReserve",
        "otherEarningReserves"
    })
    public static class RetainedIncomeReserves {

        @XmlElement(name = "RetainedIncomeReserves")
        protected AmountType retainedIncomeReserves;
        @XmlElement(name = "LegalReserve")
        protected AmountType legalReserve;
        @XmlElement(name = "ContingencyReserve")
        protected AmountType contingencyReserve;
        @XmlElement(name = "ReservesForOwnShares")
        protected AmountType reservesForOwnShares;
        @XmlElement(name = "MiscellaneousReserves")
        protected AmountType miscellaneousReserves;
        @XmlElement(name = "PurposeReserve")
        protected AmountType purposeReserve;
        @XmlElement(name = "LossReserve")
        protected AmountType lossReserve;
        @XmlElement(name = "OtherEarningReserves")
        protected AmountType otherEarningReserves;

        /**
         * Gets the value of the retainedIncomeReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getRetainedIncomeReserves() {
            return retainedIncomeReserves;
        }

        /**
         * Sets the value of the retainedIncomeReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setRetainedIncomeReserves(AmountType value) {
            this.retainedIncomeReserves = value;
        }

        /**
         * Gets the value of the legalReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLegalReserve() {
            return legalReserve;
        }

        /**
         * Sets the value of the legalReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLegalReserve(AmountType value) {
            this.legalReserve = value;
        }

        /**
         * Gets the value of the contingencyReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getContingencyReserve() {
            return contingencyReserve;
        }

        /**
         * Sets the value of the contingencyReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setContingencyReserve(AmountType value) {
            this.contingencyReserve = value;
        }

        /**
         * Gets the value of the reservesForOwnShares property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReservesForOwnShares() {
            return reservesForOwnShares;
        }

        /**
         * Sets the value of the reservesForOwnShares property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReservesForOwnShares(AmountType value) {
            this.reservesForOwnShares = value;
        }

        /**
         * Gets the value of the miscellaneousReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMiscellaneousReserves() {
            return miscellaneousReserves;
        }

        /**
         * Sets the value of the miscellaneousReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMiscellaneousReserves(AmountType value) {
            this.miscellaneousReserves = value;
        }

        /**
         * Gets the value of the purposeReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPurposeReserve() {
            return purposeReserve;
        }

        /**
         * Sets the value of the purposeReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPurposeReserve(AmountType value) {
            this.purposeReserve = value;
        }

        /**
         * Gets the value of the lossReserve property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLossReserve() {
            return lossReserve;
        }

        /**
         * Sets the value of the lossReserve property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLossReserve(AmountType value) {
            this.lossReserve = value;
        }

        /**
         * Gets the value of the otherEarningReserves property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherEarningReserves() {
            return otherEarningReserves;
        }

        /**
         * Sets the value of the otherEarningReserves property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherEarningReserves(AmountType value) {
            this.otherEarningReserves = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RetainedProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AccumulatedIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NetBookValueStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TransferFromProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NetProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "retainedProfitLoss",
        "accumulatedIncome",
        "netBookValueStartYear",
        "transferFromProvisions",
        "netProfitLoss"
    })
    public static class RetainedProfitLoss {

        @XmlElement(name = "RetainedProfitLoss")
        protected AmountType retainedProfitLoss;
        @XmlElement(name = "AccumulatedIncome")
        protected AmountType accumulatedIncome;
        @XmlElement(name = "NetBookValueStartYear")
        protected AmountType netBookValueStartYear;
        @XmlElement(name = "TransferFromProvisions")
        protected AmountType transferFromProvisions;
        @XmlElement(name = "NetProfitLoss")
        protected AmountType netProfitLoss;

        /**
         * Gets the value of the retainedProfitLoss property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getRetainedProfitLoss() {
            return retainedProfitLoss;
        }

        /**
         * Sets the value of the retainedProfitLoss property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setRetainedProfitLoss(AmountType value) {
            this.retainedProfitLoss = value;
        }

        /**
         * Gets the value of the accumulatedIncome property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAccumulatedIncome() {
            return accumulatedIncome;
        }

        /**
         * Sets the value of the accumulatedIncome property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAccumulatedIncome(AmountType value) {
            this.accumulatedIncome = value;
        }

        /**
         * Gets the value of the netBookValueStartYear property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getNetBookValueStartYear() {
            return netBookValueStartYear;
        }

        /**
         * Sets the value of the netBookValueStartYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setNetBookValueStartYear(AmountType value) {
            this.netBookValueStartYear = value;
        }

        /**
         * Gets the value of the transferFromProvisions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getTransferFromProvisions() {
            return transferFromProvisions;
        }

        /**
         * Sets the value of the transferFromProvisions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setTransferFromProvisions(AmountType value) {
            this.transferFromProvisions = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShareholdersLoan" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfUnlimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shareholdersLoan",
        "ofUnlimitedPartner",
        "ofLimitedPartner"
    })
    public static class ShareholdersLoan {

        @XmlElement(name = "ShareholdersLoan")
        protected AmountType shareholdersLoan;
        @XmlElement(name = "OfUnlimitedPartner")
        protected AmountType ofUnlimitedPartner;
        @XmlElement(name = "OfLimitedPartner")
        protected AmountType ofLimitedPartner;

        /**
         * Gets the value of the shareholdersLoan property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getShareholdersLoan() {
            return shareholdersLoan;
        }

        /**
         * Sets the value of the shareholdersLoan property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setShareholdersLoan(AmountType value) {
            this.shareholdersLoan = value;
        }

        /**
         * Gets the value of the ofUnlimitedPartner property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfUnlimitedPartner() {
            return ofUnlimitedPartner;
        }

        /**
         * Sets the value of the ofUnlimitedPartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfUnlimitedPartner(AmountType value) {
            this.ofUnlimitedPartner = value;
        }

        /**
         * Gets the value of the ofLimitedPartner property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfLimitedPartner() {
            return ofLimitedPartner;
        }

        /**
         * Sets the value of the ofLimitedPartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfLimitedPartner(AmountType value) {
            this.ofLimitedPartner = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SharesOfCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="UnlimitedPartner" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnlimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="CapitalBroughtIn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LimitedPartner" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BondageCapitalLimitedLiabilityCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DistributionsOfLiquidity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sharesOfCapital",
        "unlimitedPartner",
        "limitedPartner"
    })
    public static class SharesOfCapital {

        @XmlElement(name = "SharesOfCapital")
        protected AmountType sharesOfCapital;
        @XmlElement(name = "UnlimitedPartner")
        protected BalanceSheetDtldLiabilitiesType.SharesOfCapital.UnlimitedPartner unlimitedPartner;
        @XmlElement(name = "LimitedPartner")
        protected BalanceSheetDtldLiabilitiesType.SharesOfCapital.LimitedPartner limitedPartner;

        /**
         * Gets the value of the sharesOfCapital property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSharesOfCapital() {
            return sharesOfCapital;
        }

        /**
         * Sets the value of the sharesOfCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSharesOfCapital(AmountType value) {
            this.sharesOfCapital = value;
        }

        /**
         * Gets the value of the unlimitedPartner property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital.UnlimitedPartner }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.SharesOfCapital.UnlimitedPartner getUnlimitedPartner() {
            return unlimitedPartner;
        }

        /**
         * Sets the value of the unlimitedPartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital.UnlimitedPartner }
         *     
         */
        public void setUnlimitedPartner(BalanceSheetDtldLiabilitiesType.SharesOfCapital.UnlimitedPartner value) {
            this.unlimitedPartner = value;
        }

        /**
         * Gets the value of the limitedPartner property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital.LimitedPartner }
         *     
         */
        public BalanceSheetDtldLiabilitiesType.SharesOfCapital.LimitedPartner getLimitedPartner() {
            return limitedPartner;
        }

        /**
         * Sets the value of the limitedPartner property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldLiabilitiesType.SharesOfCapital.LimitedPartner }
         *     
         */
        public void setLimitedPartner(BalanceSheetDtldLiabilitiesType.SharesOfCapital.LimitedPartner value) {
            this.limitedPartner = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OfLimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BondageCapitalLimitedLiabilityCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DistributionsOfLiquidity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ofLimitedPartner",
            "bondageCapitalLimitedLiabilityCapital",
            "otherDeposits",
            "distributionsOfLiquidity",
            "allocationAccountsAppropriationAllocation",
            "otherAppropriationsAllocations",
            "sharesOfLossProfit",
            "coveredSharesOfLossThroughCapitalDeposits"
        })
        public static class LimitedPartner {

            @XmlElement(name = "OfLimitedPartner")
            protected AmountType ofLimitedPartner;
            @XmlElement(name = "BondageCapitalLimitedLiabilityCapital")
            protected AmountType bondageCapitalLimitedLiabilityCapital;
            @XmlElement(name = "OtherDeposits")
            protected AmountType otherDeposits;
            @XmlElement(name = "DistributionsOfLiquidity")
            protected AmountType distributionsOfLiquidity;
            @XmlElement(name = "AllocationAccountsAppropriationAllocation")
            protected AmountType allocationAccountsAppropriationAllocation;
            @XmlElement(name = "OtherAppropriationsAllocations")
            protected AmountType otherAppropriationsAllocations;
            @XmlElement(name = "SharesOfLossProfit")
            protected AmountType sharesOfLossProfit;
            @XmlElement(name = "CoveredSharesOfLossThroughCapitalDeposits")
            protected AmountType coveredSharesOfLossThroughCapitalDeposits;

            /**
             * Gets the value of the ofLimitedPartner property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfLimitedPartner() {
                return ofLimitedPartner;
            }

            /**
             * Sets the value of the ofLimitedPartner property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfLimitedPartner(AmountType value) {
                this.ofLimitedPartner = value;
            }

            /**
             * Gets the value of the bondageCapitalLimitedLiabilityCapital property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBondageCapitalLimitedLiabilityCapital() {
                return bondageCapitalLimitedLiabilityCapital;
            }

            /**
             * Sets the value of the bondageCapitalLimitedLiabilityCapital property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBondageCapitalLimitedLiabilityCapital(AmountType value) {
                this.bondageCapitalLimitedLiabilityCapital = value;
            }

            /**
             * Gets the value of the otherDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherDeposits() {
                return otherDeposits;
            }

            /**
             * Sets the value of the otherDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherDeposits(AmountType value) {
                this.otherDeposits = value;
            }

            /**
             * Gets the value of the distributionsOfLiquidity property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDistributionsOfLiquidity() {
                return distributionsOfLiquidity;
            }

            /**
             * Sets the value of the distributionsOfLiquidity property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDistributionsOfLiquidity(AmountType value) {
                this.distributionsOfLiquidity = value;
            }

            /**
             * Gets the value of the allocationAccountsAppropriationAllocation property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAllocationAccountsAppropriationAllocation() {
                return allocationAccountsAppropriationAllocation;
            }

            /**
             * Sets the value of the allocationAccountsAppropriationAllocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAllocationAccountsAppropriationAllocation(AmountType value) {
                this.allocationAccountsAppropriationAllocation = value;
            }

            /**
             * Gets the value of the otherAppropriationsAllocations property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherAppropriationsAllocations() {
                return otherAppropriationsAllocations;
            }

            /**
             * Sets the value of the otherAppropriationsAllocations property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherAppropriationsAllocations(AmountType value) {
                this.otherAppropriationsAllocations = value;
            }

            /**
             * Gets the value of the sharesOfLossProfit property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSharesOfLossProfit() {
                return sharesOfLossProfit;
            }

            /**
             * Sets the value of the sharesOfLossProfit property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSharesOfLossProfit(AmountType value) {
                this.sharesOfLossProfit = value;
            }

            /**
             * Gets the value of the coveredSharesOfLossThroughCapitalDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getCoveredSharesOfLossThroughCapitalDeposits() {
                return coveredSharesOfLossThroughCapitalDeposits;
            }

            /**
             * Sets the value of the coveredSharesOfLossThroughCapitalDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setCoveredSharesOfLossThroughCapitalDeposits(AmountType value) {
                this.coveredSharesOfLossThroughCapitalDeposits = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="UnlimitedPartner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="CapitalBroughtIn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="AllocationAccountsAppropriationAllocation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherAppropriationsAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SharesOfLossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="CoveredSharesOfLossThroughCapitalDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "unlimitedPartner",
            "capitalBroughtIn",
            "otherDeposits",
            "allocationAccountsAppropriationAllocation",
            "otherAppropriationsAllocations",
            "sharesOfLossProfit",
            "coveredSharesOfLossThroughCapitalDeposits"
        })
        public static class UnlimitedPartner {

            @XmlElement(name = "UnlimitedPartner")
            protected AmountType unlimitedPartner;
            @XmlElement(name = "CapitalBroughtIn")
            protected AmountType capitalBroughtIn;
            @XmlElement(name = "OtherDeposits")
            protected AmountType otherDeposits;
            @XmlElement(name = "AllocationAccountsAppropriationAllocation")
            protected AmountType allocationAccountsAppropriationAllocation;
            @XmlElement(name = "OtherAppropriationsAllocations")
            protected AmountType otherAppropriationsAllocations;
            @XmlElement(name = "SharesOfLossProfit")
            protected AmountType sharesOfLossProfit;
            @XmlElement(name = "CoveredSharesOfLossThroughCapitalDeposits")
            protected AmountType coveredSharesOfLossThroughCapitalDeposits;

            /**
             * Gets the value of the unlimitedPartner property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getUnlimitedPartner() {
                return unlimitedPartner;
            }

            /**
             * Sets the value of the unlimitedPartner property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setUnlimitedPartner(AmountType value) {
                this.unlimitedPartner = value;
            }

            /**
             * Gets the value of the capitalBroughtIn property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getCapitalBroughtIn() {
                return capitalBroughtIn;
            }

            /**
             * Sets the value of the capitalBroughtIn property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setCapitalBroughtIn(AmountType value) {
                this.capitalBroughtIn = value;
            }

            /**
             * Gets the value of the otherDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherDeposits() {
                return otherDeposits;
            }

            /**
             * Sets the value of the otherDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherDeposits(AmountType value) {
                this.otherDeposits = value;
            }

            /**
             * Gets the value of the allocationAccountsAppropriationAllocation property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAllocationAccountsAppropriationAllocation() {
                return allocationAccountsAppropriationAllocation;
            }

            /**
             * Sets the value of the allocationAccountsAppropriationAllocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAllocationAccountsAppropriationAllocation(AmountType value) {
                this.allocationAccountsAppropriationAllocation = value;
            }

            /**
             * Gets the value of the otherAppropriationsAllocations property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherAppropriationsAllocations() {
                return otherAppropriationsAllocations;
            }

            /**
             * Sets the value of the otherAppropriationsAllocations property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherAppropriationsAllocations(AmountType value) {
                this.otherAppropriationsAllocations = value;
            }

            /**
             * Gets the value of the sharesOfLossProfit property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSharesOfLossProfit() {
                return sharesOfLossProfit;
            }

            /**
             * Sets the value of the sharesOfLossProfit property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSharesOfLossProfit(AmountType value) {
                this.sharesOfLossProfit = value;
            }

            /**
             * Gets the value of the coveredSharesOfLossThroughCapitalDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getCoveredSharesOfLossThroughCapitalDeposits() {
                return coveredSharesOfLossThroughCapitalDeposits;
            }

            /**
             * Sets the value of the coveredSharesOfLossThroughCapitalDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setCoveredSharesOfLossThroughCapitalDeposits(AmountType value) {
                this.coveredSharesOfLossThroughCapitalDeposits = value;
            }

        }

    }

}
