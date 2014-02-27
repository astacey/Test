package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;

import Application.ABWXlsxCompanyRepository;
import Application.FileHelper;
import Domain.CompanyCollection;
import Domain.CompanyType;

public class TestABWXlsxCompanyRepository {

	@Test
	public void testFiscalOffset()
	{
		String inputFile = "client,acctype,apar_id,apar_name,apar_gr_id,group_name,terms_id,comp_reg_no,address,place,province,country_code,zip_code,telephone_1,V_market\nABW Client,Account Type,APAR ID,Account Name,Account Group,Account Group Name,Terms,Comp Reg No,Address,Town,County,Country Code,Postal Code,Phone,Vertical Market\nUKU4,Customer,1001,Norbert Detressangle Transport Services Ltd,EC,External customers,30,,Box TS11                                Mayflower House                         11 Caxton Hill,Hereford,,GB,SG13 7NE,01604-737100,Transport and Logistics";
		String sourceFile = AllTests.getTestFolder() + "CurrentBatch-Customer Supplier Listing.CSV";
		FileHelper.writeFile(sourceFile, inputFile);
		inputFile = "client,text apar_id,apar_name,amt,acctype,text period\nClient,APAR ID,Account Name,Total Spend,Account Type,Period\nUKU4,1001,Norbert Detressangle Transport Services Ltd,100,Customer,201301\nUKU4,1001,Norbert Detressangle Transport Services Ltd,200,Customer,201302\nUKU4,1001,Norbert Detressangle Transport Services Ltd,300,Customer,201312";
		sourceFile = AllTests.getTestFolder() + "CurrentBatch-Customer Supplier Total Spend.CSV";
		FileHelper.writeFile(sourceFile, inputFile);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		// First try with no offset
		ABWXlsxCompanyRepository repo = new ABWXlsxCompanyRepository(AllTests.getTestFolder(), "UKU4");
		CompanyCollection allCompanies = repo.getAllCompanies();
		assertEquals("Check 1 company", 1, allCompanies.size());
		assertEquals("Check 3 items in total spend collection", 3, allCompanies.get(0).getTotalSpendCollection().size());
		assertEquals("Check 1st has date of jan 2013", "20130101", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(0).getDate()));
		assertEquals("Check 2nd has date of feb 2013", "20130201", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(1).getDate()));	
		assertEquals("Check 3rd has date of dec 2013", "20131201", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(2).getDate()));
		
		// now repeat with offset of 3 ( fiscal year is april - march )
		repo = new ABWXlsxCompanyRepository(AllTests.getTestFolder(), "UKU4", 3);
		allCompanies = repo.getAllCompanies();
		assertEquals("Check 1 company", 1, allCompanies.size());
		assertEquals("Check 3 items in total spend collection", 3, allCompanies.get(0).getTotalSpendCollection().size());
		assertEquals("Check 1st has date of april 2013", "20130401", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(0).getDate()));
		assertEquals("Check 2nd has date of may 2013", "20130501", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(1).getDate()));	
		assertEquals("Check 3rd has date of march 2014", "20140301", formatter.format(allCompanies.get(0).getTotalSpendCollection().get(2).getDate()));
		
	}
	
	@Test
	public void testGetAllCompanies() 
	{
		ABWXlsxCompanyRepository repo = new ABWXlsxCompanyRepository(AllTests.getTestFolder() + "ABWUpdates/", "UKU4");
		// 2 companies, 2 eu should be ignored
		// 1001 ABDT = 31
		// and 1002 ABDT = 40
		
		CompanyCollection allCompanies = repo.getAllCompanies();
		
		assertEquals("2 companies imported", 2, allCompanies.size());
		assertEquals("company 1 name is", "Norbert Detressangle Transport Services Ltd", allCompanies.get(0).getName());
		assertEquals("company 2 name is", "Mitsui Sumitomo Insurance (Europe) Ltd", allCompanies.get(1).getName());

		assertEquals("company 1 type is", CompanyType.CUSTOMER, allCompanies.get(0).getType());

		assertEquals("company 2 vertical market is", "Financial Services", allCompanies.get(1).getVerticalMarket());
		
		assertEquals("company 2 account code is", "EC", allCompanies.get(1).getAccountGroup().getCode());
		assertEquals("company 2 account name is", "External customers", allCompanies.get(1).getAccountGroup().getName());
		
		assertEquals(30150, allCompanies.get(0).getOpenBalance().getValue(), 0.1);
		assertTrue("Company 2 has no open balance", 0.0== allCompanies.get(1).getOpenBalance().getValue());
		
		assertEquals(81707.72, allCompanies.get(0).getTotalSpendCollection().get(0).getValue(), 0.1);
		assertEquals(-21442.8, allCompanies.get(0).getTotalSpendCollection().get(1).getValue(), 0.1);
		
		assertEquals(15050.14, allCompanies.get(1).getTotalSpendCollection().get(2).getValue(), 0.1);
		
		assertEquals(31, allCompanies.get(0).getAverageDaysToPaymentCollection().get(0).getValue(), 0.1);
		assertEquals(40, allCompanies.get(1).getAverageDaysToPayment().getValue(), 0.1);
	}

}
