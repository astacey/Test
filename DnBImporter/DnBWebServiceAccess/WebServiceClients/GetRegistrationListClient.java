package WebServiceClients;

import DBGetRegistrationListClient.GetRegistrationListData;
import DBGetRegistrationListClient.GetRegistrationListRequest;
import DBGetRegistrationListClient.GetRegistrationListResponse;
import DBGetRegistrationListClient.ObjectFactory;
import DBGetRegistrationListClient.WspGetRegistrationList;
import DBGetRegistrationListClient.WspGetRegistrationListPortType;

public class GetRegistrationListClient extends DnBWebServiceClient
{
	public GetRegistrationListClient(String userName, String password)
	{
		super(userName, password);
	}
	
	public String getRegistrationList(String resultTicket)
	{
		String responseXml = "";
		ObjectFactory helper = new ObjectFactory();
				
		GetRegistrationListRequest request = new GetRegistrationListRequest();
		request.setUserId(userName);
		request.setPassword(password);
		
		GetRegistrationListData data = new GetRegistrationListData();
		if(resultTicket.length()>0)
			data.setResultTicket(helper.createGetRegistrationListDataResultTicket(resultTicket));
		request.setGetRegistrationListData(data);
		
		WspGetRegistrationList client = new WspGetRegistrationList();
		WspGetRegistrationListPortType port = client.getDNBWebServicesProvidersGetRegistrationListWspGetRegistrationListPort();
		
		GetRegistrationListResponse response = port.wsGetRegistrationList(request);
		responseXml = response.getResponse(); //JaxBHelper.ConvertJaxBToString(GLBLMNSVCMSGSRSV1.class, response.getResponse());

		return responseXml;
	}
	
	
}
