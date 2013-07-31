package Application;

public interface IImporterSettingsRepository 
{
	ImporterSettings getSettings() throws Exception;
	void saveSettings(ImporterSettings settings);
}
