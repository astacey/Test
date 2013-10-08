
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldNonCurrentAssetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldNonCurrentAssetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Goodwill" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Patents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherIntangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantMachineryEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Deposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLongTermInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FormationExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Intangibles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureVehiclesNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LeasingOtherSimilarRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentsOnAccountAssetsinCourseConstruction" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesLoansinGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesinGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesLoansinNonGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ParticipatingInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToNonGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Shares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherInvestmentsExcludingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ParticipationsinAffiliates" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ParticipationsNonAffiliates" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherSharesPartFinancialFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredReceivablesFromAffiliates" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FormationCostsIntangiblesAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EqualizationAccounts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BusinessPremises" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantMachineryElectronicalEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureVehicles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BuildingsinConstructionAdvancesOnFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongLeaseLeasingSimilarRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AffiliatedEnterprises" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherEnterprisesLinkedbyParticipatingInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BondsShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsRecCashGuarantee" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResearchDevelopment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherIntangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFixedOperatingAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonOperationalFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GroupCompaniesParticipations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CalledUpCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AcquisitionCommissionsToBeAmortised" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmortisedLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmortisedNonLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAcquisitionExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDeferredCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandAndBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealEstateForBusinessActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealEstateForThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherRealEstateAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherPropertyRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FurnitureOfficeMachineryInternalMeansOfTransport" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MovablePropertyRecordedInPublicRegisters" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PlantEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Buildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixturesEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixedAssetDepreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredAsset" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntangibleAssetDepreciation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BuildingsGross" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromSubscriptions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmortisationCosts" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Land" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BuildingsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MachinesMechanicalPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Provisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepreciationAmortisation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StartUpExpansionExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FranchisesLicensesSimilarRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyEquivalentRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyWithCommercialIndustrialBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyWithResidentialBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandWithoutBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyWithHereditaryBuildingRightsThirdParties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BuildingsOnOthersRealProperty" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealPropertyWithRailwaysSpecificRailwayBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Others" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MiningsDrillingsEtc" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransportationMeans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TanksPipelines" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MotorVehicles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProductionExtractionUtilityPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RegulationStoringPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SupplyPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Power" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NaturalGas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Heat" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PowerGenerationSupplyPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RailsRoutingEquipmentSecurityPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="VehiclesForPassengerMerchandiseRailTraffic" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalPlantsOperatingDevices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixturesFittingsOtherEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PreparatoryCostForConstruction" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancePaymentsConstructioninProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LeasingAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LeasingDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SalesRealPropertyDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TradeDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="HospitalHealthCareFoundationDueOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnderHospitalFinancingLawDue1Year" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonGovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="JointVenturesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShareholdersDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AffiliatedCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableOtherAssetsDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RealEstate" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EquityInterestsInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherEquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Assetsinprogressandadvances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInGroupOtherCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInGroupOtherCompaniesSharesQuotas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInGroupOtherCompaniesHoldingCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInSubsidiaryCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInGroupOtherCompaniesOtherCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInGroupOtherCompaniesBondsIssued" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBondsIssuedbyHoldingCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBondsIssuedbySubsidiaryCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBondsIssuedbyAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBondsIssuedbyAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBondsIssuedbyOtherCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToHoldingCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToSubsidiaryCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansToOtherCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsSharesQuotas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsQuotedShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsUnquotedShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsQuotas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsBondsFixedSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsQuoted" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsUnquoted" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsConvertibleBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsCollateralLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsPolicyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsOtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsQuotasInMutualFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsDepositsCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialInvestmentsSundryFinancialInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DepositsWithCedingCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestInLifeInsurFromPensionFundManagement" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestLinkedToInvestFundsMarketIndexes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestDerivingFromPensionFundManagement" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DbisTechnicalReservesChargedToReinsurers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsurancePremiumReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsuranceClaimsReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsuranceReserveForProfitSharingRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsuranceOtherTechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsurancePremiumReserveForComplementaryInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceReserveForAmountsToBePaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceReserveForProfitSharingRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceOtherTechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsuranceTechnicalReserveForInsPensionFund" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TangibleAssetsStocks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CompanysOwnSharesOrQuotas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EquityInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GroupCmpanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedByAssoAffiliatedCoS" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncludingEquityInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InternallyGeneratedIntangibleAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResearchDevelopmentExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConcessionsPatentsLicensesTrademarksAndSimilarrights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ConcessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IntangibleFixedAssetsUnderConstruction" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansAndClaimsAsFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldNonCurrentAssetsType", propOrder = {
    "goodwill",
    "patents",
    "otherIntangibleAssets",
    "intangibleAssets",
    "landBuildings",
    "plantMachineryEquipment",
    "tangibleFixedAssets",
    "deposits",
    "financialAssets",
    "longTermInvestments",
    "otherLongTermInvestments",
    "totalFixedAssets",
    "totalLongTermAssets",
    "formationExpenses",
    "intangibles",
    "furnitureVehiclesNet",
    "leasingOtherSimilarRights",
    "otherTangibleAssetsNet",
    "paymentsOnAccountAssetsinCourseConstruction",
    "sharesLoansinGroupCompanies",
    "sharesinGroupCompanies",
    "loansToGroupCompanies",
    "sharesLoansinNonGroupCompanies",
    "participatingInterest",
    "loansToNonGroupCompanies",
    "otherFinancialAssets",
    "shares",
    "otherInvestmentsExcludingLoans",
    "participationsinAffiliates",
    "participationsNonAffiliates",
    "otherSharesPartFinancialFixedAssets",
    "deferredReceivablesFromAffiliates",
    "formationCostsIntangiblesAssets",
    "ownShares",
    "otherAssets",
    "equalizationAccounts",
    "tangibleAssets",
    "businessPremises",
    "plantMachineryElectronicalEquipment",
    "furnitureVehicles",
    "buildingsinConstructionAdvancesOnFixedAssets",
    "longLeaseLeasingSimilarRights",
    "otherTangibleAssets",
    "affiliatedEnterprises",
    "amountsReceivable",
    "otherEnterprisesLinkedbyParticipatingInterests",
    "bondsShares",
    "amountsRecCashGuarantee",
    "researchDevelopment",
    "otherIntangibleAssetsNet",
    "otherFixedOperatingAssets",
    "nonOperationalFixedAssets",
    "otherFixedAssets",
    "groupCompaniesParticipations",
    "calledUpCapital",
    "acquisitionCommissionsToBeAmortised",
    "amortisedLifeInsurance",
    "amortisedNonLifeInsurance",
    "otherAcquisitionExpenses",
    "otherDeferredCharges",
    "investments",
    "landAndBuildings",
    "realEstateForBusinessActivities",
    "realEstateForThirdParties",
    "otherRealEstateAssets",
    "otherPropertyRights",
    "furnitureOfficeMachineryInternalMeansOfTransport",
    "movablePropertyRecordedInPublicRegisters",
    "plantEquipment",
    "buildings",
    "fixturesEquipment",
    "fixedAssetDepreciation",
    "deferredAsset",
    "intangibleAssetDepreciation",
    "buildingsGross",
    "receivablesFromSubscriptions",
    "amortisationCosts",
    "land",
    "buildingsNet",
    "machinesMechanicalPlants",
    "provisions",
    "depreciationAmortisation",
    "startUpExpansionExpenses",
    "franchisesLicensesSimilarRights",
    "propertyEquivalentRights",
    "propertyWithCommercialIndustrialBuildings",
    "propertyWithResidentialBuildings",
    "landWithoutBuildings",
    "propertyWithHereditaryBuildingRightsThirdParties",
    "buildingsOnOthersRealProperty",
    "realPropertyWithRailwaysSpecificRailwayBuildings",
    "others",
    "miningsDrillingsEtc",
    "transportationMeans",
    "tanksPipelines",
    "motorVehicles",
    "productionExtractionUtilityPlants",
    "regulationStoringPlants",
    "supplyPlants",
    "power",
    "naturalGas",
    "heat",
    "powerGenerationSupplyPlants",
    "railsRoutingEquipmentSecurityPlants",
    "vehiclesForPassengerMerchandiseRailTraffic",
    "technicalPlantsOperatingDevices",
    "fixturesFittingsOtherEquipment",
    "preparatoryCostForConstruction",
    "advancePaymentsConstructioninProgress",
    "leasingAssets",
    "leasingDueAfterOneYear",
    "salesRealPropertyDueAfterOneYear",
    "tradeDueAfterOneYear",
    "hospitalHealthCareFoundationDueOneYear",
    "underHospitalFinancingLawDue1Year",
    "governmentalAidDueAfterOneYear",
    "nonGovernmentalAidDueAfterOneYear",
    "otherCompaniesDueAfterOneYear",
    "jointVenturesDueAfterOneYear",
    "shareholdersDueAfterOneYear",
    "affiliatedCompaniesDueAfterOneYear",
    "otherAssetsDueAfterOneYear",
    "accountsReceivableOtherAssetsDueAfterOneYear",
    "investmentsLongTerm",
    "realEstate",
    "investmentsinAffiliatedCompaniesAssociatedCompanies",
    "sharesInAssociatedCompanies",
    "equityInterests",
    "equityInterestsInAssociatedCompanies",
    "otherEquityInterests",
    "otherInvestments",
    "assetsinprogressandadvances",
    "investmentsInGroupOtherCompanies",
    "investmentsInGroupOtherCompaniesSharesQuotas",
    "investmentsInGroupOtherCompaniesHoldingCompanies",
    "investmentsInSubsidiaryCompanies",
    "investmentsInAssociatedCompanies",
    "investmentsInAffiliatedCompanies",
    "investmentsInGroupOtherCompaniesOtherCompanies",
    "investmentsInGroupOtherCompaniesBondsIssued",
    "investmentsBondsIssuedbyHoldingCompanies",
    "investmentsBondsIssuedbySubsidiaryCompanies",
    "investmentsBondsIssuedbyAssociatedCompanies",
    "investmentsBondsIssuedbyAffiliatedCompanies",
    "investmentsBondsIssuedbyOtherCompanies",
    "loansToCompanies",
    "loansToHoldingCompanies",
    "loansToSubsidiaryCompanies",
    "loansToAssociatedCompanies",
    "loansToAffiliatedCompanies",
    "loansToOtherCompanies",
    "otherFinancialInvestments",
    "otherFinancialInvestmentsSharesQuotas",
    "otherFinancialInvestmentsQuotedShares",
    "otherFinancialInvestmentsUnquotedShares",
    "otherFinancialInvestmentsQuotas",
    "otherFinancialInvestmentsBondsFixedSecurities",
    "otherFinancialInvestmentsQuoted",
    "otherFinancialInvestmentsUnquoted",
    "otherFinancialInvestmentsConvertibleBonds",
    "otherFinancialInvestmentsLoans",
    "otherFinancialInvestmentsCollateralLoans",
    "otherFinancialInvestmentsPolicyLoans",
    "otherFinancialInvestmentsOtherLoans",
    "otherFinancialInvestmentsQuotasInMutualFunds",
    "otherFinancialInvestmentsDepositsCreditInstitutions",
    "otherFinancialInvestmentsSundryFinancialInvestments",
    "depositsWithCedingCompanies",
    "investInLifeInsurFromPensionFundManagement",
    "investLinkedToInvestFundsMarketIndexes",
    "investDerivingFromPensionFundManagement",
    "dbisTechnicalReservesChargedToReinsurers",
    "nonLifeInsurance",
    "nonLifeInsurancePremiumReserve",
    "nonLifeInsuranceClaimsReserve",
    "nonLifeInsuranceReserveForProfitSharingRefunds",
    "nonLifeInsuranceOtherTechnicalReserves",
    "lifeInsurance",
    "lifeInsuranceActuarialReserves",
    "lifeInsurancePremiumReserveForComplementaryInsurance",
    "lifeInsuranceReserveForAmountsToBePaid",
    "lifeInsuranceReserveForProfitSharingRefunds",
    "lifeInsuranceOtherTechnicalReserves",
    "lifeInsuranceTechnicalReserveForInsPensionFund",
    "tangibleAssetsStocks",
    "companysOwnSharesOrQuotas",
    "equityInvestments",
    "groupCmpanies",
    "amountsOwedByAssoAffiliatedCoS",
    "includingEquityInvestments",
    "internallyGeneratedIntangibleAssets",
    "researchDevelopmentExpenses",
    "concessionsPatentsLicensesTrademarksAndSimilarrights",
    "concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration",
    "intangibleFixedAssetsUnderConstruction",
    "loansAndClaimsAsFixedAssets"
})
public class BalanceSheetDtldNonCurrentAssetsType {

