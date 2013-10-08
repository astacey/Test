
package DBFullReportsClient;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationDetailsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationDetailsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://gateway.dnb.com/getProduct}UserIdType" minOccurs="0"/>
 *         &lt;element name="SubscriberNumber" type="{http://gateway.dnb.com/getProduct}SubscriberNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionCount" type="{http://gateway.dnb.com/getProduct}SubscriptionCountType" minOccurs="0"/>
 *         &lt;element name="RegistrationDetails" type="{http://gateway.dnb.com/getProduct}RegistrationDetailsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationDetailsListType", propOrder = {
    "userId",
    "subscriberNumber",
    "subscriptionCount",
    "registrationDetails"
})
public class RegistrationDetailsListType {

    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "SubscriberNumber")
    protected String subscriberNumber;
    @XmlElement(name = "SubscriptionCount")
    protected BigInteger subscriptionCount;
    @XmlElement(name = "RegistrationDetails", required = true)
    protected List<RegistrationDetailsType> registrationDetails;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

    /**
     * Gets the value of the subscriptionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubscriptionCount() {
        return subscriptionCount;
    }

    /**
     * Sets the value of the subscriptionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubscriptionCount(BigInteger value) {
        this.subscriptionCount = value;
    }

    /**
     * Gets the value of the registrationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationDetailsType }
     * 
     * 
     */
    public List<RegistrationDetailsType> getRegistrationDetails() {
        if (registrationDetails == null) {
            registrationDetails = new ArrayList<RegistrationDetailsType>();
        }
        return this.registrationDetails;
    }

}
