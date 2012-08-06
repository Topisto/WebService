package Irdi;

import ExceptionHandler.InvalidIdentifierException;

public class ConformedDocumentIdentifier extends IRDI implements java.io.Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5528562477549016429L;
	private String conformedDocumentIdentifier;
	
	
    /*Axis needs default constructor*/
	public ConformedDocumentIdentifier()
	{
	
	}

	@Override
	public void Validate(String irdi) throws InvalidIdentifierException
	{
		this.conformedDocumentIdentifier = irdi;
		
	}
	
	@Override
	public String getConformedDocumentIdentifierValue()
	{
		return this.conformedDocumentIdentifier;
	}
	
	@Override
	public void setConformedDocumentIdentifierValue(String value)
	{
		this.conformedDocumentIdentifier = value;
	}

	@Override
	public String getAbbreviationIdentifierValue()
	{
		return null;
	}

	@Override
	public String getConceptEquivalenceRelationshipIdentifierValue()
	{
		return null;
	}

	@Override
	public String getConceptIdentifierValue()
	{
		return null;
	}

	@Override
	public String getConceptTypeIdentifierValue()
	{
		return null;
	}


	@Override
	public String getContainingDocumentIdentifierValue()
	{
		return null;
	}

	@Override
	public String getDefinitionIdentifierValue()
	{
		return null;
	}

	@Override
	public String getDocumentIdentifierValue()
	{
		return null;
	}

	@Override
	public String getFileRepresentationIdentifierValue()
	{
		return null;
	}

	@Override
	public String getGraphicFileIdentifierValue()
	{
		return null;
	}

	@Override
	public String getImageIdentifierValue()
	{
		return null;
	}

	@Override
	public String getLanguageIdentifierValue()
	{
		return null;
	}

	@Override
	public String getLanguageRestrictionIdentifierValue()
	{
		return null;
	}

	@Override
	public String getOrganizationIdentifierValue()
	{
		return null;
	}

	@Override
	public String getPublisherIdentifierValue()
	{
		return null;
	}

	@Override
	public String getReferencingDocumentIdentifierValue()
	{
		return null;
	}

	@Override
	public String getRegistrationAuthorityIdentifierValue()
	{
		return null;
	}

	@Override
	public String getRepresentationFormIdentifierValue()
	{
		return null;
	}

	@Override
	public String getSymbolIdentifierValue()
	{
		return null;
	}

	@Override
	public String getTermIdentifierValue()
	{
		return null;
	}

	@Override
	public void setAbbreviationIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setConceptEquivalenceRelationshipIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setConceptIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setConceptTypeIdentifierValue(String value)
	{
		// Nothing to do
		
	}


	@Override
	public void setContainingDocumentIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setDefinitionIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setDocumentIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setFileRepresentationIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setGraphicFileIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setImageIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setLanguageIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setLanguageRestrictionIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setOrganizationIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setPublisherIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setReferencingDocumentIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setRegistrationAuthorityIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setRepresentationFormIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setSymbolIdentifierValue(String value)
	{
		// Nothing to do
		
	}

	@Override
	public void setTermIdentifierValue(String value)
	{
		// Nothing to do
		
	}
}
