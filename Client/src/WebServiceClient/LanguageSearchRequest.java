package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.language;

public class LanguageSearchRequest extends InformationSearchRequest
{
	public LanguageSearchRequest()
	{
		
	}
	
	public LanguageSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, language.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_language";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}
}
