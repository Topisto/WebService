/**
 * Organization.java
 *
 */

package TerminologyModel;

public class organization  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3898404303774930092L;

	private local_string[] name;

    private String mailAddress;

    private String id;  
    
    public organization() 
    {
    }

    public organization(
    	   local_string[] name,
           String mailAddress,
           String id)
    {
           this.name = name;
           this.mailAddress = mailAddress;
           this.id = id;
    }


    /**
     * Gets the name value for this Organization.
     * 
     * @return name
     */
    public local_string[] getName() 
    {
        return name;
    }


    /**
     * Sets the name value for this Organization.
     * 
     * @param name
     */
    public void setName(local_string[] name) 
    {
        this.name = name;
    }


    /**
     * Gets the mailAddress value for this Organization.
     * 
     * @return mailAddress
     */
    public String getMailAddress() 
    {
        return mailAddress;
    }


    /**
     * Sets the mailAddress value for this Organization.
     * 
     * @param mailAddress
     */
    public void setMailAddress(String mailAddress) 
    {
        this.mailAddress = mailAddress;
    }


    /**
     * Gets the id value for this Organization.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this Organization.
     * 
     * @param id
     */
    public void setId(String id)
    {
        this.id = id;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) 
    {
        if (!(obj instanceof organization)) return false;
        organization other = (organization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.mailAddress==null && other.getMailAddress()==null) || 
             (this.mailAddress!=null &&
              this.mailAddress.equals(other.getMailAddress()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() 
    {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailAddress() != null) {
            _hashCode += getMailAddress().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
