
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialBalanceSheetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialBalanceSheetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PersonnelChargesFullTime" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursHalfTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PersonnelChargesHalfTime" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursTotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PersonnelChargesTotal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BenefitsinAdditionToWagesTotal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursTotalPrecedingPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PersonnelChargesTotalPrecedingPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BenefitsinAdditionToWagesTotalPrecedingPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NoEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFullTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFullTimePrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFullTimeSecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFullTimeHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFullTimeHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFullTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFullTimePrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFullTimeSecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFullTimeHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFullTimeHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ManagementPersonnelFullTimeatClosingDateFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmployeesFullTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="WorkersFullTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherFullTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePartTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePartTimePrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePartTimeSecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePartTimeHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePartTimeHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePartTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePartTimePrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePartTimeSecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePartTimeHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePartTimeHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ManagementPersonnelPartTimeatClosingDateFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmployeesPartTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="WorkersPartTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherPartTimeatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpRecinPersRegClsgDtFinPrdTotFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ByNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFTEPrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFTESecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFTEHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleFTEHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFTEPrimaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFTESecondaryEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFTEHigherNonUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleFTEHigherUniversityEducationQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ManagementPersonnelFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmployeesFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="WorkersFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherFTEatClosingDateFinancialPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AverageNumberPersonnelEmployedTemporaryPersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NumberActualWorkingHoursTemporaryPersonnelQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ChargesToEnterpriseTemporaryPersonnel" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvNoPersonnelEmployedPersonsDisposalEnterpriseQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoActualWorkingHrsPersonsDisposalEnterpriseQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ChargesToEnterprisePersonsDisposalEnterprise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NoEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSpecificWorkEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubstitutionEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniversityEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniversityEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationEntrantsFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSpecificWorkEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubstitutionEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniversityEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniversityEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationEntrantsPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniversityEducationEntrantsTotalFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationEntrantsTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSpecificWorkLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubsitutionLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniversityEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniversityEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PensionLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PrepensionLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DismissalLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherReasonLeaversFullTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FormerEmpContServLeastPartTSelfEmployedPersonFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSpecificWorkLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubstitutionLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniversityEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniversityEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PensionLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PrepensionLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DismissalLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherReasonLeaversPartTimeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsLimitedDurationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ContractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MalePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleSecondaryEducationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleUniversityEducationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemalePrimaryEducationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleSecondaryEducationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleUniversityEducationLeaversTotalFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PensionLeaversTotalFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PrepensionLeaversTotalFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DismissalLeaversTotalFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherReasonLeaversTotalFullTimeEquivalentsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessPlanMaleNumberEmployedPersonsInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessPlanFemaleNumberEmployedPersonsInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmployAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmploymentAgreements19951996FemaleNoEmployedPersonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PlanningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmplGenFinPrfMaribelNoEmplPersonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesAdvantageHiringPlan" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesSocialMaribel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesStructurereductionSocSecuritycontribution" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesProfessionalTransitionProgram" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesEmploymentServices" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpContrWkVocTraingNoEmplQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesFirstjobconvention" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmplConventPrepensionNoEmplPersonsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesReductionofSocialSecuritylowsalaryrange" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OthMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpIn1orMoreMeasStimEmplymntTotForFinPeriodQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpin1orMoreMeasStimEmploymentTotalPrevFinlPrdQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfLowWagesNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="EmplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PlngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfMaribelNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenVocReinteg50YearsNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FullTimeEquivalentEmployeesAdvantageHiringPlan" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenConvPartTPrepensionNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FullTimeEquivalentEmployeesSocialMaribel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FTEEmployeesStructurereductionSocSecuritycontribution" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FTEEmployeesProfessionalTransitionProgram" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FullTimeEquivalentEmployeesEmploymentServices" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpCntr1stProfExpNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OthMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FullTimeEquivalentEmployeesFirstjobconvention" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpConvPrepensionNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FTEEmployeesReductionofSocialSecuritylowsalaryrange" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OthMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OtherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="OthMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmpin1orMoreMeasStimEmpTotFinPrdinFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="NoEmp1orMoreMeasStimEmpTotPrevFinPrdFTEQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MeasStimEmployGeneratingFinPrfBusPlanFinPrfQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BusinessPlanMaleFinancialProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BusinessPlanFemaleFinancialProfitinThousandFrancs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimEmplGenFinPrfPlngJobsForYouthFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimulatEmplyGeneratingFinPrfLowWagesFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployAgreementsMale19951996FinProfitThousandFrs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmployAgreemtsFemale19951996FinProfitThousandFrs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlanningJobsForLongTermUnemployedFinancialProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimulatingEmployGeneratingFinPrfMaribelFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfVocReintegrat50YrsFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvantageHiringPlanAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimEmpGenFinPrfConvntPartTPrepensionFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasStimEmplGenFinPrfFullCareerInterruptFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MeasEmpGenReductJobPerfPartTCareerIntrptFinPrf" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SocialMaribelAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StructureReductionSocialSecurityContributionAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfessionalTransitionProgramAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EmploymentServicesAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="VocationalTrainingContractAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ApprenticeshipContractsAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FirstJobConventionAmount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TrainingInitiativesExpenseEmployerMaleNoEmployeesQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TrainingInitiativesExpenseEmployerFemaleNoEmployQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TrainInitiatExpEmployerMaleNoTrainingHoursQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TrainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TrainingInitiatExpEmployerMaleChargesToEntrerp" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaleGrosscostofformalprofessionaltraining" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MalePaidcontributionsandpaymentstopublicfunds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleBenefitsreceivedfortraining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TrainInitiatExpEmployerFemaleChargesToEnterpr" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FemaleGrosscostofformalprofessionaltraining" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FemalePaidcontributionsandpaymentstopublicfunds" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleBenefitsreceivedfortraining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleEmployeeNumEngagedintrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleTotalHoursEngagedintrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleEmployeeNumAttendedtrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleEmployeeNumEngagedintrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleTotalHoursEngagedintrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleEmployeeNumAttendedtrainingcoachingortutoring" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleInformalProfessionalTrainingInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleinInformalProfessionalTrainingHoursQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleNetcostInformalProfessionalTraining" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FemaleInformalProfessionalTrainingInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleinInformalProfessionalTrainingHoursQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleNetcostInformalProfessionalTraining" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleEmplyerExpInformalProfessionalTrainingHoursQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaleEmplyerExpNetcostInformalProfessionalTraining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleEmplyerExpInformalProfessionalTrainingHoursQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="FemaleEmplyerExpNetcostInformalProfessionalTraining" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialBalanceSheetType", propOrder = {
    "avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity",
    "numberActualWorkingHoursFullTimeQuantity",
    "personnelChargesFullTime",
    "avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity",
    "numberActualWorkingHoursHalfTimeQuantity",
    "personnelChargesHalfTime",
    "avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity",
    "numberActualWorkingHoursTotalQuantity",
    "personnelChargesTotal",
    "benefitsinAdditionToWagesTotal",
    "avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity",
    "numberActualWorkingHoursTotalPrecedingPeriodQuantity",
    "personnelChargesTotalPrecedingPeriod",
    "benefitsinAdditionToWagesTotalPrecedingPeriod",
    "noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity",
    "byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity",
    "byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity",
    "byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity",
    "byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity",
    "maleFullTimeatClosingDateFinancialPeriodQuantity",
    "maleFullTimePrimaryEducationQuantity",
    "maleFullTimeSecondaryEducationQuantity",
    "maleFullTimeHigherNonUniversityEducationQuantity",
    "maleFullTimeHigherUniversityEducationQuantity",
    "femaleFullTimeatClosingDateFinancialPeriodQuantity",
    "femaleFullTimePrimaryEducationQuantity",
    "femaleFullTimeSecondaryEducationQuantity",
    "femaleFullTimeHigherNonUniversityEducationQuantity",
    "femaleFullTimeHigherUniversityEducationQuantity",
    "managementPersonnelFullTimeatClosingDateFinPeriodQuantity",
    "employeesFullTimeatClosingDateFinancialPeriodQuantity",
    "workersFullTimeatClosingDateFinancialPeriodQuantity",
    "otherFullTimeatClosingDateFinancialPeriodQuantity",
    "noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity",
    "byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity",
    "byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity",
    "byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity",
    "byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity",
    "malePartTimeatClosingDateFinancialPeriodQuantity",
    "malePartTimePrimaryEducationQuantity",
    "malePartTimeSecondaryEducationQuantity",
    "malePartTimeHigherNonUniversityEducationQuantity",
    "malePartTimeHigherUniversityEducationQuantity",
    "femalePartTimeatClosingDateFinancialPeriodQuantity",
    "femalePartTimePrimaryEducationQuantity",
    "femalePartTimeSecondaryEducationQuantity",
    "femalePartTimeHigherNonUniversityEducationQuantity",
    "femalePartTimeHigherUniversityEducationQuantity",
    "managementPersonnelPartTimeatClosingDateFinPeriodQuantity",
    "employeesPartTimeatClosingDateFinancialPeriodQuantity",
    "workersPartTimeatClosingDateFinancialPeriodQuantity",
    "otherPartTimeatClosingDateFinancialPeriodQuantity",
    "noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity",
    "byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity",
    "byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity",
    "byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity",
    "byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity",
    "maleFTEatClosingDateFinancialPeriodQuantity",
    "maleFTEPrimaryEducationQuantity",
    "maleFTESecondaryEducationQuantity",
    "maleFTEHigherNonUniversityEducationQuantity",
    "maleFTEHigherUniversityEducationQuantity",
    "femaleFTEatClosingDateFinancialPeriodQuantity",
    "femaleFTEPrimaryEducationQuantity",
    "femaleFTESecondaryEducationQuantity",
    "femaleFTEHigherNonUniversityEducationQuantity",
    "femaleFTEHigherUniversityEducationQuantity",
    "managementPersonnelFTEatClosingDateFinancialPeriodQuantity",
    "employeesFTEatClosingDateFinancialPeriodQuantity",
    "workersFTEatClosingDateFinancialPeriodQuantity",
    "otherFTEatClosingDateFinancialPeriodQuantity",
    "averageNumberPersonnelEmployedTemporaryPersonnelQuantity",
    "numberActualWorkingHoursTemporaryPersonnelQuantity",
    "chargesToEnterpriseTemporaryPersonnel",
    "avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity",
    "noActualWorkingHrsPersonsDisposalEnterpriseQuantity",
    "chargesToEnterprisePersonsDisposalEnterprise",
    "noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity",
    "contractsUnlimitedDurationEntrantsFullTimeQuantity",
    "contractsLimitedDurationEntrantsFullTimeQuantity",
    "contractsRegardingSpecificWorkEntrantsFullTimeQuantity",
    "contractsRegardingSubstitutionEntrantsFullTimeQuantity",
    "malePrimaryEducationEntrantsFullTimeQuantity",
    "maleSecondaryEducationEntrantsFullTimeQuantity",
    "maleHigherNonUniversityEducationEntrantsFullTimeQuantity",
    "maleUniversityEducationEntrantsFullTimeQuantity",
    "femalePrimaryEducationEntrantsFullTimeQuantity",
    "femaleSecondaryEducationEntrantsFullTimeQuantity",
    "femaleHigherNonUniversityEducationEntrantsFullTimeQuantity",
    "femaleUniversityEducationEntrantsFullTimeQuantity",
    "noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity",
    "contractsUnlimitedDurationEntrantsPartTimeQuantity",
    "contractsLimitedDurationEntrantsPartTimeQuantity",
    "contractsRegardingSpecificWorkEntrantsPartTimeQuantity",
    "contractsRegardingSubstitutionEntrantsPartTimeQuantity",
    "malePrimaryEducationEntrantsPartTimeQuantity",
    "maleSecondaryEducationEntrantsPartTimeQuantity",
    "maleHigherNonUniversityEducationEntrantsPartTimeQuantity",
    "maleUniversityEducationEntrantsPartTimeQuantity",
    "femalePrimaryEducationEntrantsPartTimeQuantity",
    "femaleSecondaryEducationEntrantsPartTimeQuantity",
    "femaleHigherNonUniversityEducationEntrantsPartTimeQuantity",
    "femaleUniversityEducationEntrantsPartTimeQuantity",
    "noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity",
    "contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity",
    "contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity",
    "contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity",
    "contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity",
    "malePrimaryEducationEntrantsTotalFullTimeEquivQuantity",
    "maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity",
    "maleHigherNonUniversityEducationEntrantsTotalFTEQuantity",
    "maleUniversityEducationEntrantsTotalFullTimeEquivQuantity",
    "femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity",
    "femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity",
    "femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity",
    "femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity",
    "noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity",
    "contractsUnlimitedDurationLeaversFullTimeQuantity",
    "contractsLimitedDurationLeaversFullTimeQuantity",
    "contractsRegardingSpecificWorkLeaversFullTimeQuantity",
    "contractsRegardingSubsitutionLeaversFullTimeQuantity",
    "malePrimaryEducationLeaversFullTimeQuantity",
    "maleSecondaryEducationLeaversFullTimeQuantity",
    "maleHigherNonUniversityEducationLeaversFullTimeQuantity",
    "maleUniversityEducationLeaversFullTimeQuantity",
    "femalePrimaryEducationLeaversFullTimeQuantity",
    "femaleSecondaryEducationLeaversFullTimeQuantity",
    "femaleHigherNonUniversityEducationLeaversFullTimeQuantity",
    "femaleUniversityEducationLeaversFullTimeQuantity",
    "pensionLeaversFullTimeQuantity",
    "prepensionLeaversFullTimeQuantity",
    "dismissalLeaversFullTimeQuantity",
    "otherReasonLeaversFullTimeQuantity",
    "formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity",
    "noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity",
    "contractsUnlimitedDurationLeaversPartTimeQuantity",
    "contractsLimitedDurationLeaversPartTimeQuantity",
    "contractsRegardingSpecificWorkLeaversPartTimeQuantity",
    "contractsRegardingSubstitutionLeaversPartTimeQuantity",
    "malePrimaryEducationLeaversPartTimeQuantity",
    "maleSecondaryEducationLeaversPartTimeQuantity",
    "maleHigherNonUniversityEducationLeaversPartTimeQuantity",
    "maleUniversityEducationLeaversPartTimeQuantity",
    "femalePrimaryEducationLeaversPartTimeQuantity",
    "femaleSecondaryEducationLeaversPartTimeQuantity",
    "femaleHigherNonUniversityEducationLeaversPartTimeQuantity",
    "femaleUniversityEducationLeaversPartTimeQuantity",
    "pensionLeaversPartTimeQuantity",
    "prepensionLeaversPartTimeQuantity",
    "dismissalLeaversPartTimeQuantity",
    "otherReasonLeaversPartTimeQuantity",
    "noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity",
    "noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity",
    "contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity",
    "contractsLimitedDurationLeaversTotalFullTimeEquivQuantity",
    "contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity",
    "contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity",
    "malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity",
    "maleSecondaryEducationLeaversTotalFullTimeEquivQuantity",
    "maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity",
    "maleUniversityEducationLeaversTotalFullTimeEquivQuantity",
    "femalePrimaryEducationLeaversTotalFullTimeEquivQuantity",
    "femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity",
    "femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity",
    "femaleUniversityEducationLeaversTotalFullTimeEquivQuantity",
    "pensionLeaversTotalFullTimeEquivalentsQuantity",
    "prepensionLeaversTotalFullTimeEquivalentsQuantity",
    "dismissalLeaversTotalFullTimeEquivalentsQuantity",
    "otherReasonLeaversTotalFullTimeEquivalentsQuantity",
    "noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity",
    "measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity",
    "businessPlanMaleNumberEmployedPersonsInvolvedQuantity",
    "businessPlanFemaleNumberEmployedPersonsInvolvedQuantity",
    "measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity",
    "measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity",
    "measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity",
    "employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity",
    "employmentAgreements19951996FemaleNoEmployedPersonsQuantity",
    "planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity",
    "measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity",
    "measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity",
    "totalEmployeesAdvantageHiringPlan",
    "measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity",
    "measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity",
    "measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity",
    "otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity",
    "otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity",
    "totalEmployeesSocialMaribel",
    "totalEmployeesStructurereductionSocSecuritycontribution",
    "totalEmployeesProfessionalTransitionProgram",
    "totalEmployeesEmploymentServices",
    "otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity",
    "otherMeasStimEmpContrWkVocTraingNoEmplQuantity",
    "otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity",
    "totalEmployeesFirstjobconvention",
    "otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity",
    "otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity",
    "totalEmployeesReductionofSocialSecuritylowsalaryrange",
    "otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity",
    "otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity",
    "othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity",
    "noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity",
    "noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity",
    "measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity",
    "businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity",
    "businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity",
    "measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity",
    "measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity",
    "measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity",
    "emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity",
    "emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity",
    "plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity",
    "measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity",
    "measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity",
    "fullTimeEquivalentEmployeesAdvantageHiringPlan",
    "measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity",
    "measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity",
    "measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity",
    "fullTimeEquivalentEmployeesSocialMaribel",
    "fteEmployeesStructurereductionSocSecuritycontribution",
    "fteEmployeesProfessionalTransitionProgram",
    "fullTimeEquivalentEmployeesEmploymentServices",
    "otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity",
    "otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity",
    "otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity",
    "othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity",
    "otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity",
    "fullTimeEquivalentEmployeesFirstjobconvention",
    "otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity",
    "otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity",
    "fteEmployeesReductionofSocialSecuritylowsalaryrange",
    "othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity",
    "otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity",
    "othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity",
    "noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity",
    "noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity",
    "measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity",
    "businessPlanMaleFinancialProfit",
    "businessPlanFemaleFinancialProfitinThousandFrancs",
    "measStimEmplGenFinPrfPlngJobsForYouthFinPrf",
    "measStimulatEmplyGeneratingFinPrfLowWagesFinPrf",
    "measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf",
    "employAgreementsMale19951996FinProfitThousandFrs",
    "employAgreemtsFemale19951996FinProfitThousandFrs",
    "planningJobsForLongTermUnemployedFinancialProfit",
    "measStimulatingEmployGeneratingFinPrfMaribelFinPrf",
    "measStimEmpGenFinPrfVocReintegrat50YrsFinPrf",
    "advantageHiringPlanAmount",
    "measStimEmpGenFinPrfConvntPartTPrepensionFinPrf",
    "measStimEmplGenFinPrfFullCareerInterruptFinPrf",
    "measEmpGenReductJobPerfPartTCareerIntrptFinPrf",
    "socialMaribelAmount",
    "structureReductionSocialSecurityContributionAmount",
    "professionalTransitionProgramAmount",
    "employmentServicesAmount",
    "vocationalTrainingContractAmount",
    "apprenticeshipContractsAmount",
    "firstJobConventionAmount",
    "trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity",
    "trainingInitiativesExpenseEmployerFemaleNoEmployQuantity",
    "trainInitiatExpEmployerMaleNoTrainingHoursQuantity",
    "trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity",
    "trainingInitiatExpEmployerMaleChargesToEntrerp",
    "maleGrosscostofformalprofessionaltraining",
    "malePaidcontributionsandpaymentstopublicfunds",
    "maleBenefitsreceivedfortraining",
    "trainInitiatExpEmployerFemaleChargesToEnterpr",
    "femaleGrosscostofformalprofessionaltraining",
    "femalePaidcontributionsandpaymentstopublicfunds",
    "femaleBenefitsreceivedfortraining",
    "maleEmployeeNumEngagedintrainingcoachingortutoring",
    "maleTotalHoursEngagedintrainingcoachingortutoring",
    "maleEmployeeNumAttendedtrainingcoachingortutoring",
    "femaleEmployeeNumEngagedintrainingcoachingortutoring",
    "femaleTotalHoursEngagedintrainingcoachingortutoring",
    "femaleEmployeeNumAttendedtrainingcoachingortutoring",
    "maleInformalProfessionalTrainingInvolvedQuantity",
    "maleinInformalProfessionalTrainingHoursQuantity",
    "maleNetcostInformalProfessionalTraining",
    "femaleInformalProfessionalTrainingInvolvedQuantity",
    "femaleinInformalProfessionalTrainingHoursQuantity",
    "femaleNetcostInformalProfessionalTraining",
    "maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity",
    "maleEmplyerExpInformalProfessionalTrainingHoursQuantity",
    "maleEmplyerExpNetcostInformalProfessionalTraining",
    "femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity",
    "femaleEmplyerExpInformalProfessionalTrainingHoursQuantity",
    "femaleEmplyerExpNetcostInformalProfessionalTraining"
})
public class SocialBalanceSheetType {

