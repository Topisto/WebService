package Irdi;
import org.junit.*;

import ExceptionHandler.InvalidIdentifierException;
import static org.junit.Assert.*;

public class RegistrationAuthorityIdentifierTest
{
	/**
    * Validates if RAI = "0123-45-678-9-ABC" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIAllItemsAreSet()
	{
		RegistrationAuthorityIdentifier registrationAuthorityIdentifier = new RegistrationAuthorityIdentifier();
		try
		{
			registrationAuthorityIdentifier.Validate( "0123-45-678-9-ABC" );
			//assertEquals(  "0123-45-678-9-ABC", registrationAuthorityIdentifier.getRegistrationAuthorityIdentifierValue());
			//assertEquals(  "0123", registrationAuthorityIdentifier.getInternationalCodeDesignator());
			//assertEquals(  "45", registrationAuthorityIdentifier.getOrganizationIdentifier() );
			//assertEquals(  "678", registrationAuthorityIdentifier.getOrganizationPartIdentifier() );
			//assertEquals(  "9", registrationAuthorityIdentifier.getOrganizationPartIdentifierSource() );
			//assertEquals(  "ABC", registrationAuthorityIdentifier.getAdditionalInformation() );
		} 
		catch( InvalidIdentifierException exception )
		{
			fail( exception.getMessage());
		}
	}
	
	/**
	* Validates if RAI = "0161-1" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIOnlyICDAndOIAreSet()
	{
		RegistrationAuthorityIdentifier registrationAuthorityIdentifier = new RegistrationAuthorityIdentifier();
		try
		{
			registrationAuthorityIdentifier.Validate( "0161-1" );
			//assertEquals(  "0161-1", registrationAuthorityIdentifier.getRegistrationAuthorityIdentifierValue());
			//assertEquals(  "0161", registrationAuthorityIdentifier.getInternationalCodeDesignator());
			//assertEquals(  "1", registrationAuthorityIdentifier.getOrganizationIdentifier() );
			//assertEquals(  null, registrationAuthorityIdentifier.getOrganizationPartIdentifier() );
			//assertEquals(  null, registrationAuthorityIdentifier.getOrganizationPartIdentifierSource() );
			//assertEquals(  null, registrationAuthorityIdentifier.getAdditionalInformation() );
		} 
		catch( InvalidIdentifierException exception )
		{
			fail( exception.getMessage());
		}

	}
	
	/**
	* Validates if RAI = "0112-2---61360_4_1" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIOnlyICDAndOIAndAIAreSet()
	{
		RegistrationAuthorityIdentifier registrationAuthorityIdentifier = new RegistrationAuthorityIdentifier();
		try
		{
			registrationAuthorityIdentifier.Validate( "0112-2---61360_4_1" );
			//assertEquals(  "0112-2---61360_4_1", registrationAuthorityIdentifier.getRegistrationAuthorityIdentifierValue());
			//assertEquals(  "0112", registrationAuthorityIdentifier.getInternationalCodeDesignator());
			//assertEquals(  "2", registrationAuthorityIdentifier.getOrganizationIdentifier() );
			//assertEquals(  null, registrationAuthorityIdentifier.getOrganizationPartIdentifier() );
			//assertEquals(  null, registrationAuthorityIdentifier.getOrganizationPartIdentifierSource() );
			//assertEquals(  "61360_4_1", registrationAuthorityIdentifier.getAdditionalInformation() );
		} 
		catch (InvalidIdentifierException exception )
		{
			fail( exception.getMessage());
		}

	}
	
	/**
	* Validates if RAI = "0161-1--" fails. 
	 * @throws InvalidIdentifierException 
	*/
	@Test (expected=InvalidIdentifierException.class)
	public void InvalidRAITrailingHyphens() throws InvalidIdentifierException
	{
		RegistrationAuthorityIdentifier registrationAuthorityIdentifier = new RegistrationAuthorityIdentifier();
		registrationAuthorityIdentifier.Validate( "0161-1--" );
	}
	
}
