package Domain;

import java.util.ArrayList;
import java.util.Date;

public interface IDnBRepository 
{
	Boolean registerCompany(int dunsNumber);
	DnBRegistrationCollection getRegistrations();
	DnBData getCompanyDetails(int dunsNumber);
	ArrayList<DnBData> getCompanyUpdates(Date startDate, Date endDate);
}