    @XmlElement(name = "AvNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity")
    protected BigInteger avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity;
    @XmlElement(name = "NumberActualWorkingHoursFullTimeQuantity")
    protected BigInteger numberActualWorkingHoursFullTimeQuantity;
    @XmlElement(name = "PersonnelChargesFullTime")
    protected AmountType personnelChargesFullTime;
    @XmlElement(name = "AvNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity")
    protected BigInteger avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity;
    @XmlElement(name = "NumberActualWorkingHoursHalfTimeQuantity")
    protected BigInteger numberActualWorkingHoursHalfTimeQuantity;
    @XmlElement(name = "PersonnelChargesHalfTime")
    protected AmountType personnelChargesHalfTime;
    @XmlElement(name = "AvNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity")
    protected BigInteger avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity;
    @XmlElement(name = "NumberActualWorkingHoursTotalQuantity")
    protected BigInteger numberActualWorkingHoursTotalQuantity;
    @XmlElement(name = "PersonnelChargesTotal")
    protected AmountType personnelChargesTotal;
    @XmlElement(name = "BenefitsinAdditionToWagesTotal")
    protected AmountType benefitsinAdditionToWagesTotal;
    @XmlElement(name = "AvNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity")
    protected BigInteger avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity;
    @XmlElement(name = "NumberActualWorkingHoursTotalPrecedingPeriodQuantity")
    protected BigInteger numberActualWorkingHoursTotalPrecedingPeriodQuantity;
    @XmlElement(name = "PersonnelChargesTotalPrecedingPeriod")
    protected AmountType personnelChargesTotalPrecedingPeriod;
    @XmlElement(name = "BenefitsinAdditionToWagesTotalPrecedingPeriod")
    protected AmountType benefitsinAdditionToWagesTotalPrecedingPeriod;
    @XmlElement(name = "NoEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity")
    protected BigInteger noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity")
    protected BigInteger byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity;
    @XmlElement(name = "MaleFullTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger maleFullTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "MaleFullTimePrimaryEducationQuantity")
    protected BigInteger maleFullTimePrimaryEducationQuantity;
    @XmlElement(name = "MaleFullTimeSecondaryEducationQuantity")
    protected BigInteger maleFullTimeSecondaryEducationQuantity;
    @XmlElement(name = "MaleFullTimeHigherNonUniversityEducationQuantity")
    protected BigInteger maleFullTimeHigherNonUniversityEducationQuantity;
    @XmlElement(name = "MaleFullTimeHigherUniversityEducationQuantity")
    protected BigInteger maleFullTimeHigherUniversityEducationQuantity;
    @XmlElement(name = "FemaleFullTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger femaleFullTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "FemaleFullTimePrimaryEducationQuantity")
    protected BigInteger femaleFullTimePrimaryEducationQuantity;
    @XmlElement(name = "FemaleFullTimeSecondaryEducationQuantity")
    protected BigInteger femaleFullTimeSecondaryEducationQuantity;
    @XmlElement(name = "FemaleFullTimeHigherNonUniversityEducationQuantity")
    protected BigInteger femaleFullTimeHigherNonUniversityEducationQuantity;
    @XmlElement(name = "FemaleFullTimeHigherUniversityEducationQuantity")
    protected BigInteger femaleFullTimeHigherUniversityEducationQuantity;
    @XmlElement(name = "ManagementPersonnelFullTimeatClosingDateFinPeriodQuantity")
    protected BigInteger managementPersonnelFullTimeatClosingDateFinPeriodQuantity;
    @XmlElement(name = "EmployeesFullTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger employeesFullTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "WorkersFullTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger workersFullTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "OtherFullTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger otherFullTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "NoEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity")
    protected BigInteger noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity;
    @XmlElement(name = "MalePartTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger malePartTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "MalePartTimePrimaryEducationQuantity")
    protected BigInteger malePartTimePrimaryEducationQuantity;
    @XmlElement(name = "MalePartTimeSecondaryEducationQuantity")
    protected BigInteger malePartTimeSecondaryEducationQuantity;
    @XmlElement(name = "MalePartTimeHigherNonUniversityEducationQuantity")
    protected BigInteger malePartTimeHigherNonUniversityEducationQuantity;
    @XmlElement(name = "MalePartTimeHigherUniversityEducationQuantity")
    protected BigInteger malePartTimeHigherUniversityEducationQuantity;
    @XmlElement(name = "FemalePartTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger femalePartTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "FemalePartTimePrimaryEducationQuantity")
    protected BigInteger femalePartTimePrimaryEducationQuantity;
    @XmlElement(name = "FemalePartTimeSecondaryEducationQuantity")
    protected BigInteger femalePartTimeSecondaryEducationQuantity;
    @XmlElement(name = "FemalePartTimeHigherNonUniversityEducationQuantity")
    protected BigInteger femalePartTimeHigherNonUniversityEducationQuantity;
    @XmlElement(name = "FemalePartTimeHigherUniversityEducationQuantity")
    protected BigInteger femalePartTimeHigherUniversityEducationQuantity;
    @XmlElement(name = "ManagementPersonnelPartTimeatClosingDateFinPeriodQuantity")
    protected BigInteger managementPersonnelPartTimeatClosingDateFinPeriodQuantity;
    @XmlElement(name = "EmployeesPartTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger employeesPartTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "WorkersPartTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger workersPartTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "OtherPartTimeatClosingDateFinancialPeriodQuantity")
    protected BigInteger otherPartTimeatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "NoEmpRecinPersRegClsgDtFinPrdTotFTEQuantity")
    protected BigInteger noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity;
    @XmlElement(name = "ByNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity")
    protected BigInteger byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity;
    @XmlElement(name = "ByNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity")
    protected BigInteger byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity;
    @XmlElement(name = "ByNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity")
    protected BigInteger byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity;
    @XmlElement(name = "ByNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity")
    protected BigInteger byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity;
    @XmlElement(name = "MaleFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger maleFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "MaleFTEPrimaryEducationQuantity")
    protected BigInteger maleFTEPrimaryEducationQuantity;
    @XmlElement(name = "MaleFTESecondaryEducationQuantity")
    protected BigInteger maleFTESecondaryEducationQuantity;
    @XmlElement(name = "MaleFTEHigherNonUniversityEducationQuantity")
    protected BigInteger maleFTEHigherNonUniversityEducationQuantity;
    @XmlElement(name = "MaleFTEHigherUniversityEducationQuantity")
    protected BigInteger maleFTEHigherUniversityEducationQuantity;
    @XmlElement(name = "FemaleFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger femaleFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "FemaleFTEPrimaryEducationQuantity")
    protected BigInteger femaleFTEPrimaryEducationQuantity;
    @XmlElement(name = "FemaleFTESecondaryEducationQuantity")
    protected BigInteger femaleFTESecondaryEducationQuantity;
    @XmlElement(name = "FemaleFTEHigherNonUniversityEducationQuantity")
    protected BigInteger femaleFTEHigherNonUniversityEducationQuantity;
    @XmlElement(name = "FemaleFTEHigherUniversityEducationQuantity")
    protected BigInteger femaleFTEHigherUniversityEducationQuantity;
    @XmlElement(name = "ManagementPersonnelFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger managementPersonnelFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "EmployeesFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger employeesFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "WorkersFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger workersFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "OtherFTEatClosingDateFinancialPeriodQuantity")
    protected BigInteger otherFTEatClosingDateFinancialPeriodQuantity;
    @XmlElement(name = "AverageNumberPersonnelEmployedTemporaryPersonnelQuantity")
    protected BigInteger averageNumberPersonnelEmployedTemporaryPersonnelQuantity;
    @XmlElement(name = "NumberActualWorkingHoursTemporaryPersonnelQuantity")
    protected BigInteger numberActualWorkingHoursTemporaryPersonnelQuantity;
    @XmlElement(name = "ChargesToEnterpriseTemporaryPersonnel")
    protected AmountType chargesToEnterpriseTemporaryPersonnel;
    @XmlElement(name = "AvNoPersonnelEmployedPersonsDisposalEnterpriseQuantity")
    protected BigInteger avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity;
    @XmlElement(name = "NoActualWorkingHrsPersonsDisposalEnterpriseQuantity")
    protected BigInteger noActualWorkingHrsPersonsDisposalEnterpriseQuantity;
    @XmlElement(name = "ChargesToEnterprisePersonsDisposalEnterprise")
    protected AmountType chargesToEnterprisePersonsDisposalEnterprise;
    @XmlElement(name = "NoEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity")
    protected BigInteger noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationEntrantsFullTimeQuantity")
    protected BigInteger contractsUnlimitedDurationEntrantsFullTimeQuantity;
    @XmlElement(name = "ContractsLimitedDurationEntrantsFullTimeQuantity")
    protected BigInteger contractsLimitedDurationEntrantsFullTimeQuantity;
    @XmlElement(name = "ContractsRegardingSpecificWorkEntrantsFullTimeQuantity")
    protected BigInteger contractsRegardingSpecificWorkEntrantsFullTimeQuantity;
    @XmlElement(name = "ContractsRegardingSubstitutionEntrantsFullTimeQuantity")
    protected BigInteger contractsRegardingSubstitutionEntrantsFullTimeQuantity;
    @XmlElement(name = "MalePrimaryEducationEntrantsFullTimeQuantity")
    protected BigInteger malePrimaryEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "MaleSecondaryEducationEntrantsFullTimeQuantity")
    protected BigInteger maleSecondaryEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "MaleHigherNonUniversityEducationEntrantsFullTimeQuantity")
    protected BigInteger maleHigherNonUniversityEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "MaleUniversityEducationEntrantsFullTimeQuantity")
    protected BigInteger maleUniversityEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "FemalePrimaryEducationEntrantsFullTimeQuantity")
    protected BigInteger femalePrimaryEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "FemaleSecondaryEducationEntrantsFullTimeQuantity")
    protected BigInteger femaleSecondaryEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "FemaleHigherNonUniversityEducationEntrantsFullTimeQuantity")
    protected BigInteger femaleHigherNonUniversityEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "FemaleUniversityEducationEntrantsFullTimeQuantity")
    protected BigInteger femaleUniversityEducationEntrantsFullTimeQuantity;
    @XmlElement(name = "NoEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity")
    protected BigInteger noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationEntrantsPartTimeQuantity")
    protected BigInteger contractsUnlimitedDurationEntrantsPartTimeQuantity;
    @XmlElement(name = "ContractsLimitedDurationEntrantsPartTimeQuantity")
    protected BigInteger contractsLimitedDurationEntrantsPartTimeQuantity;
    @XmlElement(name = "ContractsRegardingSpecificWorkEntrantsPartTimeQuantity")
    protected BigInteger contractsRegardingSpecificWorkEntrantsPartTimeQuantity;
    @XmlElement(name = "ContractsRegardingSubstitutionEntrantsPartTimeQuantity")
    protected BigInteger contractsRegardingSubstitutionEntrantsPartTimeQuantity;
    @XmlElement(name = "MalePrimaryEducationEntrantsPartTimeQuantity")
    protected BigInteger malePrimaryEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "MaleSecondaryEducationEntrantsPartTimeQuantity")
    protected BigInteger maleSecondaryEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "MaleHigherNonUniversityEducationEntrantsPartTimeQuantity")
    protected BigInteger maleHigherNonUniversityEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "MaleUniversityEducationEntrantsPartTimeQuantity")
    protected BigInteger maleUniversityEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "FemalePrimaryEducationEntrantsPartTimeQuantity")
    protected BigInteger femalePrimaryEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "FemaleSecondaryEducationEntrantsPartTimeQuantity")
    protected BigInteger femaleSecondaryEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "FemaleHigherNonUniversityEducationEntrantsPartTimeQuantity")
    protected BigInteger femaleHigherNonUniversityEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "FemaleUniversityEducationEntrantsPartTimeQuantity")
    protected BigInteger femaleUniversityEducationEntrantsPartTimeQuantity;
    @XmlElement(name = "NoEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity")
    protected BigInteger noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsLimitedDurationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "MalePrimaryEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger malePrimaryEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "MaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "MaleHigherNonUniversityEducationEntrantsTotalFTEQuantity")
    protected BigInteger maleHigherNonUniversityEducationEntrantsTotalFTEQuantity;
    @XmlElement(name = "MaleUniversityEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger maleUniversityEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemalePrimaryEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleUniversityEducationEntrantsTotalFullTimeEquivQuantity")
    protected BigInteger femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity;
    @XmlElement(name = "NoEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity")
    protected BigInteger noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationLeaversFullTimeQuantity")
    protected BigInteger contractsUnlimitedDurationLeaversFullTimeQuantity;
    @XmlElement(name = "ContractsLimitedDurationLeaversFullTimeQuantity")
    protected BigInteger contractsLimitedDurationLeaversFullTimeQuantity;
    @XmlElement(name = "ContractsRegardingSpecificWorkLeaversFullTimeQuantity")
    protected BigInteger contractsRegardingSpecificWorkLeaversFullTimeQuantity;
    @XmlElement(name = "ContractsRegardingSubsitutionLeaversFullTimeQuantity")
    protected BigInteger contractsRegardingSubsitutionLeaversFullTimeQuantity;
    @XmlElement(name = "MalePrimaryEducationLeaversFullTimeQuantity")
    protected BigInteger malePrimaryEducationLeaversFullTimeQuantity;
    @XmlElement(name = "MaleSecondaryEducationLeaversFullTimeQuantity")
    protected BigInteger maleSecondaryEducationLeaversFullTimeQuantity;
    @XmlElement(name = "MaleHigherNonUniversityEducationLeaversFullTimeQuantity")
    protected BigInteger maleHigherNonUniversityEducationLeaversFullTimeQuantity;
    @XmlElement(name = "MaleUniversityEducationLeaversFullTimeQuantity")
    protected BigInteger maleUniversityEducationLeaversFullTimeQuantity;
    @XmlElement(name = "FemalePrimaryEducationLeaversFullTimeQuantity")
    protected BigInteger femalePrimaryEducationLeaversFullTimeQuantity;
    @XmlElement(name = "FemaleSecondaryEducationLeaversFullTimeQuantity")
    protected BigInteger femaleSecondaryEducationLeaversFullTimeQuantity;
    @XmlElement(name = "FemaleHigherNonUniversityEducationLeaversFullTimeQuantity")
    protected BigInteger femaleHigherNonUniversityEducationLeaversFullTimeQuantity;
    @XmlElement(name = "FemaleUniversityEducationLeaversFullTimeQuantity")
    protected BigInteger femaleUniversityEducationLeaversFullTimeQuantity;
    @XmlElement(name = "PensionLeaversFullTimeQuantity")
    protected BigInteger pensionLeaversFullTimeQuantity;
    @XmlElement(name = "PrepensionLeaversFullTimeQuantity")
    protected BigInteger prepensionLeaversFullTimeQuantity;
    @XmlElement(name = "DismissalLeaversFullTimeQuantity")
    protected BigInteger dismissalLeaversFullTimeQuantity;
    @XmlElement(name = "OtherReasonLeaversFullTimeQuantity")
    protected BigInteger otherReasonLeaversFullTimeQuantity;
    @XmlElement(name = "FormerEmpContServLeastPartTSelfEmployedPersonFullTQuantity")
    protected BigInteger formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity;
    @XmlElement(name = "NoEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity")
    protected BigInteger noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationLeaversPartTimeQuantity")
    protected BigInteger contractsUnlimitedDurationLeaversPartTimeQuantity;
    @XmlElement(name = "ContractsLimitedDurationLeaversPartTimeQuantity")
    protected BigInteger contractsLimitedDurationLeaversPartTimeQuantity;
    @XmlElement(name = "ContractsRegardingSpecificWorkLeaversPartTimeQuantity")
    protected BigInteger contractsRegardingSpecificWorkLeaversPartTimeQuantity;
    @XmlElement(name = "ContractsRegardingSubstitutionLeaversPartTimeQuantity")
    protected BigInteger contractsRegardingSubstitutionLeaversPartTimeQuantity;
    @XmlElement(name = "MalePrimaryEducationLeaversPartTimeQuantity")
    protected BigInteger malePrimaryEducationLeaversPartTimeQuantity;
    @XmlElement(name = "MaleSecondaryEducationLeaversPartTimeQuantity")
    protected BigInteger maleSecondaryEducationLeaversPartTimeQuantity;
    @XmlElement(name = "MaleHigherNonUniversityEducationLeaversPartTimeQuantity")
    protected BigInteger maleHigherNonUniversityEducationLeaversPartTimeQuantity;
    @XmlElement(name = "MaleUniversityEducationLeaversPartTimeQuantity")
    protected BigInteger maleUniversityEducationLeaversPartTimeQuantity;
    @XmlElement(name = "FemalePrimaryEducationLeaversPartTimeQuantity")
    protected BigInteger femalePrimaryEducationLeaversPartTimeQuantity;
    @XmlElement(name = "FemaleSecondaryEducationLeaversPartTimeQuantity")
    protected BigInteger femaleSecondaryEducationLeaversPartTimeQuantity;
    @XmlElement(name = "FemaleHigherNonUniversityEducationLeaversPartTimeQuantity")
    protected BigInteger femaleHigherNonUniversityEducationLeaversPartTimeQuantity;
    @XmlElement(name = "FemaleUniversityEducationLeaversPartTimeQuantity")
    protected BigInteger femaleUniversityEducationLeaversPartTimeQuantity;
    @XmlElement(name = "PensionLeaversPartTimeQuantity")
    protected BigInteger pensionLeaversPartTimeQuantity;
    @XmlElement(name = "PrepensionLeaversPartTimeQuantity")
    protected BigInteger prepensionLeaversPartTimeQuantity;
    @XmlElement(name = "DismissalLeaversPartTimeQuantity")
    protected BigInteger dismissalLeaversPartTimeQuantity;
    @XmlElement(name = "OtherReasonLeaversPartTimeQuantity")
    protected BigInteger otherReasonLeaversPartTimeQuantity;
    @XmlElement(name = "NoFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity")
    protected BigInteger noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity;
    @XmlElement(name = "NoEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity")
    protected BigInteger noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity;
    @XmlElement(name = "ContractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsLimitedDurationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger contractsLimitedDurationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity")
    protected BigInteger contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "ContractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity")
    protected BigInteger contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "MalePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity")
    protected BigInteger malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity;
    @XmlElement(name = "MaleSecondaryEducationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger maleSecondaryEducationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "MaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity")
    protected BigInteger maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "MaleUniversityEducationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger maleUniversityEducationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemalePrimaryEducationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger femalePrimaryEducationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleSecondaryEducationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity")
    protected BigInteger femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "FemaleUniversityEducationLeaversTotalFullTimeEquivQuantity")
    protected BigInteger femaleUniversityEducationLeaversTotalFullTimeEquivQuantity;
    @XmlElement(name = "PensionLeaversTotalFullTimeEquivalentsQuantity")
    protected BigInteger pensionLeaversTotalFullTimeEquivalentsQuantity;
    @XmlElement(name = "PrepensionLeaversTotalFullTimeEquivalentsQuantity")
    protected BigInteger prepensionLeaversTotalFullTimeEquivalentsQuantity;
    @XmlElement(name = "DismissalLeaversTotalFullTimeEquivalentsQuantity")
    protected BigInteger dismissalLeaversTotalFullTimeEquivalentsQuantity;
    @XmlElement(name = "OtherReasonLeaversTotalFullTimeEquivalentsQuantity")
    protected BigInteger otherReasonLeaversTotalFullTimeEquivalentsQuantity;
    @XmlElement(name = "NoFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity")
    protected BigInteger noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity")
    protected BigInteger measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity;
    @XmlElement(name = "BusinessPlanMaleNumberEmployedPersonsInvolvedQuantity")
    protected BigInteger businessPlanMaleNumberEmployedPersonsInvolvedQuantity;
    @XmlElement(name = "BusinessPlanFemaleNumberEmployedPersonsInvolvedQuantity")
    protected BigInteger businessPlanFemaleNumberEmployedPersonsInvolvedQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity")
    protected BigInteger measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity;
    @XmlElement(name = "MeasStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity")
    protected BigInteger measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity")
    protected BigInteger measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity;
    @XmlElement(name = "EmployAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity")
    protected BigInteger employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity;
    @XmlElement(name = "EmploymentAgreements19951996FemaleNoEmployedPersonsQuantity")
    protected BigInteger employmentAgreements19951996FemaleNoEmployedPersonsQuantity;
    @XmlElement(name = "PlanningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity")
    protected BigInteger planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity;
    @XmlElement(name = "MeasStimEmplGenFinPrfMaribelNoEmplPersonsQuantity")
    protected BigInteger measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity")
    protected BigInteger measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity;
    @XmlElement(name = "TotalEmployeesAdvantageHiringPlan")
    protected BigInteger totalEmployeesAdvantageHiringPlan;
    @XmlElement(name = "MeasStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity")
    protected BigInteger measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity")
    protected BigInteger measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity;
    @XmlElement(name = "MeasStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity")
    protected BigInteger measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity;
    @XmlElement(name = "OtherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity")
    protected BigInteger otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity;
    @XmlElement(name = "OtherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity")
    protected BigInteger otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity;
    @XmlElement(name = "TotalEmployeesSocialMaribel")
    protected BigInteger totalEmployeesSocialMaribel;
    @XmlElement(name = "TotalEmployeesStructurereductionSocSecuritycontribution")
    protected BigInteger totalEmployeesStructurereductionSocSecuritycontribution;
    @XmlElement(name = "TotalEmployeesProfessionalTransitionProgram")
    protected BigInteger totalEmployeesProfessionalTransitionProgram;
    @XmlElement(name = "TotalEmployeesEmploymentServices")
    protected BigInteger totalEmployeesEmploymentServices;
    @XmlElement(name = "OtherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity")
    protected BigInteger otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity;
    @XmlElement(name = "OtherMeasStimEmpContrWkVocTraingNoEmplQuantity")
    protected BigInteger otherMeasStimEmpContrWkVocTraingNoEmplQuantity;
    @XmlElement(name = "OtherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity")
    protected BigInteger otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity;
    @XmlElement(name = "TotalEmployeesFirstjobconvention")
    protected BigInteger totalEmployeesFirstjobconvention;
    @XmlElement(name = "OtherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity")
    protected BigInteger otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity;
    @XmlElement(name = "OtherMeasStimEmplConventPrepensionNoEmplPersonsQuantity")
    protected BigInteger otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity;
    @XmlElement(name = "TotalEmployeesReductionofSocialSecuritylowsalaryrange")
    protected BigInteger totalEmployeesReductionofSocialSecuritylowsalaryrange;
    @XmlElement(name = "OtherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity")
    protected BigInteger otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity;
    @XmlElement(name = "OtherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity")
    protected BigInteger otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity;
    @XmlElement(name = "OthMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity")
    protected BigInteger othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity;
    @XmlElement(name = "NoEmpIn1orMoreMeasStimEmplymntTotForFinPeriodQuantity")
    protected BigInteger noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity;
    @XmlElement(name = "NoEmpin1orMoreMeasStimEmploymentTotalPrevFinlPrdQuantity")
    protected BigInteger noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity")
    protected BigInteger measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity;
    @XmlElement(name = "BusinessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity")
    protected BigInteger businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity;
    @XmlElement(name = "BusinessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity")
    protected BigInteger businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity")
    protected BigInteger measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfLowWagesNoEmpFTEQuantity")
    protected BigInteger measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity;
    @XmlElement(name = "MeasStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity")
    protected BigInteger measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity;
    @XmlElement(name = "EmplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity")
    protected BigInteger emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity;
    @XmlElement(name = "EmplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity")
    protected BigInteger emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity;
    @XmlElement(name = "PlngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity")
    protected BigInteger plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity;
    @XmlElement(name = "MeasStimEmpGenFinPrfMaribelNoEmpinFTEQuantity")
    protected BigInteger measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity;
    @XmlElement(name = "MeasStimEmpGenVocReinteg50YearsNoEmpFTEQuantity")
    protected BigInteger measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity;
    @XmlElement(name = "FullTimeEquivalentEmployeesAdvantageHiringPlan")
    protected BigInteger fullTimeEquivalentEmployeesAdvantageHiringPlan;
    @XmlElement(name = "MeasStimEmpGenConvPartTPrepensionNoEmpFTEQuantity")
    protected BigInteger measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity;
    @XmlElement(name = "MeasStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity")
    protected BigInteger measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity;
    @XmlElement(name = "MeasStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity")
    protected BigInteger measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity;
    @XmlElement(name = "FullTimeEquivalentEmployeesSocialMaribel")
    protected BigInteger fullTimeEquivalentEmployeesSocialMaribel;
    @XmlElement(name = "FTEEmployeesStructurereductionSocSecuritycontribution")
    protected BigInteger fteEmployeesStructurereductionSocSecuritycontribution;
    @XmlElement(name = "FTEEmployeesProfessionalTransitionProgram")
    protected BigInteger fteEmployeesProfessionalTransitionProgram;
    @XmlElement(name = "FullTimeEquivalentEmployeesEmploymentServices")
    protected BigInteger fullTimeEquivalentEmployeesEmploymentServices;
    @XmlElement(name = "OtherMeasStimEmpCntr1stProfExpNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity;
    @XmlElement(name = "OtherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity;
    @XmlElement(name = "OtherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity;
    @XmlElement(name = "OthMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity")
    protected BigInteger othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity;
    @XmlElement(name = "OtherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity;
    @XmlElement(name = "FullTimeEquivalentEmployeesFirstjobconvention")
    protected BigInteger fullTimeEquivalentEmployeesFirstjobconvention;
    @XmlElement(name = "OtherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity")
    protected BigInteger otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity;
    @XmlElement(name = "OtherMeasStimEmpConvPrepensionNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity;
    @XmlElement(name = "FTEEmployeesReductionofSocialSecuritylowsalaryrange")
    protected BigInteger fteEmployeesReductionofSocialSecuritylowsalaryrange;
    @XmlElement(name = "OthMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity")
    protected BigInteger othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity;
    @XmlElement(name = "OtherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity")
    protected BigInteger otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity;
    @XmlElement(name = "OthMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity")
    protected BigInteger othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity;
    @XmlElement(name = "NoEmpin1orMoreMeasStimEmpTotFinPrdinFTEQuantity")
    protected BigInteger noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity;
    @XmlElement(name = "NoEmp1orMoreMeasStimEmpTotPrevFinPrdFTEQuantity")
    protected BigInteger noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity;
    @XmlElement(name = "MeasStimEmployGeneratingFinPrfBusPlanFinPrfQuantity")
    protected BigInteger measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity;
    @XmlElement(name = "BusinessPlanMaleFinancialProfit")
    protected AmountType businessPlanMaleFinancialProfit;
    @XmlElement(name = "BusinessPlanFemaleFinancialProfitinThousandFrancs")
    protected AmountType businessPlanFemaleFinancialProfitinThousandFrancs;
    @XmlElement(name = "MeasStimEmplGenFinPrfPlngJobsForYouthFinPrf")
    protected AmountType measStimEmplGenFinPrfPlngJobsForYouthFinPrf;
    @XmlElement(name = "MeasStimulatEmplyGeneratingFinPrfLowWagesFinPrf")
    protected AmountType measStimulatEmplyGeneratingFinPrfLowWagesFinPrf;
    @XmlElement(name = "MeasStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf")
    protected AmountType measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf;
    @XmlElement(name = "EmployAgreementsMale19951996FinProfitThousandFrs")
    protected AmountType employAgreementsMale19951996FinProfitThousandFrs;
    @XmlElement(name = "EmployAgreemtsFemale19951996FinProfitThousandFrs")
    protected AmountType employAgreemtsFemale19951996FinProfitThousandFrs;
    @XmlElement(name = "PlanningJobsForLongTermUnemployedFinancialProfit")
    protected AmountType planningJobsForLongTermUnemployedFinancialProfit;
    @XmlElement(name = "MeasStimulatingEmployGeneratingFinPrfMaribelFinPrf")
    protected AmountType measStimulatingEmployGeneratingFinPrfMaribelFinPrf;
    @XmlElement(name = "MeasStimEmpGenFinPrfVocReintegrat50YrsFinPrf")
    protected AmountType measStimEmpGenFinPrfVocReintegrat50YrsFinPrf;
    @XmlElement(name = "AdvantageHiringPlanAmount")
    protected AmountType advantageHiringPlanAmount;
    @XmlElement(name = "MeasStimEmpGenFinPrfConvntPartTPrepensionFinPrf")
    protected AmountType measStimEmpGenFinPrfConvntPartTPrepensionFinPrf;
    @XmlElement(name = "MeasStimEmplGenFinPrfFullCareerInterruptFinPrf")
    protected AmountType measStimEmplGenFinPrfFullCareerInterruptFinPrf;
    @XmlElement(name = "MeasEmpGenReductJobPerfPartTCareerIntrptFinPrf")
    protected AmountType measEmpGenReductJobPerfPartTCareerIntrptFinPrf;
    @XmlElement(name = "SocialMaribelAmount")
    protected AmountType socialMaribelAmount;
    @XmlElement(name = "StructureReductionSocialSecurityContributionAmount")
    protected AmountType structureReductionSocialSecurityContributionAmount;
    @XmlElement(name = "ProfessionalTransitionProgramAmount")
    protected AmountType professionalTransitionProgramAmount;
    @XmlElement(name = "EmploymentServicesAmount")
    protected AmountType employmentServicesAmount;
    @XmlElement(name = "VocationalTrainingContractAmount")
    protected AmountType vocationalTrainingContractAmount;
    @XmlElement(name = "ApprenticeshipContractsAmount")
    protected AmountType apprenticeshipContractsAmount;
    @XmlElement(name = "FirstJobConventionAmount")
    protected AmountType firstJobConventionAmount;
    @XmlElement(name = "TrainingInitiativesExpenseEmployerMaleNoEmployeesQuantity")
    protected BigInteger trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity;
    @XmlElement(name = "TrainingInitiativesExpenseEmployerFemaleNoEmployQuantity")
    protected BigInteger trainingInitiativesExpenseEmployerFemaleNoEmployQuantity;
    @XmlElement(name = "TrainInitiatExpEmployerMaleNoTrainingHoursQuantity")
    protected BigInteger trainInitiatExpEmployerMaleNoTrainingHoursQuantity;
    @XmlElement(name = "TrainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity")
    protected BigInteger trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity;
    @XmlElement(name = "TrainingInitiatExpEmployerMaleChargesToEntrerp")
    protected AmountType trainingInitiatExpEmployerMaleChargesToEntrerp;
    @XmlElement(name = "MaleGrosscostofformalprofessionaltraining")
    protected AmountType maleGrosscostofformalprofessionaltraining;
    @XmlElement(name = "MalePaidcontributionsandpaymentstopublicfunds")
    protected BigInteger malePaidcontributionsandpaymentstopublicfunds;
    @XmlElement(name = "MaleBenefitsreceivedfortraining")
    protected BigInteger maleBenefitsreceivedfortraining;
    @XmlElement(name = "TrainInitiatExpEmployerFemaleChargesToEnterpr")
    protected AmountType trainInitiatExpEmployerFemaleChargesToEnterpr;
    @XmlElement(name = "FemaleGrosscostofformalprofessionaltraining")
    protected AmountType femaleGrosscostofformalprofessionaltraining;
    @XmlElement(name = "FemalePaidcontributionsandpaymentstopublicfunds")
    protected BigInteger femalePaidcontributionsandpaymentstopublicfunds;
    @XmlElement(name = "FemaleBenefitsreceivedfortraining")
    protected BigInteger femaleBenefitsreceivedfortraining;
    @XmlElement(name = "MaleEmployeeNumEngagedintrainingcoachingortutoring")
    protected BigInteger maleEmployeeNumEngagedintrainingcoachingortutoring;
    @XmlElement(name = "MaleTotalHoursEngagedintrainingcoachingortutoring")
    protected BigInteger maleTotalHoursEngagedintrainingcoachingortutoring;
    @XmlElement(name = "MaleEmployeeNumAttendedtrainingcoachingortutoring")
    protected BigInteger maleEmployeeNumAttendedtrainingcoachingortutoring;
    @XmlElement(name = "FemaleEmployeeNumEngagedintrainingcoachingortutoring")
    protected BigInteger femaleEmployeeNumEngagedintrainingcoachingortutoring;
    @XmlElement(name = "FemaleTotalHoursEngagedintrainingcoachingortutoring")
    protected BigInteger femaleTotalHoursEngagedintrainingcoachingortutoring;
    @XmlElement(name = "FemaleEmployeeNumAttendedtrainingcoachingortutoring")
    protected BigInteger femaleEmployeeNumAttendedtrainingcoachingortutoring;
    @XmlElement(name = "MaleInformalProfessionalTrainingInvolvedQuantity")
    protected BigInteger maleInformalProfessionalTrainingInvolvedQuantity;
    @XmlElement(name = "MaleinInformalProfessionalTrainingHoursQuantity")
    protected BigInteger maleinInformalProfessionalTrainingHoursQuantity;
    @XmlElement(name = "MaleNetcostInformalProfessionalTraining")
    protected AmountType maleNetcostInformalProfessionalTraining;
    @XmlElement(name = "FemaleInformalProfessionalTrainingInvolvedQuantity")
    protected BigInteger femaleInformalProfessionalTrainingInvolvedQuantity;
    @XmlElement(name = "FemaleinInformalProfessionalTrainingHoursQuantity")
    protected BigInteger femaleinInformalProfessionalTrainingHoursQuantity;
    @XmlElement(name = "FemaleNetcostInformalProfessionalTraining")
    protected AmountType femaleNetcostInformalProfessionalTraining;
    @XmlElement(name = "MaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity")
    protected BigInteger maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity;
    @XmlElement(name = "MaleEmplyerExpInformalProfessionalTrainingHoursQuantity")
    protected BigInteger maleEmplyerExpInformalProfessionalTrainingHoursQuantity;
    @XmlElement(name = "MaleEmplyerExpNetcostInformalProfessionalTraining")
    protected BigInteger maleEmplyerExpNetcostInformalProfessionalTraining;
    @XmlElement(name = "FemaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity")
    protected BigInteger femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity;
    @XmlElement(name = "FemaleEmplyerExpInformalProfessionalTrainingHoursQuantity")
    protected BigInteger femaleEmplyerExpInformalProfessionalTrainingHoursQuantity;
    @XmlElement(name = "FemaleEmplyerExpNetcostInformalProfessionalTraining")
    protected BigInteger femaleEmplyerExpNetcostInformalProfessionalTraining;

    /**
     * Gets the value of the avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity() {
        return avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity;
    }

    /**
     * Sets the value of the avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity(BigInteger value) {
        this.avNoEmployeesRecordedinPersonnelRegisterFullTimeQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursFullTimeQuantity() {
        return numberActualWorkingHoursFullTimeQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursFullTimeQuantity(BigInteger value) {
        this.numberActualWorkingHoursFullTimeQuantity = value;
    }

    /**
     * Gets the value of the personnelChargesFullTime property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonnelChargesFullTime() {
        return personnelChargesFullTime;
    }

    /**
     * Sets the value of the personnelChargesFullTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonnelChargesFullTime(AmountType value) {
        this.personnelChargesFullTime = value;
    }

    /**
     * Gets the value of the avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity() {
        return avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity;
    }

    /**
     * Sets the value of the avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity(BigInteger value) {
        this.avNoEmployeesRecordedinPersonnelRegisterPartTimeQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursHalfTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursHalfTimeQuantity() {
        return numberActualWorkingHoursHalfTimeQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursHalfTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursHalfTimeQuantity(BigInteger value) {
        this.numberActualWorkingHoursHalfTimeQuantity = value;
    }

    /**
     * Gets the value of the personnelChargesHalfTime property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonnelChargesHalfTime() {
        return personnelChargesHalfTime;
    }

    /**
     * Sets the value of the personnelChargesHalfTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonnelChargesHalfTime(AmountType value) {
        this.personnelChargesHalfTime = value;
    }

    /**
     * Gets the value of the avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity() {
        return avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity(BigInteger value) {
        this.avNoEmployeesRecrdedinPersonnelRegTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursTotalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursTotalQuantity() {
        return numberActualWorkingHoursTotalQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursTotalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursTotalQuantity(BigInteger value) {
        this.numberActualWorkingHoursTotalQuantity = value;
    }

    /**
     * Gets the value of the personnelChargesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonnelChargesTotal() {
        return personnelChargesTotal;
    }

    /**
     * Sets the value of the personnelChargesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonnelChargesTotal(AmountType value) {
        this.personnelChargesTotal = value;
    }

    /**
     * Gets the value of the benefitsinAdditionToWagesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBenefitsinAdditionToWagesTotal() {
        return benefitsinAdditionToWagesTotal;
    }

    /**
     * Sets the value of the benefitsinAdditionToWagesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBenefitsinAdditionToWagesTotal(AmountType value) {
        this.benefitsinAdditionToWagesTotal = value;
    }

    /**
     * Gets the value of the avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity() {
        return avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity;
    }

    /**
     * Sets the value of the avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity(BigInteger value) {
        this.avNoEmployeesRecrdedinPersRegTotalFTEPrecPeriodQuantity = value;
    }

    /**
     * Gets the value of the numberActualWorkingHoursTotalPrecedingPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberActualWorkingHoursTotalPrecedingPeriodQuantity() {
        return numberActualWorkingHoursTotalPrecedingPeriodQuantity;
    }

    /**
     * Sets the value of the numberActualWorkingHoursTotalPrecedingPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberActualWorkingHoursTotalPrecedingPeriodQuantity(BigInteger value) {
        this.numberActualWorkingHoursTotalPrecedingPeriodQuantity = value;
    }

    /**
     * Gets the value of the personnelChargesTotalPrecedingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPersonnelChargesTotalPrecedingPeriod() {
        return personnelChargesTotalPrecedingPeriod;
    }

    /**
     * Sets the value of the personnelChargesTotalPrecedingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPersonnelChargesTotalPrecedingPeriod(AmountType value) {
        this.personnelChargesTotalPrecedingPeriod = value;
    }

    /**
     * Gets the value of the benefitsinAdditionToWagesTotalPrecedingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBenefitsinAdditionToWagesTotalPrecedingPeriod() {
        return benefitsinAdditionToWagesTotalPrecedingPeriod;
    }

    /**
     * Sets the value of the benefitsinAdditionToWagesTotalPrecedingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBenefitsinAdditionToWagesTotalPrecedingPeriod(AmountType value) {
        this.benefitsinAdditionToWagesTotalPrecedingPeriod = value;
    }

    /**
     * Gets the value of the noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity() {
        return noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity;
    }

    /**
     * Sets the value of the noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity(BigInteger value) {
        this.noEmpRecinPersonnelRegClsgDtFinPeriodFullTimeQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity() {
        return byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrUnltdDuratFullTClsgDtFinlPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity() {
        return byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrContrLtdDuratFullTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity() {
        return byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrReSpecWkFullTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity() {
        return byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrContrReSubstitFullTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the maleFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFullTimeatClosingDateFinancialPeriodQuantity() {
        return maleFullTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the maleFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFullTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.maleFullTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the maleFullTimePrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFullTimePrimaryEducationQuantity() {
        return maleFullTimePrimaryEducationQuantity;
    }

    /**
     * Sets the value of the maleFullTimePrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFullTimePrimaryEducationQuantity(BigInteger value) {
        this.maleFullTimePrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFullTimeSecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFullTimeSecondaryEducationQuantity() {
        return maleFullTimeSecondaryEducationQuantity;
    }

    /**
     * Sets the value of the maleFullTimeSecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFullTimeSecondaryEducationQuantity(BigInteger value) {
        this.maleFullTimeSecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFullTimeHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFullTimeHigherNonUniversityEducationQuantity() {
        return maleFullTimeHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the maleFullTimeHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFullTimeHigherNonUniversityEducationQuantity(BigInteger value) {
        this.maleFullTimeHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFullTimeHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFullTimeHigherUniversityEducationQuantity() {
        return maleFullTimeHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the maleFullTimeHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFullTimeHigherUniversityEducationQuantity(BigInteger value) {
        this.maleFullTimeHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFullTimeatClosingDateFinancialPeriodQuantity() {
        return femaleFullTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the femaleFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFullTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.femaleFullTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the femaleFullTimePrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFullTimePrimaryEducationQuantity() {
        return femaleFullTimePrimaryEducationQuantity;
    }

    /**
     * Sets the value of the femaleFullTimePrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFullTimePrimaryEducationQuantity(BigInteger value) {
        this.femaleFullTimePrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFullTimeSecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFullTimeSecondaryEducationQuantity() {
        return femaleFullTimeSecondaryEducationQuantity;
    }

    /**
     * Sets the value of the femaleFullTimeSecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFullTimeSecondaryEducationQuantity(BigInteger value) {
        this.femaleFullTimeSecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFullTimeHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFullTimeHigherNonUniversityEducationQuantity() {
        return femaleFullTimeHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femaleFullTimeHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFullTimeHigherNonUniversityEducationQuantity(BigInteger value) {
        this.femaleFullTimeHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFullTimeHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFullTimeHigherUniversityEducationQuantity() {
        return femaleFullTimeHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femaleFullTimeHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFullTimeHigherUniversityEducationQuantity(BigInteger value) {
        this.femaleFullTimeHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the managementPersonnelFullTimeatClosingDateFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagementPersonnelFullTimeatClosingDateFinPeriodQuantity() {
        return managementPersonnelFullTimeatClosingDateFinPeriodQuantity;
    }

    /**
     * Sets the value of the managementPersonnelFullTimeatClosingDateFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagementPersonnelFullTimeatClosingDateFinPeriodQuantity(BigInteger value) {
        this.managementPersonnelFullTimeatClosingDateFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the employeesFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeesFullTimeatClosingDateFinancialPeriodQuantity() {
        return employeesFullTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the employeesFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeesFullTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.employeesFullTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the workersFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkersFullTimeatClosingDateFinancialPeriodQuantity() {
        return workersFullTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the workersFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkersFullTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.workersFullTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the otherFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherFullTimeatClosingDateFinancialPeriodQuantity() {
        return otherFullTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the otherFullTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherFullTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.otherFullTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity() {
        return noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity;
    }

    /**
     * Sets the value of the noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity(BigInteger value) {
        this.noEmplRecordedinPersonnelRegClsgDtFinPeriodPartTQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity() {
        return byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrUnltdDuratPartTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity() {
        return byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrContrLtdDuratPartTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity() {
        return byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrReSpecWkPartTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity() {
        return byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrReSubstPartTClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the malePartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePartTimeatClosingDateFinancialPeriodQuantity() {
        return malePartTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the malePartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePartTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.malePartTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the malePartTimePrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePartTimePrimaryEducationQuantity() {
        return malePartTimePrimaryEducationQuantity;
    }

    /**
     * Sets the value of the malePartTimePrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePartTimePrimaryEducationQuantity(BigInteger value) {
        this.malePartTimePrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the malePartTimeSecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePartTimeSecondaryEducationQuantity() {
        return malePartTimeSecondaryEducationQuantity;
    }

    /**
     * Sets the value of the malePartTimeSecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePartTimeSecondaryEducationQuantity(BigInteger value) {
        this.malePartTimeSecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the malePartTimeHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePartTimeHigherNonUniversityEducationQuantity() {
        return malePartTimeHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the malePartTimeHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePartTimeHigherNonUniversityEducationQuantity(BigInteger value) {
        this.malePartTimeHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the malePartTimeHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePartTimeHigherUniversityEducationQuantity() {
        return malePartTimeHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the malePartTimeHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePartTimeHigherUniversityEducationQuantity(BigInteger value) {
        this.malePartTimeHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femalePartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePartTimeatClosingDateFinancialPeriodQuantity() {
        return femalePartTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the femalePartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePartTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.femalePartTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the femalePartTimePrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePartTimePrimaryEducationQuantity() {
        return femalePartTimePrimaryEducationQuantity;
    }

    /**
     * Sets the value of the femalePartTimePrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePartTimePrimaryEducationQuantity(BigInteger value) {
        this.femalePartTimePrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femalePartTimeSecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePartTimeSecondaryEducationQuantity() {
        return femalePartTimeSecondaryEducationQuantity;
    }

    /**
     * Sets the value of the femalePartTimeSecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePartTimeSecondaryEducationQuantity(BigInteger value) {
        this.femalePartTimeSecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femalePartTimeHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePartTimeHigherNonUniversityEducationQuantity() {
        return femalePartTimeHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femalePartTimeHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePartTimeHigherNonUniversityEducationQuantity(BigInteger value) {
        this.femalePartTimeHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femalePartTimeHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePartTimeHigherUniversityEducationQuantity() {
        return femalePartTimeHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femalePartTimeHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePartTimeHigherUniversityEducationQuantity(BigInteger value) {
        this.femalePartTimeHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the managementPersonnelPartTimeatClosingDateFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagementPersonnelPartTimeatClosingDateFinPeriodQuantity() {
        return managementPersonnelPartTimeatClosingDateFinPeriodQuantity;
    }

    /**
     * Sets the value of the managementPersonnelPartTimeatClosingDateFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagementPersonnelPartTimeatClosingDateFinPeriodQuantity(BigInteger value) {
        this.managementPersonnelPartTimeatClosingDateFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the employeesPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeesPartTimeatClosingDateFinancialPeriodQuantity() {
        return employeesPartTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the employeesPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeesPartTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.employeesPartTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the workersPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkersPartTimeatClosingDateFinancialPeriodQuantity() {
        return workersPartTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the workersPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkersPartTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.workersPartTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the otherPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherPartTimeatClosingDateFinancialPeriodQuantity() {
        return otherPartTimeatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the otherPartTimeatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherPartTimeatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.otherPartTimeatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpRecinPersRegClsgDtFinPrdTotFTEQuantity() {
        return noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity;
    }

    /**
     * Sets the value of the noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpRecinPersRegClsgDtFinPrdTotFTEQuantity(BigInteger value) {
        this.noEmpRecinPersRegClsgDtFinPrdTotFTEQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity() {
        return byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity(BigInteger value) {
        this.byNatureEmpContrUnltdDuratFTEatClsgDtFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity() {
        return byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity(BigInteger value) {
        this.byNatureEmpContrContrLtdDuratFTEatClsgDtFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity() {
        return byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity;
    }

    /**
     * Sets the value of the byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity(BigInteger value) {
        this.byNatureEmpContrCntrReSpecificWkFTEClsgDtFinPrdQuantity = value;
    }

    /**
     * Gets the value of the byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getByNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity() {
        return byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity;
    }

    /**
     * Sets the value of the byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setByNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity(BigInteger value) {
        this.byNatureEmpCntrCntrReSubstFTEClsgDtFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the maleFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFTEatClosingDateFinancialPeriodQuantity() {
        return maleFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the maleFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.maleFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the maleFTEPrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFTEPrimaryEducationQuantity() {
        return maleFTEPrimaryEducationQuantity;
    }

    /**
     * Sets the value of the maleFTEPrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFTEPrimaryEducationQuantity(BigInteger value) {
        this.maleFTEPrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFTESecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFTESecondaryEducationQuantity() {
        return maleFTESecondaryEducationQuantity;
    }

    /**
     * Sets the value of the maleFTESecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFTESecondaryEducationQuantity(BigInteger value) {
        this.maleFTESecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFTEHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFTEHigherNonUniversityEducationQuantity() {
        return maleFTEHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the maleFTEHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFTEHigherNonUniversityEducationQuantity(BigInteger value) {
        this.maleFTEHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the maleFTEHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleFTEHigherUniversityEducationQuantity() {
        return maleFTEHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the maleFTEHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleFTEHigherUniversityEducationQuantity(BigInteger value) {
        this.maleFTEHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFTEatClosingDateFinancialPeriodQuantity() {
        return femaleFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the femaleFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.femaleFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the femaleFTEPrimaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFTEPrimaryEducationQuantity() {
        return femaleFTEPrimaryEducationQuantity;
    }

    /**
     * Sets the value of the femaleFTEPrimaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFTEPrimaryEducationQuantity(BigInteger value) {
        this.femaleFTEPrimaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFTESecondaryEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFTESecondaryEducationQuantity() {
        return femaleFTESecondaryEducationQuantity;
    }

    /**
     * Sets the value of the femaleFTESecondaryEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFTESecondaryEducationQuantity(BigInteger value) {
        this.femaleFTESecondaryEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFTEHigherNonUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFTEHigherNonUniversityEducationQuantity() {
        return femaleFTEHigherNonUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femaleFTEHigherNonUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFTEHigherNonUniversityEducationQuantity(BigInteger value) {
        this.femaleFTEHigherNonUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the femaleFTEHigherUniversityEducationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleFTEHigherUniversityEducationQuantity() {
        return femaleFTEHigherUniversityEducationQuantity;
    }

    /**
     * Sets the value of the femaleFTEHigherUniversityEducationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleFTEHigherUniversityEducationQuantity(BigInteger value) {
        this.femaleFTEHigherUniversityEducationQuantity = value;
    }

    /**
     * Gets the value of the managementPersonnelFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagementPersonnelFTEatClosingDateFinancialPeriodQuantity() {
        return managementPersonnelFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the managementPersonnelFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagementPersonnelFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.managementPersonnelFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the employeesFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeesFTEatClosingDateFinancialPeriodQuantity() {
        return employeesFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the employeesFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeesFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.employeesFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the workersFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWorkersFTEatClosingDateFinancialPeriodQuantity() {
        return workersFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the workersFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWorkersFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.workersFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the otherFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherFTEatClosingDateFinancialPeriodQuantity() {
        return otherFTEatClosingDateFinancialPeriodQuantity;
    }

    /**
     * Sets the value of the otherFTEatClosingDateFinancialPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherFTEatClosingDateFinancialPeriodQuantity(BigInteger value) {
        this.otherFTEatClosingDateFinancialPeriodQuantity = value;
    }

    /**
     * Gets the value of the averageNumberPersonnelEmployedTemporaryPersonnelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAverageNumberPersonnelEmployedTemporaryPersonnelQuantity() {
        return averageNumberPersonnelEmployedTemporaryPersonnelQuantity;
    }

    /**
     * Sets the value of the averageNumberPersonnelEmployedTemporaryPersonnelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAverageNumberPersonnelEmployedTemporaryPersonnelQuantity(BigInteger value) {
        this.averageNumberPersonnelEmployedTemporaryPersonnelQuantity = value;
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
     * Gets the value of the chargesToEnterpriseTemporaryPersonnel property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesToEnterpriseTemporaryPersonnel() {
        return chargesToEnterpriseTemporaryPersonnel;
    }

    /**
     * Sets the value of the chargesToEnterpriseTemporaryPersonnel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesToEnterpriseTemporaryPersonnel(AmountType value) {
        this.chargesToEnterpriseTemporaryPersonnel = value;
    }

    /**
     * Gets the value of the avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvNoPersonnelEmployedPersonsDisposalEnterpriseQuantity() {
        return avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity;
    }

    /**
     * Sets the value of the avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvNoPersonnelEmployedPersonsDisposalEnterpriseQuantity(BigInteger value) {
        this.avNoPersonnelEmployedPersonsDisposalEnterpriseQuantity = value;
    }

    /**
     * Gets the value of the noActualWorkingHrsPersonsDisposalEnterpriseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoActualWorkingHrsPersonsDisposalEnterpriseQuantity() {
        return noActualWorkingHrsPersonsDisposalEnterpriseQuantity;
    }

    /**
     * Sets the value of the noActualWorkingHrsPersonsDisposalEnterpriseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoActualWorkingHrsPersonsDisposalEnterpriseQuantity(BigInteger value) {
        this.noActualWorkingHrsPersonsDisposalEnterpriseQuantity = value;
    }

    /**
     * Gets the value of the chargesToEnterprisePersonsDisposalEnterprise property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargesToEnterprisePersonsDisposalEnterprise() {
        return chargesToEnterprisePersonsDisposalEnterprise;
    }

    /**
     * Sets the value of the chargesToEnterprisePersonsDisposalEnterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargesToEnterprisePersonsDisposalEnterprise(AmountType value) {
        this.chargesToEnterprisePersonsDisposalEnterprise = value;
    }

    /**
     * Gets the value of the noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity() {
        return noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity;
    }

    /**
     * Sets the value of the noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity(BigInteger value) {
        this.noEmpRecInPersonnelRegDuringFinPerdEntrantsFullTQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationEntrantsFullTimeQuantity() {
        return contractsUnlimitedDurationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationEntrantsFullTimeQuantity(BigInteger value) {
        this.contractsUnlimitedDurationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationEntrantsFullTimeQuantity() {
        return contractsLimitedDurationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationEntrantsFullTimeQuantity(BigInteger value) {
        this.contractsLimitedDurationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSpecificWorkEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSpecificWorkEntrantsFullTimeQuantity() {
        return contractsRegardingSpecificWorkEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSpecificWorkEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSpecificWorkEntrantsFullTimeQuantity(BigInteger value) {
        this.contractsRegardingSpecificWorkEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubstitutionEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubstitutionEntrantsFullTimeQuantity() {
        return contractsRegardingSubstitutionEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubstitutionEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubstitutionEntrantsFullTimeQuantity(BigInteger value) {
        this.contractsRegardingSubstitutionEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationEntrantsFullTimeQuantity() {
        return malePrimaryEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.malePrimaryEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationEntrantsFullTimeQuantity() {
        return maleSecondaryEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.maleSecondaryEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniversityEducationEntrantsFullTimeQuantity() {
        return maleHigherNonUniversityEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniversityEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.maleHigherNonUniversityEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationEntrantsFullTimeQuantity() {
        return maleUniversityEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.maleUniversityEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationEntrantsFullTimeQuantity() {
        return femalePrimaryEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.femalePrimaryEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationEntrantsFullTimeQuantity() {
        return femaleSecondaryEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.femaleSecondaryEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniversityEducationEntrantsFullTimeQuantity() {
        return femaleHigherNonUniversityEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniversityEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.femaleHigherNonUniversityEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationEntrantsFullTimeQuantity() {
        return femaleUniversityEducationEntrantsFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationEntrantsFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationEntrantsFullTimeQuantity(BigInteger value) {
        this.femaleUniversityEducationEntrantsFullTimeQuantity = value;
    }

    /**
     * Gets the value of the noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity() {
        return noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity;
    }

    /**
     * Sets the value of the noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity(BigInteger value) {
        this.noEmpRecInPersonnelRegDuringFinPeriodEntrantsPartTQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationEntrantsPartTimeQuantity() {
        return contractsUnlimitedDurationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationEntrantsPartTimeQuantity(BigInteger value) {
        this.contractsUnlimitedDurationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationEntrantsPartTimeQuantity() {
        return contractsLimitedDurationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationEntrantsPartTimeQuantity(BigInteger value) {
        this.contractsLimitedDurationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSpecificWorkEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSpecificWorkEntrantsPartTimeQuantity() {
        return contractsRegardingSpecificWorkEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSpecificWorkEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSpecificWorkEntrantsPartTimeQuantity(BigInteger value) {
        this.contractsRegardingSpecificWorkEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubstitutionEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubstitutionEntrantsPartTimeQuantity() {
        return contractsRegardingSubstitutionEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubstitutionEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubstitutionEntrantsPartTimeQuantity(BigInteger value) {
        this.contractsRegardingSubstitutionEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationEntrantsPartTimeQuantity() {
        return malePrimaryEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.malePrimaryEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationEntrantsPartTimeQuantity() {
        return maleSecondaryEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.maleSecondaryEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniversityEducationEntrantsPartTimeQuantity() {
        return maleHigherNonUniversityEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniversityEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.maleHigherNonUniversityEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationEntrantsPartTimeQuantity() {
        return maleUniversityEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.maleUniversityEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationEntrantsPartTimeQuantity() {
        return femalePrimaryEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.femalePrimaryEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationEntrantsPartTimeQuantity() {
        return femaleSecondaryEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.femaleSecondaryEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniversityEducationEntrantsPartTimeQuantity() {
        return femaleHigherNonUniversityEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniversityEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.femaleHigherNonUniversityEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationEntrantsPartTimeQuantity() {
        return femaleUniversityEducationEntrantsPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationEntrantsPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationEntrantsPartTimeQuantity(BigInteger value) {
        this.femaleUniversityEducationEntrantsPartTimeQuantity = value;
    }

    /**
     * Gets the value of the noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity() {
        return noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity;
    }

    /**
     * Sets the value of the noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity(BigInteger value) {
        this.noEmpRecinPersRegDuringFinPrdEmtrantsTotFTEQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity() {
        return contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsUnlimitedDurationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationEntrantsTotalFullTimeEquivQuantity() {
        return contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsLimitedDurationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity() {
        return contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsRegSpecificWorkEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity() {
        return contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsRegardingSubstitutionEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationEntrantsTotalFullTimeEquivQuantity() {
        return malePrimaryEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.malePrimaryEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity() {
        return maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.maleSecondaryEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniversityEducationEntrantsTotalFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniversityEducationEntrantsTotalFTEQuantity() {
        return maleHigherNonUniversityEducationEntrantsTotalFTEQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniversityEducationEntrantsTotalFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniversityEducationEntrantsTotalFTEQuantity(BigInteger value) {
        this.maleHigherNonUniversityEducationEntrantsTotalFTEQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationEntrantsTotalFullTimeEquivQuantity() {
        return maleUniversityEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.maleUniversityEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationEntrantsTotalFullTimeEquivQuantity() {
        return femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.femalePrimaryEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity() {
        return femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleSecondaryEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity() {
        return femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleHigherNonUniEducEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationEntrantsTotalFullTimeEquivQuantity() {
        return femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationEntrantsTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleUniversityEducationEntrantsTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity() {
        return noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity;
    }

    /**
     * Sets the value of the noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity(BigInteger value) {
        this.noEmpDtContrTerminRecDuringFinPrdLeaversFullTQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationLeaversFullTimeQuantity() {
        return contractsUnlimitedDurationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationLeaversFullTimeQuantity(BigInteger value) {
        this.contractsUnlimitedDurationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationLeaversFullTimeQuantity() {
        return contractsLimitedDurationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationLeaversFullTimeQuantity(BigInteger value) {
        this.contractsLimitedDurationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSpecificWorkLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSpecificWorkLeaversFullTimeQuantity() {
        return contractsRegardingSpecificWorkLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSpecificWorkLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSpecificWorkLeaversFullTimeQuantity(BigInteger value) {
        this.contractsRegardingSpecificWorkLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubsitutionLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubsitutionLeaversFullTimeQuantity() {
        return contractsRegardingSubsitutionLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubsitutionLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubsitutionLeaversFullTimeQuantity(BigInteger value) {
        this.contractsRegardingSubsitutionLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationLeaversFullTimeQuantity() {
        return malePrimaryEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationLeaversFullTimeQuantity(BigInteger value) {
        this.malePrimaryEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationLeaversFullTimeQuantity() {
        return maleSecondaryEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationLeaversFullTimeQuantity(BigInteger value) {
        this.maleSecondaryEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniversityEducationLeaversFullTimeQuantity() {
        return maleHigherNonUniversityEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniversityEducationLeaversFullTimeQuantity(BigInteger value) {
        this.maleHigherNonUniversityEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationLeaversFullTimeQuantity() {
        return maleUniversityEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationLeaversFullTimeQuantity(BigInteger value) {
        this.maleUniversityEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationLeaversFullTimeQuantity() {
        return femalePrimaryEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationLeaversFullTimeQuantity(BigInteger value) {
        this.femalePrimaryEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationLeaversFullTimeQuantity() {
        return femaleSecondaryEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationLeaversFullTimeQuantity(BigInteger value) {
        this.femaleSecondaryEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniversityEducationLeaversFullTimeQuantity() {
        return femaleHigherNonUniversityEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniversityEducationLeaversFullTimeQuantity(BigInteger value) {
        this.femaleHigherNonUniversityEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationLeaversFullTimeQuantity() {
        return femaleUniversityEducationLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationLeaversFullTimeQuantity(BigInteger value) {
        this.femaleUniversityEducationLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the pensionLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPensionLeaversFullTimeQuantity() {
        return pensionLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the pensionLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPensionLeaversFullTimeQuantity(BigInteger value) {
        this.pensionLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the prepensionLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrepensionLeaversFullTimeQuantity() {
        return prepensionLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the prepensionLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrepensionLeaversFullTimeQuantity(BigInteger value) {
        this.prepensionLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the dismissalLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDismissalLeaversFullTimeQuantity() {
        return dismissalLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the dismissalLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDismissalLeaversFullTimeQuantity(BigInteger value) {
        this.dismissalLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the otherReasonLeaversFullTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherReasonLeaversFullTimeQuantity() {
        return otherReasonLeaversFullTimeQuantity;
    }

    /**
     * Sets the value of the otherReasonLeaversFullTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherReasonLeaversFullTimeQuantity(BigInteger value) {
        this.otherReasonLeaversFullTimeQuantity = value;
    }

    /**
     * Gets the value of the formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFormerEmpContServLeastPartTSelfEmployedPersonFullTQuantity() {
        return formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity;
    }

    /**
     * Sets the value of the formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFormerEmpContServLeastPartTSelfEmployedPersonFullTQuantity(BigInteger value) {
        this.formerEmpContServLeastPartTSelfEmployedPersonFullTQuantity = value;
    }

    /**
     * Gets the value of the noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity() {
        return noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity;
    }

    /**
     * Sets the value of the noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity(BigInteger value) {
        this.noEmpDtContrTermRecDuringFinPrdLeaversPartFullTQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationLeaversPartTimeQuantity() {
        return contractsUnlimitedDurationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationLeaversPartTimeQuantity(BigInteger value) {
        this.contractsUnlimitedDurationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationLeaversPartTimeQuantity() {
        return contractsLimitedDurationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationLeaversPartTimeQuantity(BigInteger value) {
        this.contractsLimitedDurationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSpecificWorkLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSpecificWorkLeaversPartTimeQuantity() {
        return contractsRegardingSpecificWorkLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSpecificWorkLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSpecificWorkLeaversPartTimeQuantity(BigInteger value) {
        this.contractsRegardingSpecificWorkLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubstitutionLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubstitutionLeaversPartTimeQuantity() {
        return contractsRegardingSubstitutionLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubstitutionLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubstitutionLeaversPartTimeQuantity(BigInteger value) {
        this.contractsRegardingSubstitutionLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationLeaversPartTimeQuantity() {
        return malePrimaryEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationLeaversPartTimeQuantity(BigInteger value) {
        this.malePrimaryEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationLeaversPartTimeQuantity() {
        return maleSecondaryEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationLeaversPartTimeQuantity(BigInteger value) {
        this.maleSecondaryEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniversityEducationLeaversPartTimeQuantity() {
        return maleHigherNonUniversityEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniversityEducationLeaversPartTimeQuantity(BigInteger value) {
        this.maleHigherNonUniversityEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationLeaversPartTimeQuantity() {
        return maleUniversityEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationLeaversPartTimeQuantity(BigInteger value) {
        this.maleUniversityEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationLeaversPartTimeQuantity() {
        return femalePrimaryEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationLeaversPartTimeQuantity(BigInteger value) {
        this.femalePrimaryEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationLeaversPartTimeQuantity() {
        return femaleSecondaryEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationLeaversPartTimeQuantity(BigInteger value) {
        this.femaleSecondaryEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniversityEducationLeaversPartTimeQuantity() {
        return femaleHigherNonUniversityEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniversityEducationLeaversPartTimeQuantity(BigInteger value) {
        this.femaleHigherNonUniversityEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationLeaversPartTimeQuantity() {
        return femaleUniversityEducationLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationLeaversPartTimeQuantity(BigInteger value) {
        this.femaleUniversityEducationLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the pensionLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPensionLeaversPartTimeQuantity() {
        return pensionLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the pensionLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPensionLeaversPartTimeQuantity(BigInteger value) {
        this.pensionLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the prepensionLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrepensionLeaversPartTimeQuantity() {
        return prepensionLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the prepensionLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrepensionLeaversPartTimeQuantity(BigInteger value) {
        this.prepensionLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the dismissalLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDismissalLeaversPartTimeQuantity() {
        return dismissalLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the dismissalLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDismissalLeaversPartTimeQuantity(BigInteger value) {
        this.dismissalLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the otherReasonLeaversPartTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherReasonLeaversPartTimeQuantity() {
        return otherReasonLeaversPartTimeQuantity;
    }

    /**
     * Sets the value of the otherReasonLeaversPartTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherReasonLeaversPartTimeQuantity(BigInteger value) {
        this.otherReasonLeaversPartTimeQuantity = value;
    }

    /**
     * Gets the value of the noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity() {
        return noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity;
    }

    /**
     * Sets the value of the noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity(BigInteger value) {
        this.noFormrEmpContServLeastPartTSelfEmpLeaversFullTQuantity = value;
    }

    /**
     * Gets the value of the noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity() {
        return noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity;
    }

    /**
     * Sets the value of the noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity(BigInteger value) {
        this.noEmpDtContrTermRecDurngFinPrdLeaversTotalFTEQuantity = value;
    }

    /**
     * Gets the value of the contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity() {
        return contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsUnlimitedDurationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsLimitedDurationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsLimitedDurationLeaversTotalFullTimeEquivQuantity() {
        return contractsLimitedDurationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsLimitedDurationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsLimitedDurationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsLimitedDurationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity() {
        return contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsRegardingSpecificWorkLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity() {
        return contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.contractsRegardingSubstitutionLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity() {
        return malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity(BigInteger value) {
        this.malePrimaryEducationLeaversTotalFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the maleSecondaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleSecondaryEducationLeaversTotalFullTimeEquivQuantity() {
        return maleSecondaryEducationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the maleSecondaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleSecondaryEducationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.maleSecondaryEducationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity() {
        return maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.maleHigherNonUniEducLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the maleUniversityEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleUniversityEducationLeaversTotalFullTimeEquivQuantity() {
        return maleUniversityEducationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the maleUniversityEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleUniversityEducationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.maleUniversityEducationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femalePrimaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePrimaryEducationLeaversTotalFullTimeEquivQuantity() {
        return femalePrimaryEducationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femalePrimaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePrimaryEducationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.femalePrimaryEducationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleSecondaryEducationLeaversTotalFullTimeEquivQuantity() {
        return femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleSecondaryEducationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleSecondaryEducationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity() {
        return femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleHigherNonUniEducLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the femaleUniversityEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleUniversityEducationLeaversTotalFullTimeEquivQuantity() {
        return femaleUniversityEducationLeaversTotalFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the femaleUniversityEducationLeaversTotalFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleUniversityEducationLeaversTotalFullTimeEquivQuantity(BigInteger value) {
        this.femaleUniversityEducationLeaversTotalFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the pensionLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPensionLeaversTotalFullTimeEquivalentsQuantity() {
        return pensionLeaversTotalFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the pensionLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPensionLeaversTotalFullTimeEquivalentsQuantity(BigInteger value) {
        this.pensionLeaversTotalFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the prepensionLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrepensionLeaversTotalFullTimeEquivalentsQuantity() {
        return prepensionLeaversTotalFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the prepensionLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrepensionLeaversTotalFullTimeEquivalentsQuantity(BigInteger value) {
        this.prepensionLeaversTotalFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the dismissalLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDismissalLeaversTotalFullTimeEquivalentsQuantity() {
        return dismissalLeaversTotalFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the dismissalLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDismissalLeaversTotalFullTimeEquivalentsQuantity(BigInteger value) {
        this.dismissalLeaversTotalFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the otherReasonLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherReasonLeaversTotalFullTimeEquivalentsQuantity() {
        return otherReasonLeaversTotalFullTimeEquivalentsQuantity;
    }

    /**
     * Sets the value of the otherReasonLeaversTotalFullTimeEquivalentsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherReasonLeaversTotalFullTimeEquivalentsQuantity(BigInteger value) {
        this.otherReasonLeaversTotalFullTimeEquivalentsQuantity = value;
    }

    /**
     * Gets the value of the noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity() {
        return noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity;
    }

    /**
     * Sets the value of the noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity(BigInteger value) {
        this.noFormerEmpContServLeastPTSelfEmpLeaversTotFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity() {
        return measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfBusPlanNoEmpPersonsInvolvedQuantity = value;
    }

    /**
     * Gets the value of the businessPlanMaleNumberEmployedPersonsInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessPlanMaleNumberEmployedPersonsInvolvedQuantity() {
        return businessPlanMaleNumberEmployedPersonsInvolvedQuantity;
    }

    /**
     * Sets the value of the businessPlanMaleNumberEmployedPersonsInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessPlanMaleNumberEmployedPersonsInvolvedQuantity(BigInteger value) {
        this.businessPlanMaleNumberEmployedPersonsInvolvedQuantity = value;
    }

    /**
     * Gets the value of the businessPlanFemaleNumberEmployedPersonsInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessPlanFemaleNumberEmployedPersonsInvolvedQuantity() {
        return businessPlanFemaleNumberEmployedPersonsInvolvedQuantity;
    }

    /**
     * Sets the value of the businessPlanFemaleNumberEmployedPersonsInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessPlanFemaleNumberEmployedPersonsInvolvedQuantity(BigInteger value) {
        this.businessPlanFemaleNumberEmployedPersonsInvolvedQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity() {
        return measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfPlngJobsForYouthNoEmplInvQuantity = value;
    }

    /**
     * Gets the value of the measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity() {
        return measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity;
    }

    /**
     * Sets the value of the measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity(BigInteger value) {
        this.measStimEmplGenFinPrfLowWagesNoEmplPersonsQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity() {
        return measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfEmpAgrmts19951996NoEmpInvQuantity = value;
    }

    /**
     * Gets the value of the employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity() {
        return employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity;
    }

    /**
     * Sets the value of the employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity(BigInteger value) {
        this.employAgrmts19951996MaleNoEmployedPersonsInvolvedQuantity = value;
    }

    /**
     * Gets the value of the employmentAgreements19951996FemaleNoEmployedPersonsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmploymentAgreements19951996FemaleNoEmployedPersonsQuantity() {
        return employmentAgreements19951996FemaleNoEmployedPersonsQuantity;
    }

    /**
     * Sets the value of the employmentAgreements19951996FemaleNoEmployedPersonsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmploymentAgreements19951996FemaleNoEmployedPersonsQuantity(BigInteger value) {
        this.employmentAgreements19951996FemaleNoEmployedPersonsQuantity = value;
    }

    /**
     * Gets the value of the planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlanningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity() {
        return planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity;
    }

    /**
     * Sets the value of the planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlanningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity(BigInteger value) {
        this.planningJobsForLongTermUnempNoEmployedPersonsInvolvQuantity = value;
    }

    /**
     * Gets the value of the measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmplGenFinPrfMaribelNoEmplPersonsQuantity() {
        return measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity;
    }

    /**
     * Sets the value of the measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmplGenFinPrfMaribelNoEmplPersonsQuantity(BigInteger value) {
        this.measStimEmplGenFinPrfMaribelNoEmplPersonsQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity() {
        return measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfVocReinteg50YearsNoEmpInvQuantity = value;
    }

    /**
     * Gets the value of the totalEmployeesAdvantageHiringPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesAdvantageHiringPlan() {
        return totalEmployeesAdvantageHiringPlan;
    }

    /**
     * Sets the value of the totalEmployeesAdvantageHiringPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesAdvantageHiringPlan(BigInteger value) {
        this.totalEmployeesAdvantageHiringPlan = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity() {
        return measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfConventPartTPrepensionNoEmpQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity() {
        return measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfFullCareerInterruptNoEmpInvQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity() {
        return measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity(BigInteger value) {
        this.measStimEmpGenReductPerfPartTCareerIntrptNoEmpQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity() {
        return otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity(BigInteger value) {
        this.otherMeasStimEmpCntrFirstProfExpNoEmplInvolvedQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity() {
        return otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity(BigInteger value) {
        this.otherMeasStimEmplProspectiveCareerOppsNoEmpInvolvedQuantity = value;
    }

    /**
     * Gets the value of the totalEmployeesSocialMaribel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesSocialMaribel() {
        return totalEmployeesSocialMaribel;
    }

    /**
     * Sets the value of the totalEmployeesSocialMaribel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesSocialMaribel(BigInteger value) {
        this.totalEmployeesSocialMaribel = value;
    }

    /**
     * Gets the value of the totalEmployeesStructurereductionSocSecuritycontribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesStructurereductionSocSecuritycontribution() {
        return totalEmployeesStructurereductionSocSecuritycontribution;
    }

    /**
     * Sets the value of the totalEmployeesStructurereductionSocSecuritycontribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesStructurereductionSocSecuritycontribution(BigInteger value) {
        this.totalEmployeesStructurereductionSocSecuritycontribution = value;
    }

    /**
     * Gets the value of the totalEmployeesProfessionalTransitionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesProfessionalTransitionProgram() {
        return totalEmployeesProfessionalTransitionProgram;
    }

    /**
     * Sets the value of the totalEmployeesProfessionalTransitionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesProfessionalTransitionProgram(BigInteger value) {
        this.totalEmployeesProfessionalTransitionProgram = value;
    }

    /**
     * Gets the value of the totalEmployeesEmploymentServices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesEmploymentServices() {
        return totalEmployeesEmploymentServices;
    }

    /**
     * Sets the value of the totalEmployeesEmploymentServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesEmploymentServices(BigInteger value) {
        this.totalEmployeesEmploymentServices = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity() {
        return otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity(BigInteger value) {
        this.otherMeasStimEmpTraingPeriodForJunrEmpNoEmpInvQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpContrWkVocTraingNoEmplQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpContrWkVocTraingNoEmplQuantity() {
        return otherMeasStimEmpContrWkVocTraingNoEmplQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpContrWkVocTraingNoEmplQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpContrWkVocTraingNoEmplQuantity(BigInteger value) {
        this.otherMeasStimEmpContrWkVocTraingNoEmplQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity() {
        return otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity(BigInteger value) {
        this.otherMeasStimEmplApprenticeshipContrtNoEmplPersonsQuantity = value;
    }

    /**
     * Gets the value of the totalEmployeesFirstjobconvention property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesFirstjobconvention() {
        return totalEmployeesFirstjobconvention;
    }

    /**
     * Sets the value of the totalEmployeesFirstjobconvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesFirstjobconvention(BigInteger value) {
        this.totalEmployeesFirstjobconvention = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity() {
        return otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity(BigInteger value) {
        this.otherMeasStimEmpSuccessiveEmpContrLtdDuratNoEmpQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmplConventPrepensionNoEmplPersonsQuantity() {
        return otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmplConventPrepensionNoEmplPersonsQuantity(BigInteger value) {
        this.otherMeasStimEmplConventPrepensionNoEmplPersonsQuantity = value;
    }

    /**
     * Gets the value of the totalEmployeesReductionofSocialSecuritylowsalaryrange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEmployeesReductionofSocialSecuritylowsalaryrange() {
        return totalEmployeesReductionofSocialSecuritylowsalaryrange;
    }

    /**
     * Sets the value of the totalEmployeesReductionofSocialSecuritylowsalaryrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEmployeesReductionofSocialSecuritylowsalaryrange(BigInteger value) {
        this.totalEmployeesReductionofSocialSecuritylowsalaryrange = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity() {
        return otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity(BigInteger value) {
        this.otherMeasStimEmpConvPartTPrepensionTotNoEmpQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity() {
        return otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity(BigInteger value) {
        this.otherMeasStimEmpFullCareerInterruptionTotNoEmplQuantity = value;
    }

    /**
     * Gets the value of the othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity() {
        return othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity;
    }

    /**
     * Sets the value of the othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity(BigInteger value) {
        this.othMeasStimEmpReductPerfPartTCareerIntrptTotEmpQuantity = value;
    }

    /**
     * Gets the value of the noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity() {
        return noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity;
    }

    /**
     * Sets the value of the noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity(BigInteger value) {
        this.noEmpIn1OrMoreMeasStimEmplymntTotForFinPeriodQuantity = value;
    }

    /**
     * Gets the value of the noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity() {
        return noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity;
    }

    /**
     * Sets the value of the noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity(BigInteger value) {
        this.noEmpin1OrMoreMeasStimEmploymentTotalPrevFinlPrdQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity() {
        return measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity(BigInteger value) {
        this.measStimEmpGenFinPrftBusPlanNoEmplinFTEQuantity = value;
    }

    /**
     * Gets the value of the businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity() {
        return businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity(BigInteger value) {
        this.businessPlanMaleNoEmployedPersonsinFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity() {
        return businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity(BigInteger value) {
        this.businessPlanFemaleNoEmployedPersonsinFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity() {
        return measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenFinPlngJobsForYouthNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfLowWagesNoEmpFTEQuantity() {
        return measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfLowWagesNoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfLowWagesNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity() {
        return measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenEmpAgrmts19951996NoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity() {
        return emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity(BigInteger value) {
        this.emplAgrmts19951996MaleNoEmployPersonsFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity() {
        return emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity(BigInteger value) {
        this.emplAgrmts19951996FemaleNoEmplPersonsFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity() {
        return plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity;
    }

    /**
     * Sets the value of the plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity(BigInteger value) {
        this.plngJobsForLongTermUnemplNoEmplInFullTimeEquivQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinPrfMaribelNoEmpinFTEQuantity() {
        return measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinPrfMaribelNoEmpinFTEQuantity(BigInteger value) {
        this.measStimEmpGenFinPrfMaribelNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenVocReinteg50YearsNoEmpFTEQuantity() {
        return measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenVocReinteg50YearsNoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenVocReinteg50YearsNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the fullTimeEquivalentEmployeesAdvantageHiringPlan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullTimeEquivalentEmployeesAdvantageHiringPlan() {
        return fullTimeEquivalentEmployeesAdvantageHiringPlan;
    }

    /**
     * Sets the value of the fullTimeEquivalentEmployeesAdvantageHiringPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullTimeEquivalentEmployeesAdvantageHiringPlan(BigInteger value) {
        this.fullTimeEquivalentEmployeesAdvantageHiringPlan = value;
    }

    /**
     * Gets the value of the measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenConvPartTPrepensionNoEmpFTEQuantity() {
        return measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenConvPartTPrepensionNoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenConvPartTPrepensionNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity() {
        return measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity(BigInteger value) {
        this.measStimEmpGenFinFullCareerIntrptNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity() {
        return measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity(BigInteger value) {
        this.measStimReductPerfPrtTCareerIntrptNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the fullTimeEquivalentEmployeesSocialMaribel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullTimeEquivalentEmployeesSocialMaribel() {
        return fullTimeEquivalentEmployeesSocialMaribel;
    }

    /**
     * Sets the value of the fullTimeEquivalentEmployeesSocialMaribel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullTimeEquivalentEmployeesSocialMaribel(BigInteger value) {
        this.fullTimeEquivalentEmployeesSocialMaribel = value;
    }

    /**
     * Gets the value of the fteEmployeesStructurereductionSocSecuritycontribution property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTEEmployeesStructurereductionSocSecuritycontribution() {
        return fteEmployeesStructurereductionSocSecuritycontribution;
    }

    /**
     * Sets the value of the fteEmployeesStructurereductionSocSecuritycontribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTEEmployeesStructurereductionSocSecuritycontribution(BigInteger value) {
        this.fteEmployeesStructurereductionSocSecuritycontribution = value;
    }

    /**
     * Gets the value of the fteEmployeesProfessionalTransitionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTEEmployeesProfessionalTransitionProgram() {
        return fteEmployeesProfessionalTransitionProgram;
    }

    /**
     * Sets the value of the fteEmployeesProfessionalTransitionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTEEmployeesProfessionalTransitionProgram(BigInteger value) {
        this.fteEmployeesProfessionalTransitionProgram = value;
    }

    /**
     * Gets the value of the fullTimeEquivalentEmployeesEmploymentServices property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullTimeEquivalentEmployeesEmploymentServices() {
        return fullTimeEquivalentEmployeesEmploymentServices;
    }

    /**
     * Sets the value of the fullTimeEquivalentEmployeesEmploymentServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullTimeEquivalentEmployeesEmploymentServices(BigInteger value) {
        this.fullTimeEquivalentEmployeesEmploymentServices = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity() {
        return otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpCntr1StProfExpNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity() {
        return otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpProspCareerOppsNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity() {
        return otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpTrngPrdJnrEmpNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity() {
        return othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity(BigInteger value) {
        this.othMeasStimEmpContrWkVocTrngNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity() {
        return otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpApprenticeCntrNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the fullTimeEquivalentEmployeesFirstjobconvention property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFullTimeEquivalentEmployeesFirstjobconvention() {
        return fullTimeEquivalentEmployeesFirstjobconvention;
    }

    /**
     * Sets the value of the fullTimeEquivalentEmployeesFirstjobconvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFullTimeEquivalentEmployeesFirstjobconvention(BigInteger value) {
        this.fullTimeEquivalentEmployeesFirstjobconvention = value;
    }

    /**
     * Gets the value of the otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity() {
        return otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity;
    }

    /**
     * Sets the value of the otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity(BigInteger value) {
        this.otherMeasStimSuccessiveEmpCntrLtdDurNoEmpFullTQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpConvPrepensionNoEmpinFTEQuantity() {
        return otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpConvPrepensionNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpConvPrepensionNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the fteEmployeesReductionofSocialSecuritylowsalaryrange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTEEmployeesReductionofSocialSecuritylowsalaryrange() {
        return fteEmployeesReductionofSocialSecuritylowsalaryrange;
    }

    /**
     * Sets the value of the fteEmployeesReductionofSocialSecuritylowsalaryrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTEEmployeesReductionofSocialSecuritylowsalaryrange(BigInteger value) {
        this.fteEmployeesReductionofSocialSecuritylowsalaryrange = value;
    }

    /**
     * Gets the value of the othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity() {
        return othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity(BigInteger value) {
        this.othMeasStimEmpConvPartTPrepensNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity() {
        return otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity;
    }

    /**
     * Sets the value of the otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity(BigInteger value) {
        this.otherMeasStimEmpFullCareerInterrNoEmpinFTEQuantity = value;
    }

    /**
     * Gets the value of the othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOthMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity() {
        return othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity;
    }

    /**
     * Sets the value of the othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOthMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity(BigInteger value) {
        this.othMeasStimRedPerfPartTCareerIntrpNoEmpFTEQuantity = value;
    }

    /**
     * Gets the value of the noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity() {
        return noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity;
    }

    /**
     * Sets the value of the noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity(BigInteger value) {
        this.noEmpin1OrMoreMeasStimEmpTotFinPrdinFTEQuantity = value;
    }

    /**
     * Gets the value of the noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity() {
        return noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity;
    }

    /**
     * Sets the value of the noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity(BigInteger value) {
        this.noEmp1OrMoreMeasStimEmpTotPrevFinPrdFTEQuantity = value;
    }

    /**
     * Gets the value of the measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasStimEmployGeneratingFinPrfBusPlanFinPrfQuantity() {
        return measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity;
    }

    /**
     * Sets the value of the measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasStimEmployGeneratingFinPrfBusPlanFinPrfQuantity(BigInteger value) {
        this.measStimEmployGeneratingFinPrfBusPlanFinPrfQuantity = value;
    }

    /**
     * Gets the value of the businessPlanMaleFinancialProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBusinessPlanMaleFinancialProfit() {
        return businessPlanMaleFinancialProfit;
    }

    /**
     * Sets the value of the businessPlanMaleFinancialProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBusinessPlanMaleFinancialProfit(AmountType value) {
        this.businessPlanMaleFinancialProfit = value;
    }

    /**
     * Gets the value of the businessPlanFemaleFinancialProfitinThousandFrancs property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBusinessPlanFemaleFinancialProfitinThousandFrancs() {
        return businessPlanFemaleFinancialProfitinThousandFrancs;
    }

    /**
     * Sets the value of the businessPlanFemaleFinancialProfitinThousandFrancs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBusinessPlanFemaleFinancialProfitinThousandFrancs(AmountType value) {
        this.businessPlanFemaleFinancialProfitinThousandFrancs = value;
    }

    /**
     * Gets the value of the measStimEmplGenFinPrfPlngJobsForYouthFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimEmplGenFinPrfPlngJobsForYouthFinPrf() {
        return measStimEmplGenFinPrfPlngJobsForYouthFinPrf;
    }

    /**
     * Sets the value of the measStimEmplGenFinPrfPlngJobsForYouthFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimEmplGenFinPrfPlngJobsForYouthFinPrf(AmountType value) {
        this.measStimEmplGenFinPrfPlngJobsForYouthFinPrf = value;
    }

    /**
     * Gets the value of the measStimulatEmplyGeneratingFinPrfLowWagesFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimulatEmplyGeneratingFinPrfLowWagesFinPrf() {
        return measStimulatEmplyGeneratingFinPrfLowWagesFinPrf;
    }

    /**
     * Sets the value of the measStimulatEmplyGeneratingFinPrfLowWagesFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimulatEmplyGeneratingFinPrfLowWagesFinPrf(AmountType value) {
        this.measStimulatEmplyGeneratingFinPrfLowWagesFinPrf = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf() {
        return measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf(AmountType value) {
        this.measStimEmpGenFinPrfEmpAgrmnts19951996FinlPrf = value;
    }

    /**
     * Gets the value of the employAgreementsMale19951996FinProfitThousandFrs property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployAgreementsMale19951996FinProfitThousandFrs() {
        return employAgreementsMale19951996FinProfitThousandFrs;
    }

    /**
     * Sets the value of the employAgreementsMale19951996FinProfitThousandFrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployAgreementsMale19951996FinProfitThousandFrs(AmountType value) {
        this.employAgreementsMale19951996FinProfitThousandFrs = value;
    }

    /**
     * Gets the value of the employAgreemtsFemale19951996FinProfitThousandFrs property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmployAgreemtsFemale19951996FinProfitThousandFrs() {
        return employAgreemtsFemale19951996FinProfitThousandFrs;
    }

    /**
     * Sets the value of the employAgreemtsFemale19951996FinProfitThousandFrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmployAgreemtsFemale19951996FinProfitThousandFrs(AmountType value) {
        this.employAgreemtsFemale19951996FinProfitThousandFrs = value;
    }

    /**
     * Gets the value of the planningJobsForLongTermUnemployedFinancialProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlanningJobsForLongTermUnemployedFinancialProfit() {
        return planningJobsForLongTermUnemployedFinancialProfit;
    }

    /**
     * Sets the value of the planningJobsForLongTermUnemployedFinancialProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlanningJobsForLongTermUnemployedFinancialProfit(AmountType value) {
        this.planningJobsForLongTermUnemployedFinancialProfit = value;
    }

    /**
     * Gets the value of the measStimulatingEmployGeneratingFinPrfMaribelFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimulatingEmployGeneratingFinPrfMaribelFinPrf() {
        return measStimulatingEmployGeneratingFinPrfMaribelFinPrf;
    }

    /**
     * Sets the value of the measStimulatingEmployGeneratingFinPrfMaribelFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimulatingEmployGeneratingFinPrfMaribelFinPrf(AmountType value) {
        this.measStimulatingEmployGeneratingFinPrfMaribelFinPrf = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfVocReintegrat50YrsFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimEmpGenFinPrfVocReintegrat50YrsFinPrf() {
        return measStimEmpGenFinPrfVocReintegrat50YrsFinPrf;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfVocReintegrat50YrsFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimEmpGenFinPrfVocReintegrat50YrsFinPrf(AmountType value) {
        this.measStimEmpGenFinPrfVocReintegrat50YrsFinPrf = value;
    }

    /**
     * Gets the value of the advantageHiringPlanAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvantageHiringPlanAmount() {
        return advantageHiringPlanAmount;
    }

    /**
     * Sets the value of the advantageHiringPlanAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvantageHiringPlanAmount(AmountType value) {
        this.advantageHiringPlanAmount = value;
    }

    /**
     * Gets the value of the measStimEmpGenFinPrfConvntPartTPrepensionFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimEmpGenFinPrfConvntPartTPrepensionFinPrf() {
        return measStimEmpGenFinPrfConvntPartTPrepensionFinPrf;
    }

    /**
     * Sets the value of the measStimEmpGenFinPrfConvntPartTPrepensionFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimEmpGenFinPrfConvntPartTPrepensionFinPrf(AmountType value) {
        this.measStimEmpGenFinPrfConvntPartTPrepensionFinPrf = value;
    }

    /**
     * Gets the value of the measStimEmplGenFinPrfFullCareerInterruptFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasStimEmplGenFinPrfFullCareerInterruptFinPrf() {
        return measStimEmplGenFinPrfFullCareerInterruptFinPrf;
    }

    /**
     * Sets the value of the measStimEmplGenFinPrfFullCareerInterruptFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasStimEmplGenFinPrfFullCareerInterruptFinPrf(AmountType value) {
        this.measStimEmplGenFinPrfFullCareerInterruptFinPrf = value;
    }

    /**
     * Gets the value of the measEmpGenReductJobPerfPartTCareerIntrptFinPrf property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMeasEmpGenReductJobPerfPartTCareerIntrptFinPrf() {
        return measEmpGenReductJobPerfPartTCareerIntrptFinPrf;
    }

    /**
     * Sets the value of the measEmpGenReductJobPerfPartTCareerIntrptFinPrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMeasEmpGenReductJobPerfPartTCareerIntrptFinPrf(AmountType value) {
        this.measEmpGenReductJobPerfPartTCareerIntrptFinPrf = value;
    }

    /**
     * Gets the value of the socialMaribelAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSocialMaribelAmount() {
        return socialMaribelAmount;
    }

    /**
     * Sets the value of the socialMaribelAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSocialMaribelAmount(AmountType value) {
        this.socialMaribelAmount = value;
    }

    /**
     * Gets the value of the structureReductionSocialSecurityContributionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStructureReductionSocialSecurityContributionAmount() {
        return structureReductionSocialSecurityContributionAmount;
    }

    /**
     * Sets the value of the structureReductionSocialSecurityContributionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStructureReductionSocialSecurityContributionAmount(AmountType value) {
        this.structureReductionSocialSecurityContributionAmount = value;
    }

    /**
     * Gets the value of the professionalTransitionProgramAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfessionalTransitionProgramAmount() {
        return professionalTransitionProgramAmount;
    }

    /**
     * Sets the value of the professionalTransitionProgramAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfessionalTransitionProgramAmount(AmountType value) {
        this.professionalTransitionProgramAmount = value;
    }

    /**
     * Gets the value of the employmentServicesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEmploymentServicesAmount() {
        return employmentServicesAmount;
    }

    /**
     * Sets the value of the employmentServicesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEmploymentServicesAmount(AmountType value) {
        this.employmentServicesAmount = value;
    }

    /**
     * Gets the value of the vocationalTrainingContractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVocationalTrainingContractAmount() {
        return vocationalTrainingContractAmount;
    }

    /**
     * Sets the value of the vocationalTrainingContractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVocationalTrainingContractAmount(AmountType value) {
        this.vocationalTrainingContractAmount = value;
    }

    /**
     * Gets the value of the apprenticeshipContractsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getApprenticeshipContractsAmount() {
        return apprenticeshipContractsAmount;
    }

    /**
     * Sets the value of the apprenticeshipContractsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setApprenticeshipContractsAmount(AmountType value) {
        this.apprenticeshipContractsAmount = value;
    }

    /**
     * Gets the value of the firstJobConventionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFirstJobConventionAmount() {
        return firstJobConventionAmount;
    }

    /**
     * Sets the value of the firstJobConventionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFirstJobConventionAmount(AmountType value) {
        this.firstJobConventionAmount = value;
    }

    /**
     * Gets the value of the trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainingInitiativesExpenseEmployerMaleNoEmployeesQuantity() {
        return trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity;
    }

    /**
     * Sets the value of the trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainingInitiativesExpenseEmployerMaleNoEmployeesQuantity(BigInteger value) {
        this.trainingInitiativesExpenseEmployerMaleNoEmployeesQuantity = value;
    }

    /**
     * Gets the value of the trainingInitiativesExpenseEmployerFemaleNoEmployQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainingInitiativesExpenseEmployerFemaleNoEmployQuantity() {
        return trainingInitiativesExpenseEmployerFemaleNoEmployQuantity;
    }

    /**
     * Sets the value of the trainingInitiativesExpenseEmployerFemaleNoEmployQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainingInitiativesExpenseEmployerFemaleNoEmployQuantity(BigInteger value) {
        this.trainingInitiativesExpenseEmployerFemaleNoEmployQuantity = value;
    }

    /**
     * Gets the value of the trainInitiatExpEmployerMaleNoTrainingHoursQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainInitiatExpEmployerMaleNoTrainingHoursQuantity() {
        return trainInitiatExpEmployerMaleNoTrainingHoursQuantity;
    }

    /**
     * Sets the value of the trainInitiatExpEmployerMaleNoTrainingHoursQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainInitiatExpEmployerMaleNoTrainingHoursQuantity(BigInteger value) {
        this.trainInitiatExpEmployerMaleNoTrainingHoursQuantity = value;
    }

    /**
     * Gets the value of the trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity() {
        return trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity;
    }

    /**
     * Sets the value of the trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity(BigInteger value) {
        this.trainInitiatExpenseEmployerFemaleNoTrainingHrsQuantity = value;
    }

    /**
     * Gets the value of the trainingInitiatExpEmployerMaleChargesToEntrerp property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTrainingInitiatExpEmployerMaleChargesToEntrerp() {
        return trainingInitiatExpEmployerMaleChargesToEntrerp;
    }

    /**
     * Sets the value of the trainingInitiatExpEmployerMaleChargesToEntrerp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTrainingInitiatExpEmployerMaleChargesToEntrerp(AmountType value) {
        this.trainingInitiatExpEmployerMaleChargesToEntrerp = value;
    }

    /**
     * Gets the value of the maleGrosscostofformalprofessionaltraining property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaleGrosscostofformalprofessionaltraining() {
        return maleGrosscostofformalprofessionaltraining;
    }

    /**
     * Sets the value of the maleGrosscostofformalprofessionaltraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaleGrosscostofformalprofessionaltraining(AmountType value) {
        this.maleGrosscostofformalprofessionaltraining = value;
    }

    /**
     * Gets the value of the malePaidcontributionsandpaymentstopublicfunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMalePaidcontributionsandpaymentstopublicfunds() {
        return malePaidcontributionsandpaymentstopublicfunds;
    }

    /**
     * Sets the value of the malePaidcontributionsandpaymentstopublicfunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMalePaidcontributionsandpaymentstopublicfunds(BigInteger value) {
        this.malePaidcontributionsandpaymentstopublicfunds = value;
    }

    /**
     * Gets the value of the maleBenefitsreceivedfortraining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleBenefitsreceivedfortraining() {
        return maleBenefitsreceivedfortraining;
    }

    /**
     * Sets the value of the maleBenefitsreceivedfortraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleBenefitsreceivedfortraining(BigInteger value) {
        this.maleBenefitsreceivedfortraining = value;
    }

    /**
     * Gets the value of the trainInitiatExpEmployerFemaleChargesToEnterpr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTrainInitiatExpEmployerFemaleChargesToEnterpr() {
        return trainInitiatExpEmployerFemaleChargesToEnterpr;
    }

    /**
     * Sets the value of the trainInitiatExpEmployerFemaleChargesToEnterpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTrainInitiatExpEmployerFemaleChargesToEnterpr(AmountType value) {
        this.trainInitiatExpEmployerFemaleChargesToEnterpr = value;
    }

    /**
     * Gets the value of the femaleGrosscostofformalprofessionaltraining property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFemaleGrosscostofformalprofessionaltraining() {
        return femaleGrosscostofformalprofessionaltraining;
    }

    /**
     * Sets the value of the femaleGrosscostofformalprofessionaltraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFemaleGrosscostofformalprofessionaltraining(AmountType value) {
        this.femaleGrosscostofformalprofessionaltraining = value;
    }

    /**
     * Gets the value of the femalePaidcontributionsandpaymentstopublicfunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemalePaidcontributionsandpaymentstopublicfunds() {
        return femalePaidcontributionsandpaymentstopublicfunds;
    }

    /**
     * Sets the value of the femalePaidcontributionsandpaymentstopublicfunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemalePaidcontributionsandpaymentstopublicfunds(BigInteger value) {
        this.femalePaidcontributionsandpaymentstopublicfunds = value;
    }

    /**
     * Gets the value of the femaleBenefitsreceivedfortraining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleBenefitsreceivedfortraining() {
        return femaleBenefitsreceivedfortraining;
    }

    /**
     * Sets the value of the femaleBenefitsreceivedfortraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleBenefitsreceivedfortraining(BigInteger value) {
        this.femaleBenefitsreceivedfortraining = value;
    }

    /**
     * Gets the value of the maleEmployeeNumEngagedintrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleEmployeeNumEngagedintrainingcoachingortutoring() {
        return maleEmployeeNumEngagedintrainingcoachingortutoring;
    }

    /**
     * Sets the value of the maleEmployeeNumEngagedintrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleEmployeeNumEngagedintrainingcoachingortutoring(BigInteger value) {
        this.maleEmployeeNumEngagedintrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the maleTotalHoursEngagedintrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleTotalHoursEngagedintrainingcoachingortutoring() {
        return maleTotalHoursEngagedintrainingcoachingortutoring;
    }

    /**
     * Sets the value of the maleTotalHoursEngagedintrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleTotalHoursEngagedintrainingcoachingortutoring(BigInteger value) {
        this.maleTotalHoursEngagedintrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the maleEmployeeNumAttendedtrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleEmployeeNumAttendedtrainingcoachingortutoring() {
        return maleEmployeeNumAttendedtrainingcoachingortutoring;
    }

    /**
     * Sets the value of the maleEmployeeNumAttendedtrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleEmployeeNumAttendedtrainingcoachingortutoring(BigInteger value) {
        this.maleEmployeeNumAttendedtrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the femaleEmployeeNumEngagedintrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleEmployeeNumEngagedintrainingcoachingortutoring() {
        return femaleEmployeeNumEngagedintrainingcoachingortutoring;
    }

    /**
     * Sets the value of the femaleEmployeeNumEngagedintrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleEmployeeNumEngagedintrainingcoachingortutoring(BigInteger value) {
        this.femaleEmployeeNumEngagedintrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the femaleTotalHoursEngagedintrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleTotalHoursEngagedintrainingcoachingortutoring() {
        return femaleTotalHoursEngagedintrainingcoachingortutoring;
    }

    /**
     * Sets the value of the femaleTotalHoursEngagedintrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleTotalHoursEngagedintrainingcoachingortutoring(BigInteger value) {
        this.femaleTotalHoursEngagedintrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the femaleEmployeeNumAttendedtrainingcoachingortutoring property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleEmployeeNumAttendedtrainingcoachingortutoring() {
        return femaleEmployeeNumAttendedtrainingcoachingortutoring;
    }

    /**
     * Sets the value of the femaleEmployeeNumAttendedtrainingcoachingortutoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleEmployeeNumAttendedtrainingcoachingortutoring(BigInteger value) {
        this.femaleEmployeeNumAttendedtrainingcoachingortutoring = value;
    }

    /**
     * Gets the value of the maleInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleInformalProfessionalTrainingInvolvedQuantity() {
        return maleInformalProfessionalTrainingInvolvedQuantity;
    }

    /**
     * Sets the value of the maleInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleInformalProfessionalTrainingInvolvedQuantity(BigInteger value) {
        this.maleInformalProfessionalTrainingInvolvedQuantity = value;
    }

    /**
     * Gets the value of the maleinInformalProfessionalTrainingHoursQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleinInformalProfessionalTrainingHoursQuantity() {
        return maleinInformalProfessionalTrainingHoursQuantity;
    }

    /**
     * Sets the value of the maleinInformalProfessionalTrainingHoursQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleinInformalProfessionalTrainingHoursQuantity(BigInteger value) {
        this.maleinInformalProfessionalTrainingHoursQuantity = value;
    }

    /**
     * Gets the value of the maleNetcostInformalProfessionalTraining property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaleNetcostInformalProfessionalTraining() {
        return maleNetcostInformalProfessionalTraining;
    }

    /**
     * Sets the value of the maleNetcostInformalProfessionalTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaleNetcostInformalProfessionalTraining(AmountType value) {
        this.maleNetcostInformalProfessionalTraining = value;
    }

    /**
     * Gets the value of the femaleInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleInformalProfessionalTrainingInvolvedQuantity() {
        return femaleInformalProfessionalTrainingInvolvedQuantity;
    }

    /**
     * Sets the value of the femaleInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleInformalProfessionalTrainingInvolvedQuantity(BigInteger value) {
        this.femaleInformalProfessionalTrainingInvolvedQuantity = value;
    }

    /**
     * Gets the value of the femaleinInformalProfessionalTrainingHoursQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleinInformalProfessionalTrainingHoursQuantity() {
        return femaleinInformalProfessionalTrainingHoursQuantity;
    }

    /**
     * Sets the value of the femaleinInformalProfessionalTrainingHoursQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleinInformalProfessionalTrainingHoursQuantity(BigInteger value) {
        this.femaleinInformalProfessionalTrainingHoursQuantity = value;
    }

    /**
     * Gets the value of the femaleNetcostInformalProfessionalTraining property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFemaleNetcostInformalProfessionalTraining() {
        return femaleNetcostInformalProfessionalTraining;
    }

    /**
     * Sets the value of the femaleNetcostInformalProfessionalTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFemaleNetcostInformalProfessionalTraining(AmountType value) {
        this.femaleNetcostInformalProfessionalTraining = value;
    }

    /**
     * Gets the value of the maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity() {
        return maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity;
    }

    /**
     * Sets the value of the maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity(BigInteger value) {
        this.maleEmplyerExpInformalProfessionalTrainingInvolvedQuantity = value;
    }

    /**
     * Gets the value of the maleEmplyerExpInformalProfessionalTrainingHoursQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleEmplyerExpInformalProfessionalTrainingHoursQuantity() {
        return maleEmplyerExpInformalProfessionalTrainingHoursQuantity;
    }

    /**
     * Sets the value of the maleEmplyerExpInformalProfessionalTrainingHoursQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleEmplyerExpInformalProfessionalTrainingHoursQuantity(BigInteger value) {
        this.maleEmplyerExpInformalProfessionalTrainingHoursQuantity = value;
    }

    /**
     * Gets the value of the maleEmplyerExpNetcostInformalProfessionalTraining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaleEmplyerExpNetcostInformalProfessionalTraining() {
        return maleEmplyerExpNetcostInformalProfessionalTraining;
    }

    /**
     * Sets the value of the maleEmplyerExpNetcostInformalProfessionalTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaleEmplyerExpNetcostInformalProfessionalTraining(BigInteger value) {
        this.maleEmplyerExpNetcostInformalProfessionalTraining = value;
    }

    /**
     * Gets the value of the femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity() {
        return femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity;
    }

    /**
     * Sets the value of the femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity(BigInteger value) {
        this.femaleEmplyerExpInformalProfessionalTrainingInvolvedQuantity = value;
    }

    /**
     * Gets the value of the femaleEmplyerExpInformalProfessionalTrainingHoursQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleEmplyerExpInformalProfessionalTrainingHoursQuantity() {
        return femaleEmplyerExpInformalProfessionalTrainingHoursQuantity;
    }

    /**
     * Sets the value of the femaleEmplyerExpInformalProfessionalTrainingHoursQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleEmplyerExpInformalProfessionalTrainingHoursQuantity(BigInteger value) {
        this.femaleEmplyerExpInformalProfessionalTrainingHoursQuantity = value;
    }

    /**
     * Gets the value of the femaleEmplyerExpNetcostInformalProfessionalTraining property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFemaleEmplyerExpNetcostInformalProfessionalTraining() {
        return femaleEmplyerExpNetcostInformalProfessionalTraining;
    }

    /**
     * Sets the value of the femaleEmplyerExpNetcostInformalProfessionalTraining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFemaleEmplyerExpNetcostInformalProfessionalTraining(BigInteger value) {
        this.femaleEmplyerExpNetcostInformalProfessionalTraining = value;
    }

}
