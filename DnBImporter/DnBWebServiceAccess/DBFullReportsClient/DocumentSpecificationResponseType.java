
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSpecificationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSpecificationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentRequirements" type="{http://gateway.dnb.com/getProduct}DocumentRequirementsResponseType" maxOccurs="unbounded"/>
 *         &lt;element name="LanguageCode" type="{http://gateway.dnb.com/getProduct}ProductLanguageCodeType"/>
 *         &lt;element name="ProductCode" type="{http://gateway.dnb.com/getProduct}ProductCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSpecificationResponseType", propOrder = {
    "documentRequirements",
    "languageCode",
    "productCode"
})
public class DocumentSpecificationResponseType {

    @XmlElement(name = "DocumentRequirements", required = true)
    protected List<DocumentRequirementsResponseType> documentRequirements;
    @XmlElement(name = "LanguageCode", required = true)
    protected String languageCode;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;

    /**
     * Gets the value of the documentRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentRequirementsResponseType }
     * 
     * 
     */
    public List<DocumentRequirementsResponseType> getDocumentRequirements() {
        if (documentRequirements == null) {
            documentRequirements = new ArrayList<DocumentRequirementsResponseType>();
        }
        return this.documentRequirements;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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

}
