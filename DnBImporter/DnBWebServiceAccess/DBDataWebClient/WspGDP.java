
package DBDataWebClient;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "wsp_GDP", targetNamespace = "http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP", wsdlLocation = "file:WSDL/GDP.wsdl")
public class WspGDP
    extends Service
{

    private final static URL WSPGDP_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(DBDataWebClient.WspGDP.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = DBDataWebClient.WspGDP.class.getResource(".");
            url = new URL(baseUrl, "file:WSDL/GDP.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:WSDL/GDP.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WSPGDP_WSDL_LOCATION = url;
    }

    public WspGDP(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    // Added so that I can pass in the path of the wsdl file.
    public WspGDP(URL url)
    {
    	super(url, new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP", "wsp_GDP"));
    }
    
    public WspGDP() {
        super(WSPGDP_WSDL_LOCATION, new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP", "wsp_GDP"));
    }

    /**
     * 
     * @return
     *     returns WspGDPPortType
     */
    @WebEndpoint(name = "DNB_WebServices_Providers_OrderAndInvestigations_GDP_wsp_GDP_Port")
    public WspGDPPortType getDNBWebServicesProvidersOrderAndInvestigationsGDPWspGDPPort() {
        return super.getPort(new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP", "DNB_WebServices_Providers_OrderAndInvestigations_GDP_wsp_GDP_Port"), WspGDPPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WspGDPPortType
     */
    @WebEndpoint(name = "DNB_WebServices_Providers_OrderAndInvestigations_GDP_wsp_GDP_Port")
    public WspGDPPortType getDNBWebServicesProvidersOrderAndInvestigationsGDPWspGDPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.dnb.com/DNB_WebServices/Providers/OrderAndInvestigations/GDP/wsp_GDP", "DNB_WebServices_Providers_OrderAndInvestigations_GDP_wsp_GDP_Port"), WspGDPPortType.class, features);
    }

}
