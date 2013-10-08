
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyFinancialIndustryRatiosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyFinancialIndustryRatiosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Profitability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProfitMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="NetSalesMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="GrossSaleMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="ShareholdersReturn" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="ReturnOnCapital" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="ReturnOnAssets" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="ReturnOnValueAdded" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FinancialStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AcidTestRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="CurrentRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="SolvencyRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="FixedAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="NonCurrentAssetsOverNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="CurrentLiabilitiesToNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="FinancialExpensesOverSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="DegreeOfIndebtedness" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AssetUtility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StockTurnoverRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="CollectionPeriodDays" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="AssetsToSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="SalesToNetWorkingCapital" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="TurnoverOverAssets" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="CreditorsToSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EmployeeRatios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SalesPerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="ProfitPerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="AverageWagePerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
 *                   &lt;element name="PayrollOverValueAdded" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
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
@XmlType(name = "KeyFinancialIndustryRatiosType", propOrder = {
    "profitability",
    "financialStatus",
    "assetUtility",
    "employeeRatios"
})
public class KeyFinancialIndustryRatiosType {

    @XmlElement(name = "Profitability")
    protected KeyFinancialIndustryRatiosType.Profitability profitability;
    @XmlElement(name = "FinancialStatus")
    protected KeyFinancialIndustryRatiosType.FinancialStatus financialStatus;
    @XmlElement(name = "AssetUtility")
    protected KeyFinancialIndustryRatiosType.AssetUtility assetUtility;
    @XmlElement(name = "EmployeeRatios")
    protected KeyFinancialIndustryRatiosType.EmployeeRatios employeeRatios;

    /**
     * Gets the value of the profitability property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialIndustryRatiosType.Profitability }
     *     
     */
    public KeyFinancialIndustryRatiosType.Profitability getProfitability() {
        return profitability;
    }

    /**
     * Sets the value of the profitability property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialIndustryRatiosType.Profitability }
     *     
     */
    public void setProfitability(KeyFinancialIndustryRatiosType.Profitability value) {
        this.profitability = value;
    }

    /**
     * Gets the value of the financialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialIndustryRatiosType.FinancialStatus }
     *     
     */
    public KeyFinancialIndustryRatiosType.FinancialStatus getFinancialStatus() {
        return financialStatus;
    }

    /**
     * Sets the value of the financialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialIndustryRatiosType.FinancialStatus }
     *     
     */
    public void setFinancialStatus(KeyFinancialIndustryRatiosType.FinancialStatus value) {
        this.financialStatus = value;
    }

    /**
     * Gets the value of the assetUtility property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialIndustryRatiosType.AssetUtility }
     *     
     */
    public KeyFinancialIndustryRatiosType.AssetUtility getAssetUtility() {
        return assetUtility;
    }

    /**
     * Sets the value of the assetUtility property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialIndustryRatiosType.AssetUtility }
     *     
     */
    public void setAssetUtility(KeyFinancialIndustryRatiosType.AssetUtility value) {
        this.assetUtility = value;
    }

    /**
     * Gets the value of the employeeRatios property.
     * 
     * @return
     *     possible object is
     *     {@link KeyFinancialIndustryRatiosType.EmployeeRatios }
     *     
     */
    public KeyFinancialIndustryRatiosType.EmployeeRatios getEmployeeRatios() {
        return employeeRatios;
    }

