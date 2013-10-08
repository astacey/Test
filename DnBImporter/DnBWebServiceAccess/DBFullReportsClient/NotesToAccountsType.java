
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotesToAccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotesToAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectorsRemuneration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StaffCosts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Depreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditorsRemuneration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditFee" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditorsRemunerationNonAuditFees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RemunerationChairman" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="HighestPaidDirector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OperatingLeaseCommitmentsPlantMachinery" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OperatingLeaseCommitmentsLandBuilding" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalOperatingLeaseCommitments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ContingentDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MarketValuePensionSchemeAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AveragePaymentTimeDays" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConsolidatedSubsidiariesQuantity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MemorandumAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedAssetsDepreciationLiability" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuaranteesGiven" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Sureties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Endorsements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPersonalGuarantess" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Collaterals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuaranteesReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPersonalGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuaranteesGivenByThirdPartiesInTheInterestOfTheCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Commitments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SecuritiesLodgedWithThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherMemorandumAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AcquisitionsFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcquisitionsFromThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Additions" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdjustmentsToAmountsWrittenOff" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvancesReceivedOnContractsinProgressPayableOver5Years" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountsReceivableOther" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountsReceivableSubordinated" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillsExchangePayable" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Cancelled" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChargeForYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Deductions" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeductionsEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DeductionsStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepreciationSimilarChargesEndPreviousYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DepreciationSimilarChargesEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssetsForPensionFundsManagedOnBehalfOfThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FinancialLeasingAgreements" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LeasingOtherSimilarObligations" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MovementsForYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetBookValueStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NetValueEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OtherMovements" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecordedForYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Reimbursements" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevaluationSurplusesEndPreviousYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevaluationSurplusesEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesDisposals" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Suppliers" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransfersBetweenItems" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UncalledAmountsEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UncalledAmountsStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UnsubordinatedDebentures" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueAcquisitionsEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ValueAcquisitionsStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VATTurnoverTaxSpecialTaxChargedbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VATTurnoverTaxSpecialTaxChargedToCompany" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WithinOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccumulatedDeductionsEndOfYear" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AmountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemunerationSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemunerationSpecialAssignmentsOtherAssignments" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemunerationSpecialAssignmentsOtherCommands" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemunerationSpecialAssignmentsOtherControleopdarchten" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemunerationSpecialAssignmentsTaxConsultancy" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shares" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubordinatedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewExpensesIncurred" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FormationCapitalIncreaseLoanIssueExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalizedInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReorganizationCosts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepreciationSimilarChargesStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantMachineryEquipments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureVehicles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ExchangeDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IssuedCapitalStartYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IssuedCapitalEndYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NumberRegisteredSharesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberBearerSharesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="UncalledUnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CalledUnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountOwnSharesHeldbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NumberOwnSharesHeldbyCompanyQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ValueSubjectsSharesHeldbySubsidiaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NumberSubjectsSharesHeldbySubsidiariesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AmountOutstandingConvertibleLoansUnderConversionRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountCapitalToBeSubscribedUnderConversionRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumNumberSharesToBeIssuedUnderConversionRightsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberOutstandingSubscriptionRightsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AmountCapitalToBeSubscribedUnderSubscriptionRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AuthorizedCapitalNotIssued" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NumberSharesIssuedNotRepresentingCapitalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberSharesHeldbyCompanyExcludedFromCapitalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FinancialLongTermDebtsPayableinYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermTradeDebtsPayableinYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermAdvancesReceivedOnContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLongTermAmountsPayableinYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermDebtsPayableinYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialDebtsPayableBetween15Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtsPayableBetween15Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAmountsPayableOver5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalDebtsPayableOver5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtsGuaranteedbyBLPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAmountsPayableGuaranteedbyBLPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalGuaranteedbyBLPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialDebtsGuaranteedOnCompanysAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAmountsPayableGuaranteedOnCompanysAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalGuaranteedOnCompanysAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsDueToTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsNotDueToTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedTaxLiability" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountDueToNationalOfficeSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAmountsPayableForRemunerationSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GrossProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountSubsidiesCompensationFromPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Membership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Gifts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Legacies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalInterestSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageNumberEmployedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberWorkersQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberManagementQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberOtherEmployedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalNumberEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AverageNumberEmployeesinFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursEmployQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="RemunerationDirectSocialBenefits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployersContributionForSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployersPremiumForExtraStatutoryInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPersonnelCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Pensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsWrittenOffStocksContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentsToDeductionsFromStocksContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsWrittenOffTradeDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentsToDeductionsFromTradeDebtors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncreaseProvisionsForLiabilitiesCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UsedWrittenBackProvisionsForLiabilitiesCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesOnOperations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotNumberTempPersonPlacedDisposalCompanyQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AvNumberTempEmployeesinFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursTemporaryPersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ChargesToCompanyForTemporaryPersonnel" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalSubsidiesCreditedForIncomeDuringYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterestSubsidiesCreditedForIncomeDuringYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeFromExchangeTransferDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeFromExchangeDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeFromTransferDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepreciationCostsIssueLoansDiscount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterestCreditedForAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeductionsFromCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentsToDeductionsFromCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DiscountsNegotiatedOnAmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialProvisionsCreated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialProvisionsUsedorWithdrawn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialProvisionsCreatedUsedorWithdrawn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargesFromExchangeTransferDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargesFromExchangeDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ChargesFromTransferDifferences" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeTaxForCurrentYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxDeferredTaxDueorPaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcessPrepaidDeferredTaxIncludedinAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedAdditionalChargesForIncomeTax" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeTaxForPriorYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalChargesForIncomeTaxDueorPaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedAdditionalChargesForIncomeTaxForPriorYears" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ActiveSourcesPossibleFutureTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedTaxLossesDeductibleFromFutureProfits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PassiveSourcesPossibleFutureTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsHeldForThirdPartiesForDeferredTaxOnPayroll" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsHeldForThirdPartiesForDeferredTaxOnInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PersonalGuaranteesGivenbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BillsExchangeEndorsedbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealGuaranteesGivenbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherThirdPartyDebtsGuaranteedbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaximumAmountForWhichThirdPartyDebtsAreGuaranteed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetValuePropertySecuredUnderMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountMortgagesRegistered" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountBusinessGuaranteesRegistered" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetValueOtherAssetsSecuredUnderGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountFutureAssetsSecuredUnderGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetValuePropertySecuredUnderThirdPartyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountThirdPartyMortgagesRegistered" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmountThirdPartyGuaranteesRegistered" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetValueOtherAssetsSecuredUnderThirdPartyGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountFutureAssetsSecuredUnderThirdPartyGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StockPurchased" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StockSold" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrenciesPurchased" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrenciesSold" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GroupCompaniesFinancialFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsCommitmentsGuaranteedbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsCommitmentsGuaranteedOnBehalfGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsCommitmentsCompanyGuaranteed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialCommitments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCommitmentsOnBehalfGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcessRevaluationOnDisposalFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcessDevaluationOnDisposalFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonGroupCompaniesFinancialFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DisposalFixedAssetsRevaluationSurplusesIssued" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DevaluationSurplusesIssued" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PensionsFundedbyCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromDirectorsLessThanOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuaranteesGivenOnBehalfDirectors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherSignificantCommitmentsUndertakeninFavorDirectors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DirectIndirectRemunerationPensionsToDirectors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DirectIndirectRemunerationPensionsToFormerDirectors" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WorkingCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditorFeesExceptionalOther" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditorFeesExceptionalTax" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AuditorFeesExceptionalGroup" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAuditAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MissionTaxAdviceAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssignOutsideAuditingAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetCashInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AddedValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BalanceDeductionsAdjustmentsToDeductions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetAmountDepreciationSimilarChargesOnFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnnegotiatedAcceptances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GuaranteesForCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherGuarantees" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DocumentaryCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MortgageGuaranteesForThirds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PotentialCreditRiskLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedFundEngagements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondPurchaseEngagements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvailableCreditLineMargin" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondPurchaseSaleEngagements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CessionRetrocessionEngagements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ValuesCreditBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ValuesUnderFiduciary" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OpenDepositsSimilar" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesToBePaidUp" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AveragePersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LabourersQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ClerksQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StaffPersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OthersQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PersonnelExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WagesSocialAdvantages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployersSocialSecurityPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployersPremiumsExtraLegalAdvantages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCostsPersonnel" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransfersTo" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransfersFrom" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FiscalSocialDebtsVersusTaxAdministration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OutstandingFiscSocialDebtsVersusSocialSecurityAdmin" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedFiscalDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivFromDirectManagOtherControllingNonAffiliatCies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtsinFavourDirectrsManagOthControlNonAffiliatedCies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OthSignEngagmInFavrDirecManagOthControlNonAffilCies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalGuarantAmntPartDebtsCieOtherThenTechnRes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ComGuarantSuppliedorIrrevocPromisedbyCie" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ComPrivGuarantSuppliedbyAffiliatedCies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OthersSupplyingGuarantInChargeCie" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalComPrivGuarSupplAsGuarantForDebtsForThirds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AffiliatedCompaniesSubsidiariesSubSubsidiaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCompaniesWithAffiliation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DirectorsorManagers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Others" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FiscalAdministration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SocialSecurityAdministration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AverageNumberPersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalWagesPensionsOtherPersonnelExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Wages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDirectSocialAdvantages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployersSocialSecPremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPersonnelExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncreaseProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DecreaseProvisionsForPensions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncreaseProvisionsForOtherWagesSocExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DecreaseProvisionsForOtherWagesSocExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotWagesPensionsForExDirectorsManagersEtc" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalDistributionTaxesOnResultForPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalTaxesOnResult" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaidPrepaidTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OnAssetsBookedOverPaidTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionsForTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalRegularisationsWithdrawals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RegularisationsTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WithdrawalOnFiscalProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildingsFullyOwned" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildingsOther" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantMachineryEquipmentFullyOwned" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantMachineryEquipmentOther" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureVehiclesFullyOwned" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureVehiclesOther" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssetsFullyOwned" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssetsOther" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermOtherReceivablesNoOrAbnormallyLowInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShortTermOtherReceivablesNoOrAbnormallyLowInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancesReceivedOnContractsGuaranteedByPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancesReceivedOnContractsGuaranteedOnCompaniesAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BookValueAccumulatedOfTheUncalledAmounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BookValueFinancialFixedAssetsEndOfThePreceedingYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BookValueFinancialFixedAssetsEndOfTheYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialChargesOnDebts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialDebtsGuaranteedByPublicAuthorities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialDebtsPayableOver5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedIncomeSecuritiesIssuedByFinancialInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Fundsforasocialliabilitytocover" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureRollingEquipmentInfullownershipoftheassociation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeFromCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncomeFromFinancialFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildingsInfullownershipoftheassociation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MissionstaxadvicecarriedoutbypersonsconnectedwithCommissioner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MovementsInFinancialFixedAssetsForTheYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAuditscarriedoutbypersonsconnectedwithCommissioner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherMissionsConnectedwithCommissioner" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherOperatingCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OthertangiblefixedassetsInfullownershipoftheassociation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantmachineryequipmentInthepropertyoftheassociation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Remunerationscommissaryforextraordinactivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResidualTermOrNoticeOfWithdrawalBetween1Month1Year" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResidualTermOrNoticeOfWithdrawalLessOrEqualTo1Month" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResidualTermOrNoticeOfWithdrawalOver1Year" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesMembershipGiftsLegaciesSubsidiesotheroperIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxRemunerationSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxesRemunerationSocialSecurity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TermAccountsWithFinancialInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtsGuaranteedOnTheCompanyAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDebtsPayableOver5Years" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UncalledAmounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotesToAccountsType", propOrder = {
    "directorsRemuneration",
    "employeesQuantity",
    "staffCosts",
    "depreciation",
    "auditorsRemuneration",
    "auditFee",
    "auditorsRemunerationNonAuditFees",
    "remunerationChairman",
    "highestPaidDirector",
    "operatingLeaseCommitmentsPlantMachinery",
    "operatingLeaseCommitmentsLandBuilding",
    "totalOperatingLeaseCommitments",
    "contingentDebts",
    "marketValuePensionSchemeAssets",
    "averagePaymentTimeDays",
    "consolidatedSubsidiariesQuantity",
    "memorandumAccounts",
    "fixedAssetsDepreciationLiability",
    "guaranteesGiven",
    "sureties",
    "endorsements",
    "otherPersonalGuarantess",
    "collaterals",
    "guaranteesReceived",
    "otherPersonalGuarantees",
    "guaranteesGivenByThirdPartiesInTheInterestOfTheCompany",
    "commitments",
    "thirdPartyAssets",
    "securitiesLodgedWithThirdParties",
    "otherMemorandumAccounts",
    "acquisitionsFixedAssets",
    "acquisitionsFromThirdParties",
    "additions",
    "adjustmentsToAmountsWrittenOff",
    "advancesReceivedOnContractsinProgressPayableOver5Years",
    "afterOneYear",
    "amountsReceivable",
    "amountsReceivableOther",
    "amountsReceivableSubordinated",
    "billsExchangePayable",
    "cancelled",
    "chargeForYear",
    "deductions",
    "deductionsEndYear",
    "deductionsStartYear",
    "depreciationSimilarChargesEndPreviousYear",
    "depreciationSimilarChargesEndYear",
    "assetsForPensionFundsManagedOnBehalfOfThirdParties",
    "financialInstitutions",
    "financialLeasingAgreements",
    "investments",
    "leasingOtherSimilarObligations",
    "movementsForYear",
    "netBookValueStartYear",
    "netValueEndYear",
    "otherLoans",
    "otherMovements",
    "recordedForYear",
    "reimbursements",
    "revaluationSurplusesEndPreviousYear",
    "revaluationSurplusesEndYear",
    "salesDisposals",
    "suppliers",
    "transfersBetweenItems",
    "uncalledAmountsEndYear",
    "uncalledAmountsStartYear",
    "unsubordinatedDebentures",
    "valueAcquisitionsEndYear",
    "valueAcquisitionsStartYear",
    "vatTurnoverTaxSpecialTaxChargedbyCompany",
    "vatTurnoverTaxSpecialTaxChargedToCompany",
    "withinOneYear",
    "accumulatedDeductionsEndOfYear",
    "amountsPayable",
    "remunerationSocialSecurity",
    "remunerationSpecialAssignmentsOtherAssignments",
    "remunerationSpecialAssignmentsOtherCommands",
    "remunerationSpecialAssignmentsOtherControleopdarchten",
    "remunerationSpecialAssignmentsTaxConsultancy",
    "shares",
    "subordinatedLoans",
    "taxAuthorities",
    "newExpensesIncurred",
    "formationCapitalIncreaseLoanIssueExpenses",
    "capitalizedInterest",
    "reorganizationCosts",
    "depreciationSimilarChargesStartYear",
    "tangibleFixedAssets",
    "landBuildings",
    "plantMachineryEquipments",
    "furnitureVehicles",
    "exchangeDifferences",
    "issuedCapitalStartYear",
    "issuedCapitalEndYear",
    "numberRegisteredSharesQuantity",
    "numberBearerSharesQuantity",
    "uncalledUnpaidCapital",
    "calledUnpaidCapital",
    "amountOwnSharesHeldbyCompany",
    "numberOwnSharesHeldbyCompanyQuantity",
    "valueSubjectsSharesHeldbySubsidiaries",
    "numberSubjectsSharesHeldbySubsidiariesQuantity",
    "amountOutstandingConvertibleLoansUnderConversionRights",
    "amountCapitalToBeSubscribedUnderConversionRights",
    "maximumNumberSharesToBeIssuedUnderConversionRightsQuantity",
    "numberOutstandingSubscriptionRightsQuantity",
    "amountCapitalToBeSubscribedUnderSubscriptionRights",
    "maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity",
    "authorizedCapitalNotIssued",
    "numberSharesIssuedNotRepresentingCapitalQuantity",
    "numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity",
    "numberSharesHeldbyCompanyExcludedFromCapitalQuantity",
    "numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity",
    "financialLongTermDebtsPayableinYear",
    "longTermTradeDebtsPayableinYear",
    "longTermAdvancesReceivedOnContractsinProgress",
    "otherLongTermAmountsPayableinYear",
    "totalLongTermDebtsPayableinYear",
    "financialDebtsPayableBetween15Years",
    "tradeDebtsPayableBetween15Years",
    "otherAmountsPayableOver5Years",
    "totalDebtsPayableOver5Years",
    "tradeDebtsGuaranteedbyBLPublicAuthorities",
    "otherAmountsPayableGuaranteedbyBLPublicAuthorities",
    "totalGuaranteedbyBLPublicAuthorities",
    "financialDebtsGuaranteedOnCompanysAssets",
    "otherAmountsPayableGuaranteedOnCompanysAssets",
    "totalGuaranteedOnCompanysAssets",
    "amountsDueToTaxes",
    "amountsNotDueToTaxes",
    "estimatedTaxLiability",
    "amountDueToNationalOfficeSocialSecurity",
    "otherAmountsPayableForRemunerationSocialSecurity",
    "grossProfit",
    "amountSubsidiesCompensationFromPublicAuthorities",
    "membership",
    "gifts",
    "legacies",
    "capitalInterestSubsidies",
    "averageNumberEmployedQuantity",
    "numberWorkersQuantity",
    "numberEmployeesQuantity",
    "numberManagementQuantity",
    "numberOtherEmployedQuantity",
    "totalNumberEmployeesQuantity",
    "averageNumberEmployeesinFullTimeEquivalentsQuantity",
    "numberActualWorkingHoursEmployQuantity",
    "remunerationDirectSocialBenefits",
    "employersContributionForSocialSecurity",
    "employersPremiumForExtraStatutoryInsurance",
    "otherPersonnelCharges",
    "pensions",
    "provisionsForPensions",
    "amountsWrittenOffStocksContractsinProgress",
    "adjustmentsToDeductionsFromStocksContractsinProgress",
    "amountsWrittenOffTradeDebtors",
    "adjustmentsToDeductionsFromTradeDebtors",
    "increaseProvisionsForLiabilitiesCharges",
    "usedWrittenBackProvisionsForLiabilitiesCharges",
    "taxesOnOperations",
    "totNumberTempPersonPlacedDisposalCompanyQuantity",
    "avNumberTempEmployeesinFullTimeEquivalentsQuantity",
    "numberActualWorkingHoursTemporaryPersonnelQuantity",
    "chargesToCompanyForTemporaryPersonnel",
    "capitalSubsidiesCreditedForIncomeDuringYear",
    "interestSubsidiesCreditedForIncomeDuringYear",
    "incomeFromExchangeTransferDifferences",
    "incomeFromExchangeDifferences",
    "incomeFromTransferDifferences",
    "depreciationCostsIssueLoansDiscount",
    "interestCreditedForAssets",
    "deductionsFromCurrentAssets",
    "adjustmentsToDeductionsFromCurrentAssets",
    "discountsNegotiatedOnAmountsReceivable",
    "financialProvisionsCreated",
    "financialProvisionsUsedorWithdrawn",
    "financialProvisionsCreatedUsedorWithdrawn",
    "chargesFromExchangeTransferDifferences",
    "chargesFromExchangeDifferences",
    "chargesFromTransferDifferences",
    "incomeTaxForCurrentYear",
    "taxDeferredTaxDueorPaid",
    "excessPrepaidDeferredTaxIncludedinAssets",
    "estimatedAdditionalChargesForIncomeTax",
    "incomeTaxForPriorYears",
    "additionalChargesForIncomeTaxDueorPaid",
    "estimatedAdditionalChargesForIncomeTaxForPriorYears",
    "activeSourcesPossibleFutureTaxes",
    "accumulatedTaxLossesDeductibleFromFutureProfits",
    "passiveSourcesPossibleFutureTaxes",
    "amountsHeldForThirdPartiesForDeferredTaxOnPayroll",
    "amountsHeldForThirdPartiesForDeferredTaxOnInvestments",
    "personalGuaranteesGivenbyCompany",
    "billsExchangeEndorsedbyCompany",
    "realGuaranteesGivenbyCompany",
    "otherThirdPartyDebtsGuaranteedbyCompany",
    "maximumAmountForWhichThirdPartyDebtsAreGuaranteed",
    "netValuePropertySecuredUnderMortgages",
    "totalAmountMortgagesRegistered",
    "totalAmountBusinessGuaranteesRegistered",
    "netValueOtherAssetsSecuredUnderGuarantees",
    "amountFutureAssetsSecuredUnderGuarantees",
    "netValuePropertySecuredUnderThirdPartyMortgages",
    "totalAmountThirdPartyMortgagesRegistered",
    "totalAmountThirdPartyGuaranteesRegistered",
    "netValueOtherAssetsSecuredUnderThirdPartyGuarantees",
    "amountFutureAssetsSecuredUnderThirdPartyGuarantees",
    "stockPurchased",
    "stockSold",
    "currenciesPurchased",
    "currenciesSold",
    "groupCompaniesFinancialFixedAssets",
    "currentInvestments",
    "debtsCommitmentsGuaranteedbyCompany",
    "debtsCommitmentsGuaranteedOnBehalfGroupCompanies",
    "debtsCommitmentsCompanyGuaranteed",
    "otherFinancialCommitments",
    "otherCommitmentsOnBehalfGroupCompanies",
    "excessRevaluationOnDisposalFixedAssets",
    "excessDevaluationOnDisposalFixedAssets",
    "nonGroupCompaniesFinancialFixedAssets",
    "disposalFixedAssetsRevaluationSurplusesIssued",
    "devaluationSurplusesIssued",
    "pensionsFundedbyCompany",
    "receivablesFromDirectorsLessThanOneYear",
    "guaranteesGivenOnBehalfDirectors",
    "otherSignificantCommitmentsUndertakeninFavorDirectors",
    "directIndirectRemunerationPensionsToDirectors",
    "directIndirectRemunerationPensionsToFormerDirectors",
    "workingCapital",
    "auditorFeesExceptionalOther",
    "auditorFeesExceptionalTax",
    "auditorFeesExceptionalGroup",
    "otherAuditAmount",
    "missionTaxAdviceAmount",
    "otherAssignOutsideAuditingAmount",
    "netCashInvestments",
    "addedValue",
    "balanceDeductionsAdjustmentsToDeductions",
    "netAmountDepreciationSimilarChargesOnFixedAssets",
    "unnegotiatedAcceptances",
    "guaranteesForCredits",
    "otherGuarantees",
    "documentaryCredits",
    "mortgageGuaranteesForThirds",
    "potentialCreditRiskLiabilities",
    "fixedFundEngagements",
    "bondPurchaseEngagements",
    "availableCreditLineMargin",
    "bondPurchaseSaleEngagements",
    "cessionRetrocessionEngagements",
    "valuesCreditBanks",
    "valuesUnderFiduciary",
    "openDepositsSimilar",
    "sharesToBePaidUp",
    "averagePersonnelQuantity",
    "labourersQuantity",
    "clerksQuantity",
    "staffPersonnelQuantity",
    "othersQuantity",
    "personnelExpenses",
    "wagesSocialAdvantages",
    "employersSocialSecurityPremiums",
    "employersPremiumsExtraLegalAdvantages",
    "otherCostsPersonnel",
    "transfersTo",
    "transfersFrom",
    "fiscalSocialDebtsVersusTaxAdministration",
    "outstandingFiscSocialDebtsVersusSocialSecurityAdmin",
    "taxesPayable",
    "estimatedFiscalDebts",
    "receivFromDirectManagOtherControllingNonAffiliatCies",
    "debtsinFavourDirectrsManagOthControlNonAffiliatedCies",
    "othSignEngagmInFavrDirecManagOthControlNonAffilCies",
    "totalGuarantAmntPartDebtsCieOtherThenTechnRes",
    "comGuarantSuppliedorIrrevocPromisedbyCie",
    "comPrivGuarantSuppliedbyAffiliatedCies",
    "othersSupplyingGuarantInChargeCie",
    "totalComPrivGuarSupplAsGuarantForDebtsForThirds",
    "affiliatedCompaniesSubsidiariesSubSubsidiaries",
    "otherCompaniesWithAffiliation",
    "directorsorManagers",
    "others",
    "totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed",
    "fiscalAdministration",
    "socialSecurityAdministration",
    "averageNumberPersonnelQuantity",
    "totalWagesPensionsOtherPersonnelExpenses",
    "wages",
    "otherDirectSocialAdvantages",
    "employersSocialSecPremiums",
    "otherPersonnelExpenses",
    "increaseProvisionsForPensions",
    "decreaseProvisionsForPensions",
    "increaseProvisionsForOtherWagesSocExpenses",
    "decreaseProvisionsForOtherWagesSocExpenses",
    "totWagesPensionsForExDirectorsManagersEtc",
    "totalDistributionTaxesOnResultForPeriod",
    "totalTaxesOnResult",
    "paidPrepaidTaxes",
    "onAssetsBookedOverPaidTaxes",
    "provisionsForTaxes",
    "totalRegularisationsWithdrawals",
    "regularisationsTaxes",
    "withdrawalOnFiscalProvisions",
    "landBuildingsFullyOwned",
    "landBuildingsOther",
    "plantMachineryEquipmentFullyOwned",
    "plantMachineryEquipmentOther",
    "furnitureVehiclesFullyOwned",
    "furnitureVehiclesOther",
    "otherTangibleAssetsFullyOwned",
    "otherTangibleAssetsOther",
    "longTermOtherReceivablesNoOrAbnormallyLowInterest",
    "shortTermOtherReceivablesNoOrAbnormallyLowInterest",
    "advancesReceivedOnContractsGuaranteedByPublicAuthorities",
    "advancesReceivedOnContractsGuaranteedOnCompaniesAssets",
    "bookValueAccumulatedOfTheUncalledAmounts",
    "bookValueFinancialFixedAssetsEndOfThePreceedingYear",
    "bookValueFinancialFixedAssetsEndOfTheYear",
    "financialChargesOnDebts",
    "financialDebtsGuaranteedByPublicAuthorities",
    "financialDebtsPayableOver5Years",
    "fixedIncomeSecurities",
    "fixedIncomeSecuritiesIssuedByFinancialInstitutions",
    "fundsforasocialliabilitytocover",
    "furnitureRollingEquipmentInfullownershipoftheassociation",
    "incomeFromCurrentAssets",
    "incomeFromFinancialFixedAssets",
    "landBuildingsInfullownershipoftheassociation",
    "missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner",
    "movementsInFinancialFixedAssetsForTheYear",
    "otherAuditscarriedoutbypersonsconnectedwithCommissioner",
    "otherFinancialCharges",
    "otherFinancialIncome",
    "otherInvestments",
    "otherMissionsConnectedwithCommissioner",
    "otherOperatingCharges",
    "othertangiblefixedassetsInfullownershipoftheassociation",
    "plantmachineryequipmentInthepropertyoftheassociation",
    "remunerationscommissaryforextraordinactivities",
    "residualTermOrNoticeOfWithdrawalBetween1Month1Year",
    "residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month",
    "residualTermOrNoticeOfWithdrawalOver1Year",
    "salesMembershipGiftsLegaciesSubsidiesotheroperIncome",
    "taxRemunerationSocialSecurity",
    "taxesRemunerationSocialSecurity",
    "termAccountsWithFinancialInstitutions",
    "tradeDebtsGuaranteedOnTheCompanyAssets",
    "tradeDebtsPayableOver5Years",
    "uncalledAmounts"
})
public class NotesToAccountsType {

