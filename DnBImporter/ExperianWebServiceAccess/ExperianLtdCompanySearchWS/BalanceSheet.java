
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BalanceSheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TangibleAssetsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}TangibleAssetsDetails" minOccurs="0"/>
 *         &lt;element name="IntangibleAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InvestmentAssetsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}InvestmentAssetsDetails" minOccurs="0"/>
 *         &lt;element name="FinancialAssetsNonCurrentDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}FinancialAssetsNonCurrentDetails" minOccurs="0"/>
 *         &lt;element name="OtherNonCurrentAssetsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}OtherNonCurrentAssetsDetails" minOccurs="0"/>
 *         &lt;element name="TotalFixedNonCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InventoriesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}InventoriesDetails" minOccurs="0"/>
 *         &lt;element name="DebtorsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}DebtorsDetails" minOccurs="0"/>
 *         &lt;element name="TotalCashDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}TotalCashDetails" minOccurs="0"/>
 *         &lt;element name="FinancialAssetsCurrentDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}FinancialAssetsCurrentDetails" minOccurs="0"/>
 *         &lt;element name="OtherCurrentAssetsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}OtherCurrentAssetsDetails" minOccurs="0"/>
 *         &lt;element name="TotalCurrentAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreditorsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CreditorsDetails" minOccurs="0"/>
 *         &lt;element name="FinancialLiabilitiesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}FinancialLiabilitiesDetails" minOccurs="0"/>
 *         &lt;element name="OtherCurrentLiabilitiesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}OtherCurrentLiabilitiesDetails" minOccurs="0"/>
 *         &lt;element name="TotalCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="WorkingCapital" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CapitalEmployed" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LongTermFinancialLiabilitiesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LongTermFinancialLiabilitiesDetails" minOccurs="0"/>
 *         &lt;element name="OtherNonCurrentLiabilitiesDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}OtherNonCurrentLiabilitiesDetails" minOccurs="0"/>
 *         &lt;element name="TotalNonCurrentLiabilities" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ProvisionsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ProvisionsDetails" minOccurs="0"/>
 *         &lt;element name="MinorityInterestsUKGAAP" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NetAssets" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IssuedCapitalDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}IssuedCapitalDetails" minOccurs="0"/>
 *         &lt;element name="SharePremium" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InterestInOwnShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RetainedEarnings" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RevaluationReserve" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrencyTranslationReserve" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TotalShareholdersFunds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MinorityInterestsIFRS" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NetWorth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSheet", propOrder = {
    "tangibleAssetsDetails",
    "intangibleAssets",
    "investmentAssetsDetails",
    "financialAssetsNonCurrentDetails",
    "otherNonCurrentAssetsDetails",
    "totalFixedNonCurrentAssets",
    "inventoriesDetails",
    "debtorsDetails",
    "totalCashDetails",
    "financialAssetsCurrentDetails",
    "otherCurrentAssetsDetails",
    "totalCurrentAssets",
    "creditorsDetails",
    "financialLiabilitiesDetails",
    "otherCurrentLiabilitiesDetails",
    "totalCurrentLiabilities",
    "workingCapital",
    "capitalEmployed",
    "longTermFinancialLiabilitiesDetails",
    "otherNonCurrentLiabilitiesDetails",
    "totalNonCurrentLiabilities",
    "provisionsDetails",
    "minorityInterestsUKGAAP",
    "netAssets",
    "issuedCapitalDetails",
    "sharePremium",
    "interestInOwnShares",
    "retainedEarnings",
    "revaluationReserve",
    "currencyTranslationReserve",
    "other",
    "totalShareholdersFunds",
    "minorityInterestsIFRS",
    "netWorth"
})
public class BalanceSheet {

