package WebServiceClient;

import javax.xml.namespace.QName;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import ExceptionHandler.InvalidIdentifierException;
import Irdi.RegistrationAuthorityIdentifier;
import LocationService.source_identification;
import WebServiceLogging.WebServiceLogger;

public class Communication
{
  
  public Communication()
  {
  }
  
  public String GetTerminologyInformation(String registrationAuthorityIdentifier, String targetEndpointReference, String informationChoice ) throws Exception
  {
	  try
	  {
		  RPCServiceClient sender = new RPCServiceClient();
			
		  Options options = sender.getOptions();
		  EndpointReference targetEPR = new EndpointReference( targetEndpointReference );
		  options.setTo(targetEPR);

		  //Call operation "get_term" 
		  QName opgetTerm = new QName( "http://InformationSearch", "get_Term" );

		  //Define parameters
		  RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		  irdi.Validate( registrationAuthorityIdentifier );

          Object[] opArgs = new Object[]{irdi};

		  Class[] returnTypes = new Class[] {String.class };
		  Object[] response = sender.invokeBlocking( opgetTerm, opArgs, returnTypes );
			
		  return (String) response[0];
		} 
		catch( AxisFault exception )
		{
		  WebServiceLogger.Log("Communication.java", "GetTerminologyInformation", String.format( "AxisFault Exception is thrown. Details: %n " +
		  		"Message %s%n FaultCode %s%n Detail %s%n ", exception.getMessage(), exception.getFaultCode(), exception.getDetail()));	
		  	
		  throw exception;
		} 
		catch (InvalidIdentifierException exception )
		{
			WebServiceLogger.Log("Communication.java", "GetTerminologyInformation", String.format( "InvalidIdentifierException is thrown. Message: %s", 
						exception.getMessage()));	
			throw exception;
		}  
	  
  }
  
  
  
  
  public source_identification GetSourceIdentification( String registrationAuthorityIdentifier, String targetEndpointReference ) throws Exception
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
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		irdi.Validate( registrationAuthorityIdentifier );

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
	catch (InvalidIdentifierException exception )
	{
		WebServiceLogger.Log("Communication.java", "GetSourceIdentification", String.format( "InvalidIdentifierException is thrown. Message: %s", 
					exception.getMessage()));	
		throw exception;
	}
  }
}
