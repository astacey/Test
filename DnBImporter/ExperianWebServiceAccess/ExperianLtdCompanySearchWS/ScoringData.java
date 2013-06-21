
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScoringData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScoringData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICInformation1980" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo1980" minOccurs="0"/>
 *         &lt;element name="SICInformation1992" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo1992" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumRegOfficeChangesLast12Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumMemArtsChangesLast12Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasSubsidiaries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSubsidiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegOfficeCIFASIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastRegOfficeChange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCurrDirs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncompleteDirsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastDirAppt" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OldestCurrDirAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDirsHoldingShares" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDisqCurrDirs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumAppointmentsLast12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProportionCurrDirsToPrevDirLast12" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentageDirsResidentUK" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumDirsIncorpAgents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DirectorsCIFASFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectorsNOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumWindUpOrders" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastWindUpOrder" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumApptVolLiquidator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastApptVolLiquidator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumMeetingsCreditors" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastMeetingCreditors" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumResolutionWindUp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastResolutionWindUp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumApptCompLiquidator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastApptCompLiquidator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumApptReceiver" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastApptReceiver" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumReceiverCeasing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastReceiverCeasing" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumPetitionCompWindUp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastPetitionCompWindUp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumDismissedPetition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastDismissedPetition" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumApptAdministrator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastApptAdministrator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumDischargeAdministrator" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastDischargeAdministrator" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumApprovalVolArrangement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastApprovalVolArrangement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumRevocationVoluntaryArrangement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastRevocationVolArrangement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumSuspensionVolArrangement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastSuspensionVolArrangement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumCompletionsVolArrangement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastCompletionVolArrangement" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumIntentionToDissolve" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastIntentionToDissolve" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumCompanyDissolved" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastCompanyDissolved" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumCompanyReinstated" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastCompanyReinstated" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastDerogatoryItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastDerogatoryItem" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastWindUpHearing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AgeMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="HighestValueCCJ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJsLast12Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJsLast12Months" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotValCCJsPropShareFunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ValCCJsLast24MonthsPropShareFunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumUnsatPartSatMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumSatMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumUnsatMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CurrAccsAvailabe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevAccsAvailabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DormancyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevAccountsDormancyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuditorsQualifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatenessAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FicheDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumberDaysToFile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumYearsAccosAvailable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastAccsSubmitted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TimeSinceLastRetsSubmitted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatestAccountsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevAccsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevAccsConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetWorth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IntangibleAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FixedAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShortLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkingCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CapitalEmployed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalLongTermLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IssuedCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevaluationReserves" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RetainedEarnings" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GrossAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalTurnover" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreTaxProfitLoss" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RetainedProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreditPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LiquidityStandardRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Currentratio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxProfitMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotAssetsEmp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssetsPercentTotalAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesPercentTotalAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapitalEmployedPercentTotalAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StocksWorkInProgressPercentCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapitalPercentCurrentPlusFixedAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BaseTrendShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PercentChangeShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCapitalEmployed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeTotalAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangePreTaxProfitLoss" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumYearsPreTaxProfitLessThan0Last4Years" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssetsQuartile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreTaxMarginQuartile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FiledAccsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportUpdateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScoringData", propOrder = {
    "legalStatus",
    "companyAge",
    "sicInformation1980",
    "sicInformation1992",
    "region",
    "numRegOfficeChangesLast12Months",
    "numMemArtsChangesLast12Months",
    "hasSubsidiaries",
    "isSubsidiary",
    "numEmployees",
    "regOfficeCIFASIndicator",
    "timeSinceLastRegOfficeChange",
    "numCurrDirs",
    "incompleteDirsFlag",
    "timeSinceLastDirAppt",
    "oldestCurrDirAge",
    "numDirsHoldingShares",
    "numDisqCurrDirs",
    "numAppointmentsLast12",
    "proportionCurrDirsToPrevDirLast12",
    "percentageDirsResidentUK",
    "numDirsIncorpAgents",
    "directorsCIFASFlag",
    "directorsNOCFlag",
    "numWindUpOrders",
    "timeSinceLastWindUpOrder",
    "numApptVolLiquidator",
    "timeSinceLastApptVolLiquidator",
    "numMeetingsCreditors",
    "timeSinceLastMeetingCreditors",
    "numResolutionWindUp",
    "timeSinceLastResolutionWindUp",
    "numApptCompLiquidator",
    "timeSinceLastApptCompLiquidator",
    "numApptReceiver",
    "timeSinceLastApptReceiver",
    "numReceiverCeasing",
    "timeSinceLastReceiverCeasing",
    "numPetitionCompWindUp",
    "timeSinceLastPetitionCompWindUp",
    "numDismissedPetition",
    "timeSinceLastDismissedPetition",
    "numApptAdministrator",
    "timeSinceLastApptAdministrator",
    "numDischargeAdministrator",
    "timeSinceLastDischargeAdministrator",
    "numApprovalVolArrangement",
    "timeSinceLastApprovalVolArrangement",
    "numRevocationVoluntaryArrangement",
    "timeSinceLastRevocationVolArrangement",
    "numSuspensionVolArrangement",
    "timeSinceLastSuspensionVolArrangement",
    "numCompletionsVolArrangement",
    "timeSinceLastCompletionVolArrangement",
    "numIntentionToDissolve",
    "timeSinceLastIntentionToDissolve",
    "numCompanyDissolved",
    "timeSinceLastCompanyDissolved",
    "numCompanyReinstated",
    "timeSinceLastCompanyReinstated",
    "lastDerogatoryItem",
    "timeSinceLastDerogatoryItem",
    "timeSinceLastWindUpHearing",
    "ageMostRecentCCJ",
    "valueMostRecentCCJ",
    "highestValueCCJ",
    "numberCCJs0To72",
    "valueCCJs0To72",
    "numberCCJsLast12Months",
    "valueCCJsLast12Months",
    "numberCCJs13To24",
    "valueCCJs13To24",
    "numberCCJs25To36",
    "valueCCJs25To36",
    "numberCCJs37To48",
    "valueCCJs37To48",
    "numberCCJs49To60",
    "valueCCJs49To60",
    "numberCCJs61To72",
    "valueCCJs61To72",
    "totValCCJsPropShareFunds",
    "valCCJsLast24MonthsPropShareFunds",
    "numUnsatPartSatMortgages",
    "numSatMortgages",
    "numUnsatMortgages",
    "currAccsAvailabe",
    "prevAccsAvailabile",
    "outOfDateFlag",
    "companyClass",
    "dormancyFlag",
    "prevAccountsDormancyFlag",
    "auditType",
    "auditorsQualifications",
    "latenessAccounts",
    "ficheDate",
    "numberDaysToFile",
    "numYearsAccosAvailable",
    "timeSinceLastAccsSubmitted",
    "timeSinceLastRetsSubmitted",
    "latestAccountsType",
    "dateOfAccounts",
    "accountingPeriod",
    "currency",
    "prevAccsCurrency",
    "consAccounts",
    "prevAccsConsAccounts",
    "netWorth",
    "intangibleAssets",
    "fixedAssets",
    "totalCurrentAssets",
    "shortLoans",
    "totalCurrentLiabilities",
    "workingCapital",
    "capitalEmployed",
    "totalLongTermLiabilities",
    "issuedCapital",
    "revaluationReserves",
    "retainedEarnings",
    "shareholdersFunds",
    "totalAssets",
    "grossAssets",
    "totalTurnover",
    "preTaxProfitLoss",
    "dividends",
    "retainedProfit",
    "creditPeriod",
    "liquidityStandardRatio",
    "currentratio",
    "acidTest",
    "returnOnCapital",
    "returnOnAssets",
    "preTaxProfitMargin",
    "borrowingRatio",
    "equityGearing",
    "debtGearing",
    "turnoverPerEmp",
    "totAssetsEmp",
    "totalFixedAssetsPercentTotalAssets",
    "currentLiabilitiesPercentTotalAssets",
    "capitalEmployedPercentTotalAssets",
    "stocksWorkInProgressPercentCurrentAssets",
    "workingCapitalPercentCurrentPlusFixedAssets",
    "baseTrendShareholdersFunds",
    "percentChangeShareholdersFunds",
    "percentChangeCapitalEmployed",
    "percentChangeTotalAssets",
    "percentChangeCurrentRatio",
    "percentChangePreTaxProfitLoss",
    "numYearsPreTaxProfitLessThan0Last4Years",
    "returnOnAssetsQuartile",
    "preTaxMarginQuartile",
    "filedAccsType",
    "reportUpdateFlag"
})
public class ScoringData {

