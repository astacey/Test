
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ratios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ratios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditPeriod" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapSales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TradeCredrsDebtrs" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxProfitMargin" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearing" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InterestCover" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTangAssets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvgRemPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CapEmployedPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TangAssetsPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotAssetsPerEmp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmpRemunerationSales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NumEmployees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmpRemuneration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DirRemuneration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ratios", propOrder = {
    "dateOfAccounts",
    "currency",
    "companyClass",
    "consAccounts",
    "currentRatio",
    "acidTest",
    "stockTurnover",
    "creditPeriod",
    "workingCapSales",
    "tradeCredrsDebtrs",
    "returnOnCapital",
    "returnOnAssets",
    "preTaxProfitMargin",
    "returnOnShareholdersFunds",
    "borrowingRatio",
    "equityGearing",
    "debtGearing",
    "interestCover",
    "salesTangAssets",
    "avgRemPerEmp",
    "profitPerEmp",
    "turnoverPerEmp",
    "capEmployedPerEmp",
    "tangAssetsPerEmp",
    "totAssetsPerEmp",
    "empRemunerationSales",
    "numEmployees",
    "empRemuneration",
    "dirRemuneration"
})
public class Ratios {

    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CompanyClass")
    protected String companyClass;
    @XmlElement(name = "ConsAccounts")
    protected String consAccounts;
    @XmlElement(name = "CurrentRatio")
    protected BigDecimal currentRatio;
    @XmlElement(name = "AcidTest")
    protected BigDecimal acidTest;
    @XmlElement(name = "StockTurnover")
    protected BigDecimal stockTurnover;
    @XmlElement(name = "CreditPeriod")
    protected BigDecimal creditPeriod;
    @XmlElement(name = "WorkingCapSales")
    protected BigDecimal workingCapSales;
    @XmlElement(name = "TradeCredrsDebtrs")
    protected BigDecimal tradeCredrsDebtrs;
    @XmlElement(name = "ReturnOnCapital")
    protected BigDecimal returnOnCapital;
    @XmlElement(name = "ReturnOnAssets")
    protected BigDecimal returnOnAssets;
    @XmlElement(name = "PreTaxProfitMargin")
    protected BigDecimal preTaxProfitMargin;
    @XmlElement(name = "ReturnOnShareholdersFunds")
    protected BigDecimal returnOnShareholdersFunds;
    @XmlElement(name = "BorrowingRatio")
    protected BigDecimal borrowingRatio;
    @XmlElement(name = "EquityGearing")
    protected BigDecimal equityGearing;
    @XmlElement(name = "DebtGearing")
    protected BigDecimal debtGearing;
    @XmlElement(name = "InterestCover")
    protected BigDecimal interestCover;
    @XmlElement(name = "SalesTangAssets")
    protected BigDecimal salesTangAssets;
    @XmlElement(name = "AvgRemPerEmp")
    protected Long avgRemPerEmp;
    @XmlElement(name = "ProfitPerEmp")
    protected Long profitPerEmp;
    @XmlElement(name = "TurnoverPerEmp")
    protected Long turnoverPerEmp;
    @XmlElement(name = "CapEmployedPerEmp")
    protected Long capEmployedPerEmp;
    @XmlElement(name = "TangAssetsPerEmp")
    protected Long tangAssetsPerEmp;
    @XmlElement(name = "TotAssetsPerEmp")
    protected Long totAssetsPerEmp;
    @XmlElement(name = "EmpRemunerationSales")
    protected BigDecimal empRemunerationSales;
    @XmlElement(name = "NumEmployees")
    protected Long numEmployees;
    @XmlElement(name = "EmpRemuneration")
    protected Long empRemuneration;
    @XmlElement(name = "DirRemuneration")
    protected Long dirRemuneration;

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
     * Gets the value of the stockTurnover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnover() {
        return stockTurnover;
    }

    /**
     * Sets the value of the stockTurnover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnover(BigDecimal value) {
        this.stockTurnover = value;
    }

    /**
     * Gets the value of the creditPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditPeriod() {
        return creditPeriod;
    }

    /**
     * Sets the value of the creditPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditPeriod(BigDecimal value) {
        this.creditPeriod = value;
    }

    /**
     * Gets the value of the workingCapSales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapSales() {
        return workingCapSales;
    }

    /**
     * Sets the value of the workingCapSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapSales(BigDecimal value) {
        this.workingCapSales = value;
    }

    /**
     * Gets the value of the tradeCredrsDebtrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeCredrsDebtrs() {
        return tradeCredrsDebtrs;
    }

    /**
     * Sets the value of the tradeCredrsDebtrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeCredrsDebtrs(BigDecimal value) {
        this.tradeCredrsDebtrs = value;
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
     * Gets the value of the returnOnShareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnShareholdersFunds() {
        return returnOnShareholdersFunds;
    }

    /**
     * Sets the value of the returnOnShareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnShareholdersFunds(BigDecimal value) {
        this.returnOnShareholdersFunds = value;
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
     * Gets the value of the interestCover property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestCover() {
        return interestCover;
    }

    /**
     * Sets the value of the interestCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestCover(BigDecimal value) {
        this.interestCover = value;
    }

    /**
     * Gets the value of the salesTangAssets property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTangAssets() {
        return salesTangAssets;
    }

    /**
     * Sets the value of the salesTangAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTangAssets(BigDecimal value) {
        this.salesTangAssets = value;
    }

    /**
     * Gets the value of the avgRemPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgRemPerEmp() {
        return avgRemPerEmp;
    }

    /**
     * Sets the value of the avgRemPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgRemPerEmp(Long value) {
        this.avgRemPerEmp = value;
    }

    /**
     * Gets the value of the profitPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfitPerEmp() {
        return profitPerEmp;
    }

    /**
     * Sets the value of the profitPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfitPerEmp(Long value) {
        this.profitPerEmp = value;
    }

    /**
     * Gets the value of the turnoverPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverPerEmp() {
        return turnoverPerEmp;
    }

    /**
     * Sets the value of the turnoverPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverPerEmp(Long value) {
        this.turnoverPerEmp = value;
    }

    /**
     * Gets the value of the capEmployedPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapEmployedPerEmp() {
        return capEmployedPerEmp;
    }

    /**
     * Sets the value of the capEmployedPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapEmployedPerEmp(Long value) {
        this.capEmployedPerEmp = value;
    }

    /**
     * Gets the value of the tangAssetsPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTangAssetsPerEmp() {
        return tangAssetsPerEmp;
    }

    /**
     * Sets the value of the tangAssetsPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTangAssetsPerEmp(Long value) {
        this.tangAssetsPerEmp = value;
    }

    /**
     * Gets the value of the totAssetsPerEmp property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotAssetsPerEmp() {
        return totAssetsPerEmp;
    }

    /**
     * Sets the value of the totAssetsPerEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotAssetsPerEmp(Long value) {
        this.totAssetsPerEmp = value;
    }

    /**
     * Gets the value of the empRemunerationSales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmpRemunerationSales() {
        return empRemunerationSales;
    }

    /**
     * Sets the value of the empRemunerationSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmpRemunerationSales(BigDecimal value) {
        this.empRemunerationSales = value;
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
     * Gets the value of the empRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmpRemuneration() {
        return empRemuneration;
    }

    /**
     * Sets the value of the empRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmpRemuneration(Long value) {
        this.empRemuneration = value;
    }

    /**
     * Gets the value of the dirRemuneration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDirRemuneration() {
        return dirRemuneration;
    }

    /**
     * Sets the value of the dirRemuneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDirRemuneration(Long value) {
        this.dirRemuneration = value;
    }

}
