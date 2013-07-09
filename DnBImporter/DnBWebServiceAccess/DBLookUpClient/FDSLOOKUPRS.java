
package DBLookUpClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FDSLOOKUPRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FDSLOOKUPRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ALGM_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AGN_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADR_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCR_RSLT_INTERPRET" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}SCR_RSLT_INTERPRET" minOccurs="0"/>
 *         &lt;element name="SRCH_PFL_CHRT" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}SRCH_PFL_CHRT"/>
 *         &lt;element name="LAST_SRCHS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}LAST_SRCHS"/>
 *         &lt;element name="INFO_CONSISTENCY" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}INFO_CONSISTENCY"/>
 *         &lt;element name="FR_IND" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}FR_IND"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FDSLOOKUPRS", propOrder = {
    "algmid",
    "agnnbr",
    "nme",
    "adrline",
    "posttown",
    "primgeoarea",
    "tlcmnbr",
    "ctrycd",
    "postcode",
    "scrrsltinterpret",
    "srchpflchrt",
    "lastsrchs",
    "infoconsistency",
    "frind"
})
public class FDSLOOKUPRS {

    @XmlElementRef(name = "ALGM_ID", type = JAXBElement.class)
    protected JAXBElement<String> algmid;
    @XmlElementRef(name = "AGN_NBR", type = JAXBElement.class)
    protected JAXBElement<String> agnnbr;
    @XmlElementRef(name = "NME", type = JAXBElement.class)
    protected JAXBElement<String> nme;
    @XmlElementRef(name = "ADR_LINE", type = JAXBElement.class)
    protected JAXBElement<String> adrline;
    @XmlElementRef(name = "POST_TOWN", type = JAXBElement.class)
    protected JAXBElement<String> posttown;
    @XmlElementRef(name = "PRIM_GEO_AREA", type = JAXBElement.class)
    protected JAXBElement<String> primgeoarea;
    @XmlElementRef(name = "TLCM_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tlcmnbr;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "POST_CODE", type = JAXBElement.class)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "SCR_RSLT_INTERPRET", type = JAXBElement.class)
    protected JAXBElement<SCRRSLTINTERPRET> scrrsltinterpret;
    @XmlElement(name = "SRCH_PFL_CHRT", required = true, nillable = true)
    protected SRCHPFLCHRT srchpflchrt;
    @XmlElement(name = "LAST_SRCHS", required = true, nillable = true)
    protected LASTSRCHS lastsrchs;
    @XmlElement(name = "INFO_CONSISTENCY", required = true, nillable = true)
    protected INFOCONSISTENCY infoconsistency;
    @XmlElement(name = "FR_IND", required = true, nillable = true)
    protected FRIND frind;

    /**
     * Gets the value of the algmid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getALGMID() {
        return algmid;
    }

    /**
     * Sets the value of the algmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setALGMID(JAXBElement<String> value) {
        this.algmid = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the agnnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAGNNBR() {
        return agnnbr;
    }

    /**
     * Sets the value of the agnnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAGNNBR(JAXBElement<String> value) {
        this.agnnbr = ((JAXBElement<String> ) value);
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
     * Gets the value of the scrrsltinterpret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SCRRSLTINTERPRET }{@code >}
     *     
     */
    public JAXBElement<SCRRSLTINTERPRET> getSCRRSLTINTERPRET() {
        return scrrsltinterpret;
    }

    /**
     * Sets the value of the scrrsltinterpret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SCRRSLTINTERPRET }{@code >}
     *     
     */
    public void setSCRRSLTINTERPRET(JAXBElement<SCRRSLTINTERPRET> value) {
        this.scrrsltinterpret = ((JAXBElement<SCRRSLTINTERPRET> ) value);
    }

    /**
     * Gets the value of the srchpflchrt property.
     * 
     * @return
     *     possible object is
     *     {@link SRCHPFLCHRT }
     *     
     */
    public SRCHPFLCHRT getSRCHPFLCHRT() {
        return srchpflchrt;
    }

    /**
     * Sets the value of the srchpflchrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SRCHPFLCHRT }
     *     
     */
    public void setSRCHPFLCHRT(SRCHPFLCHRT value) {
        this.srchpflchrt = value;
    }

    /**
     * Gets the value of the lastsrchs property.
     * 
     * @return
     *     possible object is
     *     {@link LASTSRCHS }
     *     
     */
    public LASTSRCHS getLASTSRCHS() {
        return lastsrchs;
    }

    /**
     * Sets the value of the lastsrchs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LASTSRCHS }
     *     
     */
    public void setLASTSRCHS(LASTSRCHS value) {
        this.lastsrchs = value;
    }

    /**
     * Gets the value of the infoconsistency property.
     * 
     * @return
     *     possible object is
     *     {@link INFOCONSISTENCY }
     *     
     */
    public INFOCONSISTENCY getINFOCONSISTENCY() {
        return infoconsistency;
    }

    /**
     * Sets the value of the infoconsistency property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFOCONSISTENCY }
     *     
     */
    public void setINFOCONSISTENCY(INFOCONSISTENCY value) {
        this.infoconsistency = value;
    }

    /**
     * Gets the value of the frind property.
     * 
     * @return
     *     possible object is
     *     {@link FRIND }
     *     
     */
    public FRIND getFRIND() {
        return frind;
    }

    /**
     * Sets the value of the frind property.
     * 
     * @param value
     *     allowed object is
     *     {@link FRIND }
     *     
     */
    public void setFRIND(FRIND value) {
        this.frind = value;
    }

}
