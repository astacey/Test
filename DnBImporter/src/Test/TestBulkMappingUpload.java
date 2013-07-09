package Test;

import static org.junit.Assert.*;

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
		
		BulkMappingUpload bmu = new BulkMappingUpload(repo, csvfile, "apar_id", "experian_no", "experian");
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
}
