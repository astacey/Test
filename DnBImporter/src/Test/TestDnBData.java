package Test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import Domain.CompanyType;
import Domain.DnBData;
import Domain.DnBFailureRisk;
import Domain.DnBPaydex;
import Domain.DnBRating;

public class TestDnBData {

	@Test
	public void testGetCurrentPaydex() 
	{
		
		DnBData data = new DnBData(200);
		Calendar cal = Calendar.getInstance();

		cal.set(2013, 3, 1);
		data.getPaydexHistory().add(new DnBPaydex(100, 100, cal.getTime() ));
		assertEquals("1. current doesn't match", 100, data.getCurrentPaydex().getPaydex());
		
		cal.set(2013, 0, 1);
		data.getPaydexHistory().add(new DnBPaydex(1, 1, cal.getTime() ));
		assertEquals("2. current doesn't match", 100, data.getCurrentPaydex().getPaydex());
		
		cal.set(2013, 5, 1);
		data.getPaydexHistory().add(new DnBPaydex(1000, 1000, cal.getTime() ));
		assertEquals("3. current doesn't match", 1000, data.getCurrentPaydex().getPaydex());
		
	}

	@Test
	public void testGetCurrentFailureRisk() 
	{
		
		DnBData data = new DnBData(200);
		Calendar cal = Calendar.getInstance();

		cal.set(2013, 3, 1);
		data.getFailureRiskHistory().add(new DnBFailureRisk(100, 100, cal.getTime() ));
		assertEquals("1. current doesn't match", 100, data.getCurrentFailureRisk().getFailureRisk());
		
		cal.set(2013, 0, 1);
		data.getFailureRiskHistory().add(new DnBFailureRisk(1, 1, cal.getTime() ));
		assertEquals("2. current doesn't match", 100, data.getCurrentFailureRisk().getFailureRisk());
		
		cal.set(2013, 5, 1);
		data.getFailureRiskHistory().add(new DnBFailureRisk(1000, 1000, cal.getTime() ));
		assertEquals("3. current doesn't match", 1000, data.getCurrentFailureRisk().getFailureRisk());
		
	}

	@Test
	public void testGetCurrentDBRating() 
	{
		
		DnBData data = new DnBData(200);
		Calendar cal = Calendar.getInstance();

		cal.set(2013, 3, 1);
		data.getDbratingHistory().add(new DnBRating("A1", cal.getTime() ));
		assertEquals("1. current doesn't match", "A1", data.getCurrentRating().getRating());
		
		cal.set(2013, 0, 1);
		data.getDbratingHistory().add(new DnBRating("5A1", cal.getTime() ));
		assertEquals("2. current doesn't match", "A1", data.getCurrentRating().getRating());
		
		cal.set(2013, 5, 1);
		data.getDbratingHistory().add(new DnBRating("C2", cal.getTime() ));
		assertEquals("3. current doesn't match", "C2", data.getCurrentRating().getRating());
		
	}
	
	@Test
	public void testToString()
	{
		DnBData data = new DnBData(200);
		String actual = data.toString(); 
		// Add real test later, just putting this here to remind me it's broken !
		assertTrue("It Didn't error",true );
	}
}
