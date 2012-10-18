package Irdi;

import ExceptionHandler.invalid_identifier_exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * 
 * Implements the international registration authority identifier data type. 
*/
public class IRDI_type implements java.io.Serializable 
{

    private static final long serialVersionUID = -1608673227253115732L;
	private String _registrationAuthorityIdentifier;
	private String _irdi;
	private boolean _isRai;
	
	/**
     * Axis needs a default constructor.
     */
	public IRDI_type()
	{
	
	}
	
   	/**
     * Constructor for initalizing the properties.
     * 
     * @param irdi: The irdi as string. 
     * @param isRai: Indicates whether the irdi is a registration authority identifier or a 
     * complete IRDI according to the ISO/IEC 11179-6.
     * @throws invalid_identifier_exception: @see invalid_identifier_exception
     */
	public IRDI_type(String irdi, boolean isRai) throws invalid_identifier_exception 
	{
	   _irdi = irdi;
	   if( !Validate(isRai) )
	   {
		   throw new invalid_identifier_exception(  "Given identifier is not valid " ); 
	   }

	}
	
   	/**
     * Gets the indication whether the irdi is a registration authority identifier or a 
     * complete IRDI according to the ISO/IEC 11179-6.
     * 
     * @return boolean 
     */
	public boolean getIsRai()
	{
		return _isRai;
	}
	
   	/**
     * Sets the indication whether the irdi is a registration authority identifier or a 
     * complete IRDI according to the ISO/IEC 11179-6.
     * 
     * @param isRai 
     */
	public void setIsRai( boolean isRai)
	{
		_isRai = isRai;
	}
	
	
   	/**
     * Gets the registration authority identifier (RAI). 
     * 
     * @return String 
     */
	public String getRegistrationAuthorityIdentifier()
	{
		return _registrationAuthorityIdentifier;
	}
	
   	/**
     * Sets the registration authority identifier (RAI). 
     * 
     * @param registrationAuthorityIdentifier 
     */
	public void setRegistrationAuthorityIdentifier(String registrationAuthorityIdentifier)
	{
		_registrationAuthorityIdentifier = registrationAuthorityIdentifier;
	}
	
   	/**
     * Gets the irdi.  
     * 
     * @return String 
     */
	public String getIrdi()
	{
		return _irdi;
	}
	
   	/**
     * Sets the irdi.  
     * 
     * @param String 
     */
	public void setIrdi(String irdi)
	{
		_irdi = irdi;
	}

			
	/**
	 *  Validate if a given string is a valid irdi.
	 *  @param irdi
	*/
	private boolean Validate(boolean isRai)
	{
		if( _irdi.endsWith( "--" ) || _irdi.endsWith( "---" ) )
		{
			return false;
		}
		else
		{
			String regex; 
			if( isRai )
			{
				regex = "(?<rai>\\d{1,4}-[A-Z\\x47\\x2e\\x5f0-9]{1,35}-?([A-Z\\x47\\x2e\\x5f0-9]{1,35})?-?([A-Z0-9])?-?([A-Z\\x47\\x2e\\x5f0-9]{1,70})?)";
			}
			else
			{
				regex = "(?<rai>\\d{1,4}-[A-Z\\x47\\x2e\\x5f0-9]{1,35}-?([A-Z\\x47\\x2e\\x5f0-9]{1,35})?-?([A-Z0-9])?-?([A-Z\\x47\\x2e\\x5f0-9]{1,70})?)(?<ci>#[A-Z0-9]{1,2}-[A-Z\\x47\\x2e\\x5f0-9]{1,131}#\\d)";
			}
			
			Pattern pattern =  Pattern.compile(   regex  );
			Matcher matcher = pattern.matcher( _irdi );
			if( !matcher.matches() )
			{
				return false;
			}
			else
			{
				_registrationAuthorityIdentifier = matcher.group( "rai" ); 
			}
		}
		
		_registrationAuthorityIdentifier = _irdi;
		return true;
	}
}
