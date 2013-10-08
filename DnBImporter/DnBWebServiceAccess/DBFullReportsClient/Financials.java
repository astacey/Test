
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialInformationEntry" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinancialStatementHeader" type="{http://gateway.dnb.com/getProduct}FinancialStatementHeaderType" minOccurs="0"/>
 *                   &lt;element name="FinancialSummary" type="{http://gateway.dnb.com/getProduct}StandardFinancialSummary" minOccurs="0"/>
 *                   &lt;element name="BalanceSheet" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailedLocalFormat" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Assets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldAssetsType" minOccurs="0"/>
 *                                       &lt;element name="Liabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldLiabilitiesType" minOccurs="0"/>
 *                                       &lt;element name="NetCurrentAssetsLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="TotalAssetsLessCurrentTangibleLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="NetAssetsorCapitalEmployed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="EquityShareholdersFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="TangibleNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                       &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ParentBalanceSheet" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailedLocalFormat" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Assets" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
 *                                                 &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Liabilities" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
 *                                                 &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
 *                                                 &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProfitLossAccounts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ParentProfitLossAccounts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GrowthRates" type="{http://gateway.dnb.com/getProduct}GrowthRatesType" minOccurs="0"/>
 *                   &lt;element name="KeyFinancialRatios" type="{http://gateway.dnb.com/getProduct}KeyFinancialRatios" minOccurs="0"/>
 *                   &lt;element name="KeyIndustryFinancialRatios" type="{http://gateway.dnb.com/getProduct}KeyFinancialIndustryRatiosType" minOccurs="0"/>
 *                   &lt;element name="AuditorsOpinions" type="{http://gateway.dnb.com/getProduct}AuditorsOpinionsType" minOccurs="0"/>
 *                   &lt;element name="ParentInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
 *                             &lt;element name="AddressEntry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CashFlowStatement" type="{http://gateway.dnb.com/getProduct}CashFlowStatementType" minOccurs="0"/>
 *                   &lt;element name="StatementofEarnings" type="{http://gateway.dnb.com/getProduct}StatementOfEarningsType" minOccurs="0"/>
 *                   &lt;element name="SocialBalanceSheet" type="{http://gateway.dnb.com/getProduct}SocialBalanceSheetType" minOccurs="0"/>
 *                   &lt;element name="NotesToAccounts" type="{http://gateway.dnb.com/getProduct}NotesToAccountsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "financialInformationEntry"
})
@XmlRootElement(name = "Financials")
public class Financials {

    @XmlElement(name = "FinancialInformationEntry", required = true)
    protected List<Financials.FinancialInformationEntry> financialInformationEntry;

