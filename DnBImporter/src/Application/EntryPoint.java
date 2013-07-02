package Application;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Logger;

import ApplicationUI.DnBImportForm;
import Domain.IDnBRepository;
import Domain.ICompanyRepository;
import Domain.IExperianRepository;


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
//		System.setProperty("javax.net.debug","all");
		
		if(args.length == 0)
		{
			// if no arguments, launch the GUI
			runWindow();	
		}
		else
		{
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
				ImporterArgs impArgs = new ImporterArgs(args);
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
	
	private static void runCommandLine(ImporterArgs args) throws Exception
	{
		IDnBRepository dnbRepo = new DnBWebServiceRepository( args.getUserName(), args.getPassword() );
		IExperianRepository experianRepo = new ExperianWebServcieRepository();
		IImporterSettingsRepository settingsRepo = new FileImporterSettingsRepository();
		// get settings
		ImporterSettings settings = settingsRepo.getSettings();
		ICompanyRepository companyRepo = new SupplierAppCSVCompanyRepository(settings.getCsvLocation());			

		if(args.getIsBulkMapping() == true)
		{
			logger.info("Starting Bulk Upload");
			BulkMappingUpload bmu = new BulkMappingUpload(companyRepo, args.getBulkMappingFile(), args.getMasterId(), args.getMappingId(), args.getMappingType());
			bmu.uploadMappings();
			logger.info("Finished Bulk Upload");
		}
		// Think this will become obsolete or be a specific DnB initial upload
		// TODO: probably move the initial download of dnb data to the register function ?
		if(args.getIsInitialUpload() == true)
		{
			ICompanyRepository companySourceRepo = new ABWCSVCompanyRepository(args.getImportSourceFile());
			if( args.getImportSource().equalsIgnoreCase("DnB") )
				companySourceRepo = new DnBCSVCompanyRepository(args.getImportSourceFile());
			logger.info("Starting Initial Upload, source = " + companySourceRepo.toString());
			DnBInitialUploadHandler initial = new DnBInitialUploadHandler(companyRepo, dnbRepo, settings, companySourceRepo);
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
		if(args.getIsDnBRegistrationSelected() == true )//|| args.getIsInitialUpload() == true ) //|| args.getIsUpdate() == true) 
		{
			logger.info("Starting DnB Registration");
			DnBRegistrationHandler handler = new DnBRegistrationHandler(companyRepo, dnbRepo);
			handler.RegisterCompanies();
			logger.info("Finished DnB Registration");
		}
		if(args.getIsExperianRegistrationSelected() == true ) 
		{
			logger.info("Starting Experian Registration");
			ExperianRegistrationHandler handler = new ExperianRegistrationHandler(companyRepo, experianRepo);
			handler.RegisterCompanies();
			logger.info("Finished Experian registration");
		}
		// if daily update selected then ...
		if(args.getIsDnBUpdate() == true)
		{
			logger.info("Starting DnB Update");
			DnBUpdateHandler handler = new DnBUpdateHandler(companyRepo, dnbRepo, settings);
			handler.getUpdates();
			logger.info("Finihed DnB Update");
		}
		// Experian updates
		if(args.getIsExperianUpdate())
		{
			logger.info("Starting Experian Update");
			ExperianUpdateHandler handler = new ExperianUpdateHandler(companyRepo, experianRepo, settings);
			handler.getUpdates();
			logger.info("Finished Experian Update");
		}
		// Save settings
		settingsRepo.saveSettings(settings);		
	}
}
