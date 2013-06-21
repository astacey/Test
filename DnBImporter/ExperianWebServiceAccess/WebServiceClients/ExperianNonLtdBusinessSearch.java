package WebServiceClients;

import java.util.logging.Logger;

import javax.xml.ws.BindingProvider;

import ExperianNonLtdBusinessSearchWS.*;


public class ExperianNonLtdBusinessSearch 
{
private static Logger logger = Logger.getLogger(ExperianNonLtdBusinessSearch.class.getName());
	
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/NonLtdBusinessSearch.svc";
	
	public NonLtdBusinessData getCompany(String id)
	{
		NonLtdBusinessRequest input = new NonLtdBusinessRequest(); 
		input.setNonLimitedKey(id);		
		
		NonLtdBusinessSearch search = new NonLtdBusinessSearch();
		ExperianUKBIServicesCoreIServices client = search.getTargetNonLimitedBusiness();
		BindingProvider bindingProvider = (BindingProvider) client;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		NonLtdBusinessData output = client.nonLtdBusinessSearch(input);
		return output;
	}
}
