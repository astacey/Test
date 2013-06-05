package DnBXmlMappers;

import java.util.Date;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;

import Application.XmlHelper;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.IntegerDatedValue;

public class DnBDataMapper 
{
	public DnBData getDnBDataFromXml(String xml)
	{
		/*
		 * D&B Failure Risk (Financial Stress) - FAIL_SCR
		 * D&B Rating - DNB_RATG
		 * D&B Failure Risk (Financial Stress) National percentile- NATL_PCTL or FAIL_SCR_NATL_PCTG ???
		 * Primary Name - PRIM_NME
		 * D&B Paydex - PAYD_SCR
		 * D&B Paydex Norm - PAYD_NORM
		 * Primary SIC = PRIM_SIC
		 */
		XPath xpath = XPathFactory.newInstance().newXPath();
		try
		{
			NodeList nodes = (NodeList) xpath.evaluate("//CREDITMSGSRSV2/DATATRNRS/DATARS", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			if(nodes.getLength() == 1)
			{
				DnBData data = new DnBData();
				NodeList children = nodes.item(0).getChildNodes();
				
				for(int j=0;j<children.getLength();j++)
				{
					if(children.item(j).getNodeName()=="DUNS_NBR")
						data.setDunsNumber(XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent()));
					else if(children.item(j).getNodeName()=="FAIL_SCR")
						data.getFailureRiskScoreHistory().upsert(new IntegerDatedValue(new Date(), XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent())));
					else if(children.item(j).getNodeName()=="DNB_RATG")
						data.getDbratingHistory().add(new DnBRating(children.item(j).getTextContent(), new Date() ));
					else if(children.item(j).getNodeName()=="FAIL_SCR_NATL_PCTG")
						data.getFailureRiskPercentileHistory().upsert(new IntegerDatedValue(new Date(), XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent())));
					else if(children.item(j).getNodeName()=="PAYD_SCR")
						data.getPaydexScoreHistory().upsert(new IntegerDatedValue(new Date(), XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent())));
					else if(children.item(j).getNodeName()=="PAYD_NORM")
						data.getPaydexNormHistory().upsert(new IntegerDatedValue(new Date(), XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent())));
					else if(children.item(j).getNodeName()=="PRIM_SIC")
						data.setPrimarySicCode(XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent()));
					else if(children.item(j).getNodeName()=="PRIM_NME")
						data.setName(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="OUT_BUS_IND" && children.item(j).getTextContent().equalsIgnoreCase("y"))
						data.setOutOfBusiness(true);
				}
				return data;
			}
			else
			{
				// ???
				// Error ?
			}
		} 
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}	
		
		return null;
	}
}
