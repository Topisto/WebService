package WebServiceClient;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import ExceptionHandler.ImplementationException;
import Irdi.IRDI;

public abstract class InformationSearchRequest
{
	private IRDI _irdi;
	private String _targetEndpointReference;
	private Class _returnTypeClass;
	
	public InformationSearchRequest()
	{
		
	}
	
	public InformationSearchRequest( IRDI irdi, String targetEndpointReference, Class returnTypeClass ) throws ImplementationException
	{
		_irdi = irdi;
		_targetEndpointReference = targetEndpointReference;
		_returnTypeClass = returnTypeClass;
	}

	public Object SendRequest()
	{
		try
		{
			RPCServiceClient sender = new RPCServiceClient();
			
			Options options = sender.getOptions();
			EndpointReference targetEPR = new EndpointReference( _targetEndpointReference );
			options.setTo(targetEPR);

			//Call operation 
			QName opgetSourceIdentification = new QName( "http://InformationSearch", getFunctionName() );

			//Define parameters
			Object[] opArgs = new Object[]{_irdi};

			Class[] returnTypes = new Class[] { _returnTypeClass };
			Object[] response = sender.invokeBlocking( opgetSourceIdentification, opArgs, returnTypes );
		    return getResponse( response );
		} 
		catch( AxisFault exception )
		{
			exception.printStackTrace();
		} 
		return null;
	}
	
	protected abstract Object getResponse( Object[] response );
	protected abstract String getFunctionName();

}
