package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents a terminological item that is a language-independent graphical pattern that designates a concept.  
 */
public class symbol_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -4908050587308347363L;

	private file_representation_Type _fileRepresentation;
	
	private String _textRepresentation;
	
	/**
     * Axis needs a default constructor.
     */
    public symbol_Type() 
    {
    }

	/**
     * Constructor for initalizing the properties.
     * 
     * @param fileRepresentation: File representation that contains the physical representation of the symbol.
     * @param textRepresentation: Sequence of characters that contains the physical representation of the symbol.
     */
    public symbol_Type(file_representation_Type fileRepresentation, String textRepresentation)
    {
    	_fileRepresentation = fileRepresentation;
    	_textRepresentation = textRepresentation;
    }

    /**
     * Gets the file representation that contains the physical representation of the symbol.
     * 
     * @return file_representation_Type
     */
    public file_representation_Type getFileRepresentation()
    {
        return _fileRepresentation;
    }


    /**
     * Sets the file representation that contains the physical representation of the symbol.
     * 
     * @param fileRepresentation
     */
    public void setFileRepresentation(file_representation_Type fileRepresentation)
    {
    	_fileRepresentation = fileRepresentation;
    }
    

    /**
     * Gets the sequence of characters that contains the physical representation of the symbol.
     * 
     * @return String
     */
    public String getTextRepresentation()
    {
        return _textRepresentation;
    }


    /**
     * Sets the sequence of characters that contains the physical representation of the symbol.
     * 
     * @param textRepresentation
     */
    public void setTextRepresentation(String textRepresentation)
    {
    	_textRepresentation = textRepresentation;
    }
}
