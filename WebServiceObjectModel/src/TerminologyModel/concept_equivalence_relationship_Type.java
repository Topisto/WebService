package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the relationship that asserts that several concept have the same intended extension.
 */
public class concept_equivalence_relationship_Type implements java.io.Serializable 
{
	private static final long serialVersionUID = -6619860244181670756L;
	
	private IRDI_type _concept_equivalence_relationship_ID; 
	private concept_Type[] _equivalentConcepts;
	 
	/**
     * Axis needs a default constructor.
     */
    public concept_equivalence_relationship_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param concept_equivalence_relationship_ID: The identifier for this concept equivalence relationship. 
     * @param equivalentConcepts: The concepts (@see concept_type) for which the concept_equivalence relationship makes an assertion of equivalence. 
     *  
     */
     public concept_equivalence_relationship_Type(IRDI_type concept_equivalence_relationship_ID, concept_Type[] equivalentConcepts) 
    {
    	_concept_equivalence_relationship_ID = concept_equivalence_relationship_ID;
    	_equivalentConcepts = equivalentConcepts;
    }
    
    /**
     * Gets the identifier for this concept equivalence relationship.
     * 
     * @return IRDI_type
     */
    public IRDI_type getConceptEquivalenceRelationshipID()
    {
        return _concept_equivalence_relationship_ID;
    }


    /**
     * Sets the identifier for this concept equivalence relationship.
     * 
     * @param concept_equivalence_relationship_ID
     */
    public void setConceptEquivalenceRelationshipID(IRDI_type concept_equivalence_relationship_ID)
    {
    	_concept_equivalence_relationship_ID = concept_equivalence_relationship_ID;
    }
    
    
    /**
     * Gets the concepts for which the concept_equivalence relationship makes an assertion of equivalence.
     * 
     * @return concept_Type[]
     */
    public concept_Type[] getEquivalentConcept() 
    {
        return _equivalentConcepts;
    }


    /**
     * Sets the concepts for which the concept_equivalence relationship makes an assertion of equivalence.
     * 
     * @param equivalentConcepts
     */
    public void setEquivalentConcept(concept_Type[] equivalentConcepts) 
    {
    	_equivalentConcepts = equivalentConcepts;
    }
    
}
