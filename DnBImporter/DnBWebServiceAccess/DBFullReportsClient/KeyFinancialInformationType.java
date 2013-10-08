
package DBFullReportsClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This type carries important financial figures from the financial statement.
 * 
 * <p>Java class for KeyFinancialInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyFinancialInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TangibleNetworth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalEquity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Turnover" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GrossProfit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProfitorLoss" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFixedAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalCurrentAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LongTermDebt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalCurrentLiabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NetCurrentAssetsLiabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuickRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesNetworthPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesNetWorkingCapitalRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TangibleNetworthGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalEquityGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GrossProfitGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitorLossGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFixedAssetsGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssetsGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAssetsGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LongTermDebtGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilitiesGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetCurrentAssetsLiabilitiesGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentRatioGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QuickRatioGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentLiabilitiesNetworthPercentageGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesNetWorkingCapitalRatioGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeeQuantityGrowthRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyFinancialInformationType", propOrder = {
    "tangibleNetworth",
    "totalEquity",
    "turnover",
    "grossProfit",
    "profitorLoss",
    "totalFixedAssets",
    "totalCurrentAssets",
    "totalAssets",
    "longTermDebt",
    "totalCurrentLiabilities",
    "netCurrentAssetsLiabilities",
    "currentRatio",
    "quickRatio",
    "currentLiabilitiesNetworthPercentage",
    "salesNetWorkingCapitalRatio",
    "employeeQuantity",
    "tangibleNetworthGrowthRate",
    "totalEquityGrowthRate",
    "turnoverGrowthRate",
    "grossProfitGrowthRate",
    "profitorLossGrowthRate",
    "totalFixedAssetsGrowthRate",
    "totalCurrentAssetsGrowthRate",
    "totalAssetsGrowthRate",
    "longTermDebtGrowthRate",
    "totalCurrentLiabilitiesGrowthRate",
    "netCurrentAssetsLiabilitiesGrowthRate",
    "currentRatioGrowthRate",
    "quickRatioGrowthRate",
    "currentLiabilitiesNetworthPercentageGrowthRate",
    "salesNetWorkingCapitalRatioGrowthRate",
    "employeeQuantityGrowthRate"
})
public class KeyFinancialInformationType {

