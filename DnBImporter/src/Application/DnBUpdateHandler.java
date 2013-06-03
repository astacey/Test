package Application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

import Domain.Company;
import Domain.DnBData;
import Domain.ICompanyRepository;
import Domain.IDnBRepository;

public class DnBUpdateHandler 
{
	private static Logger logger = Logger.getLogger(DnBUpdateHandler.class.getName());
	private ICompanyRepository u4baCompanyRepository;
	private IDnBRepository dnbRepository;
	private ImporterSettings settings;

	public DnBUpdateHandler(ICompanyRepository u4baCompanyRepository, IDnBRepository dnbRepository, ImporterSettings settings)
	{
		this.u4baCompanyRepository = u4baCompanyRepository;
		this.dnbRepository = dnbRepository;
		this.settings = settings;
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
	public void getUpdates()
	{
		// Get Updates
		Date startDate = settings.getLastRunDate();
		Date endDate = getEndDate();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		formatter.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
		
		do
		{
			Date nextDate = getNextDate(startDate, endDate);
			logger.info("Getting updates for [" + formatter.format(startDate) + " EST] to [" + formatter.format(nextDate) + " EST]");
			getUpdates(startDate, nextDate);
			startDate=nextDate;	
		}
		while(startDate.before(endDate));
		
		u4baCompanyRepository.commitAllChanges();
		
		// Save LastRunDate
		settings.setLastRunDate(endDate);
	}
	
	private void getUpdates(Date startDate, Date endDate)
	{
		ArrayList<DnBData> updates = dnbRepository.getCompanyUpdates(startDate, endDate);
		
		// Write data
		for(DnBData data : updates)
		{
			int dunsNumber = data.getDunsNumber();
			try
			{
				Company c = u4baCompanyRepository.getCompanyByDuns(dunsNumber);
				if(c == null)
				{
					logger.warning("Received data for a duns that doesn't exist in the system. Investigate. Duns [" + String.valueOf(dunsNumber) + "]");
				}
				else
				{
					c.setDunnBradstreetData(data);
					u4baCompanyRepository.saveCompany(c);
				}
			}
			catch(Exception e)
			{
				logger.warning("Company failed duns - " + String.valueOf(dunsNumber));
				logger.warning(e.getMessage());
				e.printStackTrace();
			}
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
}
