package Test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sun.util.resources.CalendarData;

import Application.SupplierAppCSVCompanyRepository;
import Application.FileHelper;
import Domain.*;

public class TestSupplierAppCSVCompanyRepository 
{
	// TODO : Need it to not depend on path ?
	String folderLocation = "/home/astacey/SupplierDataTest";
	String expectedAccountOutput = "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS\r\n1;All;1;;;;;\r\nA;Suppliers;1;;;;;\r\nB;Partners;1;;;;;\r\nC;Customers;1;;;;;\r\n1;Test & Company;C;1;;100;Active;Failed\r\n";
	String expectedAccountInput = "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS\r\n1;All;1;;;;;\r\nA;Suppliers;1;;;;;\r\nB;Partners;1;;;;;\r\nC;Customers;1;;;;;\r\n";
	
	@Test
	public void testGetCompanyByDuns()
	{
		FileHelper.writeFile(folderLocation + "/accounts.csv", expectedAccountOutput);
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		if(repo.getCompanyByDuns(100)!=null)
		{
			assertEquals("Company with duns id 100 is not found ", "Test & Company", repo.getCompanyByDuns(100).getName());
			//Check the companyType
			assertEquals("Company Type is Customer", CompanyType.CUSTOMER, repo.getCompanyByDuns(100).getType());
		}
		else
			fail("Company with duns id 100 is not found");
	}
	
	@Test
	public void testGetAllCompanies()
	{
		FileHelper.writeFile(folderLocation + "/accounts.csv", expectedAccountOutput);
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		CompanyCollection companies = repo.getAllCompanies();
		assertEquals("1 company returned", 1, companies.size());
		
		assertEquals("Company with duns id 100 is not found ", "Test & Company", companies.get(0).getName());
		//Check the companyType
		assertEquals("Company Type is Customer", CompanyType.CUSTOMER, companies.get(0).getType());
		//Check the registration status
		assertEquals("Registration Status is Failed", DnBRegistrationStatus.FAILED, companies.get(0).getDunnBradstreetData().getRegistrationDetails().getStatus());
	}
	
	@Test
	public void testSaveCompany() 
	{
		String expectedFactOutput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\r\n1;2013-01-01;1;Risk\r\n99;2013-01-01;1;FR\r\n50;2013-01-01;1;FRP\r\n200;2013-01-01;1;P\r\n75;2013-01-01;1;PN\r\n";
		FileHelper.writeFile(folderLocation + "/accounts.csv", expectedAccountInput);
		
		Company c = new Company("1", "Test & Company", CompanyType.CUSTOMER);
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().getRegistrationDetails().setStatus(DnBRegistrationStatus.FAILED);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2013, 0, 1); // WTF ? why 0 ? I mean really wtf ?
		c.getDunnBradstreetData().getDbratingHistory().add(new DnBRating("5A1", cal.getTime()));
		c.getDunnBradstreetData().getFailureRiskHistory().add(new DnBFailureRisk(99, 50, cal.getTime()));
		c.getDunnBradstreetData().getPaydexHistory().add(new DnBPaydex(200, 75, cal.getTime()));
		
		SupplierAppCSVCompanyRepository repo = new SupplierAppCSVCompanyRepository(folderLocation);
		repo.saveCompany(c);
		repo.commitAllChanges();
		
		String actualAccountsOutput = FileHelper.getStringFromFile(folderLocation + "/accounts.csv");
		System.out.print(actualAccountsOutput);
		System.out.print(expectedAccountOutput);
		
		assertTrue("Expected account output file is incorrect", expectedAccountOutput.equalsIgnoreCase(actualAccountsOutput) );
		String actualFactOutput = FileHelper.getStringFromFile(folderLocation + "/fact_data.csv");

		assertTrue("Expected fact output is incorrect", expectedFactOutput.equalsIgnoreCase(actualFactOutput));
	}
}
