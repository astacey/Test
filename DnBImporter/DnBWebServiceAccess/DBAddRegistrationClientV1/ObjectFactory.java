
package DBAddRegistrationClientV1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBAddRegistrationClientV1 package. 
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

    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");
    private final static QName _WsAddRegistration_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1", "ws_AddRegistration");
    private final static QName _WsAddRegistrationResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1", "ws_AddRegistrationResponse");
    private final static QName _STATUSTECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUSSUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _AddRegistrationDataTradeUpIndicator_QNAME = new QName("", "Trade_up_Indicator");
    private final static QName _AddRegistrationDataExpirationDate_QNAME = new QName("", "Expiration_Date");
    private final static QName _AddRegistrationDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _AddRegistrationDataReasonCode_QNAME = new QName("", "Reason_Code");
    private final static QName _AddRegistrationDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _AddRegistrationDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _AddRegistrationDataDoNotRenew_QNAME = new QName("", "Do_not_Renew");
    private final static QName _GLBLMNSVCMSGSRSV1ADDREGNTRNRS_QNAME = new QName("", "ADDREGNTRNRS");
    private final static QName _ADDREGNTRNRSTRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _ADDREGNTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _ADDREGNTRNRSSTATUS_QNAME = new QName("", "STATUS");
    private final static QName _ADDREGNTRNRSADDREGNRS_QNAME = new QName("", "ADDREGNRS");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _ADDREGNRSSTATDESC_QNAME = new QName("", "STAT_DESC");
    private final static QName _ADDREGNRSACTVCD_QNAME = new QName("", "ACTV_CD");
    private final static QName _ADDREGNRSEXPDT_QNAME = new QName("", "EXP_DT");
    private final static QName _ADDREGNRSRNEWDT_QNAME = new QName("", "RNEW_DT");
    private final static QName _ADDREGNRSBKCYIND_QNAME = new QName("", "BKCY_IND");
    private final static QName _ADDREGNRSSTATCD_QNAME = new QName("", "STAT_CD");
    private final static QName _ADDREGNRSACTVDESC_QNAME = new QName("", "ACTV_DESC");
    private final static QName _STATUS2MESSAGE_QNAME = new QName("", "MESSAGE");
    private final static QName _STATUS2SEVERITY_QNAME = new QName("", "SEVERITY");
    private final static QName _STATUS2CODE_QNAME = new QName("", "CODE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBAddRegistrationClientV1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfADDREGNRS }
     * 
     */
    public ArrayOfADDREGNRS createArrayOfADDREGNRS() {
        return new ArrayOfADDREGNRS();
    }

    /**
     * Create an instance of {@link WsAddRegistration }
     * 
     */
    public WsAddRegistration createWsAddRegistration() {
        return new WsAddRegistration();
    }

    /**
     * Create an instance of {@link AddRegistrationData }
     * 
     */
    public AddRegistrationData createAddRegistrationData() {
        return new AddRegistrationData();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
    }

    /**
     * Create an instance of {@link AddRegistrationResponse }
     * 
     */
    public AddRegistrationResponse createAddRegistrationResponse() {
        return new AddRegistrationResponse();
    }

    /**
     * Create an instance of {@link ADDREGNTRNRS }
     * 
     */
    public ADDREGNTRNRS createADDREGNTRNRS() {
        return new ADDREGNTRNRS();
    }

    /**
     * Create an instance of {@link SIGNONMSGSRSV1 }
     * 
     */
    public SIGNONMSGSRSV1 createSIGNONMSGSRSV1() {
        return new SIGNONMSGSRSV1();
    }

    /**
     * Create an instance of {@link ADDREGNRS }
     * 
     */
    public ADDREGNRS createADDREGNRS() {
        return new ADDREGNRS();
    }

    /**
     * Create an instance of {@link WsAddRegistrationResponse }
     * 
     */
    public WsAddRegistrationResponse createWsAddRegistrationResponse() {
        return new WsAddRegistrationResponse();
    }

    /**
     * Create an instance of {@link DGX }
     * 
     */
    public DGX createDGX() {
        return new DGX();
    }

    /**
     * Create an instance of {@link STATUS }
     * 
     */
    public STATUS createSTATUS() {
        return new STATUS();
    }

    /**
     * Create an instance of {@link AddRegistrationRequest }
     * 
     */
    public AddRegistrationRequest createAddRegistrationRequest() {
        return new AddRegistrationRequest();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAddRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1", name = "ws_AddRegistration")
    public JAXBElement<WsAddRegistration> createWsAddRegistration(WsAddRegistration value) {
        return new JAXBElement<WsAddRegistration>(_WsAddRegistration_QNAME, WsAddRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsAddRegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/AddRegistration_V1/wsp_AddRegistration_V1", name = "ws_AddRegistrationResponse")
    public JAXBElement<WsAddRegistrationResponse> createWsAddRegistrationResponse(WsAddRegistrationResponse value) {
        return new JAXBElement<WsAddRegistrationResponse>(_WsAddRegistrationResponse_QNAME, WsAddRegistrationResponse.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Trade_up_Indicator", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataTradeUpIndicator(String value) {
        return new JAXBElement<String>(_AddRegistrationDataTradeUpIndicator_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataExpirationDate(String value) {
        return new JAXBElement<String>(_AddRegistrationDataExpirationDate_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataEndorsement(String value) {
        return new JAXBElement<String>(_AddRegistrationDataEndorsement_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reason_Code", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataReasonCode(String value) {
        return new JAXBElement<String>(_AddRegistrationDataReasonCode_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataCountryCode(String value) {
        return new JAXBElement<String>(_AddRegistrationDataCountryCode_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_AddRegistrationDataCustomerAccountID_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Do_not_Renew", scope = AddRegistrationData.class)
    public JAXBElement<String> createAddRegistrationDataDoNotRenew(String value) {
        return new JAXBElement<String>(_AddRegistrationDataDoNotRenew_QNAME, String.class, AddRegistrationData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ADDREGNTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDREGNTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<ADDREGNTRNRS> createGLBLMNSVCMSGSRSV1ADDREGNTRNRS(ADDREGNTRNRS value) {
        return new JAXBElement<ADDREGNTRNRS>(_GLBLMNSVCMSGSRSV1ADDREGNTRNRS_QNAME, ADDREGNTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = ADDREGNTRNRS.class)
    public JAXBElement<String> createADDREGNTRNRSTRNUID(String value) {
        return new JAXBElement<String>(_ADDREGNTRNRSTRNUID_QNAME, String.class, ADDREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = ADDREGNTRNRS.class)
    public JAXBElement<String> createADDREGNTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_ADDREGNTRNRSRSLTTKT_QNAME, String.class, ADDREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = ADDREGNTRNRS.class)
    public JAXBElement<STATUS2> createADDREGNTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_ADDREGNTRNRSSTATUS_QNAME, STATUS2 .class, ADDREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfADDREGNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ADDREGNRS", scope = ADDREGNTRNRS.class)
    public JAXBElement<ArrayOfADDREGNRS> createADDREGNTRNRSADDREGNRS(ArrayOfADDREGNRS value) {
        return new JAXBElement<ArrayOfADDREGNRS>(_ADDREGNTRNRSADDREGNRS_QNAME, ArrayOfADDREGNRS.class, ADDREGNTRNRS.class, value);
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
    @XmlElementDecl(namespace = "", name = "STAT_DESC", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSSTATDESC(String value) {
        return new JAXBElement<String>(_ADDREGNRSSTATDESC_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTV_CD", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSACTVCD(String value) {
        return new JAXBElement<String>(_ADDREGNRSACTVCD_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXP_DT", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSEXPDT(String value) {
        return new JAXBElement<String>(_ADDREGNRSEXPDT_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RNEW_DT", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSRNEWDT(String value) {
        return new JAXBElement<String>(_ADDREGNRSRNEWDT_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "BKCY_IND", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSBKCYIND(String value) {
        return new JAXBElement<String>(_ADDREGNRSBKCYIND_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STAT_CD", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSSTATCD(String value) {
        return new JAXBElement<String>(_ADDREGNRSSTATCD_QNAME, String.class, ADDREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ACTV_DESC", scope = ADDREGNRS.class)
    public JAXBElement<String> createADDREGNRSACTVDESC(String value) {
        return new JAXBElement<String>(_ADDREGNRSACTVDESC_QNAME, String.class, ADDREGNRS.class, value);
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

}
