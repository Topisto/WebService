package locationServicePackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import locationServicePackage.SourceIdentificationProvider;

import org.junit.Test;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import Irdi.IRDI_type;
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
		try
		{
			IRDI_type irdi = new IRDI_type("112-5", true);
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-5", identificationList.getRA_ref());
			assertEquals("http://localhost:7779/axis2/services/OntologyService", identificationList.getOntology_server_URI());
			assertEquals("http://localhost:7779/axis2/services/TerminologyService", identificationList.getTerminology_server_URI());
		} 
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
		{
			fail(e.getMessage());
		}
	}
	
	/**
	 * Validates if IRDI = "Id="0173-1" return one terminolog server. 
	 */
	@Test 
	public void GetValidTerminology()
	{
		
		SourceIdentificationProvider locationService = new SourceIdentificationProvider();
		
		try
		{	
			IRDI_type irdi = new IRDI_type("0173-1", true);
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "0173-1", identificationList.getRA_ref());
			assertEquals("http://localhost:7779/axis2/services/TerminologyService", identificationList.getTerminology_server_URI());
		} 
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
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
		
		try
		{
			IRDI_type irdi = new IRDI_type("112-6",true);
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-6", identificationList.getRA_ref());
			assertEquals(null, identificationList.getOntology_server_URI());
			assertEquals("http://localhost:7778/axis2/services/TerminologyService", identificationList.getTerminology_server_URI());
		} 
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
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
		
		try
		{
			IRDI_type irdi = new IRDI_type("112-4", true);
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-4", identificationList.getRA_ref());
			assertEquals("http://localhost:7773/axis2/services/OntologyService", identificationList.getOntology_server_URI());
			assertEquals(null, identificationList.getTerminology_server_URI());
		} 
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
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
		
		try
		{
			IRDI_type irdi = new IRDI_type("112-10", true);
			source_identification identificationList = locationService.get_source_identification(irdi);
			assertEquals( "112-10", identificationList.getRA_ref());
			assertEquals(null, identificationList.getOntology_server_URI());
			assertEquals(null, identificationList.getTerminology_server_URI());
		} 
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
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
		catch (implementation_exception e)
		{
			fail(e.getMessage());
		} 
		catch (invalid_identifier_exception e)
		{
			fail(e.getMessage());
		}
	}

}
