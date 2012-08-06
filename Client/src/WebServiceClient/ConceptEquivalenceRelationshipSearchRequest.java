package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.concept_equivalence_relationship;

public class ConceptEquivalenceRelationshipSearchRequest extends InformationSearchRequest
{
	public ConceptEquivalenceRelationshipSearchRequest()
	{
		
	}
	
	public ConceptEquivalenceRelationshipSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, concept_equivalence_relationship.class );
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
