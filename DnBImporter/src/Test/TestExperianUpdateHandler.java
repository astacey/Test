package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import Application.ExperianUpdateHandler;
import Application.ImporterSettings;
import Domain.*;
import Test.TestRepositories.TestCompanyRepository;
import Test.TestRepositories.TestExperianRepository;

public class TestExperianUpdateHandler 
{
	@Test
	public void test() 
	{
		TestExperianRepository experianRepo = new TestExperianRepository();
		ArrayList<ExperianData> getUpdatesResult = new ArrayList<ExperianData>();
		getUpdatesResult.add(new ExperianData("Test", "Test", ExperianLegalStatus.LIMITED));
		getUpdatesResult.get(0).getDaysBeyondTerms().add(new IntegerDatedValue(new Date(), 50));
		getUpdatesResult.get(0).getDaysBeyondTermsIndustryAverage().add(new IntegerDatedValue(new Date(), 40));
		getUpdatesResult.get(0).getDelphiScores().add(new IntegerDatedValue(new Date(), 90));
		getUpdatesResult.get(0).getDelphiScoresIndustryAverage().add(new IntegerDatedValue(new Date(), 77));
		experianRepo.setGetUpdatesResult(getUpdatesResult);
		
		TestCompanyRepository companyRepo = new TestCompanyRepository();
		CompanyCollection companies = new CompanyCollection();
		companies.add(new Company("100", "Test Name", CompanyType.CUSTOMER));
		companies.get(0).setExperianData(new ExperianData("Test", "Whatever", ExperianLegalStatus.LIMITED));
		companyRepo.setTestCompanies(companies);
		
		ImporterSettings settings = new ImporterSettings();
		
		ExperianUpdateHandler handler = new ExperianUpdateHandler(companyRepo, experianRepo, settings);
		handler.getUpdates();
		Company results = companyRepo.getCompanyById("100");
		
		assertTrue("Delphi = 90", 90==results.getExperianData().getDelphiScores().getCurrent().getValue());
		assertTrue("Delphi Industry Average = 77", 77==results.getExperianData().getDelphiScoresIndustryAverage().getCurrent().getValue());
		assertTrue("DBT = 50", 50==results.getExperianData().getDaysBeyondTerms().getCurrent().getValue());
		assertTrue("DBT Industry = 40", 40==results.getExperianData().getDaysBeyondTermsIndustryAverage().getCurrent().getValue());
	}

}
