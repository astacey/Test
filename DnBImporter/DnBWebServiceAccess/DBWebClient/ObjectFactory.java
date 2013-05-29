
package DBWebClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBWebClient package. 
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

    private final static QName _Exception_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/LookUp", "Exception");
    private final static QName _WsLookUp_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/LookUp", "ws_LookUp");
    private final static QName _WsLookUpResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/LookUp", "ws_LookUpResponse");
    private final static QName _STATUS3MESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _STATUS3SEVERITY_QNAME = new QName("", "SEVERITY");
    private final static QName _STATUS3TECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUS3SUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _STATUS3CODE_QNAME = new QName("", "CODE");
    private final static QName _LOOKUPRSCLOSETOWNBRIND_QNAME = new QName("", "BR_IND");
    private final static QName _LOOKUPRSCLOSETOWNTLCMNBR_QNAME = new QName("", "TLCM_NBR");
    private final static QName _LOOKUPRSCLOSETOWNDUNSNBR_QNAME = new QName("", "DUNS_NBR");
    private final static QName _LOOKUPRSCLOSETOWNINDTIND_QNAME = new QName("", "IN_DT_IND");
    private final static QName _LOOKUPRSCLOSETOWNPOSTTOWN_QNAME = new QName("", "POST_TOWN");
    private final static QName _LOOKUPRSCLOSETOWNADRLINE_QNAME = new QName("", "ADR_LINE");
    private final static QName _LOOKUPRSCLOSETOWNNME_QNAME = new QName("", "NME");
    private final static QName _LOOKUPRSCLOSETOWNPRIMGEOAREA_QNAME = new QName("", "PRIM_GEO_AREA");
    private final static QName _LOOKUPRSCLOSETOWNPOSTCODE_QNAME = new QName("", "POST_CODE");
    private final static QName _LOOKUPRSCLOSETOWNNONPOSTTOWN_QNAME = new QName("", "NON_POST_TOWN");
    private final static QName _LOOKUPRSCLOSETOWNCTRYCD_QNAME = new QName("", "CTRY_CD");
    private final static QName _LOOKUPRSCLOSETOWNDSR_QNAME = new QName("", "DSR");
    private final static QName _LOOKUPRSCLOSETOWNSBRIUMTCAGN_QNAME = new QName("", "SBRI_UMTC_AGN");
    private final static QName _LOOKUPTRNRSFRDRISKSCR_QNAME = new QName("", "FRD_RISK_SCR");
    private final static QName _LOOKUPTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _LOOKUPTRNRSLOOKUPRS_QNAME = new QName("", "LOOKUPRS");
    private final static QName _LOOKUPTRNRSSTATUS_QNAME = new QName("", "STATUS");
    private final static QName _LOOKUPRSCOMPANYNONPOSTTWNPCTGRD_QNAME = new QName("", "NON_POST_TWN_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYTLCMPCTGRD_QNAME = new QName("", "TLCM_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYSTRNMEPCTGRD_QNAME = new QName("", "STR_NME_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYMTCHGRD_QNAME = new QName("", "MTCH_GRD");
    private final static QName _LOOKUPRSCOMPANYSTRNBRPCTGRD_QNAME = new QName("", "STR_NBR_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYMTCHBASS_QNAME = new QName("", "MTCH_BASS");
    private final static QName _LOOKUPRSCOMPANYPROBOFACCR_QNAME = new QName("", "PROB_OF_ACCR");
    private final static QName _LOOKUPRSCOMPANYNMEPCTGRD_QNAME = new QName("", "NME_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYCONFCD_QNAME = new QName("", "CONF_CD");
    private final static QName _LOOKUPRSCOMPANYPRIMGEOAREANBRPCTGRD_QNAME = new QName("", "PRIM_GEO_AREA_NBR_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYPOBOXPCTGRD_QNAME = new QName("", "PO_BOX_PCT_GRD");
    private final static QName _LOOKUPRSCOMPANYTRDGSTYL_QNAME = new QName("", "TRDG_STYL");
    private final static QName _CREDITMSGSRSV2LOOKUPTRNRS_QNAME = new QName("", "LOOKUPTRNRS");
    private final static QName _DGXCREDITMSGSRSV2_QNAME = new QName("", "CREDITMSGSRSV2");
    private final static QName _WsLookUpResponseLookupResponse_QNAME = new QName("", "lookupResponse");
    private final static QName _FDSLOOKUPRSAGNNBR_QNAME = new QName("", "AGN_NBR");
    private final static QName _FDSLOOKUPRSALGMID_QNAME = new QName("", "ALGM_ID");
    private final static QName _FDSLOOKUPRSSCRRSLTINTERPRET_QNAME = new QName("", "SCR_RSLT_INTERPRET");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _LookUpRequestSocCode_QNAME = new QName("", "socCode");
    private final static QName _MTCHBASSENTRCEOIND_QNAME = new QName("", "CEO_IND");
    private final static QName _MTCHBASSENTRENDIND_QNAME = new QName("", "END_IND");
    private final static QName _MTCHBASSENTRSUBJTYPECD_QNAME = new QName("", "SUBJ_TYPE_CD");
    private final static QName _MTCHBASSENTRMTCHBASSCD_QNAME = new QName("", "MTCH_BASS_CD");
    private final static QName _FRDRISKSCRFDSLOOKUPRS_QNAME = new QName("", "FDSLOOKUPRS");
    private final static QName _LOOKUPRSLOOKUPRSCOMPANY_QNAME = new QName("", "LOOKUPRSCOMPANY");
    private final static QName _LOOKUPRSSRVTID_QNAME = new QName("", "SRVTID");
    private final static QName _LOOKUPRSLOOKUPRSCLOSETOWN_QNAME = new QName("", "LOOKUPRSCLOSETOWN");
    private final static QName _LOOKUPRSLOOKUPDUPLICATETOWNRS_QNAME = new QName("", "LOOKUPDUPLICATETOWNRS");
    private final static QName _MTCHBASSMTCHCNT_QNAME = new QName("", "MTCH_CNT");
    private final static QName _MTCHBASSMTCHBASSENTR_QNAME = new QName("", "MTCH_BASS_ENTR");
    private final static QName _SCRRSLTINTERPRETSCRCLASPCTGPOPN_QNAME = new QName("", "SCR_CLAS_PCTG_POPN");
    private final static QName _SCRRSLTINTERPRETREQSTIME_QNAME = new QName("", "REQS_TIME");
    private final static QName _SCRRSLTINTERPRETREAS1CD_QNAME = new QName("", "REAS_1_CD");
    private final static QName _SCRRSLTINTERPRETREAS1CDDESC_QNAME = new QName("", "REAS_1_CD_DESC");
    private final static QName _SCRRSLTINTERPRETREQSDATE_QNAME = new QName("", "REQS_DATE");
    private final static QName _SCRRSLTINTERPRETREAS2CD_QNAME = new QName("", "REAS_2_CD");
    private final static QName _SCRRSLTINTERPRETFRSCRCLAS_QNAME = new QName("", "FR_SCR_CLAS");
    private final static QName _SCRRSLTINTERPRETFRSCR_QNAME = new QName("", "FR_SCR");
    private final static QName _SCRRSLTINTERPRETREAS3CDDESC_QNAME = new QName("", "REAS_3_CD_DESC");
    private final static QName _SCRRSLTINTERPRETSCRMULTFRDRSK_QNAME = new QName("", "SCR_MULT_FRD_RSK");
    private final static QName _SCRRSLTINTERPRETREAS3CD_QNAME = new QName("", "REAS_3_CD");
    private final static QName _SCRRSLTINTERPRETREAS2CDDESC_QNAME = new QName("", "REAS_2_CD_DESC");
    private final static QName _SCRRSLTINTERPRETREAS4CDDESC_QNAME = new QName("", "REAS_4_CD_DESC");
    private final static QName _SCRRSLTINTERPRETSCRCLASPCTGFRD_QNAME = new QName("", "SCR_CLAS_PCTG_FRD");
    private final static QName _SCRRSLTINTERPRETREAS4CD_QNAME = new QName("", "REAS_4_CD");
    private final static QName _SCRRSLTINTERPRETSCRCLASLBL_QNAME = new QName("", "SCR_CLAS_LBL");
    private final static QName _SCRRSLTINTERPRETSCRCLASDESC_QNAME = new QName("", "SCR_CLAS_DESC");
    private final static QName _SocCodeAppVer_QNAME = new QName("", "AppVer");
    private final static QName _SocCodeAppId_QNAME = new QName("", "AppId");
    private final static QName _LookUpInputTelephoneNumber_QNAME = new QName("", "Telephone_Number");
    private final static QName _LookUpInputSearchRuleCode_QNAME = new QName("", "Search_Rule_Code");
    private final static QName _LookUpInputStateOrRegion_QNAME = new QName("", "State_or_Region");
    private final static QName _LookUpInputDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _LookUpInputName_QNAME = new QName("", "Name");
    private final static QName _LookUpInputPostTown_QNAME = new QName("", "PostTown");
    private final static QName _LookUpInputMatchType_QNAME = new QName("", "Match_Type");
    private final static QName _LookUpInputFileId_QNAME = new QName("", "File_Id");
    private final static QName _LookUpInputTown_QNAME = new QName("", "Town");
    private final static QName _LookUpInputBusinessNumber_QNAME = new QName("", "Business_Number");
    private final static QName _LookUpInputMaxResponses_QNAME = new QName("", "Max_Responses");
    private final static QName _LookUpInputStreetAddress_QNAME = new QName("", "Street_Address");
    private final static QName _LookUpInputReasonCode_QNAME = new QName("", "Reason_Code");
    private final static QName _LookUpInputPostCode_QNAME = new QName("", "Post_Code");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBWebClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CONTCNSTSVCS }
     * 
     */
    public CONTCNSTSVCS createCONTCNSTSVCS() {
        return new CONTCNSTSVCS();
    }

    /**
     * Create an instance of {@link MOSTFREQ4TLCMNBR }
     * 
     */
    public MOSTFREQ4TLCMNBR createMOSTFREQ4TLCMNBR() {
        return new MOSTFREQ4TLCMNBR();
    }

    /**
     * Create an instance of {@link SIGNONMSGSRSV1 }
     * 
     */
    public SIGNONMSGSRSV1 createSIGNONMSGSRSV1() {
        return new SIGNONMSGSRSV1();
    }

    /**
     * Create an instance of {@link DGX }
     * 
     */
    public DGX createDGX() {
        return new DGX();
    }

    /**
     * Create an instance of {@link ArrayOfLOOKUPRSCOMPANY }
     * 
     */
    public ArrayOfLOOKUPRSCOMPANY createArrayOfLOOKUPRSCOMPANY() {
        return new ArrayOfLOOKUPRSCOMPANY();
    }

    /**
     * Create an instance of {@link UCLSSVCS }
     * 
     */
    public UCLSSVCS createUCLSSVCS() {
        return new UCLSSVCS();
    }

    /**
     * Create an instance of {@link FRIND }
     * 
     */
    public FRIND createFRIND() {
        return new FRIND();
    }

    /**
     * Create an instance of {@link INFOCONSISTENCY }
     * 
     */
    public INFOCONSISTENCY createINFOCONSISTENCY() {
        return new INFOCONSISTENCY();
    }

    /**
     * Create an instance of {@link MOSTFREQ2DUNS }
     * 
     */
    public MOSTFREQ2DUNS createMOSTFREQ2DUNS() {
        return new MOSTFREQ2DUNS();
    }

    /**
     * Create an instance of {@link MOSTFREQ4DUNS }
     * 
     */
    public MOSTFREQ4DUNS createMOSTFREQ4DUNS() {
        return new MOSTFREQ4DUNS();
    }

    /**
     * Create an instance of {@link WsLookUp }
     * 
     */
    public WsLookUp createWsLookUp() {
        return new WsLookUp();
    }

    /**
     * Create an instance of {@link MOSTFREQ1TLCMNBR }
     * 
     */
    public MOSTFREQ1TLCMNBR createMOSTFREQ1TLCMNBR() {
        return new MOSTFREQ1TLCMNBR();
    }

    /**
     * Create an instance of {@link LookUpInput }
     * 
     */
    public LookUpInput createLookUpInput() {
        return new LookUpInput();
    }

    /**
     * Create an instance of {@link LAST3SRCH }
     * 
     */
    public LAST3SRCH createLAST3SRCH() {
        return new LAST3SRCH();
    }

    /**
     * Create an instance of {@link LAST1SRCH }
     * 
     */
    public LAST1SRCH createLAST1SRCH() {
        return new LAST1SRCH();
    }

    /**
     * Create an instance of {@link SRCHPFLCHRT }
     * 
     */
    public SRCHPFLCHRT createSRCHPFLCHRT() {
        return new SRCHPFLCHRT();
    }

    /**
     * Create an instance of {@link LAST5SRCH }
     * 
     */
    public LAST5SRCH createLAST5SRCH() {
        return new LAST5SRCH();
    }

    /**
     * Create an instance of {@link MOSTFREQ2TLCMNBR }
     * 
     */
    public MOSTFREQ2TLCMNBR createMOSTFREQ2TLCMNBR() {
        return new MOSTFREQ2TLCMNBR();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link COMMSVCS }
     * 
     */
    public COMMSVCS createCOMMSVCS() {
        return new COMMSVCS();
    }

    /**
     * Create an instance of {@link AGRICULTURALSVCS }
     * 
     */
    public AGRICULTURALSVCS createAGRICULTURALSVCS() {
        return new AGRICULTURALSVCS();
    }

    /**
     * Create an instance of {@link FRDRISKSCR }
     * 
     */
    public FRDRISKSCR createFRDRISKSCR() {
        return new FRDRISKSCR();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
    }

    /**
     * Create an instance of {@link LAST2SRCH }
     * 
     */
    public LAST2SRCH createLAST2SRCH() {
        return new LAST2SRCH();
    }

    /**
     * Create an instance of {@link ArrayOfLOOKUPRSCLOSETOWN }
     * 
     */
    public ArrayOfLOOKUPRSCLOSETOWN createArrayOfLOOKUPRSCLOSETOWN() {
        return new ArrayOfLOOKUPRSCLOSETOWN();
    }

    /**
     * Create an instance of {@link UTILITYSVCS }
     * 
     */
    public UTILITYSVCS createUTILITYSVCS() {
        return new UTILITYSVCS();
    }

    /**
     * Create an instance of {@link STATUS3 }
     * 
     */
    public STATUS3 createSTATUS3() {
        return new STATUS3();
    }

    /**
     * Create an instance of {@link LOOKUPTRNRS }
     * 
     */
    public LOOKUPTRNRS createLOOKUPTRNRS() {
        return new LOOKUPTRNRS();
    }

    /**
     * Create an instance of {@link MOSTFREQ5DUNS }
     * 
     */
    public MOSTFREQ5DUNS createMOSTFREQ5DUNS() {
        return new MOSTFREQ5DUNS();
    }

    /**
     * Create an instance of {@link METALMININGSVCS }
     * 
     */
    public METALMININGSVCS createMETALMININGSVCS() {
        return new METALMININGSVCS();
    }

    /**
     * Create an instance of {@link MFGSVCS }
     * 
     */
    public MFGSVCS createMFGSVCS() {
        return new MFGSVCS();
    }

    /**
     * Create an instance of {@link LookUpResponse }
     * 
     */
    public LookUpResponse createLookUpResponse() {
        return new LookUpResponse();
    }

    /**
     * Create an instance of {@link WsLookUpResponse }
     * 
     */
    public WsLookUpResponse createWsLookUpResponse() {
        return new WsLookUpResponse();
    }

    /**
     * Create an instance of {@link MOSTFREQ3DUNS }
     * 
     */
    public MOSTFREQ3DUNS createMOSTFREQ3DUNS() {
        return new MOSTFREQ3DUNS();
    }

    /**
     * Create an instance of {@link LookUpRequest }
     * 
     */
    public LookUpRequest createLookUpRequest() {
        return new LookUpRequest();
    }

    /**
     * Create an instance of {@link MTCHBASSENTR }
     * 
     */
    public MTCHBASSENTR createMTCHBASSENTR() {
        return new MTCHBASSENTR();
    }

    /**
     * Create an instance of {@link PUBSVCS }
     * 
     */
    public PUBSVCS createPUBSVCS() {
        return new PUBSVCS();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link MTCHBASS }
     * 
     */
    public MTCHBASS createMTCHBASS() {
        return new MTCHBASS();
    }

    /**
     * Create an instance of {@link SCRRSLTINTERPRET }
     * 
     */
    public SCRRSLTINTERPRET createSCRRSLTINTERPRET() {
        return new SCRRSLTINTERPRET();
    }

    /**
     * Create an instance of {@link FINANCIALSVCS }
     * 
     */
    public FINANCIALSVCS createFINANCIALSVCS() {
        return new FINANCIALSVCS();
    }

    /**
     * Create an instance of {@link ArrayOfMTCHBASSENTR }
     * 
     */
    public ArrayOfMTCHBASSENTR createArrayOfMTCHBASSENTR() {
        return new ArrayOfMTCHBASSENTR();
    }

    /**
     * Create an instance of {@link LASTSRCHS }
     * 
     */
    public LASTSRCHS createLASTSRCHS() {
        return new LASTSRCHS();
    }

    /**
     * Create an instance of {@link WHOLESALESVCS }
     * 
     */
    public WHOLESALESVCS createWHOLESALESVCS() {
        return new WHOLESALESVCS();
    }

    /**
     * Create an instance of {@link LOOKUPRSCLOSETOWN }
     * 
     */
    public LOOKUPRSCLOSETOWN createLOOKUPRSCLOSETOWN() {
        return new LOOKUPRSCLOSETOWN();
    }

    /**
     * Create an instance of {@link LOOKUPRSCOMPANY }
     * 
     */
    public LOOKUPRSCOMPANY createLOOKUPRSCOMPANY() {
        return new LOOKUPRSCOMPANY();
    }

    /**
     * Create an instance of {@link CREDITMSGSRSV2 }
     * 
     */
    public CREDITMSGSRSV2 createCREDITMSGSRSV2() {
        return new CREDITMSGSRSV2();
    }

    /**
     * Create an instance of {@link LAST4SRCH }
     * 
     */
    public LAST4SRCH createLAST4SRCH() {
        return new LAST4SRCH();
    }

    /**
     * Create an instance of {@link TRANSPORTSVCS }
     * 
     */
    public TRANSPORTSVCS createTRANSPORTSVCS() {
        return new TRANSPORTSVCS();
    }

    /**
     * Create an instance of {@link LOOKUPDUPLICATETOWNRS }
     * 
     */
    public LOOKUPDUPLICATETOWNRS createLOOKUPDUPLICATETOWNRS() {
        return new LOOKUPDUPLICATETOWNRS();
    }

    /**
     * Create an instance of {@link SERVICES }
     * 
     */
    public SERVICES createSERVICES() {
        return new SERVICES();
    }

    /**
     * Create an instance of {@link FDSLOOKUPRS }
     * 
     */
    public FDSLOOKUPRS createFDSLOOKUPRS() {
        return new FDSLOOKUPRS();
    }

    /**
     * Create an instance of {@link RETAILSVCS }
     * 
     */
    public RETAILSVCS createRETAILSVCS() {
        return new RETAILSVCS();
    }

    /**
     * Create an instance of {@link MOSTFREQ1DUNS }
     * 
     */
    public MOSTFREQ1DUNS createMOSTFREQ1DUNS() {
        return new MOSTFREQ1DUNS();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link LOOKUPRS }
     * 
     */
    public LOOKUPRS createLOOKUPRS() {
        return new LOOKUPRS();
    }

    /**
     * Create an instance of {@link MOSTFREQ3TLCMNBR }
     * 
     */
    public MOSTFREQ3TLCMNBR createMOSTFREQ3TLCMNBR() {
        return new MOSTFREQ3TLCMNBR();
    }

    /**
     * Create an instance of {@link MOSTFREQ5TLCMNBR }
     * 
     */
    public MOSTFREQ5TLCMNBR createMOSTFREQ5TLCMNBR() {
        return new MOSTFREQ5TLCMNBR();
    }

    /**
     * Create an instance of {@link ArrayOfLOOKUPDUPLICATETOWNRS }
     * 
     */
    public ArrayOfLOOKUPDUPLICATETOWNRS createArrayOfLOOKUPDUPLICATETOWNRS() {
        return new ArrayOfLOOKUPDUPLICATETOWNRS();
    }

    /**
     * Create an instance of {@link SocCode }
     * 
     */
    public SocCode createSocCode() {
        return new SocCode();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/LookUp", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLookUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/LookUp", name = "ws_LookUp")
    public JAXBElement<WsLookUp> createWsLookUp(WsLookUp value) {
        return new JAXBElement<WsLookUp>(_WsLookUp_QNAME, WsLookUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLookUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/LookUp", name = "ws_LookUpResponse")
    public JAXBElement<WsLookUpResponse> createWsLookUpResponse(WsLookUpResponse value) {
        return new JAXBElement<WsLookUpResponse>(_WsLookUpResponse_QNAME, WsLookUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MESSAGE", scope = STATUS3 .class)
    public JAXBElement<String> createSTATUS3MESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3MESSAGE_QNAME, String.class, STATUS3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SEVERITY", scope = STATUS3 .class)
    public JAXBElement<String> createSTATUS3SEVERITY(String value) {
        return new JAXBElement<String>(_STATUS3SEVERITY_QNAME, String.class, STATUS3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS3 .class)
    public JAXBElement<String> createSTATUS3TECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3TECHMESSAGE_QNAME, String.class, STATUS3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS3 .class)
    public JAXBElement<String> createSTATUS3SUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3SUPPORTMESSAGE_QNAME, String.class, STATUS3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CODE", scope = STATUS3 .class)
    public JAXBElement<String> createSTATUS3CODE(String value) {
        return new JAXBElement<String>(_STATUS3CODE_QNAME, String.class, STATUS3 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BR_IND", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNBRIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNBRIND_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNTLCMNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNTLCMNBR_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNDUNSNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDUNSNBR_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IN_DT_IND", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNINDTIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNINDTIND_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTTOWN_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNADRLINE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNADRLINE_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNNME(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNME_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPRIMGEOAREA_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNPOSTCODE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTCODE_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NON_POST_TOWN", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNNONPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNONPOSTTOWN_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNCTRYCD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNCTRYCD_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSR", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNDSR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDSR_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SBRI_UMTC_AGN", scope = LOOKUPRSCLOSETOWN.class)
    public JAXBElement<String> createLOOKUPRSCLOSETOWNSBRIUMTCAGN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNSBRIUMTCAGN_QNAME, String.class, LOOKUPRSCLOSETOWN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FRDRISKSCR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FRD_RISK_SCR", scope = LOOKUPTRNRS.class)
    public JAXBElement<FRDRISKSCR> createLOOKUPTRNRSFRDRISKSCR(FRDRISKSCR value) {
        return new JAXBElement<FRDRISKSCR>(_LOOKUPTRNRSFRDRISKSCR_QNAME, FRDRISKSCR.class, LOOKUPTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = LOOKUPTRNRS.class)
    public JAXBElement<String> createLOOKUPTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_LOOKUPTRNRSTRNUID_QNAME, String.class, LOOKUPTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOOKUPRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUPRS", scope = LOOKUPTRNRS.class)
    public JAXBElement<LOOKUPRS> createLOOKUPTRNRSLOOKUPRS(LOOKUPRS value) {
        return new JAXBElement<LOOKUPRS>(_LOOKUPTRNRSLOOKUPRS_QNAME, LOOKUPRS.class, LOOKUPTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = LOOKUPTRNRS.class)
    public JAXBElement<STATUS2> createLOOKUPTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_LOOKUPTRNRSSTATUS_QNAME, STATUS2 .class, LOOKUPTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BR_IND", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYBRIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNBRIND_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NON_POST_TWN_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYNONPOSTTWNPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYNONPOSTTWNPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYTLCMPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYTLCMPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IN_DT_IND", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYINDTIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNINDTIND_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTTOWN_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STR_NME_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYSTRNMEPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYSTRNMEPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYMTCHGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYMTCHGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STR_NBR_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYSTRNBRPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYSTRNBRPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYNME(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNME_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYADRLINE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNADRLINE_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPRIMGEOAREA_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MTCHBASS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_BASS", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<MTCHBASS> createLOOKUPRSCOMPANYMTCHBASS(MTCHBASS value) {
        return new JAXBElement<MTCHBASS>(_LOOKUPRSCOMPANYMTCHBASS_QNAME, MTCHBASS.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PROB_OF_ACCR", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPROBOFACCR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYPROBOFACCR_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYTLCMNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNTLCMNBR_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYDUNSNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDUNSNBR_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYNMEPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYNMEPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CONF_CD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYCONFCD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYCONFCD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA_NBR_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPRIMGEOAREANBRPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYPRIMGEOAREANBRPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PO_BOX_PCT_GRD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPOBOXPCTGRD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYPOBOXPCTGRD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYPOSTCODE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTCODE_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NON_POST_TOWN", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYNONPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNONPOSTTOWN_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRDG_STYL", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYTRDGSTYL(String value) {
        return new JAXBElement<String>(_LOOKUPRSCOMPANYTRDGSTYL_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYCTRYCD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNCTRYCD_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSR", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYDSR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDSR_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SBRI_UMTC_AGN", scope = LOOKUPRSCOMPANY.class)
    public JAXBElement<String> createLOOKUPRSCOMPANYSBRIUMTCAGN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNSBRIUMTCAGN_QNAME, String.class, LOOKUPRSCOMPANY.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOOKUPTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUPTRNRS", scope = CREDITMSGSRSV2 .class)
    public JAXBElement<LOOKUPTRNRS> createCREDITMSGSRSV2LOOKUPTRNRS(LOOKUPTRNRS value) {
        return new JAXBElement<LOOKUPTRNRS>(_CREDITMSGSRSV2LOOKUPTRNRS_QNAME, LOOKUPTRNRS.class, CREDITMSGSRSV2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREDITMSGSRSV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CREDITMSGSRSV2", scope = DGX.class)
    public JAXBElement<CREDITMSGSRSV2> createDGXCREDITMSGSRSV2(CREDITMSGSRSV2 value) {
        return new JAXBElement<CREDITMSGSRSV2>(_DGXCREDITMSGSRSV2_QNAME, CREDITMSGSRSV2 .class, DGX.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSTLCMNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNTLCMNBR_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BR_IND", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSBRIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNBRIND_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPRIMGEOAREA_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSDUNSNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDUNSNBR_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSPOSTCODE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTCODE_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSCTRYCD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNCTRYCD_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IN_DT_IND", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSINDTIND(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNINDTIND_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTTOWN_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DSR", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSDSR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNDSR_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SBRI_UMTC_AGN", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSSBRIUMTCAGN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNSBRIUMTCAGN_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSNME(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNME_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = LOOKUPDUPLICATETOWNRS.class)
    public JAXBElement<String> createLOOKUPDUPLICATETOWNRSADRLINE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNADRLINE_QNAME, String.class, LOOKUPDUPLICATETOWNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lookupResponse", scope = WsLookUpResponse.class)
    public JAXBElement<LookUpResponse> createWsLookUpResponseLookupResponse(LookUpResponse value) {
        return new JAXBElement<LookUpResponse>(_WsLookUpResponseLookupResponse_QNAME, LookUpResponse.class, WsLookUpResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TLCM_NBR", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSTLCMNBR(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNTLCMNBR_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_GEO_AREA", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSPRIMGEOAREA(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPRIMGEOAREA_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AGN_NBR", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSAGNNBR(String value) {
        return new JAXBElement<String>(_FDSLOOKUPRSAGNNBR_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_CODE", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSPOSTCODE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTCODE_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ALGM_ID", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSALGMID(String value) {
        return new JAXBElement<String>(_FDSLOOKUPRSALGMID_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SCRRSLTINTERPRET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_RSLT_INTERPRET", scope = FDSLOOKUPRS.class)
    public JAXBElement<SCRRSLTINTERPRET> createFDSLOOKUPRSSCRRSLTINTERPRET(SCRRSLTINTERPRET value) {
        return new JAXBElement<SCRRSLTINTERPRET>(_FDSLOOKUPRSSCRRSLTINTERPRET_QNAME, SCRRSLTINTERPRET.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSCTRYCD(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNCTRYCD_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "POST_TOWN", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSPOSTTOWN(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNPOSTTOWN_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADR_LINE", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSADRLINE(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNADRLINE_QNAME, String.class, FDSLOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME", scope = FDSLOOKUPRS.class)
    public JAXBElement<String> createFDSLOOKUPRSNME(String value) {
        return new JAXBElement<String>(_LOOKUPRSCLOSETOWNNME_QNAME, String.class, FDSLOOKUPRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = LookUpRequest.class)
    public JAXBElement<String> createLookUpRequestTRNUID(String value) {
        return new JAXBElement<String>(_LOOKUPTRNRSTRNUID_QNAME, String.class, LookUpRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "socCode", scope = LookUpRequest.class)
    public JAXBElement<SocCode> createLookUpRequestSocCode(SocCode value) {
        return new JAXBElement<SocCode>(_LookUpRequestSocCode_QNAME, SocCode.class, LookUpRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CEO_IND", scope = MTCHBASSENTR.class)
    public JAXBElement<String> createMTCHBASSENTRCEOIND(String value) {
        return new JAXBElement<String>(_MTCHBASSENTRCEOIND_QNAME, String.class, MTCHBASSENTR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "END_IND", scope = MTCHBASSENTR.class)
    public JAXBElement<String> createMTCHBASSENTRENDIND(String value) {
        return new JAXBElement<String>(_MTCHBASSENTRENDIND_QNAME, String.class, MTCHBASSENTR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUBJ_TYPE_CD", scope = MTCHBASSENTR.class)
    public JAXBElement<String> createMTCHBASSENTRSUBJTYPECD(String value) {
        return new JAXBElement<String>(_MTCHBASSENTRSUBJTYPECD_QNAME, String.class, MTCHBASSENTR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_BASS_CD", scope = MTCHBASSENTR.class)
    public JAXBElement<String> createMTCHBASSENTRMTCHBASSCD(String value) {
        return new JAXBElement<String>(_MTCHBASSENTRMTCHBASSCD_QNAME, String.class, MTCHBASSENTR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSTECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3TECHMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSSUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3SUPPORTMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = FRDRISKSCR.class)
    public JAXBElement<String> createFRDRISKSCRTRNUID(String value) {
        return new JAXBElement<String>(_LOOKUPTRNRSTRNUID_QNAME, String.class, FRDRISKSCR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = FRDRISKSCR.class)
    public JAXBElement<STATUS3> createFRDRISKSCRSTATUS(STATUS3 value) {
        return new JAXBElement<STATUS3>(_LOOKUPTRNRSSTATUS_QNAME, STATUS3 .class, FRDRISKSCR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FDSLOOKUPRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FDSLOOKUPRS", scope = FRDRISKSCR.class)
    public JAXBElement<FDSLOOKUPRS> createFRDRISKSCRFDSLOOKUPRS(FDSLOOKUPRS value) {
        return new JAXBElement<FDSLOOKUPRS>(_FRDRISKSCRFDSLOOKUPRS_QNAME, FDSLOOKUPRS.class, FRDRISKSCR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2TECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3TECHMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2SUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS3SUPPORTMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCOMPANY }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUPRSCOMPANY", scope = LOOKUPRS.class)
    public JAXBElement<ArrayOfLOOKUPRSCOMPANY> createLOOKUPRSLOOKUPRSCOMPANY(ArrayOfLOOKUPRSCOMPANY value) {
        return new JAXBElement<ArrayOfLOOKUPRSCOMPANY>(_LOOKUPRSLOOKUPRSCOMPANY_QNAME, ArrayOfLOOKUPRSCOMPANY.class, LOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SRVTID", scope = LOOKUPRS.class)
    public JAXBElement<String> createLOOKUPRSSRVTID(String value) {
        return new JAXBElement<String>(_LOOKUPRSSRVTID_QNAME, String.class, LOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPRSCLOSETOWN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUPRSCLOSETOWN", scope = LOOKUPRS.class)
    public JAXBElement<ArrayOfLOOKUPRSCLOSETOWN> createLOOKUPRSLOOKUPRSCLOSETOWN(ArrayOfLOOKUPRSCLOSETOWN value) {
        return new JAXBElement<ArrayOfLOOKUPRSCLOSETOWN>(_LOOKUPRSLOOKUPRSCLOSETOWN_QNAME, ArrayOfLOOKUPRSCLOSETOWN.class, LOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLOOKUPDUPLICATETOWNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LOOKUPDUPLICATETOWNRS", scope = LOOKUPRS.class)
    public JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS> createLOOKUPRSLOOKUPDUPLICATETOWNRS(ArrayOfLOOKUPDUPLICATETOWNRS value) {
        return new JAXBElement<ArrayOfLOOKUPDUPLICATETOWNRS>(_LOOKUPRSLOOKUPDUPLICATETOWNRS_QNAME, ArrayOfLOOKUPDUPLICATETOWNRS.class, LOOKUPRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_CNT", scope = MTCHBASS.class)
    public JAXBElement<String> createMTCHBASSMTCHCNT(String value) {
        return new JAXBElement<String>(_MTCHBASSMTCHCNT_QNAME, String.class, MTCHBASS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMTCHBASSENTR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_BASS_ENTR", scope = MTCHBASS.class)
    public JAXBElement<ArrayOfMTCHBASSENTR> createMTCHBASSMTCHBASSENTR(ArrayOfMTCHBASSENTR value) {
        return new JAXBElement<ArrayOfMTCHBASSENTR>(_MTCHBASSMTCHBASSENTR_QNAME, ArrayOfMTCHBASSENTR.class, MTCHBASS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS_PCTG_POPN", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETSCRCLASPCTGPOPN(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETSCRCLASPCTGPOPN_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQS_TIME", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREQSTIME(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREQSTIME_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_1_CD", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS1CD(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS1CD_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_1_CD_DESC", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS1CDDESC(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS1CDDESC_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQS_DATE", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREQSDATE(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREQSDATE_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_2_CD", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS2CD(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS2CD_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FR_SCR_CLAS", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETFRSCRCLAS(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETFRSCRCLAS_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FR_SCR", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETFRSCR(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETFRSCR_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_3_CD_DESC", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS3CDDESC(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS3CDDESC_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_MULT_FRD_RSK", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETSCRMULTFRDRSK(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETSCRMULTFRDRSK_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_3_CD", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS3CD(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS3CD_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_2_CD_DESC", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS2CDDESC(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS2CDDESC_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_4_CD_DESC", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS4CDDESC(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS4CDDESC_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MTCH_CNT", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETMTCHCNT(String value) {
        return new JAXBElement<String>(_MTCHBASSMTCHCNT_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS_PCTG_FRD", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETSCRCLASPCTGFRD(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETSCRCLASPCTGFRD_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REAS_4_CD", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETREAS4CD(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETREAS4CD_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS_LBL", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETSCRCLASLBL(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETSCRCLASLBL_QNAME, String.class, SCRRSLTINTERPRET.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SCR_CLAS_DESC", scope = SCRRSLTINTERPRET.class)
    public JAXBElement<String> createSCRRSLTINTERPRETSCRCLASDESC(String value) {
        return new JAXBElement<String>(_SCRRSLTINTERPRETSCRCLASDESC_QNAME, String.class, SCRRSLTINTERPRET.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Telephone_Number", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputTelephoneNumber(String value) {
        return new JAXBElement<String>(_LookUpInputTelephoneNumber_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Search_Rule_Code", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputSearchRuleCode(String value) {
        return new JAXBElement<String>(_LookUpInputSearchRuleCode_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State_or_Region", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputStateOrRegion(String value) {
        return new JAXBElement<String>(_LookUpInputStateOrRegion_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_LookUpInputDnBDUNSNumber_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputName(String value) {
        return new JAXBElement<String>(_LookUpInputName_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PostTown", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputPostTown(String value) {
        return new JAXBElement<String>(_LookUpInputPostTown_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Match_Type", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputMatchType(String value) {
        return new JAXBElement<String>(_LookUpInputMatchType_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "File_Id", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputFileId(String value) {
        return new JAXBElement<String>(_LookUpInputFileId_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Town", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputTown(String value) {
        return new JAXBElement<String>(_LookUpInputTown_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Business_Number", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputBusinessNumber(String value) {
        return new JAXBElement<String>(_LookUpInputBusinessNumber_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Max_Responses", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputMaxResponses(String value) {
        return new JAXBElement<String>(_LookUpInputMaxResponses_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Street_Address", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputStreetAddress(String value) {
        return new JAXBElement<String>(_LookUpInputStreetAddress_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reason_Code", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputReasonCode(String value) {
        return new JAXBElement<String>(_LookUpInputReasonCode_QNAME, String.class, LookUpInput.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Post_Code", scope = LookUpInput.class)
    public JAXBElement<String> createLookUpInputPostCode(String value) {
        return new JAXBElement<String>(_LookUpInputPostCode_QNAME, String.class, LookUpInput.class, value);
    }

}
