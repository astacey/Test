package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Company;
import Domain.CompanyType;

public class TestCompany {

	@Test
	public void testUploadCompanyMapping() 
	{
		Company c = new Company("1", "test Company", CompanyType.UNKNOWN);
		
		//DnB
		c.uploadCompanyMapping("200", "dnb");
		assertEquals("Duns is 200", 200, c.getDunnBradstreetData().getDunsNumber());
		//Experian
		c.uploadCompanyMapping("0909", "experian");
		assertEquals("Experian Ref is 0909", "0909",c.getExperianData().getId());
	}
}
