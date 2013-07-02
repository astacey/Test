package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.junit.Test;

import Application.ImporterSettings;

public class TestImporterSettings {

	@Test
	public void testFromXml() 
	{
		ImporterSettings settings = new ImporterSettings();
		settings.fromXml("<Settings><LastRunDateDnB>2013-05-10T07:28:04:000</LastRunDateDnB><LastRunDateExperian>2013-07-16T22:28:04:000</LastRunDateExperian><CSVLocation>/home/astacey/SupplierData</CSVLocation><ABWLastProcessed>77</ABWLastProcessed></Settings>");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		
		assertEquals("Last Run Date is correct.", "2013-05-10 07:28:04", formatter.format(settings.getLastRunDateDnB()));
		assertEquals("CSV Locations is correct", "/home/astacey/SupplierData", settings.getCsvLocation());
		assertEquals("ABW Last Processed is correct", 77, settings.getAbwLastProcessed());
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		assertEquals("Last Run Date Experian is correct", "2013-07-16", formatter.format(settings.getLastRunDateExperian()));
	}

}