    /**
     * Gets the value of the financialInformationEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialInformationEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialInformationEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Financials.FinancialInformationEntry }
     * 
     * 
     */
    public List<Financials.FinancialInformationEntry> getFinancialInformationEntry() {
        if (financialInformationEntry == null) {
            financialInformationEntry = new ArrayList<Financials.FinancialInformationEntry>();
        }
        return this.financialInformationEntry;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FinancialStatementHeader" type="{http://gateway.dnb.com/getProduct}FinancialStatementHeaderType" minOccurs="0"/>
     *         &lt;element name="FinancialSummary" type="{http://gateway.dnb.com/getProduct}StandardFinancialSummary" minOccurs="0"/>
     *         &lt;element name="BalanceSheet" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailedLocalFormat" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Assets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldAssetsType" minOccurs="0"/>
     *                             &lt;element name="Liabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldLiabilitiesType" minOccurs="0"/>
     *                             &lt;element name="NetCurrentAssetsLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="TotalAssetsLessCurrentTangibleLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="NetAssetsorCapitalEmployed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="EquityShareholdersFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="TangibleNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                             &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ParentBalanceSheet" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailedLocalFormat" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Assets" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
     *                                       &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Liabilities" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
     *                                       &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
     *                                       &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProfitLossAccounts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ParentProfitLossAccounts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GrowthRates" type="{http://gateway.dnb.com/getProduct}GrowthRatesType" minOccurs="0"/>
     *         &lt;element name="KeyFinancialRatios" type="{http://gateway.dnb.com/getProduct}KeyFinancialRatios" minOccurs="0"/>
     *         &lt;element name="KeyIndustryFinancialRatios" type="{http://gateway.dnb.com/getProduct}KeyFinancialIndustryRatiosType" minOccurs="0"/>
     *         &lt;element name="AuditorsOpinions" type="{http://gateway.dnb.com/getProduct}AuditorsOpinionsType" minOccurs="0"/>
     *         &lt;element name="ParentInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
     *                   &lt;element name="AddressEntry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CashFlowStatement" type="{http://gateway.dnb.com/getProduct}CashFlowStatementType" minOccurs="0"/>
     *         &lt;element name="StatementofEarnings" type="{http://gateway.dnb.com/getProduct}StatementOfEarningsType" minOccurs="0"/>
     *         &lt;element name="SocialBalanceSheet" type="{http://gateway.dnb.com/getProduct}SocialBalanceSheetType" minOccurs="0"/>
     *         &lt;element name="NotesToAccounts" type="{http://gateway.dnb.com/getProduct}NotesToAccountsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "financialStatementHeader",
        "financialSummary",
        "balanceSheet",
        "parentBalanceSheet",
        "profitLossAccounts",
        "parentProfitLossAccounts",
        "growthRates",
        "keyFinancialRatios",
        "keyIndustryFinancialRatios",
        "auditorsOpinions",
        "parentInformation",
        "cashFlowStatement",
        "statementofEarnings",
        "socialBalanceSheet",
        "notesToAccounts"
    })
    public static class FinancialInformationEntry {

        @XmlElement(name = "FinancialStatementHeader")
        protected FinancialStatementHeaderType financialStatementHeader;
        @XmlElement(name = "FinancialSummary")
        protected StandardFinancialSummary financialSummary;
        @XmlElement(name = "BalanceSheet")
        protected Financials.FinancialInformationEntry.BalanceSheet balanceSheet;
        @XmlElement(name = "ParentBalanceSheet")
        protected Financials.FinancialInformationEntry.ParentBalanceSheet parentBalanceSheet;
        @XmlElement(name = "ProfitLossAccounts")
        protected Financials.FinancialInformationEntry.ProfitLossAccounts profitLossAccounts;
        @XmlElement(name = "ParentProfitLossAccounts")
        protected Financials.FinancialInformationEntry.ParentProfitLossAccounts parentProfitLossAccounts;
        @XmlElement(name = "GrowthRates")
        protected GrowthRatesType growthRates;
        @XmlElement(name = "KeyFinancialRatios")
        protected KeyFinancialRatios keyFinancialRatios;
        @XmlElement(name = "KeyIndustryFinancialRatios")
        protected KeyFinancialIndustryRatiosType keyIndustryFinancialRatios;
        @XmlElement(name = "AuditorsOpinions")
        protected AuditorsOpinionsType auditorsOpinions;
        @XmlElement(name = "ParentInformation")
        protected Financials.FinancialInformationEntry.ParentInformation parentInformation;
        @XmlElement(name = "CashFlowStatement")
        protected CashFlowStatementType cashFlowStatement;
        @XmlElement(name = "StatementofEarnings")
        protected StatementOfEarningsType statementofEarnings;
        @XmlElement(name = "SocialBalanceSheet")
        protected SocialBalanceSheetType socialBalanceSheet;
        @XmlElement(name = "NotesToAccounts")
        protected NotesToAccountsType notesToAccounts;

        /**
         * Gets the value of the financialStatementHeader property.
         * 
         * @return
         *     possible object is
         *     {@link FinancialStatementHeaderType }
         *     
         */
        public FinancialStatementHeaderType getFinancialStatementHeader() {
            return financialStatementHeader;
        }

        /**
         * Sets the value of the financialStatementHeader property.
         * 
         * @param value
         *     allowed object is
         *     {@link FinancialStatementHeaderType }
         *     
         */
        public void setFinancialStatementHeader(FinancialStatementHeaderType value) {
            this.financialStatementHeader = value;
        }

        /**
         * Gets the value of the financialSummary property.
         * 
         * @return
         *     possible object is
         *     {@link StandardFinancialSummary }
         *     
         */
        public StandardFinancialSummary getFinancialSummary() {
            return financialSummary;
        }

        /**
         * Sets the value of the financialSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link StandardFinancialSummary }
         *     
         */
        public void setFinancialSummary(StandardFinancialSummary value) {
            this.financialSummary = value;
        }

        /**
         * Gets the value of the balanceSheet property.
         * 
         * @return
         *     possible object is
         *     {@link Financials.FinancialInformationEntry.BalanceSheet }
         *     
         */
        public Financials.FinancialInformationEntry.BalanceSheet getBalanceSheet() {
            return balanceSheet;
        }

        /**
         * Sets the value of the balanceSheet property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials.FinancialInformationEntry.BalanceSheet }
         *     
         */
        public void setBalanceSheet(Financials.FinancialInformationEntry.BalanceSheet value) {
            this.balanceSheet = value;
        }

        /**
         * Gets the value of the parentBalanceSheet property.
         * 
         * @return
         *     possible object is
         *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet }
         *     
         */
        public Financials.FinancialInformationEntry.ParentBalanceSheet getParentBalanceSheet() {
            return parentBalanceSheet;
        }

        /**
         * Sets the value of the parentBalanceSheet property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet }
         *     
         */
        public void setParentBalanceSheet(Financials.FinancialInformationEntry.ParentBalanceSheet value) {
            this.parentBalanceSheet = value;
        }

        /**
         * Gets the value of the profitLossAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link Financials.FinancialInformationEntry.ProfitLossAccounts }
         *     
         */
        public Financials.FinancialInformationEntry.ProfitLossAccounts getProfitLossAccounts() {
            return profitLossAccounts;
        }

        /**
         * Sets the value of the profitLossAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials.FinancialInformationEntry.ProfitLossAccounts }
         *     
         */
        public void setProfitLossAccounts(Financials.FinancialInformationEntry.ProfitLossAccounts value) {
            this.profitLossAccounts = value;
        }

        /**
         * Gets the value of the parentProfitLossAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link Financials.FinancialInformationEntry.ParentProfitLossAccounts }
         *     
         */
        public Financials.FinancialInformationEntry.ParentProfitLossAccounts getParentProfitLossAccounts() {
            return parentProfitLossAccounts;
        }

        /**
         * Sets the value of the parentProfitLossAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials.FinancialInformationEntry.ParentProfitLossAccounts }
         *     
         */
        public void setParentProfitLossAccounts(Financials.FinancialInformationEntry.ParentProfitLossAccounts value) {
            this.parentProfitLossAccounts = value;
        }

        /**
         * Gets the value of the growthRates property.
         * 
         * @return
         *     possible object is
         *     {@link GrowthRatesType }
         *     
         */
        public GrowthRatesType getGrowthRates() {
            return growthRates;
        }

        /**
         * Sets the value of the growthRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link GrowthRatesType }
         *     
         */
        public void setGrowthRates(GrowthRatesType value) {
            this.growthRates = value;
        }

        /**
         * Gets the value of the keyFinancialRatios property.
         * 
         * @return
         *     possible object is
         *     {@link KeyFinancialRatios }
         *     
         */
        public KeyFinancialRatios getKeyFinancialRatios() {
            return keyFinancialRatios;
        }

        /**
         * Sets the value of the keyFinancialRatios property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyFinancialRatios }
         *     
         */
        public void setKeyFinancialRatios(KeyFinancialRatios value) {
            this.keyFinancialRatios = value;
        }

        /**
         * Gets the value of the keyIndustryFinancialRatios property.
         * 
         * @return
         *     possible object is
         *     {@link KeyFinancialIndustryRatiosType }
         *     
         */
        public KeyFinancialIndustryRatiosType getKeyIndustryFinancialRatios() {
            return keyIndustryFinancialRatios;
        }

        /**
         * Sets the value of the keyIndustryFinancialRatios property.
         * 
         * @param value
         *     allowed object is
         *     {@link KeyFinancialIndustryRatiosType }
         *     
         */
        public void setKeyIndustryFinancialRatios(KeyFinancialIndustryRatiosType value) {
            this.keyIndustryFinancialRatios = value;
        }

        /**
         * Gets the value of the auditorsOpinions property.
         * 
         * @return
         *     possible object is
         *     {@link AuditorsOpinionsType }
         *     
         */
        public AuditorsOpinionsType getAuditorsOpinions() {
            return auditorsOpinions;
        }

        /**
         * Sets the value of the auditorsOpinions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AuditorsOpinionsType }
         *     
         */
        public void setAuditorsOpinions(AuditorsOpinionsType value) {
            this.auditorsOpinions = value;
        }

        /**
         * Gets the value of the parentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link Financials.FinancialInformationEntry.ParentInformation }
         *     
         */
        public Financials.FinancialInformationEntry.ParentInformation getParentInformation() {
            return parentInformation;
        }

        /**
         * Sets the value of the parentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Financials.FinancialInformationEntry.ParentInformation }
         *     
         */
        public void setParentInformation(Financials.FinancialInformationEntry.ParentInformation value) {
            this.parentInformation = value;
        }

        /**
         * Gets the value of the cashFlowStatement property.
         * 
         * @return
         *     possible object is
         *     {@link CashFlowStatementType }
         *     
         */
        public CashFlowStatementType getCashFlowStatement() {
            return cashFlowStatement;
        }

        /**
         * Sets the value of the cashFlowStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashFlowStatementType }
         *     
         */
        public void setCashFlowStatement(CashFlowStatementType value) {
            this.cashFlowStatement = value;
        }

        /**
         * Gets the value of the statementofEarnings property.
         * 
         * @return
         *     possible object is
         *     {@link StatementOfEarningsType }
         *     
         */
        public StatementOfEarningsType getStatementofEarnings() {
            return statementofEarnings;
        }

        /**
         * Sets the value of the statementofEarnings property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatementOfEarningsType }
         *     
         */
        public void setStatementofEarnings(StatementOfEarningsType value) {
            this.statementofEarnings = value;
        }

        /**
         * Gets the value of the socialBalanceSheet property.
         * 
         * @return
         *     possible object is
         *     {@link SocialBalanceSheetType }
         *     
         */
        public SocialBalanceSheetType getSocialBalanceSheet() {
            return socialBalanceSheet;
        }

        /**
         * Sets the value of the socialBalanceSheet property.
         * 
         * @param value
         *     allowed object is
         *     {@link SocialBalanceSheetType }
         *     
         */
        public void setSocialBalanceSheet(SocialBalanceSheetType value) {
            this.socialBalanceSheet = value;
        }

        /**
         * Gets the value of the notesToAccounts property.
         * 
         * @return
         *     possible object is
         *     {@link NotesToAccountsType }
         *     
         */
        public NotesToAccountsType getNotesToAccounts() {
            return notesToAccounts;
        }

        /**
         * Sets the value of the notesToAccounts property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotesToAccountsType }
         *     
         */
        public void setNotesToAccounts(NotesToAccountsType value) {
            this.notesToAccounts = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetailedLocalFormat" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Assets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldAssetsType" minOccurs="0"/>
         *                   &lt;element name="Liabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldLiabilitiesType" minOccurs="0"/>
         *                   &lt;element name="NetCurrentAssetsLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="TotalAssetsLessCurrentTangibleLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="NetAssetsorCapitalEmployed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="EquityShareholdersFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="TangibleNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                   &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detailedLocalFormat"
        })
        public static class BalanceSheet {

            @XmlElement(name = "DetailedLocalFormat")
            protected Financials.FinancialInformationEntry.BalanceSheet.DetailedLocalFormat detailedLocalFormat;

            /**
             * Gets the value of the detailedLocalFormat property.
             * 
             * @return
             *     possible object is
             *     {@link Financials.FinancialInformationEntry.BalanceSheet.DetailedLocalFormat }
             *     
             */
            public Financials.FinancialInformationEntry.BalanceSheet.DetailedLocalFormat getDetailedLocalFormat() {
                return detailedLocalFormat;
            }

            /**
             * Sets the value of the detailedLocalFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link Financials.FinancialInformationEntry.BalanceSheet.DetailedLocalFormat }
             *     
             */
            public void setDetailedLocalFormat(Financials.FinancialInformationEntry.BalanceSheet.DetailedLocalFormat value) {
                this.detailedLocalFormat = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Assets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldAssetsType" minOccurs="0"/>
             *         &lt;element name="Liabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldLiabilitiesType" minOccurs="0"/>
             *         &lt;element name="NetCurrentAssetsLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="TotalAssetsLessCurrentTangibleLiabilities" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="NetAssetsorCapitalEmployed" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="EquityShareholdersFunds" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="TangibleNetWorth" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *         &lt;element name="OtherActuarialReserves" type="{http://gateway.dnb.com/getProduct}AmountType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "assets",
                "liabilities",
                "netCurrentAssetsLiabilities",
                "totalAssetsLessCurrentTangibleLiabilities",
                "netAssetsorCapitalEmployed",
                "equityShareholdersFunds",
                "tangibleNetWorth",
                "otherActuarialReserves"
            })
            public static class DetailedLocalFormat {

                @XmlElement(name = "Assets")
                protected BalanceSheetDtldAssetsType assets;
                @XmlElement(name = "Liabilities")
                protected BalanceSheetDtldLiabilitiesType liabilities;
                @XmlElement(name = "NetCurrentAssetsLiabilities")
                protected AmountType netCurrentAssetsLiabilities;
                @XmlElement(name = "TotalAssetsLessCurrentTangibleLiabilities")
                protected AmountType totalAssetsLessCurrentTangibleLiabilities;
                @XmlElement(name = "NetAssetsorCapitalEmployed")
                protected AmountType netAssetsorCapitalEmployed;
                @XmlElement(name = "EquityShareholdersFunds")
                protected AmountType equityShareholdersFunds;
                @XmlElement(name = "TangibleNetWorth")
                protected AmountType tangibleNetWorth;
                @XmlElement(name = "OtherActuarialReserves")
                protected AmountType otherActuarialReserves;

                /**
                 * Gets the value of the assets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BalanceSheetDtldAssetsType }
                 *     
                 */
                public BalanceSheetDtldAssetsType getAssets() {
                    return assets;
                }

                /**
                 * Sets the value of the assets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BalanceSheetDtldAssetsType }
                 *     
                 */
                public void setAssets(BalanceSheetDtldAssetsType value) {
                    this.assets = value;
                }

                /**
                 * Gets the value of the liabilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BalanceSheetDtldLiabilitiesType }
                 *     
                 */
                public BalanceSheetDtldLiabilitiesType getLiabilities() {
                    return liabilities;
                }

                /**
                 * Sets the value of the liabilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BalanceSheetDtldLiabilitiesType }
                 *     
                 */
                public void setLiabilities(BalanceSheetDtldLiabilitiesType value) {
                    this.liabilities = value;
                }

                /**
                 * Gets the value of the netCurrentAssetsLiabilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getNetCurrentAssetsLiabilities() {
                    return netCurrentAssetsLiabilities;
                }

                /**
                 * Sets the value of the netCurrentAssetsLiabilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setNetCurrentAssetsLiabilities(AmountType value) {
                    this.netCurrentAssetsLiabilities = value;
                }

                /**
                 * Gets the value of the totalAssetsLessCurrentTangibleLiabilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getTotalAssetsLessCurrentTangibleLiabilities() {
                    return totalAssetsLessCurrentTangibleLiabilities;
                }

                /**
                 * Sets the value of the totalAssetsLessCurrentTangibleLiabilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setTotalAssetsLessCurrentTangibleLiabilities(AmountType value) {
                    this.totalAssetsLessCurrentTangibleLiabilities = value;
                }

                /**
                 * Gets the value of the netAssetsorCapitalEmployed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getNetAssetsorCapitalEmployed() {
                    return netAssetsorCapitalEmployed;
                }

                /**
                 * Sets the value of the netAssetsorCapitalEmployed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setNetAssetsorCapitalEmployed(AmountType value) {
                    this.netAssetsorCapitalEmployed = value;
                }

                /**
                 * Gets the value of the equityShareholdersFunds property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getEquityShareholdersFunds() {
                    return equityShareholdersFunds;
                }

                /**
                 * Sets the value of the equityShareholdersFunds property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setEquityShareholdersFunds(AmountType value) {
                    this.equityShareholdersFunds = value;
                }

                /**
                 * Gets the value of the tangibleNetWorth property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getTangibleNetWorth() {
                    return tangibleNetWorth;
                }

                /**
                 * Sets the value of the tangibleNetWorth property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setTangibleNetWorth(AmountType value) {
                    this.tangibleNetWorth = value;
                }

                /**
                 * Gets the value of the otherActuarialReserves property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AmountType }
                 *     
                 */
                public AmountType getOtherActuarialReserves() {
                    return otherActuarialReserves;
                }

                /**
                 * Sets the value of the otherActuarialReserves property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AmountType }
                 *     
                 */
                public void setOtherActuarialReserves(AmountType value) {
                    this.otherActuarialReserves = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetailedLocalFormat" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Assets" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
         *                             &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Liabilities" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
         *                             &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
         *                             &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detailedLocalFormat"
        })
        public static class ParentBalanceSheet {

            @XmlElement(name = "DetailedLocalFormat")
            protected Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat detailedLocalFormat;

            /**
             * Gets the value of the detailedLocalFormat property.
             * 
             * @return
             *     possible object is
             *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat }
             *     
             */
            public Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat getDetailedLocalFormat() {
                return detailedLocalFormat;
            }

            /**
             * Sets the value of the detailedLocalFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat }
             *     
             */
            public void setDetailedLocalFormat(Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat value) {
                this.detailedLocalFormat = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Assets" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
             *                   &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Liabilities" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
             *                   &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
             *                   &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "assets",
                "liabilities"
            })
            public static class DetailedLocalFormat {

                @XmlElement(name = "Assets")
                protected Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Assets assets;
                @XmlElement(name = "Liabilities")
                protected Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Liabilities liabilities;

                /**
                 * Gets the value of the assets property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Assets }
                 *     
                 */
                public Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Assets getAssets() {
                    return assets;
                }

                /**
                 * Sets the value of the assets property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Assets }
                 *     
                 */
                public void setAssets(Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Assets value) {
                    this.assets = value;
                }

                /**
                 * Gets the value of the liabilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Liabilities }
                 *     
                 */
                public Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Liabilities getLiabilities() {
                    return liabilities;
                }

                /**
                 * Sets the value of the liabilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Liabilities }
                 *     
                 */
                public void setLiabilities(Financials.FinancialInformationEntry.ParentBalanceSheet.DetailedLocalFormat.Liabilities value) {
                    this.liabilities = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentAssetsType" minOccurs="0"/>
                 *         &lt;element name="NonCurrentAssets" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentAssetsType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "currentAssets",
                    "nonCurrentAssets"
                })
                public static class Assets {

                    @XmlElement(name = "CurrentAssets")
                    protected BalanceSheetDtldCurrentAssetsType currentAssets;
                    @XmlElement(name = "NonCurrentAssets")
                    protected BalanceSheetDtldNonCurrentAssetsType nonCurrentAssets;

                    /**
                     * Gets the value of the currentAssets property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BalanceSheetDtldCurrentAssetsType }
                     *     
                     */
                    public BalanceSheetDtldCurrentAssetsType getCurrentAssets() {
                        return currentAssets;
                    }

                    /**
                     * Sets the value of the currentAssets property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BalanceSheetDtldCurrentAssetsType }
                     *     
                     */
                    public void setCurrentAssets(BalanceSheetDtldCurrentAssetsType value) {
                        this.currentAssets = value;
                    }

                    /**
                     * Gets the value of the nonCurrentAssets property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BalanceSheetDtldNonCurrentAssetsType }
                     *     
                     */
                    public BalanceSheetDtldNonCurrentAssetsType getNonCurrentAssets() {
                        return nonCurrentAssets;
                    }

                    /**
                     * Sets the value of the nonCurrentAssets property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BalanceSheetDtldNonCurrentAssetsType }
                     *     
                     */
                    public void setNonCurrentAssets(BalanceSheetDtldNonCurrentAssetsType value) {
                        this.nonCurrentAssets = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldCurrentLiabilitiesType" minOccurs="0"/>
                 *         &lt;element name="NonCurrentLiabilities" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldNonCurrentLiabilitiesType" minOccurs="0"/>
                 *         &lt;element name="Equity" type="{http://gateway.dnb.com/getProduct}BalanceSheetDtldEquityType" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "currentLiabilities",
                    "nonCurrentLiabilities",
                    "equity"
                })
                public static class Liabilities {

                    @XmlElement(name = "CurrentLiabilities")
                    protected BalanceSheetDtldCurrentLiabilitiesType currentLiabilities;
                    @XmlElement(name = "NonCurrentLiabilities")
                    protected BalanceSheetDtldNonCurrentLiabilitiesType nonCurrentLiabilities;
                    @XmlElement(name = "Equity")
                    protected BalanceSheetDtldEquityType equity;

                    /**
                     * Gets the value of the currentLiabilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BalanceSheetDtldCurrentLiabilitiesType }
                     *     
                     */
                    public BalanceSheetDtldCurrentLiabilitiesType getCurrentLiabilities() {
                        return currentLiabilities;
                    }

                    /**
                     * Sets the value of the currentLiabilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BalanceSheetDtldCurrentLiabilitiesType }
                     *     
                     */
                    public void setCurrentLiabilities(BalanceSheetDtldCurrentLiabilitiesType value) {
                        this.currentLiabilities = value;
                    }

                    /**
                     * Gets the value of the nonCurrentLiabilities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BalanceSheetDtldNonCurrentLiabilitiesType }
                     *     
                     */
                    public BalanceSheetDtldNonCurrentLiabilitiesType getNonCurrentLiabilities() {
                        return nonCurrentLiabilities;
                    }

                    /**
                     * Sets the value of the nonCurrentLiabilities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BalanceSheetDtldNonCurrentLiabilitiesType }
                     *     
                     */
                    public void setNonCurrentLiabilities(BalanceSheetDtldNonCurrentLiabilitiesType value) {
                        this.nonCurrentLiabilities = value;
                    }

                    /**
                     * Gets the value of the equity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BalanceSheetDtldEquityType }
                     *     
                     */
                    public BalanceSheetDtldEquityType getEquity() {
                        return equity;
                    }

                    /**
                     * Sets the value of the equity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BalanceSheetDtldEquityType }
                     *     
                     */
                    public void setEquity(BalanceSheetDtldEquityType value) {
                        this.equity = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DUNSNumber" type="{http://gateway.dnb.com/getProduct}DUNSType" minOccurs="0"/>
         *         &lt;element name="AddressEntry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "dunsNumber",
            "addressEntry"
        })
        public static class ParentInformation {

            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "DUNSNumber")
            protected BigInteger dunsNumber;
            @XmlElement(name = "AddressEntry")
            protected List<Financials.FinancialInformationEntry.ParentInformation.AddressEntry> addressEntry;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the dunsNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDUNSNumber() {
                return dunsNumber;
            }

            /**
             * Sets the value of the dunsNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDUNSNumber(BigInteger value) {
                this.dunsNumber = value;
            }

            /**
             * Gets the value of the addressEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addressEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddressEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Financials.FinancialInformationEntry.ParentInformation.AddressEntry }
             * 
             * 
             */
            public List<Financials.FinancialInformationEntry.ParentInformation.AddressEntry> getAddressEntry() {
                if (addressEntry == null) {
                    addressEntry = new ArrayList<Financials.FinancialInformationEntry.ParentInformation.AddressEntry>();
                }
                return this.addressEntry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://gateway.dnb.com/getProduct}AddressType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="CountryText" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "countryText"
            })
            public static class AddressEntry
                extends AddressType
            {

                @XmlElement(name = "CountryText")
                protected Object countryText;

                /**
                 * Gets the value of the countryText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCountryText() {
                    return countryText;
                }

                /**
                 * Sets the value of the countryText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCountryText(Object value) {
                    this.countryText = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detailedLocalFormat"
        })
        public static class ParentProfitLossAccounts {

            @XmlElement(name = "DetailedLocalFormat")
            protected ProfitLossAccountsType detailedLocalFormat;

            /**
             * Gets the value of the detailedLocalFormat property.
             * 
             * @return
             *     possible object is
             *     {@link ProfitLossAccountsType }
             *     
             */
            public ProfitLossAccountsType getDetailedLocalFormat() {
                return detailedLocalFormat;
            }

            /**
             * Sets the value of the detailedLocalFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProfitLossAccountsType }
             *     
             */
            public void setDetailedLocalFormat(ProfitLossAccountsType value) {
                this.detailedLocalFormat = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetailedLocalFormat" type="{http://gateway.dnb.com/getProduct}ProfitLossAccountsType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detailedLocalFormat"
        })
        public static class ProfitLossAccounts {

            @XmlElement(name = "DetailedLocalFormat")
            protected ProfitLossAccountsType detailedLocalFormat;

            /**
             * Gets the value of the detailedLocalFormat property.
             * 
             * @return
             *     possible object is
             *     {@link ProfitLossAccountsType }
             *     
             */
            public ProfitLossAccountsType getDetailedLocalFormat() {
                return detailedLocalFormat;
            }

            /**
             * Sets the value of the detailedLocalFormat property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProfitLossAccountsType }
             *     
             */
            public void setDetailedLocalFormat(ProfitLossAccountsType value) {
                this.detailedLocalFormat = value;
            }

        }

    }

}