    @XmlElement(name = "TangibleAssetsDetails")
    protected TangibleAssetsDetails tangibleAssetsDetails;
    @XmlElement(name = "IntangibleAssets")
    protected Long intangibleAssets;
    @XmlElement(name = "InvestmentAssetsDetails")
    protected InvestmentAssetsDetails investmentAssetsDetails;
    @XmlElement(name = "FinancialAssetsNonCurrentDetails")
    protected FinancialAssetsNonCurrentDetails financialAssetsNonCurrentDetails;
    @XmlElement(name = "OtherNonCurrentAssetsDetails")
    protected OtherNonCurrentAssetsDetails otherNonCurrentAssetsDetails;
    @XmlElement(name = "TotalFixedNonCurrentAssets")
    protected Long totalFixedNonCurrentAssets;
    @XmlElement(name = "InventoriesDetails")
    protected InventoriesDetails inventoriesDetails;
    @XmlElement(name = "DebtorsDetails")
    protected DebtorsDetails debtorsDetails;
    @XmlElement(name = "TotalCashDetails")
    protected TotalCashDetails totalCashDetails;
    @XmlElement(name = "FinancialAssetsCurrentDetails")
    protected FinancialAssetsCurrentDetails financialAssetsCurrentDetails;
    @XmlElement(name = "OtherCurrentAssetsDetails")
    protected OtherCurrentAssetsDetails otherCurrentAssetsDetails;
    @XmlElement(name = "TotalCurrentAssets")
    protected Long totalCurrentAssets;
    @XmlElement(name = "CreditorsDetails")
    protected CreditorsDetails creditorsDetails;
    @XmlElement(name = "FinancialLiabilitiesDetails")
    protected FinancialLiabilitiesDetails financialLiabilitiesDetails;
    @XmlElement(name = "OtherCurrentLiabilitiesDetails")
    protected OtherCurrentLiabilitiesDetails otherCurrentLiabilitiesDetails;
    @XmlElement(name = "TotalCurrentLiabilities")
    protected Long totalCurrentLiabilities;
    @XmlElement(name = "WorkingCapital")
    protected Long workingCapital;
    @XmlElement(name = "CapitalEmployed")
    protected Long capitalEmployed;
    @XmlElement(name = "LongTermFinancialLiabilitiesDetails")
    protected LongTermFinancialLiabilitiesDetails longTermFinancialLiabilitiesDetails;
    @XmlElement(name = "OtherNonCurrentLiabilitiesDetails")
    protected OtherNonCurrentLiabilitiesDetails otherNonCurrentLiabilitiesDetails;
    @XmlElement(name = "TotalNonCurrentLiabilities")
    protected Long totalNonCurrentLiabilities;
    @XmlElement(name = "ProvisionsDetails")
    protected ProvisionsDetails provisionsDetails;
    @XmlElement(name = "MinorityInterestsUKGAAP")
    protected Long minorityInterestsUKGAAP;
    @XmlElement(name = "NetAssets")
    protected Long netAssets;
    @XmlElement(name = "IssuedCapitalDetails")
    protected IssuedCapitalDetails issuedCapitalDetails;
    @XmlElement(name = "SharePremium")
    protected Long sharePremium;
    @XmlElement(name = "InterestInOwnShares")
    protected Long interestInOwnShares;
    @XmlElement(name = "RetainedEarnings")
    protected Long retainedEarnings;
    @XmlElement(name = "RevaluationReserve")
    protected Long revaluationReserve;
    @XmlElement(name = "CurrencyTranslationReserve")
    protected Long currencyTranslationReserve;
    @XmlElement(name = "Other")
    protected Long other;
    @XmlElement(name = "TotalShareholdersFunds")
    protected Long totalShareholdersFunds;
    @XmlElement(name = "MinorityInterestsIFRS")
    protected Long minorityInterestsIFRS;
    @XmlElement(name = "NetWorth")
    protected Long netWorth;

    /**
     * Gets the value of the tangibleAssetsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TangibleAssetsDetails }
     *     
     */
    public TangibleAssetsDetails getTangibleAssetsDetails() {
        return tangibleAssetsDetails;
    }

