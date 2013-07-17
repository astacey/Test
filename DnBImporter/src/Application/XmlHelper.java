package Application;
import java.io.IOException;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;



public class XmlHelper 
{
	public static Document getXmlDocument(String xml)
	{
		Document dom = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try 
		{
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
			
			// This doesn't work - is.setCharacterStream(new StringReader(StringEscapeUtils.escapeXml(xml)));
			// This encodeAmpersand thing I've done feels wrong, but works for now so on we go.
			is.setCharacterStream(new StringReader(encodeAmpersand(xml)));
			
			dom = db.parse(is);
		} 
		catch (ParserConfigurationException e) 
		{
			e.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();			
		}
		catch(SAXException se)
		{
			se.printStackTrace();
		}
		return dom;
	}
	
	public static int getIntegerFromXmlString(String str)
	{
		if(str==null)
			return 0; // Not sure about this ??
 		if(str.length()==0)
			return 0;
		return Integer.valueOf(str);
	}

	public static double getDoubleFromXmlString(String str)
	{
		if(str.length()==0)
			return 0;
		return Double.valueOf(str);
	}
	
	public static Date getDateFromXmlString(String str) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		return formatter.parse(str);
	}
	
	public static Date getDateFromXmlString(String str, String format) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.parse(str);
	}
	
	public static String getStringFromXmlString(String str)
	{
		return unEncodeAmpersand(str);
	}
	
	public static String getStringFromXPath(String xml, String xPath)
	{
		XPath xpath = XPathFactory.newInstance().newXPath();
		try
		{
			NodeList nodes = (NodeList) xpath.evaluate(xPath, XmlHelper.getXmlDocument(xml), XPathConstants.NODESET);
			if(nodes.getLength()==1)
			{
				return nodes.item(0).getTextContent();
			}
		}
		catch (XPathExpressionException e) 
		{
			e.printStackTrace();
		}
		
		return "";
	}
	
	private static String encodeAmpersand(String str)
	{
		return str.replace("&", "&amp;");
	}

	private static String unEncodeAmpersand(String str)
	{
		return str.replace("&amp;", "&");
	}
	
	public static String getDoubleAsString(double value)
	{
		DecimalFormat formatter = new DecimalFormat("#.##");
		return formatter.format(value);
	}
}
