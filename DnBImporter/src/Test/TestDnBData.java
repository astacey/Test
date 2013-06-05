package Test;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import Domain.DnBData;
import Domain.DnBRating;
import Domain.IntegerDatedValue;

public class TestDnBData {

	@Test
	// TOTO: due to refactor, this test should be moved to a Testdatedvaluecollection test class
	// leave for now for simplicity
	public void testGetCurrentPaydex() 
	{
		
		DnBData data = new DnBData(200);
		Calendar cal = Calendar.getInstance();

		cal.set(2013, 3, 1);
		data.getPaydexScoreHistory().add(new IntegerDatedValue(cal.getTime(), 100));
		assertTrue("1. current doesn't match", 100 == data.getPaydexScoreHistory().getCurrent().getValue());
		
		cal.set(2013, 0, 1);
		data.getPaydexScoreHistory().add(new IntegerDatedValue(cal.getTime(), 1));
		assertTrue("2. current doesn't match", 100 == data.getPaydexScoreHistory().getCurrent().getValue());
		
		cal.set(2013, 5, 1);
		data.getPaydexScoreHistory().add(new IntegerDatedValue(cal.getTime(), 1000));
		assertTrue("3. current doesn't match", 1000 == data.getPaydexScoreHistory().getCurrent().getValue());
	}

	@Test
	public void testGetCurrentFailureRisk() 
	{
		
		DnBData data = new DnBData(200);
		Calendar cal = Calendar.getInstance();

		cal.set(2013, 3, 1);
		data.getFailureRiskScoreHistory().add(new IntegerDatedValue(cal.getTime(),100 ));
		assertTrue("1. current doesn't match", 100==data.getFailureRiskScoreHistory().getCurrent().getValue());
		
		cal.set(2013, 0, 1);
		data.getFailureRiskScoreHistory().add(new IntegerDatedValue(cal.getTime(),1 ));
		assertTrue("2. current doesn't match", 100==data.getFailureRiskScoreHistory().getCurrent().getValue());
		
		cal.set(2013, 5, 1);
		data.getFailureRiskScoreHistory().add(new IntegerDatedValue(cal.getTime(),1000 ));
		assertTrue("3. current doesn't match", 1000==data.getFailureRiskScoreHistory().getCurrent().getValue());
		
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
		//DnBData data = new DnBData(200);
		//String actual = data.toString(); 
		// Add real test later, just putting this here to remind me it's broken !
		assertTrue("It Didn't error",true );
	}
}
