package locationServicePackage;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import Irdi.IRDI_type;
import LocationService.source_identification;

/**
 * Class to provide the implementation of the location service, which implements a method to resolve a given RAI to a list of URIs 
*/
public class SourceIdentificationProvider
{
	private String _rai;
		
	/*Axis needs default constructor*/
	public SourceIdentificationProvider()
	{
	}
	

	/**
	 * Resolves a given registration authority identifier to a list of URIs that locate Level 2 (Terminology) 
	 * and Level 3 (Ontology) servers that can provide more information about the concept
	 * @return SourceIdentification list. Null if no server is found for the provided irdi. 
	 * @throws implementation_exception 
	 * @throws invalid_identifier_exception 
	 */
	public source_identification get_source_identification( IRDI_type RAI_ID ) throws implementation_exception, invalid_identifier_exception
	{
		if( RAI_ID == null )
		{
			return null;
		}
		_rai = RAI_ID.getRegistrationAuthorityIdentifier();
		XmlParser xmlParser = new XmlParser(_rai);
		source_identification sourceIdentification = xmlParser.GetSourceIdentificationList();
		return sourceIdentification;
	}
}
