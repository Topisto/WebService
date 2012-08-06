package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.document;

public class DocumentSearchRequest extends InformationSearchRequest
{
	public DocumentSearchRequest()
	{
		
	}
	
	public DocumentSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, document.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_document";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}
}
