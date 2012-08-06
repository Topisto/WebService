/**
 * InvalidPatternException.java
 *
 */

package ExceptionHandler;

import TerminologyModel.pattern_type;

public class InvalidPatternException  extends Exception implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7843753379799289759L;

	private pattern_type _patternType;

    private String _errorMessage;

    public InvalidPatternException() 
    {
    }

    public InvalidPatternException(
           pattern_type patternType,
           String errorMessage)
    {
           _patternType = patternType;
           _errorMessage = errorMessage;
    }


    /**
     * Gets the patternType value for this InvalidPatternException.
     * 
     * @return patternType
     */
    public pattern_type getPatternType() 
    {
        return _patternType;
    }


    /**
     * Sets the patternType value for this InvalidPatternException.
     * 
     * @param patternType
     */
    public void setPatternType(pattern_type patternType) 
    {
        _patternType = patternType;
    }


    /**
     * Gets the errorMessage value for this InvalidPatternException.
     * 
     * @return errorMessage
     */
    public String getMessage() 
    {
        return _errorMessage;
    }

}
