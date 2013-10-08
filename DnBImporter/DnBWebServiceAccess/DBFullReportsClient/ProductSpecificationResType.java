
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecificationResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecificationResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://gateway.dnb.com/getProduct}ProductCodeType"/>
 *         &lt;element name="ProductLanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType"/>
 *         &lt;element name="TradeUpIndicator" type="{http://gateway.dnb.com/getProduct}TradeUpIndicatorType"/>
 *         &lt;element name="OrderReferenceText" type="{http://gateway.dnb.com/getProduct}OrderReferenceTextType"/>
 *         &lt;element name="OrderReasonCode" type="{http://gateway.dnb.com/getProduct}OrderReasonCodeType"/>
 *         &lt;element name="ProductDeliveryFormat" type="{http://gateway.dnb.com/getProduct}ProductDeliveryFormatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecificationResType", propOrder = {
    "productCode",
    "productLanguageCode",
    "tradeUpIndicator",
    "orderReferenceText",
    "orderReasonCode",
    "productDeliveryFormat"
})
public class ProductSpecificationResType {

    @XmlElement(name = "ProductCode", required = true, defaultValue = "13714")
    protected String productCode;
    @XmlElement(name = "ProductLanguageCode", required = true)
    protected String productLanguageCode;
    @XmlElement(name = "TradeUpIndicator", defaultValue = "false")
    protected boolean tradeUpIndicator;
    @XmlElement(name = "OrderReferenceText", required = true)
    protected String orderReferenceText;
    @XmlElement(name = "OrderReasonCode", required = true, defaultValue = "0")
    protected String orderReasonCode;
    @XmlElement(name = "ProductDeliveryFormat", required = true, defaultValue = "HTML")
    protected ProductDeliveryFormatType productDeliveryFormat;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
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
     *     {@link ProductDeliveryFormatType }
     *     
     */
    public ProductDeliveryFormatType getProductDeliveryFormat() {
        return productDeliveryFormat;
    }

    /**
     * Sets the value of the productDeliveryFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDeliveryFormatType }
     *     
     */
    public void setProductDeliveryFormat(ProductDeliveryFormatType value) {
        this.productDeliveryFormat = value;
    }

}
