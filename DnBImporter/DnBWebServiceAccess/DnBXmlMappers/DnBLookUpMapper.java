package DnBXmlMappers;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import Application.XmlHelper;
import Domain.DnBLookupResult;


public class DnBLookUpMapper 
{
	public ArrayList<DnBLookupResult> getLookupResultsFromXml(String xml)
	{
		/* example chunk of xml results returned
		  <CREDITMSGSRSV2 xmlns:ns2="http://www.dnb.com/DNB_WebServices/Providers/LookUp">
  <LOOKUPTRNRS>
    <TRNUID></TRNUID>
    <STATUS>
      <SEVERITY>INFO</SEVERITY>
      <CODE>0</CODE>
      <MESSAGE></MESSAGE>
    </STATUS>
    <LOOKUPRS>
      <LOOKUPRSCOMPANY>
        <ArrayOfLOOKUPRSCOMPANYItem>
          <ADR_LINE>ST GEORGES HALL</ADR_LINE>
          <BR_IND>H</BR_IND>
          <CTRY_CD>826</CTRY_CD>
          <DUNS_NBR>225314921</DUNS_NBR>
          <NME>UNIT4 BUSINESS SOFTWARE LTD</NME>
          <NON_POST_TOWN>BRISTOL</NON_POST_TOWN>
          <POST_CODE>BS20 0PX</POST_CODE>
          <TLCM_NBR>01275377200</TLCM_NBR>
        </ArrayOfLOOKUPRSCOMPANYItem>
		 */
		ArrayList<DnBLookupResult> results = new ArrayList<DnBLookupResult>();
		
		XPath xpath = XPathFactory.newInstance().newXPath();
		try
		{
			NodeList nodes = (NodeList) xpath.evaluate("//CREDITMSGSRSV2/LOOKUPTRNRS/LOOKUPRS/LOOKUPRSCOMPANY", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			if(nodes.getLength() == 1)
			{
				NodeList resultNodes = nodes.item(0).getChildNodes();
				for(int i=0;i<resultNodes.getLength();i++)
				{
					if(resultNodes.item(i).getNodeName()=="ArrayOfLOOKUPRSCOMPANYItem")
					{
						DnBLookupResult thisOne = getDnBResultFromNode(resultNodes.item(i));
						results.add(thisOne);
					}
				}
			}
		}
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}
		
		return results;
		
	}
	
	private DnBLookupResult getDnBResultFromNode(Node resultNode)
	{
		DnBLookupResult result = new DnBLookupResult();
		NodeList attributes = resultNode.getChildNodes();
		for(int i=0;i<attributes.getLength();i++)
		{
			if(attributes.item(i).getNodeName()=="DUNS_NBR")
				result.setDunsNumber(attributes.item(i).getTextContent());
			else if(attributes.item(i).getNodeName()=="ADR_LINE")
				result.setAddressLine1(attributes.item(i).getTextContent());
			else if(attributes.item(i).getNodeName()=="NME")
				result.setName(attributes.item(i).getTextContent());
			else if(attributes.item(i).getNodeName()=="NON_POST_TOWN")
				result.setTown(attributes.item(i).getTextContent());
			else if(attributes.item(i).getNodeName()=="POST_CODE")
				result.setPostCode(attributes.item(i).getTextContent());
		}
		return result;
	}
}
