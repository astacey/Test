
package ExperianBusinessTargetWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchCorporates" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="ExcludeDissolved" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *         &lt;element name="SearchNonCorps" type="{http://schema.uk.experian.com/experian/bi/generic/smpl/v100/basetypes}YesNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria", propOrder = {
    "searchCorporates",
    "excludeDissolved",
    "searchNonCorps"
})
public class SearchCriteria {

    @XmlElement(name = "SearchCorporates", required = true)
    protected YesNo searchCorporates;
    @XmlElement(name = "ExcludeDissolved", required = true)
    protected YesNo excludeDissolved;
    @XmlElement(name = "SearchNonCorps", required = true)
    protected YesNo searchNonCorps;

    /**
     * Gets the value of the searchCorporates property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSearchCorporates() {
        return searchCorporates;
    }

    /**
     * Sets the value of the searchCorporates property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSearchCorporates(YesNo value) {
        this.searchCorporates = value;
    }

    /**
     * Gets the value of the excludeDissolved property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getExcludeDissolved() {
        return excludeDissolved;
    }

    /**
     * Sets the value of the excludeDissolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setExcludeDissolved(YesNo value) {
        this.excludeDissolved = value;
    }

    /**
     * Gets the value of the searchNonCorps property.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSearchNonCorps() {
        return searchNonCorps;
    }

    /**
     * Sets the value of the searchNonCorps property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSearchNonCorps(YesNo value) {
        this.searchNonCorps = value;
    }

}
