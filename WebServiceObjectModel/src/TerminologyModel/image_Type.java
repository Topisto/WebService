package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class implements the representation of a concept that is primarily graphic.  
 */
public class image_Type  implements java.io.Serializable 
{

	private static final long serialVersionUID = 7916814169030458604L;

	private String _name;
    
	private file_representation_Type _representation;

	/**
     * Axis needs a default constructor.
     */
    public image_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param name: Human-readable designation for the image. 
     * @param representation: The file representation that contains the physical representation of the image. 
     */
    public image_Type(String name, file_representation_Type representation) 
    {
    	_name = name;
    	_representation = representation;
    }


    /**
     * Gets the human-readable designation for the image. 
     * 
     * @return String
     */
    public String getName() 
    {
        return _name;
    }


    /**
     * Sets the human-readable designation for the image. 
     * 
     * @param name
     */
    public void setName(String name) 
    {
        _name = name;
    }


    /**
     * Gets the file representation that contains the physical representation of the image.
     * 
     * @return file_representation_Type
     */
    public file_representation_Type getRepresentation()
    {
        return _representation;
    }


    /**
     * Sets the file representation that contains the physical representation of the image.
     * 
     * @param representation
     */
    public void setRepresentation(file_representation_Type representation)
    {
        _representation = representation;
    }

}
