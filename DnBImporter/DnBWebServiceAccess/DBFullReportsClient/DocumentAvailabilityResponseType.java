
package DBFullReportsClient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAvailabilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentAvailabilityResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentSpecification" type="{http://gateway.dnb.com/getProduct}DocumentSpecificationResponseType"/>
 *         &lt;element name="Attachment" type="{http://gateway.dnb.com/getProduct}DocumentAvailabilityAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAvailabilityResponseType", propOrder = {
    "documentSpecification",
    "attachment"
})
public class DocumentAvailabilityResponseType {

    @XmlElement(name = "DocumentSpecification", required = true)
    protected DocumentSpecificationResponseType documentSpecification;
    @XmlElement(name = "Attachment")
    protected List<DocumentAvailabilityAttachmentType> attachment;

    /**
     * Gets the value of the documentSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSpecificationResponseType }
     *     
     */
    public DocumentSpecificationResponseType getDocumentSpecification() {
        return documentSpecification;
    }

    /**
     * Sets the value of the documentSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSpecificationResponseType }
     *     
     */
    public void setDocumentSpecification(DocumentSpecificationResponseType value) {
        this.documentSpecification = value;
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
     * {@link DocumentAvailabilityAttachmentType }
     * 
     * 
     */
    public List<DocumentAvailabilityAttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<DocumentAvailabilityAttachmentType>();
        }
        return this.attachment;
    }

}
