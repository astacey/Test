package Application;
import java.util.logging.Logger;

import Domain.*;

public class DnBRegistrationHandler 
{
	private static Logger logger = Logger.getLogger(DnBRegistrationHandler.class.getName());
	private ICompanyRepository importRepository;
	private IDnBRepository dnbRepository;
	
	public DnBRegistrationHandler(ICompanyRepository importRepository, IDnBRepository dnbRepository)
	{
		this.importRepository = importRepository;
		this.dnbRepository = dnbRepository;
	}
	
	// Register all companies that are not currently registered with D&B
	// 1. Get list of unregistered companies
	// 2. Check to see if they have been registered since last run 
	//		- there is a delay between making the AddRegistration call and the registration being activated
	// 3. If any have been registered, update the isregistered flag
	// 4. register any that are left
	public void RegisterCompanies()
	{
		logger.info("Getting unregistered duns");
		int active=0, pending=0, failed=0;
		
		CompanyCollection unregisteredDuns = importRepository.getUnregisteredDunsCompanies();
		
		if( unregisteredDuns.size() > 0 )
		{
			logger.info("Found " + unregisteredDuns.size() + " unregistered duns.");
			DnBRegistrationCollection regs = dnbRepository.getRegistrations();
			logger.info("Read in " + regs.size() + " registrations");
			
			for (Company unregisteredCompany : unregisteredDuns) 
			{
				int duns = unregisteredCompany.getDunnBradstreetData().getDunsNumber();
				
				DnBRegistration reg = regs.findByDuns(duns);
				// if no record then add
				// if cancelled, then add ???
				if( reg == null || reg.getStatus()==DnBRegistrationStatus.CANCELLED || reg.getStatus()==DnBRegistrationStatus.FAILED)
				{
					logger.info("Registering duns - " + duns);
					if( dnbRepository.registerCompany(duns) == true)
					{
						logger.info("Registered duns - " + duns);
						// Save status as PENDING - don't bother checking the return value, it'll always be pending ( unless error ).
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(DnBRegistrationStatus.PENDING);
						pending++;
					}
					else
					{
						logger.warning("Failed to register duns - " + duns);
						// Save status as failed
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(DnBRegistrationStatus.FAILED);
						failed++;
						// Check the company out of business indicator to see if it should be flagged as inactive
						DnBData dnbData = dnbRepository.getCompanyDetails(duns);
						if(dnbData.getOutOfBusiness()==true)
							unregisteredCompany.getDunnBradstreetData().setOutOfBusiness(true);
					}
				}
				else
				{
					// Save status
					unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(reg.getStatus());
					if(reg.getStatus()==DnBRegistrationStatus.ACTIVE)
						active++;
					if(reg.getStatus()==DnBRegistrationStatus.PENDING)
						pending++;
					logger.info("Skipped registration for duns - " + duns + ", status is currently - " + reg.getStatus().toString());
				}
				importRepository.saveCompany(unregisteredCompany);
			}
			logger.info("Found " + unregisteredDuns.size() + " unregistered duns. Read in " + regs.size() + " registrations. Active = " + String.valueOf(active) +" Pending = " + String.valueOf(pending) +" Failed = " + String.valueOf(failed) +".");
		}
		
		importRepository.commitAllChanges();
	}
}
