
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvgDBT3Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgDBT6Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AvgDBT12Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT1K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT10K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT100K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberDBT100KPlus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberCashFirst" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCollection" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ValCollection" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UnpaidAccountsDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}UnpaidAccountsDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndAvgDBT3Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndAvgDBT6Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndAvgDBT12Mnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndNumberDBT1K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndNumberDBT10K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndNumberDBT100K" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndNumberDBT100KPlus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndPaymentPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuppPaymentPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentToTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FastestPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FastestMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="SlowestPayment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SlowestMonth" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="NumCommonTerms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CompanyNumMnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndustryNumMnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CompanyDBTMonthly" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CompDebitMonthly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndDBTMonthly" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}IndDebitMonthly" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CommonTerms" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CommonTerms" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustrySICDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFull", propOrder = {
    "avgDBT3Mnths",
    "avgDBT6Mnths",
    "avgDBT12Mnths",
    "numberDBT1K",
    "numberDBT10K",
    "numberDBT100K",
    "numberDBT100KPlus",
    "numberCashFirst",
    "numberCollection",
    "valCollection",
    "unpaidAccountsDetails",
    "indAvgDBT3Mnths",
    "indAvgDBT6Mnths",
    "indAvgDBT12Mnths",
    "indNumberDBT1K",
    "indNumberDBT10K",
    "indNumberDBT100K",
    "indNumberDBT100KPlus",
    "paymentPattern",
    "indPaymentPattern",
    "suppPaymentPattern",
    "paymentToTerms",
    "fastestPayment",
    "fastestMonth",
    "slowestPayment",
    "slowestMonth",
    "numCommonTerms",
    "companyNumMnths",
    "industryNumMnths",
    "companyDBTMonthly",
    "indDBTMonthly",
    "commonTerms",
    "industrySICDesc"
})
public class PaymentFull {

    @XmlElement(name = "AvgDBT3Mnths")
    protected Integer avgDBT3Mnths;
    @XmlElement(name = "AvgDBT6Mnths")
    protected Integer avgDBT6Mnths;
    @XmlElement(name = "AvgDBT12Mnths")
    protected Integer avgDBT12Mnths;
    @XmlElement(name = "NumberDBT1K")
    protected Integer numberDBT1K;
    @XmlElement(name = "NumberDBT10K")
    protected Integer numberDBT10K;
    @XmlElement(name = "NumberDBT100K")
    protected Integer numberDBT100K;
    @XmlElement(name = "NumberDBT100KPlus")
    protected Integer numberDBT100KPlus;
    @XmlElement(name = "NumberCashFirst")
    protected Long numberCashFirst;
    @XmlElement(name = "NumberCollection")
    protected Long numberCollection;
    @XmlElement(name = "ValCollection")
    protected Long valCollection;
    @XmlElement(name = "UnpaidAccountsDetails")
    protected List<UnpaidAccountsDetails> unpaidAccountsDetails;
    @XmlElement(name = "IndAvgDBT3Mnths")
    protected Integer indAvgDBT3Mnths;
    @XmlElement(name = "IndAvgDBT6Mnths")
    protected Integer indAvgDBT6Mnths;
    @XmlElement(name = "IndAvgDBT12Mnths")
    protected Integer indAvgDBT12Mnths;
    @XmlElement(name = "IndNumberDBT1K")
    protected Integer indNumberDBT1K;
    @XmlElement(name = "IndNumberDBT10K")
    protected Integer indNumberDBT10K;
    @XmlElement(name = "IndNumberDBT100K")
    protected Integer indNumberDBT100K;
    @XmlElement(name = "IndNumberDBT100KPlus")
    protected Integer indNumberDBT100KPlus;
    @XmlElement(name = "PaymentPattern")
    protected String paymentPattern;
    @XmlElement(name = "IndPaymentPattern")
    protected String indPaymentPattern;
    @XmlElement(name = "SuppPaymentPattern")
    protected String suppPaymentPattern;
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
    @XmlElement(name = "NumCommonTerms")
    protected Integer numCommonTerms;
    @XmlElement(name = "CompanyNumMnths")
    protected Integer companyNumMnths;
    @XmlElement(name = "IndustryNumMnths")
    protected Integer industryNumMnths;
    @XmlElement(name = "CompanyDBTMonthly")
    protected List<CompDebitMonthly> companyDBTMonthly;
    @XmlElement(name = "IndDBTMonthly")
    protected List<IndDebitMonthly> indDBTMonthly;
    @XmlElement(name = "CommonTerms")
    protected List<CommonTerms> commonTerms;
    @XmlElement(name = "IndustrySICDesc")
    protected String industrySICDesc;

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
     * Gets the value of the numberCashFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberCashFirst() {
        return numberCashFirst;
    }

