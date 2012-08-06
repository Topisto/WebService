package UI;

public class WizardSettings
{
	private static String _irdi;
	private static String _terminology;
	private static String _ontology;
	private static String _information;
	
   public static String GetTerminologyServer ()
	{
		return _terminology;
	}
	
	public static void SetTerminologyServer (String terminology)
	{
		_terminology = terminology;
	}
	
	public static String GetOntologyServer ()
	{
		return _ontology;
	}
	
	public static void SetOntologyServer (String ontology)
	{
		_ontology = ontology;
	}
	
	public static String GetIrdi ()
	{
		return _irdi;
	}
	
	public static void SetIrdi (String irdi)
	{
		 _irdi = irdi;
	}
	
	public static String GetTerminologyInformation ()
	{
		return _information;
	}
	
	public static void SetTerminologyInformation (String information)
	{
		_information = information;
	}
}
