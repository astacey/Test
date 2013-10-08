
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringSpecificationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringSpecificationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductLanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType" minOccurs="0"/>
 *         &lt;element name="OrderReferenceText" type="{http://gateway.dnb.com/getProduct}OrderReferenceTextType" minOccurs="0"/>
 *         &lt;element name="OrderReasonCode" type="{http://gateway.dnb.com/getProduct}OrderReasonCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringSpecificationResponseType", propOrder = {
    "productLanguageCode",
    "orderReferenceText",
    "orderReasonCode"
})
public class MonitoringSpecificationResponseType {

    @XmlElement(name = "ProductLanguageCode")
    protected String productLanguageCode;
    @XmlElement(name = "OrderReferenceText")
    protected String orderReferenceText;
    @XmlElement(name = "OrderReasonCode", defaultValue = "0")
    protected String orderReasonCode;

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

}
