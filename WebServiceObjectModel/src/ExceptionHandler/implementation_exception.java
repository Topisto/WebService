package ExceptionHandler;


/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 * Exception that indicates that an error specific to the particular implementation of this part of ISO/TS 29002 occured.
 */
public class implementation_exception extends Exception implements java.io.Serializable 
{
	private static final long serialVersionUID = 7564190923214158339L;
	private String _error_message;
    private long _error_code;
    
	/**
     * Axis needs a default constructor.
     */
    public implementation_exception() 
    {
    }

   	/**
     * Constructor for initalizing the properties.
     * 
     * @param error_message: The error message of the exception. 
     * @param error_code: The error code of the exception. 
     */
    public implementation_exception( String error_message, long error_code ) 
    {
    	_error_message = error_message;
    	_error_code = error_code;
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
     * Gets the error code.
     * 
     * @return error_code
     */
    public long getError_code() 
    {
        return _error_code;
    }
    
    /**
     * Sets the error code.
     * 
     * @return error_code
     */
    public void setError_code(long error_code) 
    {
    	_error_code = error_code;
    } 

}
