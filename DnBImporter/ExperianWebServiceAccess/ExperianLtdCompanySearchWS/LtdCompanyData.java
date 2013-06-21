
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LtdCompanyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LtdCompanyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommercialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Identification" minOccurs="0"/>
 *         &lt;element name="CorporateStructure" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CorporateStructure" minOccurs="0"/>
 *         &lt;element name="ManagementInfo" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ManagementInfo" minOccurs="0"/>
 *         &lt;element name="Shareholders" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Shareholders" minOccurs="0"/>
 *         &lt;element name="CommercialDelphi" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CommercialDelphi" minOccurs="0"/>
 *         &lt;element name="PaymentPerformance" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PaymentPerformance" minOccurs="0"/>
 *         &lt;element name="Financials" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Financials" minOccurs="0"/>
 *         &lt;element name="CCJs" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CCJs" minOccurs="0"/>
 *         &lt;element name="Mortgages" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Mortgages" minOccurs="0"/>
 *         &lt;element name="LegalNotices" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}LegalNotices" minOccurs="0"/>
 *         &lt;element name="CommercialDelphiHistory" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}CommercialDelphiHistory" minOccurs="0"/>
 *         &lt;element name="ScoringData" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}ScoringData" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}Alerts" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoticeOfCorrection" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}NoticeOfCorrection" minOccurs="0"/>
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
@XmlType(name = "LtdCompanyData", namespace = "http://schema.uk.experian.com/experian/bi/limited/intr/v100/ltdbusinesssearch", propOrder = {
    "regNumber",
    "commercialName",
    "identification",
    "corporateStructure",
    "managementInfo",
    "shareholders",
    "commercialDelphi",
    "paymentPerformance",
    "financials",
    "ccJs",
    "mortgages",
    "legalNotices",
    "commercialDelphiHistory",
    "scoringData",
    "alerts",
    "noticeOfCorrection",
    "error"
})
public class LtdCompanyData {

    @XmlElement(name = "RegNumber")
    protected String regNumber;
    @XmlElement(name = "CommercialName")
    protected String commercialName;
    @XmlElement(name = "Identification")
    protected Identification identification;
    @XmlElement(name = "CorporateStructure")
    protected CorporateStructure corporateStructure;
    @XmlElement(name = "ManagementInfo")
    protected ManagementInfo managementInfo;
    @XmlElement(name = "Shareholders")
    protected Shareholders shareholders;
    @XmlElement(name = "CommercialDelphi")
    protected CommercialDelphi commercialDelphi;
    @XmlElement(name = "PaymentPerformance")
    protected PaymentPerformance paymentPerformance;
    @XmlElement(name = "Financials")
    protected Financials financials;
    @XmlElement(name = "CCJs")
    protected CCJs ccJs;
    @XmlElement(name = "Mortgages")
    protected Mortgages mortgages;
    @XmlElement(name = "LegalNotices")
    protected LegalNotices legalNotices;
    @XmlElement(name = "CommercialDelphiHistory")
    protected CommercialDelphiHistory commercialDelphiHistory;
    @XmlElement(name = "ScoringData")
    protected ScoringData scoringData;
    @XmlElement(name = "Alerts")
    protected List<Alerts> alerts;
    @XmlElement(name = "NoticeOfCorrection")
    protected NoticeOfCorrection noticeOfCorrection;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "GeneratedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedOn;

    /**
     * Gets the value of the regNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Gets the value of the commercialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
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
     * Gets the value of the corporateStructure property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateStructure }
     *     
     */
    public CorporateStructure getCorporateStructure() {
        return corporateStructure;
    }

    /**
     * Sets the value of the corporateStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateStructure }
     *     
     */
    public void setCorporateStructure(CorporateStructure value) {
        this.corporateStructure = value;
    }

    /**
     * Gets the value of the managementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementInfo }
     *     
     */
    public ManagementInfo getManagementInfo() {
        return managementInfo;
    }

    /**
     * Sets the value of the managementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementInfo }
     *     
     */
    public void setManagementInfo(ManagementInfo value) {
        this.managementInfo = value;
    }

    /**
     * Gets the value of the shareholders property.
     * 
     * @return
     *     possible object is
     *     {@link Shareholders }
     *     
     */
    public Shareholders getShareholders() {
        return shareholders;
    }

    /**
     * Sets the value of the shareholders property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shareholders }
     *     
     */
    public void setShareholders(Shareholders value) {
        this.shareholders = value;
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
     * Gets the value of the financials property.
     * 
     * @return
     *     possible object is
     *     {@link Financials }
     *     
     */
    public Financials getFinancials() {
        return financials;
    }

    /**
     * Sets the value of the financials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financials }
     *     
     */
    public void setFinancials(Financials value) {
        this.financials = value;
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
     * Gets the value of the mortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Mortgages }
     *     
     */
    public Mortgages getMortgages() {
        return mortgages;
    }

    /**
     * Sets the value of the mortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mortgages }
     *     
     */
    public void setMortgages(Mortgages value) {
        this.mortgages = value;
    }

    /**
     * Gets the value of the legalNotices property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNotices }
     *     
     */
    public LegalNotices getLegalNotices() {
        return legalNotices;
    }

    /**
     * Sets the value of the legalNotices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNotices }
     *     
     */
    public void setLegalNotices(LegalNotices value) {
        this.legalNotices = value;
    }

    /**
     * Gets the value of the commercialDelphiHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialDelphiHistory }
     *     
     */
    public CommercialDelphiHistory getCommercialDelphiHistory() {
        return commercialDelphiHistory;
    }

    /**
     * Sets the value of the commercialDelphiHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialDelphiHistory }
     *     
     */
    public void setCommercialDelphiHistory(CommercialDelphiHistory value) {
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
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alerts }
     * 
     * 
     */
    public List<Alerts> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<Alerts>();
        }
        return this.alerts;
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
