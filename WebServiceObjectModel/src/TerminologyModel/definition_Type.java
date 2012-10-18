package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the representation of a concept by a descriptive statement which serves to differentiate it 
 * from related concept.  
 */
public class definition_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -8357779459877813064L;

	private String _content;

	/**
     * Axis needs a default constructor.
     */
	public definition_Type()
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param content: Data that represents the definition as a sequence of characters. 
     */
    public definition_Type(String content)
    {
    	_content = content;
    }


    /**
     * Gets the data that represents the definition as a sequence of characters.
     * 
     * @return String
     */
    public String getContent() 
    {
        return _content;
    }


    /**
     * Sets the data that represents the definition as a sequence of characters.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
    	_content = content;
    }
    
}
