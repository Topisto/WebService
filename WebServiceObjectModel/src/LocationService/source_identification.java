package LocationService;

public class source_identification implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3023161769850781341L;
	private String provider;
	private String terminologyServer;
	private String ontologyServer;

    public source_identification() 
    {
    }

    public source_identification( String provider, String terminologyServer, String ontologyServer) 
    {
    	this.provider = provider;
        this.terminologyServer = terminologyServer;
        this.ontologyServer = ontologyServer;
    }

    /**
     * Gets the provider value for this SourceIdentification.
     * 
     * @return provider
     */
    public String getProvider() 
    {
        return this.provider;
    }


    /**
     * Sets the provider value for this SourceIdentification.
     * 
     * @param provider
     */
    public void setProvider( String provider) 
    {
        this.provider = provider;
    }


    /**
     * Gets the terminologyServer value for this SourceIdentification.
     * 
     * @return terminologyServer
     */
    public String getTerminologyServer() 
    {
        return this.terminologyServer;
    }


    /**
     * Sets the terminologyServer value for this SourceIdentification.
     * 
     * @param terminologyServer
     */
    public void setTerminologyServer(String terminologyServer) 
    {
        this.terminologyServer = terminologyServer;
    }


    /**
     * Gets the ontologyServer value for this SourceIdentification.
     * 
     * @return ontologyServer
     */
    public String getOntologyServer() 
    {
        return this.ontologyServer;
    }


    /**
     * Sets the ontologyServer value for this SourceIdentification.
     * 
     * @param ontologyServer
     */
    public void setOntologyServer(String ontologyServer)
    {
        this.ontologyServer = ontologyServer;
    }
}
