package Domain;

import java.util.ArrayList;

public class CompanyCollection extends ArrayList<Company>
{

	public Company getCompanyFromDunsNumber(int dunsNumber)
	{
		for(Company c : this)
		{
			if(c.hasDunnBradstreetData()&&c.getDunnBradstreetData().getDunsNumber()==dunsNumber)
			{
				return c;
			}
		}
		return null;
	}
	
	public Company getCompanyFromId(String id)
	{
		for(Company c : this)
		{
			if(c.getId().equalsIgnoreCase(id))
			{
				return c;
			}
		}
		return null;
	}
	
	// Searches for company by Id and if found, updates it
	// returns true if updated, false if not in collection
	public Boolean updateCompany(Company c)
	{
		for(int i=0;i<this.size();i++)
		{
			if(this.get(i).getId()==c.getId())
			{
				this.set(i, c);
				return true;
			}
		}
		return false;
	}
}
