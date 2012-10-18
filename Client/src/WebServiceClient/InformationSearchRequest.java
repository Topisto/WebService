package WebServiceClient;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import WebServiceLogging.WebServiceLogger;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This is the abstraction for the specialized search request classes 
 */
public abstract class InformationSearchRequest
{
	private IRDI_type _irdi;
	private String _targetEndpointReference;
	private Class _returnTypeClass;
	
	/**
     * The default constructor.
     */
	public InformationSearchRequest()
	{
		
	}
	
	/**
     * The constructor initialize the typed parameter for the search request
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
	* @param returnTypeClass: The specialized class type. 
    * 
    */
	public InformationSearchRequest( IRDI_type irdi, String targetEndpointReference, Class returnTypeClass )
	{
		_irdi = irdi;
		_targetEndpointReference = targetEndpointReference;
		_returnTypeClass = returnTypeClass;
	}

	/**
     * Calls the provide method on the selected server. 
     * 
	* @param irdi: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
	* @param returnTypeClass: The specialized class type. 
    * 
    * @return Object
	* @throws implementation_exception 
    * @throws object_not_found_exception 
	* @throws AxisFault
     */
	public Object SendRequest() throws AxisFault, Exception 
	{
		try
		{
			RPCServiceClient sender = new RPCServiceClient();
				
			Options options = sender.getOptions();
			EndpointReference targetEPR = new EndpointReference( _targetEndpointReference );
			options.setTo(targetEPR);

			//Call operation 
			QName opgetTerm = new QName( "http://InformationSearch", getFunctionName());

			//Define parameters
			Object[] opArgs = new Object[]{_irdi};

			Class[] returnTypes = new Class[] {_returnTypeClass};
			Object[] response = sender.invokeBlocking( opgetTerm, opArgs, returnTypes );
				
			return (Object) response[0];
		} 
		catch( AxisFault exception )
		{
			WebServiceLogger.Log("Communication.java", "GetTerminologyInformation", String.format( "AxisFault Exception is thrown. Details: %n " +
					"Message %s%n FaultCode %s%n Detail %s%n ", exception.getMessage(), exception.getFaultCode(), exception.getDetail()));	
			  	
			 throw exception;
		} 
		catch( Exception exception )
		{
			WebServiceLogger.Log("Communication.java", "GetTerminologyInformation", String.format( "Exception is thrown. Details: %n " +
					"Message %s%n ", exception.getMessage()));	
			  	
			 throw exception;
		} 	

	}
	
	/**
     * Get the typed response. 
     * 
     * @param respoonse as object array
     * @return Object
    */
	protected abstract Object getResponse( Object[] response );
	
	/**
     * Get the function name of the corresponding terminology or ontology server. 
     * 
     * @return String
    */
	protected abstract String getFunctionName();

}
