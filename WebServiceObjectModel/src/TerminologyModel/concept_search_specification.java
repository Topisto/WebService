/**
 * ConceptSearchSpecification.java
 *
 */

package TerminologyModel;

public class concept_search_specification  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7785842715343764779L;

	private String language;

    private String conceptType;

    private String termPattern;

    private String definitionPattern;

    private String abbreviationPattern;

    private String textualSymbolPattern;

    private String originatorReferencePattern;

    private boolean recommendedOnly;

    private String[] conformedStandard;

    private String[] containingDocument;

    private String[] referencingDocument;

    public concept_search_specification()
    {
    }

    public concept_search_specification(
           String language,
           String conceptType,
           String termPattern,
           String definitionPattern,
           String abbreviationPattern,
           String textualSymbolPattern,
           String originatorReferencePattern,
           boolean recommendedOnly,
           String[] conformedStandard,
           String[] containingDocument,
           String[] referencingDocument)
    {
           this.language = language;
           this.conceptType = conceptType;
           this.termPattern = termPattern;
           this.definitionPattern = definitionPattern;
           this.abbreviationPattern = abbreviationPattern;
           this.textualSymbolPattern = textualSymbolPattern;
           this.originatorReferencePattern = originatorReferencePattern;
           this.recommendedOnly = recommendedOnly;
           this.conformedStandard = conformedStandard;
           this.containingDocument = containingDocument;
           this.referencingDocument = referencingDocument;
    }


    /**
     * Gets the language value for this ConceptSearchSpecification.
     * 
     * @return language
     */
    public String getLanguage() 
    {
        return language;
    }


    /**
     * Sets the language value for this ConceptSearchSpecification.
     * 
     * @param language
     */
    public void setLanguage(String language) 
    {
        this.language = language;
    }


    /**
     * Gets the conceptType value for this ConceptSearchSpecification.
     * 
     * @return conceptType
     */
    public String getConceptType()
    {
        return conceptType;
    }


    /**
     * Sets the conceptType value for this ConceptSearchSpecification.
     * 
     * @param conceptType
     */
    public void setConceptType(String conceptType) 
    {
        this.conceptType = conceptType;
    }


    /**
     * Gets the termPattern value for this ConceptSearchSpecification.
     * 
     * @return termPattern
     */
    public String getTermPattern() 
    {
        return termPattern;
    }


    /**
     * Sets the termPattern value for this ConceptSearchSpecification.
     * 
     * @param termPattern
     */
    public void setTermPattern(String termPattern) 
    {
        this.termPattern = termPattern;
    }


    /**
     * Gets the definitionPattern value for this ConceptSearchSpecification.
     * 
     * @return definitionPattern
     */
    public String getDefinitionPattern() 
    {
        return definitionPattern;
    }


    /**
     * Sets the definitionPattern value for this ConceptSearchSpecification.
     * 
     * @param definitionPattern
     */
    public void setDefinitionPattern(String definitionPattern)
    {
        this.definitionPattern = definitionPattern;
    }


    /**
     * Gets the abbreviationPattern value for this ConceptSearchSpecification.
     * 
     * @return abbreviationPattern
     */
    public String getAbbreviationPattern() 
    {
        return abbreviationPattern;
    }


    /**
     * Sets the abbreviationPattern value for this ConceptSearchSpecification.
     * 
     * @param abbreviationPattern
     */
    public void setAbbreviationPattern(String abbreviationPattern)
    {
        this.abbreviationPattern = abbreviationPattern;
    }


    /**
     * Gets the textualSymbolPattern value for this ConceptSearchSpecification.
     * 
     * @return textualSymbolPattern
     */
    public String getTextualSymbolPattern() 
    {
        return textualSymbolPattern;
    }


    /**
     * Sets the textualSymbolPattern value for this ConceptSearchSpecification.
     * 
     * @param textualSymbolPattern
     */
    public void setTextualSymbolPattern(String textualSymbolPattern) 
    {
        this.textualSymbolPattern = textualSymbolPattern;
    }


    /**
     * Gets the originatorReferencePattern value for this ConceptSearchSpecification.
     * 
     * @return originatorReferencePattern
     */
    public String getOriginatorReferencePattern()
    {
        return originatorReferencePattern;
    }


    /**
     * Sets the originatorReferencePattern value for this ConceptSearchSpecification.
     * 
     * @param originatorReferencePattern
     */
    public void setOriginatorReferencePattern(String originatorReferencePattern) 
    {
        this.originatorReferencePattern = originatorReferencePattern;
    }


    /**
     * Gets the recommendedOnly value for this ConceptSearchSpecification.
     * 
     * @return recommendedOnly
     */
    public boolean isRecommendedOnly() 
    {
        return recommendedOnly;
    }


    /**
     * Sets the recommendedOnly value for this ConceptSearchSpecification.
     * 
     * @param recommendedOnly
     */
    public void setRecommendedOnly(boolean recommendedOnly) 
    {
        this.recommendedOnly = recommendedOnly;
    }


    /**
     * Gets the conformedStandard value for this ConceptSearchSpecification.
     * 
     * @return conformedStandard
     */
    public String[] getConformedStandard() 
    {
        return conformedStandard;
    }


    /**
     * Sets the conformedStandard value for this ConceptSearchSpecification.
     * 
     * @param conformedStandard
     */
    public void setConformedStandard(String[] conformedStandard) 
    {
        this.conformedStandard = conformedStandard;
    }

    public String getConformedStandard(int i) 
    {
        return this.conformedStandard[i];
    }

    public void setConformedStandard(int i, String _value)
    {
        this.conformedStandard[i] = _value;
    }


    /**
     * Gets the containingDocument value for this ConceptSearchSpecification.
     * 
     * @return containingDocument
     */
    public String[] getContainingDocument() 
    {
        return containingDocument;
    }


    /**
     * Sets the containingDocument value for this ConceptSearchSpecification.
     * 
     * @param containingDocument
     */
    public void setContainingDocument(String[] containingDocument) 
    {
        this.containingDocument = containingDocument;
    }

    public String getContainingDocument(int i)
    {
        return this.containingDocument[i];
    }

    public void setContainingDocument(int i, String _value) 
    {
        this.containingDocument[i] = _value;
    }


    /**
     * Gets the referencingDocument value for this ConceptSearchSpecification.
     * 
     * @return referencingDocument
     */
    public String[] getReferencingDocument() 
    {
        return referencingDocument;
    }


    /**
     * Sets the referencingDocument value for this ConceptSearchSpecification.
     * 
     * @param referencingDocument
     */
    public void setReferencingDocument(String[] referencingDocument) 
    {
        this.referencingDocument = referencingDocument;
    }

    public String getReferencingDocument(int i)
    {
        return this.referencingDocument[i];
    }

    public void setReferencingDocument(int i, String _value) 
    {
        this.referencingDocument[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof concept_search_specification)) return false;
        concept_search_specification other = (concept_search_specification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.conceptType==null && other.getConceptType()==null) || 
             (this.conceptType!=null &&
              this.conceptType.equals(other.getConceptType()))) &&
            ((this.termPattern==null && other.getTermPattern()==null) || 
             (this.termPattern!=null &&
              this.termPattern.equals(other.getTermPattern()))) &&
            ((this.definitionPattern==null && other.getDefinitionPattern()==null) || 
             (this.definitionPattern!=null &&
              this.definitionPattern.equals(other.getDefinitionPattern()))) &&
            ((this.abbreviationPattern==null && other.getAbbreviationPattern()==null) || 
             (this.abbreviationPattern!=null &&
              this.abbreviationPattern.equals(other.getAbbreviationPattern()))) &&
            ((this.textualSymbolPattern==null && other.getTextualSymbolPattern()==null) || 
             (this.textualSymbolPattern!=null &&
              this.textualSymbolPattern.equals(other.getTextualSymbolPattern()))) &&
            ((this.originatorReferencePattern==null && other.getOriginatorReferencePattern()==null) || 
             (this.originatorReferencePattern!=null &&
              this.originatorReferencePattern.equals(other.getOriginatorReferencePattern()))) &&
            this.recommendedOnly == other.isRecommendedOnly() &&
            ((this.conformedStandard==null && other.getConformedStandard()==null) || 
             (this.conformedStandard!=null &&
              java.util.Arrays.equals(this.conformedStandard, other.getConformedStandard()))) &&
            ((this.containingDocument==null && other.getContainingDocument()==null) || 
             (this.containingDocument!=null &&
              java.util.Arrays.equals(this.containingDocument, other.getContainingDocument()))) &&
            ((this.referencingDocument==null && other.getReferencingDocument()==null) || 
             (this.referencingDocument!=null &&
              java.util.Arrays.equals(this.referencingDocument, other.getReferencingDocument())));
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getConceptType() != null) {
            _hashCode += getConceptType().hashCode();
        }
        if (getTermPattern() != null) {
            _hashCode += getTermPattern().hashCode();
        }
        if (getDefinitionPattern() != null) {
            _hashCode += getDefinitionPattern().hashCode();
        }
        if (getAbbreviationPattern() != null) {
            _hashCode += getAbbreviationPattern().hashCode();
        }
        if (getTextualSymbolPattern() != null) {
            _hashCode += getTextualSymbolPattern().hashCode();
        }
        if (getOriginatorReferencePattern() != null) {
            _hashCode += getOriginatorReferencePattern().hashCode();
        }
        _hashCode += (isRecommendedOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConformedStandard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConformedStandard());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getConformedStandard(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContainingDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContainingDocument());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContainingDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferencingDocument() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferencingDocument());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getReferencingDocument(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
