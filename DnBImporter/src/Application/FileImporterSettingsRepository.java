package Application;

public class FileImporterSettingsRepository implements
		IImporterSettingsRepository {

	private final String fileName = "ImporterSettings.txt";
	
	@Override
	public ImporterSettings getSettings() 
	{
		String settingsXml = FileHelper.getStringFromFile(fileName);
		
		ImporterSettings settings = new ImporterSettings();
		if( settingsXml.length()>0 ) 	
			settings.fromXml(settingsXml);
		return settings;
	}

	@Override
	public void saveSettings(ImporterSettings settings) 
	{
		FileHelper.writeFile(fileName, settings.toXml());
	}

}
