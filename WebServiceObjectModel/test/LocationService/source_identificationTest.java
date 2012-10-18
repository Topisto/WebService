package LocationService;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Validates the creation of source_identification objects
*/
public class source_identificationTest
{

		/**
	    * Validates if creation of source_identification with valid parameters succeeds
		*/
		@Test 
		public void When_all_parameters_are_passed_source_identification_is_created()
		{
			String terminology = "terminology";
			String ontology = "ontology";
			source_identification sourceIdentification = new source_identification("rai", terminology, ontology);
			assertEquals( "rai" , sourceIdentification.getRA_ref());
			assertEquals( "terminology" , sourceIdentification.getTerminology_server_URI());
			assertEquals( "ontology" , sourceIdentification.getOntology_server_URI());
    	}
}
