
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheetDtldEquityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheetDtldEquityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapitalStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdditionalPaidInCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Reserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RetainedEarnings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InvestmentGrants" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetWorthorTotalEquity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IssuedCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UncalledCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RevaluationReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LegalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesNotAvailable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesForPurchaseOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherReservesNotAvailable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UntaxedReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvailableReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ShareholdersEquity" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Capital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SharePremiumAccount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RevaluationSurpluses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LegalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnavailableReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Others" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="RetainedProfitLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="UnavailableReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AvailableReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MathematicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumReserveReservesForSuspendedRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesForAmountsPayable" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionalMathematicalReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalReserveForLegalPension" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReconstituionFund" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherTechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PaidUpCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="StatutoryReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalLegalStatutoryReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherGroupNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GroupNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LiableNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="GeneralReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PriceDiffReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="SubscribedShareCapitalOrEquivalentProvision" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesForTheCompanysOwnTheHoldingCompanysShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitLossBroughtForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitLossForThePeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NonLifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ClaimsReserve" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReserveForProfitSharingRefunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EqualizationReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LifeInsurance" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PremiumReserveOfComplementaryInsurances" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReserveForAmountsToBePaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TechnicalResForInvestRisksByInsCoPensionFund" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesContributionsLinkedToInvestFundsMarketIndexes" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesDerivingFromPensionFundManagement" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="VoluntaryReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAdjustmentsNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredStock" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalSurplus" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TaxedReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ReservesForOwnShares" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OptionalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="MiscellaneousReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalReservesProvisions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AdvancedDividends" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Tier1Capital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProvisionForGeneralBankingRisks" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheetDtldEquityType", propOrder = {
    "capitalStock",
    "additionalPaidInCapital",
    "reserves",
    "retainedEarnings",
    "investmentGrants",
    "netWorthorTotalEquity",
    "issuedCapital",
    "uncalledCapital",
    "revaluationReserve",
    "legalReserves",
    "reservesNotAvailable",
    "reservesForPurchaseOwnShares",
    "otherReservesNotAvailable",
    "untaxedReserves",
    "availableReserves",
    "accumulatedProfit",
    "accumulatedLoss",
    "shareholdersEquity",
    "capital",
    "sharePremiumAccount",
    "revaluationSurpluses",
    "legalReserve",
    "unavailableReserves",
    "forOwnShares",
    "others",
    "retainedProfitLoss",
    "unavailableReserve",
    "availableReserve",
    "technicalProvisions",
    "mathematicalReserves",
    "premiumReserveReservesForSuspendedRisks",
    "reservesForAmountsPayable",
    "provisionalMathematicalReserve",
    "technicalReserveForLegalPension",
    "reconstituionFund",
    "otherTechnicalReserves",
    "paidUpCapital",
    "statutoryReserves",
    "totalLegalStatutoryReserves",
    "otherReserves",
    "otherGroupNetWorth",
    "groupNetWorth",
    "liableNetWorth",
    "generalReserve",
    "priceDiffReserve",
    "subscribedShareCapitalOrEquivalentProvision",
    "reservesForTheCompanysOwnTheHoldingCompanysShares",
    "profitLossBroughtForward",
    "profitLossForThePeriod",
    "technicalReserves",
    "nonLifeInsurance",
    "premiumReserve",
    "claimsReserve",
    "reserveForProfitSharingRefunds",
    "equalizationReserves",
    "lifeInsurance",
    "actuarialReserves",
    "premiumReserveOfComplementaryInsurances",
    "reserveForAmountsToBePaid",
    "technicalResForInvestRisksByInsCoPensionFund",
    "reservesContributionsLinkedToInvestFundsMarketIndexes",
    "reservesDerivingFromPensionFundManagement",
    "voluntaryReserves",
    "otherAdjustmentsNetWorth",
    "preferredStock",
    "capitalSurplus",
    "taxedReserves",
    "reservesForOwnShares",
    "optionalReserves",
    "miscellaneousReserves",
    "totalReservesProvisions",
    "advancedDividends",
    "tier1Capital",
    "provisionForGeneralBankingRisks"
})
public class BalanceSheetDtldEquityType {

