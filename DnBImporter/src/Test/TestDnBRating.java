package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Domain.DnBRating;

public class TestDnBRating {

	@Test
	public void testGetRiskIndicator() 
	{
		DnBRating data = new DnBRating("A2");
		
		assertEquals("A2 equals 2", 2, data.getRiskIndicator());
		data = new DnBRating("5A1");
		
		assertEquals("5A1 equals 1", 1, data.getRiskIndicator());
		
		data = new DnBRating("1");
		assertEquals("1 equals 1", 1, data.getRiskIndicator());
	}
}
