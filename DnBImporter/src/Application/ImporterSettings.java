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
	private Date lastRunDateDnB;
	private String csvLocation;
	private int abwLastProcessed;
	private Date lastRunDateExperian;

	public ImporterSettings()
	{
		// Default to current eastern time
		// shouldn't ever need the default
		lastRunDateDnB = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime();
		lastRunDateExperian = Calendar.getInstance().getTime();
		abwLastProcessed = 0;
	}
		
	public String toXml()
	{
		return "<Settings><LastRunDateDnB>" + getDateFormat().format(lastRunDateDnB) + "</LastRunDateDnB>"
				+"<LastRunDateExperian>" + getDateFormat().format(lastRunDateExperian) + "</LastRunDateExperian>"
				+"<CSVLocation>" + csvLocation + "</CSVLocation>"
				+"<ABWLastProcessed>" + abwLastProcessed + "</ABWLastProcessed></Settings>";
	}

	public void fromXml(String xml)
	{ 
		try
		{
			Document doc = XmlHelper.getXmlDocument(xml);
			Node root = doc.getFirstChild();
			for(int i=0;i<root.getChildNodes().getLength();i++)
			{
				if( root.getChildNodes().item(i).getNodeName()=="LastRunDate") // Legacy support !! get rid of this in a few cycles time
					this.lastRunDateDnB = getDateFormat().parse(root.getChildNodes().item(i).getTextContent());
				else if( root.getChildNodes().item(i).getNodeName()=="LastRunDateDnB")
					this.lastRunDateDnB = getDateFormat().parse(root.getChildNodes().item(i).getTextContent());
				else if( root.getChildNodes().item(i).getNodeName()=="LastRunDateExperian")
					this.lastRunDateExperian = getDateFormatExperian().parse(root.getChildNodes().item(i).getTextContent());
				else if( root.getChildNodes().item(i).getNodeName()=="CSVLocation")
					this.csvLocation = root.getChildNodes().item(i).getTextContent();
				else if( root.getChildNodes().item(i).getNodeName()=="ABWLastProcessed")
					this.abwLastProcessed = XmlHelper.getIntegerFromXmlString(root.getChildNodes().item(i).getTextContent());
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

	private SimpleDateFormat getDateFormatExperian()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter;
	}
	
	public String getCsvLocation() {
		return csvLocation;
	}

	public void setCsvLocation(String csvLocation) {
		this.csvLocation = csvLocation;
	}

	public int getAbwLastProcessed() {
		return abwLastProcessed;
	}

	public void setAbwLastProcessed(int abwLastProcessed) {
		this.abwLastProcessed = abwLastProcessed;
	}

	public Date getLastRunDateDnB() 
	{
		return lastRunDateDnB;
	}

	public void setLastRunDateDnB(Date lastRunDate) 
	{
		this.lastRunDateDnB = lastRunDate;
	}
	
	public Date getLastRunDateExperian() {
		return lastRunDateExperian;
	}

	public void setLastRunDateExperian(Date lastRunDateExperian) {
		this.lastRunDateExperian = lastRunDateExperian;
	}
}
	