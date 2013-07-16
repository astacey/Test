package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.FileHelper;
import Application.SupplierAppCSVAccounts;
import Domain.*;

public class TestSupplierAppCSVAccounts {

	String testFile = AllTests.getTestFolder() + "accounts.csv";
	private String accountsFileContentsFull = "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS;"
			+"ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET;EXPERIAN_NO;EXPERIAN_LEGAL_STATUS;EXPERIAN_REGISTRATION_STATUS;DNB_DEFAULT_CURRENCY_CODE;DNB_CREDIT_RECOMMENDATION_CURRENCY_CODE\r\n1;All;1;;;;;;;;;;;;\r\nA;Suppliers;1;;;;;;;;;;;;\r\nB;Partners;1;;;;;;;;;;;;\r\nC;Customers;1;;;;;;;;;;;;\r\n"
			+"1;Test & Company;C;1;111;100;Inactive;FAILED;ted;teddy;vertical;0100;Non Limited;ACTIVE;USD;PLN\r\n";
	
	@Test
	public void testReadRecords() 
	{
		FileHelper.writeFile(testFile, accountsFileContentsFull);
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		accountsCsv.read(companies, testFile);
		
		assertEquals("One company read", 1, companies.size());
		Company one = companies.get(0);
		assertEquals("Gen ID equals", "1", one.getId());
		assertEquals("Name equals", "Test & Company", one.getName());
		assertEquals("CompanyType", CompanyType.CUSTOMER, one.getType());
		assertEquals("Name equals", "Test & Company", one.getName());
		assertEquals("Companies House number", "111", one.getCompanyRegistrationNumber());
		assertEquals("DUNS", 100, one.getDunnBradstreetData().getDunsNumber());
		assertEquals("Status", true, one.getDunnBradstreetData().getOutOfBusiness());
		assertEquals("dnb Status", RegistrationStatus.FAILED, one.getDunnBradstreetData().getRegistrationDetails().getStatus());
		assertEquals("account group code", "ted", one.getAccountGroup().getCode());
		assertEquals("account group name", "teddy", one.getAccountGroup().getName());
		assertEquals("vertical market", "vertical", one.getVerticalMarket());
		assertEquals("experian number", "0100", one.getExperianData().getId());
		assertEquals("experian legal status", ExperianLegalStatus.NONLIMITED, one.getExperianData().getLegalStatus());
		assertEquals("experian reg status", RegistrationStatus.ACTIVE, one.getExperianData().getRegistrationStatus());
		assertEquals("default currency", Currency.USD, one.getDunnBradstreetData().getDefaultCurrency());
		assertEquals("max credit recommendation currency", Currency.PLN, one.getDunnBradstreetData().getMaximumCreditRecommendationCurrency());
	}

	@Test
	public void testWriteRecords() 
	{
		FileHelper.writeFile(testFile, AllTests.getAccountsFileBaseString());
	
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Test & Company", CompanyType.CUSTOMER);
		c.setCompanyRegistrationNumber("111");
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().setOutOfBusiness(true);
		c.getDunnBradstreetData().setDefaultCurrency(Currency.USD);
		c.getDunnBradstreetData().setMaximumCreditRecommendationCurrency(Currency.PLN);
		c.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.FAILED);
		c.setExperianData(new ExperianData("0100", "", ExperianLegalStatus.NONLIMITED));
		c.getExperianData().setRegistrationStatus(RegistrationStatus.ACTIVE);
		c.setAccountGroup(new AccountGroup("ted", "teddy"));
		c.setVerticalMarket("vertical");
		
		companies.add(c);
		accountsCsv.write(companies, testFile, true);
		
		String actual = FileHelper.getStringFromFile(testFile);
		
		System.out.println(accountsFileContentsFull);
		System.out.println(actual);
		
		assertEquals("Contents match", actual, accountsFileContentsFull);
	}

}
