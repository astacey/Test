package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import Application.FileHelper;
import Application.SupplierAppCSVFactDataFull;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.DoubleDatedValue;
import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IntegerDatedValue;

public class TestSupplierAppCSVFactDataFull 
{
	private final String factFileFull = AllTests.getTestFolder() + "fact_data_full.csv";

	@Test
	public void testReadRecords() 
	{
		String fullFactInput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\n1005.0;2013-04-01;1;OB\n1;2013-01-01;1;Risk\n99;2013-01-01;1;FR\n50;2013-01-01;1;FRP\n200;2013-01-01;1;P\n75;2013-01-01;1;PN\n1000.0;2013-01-01;1;S\n5.0;2013-01-01;1;ADTP\n8.0;2013-03-01;1;ADTP\n500.0;2013-05-01;1;OB\n100;2013-06-01;Experian;DELPHI\n200;2013-06-01;Experian;DELPHI-IND\n300;2013-06-01;Experian;DBT\n400;2013-06-01;Experian;DBT-IND\n";
		FileHelper.writeFile(factFileFull, fullFactInput);
		SupplierAppCSVFactDataFull csv = new SupplierAppCSVFactDataFull();
		
		CompanyCollection companies = new CompanyCollection();
		csv.read(companies, factFileFull);
		
		assertEquals("no companies read ( because collection is empty", 0, companies.size());
		
		companies = getTestCompanies();
		csv.read(companies, factFileFull);
		
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getAverageDaysToPaymentCollection().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getTotalSpendCollection().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getOpenBalanceCollection().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getDunnBradstreetData().getDbratingHistory().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getDunnBradstreetData().getPaydexScoreHistory().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getDunnBradstreetData().getPaydexNormHistory().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getDunnBradstreetData().getFailureRiskScoreHistory().size());
		assertEquals("Company 2 - no facts should be read", 0, companies.get(1).getDunnBradstreetData().getFailureRiskPercentileHistory().size());

		assertTrue("Company 1 - Risk is 1", 1==companies.get(0).getDunnBradstreetData().getCurrentRating().getRiskIndicator());
		assertTrue("Company 1 - Failure Risk is 99", 99==companies.get(0).getDunnBradstreetData().getFailureRiskScoreHistory().getCurrent().getValue());
		assertTrue("Company 1 - Failure Risk Percentile is 50", 50==companies.get(0).getDunnBradstreetData().getFailureRiskPercentileHistory().getCurrent().getValue());
		assertTrue("Company 1 - Paydex is 200", 200==companies.get(0).getDunnBradstreetData().getPaydexScoreHistory().getCurrent().getValue());
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		assertTrue("Company 1 - Paydex Date is 2013-01-01", "2013-01-01".equalsIgnoreCase(f.format(companies.get(0).getDunnBradstreetData().getPaydexScoreHistory().getCurrent().getDate())));
		assertTrue("Company 1 - Paydex Norm is 75", 75==companies.get(0).getDunnBradstreetData().getPaydexNormHistory().getCurrent().getValue());
		assertTrue("Company 1 - Spend is 1000", 1000==companies.get(0).getTotalSpendCollection().getCurrent().getValue());
		assertEquals(8, (double)companies.get(0).getAverageDaysToPayment().getValue(), 0.1);
		assertTrue("Company 1 - ADTP length is 2", 2==companies.get(0).getAverageDaysToPaymentCollection().size());
		assertTrue("Company 1 - Open Balance is 500", 500==companies.get(0).getOpenBalance().getValue());
		
