package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Application.FileHelper;
import Application.SupplierAppCSVAccounts;
import Domain.*;

public class TestSupplierAppCSVAccounts {

	String testFile = AllTests.getTestFolder() + "accounts.csv";
	private String baseAccountsFileContentsFull = "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS;"
			+"ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET;EXPERIAN_NO;EXPERIAN_LEGAL_STATUS;EXPERIAN_REGISTRATION_STATUS;DNB_DEFAULT_CURRENCY_CODE;DNB_CREDIT_RECOMMENDATION_CURRENCY_CODE;DNB_RATING;DNB_ADDRESS_LINE_1;DNB_ADDRESS_LINE_2;DNB_ADDRESS_LINE_3;DNB_ADDRESS_LINE_4;DNB_ADDRESS_TOWN;DNB_ADDRESS_COUNTY;DNB_ADDRESS_COUNTRY_CODE;DNB_ADDRESS_COUNTRY_DESCRIPTION;DNB_ADDRESS_POST_CODE;DNB_NAME;DNB_MATCH_GRADE;DNB_CONFIDENCE_CODE;DNB_ORIGINAL_MATCHED_DUNS_NO\r\n1;All;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nA;Suppliers;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nB;Partners;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nC;Customers;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n";
	private String accountsFileContentsFull = baseAccountsFileContentsFull
			+"Cted;teddy;C;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n"
			+"1;Test & Company;Cted;1;111;100;Inactive;FAILED;ted;teddy;vertical;0100;Non Limited;ACTIVE;USD;PLN;;;;;;;;;;;;;;\r\n";
	
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
	public void testReadRecordsAddress() 
	{
		String sourceFile = baseAccountsFileContentsFull
				+"1;Test & Company;C;1;111;100;Inactive;FAILED;ted;teddy;vertical;0100;Non Limited;ACTIVE;USD;PLN;;AddressRead1;AddressRead2;AddressRead3;AddressRead4;town;county;GB;United Kingdon;POSTCODE;;;\r\n";
		FileHelper.writeFile(testFile, sourceFile);
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		accountsCsv.read(companies, testFile);
		
		assertEquals("One company read", 1, companies.size());
		Company one = companies.get(0);
		assertEquals("Gen ID equals", "1", one.getId());
		assertEquals("Name equals", "Test & Company", one.getName());
		Address address = one.getDunnBradstreetData().getMainAddress();
		assertEquals("Address1", "AddressRead1", address.getAddressLine1());
		assertEquals("Address1", "AddressRead2", address.getAddressLine2());
		assertEquals("Address1", "AddressRead3", address.getAddressLine3());
		assertEquals("Address1", "AddressRead4", address.getAddressLine4());
		assertEquals("Town", "town", address.getTown());
		assertEquals("County", "county", address.getCounty());
		assertEquals("Country", Country.GB, address.getCountry());
		assertEquals("Post Code", "POSTCODE", address.getPostCode());
		
	}
	
	@Test
	public void testReadRecordsRatingNameAndMatching() 
	{
		String sourceFile = baseAccountsFileContentsFull
				+"1;Test & Company;C;1;111;100;Inactive;FAILED;ted;teddy;vertical;0100;Non Limited;ACTIVE;USD;PLN;A1;;;;;;;;;;D & B Enw;AAAAAA;8\r\n";
		FileHelper.writeFile(testFile, sourceFile);
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		accountsCsv.read(companies, testFile);
		
		assertEquals("One company read", 1, companies.size());
		Company one = companies.get(0);
		assertEquals("Gen ID equals", "1", one.getId());
		assertEquals("D&B Name", "D & B Enw", one.getDunnBradstreetData().getName());
		assertEquals("Match Grade", "AAAAAA", one.getDunnBradstreetData().getMatchGrade());
		assertEquals("Match Confidence Code", "8", one.getDunnBradstreetData().getMatchConfidenceCode());
		assertEquals("D&B Rating is A1", "A1", one.getDunnBradstreetData().getCurrentRating().getRating());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		assertEquals("D&B Rating date is today", formatter.format(new Date()), formatter.format(one.getDunnBradstreetData().getCurrentRating().getDate()));
	}
	
