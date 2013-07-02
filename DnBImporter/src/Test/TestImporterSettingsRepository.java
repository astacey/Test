package Test;

import java.util.Date;

import Application.IImporterSettingsRepository;
import Application.ImporterSettings;

public class TestImporterSettingsRepository implements
		IImporterSettingsRepository {
	
	private ImporterSettings settings;
	
	public TestImporterSettingsRepository()
	{
		this.settings = new ImporterSettings();
	}
	
	@Override
	public ImporterSettings getSettings() 
	{
		// TODO Auto-generated method stub
		return settings;
	}

	@Override
	public void saveSettings(ImporterSettings settings) 
	{
		this.settings = settings;
	}
	
	public void setLastRunDate(Date date)
	{
		settings.setLastRunDateDnB(date);
	}

}
