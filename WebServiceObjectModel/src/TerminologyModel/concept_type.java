/**
 * ConceptType.java
 *
 */

package TerminologyModel;

public class concept_type  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 4622934963176813103L;

	private String[] name;

    private String[] definition;

    private java.lang.String code;

    private java.lang.String id;  // attribute

    public concept_type() {
    }

    public concept_type(
           String[] name,
           String[] definition,
           java.lang.String code,
           java.lang.String id) 
    {
           this.name = name;
           this.definition = definition;
           this.code = code;
           this.id = id;
    }


    /**
     * Gets the name value for this ConceptType.
     * 
     * @return name
     */
    public String[] getName() 
    {
        return name;
    }


    /**
     * Sets the name value for this ConceptType.
     * 
     * @param name
     */
    public void setName(String[] name) 
    {
        this.name = name;
    }


    /**
     * Gets the definition value for this ConceptType.
     * 
     * @return definition
     */
    public String[] getDefinition() 
    {
        return definition;
    }


    /**
     * Sets the definition value for this ConceptType.
     * 
     * @param definition
     */
    public void setDefinition(String[] definition) 
    {
        this.definition = definition;
    }


    /**
     * Gets the code value for this ConceptType.
     * 
     * @return code
     */
    public java.lang.String getCode() 
    {
        return code;
    }


    /**
     * Sets the code value for this ConceptType.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) 
    {
        this.code = code;
    }


    /**
     * Gets the id value for this ConceptType.
     * 
     * @return id
     */
    public java.lang.String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this ConceptType.
     * 
     * @param id
     */
    public void setId(java.lang.String id)
    {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof concept_type)) return false;
        concept_type other = (concept_type) obj;
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
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              java.util.Arrays.equals(this.definition, other.getDefinition()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
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
        if (getDefinition() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinition());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
