package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.Company;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.RegistrationStatus;

public class TestCompany {

	@Test
	public void testUploadCompanyMapping() 
	{
		Company c = new Company("1", "test Company", CompanyType.UNKNOWN);
		
		//DnB
		c.uploadCompanyMapping("200", "dnb", "AAA", "8");
		assertEquals("Duns is 200", 200, c.getDunnBradstreetData().getDunsNumber());
		assertEquals("Match Grade is AAA", "AAA", c.getDunnBradstreetData().getMatchGrade());
		assertEquals("Match Confidence Code is 8", "8", c.getDunnBradstreetData().getMatchConfidenceCode());
		//Experian
		c.uploadCompanyMapping("0909", "experian", "", "");
		assertEquals("Experian Ref is 0909", "0909",c.getExperianData().getId());
	}
	
	@Test
	public void testUploadCompanyMappingPreExistingDunsMapping() 
	{
		Company c = new Company("1", "test Company", CompanyType.UNKNOWN);
		c.setDunnBradstreetData(new DnBData(99));
		
		//DnB
		c.uploadCompanyMapping("200", "dnb", "AAA", "8");
		assertEquals("Duns is 200", 200, c.getDunnBradstreetData().getDunsNumber());
		assertEquals("Status is remapped", RegistrationStatus.REMAPPED, c.getDunnBradstreetData().getRegistrationDetails().getStatus());
		assertEquals("Match Grade is AAA", "AAA", c.getDunnBradstreetData().getMatchGrade());
		assertEquals("Match Confidence Code is 8", "8", c.getDunnBradstreetData().getMatchConfidenceCode());
	}

	@Test
	public void testUploadCompanyMappingUnmapDunsMapping() 
	{
		Company c = new Company("1", "test Company", CompanyType.UNKNOWN);
		c.setDunnBradstreetData(new DnBData(99));
		
		//DnB
		c.uploadCompanyMapping("", "dnb", "", "");
		assertTrue("Duns is 0 ( default )", c.getDunnBradstreetData()==null);
	}
	
	@Test
	public void testUploadCompanyMappingExistingDunsMappingUpdateGradeConf() 
	{
		Company c = new Company("1", "test Company", CompanyType.UNKNOWN);
		c.setDunnBradstreetData(new DnBData(99));
		c.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.ACTIVE);
		c.getDunnBradstreetData().setMatchConfidenceCode("conf");
		c.getDunnBradstreetData().setMatchGrade("1");
		
		//DnB
		c.uploadCompanyMapping("99", "dnb", "ABBA", "7");
		assertEquals("Duns is still 99", 99, c.getDunnBradstreetData().getDunsNumber());
		assertEquals("Status is still active", RegistrationStatus.ACTIVE, c.getDunnBradstreetData().getRegistrationDetails().getStatus());
		assertEquals("Match Grade is ABBA", "ABBA", c.getDunnBradstreetData().getMatchGrade());
		assertEquals("Match Confidence Code is 7", "7", c.getDunnBradstreetData().getMatchConfidenceCode());
	}
}
