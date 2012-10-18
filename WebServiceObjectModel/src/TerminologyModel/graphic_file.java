package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Implementation for data that represents a graphic file. 
 */

public class graphic_file  implements java.io.Serializable 
{
	private static final long serialVersionUID = 1780027167120541986L;

	private String _content;
	private IRDI_type _graphic_file_ID;

	/**
     * Axis needs a default constructor.
     */
    public graphic_file() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param content: Data that represents the graphic in computer-interpretable form.
     * @param graphic_file_ID: Unique identifier for this graphic file.
     */
    public graphic_file(String content, IRDI_type graphic_file_ID) 
    {
    	_content = content;
    	_graphic_file_ID = graphic_file_ID;
    }

	/**
     * Gets the data that represents the graphic in computer-interpretable form.
     * 
     * @return content
     */
    public String getContent() 
    {
        return _content;
    }


    /**
     * Sets the data that represents the graphic in computer-interpretable form.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
    	_content = content;
    }
    
	/**
     * Gets the unique identifier for this graphic file.
     * 
     * @return IRDI_type
     */
    public IRDI_type getGraphicFileID() 
    {
        return _graphic_file_ID;
    }


    /**
     * Sets the unique identifier for this graphic file.
     * 
     * @param graphic_file_ID
     */
    public void setGraphicFileID(IRDI_type graphic_file_ID) 
    {
    	_graphic_file_ID = graphic_file_ID;
    }
  
}
