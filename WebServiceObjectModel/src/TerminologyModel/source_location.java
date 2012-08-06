/**
 * SourceLocation.java
 *
 */

package TerminologyModel;

public class source_location  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 54050194936033495L;

	private String url;

    private local_string[] description;

    private String provider;

    public source_location() 
    {
    }

    public source_location(
           String url,
           local_string[] description,
           String provider) 
    {
           this.url = url;
           this.description = description;
           this.provider = provider;
    }


    /**
     * Gets the url value for this SourceLocation.
     * 
     * @return url
     */
    public String getUrl() 
    {
        return url;
    }


    /**
     * Sets the url value for this SourceLocation.
     * 
     * @param url
     */
    public void setUrl(String url) 
    {
        this.url = url;
    }


    /**
     * Gets the description value for this SourceLocation.
     * 
     * @return description
     */
    public local_string[] getDescription() 
    {
        return description;
    }


    /**
     * Sets the description value for this SourceLocation.
     * 
     * @param description
     */
    public void setDescription(local_string[] description) 
    {
        this.description = description;
    }


    /**
     * Gets the provider value for this SourceLocation.
     * 
     * @return provider
     */
    public java.lang.String getProvider() 
    {
        return provider;
    }


    /**
     * Sets the provider value for this SourceLocation.
     * 
     * @param provider
     */
    public void setProvider(java.lang.String provider)
    {
        this.provider = provider;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) 
    {
        if (!(obj instanceof source_location)) return false;
        source_location other = (source_location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.provider==null && other.getProvider()==null) || 
             (this.provider!=null &&
              this.provider.equals(other.getProvider())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProvider() != null) {
            _hashCode += getProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
