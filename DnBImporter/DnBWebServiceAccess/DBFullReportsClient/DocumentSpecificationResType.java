
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSpecificationResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSpecificationResType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://gateway.dnb.com/getProduct}ProductCodeType"/>
 *         &lt;element name="ProductLanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType"/>
 *         &lt;element name="OrderReferenceText" type="{http://gateway.dnb.com/getProduct}OrderReferenceTextType"/>
 *         &lt;element name="FilingRequirements" type="{http://gateway.dnb.com/getProduct}FilingRequirementsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSpecificationResType", propOrder = {
    "productCode",
    "productLanguageCode",
    "orderReferenceText",
    "filingRequirements"
})
public class DocumentSpecificationResType {

    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "ProductLanguageCode", required = true)
    protected String productLanguageCode;
    @XmlElement(name = "OrderReferenceText", required = true)
    protected String orderReferenceText;
    @XmlElement(name = "FilingRequirements", required = true)
    protected FilingRequirementsType filingRequirements;

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
     * Gets the value of the filingRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link FilingRequirementsType }
     *     
     */
    public FilingRequirementsType getFilingRequirements() {
        return filingRequirements;
    }

    /**
     * Sets the value of the filingRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilingRequirementsType }
     *     
     */
    public void setFilingRequirements(FilingRequirementsType value) {
        this.filingRequirements = value;
    }

}
