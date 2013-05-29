package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class ImporterSettings 
{
	private Date lastRunDate;
	private String csvLocation;

	public ImporterSettings()
	{
		// Default to current eastern time
		// shouldn't ever need the default
		lastRunDate = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime();
	}
	
	public Date getLastRunDate() 
	{
		return lastRunDate;
	}

	public void setLastRunDate(Date lastRunDate) 
	{
		this.lastRunDate = lastRunDate;
	}
	
	public String toXml()
	{
		// xml later !!
		return "<Settings><LastRunDate>" + getDateFormat().format(lastRunDate) + "</LastRunDate>"
				+"<CSVLocation>" + csvLocation + "</CSVLocation></Settings>";
		//return getDateFormat().format(lastRunDate);
	}

	public void fromXml(String xml)
	{ 
		try
		{
			Document doc = XmlHelper.getXmlDocument(xml);
			Node root = doc.getFirstChild();
			for(int i=0;i<root.getChildNodes().getLength();i++)
			{
				if( root.getChildNodes().item(i).getNodeName()=="LastRunDate")
					this.lastRunDate = getDateFormat().parse(root.getChildNodes().item(i).getTextContent());
				else if( root.getChildNodes().item(i).getNodeName()=="CSVLocation")
					this.csvLocation = root.getChildNodes().item(i).getTextContent();
			}
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private SimpleDateFormat getDateFormat()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS");
		formatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		return formatter;
	}

	public String getCsvLocation() {
		return csvLocation;
	}

	public void setCsvLocation(String csvLocation) {
		this.csvLocation = csvLocation;
	}
}
	