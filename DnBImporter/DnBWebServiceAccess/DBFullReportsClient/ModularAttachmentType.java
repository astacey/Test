
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModularAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModularAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmbeddedData" type="{http://gateway.dnb.com/getProduct}EmbeddedModularProductDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModularAttachmentType", propOrder = {
    "embeddedData"
})
public class ModularAttachmentType {

    @XmlElement(name = "EmbeddedData", required = true)
    protected EmbeddedModularProductDataType embeddedData;

    /**
     * Gets the value of the embeddedData property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedModularProductDataType }
     *     
     */
    public EmbeddedModularProductDataType getEmbeddedData() {
        return embeddedData;
    }

    /**
     * Sets the value of the embeddedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedModularProductDataType }
     *     
     */
    public void setEmbeddedData(EmbeddedModularProductDataType value) {
        this.embeddedData = value;
    }

}
