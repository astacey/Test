
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RPT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ENQ_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PROD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRDG_STYL" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ADR_LINE" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCDY_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUS_REGN_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUS_REGN_NBR_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_SIC_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCL_ACTV_CD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCL_ACTV_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_EMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_EMPL_ESTD_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_EMPL_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRT_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURR_CNTL_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INCN_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCRD_FLNG_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLM_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUIT_JDGT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINL_EMBT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SRVRTID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCN_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CUST_ENDR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GBL_ULT_PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_PMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DCSN_INFO" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}DCSN_INFO" minOccurs="0"/>
 *         &lt;element name="DNB_RATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_SCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_NORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_3_MO_AGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIGH_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVG_HIGH_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAX_CR_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAX_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANN_SALE_VOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANN_SALE_ESTD_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANN_SALE_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANG_NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANG_NET_WRTH_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UBAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPRG_SPEC_EVNT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSTR_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGL_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRIM_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIST_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINL_LGL_EVNT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DELQ_SCR_ENTR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}DELQ_SCR_ENTR3" minOccurs="0"/>
 *         &lt;element name="FAIL_SCR_ENTR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}FAIL_SCR_ENTR3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPT", propOrder = {
    "enqduns",
    "prod",
    "dunsnbr",
    "primnme",
    "trdgstyl",
    "adrline",
    "posttown",
    "primgeoarea",
    "scdygeoarea",
    "postcode",
    "tlcmnbr",
    "busregnnbr",
    "busregnnbrtypecd",
    "ctrycd",
    "primsictypecd",
    "primsic",
    "lclactvcdtype",
    "lclactvcd",
    "totempl",
    "totemplestdind",
    "totempltext",
    "strtyr",
    "currcntlyr",
    "incnyr",
    "scrdflngind",
    "clmind",
    "suitjdgtind",
    "outbusind",
    "finlembtind",
    "srvrtid",
    "brind",
    "locnstat",
    "custendr",
    "ceonme",
    "gblultpntduns",
    "totpmt",
    "dcsninfo",
    "dnbratg",
    "paydscr",
    "paydnorm",
    "payd3MOAGO",
    "crcycd",
    "highcr",
    "avghighcr",
    "maxcrcrcycd",
    "maxcr",
    "annsalevol",
    "annsaleestdind",
    "annsalecrcycd",
    "tangnetwrth",
    "tangnetwrthcrcycd",
    "stmtdt",
    "stmtcrcycd",
    "sls",
    "netwrth",
    "ubalind",
    "oprgspecevntind",
    "dstrind",
    "lglform",
    "crimind",
    "histind",
    "finllglevntind",
    "delqscrentr",
    "failscrentr"
})
public class RPT {

