package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents a set of criteria for finding one or more documents. 
 */
public class document_search_specification_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 7269896495089861501L;

	private java.lang.String _titlePattern;
    private java.lang.String _uriPattern;
    private java.lang.String _versionPattern;
    private java.lang.String _editionPattern;
    private java.util.Date _minPublicationDate;
    private java.util.Date _maxPublicationDate;
    private IRDI_type _publisher;

	/**
     * Axis needs a default constructor.
     */
    public document_search_specification_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param titlePattern: Expression that describes a set of titles. If specified, only documents
     * that have a title that matches the pattern will be returned by the search.  
     * @param uriPattern: Expression that describes a set of uniform resource identifiers. If specified, only documents
     * that have a URI that matches the pattern will be returned by the search.  
     * @param versionPattern: Expression that describes a set of version numbers. If specified, only concepts 
     * that have an version number that matches the pattern will be returned by the search.  
     * @param editionPattern: Expression that describes a set of edition numbers. If specified, only concepts
     * that have a edition number that matches the pattern will be returned by the search. 
     * @param minPublicationDate: Earliest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.   
     * @param maxPublicationDate: Latest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.    
     * @param publisher: Unambiguous identifier of the organization that published the document. If specified, only documents 
     * published by this organization will be returned by the search. 
     */
    public document_search_specification_Type(String titlePattern, String uriPattern, String versionPattern,
           String editionPattern, java.util.Date minPublicationDate, java.util.Date maxPublicationDate, IRDI_type publisher) 
    {
    	_titlePattern = titlePattern;
        _uriPattern = uriPattern;
        _versionPattern = versionPattern;
        _editionPattern = editionPattern;
        _minPublicationDate = minPublicationDate;
        _maxPublicationDate = maxPublicationDate;
        _publisher = publisher;
    }


    /**
     * Gets the expression that describes a set of titles. If specified, only documents
     * that have a title that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
    public String getTitlePattern() 
    {
        return _titlePattern;
    }


    /**
     * Sets the expression that describes a set of titles. If specified, only documents
     * that have a title that matches the pattern will be returned by the search. 
     * 
     * @param titlePattern
     */
    public void setTitlePattern(java.lang.String titlePattern) 
    {
       _titlePattern = titlePattern;
    }


    /**
     * Gets the expression that describes a set of uniform resource identifiers. If specified, only documents
     * that have a URI that matches the pattern will be returned by the search.  
     * 
     * @return String
     */
    public String getUriPattern() 
    {
        return _uriPattern;
    }

    /**
     * Sets the expression that describes a set of uniform resource identifiers. If specified, only documents
     * that have a URI that matches the pattern will be returned by the search.  
     * 
     * @param uriPattern
     */
    public void setUriPattern(String uriPattern) 
    {
       _uriPattern = uriPattern;
    }

    /**
     * Gets the expression that describes a set of version numbers. If specified, only concepts 
     * that have an version number that matches the pattern will be returned by the search.  
     * 
     * @return String
     */
    public String getVersionPattern() 
    {
        return _versionPattern;
    }

    /**
     * Sets the expression that describes a set of version numbers. If specified, only concepts 
     * that have an version number that matches the pattern will be returned by the search.  
     * 
     * @param versionPattern
     */
    public void setVersionPattern(String versionPattern) 
    {
        _versionPattern = versionPattern;
    }


    /**
	 * Gets the expression that describes a set of edition numbers. If specified, only concepts
     * that have a edition number that matches the pattern will be returned by the search. 
     * 
     * @return String
     */
    public String getEditionPattern() 
    {
        return _editionPattern;
    }


    /**
	 * Sets the expression that describes a set of edition numbers. If specified, only concepts
     * that have a edition number that matches the pattern will be returned by the search. 
     * 
     * @param editionPattern
     */
    public void setEditionPattern(java.lang.String editionPattern) 
    {
        _editionPattern = editionPattern;
    }


    /**
     * Gets the earliest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.   
     * 
     * @return java.util.Date
     */
    public java.util.Date getMinPublicationDate() 
    {
        return _minPublicationDate;
    }


    /**
     * Sets the earliest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.   
     * 
     * @param minPublicationDate
     */
    public void setMinPublicationDate(java.util.Date minPublicationDate) 
    {
        _minPublicationDate = minPublicationDate;
    }


    /**
     * Gets the latest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.    
     * 
     * @return java.util.Date
     */
    public java.util.Date getMaxPublicationDate() 
    {
        return _maxPublicationDate;
    }


    /**
     * Sets the latest publisher date. If specified, only documents published on this date or later will be
     * returned by the search.   
     * 
     * @param maxPublicationDate
     */
    public void setMaxPublicationDate(java.util.Date maxPublicationDate)
    {
        _maxPublicationDate = maxPublicationDate;
    }


    /**
     * Gets the unambiguous identifier of the organization that published the document. If specified, only documents 
     * published by this organization will be returned by the search. 
     * 
     * @return IRDI_type
     */
    public IRDI_type getPublisher() 
    {
        return _publisher;
    }


    /**
     * Sets the unambiguous identifier of the organization that published the document. If specified, only documents 
     * published by this organization will be returned by the search. 
     * 
     * @param publisher
     */
    public void setPublisher(IRDI_type publisher) 
    {
        _publisher = publisher;
    }
}
