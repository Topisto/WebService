/**
 * LanguageSearchSpecification.java
 *
 */

package TerminologyModel;

public class language_search_specification  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5521157985022916285L;

	private java.lang.String isoLanguageCodePattern;

    private java.lang.String isoCountryCodePattern;

    public language_search_specification() 
    {
    }

    public language_search_specification(
           java.lang.String isoLanguageCodePattern,
           java.lang.String isoCountryCodePattern) 
    {
           this.isoLanguageCodePattern = isoLanguageCodePattern;
           this.isoCountryCodePattern = isoCountryCodePattern;
    }


    /**
     * Gets the isoLanguageCodePattern value for this LanguageSearchSpecification.
     * 
     * @return isoLanguageCodePattern
     */
    public java.lang.String getIsoLanguageCodePattern() 
    {
        return isoLanguageCodePattern;
    }


    /**
     * Sets the isoLanguageCodePattern value for this LanguageSearchSpecification.
     * 
     * @param isoLanguageCodePattern
     */
    public void setIsoLanguageCodePattern(java.lang.String isoLanguageCodePattern) 
    {
        this.isoLanguageCodePattern = isoLanguageCodePattern;
    }


    /**
     * Gets the isoCountryCodePattern value for this LanguageSearchSpecification.
     * 
     * @return isoCountryCodePattern
     */
    public java.lang.String getIsoCountryCodePattern() 
    {
        return isoCountryCodePattern;
    }


    /**
     * Sets the isoCountryCodePattern value for this LanguageSearchSpecification.
     * 
     * @param isoCountryCodePattern
     */
    public void setIsoCountryCodePattern(java.lang.String isoCountryCodePattern) 
    {
        this.isoCountryCodePattern = isoCountryCodePattern;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof language_search_specification)) return false;
        language_search_specification other = (language_search_specification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isoLanguageCodePattern==null && other.getIsoLanguageCodePattern()==null) || 
             (this.isoLanguageCodePattern!=null &&
              this.isoLanguageCodePattern.equals(other.getIsoLanguageCodePattern()))) &&
            ((this.isoCountryCodePattern==null && other.getIsoCountryCodePattern()==null) || 
             (this.isoCountryCodePattern!=null &&
              this.isoCountryCodePattern.equals(other.getIsoCountryCodePattern())));
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
        if (getIsoLanguageCodePattern() != null) {
            _hashCode += getIsoLanguageCodePattern().hashCode();
        }
        if (getIsoCountryCodePattern() != null) {
            _hashCode += getIsoCountryCodePattern().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
