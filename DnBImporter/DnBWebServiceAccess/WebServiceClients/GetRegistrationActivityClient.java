package WebServiceClients;
import java.text.SimpleDateFormat;
import java.util.Date;

import Application.JaxBHelper;

import DBGetRegistrationActivityClient.Exception_Exception;
import DBGetRegistrationActivityClient.GLBLMNSVCMSGSRSV1;
import DBGetRegistrationActivityClient.GetRegistrationActivityData;
import DBGetRegistrationActivityClient.GetRegistrationActivityRequest;
import DBGetRegistrationActivityClient.GetRegistrationActivityResponse;
import DBGetRegistrationActivityClient.WspGetRegistrationActivity;
import DBGetRegistrationActivityClient.WspGetRegistrationActivityPortType;


public class GetRegistrationActivityClient  extends DnBWebServiceClient 
{
	public GetRegistrationActivityClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String getRegistrationActivity(Date fromDate, Date toDate) throws Exception_Exception
	{
		String responseXml = "";
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		
		GetRegistrationActivityRequest request = new GetRegistrationActivityRequest();
		request.setUserId(userName);
		request.setPassword(password);
		
		GetRegistrationActivityData data = new GetRegistrationActivityData();
		data.setActivityDateFrom(dateFormatter.format(fromDate));
		data.setActivityDateTo(dateFormatter.format(toDate));
		
		request.setGetRegistrationActivityData(data);
		
		WspGetRegistrationActivity client = new WspGetRegistrationActivity();
		WspGetRegistrationActivityPortType port = client.getDNBWebServicesProvidersGetRegistrationActivityWspGetRegistrationActivityPort();
		
		GetRegistrationActivityResponse response = port.wsGetRegistrationActivity(request);
		responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getDGX().getGLBLMNSVCMSGSRSV1());

		return responseXml;
	}
}
