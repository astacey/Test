package Test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Domain.DatedValue;
import Domain.DatedValueCollection;

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
			
			DatedValueCollection coll = new DatedValueCollection();
			coll.add(new DatedValue(date1, 100.0));
			coll.upsert(new DatedValue(date2, 200.0));
			coll.upsert(new DatedValue(date3, 150.0));
			
			assertEquals("collection should have 2 members", 2, coll.size());
			assertEquals(200.0, coll.get(0).getValue(), 0.1);
		}
		catch(ParseException pe)
		{}
		
	}

}
