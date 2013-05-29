
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LOOKUPRSCOMPANY complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOOKUPRSCOMPANY">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ADR_LINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONF_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IN_DT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTCH_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NME_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NON_POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NON_POST_TWN_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PO_BOX_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA_NBR_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROB_OF_ACCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STR_NBR_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STR_NME_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SBRI_UMTC_AGN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_PCT_GRD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRDG_STYL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MTCH_BASS" type="{http://www.dnb.com/DNB_WebServices/Providers/LookUp}MTCH_BASS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOOKUPRSCOMPANY", propOrder = {
    "adrline",
    "brind",
    "confcd",
    "ctrycd",
    "dsr",
    "dunsnbr",
    "indtind",
    "mtchgrd",
    "nme",
    "nmepctgrd",
    "nonposttown",
    "nonposttwnpctgrd",
    "primgeoarea",
    "postcode",
    "posttown",
    "poboxpctgrd",
    "primgeoareanbrpctgrd",
    "probofaccr",
    "strnbrpctgrd",
    "strnmepctgrd",
    "sbriumtcagn",
    "tlcmnbr",
    "tlcmpctgrd",
    "trdgstyl",
    "mtchbass"
})
public class LOOKUPRSCOMPANY {

    @XmlElementRef(name = "ADR_LINE", type = JAXBElement.class)
    protected JAXBElement<String> adrline;
    @XmlElementRef(name = "BR_IND", type = JAXBElement.class)
    protected JAXBElement<String> brind;
    @XmlElementRef(name = "CONF_CD", type = JAXBElement.class)
    protected JAXBElement<String> confcd;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "DSR", type = JAXBElement.class)
    protected JAXBElement<String> dsr;
    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "IN_DT_IND", type = JAXBElement.class)
    protected JAXBElement<String> indtind;
    @XmlElementRef(name = "MTCH_GRD", type = JAXBElement.class)
    protected JAXBElement<String> mtchgrd;
    @XmlElementRef(name = "NME", type = JAXBElement.class)
    protected JAXBElement<String> nme;
    @XmlElementRef(name = "NME_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> nmepctgrd;
    @XmlElementRef(name = "NON_POST_TOWN", type = JAXBElement.class)
    protected JAXBElement<String> nonposttown;
    @XmlElementRef(name = "NON_POST_TWN_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> nonposttwnpctgrd;
    @XmlElementRef(name = "PRIM_GEO_AREA", type = JAXBElement.class)
    protected JAXBElement<String> primgeoarea;
    @XmlElementRef(name = "POST_CODE", type = JAXBElement.class)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "POST_TOWN", type = JAXBElement.class)
    protected JAXBElement<String> posttown;
    @XmlElementRef(name = "PO_BOX_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> poboxpctgrd;
    @XmlElementRef(name = "PRIM_GEO_AREA_NBR_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> primgeoareanbrpctgrd;
    @XmlElementRef(name = "PROB_OF_ACCR", type = JAXBElement.class)
    protected JAXBElement<String> probofaccr;
    @XmlElementRef(name = "STR_NBR_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> strnbrpctgrd;
    @XmlElementRef(name = "STR_NME_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> strnmepctgrd;
    @XmlElementRef(name = "SBRI_UMTC_AGN", type = JAXBElement.class)
    protected JAXBElement<String> sbriumtcagn;
    @XmlElementRef(name = "TLCM_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tlcmnbr;
    @XmlElementRef(name = "TLCM_PCT_GRD", type = JAXBElement.class)
    protected JAXBElement<String> tlcmpctgrd;
    @XmlElementRef(name = "TRDG_STYL", type = JAXBElement.class)
    protected JAXBElement<String> trdgstyl;
    @XmlElementRef(name = "MTCH_BASS", type = JAXBElement.class)
    protected JAXBElement<MTCHBASS> mtchbass;

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
     * Gets the value of the confcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONFCD() {
        return confcd;
    }

    /**
     * Sets the value of the confcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONFCD(JAXBElement<String> value) {
        this.confcd = ((JAXBElement<String> ) value);
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
     * Gets the value of the mtchgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMTCHGRD() {
        return mtchgrd;
    }

    /**
     * Sets the value of the mtchgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMTCHGRD(JAXBElement<String> value) {
        this.mtchgrd = ((JAXBElement<String> ) value);
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
     * Gets the value of the nmepctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNMEPCTGRD() {
        return nmepctgrd;
    }

    /**
     * Sets the value of the nmepctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNMEPCTGRD(JAXBElement<String> value) {
        this.nmepctgrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nonposttown property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNONPOSTTOWN() {
        return nonposttown;
    }

    /**
     * Sets the value of the nonposttown property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNONPOSTTOWN(JAXBElement<String> value) {
        this.nonposttown = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nonposttwnpctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNONPOSTTWNPCTGRD() {
        return nonposttwnpctgrd;
    }

    /**
     * Sets the value of the nonposttwnpctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNONPOSTTWNPCTGRD(JAXBElement<String> value) {
        this.nonposttwnpctgrd = ((JAXBElement<String> ) value);
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
     * Gets the value of the poboxpctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOBOXPCTGRD() {
        return poboxpctgrd;
    }

    /**
     * Sets the value of the poboxpctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOBOXPCTGRD(JAXBElement<String> value) {
        this.poboxpctgrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primgeoareanbrpctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMGEOAREANBRPCTGRD() {
        return primgeoareanbrpctgrd;
    }

    /**
     * Sets the value of the primgeoareanbrpctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMGEOAREANBRPCTGRD(JAXBElement<String> value) {
        this.primgeoareanbrpctgrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the probofaccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROBOFACCR() {
        return probofaccr;
    }

    /**
     * Sets the value of the probofaccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROBOFACCR(JAXBElement<String> value) {
        this.probofaccr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the strnbrpctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTRNBRPCTGRD() {
        return strnbrpctgrd;
    }

    /**
     * Sets the value of the strnbrpctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTRNBRPCTGRD(JAXBElement<String> value) {
        this.strnbrpctgrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the strnmepctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTRNMEPCTGRD() {
        return strnmepctgrd;
    }

    /**
     * Sets the value of the strnmepctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTRNMEPCTGRD(JAXBElement<String> value) {
        this.strnmepctgrd = ((JAXBElement<String> ) value);
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
     * Gets the value of the tlcmpctgrd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTLCMPCTGRD() {
        return tlcmpctgrd;
    }

    /**
     * Sets the value of the tlcmpctgrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTLCMPCTGRD(JAXBElement<String> value) {
        this.tlcmpctgrd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trdgstyl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRDGSTYL() {
        return trdgstyl;
    }

    /**
     * Sets the value of the trdgstyl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRDGSTYL(JAXBElement<String> value) {
        this.trdgstyl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mtchbass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MTCHBASS }{@code >}
     *     
     */
    public JAXBElement<MTCHBASS> getMTCHBASS() {
        return mtchbass;
    }

    /**
     * Sets the value of the mtchbass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MTCHBASS }{@code >}
     *     
     */
    public void setMTCHBASS(JAXBElement<MTCHBASS> value) {
        this.mtchbass = ((JAXBElement<MTCHBASS> ) value);
    }

}
