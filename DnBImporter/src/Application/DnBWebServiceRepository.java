package Application;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import WebServiceClients.AddRegistrationClient;
import WebServiceClients.GetCompanyDetailsClient;
import WebServiceClients.GetNotificationsClient;
import WebServiceClients.GetRegistrationListClient;

import DnBXmlMappers.DnBDataMapper;
import DnBXmlMappers.DnBDataUpdateMapper;
import DnBXmlMappers.DnBRegistrationListMapper;
import Domain.DnBData;
import Domain.DnBRegistrationCollection;
import Domain.IDnBRepository;

public class DnBWebServiceRepository implements IDnBRepository 
{
	private static Logger logger = Logger.getLogger(DnBWebServiceRepository.class.getName());
	private static XmlLogger xmlLogger;
	private String wsUserName;
	private String wsPassword;
	
	public DnBWebServiceRepository(String userName, String password){ this(userName, password, null); }
	
	public DnBWebServiceRepository(String userName, String password, String logFileLocation)
	{
		this.wsUserName = userName;
		this.wsPassword = password;
		if(logFileLocation!=null)
			xmlLogger = new XmlLogger(logFileLocation);
	}
	
	@Override
	public Boolean registerCompany(int dunsNumber) 
	{
		try
		{
			AddRegistrationClient client = new AddRegistrationClient(wsUserName, wsPassword);
		
			String responseXml = client.addRegistration(String.valueOf(dunsNumber));
			
			logXmlResponse(responseXml);
			return isResponseSuccess(responseXml);
		}
		catch(Exception e)
		{
			logger.severe(e.getMessage());
		}
		return false;
	}
	
	@Override
	public DnBRegistrationCollection getRegistrations() 
	{
		GetRegistrationListClient client = new GetRegistrationListClient(wsUserName, wsPassword);
		DnBRegistrationListMapper mapper = new DnBRegistrationListMapper();
		
		String resultTicket = "";
		DnBRegistrationCollection regs = new DnBRegistrationCollection();	
		do
		{
			String xmlResponse = client.getRegistrationList(resultTicket);
			
			logXmlResponse(xmlResponse);

			regs.addFromXml(xmlResponse);
			resultTicket = mapper.getResultTicket(xmlResponse);
			if(resultTicket.length()>0)
				sleepBetweenRequests();
		}
		while(resultTicket.length()>0);

		return regs;
	}
	
	@Override
	public DnBData getCompanyDetails(int dunsNumber)
	{
		GetCompanyDetailsClient client = new GetCompanyDetailsClient(wsUserName, wsPassword);
		
		String xmlResponse = client.getCompanyDetails(String.valueOf(dunsNumber));
		logXmlResponse(xmlResponse);
		
		DnBDataMapper mapper = new DnBDataMapper();
		
		DnBData companyData = mapper.getDnBDataFromXml(xmlResponse);
		
		return companyData;
	}
	
	@Override
	public ArrayList<DnBData> getCompanyUpdates(Date startDate, Date endDate) throws Exception
	{
		GetNotificationsClient client = new GetNotificationsClient(wsUserName, wsPassword);
		ArrayList<DnBData> returnData = new ArrayList<DnBData>();
		DnBDataUpdateMapper mapper = new DnBDataUpdateMapper();
		
		String resultTicket = "";
		do
		{
			String xmlResponseString;
			xmlResponseString = client.getNotifications(startDate, endDate, resultTicket);
			logXmlResponse(xmlResponseString);

			ArrayList<DnBData> data = mapper.getDnBDataFromXml(xmlResponseString);
			returnData.addAll(data);
			// TODO : Should I make some kind of result class that has resultticket and arraylist properties ?
			resultTicket = mapper.getResultTicket(xmlResponseString);
			if(resultTicket.length()>0)
				sleepBetweenRequests();
		}
		while(resultTicket.length()>0);
				
		return returnData;
	}

	private Boolean isResponseSuccess(String xml)
	{
		XPath xpath = XPathFactory.newInstance().newXPath();
		try 
		{
			// If this token exists then assume it worked !!
			// this'll do for now			
			return (Boolean) xpath.evaluate("//GLBLMNSVCMSGSRSV1/ADDREGNTRNRS/ADDREGNRS/ArrayOfADDREGNRSItem/STAT_DESC", XmlHelper.getXmlDocument(xml), XPathConstants.BOOLEAN);
		} 
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}	
		return false;
	}
	
	private void logXmlResponse(String responseXml)
	{
		logger.info(responseXml);
		if(xmlLogger!=null)
			xmlLogger.logXml(responseXml);
	}
	
	// Sleep for 60 seconds. This is to be used when the result from the server has a resultticket token. 
	// This token is basically the server saying - I'm busy, check for the result later. Without waiting, I'm pretty much attacking the server with constant requests.
	private void sleepBetweenRequests()
	{
		try 
		{
			Thread.sleep(60000);
		} 
		catch (InterruptedException e) 
		{
			logger.info(e.getMessage());
		}
	}
}
