
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentAvailabilityAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentAvailabilityAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachmentIdentifier" type="{http://gateway.dnb.com/getProduct}AttachmentIdentifierType"/>
 *         &lt;element name="AttachmentContent" type="{http://gateway.dnb.com/getProduct}AttachmentContentType"/>
 *         &lt;element name="AttachmentEncoding" type="{http://gateway.dnb.com/getProduct}AttachmentEncodingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAvailabilityAttachmentType", propOrder = {
    "attachmentIdentifier",
    "attachmentContent",
    "attachmentEncoding"
})
public class DocumentAvailabilityAttachmentType {

    @XmlElement(name = "AttachmentIdentifier", required = true)
    protected String attachmentIdentifier;
    @XmlElement(name = "AttachmentContent", required = true)
    protected String attachmentContent;
    @XmlElement(name = "AttachmentEncoding", required = true)
    protected String attachmentEncoding;

    /**
     * Gets the value of the attachmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentIdentifier() {
        return attachmentIdentifier;
    }

    /**
     * Sets the value of the attachmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentIdentifier(String value) {
        this.attachmentIdentifier = value;
    }

    /**
     * Gets the value of the attachmentContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentContent() {
        return attachmentContent;
    }

    /**
     * Sets the value of the attachmentContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentContent(String value) {
        this.attachmentContent = value;
    }

    /**
     * Gets the value of the attachmentEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentEncoding() {
        return attachmentEncoding;
    }

    /**
     * Sets the value of the attachmentEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentEncoding(String value) {
        this.attachmentEncoding = value;
    }

}
