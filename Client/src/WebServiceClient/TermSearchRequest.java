package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.term_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class TermSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public TermSearchRequest()
	{
		
	}

	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public TermSearchRequest( IRDI_type irdi, String targetEndpointReference) 
	{
		super( irdi, targetEndpointReference, term_Type.class);
	}


	@Override
	protected String getFunctionName()
	{
		return "get_term";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return (term_Type)response[0];
	}
}
