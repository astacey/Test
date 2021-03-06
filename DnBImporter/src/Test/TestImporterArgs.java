package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.ImporterArgs;

public class TestImporterArgs {

	@Test
	public void testAll() {
		
		String[] args = new String[]{ "-rdnb", "-u", "user", "-p", "password", "-xabw", "testabwpath", "-rexperian", "-xexperian", "-delimiter", ";" };
		ImporterArgs impArgs = new ImporterArgs(args);
		
		assertTrue("IsDnBRegistrationSelected is true", impArgs.getIsDnBRegistrationSelected());
		assertTrue("IsExperianRegistrationSelected is true", impArgs.getIsExperianRegistrationSelected());
		assertEquals("user name", "user", impArgs.getUserName());
		assertEquals("password", "password", impArgs.getPassword());
		assertFalse("IsDnBUpdate is false", impArgs.getIsDnBUpdate());
		assertTrue("IsABWUpdate is true", impArgs.getIsABWUpdate());
		assertEquals("ABW update Source is ", "testabwpath", impArgs.getAbwUpdateFolder());
		assertTrue("IsExperianUpdate is true", impArgs.getIsExperianUpdate());
		
		assertTrue("delimiter is ;", ';'==impArgs.getDelimiter());
		
		impArgs = new ImporterArgs(new String[] { "-xDnB" });
		assertTrue("IsUpdate is true", impArgs.getIsDnBUpdate());
	}

	@Test
	public void testunregister()
	{
		String[] args = new String[]{ "-urdnb" };
		ImporterArgs impArgs = new ImporterArgs(args);
		assertTrue("unregister d&B is true", impArgs.getIsDnBUnRegistrationSelected());
	}
	
	@Test
	public void testDefaults()
	{
		String[] args = new String[]{};
		ImporterArgs impArgs = new ImporterArgs(args);
		assertFalse("unregister d&B is false by default", impArgs.getIsDnBUnRegistrationSelected());
		
	}
}
