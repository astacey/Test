package Application;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Logger;

import ApplicationUI.DnBImportForm;
import Domain.IDnBRepository;
import Domain.ICompanyRepository;


public class EntryPoint 
{
	private static Logger logger = Logger.getLogger(EntryPoint.class.getName());
	// Entry point 
	public static void main(String[] args) 
	{
		// TODO: move these into their own init experian class ?
		System.setProperty("javax.net.ssl.keyStoreType", "jks");
		System.setProperty("javax.net.ssl.keyStore", "/home/astacey/Experian/UNITUnit4U01U.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "Caste11");
		System.setProperty("javax.net.debug","all");
		
		if(args.length == 0)
		{
			// if no arguments, launch the GUI
			runWindow();	
		}
		else
		{
			ImporterArgs impArgs = new ImporterArgs(args);
			try 
			{
				ImporterLogging.setup();
			}
			catch (IOException e) 
			{
				logger.severe(e.getMessage());
				throw new RuntimeException("Problems with creating the log files", e);
			}
			try 
			{
				logger.info("Starting runCommand");
				runCommandLine(impArgs);
				logger.info("Finished runCommand");
			}
			catch (Exception e) 
			{
				logger.severe(e.getMessage());
				throw new RuntimeException("Error executing command", e);
			}
		}
	}
	
	private static void runWindow()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnBImportForm frame = new DnBImportForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void runCommandLine(ImporterArgs args)
	{
		IDnBRepository dnbRepo = new DnBWebServiceRepository( args.getUserName(), args.getPassword() );
		IImporterSettingsRepository settingsRepo = new FileImporterSettingsRepository();
		// get settings
		ImporterSettings settings = settingsRepo.getSettings();
		ICompanyRepository companyRepo = new SupplierAppCSVCompanyRepository(settings.getCsvLocation());			

		// Think this will become obsolete or be a specific DnB initial upload
		// TODO: probably move the initial download of dnb data to the register function ?
		if(args.getIsInitialUpload() == true)
		{
			ICompanyRepository companySourceRepo = new ABWCSVCompanyRepository(args.getImportSourceFile());
			if( args.getImportSource().equalsIgnoreCase("DnB") )
				companySourceRepo = new DnBCSVCompanyRepository(args.getImportSourceFile());
			logger.info("Starting Initial Upload, source = " + companySourceRepo.toString());
			InitialUploadHandler initial = new InitialUploadHandler(companyRepo, dnbRepo, settings, companySourceRepo);
			initial.downloadAllCompanies();
			logger.info("Finished Initial Upload");
		}
		if(args.getIsPrepareABWCSV() == true)
		{
			logger.info("Start preparing ABW CSV");
			ABWUpdateCSVPrepare csvPrep = new ABWUpdateCSVPrepare();
			csvPrep.extractCsvFromExcel(args.getAbwUpdateFolder());
			logger.info("Finished preparing ABW CSV");
		}
		if(args.getIsABWUpdate() == true)
		{
			logger.info("Starting ABW Update");
			ICompanyRepository companySourceRepo = new ABWXlsxCompanyRepository(args.getAbwUpdateFolder(), args.getClientFilter());
			ABWUpdateHandler abwHandler = new ABWUpdateHandler(companyRepo, companySourceRepo);
			abwHandler.getUpdates();
			logger.info("Finihed ABW Update");
		}
		// if initial upload then we will need registering
		// probably want registration to be run every day
		// uncomment out the getIsUpdate() once I've got registration status management working
		if(args.getIsRegistrationSelected() == true )//|| args.getIsInitialUpload() == true ) //|| args.getIsUpdate() == true) 
		{
			logger.info("Starting RegistrationHandler");
			RegistrationHandler handler = new RegistrationHandler(companyRepo, dnbRepo);
			handler.RegisterCompanies();
			logger.info("Finished RegistrationHandler");
		}
		// if daily update selected then ...
		if(args.getIsDnBUpdate() == true)
		{
			logger.info("Starting DnB Update");
			DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settings);
			handler.getUpdates();
			logger.info("Finihed DnB Update");
		}
		// Experian
		if(args.getIsExperianUpdate())
		{
			logger.info("Starting Experian Update");
			ExperianConnectionTest test = new ExperianConnectionTest();
			test.test();
			logger.info("Finished Experian Update");
		}		
		// Save settings
		settingsRepo.saveSettings(settings);		
	}
}
