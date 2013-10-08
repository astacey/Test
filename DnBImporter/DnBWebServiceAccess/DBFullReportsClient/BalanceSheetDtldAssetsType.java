
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldAssetsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldAssetsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
 *         &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
 *         &lt;element name="TotalLiabilitiesNetWorthAmountAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromSubscriptionsToCapitalStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StartUpExpansionExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FranchisesLicensesSimilarRights" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Goodwill" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancePaymentMade" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherIntangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="PlantMachineryEquipmentNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProductionExtractionUtilityPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RegulationStoringPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SupplyPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Power" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NaturalGas" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Heat" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PowerGenerationSupplyPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RailsRoutingEquipmentSecurityPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="VehiclesForPassengerMerchandiseRailTraffic" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MachinesMechanicalPlants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalPlantsOperatingDevices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FixturesFittingsOtherEquipment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PreparatoryCostForConstruction" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancePaymentsConstructioninProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansDueFromAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesinAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharesInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansDueFromOtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsReceivablesWithCoOperatives" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LongTermInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFinancialAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancialAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLongTermAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RawMaterialsSupplies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="WorkinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinishedGoodsMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyEquivalentRightsWithoutBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PreparatoryCostsForConstruction" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyEquivalentRightsWithUnfinishedBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PropertyEquivalentRightsWithFinishedBuildings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Prepayments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancePaymentsReceived" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherStocksContractsinProgress" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Stocks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFrom" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Leasing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LeasingDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SalesRealProperty" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SalesRealPropertyDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Supervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SupervisionDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherSuppliesServicesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Trade" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TradeDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="HospitalFoundationHealthCareFoundation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="HospitalHealthCareFoundationDueOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ReceivablesbyVirtueHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="VirtueFederalHealthService" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="UnderHospitalFinancingLawDue1Year" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="GovernmentalAid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="GovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NonGovernmentalAid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NonGovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountsDueFrom" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="JointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="JointVenturesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Shareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ShareholdersDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AffiliatedCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAssetsDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableOtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableOtherAssetsDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableOtherAssetsSharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherMarketableSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Securities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiquidAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTangibleFixedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AmountsOwedbyGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentItem" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentItemsFromAidFromLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentItemsFromAidFromOwnFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdjustmentItemsForOutsideShareholdings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtDiscount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDeferredCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SpecialLossAccountFromProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CityRenovationItems" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LandAcquisition" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MethodToOrder" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IndemnificationForSupportingBodies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReceivablesFromBuildingCostsRentalSubsidies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherCityRenovationItems" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Assets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashReserve" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CashReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="CashinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BalancesWithCentralBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BalancesWithDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BalancesWithPostbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PublicDebtInstrBills" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PublicDebtInstrBillsExchForRefinancingCentrBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TreasuryBillsNonInterestBearingTreasuryBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ThereofReFinancableDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BillsExchange" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BillsExchangeForRefinancingDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClaimsOnBanks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimsOnBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MortgageLoan" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PreIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LoansToCommunalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherClaims" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofOtherClaimsAgainstSecuritiesBasedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofOtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="ClaimsOnCustomers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClaimsOnCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MortgageLoans" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ClaimsSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofPayablesFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BuildingLoans" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BuildingLoansFromAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BuildingLoansToPreIntermediaryFinancing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OthersBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MunicipalityCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="PayablesFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ThereofAgainstLoanSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LeasingAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LeasingAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ThereofLeasingObjects" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ThereofPayablesFromLeasingTransactions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BondsOtherFixedIncomeSecurities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MoneyMarketSecurities" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MoneyMarketSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LoansDebentureBonds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LoansDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OwnDebentureBonds" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OwnDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Nominal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="EquitySharesOtherNonFixedInterestSecurities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EquitySharesOtherNonFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichToCreditInstitutes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichJunior" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Inventory" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ParticipatingInterest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ParticipatingInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Participations" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Participations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ParticipationsinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaidUpSharesinCooperativeSocieties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaidUpSharesinCooperativeSocieties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SharesinAssociatedCompanies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SharesinAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SharesinAffiliatedCompanies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OthersParticipationsShares" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OthersParticipationsShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ThereofinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="AssetsHeldOnTrust" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AssetsHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="LoansHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CapitalInvestmentsFromLifeInsuranceBusiness" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CapitalInvestmentsFromLifeInsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Land" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Participations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="SharesOtherFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="NotesReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherLoansPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DepositsWithCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OthersInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecoveryClaimsAgainstPublicSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubscribedCapitalUnpaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubscribedCapitalUnpaidOfWhichCalled" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnStocksorShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnStocksorSharesNominalValue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DeferredChargesPrepaidExpenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DeferredChargesPrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DifferentialAmountUnderArt250Par3CommercialCode" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="FromIssuingLendingBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherDeferredCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReceivablesCalledIn" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Intangibles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Intangibles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="Goodwill" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherIntangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvestmentsLongTerm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvestmentsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="RealEstate" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="InvestmentsinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="SharesInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EquityInterestsInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherEquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Loans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherInvestments" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="StocksInvestmentFundUnitsOtherVariableIncomeSecs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BearerBondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="MortgageAnnuities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="RegisteredBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="DebenturesLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="NotesReceivableAndLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansAdvancePaymentsOnPolicies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="ResidualLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BankDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="MiscellaneousInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherFinancialInvestmentsOfBanks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherFinancialInvestmentsOfBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="EquitySharesOtherNonFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherCapitalInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DepositsinAssumedReinsuranceBusiness" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepositsinAssumedReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
 *         &lt;element name="CapitalInvestmentsForAccountAndRiskOfLifePolicyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LoansHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivable" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="ClaimsOnBanks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClaimsOnBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PreIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="LoansToCommunalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimsOnCustomers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClaimsOnCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="PreAndIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="MunicipalityCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountsReceivableOnDirectInsuranceBusiness" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountsReceivableOnDirectInsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="Policyholders" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="WithClaimsWhichHaveFallenDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="WithClaimsNotyetDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="InsuranceAgents" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="InsuranceAgents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AccountsReceivableOnReinsuranceBusiness" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccountsReceivableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherReceivables" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                             &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReceivablesInBuildingSocietySavers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherUnclassifiedAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherUnclassifiedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TangibleAssetsInventories" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="CashinBanksChequesCashinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="TreasuryBillsAndNonInterestBearingTreasuryBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="MiscellaneousOtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrepaidExpenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="AccruedInterestRents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DifferenceAccordingToArt250Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="DifferenceAccordingToArt341Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                   &lt;element name="OtherPrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrepaidTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PrepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceCompanyAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Investments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsInsuranceActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsForAccountPolicyholdersInsLinkedSavingsDeps" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtorsOutDirectInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebtorsOutReinsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssetsInsuranceCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="BankCompanyAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentsBankingActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EquipmentBankingActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAssetsBankCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DebitDifference" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UncalledUnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossForTheYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CalledUnpaidCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FormationExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldAssetsType", propOrder = {
    "currentAssets",
    "nonCurrentAssets",
    "totalLiabilitiesNetWorthAmountAssets",
    "receivablesFromSubscriptionsToCapitalStock",
    "startUpExpansionExpenses",
    "franchisesLicensesSimilarRights",
    "goodwill",
    "advancePaymentMade",
    "otherIntangibleAssetsNet",
    "landBuildings",
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
    "plantMachineryEquipmentNet",
    "productionExtractionUtilityPlants",
    "regulationStoringPlants",
    "supplyPlants",
    "power",
    "naturalGas",
    "heat",
    "powerGenerationSupplyPlants",
    "railsRoutingEquipmentSecurityPlants",
    "vehiclesForPassengerMerchandiseRailTraffic",
    "machinesMechanicalPlants",
    "technicalPlantsOperatingDevices",
    "fixturesFittingsOtherEquipment",
    "preparatoryCostForConstruction",
    "advancePaymentsConstructioninProgress",
    "otherTangibleAssetsNet",
    "totalFixedAssets",
    "sharesinAffiliatedCompanies",
    "loansDueFromAffiliatedCompanies",
    "sharesinAssociatedCompanies",
    "sharesInvestments",
    "loansDueFromOtherGroupCompanies",
    "amountsReceivablesWithCoOperatives",
    "longTermInvestments",
    "otherLoans",
    "otherFinancialAssets",
    "financialAssets",
    "otherFixedAssets",
    "totalLongTermAssets",
    "rawMaterialsSupplies",
    "workinProgress",
    "finishedGoodsMerchandise",
    "propertyEquivalentRightsWithoutBuildings",
    "preparatoryCostsForConstruction",
    "propertyEquivalentRightsWithUnfinishedBuildings",
    "propertyEquivalentRightsWithFinishedBuildings",
    "prepayments",
    "advancePaymentsReceived",
    "otherStocksContractsinProgress",
    "stocks",
    "receivablesFrom",
    "accountsDueFrom",
    "otherAssets",
    "otherAssetsDueAfterOneYear",
    "accountsReceivableOtherAssets",
    "accountsReceivableOtherAssetsDueAfterOneYear",
    "accountsReceivableOtherAssetsSharesinAffiliatedCompanies",
    "ownShares",
    "otherMarketableSecurities",
    "securities",
    "liquidAssets",
    "totalCurrentAssets",
    "otherTangibleFixedAssets",
    "amountsOwedbyGroupCompanies",
    "adjustmentItem",
    "adjustmentItemsFromAidFromLoans",
    "adjustmentItemsFromAidFromOwnFunds",
    "adjustmentItemsForOutsideShareholdings",
    "deferredTaxes",
    "debtDiscount",
    "otherDeferredCharges",
    "specialLossAccountFromProvisions",
    "cityRenovationItems",
    "landAcquisition",
    "methodToOrder",
    "indemnificationForSupportingBodies",
    "receivablesFromBuildingCostsRentalSubsidies",
    "otherCityRenovationItems",
    "totalAssets",
    "assets",
    "cashReserve",
    "publicDebtInstrBills",
    "claimsOnBanks",
    "claimsOnCustomers",
    "leasingAssets",
    "bondsOtherFixedIncomeSecurities",
    "equitySharesOtherNonFixedInterestSecurities",
    "inventory",
    "participatingInterest",
    "assetsHeldOnTrust",
    "capitalInvestmentsFromLifeInsuranceBusiness",
    "recoveryClaimsAgainstPublicSector",
    "subscribedCapitalUnpaid",
    "subscribedCapitalUnpaidOfWhichCalled",
    "ownStocksorShares",
    "ownStocksorSharesNominalValue",
    "deferredChargesPrepaidExpenses",
    "receivablesCalledIn",
    "intangibles",
    "investmentsLongTerm",
    "capitalInvestmentsForAccountAndRiskOfLifePolicyholders",
    "loansHeldOnTrust",
    "accountsReceivable",
    "otherUnclassifiedAssets",
    "prepaidExpenses",
    "prepaidTaxes",
    "prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb",
    "insuranceCompanyAssets",
    "investments",
    "investmentsInsuranceActivities",
    "investmentsForAccountPolicyholdersInsLinkedSavingsDeps",
    "debtorsOutDirectInsurance",
    "debtorsOutReinsurance",
    "totalAssetsInsuranceCompany",
    "bankCompanyAssets",
    "investmentsBankingActivities",
    "equipmentBankingActivities",
    "totalAssetsBankCompany",
    "debitDifference",
    "uncalledUnpaidCapital",
    "lossForTheYear",
    "calledUnpaidCapital",
    "formationExpenses"
})
public class BalanceSheetDtldAssetsType {

