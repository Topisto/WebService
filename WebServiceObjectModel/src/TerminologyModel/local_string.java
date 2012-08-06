package TerminologyModel;

public class local_string  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3984670037390747544L;

	private String content;

    private String language;

    public local_string() 
    {
    }

    public local_string(
           String content,
           String language) 
    {
           this.content = content;
           this.language = language;
    }


    /**
     * Gets the content value for this LocalString.
     * 
     * @return content
     */
    public String getContent()
    {
        return content;
    }


    /**
     * Sets the content value for this LocalString.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
        this.content = content;
    }


    /**
     * Gets the language value for this LocalString.
     * 
     * @return language
     */
    public String getLanguage()
    {
        return language;
    }


    /**
     * Sets the language value for this LocalString.
     * 
     * @param language
     */
    public void setLanguage(String language) 
    {
        this.language = language;
    }
   
}
