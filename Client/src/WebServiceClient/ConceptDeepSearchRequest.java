package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.concept;

public class ConceptDeepSearchRequest extends InformationSearchRequest
{
	public ConceptDeepSearchRequest()
	{
		
	}
	
	public ConceptDeepSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, concept.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_concept_deep";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
