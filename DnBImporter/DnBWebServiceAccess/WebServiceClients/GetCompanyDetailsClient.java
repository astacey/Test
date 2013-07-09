package WebServiceClients;

import Application.JaxBHelper;

import DBGDPV3.CREDITMSGSRSV2;
import DBGDPV3.GDPResponse;
import DBGDPV3.ImmediateDelivery;
import DBGDPV3.ObjectFactory;
import DBGDPV3.Orders;
import DBGDPV3.ProdOrderRequest3;
import DBGDPV3.SocCode;
import DBGDPV3.WspGDPV3PortType;
import DBGDPV3.WspGDPV3;

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
			
			ProdOrderRequest3 request = new ProdOrderRequest3();
			request.setUserId(userName);
			request.setPassword(password);
			request.setImmediateDelivery(delivery);
			request.setSocCode(helper.createProdOrderRequest3SocCode(soc));
			request.setOrders(orders);
			
			WspGDPV3 client = new WspGDPV3();
			WspGDPV3PortType port = client.getDNBWebServicesProvidersOrderAndInvestigationsGDPV3WspGDPV3Port();
			
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
