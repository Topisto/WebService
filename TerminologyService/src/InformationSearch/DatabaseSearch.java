package InformationSearch;

import java.sql.Statement;

import WebService.DatabaseAccess;
import WebServiceLogging.WebServiceLogger;
import Irdi.RegistrationAuthorityIdentifier;

public class DatabaseSearch
{
	private RegistrationAuthorityIdentifier _irdi; 
	
	protected DatabaseSearch( RegistrationAuthorityIdentifier irdi )
	{
		_irdi = irdi;
    }
	
	protected String SearchTerm()
	{
		DatabaseAccess database = null;
		try
		{
			database = new DatabaseAccess();
			WebServiceLogger.Log("DatabaseSearch.java", "SearchTerm", "database erzeugen klappt"); 
			Statement statement = database.OpenDatabase();
			if( statement != null )
			{
				WebServiceLogger.Log("DatabaseSearch.java", "SearchTerm", "öffnen klappt"); 
		    	return database.GetSelectedItem(statement, "Preferred_Name", _irdi.getRegistrationAuthorityIdentifierValue());
			}
			else
			{
				return "Fehlgeschlagen - Öffnen der Datenbank hat nicht geklappt";
			}
		}
		finally
		{
			if( database != null)
			{
				database.Dispose();
			}
		}
	}
}