    @XmlElement(name = "Goodwill")
    protected AmountType goodwill;
    @XmlElement(name = "Patents")
    protected AmountType patents;
    @XmlElement(name = "OtherIntangibleAssets")
    protected AmountType otherIntangibleAssets;
    @XmlElement(name = "IntangibleAssets")
    protected AmountType intangibleAssets;
    @XmlElement(name = "LandBuildings")
    protected AmountType landBuildings;
    @XmlElement(name = "PlantMachineryEquipment")
    protected AmountType plantMachineryEquipment;
    @XmlElement(name = "TangibleFixedAssets")
    protected AmountType tangibleFixedAssets;
    @XmlElement(name = "Deposits")
    protected AmountType deposits;
    @XmlElement(name = "FinancialAssets")
    protected AmountType financialAssets;
    @XmlElement(name = "LongTermInvestments")
    protected AmountType longTermInvestments;
    @XmlElement(name = "OtherLongTermInvestments")
    protected AmountType otherLongTermInvestments;
    @XmlElement(name = "TotalFixedAssets")
    protected AmountType totalFixedAssets;
    @XmlElement(name = "TotalLongTermAssets")
    protected AmountType totalLongTermAssets;
    @XmlElement(name = "FormationExpenses")
    protected AmountType formationExpenses;
    @XmlElement(name = "Intangibles")
    protected AmountType intangibles;
    @XmlElement(name = "FurnitureVehiclesNet")
    protected AmountType furnitureVehiclesNet;
    @XmlElement(name = "LeasingOtherSimilarRights")
    protected AmountType leasingOtherSimilarRights;
    @XmlElement(name = "OtherTangibleAssetsNet")
    protected AmountType otherTangibleAssetsNet;
    @XmlElement(name = "PaymentsOnAccountAssetsinCourseConstruction")
    protected AmountType paymentsOnAccountAssetsinCourseConstruction;
    @XmlElement(name = "SharesLoansinGroupCompanies")
    protected AmountType sharesLoansinGroupCompanies;
    @XmlElement(name = "SharesinGroupCompanies")
    protected AmountType sharesinGroupCompanies;
    @XmlElement(name = "LoansToGroupCompanies")
    protected AmountType loansToGroupCompanies;
    @XmlElement(name = "SharesLoansinNonGroupCompanies")
    protected AmountType sharesLoansinNonGroupCompanies;
    @XmlElement(name = "ParticipatingInterest")
    protected AmountType participatingInterest;
    @XmlElement(name = "LoansToNonGroupCompanies")
    protected AmountType loansToNonGroupCompanies;
    @XmlElement(name = "OtherFinancialAssets")
    protected AmountType otherFinancialAssets;
    @XmlElement(name = "Shares")
    protected AmountType shares;
    @XmlElement(name = "OtherInvestmentsExcludingLoans")
    protected AmountType otherInvestmentsExcludingLoans;
    @XmlElement(name = "ParticipationsinAffiliates")
    protected AmountType participationsinAffiliates;
    @XmlElement(name = "ParticipationsNonAffiliates")
    protected AmountType participationsNonAffiliates;
    @XmlElement(name = "OtherSharesPartFinancialFixedAssets")
    protected AmountType otherSharesPartFinancialFixedAssets;
    @XmlElement(name = "DeferredReceivablesFromAffiliates")
    protected AmountType deferredReceivablesFromAffiliates;
    @XmlElement(name = "FormationCostsIntangiblesAssets")
    protected AmountType formationCostsIntangiblesAssets;
    @XmlElement(name = "OwnShares")
    protected AmountType ownShares;
    @XmlElement(name = "OtherAssets")
    protected AmountType otherAssets;
    @XmlElement(name = "EqualizationAccounts")
    protected AmountType equalizationAccounts;
    @XmlElement(name = "TangibleAssets")
    protected AmountType tangibleAssets;
    @XmlElement(name = "BusinessPremises")
    protected AmountType businessPremises;
    @XmlElement(name = "PlantMachineryElectronicalEquipment")
    protected AmountType plantMachineryElectronicalEquipment;
    @XmlElement(name = "FurnitureVehicles")
    protected AmountType furnitureVehicles;
    @XmlElement(name = "BuildingsinConstructionAdvancesOnFixedAssets")
    protected AmountType buildingsinConstructionAdvancesOnFixedAssets;
    @XmlElement(name = "LongLeaseLeasingSimilarRights")
    protected AmountType longLeaseLeasingSimilarRights;
    @XmlElement(name = "OtherTangibleAssets")
    protected AmountType otherTangibleAssets;
    @XmlElement(name = "AffiliatedEnterprises")
    protected AmountType affiliatedEnterprises;
    @XmlElement(name = "AmountsReceivable")
    protected AmountType amountsReceivable;
    @XmlElement(name = "OtherEnterprisesLinkedbyParticipatingInterests")
    protected AmountType otherEnterprisesLinkedbyParticipatingInterests;
    @XmlElement(name = "BondsShares")
    protected AmountType bondsShares;
    @XmlElement(name = "AmountsRecCashGuarantee")
    protected AmountType amountsRecCashGuarantee;
    @XmlElement(name = "ResearchDevelopment")
    protected AmountType researchDevelopment;
    @XmlElement(name = "OtherIntangibleAssetsNet")
    protected AmountType otherIntangibleAssetsNet;
    @XmlElement(name = "OtherFixedOperatingAssets")
    protected AmountType otherFixedOperatingAssets;
    @XmlElement(name = "NonOperationalFixedAssets")
    protected AmountType nonOperationalFixedAssets;
    @XmlElement(name = "OtherFixedAssets")
    protected AmountType otherFixedAssets;
    @XmlElement(name = "GroupCompaniesParticipations")
    protected AmountType groupCompaniesParticipations;
    @XmlElement(name = "CalledUpCapital")
    protected AmountType calledUpCapital;
    @XmlElement(name = "AcquisitionCommissionsToBeAmortised")
    protected AmountType acquisitionCommissionsToBeAmortised;
    @XmlElement(name = "AmortisedLifeInsurance")
    protected AmountType amortisedLifeInsurance;
    @XmlElement(name = "AmortisedNonLifeInsurance")
    protected AmountType amortisedNonLifeInsurance;
    @XmlElement(name = "OtherAcquisitionExpenses")
    protected AmountType otherAcquisitionExpenses;
    @XmlElement(name = "OtherDeferredCharges")
    protected AmountType otherDeferredCharges;
    @XmlElement(name = "Investments")
    protected AmountType investments;
    @XmlElement(name = "LandAndBuildings")
    protected AmountType landAndBuildings;
    @XmlElement(name = "RealEstateForBusinessActivities")
    protected AmountType realEstateForBusinessActivities;
    @XmlElement(name = "RealEstateForThirdParties")
    protected AmountType realEstateForThirdParties;
    @XmlElement(name = "OtherRealEstateAssets")
    protected AmountType otherRealEstateAssets;
    @XmlElement(name = "OtherPropertyRights")
    protected AmountType otherPropertyRights;
    @XmlElement(name = "FurnitureOfficeMachineryInternalMeansOfTransport")
    protected AmountType furnitureOfficeMachineryInternalMeansOfTransport;
    @XmlElement(name = "MovablePropertyRecordedInPublicRegisters")
    protected AmountType movablePropertyRecordedInPublicRegisters;
    @XmlElement(name = "PlantEquipment")
    protected AmountType plantEquipment;
    @XmlElement(name = "Buildings")
    protected AmountType buildings;
    @XmlElement(name = "FixturesEquipment")
    protected AmountType fixturesEquipment;
    @XmlElement(name = "FixedAssetDepreciation")
    protected AmountType fixedAssetDepreciation;
    @XmlElement(name = "DeferredAsset")
    protected AmountType deferredAsset;
    @XmlElement(name = "IntangibleAssetDepreciation")
    protected AmountType intangibleAssetDepreciation;
    @XmlElement(name = "BuildingsGross")
    protected AmountType buildingsGross;
    @XmlElement(name = "ReceivablesFromSubscriptions")
    protected AmountType receivablesFromSubscriptions;
    @XmlElement(name = "AmortisationCosts")
    protected AmountType amortisationCosts;
    @XmlElement(name = "Land")
    protected AmountType land;
    @XmlElement(name = "BuildingsNet")
    protected AmountType buildingsNet;
    @XmlElement(name = "MachinesMechanicalPlants")
    protected AmountType machinesMechanicalPlants;
    @XmlElement(name = "Provisions")
    protected AmountType provisions;
    @XmlElement(name = "DepreciationAmortisation")
    protected AmountType depreciationAmortisation;
    @XmlElement(name = "StartUpExpansionExpenses")
    protected AmountType startUpExpansionExpenses;
    @XmlElement(name = "FranchisesLicensesSimilarRights")
    protected AmountType franchisesLicensesSimilarRights;
    @XmlElement(name = "PropertyEquivalentRights")
    protected AmountType propertyEquivalentRights;
    @XmlElement(name = "PropertyWithCommercialIndustrialBuildings")
    protected AmountType propertyWithCommercialIndustrialBuildings;
    @XmlElement(name = "PropertyWithResidentialBuildings")
    protected AmountType propertyWithResidentialBuildings;
    @XmlElement(name = "LandWithoutBuildings")
    protected AmountType landWithoutBuildings;
    @XmlElement(name = "PropertyWithHereditaryBuildingRightsThirdParties")
    protected AmountType propertyWithHereditaryBuildingRightsThirdParties;
    @XmlElement(name = "BuildingsOnOthersRealProperty")
    protected AmountType buildingsOnOthersRealProperty;
    @XmlElement(name = "RealPropertyWithRailwaysSpecificRailwayBuildings")
    protected AmountType realPropertyWithRailwaysSpecificRailwayBuildings;
    @XmlElement(name = "Others")
    protected AmountType others;
    @XmlElement(name = "MiningsDrillingsEtc")
    protected AmountType miningsDrillingsEtc;
    @XmlElement(name = "TransportationMeans")
    protected AmountType transportationMeans;
    @XmlElement(name = "TanksPipelines")
    protected AmountType tanksPipelines;
    @XmlElement(name = "MotorVehicles")
    protected AmountType motorVehicles;
    @XmlElement(name = "ProductionExtractionUtilityPlants")
    protected AmountType productionExtractionUtilityPlants;
    @XmlElement(name = "RegulationStoringPlants")
    protected AmountType regulationStoringPlants;
    @XmlElement(name = "SupplyPlants")
    protected AmountType supplyPlants;
    @XmlElement(name = "Power")
    protected AmountType power;
    @XmlElement(name = "NaturalGas")
    protected AmountType naturalGas;
    @XmlElement(name = "Heat")
    protected AmountType heat;
    @XmlElement(name = "PowerGenerationSupplyPlants")
    protected AmountType powerGenerationSupplyPlants;
    @XmlElement(name = "RailsRoutingEquipmentSecurityPlants")
    protected AmountType railsRoutingEquipmentSecurityPlants;
    @XmlElement(name = "VehiclesForPassengerMerchandiseRailTraffic")
    protected AmountType vehiclesForPassengerMerchandiseRailTraffic;
    @XmlElement(name = "TechnicalPlantsOperatingDevices")
    protected AmountType technicalPlantsOperatingDevices;
    @XmlElement(name = "FixturesFittingsOtherEquipment")
    protected AmountType fixturesFittingsOtherEquipment;
    @XmlElement(name = "PreparatoryCostForConstruction")
    protected AmountType preparatoryCostForConstruction;
    @XmlElement(name = "AdvancePaymentsConstructioninProgress")
    protected AmountType advancePaymentsConstructioninProgress;
    @XmlElement(name = "LeasingAssets")
    protected AmountType leasingAssets;
    @XmlElement(name = "LeasingDueAfterOneYear")
    protected AmountType leasingDueAfterOneYear;
    @XmlElement(name = "SalesRealPropertyDueAfterOneYear")
    protected AmountType salesRealPropertyDueAfterOneYear;
    @XmlElement(name = "TradeDueAfterOneYear")
    protected AmountType tradeDueAfterOneYear;
    @XmlElement(name = "HospitalHealthCareFoundationDueOneYear")
    protected AmountType hospitalHealthCareFoundationDueOneYear;
    @XmlElement(name = "UnderHospitalFinancingLawDue1Year")
    protected AmountType underHospitalFinancingLawDue1Year;
    @XmlElement(name = "GovernmentalAidDueAfterOneYear")
    protected AmountType governmentalAidDueAfterOneYear;
    @XmlElement(name = "NonGovernmentalAidDueAfterOneYear")
    protected AmountType nonGovernmentalAidDueAfterOneYear;
    @XmlElement(name = "OtherCompaniesDueAfterOneYear")
    protected AmountType otherCompaniesDueAfterOneYear;
    @XmlElement(name = "JointVenturesDueAfterOneYear")
    protected AmountType jointVenturesDueAfterOneYear;
    @XmlElement(name = "ShareholdersDueAfterOneYear")
    protected AmountType shareholdersDueAfterOneYear;
    @XmlElement(name = "AffiliatedCompaniesDueAfterOneYear")
    protected AmountType affiliatedCompaniesDueAfterOneYear;
    @XmlElement(name = "OtherAssetsDueAfterOneYear")
    protected AmountType otherAssetsDueAfterOneYear;
    @XmlElement(name = "AccountsReceivableOtherAssetsDueAfterOneYear")
    protected AmountType accountsReceivableOtherAssetsDueAfterOneYear;
    @XmlElement(name = "InvestmentsLongTerm")
    protected AmountType investmentsLongTerm;
    @XmlElement(name = "RealEstate")
    protected AmountType realEstate;
    @XmlElement(name = "InvestmentsinAffiliatedCompaniesAssociatedCompanies")
    protected AmountType investmentsinAffiliatedCompaniesAssociatedCompanies;
    @XmlElement(name = "SharesInAssociatedCompanies")
    protected AmountType sharesInAssociatedCompanies;
    @XmlElement(name = "EquityInterests")
    protected AmountType equityInterests;
    @XmlElement(name = "EquityInterestsInAssociatedCompanies")
    protected AmountType equityInterestsInAssociatedCompanies;
    @XmlElement(name = "OtherEquityInterests")
    protected AmountType otherEquityInterests;
    @XmlElement(name = "OtherInvestments")
    protected AmountType otherInvestments;
    @XmlElement(name = "Assetsinprogressandadvances")
    protected AmountType assetsinprogressandadvances;
    @XmlElement(name = "InvestmentsInGroupOtherCompanies")
    protected AmountType investmentsInGroupOtherCompanies;
    @XmlElement(name = "InvestmentsInGroupOtherCompaniesSharesQuotas")
    protected AmountType investmentsInGroupOtherCompaniesSharesQuotas;
    @XmlElement(name = "InvestmentsInGroupOtherCompaniesHoldingCompanies")
    protected AmountType investmentsInGroupOtherCompaniesHoldingCompanies;
    @XmlElement(name = "InvestmentsInSubsidiaryCompanies")
    protected AmountType investmentsInSubsidiaryCompanies;
    @XmlElement(name = "InvestmentsInAssociatedCompanies")
    protected AmountType investmentsInAssociatedCompanies;
    @XmlElement(name = "InvestmentsInAffiliatedCompanies")
    protected AmountType investmentsInAffiliatedCompanies;
    @XmlElement(name = "InvestmentsInGroupOtherCompaniesOtherCompanies")
    protected AmountType investmentsInGroupOtherCompaniesOtherCompanies;
    @XmlElement(name = "InvestmentsInGroupOtherCompaniesBondsIssued")
    protected AmountType investmentsInGroupOtherCompaniesBondsIssued;
    @XmlElement(name = "InvestmentsBondsIssuedbyHoldingCompanies")
    protected AmountType investmentsBondsIssuedbyHoldingCompanies;
    @XmlElement(name = "InvestmentsBondsIssuedbySubsidiaryCompanies")
    protected AmountType investmentsBondsIssuedbySubsidiaryCompanies;
    @XmlElement(name = "InvestmentsBondsIssuedbyAssociatedCompanies")
    protected AmountType investmentsBondsIssuedbyAssociatedCompanies;
    @XmlElement(name = "InvestmentsBondsIssuedbyAffiliatedCompanies")
    protected AmountType investmentsBondsIssuedbyAffiliatedCompanies;
    @XmlElement(name = "InvestmentsBondsIssuedbyOtherCompanies")
    protected AmountType investmentsBondsIssuedbyOtherCompanies;
    @XmlElement(name = "LoansToCompanies")
    protected AmountType loansToCompanies;
    @XmlElement(name = "LoansToHoldingCompanies")
    protected AmountType loansToHoldingCompanies;
    @XmlElement(name = "LoansToSubsidiaryCompanies")
    protected AmountType loansToSubsidiaryCompanies;
    @XmlElement(name = "LoansToAssociatedCompanies")
    protected AmountType loansToAssociatedCompanies;
    @XmlElement(name = "LoansToAffiliatedCompanies")
    protected AmountType loansToAffiliatedCompanies;
    @XmlElement(name = "LoansToOtherCompanies")
    protected AmountType loansToOtherCompanies;
    @XmlElement(name = "OtherFinancialInvestments")
    protected AmountType otherFinancialInvestments;
    @XmlElement(name = "OtherFinancialInvestmentsSharesQuotas")
    protected AmountType otherFinancialInvestmentsSharesQuotas;
    @XmlElement(name = "OtherFinancialInvestmentsQuotedShares")
    protected AmountType otherFinancialInvestmentsQuotedShares;
    @XmlElement(name = "OtherFinancialInvestmentsUnquotedShares")
    protected AmountType otherFinancialInvestmentsUnquotedShares;
    @XmlElement(name = "OtherFinancialInvestmentsQuotas")
    protected AmountType otherFinancialInvestmentsQuotas;
    @XmlElement(name = "OtherFinancialInvestmentsBondsFixedSecurities")
    protected AmountType otherFinancialInvestmentsBondsFixedSecurities;
    @XmlElement(name = "OtherFinancialInvestmentsQuoted")
    protected AmountType otherFinancialInvestmentsQuoted;
    @XmlElement(name = "OtherFinancialInvestmentsUnquoted")
    protected AmountType otherFinancialInvestmentsUnquoted;
    @XmlElement(name = "OtherFinancialInvestmentsConvertibleBonds")
    protected AmountType otherFinancialInvestmentsConvertibleBonds;
    @XmlElement(name = "OtherFinancialInvestmentsLoans")
    protected AmountType otherFinancialInvestmentsLoans;
    @XmlElement(name = "OtherFinancialInvestmentsCollateralLoans")
    protected AmountType otherFinancialInvestmentsCollateralLoans;
    @XmlElement(name = "OtherFinancialInvestmentsPolicyLoans")
    protected AmountType otherFinancialInvestmentsPolicyLoans;
    @XmlElement(name = "OtherFinancialInvestmentsOtherLoans")
    protected AmountType otherFinancialInvestmentsOtherLoans;
    @XmlElement(name = "OtherFinancialInvestmentsQuotasInMutualFunds")
    protected AmountType otherFinancialInvestmentsQuotasInMutualFunds;
    @XmlElement(name = "OtherFinancialInvestmentsDepositsCreditInstitutions")
    protected AmountType otherFinancialInvestmentsDepositsCreditInstitutions;
    @XmlElement(name = "OtherFinancialInvestmentsSundryFinancialInvestments")
    protected AmountType otherFinancialInvestmentsSundryFinancialInvestments;
    @XmlElement(name = "DepositsWithCedingCompanies")
    protected AmountType depositsWithCedingCompanies;
    @XmlElement(name = "InvestInLifeInsurFromPensionFundManagement")
    protected AmountType investInLifeInsurFromPensionFundManagement;
    @XmlElement(name = "InvestLinkedToInvestFundsMarketIndexes")
    protected AmountType investLinkedToInvestFundsMarketIndexes;
    @XmlElement(name = "InvestDerivingFromPensionFundManagement")
    protected AmountType investDerivingFromPensionFundManagement;
    @XmlElement(name = "DbisTechnicalReservesChargedToReinsurers")
    protected AmountType dbisTechnicalReservesChargedToReinsurers;
    @XmlElement(name = "NonLifeInsurance")
    protected AmountType nonLifeInsurance;
    @XmlElement(name = "NonLifeInsurancePremiumReserve")
    protected AmountType nonLifeInsurancePremiumReserve;
    @XmlElement(name = "NonLifeInsuranceClaimsReserve")
    protected AmountType nonLifeInsuranceClaimsReserve;
    @XmlElement(name = "NonLifeInsuranceReserveForProfitSharingRefunds")
    protected AmountType nonLifeInsuranceReserveForProfitSharingRefunds;
    @XmlElement(name = "NonLifeInsuranceOtherTechnicalReserves")
    protected AmountType nonLifeInsuranceOtherTechnicalReserves;
    @XmlElement(name = "LifeInsurance")
    protected AmountType lifeInsurance;
    @XmlElement(name = "LifeInsuranceActuarialReserves")
    protected AmountType lifeInsuranceActuarialReserves;
    @XmlElement(name = "LifeInsurancePremiumReserveForComplementaryInsurance")
    protected AmountType lifeInsurancePremiumReserveForComplementaryInsurance;
    @XmlElement(name = "LifeInsuranceReserveForAmountsToBePaid")
    protected AmountType lifeInsuranceReserveForAmountsToBePaid;
    @XmlElement(name = "LifeInsuranceReserveForProfitSharingRefunds")
    protected AmountType lifeInsuranceReserveForProfitSharingRefunds;
    @XmlElement(name = "LifeInsuranceOtherTechnicalReserves")
    protected AmountType lifeInsuranceOtherTechnicalReserves;
    @XmlElement(name = "LifeInsuranceTechnicalReserveForInsPensionFund")
    protected AmountType lifeInsuranceTechnicalReserveForInsPensionFund;
    @XmlElement(name = "TangibleAssetsStocks")
    protected AmountType tangibleAssetsStocks;
    @XmlElement(name = "CompanysOwnSharesOrQuotas")
    protected AmountType companysOwnSharesOrQuotas;
    @XmlElement(name = "EquityInvestments")
    protected AmountType equityInvestments;
    @XmlElement(name = "GroupCmpanies")
    protected AmountType groupCmpanies;
    @XmlElement(name = "AmountsOwedByAssoAffiliatedCoS")
    protected AmountType amountsOwedByAssoAffiliatedCoS;
    @XmlElement(name = "IncludingEquityInvestments")
    protected AmountType includingEquityInvestments;
    @XmlElement(name = "InternallyGeneratedIntangibleAssets")
    protected AmountType internallyGeneratedIntangibleAssets;
    @XmlElement(name = "ResearchDevelopmentExpenses")
    protected AmountType researchDevelopmentExpenses;
    @XmlElement(name = "ConcessionsPatentsLicensesTrademarksAndSimilarrights")
    protected AmountType concessionsPatentsLicensesTrademarksAndSimilarrights;
    @XmlElement(name = "ConcessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration")
    protected AmountType concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration;
    @XmlElement(name = "IntangibleFixedAssetsUnderConstruction")
    protected AmountType intangibleFixedAssetsUnderConstruction;
    @XmlElement(name = "LoansAndClaimsAsFixedAssets")
    protected AmountType loansAndClaimsAsFixedAssets;

