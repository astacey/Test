package Application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

import javax.xml.soap.SOAPException;

import WebServiceClients.ExperianAlertsAddRemoveClient;
import WebServiceClients.ExperianAlertsRequestClient;
import WebServiceClients.ExperianLtdCompanySearchClient;
import WebServiceClients.ExperianNonLtdBusinessSearch;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IExperianRepository;
import ExperianAlertsRequestWS.AlertMessage;
import ExperianAlertsRequestWS.AlertsMessageOutput;
import ExperianLtdCompanySearchWS.LtdCompanyData;
import ExperianMappers.ExperianDataMapper;
import ExperianNonLtdBusinessSearchWS.NonLtdBusinessData;

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
		try
		{
			logger.info("Getting Company Details from Experian for ["+ ref +"," + status.getDescription() + "]");
			if(status==ExperianLegalStatus.LIMITED)
			{
				return getLtdCompanyData(ref);
			}
			else if(status==ExperianLegalStatus.NONLIMITED)
			{
				return getNonLtdCompanyData(ref);
			}
		}
		catch(SOAPException soape)
		{
			logger.severe("SOAP ERROR getting details for ref [" + ref + "] : " + soape.getMessage());
		}
		catch(Exception e)
		{
			logger.severe("ERROR getting details for ref [" + ref + "] : " + e.getMessage());
		}
		return null;
	}

	@Override
	public ArrayList<ExperianData> getCompanyUpdates(Date startDate, Date endDate) throws Exception
	{
		ArrayList<ExperianData> updates = new ArrayList<ExperianData>();
		ExperianAlertsRequestClient client = new ExperianAlertsRequestClient();
		
		logger.info("Begin getting details for start [" + getStringDate(startDate) + "] end [" + getStringDate(endDate)+ "]");
		
		AlertsMessageOutput output = client.getAlerts(startDate, endDate);
		
		if(output.getError()!=null)
		{
			String errorMessage = output.getError().getErrorCode() + " : " + output.getError().getMessage();
			logger.severe("Service returned error code for start [" + getStringDate(startDate) + "] end [" + getStringDate(endDate)+ "]. " + errorMessage);
			Exception e = new Exception(errorMessage);
			throw(e);
		}
		else
		{
			logger.info("Returned " + output.getAlertMessage().size() +  " updates for start [" + getStringDate(startDate) + "] end [" + getStringDate(endDate)+ "]");
			for(AlertMessage am : output.getAlertMessage())
			{
				ExperianData data = getCompanyDetails(am.getBusinessRef(), ExperianLegalStatus.getExperianLegalStatusFromId(am.getLegalStatus()));
				if(data!=null)
				{
					updates.add(data);
				}
				else
				{
					String errorMessage = "Unable to get data for update reference - " + am.getBusinessRef();
					logger.severe(errorMessage);
					Exception e = new Exception(errorMessage);
					throw(e);
				}
			}
		}
		
		return updates;
	}

	private ExperianData getLtdCompanyData(String ref) throws SOAPException
	{
		ExperianLtdCompanySearchClient client = new ExperianLtdCompanySearchClient();
		ExperianDataMapper mapper = new ExperianDataMapper();
		LtdCompanyData ltdCompanyData = client.getCompany(ref);
		ExperianData experianData = mapper.getExperianData(ltdCompanyData);
		return experianData;
	}
	
	private ExperianData getNonLtdCompanyData(String ref) throws SOAPException
	{
		ExperianNonLtdBusinessSearch client = new ExperianNonLtdBusinessSearch();
		ExperianDataMapper mapper = new ExperianDataMapper();
		NonLtdBusinessData nonLtdCompanyData = client.getCompany(ref);
		ExperianData experianData = mapper.getExperianData(nonLtdCompanyData);
		return experianData;
	}

	private String getStringDate(Date date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(date);
	}
}
