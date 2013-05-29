package Application;

import java.text.SimpleDateFormat;
import java.util.Date;

// class to make sure we use the same datetime stamp for things throughout the app - folder names, logfiles, etc
public class GlobalDateStamp 
{
	private static Date date;
	
	public static String getDateStampString()
	{
		if(date == null)
		{
			date = new Date();
		}
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyyMMddhhmmss");
		return dateFormatter.format(date);
	}
}