    @XmlElementRef(name = "ENQ_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> enqduns;
    @XmlElementRef(name = "PROD", type = JAXBElement.class)
    protected JAXBElement<String> prod;
    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "PRIM_NME", type = JAXBElement.class)
    protected JAXBElement<String> primnme;
    @XmlElementRef(name = "TRDG_STYL", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> trdgstyl;
    @XmlElementRef(name = "ADR_LINE", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> adrline;
    @XmlElementRef(name = "POST_TOWN", type = JAXBElement.class)
    protected JAXBElement<String> posttown;
    @XmlElementRef(name = "PRIM_GEO_AREA", type = JAXBElement.class)
    protected JAXBElement<String> primgeoarea;
    @XmlElementRef(name = "SCDY_GEO_AREA", type = JAXBElement.class)
    protected JAXBElement<String> scdygeoarea;
    @XmlElementRef(name = "POST_CODE", type = JAXBElement.class)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "TLCM_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tlcmnbr;
    @XmlElementRef(name = "BUS_REGN_NBR", type = JAXBElement.class)
    protected JAXBElement<String> busregnnbr;
    @XmlElementRef(name = "BUS_REGN_NBR_TYPE_CD", type = JAXBElement.class)
    protected JAXBElement<String> busregnnbrtypecd;
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "PRIM_SIC_TYPE_CD", type = JAXBElement.class)
    protected JAXBElement<String> primsictypecd;
    @XmlElementRef(name = "PRIM_SIC", type = JAXBElement.class)
    protected JAXBElement<String> primsic;
    @XmlElementRef(name = "LCL_ACTV_CD_TYPE", type = JAXBElement.class)
    protected JAXBElement<String> lclactvcdtype;
    @XmlElementRef(name = "LCL_ACTV_CD", type = JAXBElement.class)
    protected JAXBElement<String> lclactvcd;
    @XmlElementRef(name = "TOT_EMPL", type = JAXBElement.class)
    protected JAXBElement<String> totempl;
    @XmlElementRef(name = "TOT_EMPL_ESTD_IND", type = JAXBElement.class)
    protected JAXBElement<String> totemplestdind;
    @XmlElementRef(name = "TOT_EMPL_TEXT", type = JAXBElement.class)
    protected JAXBElement<String> totempltext;
    @XmlElementRef(name = "STRT_YR", type = JAXBElement.class)
    protected JAXBElement<String> strtyr;
    @XmlElementRef(name = "CURR_CNTL_YR", type = JAXBElement.class)
    protected JAXBElement<String> currcntlyr;
    @XmlElementRef(name = "INCN_YR", type = JAXBElement.class)
    protected JAXBElement<String> incnyr;
    @XmlElementRef(name = "SCRD_FLNG_IND", type = JAXBElement.class)
    protected JAXBElement<String> scrdflngind;
    @XmlElementRef(name = "CLM_IND", type = JAXBElement.class)
    protected JAXBElement<String> clmind;
    @XmlElementRef(name = "SUIT_JDGT_IND", type = JAXBElement.class)
    protected JAXBElement<String> suitjdgtind;
    @XmlElementRef(name = "OUT_BUS_IND", type = JAXBElement.class)
    protected JAXBElement<String> outbusind;
    @XmlElementRef(name = "FINL_EMBT_IND", type = JAXBElement.class)
    protected JAXBElement<String> finlembtind;
    @XmlElementRef(name = "SRVRTID", type = JAXBElement.class)
    protected JAXBElement<String> srvrtid;
    @XmlElementRef(name = "BR_IND", type = JAXBElement.class)
    protected JAXBElement<String> brind;
    @XmlElementRef(name = "LOCN_STAT", type = JAXBElement.class)
    protected JAXBElement<String> locnstat;
    @XmlElementRef(name = "CUST_ENDR", type = JAXBElement.class)
    protected JAXBElement<String> custendr;
    @XmlElementRef(name = "CEO_NME", type = JAXBElement.class)
    protected JAXBElement<String> ceonme;
    @XmlElementRef(name = "GBL_ULT_PNT_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> gblultpntduns;
    @XmlElementRef(name = "TOT_PMT", type = JAXBElement.class)
    protected JAXBElement<String> totpmt;
    @XmlElementRef(name = "DCSN_INFO", type = JAXBElement.class)
    protected JAXBElement<DCSNINFO> dcsninfo;
    @XmlElementRef(name = "DNB_RATG", type = JAXBElement.class)
    protected JAXBElement<String> dnbratg;
    @XmlElementRef(name = "PAYD_SCR", type = JAXBElement.class)
    protected JAXBElement<String> paydscr;
    @XmlElementRef(name = "PAYD_NORM", type = JAXBElement.class)
    protected JAXBElement<String> paydnorm;
    @XmlElementRef(name = "PAYD_3_MO_AGO", type = JAXBElement.class)
    protected JAXBElement<String> payd3MOAGO;
    @XmlElementRef(name = "CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> crcycd;
    @XmlElementRef(name = "HIGH_CR", type = JAXBElement.class)
    protected JAXBElement<String> highcr;
    @XmlElementRef(name = "AVG_HIGH_CR", type = JAXBElement.class)
    protected JAXBElement<String> avghighcr;
    @XmlElementRef(name = "MAX_CR_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> maxcrcrcycd;
    @XmlElementRef(name = "MAX_CR", type = JAXBElement.class)
    protected JAXBElement<String> maxcr;
    @XmlElementRef(name = "ANN_SALE_VOL", type = JAXBElement.class)
    protected JAXBElement<String> annsalevol;
    @XmlElementRef(name = "ANN_SALE_ESTD_IND", type = JAXBElement.class)
    protected JAXBElement<String> annsaleestdind;
    @XmlElementRef(name = "ANN_SALE_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> annsalecrcycd;
    @XmlElementRef(name = "TANG_NET_WRTH", type = JAXBElement.class)
    protected JAXBElement<String> tangnetwrth;
    @XmlElementRef(name = "TANG_NET_WRTH_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> tangnetwrthcrcycd;
    @XmlElementRef(name = "STMT_DT", type = JAXBElement.class)
    protected JAXBElement<String> stmtdt;
    @XmlElementRef(name = "STMT_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> stmtcrcycd;
    @XmlElementRef(name = "SLS", type = JAXBElement.class)
    protected JAXBElement<String> sls;
    @XmlElementRef(name = "NET_WRTH", type = JAXBElement.class)
    protected JAXBElement<String> netwrth;
    @XmlElementRef(name = "UBAL_IND", type = JAXBElement.class)
    protected JAXBElement<String> ubalind;
    @XmlElementRef(name = "OPRG_SPEC_EVNT_IND", type = JAXBElement.class)
    protected JAXBElement<String> oprgspecevntind;
    @XmlElementRef(name = "DSTR_IND", type = JAXBElement.class)
    protected JAXBElement<String> dstrind;
    @XmlElementRef(name = "LGL_FORM", type = JAXBElement.class)
    protected JAXBElement<String> lglform;
    @XmlElementRef(name = "CRIM_IND", type = JAXBElement.class)
    protected JAXBElement<String> crimind;
    @XmlElementRef(name = "HIST_IND", type = JAXBElement.class)
    protected JAXBElement<String> histind;
    @XmlElementRef(name = "FINL_LGL_EVNT_IND", type = JAXBElement.class)
    protected JAXBElement<String> finllglevntind;
    @XmlElementRef(name = "DELQ_SCR_ENTR", type = JAXBElement.class)
    protected JAXBElement<DELQSCRENTR3> delqscrentr;
    @XmlElementRef(name = "FAIL_SCR_ENTR", type = JAXBElement.class)
    protected JAXBElement<FAILSCRENTR3> failscrentr;

    /**
     * Gets the value of the enqduns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getENQDUNS() {
        return enqduns;
    }

    /**
     * Sets the value of the enqduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setENQDUNS(JAXBElement<String> value) {
        this.enqduns = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the prod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROD() {
        return prod;
    }

    /**
     * Sets the value of the prod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROD(JAXBElement<String> value) {
        this.prod = ((JAXBElement<String> ) value);
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
     * Gets the value of the primnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMNME() {
        return primnme;
    }

    /**
     * Sets the value of the primnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMNME(JAXBElement<String> value) {
        this.primnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trdgstyl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getTRDGSTYL() {
        return trdgstyl;
    }

    /**
     * Sets the value of the trdgstyl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setTRDGSTYL(JAXBElement<ArrayOfstring> value) {
        this.trdgstyl = ((JAXBElement<ArrayOfstring> ) value);
    }

    /**
     * Gets the value of the adrline property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getADRLINE() {
        return adrline;
    }

    /**
     * Sets the value of the adrline property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setADRLINE(JAXBElement<ArrayOfstring> value) {
        this.adrline = ((JAXBElement<ArrayOfstring> ) value);
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
     * Gets the value of the scdygeoarea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCDYGEOAREA() {
        return scdygeoarea;
    }

    /**
     * Sets the value of the scdygeoarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCDYGEOAREA(JAXBElement<String> value) {
        this.scdygeoarea = ((JAXBElement<String> ) value);
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
     * Gets the value of the busregnnbr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSREGNNBR() {
        return busregnnbr;
    }

    /**
     * Sets the value of the busregnnbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSREGNNBR(JAXBElement<String> value) {
        this.busregnnbr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the busregnnbrtypecd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSREGNNBRTYPECD() {
        return busregnnbrtypecd;
    }

    /**
     * Sets the value of the busregnnbrtypecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSREGNNBRTYPECD(JAXBElement<String> value) {
        this.busregnnbrtypecd = ((JAXBElement<String> ) value);
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
     * Gets the value of the primsictypecd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMSICTYPECD() {
        return primsictypecd;
    }

    /**
     * Sets the value of the primsictypecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMSICTYPECD(JAXBElement<String> value) {
        this.primsictypecd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the primsic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRIMSIC() {
        return primsic;
    }

    /**
     * Sets the value of the primsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRIMSIC(JAXBElement<String> value) {
        this.primsic = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lclactvcdtype property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLCLACTVCDTYPE() {
        return lclactvcdtype;
    }

    /**
     * Sets the value of the lclactvcdtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLCLACTVCDTYPE(JAXBElement<String> value) {
        this.lclactvcdtype = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lclactvcd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLCLACTVCD() {
        return lclactvcd;
    }

    /**
     * Sets the value of the lclactvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLCLACTVCD(JAXBElement<String> value) {
        this.lclactvcd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totempl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTEMPL() {
        return totempl;
    }

    /**
     * Sets the value of the totempl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTEMPL(JAXBElement<String> value) {
        this.totempl = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totemplestdind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTEMPLESTDIND() {
        return totemplestdind;
    }

    /**
     * Sets the value of the totemplestdind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTEMPLESTDIND(JAXBElement<String> value) {
        this.totemplestdind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totempltext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTEMPLTEXT() {
        return totempltext;
    }

    /**
     * Sets the value of the totempltext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTEMPLTEXT(JAXBElement<String> value) {
        this.totempltext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the strtyr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTRTYR() {
        return strtyr;
    }

    /**
     * Sets the value of the strtyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTRTYR(JAXBElement<String> value) {
        this.strtyr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the currcntlyr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCURRCNTLYR() {
        return currcntlyr;
    }

    /**
     * Sets the value of the currcntlyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCURRCNTLYR(JAXBElement<String> value) {
        this.currcntlyr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the incnyr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getINCNYR() {
        return incnyr;
    }

    /**
     * Sets the value of the incnyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setINCNYR(JAXBElement<String> value) {
        this.incnyr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the scrdflngind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSCRDFLNGIND() {
        return scrdflngind;
    }

    /**
     * Sets the value of the scrdflngind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSCRDFLNGIND(JAXBElement<String> value) {
        this.scrdflngind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the clmind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCLMIND() {
        return clmind;
    }

    /**
     * Sets the value of the clmind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCLMIND(JAXBElement<String> value) {
        this.clmind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the suitjdgtind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUITJDGTIND() {
        return suitjdgtind;
    }

    /**
     * Sets the value of the suitjdgtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUITJDGTIND(JAXBElement<String> value) {
        this.suitjdgtind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the outbusind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOUTBUSIND() {
        return outbusind;
    }

    /**
     * Sets the value of the outbusind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOUTBUSIND(JAXBElement<String> value) {
        this.outbusind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finlembtind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFINLEMBTIND() {
        return finlembtind;
    }

    /**
     * Sets the value of the finlembtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFINLEMBTIND(JAXBElement<String> value) {
        this.finlembtind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSRVRTID(JAXBElement<String> value) {
        this.srvrtid = ((JAXBElement<String> ) value);
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
     * Gets the value of the locnstat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLOCNSTAT() {
        return locnstat;
    }

    /**
     * Sets the value of the locnstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLOCNSTAT(JAXBElement<String> value) {
        this.locnstat = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the custendr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCUSTENDR() {
        return custendr;
    }

    /**
     * Sets the value of the custendr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCUSTENDR(JAXBElement<String> value) {
        this.custendr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ceonme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCEONME() {
        return ceonme;
    }

    /**
     * Sets the value of the ceonme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCEONME(JAXBElement<String> value) {
        this.ceonme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gblultpntduns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGBLULTPNTDUNS() {
        return gblultpntduns;
    }

    /**
     * Sets the value of the gblultpntduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGBLULTPNTDUNS(JAXBElement<String> value) {
        this.gblultpntduns = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totpmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTPMT() {
        return totpmt;
    }

    /**
     * Sets the value of the totpmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTPMT(JAXBElement<String> value) {
        this.totpmt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dcsninfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DCSNINFO }{@code >}
     *     
     */
    public JAXBElement<DCSNINFO> getDCSNINFO() {
        return dcsninfo;
    }

    /**
     * Sets the value of the dcsninfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DCSNINFO }{@code >}
     *     
     */
    public void setDCSNINFO(JAXBElement<DCSNINFO> value) {
        this.dcsninfo = ((JAXBElement<DCSNINFO> ) value);
    }

    /**
     * Gets the value of the dnbratg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDNBRATG() {
        return dnbratg;
    }

    /**
     * Sets the value of the dnbratg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDNBRATG(JAXBElement<String> value) {
        this.dnbratg = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydscr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYDSCR() {
        return paydscr;
    }

    /**
     * Sets the value of the paydscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYDSCR(JAXBElement<String> value) {
        this.paydscr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paydnorm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYDNORM() {
        return paydnorm;
    }

    /**
     * Sets the value of the paydnorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYDNORM(JAXBElement<String> value) {
        this.paydnorm = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the payd3MOAGO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAYD3MOAGO() {
        return payd3MOAGO;
    }

    /**
     * Sets the value of the payd3MOAGO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAYD3MOAGO(JAXBElement<String> value) {
        this.payd3MOAGO = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crcycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRCYCD() {
        return crcycd;
    }

    /**
     * Sets the value of the crcycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRCYCD(JAXBElement<String> value) {
        this.crcycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the highcr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHIGHCR() {
        return highcr;
    }

    /**
     * Sets the value of the highcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHIGHCR(JAXBElement<String> value) {
        this.highcr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the avghighcr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAVGHIGHCR() {
        return avghighcr;
    }

    /**
     * Sets the value of the avghighcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAVGHIGHCR(JAXBElement<String> value) {
        this.avghighcr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maxcrcrcycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAXCRCRCYCD() {
        return maxcrcrcycd;
    }

    /**
     * Sets the value of the maxcrcrcycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAXCRCRCYCD(JAXBElement<String> value) {
        this.maxcrcrcycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the maxcr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMAXCR() {
        return maxcr;
    }

    /**
     * Sets the value of the maxcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMAXCR(JAXBElement<String> value) {
        this.maxcr = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the annsalevol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getANNSALEVOL() {
        return annsalevol;
    }

    /**
     * Sets the value of the annsalevol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setANNSALEVOL(JAXBElement<String> value) {
        this.annsalevol = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the annsaleestdind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getANNSALEESTDIND() {
        return annsaleestdind;
    }

    /**
     * Sets the value of the annsaleestdind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setANNSALEESTDIND(JAXBElement<String> value) {
        this.annsaleestdind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the annsalecrcycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getANNSALECRCYCD() {
        return annsalecrcycd;
    }

    /**
     * Sets the value of the annsalecrcycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setANNSALECRCYCD(JAXBElement<String> value) {
        this.annsalecrcycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tangnetwrth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTANGNETWRTH() {
        return tangnetwrth;
    }

    /**
     * Sets the value of the tangnetwrth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTANGNETWRTH(JAXBElement<String> value) {
        this.tangnetwrth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tangnetwrthcrcycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTANGNETWRTHCRCYCD() {
        return tangnetwrthcrcycd;
    }

    /**
     * Sets the value of the tangnetwrthcrcycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTANGNETWRTHCRCYCD(JAXBElement<String> value) {
        this.tangnetwrthcrcycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stmtdt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTMTDT() {
        return stmtdt;
    }

    /**
     * Sets the value of the stmtdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTMTDT(JAXBElement<String> value) {
        this.stmtdt = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stmtcrcycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTMTCRCYCD() {
        return stmtcrcycd;
    }

    /**
     * Sets the value of the stmtcrcycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTMTCRCYCD(JAXBElement<String> value) {
        this.stmtcrcycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSLS() {
        return sls;
    }

    /**
     * Sets the value of the sls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSLS(JAXBElement<String> value) {
        this.sls = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the netwrth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNETWRTH() {
        return netwrth;
    }

    /**
     * Sets the value of the netwrth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNETWRTH(JAXBElement<String> value) {
        this.netwrth = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ubalind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUBALIND() {
        return ubalind;
    }

    /**
     * Sets the value of the ubalind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUBALIND(JAXBElement<String> value) {
        this.ubalind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the oprgspecevntind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOPRGSPECEVNTIND() {
        return oprgspecevntind;
    }

    /**
     * Sets the value of the oprgspecevntind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOPRGSPECEVNTIND(JAXBElement<String> value) {
        this.oprgspecevntind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dstrind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDSTRIND() {
        return dstrind;
    }

    /**
     * Sets the value of the dstrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDSTRIND(JAXBElement<String> value) {
        this.dstrind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the lglform property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLGLFORM() {
        return lglform;
    }

    /**
     * Sets the value of the lglform property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLGLFORM(JAXBElement<String> value) {
        this.lglform = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the crimind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCRIMIND() {
        return crimind;
    }

    /**
     * Sets the value of the crimind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCRIMIND(JAXBElement<String> value) {
        this.crimind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the histind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHISTIND() {
        return histind;
    }

    /**
     * Sets the value of the histind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHISTIND(JAXBElement<String> value) {
        this.histind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the finllglevntind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFINLLGLEVNTIND() {
        return finllglevntind;
    }

    /**
     * Sets the value of the finllglevntind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFINLLGLEVNTIND(JAXBElement<String> value) {
        this.finllglevntind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the delqscrentr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DELQSCRENTR3 }{@code >}
     *     
     */
    public JAXBElement<DELQSCRENTR3> getDELQSCRENTR() {
        return delqscrentr;
    }

    /**
     * Sets the value of the delqscrentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DELQSCRENTR3 }{@code >}
     *     
     */
    public void setDELQSCRENTR(JAXBElement<DELQSCRENTR3> value) {
        this.delqscrentr = ((JAXBElement<DELQSCRENTR3> ) value);
    }

    /**
     * Gets the value of the failscrentr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FAILSCRENTR3 }{@code >}
     *     
     */
    public JAXBElement<FAILSCRENTR3> getFAILSCRENTR() {
        return failscrentr;
    }

    /**
     * Sets the value of the failscrentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FAILSCRENTR3 }{@code >}
     *     
     */
    public void setFAILSCRENTR(JAXBElement<FAILSCRENTR3> value) {
        this.failscrentr = ((JAXBElement<FAILSCRENTR3> ) value);
    }

}