    /**
     * Gets the value of the goodwill property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGoodwill() {
        return goodwill;
    }

    /**
     * Sets the value of the goodwill property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGoodwill(AmountType value) {
        this.goodwill = value;
    }

    /**
     * Gets the value of the patents property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPatents() {
        return patents;
    }

    /**
     * Sets the value of the patents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPatents(AmountType value) {
        this.patents = value;
    }

    /**
     * Gets the value of the otherIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherIntangibleAssets() {
        return otherIntangibleAssets;
    }

    /**
     * Sets the value of the otherIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherIntangibleAssets(AmountType value) {
        this.otherIntangibleAssets = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntangibleAssets(AmountType value) {
        this.intangibleAssets = value;
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
     * Gets the value of the plantMachineryEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryEquipment() {
        return plantMachineryEquipment;
    }

    /**
     * Sets the value of the plantMachineryEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryEquipment(AmountType value) {
        this.plantMachineryEquipment = value;
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
     * Gets the value of the longTermInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongTermInvestments() {
        return longTermInvestments;
    }

    /**
     * Sets the value of the longTermInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongTermInvestments(AmountType value) {
        this.longTermInvestments = value;
    }

    /**
     * Gets the value of the otherLongTermInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherLongTermInvestments() {
        return otherLongTermInvestments;
    }

    /**
     * Sets the value of the otherLongTermInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherLongTermInvestments(AmountType value) {
        this.otherLongTermInvestments = value;
    }

    /**
     * Gets the value of the totalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalFixedAssets() {
        return totalFixedAssets;
    }

    /**
     * Sets the value of the totalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalFixedAssets(AmountType value) {
        this.totalFixedAssets = value;
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
     * Gets the value of the formationExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFormationExpenses() {
        return formationExpenses;
    }

    /**
     * Sets the value of the formationExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFormationExpenses(AmountType value) {
        this.formationExpenses = value;
    }

    /**
     * Gets the value of the intangibles property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntangibles() {
        return intangibles;
    }

    /**
     * Sets the value of the intangibles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntangibles(AmountType value) {
        this.intangibles = value;
    }

    /**
     * Gets the value of the furnitureVehiclesNet property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureVehiclesNet() {
        return furnitureVehiclesNet;
    }

    /**
     * Sets the value of the furnitureVehiclesNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureVehiclesNet(AmountType value) {
        this.furnitureVehiclesNet = value;
    }

    /**
     * Gets the value of the leasingOtherSimilarRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLeasingOtherSimilarRights() {
        return leasingOtherSimilarRights;
    }

    /**
     * Sets the value of the leasingOtherSimilarRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLeasingOtherSimilarRights(AmountType value) {
        this.leasingOtherSimilarRights = value;
    }

    /**
     * Gets the value of the otherTangibleAssetsNet property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTangibleAssetsNet() {
        return otherTangibleAssetsNet;
    }

    /**
     * Sets the value of the otherTangibleAssetsNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTangibleAssetsNet(AmountType value) {
        this.otherTangibleAssetsNet = value;
    }

    /**
     * Gets the value of the paymentsOnAccountAssetsinCourseConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentsOnAccountAssetsinCourseConstruction() {
        return paymentsOnAccountAssetsinCourseConstruction;
    }

    /**
     * Sets the value of the paymentsOnAccountAssetsinCourseConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentsOnAccountAssetsinCourseConstruction(AmountType value) {
        this.paymentsOnAccountAssetsinCourseConstruction = value;
    }

    /**
     * Gets the value of the sharesLoansinGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesLoansinGroupCompanies() {
        return sharesLoansinGroupCompanies;
    }

    /**
     * Sets the value of the sharesLoansinGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesLoansinGroupCompanies(AmountType value) {
        this.sharesLoansinGroupCompanies = value;
    }

    /**
     * Gets the value of the sharesinGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesinGroupCompanies() {
        return sharesinGroupCompanies;
    }

    /**
     * Sets the value of the sharesinGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesinGroupCompanies(AmountType value) {
        this.sharesinGroupCompanies = value;
    }

    /**
     * Gets the value of the loansToGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToGroupCompanies() {
        return loansToGroupCompanies;
    }

    /**
     * Sets the value of the loansToGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToGroupCompanies(AmountType value) {
        this.loansToGroupCompanies = value;
    }

    /**
     * Gets the value of the sharesLoansinNonGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesLoansinNonGroupCompanies() {
        return sharesLoansinNonGroupCompanies;
    }

    /**
     * Sets the value of the sharesLoansinNonGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesLoansinNonGroupCompanies(AmountType value) {
        this.sharesLoansinNonGroupCompanies = value;
    }

    /**
     * Gets the value of the participatingInterest property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getParticipatingInterest() {
        return participatingInterest;
    }

    /**
     * Sets the value of the participatingInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setParticipatingInterest(AmountType value) {
        this.participatingInterest = value;
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
     * Gets the value of the otherFinancialAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialAssets() {
        return otherFinancialAssets;
    }

    /**
     * Sets the value of the otherFinancialAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialAssets(AmountType value) {
        this.otherFinancialAssets = value;
    }

    /**
     * Gets the value of the shares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShares() {
        return shares;
    }

    /**
     * Sets the value of the shares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShares(AmountType value) {
        this.shares = value;
    }

    /**
     * Gets the value of the otherInvestmentsExcludingLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherInvestmentsExcludingLoans() {
        return otherInvestmentsExcludingLoans;
    }

    /**
     * Sets the value of the otherInvestmentsExcludingLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherInvestmentsExcludingLoans(AmountType value) {
        this.otherInvestmentsExcludingLoans = value;
    }

    /**
     * Gets the value of the participationsinAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getParticipationsinAffiliates() {
        return participationsinAffiliates;
    }

    /**
     * Sets the value of the participationsinAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setParticipationsinAffiliates(AmountType value) {
        this.participationsinAffiliates = value;
    }

    /**
     * Gets the value of the participationsNonAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getParticipationsNonAffiliates() {
        return participationsNonAffiliates;
    }

    /**
     * Sets the value of the participationsNonAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setParticipationsNonAffiliates(AmountType value) {
        this.participationsNonAffiliates = value;
    }

    /**
     * Gets the value of the otherSharesPartFinancialFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherSharesPartFinancialFixedAssets() {
        return otherSharesPartFinancialFixedAssets;
    }

    /**
     * Sets the value of the otherSharesPartFinancialFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherSharesPartFinancialFixedAssets(AmountType value) {
        this.otherSharesPartFinancialFixedAssets = value;
    }

    /**
     * Gets the value of the deferredReceivablesFromAffiliates property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredReceivablesFromAffiliates() {
        return deferredReceivablesFromAffiliates;
    }

    /**
     * Sets the value of the deferredReceivablesFromAffiliates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredReceivablesFromAffiliates(AmountType value) {
        this.deferredReceivablesFromAffiliates = value;
    }

    /**
     * Gets the value of the formationCostsIntangiblesAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFormationCostsIntangiblesAssets() {
        return formationCostsIntangiblesAssets;
    }

    /**
     * Sets the value of the formationCostsIntangiblesAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFormationCostsIntangiblesAssets(AmountType value) {
        this.formationCostsIntangiblesAssets = value;
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
     * Gets the value of the tangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTangibleAssets() {
        return tangibleAssets;
    }

    /**
     * Sets the value of the tangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTangibleAssets(AmountType value) {
        this.tangibleAssets = value;
    }

    /**
     * Gets the value of the businessPremises property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBusinessPremises() {
        return businessPremises;
    }

    /**
     * Sets the value of the businessPremises property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBusinessPremises(AmountType value) {
        this.businessPremises = value;
    }

    /**
     * Gets the value of the plantMachineryElectronicalEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryElectronicalEquipment() {
        return plantMachineryElectronicalEquipment;
    }

    /**
     * Sets the value of the plantMachineryElectronicalEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryElectronicalEquipment(AmountType value) {
        this.plantMachineryElectronicalEquipment = value;
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
     * Gets the value of the buildingsinConstructionAdvancesOnFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuildingsinConstructionAdvancesOnFixedAssets() {
        return buildingsinConstructionAdvancesOnFixedAssets;
    }

    /**
     * Sets the value of the buildingsinConstructionAdvancesOnFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuildingsinConstructionAdvancesOnFixedAssets(AmountType value) {
        this.buildingsinConstructionAdvancesOnFixedAssets = value;
    }

    /**
     * Gets the value of the longLeaseLeasingSimilarRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLongLeaseLeasingSimilarRights() {
        return longLeaseLeasingSimilarRights;
    }

    /**
     * Sets the value of the longLeaseLeasingSimilarRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLongLeaseLeasingSimilarRights(AmountType value) {
        this.longLeaseLeasingSimilarRights = value;
    }

    /**
     * Gets the value of the otherTangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTangibleAssets() {
        return otherTangibleAssets;
    }

    /**
     * Sets the value of the otherTangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTangibleAssets(AmountType value) {
        this.otherTangibleAssets = value;
    }

    /**
     * Gets the value of the affiliatedEnterprises property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAffiliatedEnterprises() {
        return affiliatedEnterprises;
    }

    /**
     * Sets the value of the affiliatedEnterprises property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAffiliatedEnterprises(AmountType value) {
        this.affiliatedEnterprises = value;
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
     * Gets the value of the otherEnterprisesLinkedbyParticipatingInterests property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherEnterprisesLinkedbyParticipatingInterests() {
        return otherEnterprisesLinkedbyParticipatingInterests;
    }

    /**
     * Sets the value of the otherEnterprisesLinkedbyParticipatingInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherEnterprisesLinkedbyParticipatingInterests(AmountType value) {
        this.otherEnterprisesLinkedbyParticipatingInterests = value;
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
     * Gets the value of the amountsRecCashGuarantee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsRecCashGuarantee() {
        return amountsRecCashGuarantee;
    }

    /**
     * Sets the value of the amountsRecCashGuarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsRecCashGuarantee(AmountType value) {
        this.amountsRecCashGuarantee = value;
    }

    /**
     * Gets the value of the researchDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResearchDevelopment() {
        return researchDevelopment;
    }

    /**
     * Sets the value of the researchDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResearchDevelopment(AmountType value) {
        this.researchDevelopment = value;
    }

    /**
     * Gets the value of the otherIntangibleAssetsNet property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherIntangibleAssetsNet() {
        return otherIntangibleAssetsNet;
    }

    /**
     * Sets the value of the otherIntangibleAssetsNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherIntangibleAssetsNet(AmountType value) {
        this.otherIntangibleAssetsNet = value;
    }

    /**
     * Gets the value of the otherFixedOperatingAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFixedOperatingAssets() {
        return otherFixedOperatingAssets;
    }

    /**
     * Sets the value of the otherFixedOperatingAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFixedOperatingAssets(AmountType value) {
        this.otherFixedOperatingAssets = value;
    }

    /**
     * Gets the value of the nonOperationalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonOperationalFixedAssets() {
        return nonOperationalFixedAssets;
    }

    /**
     * Sets the value of the nonOperationalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonOperationalFixedAssets(AmountType value) {
        this.nonOperationalFixedAssets = value;
    }

    /**
     * Gets the value of the otherFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFixedAssets() {
        return otherFixedAssets;
    }

    /**
     * Sets the value of the otherFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFixedAssets(AmountType value) {
        this.otherFixedAssets = value;
    }

    /**
     * Gets the value of the groupCompaniesParticipations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroupCompaniesParticipations() {
        return groupCompaniesParticipations;
    }

    /**
     * Sets the value of the groupCompaniesParticipations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroupCompaniesParticipations(AmountType value) {
        this.groupCompaniesParticipations = value;
    }

    /**
     * Gets the value of the calledUpCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCalledUpCapital() {
        return calledUpCapital;
    }

    /**
     * Sets the value of the calledUpCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCalledUpCapital(AmountType value) {
        this.calledUpCapital = value;
    }

    /**
     * Gets the value of the acquisitionCommissionsToBeAmortised property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcquisitionCommissionsToBeAmortised() {
        return acquisitionCommissionsToBeAmortised;
    }

    /**
     * Sets the value of the acquisitionCommissionsToBeAmortised property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcquisitionCommissionsToBeAmortised(AmountType value) {
        this.acquisitionCommissionsToBeAmortised = value;
    }

    /**
     * Gets the value of the amortisedLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmortisedLifeInsurance() {
        return amortisedLifeInsurance;
    }

    /**
     * Sets the value of the amortisedLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmortisedLifeInsurance(AmountType value) {
        this.amortisedLifeInsurance = value;
    }

    /**
     * Gets the value of the amortisedNonLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmortisedNonLifeInsurance() {
        return amortisedNonLifeInsurance;
    }

    /**
     * Sets the value of the amortisedNonLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmortisedNonLifeInsurance(AmountType value) {
        this.amortisedNonLifeInsurance = value;
    }

    /**
     * Gets the value of the otherAcquisitionExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAcquisitionExpenses() {
        return otherAcquisitionExpenses;
    }

    /**
     * Sets the value of the otherAcquisitionExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAcquisitionExpenses(AmountType value) {
        this.otherAcquisitionExpenses = value;
    }

    /**
     * Gets the value of the otherDeferredCharges property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDeferredCharges() {
        return otherDeferredCharges;
    }

    /**
     * Sets the value of the otherDeferredCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDeferredCharges(AmountType value) {
        this.otherDeferredCharges = value;
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
     * Gets the value of the landAndBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandAndBuildings() {
        return landAndBuildings;
    }

    /**
     * Sets the value of the landAndBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandAndBuildings(AmountType value) {
        this.landAndBuildings = value;
    }

    /**
     * Gets the value of the realEstateForBusinessActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealEstateForBusinessActivities() {
        return realEstateForBusinessActivities;
    }

    /**
     * Sets the value of the realEstateForBusinessActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealEstateForBusinessActivities(AmountType value) {
        this.realEstateForBusinessActivities = value;
    }

    /**
     * Gets the value of the realEstateForThirdParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealEstateForThirdParties() {
        return realEstateForThirdParties;
    }

    /**
     * Sets the value of the realEstateForThirdParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealEstateForThirdParties(AmountType value) {
        this.realEstateForThirdParties = value;
    }

    /**
     * Gets the value of the otherRealEstateAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherRealEstateAssets() {
        return otherRealEstateAssets;
    }

    /**
     * Sets the value of the otherRealEstateAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherRealEstateAssets(AmountType value) {
        this.otherRealEstateAssets = value;
    }

    /**
     * Gets the value of the otherPropertyRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherPropertyRights() {
        return otherPropertyRights;
    }

    /**
     * Sets the value of the otherPropertyRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherPropertyRights(AmountType value) {
        this.otherPropertyRights = value;
    }

    /**
     * Gets the value of the furnitureOfficeMachineryInternalMeansOfTransport property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFurnitureOfficeMachineryInternalMeansOfTransport() {
        return furnitureOfficeMachineryInternalMeansOfTransport;
    }

    /**
     * Sets the value of the furnitureOfficeMachineryInternalMeansOfTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFurnitureOfficeMachineryInternalMeansOfTransport(AmountType value) {
        this.furnitureOfficeMachineryInternalMeansOfTransport = value;
    }

    /**
     * Gets the value of the movablePropertyRecordedInPublicRegisters property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMovablePropertyRecordedInPublicRegisters() {
        return movablePropertyRecordedInPublicRegisters;
    }

    /**
     * Sets the value of the movablePropertyRecordedInPublicRegisters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMovablePropertyRecordedInPublicRegisters(AmountType value) {
        this.movablePropertyRecordedInPublicRegisters = value;
    }

    /**
     * Gets the value of the plantEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantEquipment() {
        return plantEquipment;
    }

    /**
     * Sets the value of the plantEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantEquipment(AmountType value) {
        this.plantEquipment = value;
    }

    /**
     * Gets the value of the buildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuildings() {
        return buildings;
    }

    /**
     * Sets the value of the buildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuildings(AmountType value) {
        this.buildings = value;
    }

    /**
     * Gets the value of the fixturesEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixturesEquipment() {
        return fixturesEquipment;
    }

    /**
     * Sets the value of the fixturesEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixturesEquipment(AmountType value) {
        this.fixturesEquipment = value;
    }

    /**
     * Gets the value of the fixedAssetDepreciation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixedAssetDepreciation() {
        return fixedAssetDepreciation;
    }

    /**
     * Sets the value of the fixedAssetDepreciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixedAssetDepreciation(AmountType value) {
        this.fixedAssetDepreciation = value;
    }

    /**
     * Gets the value of the deferredAsset property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDeferredAsset() {
        return deferredAsset;
    }

    /**
     * Sets the value of the deferredAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDeferredAsset(AmountType value) {
        this.deferredAsset = value;
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
     * Gets the value of the buildingsGross property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuildingsGross() {
        return buildingsGross;
    }

    /**
     * Sets the value of the buildingsGross property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuildingsGross(AmountType value) {
        this.buildingsGross = value;
    }

    /**
     * Gets the value of the receivablesFromSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromSubscriptions() {
        return receivablesFromSubscriptions;
    }

    /**
     * Sets the value of the receivablesFromSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromSubscriptions(AmountType value) {
        this.receivablesFromSubscriptions = value;
    }

    /**
     * Gets the value of the amortisationCosts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmortisationCosts() {
        return amortisationCosts;
    }

    /**
     * Sets the value of the amortisationCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmortisationCosts(AmountType value) {
        this.amortisationCosts = value;
    }

    /**
     * Gets the value of the land property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLand() {
        return land;
    }

    /**
     * Sets the value of the land property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLand(AmountType value) {
        this.land = value;
    }

    /**
     * Gets the value of the buildingsNet property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuildingsNet() {
        return buildingsNet;
    }

    /**
     * Sets the value of the buildingsNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuildingsNet(AmountType value) {
        this.buildingsNet = value;
    }

    /**
     * Gets the value of the machinesMechanicalPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMachinesMechanicalPlants() {
        return machinesMechanicalPlants;
    }

    /**
     * Sets the value of the machinesMechanicalPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMachinesMechanicalPlants(AmountType value) {
        this.machinesMechanicalPlants = value;
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

    /**
     * Gets the value of the depreciationAmortisation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDepreciationAmortisation() {
        return depreciationAmortisation;
    }

    /**
     * Sets the value of the depreciationAmortisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDepreciationAmortisation(AmountType value) {
        this.depreciationAmortisation = value;
    }

    /**
     * Gets the value of the startUpExpansionExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStartUpExpansionExpenses() {
        return startUpExpansionExpenses;
    }

    /**
     * Sets the value of the startUpExpansionExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStartUpExpansionExpenses(AmountType value) {
        this.startUpExpansionExpenses = value;
    }

    /**
     * Gets the value of the franchisesLicensesSimilarRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFranchisesLicensesSimilarRights() {
        return franchisesLicensesSimilarRights;
    }

    /**
     * Sets the value of the franchisesLicensesSimilarRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFranchisesLicensesSimilarRights(AmountType value) {
        this.franchisesLicensesSimilarRights = value;
    }

    /**
     * Gets the value of the propertyEquivalentRights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyEquivalentRights() {
        return propertyEquivalentRights;
    }

    /**
     * Sets the value of the propertyEquivalentRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyEquivalentRights(AmountType value) {
        this.propertyEquivalentRights = value;
    }

    /**
     * Gets the value of the propertyWithCommercialIndustrialBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyWithCommercialIndustrialBuildings() {
        return propertyWithCommercialIndustrialBuildings;
    }

    /**
     * Sets the value of the propertyWithCommercialIndustrialBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyWithCommercialIndustrialBuildings(AmountType value) {
        this.propertyWithCommercialIndustrialBuildings = value;
    }

    /**
     * Gets the value of the propertyWithResidentialBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyWithResidentialBuildings() {
        return propertyWithResidentialBuildings;
    }

    /**
     * Sets the value of the propertyWithResidentialBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyWithResidentialBuildings(AmountType value) {
        this.propertyWithResidentialBuildings = value;
    }

    /**
     * Gets the value of the landWithoutBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLandWithoutBuildings() {
        return landWithoutBuildings;
    }

    /**
     * Sets the value of the landWithoutBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLandWithoutBuildings(AmountType value) {
        this.landWithoutBuildings = value;
    }

    /**
     * Gets the value of the propertyWithHereditaryBuildingRightsThirdParties property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyWithHereditaryBuildingRightsThirdParties() {
        return propertyWithHereditaryBuildingRightsThirdParties;
    }

    /**
     * Sets the value of the propertyWithHereditaryBuildingRightsThirdParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyWithHereditaryBuildingRightsThirdParties(AmountType value) {
        this.propertyWithHereditaryBuildingRightsThirdParties = value;
    }

    /**
     * Gets the value of the buildingsOnOthersRealProperty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuildingsOnOthersRealProperty() {
        return buildingsOnOthersRealProperty;
    }

    /**
     * Sets the value of the buildingsOnOthersRealProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuildingsOnOthersRealProperty(AmountType value) {
        this.buildingsOnOthersRealProperty = value;
    }

    /**
     * Gets the value of the realPropertyWithRailwaysSpecificRailwayBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRealPropertyWithRailwaysSpecificRailwayBuildings() {
        return realPropertyWithRailwaysSpecificRailwayBuildings;
    }

    /**
     * Sets the value of the realPropertyWithRailwaysSpecificRailwayBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRealPropertyWithRailwaysSpecificRailwayBuildings(AmountType value) {
        this.realPropertyWithRailwaysSpecificRailwayBuildings = value;
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
     * Gets the value of the miningsDrillingsEtc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMiningsDrillingsEtc() {
        return miningsDrillingsEtc;
    }

    /**
     * Sets the value of the miningsDrillingsEtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMiningsDrillingsEtc(AmountType value) {
        this.miningsDrillingsEtc = value;
    }

    /**
     * Gets the value of the transportationMeans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransportationMeans() {
        return transportationMeans;
    }

    /**
     * Sets the value of the transportationMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransportationMeans(AmountType value) {
        this.transportationMeans = value;
    }

    /**
     * Gets the value of the tanksPipelines property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTanksPipelines() {
        return tanksPipelines;
    }

    /**
     * Sets the value of the tanksPipelines property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTanksPipelines(AmountType value) {
        this.tanksPipelines = value;
    }

    /**
     * Gets the value of the motorVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMotorVehicles() {
        return motorVehicles;
    }

    /**
     * Sets the value of the motorVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMotorVehicles(AmountType value) {
        this.motorVehicles = value;
    }

    /**
     * Gets the value of the productionExtractionUtilityPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProductionExtractionUtilityPlants() {
        return productionExtractionUtilityPlants;
    }

    /**
     * Sets the value of the productionExtractionUtilityPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProductionExtractionUtilityPlants(AmountType value) {
        this.productionExtractionUtilityPlants = value;
    }

    /**
     * Gets the value of the regulationStoringPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRegulationStoringPlants() {
        return regulationStoringPlants;
    }

    /**
     * Sets the value of the regulationStoringPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRegulationStoringPlants(AmountType value) {
        this.regulationStoringPlants = value;
    }

    /**
     * Gets the value of the supplyPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSupplyPlants() {
        return supplyPlants;
    }

    /**
     * Sets the value of the supplyPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSupplyPlants(AmountType value) {
        this.supplyPlants = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPower(AmountType value) {
        this.power = value;
    }

    /**
     * Gets the value of the naturalGas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNaturalGas() {
        return naturalGas;
    }

    /**
     * Sets the value of the naturalGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNaturalGas(AmountType value) {
        this.naturalGas = value;
    }

    /**
     * Gets the value of the heat property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHeat() {
        return heat;
    }

    /**
     * Sets the value of the heat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHeat(AmountType value) {
        this.heat = value;
    }

    /**
     * Gets the value of the powerGenerationSupplyPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPowerGenerationSupplyPlants() {
        return powerGenerationSupplyPlants;
    }

    /**
     * Sets the value of the powerGenerationSupplyPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPowerGenerationSupplyPlants(AmountType value) {
        this.powerGenerationSupplyPlants = value;
    }

    /**
     * Gets the value of the railsRoutingEquipmentSecurityPlants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRailsRoutingEquipmentSecurityPlants() {
        return railsRoutingEquipmentSecurityPlants;
    }

    /**
     * Sets the value of the railsRoutingEquipmentSecurityPlants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRailsRoutingEquipmentSecurityPlants(AmountType value) {
        this.railsRoutingEquipmentSecurityPlants = value;
    }

    /**
     * Gets the value of the vehiclesForPassengerMerchandiseRailTraffic property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVehiclesForPassengerMerchandiseRailTraffic() {
        return vehiclesForPassengerMerchandiseRailTraffic;
    }

    /**
     * Sets the value of the vehiclesForPassengerMerchandiseRailTraffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVehiclesForPassengerMerchandiseRailTraffic(AmountType value) {
        this.vehiclesForPassengerMerchandiseRailTraffic = value;
    }

    /**
     * Gets the value of the technicalPlantsOperatingDevices property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalPlantsOperatingDevices() {
        return technicalPlantsOperatingDevices;
    }

    /**
     * Sets the value of the technicalPlantsOperatingDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalPlantsOperatingDevices(AmountType value) {
        this.technicalPlantsOperatingDevices = value;
    }

    /**
     * Gets the value of the fixturesFittingsOtherEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFixturesFittingsOtherEquipment() {
        return fixturesFittingsOtherEquipment;
    }

    /**
     * Sets the value of the fixturesFittingsOtherEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFixturesFittingsOtherEquipment(AmountType value) {
        this.fixturesFittingsOtherEquipment = value;
    }

    /**
     * Gets the value of the preparatoryCostForConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreparatoryCostForConstruction() {
        return preparatoryCostForConstruction;
    }

    /**
     * Sets the value of the preparatoryCostForConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreparatoryCostForConstruction(AmountType value) {
        this.preparatoryCostForConstruction = value;
    }

    /**
     * Gets the value of the advancePaymentsConstructioninProgress property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancePaymentsConstructioninProgress() {
        return advancePaymentsConstructioninProgress;
    }

    /**
     * Sets the value of the advancePaymentsConstructioninProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancePaymentsConstructioninProgress(AmountType value) {
        this.advancePaymentsConstructioninProgress = value;
    }

    /**
     * Gets the value of the leasingAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLeasingAssets() {
        return leasingAssets;
    }

    /**
     * Sets the value of the leasingAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLeasingAssets(AmountType value) {
        this.leasingAssets = value;
    }

    /**
     * Gets the value of the leasingDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLeasingDueAfterOneYear() {
        return leasingDueAfterOneYear;
    }

    /**
     * Sets the value of the leasingDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLeasingDueAfterOneYear(AmountType value) {
        this.leasingDueAfterOneYear = value;
    }

    /**
     * Gets the value of the salesRealPropertyDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSalesRealPropertyDueAfterOneYear() {
        return salesRealPropertyDueAfterOneYear;
    }

    /**
     * Sets the value of the salesRealPropertyDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSalesRealPropertyDueAfterOneYear(AmountType value) {
        this.salesRealPropertyDueAfterOneYear = value;
    }

    /**
     * Gets the value of the tradeDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTradeDueAfterOneYear() {
        return tradeDueAfterOneYear;
    }

    /**
     * Sets the value of the tradeDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTradeDueAfterOneYear(AmountType value) {
        this.tradeDueAfterOneYear = value;
    }

    /**
     * Gets the value of the hospitalHealthCareFoundationDueOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHospitalHealthCareFoundationDueOneYear() {
        return hospitalHealthCareFoundationDueOneYear;
    }

    /**
     * Sets the value of the hospitalHealthCareFoundationDueOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHospitalHealthCareFoundationDueOneYear(AmountType value) {
        this.hospitalHealthCareFoundationDueOneYear = value;
    }

    /**
     * Gets the value of the underHospitalFinancingLawDue1Year property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnderHospitalFinancingLawDue1Year() {
        return underHospitalFinancingLawDue1Year;
    }

    /**
     * Sets the value of the underHospitalFinancingLawDue1Year property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnderHospitalFinancingLawDue1Year(AmountType value) {
        this.underHospitalFinancingLawDue1Year = value;
    }

    /**
     * Gets the value of the governmentalAidDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGovernmentalAidDueAfterOneYear() {
        return governmentalAidDueAfterOneYear;
    }

    /**
     * Sets the value of the governmentalAidDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGovernmentalAidDueAfterOneYear(AmountType value) {
        this.governmentalAidDueAfterOneYear = value;
    }

    /**
     * Gets the value of the nonGovernmentalAidDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonGovernmentalAidDueAfterOneYear() {
        return nonGovernmentalAidDueAfterOneYear;
    }

    /**
     * Sets the value of the nonGovernmentalAidDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonGovernmentalAidDueAfterOneYear(AmountType value) {
        this.nonGovernmentalAidDueAfterOneYear = value;
    }

    /**
     * Gets the value of the otherCompaniesDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCompaniesDueAfterOneYear() {
        return otherCompaniesDueAfterOneYear;
    }

    /**
     * Sets the value of the otherCompaniesDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCompaniesDueAfterOneYear(AmountType value) {
        this.otherCompaniesDueAfterOneYear = value;
    }

    /**
     * Gets the value of the jointVenturesDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getJointVenturesDueAfterOneYear() {
        return jointVenturesDueAfterOneYear;
    }

    /**
     * Sets the value of the jointVenturesDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setJointVenturesDueAfterOneYear(AmountType value) {
        this.jointVenturesDueAfterOneYear = value;
    }

    /**
     * Gets the value of the shareholdersDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareholdersDueAfterOneYear() {
        return shareholdersDueAfterOneYear;
    }

    /**
     * Sets the value of the shareholdersDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareholdersDueAfterOneYear(AmountType value) {
        this.shareholdersDueAfterOneYear = value;
    }

    /**
     * Gets the value of the affiliatedCompaniesDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAffiliatedCompaniesDueAfterOneYear() {
        return affiliatedCompaniesDueAfterOneYear;
    }

    /**
     * Sets the value of the affiliatedCompaniesDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAffiliatedCompaniesDueAfterOneYear(AmountType value) {
        this.affiliatedCompaniesDueAfterOneYear = value;
    }

    /**
     * Gets the value of the otherAssetsDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAssetsDueAfterOneYear() {
        return otherAssetsDueAfterOneYear;
    }

    /**
     * Sets the value of the otherAssetsDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAssetsDueAfterOneYear(AmountType value) {
        this.otherAssetsDueAfterOneYear = value;
    }

    /**
     * Gets the value of the accountsReceivableOtherAssetsDueAfterOneYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsReceivableOtherAssetsDueAfterOneYear() {
        return accountsReceivableOtherAssetsDueAfterOneYear;
    }

    /**
     * Sets the value of the accountsReceivableOtherAssetsDueAfterOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsReceivableOtherAssetsDueAfterOneYear(AmountType value) {
        this.accountsReceivableOtherAssetsDueAfterOneYear = value;
    }

    /**
     * Gets the value of the investmentsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsLongTerm() {
        return investmentsLongTerm;
    }

    /**
     * Sets the value of the investmentsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsLongTerm(AmountType value) {
        this.investmentsLongTerm = value;
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
     * Gets the value of the investmentsinAffiliatedCompaniesAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsinAffiliatedCompaniesAssociatedCompanies() {
        return investmentsinAffiliatedCompaniesAssociatedCompanies;
    }

    /**
     * Sets the value of the investmentsinAffiliatedCompaniesAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsinAffiliatedCompaniesAssociatedCompanies(AmountType value) {
        this.investmentsinAffiliatedCompaniesAssociatedCompanies = value;
    }

    /**
     * Gets the value of the sharesInAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesInAssociatedCompanies() {
        return sharesInAssociatedCompanies;
    }

    /**
     * Sets the value of the sharesInAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesInAssociatedCompanies(AmountType value) {
        this.sharesInAssociatedCompanies = value;
    }

    /**
     * Gets the value of the equityInterests property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquityInterests() {
        return equityInterests;
    }

    /**
     * Sets the value of the equityInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquityInterests(AmountType value) {
        this.equityInterests = value;
    }

    /**
     * Gets the value of the equityInterestsInAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquityInterestsInAssociatedCompanies() {
        return equityInterestsInAssociatedCompanies;
    }

    /**
     * Sets the value of the equityInterestsInAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquityInterestsInAssociatedCompanies(AmountType value) {
        this.equityInterestsInAssociatedCompanies = value;
    }

    /**
     * Gets the value of the otherEquityInterests property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherEquityInterests() {
        return otherEquityInterests;
    }

    /**
     * Sets the value of the otherEquityInterests property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherEquityInterests(AmountType value) {
        this.otherEquityInterests = value;
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
     * Gets the value of the assetsinprogressandadvances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAssetsinprogressandadvances() {
        return assetsinprogressandadvances;
    }

    /**
     * Sets the value of the assetsinprogressandadvances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAssetsinprogressandadvances(AmountType value) {
        this.assetsinprogressandadvances = value;
    }

    /**
     * Gets the value of the investmentsInGroupOtherCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInGroupOtherCompanies() {
        return investmentsInGroupOtherCompanies;
    }

    /**
     * Sets the value of the investmentsInGroupOtherCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInGroupOtherCompanies(AmountType value) {
        this.investmentsInGroupOtherCompanies = value;
    }

    /**
     * Gets the value of the investmentsInGroupOtherCompaniesSharesQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInGroupOtherCompaniesSharesQuotas() {
        return investmentsInGroupOtherCompaniesSharesQuotas;
    }

    /**
     * Sets the value of the investmentsInGroupOtherCompaniesSharesQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInGroupOtherCompaniesSharesQuotas(AmountType value) {
        this.investmentsInGroupOtherCompaniesSharesQuotas = value;
    }

    /**
     * Gets the value of the investmentsInGroupOtherCompaniesHoldingCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInGroupOtherCompaniesHoldingCompanies() {
        return investmentsInGroupOtherCompaniesHoldingCompanies;
    }

    /**
     * Sets the value of the investmentsInGroupOtherCompaniesHoldingCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInGroupOtherCompaniesHoldingCompanies(AmountType value) {
        this.investmentsInGroupOtherCompaniesHoldingCompanies = value;
    }

    /**
     * Gets the value of the investmentsInSubsidiaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInSubsidiaryCompanies() {
        return investmentsInSubsidiaryCompanies;
    }

    /**
     * Sets the value of the investmentsInSubsidiaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInSubsidiaryCompanies(AmountType value) {
        this.investmentsInSubsidiaryCompanies = value;
    }

    /**
     * Gets the value of the investmentsInAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInAssociatedCompanies() {
        return investmentsInAssociatedCompanies;
    }

    /**
     * Sets the value of the investmentsInAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInAssociatedCompanies(AmountType value) {
        this.investmentsInAssociatedCompanies = value;
    }

    /**
     * Gets the value of the investmentsInAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInAffiliatedCompanies() {
        return investmentsInAffiliatedCompanies;
    }

    /**
     * Sets the value of the investmentsInAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInAffiliatedCompanies(AmountType value) {
        this.investmentsInAffiliatedCompanies = value;
    }

    /**
     * Gets the value of the investmentsInGroupOtherCompaniesOtherCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInGroupOtherCompaniesOtherCompanies() {
        return investmentsInGroupOtherCompaniesOtherCompanies;
    }

    /**
     * Sets the value of the investmentsInGroupOtherCompaniesOtherCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInGroupOtherCompaniesOtherCompanies(AmountType value) {
        this.investmentsInGroupOtherCompaniesOtherCompanies = value;
    }

    /**
     * Gets the value of the investmentsInGroupOtherCompaniesBondsIssued property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInGroupOtherCompaniesBondsIssued() {
        return investmentsInGroupOtherCompaniesBondsIssued;
    }

    /**
     * Sets the value of the investmentsInGroupOtherCompaniesBondsIssued property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInGroupOtherCompaniesBondsIssued(AmountType value) {
        this.investmentsInGroupOtherCompaniesBondsIssued = value;
    }

    /**
     * Gets the value of the investmentsBondsIssuedbyHoldingCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBondsIssuedbyHoldingCompanies() {
        return investmentsBondsIssuedbyHoldingCompanies;
    }

    /**
     * Sets the value of the investmentsBondsIssuedbyHoldingCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBondsIssuedbyHoldingCompanies(AmountType value) {
        this.investmentsBondsIssuedbyHoldingCompanies = value;
    }

    /**
     * Gets the value of the investmentsBondsIssuedbySubsidiaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBondsIssuedbySubsidiaryCompanies() {
        return investmentsBondsIssuedbySubsidiaryCompanies;
    }

    /**
     * Sets the value of the investmentsBondsIssuedbySubsidiaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBondsIssuedbySubsidiaryCompanies(AmountType value) {
        this.investmentsBondsIssuedbySubsidiaryCompanies = value;
    }

    /**
     * Gets the value of the investmentsBondsIssuedbyAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBondsIssuedbyAssociatedCompanies() {
        return investmentsBondsIssuedbyAssociatedCompanies;
    }

    /**
     * Sets the value of the investmentsBondsIssuedbyAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBondsIssuedbyAssociatedCompanies(AmountType value) {
        this.investmentsBondsIssuedbyAssociatedCompanies = value;
    }

    /**
     * Gets the value of the investmentsBondsIssuedbyAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBondsIssuedbyAffiliatedCompanies() {
        return investmentsBondsIssuedbyAffiliatedCompanies;
    }

    /**
     * Sets the value of the investmentsBondsIssuedbyAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBondsIssuedbyAffiliatedCompanies(AmountType value) {
        this.investmentsBondsIssuedbyAffiliatedCompanies = value;
    }

    /**
     * Gets the value of the investmentsBondsIssuedbyOtherCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBondsIssuedbyOtherCompanies() {
        return investmentsBondsIssuedbyOtherCompanies;
    }

    /**
     * Sets the value of the investmentsBondsIssuedbyOtherCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBondsIssuedbyOtherCompanies(AmountType value) {
        this.investmentsBondsIssuedbyOtherCompanies = value;
    }

    /**
     * Gets the value of the loansToCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToCompanies() {
        return loansToCompanies;
    }

    /**
     * Sets the value of the loansToCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToCompanies(AmountType value) {
        this.loansToCompanies = value;
    }

    /**
     * Gets the value of the loansToHoldingCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToHoldingCompanies() {
        return loansToHoldingCompanies;
    }

    /**
     * Sets the value of the loansToHoldingCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToHoldingCompanies(AmountType value) {
        this.loansToHoldingCompanies = value;
    }

    /**
     * Gets the value of the loansToSubsidiaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToSubsidiaryCompanies() {
        return loansToSubsidiaryCompanies;
    }

    /**
     * Sets the value of the loansToSubsidiaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToSubsidiaryCompanies(AmountType value) {
        this.loansToSubsidiaryCompanies = value;
    }

    /**
     * Gets the value of the loansToAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToAssociatedCompanies() {
        return loansToAssociatedCompanies;
    }

    /**
     * Sets the value of the loansToAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToAssociatedCompanies(AmountType value) {
        this.loansToAssociatedCompanies = value;
    }

    /**
     * Gets the value of the loansToAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToAffiliatedCompanies() {
        return loansToAffiliatedCompanies;
    }

    /**
     * Sets the value of the loansToAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToAffiliatedCompanies(AmountType value) {
        this.loansToAffiliatedCompanies = value;
    }

    /**
     * Gets the value of the loansToOtherCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansToOtherCompanies() {
        return loansToOtherCompanies;
    }

    /**
     * Sets the value of the loansToOtherCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansToOtherCompanies(AmountType value) {
        this.loansToOtherCompanies = value;
    }

    /**
     * Gets the value of the otherFinancialInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestments() {
        return otherFinancialInvestments;
    }

    /**
     * Sets the value of the otherFinancialInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestments(AmountType value) {
        this.otherFinancialInvestments = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsSharesQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsSharesQuotas() {
        return otherFinancialInvestmentsSharesQuotas;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsSharesQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsSharesQuotas(AmountType value) {
        this.otherFinancialInvestmentsSharesQuotas = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsQuotedShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsQuotedShares() {
        return otherFinancialInvestmentsQuotedShares;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsQuotedShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsQuotedShares(AmountType value) {
        this.otherFinancialInvestmentsQuotedShares = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsUnquotedShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsUnquotedShares() {
        return otherFinancialInvestmentsUnquotedShares;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsUnquotedShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsUnquotedShares(AmountType value) {
        this.otherFinancialInvestmentsUnquotedShares = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsQuotas() {
        return otherFinancialInvestmentsQuotas;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsQuotas(AmountType value) {
        this.otherFinancialInvestmentsQuotas = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsBondsFixedSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsBondsFixedSecurities() {
        return otherFinancialInvestmentsBondsFixedSecurities;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsBondsFixedSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsBondsFixedSecurities(AmountType value) {
        this.otherFinancialInvestmentsBondsFixedSecurities = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsQuoted property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsQuoted() {
        return otherFinancialInvestmentsQuoted;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsQuoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsQuoted(AmountType value) {
        this.otherFinancialInvestmentsQuoted = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsUnquoted property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsUnquoted() {
        return otherFinancialInvestmentsUnquoted;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsUnquoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsUnquoted(AmountType value) {
        this.otherFinancialInvestmentsUnquoted = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsConvertibleBonds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsConvertibleBonds() {
        return otherFinancialInvestmentsConvertibleBonds;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsConvertibleBonds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsConvertibleBonds(AmountType value) {
        this.otherFinancialInvestmentsConvertibleBonds = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsLoans() {
        return otherFinancialInvestmentsLoans;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsLoans(AmountType value) {
        this.otherFinancialInvestmentsLoans = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsCollateralLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsCollateralLoans() {
        return otherFinancialInvestmentsCollateralLoans;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsCollateralLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsCollateralLoans(AmountType value) {
        this.otherFinancialInvestmentsCollateralLoans = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsPolicyLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsPolicyLoans() {
        return otherFinancialInvestmentsPolicyLoans;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsPolicyLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsPolicyLoans(AmountType value) {
        this.otherFinancialInvestmentsPolicyLoans = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsOtherLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsOtherLoans() {
        return otherFinancialInvestmentsOtherLoans;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsOtherLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsOtherLoans(AmountType value) {
        this.otherFinancialInvestmentsOtherLoans = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsQuotasInMutualFunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsQuotasInMutualFunds() {
        return otherFinancialInvestmentsQuotasInMutualFunds;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsQuotasInMutualFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsQuotasInMutualFunds(AmountType value) {
        this.otherFinancialInvestmentsQuotasInMutualFunds = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsDepositsCreditInstitutions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsDepositsCreditInstitutions() {
        return otherFinancialInvestmentsDepositsCreditInstitutions;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsDepositsCreditInstitutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsDepositsCreditInstitutions(AmountType value) {
        this.otherFinancialInvestmentsDepositsCreditInstitutions = value;
    }

    /**
     * Gets the value of the otherFinancialInvestmentsSundryFinancialInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherFinancialInvestmentsSundryFinancialInvestments() {
        return otherFinancialInvestmentsSundryFinancialInvestments;
    }

    /**
     * Sets the value of the otherFinancialInvestmentsSundryFinancialInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherFinancialInvestmentsSundryFinancialInvestments(AmountType value) {
        this.otherFinancialInvestmentsSundryFinancialInvestments = value;
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
     * Gets the value of the investInLifeInsurFromPensionFundManagement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestInLifeInsurFromPensionFundManagement() {
        return investInLifeInsurFromPensionFundManagement;
    }

    /**
     * Sets the value of the investInLifeInsurFromPensionFundManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestInLifeInsurFromPensionFundManagement(AmountType value) {
        this.investInLifeInsurFromPensionFundManagement = value;
    }

    /**
     * Gets the value of the investLinkedToInvestFundsMarketIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestLinkedToInvestFundsMarketIndexes() {
        return investLinkedToInvestFundsMarketIndexes;
    }

    /**
     * Sets the value of the investLinkedToInvestFundsMarketIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestLinkedToInvestFundsMarketIndexes(AmountType value) {
        this.investLinkedToInvestFundsMarketIndexes = value;
    }

    /**
     * Gets the value of the investDerivingFromPensionFundManagement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestDerivingFromPensionFundManagement() {
        return investDerivingFromPensionFundManagement;
    }

    /**
     * Sets the value of the investDerivingFromPensionFundManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestDerivingFromPensionFundManagement(AmountType value) {
        this.investDerivingFromPensionFundManagement = value;
    }

    /**
     * Gets the value of the dbisTechnicalReservesChargedToReinsurers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDbisTechnicalReservesChargedToReinsurers() {
        return dbisTechnicalReservesChargedToReinsurers;
    }

    /**
     * Sets the value of the dbisTechnicalReservesChargedToReinsurers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDbisTechnicalReservesChargedToReinsurers(AmountType value) {
        this.dbisTechnicalReservesChargedToReinsurers = value;
    }

    /**
     * Gets the value of the nonLifeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonLifeInsurance() {
        return nonLifeInsurance;
    }

    /**
     * Sets the value of the nonLifeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonLifeInsurance(AmountType value) {
        this.nonLifeInsurance = value;
    }

    /**
     * Gets the value of the nonLifeInsurancePremiumReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonLifeInsurancePremiumReserve() {
        return nonLifeInsurancePremiumReserve;
    }

    /**
     * Sets the value of the nonLifeInsurancePremiumReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonLifeInsurancePremiumReserve(AmountType value) {
        this.nonLifeInsurancePremiumReserve = value;
    }

    /**
     * Gets the value of the nonLifeInsuranceClaimsReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonLifeInsuranceClaimsReserve() {
        return nonLifeInsuranceClaimsReserve;
    }

    /**
     * Sets the value of the nonLifeInsuranceClaimsReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonLifeInsuranceClaimsReserve(AmountType value) {
        this.nonLifeInsuranceClaimsReserve = value;
    }

    /**
     * Gets the value of the nonLifeInsuranceReserveForProfitSharingRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonLifeInsuranceReserveForProfitSharingRefunds() {
        return nonLifeInsuranceReserveForProfitSharingRefunds;
    }

    /**
     * Sets the value of the nonLifeInsuranceReserveForProfitSharingRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonLifeInsuranceReserveForProfitSharingRefunds(AmountType value) {
        this.nonLifeInsuranceReserveForProfitSharingRefunds = value;
    }

    /**
     * Gets the value of the nonLifeInsuranceOtherTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNonLifeInsuranceOtherTechnicalReserves() {
        return nonLifeInsuranceOtherTechnicalReserves;
    }

    /**
     * Sets the value of the nonLifeInsuranceOtherTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNonLifeInsuranceOtherTechnicalReserves(AmountType value) {
        this.nonLifeInsuranceOtherTechnicalReserves = value;
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
     * Gets the value of the lifeInsuranceActuarialReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceActuarialReserves() {
        return lifeInsuranceActuarialReserves;
    }

    /**
     * Sets the value of the lifeInsuranceActuarialReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceActuarialReserves(AmountType value) {
        this.lifeInsuranceActuarialReserves = value;
    }

    /**
     * Gets the value of the lifeInsurancePremiumReserveForComplementaryInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsurancePremiumReserveForComplementaryInsurance() {
        return lifeInsurancePremiumReserveForComplementaryInsurance;
    }

    /**
     * Sets the value of the lifeInsurancePremiumReserveForComplementaryInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsurancePremiumReserveForComplementaryInsurance(AmountType value) {
        this.lifeInsurancePremiumReserveForComplementaryInsurance = value;
    }

    /**
     * Gets the value of the lifeInsuranceReserveForAmountsToBePaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceReserveForAmountsToBePaid() {
        return lifeInsuranceReserveForAmountsToBePaid;
    }

    /**
     * Sets the value of the lifeInsuranceReserveForAmountsToBePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceReserveForAmountsToBePaid(AmountType value) {
        this.lifeInsuranceReserveForAmountsToBePaid = value;
    }

    /**
     * Gets the value of the lifeInsuranceReserveForProfitSharingRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceReserveForProfitSharingRefunds() {
        return lifeInsuranceReserveForProfitSharingRefunds;
    }

    /**
     * Sets the value of the lifeInsuranceReserveForProfitSharingRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceReserveForProfitSharingRefunds(AmountType value) {
        this.lifeInsuranceReserveForProfitSharingRefunds = value;
    }

    /**
     * Gets the value of the lifeInsuranceOtherTechnicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceOtherTechnicalReserves() {
        return lifeInsuranceOtherTechnicalReserves;
    }

    /**
     * Sets the value of the lifeInsuranceOtherTechnicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceOtherTechnicalReserves(AmountType value) {
        this.lifeInsuranceOtherTechnicalReserves = value;
    }

    /**
     * Gets the value of the lifeInsuranceTechnicalReserveForInsPensionFund property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLifeInsuranceTechnicalReserveForInsPensionFund() {
        return lifeInsuranceTechnicalReserveForInsPensionFund;
    }

    /**
     * Sets the value of the lifeInsuranceTechnicalReserveForInsPensionFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLifeInsuranceTechnicalReserveForInsPensionFund(AmountType value) {
        this.lifeInsuranceTechnicalReserveForInsPensionFund = value;
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
     * Gets the value of the companysOwnSharesOrQuotas property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCompanysOwnSharesOrQuotas() {
        return companysOwnSharesOrQuotas;
    }

    /**
     * Sets the value of the companysOwnSharesOrQuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCompanysOwnSharesOrQuotas(AmountType value) {
        this.companysOwnSharesOrQuotas = value;
    }

    /**
     * Gets the value of the equityInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquityInvestments() {
        return equityInvestments;
    }

    /**
     * Sets the value of the equityInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquityInvestments(AmountType value) {
        this.equityInvestments = value;
    }

    /**
     * Gets the value of the groupCmpanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getGroupCmpanies() {
        return groupCmpanies;
    }

    /**
     * Sets the value of the groupCmpanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setGroupCmpanies(AmountType value) {
        this.groupCmpanies = value;
    }

    /**
     * Gets the value of the amountsOwedByAssoAffiliatedCoS property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedByAssoAffiliatedCoS() {
        return amountsOwedByAssoAffiliatedCoS;
    }

    /**
     * Sets the value of the amountsOwedByAssoAffiliatedCoS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedByAssoAffiliatedCoS(AmountType value) {
        this.amountsOwedByAssoAffiliatedCoS = value;
    }

    /**
     * Gets the value of the includingEquityInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncludingEquityInvestments() {
        return includingEquityInvestments;
    }

    /**
     * Sets the value of the includingEquityInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncludingEquityInvestments(AmountType value) {
        this.includingEquityInvestments = value;
    }

    /**
     * Gets the value of the internallyGeneratedIntangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInternallyGeneratedIntangibleAssets() {
        return internallyGeneratedIntangibleAssets;
    }

    /**
     * Sets the value of the internallyGeneratedIntangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInternallyGeneratedIntangibleAssets(AmountType value) {
        this.internallyGeneratedIntangibleAssets = value;
    }

    /**
     * Gets the value of the researchDevelopmentExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResearchDevelopmentExpenses() {
        return researchDevelopmentExpenses;
    }

    /**
     * Sets the value of the researchDevelopmentExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResearchDevelopmentExpenses(AmountType value) {
        this.researchDevelopmentExpenses = value;
    }

    /**
     * Gets the value of the concessionsPatentsLicensesTrademarksAndSimilarrights property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConcessionsPatentsLicensesTrademarksAndSimilarrights() {
        return concessionsPatentsLicensesTrademarksAndSimilarrights;
    }

    /**
     * Sets the value of the concessionsPatentsLicensesTrademarksAndSimilarrights property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConcessionsPatentsLicensesTrademarksAndSimilarrights(AmountType value) {
        this.concessionsPatentsLicensesTrademarksAndSimilarrights = value;
    }

    /**
     * Gets the value of the concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConcessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration() {
        return concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration;
    }

    /**
     * Sets the value of the concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConcessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration(AmountType value) {
        this.concessionsPatentsLicensesTrademarksAndSimilarrightsacquiredforvaluableconsideration = value;
    }

    /**
     * Gets the value of the intangibleFixedAssetsUnderConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIntangibleFixedAssetsUnderConstruction() {
        return intangibleFixedAssetsUnderConstruction;
    }

    /**
     * Sets the value of the intangibleFixedAssetsUnderConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIntangibleFixedAssetsUnderConstruction(AmountType value) {
        this.intangibleFixedAssetsUnderConstruction = value;
    }

    /**
     * Gets the value of the loansAndClaimsAsFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansAndClaimsAsFixedAssets() {
        return loansAndClaimsAsFixedAssets;
    }

    /**
     * Sets the value of the loansAndClaimsAsFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansAndClaimsAsFixedAssets(AmountType value) {
        this.loansAndClaimsAsFixedAssets = value;
    }

}
