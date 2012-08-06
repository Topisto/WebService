/**
 * ConceptEquivalenceRelationship:
 * Relationship that asserts that several concept have the same intended extension
 */

package TerminologyModel;

public class concept_equivalence_relationship implements java.io.Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6619860244181670756L;
	private String[] equivalentConcept;
	private String id;  
	
    public concept_equivalence_relationship() 
    {
    }

    public concept_equivalence_relationship(
           String[] equivalentConcept,
           String id) 
    {
           this.equivalentConcept = equivalentConcept;
           this.id = id;
    }
    
    /**
     * Gets the id value for this ConceptEquivalenceRelationship.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this ConceptEquivalenceRelationship.
     * 
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }
    
    
    /**
     * Gets the equivalentConcept value.
     * 
     * @return equivalentConcept
     */
    public String[] getEquivalentConcept() 
    {
        return equivalentConcept;
    }


    /**
     * Sets the equivalentConcept value
     * 
     * @param equivalentConcept
     */
    public void setEquivalentConcept(String[] equivalentConcept) 
    {
        this.equivalentConcept = equivalentConcept;
    }

    /**
     * Gets the equivalentConcept value.
     * 
     * @return equivalentConcept
     */
    public String getEquivalentConcept(int i)
    {
        return this.equivalentConcept[i];
    }

    /**
     * Sets the equivalentConcept value
     * 
     * @param equivalentConcept
     */
    public void setEquivalentConcept(int i, String _value) 
    {
        this.equivalentConcept[i] = _value;
    }
    
}
