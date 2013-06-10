package Domain;

import java.util.ArrayList;
import java.util.Collections;

public class DatedValueCollection<T, T2 extends DatedValue<T>> extends ArrayList<T2> 
{
	// increment if breaking change to serializaion
	public static final long serialVersionUID = 1L;
	
	public T2 getCurrent()
	{
		if(this.size()>0)
		{
			Collections.sort(this);
			return this.get(this.size()-1);
		}
		return null;
	}
	
	public void upsert(T2 dv)
	{
		for(T2 existing : this)
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

	public void upsert(DatedValueCollection<T, T2> list)
	{
		for(T2 dv : list)
		{
			upsert(dv);
		}
	}
	
	public void setCommitted()
	{
		for(T2 dv : this)
		{
			dv.setCommitted();
		}
	}
}
