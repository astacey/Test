package Domain;

import java.util.ArrayList;

public class DBFullReport 
{
	private ArrayList<DBFullReportSection> sections;

	public DBFullReport()
	{
		this.sections = new ArrayList<DBFullReportSection>();
	}	
		
	public ArrayList<DBFullReportSection> getSections() {
		return sections;
	}
	
	public String getFullReportFormatted()
	{
		String report = "";
		
		return report;
	}
	
}
