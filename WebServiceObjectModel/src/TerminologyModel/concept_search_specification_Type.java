package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the set of criteria for finding one or more concepts.
 */
public class concept_search_specification_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -7785842715343764779L;

	private IRDI_type _language_ref;
	private String _languageCode;
	private String _countryCode;
	private IRDI_type _conceptType; 
	private String _termPattern;
	private String _definitionPattern;
	private String _abbreviationPattern;
	private String _textualSymbolPattern;
	private String _originatorReferencePattern;
	private boolean _notDeprecatedOnlyPattern;
	private IRDI_type _conformedDocumentRef;
	private IRDI_type _containingDocumentRef;
	private IRDI_type _referencingDocumentRef;
	
	/**
     * Axis needs a default constructor.
     */
    public concept_search_specification_Type()
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param language_ref: Unambiguous identifier of the language used in the pattern arguments. 
     * @param languageCode: Alpha-2 or alpha-3 language code, assigned under ISO 639-1 or ISO 639-2, 
     * of the language used in the pattern arguments. 
     * @param countryCode: Alpha-2 country code, assinged under ISO 3166-1, of the country in which the 
     * language used in the pattern arguments is spoken.  
     * @param conceptType: Unambiguous identifier of the kind of concept. If specified only concepts
     * of the given kind will be returned by the search. 
     * @param termPattern: Expression that describes a set of terms. If specified, only concepts
     * that have a term that matches the pattern will be returned by the search.  
     * @param definitionPattern: Expression that describes a set of defintions. If specified, only concepts
     * that have a defintion that matches the pattern will be returned by the search.  
     * @param abbreviationPattern: Expression that describes a set of abbreviation. If specified, only concepts 
     * that have an abbreviation that matches the pattern will be returned by the search.  
     * @param textualSymbolPattern: Expression that describes a set of textual symbols. If specified, only concepts
     * that have a textual symbol that matches the pattern will be returned by the search. 
     * @param originatorReferencePattern: Expression that describes a set of originator references. If specified, 
     * only those concepts that have an originator reference that matches the pattern will be returned by the search. 
     * @param notDeprecatedOnlyPattern: Whether or not only concepts that are not deprecated are to be returned. 
     * @param conformedDocumentRef: Unambiguous identifier of the document to which the concept should conform. 
     * If specified, only concepts of the given document will be returned. 
     * @param containingDocumentRef: Unambiguous identifier of the document to which the concept should be contained. 
     * If specified, only concepts that are recorded in the dictionary as being contained in the given document will be returned. 
     * @param referencingDocumentRef: Unambiguous identifier of the document to which the concept should be referenced. 
     * If specified, only concepts that are recorded in the dictionary as being referenced in the given document will be returned.
     */
    public concept_search_specification_Type(IRDI_type language_ref, String languageCode, String countryCode, 
    		IRDI_type conceptType, String termPattern, String definitionPattern, String abbreviationPattern, 
    		String textualSymbolPattern, String originatorReferencePattern, boolean notDeprecatedOnlyPattern, 
    		IRDI_type conformedDocumentRef, IRDI_type containingDocumentRef, IRDI_type referencingDocumentRef)
    {
    	_language_ref = language_ref;
    	_languageCode = languageCode;
    	_countryCode = countryCode;
    	_conceptType = conceptType; 
    	_termPattern = termPattern;
		_definitionPattern = definitionPattern;
		_abbreviationPattern = abbreviationPattern;
		_textualSymbolPattern = textualSymbolPattern;
		_originatorReferencePattern = originatorReferencePattern;
		_notDeprecatedOnlyPattern = notDeprecatedOnlyPattern;
		_conformedDocumentRef = conformedDocumentRef;
		_containingDocumentRef = containingDocumentRef;
		_referencingDocumentRef = referencingDocumentRef;
    }

	/**
     * Gets the unambiguous identifier of the language used in the pattern arguments.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_language_ref()
	{
		return _language_ref;
	}

    /**
     * Sets the unambiguous identifier of the language used in the pattern arguments.
     * 
     * @param language_ref
     */
	public void set_language_ref(IRDI_type language_ref)
	{
		_language_ref = language_ref;
	}

	/**
     * Gets the alpha-2 or alpha-3 language code, assigned under ISO 639-1 or ISO 639-2, 
     * of the language used in the pattern arguments. 
     * 
     * @return String
     */
	public String get_languageCode()
	{
		return _languageCode;
	}

    /**
     * Sets Gets the alpha-2 or alpha-3 language code, assigned under ISO 639-1 or ISO 639-2, 
     * of the language used in the pattern arguments. 
     * 
     * @param languageCode
     */
	public void set_languageCode(String languageCode)
	{
		_languageCode = languageCode;
	}

	/**
     * Gets the Alpha-2 country code, assinged under ISO 3166-1, of the country in which the 
     * language used in the pattern arguments is spoken.  
     * 
     * @return String
     */
	public String get_countryCode()
	{
		return _countryCode;
	}

    /**
     * Sets Alpha-2 country code, assinged under ISO 3166-1, of the country in which the 
     * language used in the pattern arguments is spoken.  
     * 
     * @param countryCode
     */
	public void set_countryCode(String countryCode)
	{
		_countryCode = countryCode;
	}

	/**
     * Gets the unambiguous identifier of the kind of concept. If specified only concepts
     * of the given kind will be returned by the search. 
     * 
     * @return IRDI_type
     */
	public IRDI_type get_conceptType()
	{
		return _conceptType;
	}

    /**
     * Sets the unambiguous identifier of the kind of concept. If specified only concepts
     * of the given kind will be returned by the search. 
     * 
     * @param conceptType
     */
	public void set_conceptType(IRDI_type conceptType)
	{
		_conceptType = conceptType;
	}

	/**
     * Gets the expression that describes a set of terms. If specified, only concepts
     * that have a term that matches the pattern will be returned by the search.  
     * 
     * @return String
     */
	public String get_termPattern()
	{
		return _termPattern;
	}

    /**
     * Sets  the expression that describes a set of terms. If specified, only concepts
     * that have a term that matches the pattern will be returned by the search.  
     * 
     * @param termPattern
     */
	public void set_termPattern(String termPattern)
	{
		_termPattern = termPattern;
	}

	/**
     * Gets the expression that describes a set of defintions. If specified, only concepts
     * that have a defintion that matches the pattern will be returned by the search.  
     * 
     * @return String
     */
	public String get_definitionPattern()
	{
		return _definitionPattern;
	}

    /**
     * Sets  the expression that describes a set of defintions. If specified, only concepts
     * that have a defintion that matches the pattern will be returned by the search.  
     * 
     * @param definitionPattern
     */
	public void set_definitionPattern(String definitionPattern)
	{
		_definitionPattern = definitionPattern;
	}

	/**
     * Gets the expression that describes a set of abbreviation. If specified, only concepts 
     * that have an abbreviation that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
	public String get_abbreviationPattern()
	{
		return _abbreviationPattern;
	}

    /**
     * Sets  the expression that describes a set of abbreviation. If specified, only concepts 
     * that have an abbreviation that matches the pattern will be returned by the search. 
     * 
     * @param abbreviationPattern
     */
	public void set_abbreviationPattern(String abbreviationPattern)
	{
		_abbreviationPattern = abbreviationPattern;
	}

	/**
     * Gets the expression that describes a set of textual symbols. If specified, only concepts
     * that have a textual symbol that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
	public String get_textualSymbolPattern()
	{
		return _textualSymbolPattern;
	}

    /**
     * Sets the expression that describes a set of textual symbols. If specified, only concepts
     * that have a textual symbol that matches the pattern will be returned by the search. 
     * 
     * @param textualSymbolPattern
     */
	public void set_textualSymbolPattern(String textualSymbolPattern)
	{
		_textualSymbolPattern = textualSymbolPattern;
	}

	/**
     * Gets the expression that describes a set of originator references. If specified, 
     * only those concepts that have an originator reference that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
	public String get_originatorReferencePattern()
	{
		return _originatorReferencePattern;
	}

    /**
     * Sets the expression that describes a set of originator references. If specified, 
     * only those concepts that have an originator reference that matches the pattern will be returned by the search. 
     * 
     * @param originatorReferencePattern
     */
	public void set_originatorReferencePattern(String originatorReferencePattern)
	{
		_originatorReferencePattern = originatorReferencePattern;
	}

	/**
     * Gets whether or not only concepts that are not deprecated are to be returned. 
     * 
     * @return boolean
     */
	public boolean get_notDeprecatedOnlyPattern()
	{
		return _notDeprecatedOnlyPattern;
	}

    /**
     * Sets whether or not only concepts that are not deprecated are to be returned. 
     * 
     * @param content
     */
	public void set_notDeprecatedOnlyPattern(boolean notDeprecatedOnlyPattern)
	{
		_notDeprecatedOnlyPattern = notDeprecatedOnlyPattern;
	}

	/**
     * Gets the unambiguous identifier of the document to which the concept should conform. 
     * If specified, only concepts of the given document will be returned.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_conformedDocumentRef()
	{
		return _conformedDocumentRef;
	}

    /**
     * Sets the unambiguous identifier of the document to which the concept should conform. 
     * If specified, only concepts of the given document will be returned.
     * 
     * @param conformedDocumentRef
     */
	public void set_conformedDocumentRef(IRDI_type conformedDocumentRef)
	{
		_conformedDocumentRef =  conformedDocumentRef;
	}

	/**
     * Gets the unambiguous identifier of the document to which the concept should be contained. 
     * If specified, only concepts that are recorded in the dictionary as being contained in the given document will be returned. 
     * 
     * @return IRDI_type
     */
	public IRDI_type get_containingDocumentRef()
	{
		return _containingDocumentRef;
	}

    /**
     * Sets the unambiguous identifier of the document to which the concept should be contained. 
     * If specified, only concepts that are recorded in the dictionary as being contained in the given document will be returned. 
     * 
     * @param containingDocumentRef
     */
	public void set_containingDocumentRef(IRDI_type containingDocumentRef)
	{
		_containingDocumentRef = containingDocumentRef;
	}

	/**
     * Gets the unambiguous identifier of the document to which the concept should be referenced. 
     * If specified, only concepts that are recorded in the dictionary as being referenced in the given document will be returned.
     * 
     * @return IRDI_type
     */
	public IRDI_type get_referencingDocumentRef()
	{
		return _referencingDocumentRef;
	}

    /**
     * Sets the unambiguous identifier of the document to which the concept should be referenced. 
     * If specified, only concepts that are recorded in the dictionary as being referenced in the given document will be returned.
     * 
     * @param referencingDocumentRef
     */
	public void set_referencingDocumentRef(IRDI_type referencingDocumentRef)
	{
		_referencingDocumentRef = referencingDocumentRef;
	}

}
