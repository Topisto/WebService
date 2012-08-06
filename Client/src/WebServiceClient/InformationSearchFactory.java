package WebServiceClient;

import ExceptionHandler.ImplementationException;
import ExceptionHandler.InvalidIdentifierException;
import Irdi.AbbreviationIdentifier;

public class InformationSearchFactory
{
	public static InformationSearchRequest CreateRequest( InformationSearchTypes type, String searchValue, String targetEndpointReference ) throws ImplementationException, InvalidIdentifierException
	{
		switch ( type )
		{
			case Abbreviation:
			{
				AbbreviationIdentifier abbreviationIdentifier = new AbbreviationIdentifier();
				abbreviationIdentifier.Validate( searchValue );
				return new AbbreviationSearchRequest( abbreviationIdentifier, targetEndpointReference );
			}
			case Concept:
			{
				
			}
			case Concept_Deep:
			{
				
			}
			case Concept_Equivalence_Relationship:
			{
				
			}
			case Concept_Type:
			{
				
			}
			case Definition:
			{
				
			}
			case Document:
			{
				
			}
			case File_Representation:
			{
				
			}
			case Graphic_File_Url:
			{
				
			}
			case Image:
			{
				
			}
			case Language:
			{
				
			}
			case Organization:
			{
				
			}
			case Symbol:
			{
				
			}
			case Term:
			{
				
			}
			default:
			{
				throw new ImplementationException();
				
			}
			
		}

	}
}
