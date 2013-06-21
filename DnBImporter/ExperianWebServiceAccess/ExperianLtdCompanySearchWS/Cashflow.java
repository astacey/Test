
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cashflow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cashflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DormancyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestAccountsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingActivities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReturnOnInvestment" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CapitalExpenditure" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Acquisitions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EquityDivision" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ManagementLiquidity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Financing" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalCash" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IFRSOperatingActivities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IFRSInvestmentActivities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FinancingActs" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NetChange" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CashBroughtForward" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ExchangeRateEffects" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CashEquivalents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cashflow", propOrder = {
    "dateOfAccounts",
    "accountingPeriod",
    "currency",
    "currencyMultiplier",
    "companyClass",
    "consAccounts",
    "dormancyIndicator",
    "latestAccountsType",
    "restatedAccounts",
    "operatingActivities",
    "returnOnInvestment",
    "tax",
    "capitalExpenditure",
    "acquisitions",
    "equityDivision",
    "managementLiquidity",
    "financing",
    "totalCash",
    "ifrsOperatingActivities",
    "ifrsInvestmentActivities",
    "financingActs",
    "netChange",
    "cashBroughtForward",
    "exchangeRateEffects",
    "cashEquivalents"
})
public class Cashflow {

    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "AccountingPeriod")
    protected Integer accountingPeriod;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CurrencyMultiplier")
    protected String currencyMultiplier;
    @XmlElement(name = "CompanyClass")
    protected String companyClass;
    @XmlElement(name = "ConsAccounts")
    protected String consAccounts;
    @XmlElement(name = "DormancyIndicator")
    protected String dormancyIndicator;
    @XmlElement(name = "LatestAccountsType")
    protected String latestAccountsType;
    @XmlElement(name = "RestatedAccounts")
    protected String restatedAccounts;
    @XmlElement(name = "OperatingActivities")
    protected Long operatingActivities;
    @XmlElement(name = "ReturnOnInvestment")
    protected Long returnOnInvestment;
    @XmlElement(name = "Tax")
    protected Long tax;
    @XmlElement(name = "CapitalExpenditure")
    protected Long capitalExpenditure;
    @XmlElement(name = "Acquisitions")
    protected Long acquisitions;
    @XmlElement(name = "EquityDivision")
    protected Long equityDivision;
    @XmlElement(name = "ManagementLiquidity")
    protected Long managementLiquidity;
    @XmlElement(name = "Financing")
    protected Long financing;
    @XmlElement(name = "TotalCash")
    protected Long totalCash;
    @XmlElement(name = "IFRSOperatingActivities")
    protected Long ifrsOperatingActivities;
    @XmlElement(name = "IFRSInvestmentActivities")
    protected Long ifrsInvestmentActivities;
    @XmlElement(name = "FinancingActs")
    protected Long financingActs;
    @XmlElement(name = "NetChange")
    protected Long netChange;
    @XmlElement(name = "CashBroughtForward")
    protected Long cashBroughtForward;
    @XmlElement(name = "ExchangeRateEffects")
    protected Long exchangeRateEffects;
    @XmlElement(name = "CashEquivalents")
    protected Long cashEquivalents;

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
     * Gets the value of the currencyMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyMultiplier() {
        return currencyMultiplier;
    }

    /**
     * Sets the value of the currencyMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyMultiplier(String value) {
        this.currencyMultiplier = value;
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
     * Gets the value of the dormancyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDormancyIndicator() {
        return dormancyIndicator;
    }

    /**
     * Sets the value of the dormancyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDormancyIndicator(String value) {
        this.dormancyIndicator = value;
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
     * Gets the value of the restatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestatedAccounts() {
        return restatedAccounts;
    }

    /**
     * Sets the value of the restatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestatedAccounts(String value) {
        this.restatedAccounts = value;
    }

    /**
     * Gets the value of the operatingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingActivities() {
        return operatingActivities;
    }

    /**
     * Sets the value of the operatingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingActivities(Long value) {
        this.operatingActivities = value;
    }

    /**
     * Gets the value of the returnOnInvestment property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnOnInvestment() {
        return returnOnInvestment;
    }

    /**
     * Sets the value of the returnOnInvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnOnInvestment(Long value) {
        this.returnOnInvestment = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTax(Long value) {
        this.tax = value;
    }

    /**
     * Gets the value of the capitalExpenditure property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapitalExpenditure() {
        return capitalExpenditure;
    }

    /**
     * Sets the value of the capitalExpenditure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapitalExpenditure(Long value) {
        this.capitalExpenditure = value;
    }

    /**
     * Gets the value of the acquisitions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAcquisitions() {
        return acquisitions;
    }

    /**
     * Sets the value of the acquisitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAcquisitions(Long value) {
        this.acquisitions = value;
    }

    /**
     * Gets the value of the equityDivision property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquityDivision() {
        return equityDivision;
    }

    /**
     * Sets the value of the equityDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquityDivision(Long value) {
        this.equityDivision = value;
    }

    /**
     * Gets the value of the managementLiquidity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagementLiquidity() {
        return managementLiquidity;
    }

    /**
     * Sets the value of the managementLiquidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagementLiquidity(Long value) {
        this.managementLiquidity = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancing(Long value) {
        this.financing = value;
    }

    /**
     * Gets the value of the totalCash property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCash() {
        return totalCash;
    }

    /**
     * Sets the value of the totalCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCash(Long value) {
        this.totalCash = value;
    }

    /**
     * Gets the value of the ifrsOperatingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIFRSOperatingActivities() {
        return ifrsOperatingActivities;
    }

    /**
     * Sets the value of the ifrsOperatingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIFRSOperatingActivities(Long value) {
        this.ifrsOperatingActivities = value;
    }

    /**
     * Gets the value of the ifrsInvestmentActivities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIFRSInvestmentActivities() {
        return ifrsInvestmentActivities;
    }

    /**
     * Sets the value of the ifrsInvestmentActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIFRSInvestmentActivities(Long value) {
        this.ifrsInvestmentActivities = value;
    }

    /**
     * Gets the value of the financingActs property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFinancingActs() {
        return financingActs;
    }

    /**
     * Sets the value of the financingActs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFinancingActs(Long value) {
        this.financingActs = value;
    }

    /**
     * Gets the value of the netChange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetChange() {
        return netChange;
    }

    /**
     * Sets the value of the netChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetChange(Long value) {
        this.netChange = value;
    }

    /**
     * Gets the value of the cashBroughtForward property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCashBroughtForward() {
        return cashBroughtForward;
    }

    /**
     * Sets the value of the cashBroughtForward property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCashBroughtForward(Long value) {
        this.cashBroughtForward = value;
    }

    /**
     * Gets the value of the exchangeRateEffects property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeRateEffects() {
        return exchangeRateEffects;
    }

    /**
     * Sets the value of the exchangeRateEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeRateEffects(Long value) {
        this.exchangeRateEffects = value;
    }

    /**
     * Gets the value of the cashEquivalents property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCashEquivalents() {
        return cashEquivalents;
    }

    /**
     * Sets the value of the cashEquivalents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCashEquivalents(Long value) {
        this.cashEquivalents = value;
    }

}
