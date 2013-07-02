package Application;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import WebServiceClients.ExperianAlertsAddRemoveClient;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IExperianRepository;

public class ExperianWebServcieRepository implements IExperianRepository 
{
	private static Logger logger = Logger.getLogger(ExperianWebServcieRepository.class.getName());

	@Override
	public Boolean registerCompany(String ref, ExperianLegalStatus status) 
	{
		ExperianAlertsAddRemoveClient client = new ExperianAlertsAddRemoveClient();
		try
		{
			return client.addAlert(ref, status);
		}
		catch(Exception e)
		{
			logger.severe("Error trying to register ref [" + ref + "] ERROR : " + e.getMessage());
		}
		return false;
	}

	@Override
	public ExperianData getCompanyDetails(String ref, ExperianLegalStatus status) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ExperianData> getCompanyUpdates(Date startDate, Date endDate) throws Exception 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
