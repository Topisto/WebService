package TerminologyModel;

import Irdi.IRDI_type;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Represents an administrative structure.  
 */
public class organization_Type  implements java.io.Serializable 
{
	private static final long serialVersionUID = 3898404303774930092L;

    private String _mailAddress;
    private String _name;
    private IRDI_type _organization_ID;  
    
	/**
     * Axis needs a default constructor.
     */
    public organization_Type() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param mailAddress: Information necessary for delivery of physical mail to the organization. 
     * @param name: Human-readable designation of the organization. 
     * @param organization_ID: Unique identifier for this organization. 
     */
    public organization_Type(String mailAddress, String name, IRDI_type organization_ID)
    {
    	_mailAddress = mailAddress;
    	_name = name;
    	_organization_ID = organization_ID;
    }
    
    /**
     * Gets the information necessary for delivery of physical mail to the organization. 
     * 
     * @return String
     */
    public String getMailAddress() 
    {
        return _mailAddress;
    }


    /**
     * Sets the information necessary for delivery of physical mail to the organization. 
     * 
     * @param mailAddress
     */
    public void setMailAddress(String mailAddress) 
    {
        _mailAddress = mailAddress;
    }


    /**
     * Gets the human-readable designation of the organization.
     * 
     * @return String
     */
    public String getName() 
    {
        return _name;
    }


    /**
     * Sets the human-readable designation of the organization.
     * 
     * @param name
     */
    public void setName(String name) 
    {
        _name = name;
    }

    
    /**
     * Gets the unique identifier for this organization. 
     * 
     * @return IRDI_type
     */
    public IRDI_type getOrganizationID()
    {
        return _organization_ID;
    }


    /**
     * Sets the unique identifier for this organization. 
     * 
     * @param organization_ID
     */
    public void setOrganizationID(IRDI_type organization_ID)
    {
    	_organization_ID = organization_ID;
    }
}