    /**
     * Sets the value of the tangibleAssetsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TangibleAssetsDetails }
     *     
     */
    public void setTangibleAssetsDetails(TangibleAssetsDetails value) {
        this.tangibleAssetsDetails = value;
    }

    /**
     * Gets the value of the intangibleAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntangibleAssets() {
        return intangibleAssets;
    }

    /**
     * Sets the value of the intangibleAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntangibleAssets(Long value) {
        this.intangibleAssets = value;
    }

    /**
     * Gets the value of the investmentAssetsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAssetsDetails }
     *     
     */
    public InvestmentAssetsDetails getInvestmentAssetsDetails() {
        return investmentAssetsDetails;
    }

    /**
     * Sets the value of the investmentAssetsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAssetsDetails }
     *     
     */
    public void setInvestmentAssetsDetails(InvestmentAssetsDetails value) {
        this.investmentAssetsDetails = value;
    }

    /**
     * Gets the value of the financialAssetsNonCurrentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAssetsNonCurrentDetails }
     *     
     */
    public FinancialAssetsNonCurrentDetails getFinancialAssetsNonCurrentDetails() {
        return financialAssetsNonCurrentDetails;
    }

    /**
     * Sets the value of the financialAssetsNonCurrentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAssetsNonCurrentDetails }
     *     
     */
    public void setFinancialAssetsNonCurrentDetails(FinancialAssetsNonCurrentDetails value) {
        this.financialAssetsNonCurrentDetails = value;
    }

    /**
     * Gets the value of the otherNonCurrentAssetsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNonCurrentAssetsDetails }
     *     
     */
    public OtherNonCurrentAssetsDetails getOtherNonCurrentAssetsDetails() {
        return otherNonCurrentAssetsDetails;
    }

    /**
     * Sets the value of the otherNonCurrentAssetsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNonCurrentAssetsDetails }
     *     
     */
    public void setOtherNonCurrentAssetsDetails(OtherNonCurrentAssetsDetails value) {
        this.otherNonCurrentAssetsDetails = value;
    }

    /**
     * Gets the value of the totalFixedNonCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalFixedNonCurrentAssets() {
        return totalFixedNonCurrentAssets;
    }

    /**
     * Sets the value of the totalFixedNonCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalFixedNonCurrentAssets(Long value) {
        this.totalFixedNonCurrentAssets = value;
    }

    /**
     * Gets the value of the inventoriesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InventoriesDetails }
     *     
     */
    public InventoriesDetails getInventoriesDetails() {
        return inventoriesDetails;
    }

    /**
     * Sets the value of the inventoriesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoriesDetails }
     *     
     */
    public void setInventoriesDetails(InventoriesDetails value) {
        this.inventoriesDetails = value;
    }

    /**
     * Gets the value of the debtorsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorsDetails }
     *     
     */
    public DebtorsDetails getDebtorsDetails() {
        return debtorsDetails;
    }

    /**
     * Sets the value of the debtorsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorsDetails }
     *     
     */
    public void setDebtorsDetails(DebtorsDetails value) {
        this.debtorsDetails = value;
    }

    /**
     * Gets the value of the totalCashDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCashDetails }
     *     
     */
    public TotalCashDetails getTotalCashDetails() {
        return totalCashDetails;
    }

    /**
     * Sets the value of the totalCashDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCashDetails }
     *     
     */
    public void setTotalCashDetails(TotalCashDetails value) {
        this.totalCashDetails = value;
    }

    /**
     * Gets the value of the financialAssetsCurrentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAssetsCurrentDetails }
     *     
     */
    public FinancialAssetsCurrentDetails getFinancialAssetsCurrentDetails() {
        return financialAssetsCurrentDetails;
    }

