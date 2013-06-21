
package ExperianLtdCompanySearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharehldrsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharehldrsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareholderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ShareHolderNameDetls" minOccurs="0"/>
 *         &lt;element name="ShareholderQualifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShareholderTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CommercialDetail" minOccurs="0"/>
 *         &lt;element name="ShareholderLocation" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ShareHoldersLocation" minOccurs="0"/>
 *         &lt;element name="SuppressionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharehldrsDetails", propOrder = {
    "shareholderType",
    "name",
    "shareholderQualifications",
    "shareholderTitle",
    "commercialDetail",
    "shareholderLocation",
    "suppressionFlag"
})
public class SharehldrsDetails {

    @XmlElement(name = "ShareholderType")
    protected String shareholderType;
    @XmlElement(name = "Name")
    protected ShareHolderNameDetls name;
    @XmlElement(name = "ShareholderQualifications")
    protected String shareholderQualifications;
    @XmlElement(name = "ShareholderTitle")
    protected String shareholderTitle;
    @XmlElement(name = "CommercialDetail")
    protected CommercialDetail commercialDetail;
    @XmlElement(name = "ShareholderLocation")
    protected ShareHoldersLocation shareholderLocation;
    @XmlElement(name = "SuppressionFlag")
    protected String suppressionFlag;

    /**
     * Gets the value of the shareholderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareholderType() {
        return shareholderType;
    }

    /**
     * Sets the value of the shareholderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareholderType(String value) {
        this.shareholderType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHolderNameDetls }
     *     
     */
    public ShareHolderNameDetls getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHolderNameDetls }
     *     
     */
    public void setName(ShareHolderNameDetls value) {
        this.name = value;
    }

    /**
     * Gets the value of the shareholderQualifications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareholderQualifications() {
        return shareholderQualifications;
    }

    /**
     * Sets the value of the shareholderQualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareholderQualifications(String value) {
        this.shareholderQualifications = value;
    }

    /**
     * Gets the value of the shareholderTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareholderTitle() {
        return shareholderTitle;
    }

    /**
     * Sets the value of the shareholderTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareholderTitle(String value) {
        this.shareholderTitle = value;
    }

    /**
     * Gets the value of the commercialDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDetail }
     *     
     */
    public CommercialDetail getCommercialDetail() {
        return commercialDetail;
    }

    /**
     * Sets the value of the commercialDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDetail }
     *     
     */
    public void setCommercialDetail(CommercialDetail value) {
        this.commercialDetail = value;
    }

    /**
     * Gets the value of the shareholderLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ShareHoldersLocation }
     *     
     */
    public ShareHoldersLocation getShareholderLocation() {
        return shareholderLocation;
    }

    /**
     * Sets the value of the shareholderLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareHoldersLocation }
     *     
     */
    public void setShareholderLocation(ShareHoldersLocation value) {
        this.shareholderLocation = value;
    }

    /**
     * Gets the value of the suppressionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressionFlag() {
        return suppressionFlag;
    }

    /**
     * Sets the value of the suppressionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressionFlag(String value) {
        this.suppressionFlag = value;
    }

}
