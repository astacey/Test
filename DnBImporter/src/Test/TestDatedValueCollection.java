package Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Domain.DatedValueCollection;
import Domain.DoubleDatedValue;

public class TestDatedValueCollection 
{

	@Test
	public void testUpsert() 
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		try
		{
			Date date1 = formatter.parse("20130301");
			Date date2 = formatter.parse("20130301");
			Date date3 = formatter.parse("20130302");
			
			DatedValueCollection<Double, DoubleDatedValue> coll = new DatedValueCollection<Double, DoubleDatedValue>();
			coll.add(new DoubleDatedValue(date1, 100.0));
			coll.upsert(new DoubleDatedValue(date2, 200.0));
			coll.upsert(new DoubleDatedValue(date3, 150.0));
			
			assertEquals("collection should have 2 members", 2, coll.size());
			assertEquals(200.0, coll.get(0).getValue(), 0.1);
		}
		catch(ParseException pe)
		{}
		
	}

}