    /**
     * Sets the value of the employeeRatios property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFinancialIndustryRatiosType.EmployeeRatios }
     *     
     */
    public void setEmployeeRatios(KeyFinancialIndustryRatiosType.EmployeeRatios value) {
        this.employeeRatios = value;
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
     *         &lt;element name="StockTurnoverRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="CollectionPeriodDays" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="AssetsToSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="SalesToNetWorkingCapital" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="TurnoverOverAssets" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="CreditorsToSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
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
        "stockTurnoverRatio",
        "collectionPeriodDays",
        "assetsToSales",
        "salesToNetWorkingCapital",
        "turnoverOverAssets",
        "creditorsToSales"
    })
    public static class AssetUtility {

        @XmlElement(name = "StockTurnoverRatio")
        protected KFRIndustryQuartilesType stockTurnoverRatio;
        @XmlElement(name = "CollectionPeriodDays")
        protected KFRIndustryQuartilesType collectionPeriodDays;
        @XmlElement(name = "AssetsToSales")
        protected KFRIndustryQuartilesType assetsToSales;
        @XmlElement(name = "SalesToNetWorkingCapital")
        protected KFRIndustryQuartilesType salesToNetWorkingCapital;
        @XmlElement(name = "TurnoverOverAssets")
        protected KFRIndustryQuartilesType turnoverOverAssets;
        @XmlElement(name = "CreditorsToSales")
        protected KFRIndustryQuartilesType creditorsToSales;

        /**
         * Gets the value of the stockTurnoverRatio property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getStockTurnoverRatio() {
            return stockTurnoverRatio;
        }

        /**
         * Sets the value of the stockTurnoverRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setStockTurnoverRatio(KFRIndustryQuartilesType value) {
            this.stockTurnoverRatio = value;
        }

        /**
         * Gets the value of the collectionPeriodDays property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getCollectionPeriodDays() {
            return collectionPeriodDays;
        }

        /**
         * Sets the value of the collectionPeriodDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setCollectionPeriodDays(KFRIndustryQuartilesType value) {
            this.collectionPeriodDays = value;
        }

        /**
         * Gets the value of the assetsToSales property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getAssetsToSales() {
            return assetsToSales;
        }

        /**
         * Sets the value of the assetsToSales property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setAssetsToSales(KFRIndustryQuartilesType value) {
            this.assetsToSales = value;
        }

        /**
         * Gets the value of the salesToNetWorkingCapital property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getSalesToNetWorkingCapital() {
            return salesToNetWorkingCapital;
        }

        /**
         * Sets the value of the salesToNetWorkingCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setSalesToNetWorkingCapital(KFRIndustryQuartilesType value) {
            this.salesToNetWorkingCapital = value;
        }

        /**
         * Gets the value of the turnoverOverAssets property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getTurnoverOverAssets() {
            return turnoverOverAssets;
        }

        /**
         * Sets the value of the turnoverOverAssets property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setTurnoverOverAssets(KFRIndustryQuartilesType value) {
            this.turnoverOverAssets = value;
        }

        /**
         * Gets the value of the creditorsToSales property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getCreditorsToSales() {
            return creditorsToSales;
        }

        /**
         * Sets the value of the creditorsToSales property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setCreditorsToSales(KFRIndustryQuartilesType value) {
            this.creditorsToSales = value;
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
     *         &lt;element name="SalesPerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="ProfitPerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="AverageWagePerEmployee" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="PayrollOverValueAdded" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
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
        "salesPerEmployee",
        "profitPerEmployee",
        "averageWagePerEmployee",
        "payrollOverValueAdded"
    })
    public static class EmployeeRatios {

        @XmlElement(name = "SalesPerEmployee")
        protected KFRIndustryQuartilesType salesPerEmployee;
        @XmlElement(name = "ProfitPerEmployee")
        protected KFRIndustryQuartilesType profitPerEmployee;
        @XmlElement(name = "AverageWagePerEmployee")
        protected KFRIndustryQuartilesType averageWagePerEmployee;
        @XmlElement(name = "PayrollOverValueAdded")
        protected KFRIndustryQuartilesType payrollOverValueAdded;

        /**
         * Gets the value of the salesPerEmployee property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getSalesPerEmployee() {
            return salesPerEmployee;
        }

        /**
         * Sets the value of the salesPerEmployee property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setSalesPerEmployee(KFRIndustryQuartilesType value) {
            this.salesPerEmployee = value;
        }

        /**
         * Gets the value of the profitPerEmployee property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getProfitPerEmployee() {
            return profitPerEmployee;
        }

        /**
         * Sets the value of the profitPerEmployee property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setProfitPerEmployee(KFRIndustryQuartilesType value) {
            this.profitPerEmployee = value;
        }

        /**
         * Gets the value of the averageWagePerEmployee property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getAverageWagePerEmployee() {
            return averageWagePerEmployee;
        }

        /**
         * Sets the value of the averageWagePerEmployee property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setAverageWagePerEmployee(KFRIndustryQuartilesType value) {
            this.averageWagePerEmployee = value;
        }

        /**
         * Gets the value of the payrollOverValueAdded property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getPayrollOverValueAdded() {
            return payrollOverValueAdded;
        }

        /**
         * Sets the value of the payrollOverValueAdded property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setPayrollOverValueAdded(KFRIndustryQuartilesType value) {
            this.payrollOverValueAdded = value;
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
     *         &lt;element name="AcidTestRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="CurrentRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="SolvencyRatio" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="FixedAssetsToNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="NonCurrentAssetsOverNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="CurrentLiabilitiesToNetWorth" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="FinancialExpensesOverSales" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="DegreeOfIndebtedness" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
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
        "acidTestRatio",
        "currentRatio",
        "solvencyRatio",
        "fixedAssetsToNetWorth",
        "nonCurrentAssetsOverNetWorth",
        "currentLiabilitiesToNetWorth",
        "financialExpensesOverSales",
        "degreeOfIndebtedness"
    })
    public static class FinancialStatus {

        @XmlElement(name = "AcidTestRatio")
        protected KFRIndustryQuartilesType acidTestRatio;
        @XmlElement(name = "CurrentRatio")
        protected KFRIndustryQuartilesType currentRatio;
        @XmlElement(name = "SolvencyRatio")
        protected KFRIndustryQuartilesType solvencyRatio;
        @XmlElement(name = "FixedAssetsToNetWorth")
        protected KFRIndustryQuartilesType fixedAssetsToNetWorth;
        @XmlElement(name = "NonCurrentAssetsOverNetWorth")
        protected KFRIndustryQuartilesType nonCurrentAssetsOverNetWorth;
        @XmlElement(name = "CurrentLiabilitiesToNetWorth")
        protected KFRIndustryQuartilesType currentLiabilitiesToNetWorth;
        @XmlElement(name = "FinancialExpensesOverSales")
        protected KFRIndustryQuartilesType financialExpensesOverSales;
        @XmlElement(name = "DegreeOfIndebtedness")
        protected KFRIndustryQuartilesType degreeOfIndebtedness;

        /**
         * Gets the value of the acidTestRatio property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getAcidTestRatio() {
            return acidTestRatio;
        }

        /**
         * Sets the value of the acidTestRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setAcidTestRatio(KFRIndustryQuartilesType value) {
            this.acidTestRatio = value;
        }

        /**
         * Gets the value of the currentRatio property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getCurrentRatio() {
            return currentRatio;
        }

        /**
         * Sets the value of the currentRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setCurrentRatio(KFRIndustryQuartilesType value) {
            this.currentRatio = value;
        }

        /**
         * Gets the value of the solvencyRatio property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getSolvencyRatio() {
            return solvencyRatio;
        }

        /**
         * Sets the value of the solvencyRatio property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setSolvencyRatio(KFRIndustryQuartilesType value) {
            this.solvencyRatio = value;
        }

        /**
         * Gets the value of the fixedAssetsToNetWorth property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getFixedAssetsToNetWorth() {
            return fixedAssetsToNetWorth;
        }

        /**
         * Sets the value of the fixedAssetsToNetWorth property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setFixedAssetsToNetWorth(KFRIndustryQuartilesType value) {
            this.fixedAssetsToNetWorth = value;
        }

        /**
         * Gets the value of the nonCurrentAssetsOverNetWorth property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getNonCurrentAssetsOverNetWorth() {
            return nonCurrentAssetsOverNetWorth;
        }

        /**
         * Sets the value of the nonCurrentAssetsOverNetWorth property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setNonCurrentAssetsOverNetWorth(KFRIndustryQuartilesType value) {
            this.nonCurrentAssetsOverNetWorth = value;
        }

        /**
         * Gets the value of the currentLiabilitiesToNetWorth property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getCurrentLiabilitiesToNetWorth() {
            return currentLiabilitiesToNetWorth;
        }

        /**
         * Sets the value of the currentLiabilitiesToNetWorth property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setCurrentLiabilitiesToNetWorth(KFRIndustryQuartilesType value) {
            this.currentLiabilitiesToNetWorth = value;
        }

        /**
         * Gets the value of the financialExpensesOverSales property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getFinancialExpensesOverSales() {
            return financialExpensesOverSales;
        }

        /**
         * Sets the value of the financialExpensesOverSales property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setFinancialExpensesOverSales(KFRIndustryQuartilesType value) {
            this.financialExpensesOverSales = value;
        }

        /**
         * Gets the value of the degreeOfIndebtedness property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getDegreeOfIndebtedness() {
            return degreeOfIndebtedness;
        }

        /**
         * Sets the value of the degreeOfIndebtedness property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setDegreeOfIndebtedness(KFRIndustryQuartilesType value) {
            this.degreeOfIndebtedness = value;
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
     *         &lt;element name="ProfitMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="NetSalesMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="GrossSaleMargin" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="ShareholdersReturn" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="ReturnOnCapital" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="ReturnOnAssets" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
     *         &lt;element name="ReturnOnValueAdded" type="{http://gateway.dnb.com/getProduct}KFRIndustryQuartilesType" minOccurs="0"/>
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
        "profitMargin",
        "netSalesMargin",
        "grossSaleMargin",
        "shareholdersReturn",
        "returnOnCapital",
        "returnOnAssets",
        "returnOnValueAdded"
    })
    public static class Profitability {

        @XmlElement(name = "ProfitMargin")
        protected KFRIndustryQuartilesType profitMargin;
        @XmlElement(name = "NetSalesMargin")
        protected KFRIndustryQuartilesType netSalesMargin;
        @XmlElement(name = "GrossSaleMargin")
        protected KFRIndustryQuartilesType grossSaleMargin;
        @XmlElement(name = "ShareholdersReturn")
        protected KFRIndustryQuartilesType shareholdersReturn;
        @XmlElement(name = "ReturnOnCapital")
        protected KFRIndustryQuartilesType returnOnCapital;
        @XmlElement(name = "ReturnOnAssets")
        protected KFRIndustryQuartilesType returnOnAssets;
        @XmlElement(name = "ReturnOnValueAdded")
        protected KFRIndustryQuartilesType returnOnValueAdded;

        /**
         * Gets the value of the profitMargin property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getProfitMargin() {
            return profitMargin;
        }

        /**
         * Sets the value of the profitMargin property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setProfitMargin(KFRIndustryQuartilesType value) {
            this.profitMargin = value;
        }

        /**
         * Gets the value of the netSalesMargin property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getNetSalesMargin() {
            return netSalesMargin;
        }

        /**
         * Sets the value of the netSalesMargin property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setNetSalesMargin(KFRIndustryQuartilesType value) {
            this.netSalesMargin = value;
        }

        /**
         * Gets the value of the grossSaleMargin property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getGrossSaleMargin() {
            return grossSaleMargin;
        }

        /**
         * Sets the value of the grossSaleMargin property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setGrossSaleMargin(KFRIndustryQuartilesType value) {
            this.grossSaleMargin = value;
        }

        /**
         * Gets the value of the shareholdersReturn property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getShareholdersReturn() {
            return shareholdersReturn;
        }

        /**
         * Sets the value of the shareholdersReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setShareholdersReturn(KFRIndustryQuartilesType value) {
            this.shareholdersReturn = value;
        }

        /**
         * Gets the value of the returnOnCapital property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getReturnOnCapital() {
            return returnOnCapital;
        }

        /**
         * Sets the value of the returnOnCapital property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setReturnOnCapital(KFRIndustryQuartilesType value) {
            this.returnOnCapital = value;
        }

        /**
         * Gets the value of the returnOnAssets property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getReturnOnAssets() {
            return returnOnAssets;
        }

        /**
         * Sets the value of the returnOnAssets property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setReturnOnAssets(KFRIndustryQuartilesType value) {
            this.returnOnAssets = value;
        }

        /**
         * Gets the value of the returnOnValueAdded property.
         * 
         * @return
         *     possible object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public KFRIndustryQuartilesType getReturnOnValueAdded() {
            return returnOnValueAdded;
        }

        /**
         * Sets the value of the returnOnValueAdded property.
         * 
         * @param value
         *     allowed object is
         *     {@link KFRIndustryQuartilesType }
         *     
         */
        public void setReturnOnValueAdded(KFRIndustryQuartilesType value) {
            this.returnOnValueAdded = value;
        }

    }

}
