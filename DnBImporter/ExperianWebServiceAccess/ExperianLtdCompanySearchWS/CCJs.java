
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCJs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCJs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJsLast12Months" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJsLast12Months" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumberCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValueCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CCJDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CCJDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCJs", propOrder = {
    "ageMostRecentCCJ",
    "numberCCJs0To72",
    "valueCCJs0To72",
    "numberCCJsLast12Months",
    "valueCCJsLast12Months",
    "numberCCJs13To24",
    "valueCCJs13To24",
    "numberCCJs25To36",
    "valueCCJs25To36",
    "numberCCJs37To48",
    "valueCCJs37To48",
    "numberCCJs49To60",
    "valueCCJs49To60",
    "numberCCJs61To72",
    "valueCCJs61To72",
    "ccjDetail"
})
public class CCJs {

    @XmlElement(name = "AgeMostRecentCCJ")
    protected Integer ageMostRecentCCJ;
    @XmlElement(name = "NumberCCJs0To72")
    protected Integer numberCCJs0To72;
    @XmlElement(name = "ValueCCJs0To72")
    protected Long valueCCJs0To72;
    @XmlElement(name = "NumberCCJsLast12Months")
    protected Integer numberCCJsLast12Months;
    @XmlElement(name = "ValueCCJsLast12Months")
    protected Long valueCCJsLast12Months;
    @XmlElement(name = "NumberCCJs13To24")
    protected Integer numberCCJs13To24;
    @XmlElement(name = "ValueCCJs13To24")
    protected Long valueCCJs13To24;
    @XmlElement(name = "NumberCCJs25To36")
    protected Integer numberCCJs25To36;
    @XmlElement(name = "ValueCCJs25To36")
    protected Long valueCCJs25To36;
    @XmlElement(name = "NumberCCJs37To48")
    protected Integer numberCCJs37To48;
    @XmlElement(name = "ValueCCJs37To48")
    protected Long valueCCJs37To48;
    @XmlElement(name = "NumberCCJs49To60")
    protected Integer numberCCJs49To60;
    @XmlElement(name = "ValueCCJs49To60")
    protected Long valueCCJs49To60;
    @XmlElement(name = "NumberCCJs61To72")
    protected Integer numberCCJs61To72;
    @XmlElement(name = "ValueCCJs61To72")
    protected Long valueCCJs61To72;
    @XmlElement(name = "CCJDetail")
    protected List<CCJDetail> ccjDetail;

    /**
     * Gets the value of the ageMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAgeMostRecentCCJ() {
        return ageMostRecentCCJ;
    }

    /**
     * Sets the value of the ageMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAgeMostRecentCCJ(Integer value) {
        this.ageMostRecentCCJ = value;
    }

    /**
     * Gets the value of the numberCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs0To72() {
        return numberCCJs0To72;
    }

    /**
     * Sets the value of the numberCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs0To72(Integer value) {
        this.numberCCJs0To72 = value;
    }

    /**
     * Gets the value of the valueCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs0To72() {
        return valueCCJs0To72;
    }

    /**
     * Sets the value of the valueCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs0To72(Long value) {
        this.valueCCJs0To72 = value;
    }

    /**
     * Gets the value of the numberCCJsLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJsLast12Months() {
        return numberCCJsLast12Months;
    }

    /**
     * Sets the value of the numberCCJsLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJsLast12Months(Integer value) {
        this.numberCCJsLast12Months = value;
    }

    /**
     * Gets the value of the valueCCJsLast12Months property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJsLast12Months() {
        return valueCCJsLast12Months;
    }

    /**
     * Sets the value of the valueCCJsLast12Months property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJsLast12Months(Long value) {
        this.valueCCJsLast12Months = value;
    }

    /**
     * Gets the value of the numberCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs13To24() {
        return numberCCJs13To24;
    }

    /**
     * Sets the value of the numberCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs13To24(Integer value) {
        this.numberCCJs13To24 = value;
    }

    /**
     * Gets the value of the valueCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs13To24() {
        return valueCCJs13To24;
    }

    /**
     * Sets the value of the valueCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs13To24(Long value) {
        this.valueCCJs13To24 = value;
    }

    /**
     * Gets the value of the numberCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs25To36() {
        return numberCCJs25To36;
    }

    /**
     * Sets the value of the numberCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs25To36(Integer value) {
        this.numberCCJs25To36 = value;
    }

    /**
     * Gets the value of the valueCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs25To36() {
        return valueCCJs25To36;
    }

    /**
     * Sets the value of the valueCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs25To36(Long value) {
        this.valueCCJs25To36 = value;
    }

    /**
     * Gets the value of the numberCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs37To48() {
        return numberCCJs37To48;
    }

    /**
     * Sets the value of the numberCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs37To48(Integer value) {
        this.numberCCJs37To48 = value;
    }

    /**
     * Gets the value of the valueCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs37To48() {
        return valueCCJs37To48;
    }

    /**
     * Sets the value of the valueCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs37To48(Long value) {
        this.valueCCJs37To48 = value;
    }

    /**
     * Gets the value of the numberCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs49To60() {
        return numberCCJs49To60;
    }

    /**
     * Sets the value of the numberCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs49To60(Integer value) {
        this.numberCCJs49To60 = value;
    }

    /**
     * Gets the value of the valueCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs49To60() {
        return valueCCJs49To60;
    }

    /**
     * Sets the value of the valueCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs49To60(Long value) {
        this.valueCCJs49To60 = value;
    }

    /**
     * Gets the value of the numberCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberCCJs61To72() {
        return numberCCJs61To72;
    }

    /**
     * Sets the value of the numberCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberCCJs61To72(Integer value) {
        this.numberCCJs61To72 = value;
    }

    /**
     * Gets the value of the valueCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueCCJs61To72() {
        return valueCCJs61To72;
    }

    /**
     * Sets the value of the valueCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueCCJs61To72(Long value) {
        this.valueCCJs61To72 = value;
    }

    /**
     * Gets the value of the ccjDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccjDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCJDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CCJDetail }
     * 
     * 
     */
    public List<CCJDetail> getCCJDetail() {
        if (ccjDetail == null) {
            ccjDetail = new ArrayList<CCJDetail>();
        }
        return this.ccjDetail;
    }

}
