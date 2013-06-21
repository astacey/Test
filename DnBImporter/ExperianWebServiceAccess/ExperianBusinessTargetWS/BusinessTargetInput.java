
package ExperianBusinessTargetWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessTargetInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessTargetInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchType" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SearchCriteria"/>
 *         &lt;element name="BusinessDetails" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}BusinessDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessTargetInput", namespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", propOrder = {
    "searchType",
    "businessDetails"
})
public class BusinessTargetInput {

    @XmlElement(name = "SearchType", required = true)
    protected SearchCriteria searchType;
    @XmlElement(name = "BusinessDetails", required = true)
    protected BusinessDetails businessDetails;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *     
     */
    public SearchCriteria getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchType(SearchCriteria value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the businessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDetails }
     *     
     */
    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    /**
     * Sets the value of the businessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDetails }
     *     
     */
    public void setBusinessDetails(BusinessDetails value) {
        this.businessDetails = value;
    }

}