    @XmlElement(name = "CurrentAssets")
    protected BalanceSheetDtldCurrentAssetsType currentAssets;
    @XmlElement(name = "NonCurrentAssets")
    protected BalanceSheetDtldNonCurrentAssetsType nonCurrentAssets;
    @XmlElement(name = "TotalLiabilitiesNetWorthAmountAssets")
    protected AmountType totalLiabilitiesNetWorthAmountAssets;
    @XmlElement(name = "ReceivablesFromSubscriptionsToCapitalStock")
    protected AmountType receivablesFromSubscriptionsToCapitalStock;
    @XmlElement(name = "StartUpExpansionExpenses")
    protected AmountType startUpExpansionExpenses;
    @XmlElement(name = "FranchisesLicensesSimilarRights")
    protected AmountType franchisesLicensesSimilarRights;
    @XmlElement(name = "Goodwill")
    protected AmountType goodwill;
    @XmlElement(name = "AdvancePaymentMade")
    protected AmountType advancePaymentMade;
    @XmlElement(name = "OtherIntangibleAssetsNet")
    protected AmountType otherIntangibleAssetsNet;
    @XmlElement(name = "LandBuildings")
    protected AmountType landBuildings;
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
    @XmlElement(name = "PlantMachineryEquipmentNet")
    protected AmountType plantMachineryEquipmentNet;
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
    @XmlElement(name = "MachinesMechanicalPlants")
    protected AmountType machinesMechanicalPlants;
    @XmlElement(name = "TechnicalPlantsOperatingDevices")
    protected AmountType technicalPlantsOperatingDevices;
    @XmlElement(name = "FixturesFittingsOtherEquipment")
    protected AmountType fixturesFittingsOtherEquipment;
    @XmlElement(name = "PreparatoryCostForConstruction")
    protected AmountType preparatoryCostForConstruction;
    @XmlElement(name = "AdvancePaymentsConstructioninProgress")
    protected AmountType advancePaymentsConstructioninProgress;
    @XmlElement(name = "OtherTangibleAssetsNet")
    protected AmountType otherTangibleAssetsNet;
    @XmlElement(name = "TotalFixedAssets")
    protected AmountType totalFixedAssets;
    @XmlElement(name = "SharesinAffiliatedCompanies")
    protected AmountType sharesinAffiliatedCompanies;
    @XmlElement(name = "LoansDueFromAffiliatedCompanies")
    protected AmountType loansDueFromAffiliatedCompanies;
    @XmlElement(name = "SharesinAssociatedCompanies")
    protected AmountType sharesinAssociatedCompanies;
    @XmlElement(name = "SharesInvestments")
    protected AmountType sharesInvestments;
    @XmlElement(name = "LoansDueFromOtherGroupCompanies")
    protected AmountType loansDueFromOtherGroupCompanies;
    @XmlElement(name = "AmountsReceivablesWithCoOperatives")
    protected AmountType amountsReceivablesWithCoOperatives;
    @XmlElement(name = "LongTermInvestments")
    protected AmountType longTermInvestments;
    @XmlElement(name = "OtherLoans")
    protected AmountType otherLoans;
    @XmlElement(name = "OtherFinancialAssets")
    protected AmountType otherFinancialAssets;
    @XmlElement(name = "FinancialAssets")
    protected AmountType financialAssets;
    @XmlElement(name = "OtherFixedAssets")
    protected AmountType otherFixedAssets;
    @XmlElement(name = "TotalLongTermAssets")
    protected AmountType totalLongTermAssets;
    @XmlElement(name = "RawMaterialsSupplies")
    protected AmountType rawMaterialsSupplies;
    @XmlElement(name = "WorkinProgress")
    protected AmountType workinProgress;
    @XmlElement(name = "FinishedGoodsMerchandise")
    protected AmountType finishedGoodsMerchandise;
    @XmlElement(name = "PropertyEquivalentRightsWithoutBuildings")
    protected AmountType propertyEquivalentRightsWithoutBuildings;
    @XmlElement(name = "PreparatoryCostsForConstruction")
    protected AmountType preparatoryCostsForConstruction;
    @XmlElement(name = "PropertyEquivalentRightsWithUnfinishedBuildings")
    protected AmountType propertyEquivalentRightsWithUnfinishedBuildings;
    @XmlElement(name = "PropertyEquivalentRightsWithFinishedBuildings")
    protected AmountType propertyEquivalentRightsWithFinishedBuildings;
    @XmlElement(name = "Prepayments")
    protected AmountType prepayments;
    @XmlElement(name = "AdvancePaymentsReceived")
    protected AmountType advancePaymentsReceived;
    @XmlElement(name = "OtherStocksContractsinProgress")
    protected AmountType otherStocksContractsinProgress;
    @XmlElement(name = "Stocks")
    protected AmountType stocks;
    @XmlElement(name = "ReceivablesFrom")
    protected BalanceSheetDtldAssetsType.ReceivablesFrom receivablesFrom;
    @XmlElement(name = "AccountsDueFrom")
    protected BalanceSheetDtldAssetsType.AccountsDueFrom accountsDueFrom;
    @XmlElement(name = "OtherAssets")
    protected AmountType otherAssets;
    @XmlElement(name = "OtherAssetsDueAfterOneYear")
    protected AmountType otherAssetsDueAfterOneYear;
    @XmlElement(name = "AccountsReceivableOtherAssets")
    protected AmountType accountsReceivableOtherAssets;
    @XmlElement(name = "AccountsReceivableOtherAssetsDueAfterOneYear")
    protected AmountType accountsReceivableOtherAssetsDueAfterOneYear;
    @XmlElement(name = "AccountsReceivableOtherAssetsSharesinAffiliatedCompanies")
    protected AmountType accountsReceivableOtherAssetsSharesinAffiliatedCompanies;
    @XmlElement(name = "OwnShares")
    protected AmountType ownShares;
    @XmlElement(name = "OtherMarketableSecurities")
    protected AmountType otherMarketableSecurities;
    @XmlElement(name = "Securities")
    protected AmountType securities;
    @XmlElement(name = "LiquidAssets")
    protected AmountType liquidAssets;
    @XmlElement(name = "TotalCurrentAssets")
    protected AmountType totalCurrentAssets;
    @XmlElement(name = "OtherTangibleFixedAssets")
    protected AmountType otherTangibleFixedAssets;
    @XmlElement(name = "AmountsOwedbyGroupCompanies")
    protected AmountType amountsOwedbyGroupCompanies;
    @XmlElement(name = "AdjustmentItem")
    protected AmountType adjustmentItem;
    @XmlElement(name = "AdjustmentItemsFromAidFromLoans")
    protected AmountType adjustmentItemsFromAidFromLoans;
    @XmlElement(name = "AdjustmentItemsFromAidFromOwnFunds")
    protected AmountType adjustmentItemsFromAidFromOwnFunds;
    @XmlElement(name = "AdjustmentItemsForOutsideShareholdings")
    protected AmountType adjustmentItemsForOutsideShareholdings;
    @XmlElement(name = "DeferredTaxes")
    protected AmountType deferredTaxes;
    @XmlElement(name = "DebtDiscount")
    protected AmountType debtDiscount;
    @XmlElement(name = "OtherDeferredCharges")
    protected AmountType otherDeferredCharges;
    @XmlElement(name = "SpecialLossAccountFromProvisions")
    protected AmountType specialLossAccountFromProvisions;
    @XmlElement(name = "CityRenovationItems")
    protected AmountType cityRenovationItems;
    @XmlElement(name = "LandAcquisition")
    protected AmountType landAcquisition;
    @XmlElement(name = "MethodToOrder")
    protected AmountType methodToOrder;
    @XmlElement(name = "IndemnificationForSupportingBodies")
    protected AmountType indemnificationForSupportingBodies;
    @XmlElement(name = "ReceivablesFromBuildingCostsRentalSubsidies")
    protected AmountType receivablesFromBuildingCostsRentalSubsidies;
    @XmlElement(name = "OtherCityRenovationItems")
    protected AmountType otherCityRenovationItems;
    @XmlElement(name = "TotalAssets")
    protected AmountType totalAssets;
    @XmlElement(name = "Assets")
    protected AmountType assets;
    @XmlElement(name = "CashReserve")
    protected BalanceSheetDtldAssetsType.CashReserve cashReserve;
    @XmlElement(name = "PublicDebtInstrBills")
    protected BalanceSheetDtldAssetsType.PublicDebtInstrBills publicDebtInstrBills;
    @XmlElement(name = "ClaimsOnBanks")
    protected BalanceSheetDtldAssetsType.ClaimsOnBanks claimsOnBanks;
    @XmlElement(name = "ClaimsOnCustomers")
    protected BalanceSheetDtldAssetsType.ClaimsOnCustomers claimsOnCustomers;
    @XmlElement(name = "LeasingAssets")
    protected BalanceSheetDtldAssetsType.LeasingAssets leasingAssets;
    @XmlElement(name = "BondsOtherFixedIncomeSecurities")
    protected BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities bondsOtherFixedIncomeSecurities;
    @XmlElement(name = "EquitySharesOtherNonFixedInterestSecurities")
    protected BalanceSheetDtldAssetsType.EquitySharesOtherNonFixedInterestSecurities equitySharesOtherNonFixedInterestSecurities;
    @XmlElement(name = "Inventory")
    protected AmountType inventory;
    @XmlElement(name = "ParticipatingInterest")
    protected BalanceSheetDtldAssetsType.ParticipatingInterest participatingInterest;
    @XmlElement(name = "AssetsHeldOnTrust")
    protected BalanceSheetDtldAssetsType.AssetsHeldOnTrust assetsHeldOnTrust;
    @XmlElement(name = "CapitalInvestmentsFromLifeInsuranceBusiness")
    protected BalanceSheetDtldAssetsType.CapitalInvestmentsFromLifeInsuranceBusiness capitalInvestmentsFromLifeInsuranceBusiness;
    @XmlElement(name = "RecoveryClaimsAgainstPublicSector")
    protected AmountType recoveryClaimsAgainstPublicSector;
    @XmlElement(name = "SubscribedCapitalUnpaid")
    protected AmountType subscribedCapitalUnpaid;
    @XmlElement(name = "SubscribedCapitalUnpaidOfWhichCalled")
    protected AmountType subscribedCapitalUnpaidOfWhichCalled;
    @XmlElement(name = "OwnStocksorShares")
    protected AmountType ownStocksorShares;
    @XmlElement(name = "OwnStocksorSharesNominalValue")
    protected AmountType ownStocksorSharesNominalValue;
    @XmlElement(name = "DeferredChargesPrepaidExpenses")
    protected BalanceSheetDtldAssetsType.DeferredChargesPrepaidExpenses deferredChargesPrepaidExpenses;
    @XmlElement(name = "ReceivablesCalledIn")
    protected AmountType receivablesCalledIn;
    @XmlElement(name = "Intangibles")
    protected BalanceSheetDtldAssetsType.Intangibles intangibles;
    @XmlElement(name = "InvestmentsLongTerm")
    protected BalanceSheetDtldAssetsType.InvestmentsLongTerm investmentsLongTerm;
    @XmlElement(name = "CapitalInvestmentsForAccountAndRiskOfLifePolicyholders")
    protected AmountType capitalInvestmentsForAccountAndRiskOfLifePolicyholders;
    @XmlElement(name = "LoansHeldOnTrust")
    protected AmountType loansHeldOnTrust;
    @XmlElement(name = "AccountsReceivable")
    protected BalanceSheetDtldAssetsType.AccountsReceivable accountsReceivable;
    @XmlElement(name = "OtherUnclassifiedAssets")
    protected BalanceSheetDtldAssetsType.OtherUnclassifiedAssets otherUnclassifiedAssets;
    @XmlElement(name = "PrepaidExpenses")
    protected BalanceSheetDtldAssetsType.PrepaidExpenses prepaidExpenses;
    @XmlElement(name = "PrepaidTaxes")
    protected AmountType prepaidTaxes;
    @XmlElement(name = "PrepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb")
    protected AmountType prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb;
    @XmlElement(name = "InsuranceCompanyAssets")
    protected AmountType insuranceCompanyAssets;
    @XmlElement(name = "Investments")
    protected AmountType investments;
    @XmlElement(name = "InvestmentsInsuranceActivities")
    protected AmountType investmentsInsuranceActivities;
    @XmlElement(name = "InvestmentsForAccountPolicyholdersInsLinkedSavingsDeps")
    protected AmountType investmentsForAccountPolicyholdersInsLinkedSavingsDeps;
    @XmlElement(name = "DebtorsOutDirectInsurance")
    protected AmountType debtorsOutDirectInsurance;
    @XmlElement(name = "DebtorsOutReinsurance")
    protected AmountType debtorsOutReinsurance;
    @XmlElement(name = "TotalAssetsInsuranceCompany")
    protected AmountType totalAssetsInsuranceCompany;
    @XmlElement(name = "BankCompanyAssets")
    protected AmountType bankCompanyAssets;
    @XmlElement(name = "InvestmentsBankingActivities")
    protected AmountType investmentsBankingActivities;
    @XmlElement(name = "EquipmentBankingActivities")
    protected AmountType equipmentBankingActivities;
    @XmlElement(name = "TotalAssetsBankCompany")
    protected AmountType totalAssetsBankCompany;
    @XmlElement(name = "DebitDifference")
    protected AmountType debitDifference;
    @XmlElement(name = "UncalledUnpaidCapital")
    protected AmountType uncalledUnpaidCapital;
    @XmlElement(name = "LossForTheYear")
    protected AmountType lossForTheYear;
    @XmlElement(name = "CalledUnpaidCapital")
    protected AmountType calledUnpaidCapital;
    @XmlElement(name = "FormationExpenses")
    protected AmountType formationExpenses;

    /**
     * Gets the value of the currentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldCurrentAssetsType }
     *     
     */
    public BalanceSheetDtldCurrentAssetsType getCurrentAssets() {
        return currentAssets;
    }

    /**
     * Sets the value of the currentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldCurrentAssetsType }
     *     
     */
    public void setCurrentAssets(BalanceSheetDtldCurrentAssetsType value) {
        this.currentAssets = value;
    }

    /**
     * Gets the value of the nonCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldNonCurrentAssetsType }
     *     
     */
    public BalanceSheetDtldNonCurrentAssetsType getNonCurrentAssets() {
        return nonCurrentAssets;
    }

    /**
     * Sets the value of the nonCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldNonCurrentAssetsType }
     *     
     */
    public void setNonCurrentAssets(BalanceSheetDtldNonCurrentAssetsType value) {
        this.nonCurrentAssets = value;
    }

    /**
     * Gets the value of the totalLiabilitiesNetWorthAmountAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLiabilitiesNetWorthAmountAssets() {
        return totalLiabilitiesNetWorthAmountAssets;
    }

    /**
     * Sets the value of the totalLiabilitiesNetWorthAmountAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLiabilitiesNetWorthAmountAssets(AmountType value) {
        this.totalLiabilitiesNetWorthAmountAssets = value;
    }

    /**
     * Gets the value of the receivablesFromSubscriptionsToCapitalStock property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromSubscriptionsToCapitalStock() {
        return receivablesFromSubscriptionsToCapitalStock;
    }

    /**
     * Sets the value of the receivablesFromSubscriptionsToCapitalStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromSubscriptionsToCapitalStock(AmountType value) {
        this.receivablesFromSubscriptionsToCapitalStock = value;
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
     * Gets the value of the advancePaymentMade property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancePaymentMade() {
        return advancePaymentMade;
    }

    /**
     * Sets the value of the advancePaymentMade property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancePaymentMade(AmountType value) {
        this.advancePaymentMade = value;
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
     * Gets the value of the plantMachineryEquipmentNet property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPlantMachineryEquipmentNet() {
        return plantMachineryEquipmentNet;
    }

    /**
     * Sets the value of the plantMachineryEquipmentNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPlantMachineryEquipmentNet(AmountType value) {
        this.plantMachineryEquipmentNet = value;
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
     * Gets the value of the sharesinAssociatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesinAssociatedCompanies() {
        return sharesinAssociatedCompanies;
    }

    /**
     * Sets the value of the sharesinAssociatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesinAssociatedCompanies(AmountType value) {
        this.sharesinAssociatedCompanies = value;
    }

    /**
     * Gets the value of the sharesInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharesInvestments() {
        return sharesInvestments;
    }

    /**
     * Sets the value of the sharesInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharesInvestments(AmountType value) {
        this.sharesInvestments = value;
    }

    /**
     * Gets the value of the loansDueFromOtherGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoansDueFromOtherGroupCompanies() {
        return loansDueFromOtherGroupCompanies;
    }

    /**
     * Sets the value of the loansDueFromOtherGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoansDueFromOtherGroupCompanies(AmountType value) {
        this.loansDueFromOtherGroupCompanies = value;
    }

    /**
     * Gets the value of the amountsReceivablesWithCoOperatives property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsReceivablesWithCoOperatives() {
        return amountsReceivablesWithCoOperatives;
    }

    /**
     * Sets the value of the amountsReceivablesWithCoOperatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsReceivablesWithCoOperatives(AmountType value) {
        this.amountsReceivablesWithCoOperatives = value;
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
     * Gets the value of the propertyEquivalentRightsWithoutBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyEquivalentRightsWithoutBuildings() {
        return propertyEquivalentRightsWithoutBuildings;
    }

    /**
     * Sets the value of the propertyEquivalentRightsWithoutBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyEquivalentRightsWithoutBuildings(AmountType value) {
        this.propertyEquivalentRightsWithoutBuildings = value;
    }

    /**
     * Gets the value of the preparatoryCostsForConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreparatoryCostsForConstruction() {
        return preparatoryCostsForConstruction;
    }

    /**
     * Sets the value of the preparatoryCostsForConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreparatoryCostsForConstruction(AmountType value) {
        this.preparatoryCostsForConstruction = value;
    }

    /**
     * Gets the value of the propertyEquivalentRightsWithUnfinishedBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyEquivalentRightsWithUnfinishedBuildings() {
        return propertyEquivalentRightsWithUnfinishedBuildings;
    }

    /**
     * Sets the value of the propertyEquivalentRightsWithUnfinishedBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyEquivalentRightsWithUnfinishedBuildings(AmountType value) {
        this.propertyEquivalentRightsWithUnfinishedBuildings = value;
    }

    /**
     * Gets the value of the propertyEquivalentRightsWithFinishedBuildings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPropertyEquivalentRightsWithFinishedBuildings() {
        return propertyEquivalentRightsWithFinishedBuildings;
    }

    /**
     * Sets the value of the propertyEquivalentRightsWithFinishedBuildings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPropertyEquivalentRightsWithFinishedBuildings(AmountType value) {
        this.propertyEquivalentRightsWithFinishedBuildings = value;
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
     * Gets the value of the receivablesFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.ReceivablesFrom }
     *     
     */
    public BalanceSheetDtldAssetsType.ReceivablesFrom getReceivablesFrom() {
        return receivablesFrom;
    }

    /**
     * Sets the value of the receivablesFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.ReceivablesFrom }
     *     
     */
    public void setReceivablesFrom(BalanceSheetDtldAssetsType.ReceivablesFrom value) {
        this.receivablesFrom = value;
    }

    /**
     * Gets the value of the accountsDueFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.AccountsDueFrom }
     *     
     */
    public BalanceSheetDtldAssetsType.AccountsDueFrom getAccountsDueFrom() {
        return accountsDueFrom;
    }

