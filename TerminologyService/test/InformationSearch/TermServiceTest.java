package InformationSearch;

import static org.junit.Assert.*;
import org.junit.Test;

import ExceptionHandler.InvalidIdentifierException;
import Irdi.RegistrationAuthorityIdentifier;

/**
 * Tests the TermService 
 */
public class TermServiceTest
{
	/**
	 * Validates if IRDI = "Id="112-5" return one terminolog and one ontology server. 
	 */
	@Test 
	public void GetPrefferedName()
	{
		RegistrationAuthorityIdentifier irdi = new RegistrationAuthorityIdentifier();
		try
		{
		 irdi.Validate("0173-1#01-AAF577#3");
		} 
		catch (InvalidIdentifierException e)
		{
		  
			fail(e.getMessage());	
		}
		TermService service = new TermService();
		String name = service.get_Term(irdi);
		assertEquals("Propylmethacrylsäurepolymer", name);
	}
}
