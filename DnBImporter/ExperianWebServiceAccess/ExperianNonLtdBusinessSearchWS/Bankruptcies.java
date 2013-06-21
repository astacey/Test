
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bankruptcies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bankruptcies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MDataOutOwnshpRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MBankruptcyCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MAgeMostRecentBankruptcy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MNOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADataOutOwnshpRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ABankruptcyCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AAgeMostRecentBankruptcy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ANOCFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankruptcyDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}BankruptcyDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bankruptcies", propOrder = {
    "mDataOutOwnshpRange",
    "mBankruptcyCount",
    "mAgeMostRecentBankruptcy",
    "mnocFlag",
    "aDataOutOwnshpRange",
    "aBankruptcyCount",
    "aAgeMostRecentBankruptcy",
    "anocFlag",
    "bankruptcyDetail"
})
public class Bankruptcies {

    @XmlElement(name = "MDataOutOwnshpRange")
    protected String mDataOutOwnshpRange;
    @XmlElement(name = "MBankruptcyCount")
    protected Integer mBankruptcyCount;
    @XmlElement(name = "MAgeMostRecentBankruptcy")
    protected Integer mAgeMostRecentBankruptcy;
    @XmlElement(name = "MNOCFlag")
    protected String mnocFlag;
    @XmlElement(name = "ADataOutOwnshpRange")
    protected String aDataOutOwnshpRange;
    @XmlElement(name = "ABankruptcyCount")
    protected Integer aBankruptcyCount;
    @XmlElement(name = "AAgeMostRecentBankruptcy")
    protected Integer aAgeMostRecentBankruptcy;
    @XmlElement(name = "ANOCFlag")
    protected String anocFlag;
    @XmlElement(name = "BankruptcyDetail")
    protected List<BankruptcyDetails> bankruptcyDetail;

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
     * Gets the value of the mBankruptcyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMBankruptcyCount() {
        return mBankruptcyCount;
    }

    /**
     * Sets the value of the mBankruptcyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMBankruptcyCount(Integer value) {
        this.mBankruptcyCount = value;
    }

    /**
     * Gets the value of the mAgeMostRecentBankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAgeMostRecentBankruptcy() {
        return mAgeMostRecentBankruptcy;
    }

    /**
     * Sets the value of the mAgeMostRecentBankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAgeMostRecentBankruptcy(Integer value) {
        this.mAgeMostRecentBankruptcy = value;
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
     * Gets the value of the aBankruptcyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getABankruptcyCount() {
        return aBankruptcyCount;
    }

    /**
     * Sets the value of the aBankruptcyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setABankruptcyCount(Integer value) {
        this.aBankruptcyCount = value;
    }

    /**
     * Gets the value of the aAgeMostRecentBankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAAgeMostRecentBankruptcy() {
        return aAgeMostRecentBankruptcy;
    }

    /**
     * Sets the value of the aAgeMostRecentBankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAAgeMostRecentBankruptcy(Integer value) {
        this.aAgeMostRecentBankruptcy = value;
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
     * Gets the value of the bankruptcyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankruptcyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankruptcyDetails }
     * 
     * 
     */
    public List<BankruptcyDetails> getBankruptcyDetail() {
        if (bankruptcyDetail == null) {
            bankruptcyDetail = new ArrayList<BankruptcyDetails>();
        }
        return this.bankruptcyDetail;
    }

}
