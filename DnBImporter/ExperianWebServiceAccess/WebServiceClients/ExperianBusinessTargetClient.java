package WebServiceClients;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import com.sun.xml.ws.developer.WSBindingProvider;


import ExperianBusinessTargetWS.*;

public class ExperianBusinessTargetClient extends ExperianWebService
{
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/BusinessTarget.svc";
	
	public BusinessTargetOutput runBusinessTargetSearch(String businessName, String postCode) throws SOAPException
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
		if(postCode.length()>0)
		{
			InputLocation location = new InputLocation();
			location.setPostcode(postCode);
			details.setLocation(location);
		}
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
