package Application;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ImporterLogging 
{
	private static FileHandler fileHandler;
	private static SimpleFormatter formatter;
	
	public static void setup() throws IOException
	{
		// Get global logger and then configure
		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.INFO);
		// Create text handler
		fileHandler = new FileHandler("ImporterLog" + GlobalDateStamp.getDateStampString() + ".txt");
		formatter = new SimpleFormatter();
		fileHandler.setFormatter(formatter);
		logger.addHandler(fileHandler);
	}
}
