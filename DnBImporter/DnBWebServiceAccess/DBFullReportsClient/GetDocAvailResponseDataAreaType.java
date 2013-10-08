
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocAvailResponseDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocAvailResponseDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusInformation" type="{http://gateway.dnb.com/getProduct}StatusInformationType"/>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationMinimalType"/>
 *         &lt;element name="DocumentAvailability" type="{http://gateway.dnb.com/getProduct}DocumentAvailabilityResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocAvailResponseDataAreaType", propOrder = {
    "statusInformation",
    "customerInformation",
    "subjectInformation",
    "documentAvailability"
})
public class GetDocAvailResponseDataAreaType {

    @XmlElement(name = "StatusInformation", required = true)
    protected StatusInformationType statusInformation;
    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationMinimalType subjectInformation;
    @XmlElement(name = "DocumentAvailability", required = true)
    protected DocumentAvailabilityResponseType documentAvailability;

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
     *     {@link SubjectInformationMinimalType }
     *     
     */
    public SubjectInformationMinimalType getSubjectInformation() {
        return subjectInformation;
    }

    /**
     * Sets the value of the subjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectInformationMinimalType }
     *     
     */
    public void setSubjectInformation(SubjectInformationMinimalType value) {
        this.subjectInformation = value;
    }

    /**
     * Gets the value of the documentAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAvailabilityResponseType }
     *     
     */
    public DocumentAvailabilityResponseType getDocumentAvailability() {
        return documentAvailability;
    }

    /**
     * Sets the value of the documentAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAvailabilityResponseType }
     *     
     */
    public void setDocumentAvailability(DocumentAvailabilityResponseType value) {
        this.documentAvailability = value;
    }

}