    @XmlElement(name = "DirectorsRemuneration")
    protected AmountType directorsRemuneration;
    @XmlElement(name = "EmployeesQuantity")
    protected BigInteger employeesQuantity;
    @XmlElement(name = "StaffCosts")
    protected AmountType staffCosts;
    @XmlElement(name = "Depreciation")
    protected AmountType depreciation;
    @XmlElement(name = "AuditorsRemuneration")
    protected AmountType auditorsRemuneration;
    @XmlElement(name = "AuditFee")
    protected AmountType auditFee;
    @XmlElement(name = "AuditorsRemunerationNonAuditFees")
    protected AmountType auditorsRemunerationNonAuditFees;
    @XmlElement(name = "RemunerationChairman")
    protected AmountType remunerationChairman;
    @XmlElement(name = "HighestPaidDirector")
    protected AmountType highestPaidDirector;
    @XmlElement(name = "OperatingLeaseCommitmentsPlantMachinery")
    protected AmountType operatingLeaseCommitmentsPlantMachinery;
    @XmlElement(name = "OperatingLeaseCommitmentsLandBuilding")
    protected AmountType operatingLeaseCommitmentsLandBuilding;
    @XmlElement(name = "TotalOperatingLeaseCommitments")
    protected AmountType totalOperatingLeaseCommitments;
    @XmlElement(name = "ContingentDebts")
    protected AmountType contingentDebts;
    @XmlElement(name = "MarketValuePensionSchemeAssets")
    protected AmountType marketValuePensionSchemeAssets;
    @XmlElement(name = "AveragePaymentTimeDays")
    protected AmountType averagePaymentTimeDays;
    @XmlElement(name = "ConsolidatedSubsidiariesQuantity")
    protected AmountType consolidatedSubsidiariesQuantity;
    @XmlElement(name = "MemorandumAccounts")
    protected AmountType memorandumAccounts;
    @XmlElement(name = "FixedAssetsDepreciationLiability")
    protected AmountType fixedAssetsDepreciationLiability;
    @XmlElement(name = "GuaranteesGiven")
    protected AmountType guaranteesGiven;
    @XmlElement(name = "Sureties")
    protected AmountType sureties;
    @XmlElement(name = "Endorsements")
    protected AmountType endorsements;
    @XmlElement(name = "OtherPersonalGuarantess")
    protected AmountType otherPersonalGuarantess;
    @XmlElement(name = "Collaterals")
    protected AmountType collaterals;
    @XmlElement(name = "GuaranteesReceived")
    protected AmountType guaranteesReceived;
    @XmlElement(name = "OtherPersonalGuarantees")
    protected AmountType otherPersonalGuarantees;
    @XmlElement(name = "GuaranteesGivenByThirdPartiesInTheInterestOfTheCompany")
    protected AmountType guaranteesGivenByThirdPartiesInTheInterestOfTheCompany;
    @XmlElement(name = "Commitments")
    protected AmountType commitments;
    @XmlElement(name = "ThirdPartyAssets")
    protected AmountType thirdPartyAssets;
    @XmlElement(name = "SecuritiesLodgedWithThirdParties")
    protected AmountType securitiesLodgedWithThirdParties;
    @XmlElement(name = "OtherMemorandumAccounts")
    protected AmountType otherMemorandumAccounts;
    @XmlElement(name = "AcquisitionsFixedAssets")
    protected List<AmountType> acquisitionsFixedAssets;
    @XmlElement(name = "AcquisitionsFromThirdParties")
    protected List<AmountType> acquisitionsFromThirdParties;
    @XmlElement(name = "Additions")
    protected List<AmountType> additions;
    @XmlElement(name = "AdjustmentsToAmountsWrittenOff")
    protected List<AmountType> adjustmentsToAmountsWrittenOff;
    @XmlElement(name = "AdvancesReceivedOnContractsinProgressPayableOver5Years")
    protected List<AmountType> advancesReceivedOnContractsinProgressPayableOver5Years;
    @XmlElement(name = "AfterOneYear")
    protected List<AmountType> afterOneYear;
    @XmlElement(name = "AmountsReceivable")
    protected List<AmountType> amountsReceivable;
    @XmlElement(name = "AmountsReceivableOther")
    protected List<AmountType> amountsReceivableOther;
    @XmlElement(name = "AmountsReceivableSubordinated")
    protected List<AmountType> amountsReceivableSubordinated;
    @XmlElement(name = "BillsExchangePayable")
    protected List<AmountType> billsExchangePayable;
    @XmlElement(name = "Cancelled")
    protected List<AmountType> cancelled;
    @XmlElement(name = "ChargeForYear")
    protected List<AmountType> chargeForYear;
    @XmlElement(name = "Deductions")
    protected List<AmountType> deductions;
    @XmlElement(name = "DeductionsEndYear")
    protected List<AmountType> deductionsEndYear;
    @XmlElement(name = "DeductionsStartYear")
    protected List<AmountType> deductionsStartYear;
    @XmlElement(name = "DepreciationSimilarChargesEndPreviousYear")
    protected List<AmountType> depreciationSimilarChargesEndPreviousYear;
    @XmlElement(name = "DepreciationSimilarChargesEndYear")
    protected List<AmountType> depreciationSimilarChargesEndYear;
    @XmlElement(name = "AssetsForPensionFundsManagedOnBehalfOfThirdParties")
    protected List<AmountType> assetsForPensionFundsManagedOnBehalfOfThirdParties;
    @XmlElement(name = "FinancialInstitutions")
    protected List<AmountType> financialInstitutions;
    @XmlElement(name = "FinancialLeasingAgreements")
    protected List<AmountType> financialLeasingAgreements;
    @XmlElement(name = "Investments")
    protected List<AmountType> investments;
    @XmlElement(name = "LeasingOtherSimilarObligations")
    protected List<AmountType> leasingOtherSimilarObligations;
    @XmlElement(name = "MovementsForYear")
    protected List<AmountType> movementsForYear;
    @XmlElement(name = "NetBookValueStartYear")
    protected List<AmountType> netBookValueStartYear;
    @XmlElement(name = "NetValueEndYear")
    protected List<AmountType> netValueEndYear;
    @XmlElement(name = "OtherLoans")
    protected List<AmountType> otherLoans;
    @XmlElement(name = "OtherMovements")
    protected List<AmountType> otherMovements;
    @XmlElement(name = "RecordedForYear")
    protected List<AmountType> recordedForYear;
    @XmlElement(name = "Reimbursements")
    protected List<AmountType> reimbursements;
    @XmlElement(name = "RevaluationSurplusesEndPreviousYear")
    protected List<AmountType> revaluationSurplusesEndPreviousYear;
    @XmlElement(name = "RevaluationSurplusesEndYear")
    protected List<AmountType> revaluationSurplusesEndYear;
    @XmlElement(name = "SalesDisposals")
    protected List<AmountType> salesDisposals;
    @XmlElement(name = "Suppliers")
    protected List<AmountType> suppliers;
    @XmlElement(name = "TransfersBetweenItems")
    protected List<AmountType> transfersBetweenItems;
    @XmlElement(name = "UncalledAmountsEndYear")
    protected List<AmountType> uncalledAmountsEndYear;
    @XmlElement(name = "UncalledAmountsStartYear")
    protected List<AmountType> uncalledAmountsStartYear;
    @XmlElement(name = "UnsubordinatedDebentures")
    protected List<AmountType> unsubordinatedDebentures;
    @XmlElement(name = "ValueAcquisitionsEndYear")
    protected List<AmountType> valueAcquisitionsEndYear;
    @XmlElement(name = "ValueAcquisitionsStartYear")
    protected List<AmountType> valueAcquisitionsStartYear;
    @XmlElement(name = "VATTurnoverTaxSpecialTaxChargedbyCompany")
    protected List<AmountType> vatTurnoverTaxSpecialTaxChargedbyCompany;
    @XmlElement(name = "VATTurnoverTaxSpecialTaxChargedToCompany")
    protected List<AmountType> vatTurnoverTaxSpecialTaxChargedToCompany;
    @XmlElement(name = "WithinOneYear")
    protected List<AmountType> withinOneYear;
    @XmlElement(name = "AccumulatedDeductionsEndOfYear")
    protected List<AmountType> accumulatedDeductionsEndOfYear;
    @XmlElement(name = "AmountsPayable")
    protected List<AmountType> amountsPayable;
    @XmlElement(name = "RemunerationSocialSecurity")
    protected List<AmountType> remunerationSocialSecurity;
    @XmlElement(name = "RemunerationSpecialAssignmentsOtherAssignments")
    protected List<AmountType> remunerationSpecialAssignmentsOtherAssignments;
    @XmlElement(name = "RemunerationSpecialAssignmentsOtherCommands")
    protected List<AmountType> remunerationSpecialAssignmentsOtherCommands;
    @XmlElement(name = "RemunerationSpecialAssignmentsOtherControleopdarchten")
    protected List<AmountType> remunerationSpecialAssignmentsOtherControleopdarchten;
    @XmlElement(name = "RemunerationSpecialAssignmentsTaxConsultancy")
    protected List<AmountType> remunerationSpecialAssignmentsTaxConsultancy;
    @XmlElement(name = "Shares")
    protected List<AmountType> shares;
    @XmlElement(name = "SubordinatedLoans")
    protected List<AmountType> subordinatedLoans;
    @XmlElement(name = "TaxAuthorities")
    protected List<AmountType> taxAuthorities;
    @XmlElement(name = "NewExpensesIncurred")
    protected AmountType newExpensesIncurred;
    @XmlElement(name = "FormationCapitalIncreaseLoanIssueExpenses")
    protected AmountType formationCapitalIncreaseLoanIssueExpenses;
    @XmlElement(name = "CapitalizedInterest")
    protected AmountType capitalizedInterest;
    @XmlElement(name = "ReorganizationCosts")
    protected AmountType reorganizationCosts;
    @XmlElement(name = "DepreciationSimilarChargesStartYear")
    protected AmountType depreciationSimilarChargesStartYear;
    @XmlElement(name = "TangibleFixedAssets")
    protected AmountType tangibleFixedAssets;
    @XmlElement(name = "LandBuildings")
    protected AmountType landBuildings;
    @XmlElement(name = "PlantMachineryEquipments")
    protected AmountType plantMachineryEquipments;
    @XmlElement(name = "FurnitureVehicles")
    protected AmountType furnitureVehicles;
    @XmlElement(name = "ExchangeDifferences")
    protected AmountType exchangeDifferences;
    @XmlElement(name = "IssuedCapitalStartYear")
    protected AmountType issuedCapitalStartYear;
    @XmlElement(name = "IssuedCapitalEndYear")
    protected AmountType issuedCapitalEndYear;
    @XmlElement(name = "NumberRegisteredSharesQuantity")
    protected BigInteger numberRegisteredSharesQuantity;
    @XmlElement(name = "NumberBearerSharesQuantity")
    protected BigInteger numberBearerSharesQuantity;
    @XmlElement(name = "UncalledUnpaidCapital")
    protected AmountType uncalledUnpaidCapital;
    @XmlElement(name = "CalledUnpaidCapital")
    protected AmountType calledUnpaidCapital;
    @XmlElement(name = "AmountOwnSharesHeldbyCompany")
    protected AmountType amountOwnSharesHeldbyCompany;
    @XmlElement(name = "NumberOwnSharesHeldbyCompanyQuantity")
    protected BigInteger numberOwnSharesHeldbyCompanyQuantity;
    @XmlElement(name = "ValueSubjectsSharesHeldbySubsidiaries")
    protected AmountType valueSubjectsSharesHeldbySubsidiaries;
    @XmlElement(name = "NumberSubjectsSharesHeldbySubsidiariesQuantity")
    protected BigInteger numberSubjectsSharesHeldbySubsidiariesQuantity;
    @XmlElement(name = "AmountOutstandingConvertibleLoansUnderConversionRights")
    protected AmountType amountOutstandingConvertibleLoansUnderConversionRights;
    @XmlElement(name = "AmountCapitalToBeSubscribedUnderConversionRights")
    protected AmountType amountCapitalToBeSubscribedUnderConversionRights;
    @XmlElement(name = "MaximumNumberSharesToBeIssuedUnderConversionRightsQuantity")
    protected BigInteger maximumNumberSharesToBeIssuedUnderConversionRightsQuantity;
    @XmlElement(name = "NumberOutstandingSubscriptionRightsQuantity")
    protected BigInteger numberOutstandingSubscriptionRightsQuantity;
    @XmlElement(name = "AmountCapitalToBeSubscribedUnderSubscriptionRights")
    protected AmountType amountCapitalToBeSubscribedUnderSubscriptionRights;
    @XmlElement(name = "MaximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity")
    protected BigInteger maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity;
    @XmlElement(name = "AuthorizedCapitalNotIssued")
    protected AmountType authorizedCapitalNotIssued;
    @XmlElement(name = "NumberSharesIssuedNotRepresentingCapitalQuantity")
    protected BigInteger numberSharesIssuedNotRepresentingCapitalQuantity;
    @XmlElement(name = "NumberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity")
    protected BigInteger numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity;
    @XmlElement(name = "NumberSharesHeldbyCompanyExcludedFromCapitalQuantity")
    protected BigInteger numberSharesHeldbyCompanyExcludedFromCapitalQuantity;
    @XmlElement(name = "NumberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity")
    protected BigInteger numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity;
    @XmlElement(name = "FinancialLongTermDebtsPayableinYear")
    protected AmountType financialLongTermDebtsPayableinYear;
    @XmlElement(name = "LongTermTradeDebtsPayableinYear")
    protected AmountType longTermTradeDebtsPayableinYear;
    @XmlElement(name = "LongTermAdvancesReceivedOnContractsinProgress")
    protected AmountType longTermAdvancesReceivedOnContractsinProgress;
    @XmlElement(name = "OtherLongTermAmountsPayableinYear")
    protected AmountType otherLongTermAmountsPayableinYear;
    @XmlElement(name = "TotalLongTermDebtsPayableinYear")
    protected AmountType totalLongTermDebtsPayableinYear;
    @XmlElement(name = "FinancialDebtsPayableBetween15Years")
    protected AmountType financialDebtsPayableBetween15Years;
    @XmlElement(name = "TradeDebtsPayableBetween15Years")
    protected AmountType tradeDebtsPayableBetween15Years;
    @XmlElement(name = "OtherAmountsPayableOver5Years")
    protected AmountType otherAmountsPayableOver5Years;
    @XmlElement(name = "TotalDebtsPayableOver5Years")
    protected AmountType totalDebtsPayableOver5Years;
    @XmlElement(name = "TradeDebtsGuaranteedbyBLPublicAuthorities")
    protected AmountType tradeDebtsGuaranteedbyBLPublicAuthorities;
    @XmlElement(name = "OtherAmountsPayableGuaranteedbyBLPublicAuthorities")
    protected AmountType otherAmountsPayableGuaranteedbyBLPublicAuthorities;
    @XmlElement(name = "TotalGuaranteedbyBLPublicAuthorities")
    protected AmountType totalGuaranteedbyBLPublicAuthorities;
    @XmlElement(name = "FinancialDebtsGuaranteedOnCompanysAssets")
    protected AmountType financialDebtsGuaranteedOnCompanysAssets;
    @XmlElement(name = "OtherAmountsPayableGuaranteedOnCompanysAssets")
    protected AmountType otherAmountsPayableGuaranteedOnCompanysAssets;
    @XmlElement(name = "TotalGuaranteedOnCompanysAssets")
    protected AmountType totalGuaranteedOnCompanysAssets;
    @XmlElement(name = "AmountsDueToTaxes")
    protected AmountType amountsDueToTaxes;
    @XmlElement(name = "AmountsNotDueToTaxes")
    protected AmountType amountsNotDueToTaxes;
    @XmlElement(name = "EstimatedTaxLiability")
    protected AmountType estimatedTaxLiability;
    @XmlElement(name = "AmountDueToNationalOfficeSocialSecurity")
    protected AmountType amountDueToNationalOfficeSocialSecurity;
    @XmlElement(name = "OtherAmountsPayableForRemunerationSocialSecurity")
    protected AmountType otherAmountsPayableForRemunerationSocialSecurity;
    @XmlElement(name = "GrossProfit")
    protected AmountType grossProfit;
    @XmlElement(name = "AmountSubsidiesCompensationFromPublicAuthorities")
    protected AmountType amountSubsidiesCompensationFromPublicAuthorities;
    @XmlElement(name = "Membership")
    protected AmountType membership;
    @XmlElement(name = "Gifts")
    protected AmountType gifts;
    @XmlElement(name = "Legacies")
    protected AmountType legacies;
    @XmlElement(name = "CapitalInterestSubsidies")
    protected AmountType capitalInterestSubsidies;
    @XmlElement(name = "AverageNumberEmployedQuantity")
    protected BigInteger averageNumberEmployedQuantity;
    @XmlElement(name = "NumberWorkersQuantity")
    protected BigInteger numberWorkersQuantity;
    @XmlElement(name = "NumberEmployeesQuantity")
    protected BigInteger numberEmployeesQuantity;
    @XmlElement(name = "NumberManagementQuantity")
    protected BigInteger numberManagementQuantity;
    @XmlElement(name = "NumberOtherEmployedQuantity")
    protected BigInteger numberOtherEmployedQuantity;
    @XmlElement(name = "TotalNumberEmployeesQuantity")
    protected BigInteger totalNumberEmployeesQuantity;
    @XmlElement(name = "AverageNumberEmployeesinFullTimeEquivalentsQuantity")
    protected BigInteger averageNumberEmployeesinFullTimeEquivalentsQuantity;
    @XmlElement(name = "NumberActualWorkingHoursEmployQuantity")
    protected BigInteger numberActualWorkingHoursEmployQuantity;
    @XmlElement(name = "RemunerationDirectSocialBenefits")
    protected AmountType remunerationDirectSocialBenefits;
    @XmlElement(name = "EmployersContributionForSocialSecurity")
    protected AmountType employersContributionForSocialSecurity;
    @XmlElement(name = "EmployersPremiumForExtraStatutoryInsurance")
    protected AmountType employersPremiumForExtraStatutoryInsurance;
    @XmlElement(name = "OtherPersonnelCharges")
    protected AmountType otherPersonnelCharges;
    @XmlElement(name = "Pensions")
    protected AmountType pensions;
    @XmlElement(name = "ProvisionsForPensions")
    protected AmountType provisionsForPensions;
    @XmlElement(name = "AmountsWrittenOffStocksContractsinProgress")
    protected AmountType amountsWrittenOffStocksContractsinProgress;
    @XmlElement(name = "AdjustmentsToDeductionsFromStocksContractsinProgress")
    protected AmountType adjustmentsToDeductionsFromStocksContractsinProgress;
    @XmlElement(name = "AmountsWrittenOffTradeDebtors")
    protected AmountType amountsWrittenOffTradeDebtors;
    @XmlElement(name = "AdjustmentsToDeductionsFromTradeDebtors")
    protected AmountType adjustmentsToDeductionsFromTradeDebtors;
    @XmlElement(name = "IncreaseProvisionsForLiabilitiesCharges")
    protected AmountType increaseProvisionsForLiabilitiesCharges;
    @XmlElement(name = "UsedWrittenBackProvisionsForLiabilitiesCharges")
    protected AmountType usedWrittenBackProvisionsForLiabilitiesCharges;
    @XmlElement(name = "TaxesOnOperations")
    protected AmountType taxesOnOperations;
    @XmlElement(name = "TotNumberTempPersonPlacedDisposalCompanyQuantity")
    protected BigInteger totNumberTempPersonPlacedDisposalCompanyQuantity;
    @XmlElement(name = "AvNumberTempEmployeesinFullTimeEquivalentsQuantity")
    protected BigInteger avNumberTempEmployeesinFullTimeEquivalentsQuantity;
    @XmlElement(name = "NumberActualWorkingHoursTemporaryPersonnelQuantity")
    protected BigInteger numberActualWorkingHoursTemporaryPersonnelQuantity;
    @XmlElement(name = "ChargesToCompanyForTemporaryPersonnel")
    protected AmountType chargesToCompanyForTemporaryPersonnel;
    @XmlElement(name = "CapitalSubsidiesCreditedForIncomeDuringYear")
    protected AmountType capitalSubsidiesCreditedForIncomeDuringYear;
    @XmlElement(name = "InterestSubsidiesCreditedForIncomeDuringYear")
    protected AmountType interestSubsidiesCreditedForIncomeDuringYear;
    @XmlElement(name = "IncomeFromExchangeTransferDifferences")
    protected AmountType incomeFromExchangeTransferDifferences;
    @XmlElement(name = "IncomeFromExchangeDifferences")
    protected AmountType incomeFromExchangeDifferences;
    @XmlElement(name = "IncomeFromTransferDifferences")
    protected AmountType incomeFromTransferDifferences;
    @XmlElement(name = "DepreciationCostsIssueLoansDiscount")
    protected AmountType depreciationCostsIssueLoansDiscount;
    @XmlElement(name = "InterestCreditedForAssets")
    protected AmountType interestCreditedForAssets;
    @XmlElement(name = "DeductionsFromCurrentAssets")
    protected AmountType deductionsFromCurrentAssets;
    @XmlElement(name = "AdjustmentsToDeductionsFromCurrentAssets")
    protected AmountType adjustmentsToDeductionsFromCurrentAssets;
    @XmlElement(name = "DiscountsNegotiatedOnAmountsReceivable")
    protected AmountType discountsNegotiatedOnAmountsReceivable;
    @XmlElement(name = "FinancialProvisionsCreated")
    protected AmountType financialProvisionsCreated;
    @XmlElement(name = "FinancialProvisionsUsedorWithdrawn")
    protected AmountType financialProvisionsUsedorWithdrawn;
    @XmlElement(name = "FinancialProvisionsCreatedUsedorWithdrawn")
    protected AmountType financialProvisionsCreatedUsedorWithdrawn;
    @XmlElement(name = "ChargesFromExchangeTransferDifferences")
    protected AmountType chargesFromExchangeTransferDifferences;
    @XmlElement(name = "ChargesFromExchangeDifferences")
    protected AmountType chargesFromExchangeDifferences;
    @XmlElement(name = "ChargesFromTransferDifferences")
    protected AmountType chargesFromTransferDifferences;
    @XmlElement(name = "IncomeTaxForCurrentYear")
    protected AmountType incomeTaxForCurrentYear;
    @XmlElement(name = "TaxDeferredTaxDueorPaid")
    protected AmountType taxDeferredTaxDueorPaid;
    @XmlElement(name = "ExcessPrepaidDeferredTaxIncludedinAssets")
    protected AmountType excessPrepaidDeferredTaxIncludedinAssets;
    @XmlElement(name = "EstimatedAdditionalChargesForIncomeTax")
    protected AmountType estimatedAdditionalChargesForIncomeTax;
    @XmlElement(name = "IncomeTaxForPriorYears")
    protected AmountType incomeTaxForPriorYears;
    @XmlElement(name = "AdditionalChargesForIncomeTaxDueorPaid")
    protected AmountType additionalChargesForIncomeTaxDueorPaid;
    @XmlElement(name = "EstimatedAdditionalChargesForIncomeTaxForPriorYears")
    protected AmountType estimatedAdditionalChargesForIncomeTaxForPriorYears;
    @XmlElement(name = "ActiveSourcesPossibleFutureTaxes")
    protected AmountType activeSourcesPossibleFutureTaxes;
    @XmlElement(name = "AccumulatedTaxLossesDeductibleFromFutureProfits")
    protected AmountType accumulatedTaxLossesDeductibleFromFutureProfits;
    @XmlElement(name = "PassiveSourcesPossibleFutureTaxes")
    protected AmountType passiveSourcesPossibleFutureTaxes;
    @XmlElement(name = "AmountsHeldForThirdPartiesForDeferredTaxOnPayroll")
    protected AmountType amountsHeldForThirdPartiesForDeferredTaxOnPayroll;
    @XmlElement(name = "AmountsHeldForThirdPartiesForDeferredTaxOnInvestments")
    protected AmountType amountsHeldForThirdPartiesForDeferredTaxOnInvestments;
    @XmlElement(name = "PersonalGuaranteesGivenbyCompany")
    protected AmountType personalGuaranteesGivenbyCompany;
    @XmlElement(name = "BillsExchangeEndorsedbyCompany")
    protected AmountType billsExchangeEndorsedbyCompany;
    @XmlElement(name = "RealGuaranteesGivenbyCompany")
    protected AmountType realGuaranteesGivenbyCompany;
    @XmlElement(name = "OtherThirdPartyDebtsGuaranteedbyCompany")
    protected AmountType otherThirdPartyDebtsGuaranteedbyCompany;
    @XmlElement(name = "MaximumAmountForWhichThirdPartyDebtsAreGuaranteed")
    protected AmountType maximumAmountForWhichThirdPartyDebtsAreGuaranteed;
    @XmlElement(name = "NetValuePropertySecuredUnderMortgages")
    protected AmountType netValuePropertySecuredUnderMortgages;
    @XmlElement(name = "TotalAmountMortgagesRegistered")
    protected AmountType totalAmountMortgagesRegistered;
    @XmlElement(name = "TotalAmountBusinessGuaranteesRegistered")
    protected AmountType totalAmountBusinessGuaranteesRegistered;
    @XmlElement(name = "NetValueOtherAssetsSecuredUnderGuarantees")
    protected AmountType netValueOtherAssetsSecuredUnderGuarantees;
    @XmlElement(name = "AmountFutureAssetsSecuredUnderGuarantees")
    protected AmountType amountFutureAssetsSecuredUnderGuarantees;
    @XmlElement(name = "NetValuePropertySecuredUnderThirdPartyMortgages")
    protected AmountType netValuePropertySecuredUnderThirdPartyMortgages;
    @XmlElement(name = "TotalAmountThirdPartyMortgagesRegistered")
    protected AmountType totalAmountThirdPartyMortgagesRegistered;
    @XmlElement(name = "TotalAmountThirdPartyGuaranteesRegistered")
    protected AmountType totalAmountThirdPartyGuaranteesRegistered;
    @XmlElement(name = "NetValueOtherAssetsSecuredUnderThirdPartyGuarantees")
    protected AmountType netValueOtherAssetsSecuredUnderThirdPartyGuarantees;
    @XmlElement(name = "AmountFutureAssetsSecuredUnderThirdPartyGuarantees")
    protected AmountType amountFutureAssetsSecuredUnderThirdPartyGuarantees;
    @XmlElement(name = "StockPurchased")
    protected AmountType stockPurchased;
    @XmlElement(name = "StockSold")
    protected AmountType stockSold;
    @XmlElement(name = "CurrenciesPurchased")
    protected AmountType currenciesPurchased;
    @XmlElement(name = "CurrenciesSold")
    protected AmountType currenciesSold;
    @XmlElement(name = "GroupCompaniesFinancialFixedAssets")
    protected AmountType groupCompaniesFinancialFixedAssets;
    @XmlElement(name = "CurrentInvestments")
    protected AmountType currentInvestments;
    @XmlElement(name = "DebtsCommitmentsGuaranteedbyCompany")
    protected AmountType debtsCommitmentsGuaranteedbyCompany;
    @XmlElement(name = "DebtsCommitmentsGuaranteedOnBehalfGroupCompanies")
    protected AmountType debtsCommitmentsGuaranteedOnBehalfGroupCompanies;
    @XmlElement(name = "DebtsCommitmentsCompanyGuaranteed")
    protected AmountType debtsCommitmentsCompanyGuaranteed;
    @XmlElement(name = "OtherFinancialCommitments")
    protected AmountType otherFinancialCommitments;
    @XmlElement(name = "OtherCommitmentsOnBehalfGroupCompanies")
    protected AmountType otherCommitmentsOnBehalfGroupCompanies;
    @XmlElement(name = "ExcessRevaluationOnDisposalFixedAssets")
    protected AmountType excessRevaluationOnDisposalFixedAssets;
    @XmlElement(name = "ExcessDevaluationOnDisposalFixedAssets")
    protected AmountType excessDevaluationOnDisposalFixedAssets;
    @XmlElement(name = "NonGroupCompaniesFinancialFixedAssets")
    protected AmountType nonGroupCompaniesFinancialFixedAssets;
    @XmlElement(name = "DisposalFixedAssetsRevaluationSurplusesIssued")
    protected AmountType disposalFixedAssetsRevaluationSurplusesIssued;
    @XmlElement(name = "DevaluationSurplusesIssued")
    protected AmountType devaluationSurplusesIssued;
    @XmlElement(name = "PensionsFundedbyCompany")
    protected AmountType pensionsFundedbyCompany;
    @XmlElement(name = "ReceivablesFromDirectorsLessThanOneYear")
    protected AmountType receivablesFromDirectorsLessThanOneYear;
    @XmlElement(name = "GuaranteesGivenOnBehalfDirectors")
    protected AmountType guaranteesGivenOnBehalfDirectors;
    @XmlElement(name = "OtherSignificantCommitmentsUndertakeninFavorDirectors")
    protected AmountType otherSignificantCommitmentsUndertakeninFavorDirectors;
    @XmlElement(name = "DirectIndirectRemunerationPensionsToDirectors")
    protected AmountType directIndirectRemunerationPensionsToDirectors;
    @XmlElement(name = "DirectIndirectRemunerationPensionsToFormerDirectors")
    protected AmountType directIndirectRemunerationPensionsToFormerDirectors;
    @XmlElement(name = "WorkingCapital")
    protected AmountType workingCapital;
    @XmlElement(name = "AuditorFeesExceptionalOther")
    protected AmountType auditorFeesExceptionalOther;
    @XmlElement(name = "AuditorFeesExceptionalTax")
    protected AmountType auditorFeesExceptionalTax;
    @XmlElement(name = "AuditorFeesExceptionalGroup")
    protected AmountType auditorFeesExceptionalGroup;
    @XmlElement(name = "OtherAuditAmount")
    protected AmountType otherAuditAmount;
    @XmlElement(name = "MissionTaxAdviceAmount")
    protected AmountType missionTaxAdviceAmount;
    @XmlElement(name = "OtherAssignOutsideAuditingAmount")
    protected AmountType otherAssignOutsideAuditingAmount;
    @XmlElement(name = "NetCashInvestments")
    protected AmountType netCashInvestments;
    @XmlElement(name = "AddedValue")
    protected AmountType addedValue;
    @XmlElement(name = "BalanceDeductionsAdjustmentsToDeductions")
    protected AmountType balanceDeductionsAdjustmentsToDeductions;
    @XmlElement(name = "NetAmountDepreciationSimilarChargesOnFixedAssets")
    protected AmountType netAmountDepreciationSimilarChargesOnFixedAssets;
    @XmlElement(name = "UnnegotiatedAcceptances")
    protected AmountType unnegotiatedAcceptances;
    @XmlElement(name = "GuaranteesForCredits")
    protected AmountType guaranteesForCredits;
    @XmlElement(name = "OtherGuarantees")
    protected AmountType otherGuarantees;
    @XmlElement(name = "DocumentaryCredits")
    protected AmountType documentaryCredits;
    @XmlElement(name = "MortgageGuaranteesForThirds")
    protected AmountType mortgageGuaranteesForThirds;
    @XmlElement(name = "PotentialCreditRiskLiabilities")
    protected AmountType potentialCreditRiskLiabilities;
    @XmlElement(name = "FixedFundEngagements")
    protected AmountType fixedFundEngagements;
    @XmlElement(name = "BondPurchaseEngagements")
    protected AmountType bondPurchaseEngagements;
    @XmlElement(name = "AvailableCreditLineMargin")
    protected AmountType availableCreditLineMargin;
    @XmlElement(name = "BondPurchaseSaleEngagements")
    protected AmountType bondPurchaseSaleEngagements;
    @XmlElement(name = "CessionRetrocessionEngagements")
    protected AmountType cessionRetrocessionEngagements;
    @XmlElement(name = "ValuesCreditBanks")
    protected AmountType valuesCreditBanks;
    @XmlElement(name = "ValuesUnderFiduciary")
    protected AmountType valuesUnderFiduciary;
    @XmlElement(name = "OpenDepositsSimilar")
    protected AmountType openDepositsSimilar;
    @XmlElement(name = "SharesToBePaidUp")
    protected AmountType sharesToBePaidUp;
    @XmlElement(name = "AveragePersonnelQuantity")
    protected BigInteger averagePersonnelQuantity;
    @XmlElement(name = "LabourersQuantity")
    protected BigInteger labourersQuantity;
    @XmlElement(name = "ClerksQuantity")
    protected BigInteger clerksQuantity;
    @XmlElement(name = "StaffPersonnelQuantity")
    protected BigInteger staffPersonnelQuantity;
    @XmlElement(name = "OthersQuantity")
    protected BigInteger othersQuantity;
    @XmlElement(name = "PersonnelExpenses")
    protected AmountType personnelExpenses;
    @XmlElement(name = "WagesSocialAdvantages")
    protected AmountType wagesSocialAdvantages;
    @XmlElement(name = "EmployersSocialSecurityPremiums")
    protected AmountType employersSocialSecurityPremiums;
    @XmlElement(name = "EmployersPremiumsExtraLegalAdvantages")
    protected AmountType employersPremiumsExtraLegalAdvantages;
    @XmlElement(name = "OtherCostsPersonnel")
    protected AmountType otherCostsPersonnel;
    @XmlElement(name = "TransfersTo")
    protected AmountType transfersTo;
    @XmlElement(name = "TransfersFrom")
    protected AmountType transfersFrom;
    @XmlElement(name = "FiscalSocialDebtsVersusTaxAdministration")
    protected AmountType fiscalSocialDebtsVersusTaxAdministration;
    @XmlElement(name = "OutstandingFiscSocialDebtsVersusSocialSecurityAdmin")
    protected AmountType outstandingFiscSocialDebtsVersusSocialSecurityAdmin;
    @XmlElement(name = "TaxesPayable")
    protected AmountType taxesPayable;
    @XmlElement(name = "EstimatedFiscalDebts")
    protected AmountType estimatedFiscalDebts;
    @XmlElement(name = "ReceivFromDirectManagOtherControllingNonAffiliatCies")
    protected AmountType receivFromDirectManagOtherControllingNonAffiliatCies;
    @XmlElement(name = "DebtsinFavourDirectrsManagOthControlNonAffiliatedCies")
    protected AmountType debtsinFavourDirectrsManagOthControlNonAffiliatedCies;
    @XmlElement(name = "OthSignEngagmInFavrDirecManagOthControlNonAffilCies")
    protected AmountType othSignEngagmInFavrDirecManagOthControlNonAffilCies;
    @XmlElement(name = "TotalGuarantAmntPartDebtsCieOtherThenTechnRes")
    protected AmountType totalGuarantAmntPartDebtsCieOtherThenTechnRes;
    @XmlElement(name = "ComGuarantSuppliedorIrrevocPromisedbyCie")
    protected AmountType comGuarantSuppliedorIrrevocPromisedbyCie;
    @XmlElement(name = "ComPrivGuarantSuppliedbyAffiliatedCies")
    protected AmountType comPrivGuarantSuppliedbyAffiliatedCies;
    @XmlElement(name = "OthersSupplyingGuarantInChargeCie")
    protected AmountType othersSupplyingGuarantInChargeCie;
    @XmlElement(name = "TotalComPrivGuarSupplAsGuarantForDebtsForThirds")
    protected AmountType totalComPrivGuarSupplAsGuarantForDebtsForThirds;
    @XmlElement(name = "AffiliatedCompaniesSubsidiariesSubSubsidiaries")
    protected AmountType affiliatedCompaniesSubsidiariesSubSubsidiaries;
    @XmlElement(name = "OtherCompaniesWithAffiliation")
    protected AmountType otherCompaniesWithAffiliation;
    @XmlElement(name = "DirectorsorManagers")
    protected AmountType directorsorManagers;
    @XmlElement(name = "Others")
    protected AmountType others;
    @XmlElement(name = "TotalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed")
    protected AmountType totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed;
    @XmlElement(name = "FiscalAdministration")
    protected AmountType fiscalAdministration;
    @XmlElement(name = "SocialSecurityAdministration")
    protected AmountType socialSecurityAdministration;
    @XmlElement(name = "AverageNumberPersonnelQuantity")
    protected BigInteger averageNumberPersonnelQuantity;
    @XmlElement(name = "TotalWagesPensionsOtherPersonnelExpenses")
    protected AmountType totalWagesPensionsOtherPersonnelExpenses;
    @XmlElement(name = "Wages")
    protected AmountType wages;
    @XmlElement(name = "OtherDirectSocialAdvantages")
    protected AmountType otherDirectSocialAdvantages;
    @XmlElement(name = "EmployersSocialSecPremiums")
    protected AmountType employersSocialSecPremiums;
    @XmlElement(name = "OtherPersonnelExpenses")
    protected AmountType otherPersonnelExpenses;
    @XmlElement(name = "IncreaseProvisionsForPensions")
    protected AmountType increaseProvisionsForPensions;
    @XmlElement(name = "DecreaseProvisionsForPensions")
    protected AmountType decreaseProvisionsForPensions;
    @XmlElement(name = "IncreaseProvisionsForOtherWagesSocExpenses")
    protected AmountType increaseProvisionsForOtherWagesSocExpenses;
    @XmlElement(name = "DecreaseProvisionsForOtherWagesSocExpenses")
    protected AmountType decreaseProvisionsForOtherWagesSocExpenses;
    @XmlElement(name = "TotWagesPensionsForExDirectorsManagersEtc")
    protected AmountType totWagesPensionsForExDirectorsManagersEtc;
    @XmlElement(name = "TotalDistributionTaxesOnResultForPeriod")
    protected AmountType totalDistributionTaxesOnResultForPeriod;
    @XmlElement(name = "TotalTaxesOnResult")
    protected AmountType totalTaxesOnResult;
    @XmlElement(name = "PaidPrepaidTaxes")
    protected AmountType paidPrepaidTaxes;
    @XmlElement(name = "OnAssetsBookedOverPaidTaxes")
    protected AmountType onAssetsBookedOverPaidTaxes;
    @XmlElement(name = "ProvisionsForTaxes")
    protected AmountType provisionsForTaxes;
    @XmlElement(name = "TotalRegularisationsWithdrawals")
    protected AmountType totalRegularisationsWithdrawals;
    @XmlElement(name = "RegularisationsTaxes")
    protected AmountType regularisationsTaxes;
    @XmlElement(name = "WithdrawalOnFiscalProvisions")
    protected AmountType withdrawalOnFiscalProvisions;
    @XmlElement(name = "LandBuildingsFullyOwned")
    protected AmountType landBuildingsFullyOwned;
    @XmlElement(name = "LandBuildingsOther")
    protected AmountType landBuildingsOther;
    @XmlElement(name = "PlantMachineryEquipmentFullyOwned")
    protected AmountType plantMachineryEquipmentFullyOwned;
    @XmlElement(name = "PlantMachineryEquipmentOther")
    protected AmountType plantMachineryEquipmentOther;
    @XmlElement(name = "FurnitureVehiclesFullyOwned")
    protected AmountType furnitureVehiclesFullyOwned;
    @XmlElement(name = "FurnitureVehiclesOther")
    protected AmountType furnitureVehiclesOther;
    @XmlElement(name = "OtherTangibleAssetsFullyOwned")
    protected AmountType otherTangibleAssetsFullyOwned;
    @XmlElement(name = "OtherTangibleAssetsOther")
    protected AmountType otherTangibleAssetsOther;
    @XmlElement(name = "LongTermOtherReceivablesNoOrAbnormallyLowInterest")
    protected AmountType longTermOtherReceivablesNoOrAbnormallyLowInterest;
    @XmlElement(name = "ShortTermOtherReceivablesNoOrAbnormallyLowInterest")
    protected AmountType shortTermOtherReceivablesNoOrAbnormallyLowInterest;
    @XmlElement(name = "AdvancesReceivedOnContractsGuaranteedByPublicAuthorities")
    protected AmountType advancesReceivedOnContractsGuaranteedByPublicAuthorities;
    @XmlElement(name = "AdvancesReceivedOnContractsGuaranteedOnCompaniesAssets")
    protected AmountType advancesReceivedOnContractsGuaranteedOnCompaniesAssets;
    @XmlElement(name = "BookValueAccumulatedOfTheUncalledAmounts")
    protected AmountType bookValueAccumulatedOfTheUncalledAmounts;
    @XmlElement(name = "BookValueFinancialFixedAssetsEndOfThePreceedingYear")
    protected AmountType bookValueFinancialFixedAssetsEndOfThePreceedingYear;
    @XmlElement(name = "BookValueFinancialFixedAssetsEndOfTheYear")
    protected AmountType bookValueFinancialFixedAssetsEndOfTheYear;
    @XmlElement(name = "FinancialChargesOnDebts")
    protected AmountType financialChargesOnDebts;
    @XmlElement(name = "FinancialDebtsGuaranteedByPublicAuthorities")
    protected AmountType financialDebtsGuaranteedByPublicAuthorities;
    @XmlElement(name = "FinancialDebtsPayableOver5Years")
    protected AmountType financialDebtsPayableOver5Years;
    @XmlElement(name = "FixedIncomeSecurities")
    protected AmountType fixedIncomeSecurities;
    @XmlElement(name = "FixedIncomeSecuritiesIssuedByFinancialInstitutions")
    protected AmountType fixedIncomeSecuritiesIssuedByFinancialInstitutions;
    @XmlElement(name = "Fundsforasocialliabilitytocover")
    protected AmountType fundsforasocialliabilitytocover;
    @XmlElement(name = "FurnitureRollingEquipmentInfullownershipoftheassociation")
    protected AmountType furnitureRollingEquipmentInfullownershipoftheassociation;
    @XmlElement(name = "IncomeFromCurrentAssets")
    protected AmountType incomeFromCurrentAssets;
    @XmlElement(name = "IncomeFromFinancialFixedAssets")
    protected AmountType incomeFromFinancialFixedAssets;
    @XmlElement(name = "LandBuildingsInfullownershipoftheassociation")
    protected AmountType landBuildingsInfullownershipoftheassociation;
    @XmlElement(name = "MissionstaxadvicecarriedoutbypersonsconnectedwithCommissioner")
    protected AmountType missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner;
    @XmlElement(name = "MovementsInFinancialFixedAssetsForTheYear")
    protected AmountType movementsInFinancialFixedAssetsForTheYear;
    @XmlElement(name = "OtherAuditscarriedoutbypersonsconnectedwithCommissioner")
    protected AmountType otherAuditscarriedoutbypersonsconnectedwithCommissioner;
    @XmlElement(name = "OtherFinancialCharges")
    protected AmountType otherFinancialCharges;
    @XmlElement(name = "OtherFinancialIncome")
    protected AmountType otherFinancialIncome;
    @XmlElement(name = "OtherInvestments")
    protected AmountType otherInvestments;
    @XmlElement(name = "OtherMissionsConnectedwithCommissioner")
    protected AmountType otherMissionsConnectedwithCommissioner;
    @XmlElement(name = "OtherOperatingCharges")
    protected AmountType otherOperatingCharges;
    @XmlElement(name = "OthertangiblefixedassetsInfullownershipoftheassociation")
    protected AmountType othertangiblefixedassetsInfullownershipoftheassociation;
    @XmlElement(name = "PlantmachineryequipmentInthepropertyoftheassociation")
    protected AmountType plantmachineryequipmentInthepropertyoftheassociation;
    @XmlElement(name = "Remunerationscommissaryforextraordinactivities")
    protected AmountType remunerationscommissaryforextraordinactivities;
    @XmlElement(name = "ResidualTermOrNoticeOfWithdrawalBetween1Month1Year")
    protected AmountType residualTermOrNoticeOfWithdrawalBetween1Month1Year;
    @XmlElement(name = "ResidualTermOrNoticeOfWithdrawalLessOrEqualTo1Month")
    protected AmountType residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month;
    @XmlElement(name = "ResidualTermOrNoticeOfWithdrawalOver1Year")
    protected AmountType residualTermOrNoticeOfWithdrawalOver1Year;
    @XmlElement(name = "SalesMembershipGiftsLegaciesSubsidiesotheroperIncome")
    protected AmountType salesMembershipGiftsLegaciesSubsidiesotheroperIncome;
    @XmlElement(name = "TaxRemunerationSocialSecurity")
    protected AmountType taxRemunerationSocialSecurity;
    @XmlElement(name = "TaxesRemunerationSocialSecurity")
    protected AmountType taxesRemunerationSocialSecurity;
    @XmlElement(name = "TermAccountsWithFinancialInstitutions")
    protected AmountType termAccountsWithFinancialInstitutions;
    @XmlElement(name = "TradeDebtsGuaranteedOnTheCompanyAssets")
    protected AmountType tradeDebtsGuaranteedOnTheCompanyAssets;
    @XmlElement(name = "TradeDebtsPayableOver5Years")
    protected AmountType tradeDebtsPayableOver5Years;
    @XmlElement(name = "UncalledAmounts")
    protected AmountType uncalledAmounts;

