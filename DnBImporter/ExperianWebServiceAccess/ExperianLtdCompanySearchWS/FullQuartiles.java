
package ExperianLtdCompanySearchWS;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FullQuartiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullQuartiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearEnd" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumCompanies" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrentRatioLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentRatioMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentRatioUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTestLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTestMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AcidTestUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnoverLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnoverMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StockTurnoverUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditPeriodLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditPeriodMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditPeriodUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WorkingCapUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TradeCredrsDebtrsLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TradeCredrsDebtrsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TradeCredrsDebtrsUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapitalLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapitalMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnCapitalUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssetsLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssetsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnAssetsUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxMarginLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxMarginMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PreTaxMarginUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnShareholdersFundsLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnShareholdersFundsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReturnOnShareholdersFundsUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatioLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatioMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BorrowingRatioUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearingLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearingMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EquityGearingUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearingLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearingMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebtGearingUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InterestCoverLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InterestCoverMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InterestCoverUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTangAssetsLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTangAssetsMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesTangAssetsUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvgRemPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvgRemPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AvgRemPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProfitPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TurnoverPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapEmployedPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapEmployedPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CapEmployedPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TangAssetsPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TangAssetsPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TangAssetsPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotAssetsPerEmpLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotAssetsPerEmpMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotAssetsPerEmpUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmpRemunerationSalesLower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmpRemunerationSalesMedian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmpRemunerationSalesUpper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "FullQuartiles", propOrder = {
    "yearEnd",
    "dateOfAccounts",
    "numCompanies",
    "currentRatioLower",
    "currentRatioMedian",
    "currentRatioUpper",
    "acidTestLower",
    "acidTestMedian",
    "acidTestUpper",
    "stockTurnoverLower",
    "stockTurnoverMedian",
    "stockTurnoverUpper",
    "creditPeriodLower",
    "creditPeriodMedian",
    "creditPeriodUpper",
    "workingCapLower",
    "workingCapMedian",
    "workingCapUpper",
    "tradeCredrsDebtrsLower",
    "tradeCredrsDebtrsMedian",
    "tradeCredrsDebtrsUpper",
    "returnOnCapitalLower",
    "returnOnCapitalMedian",
    "returnOnCapitalUpper",
    "returnOnAssetsLower",
    "returnOnAssetsMedian",
    "returnOnAssetsUpper",
    "preTaxMarginLower",
    "preTaxMarginMedian",
    "preTaxMarginUpper",
    "returnOnShareholdersFundsLower",
    "returnOnShareholdersFundsMedian",
    "returnOnShareholdersFundsUpper",
    "borrowingRatioLower",
    "borrowingRatioMedian",
    "borrowingRatioUpper",
    "equityGearingLower",
    "equityGearingMedian",
    "equityGearingUpper",
    "debtGearingLower",
    "debtGearingMedian",
    "debtGearingUpper",
    "interestCoverLower",
    "interestCoverMedian",
    "interestCoverUpper",
    "salesTangAssetsLower",
    "salesTangAssetsMedian",
    "salesTangAssetsUpper",
    "avgRemPerEmpLower",
    "avgRemPerEmpMedian",
    "avgRemPerEmpUpper",
    "profitPerEmpLower",
    "profitPerEmpMedian",
    "profitPerEmpUpper",
    "turnoverPerEmpLower",
    "turnoverPerEmpMedian",
    "turnoverPerEmpUpper",
    "capEmployedPerEmpLower",
    "capEmployedPerEmpMedian",
    "capEmployedPerEmpUpper",
    "tangAssetsPerEmpLower",
    "tangAssetsPerEmpMedian",
    "tangAssetsPerEmpUpper",
    "totAssetsPerEmpLower",
    "totAssetsPerEmpMedian",
    "totAssetsPerEmpUpper",
    "empRemunerationSalesLower",
    "empRemunerationSalesMedian",
    "empRemunerationSalesUpper",
    "sicInformation1980",
    "sicInformation1992"
})
public class FullQuartiles {

