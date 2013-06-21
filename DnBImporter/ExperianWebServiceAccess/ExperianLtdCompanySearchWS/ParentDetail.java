
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="CommDelphiScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommDelphiBand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StabilityOdds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditRating" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestAccountsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NetWorth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GrossProfit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TurnoverSales" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TurnoverHomeNation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TurnoverExport" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GroupLoans" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LiquidityRatio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrentDBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExperienceMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="CommDelphiBandText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentDetail", propOrder = {
    "commercialName",
    "businessLocation",
    "commDelphiScore",
    "commDelphiBand",
    "stabilityOdds",
    "creditRating",
    "creditLimit",
    "dateOfAccounts",
    "currency",
    "currencyMultiplier",
    "consAccounts",
    "latestAccountsType",
    "accountingPeriod",
    "netWorth",
    "grossProfit",
    "turnoverSales",
    "turnoverHomeNation",
    "turnoverExport",
    "groupLiabilities",
    "groupLoans",
    "liquidityRatio",
    "currentDBT",
    "experienceMonth",
    "commDelphiBandText"
})
public class ParentDetail {

    @XmlElement(name = "CommercialName")
    protected String commercialName;
    @XmlElement(name = "BusinessLocation")
    protected LtdBusinessLocation businessLocation;
    @XmlElement(name = "CommDelphiScore")
    protected Integer commDelphiScore;
    @XmlElement(name = "CommDelphiBand")
    protected String commDelphiBand;
    @XmlElement(name = "StabilityOdds")
    protected String stabilityOdds;
    @XmlElement(name = "CreditRating")
    protected Long creditRating;
    @XmlElement(name = "CreditLimit")
    protected Long creditLimit;
    @XmlElement(name = "DateOfAccounts")
    protected CCYYMMDD dateOfAccounts;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CurrencyMultiplier")
    protected String currencyMultiplier;
    @XmlElement(name = "ConsAccounts")
    protected String consAccounts;
    @XmlElement(name = "LatestAccountsType")
    protected String latestAccountsType;
    @XmlElement(name = "AccountingPeriod")
    protected Integer accountingPeriod;
    @XmlElement(name = "NetWorth")
    protected Long netWorth;
    @XmlElement(name = "GrossProfit")
    protected Long grossProfit;
    @XmlElement(name = "TurnoverSales")
    protected Long turnoverSales;
    @XmlElement(name = "TurnoverHomeNation")
    protected Long turnoverHomeNation;
    @XmlElement(name = "TurnoverExport")
    protected Long turnoverExport;
    @XmlElement(name = "GroupLiabilities")
    protected Long groupLiabilities;
    @XmlElement(name = "GroupLoans")
    protected Long groupLoans;
    @XmlElement(name = "LiquidityRatio")
    protected Long liquidityRatio;
    @XmlElement(name = "CurrentDBT")
    protected Integer currentDBT;
    @XmlElement(name = "ExperienceMonth")
    protected CCYYMM experienceMonth;
    @XmlElement(name = "CommDelphiBandText")
    protected String commDelphiBandText;

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

    /**
     * Gets the value of the businessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public LtdBusinessLocation getBusinessLocation() {
        return businessLocation;
    }

    /**
     * Sets the value of the businessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LtdBusinessLocation }
     *     
     */
    public void setBusinessLocation(LtdBusinessLocation value) {
        this.businessLocation = value;
    }

    /**
     * Gets the value of the commDelphiScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommDelphiScore() {
        return commDelphiScore;
    }

    /**
     * Sets the value of the commDelphiScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommDelphiScore(Integer value) {
        this.commDelphiScore = value;
    }

    /**
     * Gets the value of the commDelphiBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDelphiBand() {
        return commDelphiBand;
    }

    /**
     * Sets the value of the commDelphiBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDelphiBand(String value) {
        this.commDelphiBand = value;
    }

    /**
     * Gets the value of the stabilityOdds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStabilityOdds() {
        return stabilityOdds;
    }

    /**
     * Sets the value of the stabilityOdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStabilityOdds(String value) {
        this.stabilityOdds = value;
    }

    /**
     * Gets the value of the creditRating property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditRating() {
        return creditRating;
    }

    /**
     * Sets the value of the creditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditRating(Long value) {
        this.creditRating = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditLimit(Long value) {
        this.creditLimit = value;
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
     * Gets the value of the netWorth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetWorth() {
        return netWorth;
    }

    /**
     * Sets the value of the netWorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetWorth(Long value) {
        this.netWorth = value;
    }

    /**
     * Gets the value of the grossProfit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGrossProfit() {
        return grossProfit;
    }

    /**
     * Sets the value of the grossProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGrossProfit(Long value) {
        this.grossProfit = value;
    }

    /**
     * Gets the value of the turnoverSales property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverSales() {
        return turnoverSales;
    }

    /**
     * Sets the value of the turnoverSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverSales(Long value) {
        this.turnoverSales = value;
    }

    /**
     * Gets the value of the turnoverHomeNation property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverHomeNation() {
        return turnoverHomeNation;
    }

    /**
     * Sets the value of the turnoverHomeNation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverHomeNation(Long value) {
        this.turnoverHomeNation = value;
    }

    /**
     * Gets the value of the turnoverExport property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTurnoverExport() {
        return turnoverExport;
    }

    /**
     * Sets the value of the turnoverExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTurnoverExport(Long value) {
        this.turnoverExport = value;
    }

    /**
     * Gets the value of the groupLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupLiabilities() {
        return groupLiabilities;
    }

    /**
     * Sets the value of the groupLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupLiabilities(Long value) {
        this.groupLiabilities = value;
    }

    /**
     * Gets the value of the groupLoans property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupLoans() {
        return groupLoans;
    }

    /**
     * Sets the value of the groupLoans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupLoans(Long value) {
        this.groupLoans = value;
    }

    /**
     * Gets the value of the liquidityRatio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLiquidityRatio() {
        return liquidityRatio;
    }

    /**
     * Sets the value of the liquidityRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLiquidityRatio(Long value) {
        this.liquidityRatio = value;
    }

    /**
     * Gets the value of the currentDBT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentDBT() {
        return currentDBT;
    }

    /**
     * Sets the value of the currentDBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentDBT(Integer value) {
        this.currentDBT = value;
    }

    /**
     * Gets the value of the experienceMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getExperienceMonth() {
        return experienceMonth;
    }

    /**
     * Sets the value of the experienceMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setExperienceMonth(CCYYMM value) {
        this.experienceMonth = value;
    }

    /**
     * Gets the value of the commDelphiBandText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommDelphiBandText() {
        return commDelphiBandText;
    }

    /**
     * Sets the value of the commDelphiBandText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommDelphiBandText(String value) {
        this.commDelphiBandText = value;
    }

}
