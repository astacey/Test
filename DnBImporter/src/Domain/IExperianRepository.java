package Domain;

import java.util.ArrayList;
import java.util.Date;

public interface IExperianRepository 
{
	Boolean registerCompany(String ref, ExperianLegalStatus status);
	ExperianData getCompanyDetails(String ref, ExperianLegalStatus status);
	ArrayList<ExperianData> getCompanyUpdates(Date startDate, Date endDate) throws Exception;
}