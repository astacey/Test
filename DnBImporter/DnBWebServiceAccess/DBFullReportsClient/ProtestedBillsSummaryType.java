
package DBFullReportsClient;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtestedBillsSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtestedBillsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillsLastOneYearQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BillsLastFiveYearsQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtestedBillsSummaryType", propOrder = {
    "billsLastOneYearQuantity",
    "billsLastFiveYearsQuantity"
})
public class ProtestedBillsSummaryType {

    @XmlElement(name = "BillsLastOneYearQuantity")
    protected BigInteger billsLastOneYearQuantity;
    @XmlElement(name = "BillsLastFiveYearsQuantity")
    protected BigInteger billsLastFiveYearsQuantity;

    /**
     * Gets the value of the billsLastOneYearQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillsLastOneYearQuantity() {
        return billsLastOneYearQuantity;
    }

    /**
     * Sets the value of the billsLastOneYearQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillsLastOneYearQuantity(BigInteger value) {
        this.billsLastOneYearQuantity = value;
    }

    /**
     * Gets the value of the billsLastFiveYearsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillsLastFiveYearsQuantity() {
        return billsLastFiveYearsQuantity;
    }

    /**
     * Sets the value of the billsLastFiveYearsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillsLastFiveYearsQuantity(BigInteger value) {
        this.billsLastFiveYearsQuantity = value;
    }

}
