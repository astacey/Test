package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import Domain.AccountGroup;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBRegistrationStatus;
import Domain.ICompanyRepository;
/*
 * On init, this class will read all companies from the accounts.csv file into memory.
 * It then archives the accounts, fact_data and dataset files into a date stamped folder. And creates new empty files, with headers and default data.
 * It doesn't read in the data from fact_data. This is because the data that's written to fact_data needs to be incremental for import into Supplier. 
 * So when we write companies to the new fct_data file, we only want new data. 
 * The contents of dataset.csv are currently hardcoded and  new file generated on class initialisation.
 * 
 */
public class SupplierAppCSVCompanyRepository implements ICompanyRepository 
{
	private final String accountsFileName = "accounts.csv";
	private final String[] accountsFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS", "ACCOUNT_GROUP_CODE","ACCOUNT_GROUP_NAME","VERTICAL_MARKET" };
	private final String allMemberId = "1";
	private final String factFileName = "fact_data.csv";
	private final String factFullFileName = "fact_data_full.csv";  
	private final String datasetFileName = "dataset.csv";
	private final String[] datasetFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "FILTER_DESCRIPTION" };
	
	private static Logger logger = Logger.getLogger(SupplierAppCSVCompanyRepository.class.getName());

	private String workingFolder;
	
	private CompanyCollection allCompanies;
	
	CsvWriter csvAccounts;
	CsvWriter csvFactData;
	CsvWriter csvDataset;
	
	public SupplierAppCSVCompanyRepository(String workingFolder)
	{
		this.workingFolder = workingFolder;
		if( !this.workingFolder.endsWith("/"))
			this.workingFolder+="/";
		initialise();
	}
	
	@Override 
	protected void finalize() throws Throwable 
	{
		csvAccounts.close();
		csvFactData.close();
		csvDataset.close();
		
		super.finalize();
	}
	
	@Override
	public CompanyCollection getUnregisteredDunsCompanies() 
	{
		CompanyCollection unregistered = new CompanyCollection();
	
		for(Company c : allCompanies)
		{
			// Only return companies that 
			// have a duns number 
			// and that don't have registration tatus of Active
			// and that aren't flagged as out of business by d&b 
			if(c.getDunnBradstreetData()!=null 
					&& c.getDunnBradstreetData().getRegistrationDetails().getStatus()!=DnBRegistrationStatus.ACTIVE
					&& c.getDunnBradstreetData().getOutOfBusiness() == false)
			{
				unregistered.add(c);
			}
		}		
		return unregistered;
	}

	@Override
	public CompanyCollection getAllCompanies() 
	{
		return allCompanies;
	}

	@Override
	public void saveCompany(Company c) 
	{
		// TODO : Temp Hack until we get proper data from agresso
		if( c.getName()==""&&c.getDunnBradstreetData()!=null)
			c.setName(c.getDunnBradstreetData().getName());
		
		if(allCompanies.updateCompany(c) == false)
		{
			// company is not in collection so add
			allCompanies.add(c);
		}
	}

	@Override
	public Company getCompanyByDuns(int dunsNumber) 
	{
		return allCompanies.getCompanyFromDunsNumber(dunsNumber);
	}
	
	@Override
	public Company getCompanyById(String id)
	{
		return allCompanies.getCompanyFromId(id);
	}
	
	@Override
	public void commitAllChanges()
	{
		writeAllCompanies();
		// set committed
		allCompanies.setCommitted();
	}
	
	private void writeAccountsFile(Company c)
	{
		// { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS";ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET };
		try
		{
			String accGroupName = "", accGroupCode ="";
			if(c.getAccountGroup()!=null)
			{
				accGroupName = c.getAccountGroup().getName();
				accGroupCode = c.getAccountGroup().getCode();
			}
			if(c.hasDunnBradstreetData())
				csvAccounts.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), String.valueOf(c.getDunnBradstreetData().getDunsNumber()), getOutOfBusinessString(c.getDunnBradstreetData().getOutOfBusiness()), c.getDunnBradstreetData().getRegistrationDetails().getStatus().getDescription(), accGroupCode, accGroupName, c.getVerticalMarket()});
			else
				csvAccounts.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), "", "Active", "", accGroupCode, accGroupName, c.getVerticalMarket()});
			csvAccounts.flush();
		}
		catch(IOException e)
		{
			logger.severe(e.getMessage());
		}
	}
		
	private void initialise()
	{
		// read in all existing companies from main company csv
		readAllCompanies();
		// read fact data
		SupplierAppCSVFactDataFull factFile = new SupplierAppCSVFactDataFull();
		factFile.read(allCompanies, workingFolder + factFullFileName);
		// Set all new companies to be committed, i.e. track changes from this point on
		allCompanies.setCommitted();
	}
	
	private void readAllCompanies()
	{
		allCompanies = new CompanyCollection();
		try
		{
			CsvReader csvAccountsReader = getCsvReader(workingFolder + accountsFileName);
			if(csvAccountsReader.readHeaders() == true)
			{
				while(csvAccountsReader.readRecord()==true)
				{	
					//{ "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS";ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET };
					// TODO : constants for each header ?
					String id = csvAccountsReader.get("GEN_ID");
					String name = csvAccountsReader.get("NAME");
					String companyRegNo = csvAccountsReader.get("CH_NO");
					String status = csvAccountsReader.get("STATUS");
					String verticalMarket = csvAccountsReader.get("VERTICAL_MARKET");
					String groupCode = csvAccountsReader.get("ACCOUNT_GROUP_CODE");
					String groupName = csvAccountsReader.get("ACCOUNT_GROUP_NAME");
					
					// Ignore the artificial companies, all, supplier, partners, customers
					if( ! ( (id.equals("1")&&name.equals("All") ) || ( id.equals("A") && name.equals("Suppliers") ) || ( id.equals("B") && name.equals("Partners") ) || ( id.equals("C") && name.equals("Customers" ) ) ) )
					{
						CompanyType type = CompanyType.getCompanyTypeFromId(csvAccountsReader.get("PARENT (PARENT_GEN_ID)"));
						Company c = new Company(id, name, type);
						c.setCompanyRegistrationNumber(companyRegNo);
						c.setVerticalMarket(verticalMarket);
						if( groupCode.length()>0)
							c.setAccountGroup(new AccountGroup(groupCode, groupName));
						
						String dunsString = csvAccountsReader.get("DUNS_NO");
						if( dunsString.length()>0)
						{
							int dunsNumber = Integer.parseInt(dunsString);
							DnBData data = new DnBData(dunsNumber);
							data.setOutOfBusiness(getOutOfBusiness(status));
							String dnbStatus = csvAccountsReader.get("DnB_STATUS");
							data.getRegistrationDetails().setStatus(DnBRegistrationStatus.fromString(dnbStatus));
							
							c.setDunnBradstreetData(data);
						}
						allCompanies.add(c);
					}
				}
			}
			csvAccountsReader.close();
		}
		catch(FileNotFoundException fnfe)
		{
			// do nothing, it's just an empty list of companies
			//logger.warning(fnfe.getMessage());
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
		
	private void initialiseAccounts() throws IOException
	{
		csvAccounts = getCsvWriter(workingFolder + accountsFileName);
		csvAccounts.writeRecord(accountsFileHeaders);
		csvAccounts.writeRecord(new String[] { allMemberId, "All",allMemberId,"","","","","","","",""  });
		for(CompanyType ct : CompanyType.values())
		{
			if( ct!=CompanyType.UNKNOWN )
			{
				// { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS";ACCOUNT_GROUP_CODE;ACCOUNT_GROUP_NAME;VERTICAL_MARKET };
				csvAccounts.writeRecord(new String[] { ct.getId(), ct.getDescription(), allMemberId, "", "", "", "", "","","","" });
			}
		}
		csvAccounts.flush();
	}
	
	private void initialiseDataset() throws IOException
	{
		csvDataset = getCsvWriter(workingFolder + datasetFileName);
		csvDataset.writeRecord(datasetFileHeaders);
		csvDataset.writeRecord(new String[] {"S","Spend","S","" });
		csvDataset.writeRecord(new String[] {"R","Rating","R", ""});
		csvDataset.writeRecord(new String[] {SupplierAppCSVFile.DATASET_PAYDEX_CODE,"D&B PAYDEX",SupplierAppCSVFile.DATASET_PAYDEX_CODE,"is less than" });
		csvDataset.writeRecord(new String[] {SupplierAppCSVFile.DATASET_PAYDEX_NORM_CODE,"D&B PAYDEX Norm",SupplierAppCSVFile.DATASET_PAYDEX_NORM_CODE,"is less than" });
		csvDataset.writeRecord(new String[] {SupplierAppCSVFile.DATASET_FAILURE_RISK_CODE,"D&B Failure Risk (Financial Stress) Score",SupplierAppCSVFile.DATASET_FAILURE_RISK_CODE,"is less than" });
		csvDataset.writeRecord(new String[] {SupplierAppCSVFile.DATASET_FAILURE_RISK_PERCENTILE_CODE,"D&B Failure Risk (Financial Stress) Score National Percentile",SupplierAppCSVFile.DATASET_FAILURE_RISK_PERCENTILE_CODE,"is less than" });
		csvDataset.writeRecord(new String[] {SupplierAppCSVFile.DATASET_RISK_CODE, "D&B Risk Indicator",SupplierAppCSVFile.DATASET_RISK_CODE,"is greater than" });
		csvDataset.flush();
	}

	private void archiveFiles()
	{
		String stamp = getDateStamp();
		String archiveFolder = workingFolder + "Archive" + stamp + "/" ;
		renameFile(workingFolder + accountsFileName, archiveFolder, accountsFileName);
		renameFile(workingFolder + factFileName, archiveFolder, factFileName);
		// Stop copying dataset - it's static currently
		// if you uncomment this, look for the initialisation of this file also
		//renameFile(workingFolder + datasetFileName, archiveFolder, datasetFileName);
		logger.info("Archive folder [" + archiveFolder + "] created.");
	}
	
	private String getDateStamp()
	{
		return GlobalDateStamp.getDateStampString();
	}
	
	private void renameFile(String fileName, String targetFolder, String targetFileName)
	{
		File file = new File(fileName);
		if(file.exists())
		{
			File targetFile = new File(targetFolder);
			targetFile.mkdir();
			targetFile = new File(targetFolder + targetFileName);
			Boolean success = file.renameTo(targetFile);
			if(!success)
				logger.info("No backup was taken");
		}
	}
	
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
	
	private void writeAllCompanies()
	{
		// if files already exist, rename them.
		// should use java.nio.file.Files from java 1.7
		archiveFiles();
		// Write headers
		try
		{
			initialiseAccounts();
		}
		catch(IOException e)
		{
			logger.severe(e.getMessage());
		}
		for(Company c : allCompanies)
		{
			writeAccountsFile(c);
			// Nothing to do for dataset - all done in initialise
		}
		// Fact writing !
		SupplierAppCSVFactDataFull factDataFile = new SupplierAppCSVFactDataFull();
		// Write to incremental ( archive and initialise method has left us with file with only header row )
		factDataFile.write(allCompanies, workingFolder + factFileName, true);
		// write to full dataset, should append any new rows
		factDataFile.write(allCompanies, workingFolder + factFullFileName, false);
	}
	
	private Boolean getOutOfBusiness(String outOfBusiness)
	{
		if( outOfBusiness.equalsIgnoreCase("inactive"))
			return true;
		// Active by default
		return false;
	}

	private String getOutOfBusinessString(Boolean outOfBusiness)
	{
		if( outOfBusiness )
			return "Inactive";
		// Active by default
		return "Active";
	}
}
