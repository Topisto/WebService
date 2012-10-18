package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the language that language a document search specification along with the score from the SQL/MM query. 
 */
public class language_search_result_sequence_Type  implements java.io.Serializable 
{

	private static final long serialVersionUID = 2541663712638232264L;
	private IRDI_type _language_ref;
	private String _score;
		
	
	/**
     * Axis needs a default constructor.
     */
    public language_search_result_sequence_Type() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param concept_ref: Unambiguous identifier of the language that was found by the search. 
     * @param score: Relevance of the search result, as calculated by the score function defined in ISO/IEC 13249-2. 
     */
    public language_search_result_sequence_Type(IRDI_type language_ref, String score) 
    {
    	set_language_ref(language_ref);
    	set_score(score);
    }

	/**
     * Gets the unambiguous identifier of the language that was found by the search.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_language_ref()
	{
		return _language_ref;
	}

	/**
     * Sets the unambiguous identifier of the language that was found by the search.
     * 
     * @param language_ref
     */
	public void set_language_ref(IRDI_type language_ref)
	{
		_language_ref = language_ref;
	}

	/**
     * Gets the relevance of the search result, as calculated by the score function defined in ISO/IEC 13249-2. .
     * 
     * @return String
     */
	public String get_score()
	{
		return _score;
	}

	/**
     * Sets the relevance of the search result, as calculated by the score function defined in ISO/IEC 13249-2. .
     * 
     * @return score
     */
	public void set_score(String score)
	{
	  _score = score;
	}

}

