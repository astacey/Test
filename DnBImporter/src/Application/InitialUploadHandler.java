package Application;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Logger;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.DnBData;
import Domain.IDnBRepository;
import Domain.ICompanyRepository;

public class InitialUploadHandler 
{
	private static Logger logger = Logger.getLogger(RegistrationHandler.class.getName());
	private ICompanyRepository companyU4BARepository;
	private ICompanyRepository companySourceRepository;
	private IDnBRepository dnbRepository;
	private ImporterSettings settings;
	
	public InitialUploadHandler(ICompanyRepository companyU4BARepository, IDnBRepository dnbRepository, ImporterSettings settings, ICompanyRepository companySourceRepository)
	{
		this.companyU4BARepository = companyU4BARepository;
		this.companySourceRepository = companySourceRepository;
		this.dnbRepository = dnbRepository;
		this.settings = settings;
	}
	
	/* get all companies that we're interested in from D & B
	* 	1. read in the list of companies from source system
	* 	for each one,
	* 		if the company hasn't already been imported
	*	 		2. get the data from D&B
	* 			3. write data to target store
	*/ 
	public void downloadAllCompanies()
	{
		// Take the datetime just before we start
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern"));
		
		// Get all companies from the source repository
		CompanyCollection companies = companySourceRepository.getAllCompanies();
		int countImported=0;
		int countImportedWithDuns=0;
		// Loop, call D&B to get current details and then update
		for(Company company : companies)
		{
			// Should I allow updates ? Think it would be handy - I can import 7-10 confidence now and rest later
			Company existingCompany = companyU4BARepository.getCompanyById(company.getId());
			// If it doesn't already exist, then import
			if( existingCompany == null )
			{
				if(company.hasDunnBradstreetData() == true)
				{
					DnBData companyDnBData = dnbRepository.getCompanyDetails(company.getDunnBradstreetData().getDunsNumber());
					company.setDunnBradstreetData(companyDnBData);
					countImportedWithDuns++;
				}
				countImported++;
				companyU4BARepository.saveCompany(company);
			}
			else
			{
				// If company already exists
				// If it already has D&B data, do nothing
				// If it's missing D&B data and the imported company has a duns number - import
				if( existingCompany.hasDunnBradstreetData() == false && company.hasDunnBradstreetData() == true )
				{
					DnBData companyDnBData = dnbRepository.getCompanyDetails(company.getDunnBradstreetData().getDunsNumber());
					existingCompany.setDunnBradstreetData(companyDnBData);
					countImportedWithDuns++;
					companyU4BARepository.saveCompany(existingCompany);
				}
			}
		}
		
		//Commit
		companyU4BARepository.commitAllChanges();
		// Save Last Run Date, so that incremental updates knows when to pick up from
		settings.setLastRunDate(cal.getTime());

		logger.info("Initial upload : Read " + String.valueOf(companies.size()) + " source companies. " + String.valueOf(countImported) + " companies imported, " + String.valueOf(countImportedWithDuns) + " duns data imported.");

	}
}
