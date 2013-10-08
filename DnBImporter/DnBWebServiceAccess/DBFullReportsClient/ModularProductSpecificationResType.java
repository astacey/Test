
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModularProductSpecificationResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModularProductSpecificationResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://gateway.dnb.com/getProduct}ModularProductCodeType"/>
 *         &lt;element name="IncludePublicFilings" type="{http://gateway.dnb.com/getProduct}IncludePublicFilingsType" minOccurs="0"/>
 *         &lt;element name="IncludeCompanySummary" type="{http://gateway.dnb.com/getProduct}IncludeCompanySummaryType" minOccurs="0"/>
 *         &lt;element name="IncludeIdentification" type="{http://gateway.dnb.com/getProduct}IncludeIdentificationType" minOccurs="0"/>
 *         &lt;element name="IncludeSpecialEvents" type="{http://gateway.dnb.com/getProduct}IncludeSpecialEventsType" minOccurs="0"/>
 *         &lt;element name="IncludeCorporateLinkage" type="{http://gateway.dnb.com/getProduct}IncludeCorporateLinkageType" minOccurs="0"/>
 *         &lt;element name="IncludeFinancials" type="{http://gateway.dnb.com/getProduct}IncludeFinancialsType" minOccurs="0"/>
 *         &lt;element name="IncludePaymentInformation" type="{http://gateway.dnb.com/getProduct}IncludePaymentInformationType" minOccurs="0"/>
 *         &lt;element name="IncludePredictiveScores" type="{http://gateway.dnb.com/getProduct}IncludePredictiveScoresType" minOccurs="0"/>
 *         &lt;element name="IncludePrincipals" type="{http://gateway.dnb.com/getProduct}IncludePrincipalsType" minOccurs="0"/>
 *         &lt;element name="IncludeOperationsandHistory" type="{http://gateway.dnb.com/getProduct}IncludeHistoryType" minOccurs="0"/>
 *         &lt;element name="ProductLanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType"/>
 *         &lt;element name="TradeUpIndicator" type="{http://gateway.dnb.com/getProduct}TradeUpIndicatorType"/>
 *         &lt;element name="OrderReferenceText" type="{http://gateway.dnb.com/getProduct}OrderReferenceTextType"/>
 *         &lt;element name="OrderReasonCode" type="{http://gateway.dnb.com/getProduct}OrderReasonCodeType" minOccurs="0"/>
 *         &lt;element name="ProductDeliveryFormat" type="{http://gateway.dnb.com/getProduct}ModularProductDeliveryFormatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModularProductSpecificationResType", propOrder = {
    "productCode",
    "includePublicFilings",
    "includeCompanySummary",
    "includeIdentification",
    "includeSpecialEvents",
    "includeCorporateLinkage",
    "includeFinancials",
    "includePaymentInformation",
    "includePredictiveScores",
    "includePrincipals",
    "includeOperationsandHistory",
    "productLanguageCode",
    "tradeUpIndicator",
    "orderReferenceText",
    "orderReasonCode",
    "productDeliveryFormat"
})
public class ModularProductSpecificationResType {

