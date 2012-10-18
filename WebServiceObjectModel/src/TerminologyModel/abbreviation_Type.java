package TerminologyModel;


/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the abbreviation, which is a designation formed by ommitting words or letters
 * from a longer form and designating the same concept. 
 */
public class abbreviation_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 6485081461420265568L;

	private java.lang.String _content;

	/**
     * Axis needs a default constructor.
     */
    public abbreviation_Type() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param content: Data that represents the abbreviation as a sequence of characters. 
     */
    public abbreviation_Type(String content) 
    {
    	_content = content;
    }

	/**
     * Gets the data that represents the abbreviation as a sequence of characters.
     * 
     * @return content
     */
    public String getContent() 
    {
        return _content;
    }


    /**
     * Sets the data that represents the abbreviation as a sequence of characters.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
    	_content = content;
    }
  
}
