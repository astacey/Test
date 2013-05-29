package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import org.junit.Test;

import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestDnBRepository;

import Application.UpdateHandler;

public class TestUpdateHandler {

	@Test
	public void testGetUpdates() 
	{
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestImporterSettingsRepository settingsRepo = new TestImporterSettingsRepository();
		// Set date to be 
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -2);
		cal.add(Calendar.MINUTE, -2);
		settingsRepo.setLastRunDate(cal.getTime());
		
		companyRepo.setTestSet(new int[]{100, 200});

		// check this is empty
		assertEquals("Number of companies saved is 0", 0, companyRepo.getCompaniesSaved().size());
		
		UpdateHandler handler = new UpdateHandler(companyRepo, dnbRepo, settingsRepo.getSettings());
		handler.getUpdates();
		
		// should save 1 company
		assertEquals("Number of companies saved is 1 per request to dnb, so 3", 3, companyRepo.getCompaniesSaved().size());
		// 
		assertEquals("Paydex of saved company should be 77", 77, companyRepo.getCompaniesSaved().get(0).getDunnBradstreetData().getCurrentPaydex().getPaydex());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
/*		cal = Calendar.getInstance();
		Calendar easternCal = new GregorianCalendar(TimeZone.getTimeZone("US/Eastern"));
		easternCal.setTimeInMillis(cal.getTimeInMillis());
		System.out.println(easternCal.get(Calendar.HOUR));
		System.out.println(formatter.format(new Date()));
		System.out.println(formatter.format(Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime()));
*/
		assertEquals("Settings date incremented", formatter.format(Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime()), formatter.format(settingsRepo.getSettings().getLastRunDate()));
		
		
		
	}

}
