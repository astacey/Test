package Test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import Test.TestRepositories.TestCompanyRepository;

import Application.ABWUpdateHandler;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DoubleDatedValue;

public class TestABWUpdateHandler {

	@Test
	public void testOBandADTPUpdatesWork() 
	{
		// U4BA repository has 1 company with values for OB and ADTP
		// ABW repo should have same company with different OB and ADTP data
		// Test should make sure that in the u4BA repo, the company ends up with both values of ADTP and OB 
		// original bug was when new value was less than old
		TestCompanyRepository u4baCompanyRepository = new TestCompanyRepository();
		Company existing = new Company("1", "Test", CompanyType.SUPPLIER);
		Calendar existingCal = Calendar.getInstance();
		existingCal.add(Calendar.MONTH, -2);
		existing.getAverageDaysToPaymentCollection().upsert(new DoubleDatedValue(existingCal.getTime(), 0.0));
		existing.getOpenBalanceCollection().upsert(new DoubleDatedValue(existingCal.getTime(), 200.0));
		CompanyCollection companies = new CompanyCollection();
		companies.add(existing);
		u4baCompanyRepository.setTestCompanies(companies);
		
		TestCompanyRepository abwCompanyRepository = new TestCompanyRepository();
		Company updated = new Company("1", "Test", CompanyType.SUPPLIER);
		existingCal = Calendar.getInstance();
		existingCal.add(Calendar.MONTH, -1);
		updated.getAverageDaysToPaymentCollection().upsert(new DoubleDatedValue(existingCal.getTime(), 37.0));
		updated.getOpenBalanceCollection().upsert(new DoubleDatedValue(existingCal.getTime(), 100.0));
		CompanyCollection updates = new CompanyCollection();
		updates.add(updated);
		abwCompanyRepository.setTestCompanies(updates);
		
		ABWUpdateHandler handler = new ABWUpdateHandler(u4baCompanyRepository, abwCompanyRepository);
		handler.getUpdates();
		
		assertEquals("Check there's 2 ADTP values", 2, u4baCompanyRepository.getCompanyById("1").getAverageDaysToPaymentCollection().size());
		assertEquals("Check there's 2 OB values", 2, u4baCompanyRepository.getCompanyById("1").getOpenBalanceCollection().size());
		
		// Now try adding the same values again
		// it shouldn't allow it
		updated = new Company("1", "Test", CompanyType.SUPPLIER);
		updated.getAverageDaysToPaymentCollection().upsert(new DoubleDatedValue(Calendar.getInstance().getTime(), 37.0));
		updated.getOpenBalanceCollection().upsert(new DoubleDatedValue(Calendar.getInstance().getTime(), 100.0));
		updates = new CompanyCollection();
		updates.add(updated);
		abwCompanyRepository.setTestCompanies(updates);
		handler.getUpdates();
		
		assertEquals("Check there's 2 ADTP values", 2, u4baCompanyRepository.getCompanyById("1").getAverageDaysToPaymentCollection().size());
		assertEquals("Check there's 2 OB values", 2, u4baCompanyRepository.getCompanyById("1").getOpenBalanceCollection().size());
		
	}

}
