
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accounts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AccountingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsolidatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DormancyFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestAccountsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestatedAccounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BalanceSheet" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}BalanceSheet" minOccurs="0"/>
 *         &lt;element name="ProfitLoss" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ProfitLoss" minOccurs="0"/>
 *         &lt;element name="DiscontinuedOperations" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}DiscontinuedOperations" minOccurs="0"/>
 *         &lt;element name="DisclosureItems" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}DisclosureItems" minOccurs="0"/>
 *         &lt;element name="ContingentLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostBalanceSheetEvents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharitableGivingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharitableGivingValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accounts", propOrder = {
    "dateOfAccounts",
    "accountingPeriod",
    "currency",
    "currencyMultiplier",
    "companyClass",
    "consolidatedAccounts",
    "dormancyFlag",
    "latestAccountsType",
    "restatedAccounts",
    "balanceSheet",
    "profitLoss",
    "discontinuedOperations",
    "disclosureItems",
    "contingentLiability",
    "postBalanceSheetEvents",
    "charitableGivingIndicator",
    "charitableGivingValue"
})
public class Accounts {

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
    @XmlElement(name = "ConsolidatedAccounts")
    protected String consolidatedAccounts;
    @XmlElement(name = "DormancyFlag")
    protected String dormancyFlag;
    @XmlElement(name = "LatestAccountsType")
    protected String latestAccountsType;
    @XmlElement(name = "RestatedAccounts")
    protected String restatedAccounts;
    @XmlElement(name = "BalanceSheet")
    protected BalanceSheet balanceSheet;
    @XmlElement(name = "ProfitLoss")
    protected ProfitLoss profitLoss;
    @XmlElement(name = "DiscontinuedOperations")
    protected DiscontinuedOperations discontinuedOperations;
    @XmlElement(name = "DisclosureItems")
    protected DisclosureItems disclosureItems;
    @XmlElement(name = "ContingentLiability")
    protected String contingentLiability;
    @XmlElement(name = "PostBalanceSheetEvents")
    protected String postBalanceSheetEvents;
    @XmlElement(name = "CharitableGivingIndicator")
    protected String charitableGivingIndicator;
    @XmlElement(name = "CharitableGivingValue")
    protected Long charitableGivingValue;

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
     * Gets the value of the consolidatedAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidatedAccounts() {
        return consolidatedAccounts;
    }

    /**
     * Sets the value of the consolidatedAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidatedAccounts(String value) {
        this.consolidatedAccounts = value;
    }

    /**
     * Gets the value of the dormancyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDormancyFlag() {
        return dormancyFlag;
    }

    /**
     * Sets the value of the dormancyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDormancyFlag(String value) {
        this.dormancyFlag = value;
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
     * Gets the value of the balanceSheet property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSheet }
     *     
     */
    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Sets the value of the balanceSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSheet }
     *     
     */
    public void setBalanceSheet(BalanceSheet value) {
        this.balanceSheet = value;
    }

    /**
     * Gets the value of the profitLoss property.
     * 
     * @return
     *     possible object is
     *     {@link ProfitLoss }
     *     
     */
    public ProfitLoss getProfitLoss() {
        return profitLoss;
    }

    /**
     * Sets the value of the profitLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfitLoss }
     *     
     */
    public void setProfitLoss(ProfitLoss value) {
        this.profitLoss = value;
    }

    /**
     * Gets the value of the discontinuedOperations property.
     * 
     * @return
     *     possible object is
     *     {@link DiscontinuedOperations }
     *     
     */
    public DiscontinuedOperations getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    /**
     * Sets the value of the discontinuedOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscontinuedOperations }
     *     
     */
    public void setDiscontinuedOperations(DiscontinuedOperations value) {
        this.discontinuedOperations = value;
    }

    /**
     * Gets the value of the disclosureItems property.
     * 
     * @return
     *     possible object is
     *     {@link DisclosureItems }
     *     
     */
    public DisclosureItems getDisclosureItems() {
        return disclosureItems;
    }

    /**
     * Sets the value of the disclosureItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureItems }
     *     
     */
    public void setDisclosureItems(DisclosureItems value) {
        this.disclosureItems = value;
    }

    /**
     * Gets the value of the contingentLiability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContingentLiability() {
        return contingentLiability;
    }

    /**
     * Sets the value of the contingentLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContingentLiability(String value) {
        this.contingentLiability = value;
    }

    /**
     * Gets the value of the postBalanceSheetEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBalanceSheetEvents() {
        return postBalanceSheetEvents;
    }

    /**
     * Sets the value of the postBalanceSheetEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBalanceSheetEvents(String value) {
        this.postBalanceSheetEvents = value;
    }

    /**
     * Gets the value of the charitableGivingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharitableGivingIndicator() {
        return charitableGivingIndicator;
    }

    /**
     * Sets the value of the charitableGivingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharitableGivingIndicator(String value) {
        this.charitableGivingIndicator = value;
    }

    /**
     * Gets the value of the charitableGivingValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCharitableGivingValue() {
        return charitableGivingValue;
    }

    /**
     * Sets the value of the charitableGivingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCharitableGivingValue(Long value) {
        this.charitableGivingValue = value;
    }

}
