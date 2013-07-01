package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.DnBRegistrationHandler;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBRegistration;
import Domain.DnBRegistrationCollection;
import Domain.RegistrationStatus;
import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestDnBRepository;

public class TestRegistrationHandler {

	@Test
	public void testRegisterCompanies() 
	{
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestCompanyRepository companyRepo = new TestCompanyRepository();

		//Test Data
		DnBRegistrationCollection regs = new DnBRegistrationCollection();
		DnBRegistration reg = new DnBRegistration(100);
		reg.setStatus(RegistrationStatus.FAILED);
		regs.add(reg);
		reg = new DnBRegistration(200);
		reg.setStatus(RegistrationStatus.ACTIVE);
		regs.add(reg);
		dnbRepo.setTestRegistrations(regs);
		
		CompanyCollection testComps = new CompanyCollection();
		Company c = new Company("100", "Test Company 1", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		testComps.add(c);
		c = new Company("200", "Test Company 2", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(200));
		testComps.add(c);
		c = new Company("300", "Test Company 3", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(300));
		testComps.add(c);
		companyRepo.setTestCompanies(testComps);
		
		DnBRegistrationHandler handler = new DnBRegistrationHandler(companyRepo, dnbRepo);
		handler.RegisterCompanies();
	
		// Company 1 should be Pending
		assertEquals("Company 1 should be Pending", RegistrationStatus.PENDING, companyRepo.getCompanyById("100").getDunnBradstreetData().getRegistrationDetails().getStatus());
		// Company 2 should be Active
		assertEquals("Company 2 should be Active", RegistrationStatus.ACTIVE, companyRepo.getCompanyById("200").getDunnBradstreetData().getRegistrationDetails().getStatus());		
		// Company 3 should be Pending
		assertEquals("Company 3 should be Pending", RegistrationStatus.PENDING, companyRepo.getCompanyById("300").getDunnBradstreetData().getRegistrationDetails().getStatus());		
		// Saved companies = 3
		assertEquals("Saved companies = 3", 3, companyRepo.getCompaniesSaved().size());
	}

}
