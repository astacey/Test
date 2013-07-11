package Domain;

import java.util.ArrayList;
import java.util.Collections;

public class CompanyCollection extends ArrayList<Company>
{
	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;
	
	public CompanyCollection getCompaniesFromDunsNumber(int dunsNumber)
	{
		CompanyCollection matches = new CompanyCollection();
		for(Company c : this)
		{
			if(c.hasDunnBradstreetData()&&c.getDunnBradstreetData().getDunsNumber()==dunsNumber)
			{
				matches.add(c);
			}
		}
		return matches;
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
			if(this.get(i).getId().equals(c.getId()))
			{
				this.set(i, c);
				return true;
			}
		}
		return false;
	}
	
	public void setCommitted()
	{
		for(Company c:this)
		{
			c.setCommitted();
		}
	}
	
	public void sortByOpenBalance()
	{
		Collections.sort(this);
	}
}
