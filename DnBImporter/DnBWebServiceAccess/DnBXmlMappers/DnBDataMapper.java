package DnBXmlMappers;

import java.text.ParseException;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Application.XmlHelper;
import Domain.*;

public class DnBDataMapper 
{
	private static Logger logger = Logger.getLogger(DnBDataMapper.class.getName());
	
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
		 * OUT_BUS_IND = Out of business indicator
		 * MAXIMUM CREDIT RECOMMENDATION   - MAX_CR
		 * MAXIMUM CREDIT CURRENCY CODE    - MAX_CR_CRCY_CD
		 * Default Currency Code 	- CRCY_CD
		 * Cash and Liquid Assets - CASH_LIQ_ASET
		 * Credit Delinquency Score National Percentile - DELQ_SCR_ENTR\SCR_GRP\NATL_PCTL 
		 * Credit Delinquency Score National Percentile Date - DELQ_SCR_ENTR\SCR_GRP\ASMT_DT
		 */
		XPath xpath = XPathFactory.newInstance().newXPath();
		try
		{
			NodeList nodes = (NodeList) xpath.evaluate("//CREDITMSGSRSV2/DATATRNRS/DATARS", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			if(nodes.getLength() == 1)
			{
				DnBData data = new DnBData();
				NodeList children = nodes.item(0).getChildNodes();
				
				Currency defaultCurrency = null, maxCreditCurrency = null;
				double maxCredit = -1, cashLiquidAssets = -1;
				
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
					else if(children.item(j).getNodeName()=="CRCY_CD")
						defaultCurrency = Currency.getCurrencyFromCode(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="MAX_CR_CRCY_CD")
						maxCreditCurrency = Currency.getCurrencyFromCode(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="MAX_CR")
						maxCredit = XmlHelper.getDoubleFromXmlString(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="CASH_LIQ_ASET")
						cashLiquidAssets = XmlHelper.getDoubleFromXmlString(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="DELQ_SCR_ENTR")
						getCreditDelinquencyScore(data, children.item(j));
				}

				if(maxCreditCurrency==null&&defaultCurrency!=null)
					maxCreditCurrency = defaultCurrency;
				
				if(maxCreditCurrency!=null)
					data.setMaximumCreditRecommendationCurrency(maxCreditCurrency);
				
				if(defaultCurrency!=null)
					data.setDefaultCurrency(defaultCurrency);
				
				if(maxCreditCurrency!=null && maxCredit > -1)
					data.getMaximumCreditRecommendation().upsert(new MoneyDatedValue(new Date(), new Money(maxCreditCurrency, maxCredit)));
				
				if(defaultCurrency!=null && cashLiquidAssets > -1)
					data.getCashLiquidAssetsHistory().upsert(new MoneyDatedValue(new Date(), new Money(defaultCurrency, cashLiquidAssets)));
				
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
	
	private void getCreditDelinquencyScore(DnBData data, Node delinquencyNode)
	{
	//	 * Credit Delinquency Score National Percentile - DELQ_SCR_ENTR\SCR_GRP\NATL_PCTL 
	//	 * Credit Delinquency Score National Percentile Date - DELQ_SCR_ENTR\SCR_GRP\ASMT_DT
		int natPerc = -1;
		Date asmtDate = null;
		
		for(int i=0;i<delinquencyNode.getChildNodes().getLength();i++)
		{
			if( delinquencyNode.getChildNodes().item(i).getNodeName()=="SCR_GRP" )
			{
				NodeList scoreNodes = delinquencyNode.getChildNodes().item(i).getChildNodes();
				for(int j=0;j<scoreNodes.getLength();j++)
				{
					if(scoreNodes.item(j).getNodeName()=="NATL_PCTL")
						natPerc = XmlHelper.getIntegerFromXmlString(scoreNodes.item(j).getTextContent());
					else if(scoreNodes.item(j).getNodeName()=="ASMT_DT")
					{
						try 
						{
							asmtDate = XmlHelper.getDateFromXmlString(scoreNodes.item(j).getTextContent(),"yyyyMMdd");
						} 
						catch (ParseException e) 
						{
							logger.warning("Failed to parse date from [" + scoreNodes.item(j).getTextContent() + "]");
							logger.warning("Error: " + e.getMessage());
						}
					}
				}
			}
		}
		if(asmtDate != null && natPerc>-1)
		{
			data.getCreditDelinquencyNationalPercentileHistory().upsert(new IntegerDatedValue(asmtDate, natPerc));
		}
	}
}
