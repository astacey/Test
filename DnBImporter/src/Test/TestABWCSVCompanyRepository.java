package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.FileHelper;
import Application.UnusedSources.ABWCSVCompanyRepository;
import Domain.CompanyCollection;
import Domain.CompanyType;

public class TestABWCSVCompanyRepository 
{
	String folderLocation = AllTests.getTestFolder();
	@Test
	public void testGetAllCompanies() 
	{
		String inputFile = "apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype\n500927,1st Aid Fire,Companies House                         14 Mansfield Road,Gosport,Hampshire,GB,PO13 9SY       ,0870 2245626/27,7586711,Supplier\nS2460,Aareon (NCPC Ltd),\"Building 500,                           Abbey Park                              Stareton\",Kenilworth,,GB,CV8 2LY        ,,3990481,Customer";
		String sourceFile = folderLocation + "ImportSource.csv";
		FileHelper.writeFile(sourceFile, inputFile);
		
		ABWCSVCompanyRepository compRepo = new ABWCSVCompanyRepository(sourceFile);
		
		CompanyCollection comps = compRepo.getAllCompanies();
		
		assertEquals("Two companies should be read in", 2, comps.size());
		assertEquals("Company one is Supplier", CompanyType.SUPPLIER, comps.get(0).getType());
		assertEquals("Company Two is Customer", CompanyType.CUSTOMER, comps.get(1).getType());
		assertEquals("Company one is 1st Aid Fire", "1st Aid Fire", comps.get(0).getName());
		assertEquals("Company two id is correct", "S2460", comps.get(1).getId());
		assertEquals("Company two reg no is correct", "3990481", comps.get(1).getCompanyRegistrationNumber());
		
	}

}
