package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.definition_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Jan�en
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class DefinitionSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public DefinitionSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public DefinitionSearchRequest( IRDI_type searchValue, String targetEndpointReference) 
	{
		super( searchValue, targetEndpointReference, definition_Type.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_definition";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return (definition_Type)response[0];
	}
}
