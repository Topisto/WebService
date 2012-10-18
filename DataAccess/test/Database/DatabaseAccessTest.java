package Database;

import static org.junit.Assert.*;
import org.junit.Test;

import Database.DatabaseAccess;
import ExceptionHandler.implementation_exception;

import java.sql.Statement;


/**
 * Tests the DataAccess 
 */
public class DatabaseAccessTest
{
	/**
	 * Validates if Preferred_Name = '0173-1#01-AAF577#3' return 'Propylmethacrylsäurepolymer'. 
	 */
	@Test 
	public void GetPrefferedName()
	{
		DatabaseAccess database = null;
		try
		{
			database = new DatabaseAccess();
			Statement statement = null;
			try
			{
				statement = database.OpenDatabase();
				assertNotNull(statement);
				String name = database.GetSelectedItem(statement, "Preferred_Name", "0173-1#01-AAF577#3");
				assertEquals("Propylmethacrylsäurepolymer", name);
			} 
			catch (implementation_exception e)
			{
				fail(e.getMessage());	
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
