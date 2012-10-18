package Mapping;

import java.sql.Statement;
import java.util.Dictionary;
import Database.DatabaseAccess;
import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;
import TerminologyModel.abbreviation_Type;
import TerminologyModel.term_Type;
import WebServiceLogging.WebServiceLogger;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Retrieves a term. 
 */
public class TermRetrieve implements java.io.Serializable 
{
	
    private static final long serialVersionUID = -2468001258627890669L;
	private IRDI_type _irdi;
	
	/**
     * Axis needs a default constructor.
     */
	public TermRetrieve()
	{
		
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: Represents the identifer used for the term. 
     */
	public TermRetrieve(IRDI_type irdi)
	{
	  _irdi = irdi;	
	}
	
	
   	/**
     * Retrieves a term for a provided identifier.
     * 
     * @return term_Type: An object containing information about the term. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public term_Type Run() throws implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		DatabaseAccess database = null;
		String termContent = null;
		String abbreviationContent = null;
		
		try
		{
			database = new DatabaseAccess();
			Statement statement = database.OpenDatabase();
			WebServiceLogger.Log("DatabaseSearch.java", "SearchTerm", "Opened database"); 
			
			String[] tableNames = new String[]{"Preferred_Name", "Short_Name"};
			Dictionary<String,String> items = database.GetSelectedItemsFromClass(statement, tableNames, _irdi.getIrdi());
    		termContent = items.get("Preferred_Name");
	    	abbreviationContent = items.get("Short_Name");
			
			if( termContent == null && abbreviationContent == null)
			{
				throw new object_not_found_exception(_irdi, String.format("Term %s not found", _irdi.getIrdi()));
			}
			return new term_Type(new abbreviation_Type(abbreviationContent), termContent);
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
     * Gets the unambiguous identifier of the term.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_irdi()
	{
		return _irdi;
	}

    /**
     * Sets the unambiguous identifier of the term.
     * 
     * @param irdi
     */
	public void set_irdi(IRDI_type irdi)
	{
		_irdi = irdi;
	}

}
