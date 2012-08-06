package ExceptionHandler;

public class ImplementationException extends Exception implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7564190923214158339L;
	private String _errorMessage;
    private String _stackTrace;
    
    /*Axis needs default constructor*/
    public ImplementationException() 
    {
    }

    public ImplementationException( String errorMessage, String stackTrace ) 
    {
    	 _errorMessage = errorMessage;
    	 _stackTrace = stackTrace;
    }
    
    /**
     * Gets the _errorMessage value for this ImplementationException.
     * 
     * @return _errorMessage
     */
    public String getMessage() 
    {
        return _errorMessage;
    }

    /**
     * Gets the stackTrace value for this ImplementationException.
     * 
     * @return stackTrace
     */
    public String getStrackTrace() 
    {
        return _stackTrace;
    }


    /**
     * Sets the errorMessage value for this ImplementationException.
     * 
     * @param stackTrace
     */
    public void setStackTrace(String stackTrace) 
    {
    	_stackTrace = stackTrace;
    }
}
