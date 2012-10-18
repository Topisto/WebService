package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the concept, the unit of thought.
 */
public class concept_Type  implements java.io.Serializable 
{
	
	private static final long serialVersionUID = -8479649879873693726L;

	private IRDI_type _irdi;
	private definition_Type _definition;
	private image_Type _image;
	private boolean _is_deprecated;
    private symbol_Type _symbol;
	private term_Type _term;
	private concept_type_Type _conceptType;

	/**
     * Axis needs a default constructor.
     */
	public concept_Type() 
    {
    }

	
	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: @see IRDI_type
     * @param defintion: @see definition_Type
     * @param image: @see image_Type
     * @param isDeprecated: the indication whether or not the dictionaries RA recommends that the concept be used.
     * @param symbol: @see symbol_Type
     * @param term: @see term_Type
     * @param conceptType: @see concept_type_Type
     * 
     */
    public concept_Type( IRDI_type irdi, definition_Type definition, image_Type image, boolean isDeprecated, 
    		symbol_Type symbol, term_Type term, concept_type_Type conceptType )
    {
    	_irdi = irdi;
    	_definition = definition;
    	_image = image;
    	_is_deprecated = isDeprecated;
        _symbol = symbol;
    	_term = term;
    	_conceptType = conceptType;
    }

    
    /**
     * Gets the IRDI_type that unambiguously identifies the concept.
     * 
     * @return IRDI_type
     */
    public IRDI_type getIrdi()
    {
        return _irdi;
    }


    /**
     * Sets the IRDI_type that unambiguously identifies the concept.
     * 
     * @param irdi
     */
    public void setIrdi(IRDI_type irdi)
    {
        _irdi = irdi;
    }
    
    
    /**
     * Gets the definition that describes the concept.
     * 
     * @return definition_Type
     */
    public definition_Type getDefinition()
    {
        return _definition;
    }


    /**
     * Sets the definition that describes the concept.
     * 
     * @param definition
     */
    public void setDefinition(definition_Type definition) 
    {
        _definition = definition;
    }
    
    
    /**
     * Gets the image that illustrates the concept.
     * 
     * @return image_Type
     */
    public image_Type getImage() 
    {
        return _image;
    }


    /**
     * Sets the image that illustrates the concept.
     * 
     * @param image
     */
    public void setImage(image_Type image) 
    {
        _image = image;
    }
    

    /**
     * Gets the indication whether or not the dictionaries RA recommends that the concept be used.
     * 
     * @return boolean
     */
    public boolean getIsDeprecated() 
    {
    	return _is_deprecated;
    }


    /**
     * Sets the indication whether or not the dictionaries RA recommends that the concept be used.
     * 
     * @param isDeprecated
     */
    public void setIsDeprecated(boolean isDeprecated) 
    {
    	_is_deprecated = isDeprecated;
    }
    

    /**
     * Gets the symbol that designates the concept.
     * 
     *  @return symbol_Type
     */
    public symbol_Type getSymbol()
    {
        return _symbol;
    }

    
    /**
     * Sets the symbol that designates the concept.
     * 
     * @param symbol
     */
    public void setSymbol(symbol_Type symbol)
    {
        _symbol = symbol;
    }

    
    /**
     * Gets the term that designates the concept.
     * 
     * @return term_Type
     */
    public term_Type getTerm()
    {
        return _term;
    }


    /**
     * Sets the term that designates the concept.
     * 
     * @param term
     */
    public void setTerm(term_Type term)
    {
       _term = term;
    }
    
    
    /**
     * Gets the category to which the concept belongs. 
     * 
     * @return concept_type_Type
     */
    public concept_type_Type getConceptType() 
    {
        return _conceptType;
    }


    /**
     * Sets the category to which the concept belongs. 
     * 
     * @param conceptType
     */
    public void setConceptType(concept_type_Type conceptType) 
    {
    	_conceptType = conceptType;
    }

 }