    /**
     * Sets the value of the numberCashFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberCashFirst(Long value) {
        this.numberCashFirst = value;
    }

    /**
     * Gets the value of the numberCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberCollection() {
        return numberCollection;
    }

    /**
     * Sets the value of the numberCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberCollection(Long value) {
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
     * Gets the value of the unpaidAccountsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unpaidAccountsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnpaidAccountsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnpaidAccountsDetails }
     * 
     * 
     */
    public List<UnpaidAccountsDetails> getUnpaidAccountsDetails() {
        if (unpaidAccountsDetails == null) {
            unpaidAccountsDetails = new ArrayList<UnpaidAccountsDetails>();
        }
        return this.unpaidAccountsDetails;
    }

    /**
     * Gets the value of the indAvgDBT3Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndAvgDBT3Mnths() {
        return indAvgDBT3Mnths;
    }

    /**
     * Sets the value of the indAvgDBT3Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndAvgDBT3Mnths(Integer value) {
        this.indAvgDBT3Mnths = value;
    }

    /**
     * Gets the value of the indAvgDBT6Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndAvgDBT6Mnths() {
        return indAvgDBT6Mnths;
    }

    /**
     * Sets the value of the indAvgDBT6Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndAvgDBT6Mnths(Integer value) {
        this.indAvgDBT6Mnths = value;
    }

    /**
     * Gets the value of the indAvgDBT12Mnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndAvgDBT12Mnths() {
        return indAvgDBT12Mnths;
    }

    /**
     * Sets the value of the indAvgDBT12Mnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndAvgDBT12Mnths(Integer value) {
        this.indAvgDBT12Mnths = value;
    }

    /**
     * Gets the value of the indNumberDBT1K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndNumberDBT1K() {
        return indNumberDBT1K;
    }

    /**
     * Sets the value of the indNumberDBT1K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndNumberDBT1K(Integer value) {
        this.indNumberDBT1K = value;
    }

    /**
     * Gets the value of the indNumberDBT10K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndNumberDBT10K() {
        return indNumberDBT10K;
    }

    /**
     * Sets the value of the indNumberDBT10K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndNumberDBT10K(Integer value) {
        this.indNumberDBT10K = value;
    }

    /**
     * Gets the value of the indNumberDBT100K property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndNumberDBT100K() {
        return indNumberDBT100K;
    }

    /**
     * Sets the value of the indNumberDBT100K property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndNumberDBT100K(Integer value) {
        this.indNumberDBT100K = value;
    }

    /**
     * Gets the value of the indNumberDBT100KPlus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndNumberDBT100KPlus() {
        return indNumberDBT100KPlus;
    }

    /**
     * Sets the value of the indNumberDBT100KPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndNumberDBT100KPlus(Integer value) {
        this.indNumberDBT100KPlus = value;
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
     * Gets the value of the indPaymentPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPaymentPattern() {
        return indPaymentPattern;
    }

    /**
     * Sets the value of the indPaymentPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPaymentPattern(String value) {
        this.indPaymentPattern = value;
    }

    /**
     * Gets the value of the suppPaymentPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppPaymentPattern() {
        return suppPaymentPattern;
    }

    /**
     * Sets the value of the suppPaymentPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppPaymentPattern(String value) {
        this.suppPaymentPattern = value;
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
     * Gets the value of the companyNumMnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyNumMnths() {
        return companyNumMnths;
    }

    /**
     * Sets the value of the companyNumMnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyNumMnths(Integer value) {
        this.companyNumMnths = value;
    }

    /**
     * Gets the value of the industryNumMnths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndustryNumMnths() {
        return industryNumMnths;
    }

    /**
     * Sets the value of the industryNumMnths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndustryNumMnths(Integer value) {
        this.industryNumMnths = value;
    }

    /**
     * Gets the value of the companyDBTMonthly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyDBTMonthly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyDBTMonthly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompDebitMonthly }
     * 
     * 
     */
    public List<CompDebitMonthly> getCompanyDBTMonthly() {
        if (companyDBTMonthly == null) {
            companyDBTMonthly = new ArrayList<CompDebitMonthly>();
        }
        return this.companyDBTMonthly;
    }

    /**
     * Gets the value of the indDBTMonthly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indDBTMonthly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndDBTMonthly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndDebitMonthly }
     * 
     * 
     */
    public List<IndDebitMonthly> getIndDBTMonthly() {
        if (indDBTMonthly == null) {
            indDBTMonthly = new ArrayList<IndDebitMonthly>();
        }
        return this.indDBTMonthly;
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
     * {@link CommonTerms }
     * 
     * 
     */
    public List<CommonTerms> getCommonTerms() {
        if (commonTerms == null) {
            commonTerms = new ArrayList<CommonTerms>();
        }
        return this.commonTerms;
    }

    /**
     * Gets the value of the industrySICDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustrySICDesc() {
        return industrySICDesc;
    }

    /**
     * Sets the value of the industrySICDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustrySICDesc(String value) {
        this.industrySICDesc = value;
    }

}
