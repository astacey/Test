
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashFlowStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashFlowStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetCashInflowFromOperatingActivities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetCashOutflowReturnOnInvestmentsServicingFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CashFlowTaxation" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="CapitalExpenditureFinancialInvestment" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="AcquisitionsDisposals" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="EquityDividendsPaid" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="NetCashInflowOutflowBeforeFinancing" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="ManagementLiquidResources" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="FinancingTreasury" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *         &lt;element name="IncreaseDecreaseinCash" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashFlowStatementType", propOrder = {
    "netCashInflowFromOperatingActivities",
    "netCashOutflowReturnOnInvestmentsServicingFunds",
    "cashFlowTaxation",
    "capitalExpenditureFinancialInvestment",
    "acquisitionsDisposals",
    "equityDividendsPaid",
    "netCashInflowOutflowBeforeFinancing",
    "managementLiquidResources",
    "financingTreasury",
    "increaseDecreaseinCash"
})
public class CashFlowStatementType {

    @XmlElement(name = "NetCashInflowFromOperatingActivities")
    protected AmountType netCashInflowFromOperatingActivities;
    @XmlElement(name = "NetCashOutflowReturnOnInvestmentsServicingFunds")
    protected AmountType netCashOutflowReturnOnInvestmentsServicingFunds;
    @XmlElement(name = "CashFlowTaxation")
    protected AmountType cashFlowTaxation;
    @XmlElement(name = "CapitalExpenditureFinancialInvestment")
    protected AmountType capitalExpenditureFinancialInvestment;
    @XmlElement(name = "AcquisitionsDisposals")
    protected AmountType acquisitionsDisposals;
    @XmlElement(name = "EquityDividendsPaid")
    protected AmountType equityDividendsPaid;
    @XmlElement(name = "NetCashInflowOutflowBeforeFinancing")
    protected AmountType netCashInflowOutflowBeforeFinancing;
    @XmlElement(name = "ManagementLiquidResources")
    protected AmountType managementLiquidResources;
    @XmlElement(name = "FinancingTreasury")
    protected AmountType financingTreasury;
    @XmlElement(name = "IncreaseDecreaseinCash")
    protected AmountType increaseDecreaseinCash;

    /**
     * Gets the value of the netCashInflowFromOperatingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetCashInflowFromOperatingActivities() {
        return netCashInflowFromOperatingActivities;
    }

    /**
     * Sets the value of the netCashInflowFromOperatingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetCashInflowFromOperatingActivities(AmountType value) {
        this.netCashInflowFromOperatingActivities = value;
    }

    /**
     * Gets the value of the netCashOutflowReturnOnInvestmentsServicingFunds property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetCashOutflowReturnOnInvestmentsServicingFunds() {
        return netCashOutflowReturnOnInvestmentsServicingFunds;
    }

    /**
     * Sets the value of the netCashOutflowReturnOnInvestmentsServicingFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetCashOutflowReturnOnInvestmentsServicingFunds(AmountType value) {
        this.netCashOutflowReturnOnInvestmentsServicingFunds = value;
    }

    /**
     * Gets the value of the cashFlowTaxation property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCashFlowTaxation() {
        return cashFlowTaxation;
    }

    /**
     * Sets the value of the cashFlowTaxation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCashFlowTaxation(AmountType value) {
        this.cashFlowTaxation = value;
    }

    /**
     * Gets the value of the capitalExpenditureFinancialInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalExpenditureFinancialInvestment() {
        return capitalExpenditureFinancialInvestment;
    }

    /**
     * Sets the value of the capitalExpenditureFinancialInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalExpenditureFinancialInvestment(AmountType value) {
        this.capitalExpenditureFinancialInvestment = value;
    }

    /**
     * Gets the value of the acquisitionsDisposals property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcquisitionsDisposals() {
        return acquisitionsDisposals;
    }

    /**
     * Sets the value of the acquisitionsDisposals property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcquisitionsDisposals(AmountType value) {
        this.acquisitionsDisposals = value;
    }

    /**
     * Gets the value of the equityDividendsPaid property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEquityDividendsPaid() {
        return equityDividendsPaid;
    }

    /**
     * Sets the value of the equityDividendsPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEquityDividendsPaid(AmountType value) {
        this.equityDividendsPaid = value;
    }

    /**
     * Gets the value of the netCashInflowOutflowBeforeFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getNetCashInflowOutflowBeforeFinancing() {
        return netCashInflowOutflowBeforeFinancing;
    }

    /**
     * Sets the value of the netCashInflowOutflowBeforeFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setNetCashInflowOutflowBeforeFinancing(AmountType value) {
        this.netCashInflowOutflowBeforeFinancing = value;
    }

    /**
     * Gets the value of the managementLiquidResources property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getManagementLiquidResources() {
        return managementLiquidResources;
    }

    /**
     * Sets the value of the managementLiquidResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setManagementLiquidResources(AmountType value) {
        this.managementLiquidResources = value;
    }

    /**
     * Gets the value of the financingTreasury property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinancingTreasury() {
        return financingTreasury;
    }

    /**
     * Sets the value of the financingTreasury property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinancingTreasury(AmountType value) {
        this.financingTreasury = value;
    }

    /**
     * Gets the value of the increaseDecreaseinCash property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getIncreaseDecreaseinCash() {
        return increaseDecreaseinCash;
    }

    /**
     * Sets the value of the increaseDecreaseinCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setIncreaseDecreaseinCash(AmountType value) {
        this.increaseDecreaseinCash = value;
    }

}
