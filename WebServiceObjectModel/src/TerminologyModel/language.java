/**
 * Language.java
 *
 */

package TerminologyModel;

public class language  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 602037884095580804L;

	private String languageCode;

    private String countryCode;

    private String id;  // attribute

    public language() 
    {
    }

    public language(
           String languageCode,
           String countryCode,
           String id) 
    {
           this.languageCode = languageCode;
           this.countryCode = countryCode;
           this.id = id;
    }


    /**
     * Gets the languageCode value for this Language.
     * 
     * @return languageCode
     */
    public String getLanguageCode() 
    {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this Language.
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) 
    {
        this.languageCode = languageCode;
    }


    /**
     * Gets the countryCode value for this Language.
     * 
     * @return countryCode
     */
    public String getCountryCode() 
    {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this Language.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) 
    {
        this.countryCode = countryCode;
    }


    /**
     * Gets the id value for this Language.
     * 
     * @return id
     */
    public String getId() 
    {
        return id;
    }


    /**
     * Sets the id value for this Language.
     * 
     * @param id
     */
    public void setId(String id) 
    {
        this.id = id;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof language)) return false;
        language other = (language) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
