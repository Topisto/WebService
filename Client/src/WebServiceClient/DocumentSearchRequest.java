package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.document_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class DocumentSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public DocumentSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public DocumentSearchRequest( IRDI_type searchValue, String targetEndpointReference) 
	{
		super( searchValue, targetEndpointReference, document_Type.class );
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
