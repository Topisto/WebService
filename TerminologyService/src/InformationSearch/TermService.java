package InformationSearch;

import Irdi.RegistrationAuthorityIdentifier;

public class TermService
{
	private RegistrationAuthorityIdentifier _termId;
	
	/*Axis needs default constructor*/
	public TermService()
	{
	}
	

	public String get_Term( RegistrationAuthorityIdentifier term_ID  ) 
	{
		if( term_ID == null )
		{
			return null;
		}
		
		_termId = term_ID;
		DatabaseSearch search = new DatabaseSearch( _termId );
		return search.SearchTerm();
	}
}
