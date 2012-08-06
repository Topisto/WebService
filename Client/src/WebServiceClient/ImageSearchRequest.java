package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.image;

public class ImageSearchRequest extends InformationSearchRequest
{
	public ImageSearchRequest()
	{
		
	}
	
	public ImageSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, image.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_image";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