    @XmlElement(name = "YearEnd")
    protected CCYYMMDD yearEnd;
    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "NumCompanies")
    protected Long numCompanies;
    @XmlElement(name = "CurrentRatioLower")
    protected BigDecimal currentRatioLower;
    @XmlElement(name = "CurrentRatioMedian")
    protected BigDecimal currentRatioMedian;
    @XmlElement(name = "CurrentRatioUpper")
    protected BigDecimal currentRatioUpper;
    @XmlElement(name = "AcidTestLower")
    protected BigDecimal acidTestLower;
    @XmlElement(name = "AcidTestMedian")
    protected BigDecimal acidTestMedian;
    @XmlElement(name = "AcidTestUpper")
    protected BigDecimal acidTestUpper;
    @XmlElement(name = "StockTurnoverLower")
    protected BigDecimal stockTurnoverLower;
    @XmlElement(name = "StockTurnoverMedian")
    protected BigDecimal stockTurnoverMedian;
    @XmlElement(name = "StockTurnoverUpper")
    protected BigDecimal stockTurnoverUpper;
    @XmlElement(name = "CreditPeriodLower")
    protected BigDecimal creditPeriodLower;
    @XmlElement(name = "CreditPeriodMedian")
    protected BigDecimal creditPeriodMedian;
    @XmlElement(name = "CreditPeriodUpper")
    protected BigDecimal creditPeriodUpper;
    @XmlElement(name = "WorkingCapLower")
    protected BigDecimal workingCapLower;
    @XmlElement(name = "WorkingCapMedian")
    protected BigDecimal workingCapMedian;
    @XmlElement(name = "WorkingCapUpper")
    protected BigDecimal workingCapUpper;
    @XmlElement(name = "TradeCredrsDebtrsLower")
    protected BigDecimal tradeCredrsDebtrsLower;
    @XmlElement(name = "TradeCredrsDebtrsMedian")
    protected BigDecimal tradeCredrsDebtrsMedian;
    @XmlElement(name = "TradeCredrsDebtrsUpper")
    protected BigDecimal tradeCredrsDebtrsUpper;
    @XmlElement(name = "ReturnOnCapitalLower")
    protected BigDecimal returnOnCapitalLower;
    @XmlElement(name = "ReturnOnCapitalMedian")
    protected BigDecimal returnOnCapitalMedian;
    @XmlElement(name = "ReturnOnCapitalUpper")
    protected BigDecimal returnOnCapitalUpper;
    @XmlElement(name = "ReturnOnAssetsLower")
    protected BigDecimal returnOnAssetsLower;
    @XmlElement(name = "ReturnOnAssetsMedian")
    protected BigDecimal returnOnAssetsMedian;
    @XmlElement(name = "ReturnOnAssetsUpper")
    protected BigDecimal returnOnAssetsUpper;
    @XmlElement(name = "PreTaxMarginLower")
    protected BigDecimal preTaxMarginLower;
    @XmlElement(name = "PreTaxMarginMedian")
    protected BigDecimal preTaxMarginMedian;
    @XmlElement(name = "PreTaxMarginUpper")
    protected BigDecimal preTaxMarginUpper;
    @XmlElement(name = "ReturnOnShareholdersFundsLower")
    protected BigDecimal returnOnShareholdersFundsLower;
    @XmlElement(name = "ReturnOnShareholdersFundsMedian")
    protected BigDecimal returnOnShareholdersFundsMedian;
    @XmlElement(name = "ReturnOnShareholdersFundsUpper")
    protected BigDecimal returnOnShareholdersFundsUpper;
    @XmlElement(name = "BorrowingRatioLower")
    protected BigDecimal borrowingRatioLower;
    @XmlElement(name = "BorrowingRatioMedian")
    protected BigDecimal borrowingRatioMedian;
    @XmlElement(name = "BorrowingRatioUpper")
    protected BigDecimal borrowingRatioUpper;
    @XmlElement(name = "EquityGearingLower")
    protected BigDecimal equityGearingLower;
    @XmlElement(name = "EquityGearingMedian")
    protected BigDecimal equityGearingMedian;
    @XmlElement(name = "EquityGearingUpper")
    protected BigDecimal equityGearingUpper;
    @XmlElement(name = "DebtGearingLower")
    protected BigDecimal debtGearingLower;
    @XmlElement(name = "DebtGearingMedian")
    protected BigDecimal debtGearingMedian;
    @XmlElement(name = "DebtGearingUpper")
    protected BigDecimal debtGearingUpper;
    @XmlElement(name = "InterestCoverLower")
    protected BigDecimal interestCoverLower;
    @XmlElement(name = "InterestCoverMedian")
    protected BigDecimal interestCoverMedian;
    @XmlElement(name = "InterestCoverUpper")
    protected BigDecimal interestCoverUpper;
    @XmlElement(name = "SalesTangAssetsLower")
    protected BigDecimal salesTangAssetsLower;
    @XmlElement(name = "SalesTangAssetsMedian")
    protected BigDecimal salesTangAssetsMedian;
    @XmlElement(name = "SalesTangAssetsUpper")
    protected BigDecimal salesTangAssetsUpper;
    @XmlElement(name = "AvgRemPerEmpLower")
    protected BigDecimal avgRemPerEmpLower;
    @XmlElement(name = "AvgRemPerEmpMedian")
    protected BigDecimal avgRemPerEmpMedian;
    @XmlElement(name = "AvgRemPerEmpUpper")
    protected BigDecimal avgRemPerEmpUpper;
    @XmlElement(name = "ProfitPerEmpLower")
    protected BigDecimal profitPerEmpLower;
    @XmlElement(name = "ProfitPerEmpMedian")
    protected BigDecimal profitPerEmpMedian;
    @XmlElement(name = "ProfitPerEmpUpper")
    protected BigDecimal profitPerEmpUpper;
    @XmlElement(name = "TurnoverPerEmpLower")
    protected BigDecimal turnoverPerEmpLower;
    @XmlElement(name = "TurnoverPerEmpMedian")
    protected BigDecimal turnoverPerEmpMedian;
    @XmlElement(name = "TurnoverPerEmpUpper")
    protected BigDecimal turnoverPerEmpUpper;
    @XmlElement(name = "CapEmployedPerEmpLower")
    protected BigDecimal capEmployedPerEmpLower;
    @XmlElement(name = "CapEmployedPerEmpMedian")
    protected BigDecimal capEmployedPerEmpMedian;
    @XmlElement(name = "CapEmployedPerEmpUpper")
    protected BigDecimal capEmployedPerEmpUpper;
    @XmlElement(name = "TangAssetsPerEmpLower")
    protected BigDecimal tangAssetsPerEmpLower;
    @XmlElement(name = "TangAssetsPerEmpMedian")
    protected BigDecimal tangAssetsPerEmpMedian;
    @XmlElement(name = "TangAssetsPerEmpUpper")
    protected BigDecimal tangAssetsPerEmpUpper;
    @XmlElement(name = "TotAssetsPerEmpLower")
    protected BigDecimal totAssetsPerEmpLower;
    @XmlElement(name = "TotAssetsPerEmpMedian")
    protected BigDecimal totAssetsPerEmpMedian;
    @XmlElement(name = "TotAssetsPerEmpUpper")
    protected BigDecimal totAssetsPerEmpUpper;
    @XmlElement(name = "EmpRemunerationSalesLower")
    protected BigDecimal empRemunerationSalesLower;
    @XmlElement(name = "EmpRemunerationSalesMedian")
    protected BigDecimal empRemunerationSalesMedian;
    @XmlElement(name = "EmpRemunerationSalesUpper")
    protected BigDecimal empRemunerationSalesUpper;
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
     * Gets the value of the currentRatioLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatioLower() {
        return currentRatioLower;
    }

    /**
     * Sets the value of the currentRatioLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatioLower(BigDecimal value) {
        this.currentRatioLower = value;
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
     * Gets the value of the currentRatioUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrentRatioUpper() {
        return currentRatioUpper;
    }

    /**
     * Sets the value of the currentRatioUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrentRatioUpper(BigDecimal value) {
        this.currentRatioUpper = value;
    }

    /**
     * Gets the value of the acidTestLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcidTestLower() {
        return acidTestLower;
    }

    /**
     * Sets the value of the acidTestLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcidTestLower(BigDecimal value) {
        this.acidTestLower = value;
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
     * Gets the value of the acidTestUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcidTestUpper() {
        return acidTestUpper;
    }

    /**
     * Sets the value of the acidTestUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcidTestUpper(BigDecimal value) {
        this.acidTestUpper = value;
    }

    /**
     * Gets the value of the stockTurnoverLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnoverLower() {
        return stockTurnoverLower;
    }

    /**
     * Sets the value of the stockTurnoverLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnoverLower(BigDecimal value) {
        this.stockTurnoverLower = value;
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
     * Gets the value of the stockTurnoverUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStockTurnoverUpper() {
        return stockTurnoverUpper;
    }

    /**
     * Sets the value of the stockTurnoverUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStockTurnoverUpper(BigDecimal value) {
        this.stockTurnoverUpper = value;
    }

    /**
     * Gets the value of the creditPeriodLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditPeriodLower() {
        return creditPeriodLower;
    }

    /**
     * Sets the value of the creditPeriodLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditPeriodLower(BigDecimal value) {
        this.creditPeriodLower = value;
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
     * Gets the value of the creditPeriodUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditPeriodUpper() {
        return creditPeriodUpper;
    }

    /**
     * Sets the value of the creditPeriodUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditPeriodUpper(BigDecimal value) {
        this.creditPeriodUpper = value;
    }

    /**
     * Gets the value of the workingCapLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapLower() {
        return workingCapLower;
    }

    /**
     * Sets the value of the workingCapLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapLower(BigDecimal value) {
        this.workingCapLower = value;
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
     * Gets the value of the workingCapUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkingCapUpper() {
        return workingCapUpper;
    }

    /**
     * Sets the value of the workingCapUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWorkingCapUpper(BigDecimal value) {
        this.workingCapUpper = value;
    }

    /**
     * Gets the value of the tradeCredrsDebtrsLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeCredrsDebtrsLower() {
        return tradeCredrsDebtrsLower;
    }

    /**
     * Sets the value of the tradeCredrsDebtrsLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeCredrsDebtrsLower(BigDecimal value) {
        this.tradeCredrsDebtrsLower = value;
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
     * Gets the value of the tradeCredrsDebtrsUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTradeCredrsDebtrsUpper() {
        return tradeCredrsDebtrsUpper;
    }

    /**
     * Sets the value of the tradeCredrsDebtrsUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTradeCredrsDebtrsUpper(BigDecimal value) {
        this.tradeCredrsDebtrsUpper = value;
    }

    /**
     * Gets the value of the returnOnCapitalLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapitalLower() {
        return returnOnCapitalLower;
    }

    /**
     * Sets the value of the returnOnCapitalLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapitalLower(BigDecimal value) {
        this.returnOnCapitalLower = value;
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
     * Gets the value of the returnOnCapitalUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnCapitalUpper() {
        return returnOnCapitalUpper;
    }

    /**
     * Sets the value of the returnOnCapitalUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnCapitalUpper(BigDecimal value) {
        this.returnOnCapitalUpper = value;
    }

    /**
     * Gets the value of the returnOnAssetsLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnAssetsLower() {
        return returnOnAssetsLower;
    }

    /**
     * Sets the value of the returnOnAssetsLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnAssetsLower(BigDecimal value) {
        this.returnOnAssetsLower = value;
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
     * Gets the value of the returnOnAssetsUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnAssetsUpper() {
        return returnOnAssetsUpper;
    }

    /**
     * Sets the value of the returnOnAssetsUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnAssetsUpper(BigDecimal value) {
        this.returnOnAssetsUpper = value;
    }

    /**
     * Gets the value of the preTaxMarginLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxMarginLower() {
        return preTaxMarginLower;
    }

    /**
     * Sets the value of the preTaxMarginLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxMarginLower(BigDecimal value) {
        this.preTaxMarginLower = value;
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
     * Gets the value of the preTaxMarginUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreTaxMarginUpper() {
        return preTaxMarginUpper;
    }

    /**
     * Sets the value of the preTaxMarginUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreTaxMarginUpper(BigDecimal value) {
        this.preTaxMarginUpper = value;
    }

    /**
     * Gets the value of the returnOnShareholdersFundsLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnShareholdersFundsLower() {
        return returnOnShareholdersFundsLower;
    }

    /**
     * Sets the value of the returnOnShareholdersFundsLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnShareholdersFundsLower(BigDecimal value) {
        this.returnOnShareholdersFundsLower = value;
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
     * Gets the value of the returnOnShareholdersFundsUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnOnShareholdersFundsUpper() {
        return returnOnShareholdersFundsUpper;
    }

    /**
     * Sets the value of the returnOnShareholdersFundsUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnOnShareholdersFundsUpper(BigDecimal value) {
        this.returnOnShareholdersFundsUpper = value;
    }

    /**
     * Gets the value of the borrowingRatioLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorrowingRatioLower() {
        return borrowingRatioLower;
    }

    /**
     * Sets the value of the borrowingRatioLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorrowingRatioLower(BigDecimal value) {
        this.borrowingRatioLower = value;
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
     * Gets the value of the borrowingRatioUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorrowingRatioUpper() {
        return borrowingRatioUpper;
    }

    /**
     * Sets the value of the borrowingRatioUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorrowingRatioUpper(BigDecimal value) {
        this.borrowingRatioUpper = value;
    }

    /**
     * Gets the value of the equityGearingLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityGearingLower() {
        return equityGearingLower;
    }

    /**
     * Sets the value of the equityGearingLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityGearingLower(BigDecimal value) {
        this.equityGearingLower = value;
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
     * Gets the value of the equityGearingUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquityGearingUpper() {
        return equityGearingUpper;
    }

    /**
     * Sets the value of the equityGearingUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquityGearingUpper(BigDecimal value) {
        this.equityGearingUpper = value;
    }

    /**
     * Gets the value of the debtGearingLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtGearingLower() {
        return debtGearingLower;
    }

    /**
     * Sets the value of the debtGearingLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtGearingLower(BigDecimal value) {
        this.debtGearingLower = value;
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
     * Gets the value of the debtGearingUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtGearingUpper() {
        return debtGearingUpper;
    }

    /**
     * Sets the value of the debtGearingUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebtGearingUpper(BigDecimal value) {
        this.debtGearingUpper = value;
    }

    /**
     * Gets the value of the interestCoverLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestCoverLower() {
        return interestCoverLower;
    }

    /**
     * Sets the value of the interestCoverLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestCoverLower(BigDecimal value) {
        this.interestCoverLower = value;
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
     * Gets the value of the interestCoverUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestCoverUpper() {
        return interestCoverUpper;
    }

    /**
     * Sets the value of the interestCoverUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterestCoverUpper(BigDecimal value) {
        this.interestCoverUpper = value;
    }

    /**
     * Gets the value of the salesTangAssetsLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTangAssetsLower() {
        return salesTangAssetsLower;
    }

    /**
     * Sets the value of the salesTangAssetsLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTangAssetsLower(BigDecimal value) {
        this.salesTangAssetsLower = value;
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
     * Gets the value of the salesTangAssetsUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesTangAssetsUpper() {
        return salesTangAssetsUpper;
    }

    /**
     * Sets the value of the salesTangAssetsUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesTangAssetsUpper(BigDecimal value) {
        this.salesTangAssetsUpper = value;
    }

    /**
     * Gets the value of the avgRemPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgRemPerEmpLower() {
        return avgRemPerEmpLower;
    }

    /**
     * Sets the value of the avgRemPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgRemPerEmpLower(BigDecimal value) {
        this.avgRemPerEmpLower = value;
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
     * Gets the value of the avgRemPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgRemPerEmpUpper() {
        return avgRemPerEmpUpper;
    }

    /**
     * Sets the value of the avgRemPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgRemPerEmpUpper(BigDecimal value) {
        this.avgRemPerEmpUpper = value;
    }

    /**
     * Gets the value of the profitPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPerEmpLower() {
        return profitPerEmpLower;
    }

    /**
     * Sets the value of the profitPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPerEmpLower(BigDecimal value) {
        this.profitPerEmpLower = value;
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
     * Gets the value of the profitPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProfitPerEmpUpper() {
        return profitPerEmpUpper;
    }

    /**
     * Sets the value of the profitPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProfitPerEmpUpper(BigDecimal value) {
        this.profitPerEmpUpper = value;
    }

    /**
     * Gets the value of the turnoverPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverPerEmpLower() {
        return turnoverPerEmpLower;
    }

    /**
     * Sets the value of the turnoverPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverPerEmpLower(BigDecimal value) {
        this.turnoverPerEmpLower = value;
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
     * Gets the value of the turnoverPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTurnoverPerEmpUpper() {
        return turnoverPerEmpUpper;
    }

    /**
     * Sets the value of the turnoverPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTurnoverPerEmpUpper(BigDecimal value) {
        this.turnoverPerEmpUpper = value;
    }

    /**
     * Gets the value of the capEmployedPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapEmployedPerEmpLower() {
        return capEmployedPerEmpLower;
    }

    /**
     * Sets the value of the capEmployedPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapEmployedPerEmpLower(BigDecimal value) {
        this.capEmployedPerEmpLower = value;
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
     * Gets the value of the capEmployedPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapEmployedPerEmpUpper() {
        return capEmployedPerEmpUpper;
    }

    /**
     * Sets the value of the capEmployedPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapEmployedPerEmpUpper(BigDecimal value) {
        this.capEmployedPerEmpUpper = value;
    }

    /**
     * Gets the value of the tangAssetsPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTangAssetsPerEmpLower() {
        return tangAssetsPerEmpLower;
    }

    /**
     * Sets the value of the tangAssetsPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTangAssetsPerEmpLower(BigDecimal value) {
        this.tangAssetsPerEmpLower = value;
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
     * Gets the value of the tangAssetsPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTangAssetsPerEmpUpper() {
        return tangAssetsPerEmpUpper;
    }

    /**
     * Sets the value of the tangAssetsPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTangAssetsPerEmpUpper(BigDecimal value) {
        this.tangAssetsPerEmpUpper = value;
    }

    /**
     * Gets the value of the totAssetsPerEmpLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAssetsPerEmpLower() {
        return totAssetsPerEmpLower;
    }

    /**
     * Sets the value of the totAssetsPerEmpLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotAssetsPerEmpLower(BigDecimal value) {
        this.totAssetsPerEmpLower = value;
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
     * Gets the value of the totAssetsPerEmpUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotAssetsPerEmpUpper() {
        return totAssetsPerEmpUpper;
    }

    /**
     * Sets the value of the totAssetsPerEmpUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotAssetsPerEmpUpper(BigDecimal value) {
        this.totAssetsPerEmpUpper = value;
    }

    /**
     * Gets the value of the empRemunerationSalesLower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmpRemunerationSalesLower() {
        return empRemunerationSalesLower;
    }

    /**
     * Sets the value of the empRemunerationSalesLower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmpRemunerationSalesLower(BigDecimal value) {
        this.empRemunerationSalesLower = value;
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
     * Gets the value of the empRemunerationSalesUpper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmpRemunerationSalesUpper() {
        return empRemunerationSalesUpper;
    }

    /**
     * Sets the value of the empRemunerationSalesUpper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmpRemunerationSalesUpper(BigDecimal value) {
        this.empRemunerationSalesUpper = value;
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
