package WebServiceClients;

import java.util.logging.Logger;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import com.sun.xml.ws.developer.WSBindingProvider;

import Domain.ExperianLegalStatus;
import ExperianAlertsAddRemoveWS.*;

public class ExperianAlertsAddRemoveClient extends ExperianWebService 
{
	private static Logger logger = Logger.getLogger(ExperianAlertsAddRemoveClient.class.getName());
	
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/AlertsAddRemove.svc";
	
	public Boolean addAlert(String ref, ExperianLegalStatus status) throws SOAPException
	{
		return performAction(ref, status, "A");
	}
	
	public Boolean removeAlert(String ref, ExperianLegalStatus status) throws SOAPException
	{
		return performAction(ref, status, "R");
	}
	
	private Boolean performAction(String ref, ExperianLegalStatus status, String action) throws SOAPException
	{
		AlertsAddRemoveInput input = new AlertsAddRemoveInput();
		input.setAction(action);

		Business bus = new Business();
		if(status==ExperianLegalStatus.LIMITED)
		{
			bus.setRegNumber(ref);
		}
		if(status==ExperianLegalStatus.NONLIMITED)
		{
			bus.setNonLimitedKey(ref);
		}
		input.setBusiness(bus);
		
		AlertsAddRemove aar = new AlertsAddRemove();
		ExperianUKBIServicesCoreIServices aarClient = aar.getAddRemoveAlertBusiness();
		
		// set Service URL
		BindingProvider bindingProvider = (BindingProvider) aarClient;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		// Token Authentication
		addTokenToRequest((WSBindingProvider)aarClient);
		
		AlertsAddRemoveOutput output = aarClient.addRemoveAlertBusiness(input);
		
		if(output.getConfirmation()!=null
				&& output.getConfirmation().getActionConfirmation().equalsIgnoreCase(action)) // A = added, X=error, U=updated, R=removed 
			return true;
		return false;
	}
}
