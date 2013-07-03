package Application;

public class ExperianInitialise 
{
	public void Initialise(String file, String password)
	{
		System.setProperty("javax.net.ssl.keyStoreType", "jks");
		System.setProperty("javax.net.ssl.keyStore", file);
		System.setProperty("javax.net.ssl.keyStorePassword", password);
	}
}
