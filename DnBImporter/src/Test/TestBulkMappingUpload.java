package Test;

import static org.junit.Assert.*;

import javax.swing.RowFilter.ComparisonType;

import org.junit.Test;

import Application.BulkMappingUpload;
import Application.FileHelper;
import Domain.*;
import Test.TestRepositories.TestCompanyRepository;

public class TestBulkMappingUpload 
{
	@Test
	public void testUploadMappings() 
	{
		String csvfile = AllTests.getTestFolder() + "MappingImport.csv";
		String mappingInput = "apar_id,experian_no\nCMQ1241,09636108\n2368,06953114\n2542,04928616\n";
		FileHelper.writeFile(csvfile, mappingInput);
		
		TestCompanyRepository repo = new TestCompanyRepository();
		CompanyCollection companies = new CompanyCollection();
		companies.add(new Company("CMQ1241", "Whatever", CompanyType.CUSTOMER));
		companies.add(new Company("2368", "Whatever", CompanyType.CUSTOMER));
		companies.add(new Company("2444", "Whatever", CompanyType.CUSTOMER));
		repo.setTestCompanies(companies);
		
		BulkMappingUpload bmu = new BulkMappingUpload(repo, csvfile, "apar_id", "experian_no", "experian", "","");
		try 
		{
			bmu.uploadMappings();
		}
		catch (Exception e)
		{
			assertTrue("Error " + e.getMessage(), false);
		}
		assertTrue("Company CMQ1241 has experian ref 09636108", companies.getCompanyFromId("CMQ1241").getExperianData().getId().equalsIgnoreCase("09636108"));
		assertTrue("Company 2368 has experian ref 06953114", companies.getCompanyFromId("2368").getExperianData().getId().equalsIgnoreCase("06953114"));
		assertTrue("Company 2444 has no experian ref", companies.getCompanyFromId("2444").getExperianData()==null);
	}

	@Test
	public void testUploadDnBMappings() 
	{
		String csvfile = AllTests.getTestFolder() + "MappingImport.csv";
		String mappingInput = "apar_id,dnb,grade, conf\nCMQ1241,9636108,AAA,7\n2368,6953114,BBB,9\n2542,4928616,,\nBYGUS,99999,,\n";
		FileHelper.writeFile(csvfile, mappingInput);
		
		TestCompanyRepository repo = new TestCompanyRepository();
		CompanyCollection companies = new CompanyCollection();
		companies.add(new Company("CMQ1241", "Whatever", CompanyType.CUSTOMER));
		companies.add(new Company("2368", "Whatever", CompanyType.CUSTOMER));
		companies.add(new Company("2444", "Whatever", CompanyType.CUSTOMER));
		Company companyDnB = new Company("BYGUS", "Test with dnb remapping", CompanyType.CUSTOMER);
		companyDnB.setDunnBradstreetData(new DnBData(91119));
		assertEquals("Company BYGUS starts with unregistered status", RegistrationStatus.UNREGISTERED, companyDnB.getDunnBradstreetData().getRegistrationDetails().getStatus());
		companies.add(companyDnB);
		repo.setTestCompanies(companies);
	
		BulkMappingUpload bmu = new BulkMappingUpload(repo, csvfile, "apar_id", "dnb", "dnb", "grade","conf");
		try 
		{
			bmu.uploadMappings();
		}
		catch (Exception e)
		{
			assertTrue("Error " + e.getMessage(), false);
		}
		assertEquals("Company CMQ1241 has duns 9636108", 9636108, companies.getCompanyFromId("CMQ1241").getDunnBradstreetData().getDunsNumber());
		assertEquals("Company 2368 has duns 6953114", 6953114, companies.getCompanyFromId("2368").getDunnBradstreetData().getDunsNumber());
		assertEquals("Company 2368 has match grade BBB", "BBB", companies.getCompanyFromId("2368").getDunnBradstreetData().getMatchGrade());
		assertEquals("Company CMQ1241 has confidence 7", "7", companies.getCompanyFromId("CMQ1241").getDunnBradstreetData().getMatchConfidenceCode());
		assertEquals("Company 2444 has no duns", null, companies.getCompanyFromId("2444").getDunnBradstreetData());
		assertEquals("Company BYGUS now has remapped duns", RegistrationStatus.REMAPPED, companies.getCompanyFromId("BYGUS").getDunnBradstreetData().getRegistrationDetails().getStatus());
		assertEquals("Company BYGUS now has duns 99999", 99999, companies.getCompanyFromId("BYGUS").getDunnBradstreetData().getDunsNumber());
	}
}
