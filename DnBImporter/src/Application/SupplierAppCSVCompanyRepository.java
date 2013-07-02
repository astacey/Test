package Application;

import java.io.File;
import java.util.logging.Logger;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.RegistrationStatus;
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
	private final String factFileName = "fact_data.csv";
	private final String factFullFileName = "fact_data_full.csv";  
	
	private static Logger logger = Logger.getLogger(SupplierAppCSVCompanyRepository.class.getName());

	private String workingFolder;
	
	private CompanyCollection allCompanies;
		
	public SupplierAppCSVCompanyRepository(String workingFolder)
	{
		this.workingFolder = workingFolder;
		if( !this.workingFolder.endsWith("/"))
			this.workingFolder+="/";
		initialise();
	}
		
	@Override
	public CompanyCollection getUnregisteredDunsCompanies() 
	{
		CompanyCollection unregistered = new CompanyCollection();
	
		for(Company c : allCompanies)
		{
			// Only return companies that 
			// have a duns number 
			// and that don't have registration tatus of Active or registered
			// and that aren't flagged as out of business by d&b 
			if(c.getDunnBradstreetData()!=null 
					&& (
							c.getDunnBradstreetData().getRegistrationDetails().getStatus()!=RegistrationStatus.ACTIVE
							&&
							c.getDunnBradstreetData().getRegistrationDetails().getStatus()!=RegistrationStatus.REGISTERED
						)
					&& c.getDunnBradstreetData().getOutOfBusiness() == false)
			{
				unregistered.add(c);
			}
		}		
		return unregistered;
	}

	@Override
	public CompanyCollection getUnregisteredExperianCompanies() 
	{
		CompanyCollection unregistered = new CompanyCollection();
		
		for(Company c : allCompanies)
		{
			// Only return companies that 
			// have experian data 
			// and that don't have registration status of Active or Registered
			if(c.getExperianData()!=null 
					&& (
							c.getExperianData().getRegistrationStatus()!=RegistrationStatus.ACTIVE
							&&
							c.getExperianData().getRegistrationStatus()!=RegistrationStatus.REGISTERED
						)
				)
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
	public CompanyCollection getCompanyByDuns(int dunsNumber) 
	{
		return allCompanies.getCompaniesFromDunsNumber(dunsNumber);
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

	@Override
	public CompanyCollection getCompaniesForInitialUpdateExperian() 
	{
		CompanyCollection comps= new CompanyCollection();
		for(Company c : allCompanies)
		{
			if( c.hasExperianData()
					&& c.getExperianData().getRegistrationStatus()==RegistrationStatus.REGISTERED)
			{
				comps.add(c);
			}
		}
		return comps;
	}

	@Override
	public CompanyCollection getCompaniesForInitialUpdateDnB() 
	{
		CompanyCollection comps= new CompanyCollection();
		for(Company c : allCompanies)
		{
			if( c.hasDunnBradstreetData()
					&& c.getDunnBradstreetData().getRegistrationDetails().getStatus()==RegistrationStatus.REGISTERED)
			{
				comps.add(c);
			}
		}
		return comps;
	}

	@Override
	public CompanyCollection getCompaniesByExperianReference(String reference) 
	{
		CompanyCollection comps= new CompanyCollection();
		for(Company c : allCompanies)
		{
			if(c.hasExperianData()
					&& c.getExperianData().getId().equalsIgnoreCase(reference))
			{
				comps.add(c);
			}
		}
		return comps;
	}
		
	private void initialise()
	{
		// initialise the company collection
		allCompanies = new CompanyCollection();
		// read in all existing companies from main csv file
		SupplierAppCSVAccounts accountsFile = new SupplierAppCSVAccounts();
		accountsFile.read(allCompanies, workingFolder + accountsFileName);
		// read fact data
		SupplierAppCSVFactDataFull factFile = new SupplierAppCSVFactDataFull();
		factFile.read(allCompanies, workingFolder + factFullFileName);
		// Set all new companies to be committed, i.e. track changes from this point on
		allCompanies.setCommitted();
	}
	
	private void writeAllCompanies()
	{
		// archive existing files before writing
		archiveFiles();
		// Write main csv file
		SupplierAppCSVAccounts accounts = new SupplierAppCSVAccounts();
		accounts.write(allCompanies, workingFolder + accountsFileName, false);
		// Fact writing !
		SupplierAppCSVFactDataFull factDataFile = new SupplierAppCSVFactDataFull();
		// Write to incremental ( archive and initialise method has left us with file with only header row )
		factDataFile.write(allCompanies, workingFolder + factFileName, true);
		// write to full dataset, should append any new rows
		factDataFile.write(allCompanies, workingFolder + factFullFileName, false);
	}
	
	private void archiveFiles()
	{
		// if files already exist, rename them.
		// should use java.nio.file.Files from java 1.7
		String stamp = getDateStamp();
		String archiveFolder = workingFolder + "Archive" + stamp + "/" ;
		renameFile(workingFolder + accountsFileName, archiveFolder, accountsFileName);
		renameFile(workingFolder + factFileName, archiveFolder, factFileName);

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
}