    /**
     * Sets the value of the accountsDueFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.AccountsDueFrom }
     *     
     */
    public void setAccountsDueFrom(BalanceSheetDtldAssetsType.AccountsDueFrom value) {
        this.accountsDueFrom = value;
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
     * Gets the value of the accountsReceivableOtherAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsReceivableOtherAssets() {
        return accountsReceivableOtherAssets;
    }

    /**
     * Sets the value of the accountsReceivableOtherAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsReceivableOtherAssets(AmountType value) {
        this.accountsReceivableOtherAssets = value;
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
     * Gets the value of the accountsReceivableOtherAssetsSharesinAffiliatedCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccountsReceivableOtherAssetsSharesinAffiliatedCompanies() {
        return accountsReceivableOtherAssetsSharesinAffiliatedCompanies;
    }

    /**
     * Sets the value of the accountsReceivableOtherAssetsSharesinAffiliatedCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccountsReceivableOtherAssetsSharesinAffiliatedCompanies(AmountType value) {
        this.accountsReceivableOtherAssetsSharesinAffiliatedCompanies = value;
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
     * Gets the value of the otherMarketableSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherMarketableSecurities() {
        return otherMarketableSecurities;
    }

    /**
     * Sets the value of the otherMarketableSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherMarketableSecurities(AmountType value) {
        this.otherMarketableSecurities = value;
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
     * Gets the value of the otherTangibleFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherTangibleFixedAssets() {
        return otherTangibleFixedAssets;
    }

    /**
     * Sets the value of the otherTangibleFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherTangibleFixedAssets(AmountType value) {
        this.otherTangibleFixedAssets = value;
    }

    /**
     * Gets the value of the amountsOwedbyGroupCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountsOwedbyGroupCompanies() {
        return amountsOwedbyGroupCompanies;
    }

    /**
     * Sets the value of the amountsOwedbyGroupCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountsOwedbyGroupCompanies(AmountType value) {
        this.amountsOwedbyGroupCompanies = value;
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
     * Gets the value of the adjustmentItemsFromAidFromLoans property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentItemsFromAidFromLoans() {
        return adjustmentItemsFromAidFromLoans;
    }

    /**
     * Sets the value of the adjustmentItemsFromAidFromLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentItemsFromAidFromLoans(AmountType value) {
        this.adjustmentItemsFromAidFromLoans = value;
    }

    /**
     * Gets the value of the adjustmentItemsFromAidFromOwnFunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentItemsFromAidFromOwnFunds() {
        return adjustmentItemsFromAidFromOwnFunds;
    }

    /**
     * Sets the value of the adjustmentItemsFromAidFromOwnFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentItemsFromAidFromOwnFunds(AmountType value) {
        this.adjustmentItemsFromAidFromOwnFunds = value;
    }

    /**
     * Gets the value of the adjustmentItemsForOutsideShareholdings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdjustmentItemsForOutsideShareholdings() {
        return adjustmentItemsForOutsideShareholdings;
    }

    /**
     * Sets the value of the adjustmentItemsForOutsideShareholdings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdjustmentItemsForOutsideShareholdings(AmountType value) {
        this.adjustmentItemsForOutsideShareholdings = value;
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
     * Gets the value of the debtDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtDiscount() {
        return debtDiscount;
    }

    /**
     * Sets the value of the debtDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtDiscount(AmountType value) {
        this.debtDiscount = value;
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
     * Gets the value of the specialLossAccountFromProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSpecialLossAccountFromProvisions() {
        return specialLossAccountFromProvisions;
    }

    /**
     * Sets the value of the specialLossAccountFromProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSpecialLossAccountFromProvisions(AmountType value) {
        this.specialLossAccountFromProvisions = value;
    }

    /**
     * Gets the value of the cityRenovationItems property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCityRenovationItems() {
        return cityRenovationItems;
    }

    /**
     * Sets the value of the cityRenovationItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCityRenovationItems(AmountType value) {
        this.cityRenovationItems = value;
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
     * Gets the value of the indemnificationForSupportingBodies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIndemnificationForSupportingBodies() {
        return indemnificationForSupportingBodies;
    }

    /**
     * Sets the value of the indemnificationForSupportingBodies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIndemnificationForSupportingBodies(AmountType value) {
        this.indemnificationForSupportingBodies = value;
    }

    /**
     * Gets the value of the receivablesFromBuildingCostsRentalSubsidies property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesFromBuildingCostsRentalSubsidies() {
        return receivablesFromBuildingCostsRentalSubsidies;
    }

    /**
     * Sets the value of the receivablesFromBuildingCostsRentalSubsidies property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesFromBuildingCostsRentalSubsidies(AmountType value) {
        this.receivablesFromBuildingCostsRentalSubsidies = value;
    }

    /**
     * Gets the value of the otherCityRenovationItems property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherCityRenovationItems() {
        return otherCityRenovationItems;
    }

    /**
     * Sets the value of the otherCityRenovationItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherCityRenovationItems(AmountType value) {
        this.otherCityRenovationItems = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssets(AmountType value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAssets(AmountType value) {
        this.assets = value;
    }

    /**
     * Gets the value of the cashReserve property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.CashReserve }
     *     
     */
    public BalanceSheetDtldAssetsType.CashReserve getCashReserve() {
        return cashReserve;
    }

    /**
     * Sets the value of the cashReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.CashReserve }
     *     
     */
    public void setCashReserve(BalanceSheetDtldAssetsType.CashReserve value) {
        this.cashReserve = value;
    }

    /**
     * Gets the value of the publicDebtInstrBills property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.PublicDebtInstrBills }
     *     
     */
    public BalanceSheetDtldAssetsType.PublicDebtInstrBills getPublicDebtInstrBills() {
        return publicDebtInstrBills;
    }

    /**
     * Sets the value of the publicDebtInstrBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.PublicDebtInstrBills }
     *     
     */
    public void setPublicDebtInstrBills(BalanceSheetDtldAssetsType.PublicDebtInstrBills value) {
        this.publicDebtInstrBills = value;
    }

    /**
     * Gets the value of the claimsOnBanks property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.ClaimsOnBanks }
     *     
     */
    public BalanceSheetDtldAssetsType.ClaimsOnBanks getClaimsOnBanks() {
        return claimsOnBanks;
    }

    /**
     * Sets the value of the claimsOnBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.ClaimsOnBanks }
     *     
     */
    public void setClaimsOnBanks(BalanceSheetDtldAssetsType.ClaimsOnBanks value) {
        this.claimsOnBanks = value;
    }

    /**
     * Gets the value of the claimsOnCustomers property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers }
     *     
     */
    public BalanceSheetDtldAssetsType.ClaimsOnCustomers getClaimsOnCustomers() {
        return claimsOnCustomers;
    }

    /**
     * Sets the value of the claimsOnCustomers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers }
     *     
     */
    public void setClaimsOnCustomers(BalanceSheetDtldAssetsType.ClaimsOnCustomers value) {
        this.claimsOnCustomers = value;
    }

    /**
     * Gets the value of the leasingAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.LeasingAssets }
     *     
     */
    public BalanceSheetDtldAssetsType.LeasingAssets getLeasingAssets() {
        return leasingAssets;
    }

    /**
     * Sets the value of the leasingAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.LeasingAssets }
     *     
     */
    public void setLeasingAssets(BalanceSheetDtldAssetsType.LeasingAssets value) {
        this.leasingAssets = value;
    }

    /**
     * Gets the value of the bondsOtherFixedIncomeSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities }
     *     
     */
    public BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities getBondsOtherFixedIncomeSecurities() {
        return bondsOtherFixedIncomeSecurities;
    }

    /**
     * Sets the value of the bondsOtherFixedIncomeSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities }
     *     
     */
    public void setBondsOtherFixedIncomeSecurities(BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities value) {
        this.bondsOtherFixedIncomeSecurities = value;
    }

    /**
     * Gets the value of the equitySharesOtherNonFixedInterestSecurities property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.EquitySharesOtherNonFixedInterestSecurities }
     *     
     */
    public BalanceSheetDtldAssetsType.EquitySharesOtherNonFixedInterestSecurities getEquitySharesOtherNonFixedInterestSecurities() {
        return equitySharesOtherNonFixedInterestSecurities;
    }

    /**
     * Sets the value of the equitySharesOtherNonFixedInterestSecurities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.EquitySharesOtherNonFixedInterestSecurities }
     *     
     */
    public void setEquitySharesOtherNonFixedInterestSecurities(BalanceSheetDtldAssetsType.EquitySharesOtherNonFixedInterestSecurities value) {
        this.equitySharesOtherNonFixedInterestSecurities = value;
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
     * Gets the value of the participatingInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest }
     *     
     */
    public BalanceSheetDtldAssetsType.ParticipatingInterest getParticipatingInterest() {
        return participatingInterest;
    }

    /**
     * Sets the value of the participatingInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest }
     *     
     */
    public void setParticipatingInterest(BalanceSheetDtldAssetsType.ParticipatingInterest value) {
        this.participatingInterest = value;
    }

    /**
     * Gets the value of the assetsHeldOnTrust property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.AssetsHeldOnTrust }
     *     
     */
    public BalanceSheetDtldAssetsType.AssetsHeldOnTrust getAssetsHeldOnTrust() {
        return assetsHeldOnTrust;
    }

    /**
     * Sets the value of the assetsHeldOnTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.AssetsHeldOnTrust }
     *     
     */
    public void setAssetsHeldOnTrust(BalanceSheetDtldAssetsType.AssetsHeldOnTrust value) {
        this.assetsHeldOnTrust = value;
    }

    /**
     * Gets the value of the capitalInvestmentsFromLifeInsuranceBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.CapitalInvestmentsFromLifeInsuranceBusiness }
     *     
     */
    public BalanceSheetDtldAssetsType.CapitalInvestmentsFromLifeInsuranceBusiness getCapitalInvestmentsFromLifeInsuranceBusiness() {
        return capitalInvestmentsFromLifeInsuranceBusiness;
    }

    /**
     * Sets the value of the capitalInvestmentsFromLifeInsuranceBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.CapitalInvestmentsFromLifeInsuranceBusiness }
     *     
     */
    public void setCapitalInvestmentsFromLifeInsuranceBusiness(BalanceSheetDtldAssetsType.CapitalInvestmentsFromLifeInsuranceBusiness value) {
        this.capitalInvestmentsFromLifeInsuranceBusiness = value;
    }

    /**
     * Gets the value of the recoveryClaimsAgainstPublicSector property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRecoveryClaimsAgainstPublicSector() {
        return recoveryClaimsAgainstPublicSector;
    }

    /**
     * Sets the value of the recoveryClaimsAgainstPublicSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRecoveryClaimsAgainstPublicSector(AmountType value) {
        this.recoveryClaimsAgainstPublicSector = value;
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
     * Gets the value of the subscribedCapitalUnpaidOfWhichCalled property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubscribedCapitalUnpaidOfWhichCalled() {
        return subscribedCapitalUnpaidOfWhichCalled;
    }

    /**
     * Sets the value of the subscribedCapitalUnpaidOfWhichCalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubscribedCapitalUnpaidOfWhichCalled(AmountType value) {
        this.subscribedCapitalUnpaidOfWhichCalled = value;
    }

    /**
     * Gets the value of the ownStocksorShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwnStocksorShares() {
        return ownStocksorShares;
    }

    /**
     * Sets the value of the ownStocksorShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwnStocksorShares(AmountType value) {
        this.ownStocksorShares = value;
    }

    /**
     * Gets the value of the ownStocksorSharesNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwnStocksorSharesNominalValue() {
        return ownStocksorSharesNominalValue;
    }

    /**
     * Sets the value of the ownStocksorSharesNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwnStocksorSharesNominalValue(AmountType value) {
        this.ownStocksorSharesNominalValue = value;
    }

    /**
     * Gets the value of the deferredChargesPrepaidExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.DeferredChargesPrepaidExpenses }
     *     
     */
    public BalanceSheetDtldAssetsType.DeferredChargesPrepaidExpenses getDeferredChargesPrepaidExpenses() {
        return deferredChargesPrepaidExpenses;
    }

    /**
     * Sets the value of the deferredChargesPrepaidExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.DeferredChargesPrepaidExpenses }
     *     
     */
    public void setDeferredChargesPrepaidExpenses(BalanceSheetDtldAssetsType.DeferredChargesPrepaidExpenses value) {
        this.deferredChargesPrepaidExpenses = value;
    }

    /**
     * Gets the value of the receivablesCalledIn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivablesCalledIn() {
        return receivablesCalledIn;
    }

    /**
     * Sets the value of the receivablesCalledIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivablesCalledIn(AmountType value) {
        this.receivablesCalledIn = value;
    }

    /**
     * Gets the value of the intangibles property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.Intangibles }
     *     
     */
    public BalanceSheetDtldAssetsType.Intangibles getIntangibles() {
        return intangibles;
    }

    /**
     * Sets the value of the intangibles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.Intangibles }
     *     
     */
    public void setIntangibles(BalanceSheetDtldAssetsType.Intangibles value) {
        this.intangibles = value;
    }

    /**
     * Gets the value of the investmentsLongTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm }
     *     
     */
    public BalanceSheetDtldAssetsType.InvestmentsLongTerm getInvestmentsLongTerm() {
        return investmentsLongTerm;
    }

    /**
     * Sets the value of the investmentsLongTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm }
     *     
     */
    public void setInvestmentsLongTerm(BalanceSheetDtldAssetsType.InvestmentsLongTerm value) {
        this.investmentsLongTerm = value;
    }

    /**
     * Gets the value of the capitalInvestmentsForAccountAndRiskOfLifePolicyholders property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalInvestmentsForAccountAndRiskOfLifePolicyholders() {
        return capitalInvestmentsForAccountAndRiskOfLifePolicyholders;
    }

    /**
     * Sets the value of the capitalInvestmentsForAccountAndRiskOfLifePolicyholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalInvestmentsForAccountAndRiskOfLifePolicyholders(AmountType value) {
        this.capitalInvestmentsForAccountAndRiskOfLifePolicyholders = value;
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
     * Gets the value of the accountsReceivable property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.AccountsReceivable }
     *     
     */
    public BalanceSheetDtldAssetsType.AccountsReceivable getAccountsReceivable() {
        return accountsReceivable;
    }

    /**
     * Sets the value of the accountsReceivable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.AccountsReceivable }
     *     
     */
    public void setAccountsReceivable(BalanceSheetDtldAssetsType.AccountsReceivable value) {
        this.accountsReceivable = value;
    }

    /**
     * Gets the value of the otherUnclassifiedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.OtherUnclassifiedAssets }
     *     
     */
    public BalanceSheetDtldAssetsType.OtherUnclassifiedAssets getOtherUnclassifiedAssets() {
        return otherUnclassifiedAssets;
    }

    /**
     * Sets the value of the otherUnclassifiedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.OtherUnclassifiedAssets }
     *     
     */
    public void setOtherUnclassifiedAssets(BalanceSheetDtldAssetsType.OtherUnclassifiedAssets value) {
        this.otherUnclassifiedAssets = value;
    }

    /**
     * Gets the value of the prepaidExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheetDtldAssetsType.PrepaidExpenses }
     *     
     */
    public BalanceSheetDtldAssetsType.PrepaidExpenses getPrepaidExpenses() {
        return prepaidExpenses;
    }

    /**
     * Sets the value of the prepaidExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheetDtldAssetsType.PrepaidExpenses }
     *     
     */
    public void setPrepaidExpenses(BalanceSheetDtldAssetsType.PrepaidExpenses value) {
        this.prepaidExpenses = value;
    }

    /**
     * Gets the value of the prepaidTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaidTaxes() {
        return prepaidTaxes;
    }

    /**
     * Sets the value of the prepaidTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaidTaxes(AmountType value) {
        this.prepaidTaxes = value;
    }

    /**
     * Gets the value of the prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPrepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb() {
        return prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb;
    }

    /**
     * Sets the value of the prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPrepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb(AmountType value) {
        this.prepaidTaxesActiveTaxAccrualADeferralAccToArt274P2Hgb = value;
    }

    /**
     * Gets the value of the insuranceCompanyAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCompanyAssets() {
        return insuranceCompanyAssets;
    }

    /**
     * Sets the value of the insuranceCompanyAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCompanyAssets(AmountType value) {
        this.insuranceCompanyAssets = value;
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
     * Gets the value of the investmentsInsuranceActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsInsuranceActivities() {
        return investmentsInsuranceActivities;
    }

    /**
     * Sets the value of the investmentsInsuranceActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsInsuranceActivities(AmountType value) {
        this.investmentsInsuranceActivities = value;
    }

    /**
     * Gets the value of the investmentsForAccountPolicyholdersInsLinkedSavingsDeps property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsForAccountPolicyholdersInsLinkedSavingsDeps() {
        return investmentsForAccountPolicyholdersInsLinkedSavingsDeps;
    }

    /**
     * Sets the value of the investmentsForAccountPolicyholdersInsLinkedSavingsDeps property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsForAccountPolicyholdersInsLinkedSavingsDeps(AmountType value) {
        this.investmentsForAccountPolicyholdersInsLinkedSavingsDeps = value;
    }

    /**
     * Gets the value of the debtorsOutDirectInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtorsOutDirectInsurance() {
        return debtorsOutDirectInsurance;
    }

    /**
     * Sets the value of the debtorsOutDirectInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtorsOutDirectInsurance(AmountType value) {
        this.debtorsOutDirectInsurance = value;
    }

    /**
     * Gets the value of the debtorsOutReinsurance property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebtorsOutReinsurance() {
        return debtorsOutReinsurance;
    }

    /**
     * Sets the value of the debtorsOutReinsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebtorsOutReinsurance(AmountType value) {
        this.debtorsOutReinsurance = value;
    }

    /**
     * Gets the value of the totalAssetsInsuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssetsInsuranceCompany() {
        return totalAssetsInsuranceCompany;
    }

    /**
     * Sets the value of the totalAssetsInsuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssetsInsuranceCompany(AmountType value) {
        this.totalAssetsInsuranceCompany = value;
    }

    /**
     * Gets the value of the bankCompanyAssets property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBankCompanyAssets() {
        return bankCompanyAssets;
    }

    /**
     * Sets the value of the bankCompanyAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBankCompanyAssets(AmountType value) {
        this.bankCompanyAssets = value;
    }

    /**
     * Gets the value of the investmentsBankingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentsBankingActivities() {
        return investmentsBankingActivities;
    }

    /**
     * Sets the value of the investmentsBankingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentsBankingActivities(AmountType value) {
        this.investmentsBankingActivities = value;
    }

    /**
     * Gets the value of the equipmentBankingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquipmentBankingActivities() {
        return equipmentBankingActivities;
    }

    /**
     * Sets the value of the equipmentBankingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquipmentBankingActivities(AmountType value) {
        this.equipmentBankingActivities = value;
    }

    /**
     * Gets the value of the totalAssetsBankCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAssetsBankCompany() {
        return totalAssetsBankCompany;
    }

    /**
     * Sets the value of the totalAssetsBankCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAssetsBankCompany(AmountType value) {
        this.totalAssetsBankCompany = value;
    }

    /**
     * Gets the value of the debitDifference property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebitDifference() {
        return debitDifference;
    }

    /**
     * Sets the value of the debitDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebitDifference(AmountType value) {
        this.debitDifference = value;
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
     * Gets the value of the lossForTheYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossForTheYear() {
        return lossForTheYear;
    }

    /**
     * Sets the value of the lossForTheYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossForTheYear(AmountType value) {
        this.lossForTheYear = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtherGroupCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="JointVentures" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="JointVenturesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Shareholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ShareholdersDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AffiliatedCompaniesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "otherGroupCompanies",
        "suppliesServices",
        "otherCompaniesDueAfterOneYear",
        "jointVentures",
        "jointVenturesDueAfterOneYear",
        "shareholders",
        "shareholdersDueAfterOneYear",
        "affiliatedCompanies",
        "affiliatedCompaniesDueAfterOneYear"
    })
    public static class AccountsDueFrom {

        @XmlElement(name = "OtherGroupCompanies")
        protected AmountType otherGroupCompanies;
        @XmlElement(name = "SuppliesServices")
        protected AmountType suppliesServices;
        @XmlElement(name = "OtherCompaniesDueAfterOneYear")
        protected AmountType otherCompaniesDueAfterOneYear;
        @XmlElement(name = "JointVentures")
        protected AmountType jointVentures;
        @XmlElement(name = "JointVenturesDueAfterOneYear")
        protected AmountType jointVenturesDueAfterOneYear;
        @XmlElement(name = "Shareholders")
        protected AmountType shareholders;
        @XmlElement(name = "ShareholdersDueAfterOneYear")
        protected AmountType shareholdersDueAfterOneYear;
        @XmlElement(name = "AffiliatedCompanies")
        protected AmountType affiliatedCompanies;
        @XmlElement(name = "AffiliatedCompaniesDueAfterOneYear")
        protected AmountType affiliatedCompaniesDueAfterOneYear;

        /**
         * Gets the value of the otherGroupCompanies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherGroupCompanies() {
            return otherGroupCompanies;
        }

        /**
         * Sets the value of the otherGroupCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherGroupCompanies(AmountType value) {
            this.otherGroupCompanies = value;
        }

        /**
         * Gets the value of the suppliesServices property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSuppliesServices() {
            return suppliesServices;
        }

        /**
         * Sets the value of the suppliesServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSuppliesServices(AmountType value) {
            this.suppliesServices = value;
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
         * Gets the value of the jointVentures property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getJointVentures() {
            return jointVentures;
        }

        /**
         * Sets the value of the jointVentures property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setJointVentures(AmountType value) {
            this.jointVentures = value;
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
         * Gets the value of the shareholders property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getShareholders() {
            return shareholders;
        }

        /**
         * Sets the value of the shareholders property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setShareholders(AmountType value) {
            this.shareholders = value;
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
         * Gets the value of the affiliatedCompanies property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAffiliatedCompanies() {
            return affiliatedCompanies;
        }

        /**
         * Sets the value of the affiliatedCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAffiliatedCompanies(AmountType value) {
            this.affiliatedCompanies = value;
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
     *         &lt;element name="AccountsReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ClaimsOnBanks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClaimsOnBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PreIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansToCommunalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClaimsOnCustomers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClaimsOnCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="PreAndIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="MunicipalityCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccountsReceivableOnDirectInsuranceBusiness" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountsReceivableOnDirectInsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Policyholders" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="WithClaimsWhichHaveFallenDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="WithClaimsNotyetDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="InsuranceAgents" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="InsuranceAgents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
     *         &lt;element name="AccountsReceivableOnReinsuranceBusiness" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccountsReceivableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherReceivables" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReceivablesInBuildingSocietySavers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "accountsReceivable",
        "claimsOnBanks",
        "claimsOnCustomers",
        "accountsReceivableOnDirectInsuranceBusiness",
        "accountsReceivableOnReinsuranceBusiness",
        "otherReceivables",
        "receivablesInBuildingSocietySavers"
    })
    public static class AccountsReceivable {

        @XmlElement(name = "AccountsReceivable")
        protected AmountType accountsReceivable;
        @XmlElement(name = "ClaimsOnBanks")
        protected BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnBanks claimsOnBanks;
        @XmlElement(name = "ClaimsOnCustomers")
        protected BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnCustomers claimsOnCustomers;
        @XmlElement(name = "AccountsReceivableOnDirectInsuranceBusiness")
        protected BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness accountsReceivableOnDirectInsuranceBusiness;
        @XmlElement(name = "AccountsReceivableOnReinsuranceBusiness")
        protected BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnReinsuranceBusiness accountsReceivableOnReinsuranceBusiness;
        @XmlElement(name = "OtherReceivables")
        protected BalanceSheetDtldAssetsType.AccountsReceivable.OtherReceivables otherReceivables;
        @XmlElement(name = "ReceivablesInBuildingSocietySavers")
        protected AmountType receivablesInBuildingSocietySavers;

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
         * Gets the value of the claimsOnBanks property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnBanks }
         *     
         */
        public BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnBanks getClaimsOnBanks() {
            return claimsOnBanks;
        }

        /**
         * Sets the value of the claimsOnBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnBanks }
         *     
         */
        public void setClaimsOnBanks(BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnBanks value) {
            this.claimsOnBanks = value;
        }

        /**
         * Gets the value of the claimsOnCustomers property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnCustomers }
         *     
         */
        public BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnCustomers getClaimsOnCustomers() {
            return claimsOnCustomers;
        }

        /**
         * Sets the value of the claimsOnCustomers property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnCustomers }
         *     
         */
        public void setClaimsOnCustomers(BalanceSheetDtldAssetsType.AccountsReceivable.ClaimsOnCustomers value) {
            this.claimsOnCustomers = value;
        }

        /**
         * Gets the value of the accountsReceivableOnDirectInsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness }
         *     
         */
        public BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness getAccountsReceivableOnDirectInsuranceBusiness() {
            return accountsReceivableOnDirectInsuranceBusiness;
        }

        /**
         * Sets the value of the accountsReceivableOnDirectInsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness }
         *     
         */
        public void setAccountsReceivableOnDirectInsuranceBusiness(BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness value) {
            this.accountsReceivableOnDirectInsuranceBusiness = value;
        }

        /**
         * Gets the value of the accountsReceivableOnReinsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnReinsuranceBusiness }
         *     
         */
        public BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnReinsuranceBusiness getAccountsReceivableOnReinsuranceBusiness() {
            return accountsReceivableOnReinsuranceBusiness;
        }

        /**
         * Sets the value of the accountsReceivableOnReinsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnReinsuranceBusiness }
         *     
         */
        public void setAccountsReceivableOnReinsuranceBusiness(BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnReinsuranceBusiness value) {
            this.accountsReceivableOnReinsuranceBusiness = value;
        }

        /**
         * Gets the value of the otherReceivables property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.OtherReceivables }
         *     
         */
        public BalanceSheetDtldAssetsType.AccountsReceivable.OtherReceivables getOtherReceivables() {
            return otherReceivables;
        }

        /**
         * Sets the value of the otherReceivables property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.OtherReceivables }
         *     
         */
        public void setOtherReceivables(BalanceSheetDtldAssetsType.AccountsReceivable.OtherReceivables value) {
            this.otherReceivables = value;
        }

        /**
         * Gets the value of the receivablesInBuildingSocietySavers property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReceivablesInBuildingSocietySavers() {
            return receivablesInBuildingSocietySavers;
        }

        /**
         * Sets the value of the receivablesInBuildingSocietySavers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReceivablesInBuildingSocietySavers(AmountType value) {
            this.receivablesInBuildingSocietySavers = value;
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
         *         &lt;element name="AccountsReceivableOnDirectInsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Policyholders" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="WithClaimsWhichHaveFallenDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="WithClaimsNotyetDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="InsuranceAgents" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="InsuranceAgents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="MemberAndBearerOfTheCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "accountsReceivableOnDirectInsuranceBusiness",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership",
            "policyholders",
            "insuranceAgents"
        })
        public static class AccountsReceivableOnDirectInsuranceBusiness {

            @XmlElement(name = "AccountsReceivableOnDirectInsuranceBusiness")
            protected AmountType accountsReceivableOnDirectInsuranceBusiness;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;
            @XmlElement(name = "Policyholders")
            protected BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.Policyholders policyholders;
            @XmlElement(name = "InsuranceAgents")
            protected BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.InsuranceAgents insuranceAgents;

            /**
             * Gets the value of the accountsReceivableOnDirectInsuranceBusiness property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAccountsReceivableOnDirectInsuranceBusiness() {
                return accountsReceivableOnDirectInsuranceBusiness;
            }

            /**
             * Sets the value of the accountsReceivableOnDirectInsuranceBusiness property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAccountsReceivableOnDirectInsuranceBusiness(AmountType value) {
                this.accountsReceivableOnDirectInsuranceBusiness = value;
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

            /**
             * Gets the value of the policyholders property.
             * 
             * @return
             *     possible object is
             *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.Policyholders }
             *     
             */
            public BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.Policyholders getPolicyholders() {
                return policyholders;
            }

            /**
             * Sets the value of the policyholders property.
             * 
             * @param value
             *     allowed object is
             *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.Policyholders }
             *     
             */
            public void setPolicyholders(BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.Policyholders value) {
                this.policyholders = value;
            }

            /**
             * Gets the value of the insuranceAgents property.
             * 
             * @return
             *     possible object is
             *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.InsuranceAgents }
             *     
             */
            public BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.InsuranceAgents getInsuranceAgents() {
                return insuranceAgents;
            }

            /**
             * Sets the value of the insuranceAgents property.
             * 
             * @param value
             *     allowed object is
             *     {@link BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.InsuranceAgents }
             *     
             */
            public void setInsuranceAgents(BalanceSheetDtldAssetsType.AccountsReceivable.AccountsReceivableOnDirectInsuranceBusiness.InsuranceAgents value) {
                this.insuranceAgents = value;
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
             *         &lt;element name="InsuranceAgents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
                "insuranceAgents",
                "ofWhichInAffiliatedCompanies",
                "memberAndBearerOfTheCompanies"
            })
            public static class InsuranceAgents {

