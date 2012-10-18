package WebServiceClient;

import Irdi.IRDI_type;
import TerminologyModel.organization_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Jan�en
 * @version 1.0
 * 
 * This class implements the abbreviation search request. 
 */
public class OrganizationSearchRequest extends InformationSearchRequest
{
	/**
     * The default constructor.
     */
	public OrganizationSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
     */
	public OrganizationSearchRequest( IRDI_type searchValue, String targetEndpointReference) 
	{
		super( searchValue, targetEndpointReference, organization_Type.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_organization";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}
}