    @XmlElement(name = "TangibleNetworth")
    protected KeyFinancialInformationType.TangibleNetworth tangibleNetworth;
    @XmlElement(name = "TotalEquity")
    protected KeyFinancialInformationType.TotalEquity totalEquity;
    @XmlElement(name = "Turnover")
    protected KeyFinancialInformationType.Turnover turnover;
    @XmlElement(name = "GrossProfit")
    protected KeyFinancialInformationType.GrossProfit grossProfit;
    @XmlElement(name = "ProfitorLoss")
    protected KeyFinancialInformationType.ProfitorLoss profitorLoss;
    @XmlElement(name = "TotalFixedAssets")
    protected KeyFinancialInformationType.TotalFixedAssets totalFixedAssets;
    @XmlElement(name = "TotalCurrentAssets")
    protected KeyFinancialInformationType.TotalCurrentAssets totalCurrentAssets;
    @XmlElement(name = "TotalAssets")
    protected KeyFinancialInformationType.TotalAssets totalAssets;
    @XmlElement(name = "LongTermDebt")
    protected KeyFinancialInformationType.LongTermDebt longTermDebt;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected KeyFinancialInformationType.TotalCurrentLiabilities totalCurrentLiabilities;
    @XmlElement(name = "NetCurrentAssetsLiabilities")
    protected KeyFinancialInformationType.NetCurrentAssetsLiabilities netCurrentAssetsLiabilities;
    @XmlElement(name = "CurrentRatio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "QuickRatio")
    protected BigDecimal quickRatio;
    @XmlElement(name = "CurrentLiabilitiesNetworthPercentage")
    protected BigDecimal currentLiabilitiesNetworthPercentage;
    @XmlElement(name = "SalesNetWorkingCapitalRatio")
    protected BigDecimal salesNetWorkingCapitalRatio;
    @XmlElement(name = "EmployeeQuantity")
    protected BigInteger employeeQuantity;
    @XmlElement(name = "TangibleNetworthGrowthRate")
    protected BigDecimal tangibleNetworthGrowthRate;
    @XmlElement(name = "TotalEquityGrowthRate")
    protected BigDecimal totalEquityGrowthRate;
    @XmlElement(name = "TurnoverGrowthRate")
    protected BigDecimal turnoverGrowthRate;
    @XmlElement(name = "GrossProfitGrowthRate")
    protected BigDecimal grossProfitGrowthRate;
    @XmlElement(name = "ProfitorLossGrowthRate")
    protected BigDecimal profitorLossGrowthRate;
    @XmlElement(name = "TotalFixedAssetsGrowthRate")
    protected BigDecimal totalFixedAssetsGrowthRate;
    @XmlElement(name = "TotalCurrentAssetsGrowthRate")
    protected BigDecimal totalCurrentAssetsGrowthRate;
    @XmlElement(name = "TotalAssetsGrowthRate")
    protected BigDecimal totalAssetsGrowthRate;
    @XmlElement(name = "LongTermDebtGrowthRate")
    protected BigDecimal longTermDebtGrowthRate;
    @XmlElement(name = "TotalCurrentLiabilitiesGrowthRate")
    protected BigDecimal totalCurrentLiabilitiesGrowthRate;
    @XmlElement(name = "NetCurrentAssetsLiabilitiesGrowthRate")
    protected BigDecimal netCurrentAssetsLiabilitiesGrowthRate;
    @XmlElement(name = "CurrentRatioGrowthRate")
    protected BigDecimal currentRatioGrowthRate;
    @XmlElement(name = "QuickRatioGrowthRate")
    protected BigDecimal quickRatioGrowthRate;
    @XmlElement(name = "CurrentLiabilitiesNetworthPercentageGrowthRate")
    protected BigDecimal currentLiabilitiesNetworthPercentageGrowthRate;
    @XmlElement(name = "SalesNetWorkingCapitalRatioGrowthRate")
    protected BigDecimal salesNetWorkingCapitalRatioGrowthRate;
    @XmlElement(name = "EmployeeQuantityGrowthRate")
    protected BigDecimal employeeQuantityGrowthRate;

    /**
     * Gets the value of the tangibleNetworth property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TangibleNetworth }
     *     
     */
    public KeyFinancialInformationType.TangibleNetworth getTangibleNetworth() {
        return tangibleNetworth;
    }

    /**
     * Sets the value of the tangibleNetworth property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TangibleNetworth }
     *     
     */
    public void setTangibleNetworth(KeyFinancialInformationType.TangibleNetworth value) {
        this.tangibleNetworth = value;
    }

    /**
     * Gets the value of the totalEquity property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TotalEquity }
     *     
     */
    public KeyFinancialInformationType.TotalEquity getTotalEquity() {
        return totalEquity;
    }

    /**
     * Sets the value of the totalEquity property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TotalEquity }
     *     
     */
    public void setTotalEquity(KeyFinancialInformationType.TotalEquity value) {
        this.totalEquity = value;
    }

    /**
     * Gets the value of the turnover property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.Turnover }
     *     
     */
    public KeyFinancialInformationType.Turnover getTurnover() {
        return turnover;
    }

    /**
     * Sets the value of the turnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.Turnover }
     *     
     */
    public void setTurnover(KeyFinancialInformationType.Turnover value) {
        this.turnover = value;
    }

    /**
     * Gets the value of the grossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.GrossProfit }
     *     
     */
    public KeyFinancialInformationType.GrossProfit getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.GrossProfit }
     *     
     */
    public void setGrossProfit(KeyFinancialInformationType.GrossProfit value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the profitorLoss property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.ProfitorLoss }
     *     
     */
    public KeyFinancialInformationType.ProfitorLoss getProfitorLoss() {
        return profitorLoss;
    }

    /**
     * Sets the value of the profitorLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.ProfitorLoss }
     *     
     */
    public void setProfitorLoss(KeyFinancialInformationType.ProfitorLoss value) {
        this.profitorLoss = value;
    }

    /**
     * Gets the value of the totalFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TotalFixedAssets }
     *     
     */
    public KeyFinancialInformationType.TotalFixedAssets getTotalFixedAssets() {
        return totalFixedAssets;
    }

