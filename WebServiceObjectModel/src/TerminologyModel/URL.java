/**
 * GraphicSize.java
 *
 */

package TerminologyModel;

public class URL  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6080915185979861755L;

	private String content;

    private String id;

    public URL() 
    {
    }

    public URL(
           String content,
           String id ) 
    {
           this.content = content;
           this.id = id;
    }


    /**
     * Gets the content value.
     * 
     * @return content
     */
    public String getContent() 
    {
        return content;
    }


    /**
     * Sets the content value.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
        this.content = content;
    }


    /**
     * Gets the id value 
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value 
     * 
     * @param id
     */
    public void setId(String id) 
    {
        this.id = id;
    }
}
