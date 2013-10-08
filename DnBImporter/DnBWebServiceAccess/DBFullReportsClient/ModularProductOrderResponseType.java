
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModularProductOrderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModularProductOrderResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSpecification" type="{http://gateway.dnb.com/getProduct}ModularProductSpecificationResType"/>
 *         &lt;element name="Attachment" type="{http://gateway.dnb.com/getProduct}ModularAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModularProductOrderResponseType", propOrder = {
    "productSpecification",
    "attachment"
})
public class ModularProductOrderResponseType {

    @XmlElement(name = "ProductSpecification", required = true)
    protected ModularProductSpecificationResType productSpecification;
    @XmlElement(name = "Attachment")
    protected List<ModularAttachmentType> attachment;

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ModularProductSpecificationResType }
     *     
     */
    public ModularProductSpecificationResType getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModularProductSpecificationResType }
     *     
     */
    public void setProductSpecification(ModularProductSpecificationResType value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModularAttachmentType }
     * 
     * 
     */
    public List<ModularAttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<ModularAttachmentType>();
        }
        return this.attachment;
    }

}
