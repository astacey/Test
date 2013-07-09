
package DBGDPV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eRAM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eRAM">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNS_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADR_LINE" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="POST_TOWN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SCDY_GEO_AREA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="POST_CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TLCM_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURR_CNTL_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_EMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_SIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LOCN_STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQ_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQ_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HQ_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LGL_FORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ADR_TENR_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CEO_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_SCR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_3_MO_AGO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAYD_NORM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVG_HIGH_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIGH_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_PMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FINL_EMBT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OUT_BUS_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRIM_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HIST_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CASH_LIQ_ASET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACT_REC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACT_PAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_CURR_ASET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_CURR_LIAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_ASET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TOT_LIAB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ITNG_ASET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NET_INCM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_DT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CURR_RATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QK_RATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IMPT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EXPT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DNB_RATG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNT_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOM_ULT_PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOM_ULT_PNT_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DOM_ULT_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GBL_ULT_PNT_DUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GBL_ULT_CTRY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GBL_ULT_PNT_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BUS_STRU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STMT_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANN_SALE_VOL" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="BUS_REGN_NBR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CLM_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INCN_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCL_ACTV_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LCL_ACTV_CD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAX_CR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNT_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIM_SIC_TYPE_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRIN_NME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRT_YR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SUIT_JDGT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRDG_STYL" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MAX_CR_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANG_NET_WRTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TANG_NET_WRTH_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANN_SALE_CRCY_CD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESTD_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FCST_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FISC_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FNAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SGND_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REST_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UBAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDT_QLFN_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OPEN_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRO_FRMA_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRL_BAL_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AUDT_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CONS_IND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FAIL_SCR_ENTR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}FAIL_SCR_ENTR2" minOccurs="0"/>
 *         &lt;element name="DELQ_SCR_ENTR" type="{http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP_V3/wsp_GDP_V3}DELQ_SCR_ENTR2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eRAM", propOrder = {
    "dunsnbr",
    "primnme",
    "adrline",
    "posttown",
    "primgeoarea",
    "scdygeoarea",
    "postcode",
    "ctrycd",
    "tlcmnbr",
    "currcntlyr",
    "totempl",
    "primsic",
    "locnstat",
    "hqduns",
    "hqnme",
    "hqctrycd",
    "lglform",
    "adrtenrtypecd",
    "ceonme",
    "paydscr",
    "payd3MOAGO",
    "paydnorm",
    "avghighcr",
    "highcr",
    "totpmt",
    "finlembtind",
    "outbusind",
    "crimind",
    "histind",
    "cashliqaset",
    "actrec",
    "actpay",
    "stk",
    "totcurraset",
    "totcurrliab",
    "totaset",
    "totliab",
    "netwrth",
    "itngaset",
    "sls",
    "netincm",
    "stmtdt",
    "currrato",
    "qkrato",
    "imptind",
    "exptind",
    "dnbratg",
    "pntduns",
    "pntctrycd",
    "domultpntduns",
    "domultpntnme",
    "domultctrycd",
    "gblultpntduns",
    "gblultctrycd",
    "gblultpntnme",
    "busstru",
    "crcycd",
    "stmtcrcycd",
    "annsalevol",
    "busregnnbr",
    "clmind",
    "incnyr",
    "lclactvcd",
    "lclactvcdtype",
    "maxcr",
    "pntnme",
    "primsictypecd",
    "prinnme",
    "strtyr",
    "suitjdgtind",
    "trdgstyl",
    "maxcrcrcycd",
    "tangnetwrth",
    "tangnetwrthcrcycd",
    "annsalecrcycd",
    "estdind",
    "fcstind",
    "fiscind",
    "fnalind",
    "sgndind",
    "restind",
    "ubalind",
    "audtqlfnind",
    "openind",
    "profrmaind",
    "trlbalind",
    "audtind",
    "consind",
    "failscrentr",
    "delqscrentr"
})
public class ERAM {

