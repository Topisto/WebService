package UI;

import TerminologyModel.InformationSearchTypes;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class saves the data needed for initialize the search. 
 */
public class WizardSettings
{
	private static String _irdi;
	private static String _registrationAuthorityIdentifier;
	private static String _terminology;
	private static String _ontology;
	private static InformationSearchTypes _informationSearchType;
	
	/**
	* Gets the terminology server URL.
	*
	* @return String
	*/ 
	public static String GetTerminologyServer ()
	{
		return _terminology;
	}
	
	/**
	* Sets the terminology server URL.
	*
	* @param terminology: The URL as String. 
	*/ 
	public static void SetTerminologyServer (String terminology)
	{
		_terminology = terminology;
	}
	
	/**
	* Gets the ontology server URL.
	*
	* @return String
	*/ 
	public static String GetOntologyServer ()
	{
		return _ontology;
	}
	
	/**
	* Sets the ontology server URL.
	*
	* @param ontology: The URL as String. 
	*/ 
	public static void SetOntologyServer (String ontology)
	{
		_ontology = ontology;
	}
	
	/**
	* Gets the registrationAuthorityIdentifier.
	*
	* @return String
	*/ 
	public static String GetRegistrationAuthorityIdentifier ()
	{
		return _registrationAuthorityIdentifier;
	}
	
	/**
	* Sets the registrationAuthorityIdentifier.
	*
	* @param registrationAuthorityIdentifier: The registrationAuthorityIdentifier as String. 
	*/ 
	public static void SetRegistrationAuthorityIdentifier (String registrationAuthorityIdentifier)
	{
		_registrationAuthorityIdentifier = registrationAuthorityIdentifier;
	}
	
	/**
	* Gets the IRDI.
	*
	* @return String
	*/ 
	public static String GetIrdi ()
	{
		return _irdi;
	}
	
	/**
	* Sets the IRDI.
	*
	* @param irdi: The IRDI as String. 
	*/ 
	public static void SetIrdi (String irdi)
	{
		 _irdi = irdi;
	}
	
	/**
	* Gets the information search type which represent the task to do.
	*
	* @return InformationSearchTypes
	*/ 
	public static InformationSearchTypes GetTerminologyInformationSearchType ()
	{
		return _informationSearchType;
	}
	
	/**
	* Sets the information search type which represent the task to do..
	*
	* @param informationSearchType: The task 
	*/ 
	public static void SetTerminologyInformationSearchType (InformationSearchTypes informationSearchType)
	{
		_informationSearchType = informationSearchType;
	}
}
