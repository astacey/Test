
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOOKUPDUPLICATETOWNRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOOKUPDUPLICATETOWNRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADR_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBRI_UMTC_AGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_DT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOOKUPDUPLICATETOWNRS", propOrder = {
    "adrline",
    "brind",
    "ctrycd",
    "dsr",
    "dunsnbr",
    "sbriumtcagn",
    "indtind",
    "nme",
    "postcode",
    "posttown",
    "primgeoarea",
    "tlcmnbr"
})
public class LOOKUPDUPLICATETOWNRS {

    @XmlElementRef(name = "ADR_LINE", type = JAXBElement.class)
    protected JAXBElement<String> adrline;
    @XmlElementRef(name = "BR_IND", type = JAXBElement.class)
    protected JAXBElement<String> brind;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "DSR", type = JAXBElement.class)
    protected JAXBElement<String> dsr;
    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "SBRI_UMTC_AGN", type = JAXBElement.class)
    protected JAXBElement<String> sbriumtcagn;
    @XmlElementRef(name = "IN_DT_IND", type = JAXBElement.class)
    protected JAXBElement<String> indtind;
    @XmlElementRef(name = "NME", type = JAXBElement.class)
    protected JAXBElement<String> nme;
    @XmlElementRef(name = "POST_CODE", type = JAXBElement.class)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "POST_TOWN", type = JAXBElement.class)
    protected JAXBElement<String> posttown;
    @XmlElementRef(name = "PRIM_GEO_AREA", type = JAXBElement.class)
    protected JAXBElement<String> primgeoarea;
    @XmlElementRef(name = "TLCM_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tlcmnbr;

    /**
     * Gets the value of the adrline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADRLINE() {
        return adrline;
    }

    /**
     * Sets the value of the adrline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADRLINE(JAXBElement<String> value) {
        this.adrline = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the brind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBRIND() {
        return brind;
    }

    /**
     * Sets the value of the brind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBRIND(JAXBElement<String> value) {
        this.brind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCTRYCD() {
        return ctrycd;
    }

    /**
     * Sets the value of the ctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCTRYCD(JAXBElement<String> value) {
        this.ctrycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dsr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDSR() {
        return dsr;
    }

    /**
     * Sets the value of the dsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDSR(JAXBElement<String> value) {
        this.dsr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dunsnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNBR() {
        return dunsnbr;
    }

    /**
     * Sets the value of the dunsnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNBR(JAXBElement<String> value) {
        this.dunsnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sbriumtcagn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSBRIUMTCAGN() {
        return sbriumtcagn;
    }

    /**
     * Sets the value of the sbriumtcagn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSBRIUMTCAGN(JAXBElement<String> value) {
        this.sbriumtcagn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the indtind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINDTIND() {
        return indtind;
    }

    /**
     * Sets the value of the indtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINDTIND(JAXBElement<String> value) {
        this.indtind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNME() {
        return nme;
    }

    /**
     * Sets the value of the nme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNME(JAXBElement<String> value) {
        this.nme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSTCODE() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSTCODE(JAXBElement<String> value) {
        this.postcode = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the posttown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOSTTOWN() {
        return posttown;
    }

    /**
     * Sets the value of the posttown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOSTTOWN(JAXBElement<String> value) {
        this.posttown = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primgeoarea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMGEOAREA() {
        return primgeoarea;
    }

    /**
     * Sets the value of the primgeoarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMGEOAREA(JAXBElement<String> value) {
        this.primgeoarea = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tlcmnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTLCMNBR() {
        return tlcmnbr;
    }

    /**
     * Sets the value of the tlcmnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTLCMNBR(JAXBElement<String> value) {
        this.tlcmnbr = ((JAXBElement<String> ) value);
    }

}
