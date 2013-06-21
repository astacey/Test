
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyOwnership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyOwnership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevParRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevParCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UltParRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UltParCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevUltParRegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrevUltParCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulkShareHolders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulkTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPrincShareHldrs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ParentDetail" minOccurs="0"/>
 *         &lt;element name="PrevParName" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ParentName" minOccurs="0"/>
 *         &lt;element name="UltParentDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ParentDetail" minOccurs="0"/>
 *         &lt;element name="PrevUltParName" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ParentName" minOccurs="0"/>
 *         &lt;element name="CorporateShareholder" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CorporateShareholder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyOwnership", propOrder = {
    "parRegNumber",
    "parCountry",
    "prevParRegNumber",
    "prevParCountry",
    "ultParRegNumber",
    "ultParCountry",
    "prevUltParRegNumber",
    "prevUltParCountry",
    "bulkShareHolders",
    "bulkTelephone",
    "numPrincShareHldrs",
    "parentDetail",
    "prevParName",
    "ultParentDetail",
    "prevUltParName",
    "corporateShareholder"
})
public class CompanyOwnership {

    @XmlElement(name = "ParRegNumber")
    protected String parRegNumber;
    @XmlElement(name = "ParCountry")
    protected String parCountry;
    @XmlElement(name = "PrevParRegNumber")
    protected String prevParRegNumber;
    @XmlElement(name = "PrevParCountry")
    protected String prevParCountry;
    @XmlElement(name = "UltParRegNumber")
    protected String ultParRegNumber;
    @XmlElement(name = "UltParCountry")
    protected String ultParCountry;
    @XmlElement(name = "PrevUltParRegNumber")
    protected String prevUltParRegNumber;
    @XmlElement(name = "PrevUltParCountry")
    protected String prevUltParCountry;
    @XmlElement(name = "BulkShareHolders")
    protected String bulkShareHolders;
    @XmlElement(name = "BulkTelephone")
    protected String bulkTelephone;
    @XmlElement(name = "NumPrincShareHldrs")
    protected Integer numPrincShareHldrs;
    @XmlElement(name = "ParentDetail")
    protected ParentDetail parentDetail;
    @XmlElement(name = "PrevParName")
    protected ParentName prevParName;
    @XmlElement(name = "UltParentDetail")
    protected ParentDetail ultParentDetail;
    @XmlElement(name = "PrevUltParName")
    protected ParentName prevUltParName;
    @XmlElement(name = "CorporateShareholder")
    protected List<CorporateShareholder> corporateShareholder;

    /**
     * Gets the value of the parRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParRegNumber() {
        return parRegNumber;
    }

    /**
     * Sets the value of the parRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParRegNumber(String value) {
        this.parRegNumber = value;
    }

    /**
     * Gets the value of the parCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParCountry() {
        return parCountry;
    }

    /**
     * Sets the value of the parCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParCountry(String value) {
        this.parCountry = value;
    }

    /**
     * Gets the value of the prevParRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevParRegNumber() {
        return prevParRegNumber;
    }

    /**
     * Sets the value of the prevParRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevParRegNumber(String value) {
        this.prevParRegNumber = value;
    }

    /**
     * Gets the value of the prevParCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevParCountry() {
        return prevParCountry;
    }

    /**
     * Sets the value of the prevParCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevParCountry(String value) {
        this.prevParCountry = value;
    }

    /**
     * Gets the value of the ultParRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltParRegNumber() {
        return ultParRegNumber;
    }

    /**
     * Sets the value of the ultParRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltParRegNumber(String value) {
        this.ultParRegNumber = value;
    }

    /**
     * Gets the value of the ultParCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltParCountry() {
        return ultParCountry;
    }

    /**
     * Sets the value of the ultParCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltParCountry(String value) {
        this.ultParCountry = value;
    }

    /**
     * Gets the value of the prevUltParRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevUltParRegNumber() {
        return prevUltParRegNumber;
    }

    /**
     * Sets the value of the prevUltParRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevUltParRegNumber(String value) {
        this.prevUltParRegNumber = value;
    }

    /**
     * Gets the value of the prevUltParCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevUltParCountry() {
        return prevUltParCountry;
    }

    /**
     * Sets the value of the prevUltParCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevUltParCountry(String value) {
        this.prevUltParCountry = value;
    }

    /**
     * Gets the value of the bulkShareHolders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkShareHolders() {
        return bulkShareHolders;
    }

    /**
     * Sets the value of the bulkShareHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkShareHolders(String value) {
        this.bulkShareHolders = value;
    }

    /**
     * Gets the value of the bulkTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkTelephone() {
        return bulkTelephone;
    }

    /**
     * Sets the value of the bulkTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkTelephone(String value) {
        this.bulkTelephone = value;
    }

    /**
     * Gets the value of the numPrincShareHldrs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrincShareHldrs() {
        return numPrincShareHldrs;
    }

    /**
     * Sets the value of the numPrincShareHldrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrincShareHldrs(Integer value) {
        this.numPrincShareHldrs = value;
    }

    /**
     * Gets the value of the parentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDetail }
     *     
     */
    public ParentDetail getParentDetail() {
        return parentDetail;
    }

    /**
     * Sets the value of the parentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDetail }
     *     
     */
    public void setParentDetail(ParentDetail value) {
        this.parentDetail = value;
    }

    /**
     * Gets the value of the prevParName property.
     * 
     * @return
     *     possible object is
     *     {@link ParentName }
     *     
     */
    public ParentName getPrevParName() {
        return prevParName;
    }

    /**
     * Sets the value of the prevParName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentName }
     *     
     */
    public void setPrevParName(ParentName value) {
        this.prevParName = value;
    }

    /**
     * Gets the value of the ultParentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ParentDetail }
     *     
     */
    public ParentDetail getUltParentDetail() {
        return ultParentDetail;
    }

    /**
     * Sets the value of the ultParentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentDetail }
     *     
     */
    public void setUltParentDetail(ParentDetail value) {
        this.ultParentDetail = value;
    }

    /**
     * Gets the value of the prevUltParName property.
     * 
     * @return
     *     possible object is
     *     {@link ParentName }
     *     
     */
    public ParentName getPrevUltParName() {
        return prevUltParName;
    }

    /**
     * Sets the value of the prevUltParName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentName }
     *     
     */
    public void setPrevUltParName(ParentName value) {
        this.prevUltParName = value;
    }

    /**
     * Gets the value of the corporateShareholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporateShareholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporateShareholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateShareholder }
     * 
     * 
     */
    public List<CorporateShareholder> getCorporateShareholder() {
        if (corporateShareholder == null) {
            corporateShareholder = new ArrayList<CorporateShareholder>();
        }
        return this.corporateShareholder;
    }

}
