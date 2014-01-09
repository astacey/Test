package Test.TestRepositories;

import java.util.ArrayList;
import java.util.Date;

import Domain.DnBData;
import Domain.DnBRating;
import Domain.DnBRegistration;
import Domain.DnBRegistrationCollection;
import Domain.IDnBRepository;
import Domain.IntegerDatedValue;
import Domain.RegistrationStatus;
import Domain.SICCode;

public class TestDnBRepository implements IDnBRepository 
{
	private DnBRegistrationCollection testRegistrations;
	private ArrayList<DnBData> testCompanyUpdates;
	private DnBData testCompanyDetails;
	
	@Override
	public Boolean registerCompany(int dunsNumber) {
		return true;
	}

	@Override
	public Boolean unRegisterCompany(int dunsNumber) 
	{
		for(DnBRegistration reg : testRegistrations)
		{
			if(reg.getDunsNo()==dunsNumber)
				reg.setStatus(RegistrationStatus.CANCELLED);
		}
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
		if( this.testCompanyDetails == null )
		{
			// Test class - always returns test data....
			// this is the default, but user can specify
			DnBData data = new DnBData(dunsNumber);
			data.getDbratingHistory().add(new DnBRating("1A"));
			data.getFailureRiskScoreHistory().add(new IntegerDatedValue(new Date(), 1578)); 
			data.getFailureRiskPercentileHistory().add(new IntegerDatedValue(new Date(), 100));
			data.setName("Unit 4 - Test Class");
			data.getPaydexScoreHistory().add(new IntegerDatedValue(new Date(), 64));
			data.getPaydexNormHistory().add(new IntegerDatedValue(new Date(), 75));
			data.setPrimarySicCode(SICCode.SIC7379);//7379
			return data;
		}
		return this.testCompanyDetails;
	}

	@Override
	public ArrayList<DnBData> getCompanyUpdates(Date startDate, Date endDate) 
	{
		if(testCompanyUpdates != null)
		{
			return testCompanyUpdates;
		}
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

	public ArrayList<DnBData> getTestCompanyUpdates() {
		return testCompanyUpdates;
	}

	public void setTestCompanyUpdates(ArrayList<DnBData> testCompanyUpdates) {
		this.testCompanyUpdates = testCompanyUpdates;
	}
	
	public void setTestCompanyDetails(DnBData testData)
	{
		this.testCompanyDetails = testData;
	}

}