    @XmlElementRef(name = "DUNS_NBR", type = JAXBElement.class)
    protected JAXBElement<String> dunsnbr;
    @XmlElementRef(name = "PRIM_NME", type = JAXBElement.class)
    protected JAXBElement<String> primnme;
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
    @XmlElementRef(name = "CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> ctrycd;
    @XmlElementRef(name = "TLCM_NBR", type = JAXBElement.class)
    protected JAXBElement<String> tlcmnbr;
    @XmlElementRef(name = "CURR_CNTL_YR", type = JAXBElement.class)
    protected JAXBElement<String> currcntlyr;
    @XmlElementRef(name = "TOT_EMPL", type = JAXBElement.class)
    protected JAXBElement<String> totempl;
    @XmlElementRef(name = "PRIM_SIC", type = JAXBElement.class)
    protected JAXBElement<String> primsic;
    @XmlElementRef(name = "LOCN_STAT", type = JAXBElement.class)
    protected JAXBElement<String> locnstat;
    @XmlElementRef(name = "HQ_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> hqduns;
    @XmlElementRef(name = "HQ_NME", type = JAXBElement.class)
    protected JAXBElement<String> hqnme;
    @XmlElementRef(name = "HQ_CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> hqctrycd;
    @XmlElementRef(name = "LGL_FORM", type = JAXBElement.class)
    protected JAXBElement<String> lglform;
    @XmlElementRef(name = "ADR_TENR_TYPE_CD", type = JAXBElement.class)
    protected JAXBElement<String> adrtenrtypecd;
    @XmlElementRef(name = "CEO_NME", type = JAXBElement.class)
    protected JAXBElement<String> ceonme;
    @XmlElementRef(name = "PAYD_SCR", type = JAXBElement.class)
    protected JAXBElement<String> paydscr;
    @XmlElementRef(name = "PAYD_3_MO_AGO", type = JAXBElement.class)
    protected JAXBElement<String> payd3MOAGO;
    @XmlElementRef(name = "PAYD_NORM", type = JAXBElement.class)
    protected JAXBElement<String> paydnorm;
    @XmlElementRef(name = "AVG_HIGH_CR", type = JAXBElement.class)
    protected JAXBElement<String> avghighcr;
    @XmlElementRef(name = "HIGH_CR", type = JAXBElement.class)
    protected JAXBElement<String> highcr;
    @XmlElementRef(name = "TOT_PMT", type = JAXBElement.class)
    protected JAXBElement<String> totpmt;
    @XmlElementRef(name = "FINL_EMBT_IND", type = JAXBElement.class)
    protected JAXBElement<String> finlembtind;
    @XmlElementRef(name = "OUT_BUS_IND", type = JAXBElement.class)
    protected JAXBElement<String> outbusind;
    @XmlElementRef(name = "CRIM_IND", type = JAXBElement.class)
    protected JAXBElement<String> crimind;
    @XmlElementRef(name = "HIST_IND", type = JAXBElement.class)
    protected JAXBElement<String> histind;
    @XmlElementRef(name = "CASH_LIQ_ASET", type = JAXBElement.class)
    protected JAXBElement<String> cashliqaset;
    @XmlElementRef(name = "ACT_REC", type = JAXBElement.class)
    protected JAXBElement<String> actrec;
    @XmlElementRef(name = "ACT_PAY", type = JAXBElement.class)
    protected JAXBElement<String> actpay;
    @XmlElementRef(name = "STK", type = JAXBElement.class)
    protected JAXBElement<String> stk;
    @XmlElementRef(name = "TOT_CURR_ASET", type = JAXBElement.class)
    protected JAXBElement<String> totcurraset;
    @XmlElementRef(name = "TOT_CURR_LIAB", type = JAXBElement.class)
    protected JAXBElement<String> totcurrliab;
    @XmlElementRef(name = "TOT_ASET", type = JAXBElement.class)
    protected JAXBElement<String> totaset;
    @XmlElementRef(name = "TOT_LIAB", type = JAXBElement.class)
    protected JAXBElement<String> totliab;
    @XmlElementRef(name = "NET_WRTH", type = JAXBElement.class)
    protected JAXBElement<String> netwrth;
    @XmlElementRef(name = "ITNG_ASET", type = JAXBElement.class)
    protected JAXBElement<String> itngaset;
    @XmlElementRef(name = "SLS", type = JAXBElement.class)
    protected JAXBElement<String> sls;
    @XmlElementRef(name = "NET_INCM", type = JAXBElement.class)
    protected JAXBElement<String> netincm;
    @XmlElementRef(name = "STMT_DT", type = JAXBElement.class)
    protected JAXBElement<String> stmtdt;
    @XmlElementRef(name = "CURR_RATO", type = JAXBElement.class)
    protected JAXBElement<String> currrato;
    @XmlElementRef(name = "QK_RATO", type = JAXBElement.class)
    protected JAXBElement<String> qkrato;
    @XmlElementRef(name = "IMPT_IND", type = JAXBElement.class)
    protected JAXBElement<String> imptind;
    @XmlElementRef(name = "EXPT_IND", type = JAXBElement.class)
    protected JAXBElement<String> exptind;
    @XmlElementRef(name = "DNB_RATG", type = JAXBElement.class)
    protected JAXBElement<String> dnbratg;
    @XmlElementRef(name = "PNT_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> pntduns;
    @XmlElementRef(name = "PNT_CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> pntctrycd;
    @XmlElementRef(name = "DOM_ULT_PNT_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> domultpntduns;
    @XmlElementRef(name = "DOM_ULT_PNT_NME", type = JAXBElement.class)
    protected JAXBElement<String> domultpntnme;
    @XmlElementRef(name = "DOM_ULT_CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> domultctrycd;
    @XmlElementRef(name = "GBL_ULT_PNT_DUNS", type = JAXBElement.class)
    protected JAXBElement<String> gblultpntduns;
    @XmlElementRef(name = "GBL_ULT_CTRY_CD", type = JAXBElement.class)
    protected JAXBElement<String> gblultctrycd;
    @XmlElementRef(name = "GBL_ULT_PNT_NME", type = JAXBElement.class)
    protected JAXBElement<String> gblultpntnme;
    @XmlElementRef(name = "BUS_STRU", type = JAXBElement.class)
    protected JAXBElement<String> busstru;
    @XmlElementRef(name = "CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> crcycd;
    @XmlElementRef(name = "STMT_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> stmtcrcycd;
    @XmlElementRef(name = "ANN_SALE_VOL", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> annsalevol;
    @XmlElementRef(name = "BUS_REGN_NBR", type = JAXBElement.class)
    protected JAXBElement<String> busregnnbr;
    @XmlElementRef(name = "CLM_IND", type = JAXBElement.class)
    protected JAXBElement<String> clmind;
    @XmlElementRef(name = "INCN_YR", type = JAXBElement.class)
    protected JAXBElement<String> incnyr;
    @XmlElementRef(name = "LCL_ACTV_CD", type = JAXBElement.class)
    protected JAXBElement<String> lclactvcd;
    @XmlElementRef(name = "LCL_ACTV_CD_TYPE", type = JAXBElement.class)
    protected JAXBElement<String> lclactvcdtype;
    @XmlElementRef(name = "MAX_CR", type = JAXBElement.class)
    protected JAXBElement<String> maxcr;
    @XmlElementRef(name = "PNT_NME", type = JAXBElement.class)
    protected JAXBElement<String> pntnme;
    @XmlElementRef(name = "PRIM_SIC_TYPE_CD", type = JAXBElement.class)
    protected JAXBElement<String> primsictypecd;
    @XmlElementRef(name = "PRIN_NME", type = JAXBElement.class)
    protected JAXBElement<String> prinnme;
    @XmlElementRef(name = "STRT_YR", type = JAXBElement.class)
    protected JAXBElement<String> strtyr;
    @XmlElementRef(name = "SUIT_JDGT_IND", type = JAXBElement.class)
    protected JAXBElement<String> suitjdgtind;
    @XmlElementRef(name = "TRDG_STYL", type = JAXBElement.class)
    protected JAXBElement<ArrayOfstring> trdgstyl;
    @XmlElementRef(name = "MAX_CR_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> maxcrcrcycd;
    @XmlElementRef(name = "TANG_NET_WRTH", type = JAXBElement.class)
    protected JAXBElement<String> tangnetwrth;
    @XmlElementRef(name = "TANG_NET_WRTH_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> tangnetwrthcrcycd;
    @XmlElementRef(name = "ANN_SALE_CRCY_CD", type = JAXBElement.class)
    protected JAXBElement<String> annsalecrcycd;
    @XmlElementRef(name = "ESTD_IND", type = JAXBElement.class)
    protected JAXBElement<String> estdind;
    @XmlElementRef(name = "FCST_IND", type = JAXBElement.class)
    protected JAXBElement<String> fcstind;
    @XmlElementRef(name = "FISC_IND", type = JAXBElement.class)
    protected JAXBElement<String> fiscind;
    @XmlElementRef(name = "FNAL_IND", type = JAXBElement.class)
    protected JAXBElement<String> fnalind;
    @XmlElementRef(name = "SGND_IND", type = JAXBElement.class)
    protected JAXBElement<String> sgndind;
    @XmlElementRef(name = "REST_IND", type = JAXBElement.class)
    protected JAXBElement<String> restind;
    @XmlElementRef(name = "UBAL_IND", type = JAXBElement.class)
    protected JAXBElement<String> ubalind;
    @XmlElementRef(name = "AUDT_QLFN_IND", type = JAXBElement.class)
    protected JAXBElement<String> audtqlfnind;
    @XmlElementRef(name = "OPEN_IND", type = JAXBElement.class)
    protected JAXBElement<String> openind;
    @XmlElementRef(name = "PRO_FRMA_IND", type = JAXBElement.class)
    protected JAXBElement<String> profrmaind;
    @XmlElementRef(name = "TRL_BAL_IND", type = JAXBElement.class)
    protected JAXBElement<String> trlbalind;
    @XmlElementRef(name = "AUDT_IND", type = JAXBElement.class)
    protected JAXBElement<String> audtind;
    @XmlElementRef(name = "CONS_IND", type = JAXBElement.class)
    protected JAXBElement<String> consind;
    @XmlElementRef(name = "FAIL_SCR_ENTR", type = JAXBElement.class)
    protected JAXBElement<FAILSCRENTR2> failscrentr;
    @XmlElementRef(name = "DELQ_SCR_ENTR", type = JAXBElement.class)
    protected JAXBElement<DELQSCRENTR2> delqscrentr;

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
     * Gets the value of the hqduns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQDUNS() {
        return hqduns;
    }

    /**
     * Sets the value of the hqduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQDUNS(JAXBElement<String> value) {
        this.hqduns = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hqnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQNME() {
        return hqnme;
    }

    /**
     * Sets the value of the hqnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQNME(JAXBElement<String> value) {
        this.hqnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the hqctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQCTRYCD() {
        return hqctrycd;
    }

    /**
     * Sets the value of the hqctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQCTRYCD(JAXBElement<String> value) {
        this.hqctrycd = ((JAXBElement<String> ) value);
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
     * Gets the value of the adrtenrtypecd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getADRTENRTYPECD() {
        return adrtenrtypecd;
    }

    /**
     * Sets the value of the adrtenrtypecd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setADRTENRTYPECD(JAXBElement<String> value) {
        this.adrtenrtypecd = ((JAXBElement<String> ) value);
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
     * Gets the value of the cashliqaset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCASHLIQASET() {
        return cashliqaset;
    }

    /**
     * Sets the value of the cashliqaset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCASHLIQASET(JAXBElement<String> value) {
        this.cashliqaset = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actrec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTREC() {
        return actrec;
    }

    /**
     * Sets the value of the actrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTREC(JAXBElement<String> value) {
        this.actrec = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the actpay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACTPAY() {
        return actpay;
    }

    /**
     * Sets the value of the actpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACTPAY(JAXBElement<String> value) {
        this.actpay = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the stk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSTK() {
        return stk;
    }

    /**
     * Sets the value of the stk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSTK(JAXBElement<String> value) {
        this.stk = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totcurraset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTCURRASET() {
        return totcurraset;
    }

    /**
     * Sets the value of the totcurraset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTCURRASET(JAXBElement<String> value) {
        this.totcurraset = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totcurrliab property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTCURRLIAB() {
        return totcurrliab;
    }

    /**
     * Sets the value of the totcurrliab property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTCURRLIAB(JAXBElement<String> value) {
        this.totcurrliab = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totaset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTASET() {
        return totaset;
    }

    /**
     * Sets the value of the totaset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTASET(JAXBElement<String> value) {
        this.totaset = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the totliab property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTOTLIAB() {
        return totliab;
    }

    /**
     * Sets the value of the totliab property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTOTLIAB(JAXBElement<String> value) {
        this.totliab = ((JAXBElement<String> ) value);
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
     * Gets the value of the itngaset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getITNGASET() {
        return itngaset;
    }

    /**
     * Sets the value of the itngaset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setITNGASET(JAXBElement<String> value) {
        this.itngaset = ((JAXBElement<String> ) value);
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
     * Gets the value of the netincm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNETINCM() {
        return netincm;
    }

    /**
     * Sets the value of the netincm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNETINCM(JAXBElement<String> value) {
        this.netincm = ((JAXBElement<String> ) value);
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
     * Gets the value of the currrato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCURRRATO() {
        return currrato;
    }

    /**
     * Sets the value of the currrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCURRRATO(JAXBElement<String> value) {
        this.currrato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the qkrato property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQKRATO() {
        return qkrato;
    }

    /**
     * Sets the value of the qkrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQKRATO(JAXBElement<String> value) {
        this.qkrato = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the imptind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIMPTIND() {
        return imptind;
    }

    /**
     * Sets the value of the imptind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIMPTIND(JAXBElement<String> value) {
        this.imptind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the exptind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEXPTIND() {
        return exptind;
    }

    /**
     * Sets the value of the exptind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEXPTIND(JAXBElement<String> value) {
        this.exptind = ((JAXBElement<String> ) value);
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
     * Gets the value of the pntduns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNTDUNS() {
        return pntduns;
    }

    /**
     * Sets the value of the pntduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNTDUNS(JAXBElement<String> value) {
        this.pntduns = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pntctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNTCTRYCD() {
        return pntctrycd;
    }

    /**
     * Sets the value of the pntctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNTCTRYCD(JAXBElement<String> value) {
        this.pntctrycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the domultpntduns property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMULTPNTDUNS() {
        return domultpntduns;
    }

    /**
     * Sets the value of the domultpntduns property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMULTPNTDUNS(JAXBElement<String> value) {
        this.domultpntduns = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the domultpntnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMULTPNTNME() {
        return domultpntnme;
    }

    /**
     * Sets the value of the domultpntnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMULTPNTNME(JAXBElement<String> value) {
        this.domultpntnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the domultctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDOMULTCTRYCD() {
        return domultctrycd;
    }

    /**
     * Sets the value of the domultctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDOMULTCTRYCD(JAXBElement<String> value) {
        this.domultctrycd = ((JAXBElement<String> ) value);
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
     * Gets the value of the gblultctrycd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGBLULTCTRYCD() {
        return gblultctrycd;
    }

    /**
     * Sets the value of the gblultctrycd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGBLULTCTRYCD(JAXBElement<String> value) {
        this.gblultctrycd = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the gblultpntnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGBLULTPNTNME() {
        return gblultpntnme;
    }

    /**
     * Sets the value of the gblultpntnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGBLULTPNTNME(JAXBElement<String> value) {
        this.gblultpntnme = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the busstru property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBUSSTRU() {
        return busstru;
    }

    /**
     * Sets the value of the busstru property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBUSSTRU(JAXBElement<String> value) {
        this.busstru = ((JAXBElement<String> ) value);
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
     * Gets the value of the annsalevol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getANNSALEVOL() {
        return annsalevol;
    }

    /**
     * Sets the value of the annsalevol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setANNSALEVOL(JAXBElement<ArrayOfstring> value) {
        this.annsalevol = ((JAXBElement<ArrayOfstring> ) value);
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
     * Gets the value of the pntnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPNTNME() {
        return pntnme;
    }

    /**
     * Sets the value of the pntnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPNTNME(JAXBElement<String> value) {
        this.pntnme = ((JAXBElement<String> ) value);
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
     * Gets the value of the prinnme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPRINNME() {
        return prinnme;
    }

    /**
     * Sets the value of the prinnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPRINNME(JAXBElement<String> value) {
        this.prinnme = ((JAXBElement<String> ) value);
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
     * Gets the value of the estdind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getESTDIND() {
        return estdind;
    }

    /**
     * Sets the value of the estdind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setESTDIND(JAXBElement<String> value) {
        this.estdind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fcstind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFCSTIND() {
        return fcstind;
    }

    /**
     * Sets the value of the fcstind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFCSTIND(JAXBElement<String> value) {
        this.fcstind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fiscind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFISCIND() {
        return fiscind;
    }

    /**
     * Sets the value of the fiscind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFISCIND(JAXBElement<String> value) {
        this.fiscind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fnalind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFNALIND() {
        return fnalind;
    }

    /**
     * Sets the value of the fnalind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFNALIND(JAXBElement<String> value) {
        this.fnalind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sgndind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSGNDIND() {
        return sgndind;
    }

    /**
     * Sets the value of the sgndind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSGNDIND(JAXBElement<String> value) {
        this.sgndind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the restind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRESTIND() {
        return restind;
    }

    /**
     * Sets the value of the restind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRESTIND(JAXBElement<String> value) {
        this.restind = ((JAXBElement<String> ) value);
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
     * Gets the value of the audtqlfnind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUDTQLFNIND() {
        return audtqlfnind;
    }

    /**
     * Sets the value of the audtqlfnind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUDTQLFNIND(JAXBElement<String> value) {
        this.audtqlfnind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the openind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOPENIND() {
        return openind;
    }

    /**
     * Sets the value of the openind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOPENIND(JAXBElement<String> value) {
        this.openind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profrmaind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPROFRMAIND() {
        return profrmaind;
    }

    /**
     * Sets the value of the profrmaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPROFRMAIND(JAXBElement<String> value) {
        this.profrmaind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the trlbalind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTRLBALIND() {
        return trlbalind;
    }

    /**
     * Sets the value of the trlbalind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTRLBALIND(JAXBElement<String> value) {
        this.trlbalind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the audtind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAUDTIND() {
        return audtind;
    }

    /**
     * Sets the value of the audtind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAUDTIND(JAXBElement<String> value) {
        this.audtind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the consind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCONSIND() {
        return consind;
    }

    /**
     * Sets the value of the consind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCONSIND(JAXBElement<String> value) {
        this.consind = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the failscrentr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FAILSCRENTR2 }{@code >}
     *     
     */
    public JAXBElement<FAILSCRENTR2> getFAILSCRENTR() {
        return failscrentr;
    }

    /**
     * Sets the value of the failscrentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FAILSCRENTR2 }{@code >}
     *     
     */
    public void setFAILSCRENTR(JAXBElement<FAILSCRENTR2> value) {
        this.failscrentr = ((JAXBElement<FAILSCRENTR2> ) value);
    }

    /**
     * Gets the value of the delqscrentr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DELQSCRENTR2 }{@code >}
     *     
     */
    public JAXBElement<DELQSCRENTR2> getDELQSCRENTR() {
        return delqscrentr;
    }

    /**
     * Sets the value of the delqscrentr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DELQSCRENTR2 }{@code >}
     *     
     */
    public void setDELQSCRENTR(JAXBElement<DELQSCRENTR2> value) {
        this.delqscrentr = ((JAXBElement<DELQSCRENTR2> ) value);
    }

}
