package DnBFullReportFetcher;

import javax.xml.xpath.XPathExpressionException;

import WebServiceClients.FullReportClient;
import DnBXmlMappers.DBFullReportMapper;
import Domain.DBFullReport;
import Domain.DBFullReportSection;

public class DBFullReportFetcher 
{	
	public String getReportText(String dunsNumber, user, password) 
	{
		FullReportClient client = new FullReportClient(user, password);
		DBFullReportMapper mapper = new DBFullReportMapper();
		String responseXml = client.getReport(dunsNumber);
		String reportString = "";
		try 
		{
			DBFullReport report = mapper.getDBFullReportFromXml(responseXml);
			for(DBFullReportSection section : report.getSections())
			{
				reportString += "<h3>" + section.getHeading() + "</h3>"
								+ "<pre>" + section.getBody() + "</pre><br/>";
			}
		} 
		catch (XPathExpressionException e) 
		{
			RuntimeException ex = new RuntimeException("Error getting report.", e);
			throw ex;
		}
		return reportString; 
	}
}
