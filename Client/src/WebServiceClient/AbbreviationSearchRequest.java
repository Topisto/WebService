package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.abbreviation;

public class AbbreviationSearchRequest extends InformationSearchRequest
{
	public AbbreviationSearchRequest()
	{
		
	}
	
	public AbbreviationSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, abbreviation.class );
	}

	@Override
	protected String getFunctionName()
	{
		return "get_abbreviation";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}
	
}
