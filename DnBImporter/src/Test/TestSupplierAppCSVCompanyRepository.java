package Test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import Application.SupplierAppCSVCompanyRepository;
import Application.FileHelper;
import Domain.*;

public class TestSupplierAppCSVCompanyRepository 
{
	// TODO : Need it to not depend on path ?
	String folderLocation = AllTests.getTestFolder();
	String expectedAccountOutput = AllTests.getAccountsFileBaseString() + "1;Test & Company;C;1;;100;Active;FAILED;;;;0100;Non Limited;ACTIVE;;;5A1;;;;;;;;;;;;\r\n";
	String expectedAccountInput = AllTests.getAccountsFileBaseString() ;
	
	@Test
	public void testGetCompanyByDuns()
	{
		FileHelper.writeFile(folderLocation + "accounts.csv", expectedAccountOutput);
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		if(repo.getCompanyByDuns(100)!=null)
		{
			assertEquals("Company with duns id 100 is not found ", "Test & Company", repo.getCompanyByDuns(100).get(0).getName());
			//Check the companyType
			assertEquals("Company Type is Customer", CompanyType.CUSTOMER, repo.getCompanyByDuns(100).get(0).getType());
		}
		else
			fail("Company with duns id 100 is not found");
	}
	
	@Test
	public void testGetAllCompanies()
	{
		FileHelper.writeFile(folderLocation + "accounts.csv", expectedAccountOutput);
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		CompanyCollection companies = repo.getAllCompanies();
		assertEquals("1 company returned", 1, companies.size());
		
		assertEquals("Company with duns id 100 is not found ", "Test & Company", companies.get(0).getName());
		//Check the companyType
		assertEquals("Company Type is Customer", CompanyType.CUSTOMER, companies.get(0).getType());
		//Check the registration status
		assertEquals("Registration Status is Failed", RegistrationStatus.FAILED, companies.get(0).getDunnBradstreetData().getRegistrationDetails().getStatus());
	}
	
	@Test
	public void testSaveCompany() 
	{
		String expectedFactOutput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\r\n1005;2013-04-01;1;OB\r\n1;2013-01-01;1;Risk\r\n99;2013-01-01;1;FR\r\n50;2013-01-01;1;FRP\r\n200;2013-01-01;1;P\r\n75;2013-01-01;1;PN\r\n";
		FileHelper.writeFile(folderLocation + "accounts.csv", expectedAccountInput);
		
		Company c = new Company("1", "Test & Company", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.FAILED);
		
		c.setExperianData(new ExperianData("0100", "test", ExperianLegalStatus.NONLIMITED));
		c.getExperianData().setRegistrationStatus(RegistrationStatus.ACTIVE);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 0, 1); // WTF ? why 0 ? I mean really wtf ?
		c.getDunnBradstreetData().getDbratingHistory().add(new DnBRating("5A1", cal.getTime()));
		c.getDunnBradstreetData().getFailureRiskScoreHistory().add(new IntegerDatedValue(cal.getTime(), 99));
		c.getDunnBradstreetData().getFailureRiskPercentileHistory().add(new IntegerDatedValue(cal.getTime(), 50));
		c.getDunnBradstreetData().getPaydexScoreHistory().add(new IntegerDatedValue(cal.getTime(), 200));
		c.getDunnBradstreetData().getPaydexNormHistory().add(new IntegerDatedValue(cal.getTime(), 75));
		cal.set(2013,3,1); // 3 meaning april - I mean WTF dude ?
		c.getOpenBalanceCollection().upsert(new DoubleDatedValue(cal.getTime(), 1005.0));
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		repo.saveCompany(c);
		repo.commitAllChanges();
		
		String actualAccountsOutput = FileHelper.getStringFromFile(folderLocation + "accounts.csv");
		System.out.print(actualAccountsOutput);
		System.out.print(expectedAccountOutput);
		
		assertTrue("Expected account output file is incorrect", expectedAccountOutput.equalsIgnoreCase(actualAccountsOutput) );
		String actualFactOutput = FileHelper.getStringFromFile(folderLocation + "fact_data.csv");
		System.out.print(expectedFactOutput);
		System.out.print(actualFactOutput);
		assertTrue("Expected fact output is incorrect", expectedFactOutput.equalsIgnoreCase(actualFactOutput));
	}
}
