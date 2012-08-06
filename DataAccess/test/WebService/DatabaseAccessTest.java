package WebService;

import static org.junit.Assert.*;
import org.junit.Test;

import java.sql.Statement;


/**
 * Tests the DataAccess 
 */
public class DatabaseAccessTest
{
	/**
	 * Validates if IRDI = "Id="112-5" return one terminolog and one ontology server. 
	 */
	@Test 
	public void GetPrefferedName()
	{
		DatabaseAccess database = null;
		try
		{
			database = new DatabaseAccess();
			Statement statement = database.OpenDatabase();
			assertNotNull(statement);
			String name = database.GetSelectedItem(statement, "Preferred_Name", "0173-1#01-AAF577#3");
			assertEquals("Propylmethacrylsäurepolymer", name);
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
