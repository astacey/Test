package Application;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Logger;

import Domain.IDnBRepository;
import Domain.ICompanyRepository;
import Test.TestRepositories.TestCompanyRepository;


public class EntryPoint 
{
	private static Logger logger = Logger.getLogger(EntryPoint.class.getName());
	// Entry point 
	public static void main(String[] args) 
	{
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
				e.printStackTrace();
				throw new RuntimeException("Problems with creating the log files");
			}
			logger.info("Starting runCommand");
			runCommandLine(impArgs);
			logger.info("Finished runCommand");
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
		if(args.getIsUpdate() == true)
		{
			logger.info("Starting Update");
			UpdateHandler handler = new UpdateHandler(companyRepo, dnbRepo, settings);
			handler.getUpdates();
			logger.info("Finihed Update");
		}
		// Save settings
		settingsRepo.saveSettings(settings);
	}
}
