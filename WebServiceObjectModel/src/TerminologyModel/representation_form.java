/**
 * RepresentationForm.java
 *
 */

package TerminologyModel;

public class representation_form  implements java.io.Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3635609176861097019L;

	private local_string[] name;

    private java.lang.String controllingDocument;

    private java.lang.String asn1Identifier;

    private String urn;

    private String id;  // attribute

    public representation_form() 
    {
    }

    public representation_form(
           local_string[] name,
           String controllingDocument,
           String asn1Identifier,
           String urn,
           String id)
    {
           this.name = name;
           this.controllingDocument = controllingDocument;
           this.asn1Identifier = asn1Identifier;
           this.urn = urn;
           this.id = id;
    }


    /**
     * Gets the name value for this RepresentationForm.
     * 
     * @return name
     */
    public local_string[] getName()
    {
        return name;
    }


    /**
     * Sets the name value for this RepresentationForm.
     * 
     * @param name
     */
    public void setName( local_string[] name) 
    {
        this.name = name;
    }


    /**
     * Gets the controllingDocument value for this RepresentationForm.
     * 
     * @return controllingDocument
     */
    public String getControllingDocument() 
    {
        return controllingDocument;
    }


    /**
     * Sets the controllingDocument value for this RepresentationForm.
     * 
     * @param controllingDocument
     */
    public void setControllingDocument( String controllingDocument) 
    {
        this.controllingDocument = controllingDocument;
    }


    /**
     * Gets the asn1Identifier value for this RepresentationForm.
     * 
     * @return asn1Identifier
     */
    public String getAsn1Identifier() 
    {
        return asn1Identifier;
    }


    /**
     * Sets the asn1Identifier value for this RepresentationForm.
     * 
     * @param asn1Identifier
     */
    public void setAsn1Identifier(String asn1Identifier)
    {
        this.asn1Identifier = asn1Identifier;
    }


    /**
     * Gets the urn value for this RepresentationForm.
     * 
     * @return urn
     */
    public String getUrn() 
    {
        return urn;
    }


    /**
     * Sets the urn value for this RepresentationForm.
     * 
     * @param urn
     */
    public void setUrn(String urn) 
    {
        this.urn = urn;
    }


    /**
     * Gets the id value for this RepresentationForm.
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value for this RepresentationForm.
     * 
     * @param id
     */
    public void setId(String id) 
    {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof representation_form)) return false;
        representation_form other = (representation_form) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.controllingDocument==null && other.getControllingDocument()==null) || 
             (this.controllingDocument!=null &&
              this.controllingDocument.equals(other.getControllingDocument()))) &&
            ((this.asn1Identifier==null && other.getAsn1Identifier()==null) || 
             (this.asn1Identifier!=null &&
              this.asn1Identifier.equals(other.getAsn1Identifier()))) &&
            ((this.urn==null && other.getUrn()==null) || 
             (this.urn!=null &&
              this.urn.equals(other.getUrn()))) &&
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getControllingDocument() != null) {
            _hashCode += getControllingDocument().hashCode();
        }
        if (getAsn1Identifier() != null) {
            _hashCode += getAsn1Identifier().hashCode();
        }
        if (getUrn() != null) {
            _hashCode += getUrn().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
