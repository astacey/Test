
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
 *         &lt;element name="DNBSubjectRiskAssessment" type="{http://gateway.dnb.com/getProduct}DNBSubjectRiskAssessmentType" minOccurs="0"/>
 *         &lt;element name="DNBIndustryRiskAssessment" type="{http://gateway.dnb.com/getProduct}DNBIndustryRiskAssessmentType" minOccurs="0"/>
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
    "dnbSubjectRiskAssessment",
    "dnbIndustryRiskAssessment"
})
@XmlRootElement(name = "PredictiveScores")
public class PredictiveScores {

    @XmlElement(name = "DNBSubjectRiskAssessment")
    protected DNBSubjectRiskAssessmentType dnbSubjectRiskAssessment;
    @XmlElement(name = "DNBIndustryRiskAssessment")
    protected DNBIndustryRiskAssessmentType dnbIndustryRiskAssessment;

    /**
     * Gets the value of the dnbSubjectRiskAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link DNBSubjectRiskAssessmentType }
     *     
     */
    public DNBSubjectRiskAssessmentType getDNBSubjectRiskAssessment() {
        return dnbSubjectRiskAssessment;
    }

    /**
     * Sets the value of the dnbSubjectRiskAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBSubjectRiskAssessmentType }
     *     
     */
    public void setDNBSubjectRiskAssessment(DNBSubjectRiskAssessmentType value) {
        this.dnbSubjectRiskAssessment = value;
    }

    /**
     * Gets the value of the dnbIndustryRiskAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link DNBIndustryRiskAssessmentType }
     *     
     */
    public DNBIndustryRiskAssessmentType getDNBIndustryRiskAssessment() {
        return dnbIndustryRiskAssessment;
    }

    /**
     * Sets the value of the dnbIndustryRiskAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBIndustryRiskAssessmentType }
     *     
     */
    public void setDNBIndustryRiskAssessment(DNBIndustryRiskAssessmentType value) {
        this.dnbIndustryRiskAssessment = value;
    }

}
