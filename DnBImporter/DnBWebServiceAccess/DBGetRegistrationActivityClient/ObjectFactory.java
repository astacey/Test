
package DBGetRegistrationActivityClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBGetRegistrationActivityClient package. 
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

    private final static QName _WsGetRegistrationActivityResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", "ws_GetRegistrationActivityResponse");
    private final static QName _WsGetRegistrationActivity_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", "ws_GetRegistrationActivity");
    private final static QName _Exception_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", "Exception");
    private final static QName _PFLRSREGNRS_QNAME = new QName("", "REGNRS");
    private final static QName _PFLRSNTFCLVL_QNAME = new QName("", "NTFC_LVL");
    private final static QName _PFLRSPRODNME_QNAME = new QName("", "PROD_NME");
    private final static QName _PFLRSPFLNME_QNAME = new QName("", "PFL_NME");
    private final static QName _GETREGNACTVRSUSERRS_QNAME = new QName("", "USERRS");
    private final static QName _GETREGNACTVRSREQID_QNAME = new QName("", "REQ_ID");
    private final static QName _STATUSTECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUSSUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _GETREGNACTVTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _GETREGNACTVTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _GETREGNACTVTRNRSSTATUS_QNAME = new QName("", "STATUS");
    private final static QName _USERRSPFLRS_QNAME = new QName("", "PFLRS");
    private final static QName _USERRSUSERID_QNAME = new QName("", "USERID");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _GetRegistrationActivityDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _GetRegistrationActivityDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _GetRegistrationActivityDataExpirationDateTo_QNAME = new QName("", "Expiration_Date_To");
    private final static QName _GetRegistrationActivityDataPendingActivityOnly_QNAME = new QName("", "Pending_Activity_only");
    private final static QName _GetRegistrationActivityDataExpirationDateFrom_QNAME = new QName("", "Expiration_Date_From");
    private final static QName _GetRegistrationActivityDataProductName_QNAME = new QName("", "Product_Name");
    private final static QName _GetRegistrationActivityDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _GetRegistrationActivityDataRenewalDateTo_QNAME = new QName("", "Renewal_Date_To");
    private final static QName _GetRegistrationActivityDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _GetRegistrationActivityDataRenewalDateFrom_QNAME = new QName("", "Renewal_Date_From");
    private final static QName _GetRegistrationActivityDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _GetRegistrationActivityDataActivityCodes_QNAME = new QName("", "Activity_Codes");
    private final static QName _GetRegistrationActivityDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _GetRegistrationActivityDataResultTicket_QNAME = new QName("", "Result_Ticket");
    private final static QName _GetRegistrationActivityDataUserLevel_QNAME = new QName("", "User_Level");
    private final static QName _GLBLMNSVCMSGSRSV1GETREGNACTVTRNRS_QNAME = new QName("", "GETREGNACTVTRNRS");
    private final static QName _ADDLDETRSCHRGXMITDT_QNAME = new QName("", "CHRG_XMIT_DT");
    private final static QName _ADDLDETRSREGNCTRYCD_QNAME = new QName("", "REGN_CTRY_CD");
    private final static QName _ADDLDETRSXFERDUNSNBR_QNAME = new QName("", "XFER_DUNS_NBR");
    private final static QName _ADDLDETRSFRMRDUNSNBR_QNAME = new QName("", "FRMR_DUNS_NBR");
    private final static QName _ADDLDETRSFINLEMBTIND_QNAME = new QName("", "FINL_EMBT_IND");
    private final static QName _ADDLDETRSTRADEUPDUNSNBR_QNAME = new QName("", "TRADE_UP_DUNS_NBR");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _REGNRSDUNSNBR_QNAME = new QName("", "DUNS_NBR");
    private final static QName _REGNRSCUSTACCTID_QNAME = new QName("", "CUST_ACCT_ID");
    private final static QName _REGNRSSTATDESC_QNAME = new QName("", "STAT_DESC");
    private final static QName _REGNRSEXPDT_QNAME = new QName("", "EXP_DT");
    private final static QName _REGNRSRNEWDT_QNAME = new QName("", "RNEW_DT");
    private final static QName _REGNRSCTRYCD_QNAME = new QName("", "CTRY_CD");
    private final static QName _REGNRSSTATCD_QNAME = new QName("", "STAT_CD");
    private final static QName _REGNRSCUSTENDR_QNAME = new QName("", "CUST_ENDR");
    private final static QName _REGNRSLASTUPDDT_QNAME = new QName("", "LAST_UPD_DT");
    private final static QName _REGNRSPRIMNME_QNAME = new QName("", "PRIM_NME");
    private final static QName _REGNRSHISTRS_QNAME = new QName("", "HISTRS");
    private final static QName _STATUS2MESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _STATUS2SEVERITY_QNAME = new QName("", "SEVERITY");
    private final static QName _STATUS2CODE_QNAME = new QName("", "CODE");
    private final static QName _HISTRSACTVCD_QNAME = new QName("", "ACTV_CD");
    private final static QName _HISTRSADDLDETRS_QNAME = new QName("", "ADDL_DET_RS");
    private final static QName _HISTRSACTVDT_QNAME = new QName("", "ACTV_DT");
    private final static QName _HISTRSACTVDESC_QNAME = new QName("", "ACTV_DESC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBGetRegistrationActivityClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsGetRegistrationActivity }
     * 
     */
    public WsGetRegistrationActivity createWsGetRegistrationActivity() {
        return new WsGetRegistrationActivity();
    }

    /**
     * Create an instance of {@link PFLRS }
     * 
     */
    public PFLRS createPFLRS() {
        return new PFLRS();
    }

    /**
     * Create an instance of {@link WsGetRegistrationActivityResponse }
     * 
     */
    public WsGetRegistrationActivityResponse createWsGetRegistrationActivityResponse() {
        return new WsGetRegistrationActivityResponse();
    }

    /**
     * Create an instance of {@link GETREGNACTVRS }
     * 
     */
    public GETREGNACTVRS createGETREGNACTVRS() {
        return new GETREGNACTVRS();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link GetRegistrationActivityRequest }
     * 
     */
    public GetRegistrationActivityRequest createGetRegistrationActivityRequest() {
        return new GetRegistrationActivityRequest();
    }

    /**
     * Create an instance of {@link GETREGNACTVTRNRS }
     * 
     */
    public GETREGNACTVTRNRS createGETREGNACTVTRNRS() {
        return new GETREGNACTVTRNRS();
    }

    /**
     * Create an instance of {@link USERRS }
     * 
     */
    public USERRS createUSERRS() {
        return new USERRS();
    }

    /**
     * Create an instance of {@link ArrayOfHISTRS }
     * 
     */
    public ArrayOfHISTRS createArrayOfHISTRS() {
        return new ArrayOfHISTRS();
    }

    /**
     * Create an instance of {@link GetRegistrationActivityResponse }
     * 
     */
    public GetRegistrationActivityResponse createGetRegistrationActivityResponse() {
        return new GetRegistrationActivityResponse();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link GetRegistrationActivityData }
     * 
     */
    public GetRegistrationActivityData createGetRegistrationActivityData() {
        return new GetRegistrationActivityData();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfPFLRS }
     * 
     */
    public ArrayOfPFLRS createArrayOfPFLRS() {
        return new ArrayOfPFLRS();
    }

    /**
     * Create an instance of {@link ArrayOfREGNRS }
     * 
     */
    public ArrayOfREGNRS createArrayOfREGNRS() {
        return new ArrayOfREGNRS();
    }

    /**
     * Create an instance of {@link ADDLDETRS }
     * 
     */
    public ADDLDETRS createADDLDETRS() {
        return new ADDLDETRS();
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
     * Create an instance of {@link REGNRS }
     * 
     */
    public REGNRS createREGNRS() {
        return new REGNRS();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
    }

    /**
     * Create an instance of {@link HISTRS }
     * 
     */
    public HISTRS createHISTRS() {
        return new HISTRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetRegistrationActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", name = "ws_GetRegistrationActivityResponse")
    public JAXBElement<WsGetRegistrationActivityResponse> createWsGetRegistrationActivityResponse(WsGetRegistrationActivityResponse value) {
        return new JAXBElement<WsGetRegistrationActivityResponse>(_WsGetRegistrationActivityResponse_QNAME, WsGetRegistrationActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetRegistrationActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", name = "ws_GetRegistrationActivity")
    public JAXBElement<WsGetRegistrationActivity> createWsGetRegistrationActivity(WsGetRegistrationActivity value) {
        return new JAXBElement<WsGetRegistrationActivity>(_WsGetRegistrationActivity_QNAME, WsGetRegistrationActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationActivity", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link USERRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERRS", scope = GETREGNACTVRS.class)
    public JAXBElement<USERRS> createGETREGNACTVRSUSERRS(USERRS value) {
        return new JAXBElement<USERRS>(_GETREGNACTVRSUSERRS_QNAME, USERRS.class, GETREGNACTVRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQ_ID", scope = GETREGNACTVRS.class)
    public JAXBElement<String> createGETREGNACTVRSREQID(String value) {
        return new JAXBElement<String>(_GETREGNACTVRSREQID_QNAME, String.class, GETREGNACTVRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = GETREGNACTVTRNRS.class)
    public JAXBElement<String> createGETREGNACTVTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_GETREGNACTVTRNRSTRNUID_QNAME, String.class, GETREGNACTVTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = GETREGNACTVTRNRS.class)
    public JAXBElement<String> createGETREGNACTVTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_GETREGNACTVTRNRSRSLTTKT_QNAME, String.class, GETREGNACTVTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = GETREGNACTVTRNRS.class)
    public JAXBElement<STATUS2> createGETREGNACTVTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_GETREGNACTVTRNRSSTATUS_QNAME, STATUS2 .class, GETREGNACTVTRNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataDnBDUNSNumber_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataCustomerAccountID_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_To", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataExpirationDateTo(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataExpirationDateTo_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pending_Activity_only", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataPendingActivityOnly(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataPendingActivityOnly_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_From", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataExpirationDateFrom(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataExpirationDateFrom_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Product_Name", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataProductName(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataProductName_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataCharacterSetOverride_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_To", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataRenewalDateTo(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataRenewalDateTo_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataEndorsement(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataEndorsement_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_From", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataRenewalDateFrom(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataRenewalDateFrom_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataCountryCode(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataCountryCode_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Activity_Codes", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataActivityCodes(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataActivityCodes_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataNotificationLevel(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataNotificationLevel_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result_Ticket", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataResultTicket(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataResultTicket_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Level", scope = GetRegistrationActivityData.class)
    public JAXBElement<String> createGetRegistrationActivityDataUserLevel(String value) {
        return new JAXBElement<String>(_GetRegistrationActivityDataUserLevel_QNAME, String.class, GetRegistrationActivityData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETREGNACTVTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GETREGNACTVTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<GETREGNACTVTRNRS> createGLBLMNSVCMSGSRSV1GETREGNACTVTRNRS(GETREGNACTVTRNRS value) {
        return new JAXBElement<GETREGNACTVTRNRS>(_GLBLMNSVCMSGSRSV1GETREGNACTVTRNRS_QNAME, GETREGNACTVTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CHRG_XMIT_DT", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSCHRGXMITDT(String value) {
        return new JAXBElement<String>(_ADDLDETRSCHRGXMITDT_QNAME, String.class, ADDLDETRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REGN_CTRY_CD", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSREGNCTRYCD(String value) {
        return new JAXBElement<String>(_ADDLDETRSREGNCTRYCD_QNAME, String.class, ADDLDETRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "XFER_DUNS_NBR", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSXFERDUNSNBR(String value) {
        return new JAXBElement<String>(_ADDLDETRSXFERDUNSNBR_QNAME, String.class, ADDLDETRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FRMR_DUNS_NBR", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSFRMRDUNSNBR(String value) {
        return new JAXBElement<String>(_ADDLDETRSFRMRDUNSNBR_QNAME, String.class, ADDLDETRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FINL_EMBT_IND", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSFINLEMBTIND(String value) {
        return new JAXBElement<String>(_ADDLDETRSFINLEMBTIND_QNAME, String.class, ADDLDETRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRADE_UP_DUNS_NBR", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSTRADEUPDUNSNBR(String value) {
        return new JAXBElement<String>(_ADDLDETRSTRADEUPDUNSNBR_QNAME, String.class, ADDLDETRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSDUNSNBR(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSDUNSNBR_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUST_ACCT_ID", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSCUSTACCTID(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSCUSTACCTID_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT_DESC", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSSTATDESC(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSSTATDESC_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXP_DT", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSEXPDT(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSEXPDT_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RNEW_DT", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSRNEWDT(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSRNEWDT_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSCTRYCD(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSCTRYCD_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT_CD", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSSTATCD(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSSTATCD_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CUST_ENDR", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSCUSTENDR(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSCUSTENDR_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LAST_UPD_DT", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSLASTUPDDT(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSLASTUPDDT_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_NME", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSPRIMNME(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSPRIMNME_QNAME, ArrayOfstring.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHISTRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HISTRS", scope = REGNRS.class)
    public JAXBElement<ArrayOfHISTRS> createREGNRSHISTRS(ArrayOfHISTRS value) {
        return new JAXBElement<ArrayOfHISTRS>(_REGNRSHISTRS_QNAME, ArrayOfHISTRS.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2MESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2MESSAGE_QNAME, String.class, STATUS2 .class, value);
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
    @XmlElementDecl(namespace = "", name = "ACTV_CD", scope = HISTRS.class)
    public JAXBElement<String> createHISTRSACTVCD(String value) {
        return new JAXBElement<String>(_HISTRSACTVCD_QNAME, String.class, HISTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDLDETRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_DET_RS", scope = HISTRS.class)
    public JAXBElement<ADDLDETRS> createHISTRSADDLDETRS(ADDLDETRS value) {
        return new JAXBElement<ADDLDETRS>(_HISTRSADDLDETRS_QNAME, ADDLDETRS.class, HISTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTV_DT", scope = HISTRS.class)
    public JAXBElement<String> createHISTRSACTVDT(String value) {
        return new JAXBElement<String>(_HISTRSACTVDT_QNAME, String.class, HISTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTV_DESC", scope = HISTRS.class)
    public JAXBElement<String> createHISTRSACTVDESC(String value) {
        return new JAXBElement<String>(_HISTRSACTVDESC_QNAME, String.class, HISTRS.class, value);
    }

}
