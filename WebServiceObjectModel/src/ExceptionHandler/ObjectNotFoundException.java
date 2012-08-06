/**
 * ObjectNotFoundException.java
 *
 */

package ExceptionHandler;

public class ObjectNotFoundException  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4958824841111183492L;

	private String objectId;

    private String errorMessage;

    public ObjectNotFoundException() 
    {
    }

    public ObjectNotFoundException(
           String objectId,
           String errorMessage) 
    {
           this.objectId = objectId;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the objectId value for this ObjectNotFoundException.
     * 
     * @return objectId
     */
    public String getObjectId()
    {
        return objectId;
    }


    /**
     * Sets the objectId value for this ObjectNotFoundException.
     * 
     * @param objectId
     */
    public void setObjectId(String objectId) 
    {
        this.objectId = objectId;
    }


    /**
     * Gets the errorMessage value for this ObjectNotFoundException.
     * 
     * @return errorMessage
     */
    public String getErrorMessage() 
    {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this ObjectNotFoundException.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) 
    {
        this.errorMessage = errorMessage;
    }
}
