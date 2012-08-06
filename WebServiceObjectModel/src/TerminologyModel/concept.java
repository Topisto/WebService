/**
 * Concept:
 *
 */

package TerminologyModel;

public class concept  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8479649879873693726L;

	private boolean isDeprecated;

    private String conceptType;

    private String[] term;

    private String[] definition;

    private String[] image;

    private String[] symbol;

    private String id;  

    public concept() 
    {
    }

    public concept(
           boolean isDeprecated,
           String conceptType,
           String[] term,
           String[] definition,
           String[] image,
           String[] symbol,
           String[] equivalenceRelationship,
           String id) {
           this.isDeprecated = isDeprecated;
           this.conceptType = conceptType;
           this.term = term;
           this.definition = definition;
           this.image = image;
           this.symbol = symbol;
           this.id = id;
    }


    /**
     * Gets the isDeprecated value for this Concept.
     * 
     * @return isDeprecated
     */
    public boolean isDeprecated() 
    {
        return isDeprecated;
    }


    /**
     * Sets the isDeprecated value for this Concept.
     * 
     * @param isDeprecated
     */
    public void setIsRecommended(boolean isDeprecated) 
    {
        this.isDeprecated = isDeprecated;
    }


    /**
     * Gets the conceptType value for this Concept.
     * 
     * @return conceptType
     */
    public String getConceptType() 
    {
        return conceptType;
    }


    /**
     * Sets the conceptType value for this Concept.
     * 
     * @param conceptType
     */
    public void setConceptType(String conceptType) 
    {
        this.conceptType = conceptType;
    }


    /**
     * Gets the term value for this Concept.
     * 
     * @return term
     */
    public String[] getTerm()
    {
        return term;
    }


    /**
     * Sets the term value for this Concept.
     * 
     * @param term
     */
    public void setTerm(String[] term)
    {
        this.term = term;
    }

    public String getTerm(int i)
    {
        return this.term[i];
    }

    public void setTerm(int i, String _value) 
    {
        this.term[i] = _value;
    }


    /**
     * Gets the definition value for this Concept.
     * 
     * @return definition
     */
    public String[] getDefinition()
    {
        return definition;
    }


    /**
     * Sets the definition value for this Concept.
     * 
     * @param definition
     */
    public void setDefinition(String[] definition) 
    {
        this.definition = definition;
    }

    public String getDefinition(int i) 
    {
        return this.definition[i];
    }

    public void setDefinition(int i, String _value)
    {
        this.definition[i] = _value;
    }


    /**
     * Gets the image value for this Concept.
     * 
     * @return image
     */
    public String[] getImage() 
    {
        return image;
    }


    /**
     * Sets the image value for this Concept.
     * 
     * @param image
     */
    public void setImage(String[] image) 
    {
        this.image = image;
    }

    public String getImage(int i) 
    {
        return this.image[i];
    }

    public void setImage(int i, String _value)
    {
        this.image[i] = _value;
    }


    /**
     * Gets the symbol value for this Concept.
     * 
     * @return symbol
     */
    public String[] getSymbol() 
    {
        return symbol;
    }


    /**
     * Sets the symbol value for this Concept.
     * 
     * @param symbol
     */
    public void setGraphicalSymbol(String[] symbol) 
    {
        this.symbol = symbol;
    }

    public String getSymbol(int i)
    {
        return this.symbol[i];
    }

    public void setSymbol(int i, String _value)
    {
        this.symbol[i] = _value;
    }


    /**
     * Gets the id value for this Concept.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this Concept.
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
        if (!(obj instanceof concept)) return false;
        concept other = (concept) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isDeprecated == other.isDeprecated() &&
            ((this.conceptType==null && other.getConceptType()==null) || 
             (this.conceptType!=null &&
              this.conceptType.equals(other.getConceptType()))) &&
            ((this.term==null && other.getTerm()==null) || 
             (this.term!=null &&
              java.util.Arrays.equals(this.term, other.getTerm()))) &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              java.util.Arrays.equals(this.definition, other.getDefinition()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              java.util.Arrays.equals(this.symbol, other.getSymbol()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() 
    {
        if (__hashCodeCalc)
        {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isDeprecated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConceptType() != null) {
            _hashCode += getConceptType().hashCode();
        }
        if (getTerm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerm());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTerm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefinition() != null)
        {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefinition());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDefinition(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSymbol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSymbol());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSymbol(), i);
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
