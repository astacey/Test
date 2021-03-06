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
import Domain.Address;
import Domain.Country;
import Domain.Currency;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.IntegerDatedValue;
import Domain.Money;
import Domain.MoneyDatedValue;
import Domain.SICCode;

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
		 * OUT_BUS_IND = Out of business indicator
		 *  * MAXIMUM CREDIT RECOMMENDATION   - MAX_CR
		 * MAXIMUM CREDIT CURRENCY CODE    - MAX_CR_CRCY_CD
		 * Default Currency Code 	- CRCY_CD
		 * Cash and Liquid Assets - CASH_LIQ_ASET
		 * Credit Delinquency Score National Percentile - DELQ_SCR_ENTR\SCR_GRP\NATL_PCTL 
		 * 
		 * Credit Delinquency Score Commentary - DELQ_SCR_ENTR\SCR_GRP\SCR_CMTY_CD then multiple ArrayOfstringItem
		 * Credit Delinquency Score Override - DELQ_SCR_ENTR\SCR_GRP\SCR_OVRD_CD
		 * * 
		 * Address Details
		 * 
		 * Adresss lines - ADR_LINE\ArrayOfstringItem
		 * Post Code - POST_CODE
		 * Postal Town - POST_TOWN
		 * Primary Geograpihic Area - PRIM_GEO_AREA
		 * Country - CTRY_CD
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
				Node ntfcrs = null;
				Node monprodrs = null;
				
				for(int j=0;j<children.getLength();j++)
				{
					if(children.item(j).getNodeName()=="DUNS_NBR")
					{
						data.setDunsNumber(XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent()));
					}
					else if(children.item(j).getNodeName()=="PRIM_NME")
					{
						data.setName(XmlHelper.getStringFromXmlString(children.item(j).getTextContent()));
					}
					// 2 kinds of changes
					// ones read from incremental part of xml ( NTFCRS )
					// ones read from full snapshot of company xml ( MON_PROD_RS )
					// basically, facts are coming from increments
					// attributes are coming from full snapshot, this helps with nulling out values
					// Also, avoids resetting values back to default by mistake - e.g. is OutOfBusiness. DnBData sets this to false by default. This means that if no update to this field, then we'd be constantly resetting to false. There's other solutions to this, but reading full snapshot of data is easiest at the time.
					else if(children.item(j).getNodeName()=="NTFCRS")
					{
						ntfcrs = children.item(j);					
					}
					else if(children.item(j).getNodeName()=="MON_PROD_RS")
					{
						monprodrs = children.item(j);				
					}
				
				}
				// Need to do monprodrs before the ntfcrs node, because I need the currency to be filled in first
				if(monprodrs!=null)
					updateChangesFull(data, monprodrs);
				if(ntfcrs!=null)
					updateChangesIncremental(data, ntfcrs);
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
		
	private void updateChangesIncremental(DnBData data, Node changes) throws ParseException
	{
		// changes = <NTFCRS>

		// Address details
		String postCode = null, county = null, town = null;
		Country country = null;
		// It looks like only 1 address line ever shows up in an update. Think it's a  bug in D&B, but not really important
		String addressLine = null;
		
		for(int i=0;i<changes.getChildNodes().getLength();i++)
		{
			Node changeNode = changes.getChildNodes().item(i); // this is <ArrayOfNTFCRSItem>, if anyone's interested
			NodeList children =  changeNode.getChildNodes(); 
			
			int failureRisk=-1;
			int failureRiskPercentile=-1;
			int paydex=-1;
			int paydexNorm=-1;
			double maxCredit=-1.0;
			double cashAssets=-1.0;
			int creditDelinquencyPercentile=-1;
			String dnbRating = null;
			
			Date changeDate = new Date();
			
			for(int j=0;j<children.getLength();j++)
			{
				
				if(children.item(j).getNodeName()=="FAIL_SCR")
					failureRisk = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="DNB_RATG")
					dnbRating = children.item(j).getTextContent();
				else if(children.item(j).getNodeName()=="FAIL_SCR_NATL_PCTG")
					failureRiskPercentile = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PAYD_SCR")
					paydex = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PAYD_NORM")
					paydexNorm = XmlHelper.getIntegerFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="SRC_DT")
					changeDate = XmlHelper.getDateFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="MAX_CR")
					maxCredit = XmlHelper.getDoubleFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="CASH_LIQ_ASET")
					cashAssets = XmlHelper.getDoubleFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="DELQ_SCR_ENTR")
				{
					// Updates look like this - <ArrayOfNTFCRSItem><DETECT_DT>2013-10-16T22:28:01-04:00</DETECT_DT><SRC_DT>2013-10-16T09:34:37-04:00</SRC_DT><DELQ_SCR_ENTR><ArrayOfDELQ_SCR_ENTRItem><SCR_GRP><SCR>376</SCR></SCR_GRP></ArrayOfDELQ_SCR_ENTRItem></DELQ_SCR_ENTR></ArrayOfNTFCRSItem><ArrayOfNTFCRSItem><DETECT_DT>2013-10-16T22:28:01-04:00</DETECT_DT><SRC_DT>2013-10-16T09:34:37-04:00</SRC_DT><DELQ_SCR_ENTR><ArrayOfDELQ_SCR_ENTRItem><SCR_GRP><NATL_PCTL>14</NATL_PCTL></SCR_GRP></ArrayOfDELQ_SCR_ENTRItem></DELQ_SCR_ENTR></ArrayOfNTFCRSItem>
					// So score and percentile are in different <DELQ_SCR_ENTR> tags. Need to be careful I don't overwrite the percentile by reading the score node second
					int tempVal = getCreditDelinquencyScore(children.item(j), "NATL_PCTL");
					if(tempVal>-1)
						creditDelinquencyPercentile = tempVal;
				}
				else if(children.item(j).getNodeName()=="CTRY_CD")
					country = Country.getCountryFromIso2(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="POST_TOWN")
					town = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="POST_CODE")
					postCode = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="PRIM_GEO_AREA")
					county = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
				else if(children.item(j).getNodeName()=="ADR_LINE")
					 addressLine = XmlHelper.getStringFromXmlString(children.item(j).getTextContent());
				//
			}

			if(dnbRating != null)
				data.getDbratingHistory().add(new DnBRating(dnbRating, changeDate ));
			if(failureRisk>-1)
				data.getFailureRiskScoreHistory().upsert(new IntegerDatedValue(changeDate, failureRisk));
			if(failureRiskPercentile>-1)
				data.getFailureRiskPercentileHistory().upsert(new IntegerDatedValue(changeDate, failureRiskPercentile));
			if(paydex>-1)
				data.getPaydexScoreHistory().upsert(new IntegerDatedValue(changeDate, paydex));
			if(paydexNorm>-1)
				data.getPaydexNormHistory().upsert(new IntegerDatedValue(changeDate, paydexNorm));
			if(creditDelinquencyPercentile>-1)
				data.getCreditDelinquencyNationalPercentileHistory().upsert(new IntegerDatedValue(changeDate, creditDelinquencyPercentile));
			if(maxCredit>-1.0)
				data.getMaximumCreditRecommendation().upsert(new MoneyDatedValue(changeDate, new Money(data.getMaximumCreditRecommendationCurrency(), maxCredit)));
			if(cashAssets>-1.0)
				data.getCashLiquidAssetsHistory().upsert(new MoneyDatedValue(changeDate, new Money(data.getDefaultCurrency(), cashAssets)));
		}
		
		// TODO : Move to the updateChangesFull method - can't distinguish between null address due to update to null or just no update
		Address address = getAddress(postCode, town, county, country, addressLine);
		data.setMainAddress(address);
	}

	private Address getAddress(String postCode, String town, String county, Country country, String line)
	{
		if(postCode!=null || town!=null || county!=null || country!=null || line != null)
		{
			Address address = new Address();
			address.setPostCode(postCode);
			address.setTown(town);
			address.setCounty(county);
			address.setCountry(country);
			address.getAddressLines().add(line);
			return address;
		}
		return null;
	}
	
	private void updateChangesFull(DnBData data, Node changes) throws ParseException
	{
		// changes = <MON_PROD_RS>
		for(int i=0;i<changes.getChildNodes().getLength();i++) // this should be length 1, should I check ?
		{
			Node changeNode = changes.getChildNodes().item(i); // this is <ArrayOfMON_PROD_RSItem>, if anyone's interested
			NodeList children =  changeNode.getChildNodes(); 
			
			for(int j=0;j<children.getLength();j++)
			{	
				if(children.item(j).getNodeName()=="PRIM_SIC")
					data.setPrimarySicCode(SICCode.getSICFromCode(children.item(j).getTextContent()));
				else if(children.item(j).getNodeName()=="OUT_BUS_IND" && children.item(j).getTextContent().equalsIgnoreCase("y"))
					data.setOutOfBusiness(true);
				else if(children.item(j).getNodeName()=="CRCY_CD")
					data.setDefaultCurrency(Currency.getCurrencyFromCode(children.item(j).getTextContent()));
				else if(children.item(j).getNodeName()=="MAX_CR_CRCY_CD")
					data.setMaximumCreditRecommendationCurrency(Currency.getCurrencyFromCode(children.item(j).getTextContent()));
			}
		}
	}
	
	// This is very similar to the method in dnbdatamapper. The big difference is the date, which appears to be in a different place here.
	// if it turns out that there is an ASMT_DT in the updates, then maybe I can consolidate the 2 methods
	public int getCreditDelinquencyScore(Node delinquencyNode, String tagName)
	{
	//	 * Credit Delinquency Score National Percentile - DELQ_SCR_ENTR\ArrayOfDELQ_SCR_ENTRItem\SCR_GRP\NATL_PCTL 
		for(int i=0;i<delinquencyNode.getChildNodes().getLength();i++)
		{
			if( delinquencyNode.getChildNodes().item(i).getNodeName()=="ArrayOfDELQ_SCR_ENTRItem" )
			{
				NodeList arrayNodes = delinquencyNode.getChildNodes().item(i).getChildNodes();
				for(int k=0;k<arrayNodes.getLength();k++)
				{
					if( arrayNodes.item(k).getNodeName()=="SCR_GRP" )
					{
						NodeList scoreNodes = arrayNodes.item(k).getChildNodes();
						for(int j=0;j<scoreNodes.getLength();j++)
						{
							if(scoreNodes.item(j).getNodeName()==tagName)
								return XmlHelper.getIntegerFromXmlString(scoreNodes.item(j).getTextContent());
						}						
					}
				}
			}
		}
		return -1;
	}
}
