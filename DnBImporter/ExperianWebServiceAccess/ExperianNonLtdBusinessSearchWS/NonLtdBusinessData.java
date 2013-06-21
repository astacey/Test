
package ExperianNonLtdBusinessSearchWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NonLtdBusinessData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonLtdBusinessData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NonLimitedKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipStartDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="OwnershipEndDate" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMM" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}Identification" minOccurs="0"/>
 *         &lt;element name="CommercialDelphi" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CommercialDelphi" minOccurs="0"/>
 *         &lt;element name="PaymentPerformance" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}PaymentPerformance" minOccurs="0"/>
 *         &lt;element name="CCJs" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}CCJs" minOccurs="0"/>
 *         &lt;element name="Bankruptcies" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}Bankruptcies" minOccurs="0"/>
 *         &lt;element name="CommercialDelphiHistory" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}DelphiHistoryAndScore" minOccurs="0"/>
 *         &lt;element name="ScoringData" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}ScoringData" minOccurs="0"/>
 *         &lt;element name="BusinessLinks" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}BusinessLinks" minOccurs="0"/>
 *         &lt;element name="NoticeOfCorrection" type="{http://schema.uk.experian.com/experian/bi/generic/business/nonlimited/v100/basetypes}NoticeOfCorrection" minOccurs="0"/>
 *         &lt;element name="Error" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}Error" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GeneratedOn" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonLtdBusinessData", namespace = "http://schema.uk.experian.com/experian/bi/nonlimited/intr/v100/nonltdbusinesssearch", propOrder = {
    "nonLimitedKey",
    "businessName",
    "ownershipStartDate",
    "ownershipEndDate",
    "identification",
    "commercialDelphi",
    "paymentPerformance",
    "ccJs",
    "bankruptcies",
    "commercialDelphiHistory",
    "scoringData",
    "businessLinks",
    "noticeOfCorrection",
    "error"
})
public class NonLtdBusinessData {

    @XmlElement(name = "NonLimitedKey")
    protected String nonLimitedKey;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "OwnershipStartDate")
    protected CCYYMM ownershipStartDate;
    @XmlElement(name = "OwnershipEndDate")
    protected CCYYMM ownershipEndDate;
    @XmlElement(name = "Identification")
    protected Identification identification;
    @XmlElement(name = "CommercialDelphi")
    protected CommercialDelphi commercialDelphi;
    @XmlElement(name = "PaymentPerformance")
    protected PaymentPerformance paymentPerformance;
    @XmlElement(name = "CCJs")
    protected CCJs ccJs;
    @XmlElement(name = "Bankruptcies")
    protected Bankruptcies bankruptcies;
    @XmlElement(name = "CommercialDelphiHistory")
    protected DelphiHistoryAndScore commercialDelphiHistory;
    @XmlElement(name = "ScoringData")
    protected ScoringData scoringData;
    @XmlElement(name = "BusinessLinks")
    protected BusinessLinks businessLinks;
    @XmlElement(name = "NoticeOfCorrection")
    protected NoticeOfCorrection noticeOfCorrection;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "GeneratedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedOn;

    /**
     * Gets the value of the nonLimitedKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonLimitedKey() {
        return nonLimitedKey;
    }

    /**
     * Sets the value of the nonLimitedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonLimitedKey(String value) {
        this.nonLimitedKey = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the ownershipStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getOwnershipStartDate() {
        return ownershipStartDate;
    }

    /**
     * Sets the value of the ownershipStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setOwnershipStartDate(CCYYMM value) {
        this.ownershipStartDate = value;
    }

    /**
     * Gets the value of the ownershipEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMM }
     *     
     */
    public CCYYMM getOwnershipEndDate() {
        return ownershipEndDate;
    }

    /**
     * Sets the value of the ownershipEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMM }
     *     
     */
    public void setOwnershipEndDate(CCYYMM value) {
        this.ownershipEndDate = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the commercialDelphi property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDelphi }
     *     
     */
    public CommercialDelphi getCommercialDelphi() {
        return commercialDelphi;
    }

    /**
     * Sets the value of the commercialDelphi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDelphi }
     *     
     */
    public void setCommercialDelphi(CommercialDelphi value) {
        this.commercialDelphi = value;
    }

    /**
     * Gets the value of the paymentPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPerformance }
     *     
     */
    public PaymentPerformance getPaymentPerformance() {
        return paymentPerformance;
    }

    /**
     * Sets the value of the paymentPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPerformance }
     *     
     */
    public void setPaymentPerformance(PaymentPerformance value) {
        this.paymentPerformance = value;
    }

    /**
     * Gets the value of the ccJs property.
     * 
     * @return
     *     possible object is
     *     {@link CCJs }
     *     
     */
    public CCJs getCCJs() {
        return ccJs;
    }

    /**
     * Sets the value of the ccJs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCJs }
     *     
     */
    public void setCCJs(CCJs value) {
        this.ccJs = value;
    }

    /**
     * Gets the value of the bankruptcies property.
     * 
     * @return
     *     possible object is
     *     {@link Bankruptcies }
     *     
     */
    public Bankruptcies getBankruptcies() {
        return bankruptcies;
    }

    /**
     * Sets the value of the bankruptcies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bankruptcies }
     *     
     */
    public void setBankruptcies(Bankruptcies value) {
        this.bankruptcies = value;
    }

    /**
     * Gets the value of the commercialDelphiHistory property.
     * 
     * @return
     *     possible object is
     *     {@link DelphiHistoryAndScore }
     *     
     */
    public DelphiHistoryAndScore getCommercialDelphiHistory() {
        return commercialDelphiHistory;
    }

    /**
     * Sets the value of the commercialDelphiHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelphiHistoryAndScore }
     *     
     */
    public void setCommercialDelphiHistory(DelphiHistoryAndScore value) {
        this.commercialDelphiHistory = value;
    }

    /**
     * Gets the value of the scoringData property.
     * 
     * @return
     *     possible object is
     *     {@link ScoringData }
     *     
     */
    public ScoringData getScoringData() {
        return scoringData;
    }

    /**
     * Sets the value of the scoringData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoringData }
     *     
     */
    public void setScoringData(ScoringData value) {
        this.scoringData = value;
    }

    /**
     * Gets the value of the businessLinks property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLinks }
     *     
     */
    public BusinessLinks getBusinessLinks() {
        return businessLinks;
    }

    /**
     * Sets the value of the businessLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLinks }
     *     
     */
    public void setBusinessLinks(BusinessLinks value) {
        this.businessLinks = value;
    }

    /**
     * Gets the value of the noticeOfCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link NoticeOfCorrection }
     *     
     */
    public NoticeOfCorrection getNoticeOfCorrection() {
        return noticeOfCorrection;
    }

    /**
     * Sets the value of the noticeOfCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoticeOfCorrection }
     *     
     */
    public void setNoticeOfCorrection(NoticeOfCorrection value) {
        this.noticeOfCorrection = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

    /**
     * Gets the value of the generatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedOn() {
        return generatedOn;
    }

    /**
     * Sets the value of the generatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedOn(XMLGregorianCalendar value) {
        this.generatedOn = value;
    }

}
