/**
 * Standard.java
 *
 */

package TerminologyModel;

import java.util.Date;

public class standard  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1662349528248552417L;

	private java.lang.String designator;

    private local_string[] title;

    private String uri;

    private java.lang.String version;

    private java.lang.String edition;

    private java.util.Date publicationDate;

    private java.lang.String publisher;

    private java.lang.String id;  // attribute

    public standard() 
    {
    }

    public standard(
           java.lang.String designator,
           local_string[] title,
           String uri,
           java.lang.String version,
           java.lang.String edition,
           java.util.Date publicationDate,
           java.lang.String publisher,
           java.lang.String id)
    {
           this.designator = designator;
           this.title = title;
           this.uri = uri;
           this.version = version;
           this.edition = edition;
           this.publicationDate = publicationDate;
           this.publisher = publisher;
           this.id = id;
    }


    /**
     * Gets the designator value for this Standard.
     * 
     * @return designator
     */
    public java.lang.String getDesignator() 
    {
        return designator;
    }


    /**
     * Sets the designator value for this Standard.
     * 
     * @param designator
     */
    public void setDesignator(java.lang.String designator) 
    {
        this.designator = designator;
    }


    /**
     * Gets the title value for this Standard.
     * 
     * @return title
     */
    public local_string[] getTitle() 
    {
        return title;
    }


    /**
     * Sets the title value for this Standard.
     * 
     * @param title
     */
    public void setTitle(local_string[] title) 
    {
        this.title = title;
    }


    /**
     * Gets the uri value for this Standard.
     * 
     * @return uri
     */
    public String getUri() 
    {
        return uri;
    }


    /**
     * Sets the uri value for this Standard.
     * 
     * @param uri
     */
    public void setUri(String uri) 
    {
        this.uri = uri;
    }


    /**
     * Gets the version value for this Standard.
     * 
     * @return version
     */
    public String getVersion() 
    {
        return version;
    }


    /**
     * Sets the version value for this Standard.
     * 
     * @param version
     */
    public void setVersion(String version) 
    {
        this.version = version;
    }


    /**
     * Gets the edition value for this Standard.
     * 
     * @return edition
     */
    public String getEdition() 
    {
        return edition;
    }


    /**
     * Sets the edition value for this Standard.
     * 
     * @param edition
     */
    public void setEdition(String edition)
    {
        this.edition = edition;
    }


    /**
     * Gets the publicationDate value for this Standard.
     * 
     * @return publicationDate
     */
    public Date getPublicationDate() 
    {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this Standard.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(Date publicationDate) 
    {
        this.publicationDate = publicationDate;
    }


    /**
     * Gets the publisher value for this Standard.
     * 
     * @return publisher
     */
    public String getPublisher() 
    {
        return publisher;
    }


    /**
     * Sets the publisher value for this Standard.
     * 
     * @param publisher
     */
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }


    /**
     * Gets the id value for this Standard.
     * 
     * @return id
     */
    public String getId()
    {
        return id;
    }


    /**
     * Sets the id value for this Standard.
     * 
     * @param id
     */
    public void setId(java.lang.String id) 
    {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) 
    {
        if (!(obj instanceof standard)) return false;
        standard other = (standard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.designator==null && other.getDesignator()==null) || 
             (this.designator!=null &&
              this.designator.equals(other.getDesignator()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.uri==null && other.getUri()==null) || 
             (this.uri!=null &&
              this.uri.equals(other.getUri()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.publicationDate==null && other.getPublicationDate()==null) || 
             (this.publicationDate!=null &&
              this.publicationDate.equals(other.getPublicationDate()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
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
        if (getDesignator() != null) {
            _hashCode += getDesignator().hashCode();
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUri() != null) {
            _hashCode += getUri().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getPublicationDate() != null) {
            _hashCode += getPublicationDate().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
   }
}
