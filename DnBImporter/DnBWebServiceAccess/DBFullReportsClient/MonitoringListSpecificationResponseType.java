
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonitoringListSpecificationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonitoringListSpecificationResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalSubscriptionCount" type="{http://gateway.dnb.com/getProduct}TotalSubscriptionCountType"/>
 *         &lt;element name="RegistrationDetailsList" type="{http://gateway.dnb.com/getProduct}RegistrationDetailsListType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringListSpecificationResponseType", propOrder = {
    "totalSubscriptionCount",
    "registrationDetailsList"
})
public class MonitoringListSpecificationResponseType {

    @XmlElement(name = "TotalSubscriptionCount", required = true)
    protected BigInteger totalSubscriptionCount;
    @XmlElement(name = "RegistrationDetailsList", required = true)
    protected List<RegistrationDetailsListType> registrationDetailsList;

    /**
     * Gets the value of the totalSubscriptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSubscriptionCount() {
        return totalSubscriptionCount;
    }

    /**
     * Sets the value of the totalSubscriptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSubscriptionCount(BigInteger value) {
        this.totalSubscriptionCount = value;
    }

    /**
     * Gets the value of the registrationDetailsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationDetailsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationDetailsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationDetailsListType }
     * 
     * 
     */
    public List<RegistrationDetailsListType> getRegistrationDetailsList() {
        if (registrationDetailsList == null) {
            registrationDetailsList = new ArrayList<RegistrationDetailsListType>();
        }
        return this.registrationDetailsList;
    }

}
