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
	// 3. If any have been registered, update the registration status
	// 4. register any that are left
	public void RegisterCompanies()
	{
		logger.info("Getting unregistered duns");
		int active=0, pending=0, failed=0, oob=0, tradeups=0;
		
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
				if( reg == null || reg.getStatus()==RegistrationStatus.CANCELLED || reg.getStatus()==RegistrationStatus.FAILED)
				{
					logger.info("Registering duns - " + duns);
					Boolean registered = false;
					try
					{
						registered = dnbRepository.registerCompany(duns);
					}
					catch(Exception e)
					{
						logger.warning("Error registering DUNS [" + duns + "] :" + e.getMessage());
					}
					if( registered == true)
					//if( dnbRepository.registerCompany(duns) == true )
					{
						logger.info("Registered duns - " + duns);
						// Save status as PENDING - don't bother checking the return value, it'll always be pending ( unless error ).
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.PENDING);
						pending++;
					}
					else
					{
						logger.warning("Failed to register duns - " + duns);
						// Save status as failed
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.FAILED);
						failed++;
						// Check the company out of business indicator to see if it should be flagged as inactive
						// Also, check for a "Trade-Up". This is when our company has been matched to a branch, not the real company.
						// It looks like the way to tell is to compare the duns returned in the getdata request. If it's not the same as the one requested, then we're in a trade up situation
						try
						{
							DnBData dnbData = dnbRepository.getCompanyDetails(duns);
							// Check for different duns here
							// I shouldn't have to worry about the duns changing here in relation to existing facts - since this hasn't been registered successfully yet, there should be no facts
							if(dnbData != null)
							{
								if(dnbData.getDunsNumber()!=unregisteredCompany.getDunnBradstreetData().getDunsNumber())
								{
									unregisteredCompany.getDunnBradstreetData().tradeUp(dnbData.getDunsNumber());
									tradeups++;
								}
								else if(dnbData.getOutOfBusiness()==true)
								{
									unregisteredCompany.getDunnBradstreetData().setOutOfBusiness(true);
									oob++;
								}
							}
						}
						catch(Exception e)
						{
							logger.warning("Error checking Out of Business for DUNS [" + duns + "] :" + e.getMessage());
						}
					}
				}
				else
				{
					// Save status
					if(reg.getStatus()==RegistrationStatus.ACTIVE)
					{
						// if it comes back as active, set status to registered. This lets the update routine know that it should download the full snapshot of data for this company
						// , prior to checking for updates. The update routine will then set the status to active and we're up and running 
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.REGISTERED);
						active++;
					}
					else
					{
						unregisteredCompany.getDunnBradstreetData().getRegistrationDetails().setStatus(reg.getStatus());
						if(reg.getStatus()==RegistrationStatus.PENDING)
							pending++;
					}
					logger.info("Skipped registration for duns - " + duns + ", status is currently - " + reg.getStatus().toString());
				}
				importRepository.saveCompany(unregisteredCompany);
			}
			logger.info("Found " + unregisteredDuns.size() + " unregistered duns. Read in " + regs.size() + " registrations. Active = " + String.valueOf(active) +" Pending = " + String.valueOf(pending) +" Failed = " + String.valueOf(failed) +", Out Of Business = " + String.valueOf(oob) + ", Trade Ups = " + String.valueOf(tradeups) + ".");
		}
		
		importRepository.commitAllChanges();
	}
}
