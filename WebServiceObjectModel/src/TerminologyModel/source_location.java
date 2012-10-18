package TerminologyModel;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the location on the internet at which a terminological item may be found. 
 */
public class source_location  implements java.io.Serializable 
{
	private static final long serialVersionUID = 54050194936033495L;

	private String _url;
    private String _description;
    private organization_Type _provider;

	/**
     * Axis needs a default constructor.
     */
    public source_location() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param url: Uniform resource locator at which the terminological item may be found. 
     * @param description: Human-readable designation of the source location. 
     * @param provider: Organization that provides a terminological item at a location on the internet. 
     */
    public source_location(String url, String description, organization_Type provider) 
    {
    	_url = url;
    	_description = description;
    	_provider = provider;
    }


    /**
     * Gets the uniform resource locator at which the terminological item may be found. 
     * 
     * @return String
     */
    public String getURL() 
    {
        return _url;
    }


    /**
     * Sets the uniform resource locator at which the terminological item may be found. 
     * 
     * @param URL
     */
    public void setURL(String url) 
    {
    	_url = url;
    }


    /**
     * Gets the human-readable designation of the source location. 
     * 
     * @return String
     */
    public String getDescription() 
    {
        return _description;
    }

    /**
     * Sets the human-readable designation of the source location. 
     * 
     * @param description
     */
    public void setDescription(String description) 
    {
        _description = description;
    }


    /**
     * Gets the organization that provides a terminological item at a location on the internet. 
     * 
     * @return organization_Type
     */
    public organization_Type getProvider() 
    {
        return _provider;
    }


    /**
     * Sets the organization that provides a terminological item at a location on the internet. 
     * 
     * @param provider
     */
    public void setProvider(organization_Type provider)
    {
        _provider = provider;
    }
}
