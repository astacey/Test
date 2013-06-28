package WebServiceClients;

import java.util.logging.Logger;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import com.sun.xml.ws.developer.WSBindingProvider;


import ExperianBusinessTargetWS.*;

public class ExperianBusinessTargetClient extends ExperianWebService
{
	private static Logger logger = Logger.getLogger(ExperianBusinessTargetClient.class.getName());
		
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
		// make the call
		BusinessTarget bt = new BusinessTarget();
		ExperianUKBIServicesCoreIServices btclient = bt.getBusinessTarget();
		BindingProvider bindingProvider = (BindingProvider) btclient;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);

		// authentication handled in super class
		addTokenToRequest((WSBindingProvider)btclient);
		
		BusinessTargetOutput output = btclient.callBusinessTarget(input);
		
		return output;
	}
}
