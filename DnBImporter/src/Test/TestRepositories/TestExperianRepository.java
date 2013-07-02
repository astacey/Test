package Test.TestRepositories;

import java.util.ArrayList;
import java.util.Date;

import Domain.ExperianData;
import Domain.ExperianLegalStatus;
import Domain.IExperianRepository;

public class TestExperianRepository implements IExperianRepository 
{
	private String[] failToRegister = new String[]{};
	@Override
	public Boolean registerCompany(String ref, ExperianLegalStatus status) 
	{
		for(String s : failToRegister)
		{
			if(s.equalsIgnoreCase(ref))
				return false;
		}
		return true;
	}

	@Override
	public ExperianData getCompanyDetails(String ref, ExperianLegalStatus status) 
	{
		return null;
	}

	@Override
	public ArrayList<ExperianData> getCompanyUpdates(Date startDate, Date endDate) throws Exception 
	{
		return null;
	}

	public String[] getFailToRegister() {
		return failToRegister;
	}

	public void setFailToRegister(String[] failToRegister) {
		this.failToRegister = failToRegister;
	}

	
	
}
