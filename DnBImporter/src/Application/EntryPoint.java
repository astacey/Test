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
			if(impArgs.getIsDebugJavax())
				System.setProperty("javax.net.debug","all");
			if(impArgs.getIsShowForm())
			{
				runWindow(impArgs);
			}
			else
			{
				logger.info("Starting runCommand");
				runCommandLine(impArgs);
				logger.info("Finished runCommand");
			}
		}
		catch (Exception e) 
		{
			logger.severe(e.getMessage());
			throw new RuntimeException("Error executing command", e);
		}
	}
	
	private static void runWindow(ImporterArgs args)
	{
		final ImporterArgs myargs = args;
		EventQueue.invokeLater(new Runnable() {
			ImporterArgs a = myargs;
			public void run() {
				try {
					DnBImportForm frame = new DnBImportForm();
					frame.setParameters(a.getUserName(), a.getPassword(), a.getJksFile(), a.getJksPassword(), a.getGUIUpdateFolder());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void runCommandLine(ImporterArgs args) throws Exception
	{
		IExperianRepository experianRepo = new ExperianWebServcieRepository();
		IImporterSettingsRepository settingsRepo = new FileImporterSettingsRepository();
		// get settings
		ImporterSettings settings = settingsRepo.getSettings();
		IDnBRepository dnbRepo = new DnBWebServiceRepository( args.getUserName(), args.getPassword(), settings.getXmlLogLocation() );
		ICompanyRepository companyRepo = new SupplierAppCSVCompanyRepository(settings.getCsvLocation());
		ExperianInitialise expInit = new ExperianInitialise();

		if(args.getIsBulkMapping() == true)
		{
			logger.info("Starting Bulk Upload");
			BulkMappingUpload bmu = new BulkMappingUpload(companyRepo, args.getBulkMappingFile(), args.getMasterId(), args.getMappingId(), args.getMappingType(), args.getMappingMatchGrade(), args.getMappingConfidence());
			bmu.setDelimiter(args.getDelimiter());
			bmu.uploadMappings();
			logger.info("Finished Bulk Upload");
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
		if(args.getIsDnBRegistrationSelected() == true ) 
		{
			logger.info("Starting DnB Registration");
			DnBRegistrationHandler handler = new DnBRegistrationHandler(companyRepo, dnbRepo);
			handler.RegisterCompanies();
			logger.info("Finished DnB Registration");
		}
		if(args.getIsDnBUnRegistrationSelected() == true ) 
		{
			logger.info("Starting DnB UnRegistration");
			//DnBRegistrationHandler handler = new DnBRegistrationHandler(companyRepo, dnbRepo);
			//handler.RegisterCompanies();
			logger.info("Finished DnB UnRegistration");
		}
		if(args.getIsExperianRegistrationSelected() == true ) 
		{
			logger.info("Starting Experian Registration");
			expInit.Initialise(args.getJksFile(), args.getJksPassword());
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
			expInit.Initialise(args.getJksFile(), args.getJksPassword());
			ExperianUpdateHandler handler = new ExperianUpdateHandler(companyRepo, experianRepo, settings);
			handler.getUpdates();
			logger.info("Finished Experian Update");
		}
		// Save settings
		settingsRepo.saveSettings(settings);		
	}
}
