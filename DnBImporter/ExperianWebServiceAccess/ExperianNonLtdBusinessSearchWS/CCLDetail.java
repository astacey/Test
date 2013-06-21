
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCLDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCLDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenceDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LicenceCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeterminationToRevokeDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DeterminationToSuspendDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="DeterminationToVaryDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="AppealDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="SuspensionDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="SuspendPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TerminationDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LapsedDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumberTradingNames" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LicenseeDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseeLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NonLtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="TradingNames" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}TradeNames" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCLDetail", propOrder = {
    "recordType",
    "licenceNumber",
    "licenceDate",
    "licenceCategories",
    "determinationToRevokeDate",
    "determinationToSuspendDate",
    "determinationToVaryDate",
    "appealDate",
    "suspensionDate",
    "suspendPeriod",
    "terminationDate",
    "lapsedDate",
    "numberTradingNames",
    "licenseeDetail",
    "licenseeLocation",
    "tradingNames"
})
public class CCLDetail {

    @XmlElement(name = "RecordType")
    protected String recordType;
    @XmlElement(name = "LicenceNumber")
    protected String licenceNumber;
    @XmlElement(name = "LicenceDate")
    protected CCYYMMDD licenceDate;
    @XmlElement(name = "LicenceCategories")
    protected String licenceCategories;
    @XmlElement(name = "DeterminationToRevokeDate")
    protected CCYYMMDD determinationToRevokeDate;
    @XmlElement(name = "DeterminationToSuspendDate")
    protected CCYYMMDD determinationToSuspendDate;
    @XmlElement(name = "DeterminationToVaryDate")
    protected CCYYMMDD determinationToVaryDate;
    @XmlElement(name = "AppealDate")
    protected CCYYMMDD appealDate;
    @XmlElement(name = "SuspensionDate")
    protected CCYYMMDD suspensionDate;
    @XmlElement(name = "SuspendPeriod")
    protected Integer suspendPeriod;
    @XmlElement(name = "TerminationDate")
    protected CCYYMMDD terminationDate;
    @XmlElement(name = "LapsedDate")
    protected CCYYMMDD lapsedDate;
    @XmlElement(name = "NumberTradingNames")
    protected Integer numberTradingNames;
    @XmlElement(name = "LicenseeDetail")
    protected String licenseeDetail;
    @XmlElement(name = "LicenseeLocation")
    protected NonLtdBusinessLocation licenseeLocation;
    @XmlElement(name = "TradingNames")
    protected List<TradeNames> tradingNames;

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordType(String value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the licenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceNumber() {
        return licenceNumber;
    }

    /**
     * Sets the value of the licenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceNumber(String value) {
        this.licenceNumber = value;
    }

    /**
     * Gets the value of the licenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLicenceDate() {
        return licenceDate;
    }

    /**
     * Sets the value of the licenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLicenceDate(CCYYMMDD value) {
        this.licenceDate = value;
    }

    /**
     * Gets the value of the licenceCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceCategories() {
        return licenceCategories;
    }

    /**
     * Sets the value of the licenceCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceCategories(String value) {
        this.licenceCategories = value;
    }

    /**
     * Gets the value of the determinationToRevokeDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDeterminationToRevokeDate() {
        return determinationToRevokeDate;
    }

    /**
     * Sets the value of the determinationToRevokeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDeterminationToRevokeDate(CCYYMMDD value) {
        this.determinationToRevokeDate = value;
    }

    /**
     * Gets the value of the determinationToSuspendDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDeterminationToSuspendDate() {
        return determinationToSuspendDate;
    }

    /**
     * Sets the value of the determinationToSuspendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDeterminationToSuspendDate(CCYYMMDD value) {
        this.determinationToSuspendDate = value;
    }

    /**
     * Gets the value of the determinationToVaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDeterminationToVaryDate() {
        return determinationToVaryDate;
    }

    /**
     * Sets the value of the determinationToVaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDeterminationToVaryDate(CCYYMMDD value) {
        this.determinationToVaryDate = value;
    }

    /**
     * Gets the value of the appealDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getAppealDate() {
        return appealDate;
    }

    /**
     * Sets the value of the appealDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setAppealDate(CCYYMMDD value) {
        this.appealDate = value;
    }

    /**
     * Gets the value of the suspensionDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getSuspensionDate() {
        return suspensionDate;
    }

    /**
     * Sets the value of the suspensionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setSuspensionDate(CCYYMMDD value) {
        this.suspensionDate = value;
    }

    /**
     * Gets the value of the suspendPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuspendPeriod() {
        return suspendPeriod;
    }

    /**
     * Sets the value of the suspendPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuspendPeriod(Integer value) {
        this.suspendPeriod = value;
    }

    /**
     * Gets the value of the terminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setTerminationDate(CCYYMMDD value) {
        this.terminationDate = value;
    }

    /**
     * Gets the value of the lapsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLapsedDate() {
        return lapsedDate;
    }

    /**
     * Sets the value of the lapsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLapsedDate(CCYYMMDD value) {
        this.lapsedDate = value;
    }

    /**
     * Gets the value of the numberTradingNames property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberTradingNames() {
        return numberTradingNames;
    }

    /**
     * Sets the value of the numberTradingNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberTradingNames(Integer value) {
        this.numberTradingNames = value;
    }

    /**
     * Gets the value of the licenseeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseeDetail() {
        return licenseeDetail;
    }

    /**
     * Sets the value of the licenseeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseeDetail(String value) {
        this.licenseeDetail = value;
    }

    /**
     * Gets the value of the licenseeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public NonLtdBusinessLocation getLicenseeLocation() {
        return licenseeLocation;
    }

    /**
     * Sets the value of the licenseeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public void setLicenseeLocation(NonLtdBusinessLocation value) {
        this.licenseeLocation = value;
    }

    /**
     * Gets the value of the tradingNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeNames }
     * 
     * 
     */
    public List<TradeNames> getTradingNames() {
        if (tradingNames == null) {
            tradingNames = new ArrayList<TradeNames>();
        }
        return this.tradingNames;
    }

}
