package ExceptionHandler;

import Irdi.IRDI_type;

/**
* <p>Implementation of the Web service according to the ISO 29002-20</p>
* @author Sandra Janﬂen
* @version 1.0
*  
* Exception that indicates that an object that matches the given identifier was not found. 
*/
public class object_not_found_exception  extends Exception implements java.io.Serializable  
{
	private static final long serialVersionUID = -4958824841111183492L;
	private IRDI_type _object_ID;
	private String _error_message;

	/**
     * Axis needs a default constructor.
     */
    public object_not_found_exception() 
    {
    }


   	/**
     * Constructor for initalizing the properties.
     * 
     * @param object_ID: The irdi of the object. 
     * @param error_message: The error message of the exception. 
     */
    public object_not_found_exception(IRDI_type object_ID, String error_message) 
    {
    	_object_ID = object_ID;
    	_error_message = error_message;
    }


    /**
     * Gets the error message including stack trace, etc.
     * 
     * @return _errorMessage
     */
    public String getError_message() 
    {
        return _error_message;
    }
    
    /**
     * Sets the error message including stack trace, etc.
     * 
     * @return _errorMessage
     */
    public void setError_message(String error_message) 
    {
    	_error_message = error_message;
    }
    
    /**
     * Gets the object id.
     * 
     * @return object_ID
     */
    public IRDI_type getObject_ID() 
    {
        return _object_ID;
    }
    
    /**
     * Sets the object id.
     * 
     * @return object_ID
     */
    public void setObject_ID(IRDI_type object_ID) 
    {
    	_object_ID = object_ID;
    }
    
}
