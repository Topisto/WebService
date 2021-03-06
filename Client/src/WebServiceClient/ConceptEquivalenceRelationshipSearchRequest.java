package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.concept_equivalence_relationship_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Jan�en
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class ConceptEquivalenceRelationshipSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public ConceptEquivalenceRelationshipSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public ConceptEquivalenceRelationshipSearchRequest( IRDI_type searchValue, String targetEndpointReference) 
	{
		super( searchValue, targetEndpointReference, concept_equivalence_relationship_Type.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_concept_equivalence_relationship";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
