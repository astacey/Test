
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identification" type="{http://gateway.dnb.com/getProduct}IdentificationType" minOccurs="0"/>
 *         &lt;element name="CompanyOverview" type="{http://gateway.dnb.com/getProduct}CompanyOverviewType" minOccurs="0"/>
 *         &lt;element name="CorporateLinkagesOverview" type="{http://gateway.dnb.com/getProduct}LinkageSummaryType" minOccurs="0"/>
 *         &lt;element name="DNBAssessmentOverview" type="{http://gateway.dnb.com/getProduct}AssessmentSummaryType" minOccurs="0"/>
 *         &lt;element name="PublicFilingsOverview" type="{http://gateway.dnb.com/getProduct}PublicFilingsSummaryType" minOccurs="0"/>
 *         &lt;element name="FinancialsOverview" type="{http://gateway.dnb.com/getProduct}FinancialsSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identification",
    "companyOverview",
    "corporateLinkagesOverview",
    "dnbAssessmentOverview",
    "publicFilingsOverview",
    "financialsOverview"
})
@XmlRootElement(name = "CompanySummary")
public class CompanySummary {

    @XmlElement(name = "Identification")
    protected IdentificationType identification;
    @XmlElement(name = "CompanyOverview")
    protected CompanyOverviewType companyOverview;
    @XmlElement(name = "CorporateLinkagesOverview")
    protected LinkageSummaryType corporateLinkagesOverview;
    @XmlElement(name = "DNBAssessmentOverview")
    protected AssessmentSummaryType dnbAssessmentOverview;
    @XmlElement(name = "PublicFilingsOverview")
    protected PublicFilingsSummaryType publicFilingsOverview;
    @XmlElement(name = "FinancialsOverview")
    protected FinancialsSummaryType financialsOverview;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setIdentification(IdentificationType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the companyOverview property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyOverviewType }
     *     
     */
    public CompanyOverviewType getCompanyOverview() {
        return companyOverview;
    }

    /**
     * Sets the value of the companyOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyOverviewType }
     *     
     */
    public void setCompanyOverview(CompanyOverviewType value) {
        this.companyOverview = value;
    }

    /**
     * Gets the value of the corporateLinkagesOverview property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageSummaryType }
     *     
     */
    public LinkageSummaryType getCorporateLinkagesOverview() {
        return corporateLinkagesOverview;
    }

    /**
     * Sets the value of the corporateLinkagesOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageSummaryType }
     *     
     */
    public void setCorporateLinkagesOverview(LinkageSummaryType value) {
        this.corporateLinkagesOverview = value;
    }

    /**
     * Gets the value of the dnbAssessmentOverview property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSummaryType }
     *     
     */
    public AssessmentSummaryType getDNBAssessmentOverview() {
        return dnbAssessmentOverview;
    }

    /**
     * Sets the value of the dnbAssessmentOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSummaryType }
     *     
     */
    public void setDNBAssessmentOverview(AssessmentSummaryType value) {
        this.dnbAssessmentOverview = value;
    }

    /**
     * Gets the value of the publicFilingsOverview property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilingsSummaryType }
     *     
     */
    public PublicFilingsSummaryType getPublicFilingsOverview() {
        return publicFilingsOverview;
    }

    /**
     * Sets the value of the publicFilingsOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilingsSummaryType }
     *     
     */
    public void setPublicFilingsOverview(PublicFilingsSummaryType value) {
        this.publicFilingsOverview = value;
    }

    /**
     * Gets the value of the financialsOverview property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialsSummaryType }
     *     
     */
    public FinancialsSummaryType getFinancialsOverview() {
        return financialsOverview;
    }

    /**
     * Sets the value of the financialsOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialsSummaryType }
     *     
     */
    public void setFinancialsOverview(FinancialsSummaryType value) {
        this.financialsOverview = value;
    }

}
