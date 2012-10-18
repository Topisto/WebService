package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Implementation of the term object, which is a verbal designation of a concept in specific domain and with a particular language  
 *
 */
public class term_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 4327100320962056835L;

	private abbreviation_Type _abbreviation;
	private String _content;

	/**
     * Axis needs a default constructor.
     */
    public term_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param abbreviation: Shortened form of the term. 
     * @param content: Data that represents the term as a sequence of characters. 
     */
    public term_Type(abbreviation_Type abbreviation, String content) 
    {
    	_abbreviation = abbreviation;
    	_content = content;
    }
    
    
    /**
     * Gets the shortened form of the term.
     * 
     * @return abbreviation_Type
     */
    public abbreviation_Type getAbbreviation() 
    {
        return _abbreviation;
    }


    /**
     * Sets the shortened form of the term.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(abbreviation_Type abbreviation)
    {
    	_abbreviation = abbreviation;
    }
 

    /**
     * Gets the data that represents the term as a sequence of characters.
     * 
     * @return String
     */
    public String getContent() 
    {
        return _content;
    }


    /**
     * Sets the data that represents the term as a sequence of characters.
     * 
     * @param content
     */
    public void setContent(String content)
    {
    	_content = content;
    }
 }
