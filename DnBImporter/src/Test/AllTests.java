package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestABWCSVCompanyRepository.class, 
				TestSupplierAppCSVCompanyRepository.class, TestCompanyType.class, 
				TestDnBData.class, TestDnBDataMapper.class, TestDnBDataUpdateMapper.class, 
				TestDnBRating.class, TestDnBRegistrationCollection.class, TestImporterArgs.class, 
				TestInitialUploadHandler.class, TestImporterSettings.class,
				TestDnBUpdateHandler.class, TestXmlHelper.class, TestDatedValueCollection.class, TestDatedValue.class,
				TestSupplierAppCSVFactDataFull.class,
				TestExperianDataMapper.class, TestCompany.class, TestBulkMappingUpload.class,
				TestExperianRegistrationHandler.class })

public class AllTests {
	
	public static String getTestFolder()
	{
		return "/home/astacey/SupplierDataTest/";
	}
	
	public static String getAccountsFileBaseString()
	{
		return "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS;ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET;EXPERIAN_NO;EXPERIAN_LEGAL_STATUS;EXPERIAN_REGISTRATION_STATUS\r\n1;All;1;;;;;;;;;;\r\nA;Suppliers;1;;;;;;;;;;\r\nB;Partners;1;;;;;;;;;;\r\nC;Customers;1;;;;;;;;;;\r\n";
	}
}
