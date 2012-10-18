package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the systematic means of human communication using words. 
 */
public class language_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 602037884095580804L;

	private String _countryCode;
	private IRDI_type _languageID;
	private String _languageCode;

	/**
     * Axis needs a default constructor.
     */
	public language_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param countryCode: Code assigned under ISO 3166, designating the country in which the language is spoken. 
     * @param languageID: Unique identifier that represents this language. 
     * @param languageCode: Code assigned under ISO 639, designating the language. 
     */
    public language_Type(String countryCode, IRDI_type languageID, String languageCode)
    {
        _countryCode = countryCode;
        _languageID = languageID;
        _languageCode = languageCode;
    }

    
    /**
     * Gets the code assigned under ISO 3166, designating the country in which the language is spoken. 
     * 
     * @return String
     */
    public String getCountryCode() 
    {
        return _countryCode;
    }


    /**
     * Sets the code assigned under ISO 3166, designating the country in which the language is spoken. 
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) 
    {
        _countryCode = countryCode;
    }


    /**
     * Gets the unique identifier that represents this language. 
     * 
     * @return IRDI_type
     */
    public IRDI_type getId() 
    {
        return _languageID;
    }


    /**
     * Sets the the unique identifier that represents this language. 
     * 
     * @param languageID
     */
    public void setId(IRDI_type languageID) 
    {
    	_languageID = languageID;
    }
    

    /**
     * Gets the code assigned under ISO 639, designating the language. 
     * 
     * @return String
     */
    public String getLanguageCode() 
    {
        return _languageCode;
    }


    /**
     * Sets the code assigned under ISO 639, designating the language. 
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) 
    {
        _languageCode = languageCode;
    }
}
