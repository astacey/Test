package Domain;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import Application.XmlHelper;



public class DnBRegistrationCollection extends ArrayList<DnBRegistration> 
{
	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;
	
	public DnBRegistration findByDuns(int dunsNumber)
	{
		for (DnBRegistration reg : this) 
		{
			if(reg.getDunsNo()==dunsNumber)
				return reg;
		}
		return null;
	}
	
	public void addFromXml(String xml)
	{
		XPath xpath = XPathFactory.newInstance().newXPath();
		try 
		{
			NodeList nodes = (NodeList) xpath.evaluate("//GLBLMNSVCMSGSRSV1/REGNLISTTRNRS/REGNLISTRS/USERRS/PFLRS/REGNRS", XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			for (int i=0;i<nodes.getLength();i++)
			{
				DnBRegistration reg = new DnBRegistration();
				NodeList children = nodes.item(i).getChildNodes();
				for(int j=0;j<children.getLength();j++)
				{
					if(children.item(j).getNodeName()=="DUNS_NBR")
						reg.setDunsNo(Integer.valueOf(children.item(j).getTextContent().toString()));
					else if(children.item(j).getNodeName()=="STAT_DESC")
						reg.setStatus(DnBRegistrationStatus.fromString(children.item(j).getTextContent().toString()));
				}
				this.add(reg);
			}
		} 
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}		
	}
}
