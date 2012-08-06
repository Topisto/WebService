package Irdi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ExceptionHandler.InvalidIdentifierException;

/**
 * Implements the registration authority identifier data type
*/
public class RegistrationAuthorityIdentifier extends IRDI implements java.io.Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7496750205385528420L;
	private String _registrationAuthorityIdentifier;
	
	
    /*Axis needs default constructor*/
	public RegistrationAuthorityIdentifier()
	{
	
	}
	
	
	/**
	 *  Validate if a given string is a valid registration authority identifier.
	 *  If a part of the identifier is valid, the part is set, e.g. 
	* @param registrationAuthorityIdentifier
	*/
	@Override
	public void Validate(String irdi) throws InvalidIdentifierException
	{
		_registrationAuthorityIdentifier = irdi;
		
		/*if( irdi.endsWith( "--" ) || irdi.endsWith( "---" ) )
		{
			throw new InvalidIdentifierException(  "Registration authority identifier is not valid " );
		}
		else
		{
			String regex = "(([0-9]{1,4})-([\\dA-Z:_.]{1,35})-{0,1}([\\dA-Z:_.]{0,35})-{0,1}([\\dA-Z]{0,1})-{0,1}([\\dA-Z:_.]{0,70}))(?<!-){1,290}";
			Pattern pattern =  Pattern.compile(   regex  );
			Matcher matcher = pattern.matcher( irdi );
			//if( !matcher.matches() )
			//{
			 //	throw new InvalidIdentifierException(  "Registration authority identifier is not valid " );
			//}
			//else
			//{
				this.registrationAuthorityIdentifier = matcher.group( 0 ); 
				_internationCodeDesignator = matcher.group( 2 );
				_organizationIdentifier = matcher.group( 3 );
				if( matcher.group( 4 ) != null && matcher.group(4).length() == 0 )
				{
					_organizationPartIdentifier = null;
				}
				else
				{
					_organizationPartIdentifier = matcher.group( 4 );
				}
				if( matcher.group( 5 )  != null && matcher.group( 5 ).length() == 0 )
				{
					_organizationPartIdentifierSource = null;
				}
				else
				{
					_organizationPartIdentifierSource = matcher.group( 5 );
				}
				if( matcher.group( 6 ) != null && matcher.group( 6 ).length() == 0 )
				{
					_additionalInformation = null;
				}
				else
				{
					_additionalInformation = matcher.group( 6 );
				} 
			//}
		}*/
	}
	
	/**
	 *  Returns (if the given string was valid) the Registration Authority Identifier
	*/
	@Override
	public String getRegistrationAuthorityIdentifierValue()
	{
		return _registrationAuthorityIdentifier;
	}
	
	@Override
	public void setRegistrationAuthorityIdentifierValue( String value )
	{
		_registrationAuthorityIdentifier = value;
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
	public void setConformedDocumentIdentifierValue(String value)
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
