package locationServicePackage;

import ExceptionHandler.ImplementationException;
import ExceptionHandler.InvalidIdentifierException;
import Irdi.RegistrationAuthorityIdentifier;
import LocationService.source_identification;

/**
 * Class to provide the implementation of the location service, which implements a method to resolve a given RAI to a list of URIs 
*/
public class SourceIdentificationProvider
{
	private RegistrationAuthorityIdentifier _rai;
		
	/*Axis needs default constructor*/
	public SourceIdentificationProvider()
	{
	}
	

	/**
	 * Resolves a given irdi to a list of URIs that locate Level 2 (Terminology) 
	 * and Level 3 (Ontology) servers that can provide more information about the concept
	 * @return SourceIdentification list. Null if no server is found for the provided irdi. 
	 * @throws ImplementationException 
	 * @throws InvalidIdentifierException 
	 */
	public source_identification get_source_identification( RegistrationAuthorityIdentifier RAI_ID ) throws ImplementationException, InvalidIdentifierException
	{
		if( RAI_ID == null )
		{
			return null;
		}
		_rai = RAI_ID;
		XmlParser xmlParser = new XmlParser( _rai );
		source_identification sourceIdentification = xmlParser.GetSourceIdentificationList();
		return sourceIdentification;
	}
}
