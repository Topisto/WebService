/**
 * Abbreviation.java
 */

package TerminologyModel;

public class abbreviation  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6485081461420265568L;

	private java.lang.String content;

    private String[] language;

    private String originatorReference;

    private String[] conformedDocument;

    private String containingDocument;

    private source_location[] location;

    private String id;  

    public abbreviation() 
    {
    }

    public abbreviation(
           String content,
           String[] language,
           String originatorReference,
           String[] conformedDocument,
           String containingDocument,
           source_location[] location,
           String id) 
    {
           this.content = content;
           this.language = language;
           this.originatorReference = originatorReference;
           this.conformedDocument = conformedDocument;
           this.containingDocument = containingDocument;
           this.location = location;
           this.id = id;
    }

	/**
     * Gets the content value for this Abbreviation.
     * 
     * @return content
     */
    public String getContent() 
    {
        return content;
    }


    /**
     * Sets the content value for this Abbreviation.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
        this.content = content;
    }


    /**
     * Gets the language value for this Abbreviation.
     * 
     * @return language
     */
    public String[] getLanguage()
    {
        return language;
    }


    /**
     * Sets the language value for this Abbreviation.
     * 
     * @param language
     */
    public void setLanguage(String[] language) 
    {
        this.language = language;
    }

    public String getLanguage(int i) 
    {
        return this.language[i];
    }

    public void setLanguage(int i, String _value) 
    {
        this.language[i] = _value;
    }


    /**
     * Gets the originatorReference value for this Abbreviation.
     * 
     * @return originatorReference
     */
    public String getOriginatorReference() 
    {
        return originatorReference;
    }


    /**
     * Sets the originatorReference value for this Abbreviation.
     * 
     * @param originatorReference
     */
    public void setOriginatorReferenceString(String originatorReference) 
    {
        this.originatorReference = originatorReference;
    }


    /**
     * Gets the conformedDocument value for this Abbreviation.
     * 
     * @return conformedDocument
     */
    public String[] getConformedDocument() 
    {
        return conformedDocument;
    }


    /**
     * Sets the conformedDocument value for this Abbreviation.
     * 
     * @param conformedDocument
     */
    public void setConformedDocument(String[] conformedDocument) 
    {
        this.conformedDocument = conformedDocument;
    }

    public String getConformedDocument(int i) 
    {
        return this.conformedDocument[i];
    }

    public void setConformedDocument(int i, String _value) 
    {
        this.conformedDocument[i] = _value;
    }


    /**
     * Gets the containingDocument value for this Abbreviation.
     * 
     * @return containingDocument
     */
    public String getContainingDocument()
    {
        return containingDocument;
    }


    /**
     * Sets the containingDocument value for this Abbreviation.
     * 
     * @param containingDocument
     */
    public void setContainingDocument(String containingDocument) 
    {
        this.containingDocument = containingDocument;
    }


    /**
     * Gets the location value for this Abbreviation.
     * 
     * @return location
     */
    public source_location[] getLocation() 
    {
        return location;
    }


    /**
     * Sets the location value for this Abbreviation.
     * 
     * @param location
     */
    public void setLocation(source_location[] location) 
    {
        this.location = location;
    }

    public source_location getLocation(int i) 
    {
        return this.location[i];
    }

    public void setLocation(int i, source_location _value) 
    {
        this.location[i] = _value;
    }

    /**
     * Gets the id value for this Abbreviation.
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value for this Abbreviation.
     * 
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }
}
