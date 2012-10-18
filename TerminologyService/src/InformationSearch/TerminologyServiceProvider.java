package InformationSearch;

import ExceptionHandler.implementation_exception;
import ExceptionHandler.invalid_identifier_exception;
import ExceptionHandler.invalid_pattern_exception;
import ExceptionHandler.object_not_found_exception;
import Irdi.IRDI_type;
import Mapping.AbbreviationRetrieve;
import Mapping.DefinitionRetrieve;
import Mapping.LanguageRetrieve;
import Mapping.LanguageSearch;
import Mapping.TermRetrieve;
import TerminologyModel.abbreviation_Type;
import TerminologyModel.concept_Deep_Type;
import TerminologyModel.concept_Type;
import TerminologyModel.concept_equivalence_relationship_Type;
import TerminologyModel.concept_search_result_sequence_Type;
import TerminologyModel.concept_search_specification_Type;
import TerminologyModel.concept_type_Type;
import TerminologyModel.definition_Type;
import TerminologyModel.document_Type;
import TerminologyModel.document_search_result_sequence_Type;
import TerminologyModel.document_search_specification_Type;
import TerminologyModel.file_representation_Type;
import TerminologyModel.image_Type;
import TerminologyModel.language_Type;
import TerminologyModel.language_search_result_sequence_Type;
import TerminologyModel.language_search_specification_Type;
import TerminologyModel.organization_Type;
import TerminologyModel.symbol_Type;
import TerminologyModel.term_Type;


/**
 * /**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Class to provide the implementation of the terminology service, which supports searching of concepts based on 
 * values of terms, definitions or related information. The service supports also retrieving information about 
 * concepts, their terminology and related information based on IRDIs.
*/
public class TerminologyServiceProvider
{
    /**
	/*Axis needs default constructo
     */
	public TerminologyServiceProvider()
	{
	}
	
		
    /**
     * Retrieves an abbreviation.
     * 
     * @param abbreviation_ID: An external identifier used for the abbreviation by the dictionary
     * @return abbreviation_Type: An abbreviation object containing information about the abbreviation.
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception 
     */
	public abbreviation_Type get_abbreviation( IRDI_type abbreviation_ID  ) throws implementation_exception, 
				invalid_identifier_exception, object_not_found_exception
	{
		if( abbreviation_ID == null )
		{
			throw new invalid_identifier_exception("The provided abbreviation_ID is null");
		}
		
		AbbreviationRetrieve search = new AbbreviationRetrieve(abbreviation_ID);
    	return search.Run();
	}
	
    /**
     * Retrieves a concept.
     * 
     * @param concept_ID: An external identifier used for the concept by the dictionary. 
     * @return concept_Type: A concept object containing information about the concept. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception  
     */
	public concept_Type get_concept( IRDI_type concept_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( concept_ID == null )
		{
			throw new invalid_identifier_exception("The provided concept_Id is null");
		}
		
		return null;
	}
	
