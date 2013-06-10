package Test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import Domain.DatedValue;

public class TestDatedValue 
{

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
}
