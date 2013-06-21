
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPerformanceFullDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPerformanceFullDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllDataInRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberCashFirst" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberCollection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValCollection" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCollectionLast2Years" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AcctsUnpaid1Month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AcctsUnpaid2Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AcctsUnpaid3Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT1k" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT10k" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT100k" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT100kPlus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgDBT3Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgDBT6Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgDBT12Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgCurrDebt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AvgDebt3Months" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AvgDebt12Months" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PaymentPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentToTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FastestPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FastestMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="SlowestPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowestMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="NumMnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumCommonTerms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DBTMonthly" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}DebitMonthly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommonTerms" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CommonTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPerformanceFullDetails", propOrder = {
    "allDataInRange",
    "numberCashFirst",
    "numberCollection",
    "valCollection",
    "numberCollectionLast2Years",
    "acctsUnpaid1Month",
    "acctsUnpaid2Months",
    "acctsUnpaid3Months",
    "numberDBT1K",
    "numberDBT10K",
    "numberDBT100K",
    "numberDBT100KPlus",
    "avgDBT3Mnths",
    "avgDBT6Mnths",
    "avgDBT12Mnths",
    "avgCurrDebt",
    "avgDebt3Months",
    "avgDebt12Months",
    "paymentPattern",
    "paymentToTerms",
    "fastestPayment",
    "fastestMonth",
    "slowestPayment",
    "slowestMonth",
    "numMnths",
    "numCommonTerms",
    "dbtMonthly",
    "commonTerms"
})
public class PaymentPerformanceFullDetails {

    @XmlElement(name = "AllDataInRange")
    protected String allDataInRange;
    @XmlElement(name = "NumberCashFirst")
    protected Integer numberCashFirst;
    @XmlElement(name = "NumberCollection")
    protected Integer numberCollection;
    @XmlElement(name = "ValCollection")
    protected Long valCollection;
    @XmlElement(name = "NumberCollectionLast2Years")
    protected Integer numberCollectionLast2Years;
    @XmlElement(name = "AcctsUnpaid1Month")
    protected Integer acctsUnpaid1Month;
    @XmlElement(name = "AcctsUnpaid2Months")
    protected Integer acctsUnpaid2Months;
    @XmlElement(name = "AcctsUnpaid3Months")
    protected Integer acctsUnpaid3Months;
    @XmlElement(name = "NumberDBT1k")
    protected Integer numberDBT1K;
    @XmlElement(name = "NumberDBT10k")
    protected Integer numberDBT10K;
    @XmlElement(name = "NumberDBT100k")
    protected Integer numberDBT100K;
    @XmlElement(name = "NumberDBT100kPlus")
    protected Integer numberDBT100KPlus;
    @XmlElement(name = "AvgDBT3Mnths")
    protected Integer avgDBT3Mnths;
    @XmlElement(name = "AvgDBT6Mnths")
    protected Integer avgDBT6Mnths;
    @XmlElement(name = "AvgDBT12Mnths")
    protected Integer avgDBT12Mnths;
    @XmlElement(name = "AvgCurrDebt")
    protected Long avgCurrDebt;
    @XmlElement(name = "AvgDebt3Months")
    protected Long avgDebt3Months;
    @XmlElement(name = "AvgDebt12Months")
    protected Long avgDebt12Months;
    @XmlElement(name = "PaymentPattern")
    protected String paymentPattern;
    @XmlElement(name = "PaymentToTerms")
    protected String paymentToTerms;
    @XmlElement(name = "FastestPayment")
    protected Integer fastestPayment;
    @XmlElement(name = "FastestMonth")
    protected CCYYMM fastestMonth;
    @XmlElement(name = "SlowestPayment")
    protected Integer slowestPayment;
    @XmlElement(name = "SlowestMonth")
    protected CCYYMM slowestMonth;
    @XmlElement(name = "NumMnths")
    protected Integer numMnths;
    @XmlElement(name = "NumCommonTerms")
    protected Integer numCommonTerms;
    @XmlElement(name = "DBTMonthly")
    protected List<DebitMonthly> dbtMonthly;
    @XmlElement(name = "CommonTerms")
    protected List<CommonTerm> commonTerms;

