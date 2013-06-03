package Domain;

import java.util.Date;

public class DatedValue implements Comparable<DatedValue>
{
	private Date date;
	private double value;
	
	public DatedValue(Date date, double value)
	{
		this.date=date;
		this.value=value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public int compareTo(DatedValue datedValue) 
	{
		return this.date.compareTo(datedValue.getDate());
	}
}
