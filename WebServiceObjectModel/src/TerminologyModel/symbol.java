/**
 * GraphicalSymbol.java
 *
 */

package TerminologyModel;

public class symbol  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4908050587308347363L;

	private file_representation fileRepresentation;
	
	private String textRepresentation;
	
	private String[] language;

    private String originatorReference;

    private String[] conformedDocument;

    private String containingDocument;
    
    private source_location[] location;

    private String id;  

    public symbol() 
    {
    }

    public symbol(
           String textRepresentation,
           String originatorReference,
           String[] conformedDocument,
           String containingDocument,
           source_location[] location,
           String[] language,
           file_representation fileRepresentation, 
           String id) 
    {
           this.textRepresentation = textRepresentation;
           this.fileRepresentation = fileRepresentation;
           this.originatorReference = originatorReference;
           this.conformedDocument = conformedDocument;
           this.containingDocument = containingDocument;
           this.location = location;
           this.language = language;
           this.id = id;
    }


    /**
     * Gets the text representation value for this symbol.
     * 
     * @return text representation
     */
    public String getTextRepresentation()
    {
        return textRepresentation;
    }


    /**
     * Sets the text representation value for this symbol.
     * 
     * @param text representation
     */
    public void setTextRepresentation(String representation)
    {
        this.textRepresentation = representation;
    }

    
    /**
     * Gets the file representation value for this symbol.
     * 
     * @return file representation
     */
    public file_representation getFileRepresentation()
    {
        return fileRepresentation;
    }


    /**
     * Sets the file representation value for this symbol.
     * 
     * @param file representation
     */
    public void setFileRepresentation(file_representation fileRepresentation)
    {
        this.fileRepresentation = fileRepresentation;
    }

    /**
     * Gets the originatorReference value for this GraphicalSymbol.
     * 
     * @return originatorReference
     */
    public String getoriginatorReference()
    {
        return originatorReference;
    }


    /**
     * Sets the originatorReference value for this GraphicalSymbol.
     * 
     * @param originatorReference
     */
    public void setoriginatorReference(String originatorReference)
    {
        this.originatorReference = originatorReference;
    }


    /**
     * Gets the conformedDocument value for this GraphicalSymbol.
     * 
     * @return conformedDocument
     */
    public String[] getconformedDocument() 
    {
        return conformedDocument;
    }


    /**
     * Sets the conformedDocument value for this GraphicalSymbol.
     * 
     * @param conformedDocument
     */
    public void setconformedDocument(String[] conformedDocument) 
    {
        this.conformedDocument = conformedDocument;
    }

    public String getconformedDocument(int i)
    {
        return this.conformedDocument[i];
    }

    public void setconformedDocument(int i, String _value) 
    {
        this.conformedDocument[i] = _value;
    }


    /**
     * Gets the containingDocument value for this GraphicalSymbol.
     * 
     * @return containingDocument
     */
    public String getContainingDocument() 
    {
        return containingDocument;
    }


    /**
     * Sets the containingDocument value for this GraphicalSymbol.
     * 
     * @param containingDocument
     */
    public void setContainingDocument(String containingDocument) 
    {
        this.containingDocument = containingDocument;
    }


    /**
     * Gets the location value for this GraphicalSymbol.
     * 
     * @return location
     */
    public source_location[] getLocation() 
    {
        return location;
    }


    /**
     * Sets the location value for this GraphicalSymbol.
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
     * Gets the language value for this symbol.
     * 
     * @return language
     */
    public String[] getLanguage() 
    {
        return language;
    }


    /**
     * Sets the language value for this Symbol.
     * 
     * @param containingLanguage
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
     * Gets the id value for this GraphicalSymbol.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this GraphicalSymbol.
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
        if (!(obj instanceof symbol)) return false;
        symbol other = (symbol) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.textRepresentation==null && other.getTextRepresentation()==null) || 
             (this.textRepresentation!=null &&
              this.textRepresentation.equals(other.getTextRepresentation()))) &&
            ((this.fileRepresentation==null && other.getFileRepresentation()==null) || 
             (this.fileRepresentation!=null &&
              this.fileRepresentation.equals(other.getFileRepresentation()))) &&
            ((this.originatorReference==null && other.getoriginatorReference()==null) || 
             (this.originatorReference!=null &&
              this.originatorReference.equals(other.getoriginatorReference()))) &&
            ((this.conformedDocument==null && other.getconformedDocument()==null) || 
             (this.conformedDocument!=null &&
              java.util.Arrays.equals(this.conformedDocument, other.getconformedDocument()))) &&
            ((this.containingDocument==null && other.getContainingDocument()==null) || 
             (this.containingDocument!=null &&
              this.containingDocument.equals(other.getContainingDocument()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.language==null && other.language==null) || 
             (this.language!=null &&
              this.language.equals(other.language))) &&
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
        if (getTextRepresentation() != null) {
            _hashCode += getTextRepresentation().hashCode();
        }
        if (getFileRepresentation() != null) {
            _hashCode += getFileRepresentation().hashCode();
        }
        if (getoriginatorReference() != null) {
            _hashCode += getoriginatorReference().hashCode();
        }
        if (getconformedDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getconformedDocument());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getconformedDocument(), i);
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
