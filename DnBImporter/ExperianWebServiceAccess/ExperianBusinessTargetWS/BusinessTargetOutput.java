
package ExperianBusinessTargetWS;

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
 * <p>Java class for BusinessTargetOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessTargetOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalityResolution" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}LocalityResolution" minOccurs="0"/>
 *         &lt;element name="SearchSummary" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SearchSummary" minOccurs="0"/>
 *         &lt;element name="SearchResults" type="{http://schema.uk.experian.com/experian/bi/generic/business/bsns/v100/basetypes}SearchResults" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BusinessTargetOutput", namespace = "http://schema.uk.experian.com/experian/bi/businesstargeter/intr/v100/businesstargeter", propOrder = {
    "localityResolution",
    "searchSummary",
    "searchResults",
    "error"
})
public class BusinessTargetOutput {

    @XmlElement(name = "LocalityResolution")
    protected LocalityResolution localityResolution;
    @XmlElement(name = "SearchSummary")
    protected SearchSummary searchSummary;
    @XmlElement(name = "SearchResults")
    protected List<SearchResults> searchResults;
    @XmlElement(name = "Error")
    protected Error error;
    @XmlAttribute(name = "GeneratedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedOn;

    /**
     * Gets the value of the localityResolution property.
     * 
     * @return
     *     possible object is
     *     {@link LocalityResolution }
     *     
     */
    public LocalityResolution getLocalityResolution() {
        return localityResolution;
    }

    /**
     * Sets the value of the localityResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalityResolution }
     *     
     */
    public void setLocalityResolution(LocalityResolution value) {
        this.localityResolution = value;
    }

    /**
     * Gets the value of the searchSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSummary }
     *     
     */
    public SearchSummary getSearchSummary() {
        return searchSummary;
    }

    /**
     * Sets the value of the searchSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSummary }
     *     
     */
    public void setSearchSummary(SearchSummary value) {
        this.searchSummary = value;
    }

    /**
     * Gets the value of the searchResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchResults }
     * 
     * 
     */
    public List<SearchResults> getSearchResults() {
        if (searchResults == null) {
            searchResults = new ArrayList<SearchResults>();
        }
        return this.searchResults;
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