	@Test
	public void testReadRecordsOriginalDUNS() 
	{
		String sourceFile = baseAccountsFileContentsFull
				+"1;Test & Company;C;1;111;100;Inactive;FAILED;ted;teddy;vertical;0100;Non Limited;ACTIVE;USD;PLN;;;;;;;;;;;D & B Enw;AAAAAA;8;200200\r\n";
		FileHelper.writeFile(testFile, sourceFile);
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		accountsCsv.read(companies, testFile);
		
		assertEquals("One company read", 1, companies.size());
		Company one = companies.get(0);
		assertEquals("Original DUNS equals", 200200, one.getDunnBradstreetData().getRegistrationDetails().getOriginalMatchedDunsNo());
		
	}
	
	@Test
	public void testReadRecordsNoAccountGroups() 
	{
		String sourceFile = baseAccountsFileContentsFull
				+"1;Test & Company;C;1;111;100;Inactive;FAILED;;;vertical;0100;Non Limited;ACTIVE;USD;PLN;;;;;;;;;;;D & B Enw;AAAAAA;8;200200\r\n";
		FileHelper.writeFile(testFile, sourceFile);
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		accountsCsv.read(companies, testFile);
		
		assertEquals("One company read", 1, companies.size());
		Company one = companies.get(0);
		assertEquals("Company Type is customer", CompanyType.CUSTOMER, one.getType());
		
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
	
	@Test
	public void testWriteRecordsAddress() 
	{
		FileHelper.writeFile(testFile, AllTests.getAccountsFileBaseString());
		String expected = baseAccountsFileContentsFull
				+"1;Address test;A;1;111;100;Active;;;;;;;;;;"
				+";Address 1;Address 2;Address 3;Address 4;town;county;AD;Andorra;POSTCODE;;;;\r\n";
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Address test", CompanyType.SUPPLIER);
		c.setCompanyRegistrationNumber("111");
		c.setDunnBradstreetData(new DnBData(100));
		
		Address address = new Address();
		address.getAddressLines().add("Address 1");
		address.getAddressLines().add("Address 2");
		address.getAddressLines().add("Address 3");
		address.getAddressLines().add("Address 4");
		address.setTown("town");
		address.setCounty("county");
		address.setCountry(Country.AD);
		address.setPostCode("POSTCODE");
		c.getDunnBradstreetData().setMainAddress(address);
		companies.add(c);
		accountsCsv.write(companies, testFile, true);
		
		String actual = FileHelper.getStringFromFile(testFile);
		
		System.out.println(expected);
		System.out.println(actual);
		
		assertEquals("Contents match", actual, expected);
	}

	@Test
	public void testWriteRecordsRatingNameAndMatching() 
	{
		FileHelper.writeFile(testFile, AllTests.getAccountsFileBaseString());
		String expected = baseAccountsFileContentsFull
				+"1;Address test;A;1;111;100;Active;;;;;;;;;;A1"
				+";;;;;;;;;;D&B Name;AAAZZZAAA;9;\r\n";
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Address test", CompanyType.SUPPLIER);
		c.setCompanyRegistrationNumber("111");
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().getDbratingHistory().add(new DnBRating("A1", new Date()));
		c.getDunnBradstreetData().setName("D&B Name");
		c.getDunnBradstreetData().setMatchGrade("AAAZZZAAA");
		c.getDunnBradstreetData().setMatchConfidenceCode("9");
		companies.add(c);
		accountsCsv.write(companies, testFile, true);
		
		String actual = FileHelper.getStringFromFile(testFile);
		
		System.out.println(expected);
		System.out.println(actual);
		
		assertEquals("Contents match", actual, expected);
	}

	@Test
	public void testWriteRecordsOriginalDUNS() 
	{
		FileHelper.writeFile(testFile, AllTests.getAccountsFileBaseString());
		String expected = baseAccountsFileContentsFull
				+"1;Address test;A;1;111;100;Active;;;;;;;;;;"
				+";;;;;;;;;;;;;300\r\n";
		
		SupplierAppCSVAccounts accountsCsv = new SupplierAppCSVAccounts();
		CompanyCollection companies = new CompanyCollection();
		Company c = new Company("1", "Address test", CompanyType.SUPPLIER);
		c.setCompanyRegistrationNumber("111");
		c.setDunnBradstreetData(new DnBData(100));
		c.getDunnBradstreetData().getRegistrationDetails().setOriginalMatchedDunsNo(300);
		companies.add(c);
		accountsCsv.write(companies, testFile, true);
		
		String actual = FileHelper.getStringFromFile(testFile);
		
		System.out.println(expected);
		System.out.println(actual);
		
		assertEquals("Contents match", actual, expected);
	}
}
