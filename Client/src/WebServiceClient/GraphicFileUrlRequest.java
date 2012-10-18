package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.graphic_file;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class GraphicFileUrlRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public GraphicFileUrlRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public GraphicFileUrlRequest( IRDI_type searchValue, String targetEndpointReference)
	{
		super( searchValue, targetEndpointReference, graphic_file.class );
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
