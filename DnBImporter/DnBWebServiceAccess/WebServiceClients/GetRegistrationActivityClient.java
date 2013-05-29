package WebServiceClients;
import Application.JaxBHelper;

import DBGetRegistrationActivityClient.GLBLMNSVCMSGSRSV1;
import DBGetRegistrationActivityClient.GetRegistrationActivityData;
import DBGetRegistrationActivityClient.GetRegistrationActivityRequest;
import DBGetRegistrationActivityClient.GetRegistrationActivityResponse;
import DBGetRegistrationActivityClient.WspGetRegistrationActivity;
import DBGetRegistrationActivityClient.WspGetRegistrationActivityPortType;


public class GetRegistrationActivityClient 
{
	public String getRegistrationActivity()
	{
		String responseXml = "";
		
		GetRegistrationActivityRequest request = new GetRegistrationActivityRequest();
		request.setUserId("unit4test");
		request.setPassword("ed1r1ver");
		
		GetRegistrationActivityData data = new GetRegistrationActivityData();
		data.setActivityDateFrom("2013-01-01T00:00:00");
		data.setActivityDateTo("2013-12-01T00:00:00");
		
		request.setGetRegistrationActivityData(data);
		
		WspGetRegistrationActivity client = new WspGetRegistrationActivity();
		WspGetRegistrationActivityPortType port = client.getDNBWebServicesProvidersGetRegistrationActivityWspGetRegistrationActivityPort();
		
		try
		{
			GetRegistrationActivityResponse response = port.wsGetRegistrationActivity(request);
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getDGX().getGLBLMNSVCMSGSRSV1());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return responseXml;
	}
}