                @XmlElement(name = "InsuranceAgents")
                protected AmountType insuranceAgents;
                @XmlElement(name = "OfWhichInAffiliatedCompanies")
                protected AmountType ofWhichInAffiliatedCompanies;
                @XmlElement(name = "MemberAndBearerOfTheCompanies")
                protected AmountType memberAndBearerOfTheCompanies;

                /**
                 * Gets the value of the insuranceAgents property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getInsuranceAgents() {
                    return insuranceAgents;
                }

                /**
                 * Sets the value of the insuranceAgents property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setInsuranceAgents(AmountType value) {
                    this.insuranceAgents = value;
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
             *         &lt;element name="Policyholders" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="WithClaimsWhichHaveFallenDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="WithClaimsNotyetDue" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
                "policyholders",
                "withClaimsWhichHaveFallenDue",
                "withClaimsNotyetDue"
            })
            public static class Policyholders {

                @XmlElement(name = "Policyholders")
                protected AmountType policyholders;
                @XmlElement(name = "WithClaimsWhichHaveFallenDue")
                protected AmountType withClaimsWhichHaveFallenDue;
                @XmlElement(name = "WithClaimsNotyetDue")
                protected AmountType withClaimsNotyetDue;

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
                 * Gets the value of the withClaimsWhichHaveFallenDue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getWithClaimsWhichHaveFallenDue() {
                    return withClaimsWhichHaveFallenDue;
                }

                /**
                 * Sets the value of the withClaimsWhichHaveFallenDue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setWithClaimsWhichHaveFallenDue(AmountType value) {
                    this.withClaimsWhichHaveFallenDue = value;
                }

                /**
                 * Gets the value of the withClaimsNotyetDue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getWithClaimsNotyetDue() {
                    return withClaimsNotyetDue;
                }

                /**
                 * Sets the value of the withClaimsNotyetDue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setWithClaimsNotyetDue(AmountType value) {
                    this.withClaimsNotyetDue = value;
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
         *         &lt;element name="AccountsReceivableOnReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "accountsReceivableOnReinsuranceBusiness",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class AccountsReceivableOnReinsuranceBusiness {

            @XmlElement(name = "AccountsReceivableOnReinsuranceBusiness")
            protected AmountType accountsReceivableOnReinsuranceBusiness;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the accountsReceivableOnReinsuranceBusiness property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getAccountsReceivableOnReinsuranceBusiness() {
                return accountsReceivableOnReinsuranceBusiness;
            }

            /**
             * Sets the value of the accountsReceivableOnReinsuranceBusiness property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setAccountsReceivableOnReinsuranceBusiness(AmountType value) {
                this.accountsReceivableOnReinsuranceBusiness = value;
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
         *         &lt;element name="ClaimsOnBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PreIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansToCommunalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "claimsOnBanks",
            "buildingSocietyLoans",
            "preIntermediaryFinancingCredits",
            "otherBuildingLoans",
            "loansToCommunalSector",
            "otherClaims"
        })
        public static class ClaimsOnBanks {

            @XmlElement(name = "ClaimsOnBanks")
            protected AmountType claimsOnBanks;
            @XmlElement(name = "BuildingSocietyLoans")
            protected AmountType buildingSocietyLoans;
            @XmlElement(name = "PreIntermediaryFinancingCredits")
            protected AmountType preIntermediaryFinancingCredits;
            @XmlElement(name = "OtherBuildingLoans")
            protected AmountType otherBuildingLoans;
            @XmlElement(name = "LoansToCommunalSector")
            protected AmountType loansToCommunalSector;
            @XmlElement(name = "OtherClaims")
            protected AmountType otherClaims;

            /**
             * Gets the value of the claimsOnBanks property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getClaimsOnBanks() {
                return claimsOnBanks;
            }

            /**
             * Sets the value of the claimsOnBanks property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setClaimsOnBanks(AmountType value) {
                this.claimsOnBanks = value;
            }

            /**
             * Gets the value of the buildingSocietyLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingSocietyLoans() {
                return buildingSocietyLoans;
            }

            /**
             * Sets the value of the buildingSocietyLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingSocietyLoans(AmountType value) {
                this.buildingSocietyLoans = value;
            }

            /**
             * Gets the value of the preIntermediaryFinancingCredits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getPreIntermediaryFinancingCredits() {
                return preIntermediaryFinancingCredits;
            }

            /**
             * Sets the value of the preIntermediaryFinancingCredits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setPreIntermediaryFinancingCredits(AmountType value) {
                this.preIntermediaryFinancingCredits = value;
            }

            /**
             * Gets the value of the otherBuildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherBuildingLoans() {
                return otherBuildingLoans;
            }

            /**
             * Sets the value of the otherBuildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherBuildingLoans(AmountType value) {
                this.otherBuildingLoans = value;
            }

            /**
             * Gets the value of the loansToCommunalSector property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansToCommunalSector() {
                return loansToCommunalSector;
            }

            /**
             * Sets the value of the loansToCommunalSector property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansToCommunalSector(AmountType value) {
                this.loansToCommunalSector = value;
            }

            /**
             * Gets the value of the otherClaims property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherClaims() {
                return otherClaims;
            }

            /**
             * Sets the value of the otherClaims property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherClaims(AmountType value) {
                this.otherClaims = value;
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
         *         &lt;element name="ClaimsOnCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="PreAndIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="MunicipalityCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "claimsOnCustomers",
            "buildingSocietyLoans",
            "preAndIntermediaryFinancingCredits",
            "otherBuildingLoans",
            "municipalityCredits",
            "otherPayables"
        })
        public static class ClaimsOnCustomers {

            @XmlElement(name = "ClaimsOnCustomers")
            protected AmountType claimsOnCustomers;
            @XmlElement(name = "BuildingSocietyLoans")
            protected AmountType buildingSocietyLoans;
            @XmlElement(name = "PreAndIntermediaryFinancingCredits")
            protected AmountType preAndIntermediaryFinancingCredits;
            @XmlElement(name = "OtherBuildingLoans")
            protected AmountType otherBuildingLoans;
            @XmlElement(name = "MunicipalityCredits")
            protected AmountType municipalityCredits;
            @XmlElement(name = "OtherPayables")
            protected AmountType otherPayables;

            /**
             * Gets the value of the claimsOnCustomers property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getClaimsOnCustomers() {
                return claimsOnCustomers;
            }

            /**
             * Sets the value of the claimsOnCustomers property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setClaimsOnCustomers(AmountType value) {
                this.claimsOnCustomers = value;
            }

            /**
             * Gets the value of the buildingSocietyLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingSocietyLoans() {
                return buildingSocietyLoans;
            }

            /**
             * Sets the value of the buildingSocietyLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingSocietyLoans(AmountType value) {
                this.buildingSocietyLoans = value;
            }

            /**
             * Gets the value of the preAndIntermediaryFinancingCredits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getPreAndIntermediaryFinancingCredits() {
                return preAndIntermediaryFinancingCredits;
            }

            /**
             * Sets the value of the preAndIntermediaryFinancingCredits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setPreAndIntermediaryFinancingCredits(AmountType value) {
                this.preAndIntermediaryFinancingCredits = value;
            }

            /**
             * Gets the value of the otherBuildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherBuildingLoans() {
                return otherBuildingLoans;
            }

            /**
             * Sets the value of the otherBuildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherBuildingLoans(AmountType value) {
                this.otherBuildingLoans = value;
            }

            /**
             * Gets the value of the municipalityCredits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getMunicipalityCredits() {
                return municipalityCredits;
            }

            /**
             * Sets the value of the municipalityCredits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setMunicipalityCredits(AmountType value) {
                this.municipalityCredits = value;
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
         *         &lt;element name="OtherReceivables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichTaxes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "otherReceivables",
            "ofWhichInAffiliatedCompanies",
            "ofWhichTaxes",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class OtherReceivables {

            @XmlElement(name = "OtherReceivables")
            protected AmountType otherReceivables;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichTaxes")
            protected AmountType ofWhichTaxes;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

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
     *         &lt;element name="AssetsHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LoansHeldOnTrust" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "assetsHeldOnTrust",
        "loansHeldOnTrust"
    })
    public static class AssetsHeldOnTrust {

        @XmlElement(name = "AssetsHeldOnTrust")
        protected AmountType assetsHeldOnTrust;
        @XmlElement(name = "LoansHeldOnTrust")
        protected AmountType loansHeldOnTrust;

        /**
         * Gets the value of the assetsHeldOnTrust property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAssetsHeldOnTrust() {
            return assetsHeldOnTrust;
        }

        /**
         * Sets the value of the assetsHeldOnTrust property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAssetsHeldOnTrust(AmountType value) {
            this.assetsHeldOnTrust = value;
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
     *         &lt;element name="BondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MoneyMarketSecurities" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MoneyMarketSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LoansDebentureBonds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LoansDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OwnDebentureBonds" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OwnDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Nominal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "bondsOtherFixedIncomeSecurities",
        "moneyMarketSecurities",
        "loansDebentureBonds",
        "ownDebentureBonds"
    })
    public static class BondsOtherFixedIncomeSecurities {

        @XmlElement(name = "BondsOtherFixedIncomeSecurities")
        protected AmountType bondsOtherFixedIncomeSecurities;
        @XmlElement(name = "MoneyMarketSecurities")
        protected BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.MoneyMarketSecurities moneyMarketSecurities;
        @XmlElement(name = "LoansDebentureBonds")
        protected BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.LoansDebentureBonds loansDebentureBonds;
        @XmlElement(name = "OwnDebentureBonds")
        protected BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.OwnDebentureBonds ownDebentureBonds;

        /**
         * Gets the value of the bondsOtherFixedIncomeSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBondsOtherFixedIncomeSecurities() {
            return bondsOtherFixedIncomeSecurities;
        }

        /**
         * Sets the value of the bondsOtherFixedIncomeSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBondsOtherFixedIncomeSecurities(AmountType value) {
            this.bondsOtherFixedIncomeSecurities = value;
        }

        /**
         * Gets the value of the moneyMarketSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.MoneyMarketSecurities }
         *     
         */
        public BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.MoneyMarketSecurities getMoneyMarketSecurities() {
            return moneyMarketSecurities;
        }

        /**
         * Sets the value of the moneyMarketSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.MoneyMarketSecurities }
         *     
         */
        public void setMoneyMarketSecurities(BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.MoneyMarketSecurities value) {
            this.moneyMarketSecurities = value;
        }

        /**
         * Gets the value of the loansDebentureBonds property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.LoansDebentureBonds }
         *     
         */
        public BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.LoansDebentureBonds getLoansDebentureBonds() {
            return loansDebentureBonds;
        }

        /**
         * Sets the value of the loansDebentureBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.LoansDebentureBonds }
         *     
         */
        public void setLoansDebentureBonds(BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.LoansDebentureBonds value) {
            this.loansDebentureBonds = value;
        }

        /**
         * Gets the value of the ownDebentureBonds property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.OwnDebentureBonds }
         *     
         */
        public BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.OwnDebentureBonds getOwnDebentureBonds() {
            return ownDebentureBonds;
        }

        /**
         * Sets the value of the ownDebentureBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.OwnDebentureBonds }
         *     
         */
        public void setOwnDebentureBonds(BalanceSheetDtldAssetsType.BondsOtherFixedIncomeSecurities.OwnDebentureBonds value) {
            this.ownDebentureBonds = value;
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
         *         &lt;element name="LoansDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "loansDebentureBonds",
            "fromPublicIssuers",
            "fromPublicIssuersEligibleAsCollateralDeutscheBundesbank",
            "fromOtherIssuers",
            "fromOtherIssuersEligibleAsCollateralDeutscheBundesbank"
        })
        public static class LoansDebentureBonds {

            @XmlElement(name = "LoansDebentureBonds")
            protected AmountType loansDebentureBonds;
            @XmlElement(name = "FromPublicIssuers")
            protected AmountType fromPublicIssuers;
            @XmlElement(name = "FromPublicIssuersEligibleAsCollateralDeutscheBundesbank")
            protected AmountType fromPublicIssuersEligibleAsCollateralDeutscheBundesbank;
            @XmlElement(name = "FromOtherIssuers")
            protected AmountType fromOtherIssuers;
            @XmlElement(name = "FromOtherIssuersEligibleAsCollateralDeutscheBundesbank")
            protected AmountType fromOtherIssuersEligibleAsCollateralDeutscheBundesbank;

