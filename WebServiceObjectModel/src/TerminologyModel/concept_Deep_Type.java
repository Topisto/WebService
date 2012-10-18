package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the result of retrieving a concept and its related objects. 
 */
public class concept_Deep_Type implements java.io.Serializable 
{
	private static final long serialVersionUID = -1132063747084551912L;
	private concept_type_Type _conceptType;
	private concept_Type _concept;
	private term_Type _term;
	private definition_Type _definition;
	private abbreviation_Type _abbreviation;
	private image_Type _image;
	private symbol_Type _symbol;
	private concept_equivalence_relationship_Type _conceptEquivalenceRelationShip;
	private language_Type _language;
	private file_representation_Type _fileRepresentation;
	private document_Type _document;
	private representation_form _representationForm;
	
  
	/**
     * Axis needs a default constructor.
     */
    public concept_Deep_Type() 
    {
    
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param conceptType: @see concept_type_Type. 
     * @param concept: @see concept_Type. 
     * @param term:  @see term_Type. 
     * @param definition:  @see definition_Type
     * @param abbreviation:  @see abbreviation_Type
     * @param image:  @see image_Type
     * @param symbol:  @see symbol_Type
     * @param conceptEquivalenceRelationShip: @see concept_equivalence_relationship_Type
     * @param language:  @see language_Type 
     * @param fileRepresentation:  @see file_representation_Type
     * @param document:  @see document_Type
     * @param representationForm: @see representation_form
     */
    public concept_Deep_Type(concept_type_Type conceptType, concept_Type concept, term_Type term, 
    		definition_Type definition, abbreviation_Type abbreviation, image_Type image, symbol_Type symbol, 
    		concept_equivalence_relationship_Type conceptEquivalenceRelationShip, language_Type language, 
    		file_representation_Type fileRepresentation, document_Type document, representation_form representationForm ) 
    {
    	_conceptType = conceptType;
    	_concept = concept;
    	_term = term;
    	_definition = definition;
    	_abbreviation = abbreviation;
    	_image = image;
    	_symbol = symbol;
    	_conceptEquivalenceRelationShip = conceptEquivalenceRelationShip;
    	_language = language;
    	_fileRepresentation = fileRepresentation;
    	_document = document;
    	_representationForm = representationForm;
    }
    
    
	/**
     * Gets the representation form @see representation_form.
     * 
     * @return representation_form
     */
	public representation_form get_representationForm()
	{
		return _representationForm;
	}

    /**
     * Sets the representation form @see representation_form.
     * 
     * @param representationForm
     */
	public void set_representationForm(representation_form representationForm)
	{
		_representationForm = representationForm;
	}

	/**
     * Gets the file representation form @see file_representation_Type.
     * 
     * @return file_representation_Type
     */
	public file_representation_Type get_fileRepresentation()
	{
		return _fileRepresentation;
	}

    /**
     * Sets the file representation form @see file_representation_Type.
     * 
     * @param fileRepresentation
     */
	public void set_fileRepresentation(file_representation_Type fileRepresentation)
	{
		_fileRepresentation = fileRepresentation;
	}

	/**
     * Gets the type of the concept @see concept_type_Type.
     * 
     * @return concept_type_Type
     */
	public concept_type_Type get_conceptType()
	{
		return _conceptType;
	}

    /**
     * Sets the type of the concept @see concept_type_Type.
     * 
     * @param conceptType
     */
	public void set_conceptType(concept_type_Type conceptType)
	{
		_conceptType = conceptType;
	}

	/**
     * Gets the concept @see concept_Type.
     * 
     * @return concept_Type
     */
	public concept_Type get_concept()
	{
		return _concept;
	}

    /**
     * Sets the concept @see concept_Type.
     * 
     * @param concept
     */
	public void set_concept(concept_Type concept)
	{
		_concept = concept;
	}

	/**
     * Gets the term  @see term_Type.
     * 
     * @return term_Type
     */
	public term_Type get_term()
	{
		return _term;
	}

    /**
     * Sets the term  @see term_Type.
     * 
     * @param term
     */
	public void set_term(term_Type term)
	{
		_term = term;
	}

	/**
     * Gets the definition @see definition_Type.
     * 
     * @return definition_Type
     */
	public definition_Type get_definition()
	{
		return _definition;
	}

    /**
     * Sets the definition @see definition_Type.
     * 
     * @param definition
     */
	public void set_definition(definition_Type definition)
	{
		_definition = definition;
	}

	/**
     * Gets the abbreviation @see abbreviation_Type.
     * 
     * @return abbreviation_Type
     */
	public abbreviation_Type get_abbreviation()
	{
		return _abbreviation;
	}

    /**
     * Sets the abbreviation @see abbreviation_Type.
     * 
     * @param abbreviation
     */
	public void set_abbreviation(abbreviation_Type abbreviation)
	{
		_abbreviation = abbreviation;
	}

	/**
     * Gets the image @see image_Type.
     * 
     * @return image_Type
     */
	public image_Type get_image()
	{
		return _image;
	}

    /**
     * Sets the image @see image_Type.
     * 
     * @param image
     */
	public void set_image(image_Type image)
	{
		_image = image;
	}

	/**
     * Gets the symbol @see symbol_Type.
     * 
     * @return symbol_Type
     */
	public symbol_Type get_symbol()
	{
		return _symbol;
	}

    /**
     * Sets  the symbol @see symbol_Type.
     * 
     * @param symbol
     */
	public void set_symbol(symbol_Type symbol)
	{
		_symbol = symbol;
	}

	/**
     * Gets the concept equivalence relationship @see concept_equivalence_relationship_Type.
     * 
     * @return concept_equivalence_relationship_Type
     */
	public concept_equivalence_relationship_Type get_conceptEquivalenceRelationShip()
	{
		return _conceptEquivalenceRelationShip;
	}

    /**
     * Sets the concept equivalence relationship @see concept_equivalence_relationship_Type.
     * 
     * @param conceptEquivalenceRelationShip
     */
	public void set_conceptEquivalenceRelationShip(
			concept_equivalence_relationship_Type conceptEquivalenceRelationShip)
	{
		_conceptEquivalenceRelationShip = conceptEquivalenceRelationShip;
	}

	/**
     * Gets the language @see language_Type.
     * 
     * @return language_Type
     */
	public language_Type get_language()
	{
		return _language;
	}

    /**
     * Sets the language @see language_Type.
     * 
     * @param language
     */
	public void set_language(language_Type language)
	{
		_language = language;
	}

	/**
     * Gets the document @see document_Type.
     * 
     * @return document_Type
     */
	public document_Type get_document()
	{
		return _document;
	}

    /**
     * Sets the document @see document_Type.
     * 
     * @param document
     */
	public void set_document(document_Type document)
	{
		_document = document;
	}


}

