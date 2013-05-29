package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.CompanyType;

public class TestCompanyType {

	@Test
	public void testGetCompanyTypeFromDescription() 
	{
		assertEquals("Customer", CompanyType.CUSTOMER, CompanyType.getCompanyTypeFromDescription("Customers"));
		assertEquals("Partners", CompanyType.PARTNER, CompanyType.getCompanyTypeFromDescription("Partners"));
		assertEquals("Suppliers", CompanyType.SUPPLIER, CompanyType.getCompanyTypeFromDescription("Suppliers"));
	}

	@Test
	public void testGetCompanyTypeFromId() 
	{
		assertEquals("Customer", CompanyType.CUSTOMER, CompanyType.getCompanyTypeFromId("C"));
		assertEquals("Partners", CompanyType.PARTNER, CompanyType.getCompanyTypeFromId("B"));
		assertEquals("Suppliers", CompanyType.SUPPLIER, CompanyType.getCompanyTypeFromId("A"));
	}
}