            /**
             * Gets the value of the loansDebentureBonds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansDebentureBonds() {
                return loansDebentureBonds;
            }

            /**
             * Sets the value of the loansDebentureBonds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansDebentureBonds(AmountType value) {
                this.loansDebentureBonds = value;
            }

            /**
             * Gets the value of the fromPublicIssuers property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromPublicIssuers() {
                return fromPublicIssuers;
            }

            /**
             * Sets the value of the fromPublicIssuers property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromPublicIssuers(AmountType value) {
                this.fromPublicIssuers = value;
            }

            /**
             * Gets the value of the fromPublicIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromPublicIssuersEligibleAsCollateralDeutscheBundesbank() {
                return fromPublicIssuersEligibleAsCollateralDeutscheBundesbank;
            }

            /**
             * Sets the value of the fromPublicIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromPublicIssuersEligibleAsCollateralDeutscheBundesbank(AmountType value) {
                this.fromPublicIssuersEligibleAsCollateralDeutscheBundesbank = value;
            }

            /**
             * Gets the value of the fromOtherIssuers property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromOtherIssuers() {
                return fromOtherIssuers;
            }

            /**
             * Sets the value of the fromOtherIssuers property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromOtherIssuers(AmountType value) {
                this.fromOtherIssuers = value;
            }

            /**
             * Gets the value of the fromOtherIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromOtherIssuersEligibleAsCollateralDeutscheBundesbank() {
                return fromOtherIssuersEligibleAsCollateralDeutscheBundesbank;
            }

            /**
             * Sets the value of the fromOtherIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromOtherIssuersEligibleAsCollateralDeutscheBundesbank(AmountType value) {
                this.fromOtherIssuersEligibleAsCollateralDeutscheBundesbank = value;
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
         *         &lt;element name="MoneyMarketSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromPublicIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromPublicIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromOtherIssuers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="FromOtherIssuersEligibleAsCollateralDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "moneyMarketSecurities",
            "fromPublicIssuers",
            "fromPublicIssuersEligibleAsCollateralDeutscheBundesbank",
            "fromOtherIssuers",
            "fromOtherIssuersEligibleAsCollateralDeutscheBundesbank"
        })
        public static class MoneyMarketSecurities {

            @XmlElement(name = "MoneyMarketSecurities")
            protected AmountType moneyMarketSecurities;
            @XmlElement(name = "FromPublicIssuers")
            protected AmountType fromPublicIssuers;
            @XmlElement(name = "FromPublicIssuersEligibleAsCollateralDeutscheBundesbank")
            protected AmountType fromPublicIssuersEligibleAsCollateralDeutscheBundesbank;
            @XmlElement(name = "FromOtherIssuers")
            protected AmountType fromOtherIssuers;
            @XmlElement(name = "FromOtherIssuersEligibleAsCollateralDeutscheBundesbank")
            protected AmountType fromOtherIssuersEligibleAsCollateralDeutscheBundesbank;

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
             * Gets the value of the fromPublicIssuers property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromPublicIssuers() {
                return fromPublicIssuers;
            }

            /**
             * Sets the value of the fromPublicIssuers property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromPublicIssuers(AmountType value) {
                this.fromPublicIssuers = value;
            }

            /**
             * Gets the value of the fromPublicIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromPublicIssuersEligibleAsCollateralDeutscheBundesbank() {
                return fromPublicIssuersEligibleAsCollateralDeutscheBundesbank;
            }

            /**
             * Sets the value of the fromPublicIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromPublicIssuersEligibleAsCollateralDeutscheBundesbank(AmountType value) {
                this.fromPublicIssuersEligibleAsCollateralDeutscheBundesbank = value;
            }

            /**
             * Gets the value of the fromOtherIssuers property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromOtherIssuers() {
                return fromOtherIssuers;
            }

            /**
             * Sets the value of the fromOtherIssuers property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromOtherIssuers(AmountType value) {
                this.fromOtherIssuers = value;
            }

            /**
             * Gets the value of the fromOtherIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getFromOtherIssuersEligibleAsCollateralDeutscheBundesbank() {
                return fromOtherIssuersEligibleAsCollateralDeutscheBundesbank;
            }

            /**
             * Sets the value of the fromOtherIssuersEligibleAsCollateralDeutscheBundesbank property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setFromOtherIssuersEligibleAsCollateralDeutscheBundesbank(AmountType value) {
                this.fromOtherIssuersEligibleAsCollateralDeutscheBundesbank = value;
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
         *         &lt;element name="OwnDebentureBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Nominal" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "ownDebentureBonds",
            "nominal"
        })
        public static class OwnDebentureBonds {

            @XmlElement(name = "OwnDebentureBonds")
            protected AmountType ownDebentureBonds;
            @XmlElement(name = "Nominal")
            protected AmountType nominal;

            /**
             * Gets the value of the ownDebentureBonds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOwnDebentureBonds() {
                return ownDebentureBonds;
            }

            /**
             * Sets the value of the ownDebentureBonds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOwnDebentureBonds(AmountType value) {
                this.ownDebentureBonds = value;
            }

            /**
             * Gets the value of the nominal property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getNominal() {
                return nominal;
            }

            /**
             * Sets the value of the nominal property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setNominal(AmountType value) {
                this.nominal = value;
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
     *         &lt;element name="CapitalInvestmentsFromLifeInsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Land" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Participations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SharesOtherFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DebenturesOnBearer" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NotesReceivable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherLoansPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DepositsWithCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OthersInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "capitalInvestmentsFromLifeInsuranceBusiness",
        "land",
        "participations",
        "sharesOtherFixedInterestSecurities",
        "debenturesOnBearer",
        "notesReceivable",
        "otherLoansPayable",
        "depositsWithCreditInstitutions",
        "othersInvestments"
    })
    public static class CapitalInvestmentsFromLifeInsuranceBusiness {

        @XmlElement(name = "CapitalInvestmentsFromLifeInsuranceBusiness")
        protected AmountType capitalInvestmentsFromLifeInsuranceBusiness;
        @XmlElement(name = "Land")
        protected AmountType land;
        @XmlElement(name = "Participations")
        protected AmountType participations;
        @XmlElement(name = "SharesOtherFixedInterestSecurities")
        protected AmountType sharesOtherFixedInterestSecurities;
        @XmlElement(name = "DebenturesOnBearer")
        protected AmountType debenturesOnBearer;
        @XmlElement(name = "NotesReceivable")
        protected AmountType notesReceivable;
        @XmlElement(name = "OtherLoansPayable")
        protected AmountType otherLoansPayable;
        @XmlElement(name = "DepositsWithCreditInstitutions")
        protected AmountType depositsWithCreditInstitutions;
        @XmlElement(name = "OthersInvestments")
        protected AmountType othersInvestments;

        /**
         * Gets the value of the capitalInvestmentsFromLifeInsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getCapitalInvestmentsFromLifeInsuranceBusiness() {
            return capitalInvestmentsFromLifeInsuranceBusiness;
        }

        /**
         * Sets the value of the capitalInvestmentsFromLifeInsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setCapitalInvestmentsFromLifeInsuranceBusiness(AmountType value) {
            this.capitalInvestmentsFromLifeInsuranceBusiness = value;
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
         * Gets the value of the participations property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getParticipations() {
            return participations;
        }

        /**
         * Sets the value of the participations property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setParticipations(AmountType value) {
            this.participations = value;
        }

        /**
         * Gets the value of the sharesOtherFixedInterestSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSharesOtherFixedInterestSecurities() {
            return sharesOtherFixedInterestSecurities;
        }

        /**
         * Sets the value of the sharesOtherFixedInterestSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSharesOtherFixedInterestSecurities(AmountType value) {
            this.sharesOtherFixedInterestSecurities = value;
        }

        /**
         * Gets the value of the debenturesOnBearer property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDebenturesOnBearer() {
            return debenturesOnBearer;
        }

        /**
         * Sets the value of the debenturesOnBearer property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDebenturesOnBearer(AmountType value) {
            this.debenturesOnBearer = value;
        }

        /**
         * Gets the value of the notesReceivable property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getNotesReceivable() {
            return notesReceivable;
        }

        /**
         * Sets the value of the notesReceivable property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setNotesReceivable(AmountType value) {
            this.notesReceivable = value;
        }

        /**
         * Gets the value of the otherLoansPayable property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherLoansPayable() {
            return otherLoansPayable;
        }

        /**
         * Sets the value of the otherLoansPayable property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherLoansPayable(AmountType value) {
            this.otherLoansPayable = value;
        }

        /**
         * Gets the value of the depositsWithCreditInstitutions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDepositsWithCreditInstitutions() {
            return depositsWithCreditInstitutions;
        }

        /**
         * Sets the value of the depositsWithCreditInstitutions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDepositsWithCreditInstitutions(AmountType value) {
            this.depositsWithCreditInstitutions = value;
        }

        /**
         * Gets the value of the othersInvestments property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOthersInvestments() {
            return othersInvestments;
        }

        /**
         * Sets the value of the othersInvestments property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOthersInvestments(AmountType value) {
            this.othersInvestments = value;
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
     *         &lt;element name="CashReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="CashinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BalancesWithCentralBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BalancesWithDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BalancesWithPostbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "cashReserve",
        "cashinHand",
        "balancesWithCentralBanks",
        "balancesWithDeutscheBundesbank",
        "balancesWithPostbank"
    })
    public static class CashReserve {

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
     *         &lt;element name="ClaimsOnBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MortgageLoan" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BuildingSocietyLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PreIntermediaryFinancingCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LoansToCommunalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherClaims" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofOtherClaimsAgainstSecuritiesBasedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofOtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "claimsOnBanks",
        "mortgageLoan",
        "buildingSocietyLoans",
        "preIntermediaryFinancingCredits",
        "otherBuildingLoans",
        "loansToCommunalSector",
        "payableOnDemand",
        "otherClaims"
    })
    public static class ClaimsOnBanks {

        @XmlElement(name = "ClaimsOnBanks")
        protected AmountType claimsOnBanks;
        @XmlElement(name = "MortgageLoan")
        protected AmountType mortgageLoan;
        @XmlElement(name = "BuildingSocietyLoans")
        protected AmountType buildingSocietyLoans;
        @XmlElement(name = "PreIntermediaryFinancingCredits")
        protected AmountType preIntermediaryFinancingCredits;
        @XmlElement(name = "OtherBuildingLoans")
        protected AmountType otherBuildingLoans;
        @XmlElement(name = "LoansToCommunalSector")
        protected AmountType loansToCommunalSector;
        @XmlElement(name = "PayableOnDemand")
        protected AmountType payableOnDemand;
        @XmlElement(name = "OtherClaims")
        protected BalanceSheetDtldAssetsType.ClaimsOnBanks.OtherClaims otherClaims;

        /**
         * Gets the value of the claimsOnBanks property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getClaimsOnBanks() {
            return claimsOnBanks;
        }

        /**
         * Sets the value of the claimsOnBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setClaimsOnBanks(AmountType value) {
            this.claimsOnBanks = value;
        }

        /**
         * Gets the value of the mortgageLoan property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMortgageLoan() {
            return mortgageLoan;
        }

        /**
         * Sets the value of the mortgageLoan property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMortgageLoan(AmountType value) {
            this.mortgageLoan = value;
        }

        /**
         * Gets the value of the buildingSocietyLoans property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBuildingSocietyLoans() {
            return buildingSocietyLoans;
        }

        /**
         * Sets the value of the buildingSocietyLoans property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBuildingSocietyLoans(AmountType value) {
            this.buildingSocietyLoans = value;
        }

        /**
         * Gets the value of the preIntermediaryFinancingCredits property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPreIntermediaryFinancingCredits() {
            return preIntermediaryFinancingCredits;
        }

        /**
         * Sets the value of the preIntermediaryFinancingCredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPreIntermediaryFinancingCredits(AmountType value) {
            this.preIntermediaryFinancingCredits = value;
        }

        /**
         * Gets the value of the otherBuildingLoans property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherBuildingLoans() {
            return otherBuildingLoans;
        }

        /**
         * Sets the value of the otherBuildingLoans property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherBuildingLoans(AmountType value) {
            this.otherBuildingLoans = value;
        }

        /**
         * Gets the value of the loansToCommunalSector property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLoansToCommunalSector() {
            return loansToCommunalSector;
        }

        /**
         * Sets the value of the loansToCommunalSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLoansToCommunalSector(AmountType value) {
            this.loansToCommunalSector = value;
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
         * Gets the value of the otherClaims property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnBanks.OtherClaims }
         *     
         */
        public BalanceSheetDtldAssetsType.ClaimsOnBanks.OtherClaims getOtherClaims() {
            return otherClaims;
        }

        /**
         * Sets the value of the otherClaims property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnBanks.OtherClaims }
         *     
         */
        public void setOtherClaims(BalanceSheetDtldAssetsType.ClaimsOnBanks.OtherClaims value) {
            this.otherClaims = value;
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
         *         &lt;element name="OtherClaims" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofOtherClaimsAgainstSecuritiesBasedLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofOtherBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "otherClaims",
            "thereofPayableOnDemand",
            "thereofOtherClaimsAgainstSecuritiesBasedLoans",
            "mortgageLoans",
            "loansToMunicipalSector",
            "thereofOtherBuildingLoans"
        })
        public static class OtherClaims {

            @XmlElement(name = "OtherClaims")
            protected AmountType otherClaims;
            @XmlElement(name = "ThereofPayableOnDemand")
            protected AmountType thereofPayableOnDemand;
            @XmlElement(name = "ThereofOtherClaimsAgainstSecuritiesBasedLoans")
            protected AmountType thereofOtherClaimsAgainstSecuritiesBasedLoans;
            @XmlElement(name = "MortgageLoans")
            protected AmountType mortgageLoans;
            @XmlElement(name = "LoansToMunicipalSector")
            protected AmountType loansToMunicipalSector;
            @XmlElement(name = "ThereofOtherBuildingLoans")
            protected AmountType thereofOtherBuildingLoans;

            /**
             * Gets the value of the otherClaims property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherClaims() {
                return otherClaims;
            }

            /**
             * Sets the value of the otherClaims property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherClaims(AmountType value) {
                this.otherClaims = value;
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
             * Gets the value of the thereofOtherClaimsAgainstSecuritiesBasedLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofOtherClaimsAgainstSecuritiesBasedLoans() {
                return thereofOtherClaimsAgainstSecuritiesBasedLoans;
            }

            /**
             * Sets the value of the thereofOtherClaimsAgainstSecuritiesBasedLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofOtherClaimsAgainstSecuritiesBasedLoans(AmountType value) {
                this.thereofOtherClaimsAgainstSecuritiesBasedLoans = value;
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
             * Gets the value of the loansToMunicipalSector property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansToMunicipalSector() {
                return loansToMunicipalSector;
            }

            /**
             * Sets the value of the loansToMunicipalSector property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansToMunicipalSector(AmountType value) {
                this.loansToMunicipalSector = value;
            }

            /**
             * Gets the value of the thereofOtherBuildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofOtherBuildingLoans() {
                return thereofOtherBuildingLoans;
            }

            /**
             * Sets the value of the thereofOtherBuildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofOtherBuildingLoans(AmountType value) {
                this.thereofOtherBuildingLoans = value;
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
     *         &lt;element name="ClaimsOnCustomers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MortgageLoans" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ClaimsSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofPayablesFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BuildingLoans" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BuildingLoansFromAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BuildingLoansToPreIntermediaryFinancing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OthersBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MunicipalityCredits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="PayablesFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherPayables" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ThereofPayableOnDemand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ThereofAgainstLoanSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "claimsOnCustomers",
        "mortgageLoans",
        "buildingLoans",
        "municipalityCredits",
        "payablesFromMerchandise",
        "otherPayables",
        "thereofPayableOnDemand",
        "thereofAgainstLoanSecurities"
    })
    public static class ClaimsOnCustomers {

        @XmlElement(name = "ClaimsOnCustomers")
        protected AmountType claimsOnCustomers;
        @XmlElement(name = "MortgageLoans")
        protected BalanceSheetDtldAssetsType.ClaimsOnCustomers.MortgageLoans mortgageLoans;
        @XmlElement(name = "BuildingLoans")
        protected BalanceSheetDtldAssetsType.ClaimsOnCustomers.BuildingLoans buildingLoans;
        @XmlElement(name = "MunicipalityCredits")
        protected AmountType municipalityCredits;
        @XmlElement(name = "PayablesFromMerchandise")
        protected AmountType payablesFromMerchandise;
        @XmlElement(name = "OtherPayables")
        protected AmountType otherPayables;
        @XmlElement(name = "ThereofPayableOnDemand")
        protected AmountType thereofPayableOnDemand;
        @XmlElement(name = "ThereofAgainstLoanSecurities")
        protected AmountType thereofAgainstLoanSecurities;

        /**
         * Gets the value of the claimsOnCustomers property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getClaimsOnCustomers() {
            return claimsOnCustomers;
        }

        /**
         * Sets the value of the claimsOnCustomers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setClaimsOnCustomers(AmountType value) {
            this.claimsOnCustomers = value;
        }

        /**
         * Gets the value of the mortgageLoans property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers.MortgageLoans }
         *     
         */
        public BalanceSheetDtldAssetsType.ClaimsOnCustomers.MortgageLoans getMortgageLoans() {
            return mortgageLoans;
        }

        /**
         * Sets the value of the mortgageLoans property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers.MortgageLoans }
         *     
         */
        public void setMortgageLoans(BalanceSheetDtldAssetsType.ClaimsOnCustomers.MortgageLoans value) {
            this.mortgageLoans = value;
        }

        /**
         * Gets the value of the buildingLoans property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers.BuildingLoans }
         *     
         */
        public BalanceSheetDtldAssetsType.ClaimsOnCustomers.BuildingLoans getBuildingLoans() {
            return buildingLoans;
        }

