
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementOfEarningsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementOfEarningsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfitToBeAppropriated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossToBeAppropriated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AccumulatedLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferFromNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferFromCapitalSharePremiumAccount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferFromReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationToNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationToCapitalSharePremium" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationToLegalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationToOtherReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitToBeAccumulated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossToBeAccumulated" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OwnersContributioninLoss" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InterventioninLossbyParentCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DistributionProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Dividends" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DirectorsEntitlements" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAllocations" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferProfitToParentCompany" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitLossForAppropriation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitLossForPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitLossCarriedForwardFromPreviousPeriod" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferFromEquityCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FromCapitalSharePremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FromReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferToEquityCapital" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ToCapitalSharePremiums" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ToLegalReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ToOtherReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ResultToBeCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitToBeCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossToBeCarriedForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossTakeninChargebyAssoc" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitForDistribution" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="DirectorsManagers" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitForYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossForYear" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ProfitBroughtForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="LossBroughtForward" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransfersFromReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransfersFromCapitalorSharePremiumAccount" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalIncome" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationsToReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalExpenses" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="Others" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="InitialRetainedEarnings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherAdditions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="OtherDeductions" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinalRetainedEarnings" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="TransferToCapitalLiableReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AppropriationProfit" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EarningsLossPerShare" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementOfEarningsType", propOrder = {
    "profitToBeAppropriated",
    "lossToBeAppropriated",
    "netProfit",
    "netLoss",
    "accumulatedProfit",
    "accumulatedLoss",
    "transferFromNetWorth",
    "transferFromCapitalSharePremiumAccount",
    "transferFromReserves",
    "appropriationToNetWorth",
    "appropriationToCapitalSharePremium",
    "appropriationToLegalReserves",
    "appropriationToOtherReserves",
    "profitToBeAccumulated",
    "lossToBeAccumulated",
    "ownersContributioninLoss",
    "interventioninLossbyParentCompany",
    "distributionProfit",
    "dividends",
    "directorsEntitlements",
    "otherAllocations",
    "transferProfitToParentCompany",
    "profitLossForAppropriation",
    "profitLossForPeriod",
    "profitLossCarriedForwardFromPreviousPeriod",
    "transferFromEquityCapital",
    "fromCapitalSharePremiums",
    "fromReserves",
    "transferToEquityCapital",
    "toCapitalSharePremiums",
    "toLegalReserves",
    "toOtherReserves",
    "resultToBeCarriedForward",
    "profitToBeCarriedForward",
    "lossToBeCarriedForward",
    "lossTakeninChargebyAssoc",
    "profitForDistribution",
    "directorsManagers",
    "profitForYear",
    "lossForYear",
    "profitBroughtForward",
    "lossBroughtForward",
    "transfersFromReserves",
    "transfersFromCapitalorSharePremiumAccount",
    "totalIncome",
    "appropriationsToReserves",
    "totalExpenses",
    "others",
    "initialRetainedEarnings",
    "otherAdditions",
    "otherDeductions",
    "finalRetainedEarnings",
    "transferToCapitalLiableReserves",
    "appropriationProfit",
    "earningsLossPerShare"
})
public class StatementOfEarningsType {

