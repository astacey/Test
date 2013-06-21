
package ExperianLtdCompanySearchWS;

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
 *         &lt;element name="PaymentFull" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PaymentFull" minOccurs="0"/>
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
    "paymentFull"
})
public class PaymentPerformance {

    @XmlElement(name = "PaymentFull")
    protected PaymentFull paymentFull;

    /**
     * Gets the value of the paymentFull property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFull }
     *     
     */
    public PaymentFull getPaymentFull() {
        return paymentFull;
    }

    /**
     * Sets the value of the paymentFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFull }
     *     
     */
    public void setPaymentFull(PaymentFull value) {
        this.paymentFull = value;
    }

}
