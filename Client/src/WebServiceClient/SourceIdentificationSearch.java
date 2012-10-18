package WebServiceClient;

import javax.xml.namespace.QName;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import ExceptionHandler.invalid_identifier_exception;
import Irdi.IRDI_type;
import LocationService.source_identification;
import WebServiceLogging.WebServiceLogger;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the source identifaction search. 
 */
public class SourceIdentificationSearch
{
  /**
    * The default constructor.
   */
  public SourceIdentificationSearch()
  {
  }
  
  /**
   * Calls the get_source_identification method of the location service. 
   * 
   * @param registrationAuthorityIdentifier: The registration authority identifier. 
   * @param targetEndpointReference: The URL of the server.
   * 
   * @return source_identification
   * @throws invalid_identifier_exception
   * @throws AxisFault
   * @throws Exception
   */
  public source_identification GetSourceIdentification( String registrationAuthorityIdentifier, String targetEndpointReference ) throws 
  	invalid_identifier_exception, AxisFault, Exception
  {
	try
	{
		RPCServiceClient sender = new RPCServiceClient();
		
		Options options = sender.getOptions();
		EndpointReference targetEPR = new EndpointReference( targetEndpointReference );
		options.setTo(targetEPR);

		//Call operation "get_source_identification" 
		QName opgetSourceIdentification = new QName( "http://locationServicePackage", "get_source_identification" );

		//Define parameters
		IRDI_type irdi = new IRDI_type( registrationAuthorityIdentifier, true);
		Object[] opArgs = new Object[]{irdi};

		Class[] returnTypes = new Class[] {source_identification.class };
		Object[] response = sender.invokeBlocking( opgetSourceIdentification, opArgs, returnTypes );
		
		source_identification sourceIdentification = (source_identification) response[0];
		
		return sourceIdentification;
	} 
	catch( AxisFault exception )
	{
	  WebServiceLogger.Log("Communication.java", "GetSourceIdentification", String.format( "AxisFault Exception is thrown. Details: %n " +
	  		"Message %s%n FaultCode %s%n Detail %s%n ", exception.getMessage(), exception.getFaultCode(), exception.getDetail()));	
	  	
	  throw exception;
	} 
	catch (invalid_identifier_exception exception )
	{
		WebServiceLogger.Log("Communication.java", "GetSourceIdentification", String.format( "InvalidIdentifierException is thrown. Message: %s", 
					exception.getMessage()));	
		throw exception;
	}
	catch( Exception exception )
	{
		WebServiceLogger.Log("Communication.java", "GetTerminologyInformation", String.format( "Exception is thrown. Details: %n " +
				"Message %s%n ", exception.getMessage()));	
		  	
		 throw exception;
	} 	
  }
}
