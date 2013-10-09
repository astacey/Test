package Application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

import Domain.Company;
import Domain.CompanyCollection;
import Domain.DnBData;
import Domain.DnBRating;
import Domain.ICompanyRepository;
import Domain.IDnBRepository;
import Domain.RegistrationStatus;

public class DnBUpdateHandler 
{
	private static Logger logger = Logger.getLogger(DnBUpdateHandler.class.getName());
	private ICompanyRepository u4baCompanyRepository;
	private IDnBRepository dnbRepository;
	private ImporterSettings settings;
	private SimpleDateFormat dateFormatter;

	public DnBUpdateHandler(ICompanyRepository u4baCompanyRepository, IDnBRepository dnbRepository, ImporterSettings settings)
	{
		this.u4baCompanyRepository = u4baCompanyRepository;
		this.dnbRepository = dnbRepository;
		this.settings = settings;
		initDateFormatter();
	}
	
	/*
	 * 1. get start date
	 * 2. from date = +1 day for now ( max of current eastern time ).
	 * 3. download all changes
	 * 4. for each change, get company, update company, save company
	 * 5. 
	 * Do I need a getUpdates(Date startDate, Date endDate) ??? for manual running
	 * what would it do with lastrundate
	 * maybe just change the lastrundate to wind back, keep simple ?
	 */
	public Boolean getUpdates()
	{
		// 1. download data for companies that need initial seeding
		getInitialUpdates();
		// Get Updates
		Date startDate = settings.getLastRunDateDnB();
		Date endDate = getEndDate();
		do
		{
			Date nextDate = getNextDate(startDate, endDate);
			logger.info("Getting updates for [" + dateFormatter.format(startDate) + " EST] to [" + dateFormatter.format(nextDate) + " EST]");
			if(getUpdates(startDate, nextDate) == false)
			{
				//Problem getting updates
				return false;
			}
			startDate=nextDate;	
		}
		while(startDate.before(endDate));
		
		u4baCompanyRepository.commitAllChanges();
		
		// Save LastRunDate
		settings.setLastRunDateDnB(endDate);
		return true;
	}
	
	private void getInitialUpdates()
	{
		CompanyCollection comps = u4baCompanyRepository.getCompaniesForInitialUpdateDnB();
		int compsToGet = comps.size(), success=0, fail=0;
		for(Company c : comps)
		{
			DnBData data = dnbRepository.getCompanyDetails(c.getDunnBradstreetData().getDunsNumber());
			if( data != null )
			{
				//data.getRegistrationDetails().setStatus(RegistrationStatus.ACTIVE);
				//c.setDunnBradstreetData(data);
				// Can't just do c.setDunnBradstreetData(data); the company might already have D&B data, e.g. from file import
				updateCompanyDnBData(c, data);
				c.getDunnBradstreetData().getRegistrationDetails().setStatus(RegistrationStatus.ACTIVE);
				u4baCompanyRepository.saveCompany(c); // do I need this ?
				success++;
			}
			else
			{
				// Something went wrong, probably an error that will be logged in lower class
				fail++;
			}
		}
		logger.info("Companies to get = " + String.valueOf(compsToGet) + ", success = " + String.valueOf(success) + ", fail = " + String.valueOf(fail) + ".");
	}
	
	private Boolean getUpdates(Date startDate, Date endDate)
	{
		Boolean gotUpdates = false;
		ArrayList<DnBData> updates = new ArrayList<DnBData>();
		int numUpdates=0, updated=0, missing=0;
		try 
		{
			updates = dnbRepository.getCompanyUpdates(startDate, endDate);
			numUpdates = updates.size();
			gotUpdates = true;
		} 
		catch (Exception e1) 
		{
			logger.severe("ERROR: unable to get updates for dates [" + dateFormatter.format(startDate) + " EST] to [" + dateFormatter.format(endDate) + " EST].");
			logger.severe(e1.getMessage());
		}
		
		// Write data - if error getting updates data will be empty
		for(DnBData data : updates)
		{
			int dunsNumber = data.getDunsNumber();
			try
			{
				CompanyCollection companyMatches = u4baCompanyRepository.getCompanyByDuns(dunsNumber);
				if(companyMatches.size()==0)
				{
					logger.warning("Received data for a duns that doesn't exist in the system. Investigate. Duns [" + String.valueOf(dunsNumber) + "]");
					missing++;
				}
				else
				{
					for(Company company : companyMatches)
					{
						updated++;
						updateCompanyDnBData(company, data);
						u4baCompanyRepository.saveCompany(company);
					}
				}
			}
			catch(Exception e)
			{
				logger.warning("Company failed duns - " + String.valueOf(dunsNumber));
				logger.warning(e.getMessage());
				e.printStackTrace();
			}
		}
		logger.info("dates [" + dateFormatter.format(startDate) + " EST] to [" + dateFormatter.format(endDate) + " EST]. Number of updates = " + numUpdates + ". Missing = " + missing + ". Updated = " + updated + ".");
		return gotUpdates;
	}
	
	private void updateCompanyDnBData(Company companyToUpdate, DnBData data)
	{
		if( companyToUpdate.hasDunnBradstreetData())
		{
			for(DnBRating rat : data.getDbratingHistory())
			{
				companyToUpdate.getDunnBradstreetData().getDbratingHistory().upsert(rat);
			}
			companyToUpdate.getDunnBradstreetData().getFailureRiskScoreHistory().upsert(data.getFailureRiskScoreHistory());
			companyToUpdate.getDunnBradstreetData().getFailureRiskPercentileHistory().upsert(data.getFailureRiskPercentileHistory());
			companyToUpdate.getDunnBradstreetData().getPaydexScoreHistory().upsert(data.getPaydexScoreHistory());
			companyToUpdate.getDunnBradstreetData().getPaydexNormHistory().upsert(data.getPaydexNormHistory());
			companyToUpdate.getDunnBradstreetData().getCreditDelinquencyNationalPercentileHistory().upsert(data.getCreditDelinquencyNationalPercentileHistory());
			companyToUpdate.getDunnBradstreetData().getMaximumCreditRecommendation().upsert(data.getMaximumCreditRecommendation());
			companyToUpdate.getDunnBradstreetData().getCashLiquidAssetsHistory().upsert(data.getCashLiquidAssetsHistory());
			
			companyToUpdate.getDunnBradstreetData().setDefaultCurrency(data.getDefaultCurrency());
			companyToUpdate.getDunnBradstreetData().setMaximumCreditRecommendationCurrency(data.getMaximumCreditRecommendationCurrency());
			
			companyToUpdate.getDunnBradstreetData().setOutOfBusiness(data.getOutOfBusiness());
			
			companyToUpdate.getDunnBradstreetData().setName(data.getName());
			// TODO : Address updates
		}
		else
		{
			companyToUpdate.setDunnBradstreetData(data);
		}
	}
	
	private Date getEndDate()
	{
		// End date is current time. D&B run in eastern time
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern"));
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}
	
	private Date getNextDate(Date startDate, Date endDate)
	{
		// For now just return start + 1 day
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern"));
		cal.setTime(startDate);
		cal.add(Calendar.DAY_OF_MONTH, 1);
		Calendar endCal = Calendar.getInstance(TimeZone.getTimeZone("US/Eastern"));
		endCal.setTime(endDate);
		
		if(cal.after(endCal))
			return endDate;
		return cal.getTime();
	}
	
	private void initDateFormatter()
	{
		dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		dateFormatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
	}
}
