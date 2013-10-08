
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveMonitoringListRequestDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMonitoringListRequestDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="MonitoringListSpecification" type="{http://gateway.dnb.com/getProduct}RetrieveMonitoringListSpecificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMonitoringListRequestDataAreaType", propOrder = {
    "customerInformation",
    "monitoringListSpecification"
})
public class RetrieveMonitoringListRequestDataAreaType {

    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "MonitoringListSpecification", required = true)
    protected RetrieveMonitoringListSpecificationType monitoringListSpecification;

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
     *     {@link RetrieveMonitoringListSpecificationType }
     *     
     */
    public RetrieveMonitoringListSpecificationType getMonitoringListSpecification() {
        return monitoringListSpecification;
    }

    /**
     * Sets the value of the monitoringListSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveMonitoringListSpecificationType }
     *     
     */
    public void setMonitoringListSpecification(RetrieveMonitoringListSpecificationType value) {
        this.monitoringListSpecification = value;
    }

}
