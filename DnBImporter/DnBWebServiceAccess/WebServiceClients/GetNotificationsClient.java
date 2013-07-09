package WebServiceClients;

import java.util.Date;
import java.text.*;
import Application.JaxBHelper;

import DBGetNotificationsClientV1.GLBLMNSVCMSGSRSV1;
import DBGetNotificationsClientV1.GetNotificationsRequest;
import DBGetNotificationsClientV1.GetNotificationsRequestData;
import DBGetNotificationsClientV1.ObjectFactory;
import DBGetNotificationsClientV1.WspGetNotificationsV1;
import DBGetNotificationsClientV1.WspGetNotificationsV1PortType;


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
		
		WspGetNotificationsV1 client = new WspGetNotificationsV1();
		
		WspGetNotificationsV1PortType port = client.getDNBWebServicesProvidersGetNotificationsV1WspGetNotificationsV1Port();
		
		//try
		//{
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, port.wsGetNotifications(request).getDGX().getGLBLMNSVCMSGSRSV1());
		//}
		//catch(Exception e)
		//{
		//	responseXml = e.getMessage();
		//}
		return responseXml;
	}
}
