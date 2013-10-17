package WebServiceClients;

import java.util.Date;
import java.text.*;
import Application.JaxBHelper;

import DBGetNotificationsClientV3.GLBLMNSVCMSGSRSV1;
import DBGetNotificationsClientV3.GetNotificationsRequest;
import DBGetNotificationsClientV3.GetNotificationsRequestData;
import DBGetNotificationsClientV3.GetNotificationsResponse;
import DBGetNotificationsClientV3.ObjectFactory;
import DBGetNotificationsClientV3.WspGetNotificationsV3;
import DBGetNotificationsClientV3.WspGetNotificationsV3PortType;


public class GetNotificationsClient extends DnBWebServiceClient 
{	
	public GetNotificationsClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String getNotifications(Date fromDate, Date toDate)
	{
		return getNotifications(fromDate, toDate, "");
	}
	
	public String getNotifications(Date fromDate, Date toDate, String resultTicket)
	{
		// Note : Date period requested needs to be within the last 90 days or the service throws an error
		//		: Date range cannot exceed 4 days or you get an error
		String responseXml = "";
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

		ObjectFactory helper = new ObjectFactory();
		
		GetNotificationsRequestData data = new GetNotificationsRequestData();
		
		data.setDetectionDateFrom(dateFormatter.format(fromDate));
		data.setDetectionDateTo(dateFormatter.format(toDate));
		if(resultTicket.length()>0)
			data.setResultTicket(helper.createGetNotificationsRequestDataResultTicket(resultTicket));
		
		GetNotificationsRequest request = new GetNotificationsRequest();
		request.setUserId(userName);
		request.setPassword(password);
		request.setGetNotificationsRequestData(data);
		
		WspGetNotificationsV3 client = new WspGetNotificationsV3();
		
		WspGetNotificationsV3PortType port = client.getDNBWebServicesProvidersGetNotificationsV3WspGetNotificationsV3Port();
		
		GetNotificationsResponse response = port.wsGetNotifications(request);
		
		// Check for sign on errors
		String code = response.getDGX().getSIGNONMSGSRSV1().getSONRS().getSTATUS().getCODE();
		
		if(code.equalsIgnoreCase("0"))
		{
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getDGX().getGLBLMNSVCMSGSRSV1());
		}
		else
		{
			// sign on error in xml- throw !
			String message = response.getDGX().getSIGNONMSGSRSV1().getSONRS().getSTATUS().getMESSAGE().getValue();
			RuntimeException e = new RuntimeException("Failed to log into D&B service.\n\n" + message); 
			throw e;
		}
		return responseXml;
	}
}
