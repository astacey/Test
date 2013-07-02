package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.ExperianRegistrationHandler;
import Domain.*;
import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestExperianRepository;

public class TestExperianRegistrationHandler {

	@Test
	public void testRegisterCompanies() 
	{
		TestCompanyRepository repo = new TestCompanyRepository();
		CompanyCollection companies = new CompanyCollection();
		addCompany(companies, "100", "E1", RegistrationStatus.REGISTERED);
		addCompany(companies, "200", "E2", RegistrationStatus.UNREGISTERED);
		addCompany(companies, "300", "E3", RegistrationStatus.UNREGISTERED);
		addCompany(companies, "400", "E4", RegistrationStatus.ACTIVE);
		repo.setTestCompanies(companies);
		
		TestExperianRepository experianRepo = new TestExperianRepository();
		experianRepo.setFailToRegister(new String[]{ "E3" });
		
		ExperianRegistrationHandler handler = new ExperianRegistrationHandler(repo, experianRepo);
		handler.RegisterCompanies();
		
		assertEquals("Company 100 should unnaffected, status is registered", RegistrationStatus.REGISTERED, companies.getCompanyFromId("100").getExperianData().getRegistrationStatus());
		assertEquals("Company 200 should have status of registered", RegistrationStatus.REGISTERED, companies.getCompanyFromId("200").getExperianData().getRegistrationStatus());
		assertEquals("Company 300 should have status of failed", RegistrationStatus.FAILED, companies.getCompanyFromId("300").getExperianData().getRegistrationStatus());
		assertEquals("Company 400 should unnaffected, status is active", RegistrationStatus.ACTIVE, companies.getCompanyFromId("400").getExperianData().getRegistrationStatus());
	}

	private void addCompany(CompanyCollection companies, String id, String experianRef, RegistrationStatus status)
	{
		int index = companies.size();
		companies.add(new Company(id, "Whatever", CompanyType.CUSTOMER));
		companies.get(index).setExperianData(new ExperianData(experianRef, "dhdhdhd", ExperianLegalStatus.LIMITED));
		companies.get(index).getExperianData().setRegistrationStatus(status);
	}
}