        /**
         * Sets the value of the buildingLoans property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ClaimsOnCustomers.BuildingLoans }
         *     
         */
        public void setBuildingLoans(BalanceSheetDtldAssetsType.ClaimsOnCustomers.BuildingLoans value) {
            this.buildingLoans = value;
        }

        /**
         * Gets the value of the municipalityCredits property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMunicipalityCredits() {
            return municipalityCredits;
        }

        /**
         * Sets the value of the municipalityCredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMunicipalityCredits(AmountType value) {
            this.municipalityCredits = value;
        }

        /**
         * Gets the value of the payablesFromMerchandise property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPayablesFromMerchandise() {
            return payablesFromMerchandise;
        }

        /**
         * Sets the value of the payablesFromMerchandise property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPayablesFromMerchandise(AmountType value) {
            this.payablesFromMerchandise = value;
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
         * Gets the value of the thereofAgainstLoanSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getThereofAgainstLoanSecurities() {
            return thereofAgainstLoanSecurities;
        }

        /**
         * Sets the value of the thereofAgainstLoanSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setThereofAgainstLoanSecurities(AmountType value) {
            this.thereofAgainstLoanSecurities = value;
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
         *         &lt;element name="BuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BuildingLoansFromAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BuildingLoansToPreIntermediaryFinancing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OthersBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "buildingLoans",
            "buildingLoansFromAllocations",
            "buildingLoansToPreIntermediaryFinancing",
            "othersBuildingLoans",
            "thereofSecuredbyMortgages"
        })
        public static class BuildingLoans {

            @XmlElement(name = "BuildingLoans")
            protected AmountType buildingLoans;
            @XmlElement(name = "BuildingLoansFromAllocations")
            protected AmountType buildingLoansFromAllocations;
            @XmlElement(name = "BuildingLoansToPreIntermediaryFinancing")
            protected AmountType buildingLoansToPreIntermediaryFinancing;
            @XmlElement(name = "OthersBuildingLoans")
            protected AmountType othersBuildingLoans;
            @XmlElement(name = "ThereofSecuredbyMortgages")
            protected AmountType thereofSecuredbyMortgages;

            /**
             * Gets the value of the buildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingLoans() {
                return buildingLoans;
            }

            /**
             * Sets the value of the buildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingLoans(AmountType value) {
                this.buildingLoans = value;
            }

            /**
             * Gets the value of the buildingLoansFromAllocations property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingLoansFromAllocations() {
                return buildingLoansFromAllocations;
            }

            /**
             * Sets the value of the buildingLoansFromAllocations property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingLoansFromAllocations(AmountType value) {
                this.buildingLoansFromAllocations = value;
            }

            /**
             * Gets the value of the buildingLoansToPreIntermediaryFinancing property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBuildingLoansToPreIntermediaryFinancing() {
                return buildingLoansToPreIntermediaryFinancing;
            }

            /**
             * Sets the value of the buildingLoansToPreIntermediaryFinancing property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBuildingLoansToPreIntermediaryFinancing(AmountType value) {
                this.buildingLoansToPreIntermediaryFinancing = value;
            }

            /**
             * Gets the value of the othersBuildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOthersBuildingLoans() {
                return othersBuildingLoans;
            }

            /**
             * Sets the value of the othersBuildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOthersBuildingLoans(AmountType value) {
                this.othersBuildingLoans = value;
            }

            /**
             * Gets the value of the thereofSecuredbyMortgages property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofSecuredbyMortgages() {
                return thereofSecuredbyMortgages;
            }

            /**
             * Sets the value of the thereofSecuredbyMortgages property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofSecuredbyMortgages(AmountType value) {
                this.thereofSecuredbyMortgages = value;
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
         *         &lt;element name="MortgageLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ClaimsSecuredbyMortgages" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansToMunicipalSector" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofBuildingLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofPayablesFromMerchandise" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "mortgageLoans",
            "claimsSecuredbyMortgages",
            "loansToMunicipalSector",
            "thereofBuildingLoans",
            "thereofPayablesFromMerchandise"
        })
        public static class MortgageLoans {

            @XmlElement(name = "MortgageLoans")
            protected AmountType mortgageLoans;
            @XmlElement(name = "ClaimsSecuredbyMortgages")
            protected AmountType claimsSecuredbyMortgages;
            @XmlElement(name = "LoansToMunicipalSector")
            protected AmountType loansToMunicipalSector;
            @XmlElement(name = "ThereofBuildingLoans")
            protected AmountType thereofBuildingLoans;
            @XmlElement(name = "ThereofPayablesFromMerchandise")
            protected AmountType thereofPayablesFromMerchandise;

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
             * Gets the value of the claimsSecuredbyMortgages property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getClaimsSecuredbyMortgages() {
                return claimsSecuredbyMortgages;
            }

            /**
             * Sets the value of the claimsSecuredbyMortgages property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setClaimsSecuredbyMortgages(AmountType value) {
                this.claimsSecuredbyMortgages = value;
            }

            /**
             * Gets the value of the loansToMunicipalSector property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansToMunicipalSector() {
                return loansToMunicipalSector;
            }

            /**
             * Sets the value of the loansToMunicipalSector property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansToMunicipalSector(AmountType value) {
                this.loansToMunicipalSector = value;
            }

            /**
             * Gets the value of the thereofBuildingLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofBuildingLoans() {
                return thereofBuildingLoans;
            }

            /**
             * Sets the value of the thereofBuildingLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofBuildingLoans(AmountType value) {
                this.thereofBuildingLoans = value;
            }

            /**
             * Gets the value of the thereofPayablesFromMerchandise property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofPayablesFromMerchandise() {
                return thereofPayablesFromMerchandise;
            }

            /**
             * Sets the value of the thereofPayablesFromMerchandise property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofPayablesFromMerchandise(AmountType value) {
                this.thereofPayablesFromMerchandise = value;
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
     *         &lt;element name="DeferredChargesPrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DifferentialAmountUnderArt250Par3CommercialCode" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="FromIssuingLendingBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherDeferredCharges" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "deferredChargesPrepaidExpenses",
        "differentialAmountUnderArt250Par3CommercialCode",
        "fromIssuingLendingBusiness",
        "otherDeferredCharges"
    })
    public static class DeferredChargesPrepaidExpenses {

        @XmlElement(name = "DeferredChargesPrepaidExpenses")
        protected AmountType deferredChargesPrepaidExpenses;
        @XmlElement(name = "DifferentialAmountUnderArt250Par3CommercialCode")
        protected AmountType differentialAmountUnderArt250Par3CommercialCode;
        @XmlElement(name = "FromIssuingLendingBusiness")
        protected AmountType fromIssuingLendingBusiness;
        @XmlElement(name = "OtherDeferredCharges")
        protected AmountType otherDeferredCharges;

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
         * Gets the value of the differentialAmountUnderArt250Par3CommercialCode property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDifferentialAmountUnderArt250Par3CommercialCode() {
            return differentialAmountUnderArt250Par3CommercialCode;
        }

        /**
         * Sets the value of the differentialAmountUnderArt250Par3CommercialCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDifferentialAmountUnderArt250Par3CommercialCode(AmountType value) {
            this.differentialAmountUnderArt250Par3CommercialCode = value;
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
     *         &lt;element name="EquitySharesOtherNonFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichToCreditInstitutes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichJunior" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "equitySharesOtherNonFixedInterestSecurities",
        "ofWhichToCreditInstitutes",
        "ofWhichJunior"
    })
    public static class EquitySharesOtherNonFixedInterestSecurities {

        @XmlElement(name = "EquitySharesOtherNonFixedInterestSecurities")
        protected AmountType equitySharesOtherNonFixedInterestSecurities;
        @XmlElement(name = "OfWhichToCreditInstitutes")
        protected AmountType ofWhichToCreditInstitutes;
        @XmlElement(name = "OfWhichJunior")
        protected AmountType ofWhichJunior;

        /**
         * Gets the value of the equitySharesOtherNonFixedInterestSecurities property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getEquitySharesOtherNonFixedInterestSecurities() {
            return equitySharesOtherNonFixedInterestSecurities;
        }

        /**
         * Sets the value of the equitySharesOtherNonFixedInterestSecurities property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setEquitySharesOtherNonFixedInterestSecurities(AmountType value) {
            this.equitySharesOtherNonFixedInterestSecurities = value;
        }

        /**
         * Gets the value of the ofWhichToCreditInstitutes property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichToCreditInstitutes() {
            return ofWhichToCreditInstitutes;
        }

        /**
         * Sets the value of the ofWhichToCreditInstitutes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichToCreditInstitutes(AmountType value) {
            this.ofWhichToCreditInstitutes = value;
        }

        /**
         * Gets the value of the ofWhichJunior property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOfWhichJunior() {
            return ofWhichJunior;
        }

        /**
         * Sets the value of the ofWhichJunior property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOfWhichJunior(AmountType value) {
            this.ofWhichJunior = value;
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
     *         &lt;element name="Intangibles" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Goodwill" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherIntangibleAssetsNet" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "intangibles",
        "goodwill",
        "otherIntangibleAssetsNet"
    })
    public static class Intangibles {

        @XmlElement(name = "Intangibles")
        protected AmountType intangibles;
        @XmlElement(name = "Goodwill")
        protected AmountType goodwill;
        @XmlElement(name = "OtherIntangibleAssetsNet")
        protected AmountType otherIntangibleAssetsNet;

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
     *         &lt;element name="InvestmentsLongTerm" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="RealEstate" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="InvestmentsinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SharesInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EquityInterestsInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherEquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="Loans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherInvestments" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="StocksInvestmentFundUnitsOtherVariableIncomeSecs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BearerBondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="MortgageAnnuities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="RegisteredBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="DebenturesLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="NotesReceivableAndLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="LoansAdvancePaymentsOnPolicies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ResidualLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BankDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="MiscellaneousInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherFinancialInvestmentsOfBanks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherFinancialInvestmentsOfBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="EquitySharesOtherNonFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="BondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OtherCapitalInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DepositsinAssumedReinsuranceBusiness" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepositsinAssumedReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "investmentsLongTerm",
        "realEstate",
        "investmentsinAffiliatedCompaniesAssociatedCompanies",
        "otherInvestments",
        "otherFinancialInvestmentsOfBanks",
        "depositsinAssumedReinsuranceBusiness"
    })
    public static class InvestmentsLongTerm {

        @XmlElement(name = "InvestmentsLongTerm")
        protected AmountType investmentsLongTerm;
        @XmlElement(name = "RealEstate")
        protected AmountType realEstate;
        @XmlElement(name = "InvestmentsinAffiliatedCompaniesAssociatedCompanies")
        protected BalanceSheetDtldAssetsType.InvestmentsLongTerm.InvestmentsinAffiliatedCompaniesAssociatedCompanies investmentsinAffiliatedCompaniesAssociatedCompanies;
        @XmlElement(name = "OtherInvestments")
        protected BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherInvestments otherInvestments;
        @XmlElement(name = "OtherFinancialInvestmentsOfBanks")
        protected BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherFinancialInvestmentsOfBanks otherFinancialInvestmentsOfBanks;
        @XmlElement(name = "DepositsinAssumedReinsuranceBusiness")
        protected BalanceSheetDtldAssetsType.InvestmentsLongTerm.DepositsinAssumedReinsuranceBusiness depositsinAssumedReinsuranceBusiness;

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
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.InvestmentsinAffiliatedCompaniesAssociatedCompanies }
         *     
         */
        public BalanceSheetDtldAssetsType.InvestmentsLongTerm.InvestmentsinAffiliatedCompaniesAssociatedCompanies getInvestmentsinAffiliatedCompaniesAssociatedCompanies() {
            return investmentsinAffiliatedCompaniesAssociatedCompanies;
        }

        /**
         * Sets the value of the investmentsinAffiliatedCompaniesAssociatedCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.InvestmentsinAffiliatedCompaniesAssociatedCompanies }
         *     
         */
        public void setInvestmentsinAffiliatedCompaniesAssociatedCompanies(BalanceSheetDtldAssetsType.InvestmentsLongTerm.InvestmentsinAffiliatedCompaniesAssociatedCompanies value) {
            this.investmentsinAffiliatedCompaniesAssociatedCompanies = value;
        }

        /**
         * Gets the value of the otherInvestments property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherInvestments }
         *     
         */
        public BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherInvestments getOtherInvestments() {
            return otherInvestments;
        }

        /**
         * Sets the value of the otherInvestments property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherInvestments }
         *     
         */
        public void setOtherInvestments(BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherInvestments value) {
            this.otherInvestments = value;
        }

        /**
         * Gets the value of the otherFinancialInvestmentsOfBanks property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherFinancialInvestmentsOfBanks }
         *     
         */
        public BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherFinancialInvestmentsOfBanks getOtherFinancialInvestmentsOfBanks() {
            return otherFinancialInvestmentsOfBanks;
        }

        /**
         * Sets the value of the otherFinancialInvestmentsOfBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherFinancialInvestmentsOfBanks }
         *     
         */
        public void setOtherFinancialInvestmentsOfBanks(BalanceSheetDtldAssetsType.InvestmentsLongTerm.OtherFinancialInvestmentsOfBanks value) {
            this.otherFinancialInvestmentsOfBanks = value;
        }

        /**
         * Gets the value of the depositsinAssumedReinsuranceBusiness property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.DepositsinAssumedReinsuranceBusiness }
         *     
         */
        public BalanceSheetDtldAssetsType.InvestmentsLongTerm.DepositsinAssumedReinsuranceBusiness getDepositsinAssumedReinsuranceBusiness() {
            return depositsinAssumedReinsuranceBusiness;
        }

        /**
         * Sets the value of the depositsinAssumedReinsuranceBusiness property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.InvestmentsLongTerm.DepositsinAssumedReinsuranceBusiness }
         *     
         */
        public void setDepositsinAssumedReinsuranceBusiness(BalanceSheetDtldAssetsType.InvestmentsLongTerm.DepositsinAssumedReinsuranceBusiness value) {
            this.depositsinAssumedReinsuranceBusiness = value;
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
         *         &lt;element name="DepositsinAssumedReinsuranceBusiness" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "depositsinAssumedReinsuranceBusiness",
            "ofWhichInAffiliatedCompanies",
            "ofWhichInCompaniesWithExistingDistributionOfOwnership"
        })
        public static class DepositsinAssumedReinsuranceBusiness {

