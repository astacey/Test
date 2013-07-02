package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.DnBCSVCompanyRepository;
import Application.FileHelper;
import Domain.CompanyCollection;
import Domain.CompanyType;

public class TestDnBCSVCompanyRepository 
{
	String folderLocation = AllTests.getTestFolder();
	@Test
	public void testGetAllCompanies() 
	{
		String inputFile = "ID,Customer ID,Business Name 1,Street Address 1,Input_CITY NAME,State / Province Name or Abbreviation,Country Code or Name,Postal Code,Telephone Number,Local Registration Number,Clean Street,QA_DUNS,Conf Code,match Grade,Duplicate,Match_Description,DUNS,COMPANY_NAME,TRADING_STYLE_NAME_1,STREET_1,STREET_2,STREET_3,STREET_4,STREET_5,TOWN,COUNTY,POST_CODE,COUNTRY,TELEPHONE,FAX,PRIMARY_SIC,SECONDARY_SIC,FAILURE_1_100_SCORE,DB_FINANCIAL_STRENGTH,DB_RISK_INDICATOR,DB_CREDIT_LIMIT,BUSINESS_NUMBER,SALES,NET_WORTH,NET_PROFIT,NET_LOSS,STATEMENT_DATE,EMPLOYEES,START_DATE,PAYDEX_SCORE,OOB\n20,1024,Rio Tinto London Limited,Accounts Payable Team                   Rio Tinto Shared Services               2 Eastbourne Terrace,London,,GB,W2 6LG,0117 9276407,,Accounts Payable Team  Rio Tinto Shared Services  2 Eastbourne Terrace,210240610,9,AZAAZZFAFBZ, ,\"01a Name, Address & PostCode\",210240610,RIO TINTO LONDON LTD,,2 Eastbourne Terrace,,,,,LONDON,,W2 6LG,GB,020-7781-2000,2077811856,6711,1211,96,5A,1,6667000,460473,308663000,65950000,437000,,20111231,419,1948,72,\n21,1025,EXIE AS,Postboks 4244,Nydalen,0401 OSLO,NO,,,1111,Postboks 4244,730518230,7,AZZFZAZ, ,10 Matched to Exact Name (Non-Corp),,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
		String sourceFile = folderLocation + "ImportDnBSource.csv";
		FileHelper.writeFile(sourceFile, inputFile);
		
		DnBCSVCompanyRepository compRepo = new DnBCSVCompanyRepository(sourceFile);
		
		CompanyCollection comps = compRepo.getAllCompanies();
		
		assertEquals("Two companies should be read in", 2, comps.size());
		assertEquals("Company one is Unknown", CompanyType.UNKNOWN, comps.get(0).getType());
		assertEquals("Company Two is Unknown", CompanyType.UNKNOWN, comps.get(1).getType());
		assertEquals("Company one is Rio Tinto London Limited", "Rio Tinto London Limited", comps.get(0).getName());
		assertEquals("Company two id is correct", "1025", comps.get(1).getId());
		assertEquals("Company two reg no is correct", "1111", comps.get(1).getCompanyRegistrationNumber());
		assertEquals("Company one duns is correct", 210240610, comps.get(0).getDunnBradstreetData().getDunsNumber());
		assertEquals("Company two duns is mising", false, comps.get(1).hasDunnBradstreetData());
		
		
	}

}
