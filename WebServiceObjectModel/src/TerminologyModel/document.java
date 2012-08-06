/**
 * Document.java
 *
 */

package TerminologyModel;

public class document  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -138121284823211388L;

	private local_string[] title;
	
	private String designator;

    private String uri;

    private java.lang.String version;

    private java.lang.String edition;

    private java.util.Date publicationDate;

    private java.lang.String publisher;

    private java.lang.String id;  
    
    public document() 
    {
    }

    public document(
           local_string[] title,
           String uri,
           java.lang.String version,
           java.lang.String edition,
           java.util.Date publicationDate,
           java.lang.String publisher,
           String designator, 
           java.lang.String id) 
    {
           this.title = title;
           this.uri = uri;
           this.version = version;
           this.edition = edition;
           this.publicationDate = publicationDate;
           this.publisher = publisher;
           this.designator = designator;
           this.id = id;
    }


    /**
     * Gets the title value for this Document.
     * 
     * @return title
     */
    public local_string[] getTitle() 
    {
        return title;
    }


    /**
     * Sets the title value for this Document.
     * 
     * @param title
     */
    public void setTitle(local_string[] title) 
    {
        this.title = title;
    }


    /**
     * Gets the uri value for this Document.
     * 
     * @return uri
     */
    public String getUri() 
    {
        return uri;
    }


    /**
     * Sets the uri value for this Document.
     * 
     * @param uri
     */
    public void setUri(String uri) 
    {
        this.uri = uri;
    }

    
    /**
     * Gets the designator value for this Document.
     * 
     * @return designator
     */
    public String getDesignator() 
    {
        return designator;
    }


    /**
     * Sets the designator value for this Document.
     * 
     * @param designator
     */
    public void setDesignator(String designator) 
    {
        this.uri = designator;
    }
    

    /**
     * Gets the version value for this Document.
     * 
     * @return version
     */
    public java.lang.String getVersion() 
    {
        return version;
    }


    /**
     * Sets the version value for this Document.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) 
    {
        this.version = version;
    }


    /**
     * Gets the edition value for this Document.
     * 
     * @return edition
     */
    public java.lang.String getEdition() 
    {
        return edition;
    }


    /**
     * Sets the edition value for this Document.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) 
    {
        this.edition = edition;
    }


    /**
     * Gets the publicationDate value for this Document.
     * 
     * @return publicationDate
     */
    public java.util.Date getPublicationDate() 
    {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this Document.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(java.util.Date publicationDate)
    {
        this.publicationDate = publicationDate;
    }


    /**
     * Gets the publisher value for this Document.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() 
    {
        return publisher;
    }


    /**
     * Sets the publisher value for this Document.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) 
    {
        this.publisher = publisher;
    }


    /**
     * Gets the id value for this Document.
     * 
     * @return id
     */
    public java.lang.String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this Document.
     * 
     * @param id
     */
    public void setId(java.lang.String id) 
    {
        this.id = id;
    }
}
