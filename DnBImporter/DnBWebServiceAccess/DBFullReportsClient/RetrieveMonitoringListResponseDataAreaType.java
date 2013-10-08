
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMonitoringListResponseDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMonitoringListResponseDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusInformation" type="{http://gateway.dnb.com/getProduct}StatusInformationType"/>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="MonitoringListSpecification" type="{http://gateway.dnb.com/getProduct}MonitoringListSpecificationResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMonitoringListResponseDataAreaType", propOrder = {
    "statusInformation",
    "customerInformation",
    "monitoringListSpecification"
})
public class RetrieveMonitoringListResponseDataAreaType {

    @XmlElement(name = "StatusInformation", required = true)
    protected StatusInformationType statusInformation;
    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "MonitoringListSpecification", required = true)
    protected MonitoringListSpecificationResponseType monitoringListSpecification;

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
     * Gets the value of the monitoringListSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringListSpecificationResponseType }
     *     
     */
    public MonitoringListSpecificationResponseType getMonitoringListSpecification() {
        return monitoringListSpecification;
    }

    /**
     * Sets the value of the monitoringListSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringListSpecificationResponseType }
     *     
     */
    public void setMonitoringListSpecification(MonitoringListSpecificationResponseType value) {
        this.monitoringListSpecification = value;
    }

}
