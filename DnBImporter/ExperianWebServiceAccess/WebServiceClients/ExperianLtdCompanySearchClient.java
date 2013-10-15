package WebServiceClients;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import ExperianLtdCompanySearchWS.*;

import com.sun.xml.ws.developer.WSBindingProvider;

public class ExperianLtdCompanySearchClient extends ExperianWebService
{
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/LtdCompanySearch.svc";
	
	public LtdCompanyData getCompany(String id) throws SOAPException
	{
		LtdCompanyRequest input = new LtdCompanyRequest(); 
		input.setRegNumber(id);		
		
		LtdCompanySearch search = new LtdCompanySearch();
		ExperianUKBIServicesCoreIServices client = search.getLimitedCompanyData();
		BindingProvider bindingProvider = (BindingProvider) client;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		addTokenToRequest((WSBindingProvider)client);
		LtdCompanyData output = client.limitedCompanyData(input);
		return output;
	}
}
