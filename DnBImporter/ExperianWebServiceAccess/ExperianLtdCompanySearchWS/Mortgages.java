
package ExperianLtdCompanySearchWS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mortgages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mortgages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumSatMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumUnsatMortgages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateMostRecentMort" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="RecMortDateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateMostRecentSat" type="{http://schema.uk.experian.com/experian/bi/generic/bsns/v100/basetypes}CCYYMMDD" minOccurs="0"/>
 *         &lt;element name="MortgageDetail" type="{http://schema.uk.experian.com/experian/bi/generic/business/limited/v100/basetypes}MortgageDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mortgages", propOrder = {
    "numMortgages",
    "numSatMortgages",
    "numUnsatMortgages",
    "dateMostRecentMort",
    "recMortDateFlag",
    "dateMostRecentSat",
    "mortgageDetail"
})
public class Mortgages {

    @XmlElement(name = "NumMortgages")
    protected Integer numMortgages;
    @XmlElement(name = "NumSatMortgages")
    protected Integer numSatMortgages;
    @XmlElement(name = "NumUnsatMortgages")
    protected Integer numUnsatMortgages;
    @XmlElement(name = "DateMostRecentMort")
    protected CCYYMMDD dateMostRecentMort;
    @XmlElement(name = "RecMortDateFlag")
    protected String recMortDateFlag;
    @XmlElement(name = "DateMostRecentSat")
    protected CCYYMMDD dateMostRecentSat;
    @XmlElement(name = "MortgageDetail")
    protected List<MortgageDetail> mortgageDetail;

    /**
     * Gets the value of the numMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumMortgages() {
        return numMortgages;
    }

    /**
     * Sets the value of the numMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumMortgages(Integer value) {
        this.numMortgages = value;
    }

    /**
     * Gets the value of the numSatMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSatMortgages() {
        return numSatMortgages;
    }

    /**
     * Sets the value of the numSatMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSatMortgages(Integer value) {
        this.numSatMortgages = value;
    }

    /**
     * Gets the value of the numUnsatMortgages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumUnsatMortgages() {
        return numUnsatMortgages;
    }

    /**
     * Sets the value of the numUnsatMortgages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumUnsatMortgages(Integer value) {
        this.numUnsatMortgages = value;
    }

    /**
     * Gets the value of the dateMostRecentMort property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateMostRecentMort() {
        return dateMostRecentMort;
    }

    /**
     * Sets the value of the dateMostRecentMort property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateMostRecentMort(CCYYMMDD value) {
        this.dateMostRecentMort = value;
    }

    /**
     * Gets the value of the recMortDateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecMortDateFlag() {
        return recMortDateFlag;
    }

    /**
     * Sets the value of the recMortDateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecMortDateFlag(String value) {
        this.recMortDateFlag = value;
    }

    /**
     * Gets the value of the dateMostRecentSat property.
     * 
     * @return
     *     possible object is
     *     {@link CCYYMMDD }
     *     
     */
    public CCYYMMDD getDateMostRecentSat() {
        return dateMostRecentSat;
    }

    /**
     * Sets the value of the dateMostRecentSat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCYYMMDD }
     *     
     */
    public void setDateMostRecentSat(CCYYMMDD value) {
        this.dateMostRecentSat = value;
    }

    /**
     * Gets the value of the mortgageDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mortgageDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMortgageDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MortgageDetail }
     * 
     * 
     */
    public List<MortgageDetail> getMortgageDetail() {
        if (mortgageDetail == null) {
            mortgageDetail = new ArrayList<MortgageDetail>();
        }
        return this.mortgageDetail;
    }

}
