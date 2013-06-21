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
				TestExperianDataMapper.class })

public class AllTests {}
