package LocationService;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * 
 * Represents the implementation of the location of the terminology server and the ontology 
 * server for a given concept
 */
public class source_identification implements java.io.Serializable 
{
	private static final long serialVersionUID = -3023161769850781341L;
	private String RA_ref;
	private String terminology_server_URI;
	private String ontology_server_URI;

	/**
     * Axis needs a default constructor.
     */
    public source_identification() 
    {
    }

    
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param RA_ref: The unambiguous identifier of the dictionary registration authority. 
     * @param terminology_server_URI: The uniform resource identifier of the terminology server for the concept.
     * @param ontology_server_URI: The uniform resource identifier of the ontology server for the concept.
     */
     public source_identification( String RA_ref, String terminology_server_URI, String ontology_server_URI) 
    {
    	setRA_ref(RA_ref);
    	setTerminology_server_URI(terminology_server_URI);
    	setOntology_server_URI(ontology_server_URI);
    }
    
    /**
     * Gets the unambiguous identifier of the dictionary registration authority.
     * 
     * @return RA_ref
     */
    public String getRA_ref() 
    {
        return this.RA_ref;
    }


    /**
     * Sets the unambiguous identifier of the dictionary registration authority.
     * 
     * @param RA_ref
     */
    public void setRA_ref( String RA_ref) 
    {
        this.RA_ref = RA_ref;
    }


    /**
     * Gets the uniform resource identifier of the terminology server for the concept.
     * 
     * @return terminology_server_URI
     */
    public String  getTerminology_server_URI() 
    {
        return this.terminology_server_URI;
    }


    /**
     * Sets the uniform resource identifier of the terminology server for the concept.
     * 
     * @param terminology_server_URI
     */
    public void setTerminology_server_URI(String  terminology_server_URI) 
    {
        this.terminology_server_URI = terminology_server_URI;
    }


    /**
     * Gets the uniform resource identifier of the ontology server for the concept.
     * 
     * @return ontology_server_URI
     */
    public String  getOntology_server_URI() 
    {
        return this.ontology_server_URI;
    }


    /**
     * Sets the uniform resource identifier of the ontology server for the concept.
     *      * 
     * @param ontology_server_URI
     */
    public void setOntology_server_URI(String  ontology_server_URI)
    {
        this.ontology_server_URI = ontology_server_URI;
    }
}
