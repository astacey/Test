
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDocumentOrderDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDocumentOrderDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusInformation" type="{http://gateway.dnb.com/getProduct}StatusInformationType"/>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationDocOrderType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationMinimalType"/>
 *         &lt;element name="DocumentOrder" type="{http://gateway.dnb.com/getProduct}DocumentOrderResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDocumentOrderDataAreaType", propOrder = {
    "statusInformation",
    "customerInformation",
    "subjectInformation",
    "documentOrder"
})
public class GetDocumentOrderDataAreaType {

    @XmlElement(name = "StatusInformation", required = true)
    protected StatusInformationType statusInformation;
    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationDocOrderType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationMinimalType subjectInformation;
    @XmlElement(name = "DocumentOrder", required = true)
    protected DocumentOrderResponseType documentOrder;

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
     *     {@link CustomerInformationDocOrderType }
     *     
     */
    public CustomerInformationDocOrderType getCustomerInformation() {
        return customerInformation;
    }

    /**
     * Sets the value of the customerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInformationDocOrderType }
     *     
     */
    public void setCustomerInformation(CustomerInformationDocOrderType value) {
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
     * Gets the value of the documentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOrderResponseType }
     *     
     */
    public DocumentOrderResponseType getDocumentOrder() {
        return documentOrder;
    }

    /**
     * Sets the value of the documentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOrderResponseType }
     *     
     */
    public void setDocumentOrder(DocumentOrderResponseType value) {
        this.documentOrder = value;
    }

}
