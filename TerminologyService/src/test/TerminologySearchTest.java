package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import InformationSearch.TerminologyServiceProvider;
import Irdi.IRDI_type;
import Mapping.LanguageRetrieve;
import TerminologyModel.language_Type;
import TerminologyModel.term_Type;

public class TerminologySearchTest
{
	
	/**
	 * Validates if search term for '0173-1#01-AAF577#3' returns 'Anschliffform'. 
	 */
	@Test 
	public void ValidateTermWithoutInternalIrdi()
	{
		try
		{
			TerminologyServiceProvider terminology = new TerminologyServiceProvider(); 
			IRDI_type irdi = new IRDI_type( "0173-1#01-AAF577#3", false);
			term_Type term = terminology.get_term(irdi);
			assertEquals("Propylmethacrylsäurepolymer", term.getContent());
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
		try
		{
			TerminologyServiceProvider terminology = new TerminologyServiceProvider(); 
			IRDI_type irdi = new IRDI_type( "0173-1#01-AAF577#3", false);
			language_Type language = terminology.get_language(irdi);
			assertEquals("DEU", language.getCountryCode());
			assertEquals("deu", language.getLanguageCode());
		} 
		catch (Exception e)
		{
			fail(e.getMessage());	
		}
	}	
}
