
package DBGetRegistrationListClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the DBGetRegistrationListClient package. 
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

    private final static QName _WsGetRegistrationList_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList", "ws_GetRegistrationList");
    private final static QName _WsGetRegistrationListResponse_QNAME = new QName("http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList", "ws_GetRegistrationListResponse");
    private final static QName _GetRegistrationListDataDnBDUNSNumber_QNAME = new QName("", "DnB_DUNS_Number");
    private final static QName _GetRegistrationListDataCustomerAccountID_QNAME = new QName("", "Customer_Account_ID");
    private final static QName _GetRegistrationListDataExpirationDateTo_QNAME = new QName("", "Expiration_Date_To");
    private final static QName _GetRegistrationListDataExpirationDateFrom_QNAME = new QName("", "Expiration_Date_From");
    private final static QName _GetRegistrationListDataProductName_QNAME = new QName("", "Product_Name");
    private final static QName _GetRegistrationListDataCharacterSetOverride_QNAME = new QName("", "Character_Set_Override");
    private final static QName _GetRegistrationListDataRenewalDateTo_QNAME = new QName("", "Renewal_Date_To");
    private final static QName _GetRegistrationListDataEndorsement_QNAME = new QName("", "Endorsement");
    private final static QName _GetRegistrationListDataRenewalDateFrom_QNAME = new QName("", "Renewal_Date_From");
    private final static QName _GetRegistrationListDataCountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _GetRegistrationListDataLastUpdateDateTo_QNAME = new QName("", "Last_Update_Date_To");
    private final static QName _GetRegistrationListDataNotificationLevel_QNAME = new QName("", "Notification_Level");
    private final static QName _GetRegistrationListDataResultTicket_QNAME = new QName("", "Result_Ticket");
    private final static QName _GetRegistrationListDataLastUpdateDateFrom_QNAME = new QName("", "Last_Update_Date_From");
    private final static QName _GetRegistrationListDataUserLevel_QNAME = new QName("", "User_Level");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: DBGetRegistrationListClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRegistrationListRequest }
     * 
     */
    public GetRegistrationListRequest createGetRegistrationListRequest() {
        return new GetRegistrationListRequest();
    }

    /**
     * Create an instance of {@link WsGetRegistrationListResponse }
     * 
     */
    public WsGetRegistrationListResponse createWsGetRegistrationListResponse() {
        return new WsGetRegistrationListResponse();
    }

    /**
     * Create an instance of {@link WsGetRegistrationList }
     * 
     */
    public WsGetRegistrationList createWsGetRegistrationList() {
        return new WsGetRegistrationList();
    }

    /**
     * Create an instance of {@link GetRegistrationListData }
     * 
     */
    public GetRegistrationListData createGetRegistrationListData() {
        return new GetRegistrationListData();
    }

    /**
     * Create an instance of {@link GetRegistrationListResponse }
     * 
     */
    public GetRegistrationListResponse createGetRegistrationListResponse() {
        return new GetRegistrationListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetRegistrationList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList", name = "ws_GetRegistrationList")
    public JAXBElement<WsGetRegistrationList> createWsGetRegistrationList(WsGetRegistrationList value) {
        return new JAXBElement<WsGetRegistrationList>(_WsGetRegistrationList_QNAME, WsGetRegistrationList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetRegistrationListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dnb.com/DNB_WebServices/Providers/GetRegistrationList", name = "ws_GetRegistrationListResponse")
    public JAXBElement<WsGetRegistrationListResponse> createWsGetRegistrationListResponse(WsGetRegistrationListResponse value) {
        return new JAXBElement<WsGetRegistrationListResponse>(_WsGetRegistrationListResponse_QNAME, WsGetRegistrationListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DnB_DUNS_Number", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataDnBDUNSNumber(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataDnBDUNSNumber_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer_Account_ID", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataCustomerAccountID(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataCustomerAccountID_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_To", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataExpirationDateTo(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataExpirationDateTo_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Expiration_Date_From", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataExpirationDateFrom(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataExpirationDateFrom_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Product_Name", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataProductName(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataProductName_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Character_Set_Override", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataCharacterSetOverride(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataCharacterSetOverride_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_To", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataRenewalDateTo(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataRenewalDateTo_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Endorsement", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataEndorsement(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataEndorsement_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Renewal_Date_From", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataRenewalDateFrom(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataRenewalDateFrom_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CountryCode", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataCountryCode(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataCountryCode_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_To", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataLastUpdateDateTo(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataLastUpdateDateTo_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Notification_Level", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataNotificationLevel(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataNotificationLevel_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Result_Ticket", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataResultTicket(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataResultTicket_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Last_Update_Date_From", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataLastUpdateDateFrom(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataLastUpdateDateFrom_QNAME, String.class, GetRegistrationListData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "User_Level", scope = GetRegistrationListData.class)
    public JAXBElement<String> createGetRegistrationListDataUserLevel(String value) {
        return new JAXBElement<String>(_GetRegistrationListDataUserLevel_QNAME, String.class, GetRegistrationListData.class, value);
    }

}
