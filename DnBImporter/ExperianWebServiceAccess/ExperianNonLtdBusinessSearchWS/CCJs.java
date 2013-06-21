
package ExperianNonLtdBusinessSearchWS;

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
 *         &lt;element name="MDataOutOwnshpRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MAgeMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJsLast6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJsLast6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJsLast12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJsLast12" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJsLast24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueLast24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNumberCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MValueCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MNOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADataOutOwnshpRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs0To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AAgeMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueMostRecentCCJ" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJsLast6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJsLast6" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJsLast12" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJsLast12" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJsLast24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueLast24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs13To24" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs25To36" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs37To48" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs49To60" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANumberCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AValueCCJs61To72" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ANOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCJDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CCJDetails" maxOccurs="unbounded" minOccurs="0"/>
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
    "mDataOutOwnshpRange",
    "mNumberCCJs0To72",
    "mValueCCJs0To72",
    "mAgeMostRecentCCJ",
    "mValueMostRecentCCJ",
    "mNumberCCJsLast6",
    "mValueCCJsLast6",
    "mNumberCCJsLast12",
    "mValueCCJsLast12",
    "mNumberCCJsLast24",
    "mValueLast24",
    "mNumberCCJs13To24",
    "mValueCCJs13To24",
    "mNumberCCJs25To36",
    "mValueCCJs25To36",
    "mNumberCCJs37To48",
    "mValueCCJs37To48",
    "mNumberCCJs49To60",
    "mValueCCJs49To60",
    "mNumberCCJs61To72",
    "mValueCCJs61To72",
    "mnocFlag",
    "aDataOutOwnshpRange",
    "aNumberCCJs0To72",
    "aValueCCJs0To72",
    "aAgeMostRecentCCJ",
    "aValueMostRecentCCJ",
    "aNumberCCJsLast6",
    "aValueCCJsLast6",
    "aNumberCCJsLast12",
    "aValueCCJsLast12",
    "aNumberCCJsLast24",
    "aValueLast24",
    "aNumberCCJs13To24",
    "aValueCCJs13To24",
    "aNumberCCJs25To36",
    "aValueCCJs25To36",
    "aNumberCCJs37To48",
    "aValueCCJs37To48",
    "aNumberCCJs49To60",
    "aValueCCJs49To60",
    "aNumberCCJs61To72",
    "aValueCCJs61To72",
    "anocFlag",
    "ccjDetail"
})
public class CCJs {

