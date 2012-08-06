package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.organization;

public class OrganizationSearchRequest extends InformationSearchRequest
{
	public OrganizationSearchRequest()
	{
		
	}
	
	public OrganizationSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, organization.class );
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
