/**
 * GraphicalRepresentation.java
 *
 */

package TerminologyModel;

public class file_representation  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3711454396716543828L;

	private String mimeType;

	private long widthPixels;

    private long heightPixels;

    private String id;  

    public file_representation() 
    {
    }

    public file_representation(
           String mimeType,
           long widthPixels,
           long heightPixels, 
           String id)
    {
           this.mimeType = mimeType;
           this.widthPixels = widthPixels;
           this.heightPixels = heightPixels;
           this.id = id;
    }


    
    /**
     * Gets the id value for this Concept.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this Concept.
     * 
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
        
    /**
     * Gets the mimeType value for this GraphicalRepresentation.
     * 
     * @return mimeType
     */
    public String getMimeType() 
    {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this GraphicalRepresentation.
     * 
     * @param mimeType
     */
    public void setMimeType(String mimeType) 
    {
        this.mimeType = mimeType;
    }
    
    /**
     * Gets the width value for this GraphicSize.
     * 
     * @return width
     */
    public long getWidthPixels() 
    {
        return widthPixels;
    }


    /**
     * Sets the width value for this GraphicSize.
     * 
     * @param width
     */
    public void setWidthPixels(long widthPixels) 
    {
        this.widthPixels = widthPixels;
    }


    /**
     * Gets the height value for this GraphicSize.
     * 
     * @return height
     */
    public long getHeightPixels() 
    {
        return heightPixels;
    }


    /**
     * Sets the height value for this GraphicSize.
     * 
     * @param height
     */
    public void setHeightPixels(long heightPixels) 
    {
        this.heightPixels = heightPixels;
    }

}