    @XmlElement(name = "MDataOutOwnshpRange")
    protected String mDataOutOwnshpRange;
    @XmlElement(name = "MNumberCCJs0To72")
    protected Integer mNumberCCJs0To72;
    @XmlElement(name = "MValueCCJs0To72")
    protected Long mValueCCJs0To72;
    @XmlElement(name = "MAgeMostRecentCCJ")
    protected Integer mAgeMostRecentCCJ;
    @XmlElement(name = "MValueMostRecentCCJ")
    protected Long mValueMostRecentCCJ;
    @XmlElement(name = "MNumberCCJsLast6")
    protected Integer mNumberCCJsLast6;
    @XmlElement(name = "MValueCCJsLast6")
    protected Long mValueCCJsLast6;
    @XmlElement(name = "MNumberCCJsLast12")
    protected Integer mNumberCCJsLast12;
    @XmlElement(name = "MValueCCJsLast12")
    protected Long mValueCCJsLast12;
    @XmlElement(name = "MNumberCCJsLast24")
    protected Integer mNumberCCJsLast24;
    @XmlElement(name = "MValueLast24")
    protected Long mValueLast24;
    @XmlElement(name = "MNumberCCJs13To24")
    protected Integer mNumberCCJs13To24;
    @XmlElement(name = "MValueCCJs13To24")
    protected Long mValueCCJs13To24;
    @XmlElement(name = "MNumberCCJs25To36")
    protected Integer mNumberCCJs25To36;
    @XmlElement(name = "MValueCCJs25To36")
    protected Long mValueCCJs25To36;
    @XmlElement(name = "MNumberCCJs37To48")
    protected Integer mNumberCCJs37To48;
    @XmlElement(name = "MValueCCJs37To48")
    protected Long mValueCCJs37To48;
    @XmlElement(name = "MNumberCCJs49To60")
    protected Integer mNumberCCJs49To60;
    @XmlElement(name = "MValueCCJs49To60")
    protected Long mValueCCJs49To60;
    @XmlElement(name = "MNumberCCJs61To72")
    protected Integer mNumberCCJs61To72;
    @XmlElement(name = "MValueCCJs61To72")
    protected Long mValueCCJs61To72;
    @XmlElement(name = "MNOCFlag")
    protected String mnocFlag;
    @XmlElement(name = "ADataOutOwnshpRange")
    protected String aDataOutOwnshpRange;
    @XmlElement(name = "ANumberCCJs0To72")
    protected Integer aNumberCCJs0To72;
    @XmlElement(name = "AValueCCJs0To72")
    protected Long aValueCCJs0To72;
    @XmlElement(name = "AAgeMostRecentCCJ")
    protected Integer aAgeMostRecentCCJ;
    @XmlElement(name = "AValueMostRecentCCJ")
    protected Long aValueMostRecentCCJ;
    @XmlElement(name = "ANumberCCJsLast6")
    protected Integer aNumberCCJsLast6;
    @XmlElement(name = "AValueCCJsLast6")
    protected Long aValueCCJsLast6;
    @XmlElement(name = "ANumberCCJsLast12")
    protected Integer aNumberCCJsLast12;
    @XmlElement(name = "AValueCCJsLast12")
    protected Long aValueCCJsLast12;
    @XmlElement(name = "ANumberCCJsLast24")
    protected Integer aNumberCCJsLast24;
    @XmlElement(name = "AValueLast24")
    protected Long aValueLast24;
    @XmlElement(name = "ANumberCCJs13To24")
    protected Integer aNumberCCJs13To24;
    @XmlElement(name = "AValueCCJs13To24")
    protected Long aValueCCJs13To24;
    @XmlElement(name = "ANumberCCJs25To36")
    protected Integer aNumberCCJs25To36;
    @XmlElement(name = "AValueCCJs25To36")
    protected Long aValueCCJs25To36;
    @XmlElement(name = "ANumberCCJs37To48")
    protected Integer aNumberCCJs37To48;
    @XmlElement(name = "AValueCCJs37To48")
    protected Long aValueCCJs37To48;
    @XmlElement(name = "ANumberCCJs49To60")
    protected Integer aNumberCCJs49To60;
    @XmlElement(name = "AValueCCJs49To60")
    protected Long aValueCCJs49To60;
    @XmlElement(name = "ANumberCCJs61To72")
    protected Integer aNumberCCJs61To72;
    @XmlElement(name = "AValueCCJs61To72")
    protected Long aValueCCJs61To72;
    @XmlElement(name = "ANOCFlag")
    protected String anocFlag;
    @XmlElement(name = "CCJDetail")
    protected List<CCJDetails> ccjDetail;