    @XmlElement(name = "ProductCode", required = true, defaultValue = "20644")
    protected BigInteger productCode;
    @XmlElement(name = "IncludePublicFilings", defaultValue = "false")
    protected IncludePublicFilingsType includePublicFilings;
    @XmlElement(name = "IncludeCompanySummary", defaultValue = "false")
    protected IncludeCompanySummaryType includeCompanySummary;
    @XmlElement(name = "IncludeIdentification", defaultValue = "false")
    protected IncludeIdentificationType includeIdentification;
    @XmlElement(name = "IncludeSpecialEvents", defaultValue = "false")
    protected IncludeSpecialEventsType includeSpecialEvents;
    @XmlElement(name = "IncludeCorporateLinkage", defaultValue = "false")
    protected IncludeCorporateLinkageType includeCorporateLinkage;
    @XmlElement(name = "IncludeFinancials", defaultValue = "false")
    protected IncludeFinancialsType includeFinancials;
    @XmlElement(name = "IncludePaymentInformation", defaultValue = "false")
    protected IncludePaymentInformationType includePaymentInformation;
    @XmlElement(name = "IncludePredictiveScores", defaultValue = "false")
    protected IncludePredictiveScoresType includePredictiveScores;
    @XmlElement(name = "IncludePrincipals", defaultValue = "false")
    protected IncludePrincipalsType includePrincipals;
    @XmlElement(name = "IncludeOperationsandHistory", defaultValue = "false")
    protected IncludeHistoryType includeOperationsandHistory;
    @XmlElement(name = "ProductLanguageCode", required = true)
    protected String productLanguageCode;
    @XmlElement(name = "TradeUpIndicator", defaultValue = "false")
    protected boolean tradeUpIndicator;
    @XmlElement(name = "OrderReferenceText", required = true)
    protected String orderReferenceText;
    @XmlElement(name = "OrderReasonCode", defaultValue = "0")
    protected String orderReasonCode;
    @XmlElement(name = "ProductDeliveryFormat", required = true, defaultValue = "XML")
    protected String productDeliveryFormat;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductCode(BigInteger value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the includePublicFilings property.
     * 
     * @return
     *     possible object is
     *     {@link IncludePublicFilingsType }
     *     
     */
    public IncludePublicFilingsType getIncludePublicFilings() {
        return includePublicFilings;
    }

    /**
     * Sets the value of the includePublicFilings property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludePublicFilingsType }
     *     
     */
    public void setIncludePublicFilings(IncludePublicFilingsType value) {
        this.includePublicFilings = value;
    }

    /**
     * Gets the value of the includeCompanySummary property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeCompanySummaryType }
     *     
     */
    public IncludeCompanySummaryType getIncludeCompanySummary() {
        return includeCompanySummary;
    }

    /**
     * Sets the value of the includeCompanySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeCompanySummaryType }
     *     
     */
    public void setIncludeCompanySummary(IncludeCompanySummaryType value) {
        this.includeCompanySummary = value;
    }

    /**
     * Gets the value of the includeIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeIdentificationType }
     *     
     */
    public IncludeIdentificationType getIncludeIdentification() {
        return includeIdentification;
    }

    /**
     * Sets the value of the includeIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeIdentificationType }
     *     
     */
    public void setIncludeIdentification(IncludeIdentificationType value) {
        this.includeIdentification = value;
    }

    /**
     * Gets the value of the includeSpecialEvents property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeSpecialEventsType }
     *     
     */
    public IncludeSpecialEventsType getIncludeSpecialEvents() {
        return includeSpecialEvents;
    }

    /**
     * Sets the value of the includeSpecialEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeSpecialEventsType }
     *     
     */
    public void setIncludeSpecialEvents(IncludeSpecialEventsType value) {
        this.includeSpecialEvents = value;
    }

    /**
     * Gets the value of the includeCorporateLinkage property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeCorporateLinkageType }
     *     
     */
    public IncludeCorporateLinkageType getIncludeCorporateLinkage() {
        return includeCorporateLinkage;
    }

    /**
     * Sets the value of the includeCorporateLinkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeCorporateLinkageType }
     *     
     */
    public void setIncludeCorporateLinkage(IncludeCorporateLinkageType value) {
        this.includeCorporateLinkage = value;
    }

    /**
     * Gets the value of the includeFinancials property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeFinancialsType }
     *     
     */
    public IncludeFinancialsType getIncludeFinancials() {
        return includeFinancials;
    }

    /**
     * Sets the value of the includeFinancials property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeFinancialsType }
     *     
     */
    public void setIncludeFinancials(IncludeFinancialsType value) {
        this.includeFinancials = value;
    }

    /**
     * Gets the value of the includePaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IncludePaymentInformationType }
     *     
     */
    public IncludePaymentInformationType getIncludePaymentInformation() {
        return includePaymentInformation;
    }

    /**
     * Sets the value of the includePaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludePaymentInformationType }
     *     
     */
    public void setIncludePaymentInformation(IncludePaymentInformationType value) {
        this.includePaymentInformation = value;
    }

    /**
     * Gets the value of the includePredictiveScores property.
     * 
     * @return
     *     possible object is
     *     {@link IncludePredictiveScoresType }
     *     
     */
    public IncludePredictiveScoresType getIncludePredictiveScores() {
        return includePredictiveScores;
    }

    /**
     * Sets the value of the includePredictiveScores property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludePredictiveScoresType }
     *     
     */
    public void setIncludePredictiveScores(IncludePredictiveScoresType value) {
        this.includePredictiveScores = value;
    }

    /**
     * Gets the value of the includePrincipals property.
     * 
     * @return
     *     possible object is
     *     {@link IncludePrincipalsType }
     *     
     */
    public IncludePrincipalsType getIncludePrincipals() {
        return includePrincipals;
    }

    /**
     * Sets the value of the includePrincipals property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludePrincipalsType }
     *     
     */
    public void setIncludePrincipals(IncludePrincipalsType value) {
        this.includePrincipals = value;
    }

    /**
     * Gets the value of the includeOperationsandHistory property.
     * 
     * @return
     *     possible object is
     *     {@link IncludeHistoryType }
     *     
     */
    public IncludeHistoryType getIncludeOperationsandHistory() {
        return includeOperationsandHistory;
    }

    /**
     * Sets the value of the includeOperationsandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeHistoryType }
     *     
     */
    public void setIncludeOperationsandHistory(IncludeHistoryType value) {
        this.includeOperationsandHistory = value;
    }

    /**
     * Gets the value of the productLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLanguageCode() {
        return productLanguageCode;
    }

    /**
     * Sets the value of the productLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLanguageCode(String value) {
        this.productLanguageCode = value;
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     */
    public boolean isTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     */
    public void setTradeUpIndicator(boolean value) {
        this.tradeUpIndicator = value;
    }

    /**
     * Gets the value of the orderReferenceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReferenceText() {
        return orderReferenceText;
    }

    /**
     * Sets the value of the orderReferenceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReferenceText(String value) {
        this.orderReferenceText = value;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderReasonCode(String value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the productDeliveryFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDeliveryFormat() {
        return productDeliveryFormat;
    }

    /**
     * Sets the value of the productDeliveryFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDeliveryFormat(String value) {
        this.productDeliveryFormat = value;
    }

}
