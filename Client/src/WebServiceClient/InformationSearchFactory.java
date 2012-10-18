package WebServiceClient;

import org.apache.axis2.AxisFault;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import Irdi.IRDI_type;
import TerminologyModel.InformationSearchTypes;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class starts the request dependent on the given task. 
 */
public class InformationSearchFactory
{
	/**
	* Creates the specialized request.
	* 
	* @param type: The provided task. 
	* @param conceptIdentifier: The IRDI. 
	* @param targetEndpointReference: The URL of the server.
	*
	* @return InformationSearchRequest
	* @throws invalid_identifier_exception 
	* @throws implementation_exception
	* @throws AxisFault 
    * @throws Exception 
	*/ 
	public static InformationSearchRequest CreateRequest( InformationSearchTypes type, String conceptIdentifier, String targetEndpointReference ) throws 
	invalid_identifier_exception, implementation_exception, AxisFault, Exception
	{
	    IRDI_type irdi = new IRDI_type(conceptIdentifier, false);
		
		switch ( type )
		{
			case Abbreviation:
			{
				return new AbbreviationSearchRequest( irdi, targetEndpointReference );
			}
			case Concept:
			{
				return new ConceptSearchRequest( irdi, targetEndpointReference );
			}
			case Concept_Deep:
			{
				return new ConceptDeepSearchRequest( irdi, targetEndpointReference );
			}
			case Concept_Equivalence_Relationship:
			{
				return new ConceptEquivalenceRelationshipSearchRequest( irdi, targetEndpointReference );
			}
			case Concept_Type:
			{
				return new ConceptTypeSearchRequest( irdi, targetEndpointReference );
			}
			case Definition:
			{
				return new DefinitionSearchRequest( irdi, targetEndpointReference );
			}
			case Document:
			{
				return new DocumentSearchRequest( irdi, targetEndpointReference );
			}
			case File_Representation:
			{
				return new FileRepresentationSearchRequest( irdi, targetEndpointReference );
			}
			case Graphic_File_Url:
			{
				return new GraphicFileUrlRequest( irdi, targetEndpointReference );
			}
			case Image:
			{
				return new ImageSearchRequest( irdi, targetEndpointReference );
			}
			case Language:
			{
				return new LanguageSearchRequest( irdi, targetEndpointReference );
			}
			case Organization:
			{
				return new OrganizationSearchRequest( irdi, targetEndpointReference );
			}
			case Symbol:
			{
				return new SymbolSearchRequest( irdi, targetEndpointReference );
			}
			case Term:
			{
				return new TermSearchRequest( irdi, targetEndpointReference );
			}
			default:
			{
				throw new implementation_exception(String.format("InformationSearchTypes not found %s", type), -1);
				
			}
		}
	}
}
