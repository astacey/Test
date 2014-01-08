package WebServiceClients;

import Application.JaxBHelper;
import DBModifyRegistrationClient.*;

public class ModifyRegistrationClient extends DnBWebServiceClient 
{
	public ModifyRegistrationClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String cancelRegistration(String dunsNumber)
	{
		return changeCancelStatus(dunsNumber, true);
	}

	public String unCancelRegistration(String dunsNumber)
	{		
		return changeCancelStatus(dunsNumber, false);
	}
	
	private String changeCancelStatus(String dunsNumber, Boolean isCancelled)
	{
		String responseXml = "";
		ObjectFactory helper = new ObjectFactory();
		
		ModifyRegistrationRequest request = new ModifyRegistrationRequest();
		request.setUserId(userName);
		request.setPassword(password);
		
		ModifyRegistrationRequestData data = new ModifyRegistrationRequestData();
		if(isCancelled)
			data.setCancelRegistration(helper.createModifyRegistrationRequestDataCancelRegistration("true"));		
		else
			data.setUnCancelRegistration(helper.createModifyRegistrationRequestDataUnCancelRegistration("true"));
		
		data.setDnBDUNSNumber(dunsNumber);
		data.setProductName("Enterprise Management");
		data.setNotificationLevel("Level 3");
		request.setModifyRegistrationRequestData(data);
		
		WspModifyRegistration client = new WspModifyRegistration();
		WspModifyRegistrationPortType port = client.getDNBWebServicesProvidersModifyRegistrationWspModifyRegistrationPort();
		
		ModifyRegistrationResponse response;
		try 
		{
			response = port.wsModifyRegistration(request);

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
		} 
		catch (Exception_Exception e1) 
		{
			RuntimeException e = new RuntimeException(e1);
			throw e;
		}
		
		return responseXml;
	}
}
