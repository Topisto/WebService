package Mapping;

import java.sql.Statement;
import java.util.Dictionary;

import Database.DatabaseAccess;
import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;
import TerminologyModel.definition_Type;
import WebServiceLogging.WebServiceLogger;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Retrieves a definition. 
 */
public class DefinitionRetrieve implements java.io.Serializable 
{
	private static final long serialVersionUID = 1001182622045844887L;
    private IRDI_type _irdi;
	
	/**
     * Axis needs a default constructor.
     */
	public DefinitionRetrieve()
	{
		
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: Represents the identifer used for the definition. 
     */
	public DefinitionRetrieve(IRDI_type irdi)
	{
	  _irdi = irdi;	
	}
	
	
   	/**
     * Retrieves a definition for a provided identifier.
     * 
     * @return definition_Type: An object containing information about the definition. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public definition_Type Run() throws implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		DatabaseAccess database = null;
		String definitionContent = null;
		
		try
		{
			database = new DatabaseAccess();
			Statement statement = database.OpenDatabase();
			WebServiceLogger.Log("DatabaseSearch.java", "SearchDefinition", "Opened database"); 
			
			String[] tableNames = new String[]{"Definition"};
			Dictionary<String,String> items = database.GetSelectedItemsFromClass(statement, tableNames, _irdi.getIrdi());
			definitionContent = items.get("Definition");
			
      	    if( definitionContent == null)
			{
				throw new object_not_found_exception(_irdi, String.format("Definition %s not found", _irdi.getIrdi()));
			}
			return new definition_Type(definitionContent);
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