    /**
     * Gets the value of the directorsRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectorsRemuneration() {
        return directorsRemuneration;
    }

    /**
     * Sets the value of the directorsRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectorsRemuneration(AmountType value) {
        this.directorsRemuneration = value;
    }

    /**
     * Gets the value of the employeesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeesQuantity() {
        return employeesQuantity;
    }

    /**
     * Sets the value of the employeesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeesQuantity(BigInteger value) {
        this.employeesQuantity = value;
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
     * Gets the value of the depreciation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepreciation() {
        return depreciation;
    }

    /**
     * Sets the value of the depreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepreciation(AmountType value) {
        this.depreciation = value;
    }

    /**
     * Gets the value of the auditorsRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditorsRemuneration() {
        return auditorsRemuneration;
    }

    /**
     * Sets the value of the auditorsRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditorsRemuneration(AmountType value) {
        this.auditorsRemuneration = value;
    }

    /**
     * Gets the value of the auditFee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditFee() {
        return auditFee;
    }

    /**
     * Sets the value of the auditFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditFee(AmountType value) {
        this.auditFee = value;
    }

    /**
     * Gets the value of the auditorsRemunerationNonAuditFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditorsRemunerationNonAuditFees() {
        return auditorsRemunerationNonAuditFees;
    }

    /**
     * Sets the value of the auditorsRemunerationNonAuditFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditorsRemunerationNonAuditFees(AmountType value) {
        this.auditorsRemunerationNonAuditFees = value;
    }

    /**
     * Gets the value of the remunerationChairman property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationChairman() {
        return remunerationChairman;
    }

    /**
     * Sets the value of the remunerationChairman property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationChairman(AmountType value) {
        this.remunerationChairman = value;
    }

    /**
     * Gets the value of the highestPaidDirector property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHighestPaidDirector() {
        return highestPaidDirector;
    }

    /**
     * Sets the value of the highestPaidDirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHighestPaidDirector(AmountType value) {
        this.highestPaidDirector = value;
    }

    /**
     * Gets the value of the operatingLeaseCommitmentsPlantMachinery property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOperatingLeaseCommitmentsPlantMachinery() {
        return operatingLeaseCommitmentsPlantMachinery;
    }

    /**
     * Sets the value of the operatingLeaseCommitmentsPlantMachinery property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOperatingLeaseCommitmentsPlantMachinery(AmountType value) {
        this.operatingLeaseCommitmentsPlantMachinery = value;
    }

    /**
     * Gets the value of the operatingLeaseCommitmentsLandBuilding property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOperatingLeaseCommitmentsLandBuilding() {
        return operatingLeaseCommitmentsLandBuilding;
    }

    /**
     * Sets the value of the operatingLeaseCommitmentsLandBuilding property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOperatingLeaseCommitmentsLandBuilding(AmountType value) {
        this.operatingLeaseCommitmentsLandBuilding = value;
    }

    /**
     * Gets the value of the totalOperatingLeaseCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOperatingLeaseCommitments() {
        return totalOperatingLeaseCommitments;
    }

    /**
     * Sets the value of the totalOperatingLeaseCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOperatingLeaseCommitments(AmountType value) {
        this.totalOperatingLeaseCommitments = value;
    }

    /**
     * Gets the value of the contingentDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getContingentDebts() {
        return contingentDebts;
    }

    /**
     * Sets the value of the contingentDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setContingentDebts(AmountType value) {
        this.contingentDebts = value;
    }

    /**
     * Gets the value of the marketValuePensionSchemeAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMarketValuePensionSchemeAssets() {
        return marketValuePensionSchemeAssets;
    }

    /**
     * Sets the value of the marketValuePensionSchemeAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMarketValuePensionSchemeAssets(AmountType value) {
        this.marketValuePensionSchemeAssets = value;
    }

    /**
     * Gets the value of the averagePaymentTimeDays property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAveragePaymentTimeDays() {
        return averagePaymentTimeDays;
    }

    /**
     * Sets the value of the averagePaymentTimeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAveragePaymentTimeDays(AmountType value) {
        this.averagePaymentTimeDays = value;
    }

    /**
     * Gets the value of the consolidatedSubsidiariesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConsolidatedSubsidiariesQuantity() {
        return consolidatedSubsidiariesQuantity;
    }

    /**
     * Sets the value of the consolidatedSubsidiariesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConsolidatedSubsidiariesQuantity(AmountType value) {
        this.consolidatedSubsidiariesQuantity = value;
    }

    /**
     * Gets the value of the memorandumAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMemorandumAccounts() {
        return memorandumAccounts;
    }

    /**
     * Sets the value of the memorandumAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMemorandumAccounts(AmountType value) {
        this.memorandumAccounts = value;
    }

    /**
     * Gets the value of the fixedAssetsDepreciationLiability property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedAssetsDepreciationLiability() {
        return fixedAssetsDepreciationLiability;
    }

    /**
     * Sets the value of the fixedAssetsDepreciationLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedAssetsDepreciationLiability(AmountType value) {
        this.fixedAssetsDepreciationLiability = value;
    }

    /**
     * Gets the value of the guaranteesGiven property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuaranteesGiven() {
        return guaranteesGiven;
    }

    /**
     * Sets the value of the guaranteesGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuaranteesGiven(AmountType value) {
        this.guaranteesGiven = value;
    }

    /**
     * Gets the value of the sureties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSureties() {
        return sureties;
    }

    /**
     * Sets the value of the sureties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSureties(AmountType value) {
        this.sureties = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEndorsements(AmountType value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the otherPersonalGuarantess property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPersonalGuarantess() {
        return otherPersonalGuarantess;
    }

    /**
     * Sets the value of the otherPersonalGuarantess property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPersonalGuarantess(AmountType value) {
        this.otherPersonalGuarantess = value;
    }

    /**
     * Gets the value of the collaterals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCollaterals() {
        return collaterals;
    }

    /**
     * Sets the value of the collaterals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCollaterals(AmountType value) {
        this.collaterals = value;
    }

    /**
     * Gets the value of the guaranteesReceived property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuaranteesReceived() {
        return guaranteesReceived;
    }

    /**
     * Sets the value of the guaranteesReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuaranteesReceived(AmountType value) {
        this.guaranteesReceived = value;
    }

    /**
     * Gets the value of the otherPersonalGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPersonalGuarantees() {
        return otherPersonalGuarantees;
    }

    /**
     * Sets the value of the otherPersonalGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPersonalGuarantees(AmountType value) {
        this.otherPersonalGuarantees = value;
    }

    /**
     * Gets the value of the guaranteesGivenByThirdPartiesInTheInterestOfTheCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuaranteesGivenByThirdPartiesInTheInterestOfTheCompany() {
        return guaranteesGivenByThirdPartiesInTheInterestOfTheCompany;
    }

    /**
     * Sets the value of the guaranteesGivenByThirdPartiesInTheInterestOfTheCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuaranteesGivenByThirdPartiesInTheInterestOfTheCompany(AmountType value) {
        this.guaranteesGivenByThirdPartiesInTheInterestOfTheCompany = value;
    }

    /**
     * Gets the value of the commitments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCommitments() {
        return commitments;
    }

    /**
     * Sets the value of the commitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCommitments(AmountType value) {
        this.commitments = value;
    }

    /**
     * Gets the value of the thirdPartyAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getThirdPartyAssets() {
        return thirdPartyAssets;
    }

    /**
     * Sets the value of the thirdPartyAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setThirdPartyAssets(AmountType value) {
        this.thirdPartyAssets = value;
    }

    /**
     * Gets the value of the securitiesLodgedWithThirdParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSecuritiesLodgedWithThirdParties() {
        return securitiesLodgedWithThirdParties;
    }

    /**
     * Sets the value of the securitiesLodgedWithThirdParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSecuritiesLodgedWithThirdParties(AmountType value) {
        this.securitiesLodgedWithThirdParties = value;
    }

    /**
     * Gets the value of the otherMemorandumAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherMemorandumAccounts() {
        return otherMemorandumAccounts;
    }

    /**
     * Sets the value of the otherMemorandumAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherMemorandumAccounts(AmountType value) {
        this.otherMemorandumAccounts = value;
    }

    /**
     * Gets the value of the acquisitionsFixedAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisitionsFixedAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquisitionsFixedAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAcquisitionsFixedAssets() {
        if (acquisitionsFixedAssets == null) {
            acquisitionsFixedAssets = new ArrayList<AmountType>();
        }
        return this.acquisitionsFixedAssets;
    }

    /**
     * Gets the value of the acquisitionsFromThirdParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acquisitionsFromThirdParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcquisitionsFromThirdParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAcquisitionsFromThirdParties() {
        if (acquisitionsFromThirdParties == null) {
            acquisitionsFromThirdParties = new ArrayList<AmountType>();
        }
        return this.acquisitionsFromThirdParties;
    }

    /**
     * Gets the value of the additions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAdditions() {
        if (additions == null) {
            additions = new ArrayList<AmountType>();
        }
        return this.additions;
    }

    /**
     * Gets the value of the adjustmentsToAmountsWrittenOff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentsToAmountsWrittenOff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentsToAmountsWrittenOff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAdjustmentsToAmountsWrittenOff() {
        if (adjustmentsToAmountsWrittenOff == null) {
            adjustmentsToAmountsWrittenOff = new ArrayList<AmountType>();
        }
        return this.adjustmentsToAmountsWrittenOff;
    }

    /**
     * Gets the value of the advancesReceivedOnContractsinProgressPayableOver5Years property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancesReceivedOnContractsinProgressPayableOver5Years property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancesReceivedOnContractsinProgressPayableOver5Years().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAdvancesReceivedOnContractsinProgressPayableOver5Years() {
        if (advancesReceivedOnContractsinProgressPayableOver5Years == null) {
            advancesReceivedOnContractsinProgressPayableOver5Years = new ArrayList<AmountType>();
        }
        return this.advancesReceivedOnContractsinProgressPayableOver5Years;
    }

    /**
     * Gets the value of the afterOneYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the afterOneYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAfterOneYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAfterOneYear() {
        if (afterOneYear == null) {
            afterOneYear = new ArrayList<AmountType>();
        }
        return this.afterOneYear;
    }

    /**
     * Gets the value of the amountsReceivable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountsReceivable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountsReceivable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAmountsReceivable() {
        if (amountsReceivable == null) {
            amountsReceivable = new ArrayList<AmountType>();
        }
        return this.amountsReceivable;
    }

    /**
     * Gets the value of the amountsReceivableOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountsReceivableOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountsReceivableOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAmountsReceivableOther() {
        if (amountsReceivableOther == null) {
            amountsReceivableOther = new ArrayList<AmountType>();
        }
        return this.amountsReceivableOther;
    }

    /**
     * Gets the value of the amountsReceivableSubordinated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountsReceivableSubordinated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountsReceivableSubordinated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAmountsReceivableSubordinated() {
        if (amountsReceivableSubordinated == null) {
            amountsReceivableSubordinated = new ArrayList<AmountType>();
        }
        return this.amountsReceivableSubordinated;
    }

    /**
     * Gets the value of the billsExchangePayable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billsExchangePayable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillsExchangePayable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getBillsExchangePayable() {
        if (billsExchangePayable == null) {
            billsExchangePayable = new ArrayList<AmountType>();
        }
        return this.billsExchangePayable;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelled property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelled().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getCancelled() {
        if (cancelled == null) {
            cancelled = new ArrayList<AmountType>();
        }
        return this.cancelled;
    }

    /**
     * Gets the value of the chargeForYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeForYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeForYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getChargeForYear() {
        if (chargeForYear == null) {
            chargeForYear = new ArrayList<AmountType>();
        }
        return this.chargeForYear;
    }

    /**
     * Gets the value of the deductions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDeductions() {
        if (deductions == null) {
            deductions = new ArrayList<AmountType>();
        }
        return this.deductions;
    }

    /**
     * Gets the value of the deductionsEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductionsEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductionsEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDeductionsEndYear() {
        if (deductionsEndYear == null) {
            deductionsEndYear = new ArrayList<AmountType>();
        }
        return this.deductionsEndYear;
    }

    /**
     * Gets the value of the deductionsStartYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deductionsStartYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeductionsStartYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDeductionsStartYear() {
        if (deductionsStartYear == null) {
            deductionsStartYear = new ArrayList<AmountType>();
        }
        return this.deductionsStartYear;
    }

    /**
     * Gets the value of the depreciationSimilarChargesEndPreviousYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depreciationSimilarChargesEndPreviousYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepreciationSimilarChargesEndPreviousYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDepreciationSimilarChargesEndPreviousYear() {
        if (depreciationSimilarChargesEndPreviousYear == null) {
            depreciationSimilarChargesEndPreviousYear = new ArrayList<AmountType>();
        }
        return this.depreciationSimilarChargesEndPreviousYear;
    }

    /**
     * Gets the value of the depreciationSimilarChargesEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depreciationSimilarChargesEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepreciationSimilarChargesEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getDepreciationSimilarChargesEndYear() {
        if (depreciationSimilarChargesEndYear == null) {
            depreciationSimilarChargesEndYear = new ArrayList<AmountType>();
        }
        return this.depreciationSimilarChargesEndYear;
    }

    /**
     * Gets the value of the assetsForPensionFundsManagedOnBehalfOfThirdParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetsForPensionFundsManagedOnBehalfOfThirdParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetsForPensionFundsManagedOnBehalfOfThirdParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAssetsForPensionFundsManagedOnBehalfOfThirdParties() {
        if (assetsForPensionFundsManagedOnBehalfOfThirdParties == null) {
            assetsForPensionFundsManagedOnBehalfOfThirdParties = new ArrayList<AmountType>();
        }
        return this.assetsForPensionFundsManagedOnBehalfOfThirdParties;
    }

    /**
     * Gets the value of the financialInstitutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialInstitutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialInstitutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getFinancialInstitutions() {
        if (financialInstitutions == null) {
            financialInstitutions = new ArrayList<AmountType>();
        }
        return this.financialInstitutions;
    }

    /**
     * Gets the value of the financialLeasingAgreements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialLeasingAgreements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialLeasingAgreements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getFinancialLeasingAgreements() {
        if (financialLeasingAgreements == null) {
            financialLeasingAgreements = new ArrayList<AmountType>();
        }
        return this.financialLeasingAgreements;
    }

    /**
     * Gets the value of the investments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the investments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvestments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getInvestments() {
        if (investments == null) {
            investments = new ArrayList<AmountType>();
        }
        return this.investments;
    }

    /**
     * Gets the value of the leasingOtherSimilarObligations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leasingOtherSimilarObligations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeasingOtherSimilarObligations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getLeasingOtherSimilarObligations() {
        if (leasingOtherSimilarObligations == null) {
            leasingOtherSimilarObligations = new ArrayList<AmountType>();
        }
        return this.leasingOtherSimilarObligations;
    }

    /**
     * Gets the value of the movementsForYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the movementsForYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMovementsForYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getMovementsForYear() {
        if (movementsForYear == null) {
            movementsForYear = new ArrayList<AmountType>();
        }
        return this.movementsForYear;
    }

    /**
     * Gets the value of the netBookValueStartYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netBookValueStartYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetBookValueStartYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getNetBookValueStartYear() {
        if (netBookValueStartYear == null) {
            netBookValueStartYear = new ArrayList<AmountType>();
        }
        return this.netBookValueStartYear;
    }

    /**
     * Gets the value of the netValueEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netValueEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetValueEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getNetValueEndYear() {
        if (netValueEndYear == null) {
            netValueEndYear = new ArrayList<AmountType>();
        }
        return this.netValueEndYear;
    }

    /**
     * Gets the value of the otherLoans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLoans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLoans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getOtherLoans() {
        if (otherLoans == null) {
            otherLoans = new ArrayList<AmountType>();
        }
        return this.otherLoans;
    }

    /**
     * Gets the value of the otherMovements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherMovements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherMovements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getOtherMovements() {
        if (otherMovements == null) {
            otherMovements = new ArrayList<AmountType>();
        }
        return this.otherMovements;
    }

    /**
     * Gets the value of the recordedForYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordedForYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedForYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRecordedForYear() {
        if (recordedForYear == null) {
            recordedForYear = new ArrayList<AmountType>();
        }
        return this.recordedForYear;
    }

    /**
     * Gets the value of the reimbursements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reimbursements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReimbursements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getReimbursements() {
        if (reimbursements == null) {
            reimbursements = new ArrayList<AmountType>();
        }
        return this.reimbursements;
    }

    /**
     * Gets the value of the revaluationSurplusesEndPreviousYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revaluationSurplusesEndPreviousYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevaluationSurplusesEndPreviousYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRevaluationSurplusesEndPreviousYear() {
        if (revaluationSurplusesEndPreviousYear == null) {
            revaluationSurplusesEndPreviousYear = new ArrayList<AmountType>();
        }
        return this.revaluationSurplusesEndPreviousYear;
    }

    /**
     * Gets the value of the revaluationSurplusesEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revaluationSurplusesEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevaluationSurplusesEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRevaluationSurplusesEndYear() {
        if (revaluationSurplusesEndYear == null) {
            revaluationSurplusesEndYear = new ArrayList<AmountType>();
        }
        return this.revaluationSurplusesEndYear;
    }

    /**
     * Gets the value of the salesDisposals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesDisposals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesDisposals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSalesDisposals() {
        if (salesDisposals == null) {
            salesDisposals = new ArrayList<AmountType>();
        }
        return this.salesDisposals;
    }

    /**
     * Gets the value of the suppliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suppliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuppliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSuppliers() {
        if (suppliers == null) {
            suppliers = new ArrayList<AmountType>();
        }
        return this.suppliers;
    }

    /**
     * Gets the value of the transfersBetweenItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transfersBetweenItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransfersBetweenItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTransfersBetweenItems() {
        if (transfersBetweenItems == null) {
            transfersBetweenItems = new ArrayList<AmountType>();
        }
        return this.transfersBetweenItems;
    }

    /**
     * Gets the value of the uncalledAmountsEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncalledAmountsEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUncalledAmountsEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getUncalledAmountsEndYear() {
        if (uncalledAmountsEndYear == null) {
            uncalledAmountsEndYear = new ArrayList<AmountType>();
        }
        return this.uncalledAmountsEndYear;
    }

    /**
     * Gets the value of the uncalledAmountsStartYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uncalledAmountsStartYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUncalledAmountsStartYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getUncalledAmountsStartYear() {
        if (uncalledAmountsStartYear == null) {
            uncalledAmountsStartYear = new ArrayList<AmountType>();
        }
        return this.uncalledAmountsStartYear;
    }

    /**
     * Gets the value of the unsubordinatedDebentures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsubordinatedDebentures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsubordinatedDebentures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getUnsubordinatedDebentures() {
        if (unsubordinatedDebentures == null) {
            unsubordinatedDebentures = new ArrayList<AmountType>();
        }
        return this.unsubordinatedDebentures;
    }

    /**
     * Gets the value of the valueAcquisitionsEndYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueAcquisitionsEndYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueAcquisitionsEndYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getValueAcquisitionsEndYear() {
        if (valueAcquisitionsEndYear == null) {
            valueAcquisitionsEndYear = new ArrayList<AmountType>();
        }
        return this.valueAcquisitionsEndYear;
    }

    /**
     * Gets the value of the valueAcquisitionsStartYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueAcquisitionsStartYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueAcquisitionsStartYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getValueAcquisitionsStartYear() {
        if (valueAcquisitionsStartYear == null) {
            valueAcquisitionsStartYear = new ArrayList<AmountType>();
        }
        return this.valueAcquisitionsStartYear;
    }

    /**
     * Gets the value of the vatTurnoverTaxSpecialTaxChargedbyCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatTurnoverTaxSpecialTaxChargedbyCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVATTurnoverTaxSpecialTaxChargedbyCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getVATTurnoverTaxSpecialTaxChargedbyCompany() {
        if (vatTurnoverTaxSpecialTaxChargedbyCompany == null) {
            vatTurnoverTaxSpecialTaxChargedbyCompany = new ArrayList<AmountType>();
        }
        return this.vatTurnoverTaxSpecialTaxChargedbyCompany;
    }

    /**
     * Gets the value of the vatTurnoverTaxSpecialTaxChargedToCompany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatTurnoverTaxSpecialTaxChargedToCompany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVATTurnoverTaxSpecialTaxChargedToCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getVATTurnoverTaxSpecialTaxChargedToCompany() {
        if (vatTurnoverTaxSpecialTaxChargedToCompany == null) {
            vatTurnoverTaxSpecialTaxChargedToCompany = new ArrayList<AmountType>();
        }
        return this.vatTurnoverTaxSpecialTaxChargedToCompany;
    }

    /**
     * Gets the value of the withinOneYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withinOneYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithinOneYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getWithinOneYear() {
        if (withinOneYear == null) {
            withinOneYear = new ArrayList<AmountType>();
        }
        return this.withinOneYear;
    }

    /**
     * Gets the value of the accumulatedDeductionsEndOfYear property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulatedDeductionsEndOfYear property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulatedDeductionsEndOfYear().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAccumulatedDeductionsEndOfYear() {
        if (accumulatedDeductionsEndOfYear == null) {
            accumulatedDeductionsEndOfYear = new ArrayList<AmountType>();
        }
        return this.accumulatedDeductionsEndOfYear;
    }

    /**
     * Gets the value of the amountsPayable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amountsPayable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmountsPayable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getAmountsPayable() {
        if (amountsPayable == null) {
            amountsPayable = new ArrayList<AmountType>();
        }
        return this.amountsPayable;
    }

    /**
     * Gets the value of the remunerationSocialSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunerationSocialSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunerationSocialSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRemunerationSocialSecurity() {
        if (remunerationSocialSecurity == null) {
            remunerationSocialSecurity = new ArrayList<AmountType>();
        }
        return this.remunerationSocialSecurity;
    }

    /**
     * Gets the value of the remunerationSpecialAssignmentsOtherAssignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunerationSpecialAssignmentsOtherAssignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunerationSpecialAssignmentsOtherAssignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRemunerationSpecialAssignmentsOtherAssignments() {
        if (remunerationSpecialAssignmentsOtherAssignments == null) {
            remunerationSpecialAssignmentsOtherAssignments = new ArrayList<AmountType>();
        }
        return this.remunerationSpecialAssignmentsOtherAssignments;
    }

    /**
     * Gets the value of the remunerationSpecialAssignmentsOtherCommands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunerationSpecialAssignmentsOtherCommands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunerationSpecialAssignmentsOtherCommands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRemunerationSpecialAssignmentsOtherCommands() {
        if (remunerationSpecialAssignmentsOtherCommands == null) {
            remunerationSpecialAssignmentsOtherCommands = new ArrayList<AmountType>();
        }
        return this.remunerationSpecialAssignmentsOtherCommands;
    }

    /**
     * Gets the value of the remunerationSpecialAssignmentsOtherControleopdarchten property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunerationSpecialAssignmentsOtherControleopdarchten property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunerationSpecialAssignmentsOtherControleopdarchten().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRemunerationSpecialAssignmentsOtherControleopdarchten() {
        if (remunerationSpecialAssignmentsOtherControleopdarchten == null) {
            remunerationSpecialAssignmentsOtherControleopdarchten = new ArrayList<AmountType>();
        }
        return this.remunerationSpecialAssignmentsOtherControleopdarchten;
    }

    /**
     * Gets the value of the remunerationSpecialAssignmentsTaxConsultancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remunerationSpecialAssignmentsTaxConsultancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemunerationSpecialAssignmentsTaxConsultancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getRemunerationSpecialAssignmentsTaxConsultancy() {
        if (remunerationSpecialAssignmentsTaxConsultancy == null) {
            remunerationSpecialAssignmentsTaxConsultancy = new ArrayList<AmountType>();
        }
        return this.remunerationSpecialAssignmentsTaxConsultancy;
    }

    /**
     * Gets the value of the shares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getShares() {
        if (shares == null) {
            shares = new ArrayList<AmountType>();
        }
        return this.shares;
    }

    /**
     * Gets the value of the subordinatedLoans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subordinatedLoans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubordinatedLoans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getSubordinatedLoans() {
        if (subordinatedLoans == null) {
            subordinatedLoans = new ArrayList<AmountType>();
        }
        return this.subordinatedLoans;
    }

    /**
     * Gets the value of the taxAuthorities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAuthorities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAuthorities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountType }
     * 
     * 
     */
    public List<AmountType> getTaxAuthorities() {
        if (taxAuthorities == null) {
            taxAuthorities = new ArrayList<AmountType>();
        }
        return this.taxAuthorities;
    }

