
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductOrderReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOrderReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSpecification" type="{http://gateway.dnb.com/getProduct}ProductSpecificationReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOrderReqType", propOrder = {
    "productSpecification"
})
public class ProductOrderReqType {

    @XmlElement(name = "ProductSpecification", required = true)
    protected ProductSpecificationReqType productSpecification;

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecificationReqType }
     *     
     */
    public ProductSpecificationReqType getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecificationReqType }
     *     
     */
    public void setProductSpecification(ProductSpecificationReqType value) {
        this.productSpecification = value;
    }

}
