package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestDnBRepository;

import Application.DnBInitialUploadHandler;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;

public class TestInitialUploadHandler {

	@Test
	public void testDownloadAllCompanies()
	{
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestImporterSettingsRepository settingsRepo = new TestImporterSettingsRepository();
		
		CompanyCollection coll = new CompanyCollection();
		coll.add(new Company(String.valueOf(100), "", CompanyType.SUPPLIER));
		coll.add(new Company(String.valueOf(200), "", CompanyType.SUPPLIER));
		companyRepo.setTestCompanies(coll);
		

		assertEquals("Number of companies saved is 0", 0, companyRepo.getCompaniesSaved().size());
		
		// First try importing companies that already have duns data, will not import
		DnBInitialUploadHandler handlerToTest = new DnBInitialUploadHandler(companyRepo, dnbRepo, settingsRepo.getSettings(), companyRepo);
		handlerToTest.downloadAllCompanies();
		assertEquals("Number of companies saved is 0", 0, companyRepo.getCompaniesSaved().size());
		
		// Now import existing companies with duns data
		TestCompanyRepository companySourceRepo = new TestCompanyRepository();
		companySourceRepo.setTestSet(new int[]{100, 200}); // this set's up the 2 companies with d&b data
		
		handlerToTest = new DnBInitialUploadHandler(companyRepo, dnbRepo, settingsRepo.getSettings(), companySourceRepo);
		handlerToTest.downloadAllCompanies();
		assertEquals("Number of companies saved is 2", 2, companyRepo.getCompaniesSaved().size());
		
		// import 3 companies that don't already exist at all
		companyRepo.resetSavedCompanies();
		companySourceRepo.setTestSet(new int[]{1,2,3});
		handlerToTest = new DnBInitialUploadHandler(companyRepo, dnbRepo, settingsRepo.getSettings(), companySourceRepo);
		handlerToTest.downloadAllCompanies();
		assertEquals("Number of companies saved is 3", 3, companyRepo.getCompaniesSaved().size());
	}

}
