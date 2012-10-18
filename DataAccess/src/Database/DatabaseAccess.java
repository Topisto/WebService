package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Dictionary;
import java.util.Hashtable;

import ExceptionHandler.implementation_exception;
import WebServiceLogging.WebServiceLogger;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Class implements all actions on the database. 
 */
public class DatabaseAccess implements IDisposable, java.io.Serializable 
{
	private static final long serialVersionUID = 5209695930982311734L;
	private Connection _connection;
	
   	/**
     * Opens the database.
     * 
     * @return Statement: A Statement object for sending SQL statements to the database. 
     * 
     * @throws implementation_exception 
     */
	public Statement OpenDatabase() throws implementation_exception 
	{
		oracle.jdbc.OracleDriver driver = new oracle.jdbc.OracleDriver();
		try
		{
			DriverManager.registerDriver( driver );
     		_connection = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:XE", "Workdemo", "admin"  );
			return  _connection.createStatement();
		}
		catch (SQLException exception)
		{
			WebServiceLogger.Log("DatabaseAccess.java", "OpenDatabase", String.format("Open connection failed: %s", exception.getMessage())); 
			throw new implementation_exception(String.format("Open database failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
	}
	
   	/**
     * Retrieve the internal id.
     * 
     * @param Statement: A Statement object for sending SQL statements to the database. 
     * @param irdi: The official identifier. 
     * 
     * @throws implementation_exception 
     */
	private String GetInternalId(Statement statement, String irdi) throws implementation_exception 
	{
		ResultSet resultSet = null;
		try
		{
			String queryInternalIrdi = String.format("PKGPROPERTY.GETID('%s')", irdi);
			String getInternalId = String.format("SELECT %s FROM DUAL", queryInternalIrdi);;
			resultSet = statement.executeQuery(getInternalId);
			StringBuffer resultBuffer = new StringBuffer();
    		
			while( resultSet.next() )
			{
				resultBuffer.append( resultSet.getString(queryInternalIrdi));
			}
										
			return resultBuffer.toString();
		} 
		catch( SQLException exception )
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Get internal irdi %s failed: %s", irdi, exception.getMessage())); 
			throw new implementation_exception(String.format("Get internal irdi failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException exception)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", exception.getMessage())); 
					throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
				}
			}
		}
	}
	
	
   	/**
     * Retrieves different specified items from a special IRDI from de_class.
     * 
     * @param Statement: A Statement object for sending SQL statements to the database. 
     * @param tableNames: A collection of column tables  
     * @param irdi: The official unique identifier. 
     * 
     * @throws implementation_exception 
     */
	public Dictionary<String, String> GetSelectedItemsFromClass(Statement statement, String[] tableNames, String irdi) throws implementation_exception
	{
		ResultSet resultSet = null;
		try
		{
			Dictionary<String, String> resultBuffer = new Hashtable<String,String>();
			
			String internalId = GetInternalId(statement, irdi);
			if( internalId.contentEquals("null") || internalId.length() == 0)
			{
				String expression = String.format("select * from de_class where IRDI = '%s'", irdi);;
				resultSet = statement.executeQuery(expression);
    		}
			else
			{
				String expression = String.format("select * from table (pkgProperty.gettable( %s ))", internalId);;
				resultSet = statement.executeQuery(expression);
			}
			    		
			while( resultSet.next() )
			{
			  for( int index = 0; index < tableNames.length; index++)
			  {
				  if(resultSet.getString(tableNames[index]) == null)
				  {
					  resultBuffer.put(tableNames[index], "");   
				  }
				  else
				  {
					 resultBuffer.put(tableNames[index], resultSet.getString(tableNames[index]));  
				  }
			  }
			}
			return resultBuffer;
		} 
		catch( SQLException exception)
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Get selected item failed: %s", exception.getMessage())); 
			throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException exception)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", exception.getMessage())); 
					throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
				}
			}
		}
	}
	
	
	
   	/**
     * Retrieves different specified item from a special row.
     * 
     * @param Statement: A Statement object for sending SQL statements to the database. 
     * @param tableNames: A collection of column tables  
     * @param irdi: The official unique identifier. 
     * 
     * @throws implementation_exception 
     */
	public Dictionary<String, String> GetSelectedItems(Statement statement, String[] tableNames, String irdi) throws implementation_exception
	{
		ResultSet resultSet = null;
		try
		{
			String internalId = GetInternalId(statement, irdi);
			if( internalId.contentEquals("null") || internalId.length() == 0)
			{
				//For some items internal id cannot be found
				return null;
			}
			
			String expression = String.format("select * from table (pkgProperty.gettable( %s ))", internalId);;
			resultSet = statement.executeQuery(expression);

			Dictionary<String, String> resultBuffer = new Hashtable<String,String>();
    		
			while( resultSet.next() )
			{
			  for( int index = 0; index < tableNames.length; index++)
			  {
				  if(resultSet.getString(tableNames[index]) == null)
				  {
					  resultBuffer.put(tableNames[index], "");   
				  }
				  else
				  {
					 resultBuffer.put(tableNames[index], resultSet.getString(tableNames[index]));  
				  }
			  }
			}
			return resultBuffer;
		} 
		catch( SQLException exception)
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Get selected item failed: %s", exception.getMessage())); 
			throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException exception)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", exception.getMessage())); 
					throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
				}
			}
		}
	}
	
   	/**
     * Retrieve the selected item.
     * 
     * @param Statement: A Statement object for sending SQL statements to the database. 
     * @param tableColumn: The name of the table column of the desired item.  
     * @param irdi: The official unique identifier. 
     * 
     * @throws implementation_exception 
     */
	public String GetSelectedItem(Statement statement, String tableColumn, String irdi) throws implementation_exception
	{
		ResultSet resultSet = null;
		try
		{
			String expression = String.format("select %s from de_class where IRDI = '%s'", tableColumn, irdi);;
			resultSet = statement.executeQuery(expression);
			StringBuffer resultBuffer = new StringBuffer();
    		
			while( resultSet.next() )
			{
				if(resultSet.getString(tableColumn) == null)
				{
				  resultBuffer.append("");
				}
				resultBuffer.append( resultSet.getString(tableColumn));
			}
			
			return resultBuffer.toString();
		} 
		catch( SQLException exception )
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetSelectedItem", String.format("Get selected item % s from irdi %s failed: %s",
					tableColumn, irdi,  exception.getMessage())); 
			throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException exception)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", exception.getMessage())); 
					throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
				}
			}
		}
	}
	
	
   	/**
     * Retrieve the selected item.
     * 
     * @param Statement: A Statement object for sending SQL statements to the database. 
     * @param tableColumn: The name of the table column.  
     * @param tableName: The name of the table. 
     * @param tableRow: The name of the table row. 
     * @param value: The value to compare with. 
     * 
     * @throws implementation_exception 
     */
	public String GetSelectedItem(Statement statement, String tableColumn, String tableName, String tableRow, String value) throws implementation_exception
	{
		ResultSet resultSet = null;
		try
		{
			String expression = String.format("select %s from %s where %s = '%s'", tableColumn, tableName, tableRow, value);;
			resultSet = statement.executeQuery(expression);
			StringBuffer resultBuffer = new StringBuffer();
    		
			while( resultSet.next() )
			{
				if(resultSet.getString(tableColumn) == null)
				{
				  resultBuffer.append("");
				}
				resultBuffer.append( resultSet.getString(tableColumn));
			}
			
			return resultBuffer.toString();
		} 
		catch( SQLException exception )
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetSelectedItem", String.format("Get selected item %s from colum %s tableName %s tableRow %s " +
					"with value %s failed: %s", tableColumn, tableName, tableRow, value, exception.getMessage())); 
			throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException exception)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", exception.getMessage())); 
					throw new implementation_exception(String.format("Close connection failed: %s", exception.getMessage()), exception.getErrorCode() );
				}
			}
		}
	}
	
	
	@Override
	public void Dispose()
	{
		try
		{
			if( _connection != null )
			{
				_connection.close();
			} 
		}
		catch (SQLException e)
		{
			WebServiceLogger.Log("DatabaseAccess.java", "Dispose", String.format("Close connection failed: %s", e.getMessage())); 
		}
	}
}
