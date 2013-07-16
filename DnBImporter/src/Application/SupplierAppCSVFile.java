package Application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import Domain.CompanyCollection;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public abstract class SupplierAppCSVFile 
{
	public final static String DATASET_RISK_CODE = "Risk";
	public final static String DATASET_PAYDEX_CODE = "P";
	public final static String DATASET_PAYDEX_NORM_CODE = "PN";
	public final static String DATASET_FAILURE_RISK_CODE = "FR";
	public final static String DATASET_FAILURE_RISK_PERCENTILE_CODE = "FRP";
	public final static String DATASET_CREDIT_DELINQUENCY_SCORE_PERCENTILE_CODE = "CDSP";
	public final static String DATASET_MAX_CREDIT_RECOMMENDATION_CODE = "MCR";
	public final static String DATASET_CASH_AND_LIQUID_ASSETS_CODE = "CLA";
	public final static String DATASET_AVERAGE_DAYS_TO_PAYMENT_CODE = "ADTP";
	public final static String DATASET_OPEN_BALANCE_CODE = "OB";
	public final static String DATASET_TOTAL_SPEND_CODE = "S";
	public final static String DATASET_EXPERIAN_DAYS_BEYOND_TERMS = "DBT";
	public final static String DATASET_EXPERIAN_DAYS_BEYOND_TERMS_INDUSTRY = "DBT-IND";
	public final static String DATASET_EXPERIAN_DELPHI = "DELPHI";
	public final static String DATASET_EXPERIAN_DELPHI_INDUSTRY = "DELPHI-IND"; 
	
	protected static Logger logger = Logger.getLogger(SupplierAppCSVFile.class.getName());
	
	public void read(CompanyCollection companies, String fileName)
	{
		try
		{
			CsvReader reader = getCsvReader(fileName);
			readRecords(companies, reader);
			reader.close();
		}
		catch(FileNotFoundException fnfe)
		{
			logger.warning(fnfe.getMessage());
		}
		catch(IOException ioe)
		{
			logger.warning(ioe.getMessage());
		}
		catch(Exception e)
		{
			logger.warning(e.getMessage());
		}
	}
	
	// isIncremental=true will write only uncommitted data
	public void write(CompanyCollection companies, String fileName, Boolean isIncremental)
	{
		try
		{
			CsvWriter writer = getCsvWriter(fileName);
			writeRecords(companies, writer, isIncremental);
			writer.close();
		}
		catch(IOException ioe)
		{
			logger.warning(ioe.getMessage());
		}
		catch(Exception e)
		{
			logger.warning(e.getMessage());
		}
	}
	
	protected abstract void readRecords(CompanyCollection companies, CsvReader csvReader) throws IOException;
	protected abstract void writeRecords(CompanyCollection companies, CsvWriter csvWriter, Boolean isIncremental) throws IOException;	

	private CsvWriter getCsvWriter(String filePath)
	{
		CsvWriter csv = new CsvWriter(filePath);
		csv.setDelimiter(';');		
		return csv;
	}

	private CsvReader getCsvReader(String filePath) throws FileNotFoundException
	{
		CsvReader csv = new CsvReader(filePath);
		csv.setDelimiter(';');		
		return csv;
	}
	
	protected String getFormattedStringForDate(Date date)
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormatter.format(date);
	}
	
	protected Date getDateFromString(String stringDate) throws ParseException
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormatter.parse(stringDate);
	}
}
