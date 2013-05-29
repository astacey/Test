package WebServiceClients;

import Application.JaxBHelper;

import DBWebClient.CREDITMSGSRSV2;
import DBWebClient.LookUpInput;
import DBWebClient.LookUpRequest;
import DBWebClient.LookUpResponse;
import DBWebClient.ObjectFactory;
import DBWebClient.WspLookUp;
import DBWebClient.WspLookUpPortType;


public class LookUpClient {

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
		request.setUserId("unit4test");
		request.setPassword("ed1r1ver");
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
