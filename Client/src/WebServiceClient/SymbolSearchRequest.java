package WebServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;
import TerminologyModel.symbol;

public class SymbolSearchRequest extends InformationSearchRequest
{
	public SymbolSearchRequest()
	{
		
	}
	
	public SymbolSearchRequest( IRDI searchValue, String targetEndpointReference) throws ImplementationException
	{
		super( searchValue, targetEndpointReference, symbol.class );
	}


	@Override
	protected String getFunctionName()
	{
		return "get_symbol";
	}

	@Override
	protected Object getResponse(Object[] response)
	{
		return null;
	}

}
