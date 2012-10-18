package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents a set of criteria for finding one or more languages. 
 */
public class language_search_specification_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -5521157985022916285L;

	private String _countryCodePattern;
	private String _languageCodePattern;
    
	/**
     * Axis needs a default constructor.
     */
	public language_search_specification_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param countryCodePattern: Expression that describes a set of ISO country codes. If specified, only documents
     * that have an ISO country code that matches the pattern will be returned by the search.  
     * @param languageCodePattern: Expression that describes a set of ISO language codes. If specified, only documents
     * that have an ISO language code that matches the pattern will be returned by the search.  
     */
    public language_search_specification_Type(String countryCodePattern, String languageCodePattern) 
    {
    	_countryCodePattern = countryCodePattern;
    	_languageCodePattern = languageCodePattern;
    }

    /**
     * Gets the expression that describes a set of ISO language codes. If specified, only documents
     * that have an ISO language code that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
    public String get_languageCodePattern() 
    {
        return _languageCodePattern;
    }


    /**
     * Sets the expression that describes a set of ISO language codes. If specified, only documents
     * that have an ISO language code that matches the pattern will be returned by the search. 
     * 
     * @param languageCodePattern
     */
    public void set_languageCodePattern(String languageCodePattern) 
    {
    	_languageCodePattern = languageCodePattern;
    }


    /**
     * Gets the expression that describes a set of ISO country codes. If specified, only documents
     * that have an ISO country code that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
    public String get_countryCodePattern() 
    {
        return _countryCodePattern;
    }


    /**
     * Sets the expression that describes a set of ISO country codes. If specified, only documents
     * that have an ISO country code that matches the pattern will be returned by the search. 
     * 
     * @param countryCodePattern
     */
    public void set_countryCodePattern(String countryCodePattern) 
    {
    	_countryCodePattern = countryCodePattern;
    }
}
