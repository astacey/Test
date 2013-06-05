package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.ImporterSettings;

public class TestImporterSettings {

	@Test
	public void testFromXml() 
	{
		ImporterSettings settings = new ImporterSettings();
		settings.fromXml("<Settings><LastRunDate>2013-05-10T07:28:04:000</LastRunDate><CSVLocation>/home/astacey/SupplierData</CSVLocation><ABWLastProcessed>77</ABWLastProcessed></Settings>");
		
//		assertEquals("Last Run Date is correct.", "2013-05-10T07:28:04:000", settings.getLastRunDate())
		assertEquals("CSV Locations is correct", "/home/astacey/SupplierData", settings.getCsvLocation());
		assertEquals("ABW Last Processed is correct", 77, settings.getAbwLastProcessed());
	}

}
