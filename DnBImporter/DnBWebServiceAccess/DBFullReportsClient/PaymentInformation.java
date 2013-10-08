
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
 *         &lt;element name="SubjectPaymentInformation" type="{http://gateway.dnb.com/getProduct}SubjectPaymentInformationType" minOccurs="0"/>
 *         &lt;element name="IndustryPaymentInformation" type="{http://gateway.dnb.com/getProduct}IndustryPaymentInformationType" minOccurs="0"/>
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
    "subjectPaymentInformation",
    "industryPaymentInformation"
})
@XmlRootElement(name = "PaymentInformation")
public class PaymentInformation {

    @XmlElement(name = "SubjectPaymentInformation")
    protected SubjectPaymentInformationType subjectPaymentInformation;
    @XmlElement(name = "IndustryPaymentInformation")
    protected IndustryPaymentInformationType industryPaymentInformation;

    /**
     * Gets the value of the subjectPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectPaymentInformationType }
     *     
     */
    public SubjectPaymentInformationType getSubjectPaymentInformation() {
        return subjectPaymentInformation;
    }

    /**
     * Sets the value of the subjectPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectPaymentInformationType }
     *     
     */
    public void setSubjectPaymentInformation(SubjectPaymentInformationType value) {
        this.subjectPaymentInformation = value;
    }

    /**
     * Gets the value of the industryPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryPaymentInformationType }
     *     
     */
    public IndustryPaymentInformationType getIndustryPaymentInformation() {
        return industryPaymentInformation;
    }

    /**
     * Sets the value of the industryPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryPaymentInformationType }
     *     
     */
    public void setIndustryPaymentInformation(IndustryPaymentInformationType value) {
        this.industryPaymentInformation = value;
    }

}
