package Mapping;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_pattern_exception;
import Irdi.IRDI_type;
import TerminologyModel.language_search_result_sequence_Type;
import TerminologyModel.language_search_specification_Type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Searching a language. 
 */
public class LanguageSearch implements java.io.Serializable 
{
	private static final long serialVersionUID = -2234952902927787073L;
	private language_search_specification_Type _search_specification;
	private int _max_results;

	/**
     * Axis needs a default constructor.
     */
	public LanguageSearch()
	{
		
	}
	
	
	 /**
     * Constructor for initalizing the properties.
     * 
     * @param search_specification: The specification of the search criteria.
     * @param max_results: The maximun number of results to be returned. 
     */
	public LanguageSearch(language_search_specification_Type search_specification, int max_results)
	{
		_search_specification = search_specification;
		_max_results = max_results;
	}
	
	/**
    * 
    * Retrieves one or more language objects that match a set of criteria.
    * 
    * @return language_search_result_sequence_Type: Language that match the search criteria and its associated score. 
    * @return results_truncated: Indicates whether or not some results met the search criteria but were not returned due there 
    * being more than max_results matching concept objects.
    * @throws implementation_exception 
    * @throws invalid_pattern_exception 
    */
	public language_search_result_sequence_Type Run()
	{
		
		IRDI_type language_ref = new IRDI_type();
		
		String score = "1";
		
		return new language_search_result_sequence_Type(language_ref, score);
	}
	
	
	
    /**
     * Gets the specification of the search criteria.
     * 
     * @return language_search_specification_Type
     */
	public language_search_specification_Type get_Search_Specification()
	{
		return _search_specification;
	}

	
    /**
     * Sets the specification of the search criteria.
     * 
     * @param search_specification
     */
	public void set_Search_Specification(language_search_specification_Type search_specification)
	{
		_search_specification = search_specification;
	}
	
	
    /**
     * Gets the maximun number of results to be returned. 
     * 
     * @return int
     */
	public int get_Max_Results()
	{
		return _max_results;
	}

	
    /**
     * Sets the maximun number of results to be returned. 
     * 
     * @param max_results
     */
	public void set_Max_Results(int max_results)
	{
		_max_results = max_results;
	}
}