    /**
     * Sets the value of the totalFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TotalFixedAssets }
     *     
     */
    public void setTotalFixedAssets(KeyFinancialInformationType.TotalFixedAssets value) {
        this.totalFixedAssets = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TotalCurrentAssets }
     *     
     */
    public KeyFinancialInformationType.TotalCurrentAssets getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TotalCurrentAssets }
     *     
     */
    public void setTotalCurrentAssets(KeyFinancialInformationType.TotalCurrentAssets value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the totalAssets property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TotalAssets }
     *     
     */
    public KeyFinancialInformationType.TotalAssets getTotalAssets() {
        return totalAssets;
    }

    /**
     * Sets the value of the totalAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TotalAssets }
     *     
     */
    public void setTotalAssets(KeyFinancialInformationType.TotalAssets value) {
        this.totalAssets = value;
    }

    /**
     * Gets the value of the longTermDebt property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.LongTermDebt }
     *     
     */
    public KeyFinancialInformationType.LongTermDebt getLongTermDebt() {
        return longTermDebt;
    }

    /**
     * Sets the value of the longTermDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.LongTermDebt }
     *     
     */
    public void setLongTermDebt(KeyFinancialInformationType.LongTermDebt value) {
        this.longTermDebt = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.TotalCurrentLiabilities }
     *     
     */
    public KeyFinancialInformationType.TotalCurrentLiabilities getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.TotalCurrentLiabilities }
     *     
     */
    public void setTotalCurrentLiabilities(KeyFinancialInformationType.TotalCurrentLiabilities value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the netCurrentAssetsLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialInformationType.NetCurrentAssetsLiabilities }
     *     
     */
    public KeyFinancialInformationType.NetCurrentAssetsLiabilities getNetCurrentAssetsLiabilities() {
        return netCurrentAssetsLiabilities;
    }

    /**
     * Sets the value of the netCurrentAssetsLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialInformationType.NetCurrentAssetsLiabilities }
     *     
     */
    public void setNetCurrentAssetsLiabilities(KeyFinancialInformationType.NetCurrentAssetsLiabilities value) {
        this.netCurrentAssetsLiabilities = value;
    }

    /**
     * Gets the value of the currentRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatio() {
        return currentRatio;
    }

    /**
     * Sets the value of the currentRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatio(BigDecimal value) {
        this.currentRatio = value;
    }

    /**
     * Gets the value of the quickRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuickRatio() {
        return quickRatio;
    }

    /**
     * Sets the value of the quickRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuickRatio(BigDecimal value) {
        this.quickRatio = value;
    }

    /**
     * Gets the value of the currentLiabilitiesNetworthPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentLiabilitiesNetworthPercentage() {
        return currentLiabilitiesNetworthPercentage;
    }

    /**
     * Sets the value of the currentLiabilitiesNetworthPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentLiabilitiesNetworthPercentage(BigDecimal value) {
        this.currentLiabilitiesNetworthPercentage = value;
    }

    /**
     * Gets the value of the salesNetWorkingCapitalRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesNetWorkingCapitalRatio() {
        return salesNetWorkingCapitalRatio;
    }

    /**
     * Sets the value of the salesNetWorkingCapitalRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesNetWorkingCapitalRatio(BigDecimal value) {
        this.salesNetWorkingCapitalRatio = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEmployeeQuantity(BigInteger value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the tangibleNetworthGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTangibleNetworthGrowthRate() {
        return tangibleNetworthGrowthRate;
    }

    /**
     * Sets the value of the tangibleNetworthGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTangibleNetworthGrowthRate(BigDecimal value) {
        this.tangibleNetworthGrowthRate = value;
    }

    /**
     * Gets the value of the totalEquityGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalEquityGrowthRate() {
        return totalEquityGrowthRate;
    }

    /**
     * Sets the value of the totalEquityGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalEquityGrowthRate(BigDecimal value) {
        this.totalEquityGrowthRate = value;
    }

    /**
     * Gets the value of the turnoverGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverGrowthRate() {
        return turnoverGrowthRate;
    }

    /**
     * Sets the value of the turnoverGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverGrowthRate(BigDecimal value) {
        this.turnoverGrowthRate = value;
    }

    /**
     * Gets the value of the grossProfitGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossProfitGrowthRate() {
        return grossProfitGrowthRate;
    }

    /**
     * Sets the value of the grossProfitGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossProfitGrowthRate(BigDecimal value) {
        this.grossProfitGrowthRate = value;
    }

    /**
     * Gets the value of the profitorLossGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitorLossGrowthRate() {
        return profitorLossGrowthRate;
    }

    /**
     * Sets the value of the profitorLossGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitorLossGrowthRate(BigDecimal value) {
        this.profitorLossGrowthRate = value;
    }

    /**
     * Gets the value of the totalFixedAssetsGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFixedAssetsGrowthRate() {
        return totalFixedAssetsGrowthRate;
    }

    /**
     * Sets the value of the totalFixedAssetsGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFixedAssetsGrowthRate(BigDecimal value) {
        this.totalFixedAssetsGrowthRate = value;
    }

    /**
     * Gets the value of the totalCurrentAssetsGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentAssetsGrowthRate() {
        return totalCurrentAssetsGrowthRate;
    }

    /**
     * Sets the value of the totalCurrentAssetsGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentAssetsGrowthRate(BigDecimal value) {
        this.totalCurrentAssetsGrowthRate = value;
    }

    /**
     * Gets the value of the totalAssetsGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAssetsGrowthRate() {
        return totalAssetsGrowthRate;
    }

    /**
     * Sets the value of the totalAssetsGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAssetsGrowthRate(BigDecimal value) {
        this.totalAssetsGrowthRate = value;
    }

    /**
     * Gets the value of the longTermDebtGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongTermDebtGrowthRate() {
        return longTermDebtGrowthRate;
    }

    /**
     * Sets the value of the longTermDebtGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongTermDebtGrowthRate(BigDecimal value) {
        this.longTermDebtGrowthRate = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilitiesGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCurrentLiabilitiesGrowthRate() {
        return totalCurrentLiabilitiesGrowthRate;
    }

    /**
     * Sets the value of the totalCurrentLiabilitiesGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCurrentLiabilitiesGrowthRate(BigDecimal value) {
        this.totalCurrentLiabilitiesGrowthRate = value;
    }

    /**
     * Gets the value of the netCurrentAssetsLiabilitiesGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetCurrentAssetsLiabilitiesGrowthRate() {
        return netCurrentAssetsLiabilitiesGrowthRate;
    }

    /**
     * Sets the value of the netCurrentAssetsLiabilitiesGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetCurrentAssetsLiabilitiesGrowthRate(BigDecimal value) {
        this.netCurrentAssetsLiabilitiesGrowthRate = value;
    }

    /**
     * Gets the value of the currentRatioGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatioGrowthRate() {
        return currentRatioGrowthRate;
    }

    /**
     * Sets the value of the currentRatioGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatioGrowthRate(BigDecimal value) {
        this.currentRatioGrowthRate = value;
    }

    /**
     * Gets the value of the quickRatioGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuickRatioGrowthRate() {
        return quickRatioGrowthRate;
    }

    /**
     * Sets the value of the quickRatioGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuickRatioGrowthRate(BigDecimal value) {
        this.quickRatioGrowthRate = value;
    }

    /**
     * Gets the value of the currentLiabilitiesNetworthPercentageGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentLiabilitiesNetworthPercentageGrowthRate() {
        return currentLiabilitiesNetworthPercentageGrowthRate;
    }

    /**
     * Sets the value of the currentLiabilitiesNetworthPercentageGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentLiabilitiesNetworthPercentageGrowthRate(BigDecimal value) {
        this.currentLiabilitiesNetworthPercentageGrowthRate = value;
    }

    /**
     * Gets the value of the salesNetWorkingCapitalRatioGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesNetWorkingCapitalRatioGrowthRate() {
        return salesNetWorkingCapitalRatioGrowthRate;
    }

    /**
     * Sets the value of the salesNetWorkingCapitalRatioGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesNetWorkingCapitalRatioGrowthRate(BigDecimal value) {
        this.salesNetWorkingCapitalRatioGrowthRate = value;
    }

    /**
     * Gets the value of the employeeQuantityGrowthRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeQuantityGrowthRate() {
        return employeeQuantityGrowthRate;
    }

    /**
     * Sets the value of the employeeQuantityGrowthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeQuantityGrowthRate(BigDecimal value) {
        this.employeeQuantityGrowthRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class GrossProfit {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class LongTermDebt {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NetCurrentAssetsLiabilities {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ProfitorLoss {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TangibleNetworth {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TotalAssets {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TotalCurrentAssets {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TotalCurrentLiabilities {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TotalEquity {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TotalFixedAssets {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attGroup ref="{http://gateway.dnb.com/getProduct}CurrencyandUnits"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Turnover {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "ISOCurrencyCode")
        protected String isoCurrencyCode;
        @XmlAttribute
        protected BigInteger monetaryUnit;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the isoCurrencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOCurrencyCode() {
            return isoCurrencyCode;
        }

        /**
         * Sets the value of the isoCurrencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOCurrencyCode(String value) {
            this.isoCurrencyCode = value;
        }

        /**
         * Gets the value of the monetaryUnit property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMonetaryUnit() {
            return monetaryUnit;
        }

        /**
         * Sets the value of the monetaryUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMonetaryUnit(BigInteger value) {
            this.monetaryUnit = value;
        }

    }

}