            @XmlElement(name = "DepositsinAssumedReinsuranceBusiness")
            protected AmountType depositsinAssumedReinsuranceBusiness;
            @XmlElement(name = "OfWhichInAffiliatedCompanies")
            protected AmountType ofWhichInAffiliatedCompanies;
            @XmlElement(name = "OfWhichInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType ofWhichInCompaniesWithExistingDistributionOfOwnership;

            /**
             * Gets the value of the depositsinAssumedReinsuranceBusiness property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDepositsinAssumedReinsuranceBusiness() {
                return depositsinAssumedReinsuranceBusiness;
            }

            /**
             * Sets the value of the depositsinAssumedReinsuranceBusiness property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDepositsinAssumedReinsuranceBusiness(AmountType value) {
                this.depositsinAssumedReinsuranceBusiness = value;
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
         *         &lt;element name="InvestmentsinAffiliatedCompaniesAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="InvestmentsinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SharesInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EquityInterestsInAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherEquityInterests" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="Loans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansInCompaniesWithExistingDistributionOfOwnership" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "investmentsinAffiliatedCompaniesAssociatedCompanies",
            "investmentsinAffiliatedCompanies",
            "sharesInAssociatedCompanies",
            "equityInterests",
            "equityInterestsInAssociatedCompanies",
            "otherEquityInterests",
            "loans",
            "loansInAffiliatedCompanies",
            "loansInCompaniesWithExistingDistributionOfOwnership",
            "otherLoans"
        })
        public static class InvestmentsinAffiliatedCompaniesAssociatedCompanies {

            @XmlElement(name = "InvestmentsinAffiliatedCompaniesAssociatedCompanies")
            protected AmountType investmentsinAffiliatedCompaniesAssociatedCompanies;
            @XmlElement(name = "InvestmentsinAffiliatedCompanies")
            protected AmountType investmentsinAffiliatedCompanies;
            @XmlElement(name = "SharesInAssociatedCompanies")
            protected AmountType sharesInAssociatedCompanies;
            @XmlElement(name = "EquityInterests")
            protected AmountType equityInterests;
            @XmlElement(name = "EquityInterestsInAssociatedCompanies")
            protected AmountType equityInterestsInAssociatedCompanies;
            @XmlElement(name = "OtherEquityInterests")
            protected AmountType otherEquityInterests;
            @XmlElement(name = "Loans")
            protected AmountType loans;
            @XmlElement(name = "LoansInAffiliatedCompanies")
            protected AmountType loansInAffiliatedCompanies;
            @XmlElement(name = "LoansInCompaniesWithExistingDistributionOfOwnership")
            protected AmountType loansInCompaniesWithExistingDistributionOfOwnership;
            @XmlElement(name = "OtherLoans")
            protected AmountType otherLoans;

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
             * Gets the value of the investmentsinAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getInvestmentsinAffiliatedCompanies() {
                return investmentsinAffiliatedCompanies;
            }

            /**
             * Sets the value of the investmentsinAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setInvestmentsinAffiliatedCompanies(AmountType value) {
                this.investmentsinAffiliatedCompanies = value;
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
             * Gets the value of the loans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoans() {
                return loans;
            }

            /**
             * Sets the value of the loans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoans(AmountType value) {
                this.loans = value;
            }

            /**
             * Gets the value of the loansInAffiliatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansInAffiliatedCompanies() {
                return loansInAffiliatedCompanies;
            }

            /**
             * Sets the value of the loansInAffiliatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansInAffiliatedCompanies(AmountType value) {
                this.loansInAffiliatedCompanies = value;
            }

            /**
             * Gets the value of the loansInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansInCompaniesWithExistingDistributionOfOwnership() {
                return loansInCompaniesWithExistingDistributionOfOwnership;
            }

            /**
             * Sets the value of the loansInCompaniesWithExistingDistributionOfOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansInCompaniesWithExistingDistributionOfOwnership(AmountType value) {
                this.loansInCompaniesWithExistingDistributionOfOwnership = value;
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
         *         &lt;element name="OtherFinancialInvestmentsOfBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="EquitySharesOtherNonFixedInterestSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherCapitalInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "otherFinancialInvestmentsOfBanks",
            "equitySharesOtherNonFixedInterestSecurities",
            "bondsOtherFixedIncomeSecurities",
            "otherCapitalInvestments"
        })
        public static class OtherFinancialInvestmentsOfBanks {

            @XmlElement(name = "OtherFinancialInvestmentsOfBanks")
            protected AmountType otherFinancialInvestmentsOfBanks;
            @XmlElement(name = "EquitySharesOtherNonFixedInterestSecurities")
            protected AmountType equitySharesOtherNonFixedInterestSecurities;
            @XmlElement(name = "BondsOtherFixedIncomeSecurities")
            protected AmountType bondsOtherFixedIncomeSecurities;
            @XmlElement(name = "OtherCapitalInvestments")
            protected AmountType otherCapitalInvestments;

            /**
             * Gets the value of the otherFinancialInvestmentsOfBanks property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherFinancialInvestmentsOfBanks() {
                return otherFinancialInvestmentsOfBanks;
            }

            /**
             * Sets the value of the otherFinancialInvestmentsOfBanks property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherFinancialInvestmentsOfBanks(AmountType value) {
                this.otherFinancialInvestmentsOfBanks = value;
            }

            /**
             * Gets the value of the equitySharesOtherNonFixedInterestSecurities property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getEquitySharesOtherNonFixedInterestSecurities() {
                return equitySharesOtherNonFixedInterestSecurities;
            }

            /**
             * Sets the value of the equitySharesOtherNonFixedInterestSecurities property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setEquitySharesOtherNonFixedInterestSecurities(AmountType value) {
                this.equitySharesOtherNonFixedInterestSecurities = value;
            }

            /**
             * Gets the value of the bondsOtherFixedIncomeSecurities property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBondsOtherFixedIncomeSecurities() {
                return bondsOtherFixedIncomeSecurities;
            }

            /**
             * Sets the value of the bondsOtherFixedIncomeSecurities property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBondsOtherFixedIncomeSecurities(AmountType value) {
                this.bondsOtherFixedIncomeSecurities = value;
            }

            /**
             * Gets the value of the otherCapitalInvestments property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOtherCapitalInvestments() {
                return otherCapitalInvestments;
            }

            /**
             * Sets the value of the otherCapitalInvestments property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOtherCapitalInvestments(AmountType value) {
                this.otherCapitalInvestments = value;
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
         *         &lt;element name="OtherInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="StocksInvestmentFundUnitsOtherVariableIncomeSecs" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BearerBondsOtherFixedIncomeSecurities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="MortgageAnnuities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OtherLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="RegisteredBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="DebenturesLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="NotesReceivableAndLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="LoansAdvancePaymentsOnPolicies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ResidualLoans" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="BankDeposits" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="MiscellaneousInvestments" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "otherInvestments",
            "stocksInvestmentFundUnitsOtherVariableIncomeSecs",
            "bearerBondsOtherFixedIncomeSecurities",
            "mortgageAnnuities",
            "otherLoans",
            "registeredBonds",
            "debenturesLoans",
            "notesReceivableAndLoans",
            "loansAdvancePaymentsOnPolicies",
            "residualLoans",
            "bankDeposits",
            "miscellaneousInvestments"
        })
        public static class OtherInvestments {

            @XmlElement(name = "OtherInvestments")
            protected AmountType otherInvestments;
            @XmlElement(name = "StocksInvestmentFundUnitsOtherVariableIncomeSecs")
            protected AmountType stocksInvestmentFundUnitsOtherVariableIncomeSecs;
            @XmlElement(name = "BearerBondsOtherFixedIncomeSecurities")
            protected AmountType bearerBondsOtherFixedIncomeSecurities;
            @XmlElement(name = "MortgageAnnuities")
            protected AmountType mortgageAnnuities;
            @XmlElement(name = "OtherLoans")
            protected AmountType otherLoans;
            @XmlElement(name = "RegisteredBonds")
            protected AmountType registeredBonds;
            @XmlElement(name = "DebenturesLoans")
            protected AmountType debenturesLoans;
            @XmlElement(name = "NotesReceivableAndLoans")
            protected AmountType notesReceivableAndLoans;
            @XmlElement(name = "LoansAdvancePaymentsOnPolicies")
            protected AmountType loansAdvancePaymentsOnPolicies;
            @XmlElement(name = "ResidualLoans")
            protected AmountType residualLoans;
            @XmlElement(name = "BankDeposits")
            protected AmountType bankDeposits;
            @XmlElement(name = "MiscellaneousInvestments")
            protected AmountType miscellaneousInvestments;

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
             * Gets the value of the stocksInvestmentFundUnitsOtherVariableIncomeSecs property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getStocksInvestmentFundUnitsOtherVariableIncomeSecs() {
                return stocksInvestmentFundUnitsOtherVariableIncomeSecs;
            }

            /**
             * Sets the value of the stocksInvestmentFundUnitsOtherVariableIncomeSecs property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setStocksInvestmentFundUnitsOtherVariableIncomeSecs(AmountType value) {
                this.stocksInvestmentFundUnitsOtherVariableIncomeSecs = value;
            }

            /**
             * Gets the value of the bearerBondsOtherFixedIncomeSecurities property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBearerBondsOtherFixedIncomeSecurities() {
                return bearerBondsOtherFixedIncomeSecurities;
            }

            /**
             * Sets the value of the bearerBondsOtherFixedIncomeSecurities property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBearerBondsOtherFixedIncomeSecurities(AmountType value) {
                this.bearerBondsOtherFixedIncomeSecurities = value;
            }

            /**
             * Gets the value of the mortgageAnnuities property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getMortgageAnnuities() {
                return mortgageAnnuities;
            }

            /**
             * Sets the value of the mortgageAnnuities property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setMortgageAnnuities(AmountType value) {
                this.mortgageAnnuities = value;
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
             * Gets the value of the registeredBonds property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getRegisteredBonds() {
                return registeredBonds;
            }

            /**
             * Sets the value of the registeredBonds property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setRegisteredBonds(AmountType value) {
                this.registeredBonds = value;
            }

            /**
             * Gets the value of the debenturesLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getDebenturesLoans() {
                return debenturesLoans;
            }

            /**
             * Sets the value of the debenturesLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setDebenturesLoans(AmountType value) {
                this.debenturesLoans = value;
            }

            /**
             * Gets the value of the notesReceivableAndLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getNotesReceivableAndLoans() {
                return notesReceivableAndLoans;
            }

            /**
             * Sets the value of the notesReceivableAndLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setNotesReceivableAndLoans(AmountType value) {
                this.notesReceivableAndLoans = value;
            }

            /**
             * Gets the value of the loansAdvancePaymentsOnPolicies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getLoansAdvancePaymentsOnPolicies() {
                return loansAdvancePaymentsOnPolicies;
            }

            /**
             * Sets the value of the loansAdvancePaymentsOnPolicies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setLoansAdvancePaymentsOnPolicies(AmountType value) {
                this.loansAdvancePaymentsOnPolicies = value;
            }

            /**
             * Gets the value of the residualLoans property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getResidualLoans() {
                return residualLoans;
            }

            /**
             * Sets the value of the residualLoans property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setResidualLoans(AmountType value) {
                this.residualLoans = value;
            }

            /**
             * Gets the value of the bankDeposits property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getBankDeposits() {
                return bankDeposits;
            }

            /**
             * Sets the value of the bankDeposits property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setBankDeposits(AmountType value) {
                this.bankDeposits = value;
            }

            /**
             * Gets the value of the miscellaneousInvestments property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getMiscellaneousInvestments() {
                return miscellaneousInvestments;
            }

            /**
             * Sets the value of the miscellaneousInvestments property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setMiscellaneousInvestments(AmountType value) {
                this.miscellaneousInvestments = value;
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
     *         &lt;element name="LeasingAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ThereofLeasingObjects" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ThereofPayablesFromLeasingTransactions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "leasingAssets",
        "thereofLeasingObjects",
        "thereofPayablesFromLeasingTransactions"
    })
    public static class LeasingAssets {

        @XmlElement(name = "LeasingAssets")
        protected AmountType leasingAssets;
        @XmlElement(name = "ThereofLeasingObjects")
        protected AmountType thereofLeasingObjects;
        @XmlElement(name = "ThereofPayablesFromLeasingTransactions")
        protected AmountType thereofPayablesFromLeasingTransactions;

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
         * Gets the value of the thereofLeasingObjects property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getThereofLeasingObjects() {
            return thereofLeasingObjects;
        }

        /**
         * Sets the value of the thereofLeasingObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setThereofLeasingObjects(AmountType value) {
            this.thereofLeasingObjects = value;
        }

        /**
         * Gets the value of the thereofPayablesFromLeasingTransactions property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getThereofPayablesFromLeasingTransactions() {
            return thereofPayablesFromLeasingTransactions;
        }

        /**
         * Sets the value of the thereofPayablesFromLeasingTransactions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setThereofPayablesFromLeasingTransactions(AmountType value) {
            this.thereofPayablesFromLeasingTransactions = value;
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
     *         &lt;element name="OtherUnclassifiedAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TangibleAssetsInventories" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="CashinBanksChequesCashinHand" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TreasuryBillsAndNonInterestBearingTreasuryBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="MiscellaneousOtherAssets" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "otherUnclassifiedAssets",
        "tangibleAssetsInventories",
        "cashinBanksChequesCashinHand",
        "treasuryBillsAndNonInterestBearingTreasuryBonds",
        "ownShares",
        "miscellaneousOtherAssets"
    })
    public static class OtherUnclassifiedAssets {

        @XmlElement(name = "OtherUnclassifiedAssets")
        protected AmountType otherUnclassifiedAssets;
        @XmlElement(name = "TangibleAssetsInventories")
        protected AmountType tangibleAssetsInventories;
        @XmlElement(name = "CashinBanksChequesCashinHand")
        protected AmountType cashinBanksChequesCashinHand;
        @XmlElement(name = "TreasuryBillsAndNonInterestBearingTreasuryBonds")
        protected AmountType treasuryBillsAndNonInterestBearingTreasuryBonds;
        @XmlElement(name = "OwnShares")
        protected AmountType ownShares;
        @XmlElement(name = "MiscellaneousOtherAssets")
        protected AmountType miscellaneousOtherAssets;

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
         * Gets the value of the tangibleAssetsInventories property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getTangibleAssetsInventories() {
            return tangibleAssetsInventories;
        }

        /**
         * Sets the value of the tangibleAssetsInventories property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setTangibleAssetsInventories(AmountType value) {
            this.tangibleAssetsInventories = value;
        }

        /**
         * Gets the value of the cashinBanksChequesCashinHand property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getCashinBanksChequesCashinHand() {
            return cashinBanksChequesCashinHand;
        }

        /**
         * Sets the value of the cashinBanksChequesCashinHand property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setCashinBanksChequesCashinHand(AmountType value) {
            this.cashinBanksChequesCashinHand = value;
        }

        /**
         * Gets the value of the treasuryBillsAndNonInterestBearingTreasuryBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getTreasuryBillsAndNonInterestBearingTreasuryBonds() {
            return treasuryBillsAndNonInterestBearingTreasuryBonds;
        }

        /**
         * Sets the value of the treasuryBillsAndNonInterestBearingTreasuryBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setTreasuryBillsAndNonInterestBearingTreasuryBonds(AmountType value) {
            this.treasuryBillsAndNonInterestBearingTreasuryBonds = value;
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
         * Gets the value of the miscellaneousOtherAssets property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getMiscellaneousOtherAssets() {
            return miscellaneousOtherAssets;
        }

        /**
         * Sets the value of the miscellaneousOtherAssets property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setMiscellaneousOtherAssets(AmountType value) {
            this.miscellaneousOtherAssets = value;
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
     *         &lt;element name="ParticipatingInterest" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Participations" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Participations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ParticipationsinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaidUpSharesinCooperativeSocieties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaidUpSharesinCooperativeSocieties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SharesinAssociatedCompanies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SharesinAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SharesinAffiliatedCompanies" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OthersParticipationsShares" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OthersParticipationsShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="ThereofinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                   &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "participatingInterest",
        "participations",
        "paidUpSharesinCooperativeSocieties",
        "sharesinAssociatedCompanies",
        "sharesinAffiliatedCompanies",
        "othersParticipationsShares"
    })
    public static class ParticipatingInterest {

        @XmlElement(name = "ParticipatingInterest")
        protected AmountType participatingInterest;
        @XmlElement(name = "Participations")
        protected BalanceSheetDtldAssetsType.ParticipatingInterest.Participations participations;
        @XmlElement(name = "PaidUpSharesinCooperativeSocieties")
        protected BalanceSheetDtldAssetsType.ParticipatingInterest.PaidUpSharesinCooperativeSocieties paidUpSharesinCooperativeSocieties;
        @XmlElement(name = "SharesinAssociatedCompanies")
        protected BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAssociatedCompanies sharesinAssociatedCompanies;
        @XmlElement(name = "SharesinAffiliatedCompanies")
        protected BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAffiliatedCompanies sharesinAffiliatedCompanies;
        @XmlElement(name = "OthersParticipationsShares")
        protected BalanceSheetDtldAssetsType.ParticipatingInterest.OthersParticipationsShares othersParticipationsShares;

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
         * Gets the value of the participations property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.Participations }
         *     
         */
        public BalanceSheetDtldAssetsType.ParticipatingInterest.Participations getParticipations() {
            return participations;
        }

        /**
         * Sets the value of the participations property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.Participations }
         *     
         */
        public void setParticipations(BalanceSheetDtldAssetsType.ParticipatingInterest.Participations value) {
            this.participations = value;
        }

        /**
         * Gets the value of the paidUpSharesinCooperativeSocieties property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.PaidUpSharesinCooperativeSocieties }
         *     
         */
        public BalanceSheetDtldAssetsType.ParticipatingInterest.PaidUpSharesinCooperativeSocieties getPaidUpSharesinCooperativeSocieties() {
            return paidUpSharesinCooperativeSocieties;
        }

        /**
         * Sets the value of the paidUpSharesinCooperativeSocieties property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.PaidUpSharesinCooperativeSocieties }
         *     
         */
        public void setPaidUpSharesinCooperativeSocieties(BalanceSheetDtldAssetsType.ParticipatingInterest.PaidUpSharesinCooperativeSocieties value) {
            this.paidUpSharesinCooperativeSocieties = value;
        }

        /**
         * Gets the value of the sharesinAssociatedCompanies property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAssociatedCompanies }
         *     
         */
        public BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAssociatedCompanies getSharesinAssociatedCompanies() {
            return sharesinAssociatedCompanies;
        }

        /**
         * Sets the value of the sharesinAssociatedCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAssociatedCompanies }
         *     
         */
        public void setSharesinAssociatedCompanies(BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAssociatedCompanies value) {
            this.sharesinAssociatedCompanies = value;
        }

        /**
         * Gets the value of the sharesinAffiliatedCompanies property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAffiliatedCompanies }
         *     
         */
        public BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAffiliatedCompanies getSharesinAffiliatedCompanies() {
            return sharesinAffiliatedCompanies;
        }

        /**
         * Sets the value of the sharesinAffiliatedCompanies property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAffiliatedCompanies }
         *     
         */
        public void setSharesinAffiliatedCompanies(BalanceSheetDtldAssetsType.ParticipatingInterest.SharesinAffiliatedCompanies value) {
            this.sharesinAffiliatedCompanies = value;
        }

        /**
         * Gets the value of the othersParticipationsShares property.
         * 
         * @return
         *     possible object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.OthersParticipationsShares }
         *     
         */
        public BalanceSheetDtldAssetsType.ParticipatingInterest.OthersParticipationsShares getOthersParticipationsShares() {
            return othersParticipationsShares;
        }

        /**
         * Sets the value of the othersParticipationsShares property.
         * 
         * @param value
         *     allowed object is
         *     {@link BalanceSheetDtldAssetsType.ParticipatingInterest.OthersParticipationsShares }
         *     
         */
        public void setOthersParticipationsShares(BalanceSheetDtldAssetsType.ParticipatingInterest.OthersParticipationsShares value) {
            this.othersParticipationsShares = value;
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
         *         &lt;element name="OthersParticipationsShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ThereofinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "othersParticipationsShares",
            "thereofinCreditInstitutions",
            "ofWhichToFinancialIntermediaries"
        })
        public static class OthersParticipationsShares {

            @XmlElement(name = "OthersParticipationsShares")
            protected AmountType othersParticipationsShares;
            @XmlElement(name = "ThereofinCreditInstitutions")
            protected AmountType thereofinCreditInstitutions;
            @XmlElement(name = "OfWhichToFinancialIntermediaries")
            protected AmountType ofWhichToFinancialIntermediaries;

