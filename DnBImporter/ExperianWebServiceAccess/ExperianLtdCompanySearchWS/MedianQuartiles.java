
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MedianQuartiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedianQuartiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearEnd" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumCompanies" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrentRatioMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTestMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnoverMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditPeriodMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TradeCredrsDebtrsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapitalMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssetsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxMarginMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnShareholdersFundsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatioMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearingMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearingMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InterestCoverMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTangAssetsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmpRemunerationSalesMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvgRemPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapEmployedPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TangAssetsPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotAssetsPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SICInformation1980" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo80" minOccurs="0"/>
 *         &lt;element name="SICInformation1992" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo92" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedianQuartiles", propOrder = {
    "yearEnd",
    "dateOfAccounts",
    "numCompanies",
    "currentRatioMedian",
    "acidTestMedian",
    "stockTurnoverMedian",
    "creditPeriodMedian",
    "workingCapMedian",
    "tradeCredrsDebtrsMedian",
    "returnOnCapitalMedian",
    "returnOnAssetsMedian",
    "preTaxMarginMedian",
    "returnOnShareholdersFundsMedian",
    "borrowingRatioMedian",
    "equityGearingMedian",
    "debtGearingMedian",
    "interestCoverMedian",
    "salesTangAssetsMedian",
    "empRemunerationSalesMedian",
    "avgRemPerEmpMedian",
    "profitPerEmpMedian",
    "turnoverPerEmpMedian",
    "capEmployedPerEmpMedian",
    "tangAssetsPerEmpMedian",
    "totAssetsPerEmpMedian",
    "sicInformation1980",
    "sicInformation1992"
})
public class MedianQuartiles {

