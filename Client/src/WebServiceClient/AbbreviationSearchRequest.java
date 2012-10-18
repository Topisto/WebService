package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.abbreviation_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class AbbreviationSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public AbbreviationSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public AbbreviationSearchRequest( IRDI_type irdi, String targetEndpointReference) 
	{
		super( irdi, targetEndpointReference, abbreviation_Type.class );
	}

	@Override
	protected String getFunctionName()
	{
		return "get_abbreviation";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return (abbreviation_Type)response[0];
	}
	
}
