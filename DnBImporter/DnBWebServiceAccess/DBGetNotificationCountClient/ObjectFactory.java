
package DBGetNotificationCountClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBGetNotificationCountClient package. 
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

    private final static QName _WsGetNotificationCountResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", "ws_GetNotificationCountResponse");
    private final static QName _Exception_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", "Exception");
    private final static QName _WsGetNotificationCount_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", "ws_GetNotificationCount");
    private final static QName _STATUS2TECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUS2SUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _GetNotificationCountRequestDataProductName_QNAME = new QName("", "Product_Name");
    private final static QName _GetNotificationCountRequestDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _GetNotificationCountRequestDataPendingNoticesOnly_QNAME = new QName("", "Pending_Notices_only");
    private final static QName _GetNotificationCountRequestDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _GetNotificationCountRequestDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _GetNotificationCountRequestDataActiveRegistrationsOnly_QNAME = new QName("", "Active_Registrations_only");
    private final static QName _GetNotificationCountRequestDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _GetNotificationCountRequestDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _GetNotificationCountRequestDataResultTicket_QNAME = new QName("", "Result_Ticket");
    private final static QName _GetNotificationCountRequestDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _GetNotificationCountRequestDataUserLevel_QNAME = new QName("", "User_Level");
    private final static QName _GLBLMNSVCMSGSRSV1GETNTFCCNTTRNRS_QNAME = new QName("", "GETNTFCCNTTRNRS");
    private final static QName _NTFCCNTRSDETECTFROMDT_QNAME = new QName("", "DETECT_FROM_DT");
    private final static QName _NTFCCNTRSSUBJCOUNT_QNAME = new QName("", "SUBJCOUNT");
    private final static QName _NTFCCNTRSNTFCCOUNT_QNAME = new QName("", "NTFCCOUNT");
    private final static QName _NTFCCNTRSDETECTTODT_QNAME = new QName("", "DETECT_TO_DT");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _USERRSNTFCCNTRS_QNAME = new QName("", "NTFCCNTRS");
    private final static QName _USERRSUSERID_QNAME = new QName("", "USERID");
    private final static QName _GETNTFCCNTRSUSERRS_QNAME = new QName("", "USERRS");
    private final static QName _GETNTFCCNTRSREQID_QNAME = new QName("", "REQ_ID");
    private final static QName _GETNTFCCNTTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _GETNTFCCNTTRNRSGETNTFCCNTRS_QNAME = new QName("", "GETNTFCCNTRS");
    private final static QName _GETNTFCCNTTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _GETNTFCCNTTRNRSSTATUS_QNAME = new QName("", "STATUS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBGetNotificationCountClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfUSERRS }
     * 
     */
    public ArrayOfUSERRS createArrayOfUSERRS() {
        return new ArrayOfUSERRS();
    }

    /**
     * Create an instance of {@link ArrayOfNTFCCNTRS }
     * 
     */
    public ArrayOfNTFCCNTRS createArrayOfNTFCCNTRS() {
        return new ArrayOfNTFCCNTRS();
    }

    /**
     * Create an instance of {@link DGX }
     * 
     */
    public DGX createDGX() {
        return new DGX();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
    }

    /**
     * Create an instance of {@link GetNotificationCountRequestData }
     * 
     */
    public GetNotificationCountRequestData createGetNotificationCountRequestData() {
        return new GetNotificationCountRequestData();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link GetNotificationCountResponse }
     * 
     */
    public GetNotificationCountResponse createGetNotificationCountResponse() {
        return new GetNotificationCountResponse();
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
     * Create an instance of {@link WsGetNotificationCountResponse }
     * 
     */
    public WsGetNotificationCountResponse createWsGetNotificationCountResponse() {
        return new WsGetNotificationCountResponse();
    }

    /**
     * Create an instance of {@link SIGNONMSGSRSV1 }
     * 
     */
    public SIGNONMSGSRSV1 createSIGNONMSGSRSV1() {
        return new SIGNONMSGSRSV1();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
    }

    /**
     * Create an instance of {@link NTFCCNTRS }
     * 
     */
    public NTFCCNTRS createNTFCCNTRS() {
        return new NTFCCNTRS();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link WsGetNotificationCount }
     * 
     */
    public WsGetNotificationCount createWsGetNotificationCount() {
        return new WsGetNotificationCount();
    }

    /**
     * Create an instance of {@link GETNTFCCNTRS }
     * 
     */
    public GETNTFCCNTRS createGETNTFCCNTRS() {
        return new GETNTFCCNTRS();
    }

    /**
     * Create an instance of {@link GetNotificationCountRequest }
     * 
     */
    public GetNotificationCountRequest createGetNotificationCountRequest() {
        return new GetNotificationCountRequest();
    }

    /**
     * Create an instance of {@link GETNTFCCNTTRNRS }
     * 
     */
    public GETNTFCCNTTRNRS createGETNTFCCNTTRNRS() {
        return new GETNTFCCNTTRNRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetNotificationCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", name = "ws_GetNotificationCountResponse")
    public JAXBElement<WsGetNotificationCountResponse> createWsGetNotificationCountResponse(WsGetNotificationCountResponse value) {
        return new JAXBElement<WsGetNotificationCountResponse>(_WsGetNotificationCountResponse_QNAME, WsGetNotificationCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetNotificationCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetNotificationCount", name = "ws_GetNotificationCount")
    public JAXBElement<WsGetNotificationCount> createWsGetNotificationCount(WsGetNotificationCount value) {
        return new JAXBElement<WsGetNotificationCount>(_WsGetNotificationCount_QNAME, WsGetNotificationCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2TECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2TECHMESSAGE_QNAME, String.class, STATUS2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS2 .class)
    public JAXBElement<String> createSTATUS2SUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2SUPPORTMESSAGE_QNAME, String.class, STATUS2 .class, value);
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
    @XmlElementDecl(namespace = "", name = "Product_Name", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataProductName(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataProductName_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataCharacterSetOverride_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Pending_Notices_only", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataPendingNoticesOnly(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataPendingNoticesOnly_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataDnBDUNSNumber_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataEndorsement(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataEndorsement_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Active_Registrations_only", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataActiveRegistrationsOnly(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataActiveRegistrationsOnly_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataCountryCode(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataCountryCode_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataCustomerAccountID_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result_Ticket", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataResultTicket(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataResultTicket_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataNotificationLevel(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataNotificationLevel_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Level", scope = GetNotificationCountRequestData.class)
    public JAXBElement<String> createGetNotificationCountRequestDataUserLevel(String value) {
        return new JAXBElement<String>(_GetNotificationCountRequestDataUserLevel_QNAME, String.class, GetNotificationCountRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETNTFCCNTTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GETNTFCCNTTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<GETNTFCCNTTRNRS> createGLBLMNSVCMSGSRSV1GETNTFCCNTTRNRS(GETNTFCCNTTRNRS value) {
        return new JAXBElement<GETNTFCCNTTRNRS>(_GLBLMNSVCMSGSRSV1GETNTFCCNTTRNRS_QNAME, GETNTFCCNTTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TECH_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSTECHMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2TECHMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUPPORT_MESSAGE", scope = STATUS.class)
    public JAXBElement<String> createSTATUSSUPPORTMESSAGE(String value) {
        return new JAXBElement<String>(_STATUS2SUPPORTMESSAGE_QNAME, String.class, STATUS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DETECT_FROM_DT", scope = NTFCCNTRS.class)
    public JAXBElement<String> createNTFCCNTRSDETECTFROMDT(String value) {
        return new JAXBElement<String>(_NTFCCNTRSDETECTFROMDT_QNAME, String.class, NTFCCNTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SUBJCOUNT", scope = NTFCCNTRS.class)
    public JAXBElement<String> createNTFCCNTRSSUBJCOUNT(String value) {
        return new JAXBElement<String>(_NTFCCNTRSSUBJCOUNT_QNAME, String.class, NTFCCNTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NTFCCOUNT", scope = NTFCCNTRS.class)
    public JAXBElement<String> createNTFCCNTRSNTFCCOUNT(String value) {
        return new JAXBElement<String>(_NTFCCNTRSNTFCCOUNT_QNAME, String.class, NTFCCNTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DETECT_TO_DT", scope = NTFCCNTRS.class)
    public JAXBElement<String> createNTFCCNTRSDETECTTODT(String value) {
        return new JAXBElement<String>(_NTFCCNTRSDETECTTODT_QNAME, String.class, NTFCCNTRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTFCCNTRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NTFCCNTRS", scope = USERRS.class)
    public JAXBElement<ArrayOfNTFCCNTRS> createUSERRSNTFCCNTRS(ArrayOfNTFCCNTRS value) {
        return new JAXBElement<ArrayOfNTFCCNTRS>(_USERRSNTFCCNTRS_QNAME, ArrayOfNTFCCNTRS.class, USERRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUSERRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERRS", scope = GETNTFCCNTRS.class)
    public JAXBElement<ArrayOfUSERRS> createGETNTFCCNTRSUSERRS(ArrayOfUSERRS value) {
        return new JAXBElement<ArrayOfUSERRS>(_GETNTFCCNTRSUSERRS_QNAME, ArrayOfUSERRS.class, GETNTFCCNTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "REQ_ID", scope = GETNTFCCNTRS.class)
    public JAXBElement<String> createGETNTFCCNTRSREQID(String value) {
        return new JAXBElement<String>(_GETNTFCCNTRSREQID_QNAME, String.class, GETNTFCCNTRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = GETNTFCCNTTRNRS.class)
    public JAXBElement<String> createGETNTFCCNTTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_GETNTFCCNTTRNRSTRNUID_QNAME, String.class, GETNTFCCNTTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GETNTFCCNTRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GETNTFCCNTRS", scope = GETNTFCCNTTRNRS.class)
    public JAXBElement<GETNTFCCNTRS> createGETNTFCCNTTRNRSGETNTFCCNTRS(GETNTFCCNTRS value) {
        return new JAXBElement<GETNTFCCNTRS>(_GETNTFCCNTTRNRSGETNTFCCNTRS_QNAME, GETNTFCCNTRS.class, GETNTFCCNTTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = GETNTFCCNTTRNRS.class)
    public JAXBElement<String> createGETNTFCCNTTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_GETNTFCCNTTRNRSRSLTTKT_QNAME, String.class, GETNTFCCNTTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = GETNTFCCNTTRNRS.class)
    public JAXBElement<STATUS2> createGETNTFCCNTTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_GETNTFCCNTTRNRSSTATUS_QNAME, STATUS2 .class, GETNTFCCNTTRNRS.class, value);
    }

}
