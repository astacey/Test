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
			if(c.getExperianData().getLegalStatus()==ExperianLegalStatus.UNKNOWN)
			{
				// if legal status is unknown, try both ! If one is successful, set the legal status accordingly on the company
				if(experianRepo.registerCompany(c.getExperianData().getId(), ExperianLegalStatus.LIMITED)==true)
				{
					registrationSuccess(c);
					c.getExperianData().setLegalStatus(ExperianLegalStatus.LIMITED);
					success++;
				}
				else if(experianRepo.registerCompany(c.getExperianData().getId(), ExperianLegalStatus.NONLIMITED)==true)
				{
					registrationSuccess(c);
					c.getExperianData().setLegalStatus(ExperianLegalStatus.NONLIMITED);
					success++;
				}
				else
				{
					registrationFailed(c);
					fail++;
				}
			}
			else if(experianRepo.registerCompany(c.getExperianData().getId(), c.getExperianData().getLegalStatus()) == true)
			{
				registrationSuccess(c);
				success++;
			}
			else
			{
				registrationFailed(c);
				fail++;
			}
			companyRepo.saveCompany(c);
		}
		companyRepo.commitAllChanges();
		logger.info("Found " + String.valueOf(unreg) + " unregistered companies. " + String.valueOf(success) + " were registered. " + String.valueOf(fail) + "failed.");
	}
	
	private void registrationSuccess(Company c)
	{
		c.getExperianData().setRegistrationStatus(RegistrationStatus.REGISTERED);
		logger.info("Registered ref - "  + c.getExperianData().getId());
	}
	
	private void registrationFailed(Company c)
	{
		c.getExperianData().setRegistrationStatus(RegistrationStatus.FAILED);
		logger.warning("Failed to register - " + c.getExperianData().getId());
	}
}
