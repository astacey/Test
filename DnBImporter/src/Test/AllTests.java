package Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestABWCSVCompanyRepository.class, 
				TestABWXlsxCompanyRepository.class,
				TestBulkMappingUpload.class, 
				TestCompany.class, 
				TestCompanyType.class,
				TestDatedValue.class, 
				TestDatedValueCollection.class, 
				TestDBFullReportMapper.class,
				TestDnBCSVCompanyRepository.class, 
				TestDnBData.class, 
				TestDnBDataMapper.class, 
				TestDnBDataUpdateMapper.class, 
				TestDnBLookupMapper.class,
				TestDnBRating.class, 
				TestDnBRegistrationCollection.class, 
				TestDnBUnRegistrationHandler.class,
				TestDnBUpdateHandler.class,
				TestExperianDataMapper.class, 
				TestExperianUpdateHandler.class, 
				TestExperianRegistrationHandler.class,
				TestImporterArgs.class, 
				TestImporterSettings.class,  
				TestInitialUploadHandler.class,
				TestRegistrationHandler.class,
				TestSupplierAppCSVAccounts.class,
				TestSupplierAppCSVCompanyRepository.class, 
				TestSupplierAppCSVFactDataFull.class, 
				TestXmlHelper.class
				 })

public class AllTests {
	
	public static String getTestFolder()
	{
		return "/home/astacey/SupplierDataTest/";
	}
	
	public static String getAccountsFileBaseString()
	{
		return "GEN_ID;NAME;PARENT (PARENT_GEN_ID);AGR_NO;CH_NO;DUNS_NO;STATUS;DnB_STATUS;ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET;EXPERIAN_NO;EXPERIAN_LEGAL_STATUS;EXPERIAN_REGISTRATION_STATUS;DNB_DEFAULT_CURRENCY_CODE;DNB_CREDIT_RECOMMENDATION_CURRENCY_CODE;DNB_RATING;DNB_ADDRESS_LINE_1;DNB_ADDRESS_LINE_2;DNB_ADDRESS_LINE_3;DNB_ADDRESS_LINE_4;DNB_ADDRESS_TOWN;DNB_ADDRESS_COUNTY;DNB_ADDRESS_COUNTRY_CODE;DNB_ADDRESS_COUNTRY_DESCRIPTION;DNB_ADDRESS_POST_CODE;DNB_NAME;DNB_MATCH_GRADE;DNB_CONFIDENCE_CODE;DNB_ORIGINAL_MATCHED_DUNS_NO\r\n1;All;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nA;Suppliers;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nB;Partners;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\nC;Customers;1;;;;;;;;;;;;;;;;;;;;;;;;;;;\r\n";
	}
}
