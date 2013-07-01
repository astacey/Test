package WebServiceClients;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.soap.SOAPException;
import javax.xml.ws.BindingProvider;

import com.sun.xml.ws.developer.WSBindingProvider;

import ExperianAlertsRequestWS.*;

public class ExperianAlertsRequestClient extends ExperianWebService 
{
	private static Logger logger = Logger.getLogger(ExperianAlertsRequestClient.class.getName());
	
	private static final String serviceUrl = "https://biwebservices.uat.uk.experian.com/experian/wbsv/generic/bi/v100/AlertsRequest.svc";

	public AlertsMessageOutput getAlerts(Date from, Date to) throws SOAPException
	{
		// Set up input
		AlertsMessageInput input = new AlertsMessageInput();
		Paging paging = new Paging();
		paging.setEndOfDataFlag(YesNoBlank.B); // ? No idea !
		paging.setFirstTimeFlag(YesNo.Y);
		input.setPaging(paging);
		Messages messages = new Messages();
		messages.setMessageType(MsgType.A); // All items
		messages.setAdverseLegalMessages(YesNo.Y);
		messages.setAccountsMessages(YesNo.Y);
		messages.setGeneralMessages(YesNo.Y);
		messages.setCCJMessages(YesNo.Y);
		messages.setPaymentMessages(YesNo.Y);
		messages.setCommercialDelphiMessages(YesNo.Y);
		messages.setExpiryMessages(YesNo.Y);
		
		messages.setLoadedSince(getCCYYMMDDFromDate(from));
		
		input.setMessages(messages);
		
		//Make the call
		AlertsRequest ar = new AlertsRequest();
		ExperianUKBIServicesCoreIServices client = ar.getRequestAlert();
		
		// set Service URL
		BindingProvider bindingProvider = (BindingProvider) client;
		bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, serviceUrl);
		
		// Token Authentication
		addTokenToRequest((WSBindingProvider)client);
		
		return client.requestAlert(input);
	}
	
	private CCYYMMDD getCCYYMMDDFromDate(Date theDate)
	{
		CCYYMMDD weirdDate = new CCYYMMDD();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
		weirdDate.setCCYY(formatter.format(theDate));

		formatter = new SimpleDateFormat("MM");
		weirdDate.setMM(formatter.format(theDate));
		
		formatter = new SimpleDateFormat("dd");
		weirdDate.setDD(formatter.format(theDate));
		
		return weirdDate;
	}
}
