package Irdi;

import ExceptionHandler.InvalidIdentifierException;

public class TermIdentifier extends IRDI implements java.io.Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7669612790407673867L;
	private String termIdentifier;
	
	
    /*Axis needs default constructor*/
	public TermIdentifier()
	{
	
	}

	@Override
	public void Validate(String irdi) throws InvalidIdentifierException
	{
		this.termIdentifier = irdi;
	}
	
	@Override
	public void setTermIdentifierValue(String value)
	{
		this.termIdentifier = value;
	}
	
	@Override
	public String getTermIdentifierValue()
	{
		return this.termIdentifier;
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
	public String getConformedDocumentIdentifierValue()
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
	public void setAbbreviationIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setConceptEquivalenceRelationshipIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setConceptIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setConceptTypeIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setConformedDocumentIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setContainingDocumentIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setDefinitionIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setDocumentIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setFileRepresentationIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setGraphicFileIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setImageIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setLanguageIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setLanguageRestrictionIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setOrganizationIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setPublisherIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setReferencingDocumentIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setRegistrationAuthorityIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setRepresentationFormIdentifierValue(String value)
	{
		// Do nothing
		
	}

	@Override
	public void setSymbolIdentifierValue(String value)
	{
		// Do nothing
		
	}
}