    /**
     * Gets the value of the mDataOutOwnshpRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDataOutOwnshpRange() {
        return mDataOutOwnshpRange;
    }

    /**
     * Sets the value of the mDataOutOwnshpRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDataOutOwnshpRange(String value) {
        this.mDataOutOwnshpRange = value;
    }

    /**
     * Gets the value of the mNumberCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs0To72() {
        return mNumberCCJs0To72;
    }

    /**
     * Sets the value of the mNumberCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs0To72(Integer value) {
        this.mNumberCCJs0To72 = value;
    }

    /**
     * Gets the value of the mValueCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs0To72() {
        return mValueCCJs0To72;
    }

    /**
     * Sets the value of the mValueCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs0To72(Long value) {
        this.mValueCCJs0To72 = value;
    }

    /**
     * Gets the value of the mAgeMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAgeMostRecentCCJ() {
        return mAgeMostRecentCCJ;
    }

    /**
     * Sets the value of the mAgeMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAgeMostRecentCCJ(Integer value) {
        this.mAgeMostRecentCCJ = value;
    }

    /**
     * Gets the value of the mValueMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueMostRecentCCJ() {
        return mValueMostRecentCCJ;
    }

    /**
     * Sets the value of the mValueMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueMostRecentCCJ(Long value) {
        this.mValueMostRecentCCJ = value;
    }

    /**
     * Gets the value of the mNumberCCJsLast6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJsLast6() {
        return mNumberCCJsLast6;
    }

    /**
     * Sets the value of the mNumberCCJsLast6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJsLast6(Integer value) {
        this.mNumberCCJsLast6 = value;
    }

    /**
     * Gets the value of the mValueCCJsLast6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJsLast6() {
        return mValueCCJsLast6;
    }

    /**
     * Sets the value of the mValueCCJsLast6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJsLast6(Long value) {
        this.mValueCCJsLast6 = value;
    }

    /**
     * Gets the value of the mNumberCCJsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJsLast12() {
        return mNumberCCJsLast12;
    }

    /**
     * Sets the value of the mNumberCCJsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJsLast12(Integer value) {
        this.mNumberCCJsLast12 = value;
    }

    /**
     * Gets the value of the mValueCCJsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJsLast12() {
        return mValueCCJsLast12;
    }

    /**
     * Sets the value of the mValueCCJsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJsLast12(Long value) {
        this.mValueCCJsLast12 = value;
    }

    /**
     * Gets the value of the mNumberCCJsLast24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJsLast24() {
        return mNumberCCJsLast24;
    }

    /**
     * Sets the value of the mNumberCCJsLast24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJsLast24(Integer value) {
        this.mNumberCCJsLast24 = value;
    }

    /**
     * Gets the value of the mValueLast24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueLast24() {
        return mValueLast24;
    }

    /**
     * Sets the value of the mValueLast24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueLast24(Long value) {
        this.mValueLast24 = value;
    }

    /**
     * Gets the value of the mNumberCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs13To24() {
        return mNumberCCJs13To24;
    }

    /**
     * Sets the value of the mNumberCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs13To24(Integer value) {
        this.mNumberCCJs13To24 = value;
    }

    /**
     * Gets the value of the mValueCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs13To24() {
        return mValueCCJs13To24;
    }

    /**
     * Sets the value of the mValueCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs13To24(Long value) {
        this.mValueCCJs13To24 = value;
    }

    /**
     * Gets the value of the mNumberCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs25To36() {
        return mNumberCCJs25To36;
    }

    /**
     * Sets the value of the mNumberCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs25To36(Integer value) {
        this.mNumberCCJs25To36 = value;
    }

    /**
     * Gets the value of the mValueCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs25To36() {
        return mValueCCJs25To36;
    }

    /**
     * Sets the value of the mValueCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs25To36(Long value) {
        this.mValueCCJs25To36 = value;
    }

    /**
     * Gets the value of the mNumberCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs37To48() {
        return mNumberCCJs37To48;
    }

    /**
     * Sets the value of the mNumberCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs37To48(Integer value) {
        this.mNumberCCJs37To48 = value;
    }

    /**
     * Gets the value of the mValueCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs37To48() {
        return mValueCCJs37To48;
    }

    /**
     * Sets the value of the mValueCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs37To48(Long value) {
        this.mValueCCJs37To48 = value;
    }

    /**
     * Gets the value of the mNumberCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs49To60() {
        return mNumberCCJs49To60;
    }

    /**
     * Sets the value of the mNumberCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs49To60(Integer value) {
        this.mNumberCCJs49To60 = value;
    }

    /**
     * Gets the value of the mValueCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs49To60() {
        return mValueCCJs49To60;
    }

    /**
     * Sets the value of the mValueCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs49To60(Long value) {
        this.mValueCCJs49To60 = value;
    }

    /**
     * Gets the value of the mNumberCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNumberCCJs61To72() {
        return mNumberCCJs61To72;
    }

    /**
     * Sets the value of the mNumberCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNumberCCJs61To72(Integer value) {
        this.mNumberCCJs61To72 = value;
    }

    /**
     * Gets the value of the mValueCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMValueCCJs61To72() {
        return mValueCCJs61To72;
    }

    /**
     * Sets the value of the mValueCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMValueCCJs61To72(Long value) {
        this.mValueCCJs61To72 = value;
    }

    /**
     * Gets the value of the mnocFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNOCFlag() {
        return mnocFlag;
    }

    /**
     * Sets the value of the mnocFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNOCFlag(String value) {
        this.mnocFlag = value;
    }

    /**
     * Gets the value of the aDataOutOwnshpRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADataOutOwnshpRange() {
        return aDataOutOwnshpRange;
    }

    /**
     * Sets the value of the aDataOutOwnshpRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADataOutOwnshpRange(String value) {
        this.aDataOutOwnshpRange = value;
    }

    /**
     * Gets the value of the aNumberCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs0To72() {
        return aNumberCCJs0To72;
    }

    /**
     * Sets the value of the aNumberCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs0To72(Integer value) {
        this.aNumberCCJs0To72 = value;
    }

    /**
     * Gets the value of the aValueCCJs0To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs0To72() {
        return aValueCCJs0To72;
    }

    /**
     * Sets the value of the aValueCCJs0To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs0To72(Long value) {
        this.aValueCCJs0To72 = value;
    }

    /**
     * Gets the value of the aAgeMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAAgeMostRecentCCJ() {
        return aAgeMostRecentCCJ;
    }

    /**
     * Sets the value of the aAgeMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAAgeMostRecentCCJ(Integer value) {
        this.aAgeMostRecentCCJ = value;
    }

    /**
     * Gets the value of the aValueMostRecentCCJ property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueMostRecentCCJ() {
        return aValueMostRecentCCJ;
    }

    /**
     * Sets the value of the aValueMostRecentCCJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueMostRecentCCJ(Long value) {
        this.aValueMostRecentCCJ = value;
    }

    /**
     * Gets the value of the aNumberCCJsLast6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJsLast6() {
        return aNumberCCJsLast6;
    }

    /**
     * Sets the value of the aNumberCCJsLast6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJsLast6(Integer value) {
        this.aNumberCCJsLast6 = value;
    }

    /**
     * Gets the value of the aValueCCJsLast6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJsLast6() {
        return aValueCCJsLast6;
    }

    /**
     * Sets the value of the aValueCCJsLast6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJsLast6(Long value) {
        this.aValueCCJsLast6 = value;
    }

    /**
     * Gets the value of the aNumberCCJsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJsLast12() {
        return aNumberCCJsLast12;
    }

    /**
     * Sets the value of the aNumberCCJsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJsLast12(Integer value) {
        this.aNumberCCJsLast12 = value;
    }

    /**
     * Gets the value of the aValueCCJsLast12 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJsLast12() {
        return aValueCCJsLast12;
    }

    /**
     * Sets the value of the aValueCCJsLast12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJsLast12(Long value) {
        this.aValueCCJsLast12 = value;
    }

    /**
     * Gets the value of the aNumberCCJsLast24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJsLast24() {
        return aNumberCCJsLast24;
    }

    /**
     * Sets the value of the aNumberCCJsLast24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJsLast24(Integer value) {
        this.aNumberCCJsLast24 = value;
    }

    /**
     * Gets the value of the aValueLast24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueLast24() {
        return aValueLast24;
    }

    /**
     * Sets the value of the aValueLast24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueLast24(Long value) {
        this.aValueLast24 = value;
    }

    /**
     * Gets the value of the aNumberCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs13To24() {
        return aNumberCCJs13To24;
    }

    /**
     * Sets the value of the aNumberCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs13To24(Integer value) {
        this.aNumberCCJs13To24 = value;
    }

    /**
     * Gets the value of the aValueCCJs13To24 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs13To24() {
        return aValueCCJs13To24;
    }

    /**
     * Sets the value of the aValueCCJs13To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs13To24(Long value) {
        this.aValueCCJs13To24 = value;
    }

    /**
     * Gets the value of the aNumberCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs25To36() {
        return aNumberCCJs25To36;
    }

    /**
     * Sets the value of the aNumberCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs25To36(Integer value) {
        this.aNumberCCJs25To36 = value;
    }

    /**
     * Gets the value of the aValueCCJs25To36 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs25To36() {
        return aValueCCJs25To36;
    }

    /**
     * Sets the value of the aValueCCJs25To36 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs25To36(Long value) {
        this.aValueCCJs25To36 = value;
    }

    /**
     * Gets the value of the aNumberCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs37To48() {
        return aNumberCCJs37To48;
    }

    /**
     * Sets the value of the aNumberCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs37To48(Integer value) {
        this.aNumberCCJs37To48 = value;
    }

    /**
     * Gets the value of the aValueCCJs37To48 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs37To48() {
        return aValueCCJs37To48;
    }

    /**
     * Sets the value of the aValueCCJs37To48 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs37To48(Long value) {
        this.aValueCCJs37To48 = value;
    }

    /**
     * Gets the value of the aNumberCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs49To60() {
        return aNumberCCJs49To60;
    }

    /**
     * Sets the value of the aNumberCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs49To60(Integer value) {
        this.aNumberCCJs49To60 = value;
    }

    /**
     * Gets the value of the aValueCCJs49To60 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs49To60() {
        return aValueCCJs49To60;
    }

    /**
     * Sets the value of the aValueCCJs49To60 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs49To60(Long value) {
        this.aValueCCJs49To60 = value;
    }

    /**
     * Gets the value of the aNumberCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getANumberCCJs61To72() {
        return aNumberCCJs61To72;
    }

    /**
     * Sets the value of the aNumberCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setANumberCCJs61To72(Integer value) {
        this.aNumberCCJs61To72 = value;
    }

    /**
     * Gets the value of the aValueCCJs61To72 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAValueCCJs61To72() {
        return aValueCCJs61To72;
    }

    /**
     * Sets the value of the aValueCCJs61To72 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAValueCCJs61To72(Long value) {
        this.aValueCCJs61To72 = value;
    }

    /**
     * Gets the value of the anocFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOCFlag() {
        return anocFlag;
    }

    /**
     * Sets the value of the anocFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOCFlag(String value) {
        this.anocFlag = value;
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
     * {@link CCJDetails }
     * 
     * 
     */
    public List<CCJDetails> getCCJDetail() {
        if (ccjDetail == null) {
            ccjDetail = new ArrayList<CCJDetails>();
        }
        return this.ccjDetail;
    }

}
