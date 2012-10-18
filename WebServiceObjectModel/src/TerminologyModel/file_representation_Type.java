package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Implementation for data that represents a graphic in computer-interpretable form, along with its metadata. 
 */
public class file_representation_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -3711454396716543828L;

	private IRDI_type _file_representation_ID;
	private long _heightPixels;
	private String _mimeType;
	private long _widthPixels;
   
	/**
     * Axis needs a default constructor.
     */
    public file_representation_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param file_representation_ID: Identifier for this file representation. 
     * @param heightPixels: Vertical extent of the graphic in pixels. 
     * @param mimeType: MIME media type as registered with IANA. 
     * @param widthPixels: Horizontoal extent of the graphic in pixels. 
     */
    public file_representation_Type(IRDI_type file_representation_ID, long heightPixels, 
           String mimeType, long widthPixels)
    {
    	_file_representation_ID = file_representation_ID;
    	_heightPixels = heightPixels;
    	_mimeType = mimeType;
    	_widthPixels = widthPixels;
    }

    
    /**
     * Gets the identifier for this file representation. 
     * 
     * @return IRDI_type
     */
    public IRDI_type getFileRepresentationID()
    {
        return _file_representation_ID;
    }


    /**
     * Sets  the identifier for this file representation. 
     * 
     * @param file_representation_ID
     */
    public void setId(IRDI_type file_representation_ID)
    {
    	_file_representation_ID  = file_representation_ID;
    }
    
    
    /**
     * Gets the vertical extent of the graphic in pixels. 
     * 
     * @return long
     */
    public long getHeightPixels() 
    {
        return _heightPixels;
    }


    /**
     * Sets the vertical extent of the graphic in pixels. 
     * 
     * @param height
     */
    public void setHeightPixels(long heightPixels) 
    {
        this._heightPixels = heightPixels;
    }
    
        
    /**
     * Gets the MIME media type as registered with IANA. 
     * 
     * @return String
     */
    public String getMimeType() 
    {
        return _mimeType;
    }


    /**
     * Sets the MIME media type as registered with IANA. 
     * 
     * @param mimeType
     */
    public void setMimeType(String mimeType) 
    {
    	_mimeType = mimeType;
    }
    
    /**
     * Gets the horizontoal extent of the graphic in pixels. 
     * 
     * @return long
     */
    public long getWidthPixels() 
    {
        return _widthPixels;
    }


    /**
     * Sets the horizontoal extent of the graphic in pixels. 
     * 
     * @param width
     */
    public void setWidthPixels(long widthPixels) 
    {
    	_widthPixels = widthPixels;
    }
}