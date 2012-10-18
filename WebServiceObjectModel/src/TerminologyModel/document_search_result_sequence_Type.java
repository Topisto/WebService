package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the document that matched a document search specification along with the score from the SQL/MM query. 
 */
public class document_search_result_sequence_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 6700130878708362299L;
	
	private IRDI_type _document_ref;
	private String _score;
		
	
	/**
     * Axis needs a default constructor.
     */
    public document_search_result_sequence_Type() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param concept_ref: Unambiguous identifier of the document that was found by the search. 
     * @param score: Relevance of the search result, as calculated by the score function defined in ISO/IEC 13249-2. 
     */
    public document_search_result_sequence_Type(IRDI_type document_ref, String score) 
    {
    	set_document_ref(document_ref);
    	set_score(score);
    }

	/**
     * Gets the unambiguous identifier of the document that was found by the search.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_document_ref()
	{
		return _document_ref;
	}

	/**
     * Sets the unambiguous identifier of the document that was found by the search.
     * 
     * @param document_ref
     */
	public void set_document_ref(IRDI_type document_ref)
	{
		_document_ref = document_ref;
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
