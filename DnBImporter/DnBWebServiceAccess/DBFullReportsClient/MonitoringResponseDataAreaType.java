
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringResponseDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringResponseDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusInformation" type="{http://gateway.dnb.com/getProduct}StatusInformationType"/>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationBaseType"/>
 *         &lt;element name="MonitoringSpecification" type="{http://gateway.dnb.com/getProduct}MonitoringSpecificationResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringResponseDataAreaType", propOrder = {
    "statusInformation",
    "customerInformation",
    "subjectInformation",
    "monitoringSpecification"
})
public class MonitoringResponseDataAreaType {

    @XmlElement(name = "StatusInformation", required = true)
    protected StatusInformationType statusInformation;
    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationBaseType subjectInformation;
    @XmlElement(name = "MonitoringSpecification", required = true)
    protected MonitoringSpecificationResponseType monitoringSpecification;

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
     *     {@link SubjectInformationBaseType }
     *     
     */
    public SubjectInformationBaseType getSubjectInformation() {
        return subjectInformation;
    }

    /**
     * Sets the value of the subjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectInformationBaseType }
     *     
     */
    public void setSubjectInformation(SubjectInformationBaseType value) {
        this.subjectInformation = value;
    }

    /**
     * Gets the value of the monitoringSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringSpecificationResponseType }
     *     
     */
    public MonitoringSpecificationResponseType getMonitoringSpecification() {
        return monitoringSpecification;
    }

    /**
     * Sets the value of the monitoringSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringSpecificationResponseType }
     *     
     */
    public void setMonitoringSpecification(MonitoringSpecificationResponseType value) {
        this.monitoringSpecification = value;
    }

}
