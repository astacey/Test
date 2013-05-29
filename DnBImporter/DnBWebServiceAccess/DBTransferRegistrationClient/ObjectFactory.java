
package DBTransferRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBTransferRegistrationClient package. 
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

    private final static QName _WsTransferRegistrationResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", "ws_TransferRegistrationResponse");
    private final static QName _WsTransferRegistration_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", "ws_TransferRegistration");
    private final static QName _Exception_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", "Exception");
    private final static QName _GLBLMNSVCMSGSRSV1XFERREGNTRNRS_QNAME = new QName("", "XFERREGNTRNRS");
    private final static QName _XFERREGNTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _XFERREGNTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _XFERREGNTRNRSSTATUS_QNAME = new QName("", "STATUS");
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
    private final static QName _STATUSTECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUSSUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _TransferRegistrationrequestDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _TransferRegistrationrequestDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _TransferRegistrationrequestDataExpirationDateTo_QNAME = new QName("", "Expiration_Date_To");
    private final static QName _TransferRegistrationrequestDataExpirationDateFrom_QNAME = new QName("", "Expiration_Date_From");
    private final static QName _TransferRegistrationrequestDataRenewalDateTo_QNAME = new QName("", "Renewal_Date_To");
    private final static QName _TransferRegistrationrequestDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _TransferRegistrationrequestDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _TransferRegistrationrequestDataRenewalDateFrom_QNAME = new QName("", "Renewal_Date_From");
    private final static QName _TransferRegistrationrequestDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _TransferRegistrationrequestDataLastUpdateDateTo_QNAME = new QName("", "Last_Update_Date_To");
    private final static QName _TransferRegistrationrequestDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _TransferRegistrationrequestDataLastUpdateDateFrom_QNAME = new QName("", "Last_Update_Date_From");
    private final static QName _TransferRegistrationrequestDataCancelDuplicateRegistration_QNAME = new QName("", "Cancel_Duplicate_Registration");
    private final static QName _ADDLDETRSREQDCTRYCD_QNAME = new QName("", "REQD_CTRY_CD");
    private final static QName _ADDLDETRSCHRGXMITDT_QNAME = new QName("", "CHRG_XMIT_DT");
    private final static QName _ADDLDETRSFRMRDUNSNBR_QNAME = new QName("", "FRMR_DUNS_NBR");
    private final static QName _ADDLDETRSFINLEMBTIND_QNAME = new QName("", "FINL_EMBT_IND");
    private final static QName _ADDLDETRSTRADEUPDUNSNBR_QNAME = new QName("", "TRADE_UP_DUNS_NBR");
    private final static QName _AUDITRSCNT_QNAME = new QName("", "CNT");
    private final static QName _AUDITRSNME_QNAME = new QName("", "NME");
    private final static QName _XFERREGNRSUSERRS_QNAME = new QName("", "USERRS");
    private final static QName _XFERREGNRSAUDITRS_QNAME = new QName("", "AUDITRS");
    private final static QName _USERRSPFLRS_QNAME = new QName("", "PFLRS");
    private final static QName _USERRSUSERID_QNAME = new QName("", "USERID");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _PFLRSREGNRS_QNAME = new QName("", "REGNRS");
    private final static QName _PFLRSNTFCLVL_QNAME = new QName("", "NTFC_LVL");
    private final static QName _PFLRSPRODNME_QNAME = new QName("", "PROD_NME");
    private final static QName _PFLRSPFLNME_QNAME = new QName("", "PFL_NME");
    private final static QName _STATUS2MESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _HISTRSACTVCD_QNAME = new QName("", "ACTV_CD");
    private final static QName _HISTRSADDLDETRS_QNAME = new QName("", "ADDL_DET_RS");
    private final static QName _HISTRSACTVDT_QNAME = new QName("", "ACTV_DT");
    private final static QName _HISTRSACTVDESC_QNAME = new QName("", "ACTV_DESC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBTransferRegistrationClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WsTransferRegistration }
     * 
     */
    public WsTransferRegistration createWsTransferRegistration() {
        return new WsTransferRegistration();
    }

    /**
     * Create an instance of {@link REGNRS }
     * 
     */
    public REGNRS createREGNRS() {
        return new REGNRS();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link XFERREGNTRNRS }
     * 
     */
    public XFERREGNTRNRS createXFERREGNTRNRS() {
        return new XFERREGNTRNRS();
    }

    /**
     * Create an instance of {@link ArrayOfPFLRS }
     * 
     */
    public ArrayOfPFLRS createArrayOfPFLRS() {
        return new ArrayOfPFLRS();
    }

    /**
     * Create an instance of {@link TransferRegistrationRequest }
     * 
     */
    public TransferRegistrationRequest createTransferRegistrationRequest() {
        return new TransferRegistrationRequest();
    }

    /**
     * Create an instance of {@link TransferRegistrationrequestData }
     * 
     */
    public TransferRegistrationrequestData createTransferRegistrationrequestData() {
        return new TransferRegistrationrequestData();
    }

    /**
     * Create an instance of {@link ArrayOfAUDITRS }
     * 
     */
    public ArrayOfAUDITRS createArrayOfAUDITRS() {
        return new ArrayOfAUDITRS();
    }

    /**
     * Create an instance of {@link TransferRegistrationResponse }
     * 
     */
    public TransferRegistrationResponse createTransferRegistrationResponse() {
        return new TransferRegistrationResponse();
    }

    /**
     * Create an instance of {@link USERRS }
     * 
     */
    public USERRS createUSERRS() {
        return new USERRS();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link ArrayOfUSERRS }
     * 
     */
    public ArrayOfUSERRS createArrayOfUSERRS() {
        return new ArrayOfUSERRS();
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
     * Create an instance of {@link PFLRS }
     * 
     */
    public PFLRS createPFLRS() {
        return new PFLRS();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
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
     * Create an instance of {@link ArrayOfADDLDETRS }
     * 
     */
    public ArrayOfADDLDETRS createArrayOfADDLDETRS() {
        return new ArrayOfADDLDETRS();
    }

    /**
     * Create an instance of {@link ArrayOfHISTRS }
     * 
     */
    public ArrayOfHISTRS createArrayOfHISTRS() {
        return new ArrayOfHISTRS();
    }

    /**
     * Create an instance of {@link ADDLDETRS }
     * 
     */
    public ADDLDETRS createADDLDETRS() {
        return new ADDLDETRS();
    }

    /**
     * Create an instance of {@link AUDITRS }
     * 
     */
    public AUDITRS createAUDITRS() {
        return new AUDITRS();
    }

    /**
     * Create an instance of {@link XFERREGNRS }
     * 
     */
    public XFERREGNRS createXFERREGNRS() {
        return new XFERREGNRS();
    }

    /**
     * Create an instance of {@link ArrayOfREGNRS }
     * 
     */
    public ArrayOfREGNRS createArrayOfREGNRS() {
        return new ArrayOfREGNRS();
    }

    /**
     * Create an instance of {@link WsTransferRegistrationResponse }
     * 
     */
    public WsTransferRegistrationResponse createWsTransferRegistrationResponse() {
        return new WsTransferRegistrationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransferRegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", name = "ws_TransferRegistrationResponse")
    public JAXBElement<WsTransferRegistrationResponse> createWsTransferRegistrationResponse(WsTransferRegistrationResponse value) {
        return new JAXBElement<WsTransferRegistrationResponse>(_WsTransferRegistrationResponse_QNAME, WsTransferRegistrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsTransferRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", name = "ws_TransferRegistration")
    public JAXBElement<WsTransferRegistration> createWsTransferRegistration(WsTransferRegistration value) {
        return new JAXBElement<WsTransferRegistration>(_WsTransferRegistration_QNAME, WsTransferRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/TransferRegistration", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XFERREGNTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "XFERREGNTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<XFERREGNTRNRS> createGLBLMNSVCMSGSRSV1XFERREGNTRNRS(XFERREGNTRNRS value) {
        return new JAXBElement<XFERREGNTRNRS>(_GLBLMNSVCMSGSRSV1XFERREGNTRNRS_QNAME, XFERREGNTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = XFERREGNTRNRS.class)
    public JAXBElement<String> createXFERREGNTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_XFERREGNTRNRSTRNUID_QNAME, String.class, XFERREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = XFERREGNTRNRS.class)
    public JAXBElement<String> createXFERREGNTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_XFERREGNTRNRSRSLTTKT_QNAME, String.class, XFERREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = XFERREGNTRNRS.class)
    public JAXBElement<STATUS2> createXFERREGNTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_XFERREGNTRNRSSTATUS_QNAME, STATUS2 .class, XFERREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DUNS_NBR", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSDUNSNBR(String value) {
        return new JAXBElement<String>(_REGNRSDUNSNBR_QNAME, String.class, REGNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "STAT_DESC", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSSTATDESC(String value) {
        return new JAXBElement<String>(_REGNRSSTATDESC_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXP_DT", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSEXPDT(String value) {
        return new JAXBElement<String>(_REGNRSEXPDT_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RNEW_DT", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSRNEWDT(String value) {
        return new JAXBElement<String>(_REGNRSRNEWDT_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CTRY_CD", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSCTRYCD(String value) {
        return new JAXBElement<String>(_REGNRSCTRYCD_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT_CD", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSSTATCD(String value) {
        return new JAXBElement<String>(_REGNRSSTATCD_QNAME, String.class, REGNRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LAST_UPD_DT", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSLASTUPDDT(String value) {
        return new JAXBElement<String>(_REGNRSLASTUPDDT_QNAME, String.class, REGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PRIM_NME", scope = REGNRS.class)
    public JAXBElement<String> createREGNRSPRIMNME(String value) {
        return new JAXBElement<String>(_REGNRSPRIMNME_QNAME, String.class, REGNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataDnBDUNSNumber_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataCustomerAccountID_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_To", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataExpirationDateTo(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataExpirationDateTo_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_From", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataExpirationDateFrom(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataExpirationDateFrom_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_To", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataRenewalDateTo(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataRenewalDateTo_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataCharacterSetOverride_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataEndorsement(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataEndorsement_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_From", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataRenewalDateFrom(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataRenewalDateFrom_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataCountryCode(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataCountryCode_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_To", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataLastUpdateDateTo(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataLastUpdateDateTo_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataNotificationLevel(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataNotificationLevel_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_From", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataLastUpdateDateFrom(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataLastUpdateDateFrom_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cancel_Duplicate_Registration", scope = TransferRegistrationrequestData.class)
    public JAXBElement<String> createTransferRegistrationrequestDataCancelDuplicateRegistration(String value) {
        return new JAXBElement<String>(_TransferRegistrationrequestDataCancelDuplicateRegistration_QNAME, String.class, TransferRegistrationrequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQD_CTRY_CD", scope = ADDLDETRS.class)
    public JAXBElement<String> createADDLDETRSREQDCTRYCD(String value) {
        return new JAXBElement<String>(_ADDLDETRSREQDCTRYCD_QNAME, String.class, ADDLDETRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CNT", scope = AUDITRS.class)
    public JAXBElement<String> createAUDITRSCNT(String value) {
        return new JAXBElement<String>(_AUDITRSCNT_QNAME, String.class, AUDITRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NME", scope = AUDITRS.class)
    public JAXBElement<String> createAUDITRSNME(String value) {
        return new JAXBElement<String>(_AUDITRSNME_QNAME, String.class, AUDITRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUSERRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERRS", scope = XFERREGNRS.class)
    public JAXBElement<ArrayOfUSERRS> createXFERREGNRSUSERRS(ArrayOfUSERRS value) {
        return new JAXBElement<ArrayOfUSERRS>(_XFERREGNRSUSERRS_QNAME, ArrayOfUSERRS.class, XFERREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAUDITRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AUDITRS", scope = XFERREGNRS.class)
    public JAXBElement<ArrayOfAUDITRS> createXFERREGNRSAUDITRS(ArrayOfAUDITRS value) {
        return new JAXBElement<ArrayOfAUDITRS>(_XFERREGNRSAUDITRS_QNAME, ArrayOfAUDITRS.class, XFERREGNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2MESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2MESSAGE_QNAME, String.class, STATUS2 .class, value);
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
    @XmlElementDecl(namespace = "", name = "ACTV_CD", scope = HISTRS.class)
    public JAXBElement<String> createHISTRSACTVCD(String value) {
        return new JAXBElement<String>(_HISTRSACTVCD_QNAME, String.class, HISTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADDLDETRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDL_DET_RS", scope = HISTRS.class)
    public JAXBElement<ArrayOfADDLDETRS> createHISTRSADDLDETRS(ArrayOfADDLDETRS value) {
        return new JAXBElement<ArrayOfADDLDETRS>(_HISTRSADDLDETRS_QNAME, ArrayOfADDLDETRS.class, HISTRS.class, value);
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
