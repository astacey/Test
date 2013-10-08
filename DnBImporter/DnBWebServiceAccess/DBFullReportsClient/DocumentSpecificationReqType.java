
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSpecificationReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSpecificationReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingRequirements" type="{http://gateway.dnb.com/getProduct}FilingRequirementsType" maxOccurs="unbounded"/>
 *         &lt;element name="ProductCode" type="{http://gateway.dnb.com/getProduct}ProductCodeType"/>
 *         &lt;element name="ProductLanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType"/>
 *         &lt;element name="OrderReferenceText" type="{http://gateway.dnb.com/getProduct}OrderReferenceTextType"/>
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
@XmlType(name = "DocumentSpecificationReqType", propOrder = {
    "filingRequirements",
    "productCode",
    "productLanguageCode",
    "orderReferenceText",
    "productDeliveryFormat"
})
public class DocumentSpecificationReqType {

    @XmlElement(name = "FilingRequirements", required = true)
    protected List<FilingRequirementsType> filingRequirements;
    @XmlElement(name = "ProductCode", required = true, defaultValue = "13916")
    protected String productCode;
    @XmlElement(name = "ProductLanguageCode", required = true)
    protected String productLanguageCode;
    @XmlElement(name = "OrderReferenceText", required = true)
    protected String orderReferenceText;
    @XmlElement(name = "ProductDeliveryFormat", required = true, defaultValue = "PDF")
    protected ProductDeliveryFormatType productDeliveryFormat;

    /**
     * Gets the value of the filingRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filingRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilingRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingRequirementsType }
     * 
     * 
     */
    public List<FilingRequirementsType> getFilingRequirements() {
        if (filingRequirements == null) {
            filingRequirements = new ArrayList<FilingRequirementsType>();
        }
        return this.filingRequirements;
    }

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
