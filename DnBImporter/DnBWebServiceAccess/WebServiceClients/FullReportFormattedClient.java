package WebServiceClients;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import DBFullReportsClient.*;

public class FullReportFormattedClient extends DnBWebServiceClient
{
	public FullReportFormattedClient(String userName, String password) 
	{
		super(userName, password);
	}
	
	public String getReport(String duns)
	{
		GetProductRequest request = new GetProductRequest();
		
		ApplicationAreaType appArea = new ApplicationAreaType();
		appArea.setApplicationIdentifier("MikeTest");
		GregorianCalendar cal = (GregorianCalendar)GregorianCalendar.getInstance();
		XMLGregorianCalendar xCal;
		try {
			xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			appArea.setRequestCreationDateTime(xCal);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		appArea.setUniqueReferenceIdentifier("UniqueRefID");
		request.setApplicationArea(appArea);
		
		GetProductReqDataAreaType data = new GetProductReqDataAreaType();
		CustomerInformationType custInfo = new CustomerInformationType();
		SignonCredentialsType creds = new SignonCredentialsType();
		creds.setSubscriberCountryCode("826");
		creds.setSubscriberNumber("1"); // ????
		creds.setUserId("unit4test");
		creds.setLoginIdentifier("unit4test");
		creds.setLoginPassword("ed1r1ver");
		custInfo.setSignonCredentials(creds);
		data.setCustomerInformation(custInfo);
		
		// 
		SubjectInformationBaseType subj = new SubjectInformationBaseType();
		subj.setDUNSNumber(duns);
		subj.setSubjectCountryCode("826");
		data.setSubjectInformation(subj);
		// product order
		ProductOrderReqType prodOrder = new ProductOrderReqType();
		ProductSpecificationReqType psrt = new ProductSpecificationReqType();
		psrt.setProductCode("13714");
		psrt.setProductLanguageCode("en");
		psrt.setTradeUpIndicator(true);
		psrt.setOrderReferenceText("text");
		psrt.setOrderReasonCode("0");
		psrt.setProductDeliveryFormat(ProductDeliveryFormatType.HTML);
		
		prodOrder.setProductSpecification(psrt);
		data.setProductOrder(prodOrder);
		request.setDataArea(data);
		
		DNBWebService ws = new DNBWebService();
		DNBWebServicingPortType port = ws.getDNBWebServicingPort();
		
		GetProductResponse response = port.getProduct(request);
		return response.toString();
	}
}
