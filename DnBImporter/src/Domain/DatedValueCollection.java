package Domain;

import java.util.ArrayList;
import java.util.Collections;

public class DatedValueCollection extends ArrayList<DatedValue> 
{
	
	public DatedValue getCurrent()
	{
		if(this.size()>0)
		{
			Collections.sort(this);
			return this.get(this.size()-1);
		}
		return null;
	}
	
	public void upsert(DatedValue dv)
	{
		for(DatedValue existing : this)
		{
			if(existing.compareTo(dv)==0)
			{
				existing.setValue(dv.getValue());
				return;
			}
		}
		//if we get here, doesn't exist so add
		this.add(dv);
	}

	public void upsert(DatedValueCollection list)
	{
		for(DatedValue dv : list)
		{
			upsert(dv);
		}
	}
}
