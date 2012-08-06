package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.concept;

public class ConceptSearchRequest extends InformationSearchRequest
{
	public ConceptSearchRequest()
	{
		
	}
	
	public ConceptSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, concept.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_concept";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
