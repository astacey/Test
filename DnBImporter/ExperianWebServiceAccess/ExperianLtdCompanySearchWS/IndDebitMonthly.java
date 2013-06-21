
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndDebitMonthly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndDebitMonthly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndExpMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="IndustryDBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndDebitMonthly", propOrder = {
    "indExpMonth",
    "industryDBT"
})
public class IndDebitMonthly {

    @XmlElement(name = "IndExpMonth")
    protected CCYYMM indExpMonth;
    @XmlElement(name = "IndustryDBT")
    protected Integer industryDBT;

    /**
     * Gets the value of the indExpMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getIndExpMonth() {
        return indExpMonth;
    }

    /**
     * Sets the value of the indExpMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setIndExpMonth(CCYYMM value) {
        this.indExpMonth = value;
    }

    /**
     * Gets the value of the industryDBT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndustryDBT() {
        return industryDBT;
    }

    /**
     * Sets the value of the industryDBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndustryDBT(Integer value) {
        this.industryDBT = value;
    }

}
