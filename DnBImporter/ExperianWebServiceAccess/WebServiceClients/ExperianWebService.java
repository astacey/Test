package WebServiceClients;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;

import org.apache.commons.lang3.StringUtils;

import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.developer.WSBindingProvider;

public abstract class ExperianWebService 
{
	private static final String XMLNS_WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String XSD_WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	
	protected void addTokenToRequest(WSBindingProvider wsBinding) throws SOAPException
	{
		String token = TokenServiceClient.getInstance().getEncodedToken();
		
		SOAPFactory sf = SOAPFactory.newInstance();
		SOAPElement securityElement = sf.createElement("Security", "wsse", XSD_WSSE);
		SOAPElement authElement = sf.createElement("BinarySecurityToken", "wsse", XSD_WSSE);
		authElement.setAttribute("ValueType", "ExperianWASP");
		authElement.setAttribute("EncodingType", "wsse:Base64Binary");
		authElement.setAttribute("wsu:Id", "SecurityToken");
		authElement.addAttribute(new QName("xmlns:wsu"), XMLNS_WSU);
		authElement.addTextNode(StringUtils.replace(token, "\n", ""));
		
		securityElement.addChildElement(authElement);
				
		Header head = Headers.create(securityElement);
		
		wsBinding.setOutboundHeaders(head);
	}	
}