    /**
     * Gets the value of the newExpensesIncurred property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNewExpensesIncurred() {
        return newExpensesIncurred;
    }

    /**
     * Sets the value of the newExpensesIncurred property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNewExpensesIncurred(AmountType value) {
        this.newExpensesIncurred = value;
    }

    /**
     * Gets the value of the formationCapitalIncreaseLoanIssueExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFormationCapitalIncreaseLoanIssueExpenses() {
        return formationCapitalIncreaseLoanIssueExpenses;
    }

    /**
     * Sets the value of the formationCapitalIncreaseLoanIssueExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFormationCapitalIncreaseLoanIssueExpenses(AmountType value) {
        this.formationCapitalIncreaseLoanIssueExpenses = value;
    }

    /**
     * Gets the value of the capitalizedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalizedInterest() {
        return capitalizedInterest;
    }

    /**
     * Sets the value of the capitalizedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalizedInterest(AmountType value) {
        this.capitalizedInterest = value;
    }

    /**
     * Gets the value of the reorganizationCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReorganizationCosts() {
        return reorganizationCosts;
    }

    /**
     * Sets the value of the reorganizationCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReorganizationCosts(AmountType value) {
        this.reorganizationCosts = value;
    }

    /**
     * Gets the value of the depreciationSimilarChargesStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepreciationSimilarChargesStartYear() {
        return depreciationSimilarChargesStartYear;
    }

    /**
     * Sets the value of the depreciationSimilarChargesStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepreciationSimilarChargesStartYear(AmountType value) {
        this.depreciationSimilarChargesStartYear = value;
    }

    /**
     * Gets the value of the tangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTangibleFixedAssets() {
        return tangibleFixedAssets;
    }

    /**
     * Sets the value of the tangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTangibleFixedAssets(AmountType value) {
        this.tangibleFixedAssets = value;
    }

    /**
     * Gets the value of the landBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandBuildings() {
        return landBuildings;
    }

    /**
     * Sets the value of the landBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandBuildings(AmountType value) {
        this.landBuildings = value;
    }

    /**
     * Gets the value of the plantMachineryEquipments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryEquipments() {
        return plantMachineryEquipments;
    }

    /**
     * Sets the value of the plantMachineryEquipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryEquipments(AmountType value) {
        this.plantMachineryEquipments = value;
    }

    /**
     * Gets the value of the furnitureVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureVehicles() {
        return furnitureVehicles;
    }

    /**
     * Sets the value of the furnitureVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureVehicles(AmountType value) {
        this.furnitureVehicles = value;
    }

    /**
     * Gets the value of the exchangeDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExchangeDifferences() {
        return exchangeDifferences;
    }

    /**
     * Sets the value of the exchangeDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExchangeDifferences(AmountType value) {
        this.exchangeDifferences = value;
    }

    /**
     * Gets the value of the issuedCapitalStartYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuedCapitalStartYear() {
        return issuedCapitalStartYear;
    }

    /**
     * Sets the value of the issuedCapitalStartYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuedCapitalStartYear(AmountType value) {
        this.issuedCapitalStartYear = value;
    }

    /**
     * Gets the value of the issuedCapitalEndYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIssuedCapitalEndYear() {
        return issuedCapitalEndYear;
    }

    /**
     * Sets the value of the issuedCapitalEndYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIssuedCapitalEndYear(AmountType value) {
        this.issuedCapitalEndYear = value;
    }

    /**
     * Gets the value of the numberRegisteredSharesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberRegisteredSharesQuantity() {
        return numberRegisteredSharesQuantity;
    }

    /**
     * Sets the value of the numberRegisteredSharesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberRegisteredSharesQuantity(BigInteger value) {
        this.numberRegisteredSharesQuantity = value;
    }

    /**
     * Gets the value of the numberBearerSharesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberBearerSharesQuantity() {
        return numberBearerSharesQuantity;
    }

    /**
     * Sets the value of the numberBearerSharesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberBearerSharesQuantity(BigInteger value) {
        this.numberBearerSharesQuantity = value;
    }

    /**
     * Gets the value of the uncalledUnpaidCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUncalledUnpaidCapital() {
        return uncalledUnpaidCapital;
    }

    /**
     * Sets the value of the uncalledUnpaidCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUncalledUnpaidCapital(AmountType value) {
        this.uncalledUnpaidCapital = value;
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
     * Gets the value of the amountOwnSharesHeldbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountOwnSharesHeldbyCompany() {
        return amountOwnSharesHeldbyCompany;
    }

    /**
     * Sets the value of the amountOwnSharesHeldbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountOwnSharesHeldbyCompany(AmountType value) {
        this.amountOwnSharesHeldbyCompany = value;
    }

    /**
     * Gets the value of the numberOwnSharesHeldbyCompanyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOwnSharesHeldbyCompanyQuantity() {
        return numberOwnSharesHeldbyCompanyQuantity;
    }

    /**
     * Sets the value of the numberOwnSharesHeldbyCompanyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOwnSharesHeldbyCompanyQuantity(BigInteger value) {
        this.numberOwnSharesHeldbyCompanyQuantity = value;
    }

    /**
     * Gets the value of the valueSubjectsSharesHeldbySubsidiaries property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getValueSubjectsSharesHeldbySubsidiaries() {
        return valueSubjectsSharesHeldbySubsidiaries;
    }

    /**
     * Sets the value of the valueSubjectsSharesHeldbySubsidiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setValueSubjectsSharesHeldbySubsidiaries(AmountType value) {
        this.valueSubjectsSharesHeldbySubsidiaries = value;
    }

    /**
     * Gets the value of the numberSubjectsSharesHeldbySubsidiariesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSubjectsSharesHeldbySubsidiariesQuantity() {
        return numberSubjectsSharesHeldbySubsidiariesQuantity;
    }

    /**
     * Sets the value of the numberSubjectsSharesHeldbySubsidiariesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSubjectsSharesHeldbySubsidiariesQuantity(BigInteger value) {
        this.numberSubjectsSharesHeldbySubsidiariesQuantity = value;
    }

    /**
     * Gets the value of the amountOutstandingConvertibleLoansUnderConversionRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountOutstandingConvertibleLoansUnderConversionRights() {
        return amountOutstandingConvertibleLoansUnderConversionRights;
    }

    /**
     * Sets the value of the amountOutstandingConvertibleLoansUnderConversionRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountOutstandingConvertibleLoansUnderConversionRights(AmountType value) {
        this.amountOutstandingConvertibleLoansUnderConversionRights = value;
    }

    /**
     * Gets the value of the amountCapitalToBeSubscribedUnderConversionRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountCapitalToBeSubscribedUnderConversionRights() {
        return amountCapitalToBeSubscribedUnderConversionRights;
    }

    /**
     * Sets the value of the amountCapitalToBeSubscribedUnderConversionRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountCapitalToBeSubscribedUnderConversionRights(AmountType value) {
        this.amountCapitalToBeSubscribedUnderConversionRights = value;
    }

    /**
     * Gets the value of the maximumNumberSharesToBeIssuedUnderConversionRightsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberSharesToBeIssuedUnderConversionRightsQuantity() {
        return maximumNumberSharesToBeIssuedUnderConversionRightsQuantity;
    }

    /**
     * Sets the value of the maximumNumberSharesToBeIssuedUnderConversionRightsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberSharesToBeIssuedUnderConversionRightsQuantity(BigInteger value) {
        this.maximumNumberSharesToBeIssuedUnderConversionRightsQuantity = value;
    }

    /**
     * Gets the value of the numberOutstandingSubscriptionRightsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOutstandingSubscriptionRightsQuantity() {
        return numberOutstandingSubscriptionRightsQuantity;
    }

    /**
     * Sets the value of the numberOutstandingSubscriptionRightsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOutstandingSubscriptionRightsQuantity(BigInteger value) {
        this.numberOutstandingSubscriptionRightsQuantity = value;
    }

    /**
     * Gets the value of the amountCapitalToBeSubscribedUnderSubscriptionRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountCapitalToBeSubscribedUnderSubscriptionRights() {
        return amountCapitalToBeSubscribedUnderSubscriptionRights;
    }

    /**
     * Sets the value of the amountCapitalToBeSubscribedUnderSubscriptionRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountCapitalToBeSubscribedUnderSubscriptionRights(AmountType value) {
        this.amountCapitalToBeSubscribedUnderSubscriptionRights = value;
    }

    /**
     * Gets the value of the maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity() {
        return maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity;
    }

    /**
     * Sets the value of the maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity(BigInteger value) {
        this.maximumNumberSharesToBeIssuedUnderSubscriptionRightsQuantity = value;
    }

    /**
     * Gets the value of the authorizedCapitalNotIssued property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuthorizedCapitalNotIssued() {
        return authorizedCapitalNotIssued;
    }

    /**
     * Sets the value of the authorizedCapitalNotIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuthorizedCapitalNotIssued(AmountType value) {
        this.authorizedCapitalNotIssued = value;
    }

    /**
     * Gets the value of the numberSharesIssuedNotRepresentingCapitalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSharesIssuedNotRepresentingCapitalQuantity() {
        return numberSharesIssuedNotRepresentingCapitalQuantity;
    }

    /**
     * Sets the value of the numberSharesIssuedNotRepresentingCapitalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSharesIssuedNotRepresentingCapitalQuantity(BigInteger value) {
        this.numberSharesIssuedNotRepresentingCapitalQuantity = value;
    }

    /**
     * Gets the value of the numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity() {
        return numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity;
    }

    /**
     * Sets the value of the numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity(BigInteger value) {
        this.numberVotingRightsOnIssuedSharesExcludedFromCapitalQuantity = value;
    }

    /**
     * Gets the value of the numberSharesHeldbyCompanyExcludedFromCapitalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSharesHeldbyCompanyExcludedFromCapitalQuantity() {
        return numberSharesHeldbyCompanyExcludedFromCapitalQuantity;
    }

    /**
     * Sets the value of the numberSharesHeldbyCompanyExcludedFromCapitalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSharesHeldbyCompanyExcludedFromCapitalQuantity(BigInteger value) {
        this.numberSharesHeldbyCompanyExcludedFromCapitalQuantity = value;
    }

    /**
     * Gets the value of the numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity() {
        return numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity;
    }

    /**
     * Sets the value of the numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity(BigInteger value) {
        this.numberSharesHeldbyItsSubsidiariesExcludedFromCapitalQuantity = value;
    }

    /**
     * Gets the value of the financialLongTermDebtsPayableinYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialLongTermDebtsPayableinYear() {
        return financialLongTermDebtsPayableinYear;
    }

    /**
     * Sets the value of the financialLongTermDebtsPayableinYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialLongTermDebtsPayableinYear(AmountType value) {
        this.financialLongTermDebtsPayableinYear = value;
    }

    /**
     * Gets the value of the longTermTradeDebtsPayableinYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermTradeDebtsPayableinYear() {
        return longTermTradeDebtsPayableinYear;
    }

    /**
     * Sets the value of the longTermTradeDebtsPayableinYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermTradeDebtsPayableinYear(AmountType value) {
        this.longTermTradeDebtsPayableinYear = value;
    }

    /**
     * Gets the value of the longTermAdvancesReceivedOnContractsinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermAdvancesReceivedOnContractsinProgress() {
        return longTermAdvancesReceivedOnContractsinProgress;
    }

    /**
     * Sets the value of the longTermAdvancesReceivedOnContractsinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermAdvancesReceivedOnContractsinProgress(AmountType value) {
        this.longTermAdvancesReceivedOnContractsinProgress = value;
    }

    /**
     * Gets the value of the otherLongTermAmountsPayableinYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLongTermAmountsPayableinYear() {
        return otherLongTermAmountsPayableinYear;
    }

    /**
     * Sets the value of the otherLongTermAmountsPayableinYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLongTermAmountsPayableinYear(AmountType value) {
        this.otherLongTermAmountsPayableinYear = value;
    }

    /**
     * Gets the value of the totalLongTermDebtsPayableinYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLongTermDebtsPayableinYear() {
        return totalLongTermDebtsPayableinYear;
    }

    /**
     * Sets the value of the totalLongTermDebtsPayableinYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLongTermDebtsPayableinYear(AmountType value) {
        this.totalLongTermDebtsPayableinYear = value;
    }

    /**
     * Gets the value of the financialDebtsPayableBetween15Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialDebtsPayableBetween15Years() {
        return financialDebtsPayableBetween15Years;
    }

    /**
     * Sets the value of the financialDebtsPayableBetween15Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialDebtsPayableBetween15Years(AmountType value) {
        this.financialDebtsPayableBetween15Years = value;
    }

    /**
     * Gets the value of the tradeDebtsPayableBetween15Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtsPayableBetween15Years() {
        return tradeDebtsPayableBetween15Years;
    }

    /**
     * Sets the value of the tradeDebtsPayableBetween15Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtsPayableBetween15Years(AmountType value) {
        this.tradeDebtsPayableBetween15Years = value;
    }

    /**
     * Gets the value of the otherAmountsPayableOver5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAmountsPayableOver5Years() {
        return otherAmountsPayableOver5Years;
    }

    /**
     * Sets the value of the otherAmountsPayableOver5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAmountsPayableOver5Years(AmountType value) {
        this.otherAmountsPayableOver5Years = value;
    }

    /**
     * Gets the value of the totalDebtsPayableOver5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalDebtsPayableOver5Years() {
        return totalDebtsPayableOver5Years;
    }

    /**
     * Sets the value of the totalDebtsPayableOver5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalDebtsPayableOver5Years(AmountType value) {
        this.totalDebtsPayableOver5Years = value;
    }

    /**
     * Gets the value of the tradeDebtsGuaranteedbyBLPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtsGuaranteedbyBLPublicAuthorities() {
        return tradeDebtsGuaranteedbyBLPublicAuthorities;
    }

    /**
     * Sets the value of the tradeDebtsGuaranteedbyBLPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtsGuaranteedbyBLPublicAuthorities(AmountType value) {
        this.tradeDebtsGuaranteedbyBLPublicAuthorities = value;
    }

    /**
     * Gets the value of the otherAmountsPayableGuaranteedbyBLPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAmountsPayableGuaranteedbyBLPublicAuthorities() {
        return otherAmountsPayableGuaranteedbyBLPublicAuthorities;
    }

    /**
     * Sets the value of the otherAmountsPayableGuaranteedbyBLPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAmountsPayableGuaranteedbyBLPublicAuthorities(AmountType value) {
        this.otherAmountsPayableGuaranteedbyBLPublicAuthorities = value;
    }

    /**
     * Gets the value of the totalGuaranteedbyBLPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalGuaranteedbyBLPublicAuthorities() {
        return totalGuaranteedbyBLPublicAuthorities;
    }

    /**
     * Sets the value of the totalGuaranteedbyBLPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalGuaranteedbyBLPublicAuthorities(AmountType value) {
        this.totalGuaranteedbyBLPublicAuthorities = value;
    }

    /**
     * Gets the value of the financialDebtsGuaranteedOnCompanysAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialDebtsGuaranteedOnCompanysAssets() {
        return financialDebtsGuaranteedOnCompanysAssets;
    }

    /**
     * Sets the value of the financialDebtsGuaranteedOnCompanysAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialDebtsGuaranteedOnCompanysAssets(AmountType value) {
        this.financialDebtsGuaranteedOnCompanysAssets = value;
    }

    /**
     * Gets the value of the otherAmountsPayableGuaranteedOnCompanysAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAmountsPayableGuaranteedOnCompanysAssets() {
        return otherAmountsPayableGuaranteedOnCompanysAssets;
    }

    /**
     * Sets the value of the otherAmountsPayableGuaranteedOnCompanysAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAmountsPayableGuaranteedOnCompanysAssets(AmountType value) {
        this.otherAmountsPayableGuaranteedOnCompanysAssets = value;
    }

    /**
     * Gets the value of the totalGuaranteedOnCompanysAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalGuaranteedOnCompanysAssets() {
        return totalGuaranteedOnCompanysAssets;
    }

    /**
     * Sets the value of the totalGuaranteedOnCompanysAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalGuaranteedOnCompanysAssets(AmountType value) {
        this.totalGuaranteedOnCompanysAssets = value;
    }

    /**
     * Gets the value of the amountsDueToTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsDueToTaxes() {
        return amountsDueToTaxes;
    }

    /**
     * Sets the value of the amountsDueToTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsDueToTaxes(AmountType value) {
        this.amountsDueToTaxes = value;
    }

    /**
     * Gets the value of the amountsNotDueToTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsNotDueToTaxes() {
        return amountsNotDueToTaxes;
    }

    /**
     * Sets the value of the amountsNotDueToTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsNotDueToTaxes(AmountType value) {
        this.amountsNotDueToTaxes = value;
    }

    /**
     * Gets the value of the estimatedTaxLiability property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedTaxLiability() {
        return estimatedTaxLiability;
    }

    /**
     * Sets the value of the estimatedTaxLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedTaxLiability(AmountType value) {
        this.estimatedTaxLiability = value;
    }

    /**
     * Gets the value of the amountDueToNationalOfficeSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountDueToNationalOfficeSocialSecurity() {
        return amountDueToNationalOfficeSocialSecurity;
    }

    /**
     * Sets the value of the amountDueToNationalOfficeSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountDueToNationalOfficeSocialSecurity(AmountType value) {
        this.amountDueToNationalOfficeSocialSecurity = value;
    }

    /**
     * Gets the value of the otherAmountsPayableForRemunerationSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAmountsPayableForRemunerationSocialSecurity() {
        return otherAmountsPayableForRemunerationSocialSecurity;
    }

    /**
     * Sets the value of the otherAmountsPayableForRemunerationSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAmountsPayableForRemunerationSocialSecurity(AmountType value) {
        this.otherAmountsPayableForRemunerationSocialSecurity = value;
    }

    /**
     * Gets the value of the grossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGrossProfit(AmountType value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the amountSubsidiesCompensationFromPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountSubsidiesCompensationFromPublicAuthorities() {
        return amountSubsidiesCompensationFromPublicAuthorities;
    }

    /**
     * Sets the value of the amountSubsidiesCompensationFromPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountSubsidiesCompensationFromPublicAuthorities(AmountType value) {
        this.amountSubsidiesCompensationFromPublicAuthorities = value;
    }

    /**
     * Gets the value of the membership property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMembership() {
        return membership;
    }

    /**
     * Sets the value of the membership property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMembership(AmountType value) {
        this.membership = value;
    }

    /**
     * Gets the value of the gifts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGifts() {
        return gifts;
    }

    /**
     * Sets the value of the gifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGifts(AmountType value) {
        this.gifts = value;
    }

    /**
     * Gets the value of the legacies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLegacies() {
        return legacies;
    }

    /**
     * Sets the value of the legacies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLegacies(AmountType value) {
        this.legacies = value;
    }

    /**
     * Gets the value of the capitalInterestSubsidies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalInterestSubsidies() {
        return capitalInterestSubsidies;
    }

    /**
     * Sets the value of the capitalInterestSubsidies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalInterestSubsidies(AmountType value) {
        this.capitalInterestSubsidies = value;
    }

    /**
     * Gets the value of the averageNumberEmployedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageNumberEmployedQuantity() {
        return averageNumberEmployedQuantity;
    }

    /**
     * Sets the value of the averageNumberEmployedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageNumberEmployedQuantity(BigInteger value) {
        this.averageNumberEmployedQuantity = value;
    }

    /**
     * Gets the value of the numberWorkersQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberWorkersQuantity() {
        return numberWorkersQuantity;
    }

    /**
     * Sets the value of the numberWorkersQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberWorkersQuantity(BigInteger value) {
        this.numberWorkersQuantity = value;
    }

    /**
     * Gets the value of the numberEmployeesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberEmployeesQuantity() {
        return numberEmployeesQuantity;
    }

    /**
     * Sets the value of the numberEmployeesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberEmployeesQuantity(BigInteger value) {
        this.numberEmployeesQuantity = value;
    }

    /**
     * Gets the value of the numberManagementQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberManagementQuantity() {
        return numberManagementQuantity;
    }

    /**
     * Sets the value of the numberManagementQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberManagementQuantity(BigInteger value) {
        this.numberManagementQuantity = value;
    }

    /**
     * Gets the value of the numberOtherEmployedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOtherEmployedQuantity() {
        return numberOtherEmployedQuantity;
    }

    /**
     * Sets the value of the numberOtherEmployedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOtherEmployedQuantity(BigInteger value) {
        this.numberOtherEmployedQuantity = value;
    }

    /**
     * Gets the value of the totalNumberEmployeesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberEmployeesQuantity() {
        return totalNumberEmployeesQuantity;
    }

    /**
     * Sets the value of the totalNumberEmployeesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberEmployeesQuantity(BigInteger value) {
        this.totalNumberEmployeesQuantity = value;
    }

    /**
     * Gets the value of the averageNumberEmployeesinFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageNumberEmployeesinFullTimeEquivalentsQuantity() {
        return averageNumberEmployeesinFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the averageNumberEmployeesinFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageNumberEmployeesinFullTimeEquivalentsQuantity(BigInteger value) {
        this.averageNumberEmployeesinFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursEmployQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursEmployQuantity() {
        return numberActualWorkingHoursEmployQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursEmployQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursEmployQuantity(BigInteger value) {
        this.numberActualWorkingHoursEmployQuantity = value;
    }

    /**
     * Gets the value of the remunerationDirectSocialBenefits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationDirectSocialBenefits() {
        return remunerationDirectSocialBenefits;
    }

    /**
     * Sets the value of the remunerationDirectSocialBenefits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationDirectSocialBenefits(AmountType value) {
        this.remunerationDirectSocialBenefits = value;
    }

    /**
     * Gets the value of the employersContributionForSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployersContributionForSocialSecurity() {
        return employersContributionForSocialSecurity;
    }

    /**
     * Sets the value of the employersContributionForSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployersContributionForSocialSecurity(AmountType value) {
        this.employersContributionForSocialSecurity = value;
    }

    /**
     * Gets the value of the employersPremiumForExtraStatutoryInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployersPremiumForExtraStatutoryInsurance() {
        return employersPremiumForExtraStatutoryInsurance;
    }

    /**
     * Sets the value of the employersPremiumForExtraStatutoryInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployersPremiumForExtraStatutoryInsurance(AmountType value) {
        this.employersPremiumForExtraStatutoryInsurance = value;
    }

    /**
     * Gets the value of the otherPersonnelCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPersonnelCharges() {
        return otherPersonnelCharges;
    }

    /**
     * Sets the value of the otherPersonnelCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPersonnelCharges(AmountType value) {
        this.otherPersonnelCharges = value;
    }

    /**
     * Gets the value of the pensions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPensions() {
        return pensions;
    }

    /**
     * Sets the value of the pensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPensions(AmountType value) {
        this.pensions = value;
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
     * Gets the value of the amountsWrittenOffStocksContractsinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsWrittenOffStocksContractsinProgress() {
        return amountsWrittenOffStocksContractsinProgress;
    }

    /**
     * Sets the value of the amountsWrittenOffStocksContractsinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsWrittenOffStocksContractsinProgress(AmountType value) {
        this.amountsWrittenOffStocksContractsinProgress = value;
    }

    /**
     * Gets the value of the adjustmentsToDeductionsFromStocksContractsinProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentsToDeductionsFromStocksContractsinProgress() {
        return adjustmentsToDeductionsFromStocksContractsinProgress;
    }

    /**
     * Sets the value of the adjustmentsToDeductionsFromStocksContractsinProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentsToDeductionsFromStocksContractsinProgress(AmountType value) {
        this.adjustmentsToDeductionsFromStocksContractsinProgress = value;
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
     * Gets the value of the adjustmentsToDeductionsFromTradeDebtors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentsToDeductionsFromTradeDebtors() {
        return adjustmentsToDeductionsFromTradeDebtors;
    }

    /**
     * Sets the value of the adjustmentsToDeductionsFromTradeDebtors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentsToDeductionsFromTradeDebtors(AmountType value) {
        this.adjustmentsToDeductionsFromTradeDebtors = value;
    }

    /**
     * Gets the value of the increaseProvisionsForLiabilitiesCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncreaseProvisionsForLiabilitiesCharges() {
        return increaseProvisionsForLiabilitiesCharges;
    }

    /**
     * Sets the value of the increaseProvisionsForLiabilitiesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncreaseProvisionsForLiabilitiesCharges(AmountType value) {
        this.increaseProvisionsForLiabilitiesCharges = value;
    }

    /**
     * Gets the value of the usedWrittenBackProvisionsForLiabilitiesCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUsedWrittenBackProvisionsForLiabilitiesCharges() {
        return usedWrittenBackProvisionsForLiabilitiesCharges;
    }

    /**
     * Sets the value of the usedWrittenBackProvisionsForLiabilitiesCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUsedWrittenBackProvisionsForLiabilitiesCharges(AmountType value) {
        this.usedWrittenBackProvisionsForLiabilitiesCharges = value;
    }

    /**
     * Gets the value of the taxesOnOperations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxesOnOperations() {
        return taxesOnOperations;
    }

    /**
     * Sets the value of the taxesOnOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxesOnOperations(AmountType value) {
        this.taxesOnOperations = value;
    }

    /**
     * Gets the value of the totNumberTempPersonPlacedDisposalCompanyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumberTempPersonPlacedDisposalCompanyQuantity() {
        return totNumberTempPersonPlacedDisposalCompanyQuantity;
    }

    /**
     * Sets the value of the totNumberTempPersonPlacedDisposalCompanyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumberTempPersonPlacedDisposalCompanyQuantity(BigInteger value) {
        this.totNumberTempPersonPlacedDisposalCompanyQuantity = value;
    }

    /**
     * Gets the value of the avNumberTempEmployeesinFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNumberTempEmployeesinFullTimeEquivalentsQuantity() {
        return avNumberTempEmployeesinFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the avNumberTempEmployeesinFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNumberTempEmployeesinFullTimeEquivalentsQuantity(BigInteger value) {
        this.avNumberTempEmployeesinFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursTemporaryPersonnelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursTemporaryPersonnelQuantity() {
        return numberActualWorkingHoursTemporaryPersonnelQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursTemporaryPersonnelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursTemporaryPersonnelQuantity(BigInteger value) {
        this.numberActualWorkingHoursTemporaryPersonnelQuantity = value;
    }

    /**
     * Gets the value of the chargesToCompanyForTemporaryPersonnel property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesToCompanyForTemporaryPersonnel() {
        return chargesToCompanyForTemporaryPersonnel;
    }

    /**
     * Sets the value of the chargesToCompanyForTemporaryPersonnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesToCompanyForTemporaryPersonnel(AmountType value) {
        this.chargesToCompanyForTemporaryPersonnel = value;
    }

    /**
     * Gets the value of the capitalSubsidiesCreditedForIncomeDuringYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalSubsidiesCreditedForIncomeDuringYear() {
        return capitalSubsidiesCreditedForIncomeDuringYear;
    }

    /**
     * Sets the value of the capitalSubsidiesCreditedForIncomeDuringYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalSubsidiesCreditedForIncomeDuringYear(AmountType value) {
        this.capitalSubsidiesCreditedForIncomeDuringYear = value;
    }

    /**
     * Gets the value of the interestSubsidiesCreditedForIncomeDuringYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterestSubsidiesCreditedForIncomeDuringYear() {
        return interestSubsidiesCreditedForIncomeDuringYear;
    }

    /**
     * Sets the value of the interestSubsidiesCreditedForIncomeDuringYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterestSubsidiesCreditedForIncomeDuringYear(AmountType value) {
        this.interestSubsidiesCreditedForIncomeDuringYear = value;
    }

    /**
     * Gets the value of the incomeFromExchangeTransferDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeFromExchangeTransferDifferences() {
        return incomeFromExchangeTransferDifferences;
    }

    /**
     * Sets the value of the incomeFromExchangeTransferDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeFromExchangeTransferDifferences(AmountType value) {
        this.incomeFromExchangeTransferDifferences = value;
    }

    /**
     * Gets the value of the incomeFromExchangeDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeFromExchangeDifferences() {
        return incomeFromExchangeDifferences;
    }

    /**
     * Sets the value of the incomeFromExchangeDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeFromExchangeDifferences(AmountType value) {
        this.incomeFromExchangeDifferences = value;
    }

    /**
     * Gets the value of the incomeFromTransferDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeFromTransferDifferences() {
        return incomeFromTransferDifferences;
    }

    /**
     * Sets the value of the incomeFromTransferDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeFromTransferDifferences(AmountType value) {
        this.incomeFromTransferDifferences = value;
    }

    /**
     * Gets the value of the depreciationCostsIssueLoansDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepreciationCostsIssueLoansDiscount() {
        return depreciationCostsIssueLoansDiscount;
    }

    /**
     * Sets the value of the depreciationCostsIssueLoansDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepreciationCostsIssueLoansDiscount(AmountType value) {
        this.depreciationCostsIssueLoansDiscount = value;
    }

    /**
     * Gets the value of the interestCreditedForAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterestCreditedForAssets() {
        return interestCreditedForAssets;
    }

    /**
     * Sets the value of the interestCreditedForAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterestCreditedForAssets(AmountType value) {
        this.interestCreditedForAssets = value;
    }

    /**
     * Gets the value of the deductionsFromCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeductionsFromCurrentAssets() {
        return deductionsFromCurrentAssets;
    }

    /**
     * Sets the value of the deductionsFromCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeductionsFromCurrentAssets(AmountType value) {
        this.deductionsFromCurrentAssets = value;
    }

    /**
     * Gets the value of the adjustmentsToDeductionsFromCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentsToDeductionsFromCurrentAssets() {
        return adjustmentsToDeductionsFromCurrentAssets;
    }

    /**
     * Sets the value of the adjustmentsToDeductionsFromCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentsToDeductionsFromCurrentAssets(AmountType value) {
        this.adjustmentsToDeductionsFromCurrentAssets = value;
    }

    /**
     * Gets the value of the discountsNegotiatedOnAmountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountsNegotiatedOnAmountsReceivable() {
        return discountsNegotiatedOnAmountsReceivable;
    }

    /**
     * Sets the value of the discountsNegotiatedOnAmountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscountsNegotiatedOnAmountsReceivable(AmountType value) {
        this.discountsNegotiatedOnAmountsReceivable = value;
    }

    /**
     * Gets the value of the financialProvisionsCreated property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialProvisionsCreated() {
        return financialProvisionsCreated;
    }

    /**
     * Sets the value of the financialProvisionsCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialProvisionsCreated(AmountType value) {
        this.financialProvisionsCreated = value;
    }

    /**
     * Gets the value of the financialProvisionsUsedorWithdrawn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialProvisionsUsedorWithdrawn() {
        return financialProvisionsUsedorWithdrawn;
    }

    /**
     * Sets the value of the financialProvisionsUsedorWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialProvisionsUsedorWithdrawn(AmountType value) {
        this.financialProvisionsUsedorWithdrawn = value;
    }

    /**
     * Gets the value of the financialProvisionsCreatedUsedorWithdrawn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialProvisionsCreatedUsedorWithdrawn() {
        return financialProvisionsCreatedUsedorWithdrawn;
    }

    /**
     * Sets the value of the financialProvisionsCreatedUsedorWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialProvisionsCreatedUsedorWithdrawn(AmountType value) {
        this.financialProvisionsCreatedUsedorWithdrawn = value;
    }

    /**
     * Gets the value of the chargesFromExchangeTransferDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesFromExchangeTransferDifferences() {
        return chargesFromExchangeTransferDifferences;
    }

    /**
     * Sets the value of the chargesFromExchangeTransferDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesFromExchangeTransferDifferences(AmountType value) {
        this.chargesFromExchangeTransferDifferences = value;
    }

    /**
     * Gets the value of the chargesFromExchangeDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesFromExchangeDifferences() {
        return chargesFromExchangeDifferences;
    }

    /**
     * Sets the value of the chargesFromExchangeDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesFromExchangeDifferences(AmountType value) {
        this.chargesFromExchangeDifferences = value;
    }

    /**
     * Gets the value of the chargesFromTransferDifferences property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesFromTransferDifferences() {
        return chargesFromTransferDifferences;
    }

    /**
     * Sets the value of the chargesFromTransferDifferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesFromTransferDifferences(AmountType value) {
        this.chargesFromTransferDifferences = value;
    }

    /**
     * Gets the value of the incomeTaxForCurrentYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeTaxForCurrentYear() {
        return incomeTaxForCurrentYear;
    }

    /**
     * Sets the value of the incomeTaxForCurrentYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeTaxForCurrentYear(AmountType value) {
        this.incomeTaxForCurrentYear = value;
    }

    /**
     * Gets the value of the taxDeferredTaxDueorPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxDeferredTaxDueorPaid() {
        return taxDeferredTaxDueorPaid;
    }

    /**
     * Sets the value of the taxDeferredTaxDueorPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxDeferredTaxDueorPaid(AmountType value) {
        this.taxDeferredTaxDueorPaid = value;
    }

    /**
     * Gets the value of the excessPrepaidDeferredTaxIncludedinAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExcessPrepaidDeferredTaxIncludedinAssets() {
        return excessPrepaidDeferredTaxIncludedinAssets;
    }

    /**
     * Sets the value of the excessPrepaidDeferredTaxIncludedinAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExcessPrepaidDeferredTaxIncludedinAssets(AmountType value) {
        this.excessPrepaidDeferredTaxIncludedinAssets = value;
    }

    /**
     * Gets the value of the estimatedAdditionalChargesForIncomeTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedAdditionalChargesForIncomeTax() {
        return estimatedAdditionalChargesForIncomeTax;
    }

    /**
     * Sets the value of the estimatedAdditionalChargesForIncomeTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedAdditionalChargesForIncomeTax(AmountType value) {
        this.estimatedAdditionalChargesForIncomeTax = value;
    }

    /**
     * Gets the value of the incomeTaxForPriorYears property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeTaxForPriorYears() {
        return incomeTaxForPriorYears;
    }

    /**
     * Sets the value of the incomeTaxForPriorYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeTaxForPriorYears(AmountType value) {
        this.incomeTaxForPriorYears = value;
    }

    /**
     * Gets the value of the additionalChargesForIncomeTaxDueorPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdditionalChargesForIncomeTaxDueorPaid() {
        return additionalChargesForIncomeTaxDueorPaid;
    }

    /**
     * Sets the value of the additionalChargesForIncomeTaxDueorPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdditionalChargesForIncomeTaxDueorPaid(AmountType value) {
        this.additionalChargesForIncomeTaxDueorPaid = value;
    }

    /**
     * Gets the value of the estimatedAdditionalChargesForIncomeTaxForPriorYears property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedAdditionalChargesForIncomeTaxForPriorYears() {
        return estimatedAdditionalChargesForIncomeTaxForPriorYears;
    }

    /**
     * Sets the value of the estimatedAdditionalChargesForIncomeTaxForPriorYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedAdditionalChargesForIncomeTaxForPriorYears(AmountType value) {
        this.estimatedAdditionalChargesForIncomeTaxForPriorYears = value;
    }

    /**
     * Gets the value of the activeSourcesPossibleFutureTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getActiveSourcesPossibleFutureTaxes() {
        return activeSourcesPossibleFutureTaxes;
    }

    /**
     * Sets the value of the activeSourcesPossibleFutureTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setActiveSourcesPossibleFutureTaxes(AmountType value) {
        this.activeSourcesPossibleFutureTaxes = value;
    }

    /**
     * Gets the value of the accumulatedTaxLossesDeductibleFromFutureProfits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccumulatedTaxLossesDeductibleFromFutureProfits() {
        return accumulatedTaxLossesDeductibleFromFutureProfits;
    }

    /**
     * Sets the value of the accumulatedTaxLossesDeductibleFromFutureProfits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccumulatedTaxLossesDeductibleFromFutureProfits(AmountType value) {
        this.accumulatedTaxLossesDeductibleFromFutureProfits = value;
    }

    /**
     * Gets the value of the passiveSourcesPossibleFutureTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPassiveSourcesPossibleFutureTaxes() {
        return passiveSourcesPossibleFutureTaxes;
    }

    /**
     * Sets the value of the passiveSourcesPossibleFutureTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPassiveSourcesPossibleFutureTaxes(AmountType value) {
        this.passiveSourcesPossibleFutureTaxes = value;
    }

    /**
     * Gets the value of the amountsHeldForThirdPartiesForDeferredTaxOnPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsHeldForThirdPartiesForDeferredTaxOnPayroll() {
        return amountsHeldForThirdPartiesForDeferredTaxOnPayroll;
    }

    /**
     * Sets the value of the amountsHeldForThirdPartiesForDeferredTaxOnPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsHeldForThirdPartiesForDeferredTaxOnPayroll(AmountType value) {
        this.amountsHeldForThirdPartiesForDeferredTaxOnPayroll = value;
    }

    /**
     * Gets the value of the amountsHeldForThirdPartiesForDeferredTaxOnInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsHeldForThirdPartiesForDeferredTaxOnInvestments() {
        return amountsHeldForThirdPartiesForDeferredTaxOnInvestments;
    }

    /**
     * Sets the value of the amountsHeldForThirdPartiesForDeferredTaxOnInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsHeldForThirdPartiesForDeferredTaxOnInvestments(AmountType value) {
        this.amountsHeldForThirdPartiesForDeferredTaxOnInvestments = value;
    }

    /**
     * Gets the value of the personalGuaranteesGivenbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonalGuaranteesGivenbyCompany() {
        return personalGuaranteesGivenbyCompany;
    }

    /**
     * Sets the value of the personalGuaranteesGivenbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonalGuaranteesGivenbyCompany(AmountType value) {
        this.personalGuaranteesGivenbyCompany = value;
    }

    /**
     * Gets the value of the billsExchangeEndorsedbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBillsExchangeEndorsedbyCompany() {
        return billsExchangeEndorsedbyCompany;
    }

    /**
     * Sets the value of the billsExchangeEndorsedbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBillsExchangeEndorsedbyCompany(AmountType value) {
        this.billsExchangeEndorsedbyCompany = value;
    }

    /**
     * Gets the value of the realGuaranteesGivenbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealGuaranteesGivenbyCompany() {
        return realGuaranteesGivenbyCompany;
    }

    /**
     * Sets the value of the realGuaranteesGivenbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealGuaranteesGivenbyCompany(AmountType value) {
        this.realGuaranteesGivenbyCompany = value;
    }

    /**
     * Gets the value of the otherThirdPartyDebtsGuaranteedbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherThirdPartyDebtsGuaranteedbyCompany() {
        return otherThirdPartyDebtsGuaranteedbyCompany;
    }

    /**
     * Sets the value of the otherThirdPartyDebtsGuaranteedbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherThirdPartyDebtsGuaranteedbyCompany(AmountType value) {
        this.otherThirdPartyDebtsGuaranteedbyCompany = value;
    }

    /**
     * Gets the value of the maximumAmountForWhichThirdPartyDebtsAreGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAmountForWhichThirdPartyDebtsAreGuaranteed() {
        return maximumAmountForWhichThirdPartyDebtsAreGuaranteed;
    }

    /**
     * Sets the value of the maximumAmountForWhichThirdPartyDebtsAreGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumAmountForWhichThirdPartyDebtsAreGuaranteed(AmountType value) {
        this.maximumAmountForWhichThirdPartyDebtsAreGuaranteed = value;
    }

    /**
     * Gets the value of the netValuePropertySecuredUnderMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetValuePropertySecuredUnderMortgages() {
        return netValuePropertySecuredUnderMortgages;
    }

    /**
     * Sets the value of the netValuePropertySecuredUnderMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetValuePropertySecuredUnderMortgages(AmountType value) {
        this.netValuePropertySecuredUnderMortgages = value;
    }

    /**
     * Gets the value of the totalAmountMortgagesRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmountMortgagesRegistered() {
        return totalAmountMortgagesRegistered;
    }

    /**
     * Sets the value of the totalAmountMortgagesRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmountMortgagesRegistered(AmountType value) {
        this.totalAmountMortgagesRegistered = value;
    }

    /**
     * Gets the value of the totalAmountBusinessGuaranteesRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmountBusinessGuaranteesRegistered() {
        return totalAmountBusinessGuaranteesRegistered;
    }

    /**
     * Sets the value of the totalAmountBusinessGuaranteesRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmountBusinessGuaranteesRegistered(AmountType value) {
        this.totalAmountBusinessGuaranteesRegistered = value;
    }

    /**
     * Gets the value of the netValueOtherAssetsSecuredUnderGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetValueOtherAssetsSecuredUnderGuarantees() {
        return netValueOtherAssetsSecuredUnderGuarantees;
    }

    /**
     * Sets the value of the netValueOtherAssetsSecuredUnderGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetValueOtherAssetsSecuredUnderGuarantees(AmountType value) {
        this.netValueOtherAssetsSecuredUnderGuarantees = value;
    }

    /**
     * Gets the value of the amountFutureAssetsSecuredUnderGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountFutureAssetsSecuredUnderGuarantees() {
        return amountFutureAssetsSecuredUnderGuarantees;
    }

    /**
     * Sets the value of the amountFutureAssetsSecuredUnderGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountFutureAssetsSecuredUnderGuarantees(AmountType value) {
        this.amountFutureAssetsSecuredUnderGuarantees = value;
    }

    /**
     * Gets the value of the netValuePropertySecuredUnderThirdPartyMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetValuePropertySecuredUnderThirdPartyMortgages() {
        return netValuePropertySecuredUnderThirdPartyMortgages;
    }

    /**
     * Sets the value of the netValuePropertySecuredUnderThirdPartyMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetValuePropertySecuredUnderThirdPartyMortgages(AmountType value) {
        this.netValuePropertySecuredUnderThirdPartyMortgages = value;
    }

    /**
     * Gets the value of the totalAmountThirdPartyMortgagesRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmountThirdPartyMortgagesRegistered() {
        return totalAmountThirdPartyMortgagesRegistered;
    }

    /**
     * Sets the value of the totalAmountThirdPartyMortgagesRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmountThirdPartyMortgagesRegistered(AmountType value) {
        this.totalAmountThirdPartyMortgagesRegistered = value;
    }

    /**
     * Gets the value of the totalAmountThirdPartyGuaranteesRegistered property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmountThirdPartyGuaranteesRegistered() {
        return totalAmountThirdPartyGuaranteesRegistered;
    }

    /**
     * Sets the value of the totalAmountThirdPartyGuaranteesRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmountThirdPartyGuaranteesRegistered(AmountType value) {
        this.totalAmountThirdPartyGuaranteesRegistered = value;
    }

    /**
     * Gets the value of the netValueOtherAssetsSecuredUnderThirdPartyGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetValueOtherAssetsSecuredUnderThirdPartyGuarantees() {
        return netValueOtherAssetsSecuredUnderThirdPartyGuarantees;
    }

    /**
     * Sets the value of the netValueOtherAssetsSecuredUnderThirdPartyGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetValueOtherAssetsSecuredUnderThirdPartyGuarantees(AmountType value) {
        this.netValueOtherAssetsSecuredUnderThirdPartyGuarantees = value;
    }

    /**
     * Gets the value of the amountFutureAssetsSecuredUnderThirdPartyGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountFutureAssetsSecuredUnderThirdPartyGuarantees() {
        return amountFutureAssetsSecuredUnderThirdPartyGuarantees;
    }

    /**
     * Sets the value of the amountFutureAssetsSecuredUnderThirdPartyGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountFutureAssetsSecuredUnderThirdPartyGuarantees(AmountType value) {
        this.amountFutureAssetsSecuredUnderThirdPartyGuarantees = value;
    }

    /**
     * Gets the value of the stockPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStockPurchased() {
        return stockPurchased;
    }

    /**
     * Sets the value of the stockPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStockPurchased(AmountType value) {
        this.stockPurchased = value;
    }

    /**
     * Gets the value of the stockSold property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStockSold() {
        return stockSold;
    }

    /**
     * Sets the value of the stockSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStockSold(AmountType value) {
        this.stockSold = value;
    }

    /**
     * Gets the value of the currenciesPurchased property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrenciesPurchased() {
        return currenciesPurchased;
    }

    /**
     * Sets the value of the currenciesPurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrenciesPurchased(AmountType value) {
        this.currenciesPurchased = value;
    }

    /**
     * Gets the value of the currenciesSold property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrenciesSold() {
        return currenciesSold;
    }

    /**
     * Sets the value of the currenciesSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrenciesSold(AmountType value) {
        this.currenciesSold = value;
    }

    /**
     * Gets the value of the groupCompaniesFinancialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroupCompaniesFinancialFixedAssets() {
        return groupCompaniesFinancialFixedAssets;
    }

    /**
     * Sets the value of the groupCompaniesFinancialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroupCompaniesFinancialFixedAssets(AmountType value) {
        this.groupCompaniesFinancialFixedAssets = value;
    }

    /**
     * Gets the value of the currentInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentInvestments() {
        return currentInvestments;
    }

    /**
     * Sets the value of the currentInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentInvestments(AmountType value) {
        this.currentInvestments = value;
    }

    /**
     * Gets the value of the debtsCommitmentsGuaranteedbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsCommitmentsGuaranteedbyCompany() {
        return debtsCommitmentsGuaranteedbyCompany;
    }

    /**
     * Sets the value of the debtsCommitmentsGuaranteedbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsCommitmentsGuaranteedbyCompany(AmountType value) {
        this.debtsCommitmentsGuaranteedbyCompany = value;
    }

    /**
     * Gets the value of the debtsCommitmentsGuaranteedOnBehalfGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsCommitmentsGuaranteedOnBehalfGroupCompanies() {
        return debtsCommitmentsGuaranteedOnBehalfGroupCompanies;
    }

    /**
     * Sets the value of the debtsCommitmentsGuaranteedOnBehalfGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsCommitmentsGuaranteedOnBehalfGroupCompanies(AmountType value) {
        this.debtsCommitmentsGuaranteedOnBehalfGroupCompanies = value;
    }

    /**
     * Gets the value of the debtsCommitmentsCompanyGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsCommitmentsCompanyGuaranteed() {
        return debtsCommitmentsCompanyGuaranteed;
    }

    /**
     * Sets the value of the debtsCommitmentsCompanyGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsCommitmentsCompanyGuaranteed(AmountType value) {
        this.debtsCommitmentsCompanyGuaranteed = value;
    }

    /**
     * Gets the value of the otherFinancialCommitments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialCommitments() {
        return otherFinancialCommitments;
    }

    /**
     * Sets the value of the otherFinancialCommitments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialCommitments(AmountType value) {
        this.otherFinancialCommitments = value;
    }

    /**
     * Gets the value of the otherCommitmentsOnBehalfGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCommitmentsOnBehalfGroupCompanies() {
        return otherCommitmentsOnBehalfGroupCompanies;
    }

    /**
     * Sets the value of the otherCommitmentsOnBehalfGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCommitmentsOnBehalfGroupCompanies(AmountType value) {
        this.otherCommitmentsOnBehalfGroupCompanies = value;
    }

    /**
     * Gets the value of the excessRevaluationOnDisposalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExcessRevaluationOnDisposalFixedAssets() {
        return excessRevaluationOnDisposalFixedAssets;
    }

    /**
     * Sets the value of the excessRevaluationOnDisposalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExcessRevaluationOnDisposalFixedAssets(AmountType value) {
        this.excessRevaluationOnDisposalFixedAssets = value;
    }

    /**
     * Gets the value of the excessDevaluationOnDisposalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExcessDevaluationOnDisposalFixedAssets() {
        return excessDevaluationOnDisposalFixedAssets;
    }

    /**
     * Sets the value of the excessDevaluationOnDisposalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExcessDevaluationOnDisposalFixedAssets(AmountType value) {
        this.excessDevaluationOnDisposalFixedAssets = value;
    }

    /**
     * Gets the value of the nonGroupCompaniesFinancialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonGroupCompaniesFinancialFixedAssets() {
        return nonGroupCompaniesFinancialFixedAssets;
    }

    /**
     * Sets the value of the nonGroupCompaniesFinancialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonGroupCompaniesFinancialFixedAssets(AmountType value) {
        this.nonGroupCompaniesFinancialFixedAssets = value;
    }

    /**
     * Gets the value of the disposalFixedAssetsRevaluationSurplusesIssued property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDisposalFixedAssetsRevaluationSurplusesIssued() {
        return disposalFixedAssetsRevaluationSurplusesIssued;
    }

    /**
     * Sets the value of the disposalFixedAssetsRevaluationSurplusesIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDisposalFixedAssetsRevaluationSurplusesIssued(AmountType value) {
        this.disposalFixedAssetsRevaluationSurplusesIssued = value;
    }

    /**
     * Gets the value of the devaluationSurplusesIssued property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDevaluationSurplusesIssued() {
        return devaluationSurplusesIssued;
    }

    /**
     * Sets the value of the devaluationSurplusesIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDevaluationSurplusesIssued(AmountType value) {
        this.devaluationSurplusesIssued = value;
    }

    /**
     * Gets the value of the pensionsFundedbyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPensionsFundedbyCompany() {
        return pensionsFundedbyCompany;
    }

    /**
     * Sets the value of the pensionsFundedbyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPensionsFundedbyCompany(AmountType value) {
        this.pensionsFundedbyCompany = value;
    }

    /**
     * Gets the value of the receivablesFromDirectorsLessThanOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromDirectorsLessThanOneYear() {
        return receivablesFromDirectorsLessThanOneYear;
    }

    /**
     * Sets the value of the receivablesFromDirectorsLessThanOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromDirectorsLessThanOneYear(AmountType value) {
        this.receivablesFromDirectorsLessThanOneYear = value;
    }

    /**
     * Gets the value of the guaranteesGivenOnBehalfDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuaranteesGivenOnBehalfDirectors() {
        return guaranteesGivenOnBehalfDirectors;
    }

    /**
     * Sets the value of the guaranteesGivenOnBehalfDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuaranteesGivenOnBehalfDirectors(AmountType value) {
        this.guaranteesGivenOnBehalfDirectors = value;
    }

    /**
     * Gets the value of the otherSignificantCommitmentsUndertakeninFavorDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherSignificantCommitmentsUndertakeninFavorDirectors() {
        return otherSignificantCommitmentsUndertakeninFavorDirectors;
    }

    /**
     * Sets the value of the otherSignificantCommitmentsUndertakeninFavorDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherSignificantCommitmentsUndertakeninFavorDirectors(AmountType value) {
        this.otherSignificantCommitmentsUndertakeninFavorDirectors = value;
    }

    /**
     * Gets the value of the directIndirectRemunerationPensionsToDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectIndirectRemunerationPensionsToDirectors() {
        return directIndirectRemunerationPensionsToDirectors;
    }

    /**
     * Sets the value of the directIndirectRemunerationPensionsToDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectIndirectRemunerationPensionsToDirectors(AmountType value) {
        this.directIndirectRemunerationPensionsToDirectors = value;
    }

    /**
     * Gets the value of the directIndirectRemunerationPensionsToFormerDirectors property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectIndirectRemunerationPensionsToFormerDirectors() {
        return directIndirectRemunerationPensionsToFormerDirectors;
    }

    /**
     * Sets the value of the directIndirectRemunerationPensionsToFormerDirectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectIndirectRemunerationPensionsToFormerDirectors(AmountType value) {
        this.directIndirectRemunerationPensionsToFormerDirectors = value;
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
     * Gets the value of the auditorFeesExceptionalOther property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditorFeesExceptionalOther() {
        return auditorFeesExceptionalOther;
    }

    /**
     * Sets the value of the auditorFeesExceptionalOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditorFeesExceptionalOther(AmountType value) {
        this.auditorFeesExceptionalOther = value;
    }

    /**
     * Gets the value of the auditorFeesExceptionalTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditorFeesExceptionalTax() {
        return auditorFeesExceptionalTax;
    }

    /**
     * Sets the value of the auditorFeesExceptionalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditorFeesExceptionalTax(AmountType value) {
        this.auditorFeesExceptionalTax = value;
    }

    /**
     * Gets the value of the auditorFeesExceptionalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAuditorFeesExceptionalGroup() {
        return auditorFeesExceptionalGroup;
    }

    /**
     * Sets the value of the auditorFeesExceptionalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAuditorFeesExceptionalGroup(AmountType value) {
        this.auditorFeesExceptionalGroup = value;
    }

    /**
     * Gets the value of the otherAuditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAuditAmount() {
        return otherAuditAmount;
    }

    /**
     * Sets the value of the otherAuditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAuditAmount(AmountType value) {
        this.otherAuditAmount = value;
    }

    /**
     * Gets the value of the missionTaxAdviceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMissionTaxAdviceAmount() {
        return missionTaxAdviceAmount;
    }

    /**
     * Sets the value of the missionTaxAdviceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMissionTaxAdviceAmount(AmountType value) {
        this.missionTaxAdviceAmount = value;
    }

    /**
     * Gets the value of the otherAssignOutsideAuditingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssignOutsideAuditingAmount() {
        return otherAssignOutsideAuditingAmount;
    }

    /**
     * Sets the value of the otherAssignOutsideAuditingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssignOutsideAuditingAmount(AmountType value) {
        this.otherAssignOutsideAuditingAmount = value;
    }

    /**
     * Gets the value of the netCashInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetCashInvestments() {
        return netCashInvestments;
    }

    /**
     * Sets the value of the netCashInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetCashInvestments(AmountType value) {
        this.netCashInvestments = value;
    }

    /**
     * Gets the value of the addedValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAddedValue() {
        return addedValue;
    }

    /**
     * Sets the value of the addedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAddedValue(AmountType value) {
        this.addedValue = value;
    }

    /**
     * Gets the value of the balanceDeductionsAdjustmentsToDeductions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalanceDeductionsAdjustmentsToDeductions() {
        return balanceDeductionsAdjustmentsToDeductions;
    }

    /**
     * Sets the value of the balanceDeductionsAdjustmentsToDeductions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalanceDeductionsAdjustmentsToDeductions(AmountType value) {
        this.balanceDeductionsAdjustmentsToDeductions = value;
    }

    /**
     * Gets the value of the netAmountDepreciationSimilarChargesOnFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetAmountDepreciationSimilarChargesOnFixedAssets() {
        return netAmountDepreciationSimilarChargesOnFixedAssets;
    }

    /**
     * Sets the value of the netAmountDepreciationSimilarChargesOnFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetAmountDepreciationSimilarChargesOnFixedAssets(AmountType value) {
        this.netAmountDepreciationSimilarChargesOnFixedAssets = value;
    }

    /**
     * Gets the value of the unnegotiatedAcceptances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnnegotiatedAcceptances() {
        return unnegotiatedAcceptances;
    }

    /**
     * Sets the value of the unnegotiatedAcceptances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnnegotiatedAcceptances(AmountType value) {
        this.unnegotiatedAcceptances = value;
    }

    /**
     * Gets the value of the guaranteesForCredits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGuaranteesForCredits() {
        return guaranteesForCredits;
    }

    /**
     * Sets the value of the guaranteesForCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGuaranteesForCredits(AmountType value) {
        this.guaranteesForCredits = value;
    }

    /**
     * Gets the value of the otherGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherGuarantees() {
        return otherGuarantees;
    }

    /**
     * Sets the value of the otherGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherGuarantees(AmountType value) {
        this.otherGuarantees = value;
    }

    /**
     * Gets the value of the documentaryCredits property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDocumentaryCredits() {
        return documentaryCredits;
    }

    /**
     * Sets the value of the documentaryCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDocumentaryCredits(AmountType value) {
        this.documentaryCredits = value;
    }

    /**
     * Gets the value of the mortgageGuaranteesForThirds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMortgageGuaranteesForThirds() {
        return mortgageGuaranteesForThirds;
    }

    /**
     * Sets the value of the mortgageGuaranteesForThirds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMortgageGuaranteesForThirds(AmountType value) {
        this.mortgageGuaranteesForThirds = value;
    }

    /**
     * Gets the value of the potentialCreditRiskLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPotentialCreditRiskLiabilities() {
        return potentialCreditRiskLiabilities;
    }

    /**
     * Sets the value of the potentialCreditRiskLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPotentialCreditRiskLiabilities(AmountType value) {
        this.potentialCreditRiskLiabilities = value;
    }

    /**
     * Gets the value of the fixedFundEngagements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedFundEngagements() {
        return fixedFundEngagements;
    }

    /**
     * Sets the value of the fixedFundEngagements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedFundEngagements(AmountType value) {
        this.fixedFundEngagements = value;
    }

    /**
     * Gets the value of the bondPurchaseEngagements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBondPurchaseEngagements() {
        return bondPurchaseEngagements;
    }

    /**
     * Sets the value of the bondPurchaseEngagements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBondPurchaseEngagements(AmountType value) {
        this.bondPurchaseEngagements = value;
    }

    /**
     * Gets the value of the availableCreditLineMargin property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAvailableCreditLineMargin() {
        return availableCreditLineMargin;
    }

    /**
     * Sets the value of the availableCreditLineMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAvailableCreditLineMargin(AmountType value) {
        this.availableCreditLineMargin = value;
    }

    /**
     * Gets the value of the bondPurchaseSaleEngagements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBondPurchaseSaleEngagements() {
        return bondPurchaseSaleEngagements;
    }

    /**
     * Sets the value of the bondPurchaseSaleEngagements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBondPurchaseSaleEngagements(AmountType value) {
        this.bondPurchaseSaleEngagements = value;
    }

    /**
     * Gets the value of the cessionRetrocessionEngagements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCessionRetrocessionEngagements() {
        return cessionRetrocessionEngagements;
    }

    /**
     * Sets the value of the cessionRetrocessionEngagements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCessionRetrocessionEngagements(AmountType value) {
        this.cessionRetrocessionEngagements = value;
    }

    /**
     * Gets the value of the valuesCreditBanks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getValuesCreditBanks() {
        return valuesCreditBanks;
    }

    /**
     * Sets the value of the valuesCreditBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setValuesCreditBanks(AmountType value) {
        this.valuesCreditBanks = value;
    }

    /**
     * Gets the value of the valuesUnderFiduciary property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getValuesUnderFiduciary() {
        return valuesUnderFiduciary;
    }

    /**
     * Sets the value of the valuesUnderFiduciary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setValuesUnderFiduciary(AmountType value) {
        this.valuesUnderFiduciary = value;
    }

    /**
     * Gets the value of the openDepositsSimilar property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOpenDepositsSimilar() {
        return openDepositsSimilar;
    }

    /**
     * Sets the value of the openDepositsSimilar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOpenDepositsSimilar(AmountType value) {
        this.openDepositsSimilar = value;
    }

    /**
     * Gets the value of the sharesToBePaidUp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesToBePaidUp() {
        return sharesToBePaidUp;
    }

    /**
     * Sets the value of the sharesToBePaidUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesToBePaidUp(AmountType value) {
        this.sharesToBePaidUp = value;
    }

    /**
     * Gets the value of the averagePersonnelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAveragePersonnelQuantity() {
        return averagePersonnelQuantity;
    }

    /**
     * Sets the value of the averagePersonnelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAveragePersonnelQuantity(BigInteger value) {
        this.averagePersonnelQuantity = value;
    }

    /**
     * Gets the value of the labourersQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLabourersQuantity() {
        return labourersQuantity;
    }

    /**
     * Sets the value of the labourersQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLabourersQuantity(BigInteger value) {
        this.labourersQuantity = value;
    }

    /**
     * Gets the value of the clerksQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClerksQuantity() {
        return clerksQuantity;
    }

    /**
     * Sets the value of the clerksQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClerksQuantity(BigInteger value) {
        this.clerksQuantity = value;
    }

    /**
     * Gets the value of the staffPersonnelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffPersonnelQuantity() {
        return staffPersonnelQuantity;
    }

    /**
     * Sets the value of the staffPersonnelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffPersonnelQuantity(BigInteger value) {
        this.staffPersonnelQuantity = value;
    }

    /**
     * Gets the value of the othersQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthersQuantity() {
        return othersQuantity;
    }

    /**
     * Sets the value of the othersQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthersQuantity(BigInteger value) {
        this.othersQuantity = value;
    }

    /**
     * Gets the value of the personnelExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonnelExpenses() {
        return personnelExpenses;
    }

    /**
     * Sets the value of the personnelExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonnelExpenses(AmountType value) {
        this.personnelExpenses = value;
    }

    /**
     * Gets the value of the wagesSocialAdvantages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWagesSocialAdvantages() {
        return wagesSocialAdvantages;
    }

    /**
     * Sets the value of the wagesSocialAdvantages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWagesSocialAdvantages(AmountType value) {
        this.wagesSocialAdvantages = value;
    }

    /**
     * Gets the value of the employersSocialSecurityPremiums property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployersSocialSecurityPremiums() {
        return employersSocialSecurityPremiums;
    }

    /**
     * Sets the value of the employersSocialSecurityPremiums property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployersSocialSecurityPremiums(AmountType value) {
        this.employersSocialSecurityPremiums = value;
    }

    /**
     * Gets the value of the employersPremiumsExtraLegalAdvantages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployersPremiumsExtraLegalAdvantages() {
        return employersPremiumsExtraLegalAdvantages;
    }

    /**
     * Sets the value of the employersPremiumsExtraLegalAdvantages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployersPremiumsExtraLegalAdvantages(AmountType value) {
        this.employersPremiumsExtraLegalAdvantages = value;
    }

    /**
     * Gets the value of the otherCostsPersonnel property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCostsPersonnel() {
        return otherCostsPersonnel;
    }

    /**
     * Sets the value of the otherCostsPersonnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCostsPersonnel(AmountType value) {
        this.otherCostsPersonnel = value;
    }

    /**
     * Gets the value of the transfersTo property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransfersTo() {
        return transfersTo;
    }

    /**
     * Sets the value of the transfersTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransfersTo(AmountType value) {
        this.transfersTo = value;
    }

    /**
     * Gets the value of the transfersFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransfersFrom() {
        return transfersFrom;
    }

    /**
     * Sets the value of the transfersFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransfersFrom(AmountType value) {
        this.transfersFrom = value;
    }

    /**
     * Gets the value of the fiscalSocialDebtsVersusTaxAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFiscalSocialDebtsVersusTaxAdministration() {
        return fiscalSocialDebtsVersusTaxAdministration;
    }

    /**
     * Sets the value of the fiscalSocialDebtsVersusTaxAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFiscalSocialDebtsVersusTaxAdministration(AmountType value) {
        this.fiscalSocialDebtsVersusTaxAdministration = value;
    }

    /**
     * Gets the value of the outstandingFiscSocialDebtsVersusSocialSecurityAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOutstandingFiscSocialDebtsVersusSocialSecurityAdmin() {
        return outstandingFiscSocialDebtsVersusSocialSecurityAdmin;
    }

    /**
     * Sets the value of the outstandingFiscSocialDebtsVersusSocialSecurityAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOutstandingFiscSocialDebtsVersusSocialSecurityAdmin(AmountType value) {
        this.outstandingFiscSocialDebtsVersusSocialSecurityAdmin = value;
    }

    /**
     * Gets the value of the taxesPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxesPayable() {
        return taxesPayable;
    }

    /**
     * Sets the value of the taxesPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxesPayable(AmountType value) {
        this.taxesPayable = value;
    }

    /**
     * Gets the value of the estimatedFiscalDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedFiscalDebts() {
        return estimatedFiscalDebts;
    }

    /**
     * Sets the value of the estimatedFiscalDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedFiscalDebts(AmountType value) {
        this.estimatedFiscalDebts = value;
    }

    /**
     * Gets the value of the receivFromDirectManagOtherControllingNonAffiliatCies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivFromDirectManagOtherControllingNonAffiliatCies() {
        return receivFromDirectManagOtherControllingNonAffiliatCies;
    }

    /**
     * Sets the value of the receivFromDirectManagOtherControllingNonAffiliatCies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivFromDirectManagOtherControllingNonAffiliatCies(AmountType value) {
        this.receivFromDirectManagOtherControllingNonAffiliatCies = value;
    }

    /**
     * Gets the value of the debtsinFavourDirectrsManagOthControlNonAffiliatedCies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtsinFavourDirectrsManagOthControlNonAffiliatedCies() {
        return debtsinFavourDirectrsManagOthControlNonAffiliatedCies;
    }

    /**
     * Sets the value of the debtsinFavourDirectrsManagOthControlNonAffiliatedCies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtsinFavourDirectrsManagOthControlNonAffiliatedCies(AmountType value) {
        this.debtsinFavourDirectrsManagOthControlNonAffiliatedCies = value;
    }

    /**
     * Gets the value of the othSignEngagmInFavrDirecManagOthControlNonAffilCies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOthSignEngagmInFavrDirecManagOthControlNonAffilCies() {
        return othSignEngagmInFavrDirecManagOthControlNonAffilCies;
    }

    /**
     * Sets the value of the othSignEngagmInFavrDirecManagOthControlNonAffilCies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOthSignEngagmInFavrDirecManagOthControlNonAffilCies(AmountType value) {
        this.othSignEngagmInFavrDirecManagOthControlNonAffilCies = value;
    }

    /**
     * Gets the value of the totalGuarantAmntPartDebtsCieOtherThenTechnRes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalGuarantAmntPartDebtsCieOtherThenTechnRes() {
        return totalGuarantAmntPartDebtsCieOtherThenTechnRes;
    }

    /**
     * Sets the value of the totalGuarantAmntPartDebtsCieOtherThenTechnRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalGuarantAmntPartDebtsCieOtherThenTechnRes(AmountType value) {
        this.totalGuarantAmntPartDebtsCieOtherThenTechnRes = value;
    }

    /**
     * Gets the value of the comGuarantSuppliedorIrrevocPromisedbyCie property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getComGuarantSuppliedorIrrevocPromisedbyCie() {
        return comGuarantSuppliedorIrrevocPromisedbyCie;
    }

    /**
     * Sets the value of the comGuarantSuppliedorIrrevocPromisedbyCie property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setComGuarantSuppliedorIrrevocPromisedbyCie(AmountType value) {
        this.comGuarantSuppliedorIrrevocPromisedbyCie = value;
    }

    /**
     * Gets the value of the comPrivGuarantSuppliedbyAffiliatedCies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getComPrivGuarantSuppliedbyAffiliatedCies() {
        return comPrivGuarantSuppliedbyAffiliatedCies;
    }

    /**
     * Sets the value of the comPrivGuarantSuppliedbyAffiliatedCies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setComPrivGuarantSuppliedbyAffiliatedCies(AmountType value) {
        this.comPrivGuarantSuppliedbyAffiliatedCies = value;
    }

    /**
     * Gets the value of the othersSupplyingGuarantInChargeCie property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOthersSupplyingGuarantInChargeCie() {
        return othersSupplyingGuarantInChargeCie;
    }

    /**
     * Sets the value of the othersSupplyingGuarantInChargeCie property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOthersSupplyingGuarantInChargeCie(AmountType value) {
        this.othersSupplyingGuarantInChargeCie = value;
    }

    /**
     * Gets the value of the totalComPrivGuarSupplAsGuarantForDebtsForThirds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalComPrivGuarSupplAsGuarantForDebtsForThirds() {
        return totalComPrivGuarSupplAsGuarantForDebtsForThirds;
    }

    /**
     * Sets the value of the totalComPrivGuarSupplAsGuarantForDebtsForThirds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalComPrivGuarSupplAsGuarantForDebtsForThirds(AmountType value) {
        this.totalComPrivGuarSupplAsGuarantForDebtsForThirds = value;
    }

    /**
     * Gets the value of the affiliatedCompaniesSubsidiariesSubSubsidiaries property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAffiliatedCompaniesSubsidiariesSubSubsidiaries() {
        return affiliatedCompaniesSubsidiariesSubSubsidiaries;
    }

    /**
     * Sets the value of the affiliatedCompaniesSubsidiariesSubSubsidiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAffiliatedCompaniesSubsidiariesSubSubsidiaries(AmountType value) {
        this.affiliatedCompaniesSubsidiariesSubSubsidiaries = value;
    }

    /**
     * Gets the value of the otherCompaniesWithAffiliation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCompaniesWithAffiliation() {
        return otherCompaniesWithAffiliation;
    }

    /**
     * Sets the value of the otherCompaniesWithAffiliation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCompaniesWithAffiliation(AmountType value) {
        this.otherCompaniesWithAffiliation = value;
    }

    /**
     * Gets the value of the directorsorManagers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectorsorManagers() {
        return directorsorManagers;
    }

    /**
     * Sets the value of the directorsorManagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectorsorManagers(AmountType value) {
        this.directorsorManagers = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOthers(AmountType value) {
        this.others = value;
    }

    /**
     * Gets the value of the totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed() {
        return totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed;
    }

    /**
     * Sets the value of the totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed(AmountType value) {
        this.totalDebtsExpiryDatePassedWetherorNotDelayPaymAgreed = value;
    }

    /**
     * Gets the value of the fiscalAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFiscalAdministration() {
        return fiscalAdministration;
    }

    /**
     * Sets the value of the fiscalAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFiscalAdministration(AmountType value) {
        this.fiscalAdministration = value;
    }

    /**
     * Gets the value of the socialSecurityAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSocialSecurityAdministration() {
        return socialSecurityAdministration;
    }

    /**
     * Sets the value of the socialSecurityAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSocialSecurityAdministration(AmountType value) {
        this.socialSecurityAdministration = value;
    }

    /**
     * Gets the value of the averageNumberPersonnelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageNumberPersonnelQuantity() {
        return averageNumberPersonnelQuantity;
    }

    /**
     * Sets the value of the averageNumberPersonnelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageNumberPersonnelQuantity(BigInteger value) {
        this.averageNumberPersonnelQuantity = value;
    }

    /**
     * Gets the value of the totalWagesPensionsOtherPersonnelExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalWagesPensionsOtherPersonnelExpenses() {
        return totalWagesPensionsOtherPersonnelExpenses;
    }

    /**
     * Sets the value of the totalWagesPensionsOtherPersonnelExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalWagesPensionsOtherPersonnelExpenses(AmountType value) {
        this.totalWagesPensionsOtherPersonnelExpenses = value;
    }

    /**
     * Gets the value of the wages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWages() {
        return wages;
    }

    /**
     * Sets the value of the wages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWages(AmountType value) {
        this.wages = value;
    }

    /**
     * Gets the value of the otherDirectSocialAdvantages property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDirectSocialAdvantages() {
        return otherDirectSocialAdvantages;
    }

    /**
     * Sets the value of the otherDirectSocialAdvantages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDirectSocialAdvantages(AmountType value) {
        this.otherDirectSocialAdvantages = value;
    }

    /**
     * Gets the value of the employersSocialSecPremiums property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployersSocialSecPremiums() {
        return employersSocialSecPremiums;
    }

    /**
     * Sets the value of the employersSocialSecPremiums property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployersSocialSecPremiums(AmountType value) {
        this.employersSocialSecPremiums = value;
    }

    /**
     * Gets the value of the otherPersonnelExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPersonnelExpenses() {
        return otherPersonnelExpenses;
    }

    /**
     * Sets the value of the otherPersonnelExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPersonnelExpenses(AmountType value) {
        this.otherPersonnelExpenses = value;
    }

    /**
     * Gets the value of the increaseProvisionsForPensions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncreaseProvisionsForPensions() {
        return increaseProvisionsForPensions;
    }

    /**
     * Sets the value of the increaseProvisionsForPensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncreaseProvisionsForPensions(AmountType value) {
        this.increaseProvisionsForPensions = value;
    }

    /**
     * Gets the value of the decreaseProvisionsForPensions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDecreaseProvisionsForPensions() {
        return decreaseProvisionsForPensions;
    }

    /**
     * Sets the value of the decreaseProvisionsForPensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDecreaseProvisionsForPensions(AmountType value) {
        this.decreaseProvisionsForPensions = value;
    }

    /**
     * Gets the value of the increaseProvisionsForOtherWagesSocExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncreaseProvisionsForOtherWagesSocExpenses() {
        return increaseProvisionsForOtherWagesSocExpenses;
    }

    /**
     * Sets the value of the increaseProvisionsForOtherWagesSocExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncreaseProvisionsForOtherWagesSocExpenses(AmountType value) {
        this.increaseProvisionsForOtherWagesSocExpenses = value;
    }

    /**
     * Gets the value of the decreaseProvisionsForOtherWagesSocExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDecreaseProvisionsForOtherWagesSocExpenses() {
        return decreaseProvisionsForOtherWagesSocExpenses;
    }

    /**
     * Sets the value of the decreaseProvisionsForOtherWagesSocExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDecreaseProvisionsForOtherWagesSocExpenses(AmountType value) {
        this.decreaseProvisionsForOtherWagesSocExpenses = value;
    }

    /**
     * Gets the value of the totWagesPensionsForExDirectorsManagersEtc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotWagesPensionsForExDirectorsManagersEtc() {
        return totWagesPensionsForExDirectorsManagersEtc;
    }

    /**
     * Sets the value of the totWagesPensionsForExDirectorsManagersEtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotWagesPensionsForExDirectorsManagersEtc(AmountType value) {
        this.totWagesPensionsForExDirectorsManagersEtc = value;
    }

    /**
     * Gets the value of the totalDistributionTaxesOnResultForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalDistributionTaxesOnResultForPeriod() {
        return totalDistributionTaxesOnResultForPeriod;
    }

    /**
     * Sets the value of the totalDistributionTaxesOnResultForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalDistributionTaxesOnResultForPeriod(AmountType value) {
        this.totalDistributionTaxesOnResultForPeriod = value;
    }

    /**
     * Gets the value of the totalTaxesOnResult property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalTaxesOnResult() {
        return totalTaxesOnResult;
    }

    /**
     * Sets the value of the totalTaxesOnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalTaxesOnResult(AmountType value) {
        this.totalTaxesOnResult = value;
    }

    /**
     * Gets the value of the paidPrepaidTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaidPrepaidTaxes() {
        return paidPrepaidTaxes;
    }

    /**
     * Sets the value of the paidPrepaidTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaidPrepaidTaxes(AmountType value) {
        this.paidPrepaidTaxes = value;
    }

    /**
     * Gets the value of the onAssetsBookedOverPaidTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOnAssetsBookedOverPaidTaxes() {
        return onAssetsBookedOverPaidTaxes;
    }

    /**
     * Sets the value of the onAssetsBookedOverPaidTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOnAssetsBookedOverPaidTaxes(AmountType value) {
        this.onAssetsBookedOverPaidTaxes = value;
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
     * Gets the value of the totalRegularisationsWithdrawals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalRegularisationsWithdrawals() {
        return totalRegularisationsWithdrawals;
    }

    /**
     * Sets the value of the totalRegularisationsWithdrawals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalRegularisationsWithdrawals(AmountType value) {
        this.totalRegularisationsWithdrawals = value;
    }

    /**
     * Gets the value of the regularisationsTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRegularisationsTaxes() {
        return regularisationsTaxes;
    }

    /**
     * Sets the value of the regularisationsTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRegularisationsTaxes(AmountType value) {
        this.regularisationsTaxes = value;
    }

    /**
     * Gets the value of the withdrawalOnFiscalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getWithdrawalOnFiscalProvisions() {
        return withdrawalOnFiscalProvisions;
    }

    /**
     * Sets the value of the withdrawalOnFiscalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setWithdrawalOnFiscalProvisions(AmountType value) {
        this.withdrawalOnFiscalProvisions = value;
    }

    /**
     * Gets the value of the landBuildingsFullyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandBuildingsFullyOwned() {
        return landBuildingsFullyOwned;
    }

    /**
     * Sets the value of the landBuildingsFullyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandBuildingsFullyOwned(AmountType value) {
        this.landBuildingsFullyOwned = value;
    }

    /**
     * Gets the value of the landBuildingsOther property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandBuildingsOther() {
        return landBuildingsOther;
    }

    /**
     * Sets the value of the landBuildingsOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandBuildingsOther(AmountType value) {
        this.landBuildingsOther = value;
    }

    /**
     * Gets the value of the plantMachineryEquipmentFullyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryEquipmentFullyOwned() {
        return plantMachineryEquipmentFullyOwned;
    }

    /**
     * Sets the value of the plantMachineryEquipmentFullyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryEquipmentFullyOwned(AmountType value) {
        this.plantMachineryEquipmentFullyOwned = value;
    }

    /**
     * Gets the value of the plantMachineryEquipmentOther property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryEquipmentOther() {
        return plantMachineryEquipmentOther;
    }

    /**
     * Sets the value of the plantMachineryEquipmentOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryEquipmentOther(AmountType value) {
        this.plantMachineryEquipmentOther = value;
    }

    /**
     * Gets the value of the furnitureVehiclesFullyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureVehiclesFullyOwned() {
        return furnitureVehiclesFullyOwned;
    }

    /**
     * Sets the value of the furnitureVehiclesFullyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureVehiclesFullyOwned(AmountType value) {
        this.furnitureVehiclesFullyOwned = value;
    }

    /**
     * Gets the value of the furnitureVehiclesOther property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureVehiclesOther() {
        return furnitureVehiclesOther;
    }

    /**
     * Sets the value of the furnitureVehiclesOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureVehiclesOther(AmountType value) {
        this.furnitureVehiclesOther = value;
    }

    /**
     * Gets the value of the otherTangibleAssetsFullyOwned property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTangibleAssetsFullyOwned() {
        return otherTangibleAssetsFullyOwned;
    }

    /**
     * Sets the value of the otherTangibleAssetsFullyOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTangibleAssetsFullyOwned(AmountType value) {
        this.otherTangibleAssetsFullyOwned = value;
    }

    /**
     * Gets the value of the otherTangibleAssetsOther property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTangibleAssetsOther() {
        return otherTangibleAssetsOther;
    }

    /**
     * Sets the value of the otherTangibleAssetsOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTangibleAssetsOther(AmountType value) {
        this.otherTangibleAssetsOther = value;
    }

    /**
     * Gets the value of the longTermOtherReceivablesNoOrAbnormallyLowInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermOtherReceivablesNoOrAbnormallyLowInterest() {
        return longTermOtherReceivablesNoOrAbnormallyLowInterest;
    }

    /**
     * Sets the value of the longTermOtherReceivablesNoOrAbnormallyLowInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermOtherReceivablesNoOrAbnormallyLowInterest(AmountType value) {
        this.longTermOtherReceivablesNoOrAbnormallyLowInterest = value;
    }

    /**
     * Gets the value of the shortTermOtherReceivablesNoOrAbnormallyLowInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShortTermOtherReceivablesNoOrAbnormallyLowInterest() {
        return shortTermOtherReceivablesNoOrAbnormallyLowInterest;
    }

    /**
     * Sets the value of the shortTermOtherReceivablesNoOrAbnormallyLowInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShortTermOtherReceivablesNoOrAbnormallyLowInterest(AmountType value) {
        this.shortTermOtherReceivablesNoOrAbnormallyLowInterest = value;
    }

    /**
     * Gets the value of the advancesReceivedOnContractsGuaranteedByPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancesReceivedOnContractsGuaranteedByPublicAuthorities() {
        return advancesReceivedOnContractsGuaranteedByPublicAuthorities;
    }

    /**
     * Sets the value of the advancesReceivedOnContractsGuaranteedByPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancesReceivedOnContractsGuaranteedByPublicAuthorities(AmountType value) {
        this.advancesReceivedOnContractsGuaranteedByPublicAuthorities = value;
    }

    /**
     * Gets the value of the advancesReceivedOnContractsGuaranteedOnCompaniesAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancesReceivedOnContractsGuaranteedOnCompaniesAssets() {
        return advancesReceivedOnContractsGuaranteedOnCompaniesAssets;
    }

    /**
     * Sets the value of the advancesReceivedOnContractsGuaranteedOnCompaniesAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancesReceivedOnContractsGuaranteedOnCompaniesAssets(AmountType value) {
        this.advancesReceivedOnContractsGuaranteedOnCompaniesAssets = value;
    }

    /**
     * Gets the value of the bookValueAccumulatedOfTheUncalledAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBookValueAccumulatedOfTheUncalledAmounts() {
        return bookValueAccumulatedOfTheUncalledAmounts;
    }

    /**
     * Sets the value of the bookValueAccumulatedOfTheUncalledAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBookValueAccumulatedOfTheUncalledAmounts(AmountType value) {
        this.bookValueAccumulatedOfTheUncalledAmounts = value;
    }

    /**
     * Gets the value of the bookValueFinancialFixedAssetsEndOfThePreceedingYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBookValueFinancialFixedAssetsEndOfThePreceedingYear() {
        return bookValueFinancialFixedAssetsEndOfThePreceedingYear;
    }

    /**
     * Sets the value of the bookValueFinancialFixedAssetsEndOfThePreceedingYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBookValueFinancialFixedAssetsEndOfThePreceedingYear(AmountType value) {
        this.bookValueFinancialFixedAssetsEndOfThePreceedingYear = value;
    }

    /**
     * Gets the value of the bookValueFinancialFixedAssetsEndOfTheYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBookValueFinancialFixedAssetsEndOfTheYear() {
        return bookValueFinancialFixedAssetsEndOfTheYear;
    }

    /**
     * Sets the value of the bookValueFinancialFixedAssetsEndOfTheYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBookValueFinancialFixedAssetsEndOfTheYear(AmountType value) {
        this.bookValueFinancialFixedAssetsEndOfTheYear = value;
    }

    /**
     * Gets the value of the financialChargesOnDebts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialChargesOnDebts() {
        return financialChargesOnDebts;
    }

    /**
     * Sets the value of the financialChargesOnDebts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialChargesOnDebts(AmountType value) {
        this.financialChargesOnDebts = value;
    }

    /**
     * Gets the value of the financialDebtsGuaranteedByPublicAuthorities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialDebtsGuaranteedByPublicAuthorities() {
        return financialDebtsGuaranteedByPublicAuthorities;
    }

    /**
     * Sets the value of the financialDebtsGuaranteedByPublicAuthorities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialDebtsGuaranteedByPublicAuthorities(AmountType value) {
        this.financialDebtsGuaranteedByPublicAuthorities = value;
    }

    /**
     * Gets the value of the financialDebtsPayableOver5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancialDebtsPayableOver5Years() {
        return financialDebtsPayableOver5Years;
    }

    /**
     * Sets the value of the financialDebtsPayableOver5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancialDebtsPayableOver5Years(AmountType value) {
        this.financialDebtsPayableOver5Years = value;
    }

    /**
     * Gets the value of the fixedIncomeSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedIncomeSecurities() {
        return fixedIncomeSecurities;
    }

    /**
     * Sets the value of the fixedIncomeSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedIncomeSecurities(AmountType value) {
        this.fixedIncomeSecurities = value;
    }

    /**
     * Gets the value of the fixedIncomeSecuritiesIssuedByFinancialInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedIncomeSecuritiesIssuedByFinancialInstitutions() {
        return fixedIncomeSecuritiesIssuedByFinancialInstitutions;
    }

    /**
     * Sets the value of the fixedIncomeSecuritiesIssuedByFinancialInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedIncomeSecuritiesIssuedByFinancialInstitutions(AmountType value) {
        this.fixedIncomeSecuritiesIssuedByFinancialInstitutions = value;
    }

    /**
     * Gets the value of the fundsforasocialliabilitytocover property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFundsforasocialliabilitytocover() {
        return fundsforasocialliabilitytocover;
    }

    /**
     * Sets the value of the fundsforasocialliabilitytocover property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFundsforasocialliabilitytocover(AmountType value) {
        this.fundsforasocialliabilitytocover = value;
    }

    /**
     * Gets the value of the furnitureRollingEquipmentInfullownershipoftheassociation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureRollingEquipmentInfullownershipoftheassociation() {
        return furnitureRollingEquipmentInfullownershipoftheassociation;
    }

    /**
     * Sets the value of the furnitureRollingEquipmentInfullownershipoftheassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureRollingEquipmentInfullownershipoftheassociation(AmountType value) {
        this.furnitureRollingEquipmentInfullownershipoftheassociation = value;
    }

    /**
     * Gets the value of the incomeFromCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeFromCurrentAssets() {
        return incomeFromCurrentAssets;
    }

    /**
     * Sets the value of the incomeFromCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeFromCurrentAssets(AmountType value) {
        this.incomeFromCurrentAssets = value;
    }

    /**
     * Gets the value of the incomeFromFinancialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncomeFromFinancialFixedAssets() {
        return incomeFromFinancialFixedAssets;
    }

    /**
     * Sets the value of the incomeFromFinancialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncomeFromFinancialFixedAssets(AmountType value) {
        this.incomeFromFinancialFixedAssets = value;
    }

    /**
     * Gets the value of the landBuildingsInfullownershipoftheassociation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandBuildingsInfullownershipoftheassociation() {
        return landBuildingsInfullownershipoftheassociation;
    }

    /**
     * Sets the value of the landBuildingsInfullownershipoftheassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandBuildingsInfullownershipoftheassociation(AmountType value) {
        this.landBuildingsInfullownershipoftheassociation = value;
    }

    /**
     * Gets the value of the missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMissionstaxadvicecarriedoutbypersonsconnectedwithCommissioner() {
        return missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner;
    }

    /**
     * Sets the value of the missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMissionstaxadvicecarriedoutbypersonsconnectedwithCommissioner(AmountType value) {
        this.missionstaxadvicecarriedoutbypersonsconnectedwithCommissioner = value;
    }

    /**
     * Gets the value of the movementsInFinancialFixedAssetsForTheYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMovementsInFinancialFixedAssetsForTheYear() {
        return movementsInFinancialFixedAssetsForTheYear;
    }

    /**
     * Sets the value of the movementsInFinancialFixedAssetsForTheYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMovementsInFinancialFixedAssetsForTheYear(AmountType value) {
        this.movementsInFinancialFixedAssetsForTheYear = value;
    }

    /**
     * Gets the value of the otherAuditscarriedoutbypersonsconnectedwithCommissioner property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAuditscarriedoutbypersonsconnectedwithCommissioner() {
        return otherAuditscarriedoutbypersonsconnectedwithCommissioner;
    }

    /**
     * Sets the value of the otherAuditscarriedoutbypersonsconnectedwithCommissioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAuditscarriedoutbypersonsconnectedwithCommissioner(AmountType value) {
        this.otherAuditscarriedoutbypersonsconnectedwithCommissioner = value;
    }

    /**
     * Gets the value of the otherFinancialCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialCharges() {
        return otherFinancialCharges;
    }

    /**
     * Sets the value of the otherFinancialCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialCharges(AmountType value) {
        this.otherFinancialCharges = value;
    }

    /**
     * Gets the value of the otherFinancialIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialIncome() {
        return otherFinancialIncome;
    }

    /**
     * Sets the value of the otherFinancialIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialIncome(AmountType value) {
        this.otherFinancialIncome = value;
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
     * Gets the value of the otherMissionsConnectedwithCommissioner property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherMissionsConnectedwithCommissioner() {
        return otherMissionsConnectedwithCommissioner;
    }

    /**
     * Sets the value of the otherMissionsConnectedwithCommissioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherMissionsConnectedwithCommissioner(AmountType value) {
        this.otherMissionsConnectedwithCommissioner = value;
    }

    /**
     * Gets the value of the otherOperatingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherOperatingCharges() {
        return otherOperatingCharges;
    }

    /**
     * Sets the value of the otherOperatingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherOperatingCharges(AmountType value) {
        this.otherOperatingCharges = value;
    }

    /**
     * Gets the value of the othertangiblefixedassetsInfullownershipoftheassociation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOthertangiblefixedassetsInfullownershipoftheassociation() {
        return othertangiblefixedassetsInfullownershipoftheassociation;
    }

    /**
     * Sets the value of the othertangiblefixedassetsInfullownershipoftheassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOthertangiblefixedassetsInfullownershipoftheassociation(AmountType value) {
        this.othertangiblefixedassetsInfullownershipoftheassociation = value;
    }

    /**
     * Gets the value of the plantmachineryequipmentInthepropertyoftheassociation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantmachineryequipmentInthepropertyoftheassociation() {
        return plantmachineryequipmentInthepropertyoftheassociation;
    }

    /**
     * Sets the value of the plantmachineryequipmentInthepropertyoftheassociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantmachineryequipmentInthepropertyoftheassociation(AmountType value) {
        this.plantmachineryequipmentInthepropertyoftheassociation = value;
    }

    /**
     * Gets the value of the remunerationscommissaryforextraordinactivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemunerationscommissaryforextraordinactivities() {
        return remunerationscommissaryforextraordinactivities;
    }

    /**
     * Sets the value of the remunerationscommissaryforextraordinactivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemunerationscommissaryforextraordinactivities(AmountType value) {
        this.remunerationscommissaryforextraordinactivities = value;
    }

    /**
     * Gets the value of the residualTermOrNoticeOfWithdrawalBetween1Month1Year property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualTermOrNoticeOfWithdrawalBetween1Month1Year() {
        return residualTermOrNoticeOfWithdrawalBetween1Month1Year;
    }

    /**
     * Sets the value of the residualTermOrNoticeOfWithdrawalBetween1Month1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualTermOrNoticeOfWithdrawalBetween1Month1Year(AmountType value) {
        this.residualTermOrNoticeOfWithdrawalBetween1Month1Year = value;
    }

    /**
     * Gets the value of the residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualTermOrNoticeOfWithdrawalLessOrEqualTo1Month() {
        return residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month;
    }

    /**
     * Sets the value of the residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualTermOrNoticeOfWithdrawalLessOrEqualTo1Month(AmountType value) {
        this.residualTermOrNoticeOfWithdrawalLessOrEqualTo1Month = value;
    }

    /**
     * Gets the value of the residualTermOrNoticeOfWithdrawalOver1Year property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualTermOrNoticeOfWithdrawalOver1Year() {
        return residualTermOrNoticeOfWithdrawalOver1Year;
    }

    /**
     * Sets the value of the residualTermOrNoticeOfWithdrawalOver1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualTermOrNoticeOfWithdrawalOver1Year(AmountType value) {
        this.residualTermOrNoticeOfWithdrawalOver1Year = value;
    }

    /**
     * Gets the value of the salesMembershipGiftsLegaciesSubsidiesotheroperIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesMembershipGiftsLegaciesSubsidiesotheroperIncome() {
        return salesMembershipGiftsLegaciesSubsidiesotheroperIncome;
    }

    /**
     * Sets the value of the salesMembershipGiftsLegaciesSubsidiesotheroperIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesMembershipGiftsLegaciesSubsidiesotheroperIncome(AmountType value) {
        this.salesMembershipGiftsLegaciesSubsidiesotheroperIncome = value;
    }

    /**
     * Gets the value of the taxRemunerationSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxRemunerationSocialSecurity() {
        return taxRemunerationSocialSecurity;
    }

    /**
     * Sets the value of the taxRemunerationSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxRemunerationSocialSecurity(AmountType value) {
        this.taxRemunerationSocialSecurity = value;
    }

    /**
     * Gets the value of the taxesRemunerationSocialSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxesRemunerationSocialSecurity() {
        return taxesRemunerationSocialSecurity;
    }

    /**
     * Sets the value of the taxesRemunerationSocialSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxesRemunerationSocialSecurity(AmountType value) {
        this.taxesRemunerationSocialSecurity = value;
    }

    /**
     * Gets the value of the termAccountsWithFinancialInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTermAccountsWithFinancialInstitutions() {
        return termAccountsWithFinancialInstitutions;
    }

    /**
     * Sets the value of the termAccountsWithFinancialInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTermAccountsWithFinancialInstitutions(AmountType value) {
        this.termAccountsWithFinancialInstitutions = value;
    }

    /**
     * Gets the value of the tradeDebtsGuaranteedOnTheCompanyAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtsGuaranteedOnTheCompanyAssets() {
        return tradeDebtsGuaranteedOnTheCompanyAssets;
    }

    /**
     * Sets the value of the tradeDebtsGuaranteedOnTheCompanyAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtsGuaranteedOnTheCompanyAssets(AmountType value) {
        this.tradeDebtsGuaranteedOnTheCompanyAssets = value;
    }

    /**
     * Gets the value of the tradeDebtsPayableOver5Years property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDebtsPayableOver5Years() {
        return tradeDebtsPayableOver5Years;
    }

    /**
     * Sets the value of the tradeDebtsPayableOver5Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDebtsPayableOver5Years(AmountType value) {
        this.tradeDebtsPayableOver5Years = value;
    }

    /**
     * Gets the value of the uncalledAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUncalledAmounts() {
        return uncalledAmounts;
    }

    /**
     * Sets the value of the uncalledAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUncalledAmounts(AmountType value) {
        this.uncalledAmounts = value;
    }

}
