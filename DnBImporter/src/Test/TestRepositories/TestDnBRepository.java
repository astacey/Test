package Test.TestRepositories;

import java.util.ArrayList;
import java.util.Date;

import Domain.DnBData;
import Domain.DnBRating;
import Domain.DnBRegistrationCollection;
import Domain.IDnBRepository;
import Domain.IntegerDatedValue;

public class TestDnBRepository implements IDnBRepository 
{
	private DnBRegistrationCollection testRegistrations;
	
	@Override
	public Boolean registerCompany(int dunsNumber) {
		return true;
	}

	@Override
	public DnBRegistrationCollection getRegistrations() 
	{
		return testRegistrations;
	}

	@Override
	public DnBData getCompanyDetails(int dunsNumber) 
	{
		// Test class - always returns test data....
		DnBData data = new DnBData(dunsNumber);
		data.getDbratingHistory().add(new DnBRating("1A"));
		data.getFailureRiskScoreHistory().add(new IntegerDatedValue(new Date(), 1578)); 
		data.getFailureRiskPercentileHistory().add(new IntegerDatedValue(new Date(), 100));
		data.setName("Unit 4 - Test Class");
		data.getPaydexScoreHistory().add(new IntegerDatedValue(new Date(), 64));
		data.getPaydexNormHistory().add(new IntegerDatedValue(new Date(), 75));
		data.setPrimarySicCode(7379);
		return data;
	}

	@Override
	public ArrayList<DnBData> getCompanyUpdates(Date startDate, Date endDate) 
	{
		
		DnBData data = new DnBData(100);
		data.setName("Unit 4 - Test Class");
		data.getPaydexScoreHistory().add(new IntegerDatedValue(new Date(), 77));
		data.setOutOfBusiness(true);
		ArrayList<DnBData> updates = new ArrayList<DnBData>();
		updates.add(data);
		return updates;
	}

	public void setTestRegistrations(DnBRegistrationCollection testRegistrations) {
		this.testRegistrations = testRegistrations;
	}

}
