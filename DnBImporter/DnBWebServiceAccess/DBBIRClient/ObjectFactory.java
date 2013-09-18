
package DBBIRClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBBIRClient package. 
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

    private final static QName _SocCodeAppVer_QNAME = new QName("", "AppVer");
    private final static QName _SocCodeAppId_QNAME = new QName("", "AppId");
    private final static QName _WsBIR_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1", "ws_BIR");
    private final static QName _WsBIRResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1", "ws_BIRResponse");
    private final static QName _InvestigationNotificationDelivery_QNAME = new QName("", "NotificationDelivery");
    private final static QName _InvestigationInvestigationDelivery_QNAME = new QName("", "InvestigationDelivery");
    private final static QName _InvestigationDeliveryEmailCopy_QNAME = new QName("", "Email_Copy");
    private final static QName _InvestigationDeliveryService_QNAME = new QName("", "Service");
    private final static QName _InvestigationDeliveryFormat_QNAME = new QName("", "Format");
    private final static QName _InvestigationDeliveryRptLanguage_QNAME = new QName("", "Rpt_Language");
    private final static QName _InvestigationDeliveryEmail_QNAME = new QName("", "Email");
    private final static QName _InvestigationDeliveryEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _InvestigationDeliveryMode_QNAME = new QName("", "Mode");
    private final static QName _InvestigationDeliveryCustRequest_QNAME = new QName("", "Cust_Request");
    private final static QName _ImmediateDeliveryIgnoreMissingFields_QNAME = new QName("", "Ignore_Missing_Fields");
    private final static QName _ImmediateDeliveryNotFromCache_QNAME = new QName("", "Not_From_Cache");
    private final static QName _AdditionalFieldsFieldValue_QNAME = new QName("", "FieldValue");
    private final static QName _AdditionalFieldsFieldName_QNAME = new QName("", "FieldName");
    private final static QName _NotificationDeliveryPhone_QNAME = new QName("", "Phone");
    private final static QName _NotificationDeliveryStateOrProvince_QNAME = new QName("", "State_or_Province");
    private final static QName _NotificationDeliveryPostalCode_QNAME = new QName("", "Postal_Code");
    private final static QName _NotificationDeliveryBusinessNumType_QNAME = new QName("", "Business_Num_Type");
    private final static QName _NotificationDeliveryBusinessNum_QNAME = new QName("", "Business_Num");
    private final static QName _NotificationDeliveryName_QNAME = new QName("", "Name");
    private final static QName _NotificationDeliveryAddressLine2_QNAME = new QName("", "Address_Line2");
    private final static QName _NotificationDeliveryAddressLine1_QNAME = new QName("", "Address_Line1");
    private final static QName _NotificationDeliveryTown_QNAME = new QName("", "Town");
    private final static QName _OrdersCharSetOverride_QNAME = new QName("", "Char_Set_Override");
    private final static QName _OrdersCountryCode_QNAME = new QName("", "Country_Code");
    private final static QName _OrdersReasonCode_QNAME = new QName("", "Reason_Code");
    private final static QName _OrdersTradeUpIndicator_QNAME = new QName("", "Trade_Up_Indicator");
    private final static QName _OrdersUserLanguage_QNAME = new QName("", "User_Language");
    private final static QName _OrdersFileId_QNAME = new QName("", "FileId");
    private final static QName _OrdersSBRIUnmatchedAGN_QNAME = new QName("", "SBRI_Unmatched_AGN");
    private final static QName _ProdOrderRequest2TRNUID_QNAME = new QName("", "TRNUID");
    private final static QName _ProdOrderRequest2Investigation_QNAME = new QName("", "Investigation");
    private final static QName _ProdOrderRequest2SocCode_QNAME = new QName("", "socCode");
    private final static QName _ProdOrderRequest2SRVRTID_QNAME = new QName("", "SRVRTID");
    private final static QName _ProdOrderRequest2AdditionalFields_QNAME = new QName("", "AdditionalFields");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBBIRClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SocCode }
     * 
     */
    public SocCode createSocCode() {
        return new SocCode();
    }

    /**
     * Create an instance of {@link Investigation }
     * 
     */
    public Investigation createInvestigation() {
        return new Investigation();
    }

    /**
     * Create an instance of {@link InvestigationDelivery }
     * 
     */
    public InvestigationDelivery createInvestigationDelivery() {
        return new InvestigationDelivery();
    }

    /**
     * Create an instance of {@link ImmediateDelivery }
     * 
     */
    public ImmediateDelivery createImmediateDelivery() {
        return new ImmediateDelivery();
    }

    /**
     * Create an instance of {@link AdditionalFields }
     * 
     */
    public AdditionalFields createAdditionalFields() {
        return new AdditionalFields();
    }

    /**
     * Create an instance of {@link WsBIR }
     * 
     */
    public WsBIR createWsBIR() {
        return new WsBIR();
    }

    /**
     * Create an instance of {@link WsBIRResponse }
     * 
     */
    public WsBIRResponse createWsBIRResponse() {
        return new WsBIRResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalFields }
     * 
     */
    public ArrayOfAdditionalFields createArrayOfAdditionalFields() {
        return new ArrayOfAdditionalFields();
    }

    /**
     * Create an instance of {@link NotificationDelivery }
     * 
     */
    public NotificationDelivery createNotificationDelivery() {
        return new NotificationDelivery();
    }

    /**
     * Create an instance of {@link Orders }
     * 
     */
    public Orders createOrders() {
        return new Orders();
    }

    /**
     * Create an instance of {@link ProdOrderRequest2 }
     * 
     */
    public ProdOrderRequest2 createProdOrderRequest2() {
        return new ProdOrderRequest2();
    }

    /**
     * Create an instance of {@link BIRResponse }
     * 
     */
    public BIRResponse createBIRResponse() {
        return new BIRResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBIR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1", name = "ws_BIR")
    public JAXBElement<WsBIR> createWsBIR(WsBIR value) {
        return new JAXBElement<WsBIR>(_WsBIR_QNAME, WsBIR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsBIRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/OtherProducts/BIR_V1/wsp_BIR_V1", name = "ws_BIRResponse")
    public JAXBElement<WsBIRResponse> createWsBIRResponse(WsBIRResponse value) {
        return new JAXBElement<WsBIRResponse>(_WsBIRResponse_QNAME, WsBIRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NotificationDelivery", scope = Investigation.class)
    public JAXBElement<NotificationDelivery> createInvestigationNotificationDelivery(NotificationDelivery value) {
        return new JAXBElement<NotificationDelivery>(_InvestigationNotificationDelivery_QNAME, NotificationDelivery.class, Investigation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestigationDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InvestigationDelivery", scope = Investigation.class)
    public JAXBElement<InvestigationDelivery> createInvestigationInvestigationDelivery(InvestigationDelivery value) {
        return new JAXBElement<InvestigationDelivery>(_InvestigationInvestigationDelivery_QNAME, InvestigationDelivery.class, Investigation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email_Copy", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryEmailCopy(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmailCopy_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Service", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryService(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryService_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Format", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryFormat(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryFormat_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Rpt_Language", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryRptLanguage(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryRptLanguage_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryEmail(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmail_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryEndorsement(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEndorsement_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Mode", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryMode(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryMode_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Cust_Request", scope = InvestigationDelivery.class)
    public JAXBElement<String> createInvestigationDeliveryCustRequest(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryCustRequest_QNAME, String.class, InvestigationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email_Copy", scope = ImmediateDelivery.class)
    public JAXBElement<String> createImmediateDeliveryEmailCopy(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmailCopy_QNAME, String.class, ImmediateDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Ignore_Missing_Fields", scope = ImmediateDelivery.class)
    public JAXBElement<String> createImmediateDeliveryIgnoreMissingFields(String value) {
        return new JAXBElement<String>(_ImmediateDeliveryIgnoreMissingFields_QNAME, String.class, ImmediateDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Rpt_Language", scope = ImmediateDelivery.class)
    public JAXBElement<String> createImmediateDeliveryRptLanguage(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryRptLanguage_QNAME, String.class, ImmediateDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = ImmediateDelivery.class)
    public JAXBElement<String> createImmediateDeliveryEmail(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmail_QNAME, String.class, ImmediateDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Not_From_Cache", scope = ImmediateDelivery.class)
    public JAXBElement<String> createImmediateDeliveryNotFromCache(String value) {
        return new JAXBElement<String>(_ImmediateDeliveryNotFromCache_QNAME, String.class, ImmediateDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FieldValue", scope = AdditionalFields.class)
    public JAXBElement<String> createAdditionalFieldsFieldValue(String value) {
        return new JAXBElement<String>(_AdditionalFieldsFieldValue_QNAME, String.class, AdditionalFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FieldName", scope = AdditionalFields.class)
    public JAXBElement<String> createAdditionalFieldsFieldName(String value) {
        return new JAXBElement<String>(_AdditionalFieldsFieldName_QNAME, String.class, AdditionalFields.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email_Copy", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryEmailCopy(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmailCopy_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Format", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryFormat(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryFormat_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Phone", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryPhone(String value) {
        return new JAXBElement<String>(_NotificationDeliveryPhone_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Rpt_Language", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryRptLanguage(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryRptLanguage_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State_or_Province", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryStateOrProvince(String value) {
        return new JAXBElement<String>(_NotificationDeliveryStateOrProvince_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Postal_Code", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryPostalCode(String value) {
        return new JAXBElement<String>(_NotificationDeliveryPostalCode_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Business_Num_Type", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryBusinessNumType(String value) {
        return new JAXBElement<String>(_NotificationDeliveryBusinessNumType_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Mode", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryMode(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryMode_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Business_Num", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryBusinessNum(String value) {
        return new JAXBElement<String>(_NotificationDeliveryBusinessNum_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryName(String value) {
        return new JAXBElement<String>(_NotificationDeliveryName_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryEmail(String value) {
        return new JAXBElement<String>(_InvestigationDeliveryEmail_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address_Line2", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryAddressLine2(String value) {
        return new JAXBElement<String>(_NotificationDeliveryAddressLine2_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Address_Line1", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryAddressLine1(String value) {
        return new JAXBElement<String>(_NotificationDeliveryAddressLine1_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Town", scope = NotificationDelivery.class)
    public JAXBElement<String> createNotificationDeliveryTown(String value) {
        return new JAXBElement<String>(_NotificationDeliveryTown_QNAME, String.class, NotificationDelivery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Char_Set_Override", scope = Orders.class)
    public JAXBElement<String> createOrdersCharSetOverride(String value) {
        return new JAXBElement<String>(_OrdersCharSetOverride_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Country_Code", scope = Orders.class)
    public JAXBElement<String> createOrdersCountryCode(String value) {
        return new JAXBElement<String>(_OrdersCountryCode_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Reason_Code", scope = Orders.class)
    public JAXBElement<String> createOrdersReasonCode(String value) {
        return new JAXBElement<String>(_OrdersReasonCode_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Trade_Up_Indicator", scope = Orders.class)
    public JAXBElement<String> createOrdersTradeUpIndicator(String value) {
        return new JAXBElement<String>(_OrdersTradeUpIndicator_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Language", scope = Orders.class)
    public JAXBElement<String> createOrdersUserLanguage(String value) {
        return new JAXBElement<String>(_OrdersUserLanguage_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FileId", scope = Orders.class)
    public JAXBElement<String> createOrdersFileId(String value) {
        return new JAXBElement<String>(_OrdersFileId_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SBRI_Unmatched_AGN", scope = Orders.class)
    public JAXBElement<String> createOrdersSBRIUnmatchedAGN(String value) {
        return new JAXBElement<String>(_OrdersSBRIUnmatchedAGN_QNAME, String.class, Orders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "TRNUID", scope = ProdOrderRequest2 .class)
    public JAXBElement<String> createProdOrderRequest2TRNUID(String value) {
        return new JAXBElement<String>(_ProdOrderRequest2TRNUID_QNAME, String.class, ProdOrderRequest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Investigation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Investigation", scope = ProdOrderRequest2 .class)
    public JAXBElement<Investigation> createProdOrderRequest2Investigation(Investigation value) {
        return new JAXBElement<Investigation>(_ProdOrderRequest2Investigation_QNAME, Investigation.class, ProdOrderRequest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "socCode", scope = ProdOrderRequest2 .class)
    public JAXBElement<SocCode> createProdOrderRequest2SocCode(SocCode value) {
        return new JAXBElement<SocCode>(_ProdOrderRequest2SocCode_QNAME, SocCode.class, ProdOrderRequest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SRVRTID", scope = ProdOrderRequest2 .class)
    public JAXBElement<String> createProdOrderRequest2SRVRTID(String value) {
        return new JAXBElement<String>(_ProdOrderRequest2SRVRTID_QNAME, String.class, ProdOrderRequest2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFields }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdditionalFields", scope = ProdOrderRequest2 .class)
    public JAXBElement<ArrayOfAdditionalFields> createProdOrderRequest2AdditionalFields(ArrayOfAdditionalFields value) {
        return new JAXBElement<ArrayOfAdditionalFields>(_ProdOrderRequest2AdditionalFields_QNAME, ArrayOfAdditionalFields.class, ProdOrderRequest2 .class, value);
    }

}
