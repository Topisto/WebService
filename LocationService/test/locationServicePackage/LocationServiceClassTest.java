package locationServicePackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import locationServicePackage.SourceIdentificationProvider;

import org.junit.Test;

import ExceptionHandler.ImplementationException;
import ExceptionHandler.InvalidIdentifierException;
import Irdi.RegistrationAuthorityIdentifier;
import LocationService.source_identification;

/**
 * Tests the get_source_identification method. 
 */
public class LocationServiceClassTest
{
	/**
	 * Validates if IRDI = "Id="112-5" return one terminolog and one ontology server. 
	 */
	@Test 
	public void GetValidTerminologyAndOntologyServer()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
			irdi.Validate("112-5");
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-5", identificationList.getProvider());
			assertEquals("http://localhost:7779/axis2/services/OntologyService", identificationList.getOntologyServer());
			assertEquals("http://localhost:7779/axis2/services/TerminologyService", identificationList.getTerminologyServer());
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}
	
	/**
	 * Validates if IRDI = "Id="0173-1#01-AAF577#3" return one terminolog server. 
	 */
	@Test 
	public void GetValidTerminology()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
			irdi.Validate("0173-1#01-AAF577#3");
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "0173-1#01-AAF577#3", identificationList.getProvider());
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}
	
	/**
	 * Validates if IRDI = "Id="112-6" return one terminolog and no ontology server. 
	 */
	@Test 
	public void GetValidTerminologyAndNoOntologyServer()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
			irdi.Validate("112-6");
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-6", identificationList.getProvider());
			assertEquals(null, identificationList.getOntologyServer());
			assertEquals("http://localhost:7778/axis2/services/TerminologyService", identificationList.getTerminologyServer());
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}	
	
	/**
	 * Validates if IRDI = "Id="112-4" return no terminology and one ontology server. 
	 */
	@Test 
	public void GetValidNoTerminologyAndOneOntologyServer()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
			irdi.Validate("112-4");
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-4", identificationList.getProvider());
			assertEquals("http://localhost:7773/axis2/services/OntologyService", identificationList.getOntologyServer());
			assertEquals(null, identificationList.getTerminologyServer());
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}
	
	/**
	 * Validates if IRDI = "Id="112-10" returns no server. 
	 */
	@Test 
	public void ProvideAnUnknownIrdi()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
			irdi.Validate("112-10");
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-10", identificationList.getProvider());
			assertEquals(null, identificationList.getOntologyServer());
			assertEquals(null, identificationList.getTerminologyServer());
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}
	
	/**
	 * Validates null returns null as list. 
	 */
	@Test 
	public void ProvideNullAsIrdi()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		try
		{
			source_identification identificationList = locationService.get_source_identification(null);
			assertNull(identificationList);
		} 
		catch (ImplementationException e)
		{
			fail(e.getMessage());
		} 
		catch (InvalidIdentifierException e)
		{
			fail(e.getMessage());
		}
	}
	
	
}
