package WebServiceClients;

import Application.JaxBHelper;

import DBLookUpClient.CREDITMSGSRSV2;
import DBLookUpClient.LookUpInput;
import DBLookUpClient.LookUpRequest;
import DBLookUpClient.LookUpResponse;
import DBLookUpClient.ObjectFactory;
import DBLookUpClient.WspLookUp;
import DBLookUpClient.WspLookUpPortType;

public class LookUpClient extends DnBWebServiceClient
{
	public LookUpClient(String userName, String password)
	{
		super(userName, password);
	}

	public String performLookUp(String companyName, String postCode)
	{
		ObjectFactory helper = new ObjectFactory();
		
		LookUpRequest request = getNewLookUpRequest();
		request.getLookUpInput().setName(helper.createLookUpInputName(companyName));
		request.getLookUpInput().setPostCode(helper.createLookUpInputPostCode(postCode));
		
		return runLookUp(request);
	}
	
	private LookUpRequest getNewLookUpRequest()
	{
		LookUpInput input = new LookUpInput();
		// Unit4 Business Software - DUNS No - 225314921
		// "Signature Industries Limited" - DUNS No - 
		// SIGNATURE INDUSTRIES LIMITED
		input.setCountryCode("GB");
		
		LookUpRequest request = new LookUpRequest();
		request.setUserId(userName);
		request.setPassword(password);
		request.setLookUpInput(input);
		
		return request;
	}
	
	private String runLookUp(LookUpRequest request)
	{
		String responseXml = "";
		try
		{
			WspLookUp client = new WspLookUp();
			
			WspLookUpPortType port = client.getDNBWebServicesProvidersLookUpWspLookUpPort();
			
			LookUpResponse response = port.wsLookUp(request);
			
			responseXml = JaxBHelper.ConvertJaxBToString(CREDITMSGSRSV2.class, response.getDGX().getCREDITMSGSRSV2());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return responseXml;	
	}	
}
