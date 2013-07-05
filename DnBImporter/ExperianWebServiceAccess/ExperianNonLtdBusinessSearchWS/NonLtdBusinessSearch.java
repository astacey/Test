
package ExperianNonLtdBusinessSearchWS;

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
@WebServiceClient(name = "NonLtdBusinessSearch", targetNamespace = "http://services.experian.com/experian/wbsv/generic/bi", wsdlLocation = "file:ExperianWSDL/NonLtdBusinessSearch.wsdl")
public class NonLtdBusinessSearch
    extends Service
{

    private final static URL NONLTDBUSINESSSEARCH_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(ExperianNonLtdBusinessSearchWS.NonLtdBusinessSearch.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = ExperianNonLtdBusinessSearchWS.NonLtdBusinessSearch.class.getResource(".");
            url = new URL(baseUrl, "file:ExperianWSDL/NonLtdBusinessSearch.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:ExperianWSDL/NonLtdBusinessSearch.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        NONLTDBUSINESSSEARCH_WSDL_LOCATION = url;
    }

    public NonLtdBusinessSearch(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NonLtdBusinessSearch() {
        super(NONLTDBUSINESSSEARCH_WSDL_LOCATION, new QName("http://services.experian.com/experian/wbsv/generic/bi", "NonLtdBusinessSearch"));
    }

    /**
     * 
     * @return
     *     returns ExperianUKBIServicesCoreIServices
     */
    @WebEndpoint(name = "TargetNonLimitedBusiness")
    public ExperianUKBIServicesCoreIServices getTargetNonLimitedBusiness() {
        return super.getPort(new QName("http://services.experian.com/experian/wbsv/generic/bi", "TargetNonLimitedBusiness"), ExperianUKBIServicesCoreIServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExperianUKBIServicesCoreIServices
     */
    @WebEndpoint(name = "TargetNonLimitedBusiness")
    public ExperianUKBIServicesCoreIServices getTargetNonLimitedBusiness(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.experian.com/experian/wbsv/generic/bi", "TargetNonLimitedBusiness"), ExperianUKBIServicesCoreIServices.class, features);
    }

}
