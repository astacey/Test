package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.ABWXlsxCompanyRepository;
import Domain.CompanyCollection;
import Domain.CompanyType;

public class TestABWXlsxCompanyRepository {

	@Test
	public void testGetAllCompanies() 
	{
		ABWXlsxCompanyRepository repo = new ABWXlsxCompanyRepository("/home/astacey/SupplierDataTest/ABWUpdates/");
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
		assertEquals("Company 2 has no open balance", null, allCompanies.get(1).getOpenBalance());
		
		assertEquals(81707.72, allCompanies.get(0).getTotalSpendCollection().get(0).getValue(), 0.1);
		assertEquals(-21442.8, allCompanies.get(0).getTotalSpendCollection().get(1).getValue(), 0.1);
		
		assertEquals(15050.14, allCompanies.get(1).getTotalSpendCollection().get(2).getValue(), 0.1);
		
		assertEquals(31, allCompanies.get(0).getAverageDaysToPaymentCollection().get(0).getValue(), 0.1);
		assertEquals(40, allCompanies.get(1).getAverageDaysToPayment().getValue(), 0.1);
	}

}
