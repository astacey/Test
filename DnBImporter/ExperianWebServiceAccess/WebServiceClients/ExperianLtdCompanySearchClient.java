package WebServiceClients;

import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;

import ExperianLtdCompanySearchWS.*;

public class ExperianLtdCompanySearchClient 
{
	private static Logger logger = Logger.getLogger(ExperianLtdCompanySearchClient.class.getName());
	
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/LtdCompanySearch.svc";
	
	public LtdCompanyData getCompany(String id)
	{
		LtdCompanyRequest input = new LtdCompanyRequest(); 
		input.setRegNumber(id);		
		
		LtdCompanySearch search = new LtdCompanySearch();
		ExperianUKBIServicesCoreIServices client = search.getLimitedCompanyData();
		BindingProvider bindingProvider = (BindingProvider) client;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		LtdCompanyData output = client.limitedCompanyData(input);
		return output;
	}
}
