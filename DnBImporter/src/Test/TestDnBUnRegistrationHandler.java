package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.DnBUnRegistrationHandler;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBRegistration;
import Domain.DnBRegistrationCollection;
import Domain.RegistrationStatus;
import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestDnBRepository;

public class TestDnBUnRegistrationHandler 
{

	@Test
	public void testUnRegisterCompanies() 
	{
		TestDnBRepository dnbRepo = new TestDnBRepository();
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		
		//Test Data
		DnBRegistrationCollection regs = new DnBRegistrationCollection();
		DnBRegistration reg = new DnBRegistration(100);
		reg.setStatus(RegistrationStatus.ACTIVE);
		regs.add(reg);
		reg = new DnBRegistration(200);
		reg.setStatus(RegistrationStatus.ACTIVE);
		regs.add(reg);
		dnbRepo.setTestRegistrations(regs);
		
		CompanyCollection testComps = new CompanyCollection();
		Company c = new Company("100", "Test Company 1", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		testComps.add(c);
		
		companyRepo.setTestCompanies(testComps);
		
		// Run Test
		DnBUnRegistrationHandler handler = new DnBUnRegistrationHandler(companyRepo, dnbRepo);
		handler.UnRegisterCompanies();
		
		// Expected results		
		assertEquals("company 100 does not get cancelled", RegistrationStatus.ACTIVE, dnbRepo.getRegistrations().get(0).getStatus());
		assertEquals("company 200 does get cancelled", RegistrationStatus.CANCELLED, dnbRepo.getRegistrations().get(1).getStatus());
	}

}
