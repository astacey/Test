
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentOrderReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentOrderReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentSpecification" type="{http://gateway.dnb.com/getProduct}DocumentSpecificationReqType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentOrderReqType", propOrder = {
    "documentSpecification"
})
public class DocumentOrderReqType {

    @XmlElement(name = "DocumentSpecification", required = true)
    protected DocumentSpecificationReqType documentSpecification;

    /**
     * Gets the value of the documentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSpecificationReqType }
     *     
     */
    public DocumentSpecificationReqType getDocumentSpecification() {
        return documentSpecification;
    }

    /**
     * Sets the value of the documentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSpecificationReqType }
     *     
     */
    public void setDocumentSpecification(DocumentSpecificationReqType value) {
        this.documentSpecification = value;
    }

}
