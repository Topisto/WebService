package ExceptionHandler;

public class InvalidIdentifierException extends Exception implements java.io.Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1655172384039346959L;
	private String _errorMessage;

	/*Axis needs default constructor*/
	public InvalidIdentifierException() 
	{
	}
	
	public InvalidIdentifierException( String errorMessage ) 
	{
		_errorMessage = errorMessage;
 	}
  
	/**
     * Gets the errorMessage value for this InvalidIdentifierException.
     * 
     * @return errorMessage
    */
    public String getMessage() 
    {
        return _errorMessage;
    }
 }
