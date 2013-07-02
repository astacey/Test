package Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;

import Application.FileHelper;
import Application.SupplierAppCSVFactDataFull;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;

public class TestSupplierAppCSVFactDataFull 
{
	String folderLocation = AllTests.getTestFolder();
	@Test
	public void testReadRecords() 
	{
		String fullFactInput = "VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID)\n1005.0;2013-04-01;1;OB\n1;2013-01-01;1;Risk\n99;2013-01-01;1;FR\n50;2013-01-01;1;FRP\n200;2013-01-01;1;P\n75;2013-01-01;1;PN\n1000;2013-01-01;1;S\n5;2013-01-01;1;ADTP\n8;2013-03-01;1;ADTP\n500;2013-05-01;1;OB\n";
		FileHelper.writeFile(folderLocation + "fact_data_full.csv", fullFactInput);
		SupplierAppCSVFactDataFull csv = new SupplierAppCSVFactDataFull();
		
		CompanyCollection companies = new CompanyCollection();
		csv.read(companies, folderLocation + "fact_data_full.csv");
		
		assertEquals("no companies read ( because collection is empty", 0, companies.size());
		
		companies.add(new Company("1", "Doesn't matter", CompanyType.CUSTOMER));
		companies.get(0).setDunnBradstreetData(new DnBData(100));
		companies.add(new Company("2", "Doesn't matter", CompanyType.CUSTOMER));
		companies.get(1).setDunnBradstreetData(new DnBData(200));	

		csv.read(companies, folderLocation + "fact_data_full.csv");
		
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
	}

	@Test
	public void testWriteRecords() 
	{
		
	}

}
