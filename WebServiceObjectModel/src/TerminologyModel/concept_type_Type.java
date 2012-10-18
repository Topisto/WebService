package TerminologyModel;

import Irdi.IRDI_type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Represents the concept type, the category to which the concept belongs.
 */
public class concept_type_Type  implements java.io.Serializable 
{

	private static final long serialVersionUID = 4622934963176813103L;

    private String _code;
    private IRDI_type _concept_type_ID;
    private String _definition;
    private String _name;
    

	/**
     * Axis needs a default constructor.
     */
    public concept_type_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param code: Ashort series of characters that serves to distinguish the concept_type from other 
     * concept_type objects in the registry, andd that is used for data identifiers. 
     * @param concept_type_ID: The identifier of the concept type.
     * @param definition: The descriptive statement that represents the concept type.
     * @param name: Gets the human-readable designation of this concept type.
     */
    public concept_type_Type(String code, IRDI_type concept_type_ID, String definition, String name) 
    {
      _code = code;
      _concept_type_ID = concept_type_ID;
      _definition = definition;
      _name = name;
    }

    
    /**
     * Gets a short series of characters that serves to distinguish the concept_type from other 
     * concept_type objects in the registry, andd that is used for data identifiers.
     * 
     * @return String
     */
    public String getCode() 
    {
        return _code;
    }


    /**
     * Sets a short series of characters that serves to distinguish the concept_type from other 
     * concept_type objects in the registry, andd that is used for data identifiers.
     * 
     * @param code
     */
    public void setCode(String code) 
    {
        _code = code;
    }

    
    /**
     * Gets identifier of the concept type.
     * 
     * @return IRDI_type
     */
    public IRDI_type getConceptTypeID()
    {
        return _concept_type_ID;
    }


    /**
     * Sets identifier of the concept type.
     * 
     * @param id
     */
    public void setId(IRDI_type concept_type_ID)
    {
    	_concept_type_ID = concept_type_ID;
    }
    

    /**
     * Gets the descriptive statement that represents the concept type.
     * 
     * @return definition
     */
    public String getDefinition() 
    {
        return _definition;
    }


    /**
     *  Sets the descriptive statement that represents the concept type.
     * 
     * @param definition
     */
    public void setDefinition(String definition) 
    {
    	_definition = definition;
    }
        

    /**
     * Gets the human-readable designation of this concept type.
     * 
     * @return String
     */
    public String getName() 
    {
        return _name;
    }


    /**
     * Sets the human-readable designation of this concept type.
     * 
     * @param name
     */
    public void setName(String name) 
    {
        _name = name;
    }
}
