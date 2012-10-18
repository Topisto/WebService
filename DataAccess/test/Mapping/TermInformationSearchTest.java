package Mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Irdi.IRDI_type;
import TerminologyModel.term_Type;

/**
 * Tests retrieving of a term 
 */
public class TermInformationSearchTest
{
	/**
	 * Validates if search term for '0173-1#02-AAA004#2' returns 'Anschliffform'. 
	 */
	@Test 
	public void ValidateTermWithInternalIrdi()
	{
		TermRetrieve search = null;
		try
		{
			IRDI_type irdi = new IRDI_type( "0173-1#02-AAA004#2", false);
			search = new TermRetrieve(irdi);
			term_Type term = search.Run();
			assertEquals("Anschliffform", term.getContent());
			assertEquals("", term.getAbbreviation().getContent());
		} 
		catch (Exception e)
		{
			fail(e.getMessage());	
		}
	}
	
	/**
	 * Validates if search term for '0173-1#01-AAF577#3' returns 'Anschliffform'. 
	 */
	@Test 
	public void ValidateTermWithoutInternalIrdi()
	{
		TermRetrieve search = null;
		try
		{
			IRDI_type irdi = new IRDI_type( "0173-1#01-AAF577#3", false);
			search = new TermRetrieve(irdi);
			term_Type term = search.Run();
			assertEquals("Propylmethacrylsäurepolymer", term.getContent());
		} 
		catch (Exception e)
		{
			fail(e.getMessage());	
		}
	}
}
