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
				TestUpdateHandler.class, TestXmlHelper.class })

public class AllTests {}
