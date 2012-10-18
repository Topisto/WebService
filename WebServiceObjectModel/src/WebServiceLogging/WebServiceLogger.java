package WebServiceLogging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Implementation of application wide logger 
 */
public class WebServiceLogger
{
	static private Logger logger;

	static private void setup() throws IOException 
	{
		// Create Logger
		logger = Logger.getLogger("WebServiceLogger");
		logger.setLevel(Level.ALL);
		
		File appDataFile = new File(System.getenv("APPDATA"));
		File directory = new File(appDataFile, "WebService");
		
		if( !directory.exists())
		{
			directory.mkdir();
		}
    	
	    File file = new File(appDataFile, "WebService\\Log.log");
		if( !file.exists())
		{
			file.createNewFile();
		}
	    
	    FileHandler fileTextHandler = new FileHandler( file.getPath(),  true);

    	// Create txt Formatter
	    SimpleFormatter formatter = new SimpleFormatter();
		fileTextHandler.setFormatter(formatter);
		logger.addHandler(fileTextHandler);
	}
	
	/**
	 * Logs the provided message
	 * 
	 * @param sourceClass
	 * @param sourceMethod
	 * @param message
	 * 
	 * @throws IOException 
	 */
	static public void Log(String sourceClass, String sourceMethod, String message) 
	{
		if( logger == null )
		{
		  try
		  {
			setup();
		  } 
		  catch (IOException e)
		  {
			e.printStackTrace();
		  }
		}
		logger.logp(Level.ALL, sourceClass, sourceMethod, message);
	}
}


