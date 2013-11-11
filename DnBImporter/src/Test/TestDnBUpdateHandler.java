package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;

import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestDnBRepository;
import Test.TestRepositories.TestImporterSettingsRepository;

import Application.DnBUpdateHandler;
import Domain.Address;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.RegistrationStatus;

public class TestDnBUpdateHandler {

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
		
		DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settingsRepo.getSettings());
		handler.getUpdates();
		
		// should save 1 company
		assertEquals("Number of companies saved is 1 per request to dnb, so 3", 3, companyRepo.getCompaniesSaved().size());
		// 
		assertTrue("Paydex of saved company should be 77", 77==companyRepo.getCompaniesSaved().get(0).getDunnBradstreetData().getPaydexScoreHistory().getCurrent().getValue());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
/*		cal = Calendar.getInstance();
		Calendar easternCal = new GregorianCalendar(TimeZone.getTimeZone("US/Eastern"));
		easternCal.setTimeInMillis(cal.getTimeInMillis());
		System.out.println(easternCal.get(Calendar.HOUR));
		System.out.println(formatter.format(new Date()));
		System.out.println(formatter.format(Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime()));
*/
		assertEquals("Settings date incremented", formatter.format(Calendar.getInstance(TimeZone.getTimeZone("US/Eastern")).getTime()), formatter.format(settingsRepo.getSettings().getLastRunDateDnB()));
		
		
		
	}

	@Test
	public void testGetUpdatesOutOfBusinessFlag() 
	{
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestImporterSettingsRepository settingsRepo = new TestImporterSettingsRepository();
		// Set date to be 
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -2);
		cal.add(Calendar.MINUTE, -2);
		settingsRepo.setLastRunDate(cal.getTime());
		
		// set up 1 companyh with out of business set to false
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Test", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().setOutOfBusiness(false);
		companies.add(c);
		companyRepo.setTestCompanies(companies);

		// check this is empty
		assertEquals("Number of companies saved is 0", 0, companyRepo.getCompaniesSaved().size());
		
		DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settingsRepo.getSettings());
		handler.getUpdates();
		// 
		assertTrue("Paydex of saved company should be 77", 77==companyRepo.getAllCompanies().get(0).getDunnBradstreetData().getPaydexScoreHistory().getCurrent().getValue());
		assertTrue("OutOfBusiness indicator of company should be true", companyRepo.getAllCompanies().get(0).getDunnBradstreetData().getOutOfBusiness());
		
	}
	
	@Test
	public void test2RatingsUpdates()
	{
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestImporterSettingsRepository settingsRepo = new TestImporterSettingsRepository();
		// Set date to be now - 1 min, this means it'll only call dnbRepo.getupdates once
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -1);
		settingsRepo.setLastRunDate(cal.getTime());
		
		// set up 1 companyh with out of business set to false
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Test", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().setOutOfBusiness(false);
		companies.add(c);
		companyRepo.setTestCompanies(companies);
		
		dnbRepo.setTestCompanyUpdates(getDBUpdates());
		
		DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settingsRepo.getSettings());
		handler.getUpdates();
		
		assertEquals("There should be 1 rating for company 1", 1, companyRepo.getCompanyById("1").getDunnBradstreetData().getDbratingHistory().size());
		assertEquals("The rating for company 1 should be H2", "H2", companyRepo.getCompanyById("1").getDunnBradstreetData().getCurrentRating().getRating());
	}
	
	@Test
	public void testGetNewCompanyAddress()
	{
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestImporterSettingsRepository settingsRepo = new TestImporterSettingsRepository();
		// Set date to be now - 1 min, this means it'll only call dnbRepo.getupdates once
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -1);
		settingsRepo.setLastRunDate(cal.getTime());
		
		// set up 1 company
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Test", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		// set to registered, so update routine will call GetDetails for first time
		c.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.REGISTERED);
		companies.add(c);
		companyRepo.setTestCompanies(companies);
		companyRepo.setTestInitialUpdateDBCompanies(companies);
		
		DnBData testDBData = new DnBData(100);
		Address address = new Address();
		address.getAddressLines().add("110 Dartmouth Road");
		testDBData.setMainAddress(address);
		dnbRepo.setTestCompanyDetails(testDBData);
		
		DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settingsRepo.getSettings());
		handler.getUpdates();
		
		assertEquals("Address line 1 should be 110 Dartmouth Road", "110 Dartmouth Road", companyRepo.getCompanyById("1").getDunnBradstreetData().getMainAddress().getAddressLine1());
	}
	
	private ArrayList<DnBData> getDBUpdates()
	{
		ArrayList<DnBData> updates = new ArrayList<DnBData>();
		
		DnBData data = new DnBData(100);
		data.getDbratingHistory().add(new DnBRating("O2", new Date()));
		updates.add(data);
		data = new DnBData(100);
		data.getDbratingHistory().add(new DnBRating("H2", new Date()));
		updates.add(data);
		return updates;
	}
}
