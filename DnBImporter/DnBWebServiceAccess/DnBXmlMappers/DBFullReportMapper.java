package DnBXmlMappers;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;

import Application.XmlHelper;
import Domain.DBFullReport;
import Domain.DBFullReportSection;

public class DBFullReportMapper 
{

	public DBFullReport getDBFullReportFromXml(String xml) throws XPathExpressionException
	{
		DBFullReport report = new DBFullReport();
		XPath xpath = XPathFactory.newInstance().newXPath();
		
		NodeList nodes;
		nodes = (NodeList) xpath.evaluate("//CREDITMSGSRSV2/DATATRNRS/DATARS/SECTION", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);

		for(int i=0;i<nodes.getLength();i++)
		{
			NodeList children = nodes.item(i).getChildNodes();

			String head="", body="";
			for(int j=0;j<children.getLength();j++)
			{
				if(children.item(j).getNodeName().equalsIgnoreCase("HDG"))
				{
					head = XmlHelper.getStringFromXmlString(children.item(j).getTextContent()).trim();
				}
				else if(children.item(j).getNodeName().equalsIgnoreCase("BODY"))
				{
					body = XmlHelper.getStringFromXmlString(children.item(j).getTextContent()).trim();
				}
			}

			if(head.length()>0 || body.length()>0)
			{
				DBFullReportSection section = new DBFullReportSection(head, body);
				report.getSections().add(section);
			}
		}		
		
		return report;
	}
}
