package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents the description of a format for representing ontology information about a concept. 
 */
public class representation_form  implements java.io.Serializable
{
	private static final long serialVersionUID = 3635609176861097019L;

	private String _asn1Identifier;
	private String _controllingDocumentRef;
	private String _name;
	private IRDI_type _representation_Form_ID;
	private String _representation_Form_URI;

	/**
     * Axis needs a default constructor.
     */
    public representation_form() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param asn1Identifier: ASN.1 identifier of the representation form. 
     * @param controllingDocumentRef: Unambiguous identifier of the document that normatively specifies the 
     * syntax and semantics of the representation form. 
     * @param name: Word or sequence of words by which the representation form is known.  
     * @param representation_Form_ID: Unambiguous identifier of this representation form. 
     * @param representation_Form_URI: Uniform resource identifier of this representation form. 
     */
    public representation_form(String asn1Identifier, String controllingDocumentRef, String name, 
    		IRDI_type representation_Form_ID, String representation_Form_URI)
    {
    	_asn1Identifier = asn1Identifier;
    	_controllingDocumentRef = controllingDocumentRef;
    	_name = name;
    	_representation_Form_ID = representation_Form_ID;
    	_representation_Form_URI = representation_Form_URI;
    }
    
    /**
     * Gets the ASN.1 identifier of the representation form. 
     * 
     * @return String
     */
    public String getAsn1Identifier() 
    {
        return _asn1Identifier;
    }


    /**
     * Sets the ASN.1 identifier of the representation form. 
     * 
     * @param asn1Identifier
     */
    public void setAsn1Identifier(String asn1Identifier)
    {
        _asn1Identifier = asn1Identifier;
    }
    
    /**
     * Gets the unambiguous identifier of the document that normatively specifies the 
     * syntax and semantics of the representation form. 
     * 
     * @return String
     */
    public String getControllingDocumentRef() 
    {
        return _controllingDocumentRef;
    }


    /**
     * Sets the unambiguous identifier of the document that normatively specifies the 
     * syntax and semantics of the representation form. 
     * 
     * @param controllingDocumentRef
     */
    public void setControllingDocumentRef(String controllingDocumentRef) 
    {
    	_controllingDocumentRef = controllingDocumentRef;
    }
    

    /**
     * Gets the word or sequence of words by which the representation form is known.  
     * 
     * @return String
     */
    public String getName()
    {
        return _name;
    }

    /**
     * Sets the word or sequence of words by which the representation form is known.  
     * 
     * @param name
     */
    public void setName(String name) 
    {
        _name = name;
    }

    
    /**
     * Gets the uniform resource identifier of this representation form. 
     * 
     * @return String
     */
    public String get_representation_Form_URI() 
    {
        return _representation_Form_URI;
    }


    /**
     * Sets the uniform resource identifier of this representation form. 
     * 
     * @param representation_Form_URI
     */
    public void set_representation_Form_URI(String representation_Form_URI) 
    {
    	_representation_Form_URI = representation_Form_URI;
    }

    /**
     * Gets the unambiguous identifier of this representation form.
     * 
     * @return IRDI_type
     */
    public IRDI_type get_representation_Form_ID() 
    {
        return _representation_Form_ID;
    }

    /**
     * Sets the unambiguous identifier of this representation form.
     * 
     * @param representation_Form_ID
     */
    public void set_representation_Form_ID(IRDI_type representation_Form_ID) 
    {
    	_representation_Form_ID = representation_Form_ID;
    }
}
