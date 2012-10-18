package TerminologyModel;

import Irdi.IRDI_type;


/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the concept that matched a concept search specification along with the score from the SQL/MM query. 
 */
public class concept_search_result_sequence_Type implements java.io.Serializable 
{
	private static final long serialVersionUID = 7060823697112493385L;
	
	private IRDI_type _concept_ref;
	private String _score;
		
	
	/**
     * Axis needs a default constructor.
     */
    public concept_search_result_sequence_Type() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param concept_ref: Unambiguous identifier of the concept that was found by the search. 
     * @param score: Relevance of the search result, as calculated by the score function defined in ISO/IEC 13249-2. 
     */
    public concept_search_result_sequence_Type(IRDI_type concept_ref, String score) 
    {
    	set_concept_ref(concept_ref);
    	set_score(score);
    }

	/**
     * Gets the unambiguous identifier of the concept that was found by the search.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_concept_ref()
	{
		return _concept_ref;
	}

	/**
     * Sets the unambiguous identifier of the concept that was found by the search.
     * 
     * @param concept_ref
     */
	public void set_concept_ref(IRDI_type concept_ref)
	{
		_concept_ref = concept_ref;
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
