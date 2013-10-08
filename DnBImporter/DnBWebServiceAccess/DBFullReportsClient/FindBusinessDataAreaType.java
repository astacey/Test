
package DBFullReportsClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindBusinessDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindBusinessDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerInformation" type="{http://gateway.dnb.com/getProduct}CustomerInformationType"/>
 *         &lt;element name="SubjectInformation" type="{http://gateway.dnb.com/getProduct}SubjectInformationAdvancedType"/>
 *         &lt;element name="MatchSearch" type="{http://gateway.dnb.com/getProduct}MatchSearchRequestType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindBusinessDataAreaType", propOrder = {
    "customerInformation",
    "subjectInformation",
    "matchSearch"
})
public class FindBusinessDataAreaType {

    @XmlElement(name = "CustomerInformation", required = true)
    protected CustomerInformationType customerInformation;
    @XmlElement(name = "SubjectInformation", required = true)
    protected SubjectInformationAdvancedType subjectInformation;
    @XmlElement(name = "MatchSearch", required = true)
    protected MatchSearchRequestType matchSearch;

    /**
     * Gets the value of the customerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInformationType }
     *     
     */
    public CustomerInformationType getCustomerInformation() {
        return customerInformation;
    }

    /**
     * Sets the value of the customerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInformationType }
     *     
     */
    public void setCustomerInformation(CustomerInformationType value) {
        this.customerInformation = value;
    }

    /**
     * Gets the value of the subjectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectInformationAdvancedType }
     *     
     */
    public SubjectInformationAdvancedType getSubjectInformation() {
        return subjectInformation;
    }

    /**
     * Sets the value of the subjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectInformationAdvancedType }
     *     
     */
    public void setSubjectInformation(SubjectInformationAdvancedType value) {
        this.subjectInformation = value;
    }

    /**
     * Gets the value of the matchSearch property.
     * 
     * @return
     *     possible object is
     *     {@link MatchSearchRequestType }
     *     
     */
    public MatchSearchRequestType getMatchSearch() {
        return matchSearch;
    }

    /**
     * Sets the value of the matchSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchSearchRequestType }
     *     
     */
    public void setMatchSearch(MatchSearchRequestType value) {
        this.matchSearch = value;
    }

}
