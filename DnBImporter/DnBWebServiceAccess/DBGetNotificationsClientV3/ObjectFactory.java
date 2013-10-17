
package DBGetNotificationsClientV3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBGetNotificationsClientV3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WsGetNotifications_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3", "ws_GetNotifications");
    private final static QName _WsGetNotificationsResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3", "ws_GetNotificationsResponse");
    private final static QName _STATUSMESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _STATUSTECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUSSUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _SCRGRP6ASMTDT_QNAME = new QName("", "ASMT_DT");
    private final static QName _SCRGRP6INDSPCTL_QNAME = new QName("", "INDS_PCTL");
    private final static QName _SCRGRP6INDSNORM_QNAME = new QName("", "INDS_NORM");
    private final static QName _SCRGRP6SCROVRDCD_QNAME = new QName("", "SCR_OVRD_CD");
    private final static QName _SCRGRP6SCRCMTYCD_QNAME = new QName("", "SCR_CMTY_CD");
    private final static QName _SCRGRP6NATLPCTL_QNAME = new QName("", "NATL_PCTL");
    private final static QName _SCRGRP6INDSDEFUINDN_QNAME = new QName("", "INDS_DEFU_INDN");
    private final static QName _SCRGRP6SCRCLAS_QNAME = new QName("", "SCR_CLAS");
    private final static QName _SCRGRP6ELETAG_QNAME = new QName("", "ELE_TAG");
    private final static QName _SCRGRP6SCR_QNAME = new QName("", "SCR");
    private final static QName _SCRGRP6SCRAGE_QNAME = new QName("", "SCR_AGE");
    private final static QName _SCRGRP6ALGMID_QNAME = new QName("", "ALGM_ID");
    private final static QName _SCRGRP6DEFUINDN_QNAME = new QName("", "DEFU_INDN");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _USERRSPFLRS_QNAME = new QName("", "PFLRS");
    private final static QName _USERRSUSERID_QNAME = new QName("", "USERID");
    private final static QName _MONPRODRSITNGASET_QNAME = new QName("", "ITNG_ASET");
    private final static QName _MONPRODRSSTAT_QNAME = new QName("", "STAT");
    private final static QName _MONPRODRSGROSINCM_QNAME = new QName("", "GROS_INCM");
    private final static QName _MONPRODRSPAYDNORM_QNAME = new QName("", "PAYD_NORM");
    private final static QName _MONPRODRSFINLLGLEVNTIND_QNAME = new QName("", "FINL_LGL_EVNT_IND");
    private final static QName _MONPRODRSTOTEMPL_QNAME = new QName("", "TOT_EMPL");
    private final static QName _MONPRODRSFAXNBR_QNAME = new QName("", "FAX_NBR");
    private final static QName _MONPRODRSRESTIND_QNAME = new QName("", "REST_IND");
    private final static QName _MONPRODRSHIGHCR_QNAME = new QName("", "HIGH_CR");
    private final static QName _MONPRODRSPOSTTOWN_QNAME = new QName("", "POST_TOWN");
    private final static QName _MONPRODRSFLNGTYPE_QNAME = new QName("", "FLNG_TYPE");
    private final static QName _MONPRODRSLOCNSTAT_QNAME = new QName("", "LOCN_STAT");
    private final static QName _MONPRODRSPMTSUMM_QNAME = new QName("", "PMT_SUMM");
    private final static QName _MONPRODRSCNGLDISTCD_QNAME = new QName("", "CNGL_DIST_CD");
    private final static QName _MONPRODRSSTRTYR_QNAME = new QName("", "STRT_YR");
    private final static QName _MONPRODRSDBARCNT_QNAME = new QName("", "DBAR_CNT");
    private final static QName _MONPRODRSADDLSICTYPECD_QNAME = new QName("", "ADDL_SIC_TYPE_CD");
    private final static QName _MONPRODRSDOMULTPNTDUNS_QNAME = new QName("", "DOM_ULT_PNT_DUNS");
    private final static QName _MONPRODRSACTIVITYTEXT_QNAME = new QName("", "ACTIVITY_TEXT");
    private final static QName _MONPRODRSHQNME_QNAME = new QName("", "HQ_NME");
    private final static QName _MONPRODRSNETINCM_QNAME = new QName("", "NET_INCM");
    private final static QName _MONPRODRSOPRGSPECEVNTIND_QNAME = new QName("", "OPRG_SPEC_EVNT_IND");
    private final static QName _MONPRODRSESTDIND_QNAME = new QName("", "ESTD_IND");
    private final static QName _MONPRODRSSMLBUSIND_QNAME = new QName("", "SML_BUS_IND");
    private final static QName _MONPRODRSANNSALEVOLTEXT_QNAME = new QName("", "ANN_SALE_VOL_TEXT");
    private final static QName _MONPRODRSTOTEMPLTEXT_QNAME = new QName("", "TOT_EMPL_TEXT");
    private final static QName _MONPRODRSGLBLFAILSCRENTR_QNAME = new QName("", "GLBL_FAIL_SCR_ENTR");
    private final static QName _MONPRODRSCURRCNTLYR_QNAME = new QName("", "CURR_CNTL_YR");
    private final static QName _MONPRODRSCEOTITL_QNAME = new QName("", "CEO_TITL");
    private final static QName _MONPRODRSDUNSNBR_QNAME = new QName("", "DUNS_NBR");
    private final static QName _MONPRODRSFCSTIND_QNAME = new QName("", "FCST_IND");
    private final static QName _MONPRODRSCAPLCRCYCD_QNAME = new QName("", "CAPL_CRCY_CD");
    private final static QName _MONPRODRSANNSALEVOL_QNAME = new QName("", "ANN_SALE_VOL");
    private final static QName _MONPRODRSDELQSCRENTR_QNAME = new QName("", "DELQ_SCR_ENTR");
    private final static QName _MONPRODRSDBARDT_QNAME = new QName("", "DBAR_DT");
    private final static QName _MONPRODRSDAVDYR_QNAME = new QName("", "DAVD_YR");
    private final static QName _MONPRODRSBUSSTRU_QNAME = new QName("", "BUS_STRU");
    private final static QName _MONPRODRSFAILSCRCMTY_QNAME = new QName("", "FAIL_SCR_CMTY");
    private final static QName _MONPRODRSPRIMSICTYPECD_QNAME = new QName("", "PRIM_SIC_TYPE_CD");
    private final static QName _MONPRODRSEXPTIND_QNAME = new QName("", "EXPT_IND");
    private final static QName _MONPRODRSREGNTYPE_QNAME = new QName("", "REGN_TYPE");
    private final static QName _MONPRODRSCLMIND_QNAME = new QName("", "CLM_IND");
    private final static QName _MONPRODRSSMLBUSYR_QNAME = new QName("", "SML_BUS_YR");
    private final static QName _MONPRODRSFAILSCR6MOAGO_QNAME = new QName("", "FAIL_SCR_6_MO_AGO");
    private final static QName _MONPRODRSTOTCURRASET_QNAME = new QName("", "TOT_CURR_ASET");
    private final static QName _MONPRODRSADDLSIC_QNAME = new QName("", "ADDL_SIC");
    private final static QName _MONPRODRSHQDUNS_QNAME = new QName("", "HQ_DUNS");
    private final static QName _MONPRODRSTANGNETWRTHCRCYCD_QNAME = new QName("", "TANG_NET_WRTH_CRCY_CD");
    private final static QName _MONPRODRSCAPLAMT_QNAME = new QName("", "CAPL_AMT");
    private final static QName _MONPRODRSFAILSCR12MOAGO_QNAME = new QName("", "FAIL_SCR_12_MO_AGO");
    private final static QName _MONPRODRSDSTRIND_QNAME = new QName("", "DSTR_IND");
    private final static QName _MONPRODRSSGNDIND_QNAME = new QName("", "SGND_IND");
    private final static QName _MONPRODRSPOSTCODE_QNAME = new QName("", "POST_CODE");
    private final static QName _MONPRODRSTRDGSTYL_QNAME = new QName("", "TRDG_STYL");
    private final static QName _MONPRODRSFAILSCR_QNAME = new QName("", "FAIL_SCR");
    private final static QName _MONPRODRSNONPOSTTOWN_QNAME = new QName("", "NON_POST_TOWN");
    private final static QName _MONPRODRSSTMTDT_QNAME = new QName("", "STMT_DT");
    private final static QName _MONPRODRSPROFRMAIND_QNAME = new QName("", "PRO_FRMA_IND");
    private final static QName _MONPRODRSANNSALEESTDIND_QNAME = new QName("", "ANN_SALE_ESTD_IND");
    private final static QName _MONPRODRSDSR_QNAME = new QName("", "DSR");
    private final static QName _MONPRODRSACTPAY_QNAME = new QName("", "ACT_PAY");
    private final static QName _MONPRODRSFLNGVAL_QNAME = new QName("", "FLNG_VAL");
    private final static QName _MONPRODRSTOTEMPLESTDIND_QNAME = new QName("", "TOT_EMPL_ESTD_IND");
    private final static QName _MONPRODRSCRSCR_QNAME = new QName("", "CR_SCR");
    private final static QName _MONPRODRSFIXDASET_QNAME = new QName("", "FIXD_ASET");
    private final static QName _MONPRODRSTOTEMPLMININD_QNAME = new QName("", "TOT_EMPL_MIN_IND");
    private final static QName _MONPRODRSTOTPMT_QNAME = new QName("", "TOT_PMT");
    private final static QName _MONPRODRSRETNERNG_QNAME = new QName("", "RETN_ERNG");
    private final static QName _MONPRODRSGBLULTPNTNME_QNAME = new QName("", "GBL_ULT_PNT_NME");
    private final static QName _MONPRODRSCURRRATO_QNAME = new QName("", "CURR_RATO");
    private final static QName _MONPRODRSPRIMGEOAREA_QNAME = new QName("", "PRIM_GEO_AREA");
    private final static QName _MONPRODRSMINYOWNDYR_QNAME = new QName("", "MINY_OWND_YR");
    private final static QName _MONPRODRSDOMULTCTRYCD_QNAME = new QName("", "DOM_ULT_CTRY_CD");
    private final static QName _MONPRODRSOTHRSPECEVNTIND_QNAME = new QName("", "OTHR_SPEC_EVNT_IND");
    private final static QName _MONPRODRSPNTDUNS_QNAME = new QName("", "PNT_DUNS");
    private final static QName _MONPRODRSANNSALECONSIND_QNAME = new QName("", "ANN_SALE_CONS_IND");
    private final static QName _MONPRODRSEMPLATPRIMADRESTDIND_QNAME = new QName("", "EMPL_AT_PRIM_ADR_ESTD_IND");
    private final static QName _MONPRODRSGBLULTPNTDUNS_QNAME = new QName("", "GBL_ULT_PNT_DUNS");
    private final static QName _MONPRODRSSTMTFROMDT_QNAME = new QName("", "STMT_FROM_DT");
    private final static QName _MONPRODRSOUTBUSIND_QNAME = new QName("", "OUT_BUS_IND");
    private final static QName _MONPRODRSLTDBT_QNAME = new QName("", "LT_DBT");
    private final static QName _MONPRODRSPNTNME_QNAME = new QName("", "PNT_NME");
    private final static QName _MONPRODRSPFTBEFTAX_QNAME = new QName("", "PFT_BEF_TAX");
    private final static QName _MONPRODRSAUDTQLFNIND_QNAME = new QName("", "AUDT_QLFN_IND");
    private final static QName _MONPRODRSCOSTOFSLS_QNAME = new QName("", "COST_OF_SLS");
    private final static QName _MONPRODRSHQCTRYCD_QNAME = new QName("", "HQ_CTRY_CD");
    private final static QName _MONPRODRSINTLDLNGCD_QNAME = new QName("", "INTL_DLNG_CD");
    private final static QName _MONPRODRSAVGHIGHCR_QNAME = new QName("", "AVG_HIGH_CR");
    private final static QName _MONPRODRSGLBLFAILSCR_QNAME = new QName("", "GLBL_FAIL_SCR");
    private final static QName _MONPRODRSFAILSCRENTR_QNAME = new QName("", "FAIL_SCR_ENTR");
    private final static QName _MONPRODRSMAXCRCRCYCD_QNAME = new QName("", "MAX_CR_CRCY_CD");
    private final static QName _MONPRODRSCRIND_QNAME = new QName("", "CR_IND");
    private final static QName _MONPRODRSCASHLIQASET_QNAME = new QName("", "CASH_LIQ_ASET");
    private final static QName _MONPRODRSTOTLIAB_QNAME = new QName("", "TOT_LIAB");
    private final static QName _MONPRODRSWOMNOWNDIND_QNAME = new QName("", "WOMN_OWND_IND");
    private final static QName _MONPRODRSBRIND_QNAME = new QName("", "BR_IND");
    private final static QName _MONPRODRSPREVWRKGCAPL_QNAME = new QName("", "PREV_WRKG_CAPL");
    private final static QName _MONPRODRSDIVD_QNAME = new QName("", "DIVD");
    private final static QName _MONPRODRSWOMNOWNDYR_QNAME = new QName("", "WOMN_OWND_YR");
    private final static QName _MONPRODRSPNTCTRYCD_QNAME = new QName("", "PNT_CTRY_CD");
    private final static QName _MONPRODRSNETWRTH_QNAME = new QName("", "NET_WRTH");
    private final static QName _MONPRODRSLGLFORM_QNAME = new QName("", "LGL_FORM");
    private final static QName _MONPRODRSCRSCRCMTY_QNAME = new QName("", "CR_SCR_CMTY");
    private final static QName _MONPRODRSFLNGNBR_QNAME = new QName("", "FLNG_NBR");
    private final static QName _MONPRODRSSUITJDGTIND_QNAME = new QName("", "SUIT_JDGT_IND");
    private final static QName _MONPRODRSFAILSCRNATLPCTG_QNAME = new QName("", "FAIL_SCR_NATL_PCTG");
    private final static QName _MONPRODRSADRLINE_QNAME = new QName("", "ADR_LINE");
    private final static QName _MONPRODRSFAILSCRINDPCTG_QNAME = new QName("", "FAIL_SCR_IND_PCTG");
    private final static QName _MONPRODRSMAXCR_QNAME = new QName("", "MAX_CR");
    private final static QName _MONPRODRSFAILSCROVRDCD_QNAME = new QName("", "FAIL_SCR_OVRD_CD");
    private final static QName _MONPRODRSHISTIND_QNAME = new QName("", "HIST_IND");
    private final static QName _MONPRODRSTRLBALIND_QNAME = new QName("", "TRL_BAL_IND");
    private final static QName _MONPRODRSTOTLTLIAB_QNAME = new QName("", "TOT_LT_LIAB");
    private final static QName _MONPRODRSCEONME_QNAME = new QName("", "CEO_NME");
    private final static QName _MONPRODRSPRINNME_QNAME = new QName("", "PRIN_NME");
    private final static QName _MONPRODRSGBLULTCTRYCD_QNAME = new QName("", "GBL_ULT_CTRY_CD");
    private final static QName _MONPRODRSSLS_QNAME = new QName("", "SLS");
    private final static QName _MONPRODRSOPENIND_QNAME = new QName("", "OPEN_IND");
    private final static QName _MONPRODRSDAVDIND_QNAME = new QName("", "DAVD_IND");
    private final static QName _MONPRODRSPREVSLS_QNAME = new QName("", "PREV_SLS");
    private final static QName _MONPRODRSSCRDFLNGIND_QNAME = new QName("", "SCRD_FLNG_IND");
    private final static QName _MONPRODRSTLCMNBR_QNAME = new QName("", "TLCM_NBR");
    private final static QName _MONPRODRSFNALIND_QNAME = new QName("", "FNAL_IND");
    private final static QName _MONPRODRSADDLSICDESC_QNAME = new QName("", "ADDL_SIC_DESC");
    private final static QName _MONPRODRSAUDTIND_QNAME = new QName("", "AUDT_IND");
    private final static QName _MONPRODRSPREVSTMTDT_QNAME = new QName("", "PREV_STMT_DT");
    private final static QName _MONPRODRSADRTENRTYPECD_QNAME = new QName("", "ADR_TENR_TYPE_CD");
    private final static QName _MONPRODRSENQDUNS_QNAME = new QName("", "ENQ_DUNS");
    private final static QName _MONPRODRSDOMULTPNTNME_QNAME = new QName("", "DOM_ULT_PNT_NME");
    private final static QName _MONPRODRSPRIMNME_QNAME = new QName("", "PRIM_NME");
    private final static QName _MONPRODRSPAYD3MOAGO_QNAME = new QName("", "PAYD_3_MO_AGO");
    private final static QName _MONPRODRSCAPLTYPECD_QNAME = new QName("", "CAPL_TYPE_CD");
    private final static QName _MONPRODRSACTREC_QNAME = new QName("", "ACT_REC");
    private final static QName _MONPRODRSSRVTID_QNAME = new QName("", "SRVTID");
    private final static QName _MONPRODRSTANGNETWRTHTEXT_QNAME = new QName("", "TANG_NET_WRTH_TEXT");
    private final static QName _MONPRODRSTOTLIABANDEQY_QNAME = new QName("", "TOT_LIAB_AND_EQY");
    private final static QName _MONPRODRSPRIMSIC_QNAME = new QName("", "PRIM_SIC");
    private final static QName _MONPRODRSCTRYCD_QNAME = new QName("", "CTRY_CD");
    private final static QName _MONPRODRSSTK_QNAME = new QName("", "STK");
    private final static QName _MONPRODRSCRIMIND_QNAME = new QName("", "CRIM_IND");
    private final static QName _MONPRODRSPRINTTL_QNAME = new QName("", "PRIN_TTL");
    private final static QName _MONPRODRSLBRSPLSAREAYR_QNAME = new QName("", "LBR_SPLS_AREA_YR");
    private final static QName _MONPRODRSTOTCURRLIAB_QNAME = new QName("", "TOT_CURR_LIAB");
    private final static QName _MONPRODRSLBRSPLSAREAIND_QNAME = new QName("", "LBR_SPLS_AREA_IND");
    private final static QName _MONPRODRSEMPLATPRIMADRTEXT_QNAME = new QName("", "EMPL_AT_PRIM_ADR_TEXT");
    private final static QName _MONPRODRSTOTASET_QNAME = new QName("", "TOT_ASET");
    private final static QName _MONPRODRSUBALIND_QNAME = new QName("", "UBAL_IND");
    private final static QName _MONPRODRSTOTEMPLIND_QNAME = new QName("", "TOT_EMPL_IND");
    private final static QName _MONPRODRSPREVNETWRTH_QNAME = new QName("", "PREV_NET_WRTH");
    private final static QName _MONPRODRSFLNGCRCYCD_QNAME = new QName("", "FLNG_CRCY_CD");
    private final static QName _MONPRODRSASET_QNAME = new QName("", "ASET");
    private final static QName _MONPRODRSBUSREGNNBRTYPECD_QNAME = new QName("", "BUS_REGN_NBR_TYPE_CD");
    private final static QName _MONPRODRSCRSCRCLAS_QNAME = new QName("", "CR_SCR_CLAS");
    private final static QName _MONPRODRSTANGNETWRTHESTDIND_QNAME = new QName("", "TANG_NET_WRTH_ESTD_IND");
    private final static QName _MONPRODRSCRCYCD_QNAME = new QName("", "CRCY_CD");
    private final static QName _MONPRODRSANNSALECRCYCD_QNAME = new QName("", "ANN_SALE_CRCY_CD");
    private final static QName _MONPRODRSFINLEMBTIND_QNAME = new QName("", "FINL_EMBT_IND");
    private final static QName _MONPRODRSDNBRATG_QNAME = new QName("", "DNB_RATG");
    private final static QName _MONPRODRSINCNYR_QNAME = new QName("", "INCN_YR");
    private final static QName _MONPRODRSLCLACTVCD_QNAME = new QName("", "LCL_ACTV_CD");
    private final static QName _MONPRODRSEMPLATPRIMADRMININD_QNAME = new QName("", "EMPL_AT_PRIM_ADR_MIN_IND");
    private final static QName _MONPRODRSSTMTTODT_QNAME = new QName("", "STMT_TO_DT");
    private final static QName _MONPRODRSNBRNEGPMT_QNAME = new QName("", "NBR_NEG_PMT");
    private final static QName _MONPRODRSDBTRINPOSNIND_QNAME = new QName("", "DBTR_IN_POSN_IND");
    private final static QName _MONPRODRSFINLSTMT_QNAME = new QName("", "FINL_STMT");
    private final static QName _MONPRODRSCONSIND_QNAME = new QName("", "CONS_IND");
    private final static QName _MONPRODRSTANGNETWRTH_QNAME = new QName("", "TANG_NET_WRTH");
    private final static QName _MONPRODRSCACHEIND_QNAME = new QName("", "CACHE_IND");
    private final static QName _MONPRODRSMINYOWNDIND_QNAME = new QName("", "MINY_OWND_IND");
    private final static QName _MONPRODRSINCMSTMTDT_QNAME = new QName("", "INCM_STMT_DT");
    private final static QName _MONPRODRSFISCIND_QNAME = new QName("", "FISC_IND");
    private final static QName _MONPRODRSBUSREGNNBR_QNAME = new QName("", "BUS_REGN_NBR");
    private final static QName _MONPRODRSIMPTIND_QNAME = new QName("", "IMPT_IND");
    private final static QName _MONPRODRSSTMTCRCYCD_QNAME = new QName("", "STMT_CRCY_CD");
    private final static QName _MONPRODRSPAYDSCR_QNAME = new QName("", "PAYD_SCR");
    private final static QName _MONPRODRSSCDYGEOAREA_QNAME = new QName("", "SCDY_GEO_AREA");
    private final static QName _MONPRODRSLCLACTVCDTYPE_QNAME = new QName("", "LCL_ACTV_CD_TYPE");
    private final static QName _MONPRODRSSDIND_QNAME = new QName("", "SD_IND");
    private final static QName _MONPRODRSQKRATO_QNAME = new QName("", "QK_RATO");
    private final static QName _NTFCRSGLBLULTCITYCD_QNAME = new QName("", "GLBL_ULT_CITY_CD");
    private final static QName _NTFCRSDOMULTCITYCD_QNAME = new QName("", "DOM_ULT_CITY_CD");
    private final static QName _NTFCRSDOMULTCTRYNME_QNAME = new QName("", "DOM_ULT_CTRY_NME");
    private final static QName _NTFCRSSRCDT_QNAME = new QName("", "SRC_DT");
    private final static QName _NTFCRSGLBLULTSTRADR1_QNAME = new QName("", "GLBL_ULT_STR_ADR1");
    private final static QName _NTFCRSGLBLULTSTRADR2_QNAME = new QName("", "GLBL_ULT_STR_ADR2");
    private final static QName _NTFCRSGLBLULTDUNSNBR_QNAME = new QName("", "GLBL_ULT_DUNS_NBR");
    private final static QName _NTFCRSGLBLULTPOSTCD_QNAME = new QName("", "GLBL_ULT_POST_CD");
    private final static QName _NTFCRSDOMULTPOSTCD_QNAME = new QName("", "DOM_ULT_POST_CD");
    private final static QName _NTFCRSDOMULTSTATE_QNAME = new QName("", "DOM_ULT_STATE");
    private final static QName _NTFCRSHQPOSTCD_QNAME = new QName("", "HQ_POST_CD");
    private final static QName _NTFCRSPNTSTATE_QNAME = new QName("", "PNT_STATE");
    private final static QName _NTFCRSHQDUNSNBR_QNAME = new QName("", "HQ_DUNS_NBR");
    private final static QName _NTFCRSHQCITYCD_QNAME = new QName("", "HQ_CITY_CD");
    private final static QName _NTFCRSCTRYNME_QNAME = new QName("", "CTRY_NME");
    private final static QName _NTFCRSSUBSCD_QNAME = new QName("", "SUBS_CD");
    private final static QName _NTFCRSPNTPOSTCD_QNAME = new QName("", "PNT_POST_CD");
    private final static QName _NTFCRSDUNSENQ_QNAME = new QName("", "DUNS_ENQ");
    private final static QName _NTFCRSDOMULTCNTYCD_QNAME = new QName("", "DOM_ULT_CNTY_CD");
    private final static QName _NTFCRSGLBLULTCTRYCD_QNAME = new QName("", "GLBL_ULT_CTRY_CD");
    private final static QName _NTFCRSPNTBUSNME_QNAME = new QName("", "PNT_BUS_NME");
    private final static QName _NTFCRSPNTCTRYNME_QNAME = new QName("", "PNT_CTRY_NME");
    private final static QName _NTFCRSGLBLULTCITY_QNAME = new QName("", "GLBL_ULT_CITY");
    private final static QName _NTFCRSBUSNME_QNAME = new QName("", "BUS_NME");
    private final static QName _NTFCRSPNTSTRADR1_QNAME = new QName("", "PNT_STR_ADR1");
    private final static QName _NTFCRSPNTSTRADR2_QNAME = new QName("", "PNT_STR_ADR2");
    private final static QName _NTFCRSDOMULTDUNSNBR_QNAME = new QName("", "DOM_ULT_DUNS_NBR");
    private final static QName _NTFCRSBUSSTRUCCD_QNAME = new QName("", "BUS_STRUC_CD");
    private final static QName _NTFCRSCITY_QNAME = new QName("", "CITY");
    private final static QName _NTFCRSSTATE_QNAME = new QName("", "STATE");
    private final static QName _NTFCRSOOBIND_QNAME = new QName("", "OOB_IND");
    private final static QName _NTFCRSSTRADR2_QNAME = new QName("", "STR_ADR2");
    private final static QName _NTFCRSSTRADR1_QNAME = new QName("", "STR_ADR1");
    private final static QName _NTFCRSGLBLULTSTATE_QNAME = new QName("", "GLBL_ULT_STATE");
    private final static QName _NTFCRSDOMULTCITY_QNAME = new QName("", "DOM_ULT_CITY");
    private final static QName _NTFCRSEMPLATPRIMADR_QNAME = new QName("", "EMPL_AT_PRIM_ADR");
    private final static QName _NTFCRSPNTCNTYCD_QNAME = new QName("", "PNT_CNTY_CD");
    private final static QName _NTFCRSPNTDUNSNBR_QNAME = new QName("", "PNT_DUNS_NBR");
    private final static QName _NTFCRSHQSTATE_QNAME = new QName("", "HQ_STATE");
    private final static QName _NTFCRSHQCNTYCD_QNAME = new QName("", "HQ_CNTY_CD");
    private final static QName _NTFCRSCNTYCD_QNAME = new QName("", "CNTY_CD");
    private final static QName _NTFCRSGLBLULTCTRYNME_QNAME = new QName("", "GLBL_ULT_CTRY_NME");
    private final static QName _NTFCRSHQSTRADR1_QNAME = new QName("", "HQ_STR_ADR1");
    private final static QName _NTFCRSHQSTRADR2_QNAME = new QName("", "HQ_STR_ADR2");
    private final static QName _NTFCRSPOSTCD_QNAME = new QName("", "POST_CD");
    private final static QName _NTFCRSCITYCD_QNAME = new QName("", "CITY_CD");
    private final static QName _NTFCRSDOMULTSTRADR1_QNAME = new QName("", "DOM_ULT_STR_ADR1");
    private final static QName _NTFCRSDOMULTSTRADR2_QNAME = new QName("", "DOM_ULT_STR_ADR2");
    private final static QName _NTFCRSHQCTRYNME_QNAME = new QName("", "HQ_CTRY_NME");
    private final static QName _NTFCRSPNTCITYCD_QNAME = new QName("", "PNT_CITY_CD");
    private final static QName _NTFCRSHQBUSNME_QNAME = new QName("", "HQ_BUS_NME");
    private final static QName _NTFCRSDOMULTBUSNME_QNAME = new QName("", "DOM_ULT_BUS_NME");
    private final static QName _NTFCRSGLBLULTBUSNME_QNAME = new QName("", "GLBL_ULT_BUS_NME");
    private final static QName _NTFCRSGLBLULTCNTYCD_QNAME = new QName("", "GLBL_ULT_CNTY_CD");
    private final static QName _NTFCRSDETECTDT_QNAME = new QName("", "DETECT_DT");
    private final static QName _NTFCRSHQCITY_QNAME = new QName("", "HQ_CITY");
    private final static QName _NTFCRSPNTCITY_QNAME = new QName("", "PNT_CITY");
    private final static QName _GETNTFCTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _GETNTFCTRNRSGETNTFCRS_QNAME = new QName("", "GETNTFCRS");
    private final static QName _GETNTFCTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _GETNTFCTRNRSSTATUS_QNAME = new QName("", "STATUS");
    private final static QName _STATUS2SEVERITY_QNAME = new QName("", "SEVERITY");
    private final static QName _STATUS2CODE_QNAME = new QName("", "CODE");
    private final static QName _GETNTFCRSUSERRS_QNAME = new QName("", "USERRS");
    private final static QName _GETNTFCRSREQID_QNAME = new QName("", "REQ_ID");
    private final static QName _REGNRSCUSTACCTID_QNAME = new QName("", "CUST_ACCT_ID");
    private final static QName _REGNRSMONPRODRS_QNAME = new QName("", "MON_PROD_RS");
    private final static QName _REGNRSCUSTENDR_QNAME = new QName("", "CUST_ENDR");
    private final static QName _REGNRSNTFCRS_QNAME = new QName("", "NTFCRS");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _GetNotificationsRequestSocCode_QNAME = new QName("", "socCode");
    private final static QName _GetNotificationsRequestDataDoNotMarkAsRead_QNAME = new QName("", "Do_not_Mark_as_Read");
    private final static QName _GetNotificationsRequestDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _GetNotificationsRequestDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _GetNotificationsRequestDataReceivedDateFrom_QNAME = new QName("", "Received_Date_From");
    private final static QName _GetNotificationsRequestDataProductName_QNAME = new QName("", "Product_Name");
    private final static QName _GetNotificationsRequestDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _GetNotificationsRequestDataReceivedDateTo_QNAME = new QName("", "Received_Date_To");
    private final static QName _GetNotificationsRequestDataPendingNoticesOnly_QNAME = new QName("", "Pending_Notices_only");
    private final static QName _GetNotificationsRequestDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _GetNotificationsRequestDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _GetNotificationsRequestDataActiveRegistrationsOnly_QNAME = new QName("", "Active_Registrations_only");
    private final static QName _GetNotificationsRequestDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _GetNotificationsRequestDataResultTicket_QNAME = new QName("", "Result_Ticket");
    private final static QName _GetNotificationsRequestDataUserLevel_QNAME = new QName("", "User_Level");
    private final static QName _SocCodeAppVer_QNAME = new QName("", "AppVer");
    private final static QName _SocCodeAppId_QNAME = new QName("", "AppId");
    private final static QName _GLBLMNSVCMSGSRSV1GETNTFCTRNRS_QNAME = new QName("", "GETNTFCTRNRS");
    private final static QName _PFLRSREGNRS_QNAME = new QName("", "REGNRS");
    private final static QName _PFLRSNTFCLVL_QNAME = new QName("", "NTFC_LVL");
    private final static QName _PFLRSPRODNME_QNAME = new QName("", "PROD_NME");
    private final static QName _PFLRSPFLNME_QNAME = new QName("", "PFL_NME");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBGetNotificationsClientV3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfFAILSCRENTR2 }
     * 
     */
    public ArrayOfFAILSCRENTR2 createArrayOfFAILSCRENTR2() {
        return new ArrayOfFAILSCRENTR2();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link USERRS }
     * 
     */
    public USERRS createUSERRS() {
        return new USERRS();
    }

    /**
     * Create an instance of {@link WsGetNotifications }
     * 
     */
    public WsGetNotifications createWsGetNotifications() {
        return new WsGetNotifications();
    }

    /**
     * Create an instance of {@link GLBLFAILSCRENTR2 }
     * 
     */
    public GLBLFAILSCRENTR2 createGLBLFAILSCRENTR2() {
        return new GLBLFAILSCRENTR2();
    }

    /**
     * Create an instance of {@link ArrayOfGLBLFAILSCRENTR2 }
     * 
     */
    public ArrayOfGLBLFAILSCRENTR2 createArrayOfGLBLFAILSCRENTR2() {
        return new ArrayOfGLBLFAILSCRENTR2();
    }

    /**
     * Create an instance of {@link GetNotificationsResponse }
     * 
     */
    public GetNotificationsResponse createGetNotificationsResponse() {
        return new GetNotificationsResponse();
    }

    /**
     * Create an instance of {@link DELQSCRENTR2 }
     * 
     */
    public DELQSCRENTR2 createDELQSCRENTR2() {
        return new DELQSCRENTR2();
    }

    /**
     * Create an instance of {@link ArrayOfNTFCRS }
     * 
     */
    public ArrayOfNTFCRS createArrayOfNTFCRS() {
        return new ArrayOfNTFCRS();
    }

    /**
     * Create an instance of {@link SCRGRP3 }
     * 
     */
    public SCRGRP3 createSCRGRP3() {
        return new SCRGRP3();
    }

    /**
     * Create an instance of {@link GETNTFCRS }
     * 
     */
    public GETNTFCRS createGETNTFCRS() {
        return new GETNTFCRS();
    }

    /**
     * Create an instance of {@link GetNotificationsRequestData }
     * 
     */
    public GetNotificationsRequestData createGetNotificationsRequestData() {
        return new GetNotificationsRequestData();
    }

    /**
     * Create an instance of {@link SocCode }
     * 
     */
    public SocCode createSocCode() {
        return new SocCode();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
    }

    /**
     * Create an instance of {@link PFLRS }
     * 
     */
    public PFLRS createPFLRS() {
        return new PFLRS();
    }

    /**
     * Create an instance of {@link SCRGRP5 }
     * 
     */
    public SCRGRP5 createSCRGRP5() {
        return new SCRGRP5();
    }

    /**
     * Create an instance of {@link SCRGRP }
     * 
     */
    public SCRGRP createSCRGRP() {
        return new SCRGRP();
    }

    /**
     * Create an instance of {@link ArrayOfFAILSCRENTR }
     * 
     */
    public ArrayOfFAILSCRENTR createArrayOfFAILSCRENTR() {
        return new ArrayOfFAILSCRENTR();
    }

    /**
     * Create an instance of {@link ArrayOfDELQSCRENTR }
     * 
     */
    public ArrayOfDELQSCRENTR createArrayOfDELQSCRENTR() {
        return new ArrayOfDELQSCRENTR();
    }

    /**
     * Create an instance of {@link SCRGRP6 }
     * 
     */
    public SCRGRP6 createSCRGRP6() {
        return new SCRGRP6();
    }

    /**
     * Create an instance of {@link FAILSCRENTR2 }
     * 
     */
    public FAILSCRENTR2 createFAILSCRENTR2() {
        return new FAILSCRENTR2();
    }

    /**
     * Create an instance of {@link MONPRODRS }
     * 
     */
    public MONPRODRS createMONPRODRS() {
        return new MONPRODRS();
    }

    /**
     * Create an instance of {@link DELQSCRENTR }
     * 
     */
    public DELQSCRENTR createDELQSCRENTR() {
        return new DELQSCRENTR();
    }

    /**
     * Create an instance of {@link SIGNONMSGSRSV1 }
     * 
     */
    public SIGNONMSGSRSV1 createSIGNONMSGSRSV1() {
        return new SIGNONMSGSRSV1();
    }

    /**
     * Create an instance of {@link NTFCRS }
     * 
     */
    public NTFCRS createNTFCRS() {
        return new NTFCRS();
    }

    /**
     * Create an instance of {@link GLBLFAILSCRENTR }
     * 
     */
    public GLBLFAILSCRENTR createGLBLFAILSCRENTR() {
        return new GLBLFAILSCRENTR();
    }

    /**
     * Create an instance of {@link FAILSCRENTR }
     * 
     */
    public FAILSCRENTR createFAILSCRENTR() {
        return new FAILSCRENTR();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
    }

    /**
     * Create an instance of {@link GETNTFCTRNRS }
     * 
     */
    public GETNTFCTRNRS createGETNTFCTRNRS() {
        return new GETNTFCTRNRS();
    }

    /**
     * Create an instance of {@link WsGetNotificationsResponse }
     * 
     */
    public WsGetNotificationsResponse createWsGetNotificationsResponse() {
        return new WsGetNotificationsResponse();
    }

    /**
     * Create an instance of {@link REGNRS }
     * 
     */
    public REGNRS createREGNRS() {
        return new REGNRS();
    }

    /**
     * Create an instance of {@link DGX }
     * 
     */
    public DGX createDGX() {
        return new DGX();
    }

    /**
     * Create an instance of {@link ArrayOfMONPRODRS }
     * 
     */
    public ArrayOfMONPRODRS createArrayOfMONPRODRS() {
        return new ArrayOfMONPRODRS();
    }

    /**
     * Create an instance of {@link ArrayOfREGNRS }
     * 
     */
    public ArrayOfREGNRS createArrayOfREGNRS() {
        return new ArrayOfREGNRS();
    }

    /**
     * Create an instance of {@link ArrayOfDELQSCRENTR2 }
     * 
     */
    public ArrayOfDELQSCRENTR2 createArrayOfDELQSCRENTR2() {
        return new ArrayOfDELQSCRENTR2();
    }

    /**
     * Create an instance of {@link SCRGRP2 }
     * 
     */
    public SCRGRP2 createSCRGRP2() {
        return new SCRGRP2();
    }

    /**
     * Create an instance of {@link SCRGRP4 }
     * 
     */
    public SCRGRP4 createSCRGRP4() {
        return new SCRGRP4();
    }

    /**
     * Create an instance of {@link GetNotificationsRequest }
     * 
     */
    public GetNotificationsRequest createGetNotificationsRequest() {
        return new GetNotificationsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfPFLRS }
     * 
     */
    public ArrayOfPFLRS createArrayOfPFLRS() {
        return new ArrayOfPFLRS();
    }

    /**
     * Create an instance of {@link ArrayOfGLBLFAILSCRENTR }
     * 
     */
    public ArrayOfGLBLFAILSCRENTR createArrayOfGLBLFAILSCRENTR() {
        return new ArrayOfGLBLFAILSCRENTR();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetNotifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3", name = "ws_GetNotifications")
    public JAXBElement<WsGetNotifications> createWsGetNotifications(WsGetNotifications value) {
        return new JAXBElement<WsGetNotifications>(_WsGetNotifications_QNAME, WsGetNotifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetNotificationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetNotifications_V3/wsp_GetNotifications_V3", name = "ws_GetNotificationsResponse")
    public JAXBElement<WsGetNotificationsResponse> createWsGetNotificationsResponse(WsGetNotificationsResponse value) {
        return new JAXBElement<WsGetNotificationsResponse>(_WsGetNotificationsResponse_QNAME, WsGetNotificationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSMESSAGE(String value) {
        return new JAXBElement<String>(_STATUSMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSTECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUSTECHMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSSUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUSSUPPORTMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6ASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6INDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6INDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6SCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6SCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6NATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6INDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6SCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6ELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6SCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6SCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6ALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP6 .class)
    public JAXBElement<String> createSCRGRP6DEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP6 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DTSERVER", scope = SONRS.class)
    public JAXBElement<String> createSONRSDTSERVER(String value) {
        return new JAXBElement<String>(_SONRSDTSERVER_QNAME, String.class, SONRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LANGUAGE", scope = SONRS.class)
    public JAXBElement<String> createSONRSLANGUAGE(String value) {
        return new JAXBElement<String>(_SONRSLANGUAGE_QNAME, String.class, SONRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPFLRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PFLRS", scope = USERRS.class)
    public JAXBElement<ArrayOfPFLRS> createUSERRSPFLRS(ArrayOfPFLRS value) {
        return new JAXBElement<ArrayOfPFLRS>(_USERRSPFLRS_QNAME, ArrayOfPFLRS.class, USERRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERID", scope = USERRS.class)
    public JAXBElement<String> createUSERRSUSERID(String value) {
        return new JAXBElement<String>(_USERRSUSERID_QNAME, String.class, USERRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITNG_ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSITNGASET(String value) {
        return new JAXBElement<String>(_MONPRODRSITNGASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTAT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTAT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GROS_INCM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSGROSINCM(String value) {
        return new JAXBElement<String>(_MONPRODRSGROSINCM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_NORM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPAYDNORM(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYDNORM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_LGL_EVNT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFINLLGLEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLLGLEVNTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTEMPL(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAX_NBR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAXNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSFAXNBR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REST_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSRESTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSRESTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSNATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIGH_CR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSHIGHCR(String value) {
        return new JAXBElement<String>(_MONPRODRSHIGHCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPOSTTOWN(String value) {
        return new JAXBElement<String>(_MONPRODRSPOSTTOWN_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_TYPE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFLNGTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGTYPE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOCN_STAT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLOCNSTAT(String value) {
        return new JAXBElement<String>(_MONPRODRSLOCNSTAT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PMT_SUMM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPMTSUMM(String value) {
        return new JAXBElement<String>(_MONPRODRSPMTSUMM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CNGL_DIST_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCNGLDISTCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCNGLDISTCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STRT_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTRTYR(String value) {
        return new JAXBElement<String>(_MONPRODRSSTRTYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBAR_CNT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDBARCNT(String value) {
        return new JAXBElement<String>(_MONPRODRSDBARCNT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC_TYPE_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSADDLSICTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSICTYPECD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_PNT_DUNS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDOMULTPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTPNTDUNS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTIVITY_TEXT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSACTIVITYTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSACTIVITYTEXT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSHQNME(String value) {
        return new JAXBElement<String>(_MONPRODRSHQNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NET_INCM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSNETINCM(String value) {
        return new JAXBElement<String>(_MONPRODRSNETINCM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPRG_SPEC_EVNT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSOPRGSPECEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOPRGSPECEVNTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ESTD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSESTDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SML_BUS_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSMLBUSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSMLBUSIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_VOL_TEXT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSANNSALEVOLTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEVOLTEXT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_TEXT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTEMPLTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLTEXT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGLBLFAILSCRENTR2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_FAIL_SCR_ENTR", scope = MONPRODRS.class)
    public JAXBElement<ArrayOfGLBLFAILSCRENTR2> createMONPRODRSGLBLFAILSCRENTR(ArrayOfGLBLFAILSCRENTR2 value) {
        return new JAXBElement<ArrayOfGLBLFAILSCRENTR2>(_MONPRODRSGLBLFAILSCRENTR_QNAME, ArrayOfGLBLFAILSCRENTR2 .class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CURR_CNTL_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCURRCNTLYR(String value) {
        return new JAXBElement<String>(_MONPRODRSCURRCNTLYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEO_TITL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCEOTITL(String value) {
        return new JAXBElement<String>(_MONPRODRSCEOTITL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDUNSNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSDUNSNBR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FCST_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFCSTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFCSTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCAPLCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_VOL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSANNSALEVOL(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEVOL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDELQSCRENTR2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELQ_SCR_ENTR", scope = MONPRODRS.class)
    public JAXBElement<ArrayOfDELQSCRENTR2> createMONPRODRSDELQSCRENTR(ArrayOfDELQSCRENTR2 value) {
        return new JAXBElement<ArrayOfDELQSCRENTR2>(_MONPRODRSDELQSCRENTR_QNAME, ArrayOfDELQSCRENTR2 .class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBAR_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDBARDT(String value) {
        return new JAXBElement<String>(_MONPRODRSDBARDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DAVD_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDAVDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSDAVDYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_STRU", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSBUSSTRU(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSSTRU_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_CMTY", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCRCMTY(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRCMTY_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_SIC_TYPE_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRIMSICTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMSICTYPECD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXPT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSEXPTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSEXPTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REGN_TYPE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSREGNTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSREGNTYPE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CLM_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCLMIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCLMIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SML_BUS_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSMLBUSYR(String value) {
        return new JAXBElement<String>(_MONPRODRSSMLBUSYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_6_MO_AGO", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCR6MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR6MOAGO_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_CURR_ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTCURRASET(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTCURRASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSADDLSIC(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSIC_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_DUNS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSHQDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSHQDUNS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTANGNETWRTHCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_AMT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCAPLAMT(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLAMT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_12_MO_AGO", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCR12MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR12MOAGO_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSTR_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDSTRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDSTRIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SGND_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSGNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSGNDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPOSTCODE(String value) {
        return new JAXBElement<String>(_MONPRODRSPOSTCODE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRDG_STYL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTRDGSTYL(String value) {
        return new JAXBElement<String>(_MONPRODRSTRDGSTYL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NON_POST_TOWN", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSNONPOSTTOWN(String value) {
        return new JAXBElement<String>(_MONPRODRSNONPOSTTOWN_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRO_FRMA_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPROFRMAIND(String value) {
        return new JAXBElement<String>(_MONPRODRSPROFRMAIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_ESTD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSANNSALEESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEESTDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDSR(String value) {
        return new JAXBElement<String>(_MONPRODRSDSR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_PAY", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSACTPAY(String value) {
        return new JAXBElement<String>(_MONPRODRSACTPAY_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_VAL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFLNGVAL(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGVAL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_ESTD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTEMPLESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLESTDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FIXD_ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFIXDASET(String value) {
        return new JAXBElement<String>(_MONPRODRSFIXDASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_MIN_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTEMPLMININD(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLMININD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_PMT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTPMT(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTPMT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RETN_ERNG", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSRETNERNG(String value) {
        return new JAXBElement<String>(_MONPRODRSRETNERNG_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_PNT_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSGBLULTPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTPNTNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CURR_RATO", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCURRRATO(String value) {
        return new JAXBElement<String>(_MONPRODRSCURRRATO_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMGEOAREA_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINY_OWND_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSMINYOWNDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSMINYOWNDYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CTRY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDOMULTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTCTRYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OTHR_SPEC_EVNT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSOTHRSPECEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOTHRSPECEVNTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_DUNS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTDUNS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_CONS_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSANNSALECONSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALECONSIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_ESTD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSEMPLATPRIMADRESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRESTDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_PNT_DUNS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSGBLULTPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTPNTDUNS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_FROM_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTMTFROMDT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTFROMDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OUT_BUS_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSOUTBUSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOUTBUSIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LT_DBT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLTDBT(String value) {
        return new JAXBElement<String>(_MONPRODRSLTDBT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PFT_BEF_TAX", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPFTBEFTAX(String value) {
        return new JAXBElement<String>(_MONPRODRSPFTBEFTAX_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUDT_QLFN_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSAUDTQLFNIND(String value) {
        return new JAXBElement<String>(_MONPRODRSAUDTQLFNIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COST_OF_SLS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCOSTOFSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSCOSTOFSLS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CTRY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSHQCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSHQCTRYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INTL_DLNG_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINTLDLNGCD(String value) {
        return new JAXBElement<String>(_MONPRODRSINTLDLNGCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVG_HIGH_CR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSAVGHIGHCR(String value) {
        return new JAXBElement<String>(_MONPRODRSAVGHIGHCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_FAIL_SCR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSGLBLFAILSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSGLBLFAILSCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFAILSCRENTR2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_ENTR", scope = MONPRODRS.class)
    public JAXBElement<ArrayOfFAILSCRENTR2> createMONPRODRSFAILSCRENTR(ArrayOfFAILSCRENTR2 value) {
        return new JAXBElement<ArrayOfFAILSCRENTR2>(_MONPRODRSFAILSCRENTR_QNAME, ArrayOfFAILSCRENTR2 .class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_CR_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSMAXCRCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSMAXCRCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCRIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CASH_LIQ_ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCASHLIQASET(String value) {
        return new JAXBElement<String>(_MONPRODRSCASHLIQASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LIAB", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLIAB_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WOMN_OWND_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSWOMNOWNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSWOMNOWNDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BR_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSBRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSBRIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_WRKG_CAPL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPREVWRKGCAPL(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVWRKGCAPL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIVD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDIVD(String value) {
        return new JAXBElement<String>(_MONPRODRSDIVD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WOMN_OWND_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSWOMNOWNDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSWOMNOWNDYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CTRY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPNTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTCTRYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NET_WRTH", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSNETWRTH_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LGL_FORM", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLGLFORM(String value) {
        return new JAXBElement<String>(_MONPRODRSLGLFORM_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR_CMTY", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRSCRCMTY(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCRCMTY_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_NBR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFLNGNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGNBR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUIT_JDGT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSUITJDGTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSUITJDGTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_NATL_PCTG", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCRNATLPCTG(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRNATLPCTG_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSADRLINE(String value) {
        return new JAXBElement<String>(_MONPRODRSADRLINE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_IND_PCTG", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCRINDPCTG(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRINDPCTG_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_CR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSMAXCR(String value) {
        return new JAXBElement<String>(_MONPRODRSMAXCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_OVRD_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFAILSCROVRDCD(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCROVRDCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIST_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSHISTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSHISTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRL_BAL_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTRLBALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTRLBALIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LT_LIAB", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTLTLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLTLIAB_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEO_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCEONME(String value) {
        return new JAXBElement<String>(_MONPRODRSCEONME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIN_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRINNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPRINNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_CTRY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSGBLULTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTCTRYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SLS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSSLS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPEN_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSOPENIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOPENIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DAVD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDAVDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDAVDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_SLS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPREVSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVSLS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCRD_FLNG_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCRDFLNGIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSCRDFLNGIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTLCMNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSTLCMNBR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FNAL_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFNALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFNALIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC_DESC", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSADDLSICDESC(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSICDESC_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUDT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSAUDTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSAUDTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_STMT_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPREVSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVSTMTDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_TENR_TYPE_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSADRTENRTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSADRTENRTYPECD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENQ_DUNS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSENQDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSENQDUNS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_PNT_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDOMULTPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTPNTNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_NME", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRIMNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMNME_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_3_MO_AGO", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPAYD3MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYD3MOAGO_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_TYPE_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCAPLTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLTYPECD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_REC", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSACTREC(String value) {
        return new JAXBElement<String>(_MONPRODRSACTREC_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SRVTID", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSRVTID(String value) {
        return new JAXBElement<String>(_MONPRODRSSRVTID_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_TEXT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTANGNETWRTHTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHTEXT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LIAB_AND_EQY", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTLIABANDEQY(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLIABANDEQY_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_SIC", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRIMSIC(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMSIC_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCTRYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STK", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTK(String value) {
        return new JAXBElement<String>(_MONPRODRSSTK_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRIM_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRIMIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCRIMIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIN_TTL", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPRINTTL(String value) {
        return new JAXBElement<String>(_MONPRODRSPRINTTL_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LBR_SPLS_AREA_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLBRSPLSAREAYR(String value) {
        return new JAXBElement<String>(_MONPRODRSLBRSPLSAREAYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_CURR_LIAB", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTCURRLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTCURRLIAB_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LBR_SPLS_AREA_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLBRSPLSAREAIND(String value) {
        return new JAXBElement<String>(_MONPRODRSLBRSPLSAREAIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_TEXT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSEMPLATPRIMADRTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRTEXT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTASET(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UBAL_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSUBALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSUBALIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTOTEMPLIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_NET_WRTH", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPREVNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVNETWRTH_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFLNGCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASET", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSASET(String value) {
        return new JAXBElement<String>(_MONPRODRSASET_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_REGN_NBR_TYPE_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSBUSREGNNBRTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSREGNNBRTYPECD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR_CLAS", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRSCRCLAS(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCRCLAS_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_ESTD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTANGNETWRTHESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHESTDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSANNSALECRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALECRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_EMBT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFINLEMBTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLEMBTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DNB_RATG", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDNBRATG(String value) {
        return new JAXBElement<String>(_MONPRODRSDNBRATG_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INCN_YR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINCNYR(String value) {
        return new JAXBElement<String>(_MONPRODRSINCNYR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LCL_ACTV_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLCLACTVCD(String value) {
        return new JAXBElement<String>(_MONPRODRSLCLACTVCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_MIN_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSEMPLATPRIMADRMININD(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRMININD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_TO_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTMTTODT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTTODT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NBR_NEG_PMT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSNBRNEGPMT(String value) {
        return new JAXBElement<String>(_MONPRODRSNBRNEGPMT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBTR_IN_POSN_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDBTRINPOSNIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDBTRINPOSNIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_STMT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFINLSTMT(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLSTMT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CONS_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCONSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCONSIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSTANGNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTH_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CACHE_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSCACHEIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCACHEIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINY_OWND_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSMINYOWNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSMINYOWNDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INCM_STMT_DT", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSINCMSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSINCMSTMTDT_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FISC_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSFISCIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFISCIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_REGN_NBR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSBUSREGNNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSREGNNBR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IMPT_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSIMPTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSIMPTIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_CRCY_CD", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSTMTCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTCRCYCD_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_SCR", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSPAYDSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYDSCR_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCDY_GEO_AREA", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSCDYGEOAREA(String value) {
        return new JAXBElement<String>(_MONPRODRSSCDYGEOAREA_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LCL_ACTV_CD_TYPE", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSLCLACTVCDTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSLCLACTVCDTYPE_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SD_IND", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSSDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSDIND_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QK_RATO", scope = MONPRODRS.class)
    public JAXBElement<String> createMONPRODRSQKRATO(String value) {
        return new JAXBElement<String>(_MONPRODRSQKRATO_QNAME, String.class, MONPRODRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTAT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTAT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_LGL_EVNT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFINLLGLEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLLGLEVNTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAX_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAXNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSFAXNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_CITY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTCITYCD(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTCITYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSNATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CITY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTCITYCD(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTCITYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CTRY_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTCTRYNME(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTCTRYNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_TYPE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFLNGTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGTYPE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOCN_STAT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLOCNSTAT(String value) {
        return new JAXBElement<String>(_MONPRODRSLOCNSTAT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CNGL_DIST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCNGLDISTCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCNGLDISTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC_TYPE_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSADDLSICTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSICTYPECD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBAR_CNT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDBARCNT(String value) {
        return new JAXBElement<String>(_MONPRODRSDBARCNT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NET_INCM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSNETINCM(String value) {
        return new JAXBElement<String>(_MONPRODRSNETINCM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQNME(String value) {
        return new JAXBElement<String>(_MONPRODRSHQNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPRG_SPEC_EVNT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSOPRGSPECEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOPRGSPECEVNTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ESTD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSESTDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_VOL_TEXT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSANNSALEVOLTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEVOLTEXT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SML_BUS_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSMLBUSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSMLBUSIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SRC_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSRCDT(String value) {
        return new JAXBElement<String>(_NTFCRSSRCDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_TEXT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTEMPLTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLTEXT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FCST_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFCSTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFCSTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEO_TITL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCEOTITL(String value) {
        return new JAXBElement<String>(_MONPRODRSCEOTITL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CURR_CNTL_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCURRCNTLYR(String value) {
        return new JAXBElement<String>(_MONPRODRSCURRCNTLYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_VOL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSANNSALEVOL(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEVOL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDELQSCRENTR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DELQ_SCR_ENTR", scope = NTFCRS.class)
    public JAXBElement<ArrayOfDELQSCRENTR> createNTFCRSDELQSCRENTR(ArrayOfDELQSCRENTR value) {
        return new JAXBElement<ArrayOfDELQSCRENTR>(_MONPRODRSDELQSCRENTR_QNAME, ArrayOfDELQSCRENTR.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBAR_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDBARDT(String value) {
        return new JAXBElement<String>(_MONPRODRSDBARDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_STR_ADR1", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTSTRADR1(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTSTRADR1_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SML_BUS_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSMLBUSYR(String value) {
        return new JAXBElement<String>(_MONPRODRSSMLBUSYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_STR_ADR2", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTSTRADR2(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTSTRADR2_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_DUNS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSHQDUNS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTANGNETWRTHCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SGND_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSGNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSGNDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRDG_STYL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTRDGSTYL(String value) {
        return new JAXBElement<String>(_MONPRODRSTRDGSTYL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_DUNS_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTDUNSNBR(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTDUNSNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_POST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTPOSTCD(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTPOSTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_ESTD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSANNSALEESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALEESTDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRO_FRMA_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPROFRMAIND(String value) {
        return new JAXBElement<String>(_MONPRODRSPROFRMAIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_POST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTPOSTCD(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTPOSTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_PMT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTPMT(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTPMT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RETN_ERNG", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSRETNERNG(String value) {
        return new JAXBElement<String>(_MONPRODRSRETNERNG_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_PNT_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGBLULTPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTPNTNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_STATE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTSTATE(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTSTATE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMGEOAREA_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CURR_RATO", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCURRRATO(String value) {
        return new JAXBElement<String>(_MONPRODRSCURRRATO_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_POST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQPOSTCD(String value) {
        return new JAXBElement<String>(_NTFCRSHQPOSTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_STATE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTSTATE(String value) {
        return new JAXBElement<String>(_NTFCRSPNTSTATE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_CONS_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSANNSALECONSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALECONSIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_DUNS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTDUNS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OUT_BUS_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSOUTBUSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOUTBUSIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_FROM_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTMTFROMDT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTFROMDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_DUNS_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQDUNSNBR(String value) {
        return new JAXBElement<String>(_NTFCRSHQDUNSNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LT_DBT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLTDBT(String value) {
        return new JAXBElement<String>(_MONPRODRSLTDBT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CITY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQCITYCD(String value) {
        return new JAXBElement<String>(_NTFCRSHQCITYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSHQCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "COST_OF_SLS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCOSTOFSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSCOSTOFSLS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCTRYNME(String value) {
        return new JAXBElement<String>(_NTFCRSCTRYNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUBS_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSUBSCD(String value) {
        return new JAXBElement<String>(_NTFCRSSUBSCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AVG_HIGH_CR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSAVGHIGHCR(String value) {
        return new JAXBElement<String>(_MONPRODRSAVGHIGHCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_CR_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSMAXCRCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSMAXCRCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCRIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_POST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTPOSTCD(String value) {
        return new JAXBElement<String>(_NTFCRSPNTPOSTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_ENQ", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDUNSENQ(String value) {
        return new JAXBElement<String>(_NTFCRSDUNSENQ_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BR_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSBRIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CNTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTCNTYCD(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTCNTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTCTRYCD(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NET_WRTH", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSNETWRTH_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_BUS_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTBUSNME(String value) {
        return new JAXBElement<String>(_NTFCRSPNTBUSNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LGL_FORM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLGLFORM(String value) {
        return new JAXBElement<String>(_MONPRODRSLGLFORM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR_CMTY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRSCRCMTY(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCRCMTY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUIT_JDGT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSUITJDGTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSUITJDGTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_NATL_PCTG", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCRNATLPCTG(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRNATLPCTG_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CTRY_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTCTRYNME(String value) {
        return new JAXBElement<String>(_NTFCRSPNTCTRYNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_CITY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTCITY(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTCITY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_OVRD_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCROVRDCD(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCROVRDCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBUSNME(String value) {
        return new JAXBElement<String>(_NTFCRSBUSNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIN_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRINNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPRINNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OPEN_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSOPENIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOPENIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DAVD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDAVDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDAVDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTLCMNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSTLCMNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_STR_ADR1", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTSTRADR1(String value) {
        return new JAXBElement<String>(_NTFCRSPNTSTRADR1_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_STR_ADR2", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTSTRADR2(String value) {
        return new JAXBElement<String>(_NTFCRSPNTSTRADR2_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC_DESC", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSADDLSICDESC(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSICDESC_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_STMT_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPREVSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVSTMTDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_TENR_TYPE_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSADRTENRTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSADRTENRTYPECD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_DUNS_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTDUNSNBR(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTDUNSNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_PNT_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTPNTNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_STRUC_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBUSSTRUCCD(String value) {
        return new JAXBElement<String>(_NTFCRSBUSSTRUCCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_SIC", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRIMSIC(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMSIC_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LIAB_AND_EQY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTLIABANDEQY(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLIABANDEQY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CITY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCITY(String value) {
        return new JAXBElement<String>(_NTFCRSCITY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STK", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTK(String value) {
        return new JAXBElement<String>(_MONPRODRSSTK_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIN_TTL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRINTTL(String value) {
        return new JAXBElement<String>(_MONPRODRSPRINTTL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_CURR_LIAB", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTCURRLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTCURRLIAB_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LBR_SPLS_AREA_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLBRSPLSAREAYR(String value) {
        return new JAXBElement<String>(_MONPRODRSLBRSPLSAREAYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTATE(String value) {
        return new JAXBElement<String>(_NTFCRSSTATE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_TEXT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSEMPLATPRIMADRTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRTEXT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_NET_WRTH", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPREVNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVNETWRTH_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UBAL_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSUBALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSUBALIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OOB_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSOOBIND(String value) {
        return new JAXBElement<String>(_NTFCRSOOBIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFLNGCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSASET(String value) {
        return new JAXBElement<String>(_MONPRODRSASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STR_ADR2", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTRADR2(String value) {
        return new JAXBElement<String>(_NTFCRSSTRADR2_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_REGN_NBR_TYPE_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBUSREGNNBRTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSREGNNBRTYPECD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STR_ADR1", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTRADR1(String value) {
        return new JAXBElement<String>(_NTFCRSSTRADR1_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR_CLAS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRSCRCLAS(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCRCLAS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_ESTD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTANGNETWRTHESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHESTDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_STATE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTSTATE(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTSTATE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CITY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTCITY(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTCITY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INCN_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINCNYR(String value) {
        return new JAXBElement<String>(_MONPRODRSINCNYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LCL_ACTV_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLCLACTVCD(String value) {
        return new JAXBElement<String>(_MONPRODRSLCLACTVCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSEMPLATPRIMADR(String value) {
        return new JAXBElement<String>(_NTFCRSEMPLATPRIMADR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CNTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTCNTYCD(String value) {
        return new JAXBElement<String>(_NTFCRSPNTCNTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_STMT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFINLSTMT(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLSTMT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INCM_STMT_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINCMSTMTDT(String value) {
        return new JAXBElement<String>(_MONPRODRSINCMSTMTDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINY_OWND_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSMINYOWNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSMINYOWNDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IMPT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSIMPTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSIMPTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_SCR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPAYDSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYDSCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ITNG_ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSITNGASET(String value) {
        return new JAXBElement<String>(_MONPRODRSITNGASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GROS_INCM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGROSINCM(String value) {
        return new JAXBElement<String>(_MONPRODRSGROSINCM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_NORM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPAYDNORM(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYDNORM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTEMPL(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REST_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSRESTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSRESTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_DUNS_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTDUNSNBR(String value) {
        return new JAXBElement<String>(_NTFCRSPNTDUNSNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_STATE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQSTATE(String value) {
        return new JAXBElement<String>(_NTFCRSHQSTATE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIGH_CR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHIGHCR(String value) {
        return new JAXBElement<String>(_MONPRODRSHIGHCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPOSTTOWN(String value) {
        return new JAXBElement<String>(_MONPRODRSPOSTTOWN_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PMT_SUMM", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPMTSUMM(String value) {
        return new JAXBElement<String>(_MONPRODRSPMTSUMM_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STRT_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTRTYR(String value) {
        return new JAXBElement<String>(_MONPRODRSSTRTYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_PNT_DUNS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTPNTDUNS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTIVITY_TEXT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSACTIVITYTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSACTIVITYTEXT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGLBLFAILSCRENTR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_FAIL_SCR_ENTR", scope = NTFCRS.class)
    public JAXBElement<ArrayOfGLBLFAILSCRENTR> createNTFCRSGLBLFAILSCRENTR(ArrayOfGLBLFAILSCRENTR value) {
        return new JAXBElement<ArrayOfGLBLFAILSCRENTR>(_MONPRODRSGLBLFAILSCRENTR_QNAME, ArrayOfGLBLFAILSCRENTR.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDUNSNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSDUNSNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCAPLCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_CMTY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCRCMTY(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRCMTY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DAVD_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDAVDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSDAVDYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_STRU", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBUSSTRU(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSSTRU_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_SIC_TYPE_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRIMSICTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMSICTYPECD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXPT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSEXPTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSEXPTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REGN_TYPE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSREGNTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSREGNTYPE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CLM_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCLMIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCLMIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_6_MO_AGO", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCR6MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR6MOAGO_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_SIC", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSADDLSIC(String value) {
        return new JAXBElement<String>(_MONPRODRSADDLSIC_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_CURR_ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTCURRASET(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTCURRASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_AMT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCAPLAMT(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLAMT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_12_MO_AGO", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCR12MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCR12MOAGO_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSTR_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDSTRIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDSTRIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CNTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQCNTYCD(String value) {
        return new JAXBElement<String>(_NTFCRSHQCNTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CNTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCNTYCD(String value) {
        return new JAXBElement<String>(_NTFCRSCNTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPOSTCODE(String value) {
        return new JAXBElement<String>(_MONPRODRSPOSTCODE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NON_POST_TOWN", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSNONPOSTTOWN(String value) {
        return new JAXBElement<String>(_MONPRODRSNONPOSTTOWN_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_CTRY_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTCTRYNME(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTCTRYNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDSR(String value) {
        return new JAXBElement<String>(_MONPRODRSDSR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_STR_ADR1", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQSTRADR1(String value) {
        return new JAXBElement<String>(_NTFCRSHQSTRADR1_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_PAY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSACTPAY(String value) {
        return new JAXBElement<String>(_MONPRODRSACTPAY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_STR_ADR2", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQSTRADR2(String value) {
        return new JAXBElement<String>(_NTFCRSHQSTRADR2_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_VAL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFLNGVAL(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGVAL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_ESTD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTEMPLESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLESTDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FIXD_ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFIXDASET(String value) {
        return new JAXBElement<String>(_MONPRODRSFIXDASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CR_SCR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSCRSCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_MIN_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTEMPLMININD(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLMININD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPOSTCD(String value) {
        return new JAXBElement<String>(_NTFCRSPOSTCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSDOMULTCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MINY_OWND_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSMINYOWNDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSMINYOWNDYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CITY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCITYCD(String value) {
        return new JAXBElement<String>(_NTFCRSCITYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OTHR_SPEC_EVNT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSOTHRSPECEVNTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSOTHRSPECEVNTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_PNT_DUNS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGBLULTPNTDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTPNTDUNS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_ESTD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSEMPLATPRIMADRESTDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRESTDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPNTNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUDT_QLFN_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSAUDTQLFNIND(String value) {
        return new JAXBElement<String>(_MONPRODRSAUDTQLFNIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PFT_BEF_TAX", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPFTBEFTAX(String value) {
        return new JAXBElement<String>(_MONPRODRSPFTBEFTAX_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INTL_DLNG_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINTLDLNGCD(String value) {
        return new JAXBElement<String>(_MONPRODRSINTLDLNGCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_FAIL_SCR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLFAILSCR(String value) {
        return new JAXBElement<String>(_MONPRODRSGLBLFAILSCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFAILSCRENTR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_ENTR", scope = NTFCRS.class)
    public JAXBElement<ArrayOfFAILSCRENTR> createNTFCRSFAILSCRENTR(ArrayOfFAILSCRENTR value) {
        return new JAXBElement<ArrayOfFAILSCRENTR>(_MONPRODRSFAILSCRENTR_QNAME, ArrayOfFAILSCRENTR.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_STR_ADR1", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTSTRADR1(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTSTRADR1_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_STR_ADR2", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTSTRADR2(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTSTRADR2_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CASH_LIQ_ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCASHLIQASET(String value) {
        return new JAXBElement<String>(_MONPRODRSCASHLIQASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CTRY_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQCTRYNME(String value) {
        return new JAXBElement<String>(_NTFCRSHQCTRYNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LIAB", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLIAB_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CITY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTCITYCD(String value) {
        return new JAXBElement<String>(_NTFCRSPNTCITYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WOMN_OWND_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSWOMNOWNDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSWOMNOWNDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DIVD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDIVD(String value) {
        return new JAXBElement<String>(_MONPRODRSDIVD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_WRKG_CAPL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPREVWRKGCAPL(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVWRKGCAPL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "WOMN_OWND_YR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSWOMNOWNDYR(String value) {
        return new JAXBElement<String>(_MONPRODRSWOMNOWNDYR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FLNG_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFLNGNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSFLNGNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MAX_CR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSMAXCR(String value) {
        return new JAXBElement<String>(_MONPRODRSMAXCR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FAIL_SCR_IND_PCTG", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFAILSCRINDPCTG(String value) {
        return new JAXBElement<String>(_MONPRODRSFAILSCRINDPCTG_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSADRLINE(String value) {
        return new JAXBElement<String>(_MONPRODRSADRLINE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRL_BAL_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTRLBALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTRLBALIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HIST_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHISTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSHISTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_LT_LIAB", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTLTLIAB(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTLTLIAB_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEO_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCEONME(String value) {
        return new JAXBElement<String>(_MONPRODRSCEONME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GBL_ULT_CTRY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGBLULTCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSGBLULTCTRYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SLS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSSLS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PREV_SLS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPREVSLS(String value) {
        return new JAXBElement<String>(_MONPRODRSPREVSLS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCRD_FLNG_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCRDFLNGIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSCRDFLNGIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSINDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FNAL_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFNALIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFNALIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_BUS_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQBUSNME(String value) {
        return new JAXBElement<String>(_NTFCRSHQBUSNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUDT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSAUDTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSAUDTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOM_ULT_BUS_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDOMULTBUSNME(String value) {
        return new JAXBElement<String>(_NTFCRSDOMULTBUSNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ENQ_DUNS", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSENQDUNS(String value) {
        return new JAXBElement<String>(_MONPRODRSENQDUNS_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPRIMNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PAYD_3_MO_AGO", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPAYD3MOAGO(String value) {
        return new JAXBElement<String>(_MONPRODRSPAYD3MOAGO_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CAPL_TYPE_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCAPLTYPECD(String value) {
        return new JAXBElement<String>(_MONPRODRSCAPLTYPECD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_BUS_NME", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTBUSNME(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTBUSNME_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACT_REC", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSACTREC(String value) {
        return new JAXBElement<String>(_MONPRODRSACTREC_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH_TEXT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTANGNETWRTHTEXT(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTHTEXT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SRVTID", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSRVTID(String value) {
        return new JAXBElement<String>(_MONPRODRSSRVTID_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRIM_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRIMIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCRIMIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LBR_SPLS_AREA_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLBRSPLSAREAIND(String value) {
        return new JAXBElement<String>(_MONPRODRSLBRSPLSAREAIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_ASET", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTASET(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTASET_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TOT_EMPL_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTOTEMPLIND(String value) {
        return new JAXBElement<String>(_MONPRODRSTOTEMPLIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBL_ULT_CNTY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSGLBLULTCNTYCD(String value) {
        return new JAXBElement<String>(_NTFCRSGLBLULTCNTYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANN_SALE_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSANNSALECRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSANNSALECRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_EMBT_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFINLEMBTIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFINLEMBTIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DNB_RATG", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDNBRATG(String value) {
        return new JAXBElement<String>(_MONPRODRSDNBRATG_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DETECT_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDETECTDT(String value) {
        return new JAXBElement<String>(_NTFCRSDETECTDT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EMPL_AT_PRIM_ADR_MIN_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSEMPLATPRIMADRMININD(String value) {
        return new JAXBElement<String>(_MONPRODRSEMPLATPRIMADRMININD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_CITY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSHQCITY(String value) {
        return new JAXBElement<String>(_NTFCRSHQCITY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NBR_NEG_PMT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSNBRNEGPMT(String value) {
        return new JAXBElement<String>(_MONPRODRSNBRNEGPMT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_TO_DT", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTMTTODT(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTTODT_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DBTR_IN_POSN_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSDBTRINPOSNIND(String value) {
        return new JAXBElement<String>(_MONPRODRSDBTRINPOSNIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CONS_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCONSIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCONSIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TANG_NET_WRTH", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSTANGNETWRTH(String value) {
        return new JAXBElement<String>(_MONPRODRSTANGNETWRTH_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CACHE_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSCACHEIND(String value) {
        return new JAXBElement<String>(_MONPRODRSCACHEIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PNT_CITY", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSPNTCITY(String value) {
        return new JAXBElement<String>(_NTFCRSPNTCITY_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FISC_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSFISCIND(String value) {
        return new JAXBElement<String>(_MONPRODRSFISCIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BUS_REGN_NBR", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSBUSREGNNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSBUSREGNNBR_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STMT_CRCY_CD", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSTMTCRCYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSSTMTCRCYCD_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCDY_GEO_AREA", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSCDYGEOAREA(String value) {
        return new JAXBElement<String>(_MONPRODRSSCDYGEOAREA_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LCL_ACTV_CD_TYPE", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSLCLACTVCDTYPE(String value) {
        return new JAXBElement<String>(_MONPRODRSLCLACTVCDTYPE_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "QK_RATO", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSQKRATO(String value) {
        return new JAXBElement<String>(_MONPRODRSQKRATO_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SD_IND", scope = NTFCRS.class)
    public JAXBElement<String> createNTFCRSSDIND(String value) {
        return new JAXBElement<String>(_MONPRODRSSDIND_QNAME, String.class, NTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = GETNTFCTRNRS.class)
    public JAXBElement<String> createGETNTFCTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_GETNTFCTRNRSTRNUID_QNAME, String.class, GETNTFCTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETNTFCRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GETNTFCRS", scope = GETNTFCTRNRS.class)
    public JAXBElement<GETNTFCRS> createGETNTFCTRNRSGETNTFCRS(GETNTFCRS value) {
        return new JAXBElement<GETNTFCRS>(_GETNTFCTRNRSGETNTFCRS_QNAME, GETNTFCRS.class, GETNTFCTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = GETNTFCTRNRS.class)
    public JAXBElement<String> createGETNTFCTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_GETNTFCTRNRSRSLTTKT_QNAME, String.class, GETNTFCTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = GETNTFCTRNRS.class)
    public JAXBElement<STATUS2> createGETNTFCTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_GETNTFCTRNRSSTATUS_QNAME, STATUS2 .class, GETNTFCTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2MESSAGE(String value) {
        return new JAXBElement<String>(_STATUSMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEVERITY", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2SEVERITY(String value) {
        return new JAXBElement<String>(_STATUS2SEVERITY_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2TECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUSTECHMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2SUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUSSUPPORTMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CODE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2CODE(String value) {
        return new JAXBElement<String>(_STATUS2CODE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3ASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3INDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3INDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3SCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3SCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3NATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3INDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3SCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3ELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3SCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3SCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3ALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP3 .class)
    public JAXBElement<String> createSCRGRP3DEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USERRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERRS", scope = GETNTFCRS.class)
    public JAXBElement<USERRS> createGETNTFCRSUSERRS(USERRS value) {
        return new JAXBElement<USERRS>(_GETNTFCRSUSERRS_QNAME, USERRS.class, GETNTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQ_ID", scope = GETNTFCRS.class)
    public JAXBElement<String> createGETNTFCRSREQID(String value) {
        return new JAXBElement<String>(_GETNTFCRSREQID_QNAME, String.class, GETNTFCRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSDUNSNBR(String value) {
        return new JAXBElement<String>(_MONPRODRSDUNSNBR_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUST_ACCT_ID", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSCUSTACCTID(String value) {
        return new JAXBElement<String>(_REGNRSCUSTACCTID_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSCTRYCD(String value) {
        return new JAXBElement<String>(_MONPRODRSCTRYCD_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMONPRODRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MON_PROD_RS", scope = REGNRS.class)
    public JAXBElement<ArrayOfMONPRODRS> createREGNRSMONPRODRS(ArrayOfMONPRODRS value) {
        return new JAXBElement<ArrayOfMONPRODRS>(_REGNRSMONPRODRS_QNAME, ArrayOfMONPRODRS.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUST_ENDR", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSCUSTENDR(String value) {
        return new JAXBElement<String>(_REGNRSCUSTENDR_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTFCRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NTFCRS", scope = REGNRS.class)
    public JAXBElement<ArrayOfNTFCRS> createREGNRSNTFCRS(ArrayOfNTFCRS value) {
        return new JAXBElement<ArrayOfNTFCRS>(_REGNRSNTFCRS_QNAME, ArrayOfNTFCRS.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_NME", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSPRIMNME(String value) {
        return new JAXBElement<String>(_MONPRODRSPRIMNME_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GLBLMNSVCMSGSRSV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBLMNSVCMSGSRSV1", scope = DGX.class)
    public JAXBElement<GLBLMNSVCMSGSRSV1> createDGXGLBLMNSVCMSGSRSV1(GLBLMNSVCMSGSRSV1 value) {
        return new JAXBElement<GLBLMNSVCMSGSRSV1>(_DGXGLBLMNSVCMSGSRSV1_QNAME, GLBLMNSVCMSGSRSV1 .class, DGX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4ASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4INDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4INDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4SCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4SCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4NATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4INDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4SCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4ELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4SCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4SCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4ALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP4 .class)
    public JAXBElement<String> createSCRGRP4DEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP4 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2ASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2INDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2INDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2SCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2SCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2NATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2INDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2SCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2ELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2SCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2SCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2ALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP2 .class)
    public JAXBElement<String> createSCRGRP2DEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "socCode", scope = GetNotificationsRequest.class)
    public JAXBElement<SocCode> createGetNotificationsRequestSocCode(SocCode value) {
        return new JAXBElement<SocCode>(_GetNotificationsRequestSocCode_QNAME, SocCode.class, GetNotificationsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Do_not_Mark_as_Read", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataDoNotMarkAsRead(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataDoNotMarkAsRead_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataDnBDUNSNumber_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataCustomerAccountID_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Received_Date_From", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataReceivedDateFrom(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataReceivedDateFrom_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Product_Name", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataProductName(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataProductName_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataCharacterSetOverride_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Received_Date_To", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataReceivedDateTo(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataReceivedDateTo_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pending_Notices_only", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataPendingNoticesOnly(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataPendingNoticesOnly_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataEndorsement(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataEndorsement_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataCountryCode(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataCountryCode_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Active_Registrations_only", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataActiveRegistrationsOnly(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataActiveRegistrationsOnly_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataNotificationLevel(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataNotificationLevel_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result_Ticket", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataResultTicket(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataResultTicket_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Level", scope = GetNotificationsRequestData.class)
    public JAXBElement<String> createGetNotificationsRequestDataUserLevel(String value) {
        return new JAXBElement<String>(_GetNotificationsRequestDataUserLevel_QNAME, String.class, GetNotificationsRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppVer", scope = SocCode.class)
    public JAXBElement<String> createSocCodeAppVer(String value) {
        return new JAXBElement<String>(_SocCodeAppVer_QNAME, String.class, SocCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AppId", scope = SocCode.class)
    public JAXBElement<String> createSocCodeAppId(String value) {
        return new JAXBElement<String>(_SocCodeAppId_QNAME, String.class, SocCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETNTFCTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GETNTFCTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<GETNTFCTRNRS> createGLBLMNSVCMSGSRSV1GETNTFCTRNRS(GETNTFCTRNRS value) {
        return new JAXBElement<GETNTFCTRNRS>(_GLBLMNSVCMSGSRSV1GETNTFCTRNRS_QNAME, GETNTFCTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfREGNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REGNRS", scope = PFLRS.class)
    public JAXBElement<ArrayOfREGNRS> createPFLRSREGNRS(ArrayOfREGNRS value) {
        return new JAXBElement<ArrayOfREGNRS>(_PFLRSREGNRS_QNAME, ArrayOfREGNRS.class, PFLRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NTFC_LVL", scope = PFLRS.class)
    public JAXBElement<String> createPFLRSNTFCLVL(String value) {
        return new JAXBElement<String>(_PFLRSNTFCLVL_QNAME, String.class, PFLRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROD_NME", scope = PFLRS.class)
    public JAXBElement<String> createPFLRSPRODNME(String value) {
        return new JAXBElement<String>(_PFLRSPRODNME_QNAME, String.class, PFLRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PFL_NME", scope = PFLRS.class)
    public JAXBElement<String> createPFLRSPFLNME(String value) {
        return new JAXBElement<String>(_PFLRSPFLNME_QNAME, String.class, PFLRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5ASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5INDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5INDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5SCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5SCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5NATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5INDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5SCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5ELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5SCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5SCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5ALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP5 .class)
    public JAXBElement<String> createSCRGRP5DEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP5 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ASMT_DT", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPASMTDT(String value) {
        return new JAXBElement<String>(_SCRGRP6ASMTDT_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_PCTL", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPINDSPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSPCTL_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_NORM", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPINDSNORM(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSNORM_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_OVRD_CD", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPSCROVRDCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCROVRDCD_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CMTY_CD", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPSCRCMTYCD(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCMTYCD_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NATL_PCTL", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPNATLPCTL(String value) {
        return new JAXBElement<String>(_SCRGRP6NATLPCTL_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "INDS_DEFU_INDN", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPINDSDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6INDSDEFUINDN_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPSCRCLAS(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRCLAS_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ELE_TAG", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPELETAG(String value) {
        return new JAXBElement<String>(_SCRGRP6ELETAG_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPSCR(String value) {
        return new JAXBElement<String>(_SCRGRP6SCR_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_AGE", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPSCRAGE(String value) {
        return new JAXBElement<String>(_SCRGRP6SCRAGE_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPALGMID(String value) {
        return new JAXBElement<String>(_SCRGRP6ALGMID_QNAME, String.class, SCRGRP.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DEFU_INDN", scope = SCRGRP.class)
    public JAXBElement<String> createSCRGRPDEFUINDN(String value) {
        return new JAXBElement<String>(_SCRGRP6DEFUINDN_QNAME, String.class, SCRGRP.class, value);
    }

}
