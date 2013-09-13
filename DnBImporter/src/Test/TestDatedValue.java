package Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import Domain.DatedValue;

public class TestDatedValue 
{

	@Test
	public void testBasic() throws ParseException
	{
		// dates should be same regardless of time
		DatedValue<Double> dv = new DatedValue<Double>(new Date(), 1.01);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		assertEquals("dates should be equal, because time ignored", cal.getTime(), dv.getDate());
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt1 = formatter.parse("2012-01-01 13:33:33");
		dv = new DatedValue<Double>(dt1, 1.01);
		assertEquals("dates should be equal, because time is ignored in datedvalue", formatter.parse("2012-01-01 00:00:00"), dv.getDate());
	}
	
	@Test
	public void testCommitted() 
	{
		DatedValue<Double> dv = new DatedValue<Double>(new Date(), 100.01);
		dv.setCommitted();
		
		dv.setValue(100.01);
		//committed should still be tru because the value hasn't changed
		assertEquals("committed should be true", true, dv.getIsCommitted());
		
		dv.setValue(100.02);
		assertEquals("committed should be false", false, dv.getIsCommitted());
	}
	
	@Test
	public void testCompareDatesOnly() throws ParseException
	{
		// comparison should be on the date only - i.e. ignore the time portion ( 2012-01-01 00:00:00 = 2012-01-01 12:00:00 )
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dt1 = formatter.parse("2012-01-01 00:00:00");
		Date dt2 = formatter.parse("2012-01-01 12:00:00");
		
		DatedValue<Integer> datedValue1 = new DatedValue<Integer>(dt1, 1);
		DatedValue<Integer> datedValue2 = new DatedValue<Integer>(dt2, 2);
		
		assertEquals("Dates should be equal", 0, datedValue1.compareTo(datedValue2));
	}
}
