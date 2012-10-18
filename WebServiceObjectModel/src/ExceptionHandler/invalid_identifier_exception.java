package ExceptionHandler;

/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 *  Exception that indicates that an identifier passed as input to a service is not conform to ISO/TS 29002-5. 
 */
public class invalid_identifier_exception extends Exception implements java.io.Serializable 
{
	private static final long serialVersionUID = -1655172384039346959L;
	private String _error_message;

	/**
     * Axis needs a default constructor.
     */
	public invalid_identifier_exception() 
	{
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param error_message: The error message of the exception. 
     */
	public invalid_identifier_exception( String error_message ) 
	{
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
 }
