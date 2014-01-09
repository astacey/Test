package Application;

import java.util.logging.Logger;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.DnBRegistration;
import Domain.DnBRegistrationCollection;
import Domain.ICompanyRepository;
import Domain.IDnBRepository;
import Domain.RegistrationStatus;

public class DnBUnRegistrationHandler 
{
	private static Logger logger = Logger.getLogger(DnBUnRegistrationHandler.class.getName());
	private ICompanyRepository importRepository;
	private IDnBRepository dnbRepository;
	
	public DnBUnRegistrationHandler(ICompanyRepository importRepository, IDnBRepository dnbRepository)
	{
		this.importRepository = importRepository;
		this.dnbRepository = dnbRepository;
	}
	
	public void UnRegisterCompanies()
	{
		logger.info("Reading registrations.");
		DnBRegistrationCollection regs = dnbRepository.getRegistrations();
		logger.info("Read in " + regs.size() + " registrations");
		int cancelled = 0;
		for(DnBRegistration reg : regs)
		{
			// Not sure about this check, but seems sensible
			if(reg.getStatus()==RegistrationStatus.ACTIVE)
			{
				// Check if this is still in the company dataset
				// if not there, then unregister
				// if there do I need to check status ? don't think so. If duns is to be cancelled, duns is deleted from source data
				int duns = reg.getDunsNo();
				CompanyCollection c = importRepository.getCompanyByDuns(duns);
				if(c.size()==0)
				{
					logger.info("Cancelling registration for DUNS [" + duns + "].");
					dnbRepository.unRegisterCompany(duns);
					logger.info("Successfully canceled registration for DUNS [" + duns + "].");
					cancelled++;
				}
			}
		}
		logger.info("Number of registrations cancelled [" + cancelled + "].");
	}
}
