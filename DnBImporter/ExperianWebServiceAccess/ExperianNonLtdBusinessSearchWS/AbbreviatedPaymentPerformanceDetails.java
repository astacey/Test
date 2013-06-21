
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbbreviatedPaymentPerformanceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbbreviatedPaymentPerformanceDetails">
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
 *         &lt;element name="NumMnths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DBTMonthly" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}DebitMonthly" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbbreviatedPaymentPerformanceDetails", propOrder = {
    "allDataInRange",
    "numberCashFirst",
    "numberCollection",
    "valCollection",
    "numberCollectionLast2Years",
    "acctsUnpaid1Month",
    "acctsUnpaid2Months",
    "acctsUnpaid3Months",
    "numMnths",
    "dbtMonthly"
})
public class AbbreviatedPaymentPerformanceDetails {

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
    @XmlElement(name = "NumMnths")
    protected Integer numMnths;
    @XmlElement(name = "DBTMonthly")
    protected List<DebitMonthly> dbtMonthly;

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

}
