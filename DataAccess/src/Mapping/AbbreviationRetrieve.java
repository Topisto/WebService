package Mapping;

import java.sql.Statement;
import java.util.Dictionary;

import Database.DatabaseAccess;
import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;
import TerminologyModel.abbreviation_Type;
import WebServiceLogging.WebServiceLogger;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Retrieves an abbreviation. 
 */
public class AbbreviationRetrieve implements java.io.Serializable 
{
	private static final long serialVersionUID = 1154275376675493060L;
	private IRDI_type _irdi;
	
	/**
     * Axis needs a default constructor.
     */
	public AbbreviationRetrieve()
	{
		
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: Represents the identifer used for the abbreviation. 
     */
	public AbbreviationRetrieve(IRDI_type irdi)
	{
	  _irdi = irdi;	
	}
	
	
   	/**
     * Retrieves an abbreviation for a provided identifier.
     * 
     * @return abbreviation_Type: An object containing information about the abbreviation. 
     * 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public abbreviation_Type Run() throws implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		DatabaseAccess database = null;
		String abbreviationContent = null;
		
		try
		{
			database = new DatabaseAccess();
			Statement statement = database.OpenDatabase();
			WebServiceLogger.Log("DatabaseSearch.java", "SearchAbbreviation", "Opened database"); 
			
			String[] tableNames = new String[]{"Short_Name"};
			Dictionary<String,String> items = database.GetSelectedItemsFromClass(statement, tableNames, _irdi.getIrdi());
			abbreviationContent = items.get("Short_Name");

			if( abbreviationContent == null)
			{
				throw new object_not_found_exception(_irdi, String.format("Abbreviation %s not found", _irdi.getIrdi()));
			}
			return new abbreviation_Type(abbreviationContent);
		}
		finally
		{
			if( database != null)
			{
				database.Dispose();
			}
		}
	}
		
    /**
     * Gets the unambiguous identifier of the abbreviation.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_irdi()
	{
		return _irdi;
	}

    /**
     * Sets the unambiguous identifier of the abbreviation_Type.
     * 
     * @param irdi
     */
	public void set_irdi(IRDI_type irdi)
	{
		_irdi = irdi;
	}

}
