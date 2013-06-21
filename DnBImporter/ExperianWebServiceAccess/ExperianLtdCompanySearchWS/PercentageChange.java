
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PercentChangeNumEmployees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeGrossAsset" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeNetWorth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeFixedAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeWorkingCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCapitalEmployed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeNetAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeIssuedCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeRetainedEarnings" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeUKTurnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeExportTurnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeTotalTurnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangePreTaxProfitLoss" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeRetainedProfitLoss" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeCreditPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeReturnOnCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangePreTaxProfitMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeBorrowingRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeEquityGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeDebtGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeAvgEmpPerRem" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeProfPerEmp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PercentChangeTurnoverPerEmp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageChange", propOrder = {
    "dateOfAccounts",
    "accountingPeriod",
    "currency",
    "companyClass",
    "consAccounts",
    "percentChangeNumEmployees",
    "percentChangeGrossAsset",
    "percentChangeNetWorth",
    "percentChangeFixedAssets",
    "percentChangeCurrentAssets",
    "percentChangeCurrentLiabilities",
    "percentChangeWorkingCapital",
    "percentChangeCapitalEmployed",
    "percentChangeNetAssets",
    "percentChangeIssuedCapital",
    "percentChangeRetainedEarnings",
    "percentChangeShareholdersFunds",
    "percentChangeUKTurnover",
    "percentChangeExportTurnover",
    "percentChangeTotalTurnover",
    "percentChangePreTaxProfitLoss",
    "percentChangeRetainedProfitLoss",
    "percentChangeCurrentRatio",
    "percentChangeCreditPeriod",
    "percentChangeReturnOnCapital",
    "percentChangePreTaxProfitMargin",
    "percentChangeBorrowingRatio",
    "percentChangeEquityGearing",
    "percentChangeDebtGearing",
    "percentChangeAvgEmpPerRem",
    "percentChangeProfPerEmp",
    "percentChangeTurnoverPerEmp"
})
public class PercentageChange {

    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "AccountingPeriod")
    protected Integer accountingPeriod;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CompanyClass")
    protected String companyClass;
    @XmlElement(name = "ConsAccounts")
    protected String consAccounts;
    @XmlElement(name = "PercentChangeNumEmployees")
    protected BigDecimal percentChangeNumEmployees;
    @XmlElement(name = "PercentChangeGrossAsset")
    protected BigDecimal percentChangeGrossAsset;
    @XmlElement(name = "PercentChangeNetWorth")
    protected BigDecimal percentChangeNetWorth;
    @XmlElement(name = "PercentChangeFixedAssets")
    protected BigDecimal percentChangeFixedAssets;
    @XmlElement(name = "PercentChangeCurrentAssets")
    protected BigDecimal percentChangeCurrentAssets;
    @XmlElement(name = "PercentChangeCurrentLiabilities")
    protected BigDecimal percentChangeCurrentLiabilities;
    @XmlElement(name = "PercentChangeWorkingCapital")
    protected BigDecimal percentChangeWorkingCapital;
    @XmlElement(name = "PercentChangeCapitalEmployed")
    protected BigDecimal percentChangeCapitalEmployed;
    @XmlElement(name = "PercentChangeNetAssets")
    protected BigDecimal percentChangeNetAssets;
    @XmlElement(name = "PercentChangeIssuedCapital")
    protected BigDecimal percentChangeIssuedCapital;
    @XmlElement(name = "PercentChangeRetainedEarnings")
    protected BigDecimal percentChangeRetainedEarnings;
    @XmlElement(name = "PercentChangeShareholdersFunds")
    protected BigDecimal percentChangeShareholdersFunds;
    @XmlElement(name = "PercentChangeUKTurnover")
    protected BigDecimal percentChangeUKTurnover;
    @XmlElement(name = "PercentChangeExportTurnover")
    protected BigDecimal percentChangeExportTurnover;
    @XmlElement(name = "PercentChangeTotalTurnover")
    protected BigDecimal percentChangeTotalTurnover;
    @XmlElement(name = "PercentChangePreTaxProfitLoss")
    protected BigDecimal percentChangePreTaxProfitLoss;
    @XmlElement(name = "PercentChangeRetainedProfitLoss")
    protected BigDecimal percentChangeRetainedProfitLoss;
    @XmlElement(name = "PercentChangeCurrentRatio")
    protected BigDecimal percentChangeCurrentRatio;
    @XmlElement(name = "PercentChangeCreditPeriod")
    protected BigDecimal percentChangeCreditPeriod;
    @XmlElement(name = "PercentChangeReturnOnCapital")
    protected BigDecimal percentChangeReturnOnCapital;
    @XmlElement(name = "PercentChangePreTaxProfitMargin")
    protected BigDecimal percentChangePreTaxProfitMargin;
    @XmlElement(name = "PercentChangeBorrowingRatio")
    protected BigDecimal percentChangeBorrowingRatio;
    @XmlElement(name = "PercentChangeEquityGearing")
    protected BigDecimal percentChangeEquityGearing;
    @XmlElement(name = "PercentChangeDebtGearing")
    protected BigDecimal percentChangeDebtGearing;
    @XmlElement(name = "PercentChangeAvgEmpPerRem")
    protected BigDecimal percentChangeAvgEmpPerRem;
    @XmlElement(name = "PercentChangeProfPerEmp")
    protected BigDecimal percentChangeProfPerEmp;
    @XmlElement(name = "PercentChangeTurnoverPerEmp")
    protected BigDecimal percentChangeTurnoverPerEmp;

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
     * Gets the value of the percentChangeNumEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeNumEmployees() {
        return percentChangeNumEmployees;
    }

    /**
     * Sets the value of the percentChangeNumEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeNumEmployees(BigDecimal value) {
        this.percentChangeNumEmployees = value;
    }

    /**
     * Gets the value of the percentChangeGrossAsset property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeGrossAsset() {
        return percentChangeGrossAsset;
    }

    /**
     * Sets the value of the percentChangeGrossAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeGrossAsset(BigDecimal value) {
        this.percentChangeGrossAsset = value;
    }

    /**
     * Gets the value of the percentChangeNetWorth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeNetWorth() {
        return percentChangeNetWorth;
    }

    /**
     * Sets the value of the percentChangeNetWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeNetWorth(BigDecimal value) {
        this.percentChangeNetWorth = value;
    }

    /**
     * Gets the value of the percentChangeFixedAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeFixedAssets() {
        return percentChangeFixedAssets;
    }

    /**
     * Sets the value of the percentChangeFixedAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeFixedAssets(BigDecimal value) {
        this.percentChangeFixedAssets = value;
    }

    /**
     * Gets the value of the percentChangeCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeCurrentAssets() {
        return percentChangeCurrentAssets;
    }

    /**
     * Sets the value of the percentChangeCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeCurrentAssets(BigDecimal value) {
        this.percentChangeCurrentAssets = value;
    }

    /**
     * Gets the value of the percentChangeCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeCurrentLiabilities() {
        return percentChangeCurrentLiabilities;
    }

    /**
     * Sets the value of the percentChangeCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeCurrentLiabilities(BigDecimal value) {
        this.percentChangeCurrentLiabilities = value;
    }

    /**
     * Gets the value of the percentChangeWorkingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeWorkingCapital() {
        return percentChangeWorkingCapital;
    }

    /**
     * Sets the value of the percentChangeWorkingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeWorkingCapital(BigDecimal value) {
        this.percentChangeWorkingCapital = value;
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
     * Gets the value of the percentChangeNetAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeNetAssets() {
        return percentChangeNetAssets;
    }

    /**
     * Sets the value of the percentChangeNetAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeNetAssets(BigDecimal value) {
        this.percentChangeNetAssets = value;
    }

    /**
     * Gets the value of the percentChangeIssuedCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeIssuedCapital() {
        return percentChangeIssuedCapital;
    }

    /**
     * Sets the value of the percentChangeIssuedCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeIssuedCapital(BigDecimal value) {
        this.percentChangeIssuedCapital = value;
    }

    /**
     * Gets the value of the percentChangeRetainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeRetainedEarnings() {
        return percentChangeRetainedEarnings;
    }

    /**
     * Sets the value of the percentChangeRetainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeRetainedEarnings(BigDecimal value) {
        this.percentChangeRetainedEarnings = value;
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
     * Gets the value of the percentChangeUKTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeUKTurnover() {
        return percentChangeUKTurnover;
    }

    /**
     * Sets the value of the percentChangeUKTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeUKTurnover(BigDecimal value) {
        this.percentChangeUKTurnover = value;
    }

    /**
     * Gets the value of the percentChangeExportTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeExportTurnover() {
        return percentChangeExportTurnover;
    }

    /**
     * Sets the value of the percentChangeExportTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeExportTurnover(BigDecimal value) {
        this.percentChangeExportTurnover = value;
    }

    /**
     * Gets the value of the percentChangeTotalTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeTotalTurnover() {
        return percentChangeTotalTurnover;
    }

    /**
     * Sets the value of the percentChangeTotalTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeTotalTurnover(BigDecimal value) {
        this.percentChangeTotalTurnover = value;
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
     * Gets the value of the percentChangeRetainedProfitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeRetainedProfitLoss() {
        return percentChangeRetainedProfitLoss;
    }

    /**
     * Sets the value of the percentChangeRetainedProfitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeRetainedProfitLoss(BigDecimal value) {
        this.percentChangeRetainedProfitLoss = value;
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
     * Gets the value of the percentChangeCreditPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeCreditPeriod() {
        return percentChangeCreditPeriod;
    }

    /**
     * Sets the value of the percentChangeCreditPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeCreditPeriod(BigDecimal value) {
        this.percentChangeCreditPeriod = value;
    }

    /**
     * Gets the value of the percentChangeReturnOnCapital property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeReturnOnCapital() {
        return percentChangeReturnOnCapital;
    }

    /**
     * Sets the value of the percentChangeReturnOnCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeReturnOnCapital(BigDecimal value) {
        this.percentChangeReturnOnCapital = value;
    }

    /**
     * Gets the value of the percentChangePreTaxProfitMargin property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangePreTaxProfitMargin() {
        return percentChangePreTaxProfitMargin;
    }

    /**
     * Sets the value of the percentChangePreTaxProfitMargin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangePreTaxProfitMargin(BigDecimal value) {
        this.percentChangePreTaxProfitMargin = value;
    }

    /**
     * Gets the value of the percentChangeBorrowingRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeBorrowingRatio() {
        return percentChangeBorrowingRatio;
    }

    /**
     * Sets the value of the percentChangeBorrowingRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeBorrowingRatio(BigDecimal value) {
        this.percentChangeBorrowingRatio = value;
    }

    /**
     * Gets the value of the percentChangeEquityGearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeEquityGearing() {
        return percentChangeEquityGearing;
    }

    /**
     * Sets the value of the percentChangeEquityGearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeEquityGearing(BigDecimal value) {
        this.percentChangeEquityGearing = value;
    }

    /**
     * Gets the value of the percentChangeDebtGearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeDebtGearing() {
        return percentChangeDebtGearing;
    }

    /**
     * Sets the value of the percentChangeDebtGearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeDebtGearing(BigDecimal value) {
        this.percentChangeDebtGearing = value;
    }

    /**
     * Gets the value of the percentChangeAvgEmpPerRem property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeAvgEmpPerRem() {
        return percentChangeAvgEmpPerRem;
    }

    /**
     * Sets the value of the percentChangeAvgEmpPerRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeAvgEmpPerRem(BigDecimal value) {
        this.percentChangeAvgEmpPerRem = value;
    }

    /**
     * Gets the value of the percentChangeProfPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeProfPerEmp() {
        return percentChangeProfPerEmp;
    }

    /**
     * Sets the value of the percentChangeProfPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeProfPerEmp(BigDecimal value) {
        this.percentChangeProfPerEmp = value;
    }

    /**
     * Gets the value of the percentChangeTurnoverPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentChangeTurnoverPerEmp() {
        return percentChangeTurnoverPerEmp;
    }

    /**
     * Sets the value of the percentChangeTurnoverPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentChangeTurnoverPerEmp(BigDecimal value) {
        this.percentChangeTurnoverPerEmp = value;
    }

}