    /**
     * Sets the value of the financialAssetsCurrentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAssetsCurrentDetails }
     *     
     */
    public void setFinancialAssetsCurrentDetails(FinancialAssetsCurrentDetails value) {
        this.financialAssetsCurrentDetails = value;
    }

    /**
     * Gets the value of the otherCurrentAssetsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCurrentAssetsDetails }
     *     
     */
    public OtherCurrentAssetsDetails getOtherCurrentAssetsDetails() {
        return otherCurrentAssetsDetails;
    }

    /**
     * Sets the value of the otherCurrentAssetsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCurrentAssetsDetails }
     *     
     */
    public void setOtherCurrentAssetsDetails(OtherCurrentAssetsDetails value) {
        this.otherCurrentAssetsDetails = value;
    }

    /**
     * Gets the value of the totalCurrentAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    /**
     * Sets the value of the totalCurrentAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCurrentAssets(Long value) {
        this.totalCurrentAssets = value;
    }

    /**
     * Gets the value of the creditorsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorsDetails }
     *     
     */
    public CreditorsDetails getCreditorsDetails() {
        return creditorsDetails;
    }

    /**
     * Sets the value of the creditorsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorsDetails }
     *     
     */
    public void setCreditorsDetails(CreditorsDetails value) {
        this.creditorsDetails = value;
    }

    /**
     * Gets the value of the financialLiabilitiesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialLiabilitiesDetails }
     *     
     */
    public FinancialLiabilitiesDetails getFinancialLiabilitiesDetails() {
        return financialLiabilitiesDetails;
    }

    /**
     * Sets the value of the financialLiabilitiesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialLiabilitiesDetails }
     *     
     */
    public void setFinancialLiabilitiesDetails(FinancialLiabilitiesDetails value) {
        this.financialLiabilitiesDetails = value;
    }

    /**
     * Gets the value of the otherCurrentLiabilitiesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCurrentLiabilitiesDetails }
     *     
     */
    public OtherCurrentLiabilitiesDetails getOtherCurrentLiabilitiesDetails() {
        return otherCurrentLiabilitiesDetails;
    }

    /**
     * Sets the value of the otherCurrentLiabilitiesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCurrentLiabilitiesDetails }
     *     
     */
    public void setOtherCurrentLiabilitiesDetails(OtherCurrentLiabilitiesDetails value) {
        this.otherCurrentLiabilitiesDetails = value;
    }

    /**
     * Gets the value of the totalCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    /**
     * Sets the value of the totalCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalCurrentLiabilities(Long value) {
        this.totalCurrentLiabilities = value;
    }

    /**
     * Gets the value of the workingCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkingCapital() {
        return workingCapital;
    }

    /**
     * Sets the value of the workingCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkingCapital(Long value) {
        this.workingCapital = value;
    }

    /**
     * Gets the value of the capitalEmployed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapitalEmployed() {
        return capitalEmployed;
    }

    /**
     * Sets the value of the capitalEmployed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapitalEmployed(Long value) {
        this.capitalEmployed = value;
    }

    /**
     * Gets the value of the longTermFinancialLiabilitiesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LongTermFinancialLiabilitiesDetails }
     *     
     */
    public LongTermFinancialLiabilitiesDetails getLongTermFinancialLiabilitiesDetails() {
        return longTermFinancialLiabilitiesDetails;
    }

    /**
     * Sets the value of the longTermFinancialLiabilitiesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongTermFinancialLiabilitiesDetails }
     *     
     */
    public void setLongTermFinancialLiabilitiesDetails(LongTermFinancialLiabilitiesDetails value) {
        this.longTermFinancialLiabilitiesDetails = value;
    }

    /**
     * Gets the value of the otherNonCurrentLiabilitiesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNonCurrentLiabilitiesDetails }
     *     
     */
    public OtherNonCurrentLiabilitiesDetails getOtherNonCurrentLiabilitiesDetails() {
        return otherNonCurrentLiabilitiesDetails;
    }

