package locationServicePackage;

import static org.junit.Assert.*;

import locationServicePackage.XmlParser;

import org.junit.Test;

import ExceptionHandler.invalid_identifier_exception;
import Irdi.IRDI_type;

/**
 * Tests the correct parsing of the LocationService.xml 
*/
public class XmlParserTest
{
	/**
	* Validates if passing "TerminologyServer" returns the correct string 
	*/
	@Test 
	public void FindTerminologyServerUri()
	{
		try
		{
			IRDI_type identifier = new IRDI_type("112-5", true);
			XmlParser xmlParser = new XmlParser( identifier.getRegistrationAuthorityIdentifier() );
			String server = xmlParser.FindServerUri("TerminologyServer");
			assertEquals( "http://localhost:7779/axis2/services/TerminologyService", server );
		}
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage() );
		}
		catch( Exception exception )
		{
			fail( exception.getMessage());
		}
	}
	
	/**
	* Validates if passing "OntologyServer" returns the correct string 
	*/
	@Test 
	public void FindOntologyServerUri()
	{
		try
		{
			IRDI_type identifier = new IRDI_type("112-5", true );
			XmlParser xmlParser = new XmlParser( identifier.getRegistrationAuthorityIdentifier() );
			String server = xmlParser.FindServerUri("OntologyServer");
			assertEquals( "http://localhost:7779/axis2/services/OntologyService", server );
		}
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage() );
		}
		catch( Exception exception )
		{
			fail( exception.getMessage());
		}
	}	
	
	/**
	* Validates if passing an empty string returns the first found terminology server 
	*/
	@Test 
	public void FindEmptyStringAsUri()
	{
		try
		{
			IRDI_type identifier = new IRDI_type("112-5", true);
			XmlParser xmlParser = new XmlParser( identifier.getRegistrationAuthorityIdentifier() );
			String server = xmlParser.FindServerUri("");
			assertEquals( "http://localhost:7779/axis2/services/TerminologyService", server );
		}
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage() );
		}
		catch( Exception exception )
		{
			fail( exception.getMessage());
		}
	}
	
	/**
	* Validates if passing null returns null 
	*/
	@Test 
	public void FindNullAsUri()
	{
		try
		{
			IRDI_type identifier = new IRDI_type("112-5", true);
			XmlParser xmlParser = new XmlParser( identifier.getRegistrationAuthorityIdentifier() );
			String server = xmlParser.FindServerUri(null);
			assertEquals(null, server);
		}
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage() );
		}
		catch( Exception exception )
		{
			fail( exception.getMessage());
		}
	}
}
