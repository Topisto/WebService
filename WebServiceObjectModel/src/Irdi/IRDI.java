package Irdi;

import ExceptionHandler.InvalidIdentifierException;

abstract public class IRDI implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 741237214968080596L;
	/*Axis needs default constructor*/
	public IRDI( )
	{
	}
	
	public abstract void Validate( String irdi ) throws InvalidIdentifierException;
	public abstract String getRegistrationAuthorityIdentifierValue();
	public abstract void setRegistrationAuthorityIdentifierValue( String value );
	public abstract String getAbbreviationIdentifierValue();
	public abstract void setAbbreviationIdentifierValue( String value );
	public abstract String getConceptEquivalenceRelationshipIdentifierValue();
	public abstract void setConceptEquivalenceRelationshipIdentifierValue( String value );
	public abstract String getConceptIdentifierValue();
	public abstract void setConceptIdentifierValue( String value );
	public abstract String getConceptTypeIdentifierValue();
	public abstract void setConceptTypeIdentifierValue( String value );
	public abstract String getConformedDocumentIdentifierValue();
	public abstract void setConformedDocumentIdentifierValue( String value );
	public abstract String getContainingDocumentIdentifierValue();
	public abstract void setContainingDocumentIdentifierValue( String value );
	public abstract String getDefinitionIdentifierValue();
	public abstract void setDefinitionIdentifierValue( String value );
	public abstract String getDocumentIdentifierValue();
	public abstract void setDocumentIdentifierValue( String value );
	public abstract String getFileRepresentationIdentifierValue();
	public abstract void setFileRepresentationIdentifierValue( String value );
	public abstract String getGraphicFileIdentifierValue();
	public abstract void setGraphicFileIdentifierValue( String value );
	public abstract String getImageIdentifierValue();
	public abstract void setImageIdentifierValue( String value );
	public abstract String getLanguageIdentifierValue();
	public abstract void setLanguageIdentifierValue( String value );
	public abstract String getLanguageRestrictionIdentifierValue();
	public abstract void setLanguageRestrictionIdentifierValue( String value );
	public abstract String getOrganizationIdentifierValue();
	public abstract void setOrganizationIdentifierValue( String value );
	public abstract String getPublisherIdentifierValue();
	public abstract void setPublisherIdentifierValue( String value );
	public abstract String getReferencingDocumentIdentifierValue();
	public abstract void setReferencingDocumentIdentifierValue( String value );
	public abstract String getRepresentationFormIdentifierValue();
	public abstract void setRepresentationFormIdentifierValue( String value );
	public abstract String getSymbolIdentifierValue();
	public abstract void setSymbolIdentifierValue( String value );
	public abstract String getTermIdentifierValue();
	public abstract void setTermIdentifierValue( String value );
}
