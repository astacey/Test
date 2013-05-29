
package DBModifyRegistrationClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBModifyRegistrationClient package. 
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

    private final static QName _WsModifyRegistration_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", "ws_ModifyRegistration");
    private final static QName _Exception_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", "Exception");
    private final static QName _WsModifyRegistrationResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", "ws_ModifyRegistrationResponse");
    private final static QName _STATUS2TECHMESSAGE_QNAME = new QName("", "TECH_MESSAGE");
    private final static QName _STATUS2SUPPORTMESSAGE_QNAME = new QName("", "SUPPORT_MESSAGE");
    private final static QName _HISTRSACTVCD_QNAME = new QName("", "ACTV_CD");
    private final static QName _HISTRSADDLDETRS_QNAME = new QName("", "ADDL_DET_RS");
    private final static QName _HISTRSACTVDT_QNAME = new QName("", "ACTV_DT");
    private final static QName _HISTRSACTVDESC_QNAME = new QName("", "ACTV_DESC");
    private final static QName _ModifyRegistrationRequestDataUnCancelRegistration_QNAME = new QName("", "Un-cancel_Registration");
    private final static QName _ModifyRegistrationRequestDataExpirationDate_QNAME = new QName("", "Expiration_Date");
    private final static QName _ModifyRegistrationRequestDataRenewRegistration_QNAME = new QName("", "Renew_Registration");
    private final static QName _ModifyRegistrationRequestDataCancelRegistration_QNAME = new QName("", "Cancel_Registration");
    private final static QName _ModifyRegistrationRequestDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _ModifyRegistrationRequestDataNewEndorsement_QNAME = new QName("", "New_Endorsement");
    private final static QName _ModifyRegistrationRequestDataDoNotRenewRegistration_QNAME = new QName("", "Do_not_Renew_Registration");
    private final static QName _ModifyRegistrationRequestDataNewAccountID_QNAME = new QName("", "New_Account_ID");
    private final static QName _ModifyRegistrationRequestDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _ModifyRegistrationRequestDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _ModifyRegistrationRequestDataCustomerEndorsement_QNAME = new QName("", "Customer_Endorsement");
    private final static QName _SONRSDTSERVER_QNAME = new QName("", "DTSERVER");
    private final static QName _SONRSLANGUAGE_QNAME = new QName("", "LANGUAGE");
    private final static QName _ADDLDETRSCHRGXMITDT_QNAME = new QName("", "CHRG_XMIT_DT");
    private final static QName _ADDLDETRSREGNCTRYCD_QNAME = new QName("", "REGN_CTRY_CD");
    private final static QName _ADDLDETRSXFERDUNSNBR_QNAME = new QName("", "XFER_DUNS_NBR");
    private final static QName _ADDLDETRSFRMRDUNSNBR_QNAME = new QName("", "FRMR_DUNS_NBR");
    private final static QName _ADDLDETRSFINLEMBTIND_QNAME = new QName("", "FINL_EMBT_IND");
    private final static QName _ADDLDETRSTRADEUPDUNSNBR_QNAME = new QName("", "TRADE_UP_DUNS_NBR");
    private final static QName _MODREGNRSUSERRS_QNAME = new QName("", "USERRS");
    private final static QName _MODREGNTRNRSRSLTTKT_QNAME = new QName("", "RSLT_TKT");
    private final static QName _MODREGNTRNRSMODREGNRS_QNAME = new QName("", "MODREGNRS");
    private final static QName _MODREGNTRNRSSTATUS_QNAME = new QName("", "STATUS");
    private final static QName _USERRSPFLRS_QNAME = new QName("", "PFLRS");
    private final static QName _USERRSUSERID_QNAME = new QName("", "USERID");
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
    private final static QName _GLBLMNSVCMSGSRSV1MODREGNTRNRS_QNAME = new QName("", "MODREGNTRNRS");
    private final static QName _PFLRSREGNRS_QNAME = new QName("", "REGNRS");
    private final static QName _PFLRSNTFCLVL_QNAME = new QName("", "NTFC_LVL");
    private final static QName _PFLRSPRODNME_QNAME = new QName("", "PROD_NME");
    private final static QName _PFLRSPFLNME_QNAME = new QName("", "PFL_NME");
    private final static QName _DGXGLBLMNSVCMSGSRSV1_QNAME = new QName("", "GLBLMNSVCMSGSRSV1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBModifyRegistrationClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfREGNRS }
     * 
     */
    public ArrayOfREGNRS createArrayOfREGNRS() {
        return new ArrayOfREGNRS();
    }

    /**
     * Create an instance of {@link ModifyRegistrationResponse }
     * 
     */
    public ModifyRegistrationResponse createModifyRegistrationResponse() {
        return new ModifyRegistrationResponse();
    }

    /**
     * Create an instance of {@link HISTRS }
     * 
     */
    public HISTRS createHISTRS() {
        return new HISTRS();
    }

    /**
     * Create an instance of {@link ModifyRegistrationRequestData }
     * 
     */
    public ModifyRegistrationRequestData createModifyRegistrationRequestData() {
        return new ModifyRegistrationRequestData();
    }

    /**
     * Create an instance of {@link ArrayOfMODREGNRS }
     * 
     */
    public ArrayOfMODREGNRS createArrayOfMODREGNRS() {
        return new ArrayOfMODREGNRS();
    }

    /**
     * Create an instance of {@link ADDLDETRS }
     * 
     */
    public ADDLDETRS createADDLDETRS() {
        return new ADDLDETRS();
    }

    /**
     * Create an instance of {@link ArrayOfUSERRS }
     * 
     */
    public ArrayOfUSERRS createArrayOfUSERRS() {
        return new ArrayOfUSERRS();
    }

    /**
     * Create an instance of {@link ModifyRegistrationRequest }
     * 
     */
    public ModifyRegistrationRequest createModifyRegistrationRequest() {
        return new ModifyRegistrationRequest();
    }

    /**
     * Create an instance of {@link MODREGNTRNRS }
     * 
     */
    public MODREGNTRNRS createMODREGNTRNRS() {
        return new MODREGNTRNRS();
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
     * Create an instance of {@link ArrayOfPFLRS }
     * 
     */
    public ArrayOfPFLRS createArrayOfPFLRS() {
        return new ArrayOfPFLRS();
    }

    /**
     * Create an instance of {@link WsModifyRegistrationResponse }
     * 
     */
    public WsModifyRegistrationResponse createWsModifyRegistrationResponse() {
        return new WsModifyRegistrationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfADDLDETRS }
     * 
     */
    public ArrayOfADDLDETRS createArrayOfADDLDETRS() {
        return new ArrayOfADDLDETRS();
    }

    /**
     * Create an instance of {@link SIGNONMSGSRSV1 }
     * 
     */
    public SIGNONMSGSRSV1 createSIGNONMSGSRSV1() {
        return new SIGNONMSGSRSV1();
    }

    /**
     * Create an instance of {@link STATUS2 }
     * 
     */
    public STATUS2 createSTATUS2() {
        return new STATUS2();
    }

    /**
     * Create an instance of {@link WsModifyRegistration }
     * 
     */
    public WsModifyRegistration createWsModifyRegistration() {
        return new WsModifyRegistration();
    }

    /**
     * Create an instance of {@link SONRS }
     * 
     */
    public SONRS createSONRS() {
        return new SONRS();
    }

    /**
     * Create an instance of {@link MODREGNRS }
     * 
     */
    public MODREGNRS createMODREGNRS() {
        return new MODREGNRS();
    }

    /**
     * Create an instance of {@link REGNRS }
     * 
     */
    public REGNRS createREGNRS() {
        return new REGNRS();
    }

    /**
     * Create an instance of {@link GLBLMNSVCMSGSRSV1 }
     * 
     */
    public GLBLMNSVCMSGSRSV1 createGLBLMNSVCMSGSRSV1() {
        return new GLBLMNSVCMSGSRSV1();
    }

    /**
     * Create an instance of {@link ArrayOfHISTRS }
     * 
     */
    public ArrayOfHISTRS createArrayOfHISTRS() {
        return new ArrayOfHISTRS();
    }

    /**
     * Create an instance of {@link PFLRS }
     * 
     */
    public PFLRS createPFLRS() {
        return new PFLRS();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModifyRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", name = "ws_ModifyRegistration")
    public JAXBElement<WsModifyRegistration> createWsModifyRegistration(WsModifyRegistration value) {
        return new JAXBElement<WsModifyRegistration>(_WsModifyRegistration_QNAME, WsModifyRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsModifyRegistrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/ModifyRegistration", name = "ws_ModifyRegistrationResponse")
    public JAXBElement<WsModifyRegistrationResponse> createWsModifyRegistrationResponse(WsModifyRegistrationResponse value) {
        return new JAXBElement<WsModifyRegistrationResponse>(_WsModifyRegistrationResponse_QNAME, WsModifyRegistrationResponse.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Un-cancel_Registration", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataUnCancelRegistration(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataUnCancelRegistration_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataExpirationDate(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataExpirationDate_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renew_Registration", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataRenewRegistration(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataRenewRegistration_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cancel_Registration", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataCancelRegistration(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataCancelRegistration_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataCharacterSetOverride_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "New_Endorsement", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataNewEndorsement(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataNewEndorsement_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Do_not_Renew_Registration", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataDoNotRenewRegistration(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataDoNotRenewRegistration_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "New_Account_ID", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataNewAccountID(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataNewAccountID_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataCountryCode(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataCountryCode_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataCustomerAccountID_QNAME, String.class, ModifyRegistrationRequestData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Endorsement", scope = ModifyRegistrationRequestData.class)
    public JAXBElement<String> createModifyRegistrationRequestDataCustomerEndorsement(String value) {
        return new JAXBElement<String>(_ModifyRegistrationRequestDataCustomerEndorsement_QNAME, String.class, ModifyRegistrationRequestData.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUSERRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "USERRS", scope = MODREGNRS.class)
    public JAXBElement<ArrayOfUSERRS> createMODREGNRSUSERRS(ArrayOfUSERRS value) {
        return new JAXBElement<ArrayOfUSERRS>(_MODREGNRSUSERRS_QNAME, ArrayOfUSERRS.class, MODREGNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RSLT_TKT", scope = MODREGNTRNRS.class)
    public JAXBElement<String> createMODREGNTRNRSRSLTTKT(String value) {
        return new JAXBElement<String>(_MODREGNTRNRSRSLTTKT_QNAME, String.class, MODREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMODREGNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MODREGNRS", scope = MODREGNTRNRS.class)
    public JAXBElement<ArrayOfMODREGNRS> createMODREGNTRNRSMODREGNRS(ArrayOfMODREGNRS value) {
        return new JAXBElement<ArrayOfMODREGNRS>(_MODREGNTRNRSMODREGNRS_QNAME, ArrayOfMODREGNRS.class, MODREGNTRNRS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STATUS2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS", scope = MODREGNTRNRS.class)
    public JAXBElement<STATUS2> createMODREGNTRNRSSTATUS(STATUS2 value) {
        return new JAXBElement<STATUS2>(_MODREGNTRNRSSTATUS_QNAME, STATUS2 .class, MODREGNTRNRS.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MODREGNTRNRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MODREGNTRNRS", scope = GLBLMNSVCMSGSRSV1 .class)
    public JAXBElement<MODREGNTRNRS> createGLBLMNSVCMSGSRSV1MODREGNTRNRS(MODREGNTRNRS value) {
        return new JAXBElement<MODREGNTRNRS>(_GLBLMNSVCMSGSRSV1MODREGNTRNRS_QNAME, MODREGNTRNRS.class, GLBLMNSVCMSGSRSV1 .class, value);
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

}
