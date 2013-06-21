
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompDebitMonthly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompDebitMonthly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyExpMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="CompanyDBT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CompanyNumExp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompDebitMonthly", propOrder = {
    "companyExpMonth",
    "companyDBT",
    "companyNumExp"
})
public class CompDebitMonthly {

    @XmlElement(name = "CompanyExpMonth")
    protected CCYYMM companyExpMonth;
    @XmlElement(name = "CompanyDBT")
    protected Integer companyDBT;
    @XmlElement(name = "CompanyNumExp")
    protected Integer companyNumExp;

    /**
     * Gets the value of the companyExpMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getCompanyExpMonth() {
        return companyExpMonth;
    }

    /**
     * Sets the value of the companyExpMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setCompanyExpMonth(CCYYMM value) {
        this.companyExpMonth = value;
    }

    /**
     * Gets the value of the companyDBT property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyDBT() {
        return companyDBT;
    }

    /**
     * Sets the value of the companyDBT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyDBT(Integer value) {
        this.companyDBT = value;
    }

    /**
     * Gets the value of the companyNumExp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyNumExp() {
        return companyNumExp;
    }

    /**
     * Sets the value of the companyNumExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyNumExp(Integer value) {
        this.companyNumExp = value;
    }

}
