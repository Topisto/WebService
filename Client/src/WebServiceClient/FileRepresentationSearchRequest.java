package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.file_representation;

public class FileRepresentationSearchRequest extends InformationSearchRequest
{
	public FileRepresentationSearchRequest()
	{
		
	}
	
	public FileRepresentationSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, file_representation.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_file_representation";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
