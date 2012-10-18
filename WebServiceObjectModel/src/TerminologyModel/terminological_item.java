package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the item that serves to descibe, designate or define a concept (@see concept_type).
 */
public class terminological_item  implements java.io.Serializable 
{
	private static final long serialVersionUID = -8702329064639118966L;
	
	private document_Type _conformed_document;
	private document_Type _containing_document;
	private language_Type _language;
    private String _originator_reference;
    private source_location _sourceLocation;
    private IRDI_type _terminological_item_ID; 

	/**
     * Axis needs a default constructor.
     */
    public terminological_item() 
    {
    } 

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param conformed_document: The specification to which the terminological item conforms. 
     * @param containing_document: The document that contains the normative or master copy of the terminological item. 
     * @param language: The language in which the terminological item is coded.. 
     * @param originator_reference: The unique identifier assigned to the terminological item by the originating organization. 
     * @param sourceLocation: The location at which a copy of the source for the terminological item can be found.. 
     * @param  terminological_item_ID: The identifier for this terminological item. 
     */
    public terminological_item(document_Type conformed_document, document_Type containing_document, 
    		language_Type language, String originator_reference, source_location sourceLocation, IRDI_type terminological_item_ID) 
    {
    	_conformed_document = conformed_document;
    	_containing_document = containing_document;
    	_language = language;
        _originator_reference = originator_reference;
        _sourceLocation = sourceLocation;
        _terminological_item_ID = terminological_item_ID; 
    }
    
    /**
     * Gets the specification to which the terminological item conforms.
     * 
     * @return document_Type
     */
    public  document_Type getConformedDocument()
    {
    	return _conformed_document;
    }
    
    /**
     * Sets the specification to which the terminological item conforms.
     * 
     * @param conformed_document
     */
    public  void setConformedDocument(document_Type conformed_document)
    {
    	_conformed_document = conformed_document;
    }
    
    /**
     * Gets the document that contains the normative or master copy of the terminological item.
     * 
     * @return document_Type
     */
    public  document_Type getContainingDocument()
    {
    	return _containing_document;
    }
    
    /**
     * Sets the document that contains the normative or master copy of the terminological item.
     * 
     * @param containing_document
     */
    public  void setContainingDocument(document_Type containing_document)
    {
    	_containing_document = containing_document;
    }
    
    
    /**
     * Gets the language in which the terminological item is coded.
     * 
     * @return language_Type
     */
    public  language_Type getLanguage()
    {
    	return _language;
    }
    
    /**
     * Sets the language in which the terminological item is coded.
     * 
     * @param language
     */
    public  void setLanguage(language_Type language)
    {
    	_language = language;
    }
   
    /**
     * Gets the unique identifier assigned to the terminological item by the originating organization.
     * 
     * @return String
     */
    public String getOriginatorReference()
    {
    	return _originator_reference;
    }
    
    /**
     * Sets the unique identifier assigned to the terminological item by the originating organization.
     * 
     * @param originator_reference
     */
    public  void setOriginatorReference(String originator_reference)
    {
    	_originator_reference = originator_reference;
    }
    
    
    /**
     * Gets the location at which a copy of the source for the terminological item can be found.
     * 
     * @return source_location
     */
    public source_location getSourceLocation()
    {
    	return _sourceLocation;
    }
    
    /**
     * Sets the location at which a copy of the source for the terminological item can be found.
     * 
     * @param source_location
     */
    public  void setSourceLocation(source_location sourceLocation)
    {
    	_sourceLocation = sourceLocation;
    }
    
    /**
     * Gets the identifier for this terminological item.
     * 
     * @return IRDI_type
     */
    public IRDI_type getTerminologicalItemID()
    {
    	return _terminological_item_ID;
    }
    
    /**
     * Sets the identifier for this terminological item.
     * 
     * @return IRDI_type
     */
    public  void setTerminologicalItemID(IRDI_type terminological_item_ID)
    {
    	_terminological_item_ID = terminological_item_ID;
    }

}
