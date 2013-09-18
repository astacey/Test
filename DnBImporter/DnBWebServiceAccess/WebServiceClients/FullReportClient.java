package WebServiceClients;

import DBBIRClient.BIRResponse;
import DBBIRClient.ObjectFactory;
import DBBIRClient.ImmediateDelivery;
import DBBIRClient.Orders;
import DBBIRClient.SocCode;
import DBBIRClient.ProdOrderRequest2;
import DBBIRClient.WspBIRV1;
import DBBIRClient.WspBIRV1PortType;

public class FullReportClient extends DnBWebServiceClient 
{

	public FullReportClient(String userName, String password) 
	{
		super(userName, password);
	}

	public String getReport(String dunsNumber)
	{
		ObjectFactory helper = new ObjectFactory();
		
		ImmediateDelivery delivery = new ImmediateDelivery();
		delivery.setMode("DIRECT");
		delivery.setFormat("XML");
		
		Orders orders = new Orders();
		orders.setDnBDUNSNumber(dunsNumber);
		orders.setCountryCode(helper.createOrdersCountryCode("GB"));
		orders.setProductType("T");
		orders.setProduct("D and B Business Information Report");
		
		SocCode soc = new SocCode();
		soc.setAppId(helper.createSocCodeAppId("353"));
		
		ProdOrderRequest2 request = new ProdOrderRequest2();
		request.setUserId(userName);
		request.setPassword(password);
		request.setImmediateDelivery(delivery);
		request.setSocCode(helper.createProdOrderRequest2SocCode(soc));
		request.setOrders(orders);
		
		WspBIRV1 bir = new WspBIRV1();
		WspBIRV1PortType port = bir.getDNBWebServicesProvidersOrderAndInvestigationsOtherProductsBIRV1WspBIRV1Port();
		
		BIRResponse response = port.wsBIR(request);
		
		return response.getResponse();
		
	}
}
