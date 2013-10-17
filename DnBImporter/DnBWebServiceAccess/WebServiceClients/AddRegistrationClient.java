package WebServiceClients;
import Application.JaxBHelper;

import DBAddRegistrationClientV1.AddRegistrationData;
import DBAddRegistrationClientV1.AddRegistrationRequest;
import DBAddRegistrationClientV1.AddRegistrationResponse;
import DBAddRegistrationClientV1.GLBLMNSVCMSGSRSV1;
import DBAddRegistrationClientV1.ObjectFactory;
import DBAddRegistrationClientV1.WspAddRegistrationV1;
import DBAddRegistrationClientV1.WspAddRegistrationV1PortType;


public class AddRegistrationClient extends DnBWebServiceClient 
{	
	public AddRegistrationClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String addRegistration(String dunsNumber)
	{
		String responseXml = "";
//		ObjectFactory helper = new ObjectFactory();
		AddRegistrationRequest request = new AddRegistrationRequest();
		request.setUserId(userName);
		request.setPassword(password);
		
		AddRegistrationData data = new AddRegistrationData();
		data.setDnBDUNSNumber(dunsNumber);
		data.setProductName("Enterprise Management");
		data.setNotificationLevel("Level 3");
//		data.setCountryCode(helper.createAddRegistrationDataCountryCode("GB"));
//		data.setReasonCode(helper.createAddRegistrationDataReasonCode("1"));
		request.setAddRegistrationData(data);
		
		WspAddRegistrationV1 client = new WspAddRegistrationV1();
		
		WspAddRegistrationV1PortType port = client.getDNBWebServicesProvidersAddRegistrationV1WspAddRegistrationV1Port();
		
		AddRegistrationResponse response = port.wsAddRegistration(request);
		
		// Check for sign on errors
		String code = response.getDGX().getSIGNONMSGSRSV1().getSONRS().getSTATUS().getCODE();
		
		if(code.equalsIgnoreCase("0"))
		{
			responseXml = JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getDGX().getGLBLMNSVCMSGSRSV1());
		}
		else
		{
			// sign on error in xml- throw !
			String message = response.getDGX().getSIGNONMSGSRSV1().getSONRS().getSTATUS().getMESSAGE();
			RuntimeException e = new RuntimeException("Failed to log into D&B service.\n\n" + message); 
			throw e;
		}		

		return responseXml;
	}
}
