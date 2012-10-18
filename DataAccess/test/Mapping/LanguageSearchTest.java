package Mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Irdi.IRDI_type;
import TerminologyModel.language_Type;

/**
 * Tests retrieving of a language 
 */
public class LanguageSearchTest
{
	/**
	 * Validates if search language for '0173-1#02-AAA004#2' retrieves german 
	 */
	@Test 
	public void ValidateLanguageWithInternalIrdi()
	{
	   	LanguageRetrieve search = null;
		try
		{
			IRDI_type irdi = new IRDI_type( "0173-1#02-AAA004#2", false);
			search = new LanguageRetrieve(irdi);
			language_Type language = search.Run();
			assertEquals("DEU", language.getCountryCode());
			assertEquals("deu", language.getLanguageCode());
		} 
		catch (Exception e)
		{
			fail(e.getMessage());	
		}
	}
	
	/**
	 *  Validates if search language for '0173-1#01-AAF577#3' retrieves german 
	 */
	@Test 
	public void ValidateLanguageWithoutInternalIrdi()
	{
		LanguageRetrieve search = null;
		try
		{
			IRDI_type irdi = new IRDI_type( "0173-1#01-AAF577#3", false);
			search = new LanguageRetrieve(irdi);
			language_Type language = search.Run();
			assertEquals("DEU", language.getCountryCode());
			assertEquals("deu", language.getLanguageCode());
		} 
		catch (Exception e)
		{
			fail(e.getMessage());	
		}
	}
}
