package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.definition;

public class DefinitionSearchRequest extends InformationSearchRequest
{
	public DefinitionSearchRequest()
	{
		
	}
	
	public DefinitionSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, definition.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_definition";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
