
package ExperianNonLtdBusinessSearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EarliestKnownDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LastUpdated" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="Num1992SICCodes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BusinessLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NonLtdBusinessLocation" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICInformation1992" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SICInfo92" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AvgNumEmployees" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="NumTelephone" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumFax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}TelephoneDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}FaxDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ThomsonData" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}ThomsonData" minOccurs="0"/>
 *         &lt;element name="PrevSearches" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}PrevSearches" minOccurs="0"/>
 *         &lt;element name="CCLs" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}ArrayOfCCLDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identification", propOrder = {
    "earliestKnownDate",
    "lastUpdated",
    "num1992SICCodes",
    "businessLocation",
    "telephoneNumber",
    "principalActivities",
    "sicInformation1992",
    "avgNumEmployees",
    "numTelephone",
    "numFax",
    "telephone",
    "fax",
    "thomsonData",
    "prevSearches",
    "ccLs"
})
public class Identification {

    @XmlElement(name = "EarliestKnownDate")
    protected CCYYMMDD earliestKnownDate;
    @XmlElement(name = "LastUpdated")
    protected CCYYMMDD lastUpdated;
    @XmlElement(name = "Num1992SICCodes")
    protected Integer num1992SICCodes;
    @XmlElement(name = "BusinessLocation")
    protected NonLtdBusinessLocation businessLocation;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "PrincipalActivities")
    protected String principalActivities;
    @XmlElement(name = "SICInformation1992")
    protected List<SICInfo92> sicInformation1992;
    @XmlElement(name = "AvgNumEmployees")
    protected Long avgNumEmployees;
    @XmlElement(name = "NumTelephone")
    protected Integer numTelephone;
    @XmlElement(name = "NumFax")
    protected Integer numFax;
    @XmlElement(name = "Telephone")
    protected List<TelephoneDetails> telephone;
    @XmlElement(name = "Fax")
    protected List<FaxDetails> fax;
    @XmlElement(name = "ThomsonData")
    protected ThomsonData thomsonData;
    @XmlElement(name = "PrevSearches")
    protected PrevSearches prevSearches;
    @XmlElement(name = "CCLs")
    protected ArrayOfCCLDetail ccLs;

    /**
     * Gets the value of the earliestKnownDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getEarliestKnownDate() {
        return earliestKnownDate;
    }

    /**
     * Sets the value of the earliestKnownDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setEarliestKnownDate(CCYYMMDD value) {
        this.earliestKnownDate = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLastUpdated(CCYYMMDD value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the num1992SICCodes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNum1992SICCodes() {
        return num1992SICCodes;
    }

    /**
     * Sets the value of the num1992SICCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNum1992SICCodes(Integer value) {
        this.num1992SICCodes = value;
    }

    /**
     * Gets the value of the businessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public NonLtdBusinessLocation getBusinessLocation() {
        return businessLocation;
    }

    /**
     * Sets the value of the businessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLtdBusinessLocation }
     *     
     */
    public void setBusinessLocation(NonLtdBusinessLocation value) {
        this.businessLocation = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the principalActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalActivities() {
        return principalActivities;
    }

    /**
     * Sets the value of the principalActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalActivities(String value) {
        this.principalActivities = value;
    }

    /**
     * Gets the value of the sicInformation1992 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sicInformation1992 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSICInformation1992().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SICInfo92 }
     * 
     * 
     */
    public List<SICInfo92> getSICInformation1992() {
        if (sicInformation1992 == null) {
            sicInformation1992 = new ArrayList<SICInfo92>();
        }
        return this.sicInformation1992;
    }

    /**
     * Gets the value of the avgNumEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvgNumEmployees() {
        return avgNumEmployees;
    }

    /**
     * Sets the value of the avgNumEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvgNumEmployees(Long value) {
        this.avgNumEmployees = value;
    }

    /**
     * Gets the value of the numTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumTelephone() {
        return numTelephone;
    }

    /**
     * Sets the value of the numTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumTelephone(Integer value) {
        this.numTelephone = value;
    }

    /**
     * Gets the value of the numFax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumFax() {
        return numFax;
    }

    /**
     * Sets the value of the numFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumFax(Integer value) {
        this.numFax = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneDetails }
     * 
     * 
     */
    public List<TelephoneDetails> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<TelephoneDetails>();
        }
        return this.telephone;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaxDetails }
     * 
     * 
     */
    public List<FaxDetails> getFax() {
        if (fax == null) {
            fax = new ArrayList<FaxDetails>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the thomsonData property.
     * 
     * @return
     *     possible object is
     *     {@link ThomsonData }
     *     
     */
    public ThomsonData getThomsonData() {
        return thomsonData;
    }

    /**
     * Sets the value of the thomsonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThomsonData }
     *     
     */
    public void setThomsonData(ThomsonData value) {
        this.thomsonData = value;
    }

    /**
     * Gets the value of the prevSearches property.
     * 
     * @return
     *     possible object is
     *     {@link PrevSearches }
     *     
     */
    public PrevSearches getPrevSearches() {
        return prevSearches;
    }

    /**
     * Sets the value of the prevSearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevSearches }
     *     
     */
    public void setPrevSearches(PrevSearches value) {
        this.prevSearches = value;
    }

    /**
     * Gets the value of the ccLs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCCLDetail }
     *     
     */
    public ArrayOfCCLDetail getCCLs() {
        return ccLs;
    }

    /**
     * Sets the value of the ccLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCCLDetail }
     *     
     */
    public void setCCLs(ArrayOfCCLDetail value) {
        this.ccLs = value;
    }

}
