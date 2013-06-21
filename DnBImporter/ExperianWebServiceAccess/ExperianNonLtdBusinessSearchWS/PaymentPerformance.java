
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPerformance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPerformance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAbbrev" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}AbbreviatedPaymentPerformanceDetails" minOccurs="0"/>
 *         &lt;element name="PaymentFull" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}PaymentPerformanceFullDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPerformance", propOrder = {
    "paymentAbbrev",
    "paymentFull"
})
public class PaymentPerformance {

    @XmlElement(name = "PaymentAbbrev")
    protected AbbreviatedPaymentPerformanceDetails paymentAbbrev;
    @XmlElement(name = "PaymentFull")
    protected PaymentPerformanceFullDetails paymentFull;

    /**
     * Gets the value of the paymentAbbrev property.
     * 
     * @return
     *     possible object is
     *     {@link AbbreviatedPaymentPerformanceDetails }
     *     
     */
    public AbbreviatedPaymentPerformanceDetails getPaymentAbbrev() {
        return paymentAbbrev;
    }

    /**
     * Sets the value of the paymentAbbrev property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbbreviatedPaymentPerformanceDetails }
     *     
     */
    public void setPaymentAbbrev(AbbreviatedPaymentPerformanceDetails value) {
        this.paymentAbbrev = value;
    }

    /**
     * Gets the value of the paymentFull property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPerformanceFullDetails }
     *     
     */
    public PaymentPerformanceFullDetails getPaymentFull() {
        return paymentFull;
    }

    /**
     * Sets the value of the paymentFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPerformanceFullDetails }
     *     
     */
    public void setPaymentFull(PaymentPerformanceFullDetails value) {
        this.paymentFull = value;
    }

}
