package Application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import Test.TestRepositories.TestCompanyRepository;
import Domain.Company;
import Domain.CompanyCollection;
import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBFailureRisk;
import Domain.DnBPaydex;
import Domain.DnBRating;
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
	private final String[] accountsFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS" };
	private final String allMemberId = "1";
	private final String factFileName = "fact_data.csv"; 
	private final String[] factFileHeaders = new String[] {"VALUE", "TIME", "ACCOUNTS (GEN_ID)", "DATASET (GEN_ID)" };
	private final String datasetFileName = "dataset.csv";
	private final String[] datasetFileHeaders = new String[] { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "FILTER_DESCRIPTION" };
	private final String datasetRiskId = "Risk";
	private final String datasetpaydexId = "P";
	private final String datasetpaydexNormId = "PN";
	private final String datasetFailureRiskId = "FR";
	private final String datasetFailureRiskPercentileId = "FRP";
	
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
	}
	
	private void writeAccountsFile(Company c)
	{
		// { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS" };
		try
		{
			if(c.hasDunnBradstreetData())
				csvAccounts.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), String.valueOf(c.getDunnBradstreetData().getDunsNumber()), getOutOfBusinessString(c.getDunnBradstreetData().getOutOfBusiness()), c.getDunnBradstreetData().getRegistrationDetails().getStatus().getDescription()});
			else
				csvAccounts.writeRecord(new String[] { c.getId(), c.getName(), c.getType().getId(), c.getId(), c.getCompanyRegistrationNumber(), "", "Active", ""});
			csvAccounts.flush();
		}
		catch(IOException e)
		{
			logger.severe(e.getMessage());
		}
	}
	
	private void writeFactDataFile(Company c)
	{
		try
		{// "VALUE", "TIME", "ACCOUNTS (GEN_ID)", "DATASET (GEN_ID)"
			if(c.hasDunnBradstreetData())
			{
				for(DnBRating r : c.getDunnBradstreetData().getDbratingHistory())
				{
					csvFactData.writeRecord(new String[] { String.valueOf(r.getRiskIndicator()), getFormattedStringForDate(r.getDate()), c.getId(), datasetRiskId });
				}
				csvFactData.flush();
				for(DnBFailureRisk fr : c.getDunnBradstreetData().getFailureRiskHistory())
				{
					// Failure Risk
					if(fr.getFailureRisk()>-1)
						csvFactData.writeRecord(new String[] { String.valueOf(fr.getFailureRisk()), getFormattedStringForDate(fr.getDate()), c.getId(), datasetFailureRiskId });
					// Failure Risk Percentile
					if(fr.getFailureRiskNationalPercentile()>-1)
						csvFactData.writeRecord(new String[] { String.valueOf(fr.getFailureRiskNationalPercentile()), getFormattedStringForDate(fr.getDate()), c.getId(), datasetFailureRiskPercentileId });
				}
				csvFactData.flush();
				for(DnBPaydex p : c.getDunnBradstreetData().getPaydexHistory())
				{
					// Payex
					if(p.getPaydex()>-1)
						csvFactData.writeRecord(new String[] { String.valueOf(p.getPaydex()), getFormattedStringForDate(p.getDate()), c.getId(), datasetpaydexId });
					// Payex Norm
					if(p.getPaydexNorm()>-1)
						csvFactData.writeRecord(new String[] { String.valueOf(p.getPaydexNorm()), getFormattedStringForDate(p.getDate()), c.getId(), datasetpaydexNormId });
				}
				csvFactData.flush();
			}
		}
		catch(IOException e)
		{
			logger.severe(e.getMessage());
		}
	}
	
	private void initialise()
	{
		// read in all existing companies
		readAllCompanies();
		// if files already exist, rename them.
		// should use java.nio.file.Files from java 1.7
		archiveFiles();
		
		// Write headers
		try
		{
			initialiseAccounts();
			initialiseFactData();
			// Stop copying dataset - it's static currently
			// if you uncomment this, look for the archive of this file also
			//initialiseDataset();
		}
		catch(IOException e)
		{
			logger.severe(e.getMessage());
		}
	}
	
	private void readAllCompanies()
	{
		allCompanies = new CompanyCollection();
		try
		{
			CsvReader csvAccountsReader = new CsvReader(workingFolder + accountsFileName);
			csvAccountsReader.setDelimiter(';');
			if(csvAccountsReader.readHeaders() == true)
			{
				while(csvAccountsReader.readRecord()==true)
				{	
					//{ "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS" };
					// TODO : constants for each header ?
					String id = csvAccountsReader.get("GEN_ID");
					String name = csvAccountsReader.get("NAME");
					String companyRegNo = csvAccountsReader.get("CH_NO");
					String status = csvAccountsReader.get("STATUS");
					
					// Ignore the artificial companies, all, supplier, partners, customers
					if( ! ( (id.equals("1")&&name.equals("All") ) || ( id.equals("A") && name.equals("Suppliers") ) || ( id.equals("B") && name.equals("Partners") ) || ( id.equals("C") && name.equals("Customers" ) ) ) )
					{
						CompanyType type = CompanyType.getCompanyTypeFromId(csvAccountsReader.get("PARENT (PARENT_GEN_ID)"));
						Company c = new Company(id, name, type);
						c.setCompanyRegistrationNumber(companyRegNo);
						
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
		csvAccounts.writeRecord(new String[] { allMemberId, "All",allMemberId,"","","","",""  });
		for(CompanyType ct : CompanyType.values())
		{
			if( ct!=CompanyType.UNKNOWN )
			{
				// { "GEN_ID", "NAME", "PARENT (PARENT_GEN_ID)", "AGR_NO", "CH_NO", "DUNS_NO", "STATUS", "DnB_STATUS" };
				csvAccounts.writeRecord(new String[] { ct.getId(), ct.getDescription(), allMemberId, "", "", "", "", "" });
			}
		}
		csvAccounts.flush();
	}
	
	private void initialiseFactData() throws IOException
	{
		csvFactData = getCsvWriter(workingFolder + factFileName);
		csvFactData.writeRecord(factFileHeaders);
		csvFactData.flush();
	}
	
	private void initialiseDataset() throws IOException
	{
		csvDataset = getCsvWriter(workingFolder + datasetFileName);
		csvDataset.writeRecord(datasetFileHeaders);
		csvDataset.writeRecord(new String[] {"S","Spend","S","" });
		csvDataset.writeRecord(new String[] {"R","Rating","R", ""});
		csvDataset.writeRecord(new String[] {datasetpaydexId,"D&B PAYDEX",datasetpaydexId,"is less than" });
		csvDataset.writeRecord(new String[] {datasetpaydexNormId,"D&B PAYDEX Norm",datasetpaydexNormId,"is less than" });
		csvDataset.writeRecord(new String[] {datasetFailureRiskId,"D&B Failure Risk (Financial Stress) Score",datasetFailureRiskId,"is less than" });
		csvDataset.writeRecord(new String[] {datasetFailureRiskPercentileId,"D&B Failure Risk (Financial Stress) Score National Percentile",datasetFailureRiskPercentileId,"is less than" });
		csvDataset.writeRecord(new String[] {datasetRiskId, "D&B Risk Indicator",datasetRiskId,"is greater than" });
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
	
	private String getFormattedStringForDate(Date date)
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		return dateFormatter.format(date);
	}
	
	private void writeAllCompanies()
	{
		for(Company c : allCompanies)
		{
			writeAccountsFile(c);
			writeFactDataFile(c);
			// Nothing to do for dataset - all done in initialise
		}
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
