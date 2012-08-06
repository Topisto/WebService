/**
 * Definition.java
 *
 */

package TerminologyModel;

public class definition  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8357779459877813064L;

	private String content;

    private String[] language;

    private String originatorReference;

    private String[] conformedDocument;

    private String containingDocument;

    private source_location[] location;

    private String id; 

    public definition() {
    }

    public definition(
           String content,
           String[] language,
           String originatorReference,
           String[] conformedDocument,
           String containingDocument,
           source_location[] location,
           String containingConcept,
           String id) 
    {
           this.content = content;
           this.language = language;
           this.originatorReference = originatorReference;
           this.conformedDocument= conformedDocument;
           this.containingDocument = containingDocument;
           this.location = location;
           this.id = id;
    }


    /**
     * Gets the content value for this Definition.
     * 
     * @return content
     */
    public String getContent() 
    {
        return content;
    }


    /**
     * Sets the content value for this Definition.
     * 
     * @param content
     */
    public void setContent(String content) 
    {
        this.content = content;
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
     * Gets the language value for this Definition.
     * 
     * @return language
     */
    public String[] getLanguage() 
    {
        return language;
    }


    /**
     * Sets the language value for this Definition.
     * 
     * @param language
     */
    public void setLanguage(String[] language) 
    {
        this.language = language;
    }

    public String getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, String _value) 
    {
        this.language[i] = _value;
    }


    /**
     * Gets the originatorReference value for this Definition.
     * 
     * @return originatorReference
     */
    public String getOriginatorReference()
    {
        return originatorReference;
    }


    /**
     * Sets the originatorReference value for this Definition.
     * 
     * @param originatorReference
     */
    public void setOriginatorReference(String originatorReference) 
    {
        this.originatorReference = originatorReference;
    }


    /**
     * Gets the conformedDocument value for this Definition.
     * 
     * @return conformedDocument
     */
    public String[] getConformedDocument()
    {
        return conformedDocument;
    }


    /**
     * Sets the conformedDocument value for this Definition.
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
     * Gets the containingDocument value for this Definition.
     * 
     * @return containingDocument
     */
    public String getContainingDocument() 
    {
        return containingDocument;
    }


    /**
     * Sets the containingDocument value for this Definition.
     * 
     * @param containingDocument
     */
    public void setContainingDocument(String containingDocument) 
    {
        this.containingDocument = containingDocument;
    }


    /**
     * Gets the location value for this Definition.
     * 
     * @return location
     */
    public source_location[] getLocation() 
    {
        return location;
    }


    /**
     * Sets the location value for this Definition.
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
     * Gets the id value for this Definition.
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value for this Definition.
     * 
     * @param id
     */
    public void setId(String id) 
    {
        this.id = id;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) 
    {
        if (!(obj instanceof definition)) return false;
        definition other = (definition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) 
        {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.originatorReference==null && other.getOriginatorReference()==null) || 
             (this.originatorReference!=null &&
              this.originatorReference.equals(other.getOriginatorReference()))) &&
            ((this.conformedDocument==null && other.getConformedDocument()==null) || 
             (this.conformedDocument!=null &&
              java.util.Arrays.equals(this.conformedDocument, other.getConformedDocument()))) &&
            ((this.containingDocument==null && other.getContainingDocument()==null) || 
             (this.containingDocument!=null &&
              this.containingDocument.equals(other.getContainingDocument()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginatorReference() != null) {
            _hashCode += getOriginatorReference().hashCode();
        }
        if (getConformedDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConformedDocument());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConformedDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContainingDocument() != null) {
            _hashCode += getContainingDocument().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
