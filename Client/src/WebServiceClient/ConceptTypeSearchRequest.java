package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.concept_type;

public class ConceptTypeSearchRequest extends InformationSearchRequest
{
	public ConceptTypeSearchRequest()
	{
		
	}
	
	public ConceptTypeSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, concept_type.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_concept_type";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
