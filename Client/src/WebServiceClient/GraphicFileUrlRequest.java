package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.URL;

public class GraphicFileUrlRequest extends InformationSearchRequest
{
	public GraphicFileUrlRequest()
	{
		
	}
	
	public GraphicFileUrlRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, URL.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_graphic_file_URL";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
