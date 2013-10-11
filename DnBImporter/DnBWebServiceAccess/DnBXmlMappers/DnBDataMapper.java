package DnBXmlMappers;

import java.text.ParseException;
import java.util.ArrayList;
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
		 * D&B Failure Risk Score Commentary - FAIL_SCR_OVRD_CD then multiple ArrayOfstringItem
		 * D&B Failure Risk Score Commentary - FAIL_SCR_ENTR\SCR_GRP\SCR_OVRD_CD
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
		 * Credit Delinquency Score Commentary - DELQ_SCR_ENTR\SCR_GRP\SCR_CMTY_CD then multiple ArrayOfstringItem
		 * Credit Delinquency Score Override - DELQ_SCR_ENTR\SCR_GRP\SCR_OVRD_CD
		 * 
		 * Address Details
		 * 
		 * Adresss lines - ADR_LINE\ArrayOfstringItem
		 * Post Code - POST_CODE
		 * Postal Town - POST_TOWN
		 * Primary Geograpihic Area - PRIM_GEO_AREA
		 * Country - CTRY_CD
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
				
				String postCode = null, county = null, town = null;
				Country country = null;
				ArrayList<String> addressLines = new ArrayList<String>();
				
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
						data.setPrimarySicCode(SICCode.getSICFromCode(children.item(j).getTextContent()));
					else if(children.item(j).getNodeName()=="PRIM_NME")
						data.setName(XmlHelper.getStringFromXmlString(children.item(j).getTextContent()));
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
					else if(children.item(j).getNodeName()=="FAIL_SCR_CMTY")
						getScoreCommentary(data.getFailureRiskScoreCommentary(), children.item(j));
					else if(children.item(j).getNodeName()=="FAIL_SCR_ENTR")
						getFailureRiskScore(data, children.item(j));
					else if(children.item(j).getNodeName()=="CTRY_CD")
						country = Country.getCountryFromIso2(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="POST_TOWN")
						town = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="POST_CODE")
						postCode = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="PRIM_GEO_AREA")
						county = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
					else if(children.item(j).getNodeName()=="ADR_LINE")
						 getAddressLines(addressLines, children.item(j));
				}

				if(maxCreditCurrency!=null)
					data.setMaximumCreditRecommendationCurrency(maxCreditCurrency);
				
				if(defaultCurrency!=null)
					data.setDefaultCurrency(defaultCurrency);
				
				if(data.getMaximumCreditRecommendationCurrency()!=null && maxCredit > -1)
					data.getMaximumCreditRecommendation().upsert(new MoneyDatedValue(new Date(), new Money(data.getMaximumCreditRecommendationCurrency(), maxCredit)));

				if(defaultCurrency!=null && cashLiquidAssets > -1)
					data.getCashLiquidAssetsHistory().upsert(new MoneyDatedValue(new Date(), new Money(defaultCurrency, cashLiquidAssets)));
				
				Address address = getAddress(postCode, town, county, country, addressLines);
				data.setMainAddress(address);

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
	
	private Address getAddress(String postCode, String town, String county, Country country, ArrayList<String> lines)
	{
		if(postCode!=null || town!=null || county!=null || country!=null || lines.size()>0)
		{
			Address address = new Address();
			address.setPostCode(postCode);
			address.setTown(town);
			address.setCounty(county);
			address.setCountry(country);
			address.getAddressLines().addAll(lines);
			return address;
		}
		return null;
	}
	
	private void getAddressLines(ArrayList<String> lines, Node addressNode)
	{
		for(int i=0;i<addressNode.getChildNodes().getLength();i++)
		{
			lines.add(XmlHelper.getStringFromXmlString(addressNode.getChildNodes().item(i).getTextContent()));
		}
	}
	
	private void getScoreCommentary(ArrayList<DnBScoreCommentary> commentary, Node commentaryNode)
	{
		for(int i=0;i<commentaryNode.getChildNodes().getLength();i++)
		{
			String code = commentaryNode.getChildNodes().item(i).getTextContent();
			DnBScoreCommentary comment = DnBScoreCommentary.getCommentaryFromCode(code);
			if(comment != null)
				commentary.add(comment);
			else
				logger.severe("Unknown score commentary code : " + code);
		}
	}
	
	public void getCreditDelinquencyScore(DnBData data, Node delinquencyNode)
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
					else if(scoreNodes.item(j).getNodeName()=="SCR_CMTY_CD")
						getScoreCommentary(data.getCreditDelinquencyScoreCommentary(), scoreNodes.item(j));
					else if(scoreNodes.item(j).getNodeName()=="SCR_OVRD_CD")
						data.setCreditDelinquencyScoreOverride(getScoreOverride(scoreNodes.item(j).getTextContent()));
					
				}
			}
		}
		if(asmtDate != null && natPerc>-1)
		{
			data.getCreditDelinquencyNationalPercentileHistory().upsert(new IntegerDatedValue(asmtDate, natPerc));
		}
	}
	
	private void getFailureRiskScore(DnBData data, Node failureRiskNode)
	{
		// D&B Failure Risk Score Commentary - FAIL_SCR_ENTR\SCR_GRP\SCR_OVRD_CD
		// I could get the other Failure Risk Score fields from this blob of xml also
		// I started out by not doing that though, so don't want to change right now for no reason
		// If I do change, can probably merge this with the creditrisk method above, since the xml blobs are the same
		for(int i=0;i<failureRiskNode.getChildNodes().getLength();i++)
		{
			if( failureRiskNode.getChildNodes().item(i).getNodeName()=="SCR_GRP" )
			{
				NodeList scoreNodes = failureRiskNode.getChildNodes().item(i).getChildNodes();
				for(int j=0;j<scoreNodes.getLength();j++)
				{
					if(scoreNodes.item(j).getNodeName()=="SCR_OVRD_CD")
						data.setFailureRiskScoreOverride(getScoreOverride(scoreNodes.item(j).getTextContent()));
				}
			}
		}
	}
	
	private DnBScoreOverride getScoreOverride(String code)
	{
		DnBScoreOverride override = DnBScoreOverride.getOverrideFromCode(code);
		if(override==null)
			logger.severe("Unknown score commentary code : " + code);
		return override;
	}
}
