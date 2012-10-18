package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents a human-readable collection of information in electronic or printable form. 
 */
public class document_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = -138121284823211388L;

    private String _uri;
	private String _designator;
    private IRDI_type _documentID;
    private int _edition;
    private java.util.Date _publicationDate;
    private organization_Type _publisher;
    private String _title;
    private String _version; 
    
	/**
     * Axis needs a default constructor.
     */
    public document_Type() 
    {
    }
    
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param uri: Uniform resource indicator, assigned by the document publisher, that uniquely identifies the document. 
     * @param designator: String assigned by the publisher to identify the document. 
     * @param documentID: The unique identifier for this document. 
     * @param edition: The edition number assigned by the publisher.  
     * @param publicationDate: The official publication date of the docuemnt assigned by the publisher. 
     * @param publisher: The organization that publishes the document. 
     * @param title: Human-readable designation of the document. 
     * @param version: The version number assigned by the publisher. 
     */
    public document_Type(String uri, String designator, IRDI_type documentID, int edition, 
    		java.util.Date publicationDate, organization_Type publisher, String title, String version) 
    {
    	_uri = uri;
    	_designator = designator;
        _documentID = documentID;
        _edition = edition;
        _publicationDate = publicationDate;
        _publisher = publisher;
        _title = title; 	
        _version = version;
    }

    /**
     * Gets the uniform resource indicator, assigned by the document publisher, that uniquely identifies the document. 
     * 
     * @return String
     */
    public String getURI() 
    {
        return _uri;
    }


    /**
     * Sets the uniform resource indicator, assigned by the document publisher, that uniquely identifies the document. 
     * 
     * @param URI
     */
    public void setURI(String uri) 
    {
        _uri = uri;
    }
    
    /**
     * Gets the string assigned by the publisher to identify the document. 
     * 
     * @return String
     */
    public String getDesignator() 
    {
        return _designator;
    }


    /**
     * Sets the string assigned by the publisher to identify the document. 
     * 
     * @param designator
     */
    public void setDesignator(String designator) 
    {
        _designator = designator;
    }
    
    
    /**
     * Gets the unique identifier for this document. 
     * 
     * @return IRDI_type
     */
    public IRDI_type getDocumentID()
    {
        return _documentID;
    }


    /**
     * Sets the unique identifier for this document. 
     * 
     * @param documentID
     */
    public void getDocumentID(IRDI_type documentID) 
    {
        _documentID = documentID;
    }
    
    /**
     * Gets the edition number assigned by the publisher.
     * 
     * @return int
     */
    public int getEdition() 
    {
        return _edition;
    }


    /**
     * Sets  the edition number assigned by the publisher.
     * 
     * @param edition
     */
    public void setEdition(int edition) 
    {
    	_edition = edition;
    }
    
    
    /**
     * Gets the official publication date of the docuemnt assigned by the publisher. 
     * 
     * @return java.util.Date
     */
    public java.util.Date getPublicationDate() 
    {
        return _publicationDate;
    }


    /**
     * Sets the official publication date of the docuemnt assigned by the publisher. 
     * 
     * @param publicationDate
     */
    public void setPublicationDate(java.util.Date publicationDate)
    {
        _publicationDate = publicationDate;
    }
    
    
    /**
     * Gets the organization that publishes the document. 
     * 
     * @return organization_Type
     */
    public organization_Type getPublisher() 
    {
        return _publisher;
    }


    /**
     * Sets the organization that publishes the document. 
     * 
     * @param publisher
     */
    public void setPublisher(organization_Type publisher) 
    {
        _publisher = publisher;
    }
   

    /**
     * Gets the human-readable designation of the document.
     * 
     * @return String
     */
    public String getTitle() 
    {
        return _title;
    }


    /**
     * Sets the human-readable designation of the document.
     * 
     * @param title
     */
    public void setTitle(String title) 
    {
        _title = title;
    }



    /**
     * Gets the version number assigned by the publisher.
     * 
     * @return String
     */
    public java.lang.String getVersion() 
    {
        return _version;
    }


    /**
     * Sets the version number assigned by the publisher.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) 
    {
        _version = version;
    }
}
