package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.file_representation_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Jan�en
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class FileRepresentationSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public FileRepresentationSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public FileRepresentationSearchRequest( IRDI_type searchValue, String targetEndpointReference) 
	{
		super( searchValue, targetEndpointReference, file_representation_Type.class );
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
