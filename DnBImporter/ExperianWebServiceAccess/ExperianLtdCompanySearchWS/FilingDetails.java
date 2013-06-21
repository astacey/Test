
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatabaseAccountsOutOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiledAccountsOutOfDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestAccounts" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestReturns" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestAccountsReceived" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestReturnsDatabase" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="LatestAccountsDatabase" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="NumAccountsOnFile" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatestAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountsRefDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}MMDD" minOccurs="0"/>
 *         &lt;element name="NumberDaysToFileAccounts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilingDetails", propOrder = {
    "databaseAccountsOutOfDate",
    "filedAccountsOutOfDate",
    "latestAccounts",
    "latestReturns",
    "latestAccountsReceived",
    "latestReturnsDatabase",
    "latestAccountsDatabase",
    "numAccountsOnFile",
    "latestAccountType",
    "accountsRefDate",
    "numberDaysToFileAccounts"
})
public class FilingDetails {

    @XmlElement(name = "DatabaseAccountsOutOfDate")
    protected String databaseAccountsOutOfDate;
    @XmlElement(name = "FiledAccountsOutOfDate")
    protected String filedAccountsOutOfDate;
    @XmlElement(name = "LatestAccounts")
    protected CCYYMMDD latestAccounts;
    @XmlElement(name = "LatestReturns")
    protected CCYYMMDD latestReturns;
    @XmlElement(name = "LatestAccountsReceived")
    protected CCYYMMDD latestAccountsReceived;
    @XmlElement(name = "LatestReturnsDatabase")
    protected CCYYMMDD latestReturnsDatabase;
    @XmlElement(name = "LatestAccountsDatabase")
    protected CCYYMMDD latestAccountsDatabase;
    @XmlElement(name = "NumAccountsOnFile")
    protected Integer numAccountsOnFile;
    @XmlElement(name = "LatestAccountType")
    protected String latestAccountType;
    @XmlElement(name = "AccountsRefDate")
    protected MMDD accountsRefDate;
    @XmlElement(name = "NumberDaysToFileAccounts")
    protected Integer numberDaysToFileAccounts;

    /**
     * Gets the value of the databaseAccountsOutOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseAccountsOutOfDate() {
        return databaseAccountsOutOfDate;
    }

    /**
     * Sets the value of the databaseAccountsOutOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseAccountsOutOfDate(String value) {
        this.databaseAccountsOutOfDate = value;
    }

    /**
     * Gets the value of the filedAccountsOutOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAccountsOutOfDate() {
        return filedAccountsOutOfDate;
    }

    /**
     * Sets the value of the filedAccountsOutOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAccountsOutOfDate(String value) {
        this.filedAccountsOutOfDate = value;
    }

    /**
     * Gets the value of the latestAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestAccounts() {
        return latestAccounts;
    }

    /**
     * Sets the value of the latestAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestAccounts(CCYYMMDD value) {
        this.latestAccounts = value;
    }

    /**
     * Gets the value of the latestReturns property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestReturns() {
        return latestReturns;
    }

    /**
     * Sets the value of the latestReturns property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestReturns(CCYYMMDD value) {
        this.latestReturns = value;
    }

    /**
     * Gets the value of the latestAccountsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestAccountsReceived() {
        return latestAccountsReceived;
    }

    /**
     * Sets the value of the latestAccountsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestAccountsReceived(CCYYMMDD value) {
        this.latestAccountsReceived = value;
    }

    /**
     * Gets the value of the latestReturnsDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestReturnsDatabase() {
        return latestReturnsDatabase;
    }

    /**
     * Sets the value of the latestReturnsDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestReturnsDatabase(CCYYMMDD value) {
        this.latestReturnsDatabase = value;
    }

    /**
     * Gets the value of the latestAccountsDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getLatestAccountsDatabase() {
        return latestAccountsDatabase;
    }

    /**
     * Sets the value of the latestAccountsDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setLatestAccountsDatabase(CCYYMMDD value) {
        this.latestAccountsDatabase = value;
    }

    /**
     * Gets the value of the numAccountsOnFile property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAccountsOnFile() {
        return numAccountsOnFile;
    }

    /**
     * Sets the value of the numAccountsOnFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAccountsOnFile(Integer value) {
        this.numAccountsOnFile = value;
    }

    /**
     * Gets the value of the latestAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestAccountType() {
        return latestAccountType;
    }

    /**
     * Sets the value of the latestAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestAccountType(String value) {
        this.latestAccountType = value;
    }

    /**
     * Gets the value of the accountsRefDate property.
     * 
     * @return
     *     possible object is
     *     {@link MMDD }
     *     
     */
    public MMDD getAccountsRefDate() {
        return accountsRefDate;
    }

    /**
     * Sets the value of the accountsRefDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMDD }
     *     
     */
    public void setAccountsRefDate(MMDD value) {
        this.accountsRefDate = value;
    }

    /**
     * Gets the value of the numberDaysToFileAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberDaysToFileAccounts() {
        return numberDaysToFileAccounts;
    }

    /**
     * Sets the value of the numberDaysToFileAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberDaysToFileAccounts(Integer value) {
        this.numberDaysToFileAccounts = value;
    }

}
