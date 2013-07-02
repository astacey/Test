package Application;

import java.util.logging.Logger;

import Domain.*;

public class ExperianRegistrationHandler 
{
	private static Logger logger = Logger.getLogger(ExperianRegistrationHandler.class.getName());
	private ICompanyRepository companyRepo;
	private IExperianRepository experianRepo;
	
	public ExperianRegistrationHandler(ICompanyRepository companyRepo, IExperianRepository experianRepo)
	{
		this.companyRepo=companyRepo;
		this.experianRepo=experianRepo;
	}
	
	// 1. get all unregistered companies
	// 2. register
	// 3. set status to registered
	public void RegisterCompanies()
	{
		CompanyCollection unregistered = companyRepo.getUnregisteredExperianCompanies();
		int unreg = unregistered.size(), success = 0, fail = 0;
		for(Company c : unregistered)
		{
			if(experianRepo.registerCompany(c.getExperianData().getId(), c.getExperianData().getLegalStatus()) == true)
			{
				c.getExperianData().setRegistrationStatus(RegistrationStatus.REGISTERED);
				logger.info("Registered ref - "  + c.getExperianData().getId());
				success++;
			}
			else
			{
				c.getExperianData().setRegistrationStatus(RegistrationStatus.FAILED);
				logger.warning("Failed to register - " + c.getExperianData().getId());
				fail++;
			}
			companyRepo.saveCompany(c);
		}
		companyRepo.commitAllChanges();
		logger.info("Found " + String.valueOf(unreg) + " unregistered companies. " + String.valueOf(success) + " were registered. " + String.valueOf(fail) + "failed.");
	}
}
