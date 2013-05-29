
package DBGetHQRegistrationListClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBGetHQRegistrationListClient package. 
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

    private final static QName _WsGetHeadquarterRegistrationListResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList", "ws_GetHeadquarterRegistrationListResponse");
    private final static QName _WsGetHeadquarterRegistrationList_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList", "ws_GetHeadquarterRegistrationList");
    private final static QName _STATUSTECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUSSUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _GetHeadquarterRegistrationListDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _GetHeadquarterRegistrationListDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _GetHeadquarterRegistrationListDataExpirationDateTo_QNAME = new QName("", "Expiration_Date_To");
    private final static QName _GetHeadquarterRegistrationListDataExpirationDateFrom_QNAME = new QName("", "Expiration_Date_From");
    private final static QName _GetHeadquarterRegistrationListDataProductName_QNAME = new QName("", "Product_Name");
    private final static QName _GetHeadquarterRegistrationListDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _GetHeadquarterRegistrationListDataRenewalDateTo_QNAME = new QName("", "Renewal_Date_To");
    private final static QName _GetHeadquarterRegistrationListDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _GetHeadquarterRegistrationListDataRenewalDateFrom_QNAME = new QName("", "Renewal_Date_From");
    private final static QName _GetHeadquarterRegistrationListDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _GetHeadquarterRegistrationListDataLastUpdateDateTo_QNAME = new QName("", "Last_Update_Date_To");
    private final static QName _GetHeadquarterRegistrationListDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _GetHeadquarterRegistrationListDataResultTicket_QNAME = new QName("", "Result_Ticket");
    private final static QName _GetHeadquarterRegistrationListDataLastUpdateDateFrom_QNAME = new QName("", "Last_Update_Date_From");
    private final static QName _GetHeadquarterRegistrationListDataUserLevel_QNAME = new QName("", "User_Level");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _REGNRSHQDUNSNBR_QNAME = new QName("", "HQ_DUNS_NBR");
    private final static QName _REGNRSCUSTACCTID_QNAME = new QName("", "CUST_ACCT_ID");
    private final static QName _REGNRSSTATDESC_QNAME = new QName("", "STAT_DESC");
    private final static QName _REGNRSEXPDT_QNAME = new QName("", "EXP_DT");
    private final static QName _REGNRSRNEWDT_QNAME = new QName("", "RNEW_DT");
    private final static QName _REGNRSCTRYCD_QNAME = new QName("", "CTRY_CD");
    private final static QName _REGNRSSTATCD_QNAME = new QName("", "STAT_CD");
    private final static QName _REGNRSCUSTENDR_QNAME = new QName("", "CUST_ENDR");
    private final static QName _REGNRSENQDUNSNBR_QNAME = new QName("", "ENQ_DUNS_NBR");
    private final static QName _REGNRSLASTUPDDT_QNAME = new QName("", "LAST_UPD_DT");
    private final static QName _REGNRSPRIMNME_QNAME = new QName("", "PRIM_NME");
    private final static QName _REGNRSHISTRS_QNAME = new QName("", "HISTRS");
    private final static QName _GLBLMNSVCMSGSRSV1HQREGNLSTTRNRS_QNAME = new QName("", "HQREGNLSTTRNRS");
    private final static QName _STATUS2MESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _STATUS2SEVERITY_QNAME = new QName("", "SEVERITY");
    private final static QName _STATUS2CODE_QNAME = new QName("", "CODE");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _PFLRSREGNRS_QNAME = new QName("", "REGNRS");
    private final static QName _ADDLDETRSCHRGXMITDT_QNAME = new QName("", "CHRG_XMIT_DT");
    private final static QName _ADDLDETRSREGNCTRYCD_QNAME = new QName("", "REGN_CTRY_CD");
    private final static QName _ADDLDETRSXFERDUNSNBR_QNAME = new QName("", "XFER_DUNS_NBR");
    private final static QName _ADDLDETRSFRMRDUNSNBR_QNAME = new QName("", "FRMR_DUNS_NBR");
    private final static QName _ADDLDETRSFINLEMBTIND_QNAME = new QName("", "FINL_EMBT_IND");
    private final static QName _ADDLDETRSTRADEUPDUNSNBR_QNAME = new QName("", "TRADE_UP_DUNS_NBR");
    private final static QName _HISTRSACTVCD_QNAME = new QName("", "ACTV_CD");
    private final static QName _HISTRSADDLDETRS_QNAME = new QName("", "ADDL_DET_RS");
    private final static QName _HISTRSACTVDT_QNAME = new QName("", "ACTV_DT");
    private final static QName _HISTRSACTVDESC_QNAME = new QName("", "ACTV_DESC");
    private final static QName _HQREGNLSTTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _HQREGNLSTTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _HQREGNLSTTRNRSSTATUS_QNAME = new QName("", "STATUS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBGetHQRegistrationListClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link REGNRS }
     * 
     */
    public REGNRS createREGNRS() {
        return new REGNRS();
    }

    /**
     * Create an instance of {@link ArrayOfHISTRS }
     * 
     */
    public ArrayOfHISTRS createArrayOfHISTRS() {
        return new ArrayOfHISTRS();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link WsGetHeadquarterRegistrationList }
     * 
     */
    public WsGetHeadquarterRegistrationList createWsGetHeadquarterRegistrationList() {
        return new WsGetHeadquarterRegistrationList();
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
     * Create an instance of {@link WsGetHeadquarterRegistrationListResponse }
     * 
     */
    public WsGetHeadquarterRegistrationListResponse createWsGetHeadquarterRegistrationListResponse() {
        return new WsGetHeadquarterRegistrationListResponse();
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
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfREGNRS }
     * 
     */
    public ArrayOfREGNRS createArrayOfREGNRS() {
        return new ArrayOfREGNRS();
    }

    /**
     * Create an instance of {@link GetHeadquarterRegistrationListResponse }
     * 
     */
    public GetHeadquarterRegistrationListResponse createGetHeadquarterRegistrationListResponse() {
        return new GetHeadquarterRegistrationListResponse();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link GetHeadquarterRegistrationListData }
     * 
     */
    public GetHeadquarterRegistrationListData createGetHeadquarterRegistrationListData() {
        return new GetHeadquarterRegistrationListData();
    }

    /**
     * Create an instance of {@link HQREGNLSTRS }
     * 
     */
    public HQREGNLSTRS createHQREGNLSTRS() {
        return new HQREGNLSTRS();
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
     * Create an instance of {@link USERRS }
     * 
     */
    public USERRS createUSERRS() {
        return new USERRS();
    }

    /**
     * Create an instance of {@link HQREGNLSTTRNRS }
     * 
     */
    public HQREGNLSTTRNRS createHQREGNLSTTRNRS() {
        return new HQREGNLSTTRNRS();
    }

    /**
     * Create an instance of {@link HISTRS }
     * 
     */
    public HISTRS createHISTRS() {
        return new HISTRS();
    }

    /**
     * Create an instance of {@link ArrayOfPFLRS }
     * 
     */
    public ArrayOfPFLRS createArrayOfPFLRS() {
        return new ArrayOfPFLRS();
    }

    /**
     * Create an instance of {@link GetHeadquarterRegistrationListRequest }
     * 
     */
    public GetHeadquarterRegistrationListRequest createGetHeadquarterRegistrationListRequest() {
        return new GetHeadquarterRegistrationListRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetHeadquarterRegistrationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList", name = "ws_GetHeadquarterRegistrationListResponse")
    public JAXBElement<WsGetHeadquarterRegistrationListResponse> createWsGetHeadquarterRegistrationListResponse(WsGetHeadquarterRegistrationListResponse value) {
        return new JAXBElement<WsGetHeadquarterRegistrationListResponse>(_WsGetHeadquarterRegistrationListResponse_QNAME, WsGetHeadquarterRegistrationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetHeadquarterRegistrationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetHeadquarterRegistrationList/wsp_GetHeadquarterRegistrationList", name = "ws_GetHeadquarterRegistrationList")
    public JAXBElement<WsGetHeadquarterRegistrationList> createWsGetHeadquarterRegistrationList(WsGetHeadquarterRegistrationList value) {
        return new JAXBElement<WsGetHeadquarterRegistrationList>(_WsGetHeadquarterRegistrationList_QNAME, WsGetHeadquarterRegistrationList.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataDnBDUNSNumber_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataCustomerAccountID_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_To", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataExpirationDateTo(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataExpirationDateTo_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_From", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataExpirationDateFrom(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataExpirationDateFrom_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Product_Name", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataProductName(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataProductName_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataCharacterSetOverride_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_To", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataRenewalDateTo(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataRenewalDateTo_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataEndorsement(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataEndorsement_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_From", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataRenewalDateFrom(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataRenewalDateFrom_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataCountryCode(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataCountryCode_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_To", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataLastUpdateDateTo(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataLastUpdateDateTo_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataNotificationLevel(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataNotificationLevel_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result_Ticket", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataResultTicket(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataResultTicket_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_From", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataLastUpdateDateFrom(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataLastUpdateDateFrom_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Level", scope = GetHeadquarterRegistrationListData.class)
    public JAXBElement<String> createGetHeadquarterRegistrationListDataUserLevel(String value) {
        return new JAXBElement<String>(_GetHeadquarterRegistrationListDataUserLevel_QNAME, String.class, GetHeadquarterRegistrationListData.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQ_DUNS_NBR", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSHQDUNSNBR(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSHQDUNSNBR_QNAME, ArrayOfstring.class, REGNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "ENQ_DUNS_NBR", scope = REGNRS.class)
    public JAXBElement<ArrayOfstring> createREGNRSENQDUNSNBR(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_REGNRSENQDUNSNBR_QNAME, ArrayOfstring.class, REGNRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HQREGNLSTTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HQREGNLSTTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<HQREGNLSTTRNRS> createGLBLMNSVCMSGSRSV1HQREGNLSTTRNRS(HQREGNLSTTRNRS value) {
        return new JAXBElement<HQREGNLSTTRNRS>(_GLBLMNSVCMSGSRSV1HQREGNLSTTRNRS_QNAME, HQREGNLSTTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GLBLMNSVCMSGSRSV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GLBLMNSVCMSGSRSV1", scope = DGX.class)
    public JAXBElement<GLBLMNSVCMSGSRSV1> createDGXGLBLMNSVCMSGSRSV1(GLBLMNSVCMSGSRSV1 value) {
        return new JAXBElement<GLBLMNSVCMSGSRSV1>(_DGXGLBLMNSVCMSGSRSV1_QNAME, GLBLMNSVCMSGSRSV1 .class, DGX.class, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = HQREGNLSTTRNRS.class)
    public JAXBElement<String> createHQREGNLSTTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_HQREGNLSTTRNRSTRNUID_QNAME, String.class, HQREGNLSTTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = HQREGNLSTTRNRS.class)
    public JAXBElement<String> createHQREGNLSTTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_HQREGNLSTTRNRSRSLTTKT_QNAME, String.class, HQREGNLSTTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = HQREGNLSTTRNRS.class)
    public JAXBElement<STATUS2> createHQREGNLSTTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_HQREGNLSTTRNRSSTATUS_QNAME, STATUS2 .class, HQREGNLSTTRNRS.class, value);
    }

}
