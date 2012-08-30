package WebService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import WebServiceLogging.WebServiceLogger;

public class DatabaseAccess implements IDisposable 
{
 	private Connection _connection;
	
	public Statement OpenDatabase() 
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
		}
		//catch (NamingException e)
		{
		//	WebServiceLogger.Log("DatabaseAccess.java", "OpenDatabase", String.format("Open connection failed: %s", e.getMessage())); 
		}
		return null;
	}
	
	public String GetInternalIrdi(Statement statement, String irdi)
	{
		ResultSet resultSet = null;
		try
		{
			String queryInternalIrdi = String.format("PKGPROPERTY.GETID('%s')", irdi);
			String getInternalIrdi = String.format("SELECT %s FROM DUAL", queryInternalIrdi);;
			resultSet = statement.executeQuery(getInternalIrdi);
			StringBuffer resultBuffer = new StringBuffer();
    		
			while( resultSet.next() )
			{
				resultBuffer.append( resultSet.getString(queryInternalIrdi));
			}
					
			return resultBuffer.toString();
		} 
		catch( SQLException e )
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", e.getMessage())); 
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException e)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", e.getMessage())); 
				}
			}
		}
		return null;
	}
	
	public String GetSelectedItem(Statement statement, String tableName, String irdi)
	{
		ResultSet resultSet = null;
		try
		{
			String expression = String.format("select %s from de_class where IRDI = '%s'", tableName, irdi);;
			resultSet = statement.executeQuery(expression);
			StringBuffer resultBuffer = new StringBuffer();
    		
			while( resultSet.next() )
			{
				resultBuffer.append( resultSet.getString(tableName));
			}
			
			return resultBuffer.toString();
		} 
		catch( SQLException e )
		{
			WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", e.getMessage())); 
		}
		finally
		{
			if( resultSet != null )
			{
				try
				{
					resultSet.close();
				} 
				catch (SQLException e)
				{
					WebServiceLogger.Log("DatabaseAccess.java", "GetInternalIrdi", String.format("Close connection failed: %s", e.getMessage())); 
				}
			}
		}
		return null;
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