    @XmlElement(name = "ProfitToBeAppropriated")
    protected AmountType profitToBeAppropriated;
    @XmlElement(name = "LossToBeAppropriated")
    protected AmountType lossToBeAppropriated;
    @XmlElement(name = "NetProfit")
    protected AmountType netProfit;
    @XmlElement(name = "NetLoss")
    protected AmountType netLoss;
    @XmlElement(name = "AccumulatedProfit")
    protected AmountType accumulatedProfit;
    @XmlElement(name = "AccumulatedLoss")
    protected AmountType accumulatedLoss;
    @XmlElement(name = "TransferFromNetWorth")
    protected AmountType transferFromNetWorth;
    @XmlElement(name = "TransferFromCapitalSharePremiumAccount")
    protected AmountType transferFromCapitalSharePremiumAccount;
    @XmlElement(name = "TransferFromReserves")
    protected AmountType transferFromReserves;
    @XmlElement(name = "AppropriationToNetWorth")
    protected AmountType appropriationToNetWorth;
    @XmlElement(name = "AppropriationToCapitalSharePremium")
    protected AmountType appropriationToCapitalSharePremium;
    @XmlElement(name = "AppropriationToLegalReserves")
    protected AmountType appropriationToLegalReserves;
    @XmlElement(name = "AppropriationToOtherReserves")
    protected AmountType appropriationToOtherReserves;
    @XmlElement(name = "ProfitToBeAccumulated")
    protected AmountType profitToBeAccumulated;
    @XmlElement(name = "LossToBeAccumulated")
    protected AmountType lossToBeAccumulated;
    @XmlElement(name = "OwnersContributioninLoss")
    protected AmountType ownersContributioninLoss;
    @XmlElement(name = "InterventioninLossbyParentCompany")
    protected AmountType interventioninLossbyParentCompany;
    @XmlElement(name = "DistributionProfit")
    protected AmountType distributionProfit;
    @XmlElement(name = "Dividends")
    protected AmountType dividends;
    @XmlElement(name = "DirectorsEntitlements")
    protected AmountType directorsEntitlements;
    @XmlElement(name = "OtherAllocations")
    protected AmountType otherAllocations;
    @XmlElement(name = "TransferProfitToParentCompany")
    protected AmountType transferProfitToParentCompany;
    @XmlElement(name = "ProfitLossForAppropriation")
    protected AmountType profitLossForAppropriation;
    @XmlElement(name = "ProfitLossForPeriod")
    protected AmountType profitLossForPeriod;
    @XmlElement(name = "ProfitLossCarriedForwardFromPreviousPeriod")
    protected AmountType profitLossCarriedForwardFromPreviousPeriod;
    @XmlElement(name = "TransferFromEquityCapital")
    protected AmountType transferFromEquityCapital;
    @XmlElement(name = "FromCapitalSharePremiums")
    protected AmountType fromCapitalSharePremiums;
    @XmlElement(name = "FromReserves")
    protected AmountType fromReserves;
    @XmlElement(name = "TransferToEquityCapital")
    protected AmountType transferToEquityCapital;
    @XmlElement(name = "ToCapitalSharePremiums")
    protected AmountType toCapitalSharePremiums;
    @XmlElement(name = "ToLegalReserves")
    protected AmountType toLegalReserves;
    @XmlElement(name = "ToOtherReserves")
    protected AmountType toOtherReserves;
    @XmlElement(name = "ResultToBeCarriedForward")
    protected AmountType resultToBeCarriedForward;
    @XmlElement(name = "ProfitToBeCarriedForward")
    protected AmountType profitToBeCarriedForward;
    @XmlElement(name = "LossToBeCarriedForward")
    protected AmountType lossToBeCarriedForward;
    @XmlElement(name = "LossTakeninChargebyAssoc")
    protected AmountType lossTakeninChargebyAssoc;
    @XmlElement(name = "ProfitForDistribution")
    protected AmountType profitForDistribution;
    @XmlElement(name = "DirectorsManagers")
    protected AmountType directorsManagers;
    @XmlElement(name = "ProfitForYear")
    protected AmountType profitForYear;
    @XmlElement(name = "LossForYear")
    protected AmountType lossForYear;
    @XmlElement(name = "ProfitBroughtForward")
    protected AmountType profitBroughtForward;
    @XmlElement(name = "LossBroughtForward")
    protected AmountType lossBroughtForward;
    @XmlElement(name = "TransfersFromReserves")
    protected AmountType transfersFromReserves;
    @XmlElement(name = "TransfersFromCapitalorSharePremiumAccount")
    protected AmountType transfersFromCapitalorSharePremiumAccount;
    @XmlElement(name = "TotalIncome")
    protected AmountType totalIncome;
    @XmlElement(name = "AppropriationsToReserves")
    protected AmountType appropriationsToReserves;
    @XmlElement(name = "TotalExpenses")
    protected AmountType totalExpenses;
    @XmlElement(name = "Others")
    protected AmountType others;
    @XmlElement(name = "InitialRetainedEarnings")
    protected AmountType initialRetainedEarnings;
    @XmlElement(name = "OtherAdditions")
    protected AmountType otherAdditions;
    @XmlElement(name = "OtherDeductions")
    protected AmountType otherDeductions;
    @XmlElement(name = "FinalRetainedEarnings")
    protected AmountType finalRetainedEarnings;
    @XmlElement(name = "TransferToCapitalLiableReserves")
    protected AmountType transferToCapitalLiableReserves;
    @XmlElement(name = "AppropriationProfit")
    protected AmountType appropriationProfit;
    @XmlElement(name = "EarningsLossPerShare")
    protected AmountType earningsLossPerShare;

