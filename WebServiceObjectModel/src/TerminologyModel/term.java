/**
 * Term.java
 *
 */

package TerminologyModel;

public class term  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4327100320962056835L;

	private String content;

    private String[] abbreviation;

    private String[] language;

    private String originatorReference;

    private String[] conformedDocument;

    private String containingDocument;

    private source_location[] location;

    private String id;  // attribute

    public term() 
    {
    }

    public term(
           String content,
           String[] abbreviation,
           String[] language,
           String originatorReference,
           String[] conformedDocument,
           String containingDocument,
           source_location[] location,
           String id) 
    {
           this.content = content;
           this.abbreviation = abbreviation;
           this.language = language;
           this.originatorReference = originatorReference;
           this.conformedDocument = conformedDocument;
           this.containingDocument = containingDocument;
           this.location = location;
           this.id = id;
    }


    /**
     * Gets the content value for this Term.
     * 
     * @return content
     */
    public String getContent() 
    {
        return content;
    }


    /**
     * Sets the content value for this Term.
     * 
     * @param content
     */
    public void setContent(String content)
    {
        this.content = content;
    }


    /**
     * Gets the abbreviation value for this Term.
     * 
     * @return abbreviation
     */
    public String[] getAbbreviation() 
    {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this Term.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(String[] abbreviation) 
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(int i) 
    {
        return this.abbreviation[i];
    }

    public void setAbbreviation(int i, String _value) 
    {
        this.abbreviation[i] = _value;
    }


    /**
     * Gets the language value for this Term.
     * 
     * @return language
     */
    public String[] getLanguage()
    {
        return language;
    }


    /**
     * Sets the language value for this Term.
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
     * Gets the originatorReferenceString value for this Term.
     * 
     * @return originatorReferenceString
     */
    public String getOriginatorReference()
    {
        return originatorReference;
    }


    /**
     * Sets the originatorReferenceString value for this Term.
     * 
     * @param originatorReferenceString
     */
    public void setOriginatorReference(String originatorReference) 
    {
        this.originatorReference = originatorReference;
    }


    /**
     * Gets the conformedDocument value for this Term.
     * 
     * @return conformedDocument
     */
    public String[] getConformedDocument() 
    {
        return conformedDocument;
    }


    /**
     * Sets the conformedDocument value for this Term.
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
     * Gets the containingDocument value for this Term.
     * 
     * @return containingDocument
     */
    public String getContainingDocument() 
    {
        return containingDocument;
    }


    /**
     * Sets the containingDocument value for this Term.
     * 
     * @param containingDocument
     */
    public void setContainingDocument(String containingDocument)
    {
        this.containingDocument = containingDocument;
    }


    /**
     * Gets the location value for this Term.
     * 
     * @return location
     */
    public source_location[] getLocation() 
    {
        return location;
    }


    /**
     * Sets the location value for this Term.
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
     * Gets the id value for this Term.
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value for this Term.
     * 
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }
}
