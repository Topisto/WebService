package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.term;

public class TermSearchRequest extends InformationSearchRequest
{
	public TermSearchRequest()
	{
		
	}
	
	public TermSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, term.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_term";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}
}
