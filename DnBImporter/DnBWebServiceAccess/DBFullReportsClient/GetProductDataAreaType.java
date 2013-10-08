
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusInformation" type="{http://gateway.dnb.com/getProduct}StatusInformationType"/>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationType"/>
 *         &lt;element name="ProductOrder" type="{http://gateway.dnb.com/getProduct}ProductOrderResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductDataAreaType", propOrder = {
    "statusInformation",
    "customerInformation",
    "subjectInformation",
    "productOrder"
})
public class GetProductDataAreaType {

    @XmlElement(name = "StatusInformation", required = true)
    protected StatusInformationType statusInformation;
    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationType subjectInformation;
    @XmlElement(name = "ProductOrder", required = true)
    protected ProductOrderResponseType productOrder;

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StatusInformationType }
     *     
     */
    public StatusInformationType getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInformationType }
     *     
     */
    public void setStatusInformation(StatusInformationType value) {
        this.statusInformation = value;
    }

    /**
     * Gets the value of the customerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInformationType }
     *     
     */
    public CustomerInformationType getCustomerInformation() {
        return customerInformation;
    }

    /**
     * Sets the value of the customerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInformationType }
     *     
     */
    public void setCustomerInformation(CustomerInformationType value) {
        this.customerInformation = value;
    }

    /**
     * Gets the value of the subjectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectInformationType }
     *     
     */
    public SubjectInformationType getSubjectInformation() {
        return subjectInformation;
    }

    /**
     * Sets the value of the subjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectInformationType }
     *     
     */
    public void setSubjectInformation(SubjectInformationType value) {
        this.subjectInformation = value;
    }

    /**
     * Gets the value of the productOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOrderResponseType }
     *     
     */
    public ProductOrderResponseType getProductOrder() {
        return productOrder;
    }

    /**
     * Sets the value of the productOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOrderResponseType }
     *     
     */
    public void setProductOrder(ProductOrderResponseType value) {
        this.productOrder = value;
    }

}
