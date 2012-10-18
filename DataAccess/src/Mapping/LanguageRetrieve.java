package Mapping;

import java.sql.Statement;
import java.util.Dictionary;
import java.util.Locale;

import Database.DatabaseAccess;
import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;
import TerminologyModel.language_Type;
import WebServiceLogging.WebServiceLogger;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Retrieves a language. 
 */
public class LanguageRetrieve implements java.io.Serializable 
{
	private static final long serialVersionUID = 4799533352949280258L;
    private IRDI_type _irdi;
	
	/**
     * Axis needs a default constructor.
     */
	public LanguageRetrieve()
	{
		
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: Represents the identifer used for the LanguageSearch. 
     */
	public LanguageRetrieve(IRDI_type irdi)
	{
	  _irdi = irdi;	
	}
	
	
   	/**
     * Retrieves a language.
     * 
     * @return language_Type: An object containing information about the language. 
     * 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public language_Type Run() throws implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		DatabaseAccess database = null;
		String languageCode = null;
		
		try
		{
    		database = new DatabaseAccess();
			Statement statement = database.OpenDatabase();
			WebServiceLogger.Log("DatabaseSearch.java", "SearchLanguage", "Opened database"); 
			
			String[] tableNames = new String[]{"Supplier_Code"};
			Dictionary<String,String> items = database.GetSelectedItemsFromClass(statement, tableNames, _irdi.getIrdi());
    		String supplierCode = items.get("Supplier_Code");
    		
    		String dictionaryId = database.GetSelectedItem(statement, "ID", "DE_DICTIONARY", "Supplier_Code", supplierCode);
    		
    		languageCode = database.GetSelectedItem(statement, "DIC_LANGUAGE", "DE_DICTIONARY_ADDITIONAL_DATA", "D_ID", dictionaryId);
			
      	    if( languageCode == null)
			{
				throw new object_not_found_exception(_irdi, String.format("CountryCode %s not found", _irdi.getIrdi()));
			}
      	    
      	    Locale language = new Locale(languageCode.toLowerCase(), GetDefaultCountryForLanguage(languageCode.toLowerCase()));
   	    
     	  	return new language_Type(language.getISO3Country(), _irdi, language.getISO3Language());
		}
		finally
		{
			if( database != null)
			{
				database.Dispose();
			}
		}
	}
	
	
	private String GetDefaultCountryForLanguage(String language)
	{
		if( language.equals("de"))
			{
				return "DE";
			}
		else if ( language.equals("en") )
		{
			return "US";
		}
		else if ( language.equals("fr"))
		{
			return "FR";
		}
		else if ( language.equals("ru"))
		{
			return "RU";
		}
		else if ( language.equals("zh"))
		{
			return "CN";
		}
    	return "";
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
