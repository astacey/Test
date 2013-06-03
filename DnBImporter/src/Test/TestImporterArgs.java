package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Application.ImporterArgs;

public class TestImporterArgs {

	@Test
	public void testAll() {
		
		String[] args = new String[]{ "-iDnB", "c:/DnBImporter/", "-r", "-u", "user", "-p", "password", "-xabw", "testabwpath" };
		ImporterArgs impArgs = new ImporterArgs(args);
		
		assertTrue("IsInitialUpload is true", impArgs.getIsInitialUpload());
		assertEquals("import source is dnb", "DnB", impArgs.getImportSource());		
		assertTrue("IsRegistrationSelected is true", impArgs.getIsRegistrationSelected());
		assertEquals("user name", "user", impArgs.getUserName());
		assertEquals("password", "password", impArgs.getPassword());
		assertFalse("IsDnBUpdate is false", impArgs.getIsDnBUpdate());
		assertEquals("Import Source is ", "c:/DnBImporter/", impArgs.getImportSourceFile());
		assertTrue("IsABWUpdate is true", impArgs.getIsABWUpdate());
		assertEquals("ABW update Source is ", "testabwpath", impArgs.getAbwUpdateFolder());
		
		impArgs = new ImporterArgs(new String[] { "-x" });
		assertTrue("IsUpdate is true", impArgs.getIsDnBUpdate());
	}

}
