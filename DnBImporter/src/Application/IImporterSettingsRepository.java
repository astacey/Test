package Application;

public interface IImporterSettingsRepository 
{
	ImporterSettings getSettings();
	void saveSettings(ImporterSettings settings);
}
