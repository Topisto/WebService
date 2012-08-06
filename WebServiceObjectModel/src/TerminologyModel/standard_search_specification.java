/**
 * StandardSearchSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package TerminologyModel;

import java.util.Date;

public class standard_search_specification  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -273826342819128855L;

	private String designatorPattern;

    private String titlePattern;

    private String uriPattern;

    private String versionPattern;

    private String editionPattern;

    private Date minPublicationDate;

    private Date maxPublicationDate;

    private String publisher;

    private boolean conformanceOnly;

    public standard_search_specification() 
    {
    }

    public standard_search_specification(
           String designatorPattern,
           String titlePattern,
           String uriPattern,
           String versionPattern,
           String editionPattern,
           Date minPublicationDate,
           Date maxPublicationDate,
           String publisher,
           boolean conformanceOnly) 
    {
           this.designatorPattern = designatorPattern;
           this.titlePattern = titlePattern;
           this.uriPattern = uriPattern;
           this.versionPattern = versionPattern;
           this.editionPattern = editionPattern;
           this.minPublicationDate = minPublicationDate;
           this.maxPublicationDate = maxPublicationDate;
           this.publisher = publisher;
           this.conformanceOnly = conformanceOnly;
    }


    /**
     * Gets the designatorPattern value for this StandardSearchSpecification.
     * 
     * @return designatorPattern
     */
    public String getDesignatorPattern() 
    {
        return designatorPattern;
    }


    /**
     * Sets the designatorPattern value for this StandardSearchSpecification.
     * 
     * @param designatorPattern
     */
    public void setDesignatorPattern(String designatorPattern)
    {
        this.designatorPattern = designatorPattern;
    }


    /**
     * Gets the titlePattern value for this StandardSearchSpecification.
     * 
     * @return titlePattern
     */
    public String getTitlePattern() 
    {
        return titlePattern;
    }


    /**
     * Sets the titlePattern value for this StandardSearchSpecification.
     * 
     * @param titlePattern
     */
    public void setTitlePattern(String titlePattern)
    {
        this.titlePattern = titlePattern;
    }


    /**
     * Gets the uriPattern value for this StandardSearchSpecification.
     * 
     * @return uriPattern
     */
    public String getUriPattern() 
    {
        return uriPattern;
    }


    /**
     * Sets the uriPattern value for this StandardSearchSpecification.
     * 
     * @param uriPattern
     */
    public void setUriPattern(String uriPattern)
    {
        this.uriPattern = uriPattern;
    }


    /**
     * Gets the versionPattern value for this StandardSearchSpecification.
     * 
     * @return versionPattern
     */
    public String getVersionPattern() 
    {
        return versionPattern;
    }


    /**
     * Sets the versionPattern value for this StandardSearchSpecification.
     * 
     * @param versionPattern
     */
    public void setVersionPattern(String versionPattern) 
    {
        this.versionPattern = versionPattern;
    }


    /**
     * Gets the editionPattern value for this StandardSearchSpecification.
     * 
     * @return editionPattern
     */
    public String getEditionPattern() 
    {
        return editionPattern;
    }


    /**
     * Sets the editionPattern value for this StandardSearchSpecification.
     * 
     * @param editionPattern
     */
    public void setEditionPattern(String editionPattern) 
    {
        this.editionPattern = editionPattern;
    }


    /**
     * Gets the minPublicationDate value for this StandardSearchSpecification.
     * 
     * @return minPublicationDate
     */
    public Date getMinPublicationDate() 
    {
        return minPublicationDate;
    }


    /**
     * Sets the minPublicationDate value for this StandardSearchSpecification.
     * 
     * @param minPublicationDate
     */
    public void setMinPublicationDate(Date minPublicationDate) 
    {
        this.minPublicationDate = minPublicationDate;
    }


    /**
     * Gets the maxPublicationDate value for this StandardSearchSpecification.
     * 
     * @return maxPublicationDate
     */
    public Date getMaxPublicationDate() 
    {
        return maxPublicationDate;
    }


    /**
     * Sets the maxPublicationDate value for this StandardSearchSpecification.
     * 
     * @param maxPublicationDate
     */
    public void setMaxPublicationDate(Date maxPublicationDate) 
    {
        this.maxPublicationDate = maxPublicationDate;
    }


    /**
     * Gets the publisher value for this StandardSearchSpecification.
     * 
     * @return publisher
     */
    public String getPublisher() 
    {
        return publisher;
    }


    /**
     * Sets the publisher value for this StandardSearchSpecification.
     * 
     * @param publisher
     */
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }


    /**
     * Gets the conformanceOnly value for this StandardSearchSpecification.
     * 
     * @return conformanceOnly
     */
    public boolean isConformanceOnly() 
    {
        return conformanceOnly;
    }


    /**
     * Sets the conformanceOnly value for this StandardSearchSpecification.
     * 
     * @param conformanceOnly
     */
    public void setConformanceOnly(boolean conformanceOnly)
    {
        this.conformanceOnly = conformanceOnly;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) 
    {
        if (!(obj instanceof standard_search_specification)) return false;
        standard_search_specification other = (standard_search_specification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designatorPattern==null && other.getDesignatorPattern()==null) || 
             (this.designatorPattern!=null &&
              this.designatorPattern.equals(other.getDesignatorPattern()))) &&
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
              this.publisher.equals(other.getPublisher()))) &&
            this.conformanceOnly == other.isConformanceOnly();
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
        if (getDesignatorPattern() != null) {
            _hashCode += getDesignatorPattern().hashCode();
        }
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
        _hashCode += (isConformanceOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }
}