            /**
             * Gets the value of the othersParticipationsShares property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOthersParticipationsShares() {
                return othersParticipationsShares;
            }

            /**
             * Sets the value of the othersParticipationsShares property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOthersParticipationsShares(AmountType value) {
                this.othersParticipationsShares = value;
            }

            /**
             * Gets the value of the thereofinCreditInstitutions property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getThereofinCreditInstitutions() {
                return thereofinCreditInstitutions;
            }

            /**
             * Sets the value of the thereofinCreditInstitutions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setThereofinCreditInstitutions(AmountType value) {
                this.thereofinCreditInstitutions = value;
            }

            /**
             * Gets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichToFinancialIntermediaries() {
                return ofWhichToFinancialIntermediaries;
            }

            /**
             * Sets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichToFinancialIntermediaries(AmountType value) {
                this.ofWhichToFinancialIntermediaries = value;
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
         *         &lt;element name="PaidUpSharesinCooperativeSocieties" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichToCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "paidUpSharesinCooperativeSocieties",
            "ofWhichToCreditInstitutions",
            "ofWhichToFinancialIntermediaries"
        })
        public static class PaidUpSharesinCooperativeSocieties {

            @XmlElement(name = "PaidUpSharesinCooperativeSocieties")
            protected AmountType paidUpSharesinCooperativeSocieties;
            @XmlElement(name = "OfWhichToCreditInstitutions")
            protected AmountType ofWhichToCreditInstitutions;
            @XmlElement(name = "OfWhichToFinancialIntermediaries")
            protected AmountType ofWhichToFinancialIntermediaries;

            /**
             * Gets the value of the paidUpSharesinCooperativeSocieties property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getPaidUpSharesinCooperativeSocieties() {
                return paidUpSharesinCooperativeSocieties;
            }

            /**
             * Sets the value of the paidUpSharesinCooperativeSocieties property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setPaidUpSharesinCooperativeSocieties(AmountType value) {
                this.paidUpSharesinCooperativeSocieties = value;
            }

            /**
             * Gets the value of the ofWhichToCreditInstitutions property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichToCreditInstitutions() {
                return ofWhichToCreditInstitutions;
            }

            /**
             * Sets the value of the ofWhichToCreditInstitutions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichToCreditInstitutions(AmountType value) {
                this.ofWhichToCreditInstitutions = value;
            }

            /**
             * Gets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichToFinancialIntermediaries() {
                return ofWhichToFinancialIntermediaries;
            }

            /**
             * Sets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichToFinancialIntermediaries(AmountType value) {
                this.ofWhichToFinancialIntermediaries = value;
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
         *         &lt;element name="Participations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="ParticipationsinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "participations",
            "participationsinCreditInstitutions",
            "ofWhichToFinancialIntermediaries"
        })
        public static class Participations {

            @XmlElement(name = "Participations")
            protected AmountType participations;
            @XmlElement(name = "ParticipationsinCreditInstitutions")
            protected AmountType participationsinCreditInstitutions;
            @XmlElement(name = "OfWhichToFinancialIntermediaries")
            protected AmountType ofWhichToFinancialIntermediaries;

            /**
             * Gets the value of the participations property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getParticipations() {
                return participations;
            }

            /**
             * Sets the value of the participations property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setParticipations(AmountType value) {
                this.participations = value;
            }

            /**
             * Gets the value of the participationsinCreditInstitutions property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getParticipationsinCreditInstitutions() {
                return participationsinCreditInstitutions;
            }

            /**
             * Sets the value of the participationsinCreditInstitutions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setParticipationsinCreditInstitutions(AmountType value) {
                this.participationsinCreditInstitutions = value;
            }

            /**
             * Gets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichToFinancialIntermediaries() {
                return ofWhichToFinancialIntermediaries;
            }

            /**
             * Sets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichToFinancialIntermediaries(AmountType value) {
                this.ofWhichToFinancialIntermediaries = value;
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
         *         &lt;element name="SharesinAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="OfWhichToFinancialIntermediaries" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "sharesinAffiliatedCompanies",
            "sharesinCreditInstitutions",
            "ofWhichToFinancialIntermediaries"
        })
        public static class SharesinAffiliatedCompanies {

            @XmlElement(name = "SharesinAffiliatedCompanies")
            protected AmountType sharesinAffiliatedCompanies;
            @XmlElement(name = "SharesinCreditInstitutions")
            protected AmountType sharesinCreditInstitutions;
            @XmlElement(name = "OfWhichToFinancialIntermediaries")
            protected AmountType ofWhichToFinancialIntermediaries;

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

            /**
             * Gets the value of the sharesinCreditInstitutions property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSharesinCreditInstitutions() {
                return sharesinCreditInstitutions;
            }

            /**
             * Sets the value of the sharesinCreditInstitutions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSharesinCreditInstitutions(AmountType value) {
                this.sharesinCreditInstitutions = value;
            }

            /**
             * Gets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getOfWhichToFinancialIntermediaries() {
                return ofWhichToFinancialIntermediaries;
            }

            /**
             * Sets the value of the ofWhichToFinancialIntermediaries property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setOfWhichToFinancialIntermediaries(AmountType value) {
                this.ofWhichToFinancialIntermediaries = value;
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
         *         &lt;element name="SharesinAssociatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *         &lt;element name="SharesinCreditInstitutions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
            "sharesinAssociatedCompanies",
            "sharesinCreditInstitutions"
        })
        public static class SharesinAssociatedCompanies {

            @XmlElement(name = "SharesinAssociatedCompanies")
            protected AmountType sharesinAssociatedCompanies;
            @XmlElement(name = "SharesinCreditInstitutions")
            protected AmountType sharesinCreditInstitutions;

            /**
             * Gets the value of the sharesinAssociatedCompanies property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSharesinAssociatedCompanies() {
                return sharesinAssociatedCompanies;
            }

            /**
             * Sets the value of the sharesinAssociatedCompanies property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSharesinAssociatedCompanies(AmountType value) {
                this.sharesinAssociatedCompanies = value;
            }

            /**
             * Gets the value of the sharesinCreditInstitutions property.
             * 
             * @return
             *     possible object is
             *     {@link AmountType }
             *     
             */
            public AmountType getSharesinCreditInstitutions() {
                return sharesinCreditInstitutions;
            }

            /**
             * Sets the value of the sharesinCreditInstitutions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AmountType }
             *     
             */
            public void setSharesinCreditInstitutions(AmountType value) {
                this.sharesinCreditInstitutions = value;
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
     *         &lt;element name="PrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="AccruedInterestRents" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OfWhichInAffiliatedCompanies" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DifferenceAccordingToArt250Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="DifferenceAccordingToArt341Hgb" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherPrepaidExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "prepaidExpenses",
        "accruedInterestRents",
        "ofWhichInAffiliatedCompanies",
        "differenceAccordingToArt250Hgb",
        "differenceAccordingToArt341Hgb",
        "otherPrepaidExpenses"
    })
    public static class PrepaidExpenses {

        @XmlElement(name = "PrepaidExpenses")
        protected AmountType prepaidExpenses;
        @XmlElement(name = "AccruedInterestRents")
        protected AmountType accruedInterestRents;
        @XmlElement(name = "OfWhichInAffiliatedCompanies")
        protected AmountType ofWhichInAffiliatedCompanies;
        @XmlElement(name = "DifferenceAccordingToArt250Hgb")
        protected AmountType differenceAccordingToArt250Hgb;
        @XmlElement(name = "DifferenceAccordingToArt341Hgb")
        protected AmountType differenceAccordingToArt341Hgb;
        @XmlElement(name = "OtherPrepaidExpenses")
        protected AmountType otherPrepaidExpenses;

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
         * Gets the value of the accruedInterestRents property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getAccruedInterestRents() {
            return accruedInterestRents;
        }

        /**
         * Sets the value of the accruedInterestRents property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setAccruedInterestRents(AmountType value) {
            this.accruedInterestRents = value;
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
         * Gets the value of the differenceAccordingToArt250Hgb property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getDifferenceAccordingToArt250Hgb() {
            return differenceAccordingToArt250Hgb;
        }

        /**
         * Sets the value of the differenceAccordingToArt250Hgb property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setDifferenceAccordingToArt250Hgb(AmountType value) {
            this.differenceAccordingToArt250Hgb = value;
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
         * Gets the value of the otherPrepaidExpenses property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherPrepaidExpenses() {
            return otherPrepaidExpenses;
        }

        /**
         * Sets the value of the otherPrepaidExpenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherPrepaidExpenses(AmountType value) {
            this.otherPrepaidExpenses = value;
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
     *         &lt;element name="PublicDebtInstrBillsExchForRefinancingCentrBanks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TreasuryBillsNonInterestBearingTreasuryBonds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ThereofReFinancableDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BillsExchange" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="BillsExchangeForRefinancingDeutscheBundesbank" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "publicDebtInstrBillsExchForRefinancingCentrBanks",
        "treasuryBillsNonInterestBearingTreasuryBonds",
        "thereofReFinancableDeutscheBundesbank",
        "billsExchange",
        "billsExchangeForRefinancingDeutscheBundesbank"
    })
    public static class PublicDebtInstrBills {

        @XmlElement(name = "PublicDebtInstrBillsExchForRefinancingCentrBanks")
        protected AmountType publicDebtInstrBillsExchForRefinancingCentrBanks;
        @XmlElement(name = "TreasuryBillsNonInterestBearingTreasuryBonds")
        protected AmountType treasuryBillsNonInterestBearingTreasuryBonds;
        @XmlElement(name = "ThereofReFinancableDeutscheBundesbank")
        protected AmountType thereofReFinancableDeutscheBundesbank;
        @XmlElement(name = "BillsExchange")
        protected AmountType billsExchange;
        @XmlElement(name = "BillsExchangeForRefinancingDeutscheBundesbank")
        protected AmountType billsExchangeForRefinancingDeutscheBundesbank;

        /**
         * Gets the value of the publicDebtInstrBillsExchForRefinancingCentrBanks property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getPublicDebtInstrBillsExchForRefinancingCentrBanks() {
            return publicDebtInstrBillsExchForRefinancingCentrBanks;
        }

        /**
         * Sets the value of the publicDebtInstrBillsExchForRefinancingCentrBanks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setPublicDebtInstrBillsExchForRefinancingCentrBanks(AmountType value) {
            this.publicDebtInstrBillsExchForRefinancingCentrBanks = value;
        }

        /**
         * Gets the value of the treasuryBillsNonInterestBearingTreasuryBonds property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getTreasuryBillsNonInterestBearingTreasuryBonds() {
            return treasuryBillsNonInterestBearingTreasuryBonds;
        }

        /**
         * Sets the value of the treasuryBillsNonInterestBearingTreasuryBonds property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setTreasuryBillsNonInterestBearingTreasuryBonds(AmountType value) {
            this.treasuryBillsNonInterestBearingTreasuryBonds = value;
        }

        /**
         * Gets the value of the thereofReFinancableDeutscheBundesbank property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getThereofReFinancableDeutscheBundesbank() {
            return thereofReFinancableDeutscheBundesbank;
        }

        /**
         * Sets the value of the thereofReFinancableDeutscheBundesbank property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setThereofReFinancableDeutscheBundesbank(AmountType value) {
            this.thereofReFinancableDeutscheBundesbank = value;
        }

        /**
         * Gets the value of the billsExchange property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBillsExchange() {
            return billsExchange;
        }

        /**
         * Sets the value of the billsExchange property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBillsExchange(AmountType value) {
            this.billsExchange = value;
        }

        /**
         * Gets the value of the billsExchangeForRefinancingDeutscheBundesbank property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getBillsExchangeForRefinancingDeutscheBundesbank() {
            return billsExchangeForRefinancingDeutscheBundesbank;
        }

        /**
         * Sets the value of the billsExchangeForRefinancingDeutscheBundesbank property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setBillsExchangeForRefinancingDeutscheBundesbank(AmountType value) {
            this.billsExchangeForRefinancingDeutscheBundesbank = value;
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
     *         &lt;element name="Leasing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="LeasingDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SalesRealProperty" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SalesRealPropertyDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Supervision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SupervisionDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherSuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="OtherSuppliesServicesDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="Trade" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="TradeDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="HospitalFoundationHealthCareFoundation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="SuppliesServices" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="HospitalHealthCareFoundationDueOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="ReceivablesbyVirtueHospitalFinancingLaw" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="VirtueFederalHealthService" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="UnderHospitalFinancingLawDue1Year" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="GovernmentalAid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="GovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NonGovernmentalAid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *         &lt;element name="NonGovernmentalAidDueAfterOneYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
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
        "leasing",
        "leasingDueAfterOneYear",
        "salesRealProperty",
        "salesRealPropertyDueAfterOneYear",
        "supervision",
        "supervisionDueAfterOneYear",
        "otherSuppliesServices",
        "otherSuppliesServicesDueAfterOneYear",
        "trade",
        "tradeDueAfterOneYear",
        "hospitalFoundationHealthCareFoundation",
        "suppliesServices",
        "hospitalHealthCareFoundationDueOneYear",
        "receivablesbyVirtueHospitalFinancingLaw",
        "virtueFederalHealthService",
        "underHospitalFinancingLawDue1Year",
        "governmentalAid",
        "governmentalAidDueAfterOneYear",
        "nonGovernmentalAid",
        "nonGovernmentalAidDueAfterOneYear"
    })
    public static class ReceivablesFrom {

        @XmlElement(name = "Leasing")
        protected AmountType leasing;
        @XmlElement(name = "LeasingDueAfterOneYear")
        protected AmountType leasingDueAfterOneYear;
        @XmlElement(name = "SalesRealProperty")
        protected AmountType salesRealProperty;
        @XmlElement(name = "SalesRealPropertyDueAfterOneYear")
        protected AmountType salesRealPropertyDueAfterOneYear;
        @XmlElement(name = "Supervision")
        protected AmountType supervision;
        @XmlElement(name = "SupervisionDueAfterOneYear")
        protected AmountType supervisionDueAfterOneYear;
        @XmlElement(name = "OtherSuppliesServices")
        protected AmountType otherSuppliesServices;
        @XmlElement(name = "OtherSuppliesServicesDueAfterOneYear")
        protected AmountType otherSuppliesServicesDueAfterOneYear;
        @XmlElement(name = "Trade")
        protected AmountType trade;
        @XmlElement(name = "TradeDueAfterOneYear")
        protected AmountType tradeDueAfterOneYear;
        @XmlElement(name = "HospitalFoundationHealthCareFoundation")
        protected AmountType hospitalFoundationHealthCareFoundation;
        @XmlElement(name = "SuppliesServices")
        protected AmountType suppliesServices;
        @XmlElement(name = "HospitalHealthCareFoundationDueOneYear")
        protected AmountType hospitalHealthCareFoundationDueOneYear;
        @XmlElement(name = "ReceivablesbyVirtueHospitalFinancingLaw")
        protected AmountType receivablesbyVirtueHospitalFinancingLaw;
        @XmlElement(name = "VirtueFederalHealthService")
        protected AmountType virtueFederalHealthService;
        @XmlElement(name = "UnderHospitalFinancingLawDue1Year")
        protected AmountType underHospitalFinancingLawDue1Year;
        @XmlElement(name = "GovernmentalAid")
        protected AmountType governmentalAid;
        @XmlElement(name = "GovernmentalAidDueAfterOneYear")
        protected AmountType governmentalAidDueAfterOneYear;
        @XmlElement(name = "NonGovernmentalAid")
        protected AmountType nonGovernmentalAid;
        @XmlElement(name = "NonGovernmentalAidDueAfterOneYear")
        protected AmountType nonGovernmentalAidDueAfterOneYear;

        /**
         * Gets the value of the leasing property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getLeasing() {
            return leasing;
        }

        /**
         * Sets the value of the leasing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setLeasing(AmountType value) {
            this.leasing = value;
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
         * Gets the value of the salesRealProperty property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSalesRealProperty() {
            return salesRealProperty;
        }

        /**
         * Sets the value of the salesRealProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSalesRealProperty(AmountType value) {
            this.salesRealProperty = value;
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
         * Gets the value of the supervision property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSupervision() {
            return supervision;
        }

        /**
         * Sets the value of the supervision property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSupervision(AmountType value) {
            this.supervision = value;
        }

        /**
         * Gets the value of the supervisionDueAfterOneYear property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSupervisionDueAfterOneYear() {
            return supervisionDueAfterOneYear;
        }

        /**
         * Sets the value of the supervisionDueAfterOneYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSupervisionDueAfterOneYear(AmountType value) {
            this.supervisionDueAfterOneYear = value;
        }

        /**
         * Gets the value of the otherSuppliesServices property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherSuppliesServices() {
            return otherSuppliesServices;
        }

        /**
         * Sets the value of the otherSuppliesServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherSuppliesServices(AmountType value) {
            this.otherSuppliesServices = value;
        }

        /**
         * Gets the value of the otherSuppliesServicesDueAfterOneYear property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getOtherSuppliesServicesDueAfterOneYear() {
            return otherSuppliesServicesDueAfterOneYear;
        }

        /**
         * Sets the value of the otherSuppliesServicesDueAfterOneYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setOtherSuppliesServicesDueAfterOneYear(AmountType value) {
            this.otherSuppliesServicesDueAfterOneYear = value;
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
         * Gets the value of the hospitalFoundationHealthCareFoundation property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getHospitalFoundationHealthCareFoundation() {
            return hospitalFoundationHealthCareFoundation;
        }

        /**
         * Sets the value of the hospitalFoundationHealthCareFoundation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setHospitalFoundationHealthCareFoundation(AmountType value) {
            this.hospitalFoundationHealthCareFoundation = value;
        }

        /**
         * Gets the value of the suppliesServices property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getSuppliesServices() {
            return suppliesServices;
        }

        /**
         * Sets the value of the suppliesServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setSuppliesServices(AmountType value) {
            this.suppliesServices = value;
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
         * Gets the value of the receivablesbyVirtueHospitalFinancingLaw property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getReceivablesbyVirtueHospitalFinancingLaw() {
            return receivablesbyVirtueHospitalFinancingLaw;
        }

        /**
         * Sets the value of the receivablesbyVirtueHospitalFinancingLaw property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setReceivablesbyVirtueHospitalFinancingLaw(AmountType value) {
            this.receivablesbyVirtueHospitalFinancingLaw = value;
        }

        /**
         * Gets the value of the virtueFederalHealthService property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getVirtueFederalHealthService() {
            return virtueFederalHealthService;
        }

        /**
         * Sets the value of the virtueFederalHealthService property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setVirtueFederalHealthService(AmountType value) {
            this.virtueFederalHealthService = value;
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
         * Gets the value of the governmentalAid property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getGovernmentalAid() {
            return governmentalAid;
        }

        /**
         * Sets the value of the governmentalAid property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setGovernmentalAid(AmountType value) {
            this.governmentalAid = value;
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
         * Gets the value of the nonGovernmentalAid property.
         * 
         * @return
         *     possible object is
         *     {@link AmountType }
         *     
         */
        public AmountType getNonGovernmentalAid() {
            return nonGovernmentalAid;
        }

        /**
         * Sets the value of the nonGovernmentalAid property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountType }
         *     
         */
        public void setNonGovernmentalAid(AmountType value) {
            this.nonGovernmentalAid = value;
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

    }

}
