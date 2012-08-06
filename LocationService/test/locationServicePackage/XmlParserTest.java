package locationServicePackage;

import static org.junit.Assert.*;
import locationServicePackage.XmlParser;

import org.junit.Test;

import ExceptionHandler.InvalidIdentifierException;
import Irdi.RegistrationAuthorityIdentifier;

public class XmlParserTest
{
	/**
	* Validates if passing "TerminologyServer" returns the correct string 
	*/
	@Test 
	public void FindTerminologyServerUri()
	{
		RegistrationAuthorityIdentifier identifier = new RegistrationAuthorityIdentifier();
		try
		{
			identifier.Validate( "112-5" );
			XmlParser xmlParser = new XmlParser( identifier );
			String server = xmlParser.FindServerUri("TerminologyServer");
			assertEquals( "http://localhost:7779/axis2/services/TerminologyService", server );
		}
		catch( InvalidIdentifierException exception )
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
		RegistrationAuthorityIdentifier identifier = new RegistrationAuthorityIdentifier();
		try
		{
			identifier.Validate( "112-5" );
			XmlParser xmlParser = new XmlParser( identifier );
			String server = xmlParser.FindServerUri("OntologyServer");
			assertEquals( "http://localhost:7779/axis2/services/OntologyService", server );
		}
		catch( InvalidIdentifierException exception )
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
		RegistrationAuthorityIdentifier identifier = new RegistrationAuthorityIdentifier();
		try
		{
			identifier.Validate( "112-5" );
			XmlParser xmlParser = new XmlParser( identifier );
			String server = xmlParser.FindServerUri("");
			assertEquals( "http://localhost:7779/axis2/services/TerminologyService", server );
		}
		catch( InvalidIdentifierException exception )
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
		RegistrationAuthorityIdentifier identifier = new RegistrationAuthorityIdentifier();
		try
		{
			identifier.Validate( "112-5" );
			XmlParser xmlParser = new XmlParser( identifier );
			String server = xmlParser.FindServerUri(null);
			assertNull( server );
		}
		catch( InvalidIdentifierException exception )
		{
			fail( exception.getMessage() );
		}
		catch( Exception exception )
		{
			fail( exception.getMessage());
		}
	}
}
