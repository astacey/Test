
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrevSearches complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrevSearches">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPrevSearch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch3Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch6Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumPrevSearch12Mth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PreviousSearchDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}PreviousSearchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrevSearches", propOrder = {
    "numPrevSearch",
    "numPrevSearch3Mth",
    "numPrevSearch6Mth",
    "numPrevSearch12Mth",
    "previousSearchDetail"
})
public class PrevSearches {

    @XmlElement(name = "NumPrevSearch")
    protected Integer numPrevSearch;
    @XmlElement(name = "NumPrevSearch3Mth")
    protected Integer numPrevSearch3Mth;
    @XmlElement(name = "NumPrevSearch6Mth")
    protected Integer numPrevSearch6Mth;
    @XmlElement(name = "NumPrevSearch12Mth")
    protected Integer numPrevSearch12Mth;
    @XmlElement(name = "PreviousSearchDetail")
    protected List<PreviousSearchDetail> previousSearchDetail;

    /**
     * Gets the value of the numPrevSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch() {
        return numPrevSearch;
    }

    /**
     * Sets the value of the numPrevSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch(Integer value) {
        this.numPrevSearch = value;
    }

    /**
     * Gets the value of the numPrevSearch3Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch3Mth() {
        return numPrevSearch3Mth;
    }

    /**
     * Sets the value of the numPrevSearch3Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch3Mth(Integer value) {
        this.numPrevSearch3Mth = value;
    }

    /**
     * Gets the value of the numPrevSearch6Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch6Mth() {
        return numPrevSearch6Mth;
    }

    /**
     * Sets the value of the numPrevSearch6Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch6Mth(Integer value) {
        this.numPrevSearch6Mth = value;
    }

    /**
     * Gets the value of the numPrevSearch12Mth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPrevSearch12Mth() {
        return numPrevSearch12Mth;
    }

    /**
     * Sets the value of the numPrevSearch12Mth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPrevSearch12Mth(Integer value) {
        this.numPrevSearch12Mth = value;
    }

    /**
     * Gets the value of the previousSearchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the previousSearchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousSearchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousSearchDetail }
     * 
     * 
     */
    public List<PreviousSearchDetail> getPreviousSearchDetail() {
        if (previousSearchDetail == null) {
            previousSearchDetail = new ArrayList<PreviousSearchDetail>();
        }
        return this.previousSearchDetail;
    }

}