    /**
     * Sets the value of the otherNonCurrentLiabilitiesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNonCurrentLiabilitiesDetails }
     *     
     */
    public void setOtherNonCurrentLiabilitiesDetails(OtherNonCurrentLiabilitiesDetails value) {
        this.otherNonCurrentLiabilitiesDetails = value;
    }

    /**
     * Gets the value of the totalNonCurrentLiabilities property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalNonCurrentLiabilities() {
        return totalNonCurrentLiabilities;
    }

    /**
     * Sets the value of the totalNonCurrentLiabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalNonCurrentLiabilities(Long value) {
        this.totalNonCurrentLiabilities = value;
    }

    /**
     * Gets the value of the provisionsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProvisionsDetails }
     *     
     */
    public ProvisionsDetails getProvisionsDetails() {
        return provisionsDetails;
    }

    /**
     * Sets the value of the provisionsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvisionsDetails }
     *     
     */
    public void setProvisionsDetails(ProvisionsDetails value) {
        this.provisionsDetails = value;
    }

    /**
     * Gets the value of the minorityInterestsUKGAAP property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinorityInterestsUKGAAP() {
        return minorityInterestsUKGAAP;
    }

    /**
     * Sets the value of the minorityInterestsUKGAAP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinorityInterestsUKGAAP(Long value) {
        this.minorityInterestsUKGAAP = value;
    }

    /**
     * Gets the value of the netAssets property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetAssets() {
        return netAssets;
    }

    /**
     * Sets the value of the netAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetAssets(Long value) {
        this.netAssets = value;
    }

    /**
     * Gets the value of the issuedCapitalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IssuedCapitalDetails }
     *     
     */
    public IssuedCapitalDetails getIssuedCapitalDetails() {
        return issuedCapitalDetails;
    }

    /**
     * Sets the value of the issuedCapitalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuedCapitalDetails }
     *     
     */
    public void setIssuedCapitalDetails(IssuedCapitalDetails value) {
        this.issuedCapitalDetails = value;
    }

    /**
     * Gets the value of the sharePremium property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharePremium() {
        return sharePremium;
    }

    /**
     * Sets the value of the sharePremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharePremium(Long value) {
        this.sharePremium = value;
    }

    /**
     * Gets the value of the interestInOwnShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterestInOwnShares() {
        return interestInOwnShares;
    }

    /**
     * Sets the value of the interestInOwnShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterestInOwnShares(Long value) {
        this.interestInOwnShares = value;
    }

    /**
     * Gets the value of the retainedEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetainedEarnings() {
        return retainedEarnings;
    }

    /**
     * Sets the value of the retainedEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetainedEarnings(Long value) {
        this.retainedEarnings = value;
    }

    /**
     * Gets the value of the revaluationReserve property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevaluationReserve() {
        return revaluationReserve;
    }

    /**
     * Sets the value of the revaluationReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevaluationReserve(Long value) {
        this.revaluationReserve = value;
    }

    /**
     * Gets the value of the currencyTranslationReserve property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrencyTranslationReserve() {
        return currencyTranslationReserve;
    }

    /**
     * Sets the value of the currencyTranslationReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrencyTranslationReserve(Long value) {
        this.currencyTranslationReserve = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOther(Long value) {
        this.other = value;
    }

    /**
     * Gets the value of the totalShareholdersFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalShareholdersFunds() {
        return totalShareholdersFunds;
    }

    /**
     * Sets the value of the totalShareholdersFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalShareholdersFunds(Long value) {
        this.totalShareholdersFunds = value;
    }

    /**
     * Gets the value of the minorityInterestsIFRS property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMinorityInterestsIFRS() {
        return minorityInterestsIFRS;
    }

    /**
     * Sets the value of the minorityInterestsIFRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinorityInterestsIFRS(Long value) {
        this.minorityInterestsIFRS = value;
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

}