    @XmlElement(name = "LegalStatus")
    protected String legalStatus;
    @XmlElement(name = "CompanyAge")
    protected String companyAge;
    @XmlElement(name = "SICInformation1980")
    protected SICInfo1980 sicInformation1980;
    @XmlElement(name = "SICInformation1992")
    protected SICInfo1992 sicInformation1992;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "NumRegOfficeChangesLast12Months")
    protected Integer numRegOfficeChangesLast12Months;
    @XmlElement(name = "NumMemArtsChangesLast12Months")
    protected Integer numMemArtsChangesLast12Months;
    @XmlElement(name = "HasSubsidiaries")
    protected String hasSubsidiaries;
    @XmlElement(name = "IsSubsidiary")
    protected String isSubsidiary;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "RegOfficeCIFASIndicator")
    protected String regOfficeCIFASIndicator;
    @XmlElement(name = "TimeSinceLastRegOfficeChange")
    protected Integer timeSinceLastRegOfficeChange;
    @XmlElement(name = "NumCurrDirs")
    protected Integer numCurrDirs;
    @XmlElement(name = "IncompleteDirsFlag")
    protected String incompleteDirsFlag;
    @XmlElement(name = "TimeSinceLastDirAppt")
    protected Integer timeSinceLastDirAppt;
    @XmlElement(name = "OldestCurrDirAge")
    protected Integer oldestCurrDirAge;
    @XmlElement(name = "NumDirsHoldingShares")
    protected Integer numDirsHoldingShares;
    @XmlElement(name = "NumDisqCurrDirs")
    protected Integer numDisqCurrDirs;
    @XmlElement(name = "NumAppointmentsLast12")
    protected BigDecimal numAppointmentsLast12;
    @XmlElement(name = "ProportionCurrDirsToPrevDirLast12")
    protected BigDecimal proportionCurrDirsToPrevDirLast12;
    @XmlElement(name = "PercentageDirsResidentUK")
    protected BigDecimal percentageDirsResidentUK;
    @XmlElement(name = "NumDirsIncorpAgents")
    protected Integer numDirsIncorpAgents;
    @XmlElement(name = "DirectorsCIFASFlag")
    protected String directorsCIFASFlag;
    @XmlElement(name = "DirectorsNOCFlag")
    protected String directorsNOCFlag;
    @XmlElement(name = "NumWindUpOrders")
    protected Integer numWindUpOrders;
    @XmlElement(name = "TimeSinceLastWindUpOrder")
    protected Long timeSinceLastWindUpOrder;
    @XmlElement(name = "NumApptVolLiquidator")
    protected Integer numApptVolLiquidator;
    @XmlElement(name = "TimeSinceLastApptVolLiquidator")
    protected Long timeSinceLastApptVolLiquidator;
    @XmlElement(name = "NumMeetingsCreditors")
    protected Integer numMeetingsCreditors;
    @XmlElement(name = "TimeSinceLastMeetingCreditors")
    protected Long timeSinceLastMeetingCreditors;
    @XmlElement(name = "NumResolutionWindUp")
    protected Integer numResolutionWindUp;
    @XmlElement(name = "TimeSinceLastResolutionWindUp")
    protected Long timeSinceLastResolutionWindUp;
    @XmlElement(name = "NumApptCompLiquidator")
    protected Integer numApptCompLiquidator;
    @XmlElement(name = "TimeSinceLastApptCompLiquidator")
    protected Long timeSinceLastApptCompLiquidator;
    @XmlElement(name = "NumApptReceiver")
    protected Integer numApptReceiver;
    @XmlElement(name = "TimeSinceLastApptReceiver")
    protected Long timeSinceLastApptReceiver;
    @XmlElement(name = "NumReceiverCeasing")
    protected Integer numReceiverCeasing;
    @XmlElement(name = "TimeSinceLastReceiverCeasing")
    protected Long timeSinceLastReceiverCeasing;
    @XmlElement(name = "NumPetitionCompWindUp")
    protected Integer numPetitionCompWindUp;
    @XmlElement(name = "TimeSinceLastPetitionCompWindUp")
    protected Long timeSinceLastPetitionCompWindUp;
    @XmlElement(name = "NumDismissedPetition")
    protected Integer numDismissedPetition;
    @XmlElement(name = "TimeSinceLastDismissedPetition")
    protected Long timeSinceLastDismissedPetition;
    @XmlElement(name = "NumApptAdministrator")
    protected Integer numApptAdministrator;
    @XmlElement(name = "TimeSinceLastApptAdministrator")
    protected Long timeSinceLastApptAdministrator;
    @XmlElement(name = "NumDischargeAdministrator")
    protected Integer numDischargeAdministrator;
    @XmlElement(name = "TimeSinceLastDischargeAdministrator")
    protected Long timeSinceLastDischargeAdministrator;
    @XmlElement(name = "NumApprovalVolArrangement")
    protected Integer numApprovalVolArrangement;
    @XmlElement(name = "TimeSinceLastApprovalVolArrangement")
    protected Long timeSinceLastApprovalVolArrangement;
    @XmlElement(name = "NumRevocationVoluntaryArrangement")
    protected Integer numRevocationVoluntaryArrangement;
    @XmlElement(name = "TimeSinceLastRevocationVolArrangement")
    protected Long timeSinceLastRevocationVolArrangement;
    @XmlElement(name = "NumSuspensionVolArrangement")
    protected Integer numSuspensionVolArrangement;
    @XmlElement(name = "TimeSinceLastSuspensionVolArrangement")
    protected Long timeSinceLastSuspensionVolArrangement;
    @XmlElement(name = "NumCompletionsVolArrangement")
    protected Integer numCompletionsVolArrangement;
    @XmlElement(name = "TimeSinceLastCompletionVolArrangement")
    protected Long timeSinceLastCompletionVolArrangement;
    @XmlElement(name = "NumIntentionToDissolve")
    protected Integer numIntentionToDissolve;
    @XmlElement(name = "TimeSinceLastIntentionToDissolve")
    protected Long timeSinceLastIntentionToDissolve;
    @XmlElement(name = "NumCompanyDissolved")
    protected Integer numCompanyDissolved;
    @XmlElement(name = "TimeSinceLastCompanyDissolved")
    protected Long timeSinceLastCompanyDissolved;
    @XmlElement(name = "NumCompanyReinstated")
    protected Integer numCompanyReinstated;
    @XmlElement(name = "TimeSinceLastCompanyReinstated")
    protected Long timeSinceLastCompanyReinstated;
    @XmlElement(name = "LastDerogatoryItem")
    protected String lastDerogatoryItem;
    @XmlElement(name = "TimeSinceLastDerogatoryItem")
    protected Long timeSinceLastDerogatoryItem;
    @XmlElement(name = "TimeSinceLastWindUpHearing")
    protected Integer timeSinceLastWindUpHearing;
    @XmlElement(name = "AgeMostRecentCCJ")
    protected Integer ageMostRecentCCJ;
    @XmlElement(name = "ValueMostRecentCCJ")
    protected Long valueMostRecentCCJ;
    @XmlElement(name = "HighestValueCCJ")
    protected Long highestValueCCJ;
    @XmlElement(name = "NumberCCJs0To72")
    protected Integer numberCCJs0To72;
    @XmlElement(name = "ValueCCJs0To72")
    protected Long valueCCJs0To72;
    @XmlElement(name = "NumberCCJsLast12Months")
    protected Integer numberCCJsLast12Months;
    @XmlElement(name = "ValueCCJsLast12Months")
    protected Long valueCCJsLast12Months;
    @XmlElement(name = "NumberCCJs13To24")
    protected Integer numberCCJs13To24;
    @XmlElement(name = "ValueCCJs13To24")
    protected Long valueCCJs13To24;
    @XmlElement(name = "NumberCCJs25To36")
    protected Integer numberCCJs25To36;
    @XmlElement(name = "ValueCCJs25To36")
    protected Long valueCCJs25To36;
    @XmlElement(name = "NumberCCJs37To48")
    protected Integer numberCCJs37To48;
    @XmlElement(name = "ValueCCJs37To48")
    protected Long valueCCJs37To48;
    @XmlElement(name = "NumberCCJs49To60")
    protected Integer numberCCJs49To60;
    @XmlElement(name = "ValueCCJs49To60")
    protected Long valueCCJs49To60;
    @XmlElement(name = "NumberCCJs61To72")
    protected Integer numberCCJs61To72;
    @XmlElement(name = "ValueCCJs61To72")
    protected Long valueCCJs61To72;
    @XmlElement(name = "TotValCCJsPropShareFunds")
    protected BigDecimal totValCCJsPropShareFunds;
    @XmlElement(name = "ValCCJsLast24MonthsPropShareFunds")
    protected BigDecimal valCCJsLast24MonthsPropShareFunds;
    @XmlElement(name = "NumUnsatPartSatMortgages")
    protected Integer numUnsatPartSatMortgages;
    @XmlElement(name = "NumSatMortgages")
    protected Integer numSatMortgages;
    @XmlElement(name = "NumUnsatMortgages")
    protected Integer numUnsatMortgages;
    @XmlElement(name = "CurrAccsAvailabe")
    protected String currAccsAvailabe;
    @XmlElement(name = "PrevAccsAvailabile")
    protected String prevAccsAvailabile;
    @XmlElement(name = "OutOfDateFlag")
    protected String outOfDateFlag;
    @XmlElement(name = "CompanyClass")
    protected String companyClass;
    @XmlElement(name = "DormancyFlag")
    protected String dormancyFlag;
    @XmlElement(name = "PrevAccountsDormancyFlag")
    protected String prevAccountsDormancyFlag;
    @XmlElement(name = "AuditType")
    protected String auditType;
    @XmlElement(name = "AuditorsQualifications")
    protected String auditorsQualifications;
    @XmlElement(name = "LatenessAccounts")
    protected String latenessAccounts;
    @XmlElement(name = "FicheDate")
    protected CCYYMMDD ficheDate;
    @XmlElement(name = "NumberDaysToFile")
    protected Integer numberDaysToFile;
    @XmlElement(name = "NumYearsAccosAvailable")
    protected Integer numYearsAccosAvailable;
    @XmlElement(name = "TimeSinceLastAccsSubmitted")
    protected Integer timeSinceLastAccsSubmitted;
    @XmlElement(name = "TimeSinceLastRetsSubmitted")
    protected Integer timeSinceLastRetsSubmitted;
    @XmlElement(name = "LatestAccountsType")
    protected String latestAccountsType;
    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "AccountingPeriod")
    protected Integer accountingPeriod;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PrevAccsCurrency")
    protected String prevAccsCurrency;
    @XmlElement(name = "ConsAccounts")
    protected String consAccounts;
    @XmlElement(name = "PrevAccsConsAccounts")
    protected String prevAccsConsAccounts;
    @XmlElement(name = "NetWorth")
    protected Long netWorth;
    @XmlElement(name = "IntangibleAssets")
    protected Long intangibleAssets;
    @XmlElement(name = "FixedAssets")
    protected Long fixedAssets;
    @XmlElement(name = "TotalCurrentAssets")
    protected Long totalCurrentAssets;
    @XmlElement(name = "ShortLoans")
    protected Long shortLoans;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected Long totalCurrentLiabilities;
    @XmlElement(name = "WorkingCapital")
    protected Long workingCapital;
    @XmlElement(name = "CapitalEmployed")
    protected Long capitalEmployed;
    @XmlElement(name = "TotalLongTermLiabilities")
    protected Long totalLongTermLiabilities;
    @XmlElement(name = "IssuedCapital")
    protected Long issuedCapital;
    @XmlElement(name = "RevaluationReserves")
    protected Long revaluationReserves;
    @XmlElement(name = "RetainedEarnings")
    protected Long retainedEarnings;
    @XmlElement(name = "ShareholdersFunds")
    protected Long shareholdersFunds;
    @XmlElement(name = "TotalAssets")
    protected Long totalAssets;
    @XmlElement(name = "GrossAssets")
    protected Long grossAssets;
    @XmlElement(name = "TotalTurnover")
    protected Long totalTurnover;
    @XmlElement(name = "PreTaxProfitLoss")
    protected Long preTaxProfitLoss;
    @XmlElement(name = "Dividends")
    protected Long dividends;
    @XmlElement(name = "RetainedProfit")
    protected Long retainedProfit;
    @XmlElement(name = "CreditPeriod")
    protected Long creditPeriod;
    @XmlElement(name = "LiquidityStandardRatio")
    protected BigDecimal liquidityStandardRatio;
    @XmlElement(name = "Currentratio")
    protected BigDecimal currentratio;
    @XmlElement(name = "AcidTest")
    protected BigDecimal acidTest;
    @XmlElement(name = "ReturnOnCapital")
    protected BigDecimal returnOnCapital;
    @XmlElement(name = "ReturnOnAssets")
    protected BigDecimal returnOnAssets;
    @XmlElement(name = "PreTaxProfitMargin")
    protected BigDecimal preTaxProfitMargin;
    @XmlElement(name = "BorrowingRatio")
    protected BigDecimal borrowingRatio;
    @XmlElement(name = "EquityGearing")
    protected BigDecimal equityGearing;
    @XmlElement(name = "DebtGearing")
    protected BigDecimal debtGearing;
    @XmlElement(name = "TurnoverPerEmp")
    protected BigDecimal turnoverPerEmp;
    @XmlElement(name = "TotAssetsEmp")
    protected BigDecimal totAssetsEmp;
    @XmlElement(name = "TotalFixedAssetsPercentTotalAssets")
    protected BigDecimal totalFixedAssetsPercentTotalAssets;
    @XmlElement(name = "CurrentLiabilitiesPercentTotalAssets")
    protected BigDecimal currentLiabilitiesPercentTotalAssets;
    @XmlElement(name = "CapitalEmployedPercentTotalAssets")
    protected BigDecimal capitalEmployedPercentTotalAssets;
    @XmlElement(name = "StocksWorkInProgressPercentCurrentAssets")
    protected BigDecimal stocksWorkInProgressPercentCurrentAssets;
    @XmlElement(name = "WorkingCapitalPercentCurrentPlusFixedAssets")
    protected BigDecimal workingCapitalPercentCurrentPlusFixedAssets;
    @XmlElement(name = "BaseTrendShareholdersFunds")
    protected Integer baseTrendShareholdersFunds;
    @XmlElement(name = "PercentChangeShareholdersFunds")
    protected BigDecimal percentChangeShareholdersFunds;
    @XmlElement(name = "PercentChangeCapitalEmployed")
    protected BigDecimal percentChangeCapitalEmployed;
    @XmlElement(name = "PercentChangeTotalAssets")
    protected BigDecimal percentChangeTotalAssets;
    @XmlElement(name = "PercentChangeCurrentRatio")
    protected BigDecimal percentChangeCurrentRatio;
    @XmlElement(name = "PercentChangePreTaxProfitLoss")
    protected BigDecimal percentChangePreTaxProfitLoss;
    @XmlElement(name = "NumYearsPreTaxProfitLessThan0Last4Years")
    protected Integer numYearsPreTaxProfitLessThan0Last4Years;
    @XmlElement(name = "ReturnOnAssetsQuartile")
    protected Integer returnOnAssetsQuartile;
    @XmlElement(name = "PreTaxMarginQuartile")
    protected Integer preTaxMarginQuartile;
    @XmlElement(name = "FiledAccsType")
    protected String filedAccsType;
    @XmlElement(name = "ReportUpdateFlag")
    protected String reportUpdateFlag;

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatus(String value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the companyAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyAge() {
        return companyAge;
    }

    /**
     * Sets the value of the companyAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyAge(String value) {
        this.companyAge = value;
    }

    /**
     * Gets the value of the sicInformation1980 property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo1980 }
     *     
     */
    public SICInfo1980 getSICInformation1980() {
        return sicInformation1980;
    }

    /**
     * Sets the value of the sicInformation1980 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo1980 }
     *     
     */
    public void setSICInformation1980(SICInfo1980 value) {
        this.sicInformation1980 = value;
    }

    /**
     * Gets the value of the sicInformation1992 property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo1992 }
     *     
     */
    public SICInfo1992 getSICInformation1992() {
        return sicInformation1992;
    }

    /**
     * Sets the value of the sicInformation1992 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo1992 }
     *     
     */
    public void setSICInformation1992(SICInfo1992 value) {
        this.sicInformation1992 = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the numRegOfficeChangesLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRegOfficeChangesLast12Months() {
        return numRegOfficeChangesLast12Months;
    }

    /**
     * Sets the value of the numRegOfficeChangesLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRegOfficeChangesLast12Months(Integer value) {
        this.numRegOfficeChangesLast12Months = value;
    }

    /**
     * Gets the value of the numMemArtsChangesLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumMemArtsChangesLast12Months() {
        return numMemArtsChangesLast12Months;
    }

    /**
     * Sets the value of the numMemArtsChangesLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumMemArtsChangesLast12Months(Integer value) {
        this.numMemArtsChangesLast12Months = value;
    }

    /**
     * Gets the value of the hasSubsidiaries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSubsidiaries() {
        return hasSubsidiaries;
    }

    /**
     * Sets the value of the hasSubsidiaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSubsidiaries(String value) {
        this.hasSubsidiaries = value;
    }

    /**
     * Gets the value of the isSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSubsidiary() {
        return isSubsidiary;
    }

    /**
     * Sets the value of the isSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSubsidiary(String value) {
        this.isSubsidiary = value;
    }

    /**
     * Gets the value of the numEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumEmployees() {
        return numEmployees;
    }

    /**
     * Sets the value of the numEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumEmployees(Long value) {
        this.numEmployees = value;
    }

    /**
     * Gets the value of the regOfficeCIFASIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegOfficeCIFASIndicator() {
        return regOfficeCIFASIndicator;
    }

    /**
     * Sets the value of the regOfficeCIFASIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegOfficeCIFASIndicator(String value) {
        this.regOfficeCIFASIndicator = value;
    }

    /**
     * Gets the value of the timeSinceLastRegOfficeChange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastRegOfficeChange() {
        return timeSinceLastRegOfficeChange;
    }

    /**
     * Sets the value of the timeSinceLastRegOfficeChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastRegOfficeChange(Integer value) {
        this.timeSinceLastRegOfficeChange = value;
    }

    /**
     * Gets the value of the numCurrDirs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCurrDirs() {
        return numCurrDirs;
    }

    /**
     * Sets the value of the numCurrDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCurrDirs(Integer value) {
        this.numCurrDirs = value;
    }

    /**
     * Gets the value of the incompleteDirsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncompleteDirsFlag() {
        return incompleteDirsFlag;
    }

    /**
     * Sets the value of the incompleteDirsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncompleteDirsFlag(String value) {
        this.incompleteDirsFlag = value;
    }

    /**
     * Gets the value of the timeSinceLastDirAppt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastDirAppt() {
        return timeSinceLastDirAppt;
    }

    /**
     * Sets the value of the timeSinceLastDirAppt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastDirAppt(Integer value) {
        this.timeSinceLastDirAppt = value;
    }

    /**
     * Gets the value of the oldestCurrDirAge property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldestCurrDirAge() {
        return oldestCurrDirAge;
    }

    /**
     * Sets the value of the oldestCurrDirAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldestCurrDirAge(Integer value) {
        this.oldestCurrDirAge = value;
    }

    /**
     * Gets the value of the numDirsHoldingShares property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDirsHoldingShares() {
        return numDirsHoldingShares;
    }

    /**
     * Sets the value of the numDirsHoldingShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDirsHoldingShares(Integer value) {
        this.numDirsHoldingShares = value;
    }

    /**
     * Gets the value of the numDisqCurrDirs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDisqCurrDirs() {
        return numDisqCurrDirs;
    }

    /**
     * Sets the value of the numDisqCurrDirs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDisqCurrDirs(Integer value) {
        this.numDisqCurrDirs = value;
    }

    /**
     * Gets the value of the numAppointmentsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumAppointmentsLast12() {
        return numAppointmentsLast12;
    }

    /**
     * Sets the value of the numAppointmentsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumAppointmentsLast12(BigDecimal value) {
        this.numAppointmentsLast12 = value;
    }

    /**
     * Gets the value of the proportionCurrDirsToPrevDirLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProportionCurrDirsToPrevDirLast12() {
        return proportionCurrDirsToPrevDirLast12;
    }

    /**
     * Sets the value of the proportionCurrDirsToPrevDirLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProportionCurrDirsToPrevDirLast12(BigDecimal value) {
        this.proportionCurrDirsToPrevDirLast12 = value;
    }

    /**
     * Gets the value of the percentageDirsResidentUK property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageDirsResidentUK() {
        return percentageDirsResidentUK;
    }

    /**
     * Sets the value of the percentageDirsResidentUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageDirsResidentUK(BigDecimal value) {
        this.percentageDirsResidentUK = value;
    }

    /**
     * Gets the value of the numDirsIncorpAgents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDirsIncorpAgents() {
        return numDirsIncorpAgents;
    }

    /**
     * Sets the value of the numDirsIncorpAgents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDirsIncorpAgents(Integer value) {
        this.numDirsIncorpAgents = value;
    }

    /**
     * Gets the value of the directorsCIFASFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorsCIFASFlag() {
        return directorsCIFASFlag;
    }

    /**
     * Sets the value of the directorsCIFASFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorsCIFASFlag(String value) {
        this.directorsCIFASFlag = value;
    }

    /**
     * Gets the value of the directorsNOCFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorsNOCFlag() {
        return directorsNOCFlag;
    }

    /**
     * Sets the value of the directorsNOCFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorsNOCFlag(String value) {
        this.directorsNOCFlag = value;
    }

    /**
     * Gets the value of the numWindUpOrders property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumWindUpOrders() {
        return numWindUpOrders;
    }

    /**
     * Sets the value of the numWindUpOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumWindUpOrders(Integer value) {
        this.numWindUpOrders = value;
    }

    /**
     * Gets the value of the timeSinceLastWindUpOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastWindUpOrder() {
        return timeSinceLastWindUpOrder;
    }

    /**
     * Sets the value of the timeSinceLastWindUpOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastWindUpOrder(Long value) {
        this.timeSinceLastWindUpOrder = value;
    }

    /**
     * Gets the value of the numApptVolLiquidator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumApptVolLiquidator() {
        return numApptVolLiquidator;
    }

    /**
     * Sets the value of the numApptVolLiquidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumApptVolLiquidator(Integer value) {
        this.numApptVolLiquidator = value;
    }

    /**
     * Gets the value of the timeSinceLastApptVolLiquidator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastApptVolLiquidator() {
        return timeSinceLastApptVolLiquidator;
    }

    /**
     * Sets the value of the timeSinceLastApptVolLiquidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastApptVolLiquidator(Long value) {
        this.timeSinceLastApptVolLiquidator = value;
    }

    /**
     * Gets the value of the numMeetingsCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumMeetingsCreditors() {
        return numMeetingsCreditors;
    }

    /**
     * Sets the value of the numMeetingsCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumMeetingsCreditors(Integer value) {
        this.numMeetingsCreditors = value;
    }

    /**
     * Gets the value of the timeSinceLastMeetingCreditors property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastMeetingCreditors() {
        return timeSinceLastMeetingCreditors;
    }

    /**
     * Sets the value of the timeSinceLastMeetingCreditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastMeetingCreditors(Long value) {
        this.timeSinceLastMeetingCreditors = value;
    }

    /**
     * Gets the value of the numResolutionWindUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumResolutionWindUp() {
        return numResolutionWindUp;
    }

    /**
     * Sets the value of the numResolutionWindUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumResolutionWindUp(Integer value) {
        this.numResolutionWindUp = value;
    }

    /**
     * Gets the value of the timeSinceLastResolutionWindUp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastResolutionWindUp() {
        return timeSinceLastResolutionWindUp;
    }

    /**
     * Sets the value of the timeSinceLastResolutionWindUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastResolutionWindUp(Long value) {
        this.timeSinceLastResolutionWindUp = value;
    }

    /**
     * Gets the value of the numApptCompLiquidator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumApptCompLiquidator() {
        return numApptCompLiquidator;
    }

    /**
     * Sets the value of the numApptCompLiquidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumApptCompLiquidator(Integer value) {
        this.numApptCompLiquidator = value;
    }

    /**
     * Gets the value of the timeSinceLastApptCompLiquidator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastApptCompLiquidator() {
        return timeSinceLastApptCompLiquidator;
    }

    /**
     * Sets the value of the timeSinceLastApptCompLiquidator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastApptCompLiquidator(Long value) {
        this.timeSinceLastApptCompLiquidator = value;
    }

    /**
     * Gets the value of the numApptReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumApptReceiver() {
        return numApptReceiver;
    }

    /**
     * Sets the value of the numApptReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumApptReceiver(Integer value) {
        this.numApptReceiver = value;
    }

    /**
     * Gets the value of the timeSinceLastApptReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastApptReceiver() {
        return timeSinceLastApptReceiver;
    }

    /**
     * Sets the value of the timeSinceLastApptReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastApptReceiver(Long value) {
        this.timeSinceLastApptReceiver = value;
    }

    /**
     * Gets the value of the numReceiverCeasing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumReceiverCeasing() {
        return numReceiverCeasing;
    }

    /**
     * Sets the value of the numReceiverCeasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumReceiverCeasing(Integer value) {
        this.numReceiverCeasing = value;
    }

    /**
     * Gets the value of the timeSinceLastReceiverCeasing property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastReceiverCeasing() {
        return timeSinceLastReceiverCeasing;
    }

    /**
     * Sets the value of the timeSinceLastReceiverCeasing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastReceiverCeasing(Long value) {
        this.timeSinceLastReceiverCeasing = value;
    }

    /**
     * Gets the value of the numPetitionCompWindUp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPetitionCompWindUp() {
        return numPetitionCompWindUp;
    }

    /**
     * Sets the value of the numPetitionCompWindUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPetitionCompWindUp(Integer value) {
        this.numPetitionCompWindUp = value;
    }

    /**
     * Gets the value of the timeSinceLastPetitionCompWindUp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastPetitionCompWindUp() {
        return timeSinceLastPetitionCompWindUp;
    }

    /**
     * Sets the value of the timeSinceLastPetitionCompWindUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastPetitionCompWindUp(Long value) {
        this.timeSinceLastPetitionCompWindUp = value;
    }

    /**
     * Gets the value of the numDismissedPetition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDismissedPetition() {
        return numDismissedPetition;
    }

    /**
     * Sets the value of the numDismissedPetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDismissedPetition(Integer value) {
        this.numDismissedPetition = value;
    }

    /**
     * Gets the value of the timeSinceLastDismissedPetition property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastDismissedPetition() {
        return timeSinceLastDismissedPetition;
    }

    /**
     * Sets the value of the timeSinceLastDismissedPetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastDismissedPetition(Long value) {
        this.timeSinceLastDismissedPetition = value;
    }

    /**
     * Gets the value of the numApptAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumApptAdministrator() {
        return numApptAdministrator;
    }

    /**
     * Sets the value of the numApptAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumApptAdministrator(Integer value) {
        this.numApptAdministrator = value;
    }

    /**
     * Gets the value of the timeSinceLastApptAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastApptAdministrator() {
        return timeSinceLastApptAdministrator;
    }

    /**
     * Sets the value of the timeSinceLastApptAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastApptAdministrator(Long value) {
        this.timeSinceLastApptAdministrator = value;
    }

    /**
     * Gets the value of the numDischargeAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDischargeAdministrator() {
        return numDischargeAdministrator;
    }

    /**
     * Sets the value of the numDischargeAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDischargeAdministrator(Integer value) {
        this.numDischargeAdministrator = value;
    }

    /**
     * Gets the value of the timeSinceLastDischargeAdministrator property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastDischargeAdministrator() {
        return timeSinceLastDischargeAdministrator;
    }

    /**
     * Sets the value of the timeSinceLastDischargeAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastDischargeAdministrator(Long value) {
        this.timeSinceLastDischargeAdministrator = value;
    }

    /**
     * Gets the value of the numApprovalVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumApprovalVolArrangement() {
        return numApprovalVolArrangement;
    }

    /**
     * Sets the value of the numApprovalVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumApprovalVolArrangement(Integer value) {
        this.numApprovalVolArrangement = value;
    }

    /**
     * Gets the value of the timeSinceLastApprovalVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastApprovalVolArrangement() {
        return timeSinceLastApprovalVolArrangement;
    }

    /**
     * Sets the value of the timeSinceLastApprovalVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastApprovalVolArrangement(Long value) {
        this.timeSinceLastApprovalVolArrangement = value;
    }

    /**
     * Gets the value of the numRevocationVoluntaryArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRevocationVoluntaryArrangement() {
        return numRevocationVoluntaryArrangement;
    }

    /**
     * Sets the value of the numRevocationVoluntaryArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRevocationVoluntaryArrangement(Integer value) {
        this.numRevocationVoluntaryArrangement = value;
    }

    /**
     * Gets the value of the timeSinceLastRevocationVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastRevocationVolArrangement() {
        return timeSinceLastRevocationVolArrangement;
    }

    /**
     * Sets the value of the timeSinceLastRevocationVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastRevocationVolArrangement(Long value) {
        this.timeSinceLastRevocationVolArrangement = value;
    }

    /**
     * Gets the value of the numSuspensionVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSuspensionVolArrangement() {
        return numSuspensionVolArrangement;
    }

    /**
     * Sets the value of the numSuspensionVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSuspensionVolArrangement(Integer value) {
        this.numSuspensionVolArrangement = value;
    }

    /**
     * Gets the value of the timeSinceLastSuspensionVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastSuspensionVolArrangement() {
        return timeSinceLastSuspensionVolArrangement;
    }

    /**
     * Sets the value of the timeSinceLastSuspensionVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastSuspensionVolArrangement(Long value) {
        this.timeSinceLastSuspensionVolArrangement = value;
    }

    /**
     * Gets the value of the numCompletionsVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCompletionsVolArrangement() {
        return numCompletionsVolArrangement;
    }

    /**
     * Sets the value of the numCompletionsVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCompletionsVolArrangement(Integer value) {
        this.numCompletionsVolArrangement = value;
    }

    /**
     * Gets the value of the timeSinceLastCompletionVolArrangement property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastCompletionVolArrangement() {
        return timeSinceLastCompletionVolArrangement;
    }

    /**
     * Sets the value of the timeSinceLastCompletionVolArrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastCompletionVolArrangement(Long value) {
        this.timeSinceLastCompletionVolArrangement = value;
    }

    /**
     * Gets the value of the numIntentionToDissolve property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumIntentionToDissolve() {
        return numIntentionToDissolve;
    }

    /**
     * Sets the value of the numIntentionToDissolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumIntentionToDissolve(Integer value) {
        this.numIntentionToDissolve = value;
    }

    /**
     * Gets the value of the timeSinceLastIntentionToDissolve property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastIntentionToDissolve() {
        return timeSinceLastIntentionToDissolve;
    }

    /**
     * Sets the value of the timeSinceLastIntentionToDissolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastIntentionToDissolve(Long value) {
        this.timeSinceLastIntentionToDissolve = value;
    }

    /**
     * Gets the value of the numCompanyDissolved property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCompanyDissolved() {
        return numCompanyDissolved;
    }

    /**
     * Sets the value of the numCompanyDissolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCompanyDissolved(Integer value) {
        this.numCompanyDissolved = value;
    }

    /**
     * Gets the value of the timeSinceLastCompanyDissolved property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastCompanyDissolved() {
        return timeSinceLastCompanyDissolved;
    }

    /**
     * Sets the value of the timeSinceLastCompanyDissolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastCompanyDissolved(Long value) {
        this.timeSinceLastCompanyDissolved = value;
    }

    /**
     * Gets the value of the numCompanyReinstated property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCompanyReinstated() {
        return numCompanyReinstated;
    }

    /**
     * Sets the value of the numCompanyReinstated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCompanyReinstated(Integer value) {
        this.numCompanyReinstated = value;
    }

    /**
     * Gets the value of the timeSinceLastCompanyReinstated property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastCompanyReinstated() {
        return timeSinceLastCompanyReinstated;
    }

    /**
     * Sets the value of the timeSinceLastCompanyReinstated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastCompanyReinstated(Long value) {
        this.timeSinceLastCompanyReinstated = value;
    }

    /**
     * Gets the value of the lastDerogatoryItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastDerogatoryItem() {
        return lastDerogatoryItem;
    }

    /**
     * Sets the value of the lastDerogatoryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastDerogatoryItem(String value) {
        this.lastDerogatoryItem = value;
    }

    /**
     * Gets the value of the timeSinceLastDerogatoryItem property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeSinceLastDerogatoryItem() {
        return timeSinceLastDerogatoryItem;
    }

    /**
     * Sets the value of the timeSinceLastDerogatoryItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeSinceLastDerogatoryItem(Long value) {
        this.timeSinceLastDerogatoryItem = value;
    }

    /**
     * Gets the value of the timeSinceLastWindUpHearing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastWindUpHearing() {
        return timeSinceLastWindUpHearing;
    }

    /**
     * Sets the value of the timeSinceLastWindUpHearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastWindUpHearing(Integer value) {
        this.timeSinceLastWindUpHearing = value;
    }

    /**
     * Gets the value of the ageMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeMostRecentCCJ() {
        return ageMostRecentCCJ;
    }

    /**
     * Sets the value of the ageMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeMostRecentCCJ(Integer value) {
        this.ageMostRecentCCJ = value;
    }

    /**
     * Gets the value of the valueMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueMostRecentCCJ() {
        return valueMostRecentCCJ;
    }

    /**
     * Sets the value of the valueMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueMostRecentCCJ(Long value) {
        this.valueMostRecentCCJ = value;
    }

    /**
     * Gets the value of the highestValueCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHighestValueCCJ() {
        return highestValueCCJ;
    }

    /**
     * Sets the value of the highestValueCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHighestValueCCJ(Long value) {
        this.highestValueCCJ = value;
    }

    /**
     * Gets the value of the numberCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs0To72() {
        return numberCCJs0To72;
    }

    /**
     * Sets the value of the numberCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs0To72(Integer value) {
        this.numberCCJs0To72 = value;
    }

    /**
     * Gets the value of the valueCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs0To72() {
        return valueCCJs0To72;
    }

    /**
     * Sets the value of the valueCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs0To72(Long value) {
        this.valueCCJs0To72 = value;
    }

    /**
     * Gets the value of the numberCCJsLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJsLast12Months() {
        return numberCCJsLast12Months;
    }

    /**
     * Sets the value of the numberCCJsLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJsLast12Months(Integer value) {
        this.numberCCJsLast12Months = value;
    }

    /**
     * Gets the value of the valueCCJsLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJsLast12Months() {
        return valueCCJsLast12Months;
    }

    /**
     * Sets the value of the valueCCJsLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJsLast12Months(Long value) {
        this.valueCCJsLast12Months = value;
    }

    /**
     * Gets the value of the numberCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs13To24() {
        return numberCCJs13To24;
    }

    /**
     * Sets the value of the numberCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs13To24(Integer value) {
        this.numberCCJs13To24 = value;
    }

    /**
     * Gets the value of the valueCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs13To24() {
        return valueCCJs13To24;
    }

    /**
     * Sets the value of the valueCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs13To24(Long value) {
        this.valueCCJs13To24 = value;
    }

    /**
     * Gets the value of the numberCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs25To36() {
        return numberCCJs25To36;
    }

    /**
     * Sets the value of the numberCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs25To36(Integer value) {
        this.numberCCJs25To36 = value;
    }

    /**
     * Gets the value of the valueCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs25To36() {
        return valueCCJs25To36;
    }

    /**
     * Sets the value of the valueCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs25To36(Long value) {
        this.valueCCJs25To36 = value;
    }

    /**
     * Gets the value of the numberCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs37To48() {
        return numberCCJs37To48;
    }

    /**
     * Sets the value of the numberCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs37To48(Integer value) {
        this.numberCCJs37To48 = value;
    }

    /**
     * Gets the value of the valueCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs37To48() {
        return valueCCJs37To48;
    }

    /**
     * Sets the value of the valueCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs37To48(Long value) {
        this.valueCCJs37To48 = value;
    }

    /**
     * Gets the value of the numberCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs49To60() {
        return numberCCJs49To60;
    }

    /**
     * Sets the value of the numberCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs49To60(Integer value) {
        this.numberCCJs49To60 = value;
    }

    /**
     * Gets the value of the valueCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs49To60() {
        return valueCCJs49To60;
    }

    /**
     * Sets the value of the valueCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs49To60(Long value) {
        this.valueCCJs49To60 = value;
    }

    /**
     * Gets the value of the numberCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs61To72() {
        return numberCCJs61To72;
    }

    /**
     * Sets the value of the numberCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs61To72(Integer value) {
        this.numberCCJs61To72 = value;
    }

    /**
     * Gets the value of the valueCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs61To72() {
        return valueCCJs61To72;
    }

    /**
     * Sets the value of the valueCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs61To72(Long value) {
        this.valueCCJs61To72 = value;
    }

    /**
     * Gets the value of the totValCCJsPropShareFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotValCCJsPropShareFunds() {
        return totValCCJsPropShareFunds;
    }

    /**
     * Sets the value of the totValCCJsPropShareFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotValCCJsPropShareFunds(BigDecimal value) {
        this.totValCCJsPropShareFunds = value;
    }

    /**
     * Gets the value of the valCCJsLast24MonthsPropShareFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValCCJsLast24MonthsPropShareFunds() {
        return valCCJsLast24MonthsPropShareFunds;
    }

    /**
     * Sets the value of the valCCJsLast24MonthsPropShareFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValCCJsLast24MonthsPropShareFunds(BigDecimal value) {
        this.valCCJsLast24MonthsPropShareFunds = value;
    }

    /**
     * Gets the value of the numUnsatPartSatMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumUnsatPartSatMortgages() {
        return numUnsatPartSatMortgages;
    }

    /**
     * Sets the value of the numUnsatPartSatMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumUnsatPartSatMortgages(Integer value) {
        this.numUnsatPartSatMortgages = value;
    }

    /**
     * Gets the value of the numSatMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSatMortgages() {
        return numSatMortgages;
    }

    /**
     * Sets the value of the numSatMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSatMortgages(Integer value) {
        this.numSatMortgages = value;
    }

    /**
     * Gets the value of the numUnsatMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumUnsatMortgages() {
        return numUnsatMortgages;
    }

    /**
     * Sets the value of the numUnsatMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumUnsatMortgages(Integer value) {
        this.numUnsatMortgages = value;
    }

    /**
     * Gets the value of the currAccsAvailabe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrAccsAvailabe() {
        return currAccsAvailabe;
    }

    /**
     * Sets the value of the currAccsAvailabe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrAccsAvailabe(String value) {
        this.currAccsAvailabe = value;
    }

    /**
     * Gets the value of the prevAccsAvailabile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevAccsAvailabile() {
        return prevAccsAvailabile;
    }

    /**
     * Sets the value of the prevAccsAvailabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevAccsAvailabile(String value) {
        this.prevAccsAvailabile = value;
    }

    /**
     * Gets the value of the outOfDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfDateFlag() {
        return outOfDateFlag;
    }

    /**
     * Sets the value of the outOfDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfDateFlag(String value) {
        this.outOfDateFlag = value;
    }

    /**
     * Gets the value of the companyClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyClass() {
        return companyClass;
    }

    /**
     * Sets the value of the companyClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyClass(String value) {
        this.companyClass = value;
    }

    /**
     * Gets the value of the dormancyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDormancyFlag() {
        return dormancyFlag;
    }

    /**
     * Sets the value of the dormancyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDormancyFlag(String value) {
        this.dormancyFlag = value;
    }

    /**
     * Gets the value of the prevAccountsDormancyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevAccountsDormancyFlag() {
        return prevAccountsDormancyFlag;
    }

    /**
     * Sets the value of the prevAccountsDormancyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevAccountsDormancyFlag(String value) {
        this.prevAccountsDormancyFlag = value;
    }

    /**
     * Gets the value of the auditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditType() {
        return auditType;
    }

    /**
     * Sets the value of the auditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditType(String value) {
        this.auditType = value;
    }

    /**
     * Gets the value of the auditorsQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditorsQualifications() {
        return auditorsQualifications;
    }

    /**
     * Sets the value of the auditorsQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditorsQualifications(String value) {
        this.auditorsQualifications = value;
    }

    /**
     * Gets the value of the latenessAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatenessAccounts() {
        return latenessAccounts;
    }

    /**
     * Sets the value of the latenessAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatenessAccounts(String value) {
        this.latenessAccounts = value;
    }

    /**
     * Gets the value of the ficheDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getFicheDate() {
        return ficheDate;
    }

    /**
     * Sets the value of the ficheDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setFicheDate(CCYYMMDD value) {
        this.ficheDate = value;
    }

    /**
     * Gets the value of the numberDaysToFile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDaysToFile() {
        return numberDaysToFile;
    }

    /**
     * Sets the value of the numberDaysToFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDaysToFile(Integer value) {
        this.numberDaysToFile = value;
    }

    /**
     * Gets the value of the numYearsAccosAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumYearsAccosAvailable() {
        return numYearsAccosAvailable;
    }

    /**
     * Sets the value of the numYearsAccosAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumYearsAccosAvailable(Integer value) {
        this.numYearsAccosAvailable = value;
    }

    /**
     * Gets the value of the timeSinceLastAccsSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastAccsSubmitted() {
        return timeSinceLastAccsSubmitted;
    }

    /**
     * Sets the value of the timeSinceLastAccsSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastAccsSubmitted(Integer value) {
        this.timeSinceLastAccsSubmitted = value;
    }

    /**
     * Gets the value of the timeSinceLastRetsSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeSinceLastRetsSubmitted() {
        return timeSinceLastRetsSubmitted;
    }

    /**
     * Sets the value of the timeSinceLastRetsSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeSinceLastRetsSubmitted(Integer value) {
        this.timeSinceLastRetsSubmitted = value;
    }

    /**
     * Gets the value of the latestAccountsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestAccountsType() {
        return latestAccountsType;
    }

    /**
     * Sets the value of the latestAccountsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestAccountsType(String value) {
        this.latestAccountsType = value;
    }

    /**
     * Gets the value of the dateOfAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateOfAccounts() {
        return dateOfAccounts;
    }

    /**
     * Sets the value of the dateOfAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateOfAccounts(CCYYMMDD value) {
        this.dateOfAccounts = value;
    }

    /**
     * Gets the value of the accountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Sets the value of the accountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountingPeriod(Integer value) {
        this.accountingPeriod = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the prevAccsCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevAccsCurrency() {
        return prevAccsCurrency;
    }

    /**
     * Sets the value of the prevAccsCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevAccsCurrency(String value) {
        this.prevAccsCurrency = value;
    }

    /**
     * Gets the value of the consAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsAccounts() {
        return consAccounts;
    }

    /**
     * Sets the value of the consAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsAccounts(String value) {
        this.consAccounts = value;
    }

    /**
     * Gets the value of the prevAccsConsAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevAccsConsAccounts() {
        return prevAccsConsAccounts;
    }

    /**
     * Sets the value of the prevAccsConsAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevAccsConsAccounts(String value) {
        this.prevAccsConsAccounts = value;
    }

    /**
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetWorth(Long value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntangibleAssets(Long value) {
        this.intangibleAssets = value;
    }

    /**
     * Gets the value of the fixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFixedAssets() {
        return fixedAssets;
    }

    /**
     * Sets the value of the fixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFixedAssets(Long value) {
        this.fixedAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCurrentAssets(Long value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the shortLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShortLoans() {
        return shortLoans;
    }

    /**
     * Sets the value of the shortLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShortLoans(Long value) {
        this.shortLoans = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCurrentLiabilities(Long value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the workingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkingCapital() {
        return workingCapital;
    }

    /**
     * Sets the value of the workingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkingCapital(Long value) {
        this.workingCapital = value;
    }

    /**
     * Gets the value of the capitalEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapitalEmployed() {
        return capitalEmployed;
    }

    /**
     * Sets the value of the capitalEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapitalEmployed(Long value) {
        this.capitalEmployed = value;
    }

    /**
     * Gets the value of the totalLongTermLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalLongTermLiabilities() {
        return totalLongTermLiabilities;
    }

    /**
     * Sets the value of the totalLongTermLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalLongTermLiabilities(Long value) {
        this.totalLongTermLiabilities = value;
    }

    /**
     * Gets the value of the issuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIssuedCapital() {
        return issuedCapital;
    }

    /**
     * Sets the value of the issuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIssuedCapital(Long value) {
        this.issuedCapital = value;
    }

    /**
     * Gets the value of the revaluationReserves property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevaluationReserves() {
        return revaluationReserves;
    }

    /**
     * Sets the value of the revaluationReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevaluationReserves(Long value) {
        this.revaluationReserves = value;
    }

    /**
     * Gets the value of the retainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetainedEarnings() {
        return retainedEarnings;
    }

    /**
     * Sets the value of the retainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetainedEarnings(Long value) {
        this.retainedEarnings = value;
    }

    /**
     * Gets the value of the shareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShareholdersFunds() {
        return shareholdersFunds;
    }

    /**
     * Sets the value of the shareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShareholdersFunds(Long value) {
        this.shareholdersFunds = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAssets(Long value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the grossAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossAssets() {
        return grossAssets;
    }

    /**
     * Sets the value of the grossAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossAssets(Long value) {
        this.grossAssets = value;
    }

    /**
     * Gets the value of the totalTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalTurnover() {
        return totalTurnover;
    }

    /**
     * Sets the value of the totalTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalTurnover(Long value) {
        this.totalTurnover = value;
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
     * Gets the value of the retainedProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetainedProfit() {
        return retainedProfit;
    }

    /**
     * Sets the value of the retainedProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetainedProfit(Long value) {
        this.retainedProfit = value;
    }

    /**
     * Gets the value of the creditPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditPeriod() {
        return creditPeriod;
    }

    /**
     * Sets the value of the creditPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditPeriod(Long value) {
        this.creditPeriod = value;
    }

    /**
     * Gets the value of the liquidityStandardRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiquidityStandardRatio() {
        return liquidityStandardRatio;
    }

    /**
     * Sets the value of the liquidityStandardRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiquidityStandardRatio(BigDecimal value) {
        this.liquidityStandardRatio = value;
    }

    /**
     * Gets the value of the currentratio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentratio() {
        return currentratio;
    }

    /**
     * Sets the value of the currentratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentratio(BigDecimal value) {
        this.currentratio = value;
    }

    /**
     * Gets the value of the acidTest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcidTest() {
        return acidTest;
    }

    /**
     * Sets the value of the acidTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcidTest(BigDecimal value) {
        this.acidTest = value;
    }

    /**
     * Gets the value of the returnOnCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapital() {
        return returnOnCapital;
    }

    /**
     * Sets the value of the returnOnCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapital(BigDecimal value) {
        this.returnOnCapital = value;
    }

    /**
     * Gets the value of the returnOnAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnAssets() {
        return returnOnAssets;
    }

    /**
     * Sets the value of the returnOnAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnAssets(BigDecimal value) {
        this.returnOnAssets = value;
    }

    /**
     * Gets the value of the preTaxProfitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxProfitMargin() {
        return preTaxProfitMargin;
    }

    /**
     * Sets the value of the preTaxProfitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxProfitMargin(BigDecimal value) {
        this.preTaxProfitMargin = value;
    }

    /**
     * Gets the value of the borrowingRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorrowingRatio() {
        return borrowingRatio;
    }

    /**
     * Sets the value of the borrowingRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorrowingRatio(BigDecimal value) {
        this.borrowingRatio = value;
    }

    /**
     * Gets the value of the equityGearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityGearing() {
        return equityGearing;
    }

    /**
     * Sets the value of the equityGearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityGearing(BigDecimal value) {
        this.equityGearing = value;
    }

    /**
     * Gets the value of the debtGearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtGearing() {
        return debtGearing;
    }

    /**
     * Sets the value of the debtGearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtGearing(BigDecimal value) {
        this.debtGearing = value;
    }

    /**
     * Gets the value of the turnoverPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverPerEmp() {
        return turnoverPerEmp;
    }

    /**
     * Sets the value of the turnoverPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverPerEmp(BigDecimal value) {
        this.turnoverPerEmp = value;
    }

    /**
     * Gets the value of the totAssetsEmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAssetsEmp() {
        return totAssetsEmp;
    }

    /**
     * Sets the value of the totAssetsEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotAssetsEmp(BigDecimal value) {
        this.totAssetsEmp = value;
    }

    /**
     * Gets the value of the totalFixedAssetsPercentTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFixedAssetsPercentTotalAssets() {
        return totalFixedAssetsPercentTotalAssets;
    }

    /**
     * Sets the value of the totalFixedAssetsPercentTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFixedAssetsPercentTotalAssets(BigDecimal value) {
        this.totalFixedAssetsPercentTotalAssets = value;
    }

    /**
     * Gets the value of the currentLiabilitiesPercentTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentLiabilitiesPercentTotalAssets() {
        return currentLiabilitiesPercentTotalAssets;
    }

    /**
     * Sets the value of the currentLiabilitiesPercentTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentLiabilitiesPercentTotalAssets(BigDecimal value) {
        this.currentLiabilitiesPercentTotalAssets = value;
    }

    /**
     * Gets the value of the capitalEmployedPercentTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalEmployedPercentTotalAssets() {
        return capitalEmployedPercentTotalAssets;
    }

    /**
     * Sets the value of the capitalEmployedPercentTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalEmployedPercentTotalAssets(BigDecimal value) {
        this.capitalEmployedPercentTotalAssets = value;
    }

    /**
     * Gets the value of the stocksWorkInProgressPercentCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStocksWorkInProgressPercentCurrentAssets() {
        return stocksWorkInProgressPercentCurrentAssets;
    }

    /**
     * Sets the value of the stocksWorkInProgressPercentCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStocksWorkInProgressPercentCurrentAssets(BigDecimal value) {
        this.stocksWorkInProgressPercentCurrentAssets = value;
    }

    /**
     * Gets the value of the workingCapitalPercentCurrentPlusFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapitalPercentCurrentPlusFixedAssets() {
        return workingCapitalPercentCurrentPlusFixedAssets;
    }

    /**
     * Sets the value of the workingCapitalPercentCurrentPlusFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapitalPercentCurrentPlusFixedAssets(BigDecimal value) {
        this.workingCapitalPercentCurrentPlusFixedAssets = value;
    }

    /**
     * Gets the value of the baseTrendShareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseTrendShareholdersFunds() {
        return baseTrendShareholdersFunds;
    }

    /**
     * Sets the value of the baseTrendShareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseTrendShareholdersFunds(Integer value) {
        this.baseTrendShareholdersFunds = value;
    }

    /**
     * Gets the value of the percentChangeShareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeShareholdersFunds() {
        return percentChangeShareholdersFunds;
    }

    /**
     * Sets the value of the percentChangeShareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeShareholdersFunds(BigDecimal value) {
        this.percentChangeShareholdersFunds = value;
    }

    /**
     * Gets the value of the percentChangeCapitalEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeCapitalEmployed() {
        return percentChangeCapitalEmployed;
    }

    /**
     * Sets the value of the percentChangeCapitalEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeCapitalEmployed(BigDecimal value) {
        this.percentChangeCapitalEmployed = value;
    }

    /**
     * Gets the value of the percentChangeTotalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeTotalAssets() {
        return percentChangeTotalAssets;
    }

    /**
     * Sets the value of the percentChangeTotalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeTotalAssets(BigDecimal value) {
        this.percentChangeTotalAssets = value;
    }

    /**
     * Gets the value of the percentChangeCurrentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeCurrentRatio() {
        return percentChangeCurrentRatio;
    }

    /**
     * Sets the value of the percentChangeCurrentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeCurrentRatio(BigDecimal value) {
        this.percentChangeCurrentRatio = value;
    }

    /**
     * Gets the value of the percentChangePreTaxProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangePreTaxProfitLoss() {
        return percentChangePreTaxProfitLoss;
    }

    /**
     * Sets the value of the percentChangePreTaxProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangePreTaxProfitLoss(BigDecimal value) {
        this.percentChangePreTaxProfitLoss = value;
    }

    /**
     * Gets the value of the numYearsPreTaxProfitLessThan0Last4Years property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumYearsPreTaxProfitLessThan0Last4Years() {
        return numYearsPreTaxProfitLessThan0Last4Years;
    }

    /**
     * Sets the value of the numYearsPreTaxProfitLessThan0Last4Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumYearsPreTaxProfitLessThan0Last4Years(Integer value) {
        this.numYearsPreTaxProfitLessThan0Last4Years = value;
    }

    /**
     * Gets the value of the returnOnAssetsQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnOnAssetsQuartile() {
        return returnOnAssetsQuartile;
    }

    /**
     * Sets the value of the returnOnAssetsQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnOnAssetsQuartile(Integer value) {
        this.returnOnAssetsQuartile = value;
    }

    /**
     * Gets the value of the preTaxMarginQuartile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreTaxMarginQuartile() {
        return preTaxMarginQuartile;
    }

    /**
     * Sets the value of the preTaxMarginQuartile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreTaxMarginQuartile(Integer value) {
        this.preTaxMarginQuartile = value;
    }

    /**
     * Gets the value of the filedAccsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAccsType() {
        return filedAccsType;
    }

    /**
     * Sets the value of the filedAccsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAccsType(String value) {
        this.filedAccsType = value;
    }

    /**
     * Gets the value of the reportUpdateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportUpdateFlag() {
        return reportUpdateFlag;
    }

    /**
     * Sets the value of the reportUpdateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportUpdateFlag(String value) {
        this.reportUpdateFlag = value;
    }

}
