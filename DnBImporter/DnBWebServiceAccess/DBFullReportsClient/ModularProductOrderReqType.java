
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModularProductOrderReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModularProductOrderReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSpecification" type="{http://gateway.dnb.com/getProduct}ModularProductSpecificationReqChoiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModularProductOrderReqType", propOrder = {
    "productSpecification"
})
public class ModularProductOrderReqType {

    @XmlElement(name = "ProductSpecification", required = true)
    protected ModularProductSpecificationReqChoiceType productSpecification;

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ModularProductSpecificationReqChoiceType }
     *     
     */
    public ModularProductSpecificationReqChoiceType getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModularProductSpecificationReqChoiceType }
     *     
     */
    public void setProductSpecification(ModularProductSpecificationReqChoiceType value) {
        this.productSpecification = value;
    }

}
