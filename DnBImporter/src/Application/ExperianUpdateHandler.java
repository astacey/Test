package Application;

import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.soap.SOAPException;

import Domain.*;

public class ExperianUpdateHandler 
{
	private static Logger logger = Logger.getLogger(ExperianUpdateHandler.class.getName());

	private ICompanyRepository companyRepo;
	private IExperianRepository experianRepo;
	private ImporterSettings settings;
	
	public ExperianUpdateHandler(ICompanyRepository companyRepository, IExperianRepository experianRepository, ImporterSettings settings)
	{
		this.companyRepo=companyRepository;
		this.experianRepo=experianRepository;
		this.settings=settings;
	}
	
	// 1. check for companies that require initial download
	// 2. check for daily updates and apply
	public void getUpdates()
	{
		// 1. download data for companies that need initial seeding
		getInitialUpdates();
		// // 2. Get Updates
		Date startDate = settings.getLastRunDateExperian();
		Date endDate = getEndDate();
		getUpdates(startDate, endDate);
		// Commit
		companyRepo.commitAllChanges();
		// settings
		settings.setLastRunDateExperian(endDate);
	}
	
	private Boolean getUpdates(Date start, Date end)
	{
		try 
		{
			for(ExperianData updatedData : experianRepo.getCompanyUpdates(start, end))
			{
				CompanyCollection companiesToUpdate = companyRepo.getCompaniesByExperianReference(updatedData.getId());
				if(companiesToUpdate.size()>0)
				{
					updatedData.setRegistrationStatus(RegistrationStatus.ACTIVE);
					for(Company c : companiesToUpdate)
					{	
						updateCompanyData(c, updatedData);
						companyRepo.saveCompany(c);
					}
				}
				else
				{
					logger.warning("Received data for Experian Ref that does not exist [" + updatedData.getId() + "]");
				}
			}
		}
		catch (SOAPException soape) 
		{
			logger.severe("SOAP ERROR getting details for start [" + start + "] end [" + end + "]: " + soape.getMessage());
			return false;
		}
		catch ( Exception e)
		{
			logger.severe("ERROR getting details for start [" + start + "] end [" + end + "] : " + e.getMessage());
			return false;
		}
		return true;
	}
	
	private void updateCompanyData(Company c, ExperianData updatedData)
	{
		if(c.getExperianData()!=null) // should never be null at this point, but just in case
		{
			c.getExperianData().setName(updatedData.getName());
			c.getExperianData().getDelphiScores().upsert(updatedData.getDelphiScores());
			c.getExperianData().getDelphiScoresIndustryAverage().upsert(updatedData.getDelphiScoresIndustryAverage());
			c.getExperianData().getDaysBeyondTerms().upsert(updatedData.getDaysBeyondTerms());
			c.getExperianData().getDaysBeyondTermsIndustryAverage().upsert(updatedData.getDaysBeyondTermsIndustryAverage());
		}
	}
	
	private void getInitialUpdates()
	{
		CompanyCollection comps = companyRepo.getCompaniesForInitialUpdateExperian();
		int compsToGet = comps.size(), success=0, fail=0;
		for(Company c : comps)
		{
			ExperianData data = experianRepo.getCompanyDetails(c.getExperianData().getId(), c.getExperianData().getLegalStatus());
			if( data != null )
			{
				data.setRegistrationStatus(RegistrationStatus.ACTIVE);
				c.setExperianData(data);
				success++;
			}
			else
			{
				// Something went wrong, probably an error that will be logged in lower class
				fail++;
			}
		}
		logger.info("Companies to get = " + String.valueOf(compsToGet) + ", " + String.valueOf(success) + " success, " + String.valueOf(fail) + "fail.");
	}
	
	private Date getEndDate()
	{
		// End date is yesterday ? They don't do time at experian just CCYYMMDD
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}
}