    /**
     * Gets the value of the allDataInRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllDataInRange() {
        return allDataInRange;
    }

    /**
     * Sets the value of the allDataInRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllDataInRange(String value) {
        this.allDataInRange = value;
    }

    /**
     * Gets the value of the numberCashFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCashFirst() {
        return numberCashFirst;
    }

    /**
     * Sets the value of the numberCashFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCashFirst(Integer value) {
        this.numberCashFirst = value;
    }

    /**
     * Gets the value of the numberCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCollection() {
        return numberCollection;
    }

    /**
     * Sets the value of the numberCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCollection(Integer value) {
        this.numberCollection = value;
    }

    /**
     * Gets the value of the valCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValCollection() {
        return valCollection;
    }

    /**
     * Sets the value of the valCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValCollection(Long value) {
        this.valCollection = value;
    }

    /**
     * Gets the value of the numberCollectionLast2Years property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCollectionLast2Years() {
        return numberCollectionLast2Years;
    }

    /**
     * Sets the value of the numberCollectionLast2Years property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCollectionLast2Years(Integer value) {
        this.numberCollectionLast2Years = value;
    }

    /**
     * Gets the value of the acctsUnpaid1Month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcctsUnpaid1Month() {
        return acctsUnpaid1Month;
    }

    /**
     * Sets the value of the acctsUnpaid1Month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcctsUnpaid1Month(Integer value) {
        this.acctsUnpaid1Month = value;
    }

    /**
     * Gets the value of the acctsUnpaid2Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcctsUnpaid2Months() {
        return acctsUnpaid2Months;
    }

    /**
     * Sets the value of the acctsUnpaid2Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcctsUnpaid2Months(Integer value) {
        this.acctsUnpaid2Months = value;
    }

    /**
     * Gets the value of the acctsUnpaid3Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcctsUnpaid3Months() {
        return acctsUnpaid3Months;
    }

    /**
     * Sets the value of the acctsUnpaid3Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcctsUnpaid3Months(Integer value) {
        this.acctsUnpaid3Months = value;
    }

    /**
     * Gets the value of the numberDBT1K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDBT1K() {
        return numberDBT1K;
    }

    /**
     * Sets the value of the numberDBT1K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDBT1K(Integer value) {
        this.numberDBT1K = value;
    }

    /**
     * Gets the value of the numberDBT10K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDBT10K() {
        return numberDBT10K;
    }

    /**
     * Sets the value of the numberDBT10K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDBT10K(Integer value) {
        this.numberDBT10K = value;
    }

    /**
     * Gets the value of the numberDBT100K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDBT100K() {
        return numberDBT100K;
    }

    /**
     * Sets the value of the numberDBT100K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDBT100K(Integer value) {
        this.numberDBT100K = value;
    }

    /**
     * Gets the value of the numberDBT100KPlus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDBT100KPlus() {
        return numberDBT100KPlus;
    }

    /**
     * Sets the value of the numberDBT100KPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDBT100KPlus(Integer value) {
        this.numberDBT100KPlus = value;
    }

    /**
     * Gets the value of the avgDBT3Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgDBT3Mnths() {
        return avgDBT3Mnths;
    }

    /**
     * Sets the value of the avgDBT3Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgDBT3Mnths(Integer value) {
        this.avgDBT3Mnths = value;
    }

    /**
     * Gets the value of the avgDBT6Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgDBT6Mnths() {
        return avgDBT6Mnths;
    }

    /**
     * Sets the value of the avgDBT6Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgDBT6Mnths(Integer value) {
        this.avgDBT6Mnths = value;
    }

    /**
     * Gets the value of the avgDBT12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgDBT12Mnths() {
        return avgDBT12Mnths;
    }

    /**
     * Sets the value of the avgDBT12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgDBT12Mnths(Integer value) {
        this.avgDBT12Mnths = value;
    }

    /**
     * Gets the value of the avgCurrDebt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgCurrDebt() {
        return avgCurrDebt;
    }

    /**
     * Sets the value of the avgCurrDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgCurrDebt(Long value) {
        this.avgCurrDebt = value;
    }

    /**
     * Gets the value of the avgDebt3Months property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgDebt3Months() {
        return avgDebt3Months;
    }

    /**
     * Sets the value of the avgDebt3Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgDebt3Months(Long value) {
        this.avgDebt3Months = value;
    }

    /**
     * Gets the value of the avgDebt12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgDebt12Months() {
        return avgDebt12Months;
    }

    /**
     * Sets the value of the avgDebt12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgDebt12Months(Long value) {
        this.avgDebt12Months = value;
    }

    /**
     * Gets the value of the paymentPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPattern() {
        return paymentPattern;
    }

    /**
     * Sets the value of the paymentPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPattern(String value) {
        this.paymentPattern = value;
    }

    /**
     * Gets the value of the paymentToTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentToTerms() {
        return paymentToTerms;
    }

    /**
     * Sets the value of the paymentToTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentToTerms(String value) {
        this.paymentToTerms = value;
    }

    /**
     * Gets the value of the fastestPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFastestPayment() {
        return fastestPayment;
    }

    /**
     * Sets the value of the fastestPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFastestPayment(Integer value) {
        this.fastestPayment = value;
    }

    /**
     * Gets the value of the fastestMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getFastestMonth() {
        return fastestMonth;
    }

    /**
     * Sets the value of the fastestMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setFastestMonth(CCYYMM value) {
        this.fastestMonth = value;
    }

    /**
     * Gets the value of the slowestPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSlowestPayment() {
        return slowestPayment;
    }

    /**
     * Sets the value of the slowestPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSlowestPayment(Integer value) {
        this.slowestPayment = value;
    }

    /**
     * Gets the value of the slowestMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getSlowestMonth() {
        return slowestMonth;
    }

    /**
     * Sets the value of the slowestMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setSlowestMonth(CCYYMM value) {
        this.slowestMonth = value;
    }

    /**
     * Gets the value of the numMnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumMnths() {
        return numMnths;
    }

    /**
     * Sets the value of the numMnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumMnths(Integer value) {
        this.numMnths = value;
    }

    /**
     * Gets the value of the numCommonTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCommonTerms() {
        return numCommonTerms;
    }

    /**
     * Sets the value of the numCommonTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCommonTerms(Integer value) {
        this.numCommonTerms = value;
    }

    /**
     * Gets the value of the dbtMonthly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbtMonthly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBTMonthly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebitMonthly }
     * 
     * 
     */
    public List<DebitMonthly> getDBTMonthly() {
        if (dbtMonthly == null) {
            dbtMonthly = new ArrayList<DebitMonthly>();
        }
        return this.dbtMonthly;
    }

    /**
     * Gets the value of the commonTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonTerm }
     * 
     * 
     */
    public List<CommonTerm> getCommonTerms() {
        if (commonTerms == null) {
            commonTerms = new ArrayList<CommonTerm>();
        }
        return this.commonTerms;
    }

}
