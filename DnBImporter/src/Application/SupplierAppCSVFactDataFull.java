package Application;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.DnBRating;
import Domain.DoubleDatedValue;
import Domain.DoubleDatedValueCollection;
import Domain.IntegerDatedValue;
import Domain.IntegerDatedValueCollection;
import Domain.Money;
import Domain.MoneyDatedValue;
import Domain.MoneyDatedValueCollection;

public class SupplierAppCSVFactDataFull extends SupplierAppCSVFile
{
	private final static String[] FACT_FILE_HEADERS = new String[] {"VALUE", "TIME", "ACCOUNTS (GEN_ID)", "DATASET (GEN_ID)" };
	
	@Override
	protected void readRecords(CompanyCollection companies, CsvReader csvFactsReader) throws IOException
	{
		if(csvFactsReader.readHeaders() == true)
		{
			while(csvFactsReader.readRecord()==true)
			{	
				//{ VALUE;TIME;ACCOUNTS (GEN_ID);DATASET (GEN_ID) };
				// TODO : constants for each header ?
				String val = csvFactsReader.get("VALUE");
				String time = csvFactsReader.get("TIME");
				String companyId = csvFactsReader.get("ACCOUNTS (GEN_ID)");
				String dataset = csvFactsReader.get("DATASET (GEN_ID)");
				try
				{
					Date date=getDateFromString(time);
					Company c = companies.getCompanyFromId(companyId);
					if(c!=null)
					{
						if(dataset.equalsIgnoreCase(DATASET_TOTAL_SPEND_CODE))
							c.getTotalSpendCollection().add(new DoubleDatedValue(date, Double.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_OPEN_BALANCE_CODE))
							c.getOpenBalanceCollection().add(new DoubleDatedValue(date, Double.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_AVERAGE_DAYS_TO_PAYMENT_CODE))
							c.getAverageDaysToPaymentCollection().add(new DoubleDatedValue(date, Double.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_RISK_CODE)
									&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
								// TODO: Financial Strength portion of DnBRating i not currently read. This is fine for now, but will need work if we ever start storing/using it
								//TODO: This assumes we'd never add a duplicate, which is ok for now ( I think )
								c.getDunnBradstreetData().getDbratingHistory().add(new DnBRating(val, date));
						else if(dataset.equalsIgnoreCase(DATASET_FAILURE_RISK_CODE)
									&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
								c.getDunnBradstreetData().getFailureRiskScoreHistory().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_FAILURE_RISK_PERCENTILE_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getFailureRiskPercentileHistory().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_PAYDEX_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getPaydexScoreHistory().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_PAYDEX_NORM_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getPaydexNormHistory().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_CREDIT_DELINQUENCY_SCORE_PERCENTILE_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getCreditDelinquencyNationalPercentileHistory().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_CASH_AND_LIQUID_ASSETS_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getCashLiquidAssetsHistory().upsert(new MoneyDatedValue(date, new Money(c.getDunnBradstreetData().getDefaultCurrency(), Double.valueOf(val))));
						else if(dataset.equalsIgnoreCase(DATASET_MAX_CREDIT_RECOMMENDATION_CODE)
								&& checkDBDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getDunnBradstreetData().getMaximumCreditRecommendation().upsert(new MoneyDatedValue(date, new Money(c.getDunnBradstreetData().getMaximumCreditRecommendationCurrency(), Double.valueOf(val))));
						else if(dataset.equalsIgnoreCase(DATASET_EXPERIAN_DELPHI)
								&& checkExperianDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getExperianData().getDelphiScores().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_EXPERIAN_DELPHI_INDUSTRY)
								&& checkExperianDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getExperianData().getDelphiScoresIndustryAverage().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_EXPERIAN_DAYS_BEYOND_TERMS)
								&& checkExperianDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getExperianData().getDaysBeyondTerms().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
						else if(dataset.equalsIgnoreCase(DATASET_EXPERIAN_DAYS_BEYOND_TERMS_INDUSTRY)
								&& checkExperianDataExists(c, csvFactsReader.getRawRecord())==true)
							c.getExperianData().getDaysBeyondTermsIndustryAverage().upsert(new IntegerDatedValue(date, Integer.valueOf(val)));
					}
					else
					{
						logger.warning("Failed Fact Row. Read fact row with no matching company - " + csvFactsReader.getRawRecord());
					}
				}
				catch(ParseException pe)
				{
					logger.warning("Failed Fact Row. DateParser error - " + csvFactsReader.getRawRecord());
				}
			}
		}
		csvFactsReader.close();
	}
	
	@Override
	protected void writeRecords(CompanyCollection companies, CsvWriter csvWriter, Boolean isIncremental) throws IOException
	{
		csvWriter.writeRecord(FACT_FILE_HEADERS);
		csvWriter.flush();
		for(Company c : companies)
		{
			try
			{// "VALUE", "TIME", "ACCOUNTS (GEN_ID)", "DATASET (GEN_ID)"
				// Agresso Data
				writeFactDoubleCollection(csvWriter, c.getAverageDaysToPaymentCollection(), c.getId(), DATASET_AVERAGE_DAYS_TO_PAYMENT_CODE, isIncremental);
				writeFactDoubleCollection(csvWriter, c.getOpenBalanceCollection(), c.getId(), DATASET_OPEN_BALANCE_CODE, isIncremental);
				writeFactDoubleCollection(csvWriter, c.getTotalSpendCollection(), c.getId(), DATASET_TOTAL_SPEND_CODE, isIncremental);
				//D&B Data
				if(c.hasDunnBradstreetData())
				{
					// Rating ( Risk Indicator )
					for(DnBRating r : c.getDunnBradstreetData().getDbratingHistory())
					{
						if(isIncremental==false || r.getIsCommitted()==false)
						{
							csvWriter.writeRecord(new String[] { String.valueOf(r.getRiskIndicator()), getFormattedStringForDate(r.getDate()), c.getId(), DATASET_RISK_CODE });
							csvWriter.flush();
							r.setCommitted();
						}
					}
					// Failure Risk
					writeFactIntegerCollection(csvWriter, c.getDunnBradstreetData().getFailureRiskScoreHistory(), c.getId(), DATASET_FAILURE_RISK_CODE, isIncremental);
					// Failure Risk Percentile
					writeFactIntegerCollection(csvWriter, c.getDunnBradstreetData().getFailureRiskPercentileHistory(), c.getId(), DATASET_FAILURE_RISK_PERCENTILE_CODE, isIncremental);
					// Payex
					writeFactIntegerCollection(csvWriter, c.getDunnBradstreetData().getPaydexScoreHistory(), c.getId(), DATASET_PAYDEX_CODE, isIncremental);
					// Payex Norm
					writeFactIntegerCollection(csvWriter, c.getDunnBradstreetData().getPaydexNormHistory(), c.getId(), DATASET_PAYDEX_NORM_CODE, isIncremental);
					// Credit Delinquency Score Percentile
					writeFactIntegerCollection(csvWriter, c.getDunnBradstreetData().getCreditDelinquencyNationalPercentileHistory(), c.getId(), DATASET_CREDIT_DELINQUENCY_SCORE_PERCENTILE_CODE, isIncremental);
					// Max Credit Recommendation
					writeFactMoneyCollection(csvWriter, c.getDunnBradstreetData().getMaximumCreditRecommendation(), c.getId(), DATASET_MAX_CREDIT_RECOMMENDATION_CODE, isIncremental);
					// Cash and Liquid Assets
					writeFactMoneyCollection(csvWriter, c.getDunnBradstreetData().getCashLiquidAssetsHistory(), c.getId(), DATASET_CASH_AND_LIQUID_ASSETS_CODE, isIncremental);
				}
				// Experian Data
				if( c.hasExperianData())
				{
					// Delphi
					writeFactIntegerCollection(csvWriter, c.getExperianData().getDelphiScores(), c.getId(), DATASET_EXPERIAN_DELPHI, isIncremental);
					// Delphi Industry Average
					writeFactIntegerCollection(csvWriter, c.getExperianData().getDelphiScoresIndustryAverage(), c.getId(), DATASET_EXPERIAN_DELPHI_INDUSTRY, isIncremental);
					// Days Beyond Terms
					writeFactIntegerCollection(csvWriter, c.getExperianData().getDaysBeyondTerms(), c.getId(), DATASET_EXPERIAN_DAYS_BEYOND_TERMS, isIncremental);
					// Dats Beyond Terms - Industry Average
					writeFactIntegerCollection(csvWriter, c.getExperianData().getDaysBeyondTermsIndustryAverage(), c.getId(), DATASET_EXPERIAN_DAYS_BEYOND_TERMS_INDUSTRY, isIncremental);
				}
			}
			catch(IOException e)
			{
				logger.severe(e.getMessage());
			}
		}
	}
	
	private void writeFactIntegerCollection(CsvWriter csvWriter, IntegerDatedValueCollection collection, String companyId, String datasetId, Boolean isIncremental) throws IOException
	{
		for(IntegerDatedValue dv : collection)
		{
			if(isIncremental==false || dv.getIsCommitted()==false)
			{
				if(dv.getValue()>-1)
				{
					csvWriter.writeRecord(new String[] { String.valueOf(dv.getValue()), getFormattedStringForDate(dv.getDate()), companyId, datasetId });
					csvWriter.flush();
				}
				dv.setCommitted();
			}
		}
	}
	
	private void writeFactDoubleCollection(CsvWriter csvWriter, DoubleDatedValueCollection values,  String companyId, String datasetId, Boolean isIncremental) throws IOException
	{
		for(DoubleDatedValue dv : values)
		{
			if(isIncremental==false || dv.getIsCommitted()==false)
			{
				csvWriter.writeRecord(new String[] { XmlHelper.getDoubleAsString(dv.getValue()), getFormattedStringForDate(dv.getDate()), companyId, datasetId });
				csvWriter.flush();
				dv.setCommitted();
			}
		}
	}
	
	private void writeFactMoneyCollection(CsvWriter csvWriter, MoneyDatedValueCollection values,  String companyId, String datasetId, Boolean isIncremental) throws IOException
	{
		// currently not writing the currency into the facts, it's stored next to the company dimension details
		for(MoneyDatedValue dv : values)
		{
			if(isIncremental==false || dv.getIsCommitted()==false)
			{
				csvWriter.writeRecord(new String[] { XmlHelper.getDoubleAsString(dv.getValue().getValue()), getFormattedStringForDate(dv.getDate()), companyId, datasetId });
				csvWriter.flush();
				dv.setCommitted();
			}
		}
	}
	
	private Boolean checkDBDataExists(Company c, String rowDetails)
	{		
		if(c.hasDunnBradstreetData()==false)
		{
			logger.warning("Failed Fact Row. Somehow we have D&B data for a company that has no duns - " + rowDetails);
			return false;
		}
		return true;
	}

	private Boolean checkExperianDataExists(Company c, String rowDetails)
	{		
		if(c.hasExperianData()==false)
		{
			logger.warning("Failed Fact Row. Somehow we have Experian data for a company that has no experian reference - " + rowDetails);
			return false;
		}
		return true;
	}
}
