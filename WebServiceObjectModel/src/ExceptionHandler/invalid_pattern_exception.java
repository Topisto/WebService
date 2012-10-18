package ExceptionHandler;

import TerminologyModel.pattern_type_Type;

 /**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 *  
 *  Exception that indicates that a search pattern is not valid. 
 */
public class invalid_pattern_exception  extends Exception implements java.io.Serializable 
{
    private static final long serialVersionUID = -7843753379799289759L;

	private pattern_type_Type _pattern_type;
	private String _error_message;

	/**
     * Axis needs a default constructor.
     */
    public invalid_pattern_exception() 
    {
    }

    public invalid_pattern_exception(pattern_type_Type pattern_type, String error_message)
    {
    	_pattern_type = pattern_type;
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
     * Gets the pattern type.
     * 
     * @return pattern_type
     */
    public pattern_type_Type getPattern_type() 
    {
        return _pattern_type;
    }
    
    /**
     * Sets the pattern type.
     * 
     * @return pattern_type
     */
    public void setPattern_type(pattern_type_Type pattern_type) 
    {
    	_pattern_type = pattern_type;
    }

}