    @XmlElement(name = "YearEnd")
    protected CCYYMMDD yearEnd;
    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "NumCompanies")
    protected Long numCompanies;
    @XmlElement(name = "CurrentRatioMedian")
    protected BigDecimal currentRatioMedian;
    @XmlElement(name = "AcidTestMedian")
    protected BigDecimal acidTestMedian;
    @XmlElement(name = "StockTurnoverMedian")
    protected BigDecimal stockTurnoverMedian;
    @XmlElement(name = "CreditPeriodMedian")
    protected BigDecimal creditPeriodMedian;
    @XmlElement(name = "WorkingCapMedian")
    protected BigDecimal workingCapMedian;
    @XmlElement(name = "TradeCredrsDebtrsMedian")
    protected BigDecimal tradeCredrsDebtrsMedian;
    @XmlElement(name = "ReturnOnCapitalMedian")
    protected BigDecimal returnOnCapitalMedian;
    @XmlElement(name = "ReturnOnAssetsMedian")
    protected BigDecimal returnOnAssetsMedian;
    @XmlElement(name = "PreTaxMarginMedian")
    protected BigDecimal preTaxMarginMedian;
    @XmlElement(name = "ReturnOnShareholdersFundsMedian")
    protected BigDecimal returnOnShareholdersFundsMedian;
    @XmlElement(name = "BorrowingRatioMedian")
    protected BigDecimal borrowingRatioMedian;
    @XmlElement(name = "EquityGearingMedian")
    protected BigDecimal equityGearingMedian;
    @XmlElement(name = "DebtGearingMedian")
    protected BigDecimal debtGearingMedian;
    @XmlElement(name = "InterestCoverMedian")
    protected BigDecimal interestCoverMedian;
    @XmlElement(name = "SalesTangAssetsMedian")
    protected BigDecimal salesTangAssetsMedian;
    @XmlElement(name = "EmpRemunerationSalesMedian")
    protected BigDecimal empRemunerationSalesMedian;
    @XmlElement(name = "AvgRemPerEmpMedian")
    protected BigDecimal avgRemPerEmpMedian;
    @XmlElement(name = "ProfitPerEmpMedian")
    protected BigDecimal profitPerEmpMedian;
    @XmlElement(name = "TurnoverPerEmpMedian")
    protected BigDecimal turnoverPerEmpMedian;
    @XmlElement(name = "CapEmployedPerEmpMedian")
    protected BigDecimal capEmployedPerEmpMedian;
    @XmlElement(name = "TangAssetsPerEmpMedian")
    protected BigDecimal tangAssetsPerEmpMedian;
    @XmlElement(name = "TotAssetsPerEmpMedian")
    protected BigDecimal totAssetsPerEmpMedian;
    @XmlElement(name = "SICInformation1980")
    protected SICInfo80 sicInformation1980;
    @XmlElement(name = "SICInformation1992")
    protected SICInfo92 sicInformation1992;

    /**
     * Gets the value of the yearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setYearEnd(CCYYMMDD value) {
        this.yearEnd = value;
    }

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
     * Gets the value of the numCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumCompanies() {
        return numCompanies;
    }

    /**
     * Sets the value of the numCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumCompanies(Long value) {
        this.numCompanies = value;
    }

    /**
     * Gets the value of the currentRatioMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatioMedian() {
        return currentRatioMedian;
    }

    /**
     * Sets the value of the currentRatioMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatioMedian(BigDecimal value) {
        this.currentRatioMedian = value;
    }

    /**
     * Gets the value of the acidTestMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcidTestMedian() {
        return acidTestMedian;
    }

    /**
     * Sets the value of the acidTestMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcidTestMedian(BigDecimal value) {
        this.acidTestMedian = value;
    }

    /**
     * Gets the value of the stockTurnoverMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnoverMedian() {
        return stockTurnoverMedian;
    }

    /**
     * Sets the value of the stockTurnoverMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnoverMedian(BigDecimal value) {
        this.stockTurnoverMedian = value;
    }

    /**
     * Gets the value of the creditPeriodMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditPeriodMedian() {
        return creditPeriodMedian;
    }

    /**
     * Sets the value of the creditPeriodMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditPeriodMedian(BigDecimal value) {
        this.creditPeriodMedian = value;
    }

    /**
     * Gets the value of the workingCapMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapMedian() {
        return workingCapMedian;
    }

    /**
     * Sets the value of the workingCapMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapMedian(BigDecimal value) {
        this.workingCapMedian = value;
    }

    /**
     * Gets the value of the tradeCredrsDebtrsMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeCredrsDebtrsMedian() {
        return tradeCredrsDebtrsMedian;
    }

    /**
     * Sets the value of the tradeCredrsDebtrsMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeCredrsDebtrsMedian(BigDecimal value) {
        this.tradeCredrsDebtrsMedian = value;
    }

    /**
     * Gets the value of the returnOnCapitalMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapitalMedian() {
        return returnOnCapitalMedian;
    }

    /**
     * Sets the value of the returnOnCapitalMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapitalMedian(BigDecimal value) {
        this.returnOnCapitalMedian = value;
    }

    /**
     * Gets the value of the returnOnAssetsMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnAssetsMedian() {
        return returnOnAssetsMedian;
    }

    /**
     * Sets the value of the returnOnAssetsMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnAssetsMedian(BigDecimal value) {
        this.returnOnAssetsMedian = value;
    }

    /**
     * Gets the value of the preTaxMarginMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxMarginMedian() {
        return preTaxMarginMedian;
    }

    /**
     * Sets the value of the preTaxMarginMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxMarginMedian(BigDecimal value) {
        this.preTaxMarginMedian = value;
    }

    /**
     * Gets the value of the returnOnShareholdersFundsMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnShareholdersFundsMedian() {
        return returnOnShareholdersFundsMedian;
    }

    /**
     * Sets the value of the returnOnShareholdersFundsMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnShareholdersFundsMedian(BigDecimal value) {
        this.returnOnShareholdersFundsMedian = value;
    }

    /**
     * Gets the value of the borrowingRatioMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorrowingRatioMedian() {
        return borrowingRatioMedian;
    }

    /**
     * Sets the value of the borrowingRatioMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorrowingRatioMedian(BigDecimal value) {
        this.borrowingRatioMedian = value;
    }

    /**
     * Gets the value of the equityGearingMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityGearingMedian() {
        return equityGearingMedian;
    }

    /**
     * Sets the value of the equityGearingMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityGearingMedian(BigDecimal value) {
        this.equityGearingMedian = value;
    }

    /**
     * Gets the value of the debtGearingMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtGearingMedian() {
        return debtGearingMedian;
    }

    /**
     * Sets the value of the debtGearingMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtGearingMedian(BigDecimal value) {
        this.debtGearingMedian = value;
    }

    /**
     * Gets the value of the interestCoverMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestCoverMedian() {
        return interestCoverMedian;
    }

    /**
     * Sets the value of the interestCoverMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestCoverMedian(BigDecimal value) {
        this.interestCoverMedian = value;
    }

    /**
     * Gets the value of the salesTangAssetsMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTangAssetsMedian() {
        return salesTangAssetsMedian;
    }

    /**
     * Sets the value of the salesTangAssetsMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTangAssetsMedian(BigDecimal value) {
        this.salesTangAssetsMedian = value;
    }

    /**
     * Gets the value of the empRemunerationSalesMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmpRemunerationSalesMedian() {
        return empRemunerationSalesMedian;
    }

    /**
     * Sets the value of the empRemunerationSalesMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmpRemunerationSalesMedian(BigDecimal value) {
        this.empRemunerationSalesMedian = value;
    }

    /**
     * Gets the value of the avgRemPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgRemPerEmpMedian() {
        return avgRemPerEmpMedian;
    }

    /**
     * Sets the value of the avgRemPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgRemPerEmpMedian(BigDecimal value) {
        this.avgRemPerEmpMedian = value;
    }

    /**
     * Gets the value of the profitPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPerEmpMedian() {
        return profitPerEmpMedian;
    }

    /**
     * Sets the value of the profitPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPerEmpMedian(BigDecimal value) {
        this.profitPerEmpMedian = value;
    }

    /**
     * Gets the value of the turnoverPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverPerEmpMedian() {
        return turnoverPerEmpMedian;
    }

    /**
     * Sets the value of the turnoverPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverPerEmpMedian(BigDecimal value) {
        this.turnoverPerEmpMedian = value;
    }

    /**
     * Gets the value of the capEmployedPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapEmployedPerEmpMedian() {
        return capEmployedPerEmpMedian;
    }

    /**
     * Sets the value of the capEmployedPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapEmployedPerEmpMedian(BigDecimal value) {
        this.capEmployedPerEmpMedian = value;
    }

    /**
     * Gets the value of the tangAssetsPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTangAssetsPerEmpMedian() {
        return tangAssetsPerEmpMedian;
    }

    /**
     * Sets the value of the tangAssetsPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTangAssetsPerEmpMedian(BigDecimal value) {
        this.tangAssetsPerEmpMedian = value;
    }

    /**
     * Gets the value of the totAssetsPerEmpMedian property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAssetsPerEmpMedian() {
        return totAssetsPerEmpMedian;
    }

    /**
     * Sets the value of the totAssetsPerEmpMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotAssetsPerEmpMedian(BigDecimal value) {
        this.totAssetsPerEmpMedian = value;
    }

    /**
     * Gets the value of the sicInformation1980 property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo80 }
     *     
     */
    public SICInfo80 getSICInformation1980() {
        return sicInformation1980;
    }

    /**
     * Sets the value of the sicInformation1980 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo80 }
     *     
     */
    public void setSICInformation1980(SICInfo80 value) {
        this.sicInformation1980 = value;
    }

    /**
     * Gets the value of the sicInformation1992 property.
     * 
     * @return
     *     possible object is
     *     {@link SICInfo92 }
     *     
     */
    public SICInfo92 getSICInformation1992() {
        return sicInformation1992;
    }

    /**
     * Sets the value of the sicInformation1992 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICInfo92 }
     *     
     */
    public void setSICInformation1992(SICInfo92 value) {
        this.sicInformation1992 = value;
    }

}