    /**
     * Retrieves a concept and its related objects.
     * 
     * @param concept_ID: An external identifier used for the concept by the dictionary.
     * @param language_restriction: If specified only terminological items in one of the given language are returned. 
     * @return concept_Deep_Type: An object containing the related objects of the concept. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public concept_Deep_Type get_concept_deep( IRDI_type concept_ID, IRDI_type[] language_restriction ) throws 
			implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		if( concept_ID == null )
		{
			throw new invalid_identifier_exception("The provided concept_Id is null");
		}
		return null;
	}
	
    /**
     * Retrieves a concept equivalence relationship. 
     * 
     * @param concept_equivalence_relationship_ID: An external identifier used for the concept equivalence relationship by the dictionary.
     * @return concept_equivalence_relationship_Type: An object containing information about the concept equivalence relationship. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public concept_equivalence_relationship_Type get_concept_equivalence_relationship( IRDI_type concept_equivalence_relationship_ID) throws 
			implementation_exception, invalid_identifier_exception, object_not_found_exception
	{
		if( concept_equivalence_relationship_ID == null )
		{
			throw new invalid_identifier_exception("The provided concept_equivalence_relationship_ID is null");
		}
		
		return null;
	}
	
    /**
     * Retrieves the type of a concept.
     * 
     * @param concept_type_ID: An external identifier used for the concept type by the dictionary.
     * @return concept_type_Type: An object containing information of the concept type. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public concept_type_Type get_concept_type( IRDI_type concept_type_ID) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( concept_type_ID == null )
		{
			throw new invalid_identifier_exception("The provided concept_type_ID is null");
		}
		
		return null;
	}

    /**
     * Retrieves a definition.
     * 
     * @param definition_ID: An external identifier used for the definition by the dictionary.
     * @return definition_Type: An object containing information about the definition.  
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public definition_Type get_definition( IRDI_type definition_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( definition_ID == null )
		{
			throw new invalid_identifier_exception("The provided definition_ID is null");
		}
	
		DefinitionRetrieve search = new DefinitionRetrieve(definition_ID);
    	return search.Run();
	}
	
    /**
     * Retrieves a document.
     * 
     * @param document_ID: An external identifier used for the document by the dictionary.
     * @return document_Type: An object containing information about the document. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public document_Type get_document( IRDI_type document_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( document_ID == null )
		{
			throw new invalid_identifier_exception("The provided document_ID is null");
		}
		return null;
	}
	
    /**
     * Retrieves a representation of a file.
     * 
     * @param file_representation_ID: An external identifier used for the file representation by the dictionary.
     * @return file_representation_Type: An object containing the information about the file representation. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public file_representation_Type get_file_representation( IRDI_type file_representation_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( file_representation_ID == null )
		{
			throw new invalid_identifier_exception("The provided file_representation_ID is null");
		}
		
		return null;
	}
	
    /**
     * Retrieves a graphic file url.
     * 
     * @param graphic_file_ID: An external identifier used for the graphic file by the dictionary.
     * @return String: URL from which the content of the graphic file can be retrieved. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public String get_graphic_file_URL( IRDI_type graphic_file_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( graphic_file_ID == null )
		{
			throw new invalid_identifier_exception("The provided graphic_file_ID is null");
		}
		return null;
	}
	
    /**
     * Retrieves an image.
     * 
     * @param image_ID: An external identifier used for the image by the dictionary.
     * @return image_Type: An object containing information about the image. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public image_Type get_image( IRDI_type image_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( image_ID == null )
		{
			throw new invalid_identifier_exception("The provided image_ID is null");
		}
		
		return null;
	}
	
    /**
     * Retrieves a language.
     * 
     * @param language_ID: An external identifier used for the language by the dictionary.
     * @return language_Type: An object containing the information about the language. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public language_Type get_language( IRDI_type language_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( language_ID == null )
		{
			throw new invalid_identifier_exception("The provided language_ID is null");
		}
	
		LanguageRetrieve search = new LanguageRetrieve(language_ID);
    	return search.Run();
	}
	
    /**
     * Retrieves an organization.
     * 
     * @param organization_ID: An external identifier used for the organization by the dictionary.
     * @return organization_Type: An object containing the information about the organization. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public organization_Type get_organization( IRDI_type organization_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( organization_ID == null )
		{
			throw new invalid_identifier_exception("The provided organization_ID is null");
		}
		return null;
	}
	
    /**
     * Retrieves a symbol.
     * 
     * @param symbol_ID: An external identifier used for the symbol by the dictionary.
     * @return symbol_Type: A object containing the information about the symbol. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public symbol_Type get_symbol( IRDI_type symbol_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( symbol_ID == null )
		{
			throw new invalid_identifier_exception("The provided symbol_ID is null");
		}
	
		return null;
	}
	
    /**
     * Retrieves a term.
     * 
     * @param term_ID: An external identifier used for the term by the dictionary.
     * @return term_Type: An object containing information about the term. 
     * @throws implementation_exception 
     * @throws object_not_found_exception 
	 * @throws invalid_identifier_exception   
     */
	public term_Type get_term( IRDI_type term_ID  ) throws implementation_exception, 
			invalid_identifier_exception, object_not_found_exception
	{
		if( term_ID == null )
		{
			throw new invalid_identifier_exception("The provided term_Id is null");
		}
	
		TermRetrieve search = new TermRetrieve(term_ID);
    	return search.Run();
	}
	
    /**
     * Retrieves one or more concept objects that match a set of criteria.
     * 
     * @param search_specification: The specification of the search criteria.
     * @param max_results: The maximun number of results to be returned. 
     * @return concept_search_result_sequence_Type: Concepts that match the search criteria and its associated score. 
     * @return results_truncated: Indicates whether or not some results met the search criteria but were not returned due there 
     * being more than max_results matching concept objects.
     * @throws implementation_exception 
     * @throws invalid_pattern_exception 
     */
	public concept_search_result_sequence_Type search_concept( concept_search_specification_Type search_specification, int max_results) throws 
			implementation_exception, invalid_pattern_exception
	{
		if( search_specification == null )
		{
			return null;
		}
		
		return null;		
	}
	
	 /**
     * Retrieves one or more document objects that match a set of criteria.
     * 
     * @param search_specification: The specification of the search criteria.
     * @param max_results: The maximun number of results to be returned. 
     * @return document_search_result_sequence_Type: Document that match the search criteria and its associated score. 
     * @return results_truncated: Indicates whether or not some results met the search criteria but were not returned due there 
     * being more than max_results matching concept objects.
     * @throws implementation_exception 
     * @throws invalid_pattern_exception 
     */
	public document_search_result_sequence_Type search_document( document_search_specification_Type search_specification, int max_results  ) throws
			implementation_exception, invalid_pattern_exception
	{
		if( search_specification == null )
		{
			return null;
		}
		
		return null;		
	}
	
	 /**
     * Retrieves one or more language objects that match a set of criteria.
     * 
     * @param search_specification: The specification of the search criteria.
     * @param max_results: The maximun number of results to be returned. 
     * @return language_search_result_sequence_Type: Language that match the search criteria and its associated score. 
     * @return results_truncated: Indicates whether or not some results met the search criteria but were not returned due there 
     * being more than max_results matching concept objects.
     * @throws implementation_exception 
     * @throws invalid_pattern_exception 
     */
	public language_search_result_sequence_Type search_language( language_search_specification_Type search_specification, int max_results  ) throws 
			implementation_exception, invalid_pattern_exception
	{
		if( search_specification == null )
		{
			return null;
		}
		
		LanguageSearch search = new LanguageSearch(search_specification, max_results);
    	return search.Run();
	}
}