    @XmlElement(name = "CapitalStock")
    protected AmountType capitalStock;
    @XmlElement(name = "AdditionalPaidInCapital")
    protected AmountType additionalPaidInCapital;
    @XmlElement(name = "Reserves")
    protected AmountType reserves;
    @XmlElement(name = "RetainedEarnings")
    protected AmountType retainedEarnings;
    @XmlElement(name = "InvestmentGrants")
    protected AmountType investmentGrants;
    @XmlElement(name = "NetWorthorTotalEquity")
    protected AmountType netWorthorTotalEquity;
    @XmlElement(name = "IssuedCapital")
    protected AmountType issuedCapital;
    @XmlElement(name = "UncalledCapital")
    protected AmountType uncalledCapital;
    @XmlElement(name = "RevaluationReserve")
    protected AmountType revaluationReserve;
    @XmlElement(name = "LegalReserves")
    protected AmountType legalReserves;
    @XmlElement(name = "ReservesNotAvailable")
    protected AmountType reservesNotAvailable;
    @XmlElement(name = "ReservesForPurchaseOwnShares")
    protected AmountType reservesForPurchaseOwnShares;
    @XmlElement(name = "OtherReservesNotAvailable")
    protected AmountType otherReservesNotAvailable;
    @XmlElement(name = "UntaxedReserves")
    protected AmountType untaxedReserves;
    @XmlElement(name = "AvailableReserves")
    protected AmountType availableReserves;
    @XmlElement(name = "AccumulatedProfit")
    protected AmountType accumulatedProfit;
    @XmlElement(name = "AccumulatedLoss")
    protected AmountType accumulatedLoss;
    @XmlElement(name = "ShareholdersEquity")
    protected AmountType shareholdersEquity;
    @XmlElement(name = "Capital")
    protected AmountType capital;
    @XmlElement(name = "SharePremiumAccount")
    protected AmountType sharePremiumAccount;
    @XmlElement(name = "RevaluationSurpluses")
    protected AmountType revaluationSurpluses;
    @XmlElement(name = "LegalReserve")
    protected AmountType legalReserve;
    @XmlElement(name = "UnavailableReserves")
    protected AmountType unavailableReserves;
    @XmlElement(name = "ForOwnShares")
    protected AmountType forOwnShares;
    @XmlElement(name = "Others")
    protected AmountType others;
    @XmlElement(name = "RetainedProfitLoss")
    protected AmountType retainedProfitLoss;
    @XmlElement(name = "UnavailableReserve")
    protected AmountType unavailableReserve;
    @XmlElement(name = "AvailableReserve")
    protected AmountType availableReserve;
    @XmlElement(name = "TechnicalProvisions")
    protected AmountType technicalProvisions;
    @XmlElement(name = "MathematicalReserves")
    protected AmountType mathematicalReserves;
    @XmlElement(name = "PremiumReserveReservesForSuspendedRisks")
    protected AmountType premiumReserveReservesForSuspendedRisks;
    @XmlElement(name = "ReservesForAmountsPayable")
    protected AmountType reservesForAmountsPayable;
    @XmlElement(name = "ProvisionalMathematicalReserve")
    protected AmountType provisionalMathematicalReserve;
    @XmlElement(name = "TechnicalReserveForLegalPension")
    protected AmountType technicalReserveForLegalPension;
    @XmlElement(name = "ReconstituionFund")
    protected AmountType reconstituionFund;
    @XmlElement(name = "OtherTechnicalReserves")
    protected AmountType otherTechnicalReserves;
    @XmlElement(name = "PaidUpCapital")
    protected AmountType paidUpCapital;
    @XmlElement(name = "StatutoryReserves")
    protected AmountType statutoryReserves;
    @XmlElement(name = "TotalLegalStatutoryReserves")
    protected AmountType totalLegalStatutoryReserves;
    @XmlElement(name = "OtherReserves")
    protected AmountType otherReserves;
    @XmlElement(name = "OtherGroupNetWorth")
    protected AmountType otherGroupNetWorth;
    @XmlElement(name = "GroupNetWorth")
    protected AmountType groupNetWorth;
    @XmlElement(name = "LiableNetWorth")
    protected AmountType liableNetWorth;
    @XmlElement(name = "GeneralReserve")
    protected AmountType generalReserve;
    @XmlElement(name = "PriceDiffReserve")
    protected AmountType priceDiffReserve;
    @XmlElement(name = "SubscribedShareCapitalOrEquivalentProvision")
    protected AmountType subscribedShareCapitalOrEquivalentProvision;
    @XmlElement(name = "ReservesForTheCompanysOwnTheHoldingCompanysShares")
    protected AmountType reservesForTheCompanysOwnTheHoldingCompanysShares;
    @XmlElement(name = "ProfitLossBroughtForward")
    protected AmountType profitLossBroughtForward;
    @XmlElement(name = "ProfitLossForThePeriod")
    protected AmountType profitLossForThePeriod;
    @XmlElement(name = "TechnicalReserves")
    protected AmountType technicalReserves;
    @XmlElement(name = "NonLifeInsurance")
    protected AmountType nonLifeInsurance;
    @XmlElement(name = "PremiumReserve")
    protected AmountType premiumReserve;
    @XmlElement(name = "ClaimsReserve")
    protected AmountType claimsReserve;
    @XmlElement(name = "ReserveForProfitSharingRefunds")
    protected AmountType reserveForProfitSharingRefunds;
    @XmlElement(name = "EqualizationReserves")
    protected AmountType equalizationReserves;
    @XmlElement(name = "LifeInsurance")
    protected AmountType lifeInsurance;
    @XmlElement(name = "ActuarialReserves")
    protected AmountType actuarialReserves;
    @XmlElement(name = "PremiumReserveOfComplementaryInsurances")
    protected AmountType premiumReserveOfComplementaryInsurances;
    @XmlElement(name = "ReserveForAmountsToBePaid")
    protected AmountType reserveForAmountsToBePaid;
    @XmlElement(name = "TechnicalResForInvestRisksByInsCoPensionFund")
    protected AmountType technicalResForInvestRisksByInsCoPensionFund;
    @XmlElement(name = "ReservesContributionsLinkedToInvestFundsMarketIndexes")
    protected AmountType reservesContributionsLinkedToInvestFundsMarketIndexes;
    @XmlElement(name = "ReservesDerivingFromPensionFundManagement")
    protected AmountType reservesDerivingFromPensionFundManagement;
    @XmlElement(name = "VoluntaryReserves")
    protected AmountType voluntaryReserves;
    @XmlElement(name = "OtherAdjustmentsNetWorth")
    protected AmountType otherAdjustmentsNetWorth;
    @XmlElement(name = "PreferredStock")
    protected AmountType preferredStock;
    @XmlElement(name = "CapitalSurplus")
    protected AmountType capitalSurplus;
    @XmlElement(name = "TaxedReserves")
    protected AmountType taxedReserves;
    @XmlElement(name = "ReservesForOwnShares")
    protected AmountType reservesForOwnShares;
    @XmlElement(name = "OptionalReserves")
    protected AmountType optionalReserves;
    @XmlElement(name = "MiscellaneousReserves")
    protected AmountType miscellaneousReserves;
    @XmlElement(name = "TotalReservesProvisions")
    protected AmountType totalReservesProvisions;
    @XmlElement(name = "AdvancedDividends")
    protected AmountType advancedDividends;
    @XmlElement(name = "Tier1Capital")
    protected AmountType tier1Capital;
    @XmlElement(name = "ProvisionForGeneralBankingRisks")
    protected AmountType provisionForGeneralBankingRisks;

