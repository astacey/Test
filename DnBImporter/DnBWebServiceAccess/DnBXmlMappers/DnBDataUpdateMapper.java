package DnBXmlMappers;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Application.XmlHelper;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.IntegerDatedValue;

public class DnBDataUpdateMapper 
{
	public ArrayList<DnBData> getDnBDataFromXml(String xml) throws ParseException, XPathExpressionException
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
		ArrayList<DnBData> updateCollection = new ArrayList<DnBData>();
		//try
		//{
			NodeList nodes = (NodeList) xpath.evaluate("//GLBLMNSVCMSGSRSV1/GETNTFCTRNRS/GETNTFCRS/USERRS/PFLRS/ArrayOfPFLRSItem/REGNRS/ArrayOfREGNRSItem", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			for(int i=0;i<nodes.getLength();i++)
			{
				DnBData data = new DnBData();
				NodeList children = nodes.item(i).getChildNodes();
				
				for(int j=0;j<children.getLength();j++)
				{
					if(children.item(j).getNodeName()=="DUNS_NBR")
					{
						data.setDunsNumber(XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent()));
					}
					else if(children.item(j).getNodeName()=="PRIM_NME")
					{
						data.setName(children.item(j).getTextContent());
					}
					else if(children.item(j).getNodeName()=="NTFCRS")
					{
						// The changes are in here, this is going to get very loopy !!!
						updateChanges(data, children.item(j));
					}
				
				}
				updateCollection.add(data);
			}
		/*} 
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}
		catch(ParseException pe)
		{
			pe.printStackTrace();
		}*/
		
		return updateCollection;

	}
	
	public String getResultTicket(String xml)
	{
		return XmlHelper.getStringFromXPath(xml, "//GLBLMNSVCMSGSRSV1/GETNTFCTRNRS/RSLT_TKT");
	}
	
	private void updateChanges(DnBData data, Node changes) throws ParseException
	{
		// changes = <NTFCRS>
		for(int i=0;i<changes.getChildNodes().getLength();i++)
		{
			Node changeNode = changes.getChildNodes().item(i); // this is <ArrayOfNTFCRSItem>, if anyone's interested
			NodeList children =  changeNode.getChildNodes(); 
			
			int failureRisk=-1;
			int failureRiskPercentile=-1;
			int paydex=-1;
			int paydexNorm=-1;
			Date changeDate = new Date();
			
			for(int j=0;j<children.getLength();j++)
			{
				
				if(children.item(j).getNodeName()=="FAIL_SCR")
					failureRisk = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="DNB_RATG")
					data.getDbratingHistory().add(new DnBRating(children.item(j).getTextContent(), new Date() ));
				else if(children.item(j).getNodeName()=="FAIL_SCR_NATL_PCTG")
					failureRiskPercentile = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PAYD_SCR")
					paydex = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PAYD_NORM")
					paydexNorm = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PRIM_SIC")
					data.setPrimarySicCode(XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent()));
				else if(children.item(j).getNodeName()=="SRC_DT")
					changeDate = XmlHelper.getDateFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="OUT_BUS_IND" && children.item(j).getTextContent().equalsIgnoreCase("y"))
					data.setOutOfBusiness(true);
			}

			if(failureRisk>-1)
				data.getFailureRiskScoreHistory().upsert(new IntegerDatedValue(changeDate, failureRisk));
			if(failureRiskPercentile>-1)
				data.getFailureRiskPercentileHistory().upsert(new IntegerDatedValue(changeDate, failureRiskPercentile));
			if(paydex>-1)
				data.getPaydexScoreHistory().upsert(new IntegerDatedValue(changeDate, paydex));
			if(paydexNorm>-1)
				data.getPaydexScoreHistory().upsert(new IntegerDatedValue(changeDate, paydexNorm));
		}
	}
}
