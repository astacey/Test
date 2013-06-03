package Application;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import com.csvreader.CsvReader;

import Domain.AccountGroup;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DatedValue;
import Domain.DnBData;
import Domain.ICompanyRepository;

public class ABWXlsxCompanyRepository implements ICompanyRepository 
{
	private static Logger logger = Logger.getLogger(ABWXlsxCompanyRepository.class.getName());

	private String sourceFileMain;
	private String sourceFileOpenItems;
	private String sourceFileTotalSpend;
	private String sourceFileAvgDays;
	
	private CompanyCollection allCompanies;
	
	public ABWXlsxCompanyRepository(String sourceFolder)
	{
		if( !sourceFolder.endsWith("/"))
			sourceFolder+="/";
		this.sourceFileMain = sourceFolder + "Customer Supplier Listing.CSV";
		this.sourceFileOpenItems = sourceFolder + "Customer Supplier Open Items.CSV";
		this.sourceFileTotalSpend = sourceFolder + "Customer Supplier Total Spend.CSV";
		this.sourceFileAvgDays = sourceFolder + "Customer Supplier Avg Days.CSV";
	}
	
	@Override
	public CompanyCollection getUnregisteredDunsCompanies() {
		// If it's abw then they're all unregistered ???
		// this method probably not used here 
		return null;
	}

	@Override
	public CompanyCollection getAllCompanies() 
	{
		if(allCompanies == null)
		{
			readAllCompaniesFromXlsx();
			readOpenItems();
			readTotalSpend();
			readAvgDays();
		}
		return allCompanies;
	}

	@Override
	public Company getCompanyById(String id) {
		return getAllCompanies().getCompanyFromId(id);
	}

	@Override
	public Company getCompanyByDuns(int dunsNumber) {
		return getAllCompanies().getCompanyFromDunsNumber(dunsNumber);
	}

	@Override
	public void saveCompany(Company c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void commitAllChanges() {
		// TODO Auto-generated method stub

	}

	private void readAllCompaniesFromXlsx()
	{
		this.allCompanies = new CompanyCollection();
		try
		{
			CsvReader csvReader = new CsvReader(sourceFileMain);
			if(csvReader.readHeaders() == true)
			{
				while(csvReader.readRecord()==true)
				{	
					//apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype
					// TODO : constants for each header ?
					String id = csvReader.get("apar_id");
					String name = csvReader.get("apar_name");
					String companyRegNo = csvReader.get("comp_reg_no");
					String groupCode = csvReader.get("apar_gr_id");
					String groupName = csvReader.get("group_name");
					String verticalMarket = csvReader.get("V_market");
					String client = csvReader.get("client");
					
					// TODO: only import this client for now
					if(client.equalsIgnoreCase("UKU4"))
					{
						CompanyType type = CompanyType.getCompanyTypeFromDescription(csvReader.get("acctype"));
						Company c = new Company(id, name, type);
						c.setCompanyRegistrationNumber(companyRegNo);
						c.setVerticalMarket(verticalMarket);
						if( groupCode.length()>0)
							c.setAccountGroup(new AccountGroup(groupCode, groupName));
						
						String dunsString = csvReader.get("DUNS_NO");
						if( dunsString.length()>0)
						{
							int dunsNumber = Integer.parseInt(dunsString);
							DnBData data = new DnBData(dunsNumber);
							
							c.setDunnBradstreetData(data);
						}
						this.allCompanies.add(c);
					}
				}
			}
			csvReader.close();
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
	
	private void readOpenItems()
	{
		try
		{
			CsvReader csvReader = new CsvReader(sourceFileOpenItems);
			if(csvReader.readHeaders() == true)
			{
				while(csvReader.readRecord()==true)
				{	
					//apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype
					// TODO : constants for each header ?
					String id = csvReader.get("apar_id");
					String client = csvReader.get("client");
					String openAmount = csvReader.get("rest_amt");
					
					// TODO: only import this client for now
					if(client.equalsIgnoreCase("UKU4"))
					{
						Company c = allCompanies.getCompanyFromId(id);
						if(c!=null)
						{
							double val = XmlHelper.getDoubleFromXmlString(openAmount);
							c.getOpenBalanceCollection().add(new DatedValue(Calendar.getInstance().getTime(), val));							
						}
					}
				}
			}
			csvReader.close();
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
	
	private void readTotalSpend()
	{
		try
		{
			CsvReader csvReader = new CsvReader(sourceFileTotalSpend);
			if(csvReader.readHeaders() == true)
			{
				while(csvReader.readRecord()==true)
				{	
					//apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype
					// TODO : constants for each header ?
					String id = csvReader.get("text apar_id");
					String client = csvReader.get("client");
					String amount = csvReader.get("amt");
					String period = csvReader.get("text period");
					period += "01";
					// TODO: only import this client for now
					if(client.equalsIgnoreCase("UKU4"))
					{
						Company c = allCompanies.getCompanyFromId(id);
						if(c!=null)
						{
							try
							{
								Date date = getDate(period);
								double val = XmlHelper.getDoubleFromXmlString(amount);
								c.getTotalSpendCollection().add(new DatedValue(date, val));
							}
							catch(ParseException pe)
							{
								logger.warning("Failed to read row - Parse exception : " + csvReader.getRawRecord());
							}
						}
					}
				}
			}
			csvReader.close();
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
	
	private void readAvgDays()
	{
		try
		{
			CsvReader csvReader = new CsvReader(sourceFileAvgDays);
			if(csvReader.readHeaders() == true)
			{
				while(csvReader.readRecord()==true)
				{	
					//apar_id,apar_name,address,place,province,Country_code,zip_code,telephone_1,comp_reg_no,acctype
					// TODO : constants for each header ?
					String id = csvReader.get("apar_id");
					String client = csvReader.get("client");
					String avg = csvReader.get("avg");
					
					// TODO: only import this client for now
					if(client.equalsIgnoreCase("UKU4"))
					{
						Company c = allCompanies.getCompanyFromId(id);
						if(c!=null)
						{
							double val = XmlHelper.getDoubleFromXmlString(avg);
							c.getAverageDaysToPaymentCollection().add(new DatedValue(Calendar.getInstance().getTime(), val));							
						}
					}
				}
			}
			csvReader.close();
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
	
	private Date getDate(String stringDate) throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		return formatter.parse(stringDate);
	}
}
