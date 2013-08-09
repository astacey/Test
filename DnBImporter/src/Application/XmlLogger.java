package Application;

public class XmlLogger 
{
	private String logFileLocation;
	private int fileNumber;
	
	public XmlLogger(String logFileLocation)
	{
		this.logFileLocation=logFileLocation;
		if( !this.logFileLocation.endsWith("/"))
			this.logFileLocation+="/";
		this.fileNumber = 0;
	}
	
	public void logXml(String xml)
	{
		String fileName = logFileLocation + GlobalDateStamp.getDateStampString() + "_" + String.valueOf(fileNumber) + ".xml";
		FileHelper.writeFile(fileName, xml);
		fileNumber++;
	}
}