		assertTrue("Company 3 - Delphi should be 100", 100==companies.getCompanyFromId("Experian").getExperianData().getDelphiScores().getCurrent().getValue());
		assertTrue("Company 3 - Delphi Industry Average should be 200", 200==companies.getCompanyFromId("Experian").getExperianData().getDelphiScoresIndustryAverage().getCurrent().getValue());
		assertTrue("Company 3 - DBT should be 300", 300==companies.getCompanyFromId("Experian").getExperianData().getDaysBeyondTerms().getCurrent().getValue());
		assertTrue("Company 3 - DBT Industry Average should be 400", 400==companies.getCompanyFromId("Experian").getExperianData().getDaysBeyondTermsIndustryAverage().getCurrent().getValue());		
	}

	@Test
	public void testWriteRecords() 
	{
		String fullFactInput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\r\n";
		String fullFactOutput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\r\n5.0;2013-01-01;1;ADTP\r\n8.0;2013-03-01;1;ADTP\r\n1005.0;2013-04-01;1;OB\r\n500.0;2013-05-01;1;OB\r\n1000.0;2013-01-01;1;S\r\n1;2013-01-01;1;Risk\r\n99;2013-01-01;1;FR\r\n50;2013-01-01;1;FRP\r\n200;2013-01-01;1;P\r\n75;2013-01-01;1;PN\r\n100;2013-06-01;Experian;DELPHI\r\n200;2013-06-01;Experian;DELPHI-IND\r\n300;2013-06-01;Experian;DBT\r\n400;2013-06-01;Experian;DBT-IND\r\n";
		FileHelper.writeFile(factFileFull, fullFactInput);
		
		SupplierAppCSVFactDataFull csv = new SupplierAppCSVFactDataFull();
		CompanyCollection companies = getTestCompanies();
		
		addTestFacts(companies);
		
		csv.write(companies, factFileFull, false);
		
		String actual = FileHelper.getStringFromFile(factFileFull);
		
		System.out.println(fullFactOutput);
		System.out.println(actual);
		
		assertTrue("file contents do not match expected", fullFactOutput.equalsIgnoreCase(actual));
	}
	
	private CompanyCollection getTestCompanies()
	{
		CompanyCollection companies = new CompanyCollection();
		companies.add(new Company("1", "Doesn't matter", CompanyType.CUSTOMER));
		companies.get(0).setDunnBradstreetData(new DnBData(100));
		companies.add(new Company("2", "Doesn't matter", CompanyType.CUSTOMER));
		companies.get(1).setDunnBradstreetData(new DnBData(200));	
		companies.add(new Company("Experian", "Doesn't matter", CompanyType.CUSTOMER));
		companies.get(2).setExperianData(new ExperianData("Exp1", "boo", ExperianLegalStatus.LIMITED));
		return companies;
	}
	
	private void addTestFacts(CompanyCollection companies)
	{
		companies.getCompanyFromId("1").getOpenBalanceCollection().upsert(new DoubleDatedValue(getDate(2013,4,1), 1005.0));
		companies.getCompanyFromId("1").getOpenBalanceCollection().upsert(new DoubleDatedValue(getDate(2013,5,1), 500.0));
		companies.getCompanyFromId("1").getTotalSpendCollection().upsert(new DoubleDatedValue(getDate(2013,1,1), 1000.0));
		companies.getCompanyFromId("1").getAverageDaysToPaymentCollection().upsert(new DoubleDatedValue(getDate(2013,1,1), 5.0));
		companies.getCompanyFromId("1").getAverageDaysToPaymentCollection().upsert(new DoubleDatedValue(getDate(2013,3,1), 8.0));
		
		companies.getCompanyFromId("1").getDunnBradstreetData().getDbratingHistory().add(new DnBRating("1", getDate(2013,1,1)));
		companies.getCompanyFromId("1").getDunnBradstreetData().getFailureRiskScoreHistory().add(new IntegerDatedValue(getDate(2013,1,1), 99));
		companies.getCompanyFromId("1").getDunnBradstreetData().getFailureRiskPercentileHistory().add(new IntegerDatedValue(getDate(2013,1,1), 50));
		companies.getCompanyFromId("1").getDunnBradstreetData().getPaydexScoreHistory().add(new IntegerDatedValue(getDate(2013,1,1), 200));
		companies.getCompanyFromId("1").getDunnBradstreetData().getPaydexNormHistory().add(new IntegerDatedValue(getDate(2013,1,1), 75));
		
		companies.getCompanyFromId("Experian").getExperianData().getDelphiScores().upsert(new IntegerDatedValue(getDate(2013,6,1), 100));
		companies.getCompanyFromId("Experian").getExperianData().getDelphiScoresIndustryAverage().upsert(new IntegerDatedValue(getDate(2013,6,1), 200));
		companies.getCompanyFromId("Experian").getExperianData().getDaysBeyondTerms().upsert(new IntegerDatedValue(getDate(2013,6,1), 300));
		companies.getCompanyFromId("Experian").getExperianData().getDaysBeyondTermsIndustryAverage().upsert(new IntegerDatedValue(getDate(2013,6,1), 400));
	}

	private Date getDate(int year, int month, int day)
	{
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, day); // month is 0 based in here
		return cal.getTime();
	}
}
