package Domain;

import java.util.Date;

public class DatedValue<T> implements Comparable<DatedValue<T>>
{
	private Date date;
	private T value;
	private Boolean isCommitted = false;
	
	public DatedValue(Date date, T value)
	{
		this.date=date;
		this.value=value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
		this.isCommitted = false;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		if(!this.value.equals(value))
		{
			this.value = value;
			this.isCommitted = false;
		}
	}

	public Boolean getIsCommitted()
	{
		return this.isCommitted;
	}	
	
	public void setCommitted()
	{
		this.isCommitted=true;
	}
	
	@Override
	public int compareTo(DatedValue<T> datedValue) 
	{
		return this.date.compareTo(datedValue.getDate());
	}
}