    /**
     * Gets the value of the capitalStock property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalStock() {
        return capitalStock;
    }

    /**
     * Sets the value of the capitalStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalStock(AmountType value) {
        this.capitalStock = value;
    }

    /**
     * Gets the value of the additionalPaidInCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdditionalPaidInCapital() {
        return additionalPaidInCapital;
    }

    /**
     * Sets the value of the additionalPaidInCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdditionalPaidInCapital(AmountType value) {
        this.additionalPaidInCapital = value;
    }

    /**
     * Gets the value of the reserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReserves() {
        return reserves;
    }

    /**
     * Sets the value of the reserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReserves(AmountType value) {
        this.reserves = value;
    }

    /**
     * Gets the value of the retainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRetainedEarnings() {
        return retainedEarnings;
    }

    /**
     * Sets the value of the retainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRetainedEarnings(AmountType value) {
        this.retainedEarnings = value;
    }

    /**
     * Gets the value of the investmentGrants property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInvestmentGrants() {
        return investmentGrants;
    }

    /**
     * Sets the value of the investmentGrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInvestmentGrants(AmountType value) {
        this.investmentGrants = value;
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
     * Gets the value of the uncalledCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUncalledCapital() {
        return uncalledCapital;
    }

    /**
     * Sets the value of the uncalledCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUncalledCapital(AmountType value) {
        this.uncalledCapital = value;
    }

    /**
     * Gets the value of the revaluationReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRevaluationReserve() {
        return revaluationReserve;
    }

    /**
     * Sets the value of the revaluationReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRevaluationReserve(AmountType value) {
        this.revaluationReserve = value;
    }

    /**
     * Gets the value of the legalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLegalReserves() {
        return legalReserves;
    }

    /**
     * Sets the value of the legalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLegalReserves(AmountType value) {
        this.legalReserves = value;
    }

    /**
     * Gets the value of the reservesNotAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesNotAvailable() {
        return reservesNotAvailable;
    }

    /**
     * Sets the value of the reservesNotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesNotAvailable(AmountType value) {
        this.reservesNotAvailable = value;
    }

    /**
     * Gets the value of the reservesForPurchaseOwnShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesForPurchaseOwnShares() {
        return reservesForPurchaseOwnShares;
    }

    /**
     * Sets the value of the reservesForPurchaseOwnShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesForPurchaseOwnShares(AmountType value) {
        this.reservesForPurchaseOwnShares = value;
    }

    /**
     * Gets the value of the otherReservesNotAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherReservesNotAvailable() {
        return otherReservesNotAvailable;
    }

    /**
     * Sets the value of the otherReservesNotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherReservesNotAvailable(AmountType value) {
        this.otherReservesNotAvailable = value;
    }

    /**
     * Gets the value of the untaxedReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUntaxedReserves() {
        return untaxedReserves;
    }

    /**
     * Sets the value of the untaxedReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUntaxedReserves(AmountType value) {
        this.untaxedReserves = value;
    }

    /**
     * Gets the value of the availableReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAvailableReserves() {
        return availableReserves;
    }

    /**
     * Sets the value of the availableReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAvailableReserves(AmountType value) {
        this.availableReserves = value;
    }

    /**
     * Gets the value of the accumulatedProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccumulatedProfit() {
        return accumulatedProfit;
    }

    /**
     * Sets the value of the accumulatedProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccumulatedProfit(AmountType value) {
        this.accumulatedProfit = value;
    }

    /**
     * Gets the value of the accumulatedLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAccumulatedLoss() {
        return accumulatedLoss;
    }

    /**
     * Sets the value of the accumulatedLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAccumulatedLoss(AmountType value) {
        this.accumulatedLoss = value;
    }

    /**
     * Gets the value of the shareholdersEquity property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShareholdersEquity() {
        return shareholdersEquity;
    }

    /**
     * Sets the value of the shareholdersEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShareholdersEquity(AmountType value) {
        this.shareholdersEquity = value;
    }

    /**
     * Gets the value of the capital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapital() {
        return capital;
    }

    /**
     * Sets the value of the capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapital(AmountType value) {
        this.capital = value;
    }

    /**
     * Gets the value of the sharePremiumAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSharePremiumAccount() {
        return sharePremiumAccount;
    }

    /**
     * Sets the value of the sharePremiumAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSharePremiumAccount(AmountType value) {
        this.sharePremiumAccount = value;
    }

    /**
     * Gets the value of the revaluationSurpluses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRevaluationSurpluses() {
        return revaluationSurpluses;
    }

    /**
     * Sets the value of the revaluationSurpluses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRevaluationSurpluses(AmountType value) {
        this.revaluationSurpluses = value;
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
     * Gets the value of the unavailableReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnavailableReserves() {
        return unavailableReserves;
    }

    /**
     * Sets the value of the unavailableReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnavailableReserves(AmountType value) {
        this.unavailableReserves = value;
    }

    /**
     * Gets the value of the forOwnShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getForOwnShares() {
        return forOwnShares;
    }

    /**
     * Sets the value of the forOwnShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setForOwnShares(AmountType value) {
        this.forOwnShares = value;
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
     * Gets the value of the unavailableReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnavailableReserve() {
        return unavailableReserve;
    }

    /**
     * Sets the value of the unavailableReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnavailableReserve(AmountType value) {
        this.unavailableReserve = value;
    }

    /**
     * Gets the value of the availableReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAvailableReserve() {
        return availableReserve;
    }

    /**
     * Sets the value of the availableReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAvailableReserve(AmountType value) {
        this.availableReserve = value;
    }

    /**
     * Gets the value of the technicalProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalProvisions() {
        return technicalProvisions;
    }

    /**
     * Sets the value of the technicalProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalProvisions(AmountType value) {
        this.technicalProvisions = value;
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
     * Gets the value of the premiumReserveReservesForSuspendedRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumReserveReservesForSuspendedRisks() {
        return premiumReserveReservesForSuspendedRisks;
    }

    /**
     * Sets the value of the premiumReserveReservesForSuspendedRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumReserveReservesForSuspendedRisks(AmountType value) {
        this.premiumReserveReservesForSuspendedRisks = value;
    }

    /**
     * Gets the value of the reservesForAmountsPayable property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesForAmountsPayable() {
        return reservesForAmountsPayable;
    }

    /**
     * Sets the value of the reservesForAmountsPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesForAmountsPayable(AmountType value) {
        this.reservesForAmountsPayable = value;
    }

    /**
     * Gets the value of the provisionalMathematicalReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionalMathematicalReserve() {
        return provisionalMathematicalReserve;
    }

    /**
     * Sets the value of the provisionalMathematicalReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionalMathematicalReserve(AmountType value) {
        this.provisionalMathematicalReserve = value;
    }

    /**
     * Gets the value of the technicalReserveForLegalPension property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalReserveForLegalPension() {
        return technicalReserveForLegalPension;
    }

    /**
     * Sets the value of the technicalReserveForLegalPension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalReserveForLegalPension(AmountType value) {
        this.technicalReserveForLegalPension = value;
    }

    /**
     * Gets the value of the reconstituionFund property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReconstituionFund() {
        return reconstituionFund;
    }

    /**
     * Sets the value of the reconstituionFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReconstituionFund(AmountType value) {
        this.reconstituionFund = value;
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
     * Gets the value of the paidUpCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaidUpCapital() {
        return paidUpCapital;
    }

    /**
     * Sets the value of the paidUpCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaidUpCapital(AmountType value) {
        this.paidUpCapital = value;
    }

    /**
     * Gets the value of the statutoryReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStatutoryReserves() {
        return statutoryReserves;
    }

    /**
     * Sets the value of the statutoryReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStatutoryReserves(AmountType value) {
        this.statutoryReserves = value;
    }

    /**
     * Gets the value of the totalLegalStatutoryReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLegalStatutoryReserves() {
        return totalLegalStatutoryReserves;
    }

    /**
     * Sets the value of the totalLegalStatutoryReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLegalStatutoryReserves(AmountType value) {
        this.totalLegalStatutoryReserves = value;
    }

    /**
     * Gets the value of the otherReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherReserves() {
        return otherReserves;
    }

    /**
     * Sets the value of the otherReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherReserves(AmountType value) {
        this.otherReserves = value;
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
     * Gets the value of the subscribedShareCapitalOrEquivalentProvision property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubscribedShareCapitalOrEquivalentProvision() {
        return subscribedShareCapitalOrEquivalentProvision;
    }

    /**
     * Sets the value of the subscribedShareCapitalOrEquivalentProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubscribedShareCapitalOrEquivalentProvision(AmountType value) {
        this.subscribedShareCapitalOrEquivalentProvision = value;
    }

    /**
     * Gets the value of the reservesForTheCompanysOwnTheHoldingCompanysShares property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesForTheCompanysOwnTheHoldingCompanysShares() {
        return reservesForTheCompanysOwnTheHoldingCompanysShares;
    }

    /**
     * Sets the value of the reservesForTheCompanysOwnTheHoldingCompanysShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesForTheCompanysOwnTheHoldingCompanysShares(AmountType value) {
        this.reservesForTheCompanysOwnTheHoldingCompanysShares = value;
    }

    /**
     * Gets the value of the profitLossBroughtForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitLossBroughtForward() {
        return profitLossBroughtForward;
    }

    /**
     * Sets the value of the profitLossBroughtForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitLossBroughtForward(AmountType value) {
        this.profitLossBroughtForward = value;
    }

    /**
     * Gets the value of the profitLossForThePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitLossForThePeriod() {
        return profitLossForThePeriod;
    }

    /**
     * Sets the value of the profitLossForThePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitLossForThePeriod(AmountType value) {
        this.profitLossForThePeriod = value;
    }

    /**
     * Gets the value of the technicalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalReserves() {
        return technicalReserves;
    }

    /**
     * Sets the value of the technicalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalReserves(AmountType value) {
        this.technicalReserves = value;
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
     * Gets the value of the premiumReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumReserve() {
        return premiumReserve;
    }

    /**
     * Sets the value of the premiumReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumReserve(AmountType value) {
        this.premiumReserve = value;
    }

    /**
     * Gets the value of the claimsReserve property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getClaimsReserve() {
        return claimsReserve;
    }

    /**
     * Sets the value of the claimsReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setClaimsReserve(AmountType value) {
        this.claimsReserve = value;
    }

    /**
     * Gets the value of the reserveForProfitSharingRefunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReserveForProfitSharingRefunds() {
        return reserveForProfitSharingRefunds;
    }

    /**
     * Sets the value of the reserveForProfitSharingRefunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReserveForProfitSharingRefunds(AmountType value) {
        this.reserveForProfitSharingRefunds = value;
    }

    /**
     * Gets the value of the equalizationReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEqualizationReserves() {
        return equalizationReserves;
    }

    /**
     * Sets the value of the equalizationReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEqualizationReserves(AmountType value) {
        this.equalizationReserves = value;
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
     * Gets the value of the premiumReserveOfComplementaryInsurances property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPremiumReserveOfComplementaryInsurances() {
        return premiumReserveOfComplementaryInsurances;
    }

    /**
     * Sets the value of the premiumReserveOfComplementaryInsurances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPremiumReserveOfComplementaryInsurances(AmountType value) {
        this.premiumReserveOfComplementaryInsurances = value;
    }

    /**
     * Gets the value of the reserveForAmountsToBePaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReserveForAmountsToBePaid() {
        return reserveForAmountsToBePaid;
    }

    /**
     * Sets the value of the reserveForAmountsToBePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReserveForAmountsToBePaid(AmountType value) {
        this.reserveForAmountsToBePaid = value;
    }

    /**
     * Gets the value of the technicalResForInvestRisksByInsCoPensionFund property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTechnicalResForInvestRisksByInsCoPensionFund() {
        return technicalResForInvestRisksByInsCoPensionFund;
    }

    /**
     * Sets the value of the technicalResForInvestRisksByInsCoPensionFund property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTechnicalResForInvestRisksByInsCoPensionFund(AmountType value) {
        this.technicalResForInvestRisksByInsCoPensionFund = value;
    }

    /**
     * Gets the value of the reservesContributionsLinkedToInvestFundsMarketIndexes property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesContributionsLinkedToInvestFundsMarketIndexes() {
        return reservesContributionsLinkedToInvestFundsMarketIndexes;
    }

    /**
     * Sets the value of the reservesContributionsLinkedToInvestFundsMarketIndexes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesContributionsLinkedToInvestFundsMarketIndexes(AmountType value) {
        this.reservesContributionsLinkedToInvestFundsMarketIndexes = value;
    }

    /**
     * Gets the value of the reservesDerivingFromPensionFundManagement property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReservesDerivingFromPensionFundManagement() {
        return reservesDerivingFromPensionFundManagement;
    }

    /**
     * Sets the value of the reservesDerivingFromPensionFundManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReservesDerivingFromPensionFundManagement(AmountType value) {
        this.reservesDerivingFromPensionFundManagement = value;
    }

    /**
     * Gets the value of the voluntaryReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getVoluntaryReserves() {
        return voluntaryReserves;
    }

    /**
     * Sets the value of the voluntaryReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setVoluntaryReserves(AmountType value) {
        this.voluntaryReserves = value;
    }

    /**
     * Gets the value of the otherAdjustmentsNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAdjustmentsNetWorth() {
        return otherAdjustmentsNetWorth;
    }

    /**
     * Sets the value of the otherAdjustmentsNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAdjustmentsNetWorth(AmountType value) {
        this.otherAdjustmentsNetWorth = value;
    }

    /**
     * Gets the value of the preferredStock property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreferredStock() {
        return preferredStock;
    }

    /**
     * Sets the value of the preferredStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreferredStock(AmountType value) {
        this.preferredStock = value;
    }

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
     * Gets the value of the taxedReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTaxedReserves() {
        return taxedReserves;
    }

    /**
     * Sets the value of the taxedReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTaxedReserves(AmountType value) {
        this.taxedReserves = value;
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
     * Gets the value of the optionalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOptionalReserves() {
        return optionalReserves;
    }

    /**
     * Sets the value of the optionalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOptionalReserves(AmountType value) {
        this.optionalReserves = value;
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
     * Gets the value of the totalReservesProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalReservesProvisions() {
        return totalReservesProvisions;
    }

    /**
     * Sets the value of the totalReservesProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalReservesProvisions(AmountType value) {
        this.totalReservesProvisions = value;
    }

    /**
     * Gets the value of the advancedDividends property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAdvancedDividends() {
        return advancedDividends;
    }

    /**
     * Sets the value of the advancedDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAdvancedDividends(AmountType value) {
        this.advancedDividends = value;
    }

    /**
     * Gets the value of the tier1Capital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTier1Capital() {
        return tier1Capital;
    }

    /**
     * Sets the value of the tier1Capital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTier1Capital(AmountType value) {
        this.tier1Capital = value;
    }

    /**
     * Gets the value of the provisionForGeneralBankingRisks property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProvisionForGeneralBankingRisks() {
        return provisionForGeneralBankingRisks;
    }

    /**
     * Sets the value of the provisionForGeneralBankingRisks property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProvisionForGeneralBankingRisks(AmountType value) {
        this.provisionForGeneralBankingRisks = value;
    }

}
