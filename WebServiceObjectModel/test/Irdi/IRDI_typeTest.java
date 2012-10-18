package Irdi;
import org.junit.*;

import ExceptionHandler.invalid_identifier_exception;
import static org.junit.Assert.*;

public class IRDI_typeTest
{
	/**
    * Validates if irdi = "0123-45-678-9-ABC" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIAllItemsAreSet()
	{
		try
		{
			IRDI_type irdi = new IRDI_type("0123-45-678-9-ABC", true);
			assertEquals(  "0123-45-678-9-ABC", irdi.getRegistrationAuthorityIdentifier());
		} 
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage());
		}
	}
	
		/**
	    * Validates if irdi = "0123-45-678-9-ABC" succeeds. It is tested, that all elements are correctly set 
		*/
		@Test 
		public void ValidRaiFromDatabase()
		{
			try
			{
				IRDI_type irdi = new IRDI_type("0173-1#01-AAF577#3", false);
				assertEquals(  "0173-1", irdi.getRegistrationAuthorityIdentifier());
				assertEquals(  "0173-1#01-AAF577#3", irdi.getIrdi());
			} 
			catch( invalid_identifier_exception exception )
			{
				fail( exception.getMessage());
			}
		}
	
	
	/**
	* Validates if irdi = "0161-1" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIOnlyICDAndOIAreSet()
	{
		try
		{
			IRDI_type irdi = new IRDI_type("0161-1" , true);
			assertEquals(  "0161-1", irdi.getRegistrationAuthorityIdentifier());
		} 
		catch( invalid_identifier_exception exception )
		{
			fail( exception.getMessage());
		}

	}
	
	/**
	* Validates if irdi = "0112-2---61360_4_1" succeeds. It is tested, that all elements are correctly set 
	*/
	@Test 
	public void ValidRRAIOnlyICDAndOIAndAIAreSet()
	{
		try
		{
			IRDI_type irdi = new IRDI_type("0112-2---61360_4_1", true);
			assertEquals(  "0112-2---61360_4_1", irdi.getRegistrationAuthorityIdentifier());
		} 
		catch (invalid_identifier_exception exception )
		{
			fail( exception.getMessage());
		}
	}
	
	/**
	* Validates if irdi = "0161-1--" fails. 
	 * @throws invalid_identifier_exception 
	*/
	@Test (expected=invalid_identifier_exception.class)
	public void InvalidRAITrailingHyphens() throws invalid_identifier_exception
	{
		IRDI_type registrationAuthorityIdentifier = new IRDI_type("0161-1--", true);
	}
	
}
