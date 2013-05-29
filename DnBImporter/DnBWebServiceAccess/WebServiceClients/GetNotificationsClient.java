package WebServiceClients;

import java.util.Date;
import java.text.*;
import Application.JaxBHelper;

import DBGetNotificationsClient.GLBLMNSVCMSGSRSV1;
import DBGetNotificationsClient.GetNotificationsRequest;
import DBGetNotificationsClient.GetNotificationsRequestData;
import DBGetNotificationsClient.ObjectFactory;
import DBGetNotificationsClient.WspGetNotifications;
import DBGetNotificationsClient.WspGetNotificationsPortType;


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
//		data.setDnBDUNSNumber(helper.createGetNotificationsRequestDataDnBDUNSNumber("210084058"));
		
		GetNotificationsRequest request = new GetNotificationsRequest();
		request.setUserId(userName);
		request.setPassword(password);
		request.setGetNotificationsRequestData(data);
		
		WspGetNotifications client = new WspGetNotifications();
		
		WspGetNotificationsPortType port = client.getDNBWebServicesProvidersGetNotificationsWspGetNotificationsPort();
		
		try
		{
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, port.wsGetNotifications(request).getDGX().getGLBLMNSVCMSGSRSV1());
		}
		catch(Exception e)
		{
			responseXml = e.getMessage();
		}
		return responseXml;
	}
}
