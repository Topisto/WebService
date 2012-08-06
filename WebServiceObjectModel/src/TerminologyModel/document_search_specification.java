/**
 * DocumentSearchSpecification.java
 *
 */

package TerminologyModel;

public class document_search_specification  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7269896495089861501L;

	private java.lang.String titlePattern;

    private java.lang.String uriPattern;

    private java.lang.String versionPattern;

    private java.lang.String editionPattern;

    private java.util.Date minPublicationDate;

    private java.util.Date maxPublicationDate;

    private java.lang.String publisher;

    public document_search_specification() 
    {
    }

    public document_search_specification(
           java.lang.String titlePattern,
           java.lang.String uriPattern,
           java.lang.String versionPattern,
           java.lang.String editionPattern,
           java.util.Date minPublicationDate,
           java.util.Date maxPublicationDate,
           java.lang.String publisher) 
    {
           this.titlePattern = titlePattern;
           this.uriPattern = uriPattern;
           this.versionPattern = versionPattern;
           this.editionPattern = editionPattern;
           this.minPublicationDate = minPublicationDate;
           this.maxPublicationDate = maxPublicationDate;
           this.publisher = publisher;
    }


    /**
     * Gets the titlePattern value for this DocumentSearchSpecification.
     * 
     * @return titlePattern
     */
    public java.lang.String getTitlePattern() 
    {
        return titlePattern;
    }


    /**
     * Sets the titlePattern value for this DocumentSearchSpecification.
     * 
     * @param titlePattern
     */
    public void setTitlePattern(java.lang.String titlePattern) 
    {
        this.titlePattern = titlePattern;
    }


    /**
     * Gets the uriPattern value for this DocumentSearchSpecification.
     * 
     * @return uriPattern
     */
    public java.lang.String getUriPattern() 
    {
        return uriPattern;
    }


    /**
     * Sets the uriPattern value for this DocumentSearchSpecification.
     * 
     * @param uriPattern
     */
    public void setUriPattern(java.lang.String uriPattern) 
    {
        this.uriPattern = uriPattern;
    }


    /**
     * Gets the versionPattern value for this DocumentSearchSpecification.
     * 
     * @return versionPattern
     */
    public java.lang.String getVersionPattern() 
    {
        return versionPattern;
    }


    /**
     * Sets the versionPattern value for this DocumentSearchSpecification.
     * 
     * @param versionPattern
     */
    public void setVersionPattern(java.lang.String versionPattern) 
    {
        this.versionPattern = versionPattern;
    }


    /**
     * Gets the editionPattern value for this DocumentSearchSpecification.
     * 
     * @return editionPattern
     */
    public java.lang.String getEditionPattern() 
    {
        return editionPattern;
    }


    /**
     * Sets the editionPattern value for this DocumentSearchSpecification.
     * 
     * @param editionPattern
     */
    public void setEditionPattern(java.lang.String editionPattern) 
    {
        this.editionPattern = editionPattern;
    }


    /**
     * Gets the minPublicationDate value for this DocumentSearchSpecification.
     * 
     * @return minPublicationDate
     */
    public java.util.Date getMinPublicationDate() 
    {
        return minPublicationDate;
    }


    /**
     * Sets the minPublicationDate value for this DocumentSearchSpecification.
     * 
     * @param minPublicationDate
     */
    public void setMinPublicationDate(java.util.Date minPublicationDate) 
    {
        this.minPublicationDate = minPublicationDate;
    }


    /**
     * Gets the maxPublicationDate value for this DocumentSearchSpecification.
     * 
     * @return maxPublicationDate
     */
    public java.util.Date getMaxPublicationDate() 
    {
        return maxPublicationDate;
    }


    /**
     * Sets the maxPublicationDate value for this DocumentSearchSpecification.
     * 
     * @param maxPublicationDate
     */
    public void setMaxPublicationDate(java.util.Date maxPublicationDate)
{
        this.maxPublicationDate = maxPublicationDate;
    }


    /**
     * Gets the publisher value for this DocumentSearchSpecification.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() 
    {
        return publisher;
    }


    /**
     * Sets the publisher value for this DocumentSearchSpecification.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) 
    {
        this.publisher = publisher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj)
    {
        if (!(obj instanceof document_search_specification)) return false;
        document_search_specification other = (document_search_specification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) 
        {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.titlePattern==null && other.getTitlePattern()==null) || 
             (this.titlePattern!=null &&
              this.titlePattern.equals(other.getTitlePattern()))) &&
            ((this.uriPattern==null && other.getUriPattern()==null) || 
             (this.uriPattern!=null &&
              this.uriPattern.equals(other.getUriPattern()))) &&
            ((this.versionPattern==null && other.getVersionPattern()==null) || 
             (this.versionPattern!=null &&
              this.versionPattern.equals(other.getVersionPattern()))) &&
            ((this.editionPattern==null && other.getEditionPattern()==null) || 
             (this.editionPattern!=null &&
              this.editionPattern.equals(other.getEditionPattern()))) &&
            ((this.minPublicationDate==null && other.getMinPublicationDate()==null) || 
             (this.minPublicationDate!=null &&
              this.minPublicationDate.equals(other.getMinPublicationDate()))) &&
            ((this.maxPublicationDate==null && other.getMaxPublicationDate()==null) || 
             (this.maxPublicationDate!=null &&
              this.maxPublicationDate.equals(other.getMaxPublicationDate()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher())));
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
        if (getTitlePattern() != null) {
            _hashCode += getTitlePattern().hashCode();
        }
        if (getUriPattern() != null) {
            _hashCode += getUriPattern().hashCode();
        }
        if (getVersionPattern() != null) {
            _hashCode += getVersionPattern().hashCode();
        }
        if (getEditionPattern() != null) {
            _hashCode += getEditionPattern().hashCode();
        }
        if (getMinPublicationDate() != null) {
            _hashCode += getMinPublicationDate().hashCode();
        }
        if (getMaxPublicationDate() != null) {
            _hashCode += getMaxPublicationDate().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }
}