    /**
     * Gets the value of the profitToBeAppropriated property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitToBeAppropriated() {
        return profitToBeAppropriated;
    }

    /**
     * Sets the value of the profitToBeAppropriated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitToBeAppropriated(AmountType value) {
        this.profitToBeAppropriated = value;
    }

    /**
     * Gets the value of the lossToBeAppropriated property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossToBeAppropriated() {
        return lossToBeAppropriated;
    }

    /**
     * Sets the value of the lossToBeAppropriated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossToBeAppropriated(AmountType value) {
        this.lossToBeAppropriated = value;
    }

    /**
     * Gets the value of the netProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetProfit() {
        return netProfit;
    }

    /**
     * Sets the value of the netProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetProfit(AmountType value) {
        this.netProfit = value;
    }

    /**
     * Gets the value of the netLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetLoss() {
        return netLoss;
    }

    /**
     * Sets the value of the netLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetLoss(AmountType value) {
        this.netLoss = value;
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
     * Gets the value of the transferFromNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferFromNetWorth() {
        return transferFromNetWorth;
    }

    /**
     * Sets the value of the transferFromNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferFromNetWorth(AmountType value) {
        this.transferFromNetWorth = value;
    }

    /**
     * Gets the value of the transferFromCapitalSharePremiumAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferFromCapitalSharePremiumAccount() {
        return transferFromCapitalSharePremiumAccount;
    }

    /**
     * Sets the value of the transferFromCapitalSharePremiumAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferFromCapitalSharePremiumAccount(AmountType value) {
        this.transferFromCapitalSharePremiumAccount = value;
    }

    /**
     * Gets the value of the transferFromReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferFromReserves() {
        return transferFromReserves;
    }

    /**
     * Sets the value of the transferFromReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferFromReserves(AmountType value) {
        this.transferFromReserves = value;
    }

    /**
     * Gets the value of the appropriationToNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppropriationToNetWorth() {
        return appropriationToNetWorth;
    }

    /**
     * Sets the value of the appropriationToNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppropriationToNetWorth(AmountType value) {
        this.appropriationToNetWorth = value;
    }

    /**
     * Gets the value of the appropriationToCapitalSharePremium property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppropriationToCapitalSharePremium() {
        return appropriationToCapitalSharePremium;
    }

    /**
     * Sets the value of the appropriationToCapitalSharePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppropriationToCapitalSharePremium(AmountType value) {
        this.appropriationToCapitalSharePremium = value;
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
     * Gets the value of the appropriationToOtherReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppropriationToOtherReserves() {
        return appropriationToOtherReserves;
    }

    /**
     * Sets the value of the appropriationToOtherReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppropriationToOtherReserves(AmountType value) {
        this.appropriationToOtherReserves = value;
    }

    /**
     * Gets the value of the profitToBeAccumulated property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitToBeAccumulated() {
        return profitToBeAccumulated;
    }

    /**
     * Sets the value of the profitToBeAccumulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitToBeAccumulated(AmountType value) {
        this.profitToBeAccumulated = value;
    }

    /**
     * Gets the value of the lossToBeAccumulated property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossToBeAccumulated() {
        return lossToBeAccumulated;
    }

    /**
     * Sets the value of the lossToBeAccumulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossToBeAccumulated(AmountType value) {
        this.lossToBeAccumulated = value;
    }

    /**
     * Gets the value of the ownersContributioninLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOwnersContributioninLoss() {
        return ownersContributioninLoss;
    }

    /**
     * Sets the value of the ownersContributioninLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOwnersContributioninLoss(AmountType value) {
        this.ownersContributioninLoss = value;
    }

    /**
     * Gets the value of the interventioninLossbyParentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInterventioninLossbyParentCompany() {
        return interventioninLossbyParentCompany;
    }

    /**
     * Sets the value of the interventioninLossbyParentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInterventioninLossbyParentCompany(AmountType value) {
        this.interventioninLossbyParentCompany = value;
    }

    /**
     * Gets the value of the distributionProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDistributionProfit() {
        return distributionProfit;
    }

    /**
     * Sets the value of the distributionProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDistributionProfit(AmountType value) {
        this.distributionProfit = value;
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
     * Gets the value of the directorsEntitlements property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectorsEntitlements() {
        return directorsEntitlements;
    }

    /**
     * Sets the value of the directorsEntitlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectorsEntitlements(AmountType value) {
        this.directorsEntitlements = value;
    }

    /**
     * Gets the value of the otherAllocations property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAllocations() {
        return otherAllocations;
    }

    /**
     * Sets the value of the otherAllocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAllocations(AmountType value) {
        this.otherAllocations = value;
    }

    /**
     * Gets the value of the transferProfitToParentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferProfitToParentCompany() {
        return transferProfitToParentCompany;
    }

    /**
     * Sets the value of the transferProfitToParentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferProfitToParentCompany(AmountType value) {
        this.transferProfitToParentCompany = value;
    }

    /**
     * Gets the value of the profitLossForAppropriation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitLossForAppropriation() {
        return profitLossForAppropriation;
    }

    /**
     * Sets the value of the profitLossForAppropriation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitLossForAppropriation(AmountType value) {
        this.profitLossForAppropriation = value;
    }

    /**
     * Gets the value of the profitLossForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitLossForPeriod() {
        return profitLossForPeriod;
    }

    /**
     * Sets the value of the profitLossForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitLossForPeriod(AmountType value) {
        this.profitLossForPeriod = value;
    }

    /**
     * Gets the value of the profitLossCarriedForwardFromPreviousPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitLossCarriedForwardFromPreviousPeriod() {
        return profitLossCarriedForwardFromPreviousPeriod;
    }

    /**
     * Sets the value of the profitLossCarriedForwardFromPreviousPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitLossCarriedForwardFromPreviousPeriod(AmountType value) {
        this.profitLossCarriedForwardFromPreviousPeriod = value;
    }

    /**
     * Gets the value of the transferFromEquityCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferFromEquityCapital() {
        return transferFromEquityCapital;
    }

    /**
     * Sets the value of the transferFromEquityCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferFromEquityCapital(AmountType value) {
        this.transferFromEquityCapital = value;
    }

    /**
     * Gets the value of the fromCapitalSharePremiums property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFromCapitalSharePremiums() {
        return fromCapitalSharePremiums;
    }

    /**
     * Sets the value of the fromCapitalSharePremiums property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFromCapitalSharePremiums(AmountType value) {
        this.fromCapitalSharePremiums = value;
    }

    /**
     * Gets the value of the fromReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFromReserves() {
        return fromReserves;
    }

    /**
     * Sets the value of the fromReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFromReserves(AmountType value) {
        this.fromReserves = value;
    }

    /**
     * Gets the value of the transferToEquityCapital property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferToEquityCapital() {
        return transferToEquityCapital;
    }

    /**
     * Sets the value of the transferToEquityCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferToEquityCapital(AmountType value) {
        this.transferToEquityCapital = value;
    }

    /**
     * Gets the value of the toCapitalSharePremiums property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getToCapitalSharePremiums() {
        return toCapitalSharePremiums;
    }

    /**
     * Sets the value of the toCapitalSharePremiums property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setToCapitalSharePremiums(AmountType value) {
        this.toCapitalSharePremiums = value;
    }

    /**
     * Gets the value of the toLegalReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getToLegalReserves() {
        return toLegalReserves;
    }

    /**
     * Sets the value of the toLegalReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setToLegalReserves(AmountType value) {
        this.toLegalReserves = value;
    }

    /**
     * Gets the value of the toOtherReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getToOtherReserves() {
        return toOtherReserves;
    }

    /**
     * Sets the value of the toOtherReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setToOtherReserves(AmountType value) {
        this.toOtherReserves = value;
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
     * Gets the value of the profitToBeCarriedForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitToBeCarriedForward() {
        return profitToBeCarriedForward;
    }

    /**
     * Sets the value of the profitToBeCarriedForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitToBeCarriedForward(AmountType value) {
        this.profitToBeCarriedForward = value;
    }

    /**
     * Gets the value of the lossToBeCarriedForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossToBeCarriedForward() {
        return lossToBeCarriedForward;
    }

    /**
     * Sets the value of the lossToBeCarriedForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossToBeCarriedForward(AmountType value) {
        this.lossToBeCarriedForward = value;
    }

    /**
     * Gets the value of the lossTakeninChargebyAssoc property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossTakeninChargebyAssoc() {
        return lossTakeninChargebyAssoc;
    }

    /**
     * Sets the value of the lossTakeninChargebyAssoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossTakeninChargebyAssoc(AmountType value) {
        this.lossTakeninChargebyAssoc = value;
    }

    /**
     * Gets the value of the profitForDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitForDistribution() {
        return profitForDistribution;
    }

    /**
     * Sets the value of the profitForDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitForDistribution(AmountType value) {
        this.profitForDistribution = value;
    }

    /**
     * Gets the value of the directorsManagers property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDirectorsManagers() {
        return directorsManagers;
    }

    /**
     * Sets the value of the directorsManagers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDirectorsManagers(AmountType value) {
        this.directorsManagers = value;
    }

    /**
     * Gets the value of the profitForYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitForYear() {
        return profitForYear;
    }

    /**
     * Sets the value of the profitForYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitForYear(AmountType value) {
        this.profitForYear = value;
    }

    /**
     * Gets the value of the lossForYear property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossForYear() {
        return lossForYear;
    }

    /**
     * Sets the value of the lossForYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossForYear(AmountType value) {
        this.lossForYear = value;
    }

    /**
     * Gets the value of the profitBroughtForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getProfitBroughtForward() {
        return profitBroughtForward;
    }

    /**
     * Sets the value of the profitBroughtForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setProfitBroughtForward(AmountType value) {
        this.profitBroughtForward = value;
    }

    /**
     * Gets the value of the lossBroughtForward property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLossBroughtForward() {
        return lossBroughtForward;
    }

    /**
     * Sets the value of the lossBroughtForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLossBroughtForward(AmountType value) {
        this.lossBroughtForward = value;
    }

    /**
     * Gets the value of the transfersFromReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransfersFromReserves() {
        return transfersFromReserves;
    }

    /**
     * Sets the value of the transfersFromReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransfersFromReserves(AmountType value) {
        this.transfersFromReserves = value;
    }

    /**
     * Gets the value of the transfersFromCapitalorSharePremiumAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransfersFromCapitalorSharePremiumAccount() {
        return transfersFromCapitalorSharePremiumAccount;
    }

    /**
     * Sets the value of the transfersFromCapitalorSharePremiumAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransfersFromCapitalorSharePremiumAccount(AmountType value) {
        this.transfersFromCapitalorSharePremiumAccount = value;
    }

    /**
     * Gets the value of the totalIncome property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the value of the totalIncome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalIncome(AmountType value) {
        this.totalIncome = value;
    }

    /**
     * Gets the value of the appropriationsToReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppropriationsToReserves() {
        return appropriationsToReserves;
    }

    /**
     * Sets the value of the appropriationsToReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppropriationsToReserves(AmountType value) {
        this.appropriationsToReserves = value;
    }

    /**
     * Gets the value of the totalExpenses property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalExpenses() {
        return totalExpenses;
    }

    /**
     * Sets the value of the totalExpenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalExpenses(AmountType value) {
        this.totalExpenses = value;
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
     * Gets the value of the initialRetainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInitialRetainedEarnings() {
        return initialRetainedEarnings;
    }

    /**
     * Sets the value of the initialRetainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInitialRetainedEarnings(AmountType value) {
        this.initialRetainedEarnings = value;
    }

    /**
     * Gets the value of the otherAdditions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherAdditions() {
        return otherAdditions;
    }

    /**
     * Sets the value of the otherAdditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherAdditions(AmountType value) {
        this.otherAdditions = value;
    }

    /**
     * Gets the value of the otherDeductions property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOtherDeductions() {
        return otherDeductions;
    }

    /**
     * Sets the value of the otherDeductions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOtherDeductions(AmountType value) {
        this.otherDeductions = value;
    }

    /**
     * Gets the value of the finalRetainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinalRetainedEarnings() {
        return finalRetainedEarnings;
    }

    /**
     * Sets the value of the finalRetainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinalRetainedEarnings(AmountType value) {
        this.finalRetainedEarnings = value;
    }

    /**
     * Gets the value of the transferToCapitalLiableReserves property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTransferToCapitalLiableReserves() {
        return transferToCapitalLiableReserves;
    }

    /**
     * Sets the value of the transferToCapitalLiableReserves property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTransferToCapitalLiableReserves(AmountType value) {
        this.transferToCapitalLiableReserves = value;
    }

    /**
     * Gets the value of the appropriationProfit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAppropriationProfit() {
        return appropriationProfit;
    }

    /**
     * Sets the value of the appropriationProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAppropriationProfit(AmountType value) {
        this.appropriationProfit = value;
    }

    /**
     * Gets the value of the earningsLossPerShare property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEarningsLossPerShare() {
        return earningsLossPerShare;
    }

    /**
     * Sets the value of the earningsLossPerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEarningsLossPerShare(AmountType value) {
        this.earningsLossPerShare = value;
    }

}
