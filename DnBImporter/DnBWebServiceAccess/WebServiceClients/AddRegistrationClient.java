package WebServiceClients;
import Application.JaxBHelper;

import DBAddRegistrationClient.AddRegistrationData;
import DBAddRegistrationClient.AddRegistrationRequest;
import DBAddRegistrationClient.AddRegistrationResponse;
import DBAddRegistrationClient.GLBLMNSVCMSGSRSV1;
import DBAddRegistrationClient.WspAddRegistration;
import DBAddRegistrationClient.WspAddRegistrationPortType;


public class AddRegistrationClient extends DnBWebServiceClient 
{	
	public AddRegistrationClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String addRegistration(String dunsNumber)
	{
		String responseXml = "";
		
		AddRegistrationRequest request = new AddRegistrationRequest();
		request.setUserId(userName);
		request.setPassword(password);
		
		AddRegistrationData data = new AddRegistrationData();
		data.setDnBDUNSNumber(dunsNumber);
		data.setProductName("Enterprise Management");
		data.setNotificationLevel("Level 3");
		request.setAddRegistrationData(data);
		
		WspAddRegistration client = new WspAddRegistration();
		
		WspAddRegistrationPortType port = client.getDNBWebServicesProvidersAddRegistrationWspAddRegistrationPort();
		
		try
		{
			AddRegistrationResponse response = port.wsAddRegistration(request);
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getDGX().getGLBLMNSVCMSGSRSV1());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return responseXml;
	}
	
}
