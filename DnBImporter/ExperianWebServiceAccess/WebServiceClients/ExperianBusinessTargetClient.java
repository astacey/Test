package WebServiceClients;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.BindingProvider;

import org.apache.commons.lang3.StringUtils;
//import org.apache.cxf.headers.Header;
//import org.apache.cxf.binding.soap.SoapHeader;

import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.developer.WSBindingProvider;


import ExperianBusinessTargetWS.*;

public class ExperianBusinessTargetClient 
{
	private static Logger logger = Logger.getLogger(ExperianBusinessTargetClient.class.getName());
	
	private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String XSD_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/BusinessTarget.svc";
	
	public BusinessTargetOutput runBusinessTargetSearch(String businessName) throws SOAPException
	{	
		BusinessTargetInput input = new BusinessTargetInput();
		// SearchType
		SearchCriteria criteria = new SearchCriteria();
		criteria.setSearchCorporates(YesNo.Y);
		criteria.setSearchNonCorps(YesNo.Y);
		criteria.setExcludeDissolved(YesNo.Y);
		input.setSearchType(criteria);
		
		// Search details 
		BusinessDetails details = new BusinessDetails();
		details.setBusinessName(businessName);
		input.setBusinessDetails(details);
		
		BusinessTarget bt = new BusinessTarget();
		ExperianUKBIServicesCoreIServices btclient = bt.getBusinessTarget();
		BindingProvider bindingProvider = (BindingProvider) btclient;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);

		String token = TokenServiceClient.getInstance().getEncodedToken();
		
/*		List<Header> headers = new ArrayList<Header>();
		SOAPFactory sf = SOAPFactory.newInstance();
		SOAPElement securityElement = sf.createElement("Security", "wsse", XSD_WSSE);
		SOAPElement authElement = sf.createElement("BinarySecurityToken", "wsse", XSD_WSSE);
		authElement.setAttribute("ValueType", "ExperianWASP");
		authElement.setAttribute("EncodingType", "wsse:Base64Binary");
		authElement.setAttribute("wsu:Id", "SecurityToken");
		authElement.addAttribute(new QName("xmlns:wsu"), XMLNS_WSU);
		authElement.addTextNode(StringUtils.replace(token, "\n", ""));
		
		securityElement.addChildElement(authElement);
		
		SoapHeader securityHeader = new SoapHeader(
		        new QName(null, "Security"), securityElement);
		
		headers.add(securityHeader);
	
//		bindingProvider.getRequestContext().put(Header.HEADER_LIST, headers);
*/
		WSBindingProvider wsBinding = (WSBindingProvider)btclient;
		
		String internal = "<wsse:BinarySecurityToken ValueType=\"ExperianWASP\" EncodingType=\"wsse:Base64Binary\" wsu:Id=\"SecurityToken \">" + token +"</wsse:BinarySecurityToken>";
		
		SOAPFactory sf = SOAPFactory.newInstance();
		SOAPElement securityElement = sf.createElement("Security", "wsse", XSD_WSSE);
		SOAPElement authElement = sf.createElement("BinarySecurityToken", "wsse", XSD_WSSE);
		authElement.setAttribute("ValueType", "ExperianWASP");
		authElement.setAttribute("EncodingType", "wsse:Base64Binary");
		authElement.setAttribute("wsu:Id", "SecurityToken");
		authElement.addAttribute(new QName("xmlns:wsu"), XMLNS_WSU);
		authElement.addTextNode(StringUtils.replace(token, "\n", ""));
		
		securityElement.addChildElement(authElement);
		
		QName securityQ = new QName(XSD_WSSE, "Security", "wsse");
		
		Header head = Headers.create(securityElement);
		
		wsBinding.setOutboundHeaders(head);
		
		BusinessTargetOutput output = btclient.callBusinessTarget(input);
		
		return output;
	}	
}
