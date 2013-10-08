
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelMonitoringRequestDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelMonitoringRequestDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationBaseType"/>
 *         &lt;element name="MonitoringSpecification" type="{http://gateway.dnb.com/getProduct}CancelMonitoringSpecificationRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelMonitoringRequestDataAreaType", propOrder = {
    "customerInformation",
    "subjectInformation",
    "monitoringSpecification"
})
public class CancelMonitoringRequestDataAreaType {

    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationBaseType subjectInformation;
    @XmlElement(name = "MonitoringSpecification", required = true)
    protected CancelMonitoringSpecificationRequestType monitoringSpecification;

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
     *     {@link CancelMonitoringSpecificationRequestType }
     *     
     */
    public CancelMonitoringSpecificationRequestType getMonitoringSpecification() {
        return monitoringSpecification;
    }

    /**
     * Sets the value of the monitoringSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelMonitoringSpecificationRequestType }
     *     
     */
    public void setMonitoringSpecification(CancelMonitoringSpecificationRequestType value) {
        this.monitoringSpecification = value;
    }

}
