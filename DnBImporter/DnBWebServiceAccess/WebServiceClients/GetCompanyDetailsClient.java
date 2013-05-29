package WebServiceClients;

import Application.JaxBHelper;

import DBDataWebClient.CREDITMSGSRSV2;
import DBDataWebClient.GDPResponse;
import DBDataWebClient.ImmediateDelivery;
import DBDataWebClient.ObjectFactory;
import DBDataWebClient.Orders;
import DBDataWebClient.ProdOrderRequest;
import DBDataWebClient.SocCode;
import DBDataWebClient.WspGDP;
import DBDataWebClient.WspGDPPortType;

public class GetCompanyDetailsClient  extends DnBWebServiceClient 
{	
	public GetCompanyDetailsClient(String userName, String password)
	{
		super(userName, password);
	}

	public String getCompanyDetails(String dunsNumber)
	{
		String returnValue = "";
		
		try
		{
			ObjectFactory helper = new ObjectFactory();
			
			ImmediateDelivery delivery = new ImmediateDelivery();
			delivery.setMode("DIRECT");
			delivery.setFormat("XML");
			
			Orders orders = new Orders();
			orders.setDnBDUNSNumber(dunsNumber);
			orders.setCountryCode(helper.createOrdersCountryCode("GB"));
			orders.setProductType("D");
			orders.setProduct("Enterprise Management");
			
			SocCode soc = new SocCode();
			soc.setAppId(helper.createSocCodeAppId("353"));
			
			ProdOrderRequest request = new ProdOrderRequest();
			request.setUserId(userName);
			request.setPassword(password);
			request.setImmediateDelivery(delivery);
			request.setSocCode(helper.createProdOrderRequestSocCode(soc));
			request.setOrders(orders);
			
			WspGDP client = new WspGDP();
			WspGDPPortType port = client.getDNBWebServicesProvidersOrderAndInvestigationsGDPWspGDPPort();
			
			//GDMResponse response = port.wsGDM(request);
			GDPResponse response = port.wsOtherGDPProducts(request);
						
			returnValue = JaxBHelper.ConvertJaxBToString(CREDITMSGSRSV2.class, response.getDGX().getCREDITMSGSRSV2());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return returnValue;
	}
}
