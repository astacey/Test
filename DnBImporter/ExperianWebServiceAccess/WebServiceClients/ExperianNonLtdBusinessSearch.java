package WebServiceClients;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import ExperianNonLtdBusinessSearchWS.*;

import com.sun.xml.ws.developer.WSBindingProvider;

public class ExperianNonLtdBusinessSearch extends ExperianWebService
{
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/NonLtdBusinessSearch.svc";
	
	public NonLtdBusinessData getCompany(String id) throws SOAPException
	{
		NonLtdBusinessRequest input = new NonLtdBusinessRequest(); 
		input.setNonLimitedKey(id);		
		
		NonLtdBusinessSearch search = new NonLtdBusinessSearch();
		ExperianUKBIServicesCoreIServices client = search.getTargetNonLimitedBusiness();
		BindingProvider bindingProvider = (BindingProvider) client;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);

		addTokenToRequest((WSBindingProvider)client);
		NonLtdBusinessData output = client.nonLtdBusinessSearch(input);
		return output;
	}
}
